package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class lw {

private java.nio.ByteBuffer a;

public java.nio.IntBuffer b;

private java.nio.ShortBuffer c;

public java.nio.FloatBuffer d;

public int e;

private moom.oF f;

private int g;

private boolean h;

public int i;

private double j;

private double k;

private double l;

private moom.oD m;

private boolean n;

private net.minecraft.util.EnumWorldBlockLayer o;

private boolean[] p;

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] q;

private net.minecraft.client.renderer.texture.TextureAtlasSprite[] r;

private net.minecraft.client.renderer.texture.TextureAtlasSprite s;

public moom.MH t;

public moom.Mi u;

public java.util.BitSet v;

public java.util.BitSet w;

private boolean x;

private java.nio.ByteBuffer y;

private static net.minecraft.entity.Entity[] z;

private static long A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public lw(int p0) { super(); }


private static void __sourceConstructorBody_3e1506557cc5dad0(moom.lw receiver, int p0) throws Throwable {

long local2 = (moom.lw.A ^ 10913623456126L);

    moom.lw.__sourceConstructorInit_3e1506557cc5dad0_0(((moom.lw)(receiver)));

    ((moom.lw)(receiver)).o = ((net.minecraft.util.EnumWorldBlockLayer)(null));

    ((moom.lw)(receiver)).p = ((boolean[])(new boolean[__sourceIntrinsic_3e1506557cc5dad0_originalDynamicSite3082_3(7475, (6722740934900122812L ^ local2))]));

    ((moom.lw)(receiver)).q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));

    ((moom.lw)(receiver)).r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));

    ((moom.lw)(receiver)).s = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));

    ((moom.lw)(receiver)).u = ((moom.Mi)(null));

    ((moom.lw)(receiver)).v = ((java.util.BitSet)(null));

    ((moom.lw)(receiver)).w = ((java.util.BitSet)(new java.util.BitSet()));

    ((moom.lw)(receiver)).x = ((boolean)(false));

    ((moom.lw)(receiver)).a = ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((p0 * 4))))));

    ((moom.lw)(receiver)).b = ((java.nio.IntBuffer)(((java.nio.ByteBuffer)(((moom.lw)(receiver)).a)).asIntBuffer()));

    ((moom.lw)(receiver)).c = ((java.nio.ShortBuffer)(((java.nio.ByteBuffer)(((moom.lw)(receiver)).a)).asShortBuffer()));

    ((moom.lw)(receiver)).d = ((java.nio.FloatBuffer)(((java.nio.ByteBuffer)(((moom.lw)(receiver)).a)).asFloatBuffer()));

    moom.MH.a(((moom.lw)(receiver)));

    return;

}



