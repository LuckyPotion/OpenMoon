package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gg extends moom.gc {

private boolean r;

private static long s;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public gg(int p0, int p1, int p2) { super(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_7634f4ce60021101(moom.gg receiver, int p0, int p1, int p2) throws Throwable {

long local4 = (moom.gg.s ^ 113977406644954L);

    moom.gg.__sourceConstructorInit_7634f4ce60021101_0(((moom.gg)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_7634f4ce60021101_originalDynamicSite2769_1(2572, (787691790348598463L ^ local4)))), ((int)(__sourceIntrinsic_7634f4ce60021101_originalDynamicSite2769_2(260, (5987105215934150582L ^ local4)))), ((java.lang.String)("")));

    ((moom.gg)(receiver)).r = ((boolean)(false));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7634f4ce60021101_0(moom.gg a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

static {
s = ((long)(((moom._a)(moom._c.a(((long)(-5379623555228871339L)), ((long)(1399362735856401452L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(190779511014462L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gg.s ^ 48761675358569L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill850_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill850_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill850_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill850_14 = new byte[8];
    (__sourceSpill850_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill850_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation850_16 = __sourceSpill850_14;
    ((javax.crypto.Cipher)(__sourceSpill850_11)).init(((int)(__sourceSpill850_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill850_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation850_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "$ö_P\\µçküX\030\032Jd\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill850_25 = local6_life21;
        int __sourceSpill850_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill850_25)).substring(((int)(__sourceSpill850_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill850_30 = local8_life19;
        int __sourceSpill850_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill850_33 = new byte[8];
        (__sourceSpill850_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill850_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill850_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill850_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill850_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill850_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill850_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill850_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill850_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill850_34)).doFinal(((byte[])(__sourceSpill850_33)));
        (__sourceSpill850_30)[__sourceSpill850_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean b() {
return ((((this.r) ? 1 : 0)) != 0);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gg.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13911;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral7757_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3567_37_0;
    int life4_51;
    moom.ay life5_62;
    forward_join_82: {
    forward_join_68: {
    forward_join_66: {
    forward_join_61: {
    forward_join_55: {
    forward_join_52: {
    forward_join_47: {
    forward_join_37: {
    forward_join_36: {
    if (!(this.n)) {
        break forward_join_82;
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(moom.gc.f)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    if (!((p1 >= this.i))) {
        break forward_join_36;
    }
    if (!((p2 >= this.j))) {
        break forward_join_36;
    }
    if (!((p1 < (this.i + this.g)))) {
        break forward_join_36;
    }
    if (!((p2 < (this.j + this.h)))) {
        break forward_join_36;
    }
    forwardValue3567_37_0 = 1;
    break forward_join_37;
    }
    forwardValue3567_37_0 = 0;
    }
    life4_51 = forwardValue3567_37_0;
    if (!(this.r)) {
        break forward_join_55;
    }
    if (!((!this.m))) {
        break forward_join_47;
    }
    life5_62 = moom.ay.LOCKED_DISABLED;
    break forward_join_68;
    }
    if (!((life4_51 != 0))) {
        break forward_join_52;
    }
    life5_62 = moom.ay.LOCKED_HOVER;
    break forward_join_68;
    }
    life5_62 = moom.ay.LOCKED;
    break forward_join_68;
    }
    if (!((!this.m))) {
        break forward_join_61;
    }
    life5_62 = moom.ay.UNLOCKED_DISABLED;
    break forward_join_68;
    }
    if (!((life4_51 != 0))) {
        break forward_join_66;
    }
    life5_62 = moom.ay.UNLOCKED_HOVER;
    break forward_join_68;
    }
    life5_62 = moom.ay.UNLOCKED;
    }
    ((moom.gg)(this)).b(((int)(this.i)), ((int)(this.j)), ((int)(((moom.ay)(life5_62)).a())), ((int)(((moom.ay)(life5_62)).b())), ((int)(this.g)), ((int)(this.h)));
    }
    return;
}


public void a__sourceReturn_f633c984d8(boolean p0) {
this.r = ((boolean)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7634f4ce60021101_originalDynamicSite2769_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7634f4ce60021101_originalDynamicSite2769_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral7757_0() throws E;
}
