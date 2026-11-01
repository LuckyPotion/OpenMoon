package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hm extends moom.Hc {

private int f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public Hm() {
super();
}


public Hm(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
    this.f = (p1).nextInt();
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-2723305926855760678L)), ((long)(8053646555544517428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(166715610906942L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hm.g ^ 22068306099298L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill839_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill839_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill839_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill839_14 = new byte[8];
    (__sourceSpill839_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill839_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation839_16 = __sourceSpill839_14;
    ((javax.crypto.Cipher)(__sourceSpill839_11)).init(((int)(__sourceSpill839_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill839_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation839_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "5qÓâ¹Ã3ÏÚ|goÕ[\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill839_25 = local6_life21;
        int __sourceSpill839_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill839_25)).substring(((int)(__sourceSpill839_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill839_30 = local8_life19;
        int __sourceSpill839_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill839_33 = new byte[8];
        (__sourceSpill839_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill839_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill839_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill839_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill839_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill839_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill839_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill839_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill839_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill839_34)).doFinal(((byte[])(__sourceSpill839_33)));
        (__sourceSpill839_30)[__sourceSpill839_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ">³gýkòVãGV¬¼o"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill839_38 = local6_life21;
        int __sourceSpill839_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill839_38)).substring(((int)(__sourceSpill839_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill839_43 = local8_life19;
        int __sourceSpill839_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill839_46 = new byte[8];
        (__sourceSpill839_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill839_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill839_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill839_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill839_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill839_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill839_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill839_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill839_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill839_47)).doFinal(((byte[])(__sourceSpill839_46)));
        (__sourceSpill839_43)[__sourceSpill839_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hm.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3134;
        if (i[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hm", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hm.i[n2] = n3;
        }
        return i[n2];
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Seed")))));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4849_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int lexicalValue766_103_0;
    int lexicalValue766_171_0;
    net.minecraft.entity.Entity[] spill766_0;
    int spill766_1;
    int spill766_2;
    long life4_3;
    java.util.Random life7_11;
    net.minecraft.entity.Entity[] life6_12;
    int life8_14;
    int life9_21;
    int life10_32;
    int life8_66;
    int life8_89;
    int life8_106;
    int life9_113;
    int life9_148;
    int life10_155;
    lexical_join_171: {
    lexical_join_170: {
    lexical_join_133: {
    lexical_join_131: {
    lexical_join_103: {
    lexical_join_56: {
    life4_3 = (moom.Hm.g ^ 102470851029135L);
    spill766_0 = moom.G4.b();
    life7_11 = new java.util.Random(((long) this.f));
    life6_12 = spill766_0;
    life8_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_54: {
    lexical_join_53: {
    if (!((life8_14 <= 4))) {
        break lexical_join_56;
    }
    spill766_1 = 3;
    if (!((life6_12 != null))) {
        lexicalValue766_103_0 = spill766_1;
        break lexical_join_103;
    }
    life9_21 = spill766_1;
    lexical_cycle_22: while (true) {
    if (!((life9_21 <= 4))) {
        break lexical_join_53;
    }
    life10_32 = ((java.util.Random)(life7_11)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic766_3(21289, (6454873750412755255L ^ life4_3)))));
    ((moom.Hm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life8_14)), ((int)(life9_21)), ((int)(0)), ((int)(life8_14)), ((int)(life9_21)), ((int)(life10_32)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life9_21 += 1;
    if (!((life6_12 != null))) {
        break lexical_join_54;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    life8_14 += 1;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life8_66 = ((java.util.Random)(life7_11)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic766_10(17029, (7794401136082096282L ^ life4_3)))));
    ((moom.Hm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(5)), ((int)(0)), ((int)(0)), ((int)(5)), ((int)(life8_66)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life8_89 = ((java.util.Random)(life7_11)).nextInt(((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic766_17(17029, (7794401136082096282L ^ life4_3)))));
    ((moom.Hm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(5)), ((int)(0)), ((int)(4)), ((int)(5)), ((int)(life8_89)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    lexicalValue766_103_0 = 0;
    }
    life8_106 = lexicalValue766_103_0;
    lexical_cycle_104: while (true) {
    if (!((life8_106 <= 4))) {
        break lexical_join_131;
    }
    life9_113 = ((java.util.Random)(life7_11)).nextInt(((int)(5)));
    ((moom.Hm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life8_106)), ((int)(2)), ((int)(0)), ((int)(life8_106)), ((int)(2)), ((int)(life9_113)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life8_106 += 1;
    if (!((life6_12 != null))) {
        break lexical_join_133;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_104; }
    break lexical_cycle_104;
    }
    }
    life8_106 = 0;
    }
    lexical_cycle_133: while (true) {
    lexical_join_168: {
    lexical_join_167: {
    if (!((life8_106 <= 4))) {
        break lexical_join_170;
    }
    spill766_2 = 0;
    if (!((life6_12 != null))) {
        lexicalValue766_171_0 = spill766_2;
        break lexical_join_171;
    }
    life9_148 = spill766_2;
    lexical_cycle_140: while (true) {
    if (!((life9_148 <= 1))) {
        break lexical_join_167;
    }
    life10_155 = ((java.util.Random)(life7_11)).nextInt(((int)(3)));
    ((moom.Hm)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life8_106)), ((int)(life9_148)), ((int)(0)), ((int)(life8_106)), ((int)(life9_148)), ((int)(life10_155)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bn)).a__fE())), ((boolean)(false)));
    life9_148 += 1;
    if (!((life6_12 != null))) {
        break lexical_join_168;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_140; }
    break lexical_cycle_140;
    }
    }
    life8_106 += 1;
    }
    if (!((life6_12 == null))) { continue lexical_cycle_133; }
    break lexical_cycle_133;
    }
    }
    lexicalValue766_171_0 = 1;
    }
    return ((lexicalValue766_171_0) != 0);
}


public static moom.Hm a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.Hm forwardValue2143_44_0;
    long life7_3;
    moom.G2 life9_27;
    forward_join_44: {
    forward_join_43: {
    life7_3 = (moom.Hm.g ^ 109431402122917L);
    life9_27 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(-1)), ((int)(__sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_1(6186, (4815141230057188380L ^ life7_3)))), ((int)(0)), ((int)(5)), ((int)(__sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_2(31814, (4425387639270475889L ^ life7_3)))), ((int)(__sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_3(17029, (7794455786845255344L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.Hm.a(((moom.G2)(life9_27))))) {
        break forward_join_43;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_27))) == null))) {
        break forward_join_43;
    }
    forwardValue2143_44_0 = new moom.Hm(p6, p1, life9_27, p5);
    break forward_join_44;
    }
    forwardValue2143_44_0 = null;
    }
    return forwardValue2143_44_0;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Seed")), ((int)(this.f)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f8ba80a60f3_invokedynamic2143_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic766_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic766_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic766_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4849_0() throws E;
}
