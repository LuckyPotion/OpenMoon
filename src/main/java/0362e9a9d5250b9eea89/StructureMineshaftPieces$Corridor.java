package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StructureMineshaftPieces$Corridor extends moom.G4 {

private boolean e;

private boolean f;

private boolean g;

private int h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public StructureMineshaftPieces$Corridor() {
super();
}


public StructureMineshaftPieces$Corridor(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) { super(0); }

private static void __sourceConstructorBody_dce707f1976df89e(net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor receiver, int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) throws Throwable {
net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_23_0;
    int forwardValue583_23_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_24_0;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_25_0;
    int forwardValue583_25_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_39_0;
    int forwardValue583_39_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_43_0;
    int forwardValue583_43_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_44_0;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_45_0;
    int forwardValue583_45_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forwardValue583_67_0;
    net.minecraft.entity.Entity[] spill583_0;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill583_1;
    int spill583_2;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill583_3;
    boolean spill583_4;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill583_5;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill583_6;
    long life5_3;
    net.minecraft.entity.Entity[] life7_14;
    forward_join_72: {
    forward_join_67: {
    forward_join_66: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life5_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 40613878001671L);
    spill583_0 = moom.G4.b();
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.__sourceConstructorInit_dce707f1976df89e_0(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(receiver)), ((int)(p0)));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(receiver)).b = ((moom.bs)(p3));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(receiver)).a = ((moom.G2)(p2));
    life7_14 = spill583_0;
    spill583_1 = receiver;
    spill583_2 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    if (!((life7_14 != null))) {
        forwardValue583_23_0 = spill583_1;
        forwardValue583_23_1 = spill583_2;
        break forward_join_23;
    }
    if (!((spill583_2 == 0))) {
        forwardValue583_24_0 = spill583_1;
        break forward_join_24;
    }
    forwardValue583_23_0 = spill583_1;
    forwardValue583_23_1 = 1;
    }
    forwardValue583_25_0 = forwardValue583_23_0;
    forwardValue583_25_1 = forwardValue583_23_1;
    break forward_join_25;
    }
    forwardValue583_25_0 = forwardValue583_24_0;
    forwardValue583_25_1 = 0;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(forwardValue583_25_0)).e = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue583_25_1)));
    spill583_3 = receiver;
    spill583_4 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(receiver)).e;
    if (!((life7_14 != null))) {
        forwardValue583_39_0 = spill583_3;
        forwardValue583_39_1 = ((spill583_4) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill583_4))) {
        forwardValue583_44_0 = spill583_3;
        break forward_join_44;
    }
    forwardValue583_39_0 = spill583_3;
    forwardValue583_39_1 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_dce707f1976df89e_invokedynamic583_9(12928, (1118666570006399833L ^ life5_3)))));
    }
    if (!((life7_14 != null))) {
        forwardValue583_43_0 = forwardValue583_39_0;
        forwardValue583_43_1 = forwardValue583_39_1;
        break forward_join_43;
    }
    if (!((forwardValue583_39_1 == 0))) {
        forwardValue583_44_0 = forwardValue583_39_0;
        break forward_join_44;
    }
    forwardValue583_43_0 = forwardValue583_39_0;
    forwardValue583_43_1 = 1;
    }
    forwardValue583_45_0 = forwardValue583_43_0;
    forwardValue583_45_1 = forwardValue583_43_1;
    break forward_join_45;
    }
    forwardValue583_45_0 = forwardValue583_44_0;
    forwardValue583_45_1 = 0;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(forwardValue583_45_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue583_45_1)));
    spill583_5 = receiver;
    if (!((life7_14 != null))) {
        forwardValue583_67_0 = spill583_5;
        break forward_join_67;
    }
    if (!((((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill583_5)).b != moom.bs.NORTH))) {
        break forward_join_66;
    }
    spill583_6 = receiver;
    if (!((life7_14 != null))) {
        forwardValue583_67_0 = spill583_6;
        break forward_join_67;
    }
    if (!((((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill583_6)).b != moom.bs.SOUTH))) {
        break forward_join_66;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(receiver)).h = ((int)((((moom.G2)(p2)).a() / 5)));
    if (!((life7_14 == null))) {
        break forward_join_72;
    }
    }
    forwardValue583_67_0 = receiver;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(forwardValue583_67_0)).h = ((int)((((moom.G2)(p2)).c() / 5)));
    }
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-4610633305406312239L)), ((long)(-6124883524007808844L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(211062760685849L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 74015232589667L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1956_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1956_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1956_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1956_14 = new byte[8];
    (__sourceSpill1956_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1956_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1956_16 = __sourceSpill1956_14;
    ((javax.crypto.Cipher)(__sourceSpill1956_11)).init(((int)(__sourceSpill1956_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1956_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1956_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "bKc\025VÚ[I\fW=\024N"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1956_25 = local6_life21;
        int __sourceSpill1956_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1956_25)).substring(((int)(__sourceSpill1956_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1956_30 = local8_life19;
        int __sourceSpill1956_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1956_33 = new byte[8];
        (__sourceSpill1956_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1956_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1956_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1956_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1956_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1956_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1956_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1956_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1956_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1956_34)).doFinal(((byte[])(__sourceSpill1956_33)));
        (__sourceSpill1956_30)[__sourceSpill1956_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "{I^bß±\007\177Êxï,·¿å"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1956_38 = local6_life21;
        int __sourceSpill1956_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1956_38)).substring(((int)(__sourceSpill1956_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1956_43 = local8_life19;
        int __sourceSpill1956_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1956_46 = new byte[8];
        (__sourceSpill1956_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1956_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1956_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1956_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1956_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1956_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1956_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1956_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1956_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1956_47)).doFinal(((byte[])(__sourceSpill1956_46)));
        (__sourceSpill1956_43)[__sourceSpill1956_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dce707f1976df89e_0(net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor a0, int a1) throws E;

protected void b(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hr")))));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("sc")))));
    this.g = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hps")))));
    this.h = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Num")))));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_b4e341f40f1d0b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21017;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/G9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12720_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/G9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hr")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.e) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("sc")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hps")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Num")), ((int)(this.h)));
    return;
}


public static moom.G2 a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5) {
int forestValue730_103_0;
    moom.G2 forestValue730_107_0;
    net.minecraft.entity.Entity[] spill730_0;
    int spill730_1;
    long life6_3;
    moom.G2 life9_16;
    net.minecraft.entity.Entity[] life8_17;
    int life10_23;
    int life11_29;
    forest_join_107: {
    forest_join_106: {
    forest_join_103: {
    forest_join_102: {
    life6_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 51202818113335L);
    spill730_0 = moom.G4.b();
    life9_16 = new moom.G2(p2, p3, p4, p2, (p3 + 2), p4);
    life8_17 = spill730_0;
    life10_23 = (((java.util.Random)(p1)).nextInt(((int)(3))) + 2);
    forest_cycle_24: while (true) {
    forest_join_99: {
    forest_join_93: {
    forest_join_81: {
    forest_join_67: {
    forest_join_53: {
    forest_join_51: {
    forest_join_39: {
    if (!((life10_23 > 0))) {
        break forest_join_102;
    }
    life11_29 = (life10_23 * 5);
    if (!((life8_17 != null))) {
        break forest_join_51;
    }
    spill730_1 = (moom.Ic.a)[((moom.bs)(p5)).ordinal()];
    if (!((life8_17 != null))) {
        forestValue730_103_0 = spill730_1;
        break forest_join_103;
    }
    switch (spill730_1) {
case 1:
{
        break forest_join_39;
    }
case 2:
{
        break forest_join_53;
    }
case 3:
{
        break forest_join_67;
    }
case 4:
{
        break forest_join_81;
    }
default:
{
        break forest_join_93;
    }
}
    }
    ((moom.G2)(life9_16)).d = ((int)((p2 + 2)));
    ((moom.G2)(life9_16)).c = ((int)((p4 - (life11_29 - 1))));
    }
    if (!((life8_17 == null))) {
        break forest_join_93;
    }
    }
    ((moom.G2)(life9_16)).d = ((int)((p2 + 2)));
    ((moom.G2)(life9_16)).f = ((int)((p4 + (life11_29 - 1))));
    if (!((life8_17 == null))) {
        break forest_join_93;
    }
    }
    ((moom.G2)(life9_16)).a = ((int)((p2 - (life11_29 - 1))));
    ((moom.G2)(life9_16)).f = ((int)((p4 + 2)));
    if (!((life8_17 == null))) {
        break forest_join_93;
    }
    }
    ((moom.G2)(life9_16)).d = ((int)((p2 + (life11_29 - 1))));
    ((moom.G2)(life9_16)).f = ((int)((p4 + 2)));
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p0)), ((moom.G2)(life9_16))) == null))) {
        break forest_join_99;
    }
    if (!((life8_17 == null))) {
        break forest_join_102;
    }
    }
    life10_23 += -1;
    if (!((life8_17 == null))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    }
    forestValue730_103_0 = life10_23;
    }
    if (!((forestValue730_103_0 > 0))) {
        break forest_join_106;
    }
    forestValue730_107_0 = life9_16;
    break forest_join_107;
    }
    forestValue730_107_0 = null;
    }
    return forestValue730_107_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
