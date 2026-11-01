package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bs extends sourcebuild.EnumConstructor<moom.bs> implements net.minecraft.util.IStringSerializable {

public static moom.bs DOWN;

public static moom.bs UP;

public static moom.bs NORTH;

public static moom.bs SOUTH;

public static moom.bs WEST;

public static moom.bs EAST;

private int a;

private int b;

private int c;

private java.lang.String d;

private net.minecraft.util.EnumFacing$Axis e;

private net.minecraft.util.EnumFacing$AxisDirection f;

private moom.DS g;

public static moom.bs[] VALUES;

private static moom.bs[] h;

private static java.util.Map<java.lang.String, moom.bs> i;

private static moom.bs[] j;

private static int[] k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private bs(java.lang.String p0, int p1, int p2, int p3, int p4, java.lang.String p5, net.minecraft.util.EnumFacing$AxisDirection p6, net.minecraft.util.EnumFacing$Axis p7, moom.DS p8) {
super(p0, p1);
    this.a = p2;
    this.c = p4;
    this.b = p3;
    this.d = p5;
    this.e = p7;
    this.f = p6;
    this.g = p8;
}


private static void initialize() {
l = ((long)(((moom._a)(moom._c.a(((long)(-8054188700438953164L)), ((long)(1960174383234696993L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255053290900575L)))));
    long local11_life6 = (moom.bs.l ^ 53002897008994L);
    java.lang.Object __sourceSpill777_8 = null;
    o = ((java.util.Map)(new java.util.HashMap(13)));
    moom.bs.b(((int[])(__sourceSpill777_8)));
    javax.crypto.Cipher local0_life11;
    javax.crypto.Cipher __sourceSpill777_13 = (local0_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill777_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill777_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill777_16 = new byte[8];
    (__sourceSpill777_16)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life17 = 1;
    while ((local1_life17 < 8)) {
        (__sourceSpill777_16)[local1_life17] = ((byte) ((int) ((local11_life6 << (local1_life17 * 8)) >>> 56)));
        local1_life17 += 1;
    }
    byte[] __sourcePreallocation777_18 = __sourceSpill777_16;
    ((javax.crypto.Cipher)(__sourceSpill777_13)).init(((int)(__sourceSpill777_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill777_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation777_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life21 = new long[2];
    int local3_life22 = 0;
    java.lang.String local4_life23;
    int local5_life25 = ((java.lang.String)((local4_life23 = "ÁúØÔã9ªø;ììhFØ¡Ü"))).length();
    int local2_life26 = 0;
    do {
        java.lang.String __sourceSpill777_27 = local4_life23;
        int __sourceSpill777_28 = local2_life26;
        local2_life26 += 8;
        byte[] local7_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill777_27)).substring(((int)(__sourceSpill777_28)), ((int)(local2_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill777_32 = local6_life21;
        int __sourceSpill777_33 = local3_life22;
        local3_life22 += 1;
        long local8_life34 = (((((((((((long) (local7_life31)[0]) & 255L) << 56) | ((((long) (local7_life31)[1]) & 255L) << 48)) | ((((long) (local7_life31)[2]) & 255L) << 40)) | ((((long) (local7_life31)[3]) & 255L) << 32)) | ((((long) (local7_life31)[4]) & 255L) << 24)) | ((((long) (local7_life31)[5]) & 255L) << 16)) | ((((long) (local7_life31)[6]) & 255L) << 8)) | (((long) (local7_life31)[7]) & 255L));
        byte[] __sourceSpill777_35 = new byte[8];
        (__sourceSpill777_35)[0] = ((byte) ((int) (local8_life34 >>> 56)));
        (__sourceSpill777_35)[1] = ((byte) ((int) (local8_life34 >>> 48)));
        (__sourceSpill777_35)[2] = ((byte) ((int) (local8_life34 >>> 40)));
        (__sourceSpill777_35)[3] = ((byte) ((int) (local8_life34 >>> 32)));
        (__sourceSpill777_35)[4] = ((byte) ((int) (local8_life34 >>> 24)));
        (__sourceSpill777_35)[5] = ((byte) ((int) (local8_life34 >>> 16)));
        (__sourceSpill777_35)[6] = ((byte) ((int) (local8_life34 >>> 8)));
        (__sourceSpill777_35)[7] = ((byte) ((int) local8_life34));
        javax.crypto.Cipher __sourceSpill777_36 = local0_life11;
        byte[] local10_life38 = ((javax.crypto.Cipher)(__sourceSpill777_36)).doFinal(((byte[])(__sourceSpill777_35)));
        (__sourceSpill777_32)[__sourceSpill777_33] = (((((((((((long) (local10_life38)[0]) & 255L) << 56) | ((((long) (local10_life38)[1]) & 255L) << 48)) | ((((long) (local10_life38)[2]) & 255L) << 40)) | ((((long) (local10_life38)[3]) & 255L) << 32)) | ((((long) (local10_life38)[4]) & 255L) << 24)) | ((((long) (local10_life38)[5]) & 255L) << 16)) | ((((long) (local10_life38)[6]) & 255L) << 8)) | (((long) (local10_life38)[7]) & 255L));
    } while ((!(local2_life26 >= local5_life25)));
    m = ((long[])(local6_life21));
    n = ((java.lang.Integer[])(new java.lang.Integer[2]));
    DOWN = ((moom.bs)(new moom.bs("DOWN", 0, 0, 1, -1, "down", net.minecraft.util.EnumFacing$AxisDirection.NEGATIVE, net.minecraft.util.EnumFacing$Axis.Y, new moom.DS(0, -1, 0))));
    UP = ((moom.bs)(new moom.bs("UP", 1, 1, 0, -1, "up", net.minecraft.util.EnumFacing$AxisDirection.POSITIVE, net.minecraft.util.EnumFacing$Axis.Y, new moom.DS(0, 1, 0))));
    NORTH = ((moom.bs)(new moom.bs("NORTH", 2, 2, 3, 2, "north", net.minecraft.util.EnumFacing$AxisDirection.NEGATIVE, net.minecraft.util.EnumFacing$Axis.Z, new moom.DS(0, 0, -1))));
    SOUTH = ((moom.bs)(new moom.bs("SOUTH", 3, 3, 2, 0, "south", net.minecraft.util.EnumFacing$AxisDirection.POSITIVE, net.minecraft.util.EnumFacing$Axis.Z, new moom.DS(0, 0, 1))));
    WEST = ((moom.bs)(new moom.bs("WEST", 4, 4, 5, 1, "west", net.minecraft.util.EnumFacing$AxisDirection.NEGATIVE, net.minecraft.util.EnumFacing$Axis.X, new moom.DS(-1, 0, 0))));
    EAST = ((moom.bs)(new moom.bs("EAST", 5, 5, 4, 3, "east", net.minecraft.util.EnumFacing$AxisDirection.POSITIVE, net.minecraft.util.EnumFacing$Axis.X, new moom.DS(1, 0, 0))));
    j = ((moom.bs[])(moom.bs.a__Arraybs()));
    VALUES = ((moom.bs[])(new moom.bs[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite777_61(89, (6708715129749088498L ^ local11_life6))]));
    h = ((moom.bs[])(new moom.bs[4]));
    i = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    moom.bs[] local13_life67 = moom.bs.values();
    int local14_life68 = (local13_life67).length;
    int local15_life69 = 0;
    while ((local15_life69 < local14_life68)) {
        moom.bs local16_life70 = (local13_life67)[local15_life69];
        (moom.bs.VALUES)[((moom.bs)(local16_life70)).a] = local16_life70;
        if (((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(local16_life70)).a__bt())).b__Boolean()) {
        (moom.bs.h)[((moom.bs)(local16_life70)).c] = local16_life70;
    }
        ((java.util.Map)(moom.bs.i)).put(((java.lang.Object)(((java.lang.String)(((moom.bs)(local16_life70)).b__String())).toLowerCase())), ((java.lang.Object)(local16_life70)));
        local15_life69 += 1;
    }
}


public java.lang.String toString() {
return this.d;
}


public static moom.bs[] values() {
return ((moom.bs[])(((moom.bs[])(moom.bs.j)).clone()));
}


public static moom.bs valueOf(java.lang.String p0) {
return ((moom.bs)(java.lang.Enum.valueOf(((java.lang.Class)(moom.bs.class)), ((java.lang.String)(p0)))));
}


public moom.bs b__bs() {
long local1 = (moom.bs.l ^ 8289379958884L);
    switch ((net.minecraft.util.EnumFacing$1.b)[((moom.bs)(this)).ordinal()]) {
case 1:
{
        return moom.bs.EAST;
    }
case 2:
{
        return moom.bs.SOUTH;
    }
case 3:
{
        return moom.bs.WEST;
    }
case 4:
{
        return moom.bs.NORTH;
    }
default:
{
        throw new java.lang.IllegalStateException(__sourceIntrinsic_80be347ced70_invokedynamic5872_7(this));
    }
}
}


public java.lang.String b__String() {
return this.d;
}


public static int[] b__ArrayInt() {
return moom.bs.k;
}


public int b() {
return this.c;
}


public static moom.bs b(int p0) {
return (moom.bs.h)[moom.Dr.a(((int)((p0 % (moom.bs.h).length))))];
}


public static void b(int[] p0) {
k = ((int[])(p0));
    return;
}


public moom.bs e__bs() {
long local1 = (moom.bs.l ^ 25965973597475L);
    switch ((net.minecraft.util.EnumFacing$1.b)[((moom.bs)(this)).ordinal()]) {
case 1:
{
        return moom.bs.WEST;
    }
case 2:
{
        return moom.bs.NORTH;
    }
case 3:
{
        return moom.bs.EAST;
    }
case 4:
{
        return moom.bs.SOUTH;
    }
default:
{
        throw new java.lang.IllegalStateException(__sourceIntrinsic_d2b382e7a7cd_invokedynamic5873_7(this));
    }
}
}


public int e() {
moom.bs forwardValue2994_13_0;
    int forwardValue2994_17_0;
    moom.bs spill2994_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (moom.bs.l ^ 16491514289624L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill2994_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue2994_13_0 = spill2994_0;
        break forward_join_13;
    }
    if (!((((moom.bs)(spill2994_0)).e == net.minecraft.util.EnumFacing$Axis.Z))) {
        break forward_join_16;
    }
    forwardValue2994_13_0 = this;
    }
    forwardValue2994_17_0 = ((net.minecraft.util.EnumFacing$AxisDirection)(((moom.bs)(forwardValue2994_13_0)).f)).a();
    break forward_join_17;
    }
    forwardValue2994_17_0 = 0;
    }
    return forwardValue2994_17_0;
}


private moom.bs c__bs() {
long local1 = (moom.bs.l ^ 57366058700223L);
    switch ((net.minecraft.util.EnumFacing$1.b)[((moom.bs)(this)).ordinal()]) {
case 1:
{
        return moom.bs.DOWN;
    }
case 2:
case 4:
default:
{
        throw new java.lang.IllegalStateException(__sourceIntrinsic_a18908bf2865_invokedynamic5875_4(this));
    }
case 3:
{
        return moom.bs.UP;
    }
case 5:
{
        return moom.bs.NORTH;
    }
case 6:
{
        return moom.bs.SOUTH;
    }
}
}


public int c() {
moom.bs forwardValue2992_13_0;
    int forwardValue2992_17_0;
    moom.bs spill2992_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (moom.bs.l ^ 63573831578819L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill2992_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue2992_13_0 = spill2992_0;
        break forward_join_13;
    }
    if (!((((moom.bs)(spill2992_0)).e == net.minecraft.util.EnumFacing$Axis.X))) {
        break forward_join_16;
    }
    forwardValue2992_13_0 = this;
    }
    forwardValue2992_17_0 = ((net.minecraft.util.EnumFacing$AxisDirection)(((moom.bs)(forwardValue2992_13_0)).f)).a();
    break forward_join_17;
    }
    forwardValue2992_17_0 = 0;
    }
    return forwardValue2992_17_0;
}


public int d() {
moom.bs forwardValue2993_13_0;
    int forwardValue2993_17_0;
    moom.bs spill2993_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (moom.bs.l ^ 8601643108330L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill2993_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue2993_13_0 = spill2993_0;
        break forward_join_13;
    }
    if (!((((moom.bs)(spill2993_0)).e == net.minecraft.util.EnumFacing$Axis.Y))) {
        break forward_join_16;
    }
    forwardValue2993_13_0 = this;
    }
    forwardValue2993_17_0 = ((net.minecraft.util.EnumFacing$AxisDirection)(((moom.bs)(forwardValue2993_13_0)).f)).a();
    break forward_join_17;
    }
    forwardValue2993_17_0 = 0;
    }
    return forwardValue2993_17_0;
}


