package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mZ extends com.moon.mY {

private static com.moon.module.impl.Effects l;

private java.util.List<com.moon.mB> m;

private com.moon.module.ModuleCategory n;

private java.util.List<com.moon.module.Module> o;

private com.moon.nX p;

private int q;

private static long r;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public mZ(com.moon.module.ModuleCategory p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_b95477daa0d4fb7a(com.moon.mZ receiver, com.moon.module.ModuleCategory p0, float p1, float p2, float p3, float p4) throws Throwable {
long local6_life1 = (com.moon.mZ.r ^ 42130544368590L);
    com.moon.mZ.__sourceConstructorInit_b95477daa0d4fb7a_0(((com.moon.mZ)(receiver)));
    ((com.moon.mZ)(receiver)).m = ((java.util.List)(new java.util.ArrayList()));
    boolean __sourceSpill178_6 = com.moon.mY.c__Boolean();
    ((com.moon.mZ)(receiver)).p = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.mZ)(receiver)).n = ((com.moon.module.ModuleCategory)(p0));
    ((com.moon.mZ)(receiver)).o = ((java.util.List)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((com.moon.module.ModuleCategory)(p0)))));
    ((com.moon.mZ)(receiver)).c = ((float)(p1));
    boolean local8_life13 = __sourceSpill178_6;
    ((com.moon.mZ)(receiver)).d = ((float)(p2));
    ((com.moon.mZ)(receiver)).e = ((float)(p3));
    ((com.moon.mZ)(receiver)).f = ((float)(p4));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.mY.b(((boolean)__sourceIntrinsic_integerToBoolean(((local8_life13 ? 0 : 1)))));
    }
    return;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(-2149314505366441429L)), ((long)(4148261743088848977L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(62068486322540L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.mZ.r ^ 82655888296501L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill378_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill378_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill378_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill378_14 = new byte[8];
    (__sourceSpill378_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill378_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation378_16 = __sourceSpill378_14;
    ((javax.crypto.Cipher)(__sourceSpill378_11)).init(((int)(__sourceSpill378_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill378_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation378_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "X\025Ûx¯OÇ\024ÛÛú\025rËÏ©½yÐÂ¶"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill378_25 = local6_life21;
        int __sourceSpill378_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill378_25)).substring(((int)(__sourceSpill378_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill378_30 = local8_life19;
        int __sourceSpill378_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill378_33 = new byte[8];
        (__sourceSpill378_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill378_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill378_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill378_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill378_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill378_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill378_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill378_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill378_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill378_34)).doFinal(((byte[])(__sourceSpill378_33)));
        (__sourceSpill378_30)[__sourceSpill378_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ñÙe\0175Ý³\035ÊG\bc5Ô0"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill378_38 = local6_life21;
        int __sourceSpill378_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill378_38)).substring(((int)(__sourceSpill378_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill378_43 = local8_life19;
        int __sourceSpill378_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill378_46 = new byte[8];
        (__sourceSpill378_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill378_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill378_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill378_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill378_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill378_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill378_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill378_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill378_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill378_47)).doFinal(((byte[])(__sourceSpill378_46)));
        (__sourceSpill378_43)[__sourceSpill378_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[5]));
    l = ((com.moon.module.impl.Effects)(null));
}

private static native <E extends Throwable> void __sourceConstructorInit_b95477daa0d4fb7a_0(com.moon.mZ a0) throws E;

public void b__Void() {
((java.util.List)(this.m)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite509_1())));
    super.b__Void();
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(int p0, int p1, int p2) {
boolean spill209_0;
    long life4_3;
    java.util.Iterator life7_8;
    int life6_9;
    com.moon.mB life8_16;
    lexical_join_35: {
    lexical_join_26: {
    life4_3 = (com.moon.mZ.r ^ 87307463194911L);
    spill209_0 = com.moon.mY.c__Boolean();
    life7_8 = ((java.util.List)(this.m)).iterator();
    life6_9 = ((spill209_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_26;
    }
    life8_16 = ((com.moon.mB)(((java.util.Iterator)(life7_8)).next()));
    ((com.moon.mB)(life8_16)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_9 != 0))) {
        break lexical_join_35;
    }
    if (!((life6_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    ((com.moon.mZ)(this)).a(((boolean)(false)));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


private void e__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local1)).a(((com.moon.iX)(com.moon.i1.a(((float)((this.c - 0x1.8p0f))), ((float)((this.d - 0x1.8p0f))), ((float)((this.e + 0x1.8p1f))), ((float)((this.f + 0x1.8p1f))), ((float)(0x1.4p3f)), ((float)(0x1.0p0f)), ((int)(((com.v)(this.j)).q()))))));
    ((com.moon.hW)(local1)).b();
    return;
}


public void c__Void() {
int lexicalValue210_29_0;
    com.moon.module.impl.Effects lexicalValue210_41_0;
    int lexicalValue210_43_0;
    int lexicalValue210_48_0;
    boolean spill210_0;
    boolean spill210_1;
    com.moon.module.impl.Effects spill210_2;
    long life1_3;
    int life4_7;
    java.util.Iterator life5_12;
    int life3_13;
    com.moon.mB life6_20;
    lexical_join_52: {
    lexical_join_49: {
    lexical_join_48: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_41: {
    lexical_join_32: {
    life1_3 = (com.moon.mZ.r ^ 76787660830588L);
    ((com.moon.mZ)(this)).d__Void();
    life4_7 = 0;
    spill210_0 = com.moon.mY.b__Boolean();
    life5_12 = ((java.util.List)(this.m)).iterator();
    life3_13 = ((spill210_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life5_12)).hasNext())) {
        break lexical_join_32;
    }
    life6_20 = ((com.moon.mB)(((java.util.Iterator)(life5_12)).next()));
    spill210_1 = ((com.moon.mB)(life6_20)).f__Boolean();
    if (!((life3_13 == 0))) {
        lexicalValue210_43_0 = ((spill210_1) ? 1 : 0);
        break lexical_join_43;
    }
    if (!((life3_13 == 0))) {
        lexicalValue210_29_0 = ((spill210_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill210_1)) {
        break lexical_join_30;
    }
    lexicalValue210_29_0 = 1;
    }
    life4_7 = lexicalValue210_29_0;
    }
    if (!((life3_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    spill210_2 = com.moon.mZ.l;
    if (!((life3_13 == 0))) {
        lexicalValue210_41_0 = spill210_2;
        break lexical_join_41;
    }
    if (!((spill210_2 == null))) {
        break lexical_join_42;
    }
    lexicalValue210_41_0 = ((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))));
    }
    l = ((com.moon.module.impl.Effects)(lexicalValue210_41_0));
    }
    lexicalValue210_43_0 = life4_7;
    }
    if (!((life3_13 == 0))) {
        lexicalValue210_48_0 = lexicalValue210_43_0;
        break lexical_join_48;
    }
    if (!((lexicalValue210_43_0 == 0))) {
        break lexical_join_49;
    }
    lexicalValue210_48_0 = ((((com.moon.mZ)(this)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue210_48_0 != 0))) {
        break lexical_join_52;
    }
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(com.moon.mZ.l)).a__gW())).c();
    }
    return;
}


private void h() {
int forwardValue758_13_0;
    int forwardValue758_17_0;
    int forwardValue758_19_0;
    com.moon.mZ forwardValue758_32_0;
    int forwardValue758_32_1;
    int forwardValue758_32_2;
    com.moon.mZ forwardValue758_33_0;
    int forwardValue758_33_1;
    com.moon.mZ forwardValue758_38_0;
    int forwardValue758_38_1;
    int forwardValue758_38_2;
    boolean spill758_0;
    int spill758_1;
    com.moon.mZ spill758_2;
    int spill758_3;
    int spill758_4;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_25;
    forward_join_40: {
    forward_join_38: {
    forward_join_33: {
    forward_join_32: {
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (com.moon.mZ.r ^ 135787864677310L);
    spill758_0 = com.moon.mY.c__Boolean();
    life4_6 = org.lwjgl.input.Mouse.getDWheel();
    life3_7 = ((spill758_0) ? 1 : 0);
    spill758_1 = life4_6;
    if (!((life3_7 != 0))) {
        forwardValue758_13_0 = spill758_1;
        break forward_join_13;
    }
    if (!((spill758_1 != 0))) {
        break forward_join_40;
    }
    forwardValue758_13_0 = life4_6;
    }
    if (!((life3_7 != 0))) {
        forwardValue758_17_0 = forwardValue758_13_0;
        break forward_join_17;
    }
    if (!((forwardValue758_13_0 > 0))) {
        break forward_join_18;
    }
    forwardValue758_17_0 = 1;
    }
    forwardValue758_19_0 = forwardValue758_17_0;
    break forward_join_19;
    }
    forwardValue758_19_0 = 0;
    }
    life5_25 = forwardValue758_19_0;
    com.moon.mZ __stackOp758_4_0 = this;
    spill758_2 = __stackOp758_4_0;
    spill758_3 = ((com.moon.mZ)(__stackOp758_4_0)).q;
    spill758_4 = life5_25;
    if (!((life3_7 != 0))) {
        forwardValue758_32_0 = spill758_2;
        forwardValue758_32_1 = spill758_3;
        forwardValue758_32_2 = spill758_4;
        break forward_join_32;
    }
    if (!((spill758_4 != 0))) {
        forwardValue758_33_0 = spill758_2;
        forwardValue758_33_1 = spill758_3;
        break forward_join_33;
    }
    forwardValue758_32_0 = spill758_2;
    forwardValue758_32_1 = spill758_3;
    forwardValue758_32_2 = __sourceIntrinsic_a33ceaa00d22_invokedynamic758_6(28808, (4343132495845846437L ^ life1_3));
    }
    forwardValue758_38_0 = forwardValue758_32_0;
    forwardValue758_38_1 = forwardValue758_32_1;
    forwardValue758_38_2 = forwardValue758_32_2;
    break forward_join_38;
    }
    forwardValue758_38_0 = forwardValue758_33_0;
    forwardValue758_38_1 = forwardValue758_33_1;
    forwardValue758_38_2 = __sourceIntrinsic_a33ceaa00d22_invokedynamic758_7(7897, (2727369073761223666L ^ life1_3));
    }
    ((com.moon.mZ)(forwardValue758_38_0)).q = ((int)((forwardValue758_38_1 + forwardValue758_38_2)));
    }
    return;
}