static {
A = ((long)(((moom._a)(moom._c.a(((long)(2983734895352084416L)), ((long)(489504269433012089L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(61700413551879L)))));
    java.lang.Object __sourceSpill1391_6 = null;
    D = ((java.util.Map)(new java.util.HashMap(13)));
    moom.lw.b(((net.minecraft.entity.Entity[])(__sourceSpill1391_6)));
    long local0_life9 = (moom.lw.A ^ 124519771417024L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1391_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1391_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1391_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1391_16 = new byte[8];
    (__sourceSpill1391_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1391_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1391_18 = __sourceSpill1391_16;
    ((javax.crypto.Cipher)(__sourceSpill1391_13)).init(((int)(__sourceSpill1391_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1391_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1391_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[20];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "4ÎÞÍC~àéqáä[W°Ó¿I\177Gà+aÄzáá|P×Ï\0309@§Ð^Å\007n\"áú4ü]mSo\037ÅãÆÙ;®\006ãÛCëðïò@ÎÒaÁ\"\024rNóÅÓ?L~ðoÖ\031Ö[Qô4YÔYÂ\003E~e÷çÅ:ïù{Êñ$\025±öEÕò¥,ÿGpÂ¡+{\003\032¦"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1391_27 = local6_life23;
        int __sourceSpill1391_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1391_27)).substring(((int)(__sourceSpill1391_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1391_32 = local8_life21;
        int __sourceSpill1391_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1391_35 = new byte[8];
        (__sourceSpill1391_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1391_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1391_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1391_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1391_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1391_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1391_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1391_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1391_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1391_36)).doFinal(((byte[])(__sourceSpill1391_35)));
        (__sourceSpill1391_32)[__sourceSpill1391_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "HõA\\g\"©\030³çCZ¬±"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1391_40 = local6_life23;
        int __sourceSpill1391_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1391_40)).substring(((int)(__sourceSpill1391_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1391_45 = local8_life21;
        int __sourceSpill1391_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1391_48 = new byte[8];
        (__sourceSpill1391_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1391_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1391_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1391_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1391_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1391_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1391_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1391_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1391_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1391_49)).doFinal(((byte[])(__sourceSpill1391_48)));
        (__sourceSpill1391_45)[__sourceSpill1391_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    B = ((long[])(local8_life21));
    C = ((java.lang.Integer[])(new java.lang.Integer[20]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3e1506557cc5dad0_0(moom.lw a0) throws E;

public void b(double p0, double p1, double p2) {
this.j = ((double)(p0));
    this.k = ((double)(p1));
    this.l = ((double)(p2));
    return;
}


public double b() {
return this.k;
}


public void b(float p0, float p1, float p2) {
long local4 = (moom.lw.A ^ 126388738528949L);
    int local6 = (((byte) ((int) (p0 * 0x1.fcp6f))) & __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_1(27209, (395946079468379154L ^ local4)));
    int local7 = (((byte) ((int) (p1 * 0x1.fcp6f))) & __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_2(27209, (395946079468379154L ^ local4)));
    int local8 = (((byte) ((int) (p2 * 0x1.fcp6f))) & __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_3(27209, (395946079468379154L ^ local4)));
    int local9 = ((local6 | (local7 << __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_4(422, (6151614129164433395L ^ local4)))) | (local8 << __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_5(30995, (2144296678385340245L ^ local4))));
    int local10 = (((moom.oD)(this.m)).d() >> 2);
    int local11 = (((this.e - 4) * local10) + (((moom.oD)(this.m)).a() / 4));
    ((java.nio.IntBuffer)(this.b)).put(((int)(local11)), ((int)(local9)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local11 + local10))), ((int)(local9)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local11 + (local10 * 2)))), ((int)(local9)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local11 + (local10 * 3)))), ((int)(local9)));
    return;
}


public void b(float p0, float p1, float p2, int p3) {
long local5 = (moom.lw.A ^ 104327087500017L);
    int local7 = ((moom.lw)(this)).a(((int)(p3)));
    int local8 = moom.Dr.a(((int)(((int) (p0 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_2(7755, (3039498157805442139L ^ local5)))));
    int local9 = moom.Dr.a(((int)(((int) (p1 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_4(27209, (395897634936283222L ^ local5)))));
    int local10 = moom.Dr.a(((int)(((int) (p2 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_6(27209, (395897634936283222L ^ local5)))));
    ((moom.lw)(this)).a(((int)(local7)), ((int)(local8)), ((int)(local9)), ((int)(local10)), ((int)(__sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_8(27209, (395897634936283222L ^ local5)))));
    return;
}


public void b__Void() {
this.h = ((boolean)(true));
    return;
}


public boolean b__Boolean() {
return ((((this.n) ? 1 : 0)) != 0);
}


private void b(int p0, int p1) {
int life3_3;
    int life4_9;
    int life5_13;
    life3_3 = (p1 - p0);
    if ((life3_3 > 0)) {
        life4_9 = (p0 * 4);
        life5_13 = (life3_3 * 4);
        org.lwjgl.opengl.GL11.glDrawArrays(((int)(this.i)), ((int)(life4_9)), ((int)(life5_13)));
    }
    return;
}


public int b__Int() {
long local1 = (moom.lw.A ^ 67728264397944L);
    return (this.x ? ((this.e / 4) * __sourceIntrinsic_a63cd0a8780c_invokedynamic8343_3(19731, (2797854256968952195L ^ local1))) : this.e);
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.lw.z;
}


public void b(int p0) {
int local2 = 0;
    while ((local2 < 4)) {
        ((moom.lw)(this)).a__Void(((int)(p0)), ((int)((local2 + 1))));
        local2 += 1;
    }
    return;
}


public static void b(net.minecraft.entity.Entity[] p0) {
z = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public void b(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
if ((this.v != null)) {
        if ((p0 != null)) {
        if ((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).g() >= 0)) {
        ((java.util.BitSet)(this.v)).set(((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).g())));
    }
    }
    }
    if ((this.q != null)) {
        this.s = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0));
    }
    return;
}


public void e() {
if ((!this.n)) {
        throw new java.lang.IllegalStateException("Not building!");
    }
    this.n = ((boolean)(false));
    ((java.nio.ByteBuffer)(this.a)).position(((int)(0)));
    ((java.nio.ByteBuffer)(this.a)).limit(((int)((((moom.lw)(this)).a__Int() * 4))));
    return;
}


public void c(float p0, float p1, float p2) {
int local4 = 0;
    while ((local4 < 4)) {
        ((moom.lw)(this)).b(((float)(p0)), ((float)(p1)), ((float)(p2)), ((int)((local4 + 1))));
        local4 += 1;
    }
    return;
}


public void c__Void() {
moom.lw __stackOp3770_0_0 = this;
    ((moom.lw)(__stackOp3770_0_0)).e = ((int)((((moom.lw)(__stackOp3770_0_0)).e + 1)));
    ((moom.lw)(this)).a__Void(((int)(((moom.oD)(this.m)).c())));
    this.g = ((int)(0));
    this.f = ((moom.oF)(((moom.oD)(this.m)).a__oF(((int)(this.g)))));
    if (moom.BU.ap()) {
        moom.MH.e(((moom.lw)(this)));
    }
    return;
}


public int c__Int() {
return ((((this.x) ? 1 : 0) != 0) ? 4 : this.i);
}


public boolean c__Boolean() {
return ((((this.h) ? 1 : 0)) != 0);
}


public double c() {
return this.l;
}


public void f() {
int life1_6;
    int life2_24;
    int life3_26;
    int life4_31;
    int life5_33;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life6_41;
    int life7_46;
    forest_join_88: {
    forest_join_86: {
    forest_join_78: {
    forest_join_18: {
    if (!((this.q != null))) {
        break forest_join_88;
    }
    life1_6 = ((net.minecraft.client.renderer.texture.TextureMap)(((net.minecraft.client.Minecraft)(moom.BU.a__fM())).a__n8())).e();
    if (!(((this.p).length <= life1_6))) {
        break forest_join_18;
    }
    this.p = ((boolean[])(new boolean[(life1_6 + 1)]));
    }
    java.util.Arrays.fill(((boolean[])(this.p)), ((boolean)(false)));
    life2_24 = 0;
    life3_26 = -1;
    life4_31 = (this.e / 4);
    life5_33 = 0;
    forest_cycle_33: while (true) {
    forest_join_76: {
    forest_join_59: {
    if (!((life5_33 < life4_31))) {
        break forest_join_78;
    }
    life6_41 = (this.q)[life5_33];
    if (!((life6_41 != null))) {
        break forest_join_76;
    }
    life7_46 = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life6_41)).f();
    if (!((!(this.p)[life7_46]))) {
        break forest_join_76;
    }
    if (!((life6_41 == moom.Oc.c))) {
        break forest_join_59;
    }
    if (!((life3_26 < 0))) {
        break forest_join_76;
    }
    life3_26 = life5_33;
    break forest_join_76;
    }
    life5_33 = (((moom.lw)(this)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(life6_41)), ((int)(life5_33))) - 1);
    life2_24 += 1;
    if (!((this.o != net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT))) {
        break forest_join_76;
    }
    (this.p)[life7_46] = ((1) != 0);
    }
    life5_33 += 1;
    continue forest_cycle_33;
    }
    }
    if (!((life3_26 >= 0))) {
        break forest_join_86;
    }
    ((moom.lw)(this)).a(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(moom.Oc.c)), ((int)(life3_26)));
    life2_24 += 1;
    }
    if (!((life2_24 > 0))) {
        break forest_join_88;
    }
    }
    return;
}


private int d() {
return ((((java.nio.IntBuffer)(this.b)).capacity() * 4) / (((moom.oD)(this.m)).c() * 4));
}


private void d__Void() {
moom.lw __stackOp3771_0_0 = this;
    ((moom.lw)(__stackOp3771_0_0)).g = ((int)((((moom.lw)(__stackOp3771_0_0)).g + 1)));
    moom.lw __stackOp3771_3_0 = this;
    ((moom.lw)(__stackOp3771_3_0)).g = ((int)((((moom.lw)(__stackOp3771_3_0)).g % ((moom.oD)(this.m)).e())));
    this.f = ((moom.oF)(((moom.oD)(this.m)).a__oF(((int)(this.g)))));
    if ((((moom.oF)(this.f)).a__aK() == net.minecraft.client.renderer.vertex.VertexFormatElement$EnumUsage.PADDING)) {
        ((moom.lw)(this)).d__Void();
    }
    return;
}


public void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) {
int life2_29;
    if ((this.v != null)) {
        if ((p0 != null)) {
        if ((((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).g() >= 0)) {
        ((java.util.BitSet)(this.v)).set(((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).g())));
    }
    }
    }
    if ((this.q != null)) {
        life2_29 = (this.e / 4);
        (this.q)[(life2_29 - 1)] = p0;
    }
    return;
}


private static java.lang.IllegalStateException a(java.lang.IllegalStateException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.lw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8351_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/lw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6107;
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
            throw new RuntimeException("moom/lw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


public moom.Mi a(net.minecraft.block.state.IBlockState p0, moom.DT p1) {
if ((this.u == null)) {
        this.u = ((moom.Mi)(new moom.Mi(p0, p1)));
    } else {
        ((moom.Mi)(this.u)).a(((net.minecraft.block.state.IBlockState)(p0)), ((moom.DT)(p1)));
    }
    return this.u;
}


public void a(net.minecraft.util.EnumWorldBlockLayer p0) {
this.o = ((net.minecraft.util.EnumWorldBlockLayer)(p0));
    if ((p0 == null)) {
        if ((this.q != null)) {
        this.r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.q));
    }
        this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));
        this.s = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    }
    return;
}


public double a() {
return this.j;
}


private int a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int p1) {
long life3_3;
    int life5_13;
    int life6_15;
    int life7_20;
    int life8_22;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life9_30;
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_59: {
    life3_3 = (moom.lw.A ^ 36193332316790L);
    org.lwjgl.opengl.GL11.glBindTexture(((int)(__sourceIntrinsic_3702253934ea_invokedynamic1243_1(16001, (408388495999849502L ^ life3_3)))), ((int)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(p0)).w)));
    life5_13 = -1;
    life6_15 = -1;
    life7_20 = (this.e / 4);
    life8_22 = p1;
    lexical_cycle_23: while (true) {
    lexical_join_57: {
    lexical_join_51: {
    lexical_join_39: {
    if (!((life8_22 < life7_20))) {
        break lexical_join_59;
    }
    life9_30 = (this.q)[life8_22];
    if (!((life9_30 == p0))) {
        break lexical_join_39;
    }
    if (!((life6_15 < 0))) {
        break lexical_join_57;
    }
    life6_15 = life8_22;
    break lexical_join_57;
    }
    if (!((life6_15 >= 0))) {
        break lexical_join_57;
    }
    ((moom.lw)(this)).b(((int)(life6_15)), ((int)(life8_22)));
    if (!((this.o == net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT))) {
        break lexical_join_51;
    }
    return life8_22;
    }
    life6_15 = -1;
    if (!((life5_13 < 0))) {
        break lexical_join_57;
    }
    life5_13 = life8_22;
    }
    life8_22 += 1;
    continue lexical_cycle_23;
    }
    }
    if (!((life6_15 >= 0))) {
        break lexical_join_65;
    }
    ((moom.lw)(this)).b(((int)(life6_15)), ((int)(life7_20)));
    }
    if (!((life5_13 < 0))) {
        break lexical_join_69;
    }
    life5_13 = life7_20;
    }
    return life5_13;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return this.o;
}