int forestValue731_58_0;
    int forestValue731_58_1;
    int forestValue731_145_0;
    int forestValue731_145_1;
    int forestValue731_236_0;
    int forestValue731_236_1;
    int forestValue731_323_0;
    int forestValue731_323_1;
    int forestValue731_379_0;
    int forestValue731_441_0;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forestValue731_467_0;
    int forestValue731_508_0;
    net.minecraft.entity.Entity[] spill731_0;
    int spill731_1;
    int spill731_2;
    int spill731_3;
    int spill731_4;
    int spill731_5;
    int spill731_6;
    int spill731_7;
    int spill731_8;
    int spill731_9;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill731_10;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill731_11;
    int spill731_12;
    int spill731_13;
    long life4_3;
    int life7_7;
    net.minecraft.entity.Entity[] life6_8;
    int life8_12;
    int life9_431;
    int life10_442;
    int life9_506;
    int life10_517;
    forest_join_531: {
    forest_join_467: {
    forest_join_466: {
    forest_join_464: {
    forest_join_379: {
    forest_join_378: {
    forest_join_352: {
    forest_join_323: {
    forest_join_321: {
    forest_join_289: {
    forest_join_263: {
    forest_join_236: {
    forest_join_234: {
    forest_join_202: {
    forest_join_174: {
    forest_join_145: {
    forest_join_143: {
    forest_join_111: {
    forest_join_85: {
    forest_join_58: {
    forest_join_56: {
    forest_join_24: {
    life4_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 120886111285800L);
    spill731_0 = moom.G4.b();
    life7_7 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a();
    life6_8 = spill731_0;
    life8_12 = ((java.util.Random)(p2)).nextInt(((int)(4)));
    if (!((this.b != null))) {
        break forest_join_378;
    }
    spill731_1 = (moom.Ic.a)[((moom.bs)(this.b)).ordinal()];
    if (!((life6_8 != null))) {
        forestValue731_379_0 = spill731_1;
        break forest_join_379;
    }
    switch (spill731_1) {
case 1:
{
        break forest_join_24;
    }
case 2:
{
        break forest_join_111;
    }
case 3:
{
        break forest_join_202;
    }
case 4:
{
        break forest_join_289;
    }
default:
{
        break forest_join_378;
    }
}
    }
    spill731_2 = life8_12;
    spill731_3 = 1;
    if (!((life6_8 != null))) {
        forestValue731_58_0 = spill731_2;
        forestValue731_58_1 = spill731_3;
        break forest_join_58;
    }
    if (!((spill731_2 <= spill731_3))) {
        break forest_join_56;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(this.b)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    forestValue731_58_0 = life8_12;
    forestValue731_58_1 = 2;
    }
    if (!((forestValue731_58_0 == forestValue731_58_1))) {
        break forest_join_85;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)(((moom.G2)(this.a)).c)), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)(((moom.G2)(this.a)).c)), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    spill731_4 = life8_12;
    spill731_5 = 1;
    if (!((life6_8 != null))) {
        forestValue731_145_0 = spill731_4;
        forestValue731_145_1 = spill731_5;
        break forest_join_145;
    }
    if (!((spill731_4 <= spill731_5))) {
        break forest_join_143;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(this.b)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    forestValue731_145_0 = life8_12;
    forestValue731_145_1 = 2;
    }
    if (!((forestValue731_145_0 == forestValue731_145_1))) {
        break forest_join_174;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).f - 3))), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).f - 3))), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    spill731_6 = life8_12;
    spill731_7 = 1;
    if (!((life6_8 != null))) {
        forestValue731_236_0 = spill731_6;
        forestValue731_236_1 = spill731_7;
        break forest_join_236;
    }
    if (!((spill731_6 <= spill731_7))) {
        break forest_join_234;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)(((moom.G2)(this.a)).c)), ((moom.bs)(this.b)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    forestValue731_236_0 = life8_12;
    forestValue731_236_1 = 2;
    }
    if (!((forestValue731_236_0 == forestValue731_236_1))) {
        break forest_join_263;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(this.a)).a)), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    spill731_8 = life8_12;
    spill731_9 = 1;
    if (!((life6_8 != null))) {
        forestValue731_323_0 = spill731_8;
        forestValue731_323_1 = spill731_9;
        break forest_join_323;
    }
    if (!((spill731_8 <= spill731_9))) {
        break forest_join_321;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)(((moom.G2)(this.a)).c)), ((moom.bs)(this.b)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    forestValue731_323_0 = life8_12;
    forestValue731_323_1 = 2;
    }
    if (!((forestValue731_323_0 == forestValue731_323_1))) {
        break forest_join_352;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d - 3))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forest_join_378;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d - 3))), ((int)(((((moom.G2)(this.a)).b - 1) + ((java.util.Random)(p2)).nextInt(((int)(3)))))), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    }
    forestValue731_379_0 = life7_7;
    }
    if (!((forestValue731_379_0 < __sourceIntrinsic_0f75cc6dd3c5_invokedynamic731_116(25671, (3683755328548970416L ^ life4_3))))) {
        break forest_join_531;
    }
    spill731_10 = this;
    if (!((life6_8 != null))) {
        forestValue731_467_0 = spill731_10;
        break forest_join_467;
    }
    if (!((((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill731_10)).b != moom.bs.NORTH))) {
        break forest_join_466;
    }
    spill731_11 = this;
    if (!((life6_8 != null))) {
        forestValue731_467_0 = spill731_11;
        break forest_join_467;
    }
    if (!((((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill731_11)).b != moom.bs.SOUTH))) {
        break forest_join_466;
    }
    life9_431 = (((moom.G2)(this.a)).a + 3);
    forest_cycle_403: while (true) {
    forest_join_461: {
    forest_join_441: {
    forest_join_440: {
    if (!(((life9_431 + 3) <= ((moom.G2)(this.a)).d))) {
        break forest_join_464;
    }
    life10_442 = ((java.util.Random)(p2)).nextInt(((int)(5)));
    if (!((life6_8 != null))) {
        break forest_join_531;
    }
    spill731_12 = life10_442;
    if (!((life6_8 != null))) {
        forestValue731_441_0 = spill731_12;
        break forest_join_441;
    }
    if (!((spill731_12 == 0))) {
        break forest_join_440;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life9_431)), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)((life7_7 + 1))));
    if (!((life6_8 == null))) {
        break forest_join_461;
    }
    }
    forestValue731_441_0 = life10_442;
    }
    if (!((forestValue731_441_0 == 1))) {
        break forest_join_461;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(life9_431)), ((int)(((moom.G2)(this.a)).b)), ((int)((((moom.G2)(this.a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)((life7_7 + 1))));
    }
    life9_431 += 5;
    if (!((life6_8 == null))) {
        continue forest_cycle_403;
    }
    break forest_cycle_403;
    }
    }
    if (!((life6_8 == null))) {
        break forest_join_531;
    }
    }
    forestValue731_467_0 = this;
    }
    life9_506 = (((moom.G2)(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(forestValue731_467_0)).a)).c + 3);
    forest_cycle_472: while (true) {
    forest_join_528: {
    forest_join_508: {
    forest_join_507: {
    if (!(((life9_506 + 3) <= ((moom.G2)(this.a)).f))) {
        break forest_join_531;
    }
    life10_517 = ((java.util.Random)(p2)).nextInt(((int)(5)));
    spill731_13 = life10_517;
    if (!((life6_8 != null))) {
        forestValue731_508_0 = spill731_13;
        break forest_join_508;
    }
    if (!((spill731_13 == 0))) {
        break forest_join_507;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).a - 1))), ((int)(((moom.G2)(this.a)).b)), ((int)(life9_506)), ((moom.bs)(moom.bs.WEST)), ((int)((life7_7 + 1))));
    if (!((life6_8 == null))) {
        break forest_join_528;
    }
    }
    forestValue731_508_0 = life10_517;
    }
    if (!((forestValue731_508_0 == 1))) {
        break forest_join_528;
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(this.a)).d + 1))), ((int)(((moom.G2)(this.a)).b)), ((int)(life9_506)), ((moom.bs)(moom.bs.EAST)), ((int)((life7_7 + 1))));
    }
    life9_506 += 5;
    if (!((life6_8 == null))) {
        continue forest_cycle_472;
    }
    break forest_cycle_472;
    }
    }
    return;
}