private void f__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    java.lang.Object local2 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    java.lang.Object local3 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(local1))))).a();
    ((com.moon.jm)(local1)).a(((com.moon.hW)(local3)), ((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).c())), ((float)(0x1.cp3f)), ((float)((((this.c + this.e) - ((com.moon.jm)(local1)).a(((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).c())), ((float)(0x1.cp3f)))) - 0x1.cp2f))), ((float)((this.d + 0x1.0p3f))), ((int)(-1)), ((boolean)(false)));
    ((com.moon.jm)(this.a)).a(((com.moon.hW)(local2)), ((java.lang.String)(((com.moon.module.ModuleCategory)(this.n)).b())), ((float)(0x1.8p3f)), ((float)((this.c + 0x1.0p3f))), ((float)((this.d + 0x1.cp2f))), ((int)(-1)), ((boolean)(false)));
    ((com.moon.hW)(local2)).b();
    ((com.moon.hW)(local3)).b();
    return;
}


private void a(int p0, int p1, boolean p2) {
boolean spill207_0;
    long life4_3;
    java.util.Iterator life7_8;
    int life6_9;
    com.moon.mB life8_16;
    lexical_join_36: {
    lexical_join_35: {
    life4_3 = (com.moon.mZ.r ^ 31474375066550L);
    spill207_0 = com.moon.mY.b__Boolean();
    life7_8 = ((java.util.List)(this.m)).iterator();
    life6_9 = ((spill207_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_33: {
    lexical_join_29: {
    lexical_join_27: {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_35;
    }
    life8_16 = ((com.moon.mB)(((java.util.Iterator)(life7_8)).next()));
    if (!((life6_9 == 0))) {
        break lexical_join_36;
    }
    if (!((life6_9 == 0))) {
        break lexical_join_27;
    }
    if (!(p2)) {
        break lexical_join_29;
    }
    ((com.moon.mB)(life8_16)).b(((int)(p0)), ((int)(p1)));
    }
    if (!((life6_9 != 0))) {
        break lexical_join_33;
    }
    }
    ((com.moon.mB)(life8_16)).a(((int)(p0)), ((int)(p1)));
    }
    if (!((life6_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    moom.kZ.l();
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_5010d572f264b8(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12289;
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
            throw new RuntimeException("com/moon/mZ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


public com.moon.nX a__sourceReturn_ef529cc2e6() {
return this.p;
}


public java.util.List<com.moon.module.Module> a__List() {
return this.o;
}


public void a(int p0, int p1, int p2) {
com.moon.mZ lexicalValue206_64_0;
    int lexicalValue206_64_1;
    int lexicalValue206_64_2;
    boolean spill206_0;
    com.moon.mZ spill206_1;
    int spill206_2;
    int spill206_3;
    long life4_3;
    java.util.Iterator life7_8;
    int life6_9;
    com.moon.mB life8_16;
    lexical_join_66: {
    lexical_join_64: {
    lexical_join_61: {
    lexical_join_27: {
    life4_3 = (com.moon.mZ.r ^ 15800877898261L);
    spill206_0 = com.moon.mY.b__Boolean();
    life7_8 = ((java.util.List)(this.m)).iterator();
    life6_9 = ((spill206_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_27;
    }
    life8_16 = ((com.moon.mB)(((java.util.Iterator)(life7_8)).next()));
    ((com.moon.mB)(life8_16)).a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)));
    if (!((life6_9 == 0))) {
        break lexical_join_66;
    }
    if (!((life6_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    spill206_1 = this;
    spill206_2 = p0;
    spill206_3 = p1;
    if (!((life6_9 == 0))) {
        lexicalValue206_64_0 = spill206_1;
        lexicalValue206_64_1 = spill206_2;
        lexicalValue206_64_2 = spill206_3;
        break lexical_join_64;
    }
    if (!(((com.moon.mZ)(spill206_1)).a(((int)(spill206_2)), ((int)(spill206_3)), ((float)(this.c)), ((float)(this.d)), ((float)(this.e)), ((float)(0x1.9p4f))))) {
        break lexical_join_61;
    }
    ((com.moon.mZ)(this)).a(((boolean)(true)));
    ((com.moon.mZ)(this)).e(((float)((this.c - ((float) p0)))));
    ((com.moon.mZ)(this)).f(((float)((this.d - ((float) p1)))));
    }
    lexicalValue206_64_0 = this;
    lexicalValue206_64_1 = p0;
    lexicalValue206_64_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call206_18(lexicalValue206_64_0, lexicalValue206_64_1, lexicalValue206_64_2, p2);
    }
    return;
}


public void a(com.moon.ej p0, float p1) {
((com.moon.mZ)(this)).d__Void();
    com.moon.hW local3_life5 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local3_life5)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.c)), ((float)(this.d)), ((float)(this.e)), ((float)((this.f + 0x1.0000000000000p-1F))), ((float)(0x1.4000000000000p+3F)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.j)).x()))).a(((float)(0x1.8000000000000p-1F))))).getRGB()))))));
    ((com.moon.hW)(local3_life5)).b();
    return;
}