private moom.bs d__bs() {
long local1 = (moom.bs.l ^ 138170990411782L);
    switch ((net.minecraft.util.EnumFacing$1.b)[((moom.bs)(this)).ordinal()]) {
case 2:
{
        return moom.bs.DOWN;
    }
case 3:
default:
{
        throw new java.lang.IllegalStateException(__sourceIntrinsic_bbee9f3d7cf9_invokedynamic5878_4(this));
    }
case 4:
{
        return moom.bs.UP;
    }
case 5:
{
        return moom.bs.EAST;
    }
case 6:
{
        return moom.bs.WEST;
    }
}
}


public moom.DS a__DS() {
return this.g;
}


public static moom.bs a(net.minecraft.util.EnumFacing$AxisDirection p0, net.minecraft.util.EnumFacing$Axis p1) {
moom.bs lexicalValue1062_33_0;
    boolean spill1062_0;
    moom.bs spill1062_1;
    long life2_3;
    moom.bs[] life5_6;
    int life4_7;
    int life6_10;
    int life7_12;
    moom.bs life8_19;
    lexical_join_37: {
    life2_3 = (moom.bs.l ^ 114905161778385L);
    spill1062_0 = moom.DS.c__Boolean();
    life5_6 = moom.bs.values();
    life4_7 = ((spill1062_0) ? 1 : 0);
    life6_10 = (life5_6).length;
    life7_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life7_12 < life6_10))) {
        break lexical_join_37;
    }
    life8_19 = (life5_6)[life7_12];
    if (!((life4_7 != 0))) {
        break lexical_join_35;
    }
    if (!((((moom.bs)(life8_19)).a__bu() == p0))) {
        break lexical_join_34;
    }
    spill1062_1 = life8_19;
    if (!((life4_7 != 0))) {
        lexicalValue1062_33_0 = spill1062_1;
        break lexical_join_33;
    }
    if (!((((moom.bs)(spill1062_1)).a__bt() == p1))) {
        break lexical_join_34;
    }
    lexicalValue1062_33_0 = life8_19;
    }
    return lexicalValue1062_33_0;
    }
    life7_12 += 1;
    }
    if (!((life4_7 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_5a67cce7eac6_invokedynamic1062_6(p0, p1));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6994_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/bs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
return this.d;
}


private static java.lang.IllegalStateException a(java.lang.IllegalStateException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14857;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/bs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.bs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.bs[] a__Arraybs() {
long local0_life1 = (moom.bs.l ^ 64214746355260L);
    moom.bs[] __sourceSharedArray772_4 = new moom.bs[__sourceIntrinsic_a6dd2a60df03_originalDynamicSite772_2(18585, (4160309276913672045L ^ local0_life1))];
    __sourceSharedArray772_4[0] = moom.bs.DOWN;
    __sourceSharedArray772_4[1] = moom.bs.UP;
    __sourceSharedArray772_4[2] = moom.bs.NORTH;
    __sourceSharedArray772_4[3] = moom.bs.SOUTH;
    __sourceSharedArray772_4[4] = moom.bs.WEST;
    __sourceSharedArray772_4[5] = moom.bs.EAST;
    return __sourceSharedArray772_4;
}


public net.minecraft.util.EnumFacing$Axis a__bt() {
return this.e;
}


public moom.bs a(net.minecraft.util.EnumFacing$Axis p0) {
moom.bs forwardValue313_25_0;
    moom.bs forwardValue313_40_0;
    moom.bs forwardValue313_55_0;
    moom.bs spill313_0;
    moom.bs spill313_1;
    moom.bs spill313_2;
    moom.bs spill313_3;
    moom.bs spill313_4;
    moom.bs spill313_5;
    long life2_3;
    int life4_5;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_11: {
    life2_3 = (moom.bs.l ^ 130495386280397L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    switch ((net.minecraft.util.EnumFacing$1.a)[((net.minecraft.util.EnumFacing$Axis)(p0)).ordinal()]) {
case 1:
{
        break forward_join_11;
    }
case 2:
{
        break forward_join_26;
    }
case 3:
{
        break forward_join_41;
    }
default:
{
        break forward_join_56;
    }
}
    }
    spill313_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_25_0 = spill313_0;
        break forward_join_25;
    }
    if (!((spill313_0 != moom.bs.WEST))) {
        break forward_join_24;
    }
    spill313_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_25_0 = spill313_1;
        break forward_join_25;
    }
    if (!((spill313_1 != moom.bs.EAST))) {
        break forward_join_24;
    }
    return ((moom.bs)(this)).c__bs();
    }
    forwardValue313_25_0 = this;
    }
    return forwardValue313_25_0;
    }
    spill313_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_40_0 = spill313_2;
        break forward_join_40;
    }
    if (!((spill313_2 != moom.bs.UP))) {
        break forward_join_39;
    }
    spill313_3 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_40_0 = spill313_3;
        break forward_join_40;
    }
    if (!((spill313_3 != moom.bs.DOWN))) {
        break forward_join_39;
    }
    return ((moom.bs)(this)).b__bs();
    }
    forwardValue313_40_0 = this;
    }
    return forwardValue313_40_0;
    }
    spill313_4 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_55_0 = spill313_4;
        break forward_join_55;
    }
    if (!((spill313_4 != moom.bs.NORTH))) {
        break forward_join_54;
    }
    spill313_5 = this;
    if (!((life4_5 != 0))) {
        forwardValue313_55_0 = spill313_5;
        break forward_join_55;
    }
    if (!((spill313_5 != moom.bs.SOUTH))) {
        break forward_join_54;
    }
    return ((moom.bs)(this)).d__bs();
    }
    forwardValue313_55_0 = this;
    }
    return forwardValue313_55_0;
    }
    throw new java.lang.IllegalStateException(__sourceIntrinsic_933a38e12dfa_invokedynamic313_14(p0));
}


