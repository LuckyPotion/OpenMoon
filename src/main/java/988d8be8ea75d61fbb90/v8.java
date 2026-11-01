package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class v8 {

public java.util.List<net.minecraft.item.ItemStack> a;

public java.util.List<moom.wB> b;

public int c;

private short d;

private int e;

private int f;

private final java.util.Set<moom.wB> g;

protected java.util.List<net.minecraft.inventory.ICrafting> h;

private final java.util.Set<net.minecraft.entity.player.EntityPlayer> i;

private static net.minecraft.entity.Entity[] j;

private static final long t;

private static final long[] v;

private static final java.lang.Integer[] w;

private static final java.util.Map x;

public v8() {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.e = -1;
    this.g = com.google.common.collect.Sets.newHashSet();
    this.h = com.google.common.collect.Lists.newArrayList();
    this.i = com.google.common.collect.Sets.newHashSet();
}


static {
t = ((long)(((moom._a)(moom._c.a(((long)(-4101867427134456859L)), ((long)(-946022875668558783L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(249204729891713L)))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill1068_7 = null;
    long local0_life8 = (moom.v8.t ^ 41907180631249L);
    moom.v8.b(((net.minecraft.entity.Entity[])(__sourceSpill1068_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1068_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1068_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1068_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1068_16 = new byte[8];
    (__sourceSpill1068_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1068_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1068_18 = __sourceSpill1068_16;
    ((javax.crypto.Cipher)(__sourceSpill1068_13)).init(((int)(__sourceSpill1068_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1068_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1068_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[3];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "b8F>òØDSÞüÖïû(°/ÁJ"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1068_27 = local6_life23;
        int __sourceSpill1068_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1068_27)).substring(((int)(__sourceSpill1068_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1068_32 = local8_life21;
        int __sourceSpill1068_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1068_35 = new byte[8];
        (__sourceSpill1068_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1068_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1068_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1068_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1068_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1068_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1068_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1068_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1068_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1068_36)).doFinal(((byte[])(__sourceSpill1068_35)));
        (__sourceSpill1068_32)[__sourceSpill1068_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    v = ((long[])(local8_life21));
    w = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public abstract boolean b(net.minecraft.entity.player.EntityPlayer p0);

public static net.minecraft.entity.Entity[] b__Arrayr3() {
return moom.v8.j;
}


public static void b(net.minecraft.entity.Entity[] p0) {
moom.v8.j = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static int b(int p0) {
return (p0 & 3);
}


protected void b() {
this.f = ((int)(0));
    ((java.util.Set)(this.g)).clear();
    return;
}


public void b(net.minecraft.inventory.ICrafting p0) {
((java.util.List)(this.h)).remove(((java.lang.Object)(p0)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9425_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/v8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int a(int p0, int p1) {
return ((p0 & 3) | ((p1 & 3) << 2));
}


public static boolean a(int p0, net.minecraft.entity.player.EntityPlayer p1) {
int forwardValue4267_23_0;
    int forwardValue4267_27_0;
    int forwardValue4267_29_0;
    int spill4267_0;
    int spill4267_1;
    int spill4267_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    life2_3 = (moom.v8.t ^ 22980907836391L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4267_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue4267_27_0 = spill4267_0;
        break forward_join_27;
    }
    if (!((spill4267_0 != 0))) {
        break forward_join_26;
    }
    spill4267_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue4267_27_0 = spill4267_1;
        break forward_join_27;
    }
    if (!((spill4267_1 != 1))) {
        break forward_join_26;
    }
    spill4267_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue4267_23_0 = spill4267_2;
        break forward_join_23;
    }
    if (!((spill4267_2 == 2))) {
        break forward_join_28;
    }
    forwardValue4267_23_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4267_27_0 = forwardValue4267_23_0;
        break forward_join_27;
    }
    if (!((forwardValue4267_23_0 != 0))) {
        break forward_join_28;
    }
    }
    forwardValue4267_27_0 = 1;
    }
    forwardValue4267_29_0 = forwardValue4267_27_0;
    break forward_join_29;
    }
    forwardValue4267_29_0 = 0;
    }
    return ((forwardValue4267_29_0) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.v8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static int a(int p0) {
return ((p0 >> 2) & 3);
}


protected boolean a(net.minecraft.item.ItemStack p0, int p1, int p2, boolean p3) {
int lexicalValue1346_20_0;
    int lexicalValue1346_38_0;
    net.minecraft.item.ItemStack lexicalValue1346_60_0;
    net.minecraft.item.ItemStack lexicalValue1346_67_0;
    int lexicalValue1346_81_0;
    int lexicalValue1346_114_0;
    int lexicalValue1346_114_1;
    int lexicalValue1346_134_0;
    int lexicalValue1346_143_0;
    int lexicalValue1346_157_0;
    int lexicalValue1346_168_0;
    int lexicalValue1346_175_0;
    int lexicalValue1346_175_1;
    net.minecraft.item.ItemStack lexicalValue1346_196_0;
    int lexicalValue1346_211_0;
    net.minecraft.entity.Entity[] spill1346_0;
    boolean spill1346_1;
    boolean spill1346_2;
    int spill1346_3;
    int spill1346_4;
    net.minecraft.item.ItemStack spill1346_5;
    boolean spill1346_6;
    int spill1346_7;
    int spill1346_8;
    int spill1346_9;
    int spill1346_10;
    boolean spill1346_11;
    int spill1346_12;
    int spill1346_13;
    int spill1346_14;
    net.minecraft.item.ItemStack spill1346_15;
    long life5_3;
    int life8_6;
    net.minecraft.entity.Entity[] life7_7;
    int life9_9;
    moom.wB life10_84;
    net.minecraft.item.ItemStack life11_87;
    int life12_146;
    int life9_234;
    moom.wB life10_280;
    net.minecraft.item.ItemStack life11_283;
    lexical_join_211: {
    lexical_join_210: {
    lexical_join_158: {
    lexical_join_157: {
    lexical_join_156: {
    lexical_join_143: {
    lexical_join_141: {
    lexical_join_20: {
    lexical_join_18: {
    life5_3 = (moom.v8.t ^ 54592814030886L);
    spill1346_0 = moom.v8.b__Arrayr3();
    life8_6 = 0;
    life7_7 = spill1346_0;
    life9_9 = p1;
    spill1346_1 = p3;
    if (!((life7_7 == null))) {
        lexicalValue1346_20_0 = ((spill1346_1) ? 1 : 0);
        break lexical_join_20;
    }
    if (!(spill1346_1)) {
        break lexical_join_18;
    }
    life9_9 = (p2 - 1);
    }
    lexicalValue1346_20_0 = ((((net.minecraft.item.ItemStack)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_143_0 = lexicalValue1346_20_0;
        break lexical_join_143;
    }
    if (!((lexicalValue1346_20_0 != 0))) {
        break lexical_join_141;
    }
    lexical_cycle_23: while (true) {
    lexical_join_139: {
    lexical_join_138: {
    lexical_join_134: {
    lexical_join_133: {
    lexical_join_114: {
    lexical_join_108: {
    lexical_join_81: {
    lexical_join_78: {
    lexical_join_67: {
    lexical_join_60: {
    lexical_join_46: {
    lexical_join_38: {
    lexical_join_37: {
    if (!((((net.minecraft.item.ItemStack)(p0)).b > 0))) {
        break lexical_join_141;
    }
    spill1346_2 = p3;
    if (!((life7_7 == null))) {
        lexicalValue1346_143_0 = ((spill1346_2) ? 1 : 0);
        break lexical_join_143;
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_38_0 = ((spill1346_2) ? 1 : 0);
        break lexical_join_38;
    }
    if (!((!spill1346_2))) {
        break lexical_join_37;
    }
    spill1346_3 = life9_9;
    if (!((life7_7 == null))) {
        lexicalValue1346_38_0 = spill1346_3;
        break lexical_join_38;
    }
    if (!((spill1346_3 >= p2))) {
        break lexical_join_46;
    }
    }
    lexicalValue1346_38_0 = ((p3) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_143_0 = lexicalValue1346_38_0;
        break lexical_join_143;
    }
    if (!((lexicalValue1346_38_0 != 0))) {
        break lexical_join_141;
    }
    spill1346_4 = life9_9;
    if (!((life7_7 == null))) {
        lexicalValue1346_143_0 = spill1346_4;
        break lexical_join_143;
    }
    if (!((spill1346_4 >= p1))) {
        break lexical_join_141;
    }
    }
    life10_84 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(life9_9)))));
    life11_87 = ((moom.wB)(life10_84)).a__xW();
    spill1346_5 = life11_87;
    if (!((life7_7 == null))) {
        lexicalValue1346_60_0 = spill1346_5;
        break lexical_join_60;
    }
    if (!((spill1346_5 != null))) {
        break lexical_join_133;
    }
    lexicalValue1346_60_0 = life11_87;
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_67_0 = lexicalValue1346_60_0;
        break lexical_join_67;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1346_60_0)).a__wQ() == ((net.minecraft.item.ItemStack)(p0)).a__wQ()))) {
        break lexical_join_133;
    }
    lexicalValue1346_67_0 = p0;
    }
    spill1346_6 = ((net.minecraft.item.ItemStack)(lexicalValue1346_67_0)).c__Boolean();
    if (!((life7_7 == null))) {
        lexicalValue1346_81_0 = ((spill1346_6) ? 1 : 0);
        break lexical_join_81;
    }
    if (!(spill1346_6)) {
        break lexical_join_78;
    }
    spill1346_7 = ((net.minecraft.item.ItemStack)(p0)).c();
    if (!((life7_7 == null))) {
        lexicalValue1346_134_0 = spill1346_7;
        break lexical_join_134;
    }
    if (!((spill1346_7 == ((net.minecraft.item.ItemStack)(life11_87)).c()))) {
        break lexical_join_133;
    }
    }
    lexicalValue1346_81_0 = ((net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(life11_87)))) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_134_0 = lexicalValue1346_81_0;
        break lexical_join_134;
    }
    if (!((lexicalValue1346_81_0 != 0))) {
        break lexical_join_133;
    }
    life12_146 = (((net.minecraft.item.ItemStack)(life11_87)).b + ((net.minecraft.item.ItemStack)(p0)).b);
    spill1346_8 = life12_146;
    spill1346_9 = ((net.minecraft.item.ItemStack)(p0)).a();
    if (!((life7_7 == null))) {
        lexicalValue1346_114_0 = spill1346_8;
        lexicalValue1346_114_1 = spill1346_9;
        break lexical_join_114;
    }
    if (!((spill1346_8 <= spill1346_9))) {
        break lexical_join_108;
    }
    ((net.minecraft.item.ItemStack)(p0)).b = ((int)(0));
    ((net.minecraft.item.ItemStack)(life11_87)).b = ((int)(life12_146));
    ((moom.wB)(life10_84)).a__Void();
    life8_6 = 1;
    if (!((life7_7 != null))) {
        break lexical_join_133;
    }
    }
    spill1346_10 = ((net.minecraft.item.ItemStack)(life11_87)).b;
    if (!((life7_7 == null))) {
        lexicalValue1346_134_0 = spill1346_10;
        break lexical_join_134;
    }
    lexicalValue1346_114_0 = spill1346_10;
    lexicalValue1346_114_1 = ((net.minecraft.item.ItemStack)(p0)).a();
    }
    if (!((lexicalValue1346_114_0 < lexicalValue1346_114_1))) {
        break lexical_join_133;
    }
    net.minecraft.item.ItemStack __stackOp1346_29_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp1346_29_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1346_29_0)).b - (((net.minecraft.item.ItemStack)(p0)).a() - ((net.minecraft.item.ItemStack)(life11_87)).b))));
    ((net.minecraft.item.ItemStack)(life11_87)).b = ((int)(((net.minecraft.item.ItemStack)(p0)).a()));
    ((moom.wB)(life10_84)).a__Void();
    life8_6 = 1;
    }
    lexicalValue1346_134_0 = ((p3) ? 1 : 0);
    }
    if (!((lexicalValue1346_134_0 != 0))) {
        break lexical_join_138;
    }
    life9_9 += -1;
    if (!((life7_7 != null))) {
        break lexical_join_139;
    }
    }
    life9_9 += 1;
    }
    if (!((life7_7 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue1346_143_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_211_0 = lexicalValue1346_143_0;
        break lexical_join_211;
    }
    if (!((lexicalValue1346_143_0 > 0))) {
        break lexical_join_210;
    }
    spill1346_11 = p3;
    if (!((life7_7 == null))) {
        lexicalValue1346_157_0 = ((spill1346_11) ? 1 : 0);
        break lexical_join_157;
    }
    if (!(spill1346_11)) {
        break lexical_join_156;
    }
    life9_234 = (p2 - 1);
    if (!((life7_7 != null))) {
        break lexical_join_158;
    }
    }
    lexicalValue1346_157_0 = p1;
    }
    life9_234 = lexicalValue1346_157_0;
    }
    lexical_cycle_158: while (true) {
    lexical_join_208: {
    lexical_join_207: {
    lexical_join_202: {
    lexical_join_196: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_168: {
    lexical_join_167: {
    if (!((!p3))) {
        break lexical_join_167;
    }
    spill1346_12 = life9_234;
    if (!((life7_7 == null))) {
        lexicalValue1346_168_0 = spill1346_12;
        break lexical_join_168;
    }
    spill1346_13 = p2;
    if (!((life7_7 == null))) {
        lexicalValue1346_175_0 = spill1346_12;
        lexicalValue1346_175_1 = spill1346_13;
        break lexical_join_175;
    }
    if (!((spill1346_12 >= spill1346_13))) {
        break lexical_join_176;
    }
    }
    lexicalValue1346_168_0 = ((p3) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        lexicalValue1346_211_0 = lexicalValue1346_168_0;
        break lexical_join_211;
    }
    if (!((lexicalValue1346_168_0 != 0))) {
        break lexical_join_210;
    }
    spill1346_14 = life9_234;
    if (!((life7_7 == null))) {
        lexicalValue1346_211_0 = spill1346_14;
        break lexical_join_211;
    }
    lexicalValue1346_175_0 = spill1346_14;
    lexicalValue1346_175_1 = p1;
    }
    if (!((lexicalValue1346_175_0 >= lexicalValue1346_175_1))) {
        break lexical_join_210;
    }
    }
    life10_280 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(life9_234)))));
    life11_283 = ((moom.wB)(life10_280)).a__xW();
    spill1346_15 = life11_283;
    if (!((life7_7 == null))) {
        lexicalValue1346_196_0 = spill1346_15;
        break lexical_join_196;
    }
    if (!((spill1346_15 == null))) {
        break lexical_join_202;
    }
    ((moom.wB)(life10_280)).b(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(p0)).a__xW())));
    ((moom.wB)(life10_280)).a__Void();
    lexicalValue1346_196_0 = p0;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1346_196_0)).b = ((int)(0));
    life8_6 = 1;
    if (!((life7_7 != null))) {
        break lexical_join_210;
    }
    }
    if (!(p3)) {
        break lexical_join_207;
    }
    life9_234 += -1;
    if (!((life7_7 != null))) {
        break lexical_join_208;
    }
    }
    life9_234 += 1;
    }
    if (!((life7_7 != null))) { continue lexical_cycle_158; }
    break lexical_cycle_158;
    }
    }
    lexicalValue1346_211_0 = life8_6;
    }
    return ((lexicalValue1346_211_0) != 0);
}