public void a(int p0, int p1) {
int forwardValue749_72_0;
    int forwardValue749_76_0;
    int forwardValue749_78_0;
    com.moon.nX forwardValue749_104_0;
    int forwardValue749_104_1;
    com.moon.nX forwardValue749_106_0;
    com.moon.nX forwardValue749_107_0;
    float forwardValue749_107_1;
    boolean spill749_0;
    boolean spill749_1;
    com.moon.nX spill749_2;
    int spill749_3;
    long life3_3;
    moom.ir life6_7;
    int life5_29;
    int life7_87;
    forward_join_118: {
    forward_join_107: {
    forward_join_106: {
    forward_join_104: {
    forward_join_78: {
    forward_join_77: {
    forward_join_76: {
    forward_join_72: {
    forward_join_58: {
    life3_3 = (com.moon.mZ.r ^ 32411639151025L);
    ((com.moon.mZ)(this)).d__Void();
    life6_7 = com.moon.nS.a();
    ((com.moon.mZ)(this)).g__Void();
    ((com.moon.mZ)(this)).a__sourceReturn_f633c984d8(((boolean)(true)));
    ((com.moon.mZ)(this)).f__sourceReturn_da8c82d5d4();
    com.moon.nU.a(((boolean)(false)));
    ((com.moon.mZ)(this)).a__sourceReturn_f633c984d8(((boolean)(false)));
    com.moon.nU.b(((boolean)(true)));
    ((com.moon.mZ)(this)).a(((int)(p0)), ((int)(p1)), ((boolean)(false)));
    spill749_0 = com.moon.mY.b__Boolean();
    com.moon.nU.a();
    life5_29 = ((spill749_0) ? 1 : 0);
    ((com.moon.mZ)(this)).e__sourceReturn_da8c82d5d4();
    ((com.moon.mZ)(this)).a(((int)(p0)), ((int)(p1)), ((boolean)(true)));
    spill749_1 = ((com.moon.mZ)(this)).a(((int)(p0)), ((int)(p1)), ((float)(this.c)), ((float)((this.d + 0x1.9p4f))), ((float)(this.e)), ((float)((this.f - 0x1.9p5f))));
    if (!((life5_29 == 0))) {
        forwardValue749_72_0 = ((spill749_1) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill749_1)) {
        break forward_join_58;
    }
    ((com.moon.mZ)(this)).h();
    }
    forwardValue749_72_0 = recovery.source.CarrierOps.fcmpl(((float)((((com.moon.mZ)(this)).g() + 0x1.9p4f))), ((float)(((float) (((moom.ir)(life6_7)).b__Int() - __sourceIntrinsic_fd0ba049c90e_invokedynamic749_24(2760, (503802667080037864L ^ life3_3)))))));
    }
    if (!((life5_29 == 0))) {
        forwardValue749_76_0 = forwardValue749_72_0;
        break forward_join_76;
    }
    if (!((forwardValue749_72_0 > 0))) {
        break forward_join_77;
    }
    forwardValue749_76_0 = 1;
    }
    forwardValue749_78_0 = forwardValue749_76_0;
    break forward_join_78;
    }
    forwardValue749_78_0 = 0;
    }
    life7_87 = forwardValue749_78_0;
    this.q = ((int)(moom.Dr.a(((int)(this.q)), ((int)(java.lang.Math.min(((int)(((int) (((-((com.moon.mZ)(this)).g()) + ((com.moon.mZ)(this)).d()) - 0x1.9p4f)))), ((int)(0))))), ((int)(0)))));
    spill749_2 = this.p;
    spill749_3 = life7_87;
    if (!((life5_29 == 0))) {
        forwardValue749_104_0 = spill749_2;
        forwardValue749_104_1 = spill749_3;
        break forward_join_104;
    }
    if (!((spill749_3 != 0))) {
        forwardValue749_106_0 = spill749_2;
        break forward_join_106;
    }
    forwardValue749_104_0 = spill749_2;
    forwardValue749_104_1 = this.q;
    }
    forwardValue749_107_0 = forwardValue749_104_0;
    forwardValue749_107_1 = ((float) forwardValue749_104_1);
    break forward_join_107;
    }
    forwardValue749_107_0 = forwardValue749_106_0;
    forwardValue749_107_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(forwardValue749_107_0)).a(((float)(forwardValue749_107_1)), ((double)(0x1.99999ap-2d)));
    super.a(((int)(p0)), ((int)(p1)));
    if (!((life5_29 != 0))) {
        break forward_join_118;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[1])));
    }
    return;
}