protected boolean a(net.minecraft.world.World p0, moom.G2 p1, java.util.Random p2, int p3, int p4, int p5, java.util.List<moom.D5> p6, int p7) {
int forwardValue5842_40_0;
    int forwardValue5842_42_0;
    int forwardValue5842_89_0;
    net.minecraft.entity.Entity[] spill5842_0;
    boolean spill5842_1;
    boolean spill5842_2;
    long life9_3;
    moom.DT life12_19;
    net.minecraft.entity.Entity[] life11_20;
    int life13_54;
    moom.tF life14_88;
    forward_join_89: {
    forward_join_88: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life9_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 47830129367628L);
    spill5842_0 = moom.G4.b();
    life12_19 = new moom.DT(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((int)(p3)), ((int)(p5))), ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((int)(p4))), ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).b(((int)(p3)), ((int)(p5))));
    life11_20 = spill5842_0;
    spill5842_1 = ((moom.G2)(p1)).a(((moom.DS)(life12_19)));
    if (!((life11_20 != null))) {
        forwardValue5842_89_0 = ((spill5842_1) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill5842_1)) {
        break forward_join_88;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life12_19))))).a__ch())).a__fn() == moom.fn.a))) {
        break forward_join_88;
    }
    spill5842_2 = ((java.util.Random)(p2)).nextBoolean();
    if (!((life11_20 != null))) {
        forwardValue5842_40_0 = ((spill5842_2) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill5842_2)) {
        break forward_join_41;
    }
    forwardValue5842_40_0 = 1;
    }
    forwardValue5842_42_0 = forwardValue5842_40_0;
    break forward_join_42;
    }
    forwardValue5842_42_0 = 0;
    }
    life13_54 = forwardValue5842_42_0;
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_19)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)).b__fE(((int)(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)), ((int)(life13_54)))))))), ((int)(2)));
    life14_88 = new moom.tF(p0, ((double) (((float) ((moom.DT)(life12_19)).a()) + 0x1.0p-1f)), ((double) (((float) ((moom.DT)(life12_19)).b()) + 0x1.0p-1f)), ((double) (((float) ((moom.DT)(life12_19)).c()) + 0x1.0p-1f)));
    moom.D5.a(((java.util.Random)(p2)), ((java.util.List)(p6)), ((net.minecraft.inventory.IInventory)(life14_88)), ((int)(p7)));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life14_88)));
    return ((1) != 0);
    }
    forwardValue5842_89_0 = 0;
    }
    return ((forwardValue5842_89_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue900112_16_0;
    int forestValue900112_85_0;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor forestValue900112_180_0;
    net.minecraft.world.World forestValue900112_180_1;
    moom.G2 forestValue900112_180_2;
    int forestValue900112_180_3;
    int forestValue900112_180_4;
    int forestValue900112_180_5;
    int forestValue900112_180_6;
    int forestValue900112_180_7;
    int forestValue900112_180_8;
    net.minecraft.block.state.IBlockState forestValue900112_180_9;
    net.minecraft.block.state.IBlockState forestValue900112_180_10;
    int forestValue900112_180_11;
    int forestValue900112_358_0;
    int forestValue900112_389_0;
    int forestValue900112_394_0;
    int forestValue900112_400_0;
    int forestValue900112_460_0;
    int forestValue900112_509_0;
    net.minecraft.block.state.IBlockState forestValue900112_555_0;
    int forestValue900112_598_0;
    boolean spill900112_0;
    boolean spill900112_1;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill900112_2;
    net.minecraft.world.World spill900112_3;
    moom.G2 spill900112_4;
    int spill900112_5;
    int spill900112_6;
    int spill900112_7;
    int spill900112_8;
    int spill900112_9;
    int spill900112_10;
    net.minecraft.block.state.IBlockState spill900112_11;
    net.minecraft.block.state.IBlockState spill900112_12;
    int spill900112_13;
    int spill900112_14;
    int spill900112_15;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill900112_16;
    net.minecraft.world.World spill900112_17;
    moom.G2 spill900112_18;
    java.util.Random spill900112_19;
    int spill900112_20;
    int spill900112_21;
    int spill900112_22;
    java.util.List spill900112_23;
    moom.D5[] spill900112_24;
    net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor spill900112_25;
    net.minecraft.world.World spill900112_26;
    moom.G2 spill900112_27;
    java.util.Random spill900112_28;
    int spill900112_29;
    int spill900112_30;
    int spill900112_31;
    java.util.List spill900112_32;
    moom.D5[] spill900112_33;
    int spill900112_34;
    net.minecraft.block.state.IBlockState spill900112_35;
    net.minecraft.block.state.IBlockState spill900112_36;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_20;
    int life8_22;
    int life9_24;
    int life10_26;
    int life11_33;
    int life12_94;
    int life13_106;
    int life14_438;
    int life15_446;
    int life16_451;
    int life15_456;
    moom.DT life17_463;
    net.minecraft.tileentity.TileEntity life18_486;
    int life12_508;
    int life13_518;
    int life14_525;
    net.minecraft.block.state.IBlockState life15_533;
    int life16_549;
    int life12_579;
    net.minecraft.block.state.IBlockState life13_593;
    net.minecraft.block.state.IBlockState life13_631;
    forest_join_598: {
    forest_join_597: {
    forest_join_555: {
    forest_join_509: {
    forest_join_507: {
    forest_join_460: {
    forest_join_459: {
    forest_join_85: {
    forest_join_84: {
    forest_join_16: {
    forest_join_15: {
    life4_3 = (net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor.i ^ 31307908151534L);
    life6_5 = moom.G4.b();
    spill900112_0 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        forestValue900112_16_0 = ((spill900112_0) ? 1 : 0);
        break forest_join_16;
    }
    if (!(spill900112_0)) {
        break forest_join_15;
    }
    return ((0) != 0);
    }
    forestValue900112_16_0 = 0;
    }
    life7_20 = forestValue900112_16_0;
    life8_22 = 2;
    life9_24 = 0;
    life10_26 = 2;
    life11_33 = ((this.h * 5) - 1);
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(life11_33)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-1f)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(2)), ((int)(2)), ((int)(life11_33)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    spill900112_1 = this.f;
    if (!((life6_5 != null))) {
        forestValue900112_85_0 = ((spill900112_1) ? 1 : 0);
        break forest_join_85;
    }
    if (!(spill900112_1)) {
        break forest_join_84;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.333334p-1f)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(1)), ((int)(life11_33)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    }
    forestValue900112_85_0 = 0;
    }
    life12_94 = forestValue900112_85_0;
    forest_cycle_86: while (true) {
    forest_join_457: {
    forest_join_456: {
    forest_join_400: {
    forest_join_394: {
    forest_join_389: {
    forest_join_387: {
    forest_join_358: {
    forest_join_351: {
    forest_join_181: {
    forest_join_180: {
    forest_join_166: {
    if (!((life12_94 < this.h))) {
        break forest_join_459;
    }
    life13_106 = (2 + (life12_94 * 5));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(life13_106)), ((int)(0)), ((int)(1)), ((int)(life13_106)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    spill900112_2 = this;
    spill900112_3 = p0;
    spill900112_4 = p2;
    spill900112_5 = 2;
    spill900112_6 = 0;
    spill900112_7 = life13_106;
    spill900112_8 = 2;
    spill900112_9 = 1;
    spill900112_10 = life13_106;
    spill900112_11 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.aO)).a__fE();
    spill900112_12 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    spill900112_13 = 0;
    if (!((life6_5 != null))) {
        forestValue900112_180_0 = spill900112_2;
        forestValue900112_180_1 = spill900112_3;
        forestValue900112_180_2 = spill900112_4;
        forestValue900112_180_3 = spill900112_5;
        forestValue900112_180_4 = spill900112_6;
        forestValue900112_180_5 = spill900112_7;
        forestValue900112_180_6 = spill900112_8;
        forestValue900112_180_7 = spill900112_9;
        forestValue900112_180_8 = spill900112_10;
        forestValue900112_180_9 = spill900112_11;
        forestValue900112_180_10 = spill900112_12;
        forestValue900112_180_11 = spill900112_13;
        break forest_join_180;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill900112_2)).a(((net.minecraft.world.World)(spill900112_3)), ((moom.G2)(spill900112_4)), ((int)(spill900112_5)), ((int)(spill900112_6)), ((int)(spill900112_7)), ((int)(spill900112_8)), ((int)(spill900112_9)), ((int)(spill900112_10)), ((net.minecraft.block.state.IBlockState)(spill900112_11)), ((net.minecraft.block.state.IBlockState)(spill900112_12)), ((boolean)__sourceIntrinsic_integerToBoolean((spill900112_13))));
    spill900112_14 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life6_5 != null))) {
        forestValue900112_460_0 = spill900112_14;
        break forest_join_460;
    }
    if (!((spill900112_14 == 0))) {
        break forest_join_166;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(life13_106)), ((int)(0)), ((int)(2)), ((int)(life13_106)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(2)), ((int)(life13_106)), ((int)(2)), ((int)(2)), ((int)(life13_106)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break forest_join_181;
    }
    }
    forestValue900112_180_0 = this;
    forestValue900112_180_1 = p0;
    forestValue900112_180_2 = p2;
    forestValue900112_180_3 = 0;
    forestValue900112_180_4 = 2;
    forestValue900112_180_5 = life13_106;
    forestValue900112_180_6 = 2;
    forestValue900112_180_7 = 2;
    forestValue900112_180_8 = life13_106;
    forestValue900112_180_9 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE();
    forestValue900112_180_10 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    forestValue900112_180_11 = 0;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(forestValue900112_180_0)).a(((net.minecraft.world.World)(forestValue900112_180_1)), ((moom.G2)(forestValue900112_180_2)), ((int)(forestValue900112_180_3)), ((int)(forestValue900112_180_4)), ((int)(forestValue900112_180_5)), ((int)(forestValue900112_180_6)), ((int)(forestValue900112_180_7)), ((int)(forestValue900112_180_8)), ((net.minecraft.block.state.IBlockState)(forestValue900112_180_9)), ((net.minecraft.block.state.IBlockState)(forestValue900112_180_10)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue900112_180_11))));
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(0)), ((int)(2)), ((int)((life13_106 - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(2)), ((int)(2)), ((int)((life13_106 - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(0)), ((int)(2)), ((int)((life13_106 + 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-4f)), ((int)(2)), ((int)(2)), ((int)((life13_106 + 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(0)), ((int)(2)), ((int)((life13_106 - 2))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(2)), ((int)(2)), ((int)((life13_106 - 2))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(0)), ((int)(2)), ((int)((life13_106 + 2))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(2)), ((int)(2)), ((int)((life13_106 + 2))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.G)).a__fE())));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(1)), ((int)(2)), ((int)((life13_106 - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).b__fE(((int)(((moom.bs)(moom.bs.UP)).a()))))));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.99999ap-5f)), ((int)(1)), ((int)(2)), ((int)((life13_106 + 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aa)).b__fE(((int)(((moom.bs)(moom.bs.UP)).a()))))));
    spill900112_15 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900112_84(30971, (6082623446937160137L ^ life4_3)))));
    if (!((life6_5 != null))) {
        forestValue900112_358_0 = spill900112_15;
        break forest_join_358;
    }
    if (!((spill900112_15 == 0))) {
        break forest_join_351;
    }
    spill900112_16 = this;
    spill900112_17 = p0;
    spill900112_18 = p2;
    spill900112_19 = p1;
    spill900112_20 = 2;
    spill900112_21 = 0;
    spill900112_22 = (life13_106 - 1);
    spill900112_23 = net.minecraft.world.gen.structure.StructureMineshaftPieces.a;
    moom.D5[] __stackOp900112_87_0 = new moom.D5[1];
    spill900112_24 = __stackOp900112_87_0;
    (__stackOp900112_87_0)[0] = ((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill900112_16)).a(((net.minecraft.world.World)(spill900112_17)), ((moom.G2)(spill900112_18)), ((java.util.Random)(spill900112_19)), ((int)(spill900112_20)), ((int)(spill900112_21)), ((int)(spill900112_22)), ((java.util.List)(moom.D5.a(((java.util.List)(spill900112_23)), ((moom.D5[])(spill900112_24))))), ((int)((3 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    forestValue900112_358_0 = ((java.util.Random)(p1)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic900112_93(20023, (1312551388800188164L ^ life4_3)))));
    }
    if (!((life6_5 != null))) {
        forestValue900112_389_0 = forestValue900112_358_0;
        break forest_join_389;
    }
    if (!((forestValue900112_358_0 == 0))) {
        break forest_join_387;
    }
    spill900112_25 = this;
    spill900112_26 = p0;
    spill900112_27 = p2;
    spill900112_28 = p1;
    spill900112_29 = 0;
    spill900112_30 = 0;
    spill900112_31 = (life13_106 + 1);
    spill900112_32 = net.minecraft.world.gen.structure.StructureMineshaftPieces.a;
    moom.D5[] __stackOp900112_96_0 = new moom.D5[1];
    spill900112_33 = __stackOp900112_96_0;
    (__stackOp900112_96_0)[0] = ((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)));
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(spill900112_25)).a(((net.minecraft.world.World)(spill900112_26)), ((moom.G2)(spill900112_27)), ((java.util.Random)(spill900112_28)), ((int)(spill900112_29)), ((int)(spill900112_30)), ((int)(spill900112_31)), ((java.util.List)(moom.D5.a(((java.util.List)(spill900112_32)), ((moom.D5[])(spill900112_33))))), ((int)((3 + ((java.util.Random)(p1)).nextInt(((int)(4)))))));
    }
    forestValue900112_389_0 = ((this.f) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue900112_394_0 = forestValue900112_389_0;
        break forest_join_394;
    }
    if (!((forestValue900112_389_0 != 0))) {
        break forest_join_456;
    }
    forestValue900112_394_0 = ((this.g) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue900112_400_0 = forestValue900112_394_0;
        break forest_join_400;
    }
    if (!((forestValue900112_394_0 == 0))) {
        break forest_join_456;
    }
    forestValue900112_400_0 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((int)(0)));
    }
    life14_438 = forestValue900112_400_0;
    life15_446 = ((life13_106 - 1) + ((java.util.Random)(p1)).nextInt(((int)(3))));
    life16_451 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((int)(1)), ((int)(life15_446)));
    life15_456 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).b(((int)(1)), ((int)(life15_446)));
    life17_463 = new moom.DT(life16_451, life14_438, life15_456);
    if (!((life6_5 != null))) {
        break forest_join_457;
    }
    if (!(((moom.G2)(p2)).a(((moom.DS)(life17_463))))) {
        break forest_join_456;
    }
    this.g = ((boolean)(true));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life17_463)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)).a__fE())), ((int)(2)));
    life18_486 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life17_463)));
    if (!((life6_5 != null))) {
        break forest_join_457;
    }
    if (!((((life18_486 instanceof moom.Cq) ? 1 : 0) != 0))) {
        break forest_join_456;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(((moom.Cq)(((moom.Cq)(life18_486)))).a__sourceReturn_30e49adebc())).a(((java.lang.String)("CaveSpider")));
    }
    life12_94 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_86;
    }
    break forest_cycle_86;
    }
    }
    forestValue900112_460_0 = 0;
    }
    life12_508 = forestValue900112_460_0;
    forest_cycle_461: while (true) {
    forest_join_504: {
    if (!((life12_508 <= 2))) {
        break forest_join_507;
    }
    spill900112_34 = 0;
    if (!((life6_5 != null))) {
        forestValue900112_509_0 = spill900112_34;
        break forest_join_509;
    }
    life13_518 = spill900112_34;
    forest_cycle_468: while (true) {
    forest_join_502: {
    forest_join_501: {
    if (!((life13_518 <= life11_33))) {
        break forest_join_504;
    }
    life14_525 = -1;
    life15_533 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((int)(life12_508)), ((int)(life14_525)), ((int)(life13_518)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        break forest_join_502;
    }
    spill900112_35 = life15_533;
    if (!((life6_5 != null))) {
        forestValue900112_555_0 = spill900112_35;
        break forest_join_555;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(spill900112_35)).a__ch())).a__fn() == moom.fn.a))) {
        break forest_join_501;
    }
    life16_549 = -1;
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.f)).a__fE())), ((int)(life12_508)), ((int)(life16_549)), ((int)(life13_518)), ((moom.G2)(p2)));
    }
    life13_518 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_468;
    }
    break forest_cycle_468;
    }
    }
    life12_508 += 1;
    if (!((life6_5 == null))) {
        continue forest_cycle_461;
    }
    break forest_cycle_461;
    }
    }
    forestValue900112_509_0 = ((this.e) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forestValue900112_598_0 = forestValue900112_509_0;
        break forest_join_598;
    }
    if (!((forestValue900112_509_0 != 0))) {
        break forest_join_597;
    }
    life12_579 = 0;
    forest_cycle_514: while (true) {
    forest_join_552: {
    forest_join_551: {
    if (!((life12_579 <= life11_33))) {
        break forest_join_597;
    }
    life13_593 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((int)(1)), ((int)(-1)), ((int)(life12_579)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        break forest_join_552;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_593)).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_551;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_593)).a__ch())).a__Boolean())) {
        break forest_join_551;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.666666p-1f)), ((int)(1)), ((int)(0)), ((int)(life12_579)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)).b__fE(((int)(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)), ((int)(0)))))))));
    }
    life12_579 += 1;
    }
    if (!((life6_5 == null))) {
        continue forest_cycle_514;
    }
    break forest_cycle_514;
    }
    break forest_join_597;
    }
    forest_cycle_555: while (true) {
    forest_join_586: {
    forest_join_583: {
    forest_join_582: {
    life13_631 = forestValue900112_555_0;
    if (!((life6_5 != null))) {
        break forest_join_583;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_631)).a__ch())).a__fn() != moom.fn.a))) {
        break forest_join_582;
    }
    if (!(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life13_631)).a__ch())).a__Boolean())) {
        break forest_join_582;
    }
    ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((java.util.Random)(p1)), ((float)(0x1.666666p-1f)), ((int)(1)), ((int)(0)), ((int)(life12_508)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)).b__fE(((int)(((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.av)), ((int)(0)))))))));
    }
    life12_508 += 1;
    }
    if (!((life6_5 == null))) {
        break forest_join_586;
    }
    break forest_join_597;
    }
    if (!((life12_508 <= life11_33))) {
        break forest_join_597;
    }
    spill900112_36 = ((net.minecraft.world.gen.structure.StructureMineshaftPieces$Corridor)(this)).a(((net.minecraft.world.World)(p0)), ((int)(1)), ((int)(-1)), ((int)(life12_508)), ((moom.G2)(p2)));
    forestValue900112_555_0 = spill900112_36;
    continue forest_cycle_555;
    }
    }
    forestValue900112_598_0 = 1;
    }
    return ((forestValue900112_598_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_dce707f1976df89e_invokedynamic583_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12720_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0f75cc6dd3c5_invokedynamic731_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900112_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic900112_93(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_b4e341f40f1d0b(int p0, long p1);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native moom.G4 __sourceExactCall_a0a0ca1b2b95c9(moom.G4 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