public moom.bs a__bs() {
return (moom.bs.VALUES)[this.b];
}


public net.minecraft.util.EnumFacing$AxisDirection a__bu() {
return this.f;
}


public int a() {
return this.a;
}


public static moom.bs a(float p0, float p1, float p2) {
moom.bs lexicalValue1061_61_0;
    boolean spill1061_0;
    moom.bs spill1061_1;
    long life3_3;
    moom.bs life6_6;
    float life7_8;
    moom.bs[] life8_10;
    int life5_11;
    int life9_14;
    int life10_16;
    moom.bs life11_25;
    float life12_46;
    lexical_join_61: {
    lexical_join_60: {
    life3_3 = (moom.bs.l ^ 93052720276828L);
    spill1061_0 = moom.DS.b__Boolean();
    life6_6 = null;
    life7_8 = 0x0.000002p-126f;
    life8_10 = moom.bs.values();
    life5_11 = ((spill1061_0) ? 1 : 0);
    life9_14 = (life8_10).length;
    life10_16 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_58: {
    lexical_join_57: {
    if (!((life10_16 < life9_14))) {
        break lexical_join_60;
    }
    spill1061_1 = (life8_10)[life10_16];
    if (!((life5_11 == 0))) {
        lexicalValue1061_61_0 = spill1061_1;
        break lexical_join_61;
    }
    life11_25 = spill1061_1;
    life12_46 = (((p0 * ((float) ((moom.DS)(((moom.bs)(life11_25)).g)).a())) + (p1 * ((float) ((moom.DS)(((moom.bs)(life11_25)).g)).b()))) + (p2 * ((float) ((moom.DS)(((moom.bs)(life11_25)).g)).c())));
    if (!((life5_11 == 0))) {
        break lexical_join_58;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life12_46)), ((float)(life7_8))) > 0))) {
        break lexical_join_57;
    }
    life7_8 = life12_46;
    life6_6 = life11_25;
    }
    life10_16 += 1;
    }
    if (!((life5_11 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    lexicalValue1061_61_0 = life6_6;
    }
    return lexicalValue1061_61_0;
}


public static moom.bs a(java.util.Random p0) {
return (moom.bs.values())[((java.util.Random)(p0)).nextInt(((int)((moom.bs.values()).length)))];
}


public static moom.bs a(double p0) {
return moom.bs.b(((int)((moom.Dr.b__Int(((double)(((p0 / 0x1.68p6d) + 0x1.0p-1d)))) & 3))));
}


public static moom.bs a(int p0) {
return (moom.bs.VALUES)[moom.Dr.a(((int)((p0 % (moom.bs.VALUES).length))))];
}


public static moom.bs a(java.lang.String p0) {
java.lang.Object forwardValue2989_16_0;
    moom.bs forwardValue2989_17_0;
    java.lang.String spill2989_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (moom.bs.l ^ 102243368609871L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill2989_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue2989_16_0 = spill2989_0;
        break forward_join_16;
    }
    if (!((spill2989_0 == null))) {
        break forward_join_12;
    }
    forwardValue2989_17_0 = null;
    break forward_join_17;
    }
    forwardValue2989_16_0 = ((java.util.Map)(moom.bs.i)).get(((java.lang.Object)(((java.lang.String)(p0)).toLowerCase())));
    }
    forwardValue2989_17_0 = ((moom.bs)(forwardValue2989_16_0));
    }
    return forwardValue2989_17_0;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite777_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6994_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_933a38e12dfa_invokedynamic313_14(net.minecraft.util.EnumFacing$Axis a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5a67cce7eac6_invokedynamic1062_6(net.minecraft.util.EnumFacing$AxisDirection a0, net.minecraft.util.EnumFacing$Axis a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a6dd2a60df03_originalDynamicSite772_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_80be347ced70_invokedynamic5872_7(moom.bs a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a18908bf2865_invokedynamic5875_4(moom.bs a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_bbee9f3d7cf9_invokedynamic5878_4(moom.bs a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d2b382e7a7cd_invokedynamic5873_7(moom.bs a0) throws E;
}