public void a__Void() {
com.moon.mB lexicalValue208_75_0;
    int lexicalValue208_75_1;
    com.moon.mB lexicalValue208_76_0;
    com.moon.mB lexicalValue208_77_0;
    int lexicalValue208_77_1;
    boolean spill208_0;
    com.moon.mB spill208_1;
    int spill208_2;
    com.moon.mB spill208_3;
    long life1_3;
    float life4_14;
    java.util.Iterator life5_18;
    int life3_19;
    com.moon.module.Module life6_26;
    com.moon.mB life7_42;
    lexical_join_93: {
    lexical_join_88: {
    life1_3 = (com.moon.mZ.r ^ 80499459654710L);
    ((com.moon.mZ)(this)).d__Void();
    ((java.util.List)(this.m)).clear();
    spill208_0 = com.moon.mY.b__Boolean();
    life4_14 = (__sourceExactCall_dad646ca7a07b3(((com.moon.mZ)(this))) + 0x1.ep4f);
    life5_18 = ((java.util.List)(this.o)).iterator();
    life3_19 = ((spill208_0) ? 1 : 0);
    lexical_cycle_20: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_75: {
    if (!(((java.util.Iterator)(life5_18)).hasNext())) {
        break lexical_join_88;
    }
    life6_26 = ((com.moon.module.Module)(((java.util.Iterator)(life5_18)).next()));
    life7_42 = new com.moon.mB(life6_26, this, (((com.moon.mZ)(this)).a() + 0x1.4p2f), life4_14, (this.e - 0x1.4p3f), 0x1.6p4f);
    ((com.moon.mB)(life7_42)).a(((com.moon.module.impl.ClickGUI)(this.b)));
    spill208_1 = life7_42;
    spill208_2 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(this.b)).a__kX())).getValue())))).intValue();
    if (!((life3_19 == 0))) {
        lexicalValue208_75_0 = spill208_1;
        lexicalValue208_75_1 = spill208_2;
        break lexical_join_75;
    }
    ((com.moon.mB)(spill208_1)).a(((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(spill208_2))))));
    __sourceExactCall_191ecc1a5dc1f7(((java.util.List)(this.m)), ((java.lang.Object)(life7_42)));
    if (!((life3_19 == 0))) {
        break lexical_join_93;
    }
    spill208_3 = life7_42;
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ClickGUI)(this.b)).d__kY())).getValue() == com.moon.bP.ROUNDED))) {
        lexicalValue208_76_0 = spill208_3;
        break lexical_join_76;
    }
    lexicalValue208_75_0 = spill208_3;
    lexicalValue208_75_1 = 1;
    }
    lexicalValue208_77_0 = lexicalValue208_75_0;
    lexicalValue208_77_1 = lexicalValue208_75_1;
    break lexical_join_77;
    }
    lexicalValue208_77_0 = lexicalValue208_76_0;
    lexicalValue208_77_1 = 0;
    }
    ((com.moon.mB)(lexicalValue208_77_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue208_77_1))));
    ((com.moon.mB)(life7_42)).a__Void();
    life4_14 = (life4_14 + ((com.moon.mB)(life7_42)).e());
    if (!((life3_19 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    ((java.util.List)(this.m)).sort(((java.util.Comparator)(java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_b82a5b29b709_invokedynamic208_33()))))));
    }
    return;
}


