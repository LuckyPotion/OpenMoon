package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gC {

private net.minecraft.client.Minecraft a;

private java.util.List<moom.DZ> b;

private moom.DT c;

private moom.bs d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public gC() { super(); }


private static void __sourceConstructorBody_f9c2fab98e877d92(com.moon.gC receiver) throws Throwable {

int forestValue19_23_0;

    boolean spill19_0;

    int spill19_1;

    long life1_3;

    int life3_7;

    int life4_21;

    int life5_26;

    int life6_41;

    forest_join_69: {

    life1_3 = (com.moon.gC.e ^ 49498906336817L);

    spill19_0 = com.moon.gD.b__Boolean();

    com.moon.gC.__sourceConstructorInit_f9c2fab98e877d92_0(((com.moon.gC)(receiver)));

    life3_7 = ((spill19_0) ? 1 : 0);

    ((com.moon.gC)(receiver)).a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));

    ((com.moon.gC)(receiver)).b = ((java.util.List)(new java.util.ArrayList()));

    life4_21 = __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_7(7449, (8580621146679077402L ^ life1_3));

    forest_cycle_22: while (true) {

    forest_join_66: {

    forestValue19_23_0 = life4_21;

    forest_cycle_23: while (true) {

    if (!((forestValue19_23_0 <= 5))) {

        break forest_join_69;

    }

    life5_26 = 0;

    forest_cycle_27: while (true) {

    forest_join_64: {

    forest_join_63: {

    if (!((life5_26 > __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_8(10338, (1488615208579456866L ^ life1_3))))) {

        break forest_join_66;

    }

    spill19_1 = __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_9(25785, (4033927973818340283L ^ life1_3));

    if (!((life3_7 != 0))) {

        forestValue19_23_0 = spill19_1;

        continue forest_cycle_23;

    }

    life6_41 = spill19_1;

    forest_cycle_42: while (true) {

    if (!((life6_41 <= 5))) {

        break forest_join_63;

    }

    ((java.util.List)(((com.moon.gC)(receiver)).b)).add(((java.lang.Object)(new moom.DZ(((double) life4_21), ((double) life5_26), ((double) life6_41)))));

    life6_41 += 1;

    if (!((life3_7 != 0))) {

        break forest_join_64;

    }

    if (!((life3_7 == 0))) {

        continue forest_cycle_42;

    }

    break forest_cycle_42;

    }

    }

    life5_26 += -1;

    }

    if (!((life3_7 == 0))) {

        continue forest_cycle_27;

    }

    break forest_cycle_27;

    }

    break forest_cycle_23;

    }

    }

    life4_21 += 1;

    if (!((life3_7 == 0))) {

        continue forest_cycle_22;

    }

    break forest_cycle_22;

    }

    }

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(-5257635078439760207L)), ((long)(6778047534832505512L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(65199611591689L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.gC.e ^ 36159240048844L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill107_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill107_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill107_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill107_14 = new byte[8];
    (__sourceSpill107_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill107_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation107_16 = __sourceSpill107_14;
    ((javax.crypto.Cipher)(__sourceSpill107_11)).init(((int)(__sourceSpill107_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill107_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation107_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\tvZ#yÍWº\föí\033ã\177©Z.+\035"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill107_25 = local6_life21;
        int __sourceSpill107_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill107_25)).substring(((int)(__sourceSpill107_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill107_30 = local8_life19;
        int __sourceSpill107_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill107_33 = new byte[8];
        (__sourceSpill107_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill107_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill107_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill107_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill107_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill107_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill107_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill107_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill107_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill107_34)).doFinal(((byte[])(__sourceSpill107_33)));
        (__sourceSpill107_30)[__sourceSpill107_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f9c2fab98e877d92_0(com.moon.gC a0) throws E;

public moom.bs a__bs() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1561;
        if (g[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n6];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/gC", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gC.g[n6] = n8;
        }
        return g[n6];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_6b3e50d1738880(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1216_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(moom.DT p0, double p1) {
int lexicalValue46_78_0;
    int lexicalValue46_86_0;
    double lexicalValue46_90_0;
    moom.DT lexicalValue46_98_0;
    int lexicalValue46_102_0;
    boolean spill46_0;
    boolean spill46_1;
    double spill46_2;
    moom.DT spill46_3;
    long life4_3;
    moom.DT life7_5;
    double life8_8;
    int life6_9;
    java.util.Iterator life10_13;
    moom.DZ life11_20;
    moom.DT life12_29;
    moom.DR life13_51;
    double life14_58;
    net.minecraft.block.Block life16_65;
    moom.bs life10_137;
    lexical_join_134: {
    lexical_join_128: {
    lexical_join_102: {
    lexical_join_98: {
    lexical_join_93: {
    life4_3 = (com.moon.gC.e ^ 116645249412859L);
    life7_5 = null;
    spill46_0 = com.moon.gD.b__Boolean();
    life8_8 = 0x1.fffffffcp30d;
    life6_9 = ((spill46_0) ? 1 : 0);
    life10_13 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_86: {
    lexical_join_78: {
    if (!(((java.util.Iterator)(life10_13)).hasNext())) {
        break lexical_join_93;
    }
    life11_20 = ((moom.DZ)(((java.util.Iterator)(life10_13)).next()));
    life12_29 = __sourceExactCall_85f83ee78344f7(((moom.DT)(p0)), ((double)(((moom.DZ)(life11_20)).a)), ((double)(((moom.DZ)(life11_20)).b)), ((double)(((moom.DZ)(life11_20)).c)));
    life13_51 = new moom.DR(((double) (((float) ((moom.DT)(life12_29)).a()) + 0x1.0p-1f)), ((double) (((float) ((moom.DT)(life12_29)).b()) + 0x1.0p-1f)), ((double) (((float) ((moom.DT)(life12_29)).c()) + 0x1.0p-1f)));
    life14_58 = ((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.a)).K)).a__DR())).b(((moom.DR)(life13_51)));
    life16_65 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.a)).I)).a__fE(((moom.DT)(life12_29))))).a__ch();
    spill46_1 = ((com.moon.gC)(this)).a(((net.minecraft.block.Block)(life16_65)), ((moom.DT)(life12_29)));
    if (!((life6_9 != 0))) {
        lexicalValue46_102_0 = ((spill46_1) ? 1 : 0);
        break lexical_join_102;
    }
    if (!((life6_9 != 0))) {
        lexicalValue46_78_0 = ((spill46_1) ? 1 : 0);
        break lexical_join_78;
    }
    if (!(spill46_1)) {
        break lexical_join_91;
    }
    lexicalValue46_78_0 = recovery.source.CarrierOps.dcmpg(((double)(life14_58)), ((double)(p1)));
    }
    if (!((life6_9 != 0))) {
        lexicalValue46_86_0 = lexicalValue46_78_0;
        break lexical_join_86;
    }
    if (!((lexicalValue46_78_0 <= 0))) {
        break lexical_join_91;
    }
    spill46_2 = life14_58;
    if (!((life6_9 != 0))) {
        lexicalValue46_90_0 = spill46_2;
        break lexical_join_90;
    }
    lexicalValue46_86_0 = recovery.source.CarrierOps.dcmpg(((double)(spill46_2)), ((double)(life8_8)));
    }
    if (!((lexicalValue46_86_0 < 0))) {
        break lexical_join_91;
    }
    life7_5 = life12_29;
    lexicalValue46_90_0 = life14_58;
    }
    life8_8 = lexicalValue46_90_0;
    }
    if (!((life6_9 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    spill46_3 = life7_5;
    if (!((life6_9 != 0))) {
        lexicalValue46_98_0 = spill46_3;
        break lexical_join_98;
    }
    if (!((spill46_3 != null))) {
        break lexical_join_128;
    }
    lexicalValue46_98_0 = p0;
    }
    lexicalValue46_102_0 = (((moom.DT)(lexicalValue46_98_0)).a() - ((moom.DT)(life7_5)).a());
    }
    life10_137 = moom.bs.a(((float)(((float) lexicalValue46_102_0))), ((float)(((float) (((moom.DT)(p0)).b() - ((moom.DT)(life7_5)).b())))), ((float)(((float) (((moom.DT)(p0)).c() - ((moom.DT)(life7_5)).c())))));
    if (!((life6_9 != 0))) {
        break lexical_join_134;
    }
    if (!((life10_137 != null))) {
        break lexical_join_128;
    }
    this.c = ((moom.DT)(life7_5));
    this.d = ((moom.bs)(life10_137));
    return;
    }
    this.c = ((moom.DT)(null));
    this.d = ((moom.bs)(null));
    }
    return;
}


private boolean a(net.minecraft.block.Block p0, moom.DT p1) {
int forwardValue238_18_0;
    net.minecraft.block.Block forwardValue238_39_0;
    int forwardValue238_44_0;
    int forwardValue238_46_0;
    int forwardValue238_48_0;
    int forwardValue238_52_0;
    int spill238_0;
    int spill238_1;
    net.minecraft.block.Block spill238_2;
    int spill238_3;
    long life3_3;
    int life5_5;
    net.minecraft.block.state.IBlockState life6_43;
    net.minecraft.block.Block life7_46;
    forward_join_52: {
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_44: {
    forward_join_39: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (com.moon.gC.e ^ 37443035527692L);
    life5_5 = ((com.moon.gD.b__Boolean()) ? 1 : 0);
    spill238_0 = ((p0 instanceof moom.cT) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue238_18_0 = spill238_0;
        break forward_join_18;
    }
    if (!((spill238_0 == 0))) {
        break forward_join_16;
    }
    spill238_1 = ((p0 instanceof moom.du) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue238_52_0 = spill238_1;
        break forward_join_52;
    }
    if (!((spill238_1 != 0))) {
        break forward_join_49;
    }
    }
    forwardValue238_18_0 = ((p0 instanceof moom.dx) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue238_48_0 = forwardValue238_18_0;
        break forward_join_48;
    }
    if (!((forwardValue238_18_0 != 0))) {
        break forward_join_47;
    }
    life6_43 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.a)).I)).a__fE(((moom.DT)(((moom.DT)(p1)).b(((int)(1))))));
    life7_46 = ((net.minecraft.block.state.IBlockState)(life6_43)).a__ch();
    spill238_2 = life7_46;
    if (!((life5_5 != 0))) {
        forwardValue238_39_0 = spill238_2;
        break forward_join_39;
    }
    if (!((((net.minecraft.block.Block)(spill238_2)).a__fn() != moom.fn.a))) {
        break forward_join_45;
    }
    forwardValue238_39_0 = life7_46;
    }
    spill238_3 = ((forwardValue238_39_0 instanceof moom.du) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue238_44_0 = spill238_3;
        break forward_join_44;
    }
    if (!((spill238_3 == 0))) {
        break forward_join_45;
    }
    forwardValue238_44_0 = 1;
    }
    forwardValue238_46_0 = forwardValue238_44_0;
    break forward_join_46;
    }
    forwardValue238_46_0 = 0;
    }
    return ((forwardValue238_46_0) != 0);
    }
    forwardValue238_48_0 = 0;
    }
    return ((forwardValue238_48_0) != 0);
    }
    forwardValue238_52_0 = ((((moom.fn)(((net.minecraft.block.Block)(p0)).a__fn())).d__Boolean()) ? 1 : 0);
    }
    return ((forwardValue238_52_0) != 0);
}


public net.minecraft.client.Minecraft a__fM() {
return this.a;
}


public java.util.List<moom.DZ> a() {
return this.b;
}


public moom.DT a__DT() {
return this.c;
}


private static native <E extends Throwable> int __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f9c2fab98e877d92_invokedynamic19_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1216_0() throws E;

private static native int __sourceExactCall_6b3e50d1738880(int p0, long p1);
private static native moom.DT __sourceExactCall_85f83ee78344f7(moom.DT p0, double p1, double p2, double p3);
}