public boolean a__Boolean() {
return ((((this.q != null) ? 1 : 0)) != 0);
}


public void a(float p0, float p1, float p2, float p3, int p4) {
long life6_3;
    int life8_7;
    int life9_9;
    int life9_17;
    int life10_32;
    int life11_50;
    int life12_68;
    int life13_86;
    int life10_131;
    int life11_149;
    int life12_167;
    int life13_179;
    life6_3 = (moom.lw.A ^ 122182315855644L);
    life8_7 = ((moom.lw)(this)).a(((int)(p4)));
    life9_9 = -1;
    if ((!this.h)) {
        life9_17 = ((java.nio.IntBuffer)(this.b)).get(((int)(life8_7)));
        if ((java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN)) {
        life10_32 = ((int) (((float) (life9_17 & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_7(27209, (395950837785822651L ^ life6_3)))) * p0));
        life11_50 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_8(422, (6151619784062234202L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_9(27209, (395950837785822651L ^ life6_3)))) * p1));
        life12_68 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_10(30995, (2144293531821315836L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_11(27209, (395950837785822651L ^ life6_3)))) * p2));
        life13_86 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_12(16156, (6142588526866026736L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_13(27209, (395950837785822651L ^ life6_3)))) * p3));
        life9_9 = ((((life13_86 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_14(16156, (6142588526866026736L ^ life6_3))) | (life12_68 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_15(30995, (2144293531821315836L ^ life6_3)))) | (life11_50 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_16(422, (6151619784062234202L ^ life6_3)))) | life10_32);
    } else {
        life10_131 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_17(16156, (6142588526866026736L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_18(27209, (395950837785822651L ^ life6_3)))) * p0));
        life11_149 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_19(30995, (2144293531821315836L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_20(27209, (395950837785822651L ^ life6_3)))) * p1));
        life12_167 = ((int) (((float) ((life9_17 >> __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_21(422, (6151619784062234202L ^ life6_3))) & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_22(27209, (395950837785822651L ^ life6_3)))) * p2));
        life13_179 = ((int) (((float) (life9_17 & __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_23(27209, (395950837785822651L ^ life6_3)))) * p3));
        life9_9 = ((((life10_131 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_24(16156, (6142588526866026736L ^ life6_3))) | (life11_149 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_25(30995, (2144293531821315836L ^ life6_3)))) | (life12_167 << __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_26(422, (6151619784062234202L ^ life6_3)))) | life13_179);
    }
    }
    ((java.nio.IntBuffer)(this.b)).put(((int)(life8_7)), ((int)(life9_9)));
    return;
}


public void a__Void() {
this.e = ((int)(0));
    this.f = ((moom.oF)(null));
    this.g = ((int)(0));
    this.s = ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(null));
    if ((__sourceIntrinsic_booleanComparison(moom.JY.a__Boolean()) != 0)) {
        if ((this.v == null)) {
        this.v = ((java.util.BitSet)(this.w));
    }
        ((java.util.BitSet)(this.v)).clear();
    } else {
        if ((this.v != null)) {
        this.v = ((java.util.BitSet)(null));
    }
    }
    this.x = ((boolean)(false));
    return;
}


public void a(int p0, moom.oD p1) {
forward_join_76: {
    forward_join_73: {
    forward_join_66: {
    forward_join_60: {
    forward_join_51: {
    forward_join_39: {
    forward_join_8: {
    if (!(this.n)) { break forward_join_8; }
    throw new java.lang.IllegalStateException("Already building!");
    }
    this.n = ((boolean)(true));
    ((moom.lw)(this)).a__Void();
    this.i = ((int)(p0));
    this.m = ((moom.oD)(p1));
    this.f = ((moom.oF)(((moom.oD)(p1)).a__oF(((int)(this.g)))));
    this.h = ((boolean)(false));
    ((java.nio.ByteBuffer)(this.a)).limit(((int)(((java.nio.ByteBuffer)(this.a)).capacity())));
    if (!(moom.BU.ap())) { break forward_join_39; }
    moom.MH.c(((moom.lw)(this)));
    }
    if (!(moom.BU.Y())) { break forward_join_66; }
    if (!((this.o != null))) { break forward_join_76; }
    if (!((this.q == null))) { break forward_join_51; }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.r));
    }
    if (!((this.q != null))) { break forward_join_60; }
    if (!(((this.q).length < ((moom.lw)(this)).d()))) { break forward_join_76; }
    }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(new net.minecraft.client.renderer.texture.TextureAtlasSprite[((moom.lw)(this)).d()]));
    break forward_join_76;
    }
    if (!((this.q != null))) { break forward_join_73; }
    this.r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.q));
    }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));
    }
    return;
}