public static int a(net.minecraft.tileentity.TileEntity p0) {
int forwardValue4277_14_0;
    int forwardValue4277_16_0;
    int spill4277_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.v8.t ^ 6983577501071L);
    life3_5 = moom.v8.b__Arrayr3();
    spill4277_0 = ((p0 instanceof net.minecraft.inventory.IInventory) ? 1 : 0);
    if (!((life3_5 == null))) {
        forwardValue4277_14_0 = spill4277_0;
        break forward_join_14;
    }
    if (!((spill4277_0 != 0))) {
        break forward_join_15;
    }
    forwardValue4277_14_0 = moom.v8.a(((net.minecraft.inventory.IInventory)(((net.minecraft.inventory.IInventory)(p0)))));
    }
    forwardValue4277_16_0 = forwardValue4277_14_0;
    break forward_join_16;
    }
    forwardValue4277_16_0 = 0;
    }
    return forwardValue4277_16_0;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18985;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/v8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


public static int a(net.minecraft.inventory.IInventory p0) {
int lexicalValue1344_62_0;
    int lexicalValue1344_62_1;
    int lexicalValue1344_63_0;
    int lexicalValue1344_64_0;
    int lexicalValue1344_64_1;
    int spill1344_0;
    int spill1344_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_13;
    float life5_15;
    int life6_17;
    net.minecraft.item.ItemStack life7_25;
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_53: {
    lexical_join_47: {
    lexical_join_10: {
    life1_3 = (moom.v8.t ^ 132702231238015L);
    life3_5 = moom.v8.b__Arrayr3();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return 0;
    }
    life4_13 = 0;
    life5_15 = 0x0.0p0f;
    life6_17 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life6_17 < ((net.minecraft.inventory.IInventory)(p0)).b__Int()))) {
        break lexical_join_47;
    }
    life7_25 = ((net.minecraft.inventory.IInventory)(p0)).a__xW(((int)(life6_17)));
    if (!((life3_5 == null))) {
        break lexical_join_53;
    }
    if (!((life3_5 == null))) {
        break lexical_join_45;
    }
    if (!((life7_25 != null))) {
        break lexical_join_44;
    }
    life5_15 = (life5_15 + (((float) ((net.minecraft.item.ItemStack)(life7_25)).b) / ((float) java.lang.Math.min(((int)(((net.minecraft.inventory.IInventory)(p0)).c__Int())), ((int)(((net.minecraft.item.ItemStack)(life7_25)).a()))))));
    life4_13 += 1;
    }
    life6_17 += 1;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    life5_15 = (life5_15 / ((float) ((net.minecraft.inventory.IInventory)(p0)).b__Int()));
    }
    spill1344_0 = moom.Dr.a__Int(((float)((life5_15 * 0x1.cp3f))));
    spill1344_1 = life4_13;
    if (!((life3_5 == null))) {
        lexicalValue1344_62_0 = spill1344_0;
        lexicalValue1344_62_1 = spill1344_1;
        break lexical_join_62;
    }
    if (!((spill1344_1 > 0))) {
        lexicalValue1344_63_0 = spill1344_0;
        break lexical_join_63;
    }
    lexicalValue1344_62_0 = spill1344_0;
    lexicalValue1344_62_1 = 1;
    }
    lexicalValue1344_64_0 = lexicalValue1344_62_0;
    lexicalValue1344_64_1 = lexicalValue1344_62_1;
    break lexical_join_64;
    }
    lexicalValue1344_64_0 = lexicalValue1344_63_0;
    lexicalValue1344_64_1 = 0;
    }
    return (lexicalValue1344_64_0 + lexicalValue1344_64_1);
}


public boolean a__Boolean(moom.wB p0) {
return ((1) != 0);
}


public static void a(java.util.Set<moom.wB> p0, int p1, net.minecraft.item.ItemStack p2, int p3) {
long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forest_join_38: {
    forest_join_32: {
    forest_join_27: {
    forest_join_22: {
    forest_join_10: {
    life4_3 = (moom.v8.t ^ 38902544781537L);
    life6_5 = moom.v8.b__Arrayr3();
    if (!((life6_5 == null))) {
        break forest_join_38;
    }
    switch (p1) {
case 0:
{
        break forest_join_10;
    }
case 1:
{
        break forest_join_22;
    }
case 2:
{
        break forest_join_27;
    }
default:
{
        break forest_join_32;
    }
}
    }
    ((net.minecraft.item.ItemStack)(p2)).b = ((int)(moom.Dr.a__Int(((float)((((float) ((net.minecraft.item.ItemStack)(p2)).b) / ((float) ((java.util.Set)(p0)).size())))))));
    if (!((life6_5 != null))) {
        break forest_join_32;
    }
    }
    ((net.minecraft.item.ItemStack)(p2)).b = ((int)(1));
    if (!((life6_5 != null))) {
        break forest_join_32;
    }
    }
    ((net.minecraft.item.ItemStack)(p2)).b = ((int)(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(p2)).a__wQ())).a()));
    }
    net.minecraft.item.ItemStack __stackOp941_10_0 = p2;
    ((net.minecraft.item.ItemStack)(__stackOp941_10_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp941_10_0)).b + p3)));
    }
    return;
}


public static boolean a(moom.wB p0, net.minecraft.item.ItemStack p1, boolean p2) {
moom.wB forwardValue4269_11_0;
    int forwardValue4269_16_0;
    int forwardValue4269_18_0;
    moom.wB forwardValue4269_24_0;
    net.minecraft.item.ItemStack forwardValue4269_33_0;
    int forwardValue4269_55_0;
    int forwardValue4269_55_1;
    int forwardValue4269_55_2;
    int forwardValue4269_56_0;
    int forwardValue4269_56_1;
    int forwardValue4269_58_0;
    int forwardValue4269_58_1;
    int forwardValue4269_58_2;
    int forwardValue4269_65_0;
    int forwardValue4269_65_1;
    int forwardValue4269_66_0;
    int forwardValue4269_67_0;
    int forwardValue4269_67_1;
    int forwardValue4269_70_0;
    moom.wB spill4269_0;
    boolean spill4269_1;
    moom.wB spill4269_2;
    boolean spill4269_3;
    net.minecraft.item.ItemStack spill4269_4;
    boolean spill4269_5;
    boolean spill4269_6;
    int spill4269_7;
    int spill4269_8;
    boolean spill4269_9;
    int spill4269_10;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_24;
    forward_join_70: {
    forward_join_69: {
    forward_join_67: {
    forward_join_66: {
    forward_join_65: {
    forward_join_58: {
    forward_join_56: {
    forward_join_55: {
    forward_join_33: {
    forward_join_24: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    forward_join_11: {
    life3_3 = (moom.v8.t ^ 87009179043540L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4269_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue4269_11_0 = spill4269_0;
        break forward_join_11;
    }
    if (!((spill4269_0 != null))) {
        break forward_join_15;
    }
    forwardValue4269_11_0 = p0;
    }
    spill4269_1 = ((moom.wB)(forwardValue4269_11_0)).a__Boolean();
    if (!((life5_5 == null))) {
        forwardValue4269_16_0 = ((spill4269_1) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill4269_1))) {
        break forward_join_17;
    }
    }
    forwardValue4269_16_0 = 1;
    }
    forwardValue4269_18_0 = forwardValue4269_16_0;
    break forward_join_18;
    }
    forwardValue4269_18_0 = 0;
    }
    life6_24 = forwardValue4269_18_0;
    spill4269_2 = p0;
    if (!((life5_5 == null))) {
        forwardValue4269_24_0 = spill4269_2;
        break forward_join_24;
    }
    if (!((spill4269_2 != null))) {
        break forward_join_69;
    }
    forwardValue4269_24_0 = p0;
    }
    spill4269_3 = ((moom.wB)(forwardValue4269_24_0)).a__Boolean();
    if (!((life5_5 == null))) {
        forwardValue4269_70_0 = ((spill4269_3) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill4269_3)) {
        break forward_join_69;
    }
    spill4269_4 = p1;
    if (!((life5_5 == null))) {
        forwardValue4269_33_0 = spill4269_4;
        break forward_join_33;
    }
    if (!((spill4269_4 != null))) {
        break forward_join_69;
    }
    forwardValue4269_33_0 = p1;
    }
    spill4269_5 = ((net.minecraft.item.ItemStack)(forwardValue4269_33_0)).b(((net.minecraft.item.ItemStack)(((moom.wB)(p0)).a__xW())));
    if (!((life5_5 == null))) {
        forwardValue4269_70_0 = ((spill4269_5) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill4269_5)) {
        break forward_join_69;
    }
    spill4269_6 = net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(((moom.wB)(p0)).a__xW())), ((net.minecraft.item.ItemStack)(p1)));
    if (!((life5_5 == null))) {
        forwardValue4269_70_0 = ((spill4269_6) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill4269_6)) {
        break forward_join_69;
    }
    spill4269_7 = life6_24;
    spill4269_8 = ((net.minecraft.item.ItemStack)(((moom.wB)(p0)).a__xW())).b;
    spill4269_9 = p2;
    if (!((life5_5 == null))) {
        forwardValue4269_55_0 = spill4269_7;
        forwardValue4269_55_1 = spill4269_8;
        forwardValue4269_55_2 = ((spill4269_9) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill4269_9)) {
        forwardValue4269_56_0 = spill4269_7;
        forwardValue4269_56_1 = spill4269_8;
        break forward_join_56;
    }
    forwardValue4269_55_0 = spill4269_7;
    forwardValue4269_55_1 = spill4269_8;
    forwardValue4269_55_2 = 0;
    }
    forwardValue4269_58_0 = forwardValue4269_55_0;
    forwardValue4269_58_1 = forwardValue4269_55_1;
    forwardValue4269_58_2 = forwardValue4269_55_2;
    break forward_join_58;
    }
    forwardValue4269_58_0 = forwardValue4269_56_0;
    forwardValue4269_58_1 = forwardValue4269_56_1;
    forwardValue4269_58_2 = ((net.minecraft.item.ItemStack)(p1)).b;
    }
    spill4269_10 = (forwardValue4269_58_1 + forwardValue4269_58_2);
    if (!((life5_5 == null))) {
        forwardValue4269_65_0 = forwardValue4269_58_0;
        forwardValue4269_65_1 = spill4269_10;
        break forward_join_65;
    }
    if (!((spill4269_10 <= ((net.minecraft.item.ItemStack)(p1)).a()))) {
        forwardValue4269_66_0 = forwardValue4269_58_0;
        break forward_join_66;
    }
    forwardValue4269_65_0 = forwardValue4269_58_0;
    forwardValue4269_65_1 = 1;
    }
    forwardValue4269_67_0 = forwardValue4269_65_0;
    forwardValue4269_67_1 = forwardValue4269_65_1;
    break forward_join_67;
    }
    forwardValue4269_67_0 = forwardValue4269_66_0;
    forwardValue4269_67_1 = 0;
    }
    life6_24 = (forwardValue4269_67_0 | forwardValue4269_67_1);
    }
    forwardValue4269_70_0 = life6_24;
    }
    return ((forwardValue4269_70_0) != 0);
}


