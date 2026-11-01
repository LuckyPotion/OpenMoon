package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hb extends moom.G4 {

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public Hb() {
super();
}


public Hb(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(4086399824813894949L)), ((long)(2904237185442111720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280120329592227L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hb.e ^ 111499767008374L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill829_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill829_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill829_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill829_14 = new byte[8];
    (__sourceSpill829_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill829_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation829_16 = __sourceSpill829_14;
    ((javax.crypto.Cipher)(__sourceSpill829_11)).init(((int)(__sourceSpill829_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill829_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation829_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "%eÁINçÏ»\b3Ô`û$"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill829_25 = local6_life21;
        int __sourceSpill829_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill829_25)).substring(((int)(__sourceSpill829_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill829_30 = local8_life19;
        int __sourceSpill829_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill829_33 = new byte[8];
        (__sourceSpill829_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill829_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill829_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill829_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill829_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill829_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill829_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill829_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill829_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill829_34)).doFinal(((byte[])(__sourceSpill829_33)));
        (__sourceSpill829_30)[__sourceSpill829_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "+Â\006b.½0¡s\036³h\033"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill829_38 = local6_life21;
        int __sourceSpill829_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill829_38)).substring(((int)(__sourceSpill829_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill829_43 = local8_life19;
        int __sourceSpill829_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill829_46 = new byte[8];
        (__sourceSpill829_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill829_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill829_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill829_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill829_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill829_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill829_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill829_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill829_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill829_47)).doFinal(((byte[])(__sourceSpill829_46)));
        (__sourceSpill829_43)[__sourceSpill829_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_491267bb984535(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5CA1;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
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
                throw new RuntimeException("moom/Hb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hb.g[n2] = n3;
        }
        return g[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4812_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public static moom.G2 a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5) {
moom.G2 forwardValue222_96_0;
    net.minecraft.entity.Entity[] spill222_0;
    long life6_3;
    moom.G2 life9_18;
    net.minecraft.entity.Entity[] life8_19;
    forward_join_96: {
    forward_join_95: {
    forward_join_89: {
    forward_join_75: {
    forward_join_59: {
    forward_join_43: {
    forward_join_41: {
    forward_join_27: {
    life6_3 = (moom.Hb.e ^ 92468867480079L);
    spill222_0 = moom.G4.b();
    life9_18 = new moom.G2(p2, (p3 - 5), p4, p2, (p3 + 2), p4);
    life8_19 = spill222_0;
    if (!((life8_19 != null))) {
        break forward_join_41;
    }
    switch ((moom.Ic.a)[((moom.bs)(p5)).ordinal()]) {
case 1:
{
        break forward_join_27;
    }
case 2:
{
        break forward_join_43;
    }
case 3:
{
        break forward_join_59;
    }
case 4:
{
        break forward_join_75;
    }
default:
{
        break forward_join_89;
    }
}
    }
    ((moom.G2)(life9_18)).d = ((int)((p2 + 2)));
    ((moom.G2)(life9_18)).c = ((int)((p4 - __sourceIntrinsic_91331a5acb98_invokedynamic222_5(25482, (8327508932461094640L ^ life6_3)))));
    }
    if (!((life8_19 == null))) {
        break forward_join_89;
    }
    }
    ((moom.G2)(life9_18)).d = ((int)((p2 + 2)));
    ((moom.G2)(life9_18)).f = ((int)((p4 + __sourceIntrinsic_91331a5acb98_invokedynamic222_8(25482, (8327508932461094640L ^ life6_3)))));
    if (!((life8_19 == null))) {
        break forward_join_89;
    }
    }
    ((moom.G2)(life9_18)).a = ((int)((p2 - __sourceIntrinsic_91331a5acb98_invokedynamic222_10(25482, (8327508932461094640L ^ life6_3)))));
    ((moom.G2)(life9_18)).f = ((int)((p4 + 2)));
    if (!((life8_19 == null))) {
        break forward_join_89;
    }
    }
    ((moom.G2)(life9_18)).d = ((int)((p2 + __sourceIntrinsic_91331a5acb98_invokedynamic222_13(25482, (8327508932461094640L ^ life6_3)))));
    ((moom.G2)(life9_18)).f = ((int)((p4 + 2)));
    }
    if (!((__sourceExactCall_21e7c855759262(((java.util.List)(p0)), ((moom.G2)(life9_18))) != null))) {
        break forward_join_95;
    }
    forwardValue222_96_0 = null;
    break forward_join_96;
    }
    forwardValue222_96_0 = life9_18;
    }
    return forwardValue222_96_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
net.minecraft.entity.Entity[] spill223_0;
    long life4_3;
    int life7_7;
    net.minecraft.entity.Entity[] life6_8;
    forward_join_96: {
    forward_join_78: {
    forward_join_58: {
    forward_join_38: {
    forward_join_18: {
    life4_3 = (moom.Hb.e ^ 140705478822457L);
    spill223_0 = moom.G4.b();
    life7_7 = __sourceExactCall_9e36eef3522a61(((moom.Hb)(this)));
    life6_8 = spill223_0;
    if (!((((moom.Hb)(this)).b != null))) {
        break forward_join_96;
    }
    switch ((moom.Ic.a)[((moom.bs)(((moom.Hb)(this)).b)).ordinal()]) {
case 1:
{
        break forward_join_18;
    }
case 2:
{
        break forward_join_38;
    }
case 3:
{
        break forward_join_58;
    }
case 4:
{
        break forward_join_78;
    }
default:
{
        break forward_join_96;
    }
}
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).a)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).b)), ((int)((((moom.G2)(((moom.Hb)(this)).a)).c - 1))), ((moom.bs)(moom.bs.NORTH)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forward_join_96;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).a)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).b)), ((int)((((moom.G2)(((moom.Hb)(this)).a)).f + 1))), ((moom.bs)(moom.bs.SOUTH)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forward_join_96;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hb)(this)).a)).a - 1))), ((int)(((moom.G2)(((moom.Hb)(this)).a)).b)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).c)), ((moom.bs)(moom.bs.WEST)), ((int)(life7_7)));
    if (!((life6_8 == null))) {
        break forward_join_96;
    }
    }
    __sourceExactCall_a0a0ca1b2b95c9(((moom.G4)(p0)), ((java.util.List)(p1)), ((java.util.Random)(p2)), ((int)((((moom.G2)(((moom.Hb)(this)).a)).d + 1))), ((int)(((moom.G2)(((moom.Hb)(this)).a)).b)), ((int)(((moom.G2)(((moom.Hb)(this)).a)).c)), ((moom.bs)(moom.bs.EAST)), ((int)(life7_7)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue755_58_0;
    moom.Hb lexicalValue755_75_0;
    net.minecraft.world.World lexicalValue755_75_1;
    moom.G2 lexicalValue755_75_2;
    int lexicalValue755_75_3;
    int lexicalValue755_75_4;
    int lexicalValue755_75_5;
    moom.Hb lexicalValue755_76_0;
    net.minecraft.world.World lexicalValue755_76_1;
    moom.G2 lexicalValue755_76_2;
    int lexicalValue755_76_3;
    int lexicalValue755_76_4;
    moom.Hb lexicalValue755_77_0;
    net.minecraft.world.World lexicalValue755_77_1;
    moom.G2 lexicalValue755_77_2;
    int lexicalValue755_77_3;
    int lexicalValue755_77_4;
    int lexicalValue755_77_5;
    boolean spill755_0;
    moom.Hb spill755_1;
    net.minecraft.world.World spill755_2;
    moom.G2 spill755_3;
    int spill755_4;
    int spill755_5;
    int spill755_6;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_63;
    lexical_join_101: {
    lexical_join_58: {
    lexical_join_15: {
    life4_3 = (moom.Hb.e ^ 15874217181439L);
    life6_5 = moom.G4.b();
    spill755_0 = ((moom.Hb)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)));
    if (!((life6_5 != null))) {
        lexicalValue755_58_0 = ((spill755_0) ? 1 : 0);
        break lexical_join_58;
    }
    if (!(spill755_0)) {
        break lexical_join_15;
    }
    return ((0) != 0);
    }
    ((moom.Hb)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic755_5(22738, (2263789602013275995L ^ life4_3)))), ((int)(1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((moom.Hb)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic755_11(16360, (9054135649814216803L ^ life4_3)))), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic755_12(12432, (4814594668537876248L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    lexicalValue755_58_0 = 0;
    }
    life7_63 = lexicalValue755_58_0;
    lexical_cycle_59: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_75: {
    if (!((life7_63 < 5))) {
        break lexical_join_101;
    }
    spill755_1 = this;
    spill755_2 = p0;
    spill755_3 = p2;
    spill755_4 = 0;
    spill755_5 = (5 - life7_63);
    spill755_6 = life7_63;
    if (!((life6_5 != null))) {
        lexicalValue755_75_0 = spill755_1;
        lexicalValue755_75_1 = spill755_2;
        lexicalValue755_75_2 = spill755_3;
        lexicalValue755_75_3 = spill755_4;
        lexicalValue755_75_4 = spill755_5;
        lexicalValue755_75_5 = spill755_6;
        break lexical_join_75;
    }
    if (!((spill755_6 < 4))) {
        lexicalValue755_76_0 = spill755_1;
        lexicalValue755_76_1 = spill755_2;
        lexicalValue755_76_2 = spill755_3;
        lexicalValue755_76_3 = spill755_4;
        lexicalValue755_76_4 = spill755_5;
        break lexical_join_76;
    }
    lexicalValue755_75_0 = spill755_1;
    lexicalValue755_75_1 = spill755_2;
    lexicalValue755_75_2 = spill755_3;
    lexicalValue755_75_3 = spill755_4;
    lexicalValue755_75_4 = spill755_5;
    lexicalValue755_75_5 = 1;
    }
    lexicalValue755_77_0 = lexicalValue755_75_0;
    lexicalValue755_77_1 = lexicalValue755_75_1;
    lexicalValue755_77_2 = lexicalValue755_75_2;
    lexicalValue755_77_3 = lexicalValue755_75_3;
    lexicalValue755_77_4 = lexicalValue755_75_4;
    lexicalValue755_77_5 = lexicalValue755_75_5;
    break lexical_join_77;
    }
    lexicalValue755_77_0 = lexicalValue755_76_0;
    lexicalValue755_77_1 = lexicalValue755_76_1;
    lexicalValue755_77_2 = lexicalValue755_76_2;
    lexicalValue755_77_3 = lexicalValue755_76_3;
    lexicalValue755_77_4 = lexicalValue755_76_4;
    lexicalValue755_77_5 = 0;
    }
    ((moom.Hb)(lexicalValue755_77_0)).a(((net.minecraft.world.World)(lexicalValue755_77_1)), ((moom.G2)(lexicalValue755_77_2)), ((int)(lexicalValue755_77_3)), ((int)((lexicalValue755_77_4 - lexicalValue755_77_5))), ((int)((2 + life7_63))), ((int)(2)), ((int)((__sourceIntrinsic_5ac1d031d896_invokedynamic755_18(16360, (9054135649814216803L ^ life4_3)) - life7_63))), ((int)((2 + life7_63))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    life7_63 += 1;
    if (!((life6_5 == null))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    return ((1) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4812_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_91331a5acb98_invokedynamic222_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_91331a5acb98_invokedynamic222_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_91331a5acb98_invokedynamic222_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_91331a5acb98_invokedynamic222_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic755_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic755_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic755_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic755_18(int a0, long a1) throws E;

private static native int __sourceExactCall_491267bb984535(int p0, long p1);
private static native moom.G4 __sourceExactCall_21e7c855759262(java.util.List p0, moom.G2 p1);

private static native int __sourceExactCall_9e36eef3522a61(moom.Hb p0);

private static native moom.G4 __sourceExactCall_a0a0ca1b2b95c9(moom.G4 p0, java.util.List p1, java.util.Random p2, int p3, int p4, int p5, moom.bs p6, int p7);
}