public moom.lw a(double p0, double p1) {
int life5_42;
    forest_join_120: {
    forest_join_102: {
    forest_join_83: {
    forest_join_66: {
    forest_join_49: {
    forest_join_29: {
    if (!((this.s != null))) {
        break forest_join_29;
    }
    if (!((this.q != null))) {
        break forest_join_29;
    }
    p0 = ((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.s)).a__Float(((float)(((float) p0)))));
    p1 = ((double) ((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.s)).b__Float(((float)(((float) p1)))));
    (this.q)[(this.e / 4)] = this.s;
    }
    life5_42 = ((this.e * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b(((int)(this.g))));
    switch ((net.minecraft.client.renderer.WorldRenderer$2.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(this.f)).a__aJ())).ordinal()]) {
case 1:
{
        break forest_join_49;
    }
case 2:
case 3:
{
        break forest_join_66;
    }
case 4:
case 5:
{
        break forest_join_83;
    }
case 6:
case 7:
{
        break forest_join_102;
    }
default:
{
        break forest_join_120;
    }
}
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life5_42)), ((float)(((float) p0))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life5_42 + 4))), ((float)(((float) p1))));
    break forest_join_120;
    }
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)(life5_42)), ((int)(((int) p0))));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life5_42 + 4))), ((int)(((int) p1))));
    break forest_join_120;
    }
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)(life5_42)), ((short)(((short) ((int) p1)))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life5_42 + 2))), ((short)(((short) ((int) p0)))));
    break forest_join_120;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life5_42)), ((byte)(((byte) ((int) p1)))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life5_42 + 1))), ((byte)(((byte) ((int) p0)))));
    }
    ((moom.lw)(this)).d__Void();
    return this;
}


public moom.lw a(int p0, int p1) {
int life3_12;
    forest_join_85: {
    forest_join_69: {
    forest_join_52: {
    forest_join_37: {
    forest_join_20: {
    life3_12 = ((this.e * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b(((int)(this.g))));
    switch ((net.minecraft.client.renderer.WorldRenderer$2.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(this.f)).a__aJ())).ordinal()]) {
case 1:
{
        break forest_join_20;
    }
case 2:
case 3:
{
        break forest_join_37;
    }
case 4:
case 5:
{
        break forest_join_52;
    }
case 6:
case 7:
{
        break forest_join_69;
    }
default:
{
        break forest_join_85;
    }
}
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life3_12)), ((float)(((float) p0))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life3_12 + 4))), ((float)(((float) p1))));
    break forest_join_85;
    }
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)(life3_12)), ((int)(p0)));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life3_12 + 4))), ((int)(p1)));
    break forest_join_85;
    }
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)(life3_12)), ((short)(((short) p1))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life3_12 + 2))), ((short)(((short) p0))));
    break forest_join_85;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life3_12)), ((byte)(((byte) p1))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life3_12 + 1))), ((byte)(((byte) p0))));
    }
    ((moom.lw)(this)).d__Void();
    return this;
}


public void a__Void(int p0, int p1, int p2, int p3) {
int local5 = (((this.e - 4) * ((moom.oD)(this.m)).c()) + (((moom.oD)(this.m)).a(((int)(1))) / 4));
    int local6 = (((moom.oD)(this.m)).d() >> 2);
    ((java.nio.IntBuffer)(this.b)).put(((int)(local5)), ((int)(p0)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local5 + local6))), ((int)(p1)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local5 + (local6 * 2)))), ((int)(p2)));
    ((java.nio.IntBuffer)(this.b)).put(((int)((local5 + (local6 * 3)))), ((int)(p3)));
    return;
}


public void a__Void(double p0, double p1, double p2) {
int life7_3;
    int life8_10;
    int life9_12;
    int life10_21;
    int life11_25;
    int life12_29;
    life7_3 = ((moom.oD)(this.m)).c();
    life8_10 = ((this.e - 4) * life7_3);
    life9_12 = 0;
    while ((life9_12 < 4)) {
        life10_21 = (life8_10 + (life9_12 * life7_3));
        life11_25 = (life10_21 + 1);
        life12_29 = (life11_25 + 1);
        ((java.nio.IntBuffer)(this.b)).put(((int)(life10_21)), ((int)(java.lang.Float.floatToRawIntBits(((float)((((float) (p0 + this.j)) + java.lang.Float.intBitsToFloat(((int)(((java.nio.IntBuffer)(this.b)).get(((int)(life10_21)))))))))))));
        ((java.nio.IntBuffer)(this.b)).put(((int)(life11_25)), ((int)(java.lang.Float.floatToRawIntBits(((float)((((float) (p1 + this.k)) + java.lang.Float.intBitsToFloat(((int)(((java.nio.IntBuffer)(this.b)).get(((int)(life11_25)))))))))))));
        ((java.nio.IntBuffer)(this.b)).put(((int)(life12_29)), ((int)(java.lang.Float.floatToRawIntBits(((float)((((float) (p2 + this.l)) + java.lang.Float.intBitsToFloat(((int)(((java.nio.IntBuffer)(this.b)).get(((int)(life12_29)))))))))))));
        life9_12 += 1;
    }
    return;
}


private void a__Void(int p0) {
long life2_3;
    int life4_12;
    int life5_20;
    int life6_46;
    int life7_55;
    java.nio.ByteBuffer life8_58;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life9_107;
    int life10_110;
    life2_3 = (moom.lw.A ^ 127919155902269L);
    if ((p0 > ((java.nio.IntBuffer)(this.b)).remaining())) {
        life4_12 = ((java.nio.ByteBuffer)(this.a)).capacity();
        life5_20 = (life4_12 % __sourceIntrinsic_6fc3381d0590_invokedynamic6834_5(17261, (7822932228544959677L ^ life2_3)));
        life6_46 = (life5_20 + ((((((((java.nio.IntBuffer)(this.b)).position() + p0) * 4) - life5_20) / __sourceIntrinsic_6fc3381d0590_invokedynamic6834_8(7335, (9074920922093702008L ^ life2_3))) + 1) * __sourceIntrinsic_6fc3381d0590_invokedynamic6834_9(7335, (9074920922093702008L ^ life2_3))));
        ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger())).warn(((java.lang.String)(__sourceIntrinsic_6fc3381d0590_invokedynamic6834_11(life4_12, life6_46))));
        life7_55 = ((java.nio.IntBuffer)(this.b)).position();
        life8_58 = net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)(life6_46)));
        ((java.nio.ByteBuffer)(this.a)).position(((int)(0)));
        ((java.nio.ByteBuffer)(life8_58)).put(((java.nio.ByteBuffer)(this.a)));
        ((java.nio.ByteBuffer)(life8_58)).rewind();
        this.a = ((java.nio.ByteBuffer)(life8_58));
        this.d = ((java.nio.FloatBuffer)(((java.nio.ByteBuffer)(this.a)).asFloatBuffer()));
        this.b = ((java.nio.IntBuffer)(((java.nio.ByteBuffer)(this.a)).asIntBuffer()));
        ((java.nio.IntBuffer)(this.b)).position(((int)(life7_55)));
        this.c = ((java.nio.ShortBuffer)(((java.nio.ByteBuffer)(this.a)).asShortBuffer()));
        ((java.nio.ShortBuffer)(this.c)).position(((int)((life7_55 << 1))));
        if ((this.q != null)) {
        life9_107 = this.q;
        life10_110 = ((moom.lw)(this)).d();
        this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(new net.minecraft.client.renderer.texture.TextureAtlasSprite[life10_110]));
        java.lang.System.arraycopy(((java.lang.Object)(life9_107)), ((int)(0)), ((java.lang.Object)(this.q)), ((int)(0)), ((int)(java.lang.Math.min(((int)((life9_107).length)), ((int)((this.q).length))))));
        this.r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));
    }
    }
    return;
}