public moom.wB a(net.minecraft.inventory.IInventory p0, int p1) {
moom.wB lexicalValue1345_25_0;
    net.minecraft.entity.Entity[] spill1345_0;
    moom.wB spill1345_1;
    long life3_3;
    java.util.Iterator life6_8;
    net.minecraft.entity.Entity[] life5_9;
    moom.wB life7_16;
    lexical_join_28: {
    life3_3 = (moom.v8.t ^ 123182563668040L);
    spill1345_0 = moom.v8.b__Arrayr3();
    life6_8 = ((java.util.List)(this.b)).iterator();
    life5_9 = spill1345_0;
    lexical_cycle_10: while (true) {
    lexical_join_26: {
    lexical_join_25: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_28;
    }
    life7_16 = ((moom.wB)(((java.util.Iterator)(life6_8)).next()));
    spill1345_1 = life7_16;
    if (!((life5_9 == null))) {
        lexicalValue1345_25_0 = spill1345_1;
        break lexical_join_25;
    }
    if (!(((moom.wB)(spill1345_1)).a(((net.minecraft.inventory.IInventory)(p0)), ((int)(p1))))) {
        break lexical_join_26;
    }
    lexicalValue1345_25_0 = life7_16;
    }
    return lexicalValue1345_25_0;
    }
    if (!((life5_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}


public moom.wB a__wB(int p0) {
return ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
}


public net.minecraft.item.ItemStack a(net.minecraft.entity.player.EntityPlayer p0, int p1) {
moom.wB forwardValue4271_17_0;
    net.minecraft.item.ItemStack forwardValue4271_20_0;
    net.minecraft.entity.Entity[] spill4271_0;
    moom.wB spill4271_1;
    long life3_3;
    moom.wB life6_10;
    net.minecraft.entity.Entity[] life5_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (moom.v8.t ^ 96419717005978L);
    spill4271_0 = moom.v8.b__Arrayr3();
    life6_10 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p1)))));
    life5_11 = spill4271_0;
    spill4271_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue4271_17_0 = spill4271_1;
        break forward_join_17;
    }
    if (!((spill4271_1 != null))) {
        break forward_join_19;
    }
    forwardValue4271_17_0 = life6_10;
    }
    forwardValue4271_20_0 = ((moom.wB)(forwardValue4271_17_0)).a__xW();
    break forward_join_20;
    }
    forwardValue4271_20_0 = null;
    }
    return forwardValue4271_20_0;
}


