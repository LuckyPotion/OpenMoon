package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gc extends net.minecraft.client.gui.Gui {

protected static moom.DD f;

protected int g;

protected int h;

public int i;

public int j;

public java.lang.String k;

public int l;

public boolean m;

public boolean n;

protected boolean o;

private boolean p;

private static java.lang.String q;

private static long y;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public gc(int p0, int p1, int p2, int p3, int p4, java.lang.String p5, boolean p6) {
super();
    this.m = true;
    this.n = true;
    this.l = p0;
    this.i = p1;
    this.j = p2;
    this.g = p3;
    this.h = p4;
    this.k = p5;
    this.p = p6;
}

private static native <E extends Throwable> void __sourceConstructorInit_37b907bd7cde6420_0(moom.gc a0, int a1, int a2, int a3, int a4, int a5, java.lang.String a6) throws E;

public gc(int p0, int p1, int p2, int p3, int p4, java.lang.String p5) {
this(p0, p1, p2, p3, p4, p5, false);
}


public gc(int p0, int p1, int p2, java.lang.String p3) { this(0, 0, 0, 0, 0, (java.lang.String)null); }


private static void __sourceConstructorBody_37b907bd7cde6420(moom.gc receiver, int p0, int p1, int p2, java.lang.String p3) throws Throwable {

long local5_life1 = (moom.gc.y ^ 133313939235245L);

    moom.gc.__sourceConstructorInit_37b907bd7cde6420_0(((moom.gc)(receiver)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(__sourceIntrinsic_37b907bd7cde6420_originalDynamicSite798_2(14007, (5914600229934391342L ^ local5_life1)))), ((int)(__sourceIntrinsic_37b907bd7cde6420_originalDynamicSite798_3(6896, (1342538732478418024L ^ local5_life1)))), ((java.lang.String)(p3)));

    return;

}



static {
y = ((long)(((moom._a)(moom._c.a(((long)(-6333190128373993212L)), ((long)(6799457861409551480L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132036882902590L)))));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.String __sourceSpill1222_7 = "rhdJMb";
    long local0_life8 = (moom.gc.y ^ 130577244180279L);
    moom.gc.a(((java.lang.String)(__sourceSpill1222_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1222_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1222_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1222_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1222_16 = new byte[8];
    (__sourceSpill1222_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1222_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1222_18 = __sourceSpill1222_16;
    ((javax.crypto.Cipher)(__sourceSpill1222_13)).init(((int)(__sourceSpill1222_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1222_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1222_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[17];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "ÊâK3 Ä/¦R»ÑI©KQ\021:ò­(ÖQ\005üPúÃ\035w¼ñ<\032aHÔhËðÚ§æe\032|%fÝ\033\034\f+¯+Îl}Tt~ãO\035\035øP_\020v\031Hù,Ü\001¤7Ôt\006·4²\ts\036\022ÍaQ:Å?õÜ3\002"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1222_27 = local6_life23;
        int __sourceSpill1222_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1222_27)).substring(((int)(__sourceSpill1222_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1222_32 = local8_life21;
        int __sourceSpill1222_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1222_35 = new byte[8];
        (__sourceSpill1222_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1222_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1222_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1222_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1222_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1222_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1222_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1222_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1222_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1222_36)).doFinal(((byte[])(__sourceSpill1222_35)));
        (__sourceSpill1222_32)[__sourceSpill1222_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\034Ï°v¬D§øµk§T"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1222_40 = local6_life23;
        int __sourceSpill1222_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1222_40)).substring(((int)(__sourceSpill1222_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1222_45 = local8_life21;
        int __sourceSpill1222_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1222_48 = new byte[8];
        (__sourceSpill1222_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1222_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1222_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1222_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1222_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1222_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1222_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1222_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1222_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1222_49)).doFinal(((byte[])(__sourceSpill1222_48)));
        (__sourceSpill1222_45)[__sourceSpill1222_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    B = ((long[])(local8_life21));
    C = ((java.lang.Integer[])(new java.lang.Integer[17]));
    f = ((moom.DD)(new moom.DD("textures/gui/widgets.png")));
}


protected void b(net.minecraft.client.Minecraft p0, int p1, int p2) {
return;
}


public void b(int p0, int p1) {
return;
}


public static java.lang.String a__String() {
return moom.gc.q;
}


public static void a(java.lang.String p0) {
q = ((java.lang.String)(p0));
    return;
}


public void a(int p0) {
this.g = ((int)(p0));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7749_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gc.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1983;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.client.Minecraft p0, int p1, int p2) {
int forwardValue3565_31_0;
    forward_join_31: {
    forward_join_30: {
    if (!(this.m)) {
        break forward_join_30;
    }
    if (!(this.n)) {
        break forward_join_30;
    }
    if (!((p1 >= this.i))) {
        break forward_join_30;
    }
    if (!((p2 >= this.j))) {
        break forward_join_30;
    }
    if (!((p1 < (this.i + this.g)))) {
        break forward_join_30;
    }
    if (!((p2 < (this.j + this.h)))) {
        break forward_join_30;
    }
    forwardValue3565_31_0 = 1;
    break forward_join_31;
    }
    forwardValue3565_31_0 = 0;
    }
    return ((forwardValue3565_31_0) != 0);
}


public void a(int p0, int p1) {
return;
}


public void a(net.minecraft.client.Minecraft p0, int p1, int p2) {
moom.gc forwardValue3564_44_0;
    moom.gc forwardValue3564_45_0;
    int forwardValue3564_45_1;
    moom.gc forwardValue3564_231_0;
    net.minecraft.client.gui.FontRenderer forwardValue3564_231_1;
    java.lang.String forwardValue3564_231_2;
    int forwardValue3564_231_3;
    int forwardValue3564_231_4;
    moom.gc forwardValue3564_237_0;
    net.minecraft.client.gui.FontRenderer forwardValue3564_237_1;
    java.lang.String forwardValue3564_237_2;
    int forwardValue3564_237_3;
    int forwardValue3564_237_4;
    moom.gc forwardValue3564_239_0;
    net.minecraft.client.gui.FontRenderer forwardValue3564_239_1;
    java.lang.String forwardValue3564_239_2;
    int forwardValue3564_239_3;
    int forwardValue3564_239_4;
    int forwardValue3564_239_5;
    moom.gc spill3564_0;
    moom.gc spill3564_1;
    net.minecraft.client.gui.FontRenderer spill3564_2;
    java.lang.String spill3564_3;
    int spill3564_4;
    int spill3564_5;
    long life4_3;
    net.minecraft.client.gui.FontRenderer life6_9;
    int life7_61;
    int life8_189;
    forward_join_267: {
    forward_join_241: {
    forward_join_239: {
    forward_join_237: {
    forward_join_231: {
    forward_join_196: {
    forward_join_187: {
    forward_join_166: {
    forward_join_100: {
    forward_join_45: {
    forward_join_44: {
    life4_3 = (moom.gc.y ^ 72942593778495L);
    if (!(this.n)) {
        break forward_join_267;
    }
    life6_9 = ((net.minecraft.client.Minecraft)(p0)).N;
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(p0)).a__ok())).a__Void(((moom.DD)(moom.gc.f)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    spill3564_0 = this;
    if (!((p1 >= this.i))) {
        forwardValue3564_44_0 = spill3564_0;
        break forward_join_44;
    }
    if (!((p2 >= this.j))) {
        forwardValue3564_44_0 = spill3564_0;
        break forward_join_44;
    }
    if (!((p1 < (this.i + this.g)))) {
        forwardValue3564_44_0 = spill3564_0;
        break forward_join_44;
    }
    if (!((p2 < (this.j + this.h)))) {
        forwardValue3564_44_0 = spill3564_0;
        break forward_join_44;
    }
    forwardValue3564_45_0 = spill3564_0;
    forwardValue3564_45_1 = 1;
    break forward_join_45;
    }
    forwardValue3564_45_0 = forwardValue3564_44_0;
    forwardValue3564_45_1 = 0;
    }
    ((moom.gc)(forwardValue3564_45_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3564_45_1)));
    life7_61 = ((moom.gc)(this)).a(((boolean)(this.o)));
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3564_17(20766, (8492300007940736275L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3564_18(21923, (1742633484204556711L ^ life4_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.b(((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3564_20(25187, (5931029748672001643L ^ life4_3)))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3564_21(21863, (243799673829409126L ^ life4_3)))));
    if (!(this.p)) {
        break forward_join_100;
    }
    net.minecraft.client.gui.Gui.a(((int)(this.i)), ((int)(this.j)), ((int)((this.i + this.g))), ((int)((this.j + this.h))), ((int)(__sourceIntrinsic_de1ba8f88103_invokedynamic3564_30(10348, (5161350209941191779L ^ life4_3)))));
    break forward_join_166;
    }
    ((moom.gc)(this)).b(((int)(this.i)), ((int)(this.j)), ((int)(0)), ((int)((__sourceIntrinsic_de1ba8f88103_invokedynamic3564_34(13128, (3032422816012478280L ^ life4_3)) + (life7_61 * __sourceIntrinsic_de1ba8f88103_invokedynamic3564_35(15549, (6437972658558281915L ^ life4_3)))))), ((int)((this.g / 2))), ((int)(this.h)));
    ((moom.gc)(this)).b(((int)((this.i + (this.g / 2)))), ((int)(this.j)), ((int)((__sourceIntrinsic_de1ba8f88103_invokedynamic3564_42(28439, (3401258487110761236L ^ life4_3)) - (this.g / 2)))), ((int)((__sourceIntrinsic_de1ba8f88103_invokedynamic3564_44(28067, (2495356514830514598L ^ life4_3)) + (life7_61 * __sourceIntrinsic_de1ba8f88103_invokedynamic3564_45(6896, (1342526468928671482L ^ life4_3)))))), ((int)((this.g / 2))), ((int)(this.h)));
    }
    ((moom.gc)(this)).b(((net.minecraft.client.Minecraft)(p0)), ((int)(p1)), ((int)(p2)));
    life8_189 = __sourceIntrinsic_de1ba8f88103_invokedynamic3564_50(8276, (2038997951256015965L ^ life4_3));
    if (!((!this.m))) {
        break forward_join_187;
    }
    life8_189 = __sourceIntrinsic_de1ba8f88103_invokedynamic3564_52(15976, (5703164096138947174L ^ life4_3));
    break forward_join_196;
    }
    if (!(this.o)) {
        break forward_join_196;
    }
    life8_189 = __sourceIntrinsic_de1ba8f88103_invokedynamic3564_54(31797, (904837678041917497L ^ life4_3));
    }
    if (!(this.p)) {
        break forward_join_241;
    }
    spill3564_1 = this;
    spill3564_2 = life6_9;
    spill3564_3 = this.k;
    spill3564_4 = (this.i + (this.g / 2));
    spill3564_5 = (this.j + ((this.h - __sourceIntrinsic_de1ba8f88103_invokedynamic3564_61(29808, (3223614902905135206L ^ life4_3))) / 2));
    if (!(this.m)) {
        forwardValue3564_237_0 = spill3564_1;
        forwardValue3564_237_1 = spill3564_2;
        forwardValue3564_237_2 = spill3564_3;
        forwardValue3564_237_3 = spill3564_4;
        forwardValue3564_237_4 = spill3564_5;
        break forward_join_237;
    }
    if (!(this.o)) {
        forwardValue3564_231_0 = spill3564_1;
        forwardValue3564_231_1 = spill3564_2;
        forwardValue3564_231_2 = spill3564_3;
        forwardValue3564_231_3 = spill3564_4;
        forwardValue3564_231_4 = spill3564_5;
        break forward_join_231;
    }
    forwardValue3564_239_0 = spill3564_1;
    forwardValue3564_239_1 = spill3564_2;
    forwardValue3564_239_2 = spill3564_3;
    forwardValue3564_239_3 = spill3564_4;
    forwardValue3564_239_4 = spill3564_5;
    forwardValue3564_239_5 = -1;
    break forward_join_239;
    }
    forwardValue3564_239_0 = forwardValue3564_231_0;
    forwardValue3564_239_1 = forwardValue3564_231_1;
    forwardValue3564_239_2 = forwardValue3564_231_2;
    forwardValue3564_239_3 = forwardValue3564_231_3;
    forwardValue3564_239_4 = forwardValue3564_231_4;
    forwardValue3564_239_5 = __sourceIntrinsic_de1ba8f88103_invokedynamic3564_64(8165, (6665091840608963554L ^ life4_3));
    break forward_join_239;
    }
    forwardValue3564_239_0 = forwardValue3564_237_0;
    forwardValue3564_239_1 = forwardValue3564_237_1;
    forwardValue3564_239_2 = forwardValue3564_237_2;
    forwardValue3564_239_3 = forwardValue3564_237_3;
    forwardValue3564_239_4 = forwardValue3564_237_4;
    forwardValue3564_239_5 = ((java.awt.Color)(java.awt.Color.darkGray)).getRGB();
    }
    ((moom.gc)(forwardValue3564_239_0)).a(((net.minecraft.client.gui.FontRenderer)(forwardValue3564_239_1)), ((java.lang.String)(forwardValue3564_239_2)), ((int)(forwardValue3564_239_3)), ((int)(forwardValue3564_239_4)), ((int)(forwardValue3564_239_5)));
    break forward_join_267;
    }
    ((moom.gc)(this)).a(((net.minecraft.client.gui.FontRenderer)(life6_9)), ((java.lang.String)(this.k)), ((int)((this.i + (this.g / 2)))), ((int)((this.j + ((this.h - __sourceIntrinsic_de1ba8f88103_invokedynamic3564_73(14931, (6889900979646836305L ^ life4_3))) / 2)))), ((int)(life8_189)));
    }
    return;
}


protected int a(boolean p0) {
int local2 = 1;
    if ((((this.m) ? 1 : 0) == 0)) {
        local2 = 0;
    } else {
        if ((__sourceIntrinsic_booleanComparison(p0) != 0)) {
        local2 = 2;
    }
    }
    return local2;
}


public boolean a__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public void a(net.minecraft.client.audio.SoundHandler p0) {
((net.minecraft.client.audio.SoundHandler)(p0)).a(((net.minecraft.client.audio.ISound)(moom.fY.a(((moom.DD)(new moom.DD("gui.button.press"))), ((float)(0x1.0p0f))))));
    return;
}


public int a() {
return this.g;
}


private static native <E extends Throwable> int __sourceIntrinsic_37b907bd7cde6420_originalDynamicSite798_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_37b907bd7cde6420_originalDynamicSite798_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7749_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de1ba8f88103_invokedynamic3564_73(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