private void a__sourceReturn_f633c984d8(boolean p0) {
long life2_3;
    int life4_11;
    com.moon.hW life5_16;
    com.moon.i3 life6_56;
    life2_3 = (com.moon.mZ.r ^ 23881189754466L);
    ((com.moon.mZ)(this)).d__Void();
    life4_11 = __sourceIntrinsic_de95174e7612_invokedynamic752_2(23348, (2030071454464809926L ^ life2_3));
    life5_16 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    if (p0) {
        ((com.moon.hW)(life5_16)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.c)), ((float)(this.d)), ((float)(this.e)), ((float)((this.f + 0x1.0p-1f))), ((float)(0x1.4p3f)), ((int)(((com.v)(this.j)).q()))))));
    }
    life6_56 = com.moon.i3.a(((float)(this.c)), ((float)((this.d + 0x1.9p4f))), ((float)(this.e)), ((float)((this.f - 0x1.9p4f))), ((float)(0x1.4p3f)), ((int)(((com.v)(this.j)).q())));
    ((com.moon.i3)(life6_56)).e(((boolean)(false)));
    ((com.moon.i3)(life6_56)).a(((boolean)(false)));
    ((com.moon.i3)(life6_56)).b(((boolean)(false)));
    ((com.moon.hW)(life5_16)).a(((com.moon.iX)(life6_56)));
    ((com.moon.hW)(life5_16)).b();
    return;
}


