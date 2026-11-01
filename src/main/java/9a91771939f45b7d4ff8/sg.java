package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sg extends net.minecraft.client.particle.EntityFX {

private int aV;

private boolean aW;

private boolean aX;

private net.minecraft.client.particle.EffectRenderer aY;

private float aZ;

private float a0;

private float a1;

private boolean a2;

private static long bb;

private static long[] hb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public sg(net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.client.particle.EffectRenderer p7) { super((net.minecraft.world.World)null, 0.0D, 0.0D, 0.0D); }


private static void __sourceConstructorBody_0284ea6f76bf0f1f(moom.sg receiver, net.minecraft.world.World p0, double p1, double p2, double p3, double p4, double p5, double p6, net.minecraft.client.particle.EffectRenderer p7) throws Throwable {

long local15_life1 = (moom.sg.bb ^ 31365074342743L);

    moom.sg.__sourceConstructorInit_0284ea6f76bf0f1f_0(((moom.sg)(receiver)), ((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)));

    ((moom.sg)(receiver)).aV = ((int)(__sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_3(14348, (3689756017753387519L ^ local15_life1))));

    ((moom.sg)(receiver)).t = ((double)(p4));

    ((moom.sg)(receiver)).u = ((double)(p5));

    ((moom.sg)(receiver)).v = ((double)(p6));

    ((moom.sg)(receiver)).aY = ((net.minecraft.client.particle.EffectRenderer)(p7));

    receiver.aK *= 0x1.8p-1f;

    ((moom.sg)(receiver)).aJ = ((int)((__sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_10(15976, (8797286915082319760L ^ local15_life1)) + ((java.util.Random)(((moom.sg)(receiver)).ah)).nextInt(((int)(__sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_12(1968, (7917315394912898637L ^ local15_life1))))))));

    ((moom.sg)(receiver)).Q = ((boolean)(false));

    return;

}



static {
bb = ((long)(((moom._a)(moom._c.a(((long)(5165692593209025437L)), ((long)(-8668402621240554319L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(227043284234513L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sg.bb ^ 99273235041370L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1533_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1533_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1533_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1533_14 = new byte[8];
    (__sourceSpill1533_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1533_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1533_16 = __sourceSpill1533_14;
    ((javax.crypto.Cipher)(__sourceSpill1533_11)).init(((int)(__sourceSpill1533_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1533_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1533_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[16];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "OÒð\tY¥Ã1¾äÃ\023X®°:Î\177\0375\004ê½U¸ó\bÓ\006RÞ\025mj.i\017Mf=©ÁZÁöoM\020³º]öIi²Íß½nFÀüæ\032³õ\0311,bßñòÊoÈ|\000Ly\005\000g_\031Áu÷ÒÚ×]XÓsÚ½"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1533_25 = local6_life21;
        int __sourceSpill1533_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1533_25)).substring(((int)(__sourceSpill1533_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1533_30 = local8_life19;
        int __sourceSpill1533_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1533_33 = new byte[8];
        (__sourceSpill1533_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1533_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1533_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1533_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1533_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1533_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1533_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1533_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1533_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1533_34)).doFinal(((byte[])(__sourceSpill1533_33)));
        (__sourceSpill1533_30)[__sourceSpill1533_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "xM±Hx\036ªQv\034áòb¸"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1533_38 = local6_life21;
        int __sourceSpill1533_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1533_38)).substring(((int)(__sourceSpill1533_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1533_43 = local8_life19;
        int __sourceSpill1533_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1533_46 = new byte[8];
        (__sourceSpill1533_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1533_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1533_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1533_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1533_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1533_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1533_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1533_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1533_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1533_47)).doFinal(((byte[])(__sourceSpill1533_46)));
        (__sourceSpill1533_43)[__sourceSpill1533_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[16]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0284ea6f76bf0f1f_0(moom.sg a0, net.minecraft.world.World a1, double a2, double a3, double a4) throws E;

public void i(int p0) {
long local2 = (moom.sg.bb ^ 28480732952643L);
    this.aZ = ((float)((((float) ((p0 & __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_1(19602, (1795503995031957107L ^ local2))) >> __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_2(6022, (3431380826326267245L ^ local2)))) / 0x1.fep7f)));
    this.a0 = ((float)((((float) ((p0 & __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_4(29937, (8067627572842206741L ^ local2))) >> __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_5(19379, (1858036483672877404L ^ local2)))) / 0x1.fep7f)));
    this.a1 = ((float)((((float) (p0 & __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_7(29133, (1743758107652887333L ^ local2)))) / 0x1.fep7f)));
    this.a2 = ((boolean)(true));
    return;
}


public void i(boolean p0) {
this.aX = ((boolean)(p0));
    return;
}


public boolean b__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9064_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sg.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18643;
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
            throw new RuntimeException("moom/sg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


public boolean n__Boolean() {
return ((0) != 0);
}


public void h(boolean p0) {
this.aW = ((boolean)(p0));
    return;
}


public void h(int p0) {
long local2 = (moom.sg.bb ^ 75921647441421L);
    float local4 = (((float) ((p0 & __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_1(9123, (4353758613201432327L ^ local2))) >> __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_2(2772, (8583949035819009657L ^ local2)))) / 0x1.fep7f);
    float local5 = (((float) ((p0 & __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_3(32536, (6734125863501198259L ^ local2))) >> __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_4(19379, (1858102897609426706L ^ local2)))) / 0x1.fep7f);
    float local6 = (((float) (p0 & __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_5(22888, (2332044191442458056L ^ local2)))) / 0x1.fep7f);
    float local7 = 0x1.0p0f;
    ((moom.sg)(this)).b(((float)((local4 * local7))), ((float)((local5 * local7))), ((float)((local6 * local7))));
    return;
}


public moom.CA a__CA() {
return null;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.lw p0, net.minecraft.entity.Entity p1, float p2, float p3, float p4, float p5, float p6, float p7) {
forward_join_30: {
    forward_join_20: {
    if (!(this.aX)) { break forward_join_20; }
    if (!((this.aI >= (this.aJ / 3)))) { break forward_join_20; }
    if (!(((((this.aI + this.aJ) / 3) % 2) == 0))) { break forward_join_30; }
    }
    super.a(((moom.lw)(p0)), ((net.minecraft.entity.Entity)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((float)(p7)));
    }
    return;
}


public int a__Int(float p0) {
long local2 = (moom.sg.bb ^ 116998155511854L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1642_1(21881, (8903117744198379510L ^ local2));
}


public float a__sourceReturn_f6c4892e39(float p0) {
return 0x1.0p0f;
}


public void g__Void() {
long life1_3;
    moom.sg life3_218;
    life1_3 = (moom.sg.bb ^ 66303502173072L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.sg __stackOp3997_7_0 = this;
    moom.sg __stackOp3997_9_0 = __stackOp3997_7_0;
    int __stackOp3997_9_1 = ((moom.sg)(__stackOp3997_7_0)).aI;
    int spill3997_0 = __stackOp3997_9_1;
    ((moom.sg)(__stackOp3997_9_0)).aI = ((int)((__stackOp3997_9_1 + 1)));
    if ((spill3997_0 >= this.aJ)) {
        ((moom.sg)(this)).f__Void();
    }
    if ((this.aI > (this.aJ / 2))) {
        ((moom.sg)(this)).c(((float)((0x1.0p0f - ((((float) this.aI) - ((float) (this.aJ / 2))) / ((float) this.aJ))))));
        if (this.a2) {
        moom.sg __stackOp3997_20_0 = this;
        ((moom.sg)(__stackOp3997_20_0)).aM = ((float)((((moom.sg)(__stackOp3997_20_0)).aM + ((this.aZ - this.aM) * 0x1.99999ap-3f))));
        moom.sg __stackOp3997_25_0 = this;
        ((moom.sg)(__stackOp3997_25_0)).aN = ((float)((((moom.sg)(__stackOp3997_25_0)).aN + ((this.a0 - this.aN) * 0x1.99999ap-3f))));
        moom.sg __stackOp3997_30_0 = this;
        ((moom.sg)(__stackOp3997_30_0)).aO = ((float)((((moom.sg)(__stackOp3997_30_0)).aO + ((this.a1 - this.aO) * 0x1.99999ap-3f))));
    }
    }
    moom.sg spill3997_1 = this;
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    ((moom.sg)(spill3997_1)).g(((int)((__sourceIntrinsic_736a66cda11e_invokedynamic3997_36(22323, (6404252827098877453L ^ life1_3)) + (__sourceIntrinsic_736a66cda11e_invokedynamic3997_37(5311, (4886132168449510794L ^ life1_3)) - ((this.aI * __sourceIntrinsic_736a66cda11e_invokedynamic3997_39(11075, (5967582188257866352L ^ life1_3))) / this.aJ))))));
    moom.sg __stackOp3997_42_0 = this;
    ((moom.sg)(__stackOp3997_42_0)).u = ((double)((((moom.sg)(__stackOp3997_42_0)).u - 0x1.0624dd2f1a9fcp-8d)));
    ((moom.sg)(this)).b__Void(((double)(this.t)), ((double)(this.u)), ((double)(this.v)));
    moom.sg __stackOp3997_49_0 = this;
    ((moom.sg)(__stackOp3997_49_0)).t = ((double)((((moom.sg)(__stackOp3997_49_0)).t * 0x1.d1eb86p-1d)));
    moom.sg __stackOp3997_52_0 = this;
    ((moom.sg)(__stackOp3997_52_0)).u = ((double)((((moom.sg)(__stackOp3997_52_0)).u * 0x1.d1eb86p-1d)));
    moom.sg __stackOp3997_55_0 = this;
    ((moom.sg)(__stackOp3997_55_0)).v = ((double)((((moom.sg)(__stackOp3997_55_0)).v * 0x1.d1eb86p-1d)));
    if (this.A) {
        moom.sg __stackOp3997_59_0 = this;
        ((moom.sg)(__stackOp3997_59_0)).t = ((double)((((moom.sg)(__stackOp3997_59_0)).t * 0x1.666666p-1d)));
        moom.sg __stackOp3997_62_0 = this;
        ((moom.sg)(__stackOp3997_62_0)).v = ((double)((((moom.sg)(__stackOp3997_62_0)).v * 0x1.666666p-1d)));
    }
    if (this.aW) {
        if ((this.aI < (this.aJ / 2))) {
        if ((((this.aI + this.aJ) % 2) == 0)) {
        life3_218 = new moom.sg(this.i, this.n, this.o, this.p, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, this.aY);
        ((moom.sg)(life3_218)).c(((float)(0x1.fae148p-1f)));
        ((moom.sg)(life3_218)).b(((float)(this.aM)), ((float)(this.aN)), ((float)(this.aO)));
        ((moom.sg)(life3_218)).aI = ((int)((((moom.sg)(life3_218)).aJ / 2)));
        if (this.a2) {
        ((moom.sg)(life3_218)).a2 = ((boolean)(true));
        ((moom.sg)(life3_218)).aZ = ((float)(this.aZ));
        ((moom.sg)(life3_218)).a0 = ((float)(this.a0));
        ((moom.sg)(life3_218)).a1 = ((float)(this.a1));
    }
        ((moom.sg)(life3_218)).aX = ((boolean)(this.aX));
        ((net.minecraft.client.particle.EffectRenderer)(this.aY)).a(((net.minecraft.client.particle.EntityFX)(life3_218)));
    }
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0284ea6f76bf0f1f_originalDynamicSite921_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1642_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9064_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3997_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3997_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic3997_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f869f6dcdc2_originalDynamicSite1641_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4984c5be6222_originalDynamicSite1640_7(int a0, long a1) throws E;
}