public void a__Void(float p0, float p1, float p2) {
int life4_4;
    float[] life5_7;
    int life6_9;
    java.lang.Integer[] life6_51;
    int life7_53;
    java.util.BitSet life7_74;
    int life8_78;
    int[] life9_81;
    int life10_83;
    int life11_96;
    int life12_122;
    int life13_127;
    java.nio.IntBuffer life14_150;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life10_230;
    int life11_238;
    int life12_240;
    int life13_249;
    life4_4 = (this.e / 4);
    life5_7 = new float[life4_4];
    life6_9 = 0;
    loop_region_10: while ((life6_9 < life4_4)) {
        (life5_7)[life6_9] = moom.lw.a(((java.nio.FloatBuffer)(this.d)), ((float)(((float) (((double) p0) + this.j)))), ((float)(((float) (((double) p1) + this.k)))), ((float)(((float) (((double) p2) + this.l)))), ((int)(((moom.oD)(this.m)).c())), ((int)((life6_9 * ((moom.oD)(this.m)).d()))));
        life6_9 += 1;
    }
    life6_51 = new java.lang.Integer[life4_4];
    life7_53 = 0;
    loop_region_52: while ((life7_53 < (life6_51).length)) {
        (life6_51)[life7_53] = java.lang.Integer.valueOf(((int)(life7_53)));
        life7_53 += 1;
    }
    java.util.Arrays.sort(((java.lang.Object[])(life6_51)), ((java.util.Comparator)(__sourceIntrinsic_5eeac99566a7_invokedynamic4363_11(life5_7))));
    life7_74 = new java.util.BitSet();
    life8_78 = ((moom.oD)(this.m)).d();
    life9_81 = new int[life8_78];
    life10_83 = 0;
    loop_region_80: while (((life10_83 = ((java.util.BitSet)(life7_74)).nextClearBit(((int)(life10_83)))) < (life6_51).length)) {
        life11_96 = ((java.lang.Integer)((life6_51)[life10_83])).intValue();
        if ((life11_96 != life10_83)) {
        ((java.nio.IntBuffer)(this.b)).limit(((int)(((life11_96 * life8_78) + life8_78))));
        ((java.nio.IntBuffer)(this.b)).position(((int)((life11_96 * life8_78))));
        ((java.nio.IntBuffer)(this.b)).get(((int[])(life9_81)));
        life12_122 = life11_96;
        life13_127 = ((java.lang.Integer)((life6_51)[life11_96])).intValue();
        loop_region_124: while ((life12_122 != life10_83)) {
        ((java.nio.IntBuffer)(this.b)).limit(((int)(((life13_127 * life8_78) + life8_78))));
        ((java.nio.IntBuffer)(this.b)).position(((int)((life13_127 * life8_78))));
        life14_150 = ((java.nio.IntBuffer)(this.b)).slice();
        ((java.nio.IntBuffer)(this.b)).limit(((int)(((life12_122 * life8_78) + life8_78))));
        ((java.nio.IntBuffer)(this.b)).position(((int)((life12_122 * life8_78))));
        ((java.nio.IntBuffer)(this.b)).put(((java.nio.IntBuffer)(life14_150)));
        ((java.util.BitSet)(life7_74)).set(((int)(life12_122)));
        life12_122 = life13_127;
        life13_127 = ((java.lang.Integer)((life6_51)[life13_127])).intValue();
    }
        ((java.nio.IntBuffer)(this.b)).limit(((int)(((life10_83 * life8_78) + life8_78))));
        ((java.nio.IntBuffer)(this.b)).position(((int)((life10_83 * life8_78))));
        ((java.nio.IntBuffer)(this.b)).put(((int[])(life9_81)));
    }
        ((java.util.BitSet)(life7_74)).set(((int)(life10_83)));
        life10_83 += 1;
    }
    ((java.nio.IntBuffer)(this.b)).limit(((int)(((java.nio.IntBuffer)(this.b)).capacity())));
    ((java.nio.IntBuffer)(this.b)).position(((int)(((moom.lw)(this)).a__Int())));
    if ((this.q != null)) {
        life10_230 = new net.minecraft.client.renderer.texture.TextureAtlasSprite[(this.e / 4)];
        life11_238 = ((((moom.oD)(this.m)).d() / 4) * 4);
        life12_240 = 0;
        loop_region_237: while ((life12_240 < (life6_51).length)) {
        life13_249 = ((java.lang.Integer)((life6_51)[life12_240])).intValue();
        (life10_230)[life12_240] = (this.q)[life13_249];
        life12_240 += 1;
    }
        java.lang.System.arraycopy(((java.lang.Object)(life10_230)), ((int)(0)), ((java.lang.Object)(this.q)), ((int)(0)), ((int)((life10_230).length)));
    }
    return;
}


public moom.ly a__ly() {
int life1_6;
    int[] life2_14;
    net.minecraft.client.renderer.texture.TextureAtlasSprite[] life3_33;
    int life4_41;
    ((java.nio.IntBuffer)(this.b)).rewind();
    life1_6 = ((moom.lw)(this)).a__Int();
    ((java.nio.IntBuffer)(this.b)).limit(((int)(life1_6)));
    life2_14 = new int[life1_6];
    ((java.nio.IntBuffer)(this.b)).get(((int[])(life2_14)));
    ((java.nio.IntBuffer)(this.b)).limit(((int)(((java.nio.IntBuffer)(this.b)).capacity())));
    ((java.nio.IntBuffer)(this.b)).position(((int)(life1_6)));
    life3_33 = null;
    if ((this.q != null)) {
        life4_41 = (this.e / 4);
        life3_33 = new net.minecraft.client.renderer.texture.TextureAtlasSprite[life4_41];
        java.lang.System.arraycopy(((java.lang.Object)(this.q)), ((int)(0)), ((java.lang.Object)(life3_33)), ((int)(0)), ((int)(life4_41)));
    }
    return new moom.ly(life2_14, new moom.oD(this.m), life3_33);
}


public int a__Int() {
return (this.e * ((moom.oD)(this.m)).c());
}


private static float a(java.nio.FloatBuffer p0, float p1, float p2, float p3, int p4, int p5) {
float local6 = ((java.nio.FloatBuffer)(p0)).get(((int)(p5)));
    float local7 = ((java.nio.FloatBuffer)(p0)).get(((int)((p5 + 1))));
    float local8 = ((java.nio.FloatBuffer)(p0)).get(((int)((p5 + 2))));
    float local9 = ((java.nio.FloatBuffer)(p0)).get(((int)((p5 + p4))));
    float local10 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + p4) + 1))));
    float local11 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + p4) + 2))));
    float local12 = ((java.nio.FloatBuffer)(p0)).get(((int)((p5 + (p4 * 2)))));
    float local13 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + (p4 * 2)) + 1))));
    float local14 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + (p4 * 2)) + 2))));
    float local15 = ((java.nio.FloatBuffer)(p0)).get(((int)((p5 + (p4 * 3)))));
    float local16 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + (p4 * 3)) + 1))));
    float local17 = ((java.nio.FloatBuffer)(p0)).get(((int)(((p5 + (p4 * 3)) + 2))));
    float local18 = (((((local6 + local9) + local12) + local15) * 0x1.0p-2f) - p1);
    float local19 = (((((local7 + local10) + local13) + local16) * 0x1.0p-2f) - p2);
    float local20 = (((((local8 + local11) + local14) + local17) * 0x1.0p-2f) - p3);
    return (((local18 * local18) + (local19 * local19)) + (local20 * local20));
}