public void a(char p0, int p1) {
boolean spill205_0;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    com.moon.mB life7_16;
    lexical_join_23: {
    life3_3 = (com.moon.mZ.r ^ 128378735121485L);
    spill205_0 = com.moon.mY.c__Boolean();
    life6_8 = ((java.util.List)(this.m)).iterator();
    life5_9 = ((spill205_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_23;
    }
    life7_16 = ((com.moon.mB)(((java.util.Iterator)(life6_8)).next()));
    ((com.moon.mB)(life7_16)).a(((char)(p0)), ((int)(p1)));
    if (!((life5_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2269_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mZ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void g__Void() {
int lexicalValue212_33_0;
    int lexicalValue212_39_0;
    int lexicalValue212_41_0;
    com.moon.mB lexicalValue212_78_0;
    float lexicalValue212_78_1;
    com.moon.mB lexicalValue212_79_0;
    com.moon.mB lexicalValue212_81_0;
    float lexicalValue212_81_1;
    com.moon.mB lexicalValue212_102_0;
    int lexicalValue212_102_1;
    com.moon.mB lexicalValue212_103_0;
    com.moon.mB lexicalValue212_104_0;
    int lexicalValue212_104_1;
    boolean spill212_0;
    int spill212_1;
    com.moon.mB spill212_2;
    float spill212_3;
    com.moon.mB spill212_4;
    com.moon.mB spill212_5;
    int spill212_6;
    long life1_3;
    moom.ir life4_5;
    float life5_10;
    float life6_19;
    float life7_22;
    int life3_23;
    int life8_35;
    int life9_46;
    java.util.Iterator life10_56;
    com.moon.mB life11_63;
    lexical_join_140: {
    lexical_join_124: {
    lexical_join_48: {
    lexical_join_41: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_33: {
    lexical_join_32: {
    life1_3 = (com.moon.mZ.r ^ 88845582882793L);
    life4_5 = com.moon.nS.a();
    life5_10 = (((com.moon.mZ)(this)).a() + 0x1.8p1f);
    life6_19 = ((((com.moon.mZ)(this)).b() + 0x1.9p4f) + ((com.moon.nX)(this.p)).b());
    spill212_0 = com.moon.mY.c__Boolean();
    life7_22 = 0x0.0p0f;
    life3_23 = ((spill212_0) ? 1 : 0);
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ClickGUI)(this.b)).d__kY())).getValue() == com.moon.bP.ROUNDED))) {
        break lexical_join_32;
    }
    lexicalValue212_33_0 = 1;
    break lexical_join_33;
    }
    lexicalValue212_33_0 = 0;
    }
    life8_35 = lexicalValue212_33_0;
    spill212_1 = life8_35;
    if (!((life3_23 != 0))) {
        lexicalValue212_39_0 = spill212_1;
        break lexical_join_39;
    }
    if (!((spill212_1 != 0))) {
        break lexical_join_40;
    }
    lexicalValue212_39_0 = 4;
    }
    lexicalValue212_41_0 = lexicalValue212_39_0;
    break lexical_join_41;
    }
    lexicalValue212_41_0 = 0;
    }
    life9_46 = lexicalValue212_41_0;
    if (!((life8_35 == 0))) {
        break lexical_join_48;
    }
    life5_10 = (life5_10 - 0x1.8p1f);
    }
    life10_56 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_52: while (true) {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_78: {
    if (!(((java.util.Iterator)(life10_56)).hasNext())) {
        break lexical_join_124;
    }
    life11_63 = ((com.moon.mB)(((java.util.Iterator)(life10_56)).next()));
    ((com.moon.mB)(life11_63)).a(((float)(life5_10)));
    spill212_2 = life11_63;
    spill212_3 = life6_19;
    if (!((life3_23 != 0))) {
        lexicalValue212_78_0 = spill212_2;
        lexicalValue212_78_1 = spill212_3;
        break lexical_join_78;
    }
    ((com.moon.mB)(spill212_2)).b(((float)(spill212_3)));
    if (!((life3_23 != 0))) {
        break lexical_join_140;
    }
    spill212_4 = life11_63;
    if (!((life8_35 != 0))) {
        lexicalValue212_79_0 = spill212_4;
        break lexical_join_79;
    }
    lexicalValue212_78_0 = spill212_4;
    lexicalValue212_78_1 = (this.e - 0x1.8p2f);
    }
    lexicalValue212_81_0 = lexicalValue212_78_0;
    lexicalValue212_81_1 = lexicalValue212_78_1;
    break lexical_join_81;
    }
    lexicalValue212_81_0 = lexicalValue212_79_0;
    lexicalValue212_81_1 = this.e;
    }
    ((com.moon.mB)(lexicalValue212_81_0)).c(((float)(lexicalValue212_81_1)));
    ((com.moon.mB)(life11_63)).b(((boolean)__sourceIntrinsic_integerToBoolean((life8_35))));
    spill212_5 = life11_63;
    spill212_6 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nI.a(((double)(((double) ((com.moon.nX)(this.p)).b()))), ((int)(2))))), ((double)(((double) this.q))));
    if (!((life3_23 != 0))) {
        lexicalValue212_102_0 = spill212_5;
        lexicalValue212_102_1 = spill212_6;
        break lexical_join_102;
    }
    if (!((spill212_6 != 0))) {
        lexicalValue212_103_0 = spill212_5;
        break lexical_join_103;
    }
    lexicalValue212_102_0 = spill212_5;
    lexicalValue212_102_1 = 1;
    }
    lexicalValue212_104_0 = lexicalValue212_102_0;
    lexicalValue212_104_1 = lexicalValue212_102_1;
    break lexical_join_104;
    }
    lexicalValue212_104_0 = lexicalValue212_103_0;
    lexicalValue212_104_1 = 0;
    }
    ((com.moon.mB)(lexicalValue212_104_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue212_104_1))));
    life6_19 = (life6_19 + (((com.moon.mB)(life11_63)).e() + ((float) life9_46)));
    life7_22 = (life7_22 + (((com.moon.mB)(life11_63)).e() + ((float) life9_46)));
    if (!((life3_23 == 0))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    ((com.moon.mZ)(this)).d(((float)(java.lang.Math.min(((float)((0x1.ap4f + life7_22))), ((float)(((float) (((moom.ir)(life4_5)).b__Int() - __sourceIntrinsic_736a66cda11e_invokedynamic212_32(25610, (5862883348430812529L ^ life1_3))))))))));
    }
    return;
}