public net.minecraft.item.ItemStack a(int p0, int p1, int p2, net.minecraft.entity.player.EntityPlayer p3) {
int forestValue512_37_0;
    int forestValue512_37_1;
    moom.v8 forestValue512_74_0;
    int forestValue512_79_0;
    moom.wB forestValue512_94_0;
    int forestValue512_105_0;
    int forestValue512_111_0;
    int forestValue512_120_0;
    int forestValue512_127_0;
    int forestValue512_135_0;
    int forestValue512_135_1;
    moom.wB forestValue512_168_0;
    int forestValue512_179_0;
    int forestValue512_185_0;
    int forestValue512_194_0;
    int forestValue512_206_0;
    int forestValue512_208_0;
    int forestValue512_232_0;
    int forestValue512_232_1;
    int forestValue512_245_0;
    int forestValue512_245_1;
    moom.v8 forestValue512_264_0;
    moom.v8 forestValue512_268_0;
    int forestValue512_273_0;
    int forestValue512_281_0;
    int forestValue512_290_0;
    int forestValue512_299_0;
    int forestValue512_324_0;
    int forestValue512_341_0;
    net.minecraft.entity.player.InventoryPlayer forestValue512_343_0;
    int forestValue512_351_0;
    int forestValue512_351_1;
    moom.wB forestValue512_367_0;
    net.minecraft.item.ItemStack forestValue512_380_0;
    net.minecraft.item.ItemStack forestValue512_392_0;
    int forestValue512_403_0;
    moom.wB forestValue512_417_0;
    net.minecraft.item.ItemStack forestValue512_428_0;
    net.minecraft.item.ItemStack forestValue512_434_0;
    int forestValue512_447_0;
    int forestValue512_449_0;
    int forestValue512_466_0;
    int forestValue512_466_1;
    int forestValue512_474_0;
    int forestValue512_499_0;
    int forestValue512_501_0;
    int forestValue512_554_0;
    int forestValue512_556_0;
    int forestValue512_582_0;
    int forestValue512_582_1;
    int forestValue512_597_0;
    net.minecraft.item.ItemStack forestValue512_602_0;
    net.minecraft.item.ItemStack forestValue512_610_0;
    int forestValue512_611_0;
    int forestValue512_614_0;
    int forestValue512_614_1;
    net.minecraft.item.ItemStack forestValue512_631_0;
    int forestValue512_638_0;
    int forestValue512_651_0;
    int forestValue512_656_0;
    int forestValue512_665_0;
    int forestValue512_684_0;
    moom.wB forestValue512_689_0;
    moom.wB forestValue512_694_0;
    int forestValue512_698_0;
    int forestValue512_698_1;
    moom.wB forestValue512_737_0;
    int forestValue512_743_0;
    int forestValue512_745_0;
    int forestValue512_762_0;
    int forestValue512_762_1;
    int forestValue512_763_0;
    int forestValue512_764_0;
    int forestValue512_764_1;
    int forestValue512_768_0;
    moom.wB forestValue512_790_0;
    int forestValue512_807_0;
    net.minecraft.item.ItemStack forestValue512_826_0;
    moom.wB forestValue512_829_0;
    net.minecraft.item.ItemStack forestValue512_829_1;
    int forestValue512_838_0;
    moom.wB forestValue512_853_0;
    net.minecraft.item.ItemStack forestValue512_853_1;
    int forestValue512_857_0;
    int forestValue512_858_0;
    int forestValue512_858_1;
    moom.wB forestValue512_885_0;
    moom.wB forestValue512_890_0;
    int forestValue512_903_0;
    int forestValue512_904_0;
    int forestValue512_904_1;
    moom.wB forestValue512_925_0;
    int forestValue512_934_0;
    moom.wB forestValue512_936_0;
    moom.wB forestValue512_941_0;
    int forestValue512_941_1;
    moom.wB forestValue512_942_0;
    moom.wB forestValue512_945_0;
    int forestValue512_945_1;
    int forestValue512_959_0;
    int forestValue512_966_0;
    int forestValue512_966_1;
    int forestValue512_968_0;
    moom.wB forestValue512_985_0;
    int forestValue512_996_0;
    int forestValue512_1004_0;
    int forestValue512_1006_0;
    int forestValue512_1012_0;
    int forestValue512_1014_0;
    int forestValue512_1019_0;
    int forestValue512_1019_1;
    int forestValue512_1039_0;
    int forestValue512_1039_1;
    java.lang.Object forestValue512_1044_0;
    int forestValue512_1093_0;
    int forestValue512_1116_0;
    int forestValue512_1116_1;
    int forestValue512_1117_0;
    net.minecraft.entity.Entity[] spill512_0;
    int spill512_1;
    int spill512_2;
    int spill512_3;
    int spill512_4;
    int spill512_5;
    int spill512_6;
    moom.v8 spill512_7;
    int spill512_8;
    moom.wB spill512_9;
    boolean spill512_10;
    moom.v8 spill512_11;
    moom.v8 spill512_12;
    moom.wB spill512_13;
    boolean spill512_14;
    boolean spill512_15;
    int spill512_16;
    int spill512_17;
    int spill512_18;
    int spill512_19;
    int spill512_20;
    int spill512_21;
    int spill512_22;
    int spill512_23;
    net.minecraft.entity.player.InventoryPlayer spill512_24;
    int spill512_25;
    moom.wB spill512_26;
    net.minecraft.item.ItemStack spill512_27;
    net.minecraft.item.ItemStack spill512_28;
    moom.wB spill512_29;
    net.minecraft.item.ItemStack spill512_30;
    net.minecraft.item.ItemStack spill512_31;
    moom.wB spill512_32;
    int spill512_33;
    int spill512_34;
    int spill512_35;
    int spill512_36;
    moom.wB spill512_37;
    int spill512_38;
    net.minecraft.item.ItemStack spill512_39;
    int spill512_40;
    int spill512_41;
    boolean spill512_42;
    int spill512_43;
    int spill512_44;
    int spill512_45;
    int spill512_46;
    net.minecraft.item.ItemStack spill512_47;
    net.minecraft.item.ItemStack spill512_48;
    int spill512_49;
    int spill512_50;
    int spill512_51;
    moom.wB spill512_52;
    int spill512_53;
    int spill512_54;
    int spill512_55;
    moom.wB spill512_56;
    boolean spill512_57;
    int spill512_58;
    int spill512_59;
    int spill512_60;
    int spill512_61;
    moom.wB spill512_62;
    net.minecraft.item.ItemStack spill512_63;
    net.minecraft.item.ItemStack spill512_64;
    int spill512_65;
    moom.wB spill512_66;
    net.minecraft.item.ItemStack spill512_67;
    boolean spill512_68;
    int spill512_69;
    moom.wB spill512_70;
    int spill512_71;
    moom.wB spill512_72;
    boolean spill512_73;
    moom.wB spill512_74;
    int spill512_75;
    moom.wB spill512_76;
    boolean spill512_77;
    boolean spill512_78;
    int spill512_79;
    int spill512_80;
    int spill512_81;
    net.minecraft.item.ItemStack spill512_82;
    boolean spill512_83;
    boolean spill512_84;
    boolean spill512_85;
    boolean spill512_86;
    int spill512_87;
    int spill512_88;
    int spill512_89;
    long life5_3;
    net.minecraft.item.ItemStack life8_6;
    net.minecraft.entity.Entity[] life7_7;
    net.minecraft.entity.player.InventoryPlayer life9_10;
    int life10_19;
    moom.wB life11_104;
    net.minecraft.item.ItemStack life11_174;
    int life12_178;
    java.util.Iterator life13_182;
    moom.wB life14_189;
    net.minecraft.item.ItemStack life15_234;
    int life16_247;
    moom.wB life10_426;
    net.minecraft.item.ItemStack life11_440;
    net.minecraft.item.Item life12_448;
    moom.wB life10_481;
    net.minecraft.item.ItemStack life11_489;
    net.minecraft.item.ItemStack life12_492;
    int life13_528;
    int life13_589;
    net.minecraft.item.ItemStack life14_593;
    int life13_656;
    int life13_773;
    net.minecraft.item.ItemStack life11_802;
    moom.wB life10_846;
    net.minecraft.item.ItemStack life11_854;
    int life12_876;
    int life13_878;
    net.minecraft.item.ItemStack life14_914;
    moom.wB life10_1037;
    net.minecraft.item.ItemStack life11_1053;
    moom.wB life10_1085;
    net.minecraft.item.ItemStack life11_1117;
    moom.wB life10_1147;
    net.minecraft.item.ItemStack life11_1150;
    int life12_1185;
    int life13_1194;
    int life14_1196;
    int life15_1201;
    moom.wB life16_1229;
    int life17_1289;
    net.minecraft.item.ItemStack life18_1293;
    forest_join_1125: {
    forest_join_1123: {
    forest_join_1014: {
    forest_join_1013: {
    forest_join_1012: {
    forest_join_1006: {
    forest_join_1004: {
    forest_join_1001: {
    forest_join_996: {
    forest_join_995: {
    forest_join_985: {
    forest_join_968: {
    forest_join_966: {
    forest_join_959: {
    forest_join_958: {
    forest_join_956: {
    forest_join_945: {
    forest_join_942: {
    forest_join_941: {
    forest_join_936: {
    forest_join_934: {
    forest_join_925: {
    forest_join_904: {
    forest_join_903: {
    forest_join_902: {
    forest_join_900: {
    forest_join_890: {
    forest_join_885: {
    forest_join_858: {
    forest_join_857: {
    forest_join_856: {
    forest_join_854: {
    forest_join_853: {
    forest_join_838: {
    forest_join_836: {
    forest_join_834: {
    forest_join_829: {
    forest_join_826: {
    forest_join_822: {
    forest_join_807: {
    forest_join_795: {
    forest_join_790: {
    forest_join_768: {
    forest_join_766: {
    forest_join_764: {
    forest_join_763: {
    forest_join_762: {
    forest_join_745: {
    forest_join_744: {
    forest_join_743: {
    forest_join_742: {
    forest_join_737: {
    forest_join_698: {
    forest_join_696: {
    forest_join_695: {
    forest_join_694: {
    forest_join_693: {
    forest_join_689: {
    forest_join_688: {
    forest_join_684: {
    forest_join_665: {
    forest_join_656: {
    forest_join_651: {
    forest_join_648: {
    forest_join_638: {
    forest_join_631: {
    forest_join_623: {
    forest_join_614: {
    forest_join_611: {
    forest_join_610: {
    forest_join_609: {
    forest_join_602: {
    forest_join_601: {
    forest_join_597: {
    forest_join_589: {
    forest_join_582: {
    forest_join_574: {
    forest_join_556: {
    forest_join_555: {
    forest_join_554: {
    forest_join_524: {
    forest_join_522: {
    forest_join_517: {
    forest_join_501: {
    forest_join_499: {
    forest_join_495: {
    forest_join_480: {
    forest_join_478: {
    forest_join_474: {
    forest_join_472: {
    forest_join_466: {
    forest_join_461: {
    forest_join_449: {
    forest_join_448: {
    forest_join_447: {
    forest_join_434: {
    forest_join_429: {
    forest_join_428: {
    forest_join_417: {
    forest_join_406: {
    forest_join_403: {
    forest_join_402: {
    forest_join_401: {
    forest_join_392: {
    forest_join_380: {
    forest_join_367: {
    forest_join_356: {
    forest_join_351: {
    forest_join_347: {
    forest_join_343: {
    forest_join_341: {
    forest_join_324: {
    forest_join_323: {
    forest_join_299: {
    forest_join_298: {
    forest_join_290: {
    forest_join_289: {
    forest_join_281: {
    forest_join_280: {
    forest_join_273: {
    forest_join_271: {
    forest_join_269: {
    forest_join_268: {
    forest_join_267: {
    forest_join_264: {
    forest_join_263: {
    forest_join_260: {
    forest_join_255: {
    forest_join_252: {
    forest_join_135: {
    forest_join_130: {
    forest_join_128: {
    forest_join_127: {
    forest_join_120: {
    forest_join_111: {
    forest_join_105: {
    forest_join_94: {
    forest_join_79: {
    forest_join_77: {
    forest_join_74: {
    forest_join_73: {
    forest_join_49: {
    forest_join_42: {
    forest_join_37: {
    forest_join_34: {
    life5_3 = (moom.v8.t ^ 54957306250537L);
    spill512_0 = moom.v8.b__Arrayr3();
    life8_6 = null;
    life7_7 = spill512_0;
    life9_10 = ((net.minecraft.entity.player.EntityPlayer)(p3)).bD;
    spill512_1 = p2;
    if (!((life7_7 == null))) {
        forestValue512_273_0 = spill512_1;
        break forest_join_273;
    }
    if (!((spill512_1 == 5))) {
        break forest_join_271;
    }
    life10_19 = this.f;
    this.f = ((int)(moom.v8.b(((int)(p1)))));
    spill512_2 = life10_19;
    spill512_3 = 1;
    if (!((life7_7 == null))) {
        forestValue512_37_0 = spill512_2;
        forestValue512_37_1 = spill512_3;
        break forest_join_37;
    }
    if (!((spill512_2 == spill512_3))) {
        break forest_join_34;
    }
    spill512_4 = this.f;
    spill512_5 = 2;
    if (!((life7_7 == null))) {
        forestValue512_37_0 = spill512_4;
        forestValue512_37_1 = spill512_5;
        break forest_join_37;
    }
    if (!((spill512_4 != spill512_5))) {
        break forest_join_42;
    }
    }
    forestValue512_37_0 = life10_19;
    forestValue512_37_1 = this.f;
    }
    if (!((forestValue512_37_0 != forestValue512_37_1))) {
        break forest_join_42;
    }
    this.b();
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW() == null))) {
        break forest_join_49;
    }
    this.b();
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    spill512_6 = this.f;
    if (!((life7_7 == null))) {
        forestValue512_79_0 = spill512_6;
        break forest_join_79;
    }
    if (!((spill512_6 == 0))) {
        break forest_join_77;
    }
    this.e = ((int)(moom.v8.a(((int)(p1)))));
    spill512_7 = this;
    if (!((life7_7 == null))) {
        forestValue512_74_0 = spill512_7;
        break forest_join_74;
    }
    if (!(moom.v8.a(((int)(((moom.v8)(spill512_7)).e)), ((net.minecraft.entity.player.EntityPlayer)(p3))))) {
        break forest_join_73;
    }
    this.f = ((int)(1));
    ((java.util.Set)(this.g)).clear();
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    forestValue512_74_0 = this;
    }
    ((moom.v8)(forestValue512_74_0)).b();
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    forestValue512_79_0 = this.f;
    }
    spill512_8 = 1;
    if (!((life7_7 == null))) {
        forestValue512_135_0 = forestValue512_79_0;
        forestValue512_135_1 = spill512_8;
        break forest_join_135;
    }
    if (!((forestValue512_79_0 == spill512_8))) {
        break forest_join_130;
    }
    life11_104 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    spill512_9 = life11_104;
    if (!((life7_7 == null))) {
        forestValue512_94_0 = spill512_9;
        break forest_join_94;
    }
    if (!((spill512_9 != null))) {
        break forest_join_128;
    }
    forestValue512_94_0 = life11_104;
    }
    spill512_10 = moom.v8.a(((moom.wB)(forestValue512_94_0)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())), ((boolean)(true)));
    if (!((life7_7 == null))) {
        forestValue512_105_0 = ((spill512_10) ? 1 : 0);
        break forest_join_105;
    }
    if (!(spill512_10)) {
        break forest_join_128;
    }
    forestValue512_105_0 = ((((moom.wB)(life11_104)).a__Boolean(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())))) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_111_0 = forestValue512_105_0;
        break forest_join_111;
    }
    if (!((forestValue512_105_0 != 0))) {
        break forest_join_128;
    }
    forestValue512_111_0 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())).b;
    }
    if (!((life7_7 == null))) {
        forestValue512_120_0 = forestValue512_111_0;
        break forest_join_120;
    }
    if (!((forestValue512_111_0 > ((java.util.Set)(this.g)).size()))) {
        break forest_join_128;
    }
    forestValue512_120_0 = ((((moom.v8)(this)).a__Boolean(((moom.wB)(life11_104)))) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_127_0 = forestValue512_120_0;
        break forest_join_127;
    }
    if (!((forestValue512_120_0 != 0))) {
        break forest_join_128;
    }
    forestValue512_127_0 = ((((java.util.Set)(this.g)).add(((java.lang.Object)(life11_104)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue512_127_0);
    }
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    spill512_11 = this;
    if (!((life7_7 == null))) {
        forestValue512_268_0 = spill512_11;
        break forest_join_268;
    }
    forestValue512_135_0 = ((moom.v8)(spill512_11)).f;
    forestValue512_135_1 = 2;
    }
    if (!((forestValue512_135_0 == forestValue512_135_1))) {
        break forest_join_267;
    }
    spill512_12 = this;
    if (!((life7_7 == null))) {
        forestValue512_264_0 = spill512_12;
        break forest_join_264;
    }
    if (!((!((java.util.Set)(((moom.v8)(spill512_12)).g)).isEmpty()))) {
        break forest_join_263;
    }
    life11_174 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())).a__xW();
    life12_178 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())).b;
    life13_182 = ((java.util.Set)(this.g)).iterator();
    forest_cycle_154: while (true) {
    forest_join_250: {
    forest_join_245: {
    forest_join_240: {
    forest_join_232: {
    forest_join_227: {
    forest_join_208: {
    forest_join_207: {
    forest_join_206: {
    forest_join_194: {
    forest_join_185: {
    forest_join_179: {
    forest_join_168: {
    if (!(((java.util.Iterator)(life13_182)).hasNext())) {
        break forest_join_252;
    }
    life14_189 = ((moom.wB)(((java.util.Iterator)(life13_182)).next()));
    if (!((life7_7 == null))) {
        break forest_join_255;
    }
    spill512_13 = life14_189;
    if (!((life7_7 == null))) {
        forestValue512_168_0 = spill512_13;
        break forest_join_168;
    }
    if (!((spill512_13 != null))) {
        break forest_join_250;
    }
    forestValue512_168_0 = life14_189;
    }
    spill512_14 = moom.v8.a(((moom.wB)(forestValue512_168_0)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())), ((boolean)(true)));
    if (!((life7_7 == null))) {
        forestValue512_179_0 = ((spill512_14) ? 1 : 0);
        break forest_join_179;
    }
    if (!(spill512_14)) {
        break forest_join_250;
    }
    forestValue512_179_0 = ((((moom.wB)(life14_189)).a__Boolean(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())))) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_185_0 = forestValue512_179_0;
        break forest_join_185;
    }
    if (!((forestValue512_179_0 != 0))) {
        break forest_join_250;
    }
    forestValue512_185_0 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())).b;
    }
    if (!((life7_7 == null))) {
        forestValue512_194_0 = forestValue512_185_0;
        break forest_join_194;
    }
    if (!((forestValue512_185_0 >= ((java.util.Set)(this.g)).size()))) {
        break forest_join_250;
    }
    forestValue512_194_0 = ((((moom.v8)(this)).a__Boolean(((moom.wB)(life14_189)))) ? 1 : 0);
    }
    if (!((forestValue512_194_0 != 0))) {
        break forest_join_250;
    }
    life15_234 = ((net.minecraft.item.ItemStack)(life11_174)).a__xW();
    spill512_15 = ((moom.wB)(life14_189)).a__Boolean();
    if (!((life7_7 == null))) {
        forestValue512_206_0 = ((spill512_15) ? 1 : 0);
        break forest_join_206;
    }
    if (!(spill512_15)) {
        break forest_join_207;
    }
    forestValue512_206_0 = ((net.minecraft.item.ItemStack)(((moom.wB)(life14_189)).a__xW())).b;
    }
    forestValue512_208_0 = forestValue512_206_0;
    break forest_join_208;
    }
    forestValue512_208_0 = 0;
    }
    life16_247 = forestValue512_208_0;
    moom.v8.a(((java.util.Set)(this.g)), ((int)(this.e)), ((net.minecraft.item.ItemStack)(life15_234)), ((int)(life16_247)));
    spill512_16 = ((net.minecraft.item.ItemStack)(life15_234)).b;
    spill512_17 = ((net.minecraft.item.ItemStack)(life15_234)).a();
    if (!((life7_7 == null))) {
        forestValue512_232_0 = spill512_16;
        forestValue512_232_1 = spill512_17;
        break forest_join_232;
    }
    if (!((spill512_16 > spill512_17))) {
        break forest_join_227;
    }
    ((net.minecraft.item.ItemStack)(life15_234)).b = ((int)(((net.minecraft.item.ItemStack)(life15_234)).a()));
    }
    forestValue512_232_0 = ((net.minecraft.item.ItemStack)(life15_234)).b;
    forestValue512_232_1 = ((moom.wB)(life14_189)).a(((net.minecraft.item.ItemStack)(life15_234)));
    }
    if (!((life7_7 == null))) {
        forestValue512_245_0 = forestValue512_232_0;
        forestValue512_245_1 = forestValue512_232_1;
        break forest_join_245;
    }
    if (!((forestValue512_232_0 > forestValue512_232_1))) {
        break forest_join_240;
    }
    ((net.minecraft.item.ItemStack)(life15_234)).b = ((int)(((moom.wB)(life14_189)).a(((net.minecraft.item.ItemStack)(life15_234)))));
    }
    forestValue512_245_0 = life12_178;
    forestValue512_245_1 = (((net.minecraft.item.ItemStack)(life15_234)).b - life16_247);
    }
    life12_178 = (forestValue512_245_0 - forestValue512_245_1);
    ((moom.wB)(life14_189)).b(((net.minecraft.item.ItemStack)(life15_234)));
    }
    if (!((life7_7 != null))) {
        continue forest_cycle_154;
    }
    break forest_cycle_154;
    }
    }
    ((net.minecraft.item.ItemStack)(life11_174)).b = ((int)(life12_178));
    }
    if (!((((net.minecraft.item.ItemStack)(life11_174)).b <= 0))) {
        break forest_join_260;
    }
    life11_174 = null;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(life11_174)));
    }
    forestValue512_264_0 = this;
    }
    ((moom.v8)(forestValue512_264_0)).b();
    if (!((life7_7 != null))) {
        break forest_join_269;
    }
    }
    forestValue512_268_0 = this;
    }
    ((moom.v8)(forestValue512_268_0)).b();
    }
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    forestValue512_273_0 = this.f;
    }
    if (!((life7_7 == null))) {
        forestValue512_281_0 = forestValue512_273_0;
        break forest_join_281;
    }
    if (!((forestValue512_273_0 != 0))) {
        break forest_join_280;
    }
    this.b();
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    forestValue512_281_0 = p2;
    }
    if (!((life7_7 == null))) {
        forestValue512_290_0 = forestValue512_281_0;
        break forest_join_290;
    }
    if (!((forestValue512_281_0 != 0))) {
        break forest_join_289;
    }
    spill512_18 = p2;
    spill512_19 = 1;
    if (!((life7_7 == null))) {
        forestValue512_698_0 = spill512_18;
        forestValue512_698_1 = spill512_19;
        break forest_join_698;
    }
    if (!((spill512_18 == spill512_19))) {
        break forest_join_696;
    }
    }
    forestValue512_290_0 = p1;
    }
    if (!((life7_7 == null))) {
        forestValue512_299_0 = forestValue512_290_0;
        break forest_join_299;
    }
    if (!((forestValue512_290_0 != 0))) {
        break forest_join_298;
    }
    spill512_20 = p1;
    spill512_21 = 1;
    if (!((life7_7 == null))) {
        forestValue512_698_0 = spill512_20;
        forestValue512_698_1 = spill512_21;
        break forest_join_698;
    }
    if (!((spill512_20 == spill512_21))) {
        break forest_join_696;
    }
    }
    forestValue512_299_0 = p0;
    }
    spill512_22 = __sourceIntrinsic_52c79f121fca_invokedynamic512_89(24459, (988144421148137036L ^ life5_3));
    if (!((life7_7 == null))) {
        forestValue512_351_0 = forestValue512_299_0;
        forestValue512_351_1 = spill512_22;
        break forest_join_351;
    }
    if (!((forestValue512_299_0 == spill512_22))) {
        break forest_join_347;
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW() != null))) {
        break forest_join_1125;
    }
    spill512_23 = p1;
    if (!((life7_7 == null))) {
        forestValue512_324_0 = spill512_23;
        break forest_join_324;
    }
    if (!((spill512_23 == 0))) {
        break forest_join_323;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())), ((boolean)(true)));
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(null)));
    }
    forestValue512_324_0 = p1;
    }
    if (!((life7_7 == null))) {
        forestValue512_341_0 = forestValue512_324_0;
        break forest_join_341;
    }
    if (!((forestValue512_324_0 == 1))) {
        break forest_join_1125;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())).a(((int)(1))))), ((boolean)(true)));
    spill512_24 = life9_10;
    if (!((life7_7 == null))) {
        forestValue512_343_0 = spill512_24;
        break forest_join_343;
    }
    forestValue512_341_0 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(spill512_24)).c__xW())).b;
    }
    if (!((forestValue512_341_0 == 0))) {
        break forest_join_1125;
    }
    forestValue512_343_0 = life9_10;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(forestValue512_343_0)).a__Void(((net.minecraft.item.ItemStack)(null)));
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    spill512_25 = p2;
    if (!((life7_7 == null))) {
        forestValue512_403_0 = spill512_25;
        break forest_join_403;
    }
    forestValue512_351_0 = spill512_25;
    forestValue512_351_1 = 1;
    }
    if (!((forestValue512_351_0 == forestValue512_351_1))) {
        break forest_join_402;
    }
    if (!((p0 < 0))) {
        break forest_join_356;
    }
    return null;
    }
    life10_426 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    spill512_26 = life10_426;
    if (!((life7_7 == null))) {
        forestValue512_367_0 = spill512_26;
        break forest_join_367;
    }
    if (!((spill512_26 != null))) {
        break forest_join_401;
    }
    forestValue512_367_0 = life10_426;
    }
    if (!(((moom.wB)(forestValue512_367_0)).a(((net.minecraft.entity.player.EntityPlayer)(p3))))) {
        break forest_join_401;
    }
    life11_440 = this.a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((int)(p0)));
    spill512_27 = life11_440;
    if (!((life7_7 == null))) {
        forestValue512_380_0 = spill512_27;
        break forest_join_380;
    }
    if (!((spill512_27 != null))) {
        break forest_join_401;
    }
    forestValue512_380_0 = life11_440;
    }
    life12_448 = ((net.minecraft.item.ItemStack)(forestValue512_380_0)).a__wQ();
    life8_6 = ((net.minecraft.item.ItemStack)(life11_440)).a__xW();
    spill512_28 = ((moom.wB)(life10_426)).a__xW();
    if (!((life7_7 == null))) {
        forestValue512_392_0 = spill512_28;
        break forest_join_392;
    }
    if (!((spill512_28 != null))) {
        break forest_join_401;
    }
    forestValue512_392_0 = ((moom.wB)(life10_426)).a__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forestValue512_392_0)).a__wQ() == life12_448))) {
        break forest_join_401;
    }
    this.a(((int)(p0)), ((int)(p1)), ((boolean)(true)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    }
    break forest_join_1125;
    }
    forestValue512_403_0 = p0;
    }
    if (!((forestValue512_403_0 < 0))) {
        break forest_join_406;
    }
    return null;
    }
    life10_481 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    spill512_29 = life10_481;
    if (!((life7_7 == null))) {
        forestValue512_417_0 = spill512_29;
        break forest_join_417;
    }
    if (!((spill512_29 != null))) {
        break forest_join_695;
    }
    forestValue512_417_0 = life10_481;
    }
    life11_489 = ((moom.wB)(forestValue512_417_0)).a__xW();
    life12_492 = ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW();
    spill512_30 = life11_489;
    if (!((life7_7 == null))) {
        forestValue512_428_0 = spill512_30;
        break forest_join_428;
    }
    if (!((spill512_30 != null))) {
        break forest_join_429;
    }
    forestValue512_428_0 = ((net.minecraft.item.ItemStack)(life11_489)).a__xW();
    }
    life8_6 = forestValue512_428_0;
    }
    spill512_31 = life11_489;
    if (!((life7_7 == null))) {
        forestValue512_434_0 = spill512_31;
        break forest_join_434;
    }
    if (!((spill512_31 == null))) {
        break forest_join_480;
    }
    forestValue512_434_0 = life12_492;
    }
    if (!((forestValue512_434_0 != null))) {
        break forest_join_693;
    }
    spill512_32 = life10_481;
    if (!((life7_7 == null))) {
        forestValue512_694_0 = spill512_32;
        break forest_join_694;
    }
    if (!(((moom.wB)(spill512_32)).a__Boolean(((net.minecraft.item.ItemStack)(life12_492))))) {
        break forest_join_693;
    }
    spill512_33 = p1;
    if (!((life7_7 == null))) {
        forestValue512_447_0 = spill512_33;
        break forest_join_447;
    }
    if (!((spill512_33 == 0))) {
        break forest_join_448;
    }
    forestValue512_447_0 = ((net.minecraft.item.ItemStack)(life12_492)).b;
    }
    forestValue512_449_0 = forestValue512_447_0;
    break forest_join_449;
    }
    forestValue512_449_0 = 1;
    }
    life13_528 = forestValue512_449_0;
    spill512_34 = life13_528;
    spill512_35 = ((moom.wB)(life10_481)).a(((net.minecraft.item.ItemStack)(life12_492)));
    if (!((life7_7 == null))) {
        forestValue512_466_0 = spill512_34;
        forestValue512_466_1 = spill512_35;
        break forest_join_466;
    }
    if (!((spill512_34 > spill512_35))) {
        break forest_join_461;
    }
    life13_528 = ((moom.wB)(life10_481)).a(((net.minecraft.item.ItemStack)(life12_492)));
    }
    spill512_36 = ((net.minecraft.item.ItemStack)(life12_492)).b;
    if (!((life7_7 == null))) {
        forestValue512_474_0 = spill512_36;
        break forest_join_474;
    }
    forestValue512_466_0 = spill512_36;
    forestValue512_466_1 = life13_528;
    }
    if (!((forestValue512_466_0 >= forestValue512_466_1))) {
        break forest_join_472;
    }
    ((moom.wB)(life10_481)).b(((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life12_492)).a(((int)(life13_528))))));
    }
    forestValue512_474_0 = ((net.minecraft.item.ItemStack)(life12_492)).b;
    }
    if (!((forestValue512_474_0 == 0))) {
        break forest_join_478;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(null)));
    }
    if (!((life7_7 != null))) {
        break forest_join_693;
    }
    }
    spill512_37 = life10_481;
    if (!((life7_7 == null))) {
        forestValue512_694_0 = spill512_37;
        break forest_join_694;
    }
    if (!(((moom.wB)(spill512_37)).a(((net.minecraft.entity.player.EntityPlayer)(p3))))) {
        break forest_join_693;
    }
    if (!((life12_492 == null))) {
        break forest_join_524;
    }
    spill512_38 = p1;
    if (!((life7_7 == null))) {
        forestValue512_499_0 = spill512_38;
        break forest_join_499;
    }
    if (!((spill512_38 == 0))) {
        break forest_join_495;
    }
    forestValue512_501_0 = ((net.minecraft.item.ItemStack)(life11_489)).b;
    break forest_join_501;
    }
    forestValue512_499_0 = (((net.minecraft.item.ItemStack)(life11_489)).b + 1);
    }
    forestValue512_501_0 = (forestValue512_499_0 / 2);
    }
    life13_589 = forestValue512_501_0;
    life14_593 = ((moom.wB)(life10_481)).a(((int)(life13_589)));
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(life14_593)));
    if (!((life7_7 == null))) {
        break forest_join_522;
    }
    if (!((((net.minecraft.item.ItemStack)(life11_489)).b == 0))) {
        break forest_join_517;
    }
    ((moom.wB)(life10_481)).b(((net.minecraft.item.ItemStack)(null)));
    }
    ((moom.wB)(life10_481)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())));
    }
    if (!((life7_7 != null))) {
        break forest_join_693;
    }
    }
    if (!(((moom.wB)(life10_481)).a__Boolean(((net.minecraft.item.ItemStack)(life12_492))))) {
        break forest_join_623;
    }
    spill512_39 = life11_489;
    if (!((life7_7 == null))) {
        forestValue512_610_0 = spill512_39;
        break forest_join_610;
    }
    if (!((((net.minecraft.item.ItemStack)(spill512_39)).a__wQ() == ((net.minecraft.item.ItemStack)(life12_492)).a__wQ()))) {
        break forest_join_609;
    }
    spill512_40 = ((net.minecraft.item.ItemStack)(life11_489)).c();
    spill512_41 = ((net.minecraft.item.ItemStack)(life12_492)).c();
    if (!((life7_7 == null))) {
        forestValue512_614_0 = spill512_40;
        forestValue512_614_1 = spill512_41;
        break forest_join_614;
    }
    if (!((spill512_40 == spill512_41))) {
        break forest_join_609;
    }
    spill512_42 = net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(life11_489)), ((net.minecraft.item.ItemStack)(life12_492)));
    if (!((life7_7 == null))) {
        forestValue512_611_0 = ((spill512_42) ? 1 : 0);
        break forest_join_611;
    }
    if (!(spill512_42)) {
        break forest_join_609;
    }
    spill512_43 = p1;
    if (!((life7_7 == null))) {
        forestValue512_554_0 = spill512_43;
        break forest_join_554;
    }
    if (!((spill512_43 == 0))) {
        break forest_join_555;
    }
    forestValue512_554_0 = ((net.minecraft.item.ItemStack)(life12_492)).b;
    }
    forestValue512_556_0 = forestValue512_554_0;
    break forest_join_556;
    }
    forestValue512_556_0 = 1;
    }
    life13_656 = forestValue512_556_0;
    spill512_44 = life13_656;
    spill512_45 = (((moom.wB)(life10_481)).a(((net.minecraft.item.ItemStack)(life12_492))) - ((net.minecraft.item.ItemStack)(life11_489)).b);
    if (!((life7_7 == null))) {
        forestValue512_582_0 = spill512_44;
        forestValue512_582_1 = spill512_45;
        break forest_join_582;
    }
    if (!((spill512_44 > spill512_45))) {
        break forest_join_574;
    }
    life13_656 = (((moom.wB)(life10_481)).a(((net.minecraft.item.ItemStack)(life12_492))) - ((net.minecraft.item.ItemStack)(life11_489)).b);
    }
    spill512_46 = life13_656;
    if (!((life7_7 == null))) {
        forestValue512_597_0 = spill512_46;
        break forest_join_597;
    }
    forestValue512_582_0 = spill512_46;
    forestValue512_582_1 = (((net.minecraft.item.ItemStack)(life12_492)).a() - ((net.minecraft.item.ItemStack)(life11_489)).b);
    }
    if (!((forestValue512_582_0 > forestValue512_582_1))) {
        break forest_join_589;
    }
    life13_656 = (((net.minecraft.item.ItemStack)(life12_492)).a() - ((net.minecraft.item.ItemStack)(life11_489)).b);
    }
    ((net.minecraft.item.ItemStack)(life12_492)).a(((int)(life13_656)));
    spill512_47 = life12_492;
    if (!((life7_7 == null))) {
        forestValue512_602_0 = spill512_47;
        break forest_join_602;
    }
    forestValue512_597_0 = ((net.minecraft.item.ItemStack)(spill512_47)).b;
    }
    if (!((forestValue512_597_0 == 0))) {
        break forest_join_601;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(null)));
    }
    forestValue512_602_0 = life11_489;
    }
    net.minecraft.item.ItemStack __stackOp512_154_0 = forestValue512_602_0;
    ((net.minecraft.item.ItemStack)(__stackOp512_154_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp512_154_0)).b + life13_656)));
    if (!((life7_7 != null))) {
        break forest_join_693;
    }
    }
    forestValue512_610_0 = life12_492;
    }
    forestValue512_611_0 = ((net.minecraft.item.ItemStack)(forestValue512_610_0)).b;
    }
    forestValue512_614_0 = forestValue512_611_0;
    forestValue512_614_1 = ((moom.wB)(life10_481)).a(((net.minecraft.item.ItemStack)(life12_492)));
    }
    if (!((forestValue512_614_0 <= forestValue512_614_1))) {
        break forest_join_693;
    }
    ((moom.wB)(life10_481)).b(((net.minecraft.item.ItemStack)(life12_492)));
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(life11_489)));
    if (!((life7_7 != null))) {
        break forest_join_693;
    }
    }
    spill512_48 = life11_489;
    if (!((life7_7 == null))) {
        forestValue512_631_0 = spill512_48;
        break forest_join_631;
    }
    if (!((((net.minecraft.item.ItemStack)(spill512_48)).a__wQ() == ((net.minecraft.item.ItemStack)(life12_492)).a__wQ()))) {
        break forest_join_693;
    }
    forestValue512_631_0 = life12_492;
    }
    spill512_49 = ((net.minecraft.item.ItemStack)(forestValue512_631_0)).a();
    if (!((life7_7 == null))) {
        forestValue512_638_0 = spill512_49;
        break forest_join_638;
    }
    if (!((spill512_49 > 1))) {
        break forest_join_693;
    }
    forestValue512_638_0 = ((((net.minecraft.item.ItemStack)(life11_489)).c__Boolean()) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_651_0 = forestValue512_638_0;
        break forest_join_651;
    }
    if (!((forestValue512_638_0 != 0))) {
        break forest_join_648;
    }
    spill512_50 = ((net.minecraft.item.ItemStack)(life11_489)).c();
    if (!((life7_7 == null))) {
        forestValue512_651_0 = spill512_50;
        break forest_join_651;
    }
    if (!((spill512_50 == ((net.minecraft.item.ItemStack)(life12_492)).c()))) {
        break forest_join_693;
    }
    }
    forestValue512_651_0 = ((net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(life11_489)), ((net.minecraft.item.ItemStack)(life12_492)))) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_656_0 = forestValue512_651_0;
        break forest_join_656;
    }
    if (!((forestValue512_651_0 != 0))) {
        break forest_join_693;
    }
    forestValue512_656_0 = ((net.minecraft.item.ItemStack)(life11_489)).b;
    }
    life13_773 = forestValue512_656_0;
    spill512_51 = life13_773;
    if (!((life7_7 == null))) {
        forestValue512_665_0 = spill512_51;
        break forest_join_665;
    }
    if (!((spill512_51 > 0))) {
        break forest_join_693;
    }
    forestValue512_665_0 = (life13_773 + ((net.minecraft.item.ItemStack)(life12_492)).b);
    }
    if (!((life7_7 == null))) {
        forestValue512_684_0 = forestValue512_665_0;
        break forest_join_684;
    }
    if (!((forestValue512_665_0 <= ((net.minecraft.item.ItemStack)(life12_492)).a()))) {
        break forest_join_693;
    }
    net.minecraft.item.ItemStack __stackOp512_173_0 = life12_492;
    ((net.minecraft.item.ItemStack)(__stackOp512_173_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp512_173_0)).b + life13_773)));
    spill512_52 = life10_481;
    if (!((life7_7 == null))) {
        forestValue512_689_0 = spill512_52;
        break forest_join_689;
    }
    life11_802 = ((moom.wB)(spill512_52)).a(((int)(life13_773)));
    forestValue512_684_0 = ((net.minecraft.item.ItemStack)(life11_802)).b;
    }
    if (!((forestValue512_684_0 == 0))) {
        break forest_join_688;
    }
    ((moom.wB)(life10_481)).b(((net.minecraft.item.ItemStack)(null)));
    }
    forestValue512_689_0 = life10_481;
    }
    ((moom.wB)(forestValue512_689_0)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW())));
    }
    forestValue512_694_0 = life10_481;
    }
    ((moom.wB)(forestValue512_694_0)).a__Void();
    }
    break forest_join_1125;
    }
    forestValue512_698_0 = p2;
    forestValue512_698_1 = 2;
    }
    if (!((life7_7 == null))) {
        forestValue512_858_0 = forestValue512_698_0;
        forestValue512_858_1 = forestValue512_698_1;
        break forest_join_858;
    }
    if (!((forestValue512_698_0 == forestValue512_698_1))) {
        break forest_join_856;
    }
    spill512_53 = p1;
    if (!((life7_7 == null))) {
        forestValue512_857_0 = spill512_53;
        break forest_join_857;
    }
    if (!((spill512_53 >= 0))) {
        break forest_join_856;
    }
    spill512_54 = p1;
    spill512_55 = __sourceIntrinsic_52c79f121fca_invokedynamic512_182(734, (454353915665926938L ^ life5_3));
    if (!((life7_7 == null))) {
        forestValue512_858_0 = spill512_54;
        forestValue512_858_1 = spill512_55;
        break forest_join_858;
    }
    if (!((spill512_54 < spill512_55))) {
        break forest_join_856;
    }
    life10_846 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    if (!(((moom.wB)(life10_846)).a(((net.minecraft.entity.player.EntityPlayer)(p3))))) {
        break forest_join_854;
    }
    life11_854 = ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__xW(((int)(p1)));
    if (!((life11_854 != null))) {
        break forest_join_742;
    }
    spill512_56 = life10_846;
    if (!((life7_7 == null))) {
        forestValue512_737_0 = spill512_56;
        break forest_join_737;
    }
    if (!((((moom.wB)(spill512_56)).b == life9_10))) {
        break forest_join_744;
    }
    forestValue512_737_0 = life10_846;
    }
    spill512_57 = ((moom.wB)(forestValue512_737_0)).a__Boolean(((net.minecraft.item.ItemStack)(life11_854)));
    if (!((life7_7 == null))) {
        forestValue512_743_0 = ((spill512_57) ? 1 : 0);
        break forest_join_743;
    }
    if (!(spill512_57)) {
        break forest_join_744;
    }
    }
    forestValue512_743_0 = 1;
    }
    forestValue512_745_0 = forestValue512_743_0;
    break forest_join_745;
    }
    forestValue512_745_0 = 0;
    }
    life12_876 = forestValue512_745_0;
    life13_878 = -1;
    spill512_58 = life12_876;
    if (!((life7_7 == null))) {
        forestValue512_768_0 = spill512_58;
        break forest_join_768;
    }
    if (!((spill512_58 == 0))) {
        break forest_join_766;
    }
    life13_878 = ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).f();
    spill512_59 = life12_876;
    spill512_60 = life13_878;
    if (!((life7_7 == null))) {
        forestValue512_762_0 = spill512_59;
        forestValue512_762_1 = spill512_60;
        break forest_join_762;
    }
    if (!((spill512_60 > -1))) {
        forestValue512_763_0 = spill512_59;
        break forest_join_763;
    }
    forestValue512_762_0 = spill512_59;
    forestValue512_762_1 = 1;
    }
    forestValue512_764_0 = forestValue512_762_0;
    forestValue512_764_1 = forestValue512_762_1;
    break forest_join_764;
    }
    forestValue512_764_0 = forestValue512_763_0;
    forestValue512_764_1 = 0;
    }
    life12_876 = (forestValue512_764_0 | forestValue512_764_1);
    }
    forestValue512_768_0 = ((((moom.wB)(life10_846)).a__Boolean()) ? 1 : 0);
    }
    if (!((life7_7 == null))) {
        forestValue512_838_0 = forestValue512_768_0;
        break forest_join_838;
    }
    if (!((forestValue512_768_0 != 0))) {
        break forest_join_836;
    }
    spill512_61 = life12_876;
    if (!((life7_7 == null))) {
        forestValue512_838_0 = spill512_61;
        break forest_join_838;
    }
    if (!((spill512_61 != 0))) {
        break forest_join_836;
    }
    life14_914 = ((moom.wB)(life10_846)).a__xW();
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((int)(p1)), ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life14_914)).a__xW())));
    spill512_62 = life10_846;
    if (!((life7_7 == null))) {
        forestValue512_790_0 = spill512_62;
        break forest_join_790;
    }
    if (!((((moom.wB)(spill512_62)).b == life9_10))) {
        break forest_join_795;
    }
    forestValue512_790_0 = life10_846;
    }
    spill512_63 = life11_854;
    if (!((life7_7 == null))) {
        forestValue512_829_0 = forestValue512_790_0;
        forestValue512_829_1 = spill512_63;
        break forest_join_829;
    }
    if (!((!((moom.wB)(forestValue512_790_0)).a__Boolean(((net.minecraft.item.ItemStack)(spill512_63)))))) {
        break forest_join_822;
    }
    }
    spill512_64 = life11_854;
    if (!((life7_7 == null))) {
        forestValue512_826_0 = spill512_64;
        break forest_join_826;
    }
    if (!((spill512_64 != null))) {
        break forest_join_822;
    }
    spill512_65 = life13_878;
    if (!((life7_7 == null))) {
        forestValue512_807_0 = spill512_65;
        break forest_join_807;
    }
    if (!((spill512_65 > -1))) {
        break forest_join_834;
    }
    forestValue512_807_0 = ((((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Boolean(((net.minecraft.item.ItemStack)(life11_854)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue512_807_0);
    ((moom.wB)(life10_846)).a(((int)(((net.minecraft.item.ItemStack)(life14_914)).b)));
    ((moom.wB)(life10_846)).b(((net.minecraft.item.ItemStack)(null)));
    ((moom.wB)(life10_846)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(life14_914)));
    if (!((life7_7 != null))) {
        break forest_join_834;
    }
    }
    forestValue512_826_0 = ((moom.wB)(life10_846)).a(((int)(((net.minecraft.item.ItemStack)(life14_914)).b)));
    }
    recovery.source.CarrierOps.discard(forestValue512_826_0);
    forestValue512_829_0 = life10_846;
    forestValue512_829_1 = life11_854;
    }
    ((moom.wB)(forestValue512_829_0)).b(((net.minecraft.item.ItemStack)(forestValue512_829_1)));
    ((moom.wB)(life10_846)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(life14_914)));
    }
    if (!((life7_7 != null))) {
        break forest_join_854;
    }
    }
    forestValue512_838_0 = ((((moom.wB)(life10_846)).a__Boolean()) ? 1 : 0);
    }
    if (!((forestValue512_838_0 == 0))) {
        break forest_join_854;
    }
    if (!((life11_854 != null))) {
        break forest_join_854;
    }
    spill512_66 = life10_846;
    spill512_67 = life11_854;
    if (!((life7_7 == null))) {
        forestValue512_853_0 = spill512_66;
        forestValue512_853_1 = spill512_67;
        break forest_join_853;
    }
    if (!(((moom.wB)(spill512_66)).a__Boolean(((net.minecraft.item.ItemStack)(spill512_67))))) {
        break forest_join_854;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((int)(p1)), ((net.minecraft.item.ItemStack)(null)));
    forestValue512_853_0 = life10_846;
    forestValue512_853_1 = life11_854;
    }
    ((moom.wB)(forestValue512_853_0)).b(((net.minecraft.item.ItemStack)(forestValue512_853_1)));
    }
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    forestValue512_857_0 = p2;
    }
    forestValue512_858_0 = forestValue512_857_0;
    forestValue512_858_1 = 3;
    }
    if (!((life7_7 == null))) {
        forestValue512_904_0 = forestValue512_858_0;
        forestValue512_904_1 = forestValue512_858_1;
        break forest_join_904;
    }
    if (!((forestValue512_858_0 == forestValue512_858_1))) {
        break forest_join_902;
    }
    spill512_68 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d;
    if (!((life7_7 == null))) {
        forestValue512_903_0 = ((spill512_68) ? 1 : 0);
        break forest_join_903;
    }
    if (!(spill512_68)) {
        break forest_join_902;
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW() == null))) {
        break forest_join_902;
    }
    spill512_69 = p0;
    if (!((life7_7 == null))) {
        forestValue512_903_0 = spill512_69;
        break forest_join_903;
    }
    if (!((spill512_69 >= 0))) {
        break forest_join_902;
    }
    life10_1037 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    spill512_70 = life10_1037;
    if (!((life7_7 == null))) {
        forestValue512_885_0 = spill512_70;
        break forest_join_885;
    }
    if (!((spill512_70 != null))) {
        break forest_join_900;
    }
    forestValue512_885_0 = life10_1037;
    }
    if (!((life7_7 == null))) {
        forestValue512_890_0 = forestValue512_885_0;
        break forest_join_890;
    }
    if (!(((moom.wB)(forestValue512_885_0)).a__Boolean())) {
        break forest_join_900;
    }
    forestValue512_890_0 = life10_1037;
    }
    life11_1053 = ((net.minecraft.item.ItemStack)(((moom.wB)(forestValue512_890_0)).a__xW())).a__xW();
    ((net.minecraft.item.ItemStack)(life11_1053)).b = ((int)(((net.minecraft.item.ItemStack)(life11_1053)).a()));
    ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).a__Void(((net.minecraft.item.ItemStack)(life11_1053)));
    }
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    forestValue512_903_0 = p2;
    }
    forestValue512_904_0 = forestValue512_903_0;
    forestValue512_904_1 = 4;
    }
    if (!((life7_7 == null))) {
        forestValue512_966_0 = forestValue512_904_0;
        forestValue512_966_1 = forestValue512_904_1;
        break forest_join_966;
    }
    if (!((forestValue512_904_0 == forestValue512_904_1))) {
        break forest_join_958;
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW() == null))) {
        break forest_join_958;
    }
    spill512_71 = p0;
    if (!((life7_7 == null))) {
        forestValue512_959_0 = spill512_71;
        break forest_join_959;
    }
    if (!((spill512_71 >= 0))) {
        break forest_join_958;
    }
    life10_1085 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    spill512_72 = life10_1085;
    if (!((life7_7 == null))) {
        forestValue512_925_0 = spill512_72;
        break forest_join_925;
    }
    if (!((spill512_72 != null))) {
        break forest_join_956;
    }
    forestValue512_925_0 = life10_1085;
    }
    spill512_73 = ((moom.wB)(forestValue512_925_0)).a__Boolean();
    if (!((life7_7 == null))) {
        forestValue512_934_0 = ((spill512_73) ? 1 : 0);
        break forest_join_934;
    }
    if (!(spill512_73)) {
        break forest_join_956;
    }
    spill512_74 = life10_1085;
    if (!((life7_7 == null))) {
        forestValue512_936_0 = spill512_74;
        break forest_join_936;
    }
    forestValue512_934_0 = ((((moom.wB)(spill512_74)).a(((net.minecraft.entity.player.EntityPlayer)(p3)))) ? 1 : 0);
    }
    if (!((forestValue512_934_0 != 0))) {
        break forest_join_956;
    }
    forestValue512_936_0 = life10_1085;
    }
    spill512_75 = p1;
    if (!((life7_7 == null))) {
        forestValue512_941_0 = forestValue512_936_0;
        forestValue512_941_1 = spill512_75;
        break forest_join_941;
    }
    if (!((spill512_75 == 0))) {
        forestValue512_942_0 = forestValue512_936_0;
        break forest_join_942;
    }
    forestValue512_941_0 = forestValue512_936_0;
    forestValue512_941_1 = 1;
    }
    forestValue512_945_0 = forestValue512_941_0;
    forestValue512_945_1 = forestValue512_941_1;
    break forest_join_945;
    }
    forestValue512_945_0 = forestValue512_942_0;
    forestValue512_945_1 = ((net.minecraft.item.ItemStack)(((moom.wB)(life10_1085)).a__xW())).b;
    }
    life11_1117 = ((moom.wB)(forestValue512_945_0)).a(((int)(forestValue512_945_1)));
    ((moom.wB)(life10_1085)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(life11_1117)));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((net.minecraft.item.ItemStack)(life11_1117)), ((boolean)(true)));
    }
    if (!((life7_7 != null))) {
        break forest_join_1125;
    }
    }
    forestValue512_959_0 = p2;
    }
    if (!((life7_7 == null))) {
        forestValue512_968_0 = forestValue512_959_0;
        break forest_join_968;
    }
    forestValue512_966_0 = forestValue512_959_0;
    forestValue512_966_1 = __sourceIntrinsic_52c79f121fca_invokedynamic512_242(2175, (5714267582369743290L ^ life5_3));
    }
    if (!((forestValue512_966_0 == forestValue512_966_1))) {
        break forest_join_1125;
    }
    forestValue512_968_0 = p0;
    }
    if (!((forestValue512_968_0 >= 0))) {
        break forest_join_1125;
    }
    life10_1147 = ((moom.wB)(((java.util.List)(this.b)).get(((int)(p0)))));
    life11_1150 = ((net.minecraft.entity.player.InventoryPlayer)(life9_10)).c__xW();
    if (!((life11_1150 != null))) {
        break forest_join_1123;
    }
    spill512_76 = life10_1147;
    if (!((life7_7 == null))) {
        forestValue512_985_0 = spill512_76;
        break forest_join_985;
    }
    if (!((spill512_76 != null))) {
        break forest_join_995;
    }
    forestValue512_985_0 = life10_1147;
    }
    spill512_77 = ((moom.wB)(forestValue512_985_0)).a__Boolean();
    if (!((life7_7 == null))) {
        forestValue512_996_0 = ((spill512_77) ? 1 : 0);
        break forest_join_996;
    }
    if (!(spill512_77)) {
        break forest_join_995;
    }
    spill512_78 = ((moom.wB)(life10_1147)).a(((net.minecraft.entity.player.EntityPlayer)(p3)));
    if (!((life7_7 == null))) {
        forestValue512_996_0 = ((spill512_78) ? 1 : 0);
        break forest_join_996;
    }
    if (!((!spill512_78))) {
        break forest_join_1123;
    }
    }
    forestValue512_996_0 = p1;
    }
    if (!((life7_7 == null))) {
        forestValue512_1004_0 = forestValue512_996_0;
        break forest_join_1004;
    }
    if (!((forestValue512_996_0 == 0))) {
        break forest_join_1001;
    }
    forestValue512_1006_0 = 0;
    break forest_join_1006;
    }
    forestValue512_1004_0 = ((java.util.List)(this.b)).size();
    }
    forestValue512_1006_0 = (forestValue512_1004_0 - 1);
    }
    life12_1185 = forestValue512_1006_0;
    spill512_79 = p1;
    if (!((life7_7 == null))) {
        forestValue512_1012_0 = spill512_79;
        break forest_join_1012;
    }
    if (!((spill512_79 == 0))) {
        break forest_join_1013;
    }
    forestValue512_1012_0 = 1;
    }
    forestValue512_1014_0 = forestValue512_1012_0;
    break forest_join_1014;
    }
    forestValue512_1014_0 = -1;
    }
    life13_1194 = forestValue512_1014_0;
    life14_1196 = 0;
    forest_cycle_1017: while (true) {
    forest_join_1120: {
    forestValue512_1019_0 = life14_1196;
    forestValue512_1019_1 = 2;
    forest_cycle_1019: while (true) {
    if (!((forestValue512_1019_0 < forestValue512_1019_1))) {
        break forest_join_1123;
    }
    life15_1201 = life12_1185;
    forest_cycle_1022: while (true) {
    forest_join_1117: {
    forest_join_1116: {
    forest_join_1114: {
    forest_join_1110: {
    forest_join_1093: {
    forest_join_1084: {
    forest_join_1044: {
    forest_join_1039: {
    if (!((life15_1201 >= 0))) {
        break forest_join_1120;
    }
    spill512_80 = life15_1201;
    spill512_81 = ((java.util.List)(this.b)).size();
    if (!((life7_7 == null))) {
        forestValue512_1019_0 = spill512_80;
        forestValue512_1019_1 = spill512_81;
        continue forest_cycle_1019;
    }
    if (!((life7_7 == null))) {
        forestValue512_1039_0 = spill512_80;
        forestValue512_1039_1 = spill512_81;
        break forest_join_1039;
    }
    if (!((spill512_80 < spill512_81))) {
        break forest_join_1120;
    }
    spill512_82 = life11_1150;
    if (!((life7_7 == null))) {
        forestValue512_1044_0 = spill512_82;
        break forest_join_1044;
    }
    forestValue512_1039_0 = ((net.minecraft.item.ItemStack)(spill512_82)).b;
    forestValue512_1039_1 = ((net.minecraft.item.ItemStack)(life11_1150)).a();
    }
    if (!((forestValue512_1039_0 < forestValue512_1039_1))) {
        break forest_join_1120;
    }
    forestValue512_1044_0 = ((java.util.List)(this.b)).get(((int)(life15_1201)));
    }
    life16_1229 = ((moom.wB)(forestValue512_1044_0));
    spill512_83 = ((moom.wB)(life16_1229)).a__Boolean();
    if (!((life7_7 == null))) {
        forestValue512_1117_0 = ((spill512_83) ? 1 : 0);
        break forest_join_1117;
    }
    if (!(spill512_83)) {
        break forest_join_1114;
    }
    spill512_84 = moom.v8.a(((moom.wB)(life16_1229)), ((net.minecraft.item.ItemStack)(life11_1150)), ((boolean)(true)));
    if (!((life7_7 == null))) {
        forestValue512_1117_0 = ((spill512_84) ? 1 : 0);
        break forest_join_1117;
    }
    if (!(spill512_84)) {
        break forest_join_1114;
    }
    spill512_85 = ((moom.wB)(life16_1229)).a(((net.minecraft.entity.player.EntityPlayer)(p3)));
    if (!((life7_7 == null))) {
        forestValue512_1117_0 = ((spill512_85) ? 1 : 0);
        break forest_join_1117;
    }
    if (!(spill512_85)) {
        break forest_join_1114;
    }
    spill512_86 = this.a(((net.minecraft.item.ItemStack)(life11_1150)), ((moom.wB)(life16_1229)));
    if (!((life7_7 == null))) {
        forestValue512_1117_0 = ((spill512_86) ? 1 : 0);
        break forest_join_1117;
    }
    if (!(spill512_86)) {
        break forest_join_1114;
    }
    spill512_87 = life14_1196;
    if (!((life7_7 == null))) {
        forestValue512_1093_0 = spill512_87;
        break forest_join_1093;
    }
    if (!((spill512_87 == 0))) {
        break forest_join_1084;
    }
    spill512_88 = ((net.minecraft.item.ItemStack)(((moom.wB)(life16_1229)).a__xW())).b;
    spill512_89 = ((net.minecraft.item.ItemStack)(((moom.wB)(life16_1229)).a__xW())).a();
    if (!((life7_7 == null))) {
        forestValue512_1116_0 = spill512_88;
        forestValue512_1116_1 = spill512_89;
        break forest_join_1116;
    }
    if (!((spill512_88 != spill512_89))) {
        break forest_join_1114;
    }
    }
    forestValue512_1093_0 = java.lang.Math.min(((int)((((net.minecraft.item.ItemStack)(life11_1150)).a() - ((net.minecraft.item.ItemStack)(life11_1150)).b))), ((int)(((net.minecraft.item.ItemStack)(((moom.wB)(life16_1229)).a__xW())).b)));
    }
    life17_1289 = forestValue512_1093_0;
    life18_1293 = ((moom.wB)(life16_1229)).a(((int)(life17_1289)));
    net.minecraft.item.ItemStack __stackOp512_278_0 = life11_1150;
    ((net.minecraft.item.ItemStack)(__stackOp512_278_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp512_278_0)).b + life17_1289)));
    if (!((((net.minecraft.item.ItemStack)(life18_1293)).b <= 0))) {
        break forest_join_1110;
    }
    ((moom.wB)(life16_1229)).b(((net.minecraft.item.ItemStack)(null)));
    }
    ((moom.wB)(life16_1229)).a(((net.minecraft.entity.player.EntityPlayer)(p3)), ((net.minecraft.item.ItemStack)(life18_1293)));
    }
    forestValue512_1116_0 = life15_1201;
    forestValue512_1116_1 = life13_1194;
    }
    forestValue512_1117_0 = (forestValue512_1116_0 + forestValue512_1116_1);
    }
    life15_1201 = forestValue512_1117_0;
    if (!((life7_7 != null))) {
        continue forest_cycle_1022;
    }
    break forest_cycle_1022;
    }
    break forest_cycle_1019;
    }
    }
    life14_1196 += 1;
    if (!((life7_7 != null))) {
        continue forest_cycle_1017;
    }
    break forest_cycle_1017;
    }
    }
    ((moom.v8)(this)).a__Void();
    }
    return life8_6;
}