public void a(moom.ly p0) {
net.minecraft.client.renderer.texture.TextureAtlasSprite[] life2_64;
    forward_join_72: {
    forward_join_69: {
    forward_join_62: {
    forward_join_50: {
    forward_join_45: {
    forward_join_36: {
    ((java.nio.IntBuffer)(this.b)).clear();
    ((moom.lw)(this)).a__Void(((int)((((moom.ly)(p0)).a__ArrayInt()).length)));
    ((java.nio.IntBuffer)(this.b)).put(((int[])(((moom.ly)(p0)).a__ArrayInt())));
    this.e = ((int)(((moom.ly)(p0)).a()));
    this.m = ((moom.oD)(new moom.oD(((moom.ly)(p0)).a__oD())));
    if (!((((moom.ly)(p0)).c != null))) { break forward_join_62; }
    if (!((this.q == null))) { break forward_join_36; }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.r));
    }
    if (!((this.q != null))) { break forward_join_45; }
    if (!(((this.q).length < ((moom.lw)(this)).d()))) { break forward_join_50; }
    }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(new net.minecraft.client.renderer.texture.TextureAtlasSprite[((moom.lw)(this)).d()]));
    }
    life2_64 = ((moom.ly)(p0)).c;
    java.lang.System.arraycopy(((java.lang.Object)(life2_64)), ((int)(0)), ((java.lang.Object)(this.q)), ((int)(0)), ((int)((life2_64).length)));
    break forward_join_72;
    }
    if (!((this.q != null))) { break forward_join_69; }
    this.r = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(this.q));
    }
    this.q = ((net.minecraft.client.renderer.texture.TextureAtlasSprite[])(null));
    }
    return;
}


public moom.lw a(double p0, double p1, double p2) {
long life7_3;
    int life9_21;
    forest_join_184: {
    forest_join_147: {
    forest_join_109: {
    forest_join_67: {
    forest_join_28: {
    forest_join_8: {
    life7_3 = (moom.lw.A ^ 47433562402932L);
    if (!(moom.BU.ap())) {
        break forest_join_8;
    }
    moom.MH.d(((moom.lw)(this)));
    }
    life9_21 = ((this.e * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b(((int)(this.g))));
    switch ((net.minecraft.client.renderer.WorldRenderer$2.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(this.f)).a__aJ())).ordinal()]) {
case 1:
{
        break forest_join_28;
    }
case 2:
case 3:
{
        break forest_join_67;
    }
case 4:
case 5:
{
        break forest_join_109;
    }
case 6:
case 7:
{
        break forest_join_147;
    }
default:
{
        break forest_join_184;
    }
}
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life9_21)), ((float)(((float) (p0 + this.j)))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life9_21 + 4))), ((float)(((float) (p1 + this.k)))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life9_21 + __sourceIntrinsic_675270217551_invokedynamic888_20(422, (6151553865123664178L ^ life7_3))))), ((float)(((float) (p2 + this.l)))));
    break forest_join_184;
    }
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)(life9_21)), ((int)(java.lang.Float.floatToRawIntBits(((float)(((float) (p0 + this.j))))))));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life9_21 + 4))), ((int)(java.lang.Float.floatToRawIntBits(((float)(((float) (p1 + this.k))))))));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life9_21 + __sourceIntrinsic_675270217551_invokedynamic888_32(422, (6151553865123664178L ^ life7_3))))), ((int)(java.lang.Float.floatToRawIntBits(((float)(((float) (p2 + this.l))))))));
    break forest_join_184;
    }
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)(life9_21)), ((short)(((short) ((int) (p0 + this.j))))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life9_21 + 2))), ((short)(((short) ((int) (p1 + this.k))))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life9_21 + 4))), ((short)(((short) ((int) (p2 + this.l))))));
    break forest_join_184;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life9_21)), ((byte)(((byte) ((int) (p0 + this.j))))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life9_21 + 1))), ((byte)(((byte) ((int) (p1 + this.k))))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life9_21 + 2))), ((byte)(((byte) ((int) (p2 + this.l))))));
    }
    ((moom.lw)(this)).d__Void();
    return this;
}


public void a(int[] p0) {
if (moom.BU.ap()) {
        moom.MH.a(((moom.lw)(this)), ((int[])(p0)));
    }
    ((moom.lw)(this)).a__Void(((int)((p0).length)));
    ((java.nio.IntBuffer)(this.b)).position(((int)(((moom.lw)(this)).a__Int())));
    ((java.nio.IntBuffer)(this.b)).put(((int[])(p0)));
    moom.lw __stackOp3768_8_0 = this;
    ((moom.lw)(__stackOp3768_8_0)).e = ((int)((((moom.lw)(__stackOp3768_8_0)).e + ((p0).length / ((moom.oD)(this.m)).c()))));
    if (moom.BU.ap()) {
        moom.MH.f(((moom.lw)(this)));
    }
    return;
}


public moom.lw a(int p0, int p1, int p2, int p3) {
long life5_3;
    int life7_19;
    forest_join_234: {
    forest_join_232: {
    forest_join_198: {
    forest_join_160: {
    forest_join_121: {
    forest_join_78: {
    forest_join_27: {
    life5_3 = (moom.lw.A ^ 119257670157046L);
    if (!((!this.h))) {
        break forest_join_234;
    }
    life7_19 = ((this.e * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b(((int)(this.g))));
    switch ((net.minecraft.client.renderer.WorldRenderer$2.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(this.f)).a__aJ())).ordinal()]) {
case 1:
{
        break forest_join_27;
    }
case 2:
case 3:
{
        break forest_join_78;
    }
case 4:
case 5:
{
        break forest_join_121;
    }
case 6:
case 7:
{
        break forest_join_160;
    }
default:
{
        break forest_join_232;
    }
}
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life7_19)), ((float)((((float) p0) / 0x1.fep7f))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + 4))), ((float)((((float) p1) / 0x1.fep7f))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + __sourceIntrinsic_cc22218cbc26_invokedynamic889_17(422, (6151621257009996720L ^ life5_3))))), ((float)((((float) p2) / 0x1.fep7f))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + __sourceIntrinsic_cc22218cbc26_invokedynamic889_20(19750, (176153503574257471L ^ life5_3))))), ((float)((((float) p3) / 0x1.fep7f))));
    break forest_join_232;
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life7_19)), ((float)(((float) p0))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + 4))), ((float)(((float) p1))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + __sourceIntrinsic_cc22218cbc26_invokedynamic889_27(422, (6151621257009996720L ^ life5_3))))), ((float)(((float) p2))));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life7_19 + __sourceIntrinsic_cc22218cbc26_invokedynamic889_30(7532, (4177503724327419773L ^ life5_3))))), ((float)(((float) p3))));
    break forest_join_232;
    }
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)(life7_19)), ((short)(((short) p0))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life7_19 + 2))), ((short)(((short) p1))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life7_19 + 4))), ((short)(((short) p2))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life7_19 + __sourceIntrinsic_cc22218cbc26_invokedynamic889_39(322, (7726085645171860318L ^ life5_3))))), ((short)(((short) p3))));
    break forest_join_232;
    }
    if (!((java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN))) {
        break forest_join_198;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life7_19)), ((byte)(((byte) p0))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 1))), ((byte)(((byte) p1))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 2))), ((byte)(((byte) p2))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 3))), ((byte)(((byte) p3))));
    break forest_join_232;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life7_19)), ((byte)(((byte) p3))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 1))), ((byte)(((byte) p2))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 2))), ((byte)(((byte) p1))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life7_19 + 3))), ((byte)(((byte) p0))));
    }
    ((moom.lw)(this)).d__Void();
    }
    return this;
}