private float g() {
int lexicalValue211_19_0;
    float lexicalValue211_41_0;
    float lexicalValue211_41_1;
    int lexicalValue211_41_2;
    float lexicalValue211_42_0;
    float lexicalValue211_42_1;
    float lexicalValue211_43_0;
    float lexicalValue211_43_1;
    int lexicalValue211_43_2;
    float lexicalValue211_50_0;
    boolean spill211_0;
    float spill211_1;
    float spill211_2;
    int spill211_3;
    long life1_3;
    float life4_8;
    int life3_9;
    int life5_21;
    java.util.Iterator life6_25;
    com.moon.mB life7_32;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_19: {
    lexical_join_18: {
    life1_3 = (com.moon.mZ.r ^ 137504048794099L);
    spill211_0 = com.moon.mY.c__Boolean();
    ((com.moon.mZ)(this)).d__Void();
    life4_8 = 0x0.0p0f;
    life3_9 = ((spill211_0) ? 1 : 0);
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ClickGUI)(this.b)).d__kY())).getValue() == com.moon.bP.ROUNDED))) {
        break lexical_join_18;
    }
    lexicalValue211_19_0 = 1;
    break lexical_join_19;
    }
    lexicalValue211_19_0 = 0;
    }
    life5_21 = lexicalValue211_19_0;
    life6_25 = ((java.util.List)(this.m)).iterator();
    lexical_cycle_24: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_41: {
    if (!(((java.util.Iterator)(life6_25)).hasNext())) {
        break lexical_join_49;
    }
    life7_32 = ((com.moon.mB)(((java.util.Iterator)(life6_25)).next()));
    spill211_1 = life4_8;
    if (!((life3_9 != 0))) {
        lexicalValue211_50_0 = spill211_1;
        break lexical_join_50;
    }
    spill211_2 = ((com.moon.mB)(life7_32)).e();
    spill211_3 = life5_21;
    if (!((life3_9 != 0))) {
        lexicalValue211_41_0 = spill211_1;
        lexicalValue211_41_1 = spill211_2;
        lexicalValue211_41_2 = spill211_3;
        break lexical_join_41;
    }
    if (!((spill211_3 != 0))) {
        lexicalValue211_42_0 = spill211_1;
        lexicalValue211_42_1 = spill211_2;
        break lexical_join_42;
    }
    lexicalValue211_41_0 = spill211_1;
    lexicalValue211_41_1 = spill211_2;
    lexicalValue211_41_2 = 5;
    }
    lexicalValue211_43_0 = lexicalValue211_41_0;
    lexicalValue211_43_1 = lexicalValue211_41_1;
    lexicalValue211_43_2 = lexicalValue211_41_2;
    break lexical_join_43;
    }
    lexicalValue211_43_0 = lexicalValue211_42_0;
    lexicalValue211_43_1 = lexicalValue211_42_1;
    lexicalValue211_43_2 = 0;
    }
    life4_8 = (lexicalValue211_43_0 + (lexicalValue211_43_1 + ((float) lexicalValue211_43_2)));
    if (!((life3_9 == 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue211_50_0 = life4_8;
    }
    return lexicalValue211_50_0;
}


private static double lambda$init$0(com.moon.mB p0) {
java.lang.Object local1 = ((com.moon.module.Module)(((com.moon.mB)(p0)).a__k7())).getDisplayText();
    return ((double) ((java.lang.String)(local1)).charAt(((int)(0))));
}


private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic749_24(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call206_18(com.moon.mZ a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2269_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_de95174e7612_invokedynamic752_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_b82a5b29b709_invokedynamic208_33() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_9bf881b104f5_originalDynamicSite509_1() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic212_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic758_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a33ceaa00d22_invokedynamic758_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_5010d572f264b8(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native float __sourceExactCall_dad646ca7a07b3(com.moon.mZ p0);

private static native com.v __sourceExactCall_f61d11b8decb1d(int p0);

private static native boolean __sourceExactCall_191ecc1a5dc1f7(java.util.List p0, java.lang.Object p1);
}