public boolean a(net.minecraft.item.ItemStack p0, moom.wB p1) {
return ((1) != 0);
}


protected moom.wB a(moom.wB p0) {
((moom.wB)(p0)).c = ((int)(((java.util.List)(this.b)).size()));
    ((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    ((java.util.List)(this.a)).add(((java.lang.Object)(null)));
    return p0;
}


public void a(net.minecraft.inventory.ICrafting p0) {
int forwardValue4273_22_0;
    boolean spill4273_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_18: {
    life2_3 = (moom.v8.t ^ 89946544816833L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4273_0 = ((java.util.List)(this.h)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4273_22_0 = ((spill4273_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill4273_0)) {
        break forward_join_18;
    }
    throw new java.lang.IllegalArgumentException("Listener already listening");
    }
    forwardValue4273_22_0 = ((((java.util.List)(this.h)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4273_22_0);
    ((net.minecraft.inventory.ICrafting)(p0)).a(((moom.v8)(this)), ((java.util.List)(this.a())));
    ((moom.v8)(this)).a__Void();
    return;
}


public java.util.List<net.minecraft.item.ItemStack> a() {
java.util.ArrayList lexicalValue1342_29_0;
    net.minecraft.entity.Entity[] spill1342_0;
    java.util.ArrayList spill1342_1;
    long life1_3;
    java.util.ArrayList life4_6;
    net.minecraft.entity.Entity[] life3_7;
    java.util.Iterator life5_11;
    moom.wB life6_18;
    lexical_join_29: {
    lexical_join_28: {
    life1_3 = (moom.v8.t ^ 94383156747217L);
    spill1342_0 = moom.v8.b__Arrayr3();
    life4_6 = com.google.common.collect.Lists.newArrayList();
    life3_7 = spill1342_0;
    life5_11 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_12: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_28;
    }
    life6_18 = ((moom.wB)(((java.util.Iterator)(life5_11)).next()));
    spill1342_1 = life4_6;
    if (!((life3_7 == null))) {
        lexicalValue1342_29_0 = spill1342_1;
        break lexical_join_29;
    }
    ((java.util.List)(spill1342_1)).add(((java.lang.Object)(((moom.wB)(life6_18)).a__xW())));
    if (!((life3_7 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    lexicalValue1342_29_0 = life4_6;
    }
    return lexicalValue1342_29_0;
}


public void a__Void() {
net.minecraft.item.ItemStack lexicalValue1348_39_0;
    net.minecraft.item.ItemStack lexicalValue1348_40_0;
    net.minecraft.entity.Entity[] spill1348_0;
    net.minecraft.item.ItemStack spill1348_1;
    long life1_3;
    int life4_6;
    net.minecraft.entity.Entity[] life3_7;
    net.minecraft.item.ItemStack life5_19;
    net.minecraft.item.ItemStack life6_25;
    net.minecraft.item.ItemStack life6_51;
    java.util.Iterator life7_61;
    net.minecraft.inventory.ICrafting life8_68;
    lexical_join_70: {
    life1_3 = (moom.v8.t ^ 29778646786406L);
    spill1348_0 = moom.v8.b__Arrayr3();
    life4_6 = 0;
    life3_7 = spill1348_0;
    lexical_cycle_8: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life4_6 < ((java.util.List)(this.b)).size()))) {
        break lexical_join_70;
    }
    life5_19 = ((moom.wB)(((moom.wB)(((java.util.List)(this.b)).get(((int)(life4_6))))))).a__xW();
    life6_25 = ((net.minecraft.item.ItemStack)(((java.util.List)(this.a)).get(((int)(life4_6)))));
    if (!((life3_7 == null))) {
        break lexical_join_68;
    }
    if (!((!net.minecraft.item.ItemStack.b(((net.minecraft.item.ItemStack)(life6_25)), ((net.minecraft.item.ItemStack)(life5_19)))))) {
        break lexical_join_67;
    }
    spill1348_1 = life5_19;
    if (!((life3_7 == null))) {
        lexicalValue1348_39_0 = spill1348_1;
        break lexical_join_39;
    }
    if (!((spill1348_1 == null))) {
        break lexical_join_38;
    }
    lexicalValue1348_40_0 = null;
    break lexical_join_40;
    }
    lexicalValue1348_39_0 = life5_19;
    }
    lexicalValue1348_40_0 = ((net.minecraft.item.ItemStack)(lexicalValue1348_39_0)).a__xW();
    }
    life6_51 = lexicalValue1348_40_0;
    ((java.util.List)(this.a)).set(((int)(life4_6)), ((java.lang.Object)(life6_51)));
    life7_61 = ((java.util.List)(this.h)).iterator();
    lexical_cycle_51: while (true) {
    if (!(((java.util.Iterator)(life7_61)).hasNext())) {
        break lexical_join_67;
    }
    life8_68 = ((net.minecraft.inventory.ICrafting)(((java.util.Iterator)(life7_61)).next()));
    ((net.minecraft.inventory.ICrafting)(life8_68)).a(((moom.v8)(this)), ((int)(life4_6)), ((net.minecraft.item.ItemStack)(life6_51)));
    if (!((life3_7 == null))) {
        break lexical_join_68;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    life4_6 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0, int p1) {
return ((0) != 0);
}


public void a(net.minecraft.item.ItemStack[] p0) {
net.minecraft.entity.Entity[] spill1347_0;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    lexical_join_22: {
    life2_3 = (moom.v8.t ^ 83798359288959L);
    spill1347_0 = moom.v8.b__Arrayr3();
    life5_6 = 0;
    life4_7 = spill1347_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < (p0).length))) {
        break lexical_join_22;
    }
    ((moom.wB)(((moom.v8)(this)).a__wB(((int)(life5_6))))).b(((net.minecraft.item.ItemStack)((p0)[life5_6])));
    life5_6 += 1;
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void a__Void(int p0, int p1) {
return;
}


public short a(net.minecraft.entity.player.InventoryPlayer p0) {
moom.v8 __stackOp447_0_0 = this;
    ((moom.v8)(__stackOp447_0_0)).d = ((short)(((short) (((moom.v8)(__stackOp447_0_0)).d + 1))));
    return this.d;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4279_14_0;
    int forwardValue4279_16_0;
    boolean spill4279_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.v8.t ^ 113493505037167L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4279_0 = ((java.util.Set)(this.i)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4279_14_0 = ((spill4279_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4279_0))) {
        break forward_join_15;
    }
    forwardValue4279_14_0 = 1;
    }
    forwardValue4279_16_0 = forwardValue4279_14_0;
    break forward_join_16;
    }
    forwardValue4279_16_0 = 0;
    }
    return ((forwardValue4279_16_0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, boolean p1) {
int forwardValue4272_21_0;
    boolean spill4272_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.v8.t ^ 130710131513161L);
    life5_5 = moom.v8.b__Arrayr3();
    spill4272_0 = p1;
    if (!((life5_5 == null))) {
        forwardValue4272_21_0 = ((spill4272_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4272_0)) {
        break forward_join_17;
    }
    ((java.util.Set)(this.i)).remove(((java.lang.Object)(p0)));
    if (!((life5_5 != null))) {
        break forward_join_22;
    }
    }
    forwardValue4272_21_0 = ((((java.util.Set)(this.i)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4272_21_0);
    }
    return;
}


protected void a(int p0, int p1, boolean p2, net.minecraft.entity.player.EntityPlayer p3) {
this.a(((int)(p0)), ((int)(p1)), ((int)(1)), ((net.minecraft.entity.player.EntityPlayer)(p3)));
    return;
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.player.InventoryPlayer forwardValue4270_21_0;
    net.minecraft.entity.Entity[] spill4270_0;
    net.minecraft.entity.player.InventoryPlayer spill4270_1;
    long life2_3;
    net.minecraft.entity.player.InventoryPlayer life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_23: {
    forward_join_21: {
    life2_3 = (moom.v8.t ^ 102052989706287L);
    spill4270_0 = moom.v8.b__Arrayr3();
    life5_7 = ((net.minecraft.entity.player.EntityPlayer)(p0)).bD;
    life4_8 = spill4270_0;
    spill4270_1 = life5_7;
    if (!((life4_8 == null))) {
        forwardValue4270_21_0 = spill4270_1;
        break forward_join_21;
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(spill4270_1)).c__xW() != null))) {
        break forward_join_23;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(life5_7)).c__xW())), ((boolean)(false)));
    forwardValue4270_21_0 = life5_7;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(forwardValue4270_21_0)).a__Void(((net.minecraft.item.ItemStack)(null)));
    }
    return;
}


public void a__Void(net.minecraft.inventory.IInventory p0) {
((moom.v8)(this)).a__Void();
    return;
}


public void a(int p0, net.minecraft.item.ItemStack p1) {
((moom.wB)(((moom.v8)(this)).a__wB(((int)(p0))))).b(((net.minecraft.item.ItemStack)(p1)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_52c79f121fca_invokedynamic512_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52c79f121fca_invokedynamic512_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52c79f121fca_invokedynamic512_242(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9425_0() throws E;
}