public moom.lw a(float p0, float p1, float p2, float p3) {
return ((moom.lw)(this)).a(((int)(((int) (p0 * 0x1.fep7f)))), ((int)(((int) (p1 * 0x1.fep7f)))), ((int)(((int) (p2 * 0x1.fep7f)))), ((int)(((int) (p3 * 0x1.fep7f)))));
}


public moom.lw a(float p0, float p1, float p2) {
long life4_3;
    int life6_16;
    forest_join_186: {
    forest_join_134: {
    forest_join_81: {
    forest_join_51: {
    forest_join_24: {
    life4_3 = (moom.lw.A ^ 40111712081697L);
    life6_16 = ((this.e * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b(((int)(this.g))));
    switch ((net.minecraft.client.renderer.WorldRenderer$2.a)[((net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType)(((moom.oF)(this.f)).a__aJ())).ordinal()]) {
case 1:
{
        break forest_join_24;
    }
case 2:
case 3:
{
        break forest_join_51;
    }
case 4:
case 5:
{
        break forest_join_81;
    }
case 6:
case 7:
{
        break forest_join_134;
    }
default:
{
        break forest_join_186;
    }
}
    }
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)(life6_16)), ((float)(p0)));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life6_16 + 4))), ((float)(p1)));
    ((java.nio.ByteBuffer)(this.a)).putFloat(((int)((life6_16 + __sourceIntrinsic_b115f464ac53_invokedynamic890_16(422, (6151559737421477479L ^ life4_3))))), ((float)(p2)));
    break forest_join_186;
    }
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)(life6_16)), ((int)(((int) p0))));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life6_16 + 4))), ((int)(((int) p1))));
    ((java.nio.ByteBuffer)(this.a)).putInt(((int)((life6_16 + __sourceIntrinsic_b115f464ac53_invokedynamic890_23(422, (6151559737421477479L ^ life4_3))))), ((int)(((int) p2))));
    break forest_join_186;
    }
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)(life6_16)), ((short)(((short) (((int) (p0 * 0x1.fffcp14f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_26(15214, (4485985367308536996L ^ life4_3)))))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life6_16 + 2))), ((short)(((short) (((int) (p1 * 0x1.fffcp14f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_29(28362, (5855201502968731918L ^ life4_3)))))));
    ((java.nio.ByteBuffer)(this.a)).putShort(((int)((life6_16 + 4))), ((short)(((short) (((int) (p2 * 0x1.fffcp14f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_32(28362, (5855201502968731918L ^ life4_3)))))));
    break forest_join_186;
    }
    ((java.nio.ByteBuffer)(this.a)).put(((int)(life6_16)), ((byte)(((byte) (((int) (p0 * 0x1.fcp6f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_35(27209, (396026859590999430L ^ life4_3)))))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life6_16 + 1))), ((byte)(((byte) (((int) (p1 * 0x1.fcp6f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_38(27209, (396026859590999430L ^ life4_3)))))));
    ((java.nio.ByteBuffer)(this.a)).put(((int)((life6_16 + 2))), ((byte)(((byte) (((int) (p2 * 0x1.fcp6f)) & __sourceIntrinsic_b115f464ac53_invokedynamic890_41(27209, (396026859590999430L ^ life4_3)))))));
    }
    ((moom.lw)(this)).d__Void();
    return this;
}


public java.nio.ByteBuffer a__ByteBuffer() {
return ((((this.x) ? 1 : 0) != 0) ? this.y : this.a);
}


public moom.oD a__oD() {
return this.m;
}


public void a(float p0, float p1, float p2, int p3) {
long life5_3;
    int life7_7;
    int life8_9;
    int life8_17;
    int life9_32;
    int life10_50;
    int life11_68;
    int life8_76;
    int life9_115;
    int life10_133;
    int life11_151;
    int life8_159;
    life5_3 = (moom.lw.A ^ 84695983320166L);
    life7_7 = ((moom.lw)(this)).a(((int)(p3)));
    life8_9 = -1;
    if ((!this.h)) {
        life8_17 = ((java.nio.IntBuffer)(this.b)).get(((int)(life7_7)));
        if ((java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN)) {
        life9_32 = ((int) (((float) (life8_17 & __sourceIntrinsic_78876794458f_invokedynamic6842_7(27209, (395913420165686977L ^ life5_3)))) * p0));
        life10_50 = ((int) (((float) ((life8_17 >> __sourceIntrinsic_78876794458f_invokedynamic6842_8(22659, (8359779694215402519L ^ life5_3))) & __sourceIntrinsic_78876794458f_invokedynamic6842_9(27209, (395913420165686977L ^ life5_3)))) * p1));
        life11_68 = ((int) (((float) ((life8_17 >> __sourceIntrinsic_78876794458f_invokedynamic6842_10(12799, (4786249236292205951L ^ life5_3))) & __sourceIntrinsic_78876794458f_invokedynamic6842_11(27209, (395913420165686977L ^ life5_3)))) * p2));
        life8_76 = (life8_17 & __sourceIntrinsic_78876794458f_invokedynamic6842_12(13710, (1783303509221734667L ^ life5_3)));
        life8_9 = (((life8_76 | (life11_68 << __sourceIntrinsic_78876794458f_invokedynamic6842_13(30995, (2144326413951939974L ^ life5_3)))) | (life10_50 << __sourceIntrinsic_78876794458f_invokedynamic6842_14(422, (6151586695498976544L ^ life5_3)))) | life9_32);
    } else {
        life9_115 = ((int) (((float) ((life8_17 >> __sourceIntrinsic_78876794458f_invokedynamic6842_15(24948, (1457790272991571454L ^ life5_3))) & __sourceIntrinsic_78876794458f_invokedynamic6842_16(27209, (395913420165686977L ^ life5_3)))) * p0));
        life10_133 = ((int) (((float) ((life8_17 >> __sourceIntrinsic_78876794458f_invokedynamic6842_17(30995, (2144326413951939974L ^ life5_3))) & __sourceIntrinsic_78876794458f_invokedynamic6842_18(27209, (395913420165686977L ^ life5_3)))) * p1));
        life11_151 = ((int) (((float) ((life8_17 >> __sourceIntrinsic_78876794458f_invokedynamic6842_19(422, (6151586695498976544L ^ life5_3))) & __sourceIntrinsic_78876794458f_invokedynamic6842_20(27209, (395913420165686977L ^ life5_3)))) * p2));
        life8_159 = (life8_17 & __sourceIntrinsic_78876794458f_invokedynamic6842_21(27209, (395913420165686977L ^ life5_3)));
        life8_9 = (((life8_159 | (life9_115 << __sourceIntrinsic_78876794458f_invokedynamic6842_22(16156, (6142621409270723466L ^ life5_3)))) | (life10_133 << __sourceIntrinsic_78876794458f_invokedynamic6842_23(30995, (2144326413951939974L ^ life5_3)))) | (life11_151 << __sourceIntrinsic_78876794458f_invokedynamic6842_24(422, (6151586695498976544L ^ life5_3))));
    }
    }
    ((java.nio.IntBuffer)(this.b)).put(((int)(life7_7)), ((int)(life8_9)));
    return;
}


public int a(int p0) {
return ((((this.e - p0) * ((moom.oD)(this.m)).d()) + ((moom.oD)(this.m)).b()) / 4);
}


private void a__Void(int p0, int p1) {
long local3 = (moom.lw.A ^ 125737715263643L);
    int local5 = ((moom.lw)(this)).a(((int)(p1)));
    int local6 = ((p0 >> __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_2(30995, (2144297123384013179L ^ local3))) & __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_3(27209, (395945631382544956L ^ local3)));
    int local7 = ((p0 >> __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_4(422, (6151614577249995229L ^ local3))) & __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_5(27209, (395945631382544956L ^ local3)));
    int local8 = (p0 & __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_6(27209, (395945631382544956L ^ local3)));
    int local9 = ((p0 >> __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_7(16156, (6142565728344078199L ^ local3))) & __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_8(27209, (395945631382544956L ^ local3)));
    ((moom.lw)(this)).a(((int)(local5)), ((int)(local6)), ((int)(local7)), ((int)(local8)), ((int)(local9)));
    return;
}


public void a(int p0, int p1, int p2, int p3, int p4) {
long local6 = (moom.lw.A ^ 117807913431900L);
    if ((java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.LITTLE_ENDIAN)) {
        ((java.nio.IntBuffer)(this.b)).put(((int)(p0)), ((int)(((((p4 << __sourceIntrinsic_07e30838a528_invokedynamic8368_4(16156, (6142592695150931120L ^ local6))) | (p3 << __sourceIntrinsic_07e30838a528_invokedynamic8368_5(30995, (2144289161672960700L ^ local6)))) | (p2 << __sourceIntrinsic_07e30838a528_invokedynamic8368_6(422, (6151624222890742298L ^ local6)))) | p1))));
    } else {
        ((java.nio.IntBuffer)(this.b)).put(((int)(p0)), ((int)(((((p1 << __sourceIntrinsic_07e30838a528_invokedynamic8368_9(16156, (6142592695150931120L ^ local6))) | (p2 << __sourceIntrinsic_07e30838a528_invokedynamic8368_10(30995, (2144289161672960700L ^ local6)))) | (p3 << __sourceIntrinsic_07e30838a528_invokedynamic8368_11(422, (6151624222890742298L ^ local6)))) | p4))));
    }
    return;
}


public void g() {
long life1_3;
    int life3_52;
    int life4_56;
    int life5_66;
    life1_3 = (moom.lw.A ^ 32272980518010L);
    if ((this.i == __sourceIntrinsic_5176b1a6fbd6_invokedynamic6843_2(21603, (3133554562626113789L ^ life1_3)))) {
        if ((this.y == null)) {
        this.y = ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((((java.nio.ByteBuffer)(this.a)).capacity() * 2))))));
    }
        if ((((java.nio.ByteBuffer)(this.y)).capacity() < (((java.nio.ByteBuffer)(this.a)).capacity() * 2))) {
        this.y = ((java.nio.ByteBuffer)(net.minecraft.client.renderer.GLAllocation.a__ByteBuffer(((int)((((java.nio.ByteBuffer)(this.a)).capacity() * 2))))));
    }
        life3_52 = ((moom.oD)(this.m)).d();
        life4_56 = ((java.nio.ByteBuffer)(this.a)).limit();
        ((java.nio.ByteBuffer)(this.a)).rewind();
        ((java.nio.ByteBuffer)(this.y)).clear();
        life5_66 = 0;
        while ((life5_66 < this.e)) {
        ((java.nio.ByteBuffer)(this.a)).limit(((int)(((life5_66 + 3) * life3_52))));
        ((java.nio.ByteBuffer)(this.a)).position(((int)((life5_66 * life3_52))));
        ((java.nio.ByteBuffer)(this.y)).put(((java.nio.ByteBuffer)(this.a)));
        ((java.nio.ByteBuffer)(this.a)).limit(((int)(((life5_66 + 1) * life3_52))));
        ((java.nio.ByteBuffer)(this.a)).position(((int)((life5_66 * life3_52))));
        ((java.nio.ByteBuffer)(this.y)).put(((java.nio.ByteBuffer)(this.a)));
        ((java.nio.ByteBuffer)(this.a)).limit(((int)((((life5_66 + 2) + 2) * life3_52))));
        ((java.nio.ByteBuffer)(this.a)).position(((int)(((life5_66 + 2) * life3_52))));
        ((java.nio.ByteBuffer)(this.y)).put(((java.nio.ByteBuffer)(this.a)));
        life5_66 += 4;
    }
        ((java.nio.ByteBuffer)(this.a)).limit(((int)(life4_56)));
        ((java.nio.ByteBuffer)(this.a)).rewind();
        ((java.nio.ByteBuffer)(this.y)).flip();
        this.x = ((boolean)(true));
    }
    return;
}


private static int lambda$sortVertexData$0(float[] p0, java.lang.Integer p1, java.lang.Integer p2) {
return com.google.common.primitives.Floats.compare(((float)((p0)[((java.lang.Integer)(p2)).intValue()])), ((float)((p0)[((java.lang.Integer)(p1)).intValue()])));
}


private static native <E extends Throwable> int __sourceIntrinsic_3e1506557cc5dad0_originalDynamicSite3082_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_675270217551_invokedynamic888_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_675270217551_invokedynamic888_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b115f464ac53_invokedynamic890_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f10c0b7b81e4_invokedynamic6829_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78876794458f_invokedynamic6842_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc22218cbc26_invokedynamic889_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc22218cbc26_invokedynamic889_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc22218cbc26_invokedynamic889_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc22218cbc26_invokedynamic889_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cc22218cbc26_invokedynamic889_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07e30838a528_invokedynamic8368_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8351_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3702253934ea_invokedynamic1243_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.Comparator __sourceIntrinsic_5eeac99566a7_invokedynamic4363_11(float[] a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic6834_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic6834_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6fc3381d0590_invokedynamic6834_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6fc3381d0590_invokedynamic6834_11(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite1553_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1be5b1d6fe8d_originalDynamicSite1550_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_acdd1fe65770_originalDynamicSite1551_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a63cd0a8780c_invokedynamic8343_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5176b1a6fbd6_invokedynamic6843_2(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
