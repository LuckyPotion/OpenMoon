package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class MapGenStructure extends moom.FI {

private net.minecraft.world.gen.structure.MapGenStructureData e;

protected java.util.Map<java.lang.Long, moom.Ir> f;

private static long n;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public MapGenStructure() {
super();
    this.f = com.google.common.collect.Maps.newHashMap();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1022330194676731927L)), ((long)(8686408461225659989L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46510718234245L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.world.gen.structure.MapGenStructure.n ^ 64242077895201L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1954_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1954_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1954_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1954_14 = new byte[8];
    (__sourceSpill1954_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1954_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1954_16 = __sourceSpill1954_14;
    ((javax.crypto.Cipher)(__sourceSpill1954_11)).init(((int)(__sourceSpill1954_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1954_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1954_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿäù»ÁÕwe:ZÌ³¦\006L§dÁ&Æ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1954_25 = local6_life21;
        int __sourceSpill1954_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1954_25)).substring(((int)(__sourceSpill1954_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1954_30 = local8_life19;
        int __sourceSpill1954_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1954_33 = new byte[8];
        (__sourceSpill1954_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1954_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1954_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1954_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1954_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1954_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1954_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1954_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1954_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1954_34)).doFinal(((byte[])(__sourceSpill1954_33)));
        (__sourceSpill1954_30)[__sourceSpill1954_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "úf·ù7LõKB'¹\nM¼\005"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1954_38 = local6_life21;
        int __sourceSpill1954_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1954_38)).substring(((int)(__sourceSpill1954_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1954_43 = local8_life19;
        int __sourceSpill1954_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1954_46 = new byte[8];
        (__sourceSpill1954_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1954_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1954_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1954_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1954_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1954_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1954_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1954_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1954_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1954_47)).doFinal(((byte[])(__sourceSpill1954_46)));
        (__sourceSpill1954_43)[__sourceSpill1954_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> moom.Ir __sourceHandlerCall_9a5a7c39558cad3def9d(net.minecraft.world.gen.structure.MapGenStructure a0, moom.DT a1) throws E;
private static final class __SourceHandler_9a5a7c39558cad3def9d {

public static moom.Ir f1846(net.minecraft.world.gen.structure.MapGenStructure receiver, moom.DT p0) throws Throwable {
    int lexicalValue1846_29_0;
    moom.Ir lexicalValue1846_31_0;
    net.minecraft.entity.Entity[] spill1846_0;
    boolean spill1846_1;
    moom.Ir spill1846_2;
    long life2_3;
    java.util.Iterator life5_9;
    net.minecraft.entity.Entity[] life4_10;
    moom.Ir life6_17;
    java.util.Iterator life7_42;
    moom.G4 life8_51;
    lexical_join_56: {
    life2_3 = (__fieldRead1846_0() ^ 23103201772919L);
    spill1846_0 = __call1846_1();
    life5_9 = __call1846_4(__call1846_3(__fieldRead1846_2(receiver)));
    life4_10 = spill1846_0;
    lexical_cycle_11: while (true) {
    lexical_join_54: {
    lexical_join_52: {
    lexical_join_31: {
    lexical_join_29: {
    if (!(__call1846_5(life5_9))) {
        break lexical_join_56;
    }
    life6_17 = __cast1846_7(__call1846_6(life5_9));
    spill1846_1 = __call1846_8(life6_17);
    if (!((life4_10 != null))) {
        lexicalValue1846_29_0 = __integerCategory1846_9(spill1846_1);
        break lexical_join_29;
    }
    if (!(spill1846_1)) {
        break lexical_join_54;
    }
    spill1846_2 = life6_17;
    if (!((life4_10 != null))) {
        lexicalValue1846_31_0 = spill1846_2;
        break lexical_join_31;
    }
    lexicalValue1846_29_0 = __integerCategory1846_12(__call1846_11(__call1846_10(spill1846_2), p0));
    }
    if (!((lexicalValue1846_29_0 != 0))) {
        break lexical_join_54;
    }
    lexicalValue1846_31_0 = life6_17;
    }
    life7_42 = __call1846_14(__call1846_13(lexicalValue1846_31_0));
    lexical_cycle_34: while (true) {
    lexical_join_50: {
    lexical_join_39: {
    if (!((!__call1846_15(life7_42)))) {
        break lexical_join_39;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_11; }
    }
    life8_51 = __cast1846_17(__call1846_16(life7_42));
    if (!(__call1846_19(__call1846_18(life8_51), p0))) {
        break lexical_join_50;
    }
    if (!((life4_10 == null))) {
        break lexical_join_52;
    }
    }
    if (!((life4_10 == null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return life6_17;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return null;
}
public static void h1846_0(moom.Oo p0) throws Throwable {
    throw __call1184600_0(p0);
}
public static void h1846_1(moom.Oo p0) throws Throwable {
    throw __call1184601_0(p0);
}
public static void h1846_2(moom.Oo p0) throws Throwable {
    throw __call1184602_0(p0);
}
public static void h1846_3(moom.Oo p0) throws Throwable {
    throw __call1184603_0(p0);
}
public static void h1846_4(moom.Oo p0) throws Throwable {
    throw __call1184604_0(p0);
}
private static native long __fieldRead1846_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1846_1() throws Throwable;
private static native java.util.Map __fieldRead1846_2(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.util.Collection __call1846_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1846_4(java.util.Collection a0) throws Throwable;
private static native boolean __call1846_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1846_6(java.util.Iterator a0) throws Throwable;
private static native moom.Ir __cast1846_7(java.lang.Object a0) throws Throwable;
private static native boolean __call1846_8(moom.Ir a0) throws Throwable;
private static native int __integerCategory1846_9(boolean value) throws Throwable;
private static native moom.G2 __call1846_10(moom.Ir a0) throws Throwable;
private static native boolean __call1846_11(moom.G2 a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1846_12(boolean value) throws Throwable;
private static native java.util.LinkedList __call1846_13(moom.Ir a0) throws Throwable;
private static native java.util.Iterator __call1846_14(java.util.LinkedList a0) throws Throwable;
private static native boolean __call1846_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1846_16(java.util.Iterator a0) throws Throwable;
private static native moom.G4 __cast1846_17(java.lang.Object a0) throws Throwable;
private static native moom.G2 __call1846_18(moom.G4 a0) throws Throwable;
private static native boolean __call1846_19(moom.G2 a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1184600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184604_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d083e2f8b1b758cf11bf(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws E;
private static final class __SourceHandler_d083e2f8b1b758cf11bf {

public static void f299(net.minecraft.world.gen.structure.MapGenStructure receiver, net.minecraft.world.World p0) throws Throwable {
    net.minecraft.world.gen.structure.MapGenStructureData lexicalValue299_21_0;
    net.minecraft.world.gen.structure.MapGenStructureData lexicalValue299_41_0;
    net.minecraft.nbt.NBTBase lexicalValue299_69_0;
    int lexicalValue299_80_0;
    int lexicalValue299_86_0;
    java.lang.Object lexicalValue299_107_0;
    net.minecraft.world.gen.structure.MapGenStructureData spill299_0;
    net.minecraft.nbt.NBTBase spill299_1;
    boolean spill299_2;
    moom.Ir spill299_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.nbt.NBTTagCompound life5_57;
    java.util.Iterator life6_61;
    java.lang.String life7_68;
    net.minecraft.nbt.NBTBase life8_72;
    net.minecraft.nbt.NBTTagCompound life9_91;
    int life10_119;
    int life11_123;
    moom.Ir life12_127;
    lexical_join_110: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_21: {
    life2_3 = (__fieldRead299_0() ^ 91184743185086L);
    life4_5 = __call299_1();
    spill299_0 = __fieldRead299_2(receiver);
    if (!((life4_5 != null))) {
        lexicalValue299_21_0 = spill299_0;
        break lexical_join_21;
    }
    if (!((spill299_0 == null))) {
        break lexical_join_110;
    }
    __fieldWrite299_7(receiver, __cast299_6(__call299_5(p0, __classLiteral299_3(), __call299_4(receiver))));
    lexicalValue299_21_0 = __fieldRead299_8(receiver);
    }
    if (!((life4_5 != null))) {
        lexicalValue299_41_0 = lexicalValue299_21_0;
        break lexical_join_41;
    }
    if (!((lexicalValue299_21_0 == null))) {
        break lexical_join_39;
    }
    __fieldWrite299_10(receiver, new net.minecraft.world.gen.structure.MapGenStructureData(__call299_9(receiver)));
    __call299_13(p0, __call299_11(receiver), __fieldRead299_12(receiver));
    if (!((life4_5 == null))) {
        break lexical_join_110;
    }
    }
    lexicalValue299_41_0 = __fieldRead299_14(receiver);
    }
    life5_57 = __call299_15(lexicalValue299_41_0);
    life6_61 = __call299_17(__call299_16(life5_57));
    lexical_cycle_47: while (true) {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_86: {
    lexical_join_80: {
    lexical_join_69: {
    if (!(__call299_18(life6_61))) {
        break lexical_join_110;
    }
    life7_68 = __cast299_20(__call299_19(life6_61));
    life8_72 = __call299_21(life5_57, life7_68);
    spill299_1 = life8_72;
    if (!((life4_5 != null))) {
        lexicalValue299_69_0 = spill299_1;
        break lexical_join_69;
    }
    if (!((__call299_22(spill299_1) == __invokedynamic299_23(22319, (6152956555965382458L ^ life2_3))))) {
        break lexical_join_108;
    }
    lexicalValue299_69_0 = life8_72;
    }
    life9_91 = __cast299_24(lexicalValue299_69_0);
    spill299_2 = __call299_25(life9_91, "ChunkX");
    if (!((life4_5 != null))) {
        lexicalValue299_80_0 = __integerCategory299_26(spill299_2);
        break lexical_join_80;
    }
    if (!(spill299_2)) {
        break lexical_join_108;
    }
    lexicalValue299_80_0 = __integerCategory299_28(__call299_27(life9_91, "ChunkZ"));
    }
    if (!((life4_5 != null))) {
        lexicalValue299_86_0 = lexicalValue299_80_0;
        break lexical_join_86;
    }
    if (!((lexicalValue299_80_0 != 0))) {
        break lexical_join_108;
    }
    lexicalValue299_86_0 = __call299_29(life9_91, "ChunkX");
    }
    life10_119 = lexicalValue299_86_0;
    life11_123 = __call299_30(life9_91, "ChunkZ");
    life12_127 = __call299_31(life9_91, p0);
    spill299_3 = life12_127;
    if (!((life4_5 != null))) {
        lexicalValue299_107_0 = spill299_3;
        break lexical_join_107;
    }
    if (!((spill299_3 != null))) {
        break lexical_join_108;
    }
    lexicalValue299_107_0 = __call299_35(__fieldRead299_32(receiver), __call299_34(__call299_33(life10_119, life11_123)), life12_127);
    }
    __discardScalar299_36(lexicalValue299_107_0);
    }
    if (!((life4_5 == null))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    return;
}
public static void h299_0(moom.Oo p0) throws Throwable {
    throw __call1029900_0(p0);
}
public static void h299_1(moom.Oo p0) throws Throwable {
    throw __call1029901_0(p0);
}
public static void h299_2(moom.Oo p0) throws Throwable {
    throw __call1029902_0(p0);
}
public static void h299_3(moom.Oo p0) throws Throwable {
    throw __call1029903_0(p0);
}
public static void h299_4(moom.Oo p0) throws Throwable {
    throw __call1029904_0(p0);
}
public static void h299_5(moom.Oo p0) throws Throwable {
    throw __call1029905_0(p0);
}
public static void h299_6(moom.Oo p0) throws Throwable {
    throw __call1029906_0(p0);
}
public static void h299_7(moom.Oo p0) throws Throwable {
    throw __call1029907_0(p0);
}
public static void h299_8(moom.Oo p0) throws Throwable {
    throw __call1029908_0(p0);
}
public static void h299_9(moom.Oo p0) throws Throwable {
    throw __call1029909_0(p0);
}
public static void h299_10(moom.Oo p0) throws Throwable {
    throw __call1029910_0(p0);
}
public static void h299_11(moom.Oo p0) throws Throwable {
    throw __call1029911_0(p0);
}
public static void h299_12(moom.Oo p0) throws Throwable {
    throw __call1029912_0(p0);
}
private static native long __fieldRead299_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call299_1() throws Throwable;
private static native net.minecraft.world.gen.structure.MapGenStructureData __fieldRead299_2(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.lang.Object __classLiteral299_3() throws Throwable;
private static native java.lang.String __call299_4(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native net.minecraft.world.WorldSavedData __call299_5(net.minecraft.world.World a0, java.lang.Object a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.world.gen.structure.MapGenStructureData __cast299_6(net.minecraft.world.WorldSavedData a0) throws Throwable;
private static native void __fieldWrite299_7(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.gen.structure.MapGenStructureData a1) throws Throwable;
private static native net.minecraft.world.gen.structure.MapGenStructureData __fieldRead299_8(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.lang.String __call299_9(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native void __fieldWrite299_10(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.gen.structure.MapGenStructureData a1) throws Throwable;
private static native java.lang.String __call299_11(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native net.minecraft.world.gen.structure.MapGenStructureData __fieldRead299_12(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native void __call299_13(net.minecraft.world.World a0, java.lang.String a1, net.minecraft.world.gen.structure.MapGenStructureData a2) throws Throwable;
private static native net.minecraft.world.gen.structure.MapGenStructureData __fieldRead299_14(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call299_15(net.minecraft.world.gen.structure.MapGenStructureData a0) throws Throwable;
private static native java.util.Set __call299_16(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Iterator __call299_17(java.util.Set a0) throws Throwable;
private static native boolean __call299_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call299_19(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast299_20(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call299_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native byte __call299_22(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __invokedynamic299_23(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast299_24(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native boolean __call299_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory299_26(boolean value) throws Throwable;
private static native boolean __call299_27(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory299_28(boolean value) throws Throwable;
private static native int __call299_29(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call299_30(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native moom.Ir __call299_31(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws Throwable;
private static native java.util.Map __fieldRead299_32(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call299_33(int a0, int a1) throws Throwable;
private static native java.lang.Long __call299_34(long a0) throws Throwable;
private static native java.lang.Object __call299_35(java.util.Map a0, java.lang.Long a1, moom.Ir a2) throws Throwable;
private static native void __discardScalar299_36(java.lang.Object a0) throws Throwable;
private static native java.lang.Throwable __call1029900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029912_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e3f3cdbd36085f7487bb(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1, int a2, int a3, int a4, int a5, moom.Fm a6) throws E;
private static final class __SourceHandler_e3f3cdbd36085f7487bb {

public static void f644(net.minecraft.world.gen.structure.MapGenStructure receiver, net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) throws Throwable {
    int forwardValue644_29_0;
    net.minecraft.world.gen.structure.MapGenStructure forwardValue644_33_0;
    int forwardValue644_33_1;
    int forwardValue644_33_2;
    net.minecraft.entity.Entity[] spill644_0;
    boolean spill644_1;
    net.minecraft.world.gen.structure.MapGenStructure spill644_2;
    int spill644_3;
    int spill644_4;
    long life7_3;
    net.minecraft.entity.Entity[] life9_8;
    moom.Ir life10_40;
    forward_join_49: {
    forward_join_33: {
    forward_join_29: {
    life7_3 = (__fieldRead644_0() ^ 67125328993341L);
    spill644_0 = __call644_1();
    __call644_2(receiver, p0);
    life9_8 = spill644_0;
    spill644_1 = __call644_6(__fieldRead644_3(receiver), __call644_5(__call644_4(p1, p2)));
    if (!((life9_8 != null))) {
        forwardValue644_29_0 = __integerCategory644_7(spill644_1);
        break forward_join_29;
    }
    if (!((!spill644_1))) {
        break forward_join_49;
    }
    __call644_9(__fieldRead644_8(receiver));
    spill644_2 = receiver;
    spill644_3 = p1;
    spill644_4 = p2;
    if (!((life9_8 != null))) {
        forwardValue644_33_0 = spill644_2;
        forwardValue644_33_1 = spill644_3;
        forwardValue644_33_2 = spill644_4;
        break forward_join_33;
    }
    forwardValue644_29_0 = __integerCategory644_11(__call644_10(spill644_2, spill644_3, spill644_4));
    }
    if (!((forwardValue644_29_0 != 0))) {
        break forward_join_49;
    }
    forwardValue644_33_0 = receiver;
    forwardValue644_33_1 = p1;
    forwardValue644_33_2 = p2;
    }
    life10_40 = __call644_12(forwardValue644_33_0, forwardValue644_33_1, forwardValue644_33_2);
    __call644_16(__fieldRead644_13(receiver), __call644_15(__call644_14(p1, p2)), life10_40);
    __call644_17(receiver, p1, p2, life10_40);
    }
    return;
}
public static void h644_0(java.lang.Throwable p0) throws Throwable {
    throw __call2064400_0(p0);
}
public static void h644_1(java.lang.Throwable p0) throws Throwable {
    throw __call2064401_0(p0);
}
public static void h644_2(java.lang.Throwable p0, net.minecraft.world.gen.structure.MapGenStructure p1, int p2, int p3) throws Throwable {
    java.lang.Throwable local4 = p0;
    moom.qY local5 = __call2064402_0(local4, "Exception preparing structure feature");
    moom.qZ local6 = __call2064402_1(local5, "Feature being prepared");
    __call2064402_3(local6, "Is feature chunk", __invokedynamic2064402_2(p1, p2, p3));
    moom.qZ spill2064402_0 = local6;
    java.lang.String spill2064402_1 = "Chunk location";
    java.lang.String spill2064402_2 = "%d,%d";
    java.lang.Object[] __stackOp2064402_4_0 = new java.lang.Object[2];
    java.lang.Object[] spill2064402_3 = __stackOp2064402_4_0;
    (__stackOp2064402_4_0)[0] = __call2064402_5(p2);
    java.lang.Object[] __stackOp2064402_6_0 = spill2064402_3;
    java.lang.Object[] spill2064402_4 = __stackOp2064402_6_0;
    (__stackOp2064402_6_0)[1] = __call2064402_7(p3);
    __call2064402_9(spill2064402_0, spill2064402_1, __call2064402_8(spill2064402_2, spill2064402_4));
    __call2064402_11(local6, "Chunk pos hash", __invokedynamic2064402_10(p2, p3));
    __call2064402_13(local6, "Structure type", __invokedynamic2064402_12(p1));
    throw new moom.Oo(local5);
}
private static native long __fieldRead644_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call644_1() throws Throwable;
private static native void __call644_2(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native java.util.Map __fieldRead644_3(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call644_4(int a0, int a1) throws Throwable;
private static native java.lang.Long __call644_5(long a0) throws Throwable;
private static native boolean __call644_6(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native int __integerCategory644_7(boolean value) throws Throwable;
private static native java.util.Random __fieldRead644_8(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native int __call644_9(java.util.Random a0) throws Throwable;
private static native boolean __call644_10(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2) throws Throwable;
private static native int __integerCategory644_11(boolean value) throws Throwable;
private static native moom.Ir __call644_12(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead644_13(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call644_14(int a0, int a1) throws Throwable;
private static native java.lang.Long __call644_15(long a0) throws Throwable;
private static native java.lang.Object __call644_16(java.util.Map a0, java.lang.Long a1, moom.Ir a2) throws Throwable;
private static native void __call644_17(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2, moom.Ir a3) throws Throwable;
private static native java.lang.Throwable __call2064400_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2064401_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2064402_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2064402_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2064402_2(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2) throws Throwable;
private static native void __call2064402_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Integer __call2064402_5(int a0) throws Throwable;
private static native java.lang.Integer __call2064402_7(int a0) throws Throwable;
private static native java.lang.String __call2064402_8(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call2064402_9(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2064402_10(int a0, int a1) throws Throwable;
private static native void __call2064402_11(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2064402_12(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native void __call2064402_13(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0b90222fdb6f30cb6d81(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1, java.util.Random a2, moom.Ee a3) throws E;
private static final class __SourceHandler_0b90222fdb6f30cb6d81 {

public static boolean f1848(net.minecraft.world.gen.structure.MapGenStructure receiver, net.minecraft.world.World p0, java.util.Random p1, moom.Ee p2) throws Throwable {
    int lexicalValue1848_55_0;
    int lexicalValue1848_77_0;
    int lexicalValue1848_107_0;
    int lexicalValue1848_118_0;
    net.minecraft.entity.Entity[] spill1848_0;
    boolean spill1848_1;
    long life4_3;
    int life7_17;
    int life8_28;
    int life9_30;
    java.util.Iterator life10_36;
    net.minecraft.entity.Entity[] life6_37;
    moom.Ir life11_44;
    lexical_join_118: {
    lexical_join_117: {
    life4_3 = (__fieldRead1848_0() ^ 92556835087689L);
    __call1848_1(receiver, p0);
    life7_17 = ((__fieldRead1848_2(p2) << 4) + __invokedynamic1848_3(18169, (9024934073284178201L ^ life4_3)));
    life8_28 = ((__fieldRead1848_4(p2) << 4) + __invokedynamic1848_5(15659, (4812113500299741896L ^ life4_3)));
    life9_30 = 0;
    spill1848_0 = __call1848_6();
    life10_36 = __call1848_9(__call1848_8(__fieldRead1848_7(receiver)));
    life6_37 = spill1848_0;
    lexical_cycle_38: while (true) {
    lexical_join_115: {
    lexical_join_107: {
    lexical_join_77: {
    lexical_join_55: {
    if (!(__call1848_10(life10_36))) {
        break lexical_join_117;
    }
    life11_44 = __cast1848_12(__call1848_11(life10_36));
    spill1848_1 = __call1848_13(life11_44);
    if (!((life6_37 != null))) {
        lexicalValue1848_118_0 = __integerCategory1848_14(spill1848_1);
        break lexical_join_118;
    }
    if (!((life6_37 != null))) {
        lexicalValue1848_55_0 = __integerCategory1848_15(spill1848_1);
        break lexical_join_55;
    }
    if (!(spill1848_1)) {
        break lexical_join_115;
    }
    lexicalValue1848_55_0 = __integerCategory1848_17(__call1848_16(life11_44, p2));
    }
    if (!((life6_37 != null))) {
        lexicalValue1848_77_0 = lexicalValue1848_55_0;
        break lexical_join_77;
    }
    if (!((lexicalValue1848_55_0 != 0))) {
        break lexical_join_115;
    }
    lexicalValue1848_77_0 = __integerCategory1848_22(__call1848_21(__call1848_18(life11_44), life7_17, life8_28, (life7_17 + __invokedynamic1848_19(21368, (2700485591221740703L ^ life4_3))), (life8_28 + __invokedynamic1848_20(15129, (9099624218743852280L ^ life4_3)))));
    }
    if (!((life6_37 != null))) {
        lexicalValue1848_107_0 = lexicalValue1848_77_0;
        break lexical_join_107;
    }
    if (!((lexicalValue1848_77_0 != 0))) {
        break lexical_join_115;
    }
    __call1848_25(life11_44, p0, p1, new moom.G2(life7_17, life8_28, (life7_17 + __invokedynamic1848_23(15129, (9099624218743852280L ^ life4_3))), (life8_28 + __invokedynamic1848_24(15129, (9099624218743852280L ^ life4_3)))));
    __call1848_26(life11_44, p2);
    lexicalValue1848_107_0 = 1;
    }
    life9_30 = lexicalValue1848_107_0;
    __call1848_29(receiver, __call1848_27(life11_44), __call1848_28(life11_44), life11_44);
    }
    if (!((life6_37 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    lexicalValue1848_118_0 = life9_30;
    }
    return __integerCategory1848_30(lexicalValue1848_118_0);
}
public static void h1848_0(moom.Oo p0) throws Throwable {
    throw __call1184800_0(p0);
}
public static void h1848_1(moom.Oo p0) throws Throwable {
    throw __call1184801_0(p0);
}
public static void h1848_2(moom.Oo p0) throws Throwable {
    throw __call1184802_0(p0);
}
public static void h1848_3(moom.Oo p0) throws Throwable {
    throw __call1184803_0(p0);
}
public static void h1848_4(moom.Oo p0) throws Throwable {
    throw __call1184804_0(p0);
}
public static void h1848_5(moom.Oo p0) throws Throwable {
    throw __call1184805_0(p0);
}
public static void h1848_6(moom.Oo p0) throws Throwable {
    throw __call1184806_0(p0);
}
private static native long __fieldRead1848_0() throws Throwable;
private static native void __call1848_1(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native int __fieldRead1848_2(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1848_3(int a0, long a1) throws Throwable;
private static native int __fieldRead1848_4(moom.Ee a0) throws Throwable;
private static native int __invokedynamic1848_5(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1848_6() throws Throwable;
private static native java.util.Map __fieldRead1848_7(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.util.Collection __call1848_8(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1848_9(java.util.Collection a0) throws Throwable;
private static native boolean __call1848_10(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1848_11(java.util.Iterator a0) throws Throwable;
private static native moom.Ir __cast1848_12(java.lang.Object a0) throws Throwable;
private static native boolean __call1848_13(moom.Ir a0) throws Throwable;
private static native int __integerCategory1848_14(boolean value) throws Throwable;
private static native int __integerCategory1848_15(boolean value) throws Throwable;
private static native boolean __call1848_16(moom.Ir a0, moom.Ee a1) throws Throwable;
private static native int __integerCategory1848_17(boolean value) throws Throwable;
private static native moom.G2 __call1848_18(moom.Ir a0) throws Throwable;
private static native int __invokedynamic1848_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1848_20(int a0, long a1) throws Throwable;
private static native boolean __call1848_21(moom.G2 a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __integerCategory1848_22(boolean value) throws Throwable;
private static native int __invokedynamic1848_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic1848_24(int a0, long a1) throws Throwable;
private static native void __call1848_25(moom.Ir a0, net.minecraft.world.World a1, java.util.Random a2, moom.G2 a3) throws Throwable;
private static native void __call1848_26(moom.Ir a0, moom.Ee a1) throws Throwable;
private static native int __call1848_27(moom.Ir a0) throws Throwable;
private static native int __call1848_28(moom.Ir a0) throws Throwable;
private static native void __call1848_29(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2, moom.Ir a3) throws Throwable;
private static native boolean __integerCategory1848_30(int value) throws Throwable;
private static native java.lang.Throwable __call1184800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184806_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_da7ef2238ff1442106d8(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1, moom.DT a2) throws E;
private static final class __SourceHandler_da7ef2238ff1442106d8 {

public static moom.DT f1849(net.minecraft.world.gen.structure.MapGenStructure receiver, net.minecraft.world.World p0, moom.DT p1) throws Throwable {
    java.lang.Object lexicalValue1849_91_0;
    double lexicalValue1849_107_0;
    moom.DT lexicalValue1849_117_0;
    double lexicalValue1849_148_0;
    moom.DT lexicalValue1849_154_0;
    net.minecraft.entity.Entity[] spill1849_0;
    moom.Ir spill1849_1;
    double spill1849_2;
    moom.DT spill1849_3;
    moom.DT spill1849_4;
    double spill1849_5;
    long life3_3;
    long life6_18;
    long life8_22;
    long life10_30;
    long life12_39;
    net.minecraft.entity.Entity[] life5_49;
    double life14_65;
    moom.DT life16_67;
    java.util.Iterator life17_72;
    moom.Ir life18_79;
    moom.G4 life19_101;
    moom.DT life20_104;
    double life21_108;
    java.util.List life17_138;
    moom.DT life18_142;
    java.util.Iterator life19_145;
    moom.DT life20_152;
    double life21_158;
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_112: {
    life3_3 = (__fieldRead1849_0() ^ 5011037474622L);
    __fieldWrite1849_1(receiver, p0);
    __call1849_2(receiver, p0);
    __call1849_5(__fieldRead1849_3(receiver), __call1849_4(p0));
    life6_18 = __call1849_7(__fieldRead1849_6(receiver));
    life8_22 = __call1849_9(__fieldRead1849_8(receiver));
    life10_30 = (((long) (__call1849_10(p1) >> 4)) * life6_18);
    spill1849_0 = __call1849_11();
    life12_39 = (((long) (__call1849_12(p1) >> 4)) * life8_22);
    __call1849_15(__fieldRead1849_13(receiver), ((life10_30 ^ life12_39) ^ __call1849_14(p0)));
    life5_49 = spill1849_0;
    __call1849_18(receiver, p0, (__call1849_16(p1) >> 4), (__call1849_17(p1) >> 4), 0, 0, null);
    life14_65 = 0x1.fffffffffffffp1023d;
    life16_67 = null;
    life17_72 = __call1849_21(__call1849_20(__fieldRead1849_19(receiver)));
    lexical_cycle_73: while (true) {
    lexical_join_110: {
    lexical_join_107: {
    lexical_join_91: {
    if (!(__call1849_22(life17_72))) {
        break lexical_join_112;
    }
    life18_79 = __cast1849_24(__call1849_23(life17_72));
    if (!((life5_49 != null))) {
        break lexical_join_118;
    }
    spill1849_1 = life18_79;
    if (!((life5_49 != null))) {
        lexicalValue1849_91_0 = spill1849_1;
        break lexical_join_91;
    }
    if (!(__call1849_25(spill1849_1))) {
        break lexical_join_110;
    }
    lexicalValue1849_91_0 = __call1849_27(__call1849_26(life18_79), 0);
    }
    life19_101 = __cast1849_28(lexicalValue1849_91_0);
    life20_104 = __call1849_29(life19_101);
    life21_108 = __call1849_30(life20_104, p1);
    spill1849_2 = life21_108;
    if (!((life5_49 != null))) {
        lexicalValue1849_107_0 = spill1849_2;
        break lexical_join_107;
    }
    if (!((__numericCompare1849_31(spill1849_2, life14_65) < 0))) {
        break lexical_join_110;
    }
    lexicalValue1849_107_0 = life21_108;
    }
    life14_65 = lexicalValue1849_107_0;
    life16_67 = life20_104;
    }
    if (!((life5_49 == null))) { continue lexical_cycle_73; }
    break lexical_cycle_73;
    }
    }
    spill1849_3 = life16_67;
    if (!((life5_49 != null))) {
        lexicalValue1849_117_0 = spill1849_3;
        break lexical_join_117;
    }
    if (!((spill1849_3 != null))) {
        break lexical_join_118;
    }
    lexicalValue1849_117_0 = life16_67;
    }
    return lexicalValue1849_117_0;
    }
    life17_138 = __call1849_32(receiver);
    if (!((life17_138 != null))) {
        break lexical_join_155;
    }
    life18_142 = null;
    life19_145 = __call1849_33(life17_138);
    lexical_cycle_128: while (true) {
    lexical_join_151: {
    lexical_join_148: {
    if (!(__call1849_34(life19_145))) {
        break lexical_join_153;
    }
    life20_152 = __cast1849_36(__call1849_35(life19_145));
    spill1849_4 = life20_152;
    if (!((life5_49 != null))) {
        lexicalValue1849_154_0 = spill1849_4;
        break lexical_join_154;
    }
    life21_158 = __call1849_37(spill1849_4, p1);
    spill1849_5 = life21_158;
    if (!((life5_49 != null))) {
        lexicalValue1849_148_0 = spill1849_5;
        break lexical_join_148;
    }
    if (!((__numericCompare1849_38(spill1849_5, life14_65) < 0))) {
        break lexical_join_151;
    }
    lexicalValue1849_148_0 = life21_158;
    }
    life14_65 = lexicalValue1849_148_0;
    life18_142 = life20_152;
    }
    if (!((life5_49 == null))) { continue lexical_cycle_128; }
    break lexical_cycle_128;
    }
    }
    lexicalValue1849_154_0 = life18_142;
    }
    return lexicalValue1849_154_0;
    }
    return null;
}
public static void h1849_0(moom.Oo p0) throws Throwable {
    throw __call1184900_0(p0);
}
public static void h1849_1(moom.Oo p0) throws Throwable {
    throw __call1184901_0(p0);
}
public static void h1849_2(moom.Oo p0) throws Throwable {
    throw __call1184902_0(p0);
}
public static void h1849_3(moom.Oo p0) throws Throwable {
    throw __call1184903_0(p0);
}
public static void h1849_4(moom.Oo p0) throws Throwable {
    throw __call1184904_0(p0);
}
public static void h1849_5(moom.Oo p0) throws Throwable {
    throw __call1184905_0(p0);
}
public static void h1849_6(moom.Oo p0) throws Throwable {
    throw __call1184906_0(p0);
}
public static void h1849_7(moom.Oo p0) throws Throwable {
    throw __call1184907_0(p0);
}
private static native long __fieldRead1849_0() throws Throwable;
private static native void __fieldWrite1849_1(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native void __call1849_2(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native java.util.Random __fieldRead1849_3(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call1849_4(net.minecraft.world.World a0) throws Throwable;
private static native void __call1849_5(java.util.Random a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead1849_6(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call1849_7(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead1849_8(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call1849_9(java.util.Random a0) throws Throwable;
private static native int __call1849_10(moom.DT a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1849_11() throws Throwable;
private static native int __call1849_12(moom.DT a0) throws Throwable;
private static native java.util.Random __fieldRead1849_13(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native long __call1849_14(net.minecraft.world.World a0) throws Throwable;
private static native void __call1849_15(java.util.Random a0, long a1) throws Throwable;
private static native int __call1849_16(moom.DT a0) throws Throwable;
private static native int __call1849_17(moom.DT a0) throws Throwable;
private static native void __call1849_18(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1, int a2, int a3, int a4, int a5, java.lang.Object a6) throws Throwable;
private static native java.util.Map __fieldRead1849_19(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.util.Collection __call1849_20(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1849_21(java.util.Collection a0) throws Throwable;
private static native boolean __call1849_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1849_23(java.util.Iterator a0) throws Throwable;
private static native moom.Ir __cast1849_24(java.lang.Object a0) throws Throwable;
private static native boolean __call1849_25(moom.Ir a0) throws Throwable;
private static native java.util.LinkedList __call1849_26(moom.Ir a0) throws Throwable;
private static native java.lang.Object __call1849_27(java.util.LinkedList a0, int a1) throws Throwable;
private static native moom.G4 __cast1849_28(java.lang.Object a0) throws Throwable;
private static native moom.DT __call1849_29(moom.G4 a0) throws Throwable;
private static native double __call1849_30(moom.DT a0, moom.DT a1) throws Throwable;
private static native int __numericCompare1849_31(double a0, double a1) throws Throwable;
private static native java.util.List __call1849_32(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.util.Iterator __call1849_33(java.util.List a0) throws Throwable;
private static native boolean __call1849_34(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1849_35(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast1849_36(java.lang.Object a0) throws Throwable;
private static native double __call1849_37(moom.DT a0, moom.DT a1) throws Throwable;
private static native int __numericCompare1849_38(double a0, double a1) throws Throwable;
private static native java.lang.Throwable __call1184900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184907_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5bde57fff83a197b4bd0(net.minecraft.world.gen.structure.MapGenStructure a0, moom.DT a1) throws E;
private static final class __SourceHandler_5bde57fff83a197b4bd0 {

public static boolean f3224(net.minecraft.world.gen.structure.MapGenStructure receiver, moom.DT p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead3224_0() ^ 74771416072738L);
    __call3224_2(receiver, __fieldRead3224_1(receiver));
    return ((__call3224_3(receiver, p0) != null) ? true : false);
}
public static void h3224_0(moom.Oo p0) throws Throwable {
    throw __call1322400_0(p0);
}
private static native long __fieldRead3224_0() throws Throwable;
private static native net.minecraft.world.World __fieldRead3224_1(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native void __call3224_2(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native moom.Ir __call3224_3(net.minecraft.world.gen.structure.MapGenStructure a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1322400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a6670aed6e43b226b807(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1, moom.DT a2) throws E;
private static final class __SourceHandler_a6670aed6e43b226b807 {

public static boolean f1850(net.minecraft.world.gen.structure.MapGenStructure receiver, net.minecraft.world.World p0, moom.DT p1) throws Throwable {
    int lexicalValue1850_32_0;
    int lexicalValue1850_36_0;
    int lexicalValue1850_40_0;
    net.minecraft.entity.Entity[] spill1850_0;
    boolean spill1850_1;
    long life3_3;
    java.util.Iterator life6_12;
    net.minecraft.entity.Entity[] life5_13;
    moom.Ir life7_20;
    lexical_join_40: {
    lexical_join_39: {
    life3_3 = (__fieldRead1850_0() ^ 47612621753545L);
    __call1850_1(receiver, p0);
    spill1850_0 = __call1850_2();
    life6_12 = __call1850_5(__call1850_4(__fieldRead1850_3(receiver)));
    life5_13 = spill1850_0;
    lexical_cycle_14: while (true) {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_32: {
    if (!(__call1850_6(life6_12))) {
        break lexical_join_39;
    }
    life7_20 = __cast1850_8(__call1850_7(life6_12));
    spill1850_1 = __call1850_9(life7_20);
    if (!((life5_13 != null))) {
        lexicalValue1850_40_0 = __integerCategory1850_10(spill1850_1);
        break lexical_join_40;
    }
    if (!((life5_13 != null))) {
        lexicalValue1850_32_0 = __integerCategory1850_11(spill1850_1);
        break lexical_join_32;
    }
    if (!(spill1850_1)) {
        break lexical_join_37;
    }
    lexicalValue1850_32_0 = __integerCategory1850_14(__call1850_13(__call1850_12(life7_20), p1));
    }
    if (!((life5_13 != null))) {
        lexicalValue1850_36_0 = lexicalValue1850_32_0;
        break lexical_join_36;
    }
    if (!((lexicalValue1850_32_0 != 0))) {
        break lexical_join_37;
    }
    lexicalValue1850_36_0 = 1;
    }
    return __integerCategory1850_15(lexicalValue1850_36_0);
    }
    if (!((life5_13 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1850_40_0 = 0;
    }
    return __integerCategory1850_16(lexicalValue1850_40_0);
}
public static void h1850_0(moom.Oo p0) throws Throwable {
    throw __call1185000_0(p0);
}
public static void h1850_1(moom.Oo p0) throws Throwable {
    throw __call1185001_0(p0);
}
public static void h1850_2(moom.Oo p0) throws Throwable {
    throw __call1185002_0(p0);
}
public static void h1850_3(moom.Oo p0) throws Throwable {
    throw __call1185003_0(p0);
}
private static native long __fieldRead1850_0() throws Throwable;
private static native void __call1850_1(net.minecraft.world.gen.structure.MapGenStructure a0, net.minecraft.world.World a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1850_2() throws Throwable;
private static native java.util.Map __fieldRead1850_3(net.minecraft.world.gen.structure.MapGenStructure a0) throws Throwable;
private static native java.util.Collection __call1850_4(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1850_5(java.util.Collection a0) throws Throwable;
private static native boolean __call1850_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1850_7(java.util.Iterator a0) throws Throwable;
private static native moom.Ir __cast1850_8(java.lang.Object a0) throws Throwable;
private static native boolean __call1850_9(moom.Ir a0) throws Throwable;
private static native int __integerCategory1850_10(boolean value) throws Throwable;
private static native int __integerCategory1850_11(boolean value) throws Throwable;
private static native moom.G2 __call1850_12(moom.Ir a0) throws Throwable;
private static native boolean __call1850_13(moom.G2 a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1850_14(boolean value) throws Throwable;
private static native boolean __integerCategory1850_15(int value) throws Throwable;
private static native boolean __integerCategory1850_16(int value) throws Throwable;
private static native java.lang.Throwable __call1185000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1185003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_b95bb76f201815bcc1b5(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2) throws E;
private static final class __SourceHandler_b95bb76f201815bcc1b5 {

public static java.lang.String f3226(net.minecraft.world.gen.structure.MapGenStructure receiver, int p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead3226_0() ^ 19673787358879L);
    return (__call3226_1(receiver, p0, p1) ? "True" : "False");
}
public static void h3226_0(java.lang.Exception p0) throws Throwable {
    throw __call1322600_0(p0);
}
private static native long __fieldRead3226_0() throws Throwable;
private static native boolean __call3226_1(net.minecraft.world.gen.structure.MapGenStructure a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1322600_0(java.lang.Exception a0) throws Throwable;

}


protected abstract moom.Ir a(int p0, int p1);

protected abstract boolean a__Boolean(int p0, int p1);

private void a(int p0, int p1, moom.Ir p2) {
((net.minecraft.world.gen.structure.MapGenStructureData)(this.e)).a(((net.minecraft.nbt.NBTTagCompound)(((moom.Ir)(p2)).a(((int)(p0)), ((int)(p1))))), ((int)(p0)), ((int)(p1)));
    ((net.minecraft.world.gen.structure.MapGenStructureData)(this.e)).a();
    return;
}


private void a(net.minecraft.world.World p0) { __sourceHandlerCall_d083e2f8b1b758cf11bf(this, p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.MapGenStructure.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31383;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FM", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12712_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public abstract java.lang.String a();

protected moom.Ir a(moom.DT p0) { return __sourceHandlerCall_9a5a7c39558cad3def9d(this, p0); }


public boolean a__Boolean(moom.DT p0) { return __sourceHandlerCall_5bde57fff83a197b4bd0(this, p0); }


public boolean a(net.minecraft.world.World p0, java.util.Random p1, moom.Ee p2) { return __sourceHandlerCall_0b90222fdb6f30cb6d81(this, p0, p1, p2); }


protected final void a(net.minecraft.world.World p0, int p1, int p2, int p3, int p4, moom.Fm p5) { __sourceHandlerCall_e3f3cdbd36085f7487bb(this, p0, p1, p2, p3, p4, p5); }


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) { return __sourceHandlerCall_a6670aed6e43b226b807(this, p0, p1); }


protected java.util.List<moom.DT> a__List() {
return null;
}


public moom.DT a(net.minecraft.world.World p0, moom.DT p1) { return __sourceHandlerCall_da7ef2238ff1442106d8(this, p0, p1); }


private java.lang.String lambda$recursiveGenerate$0(int p0, int p1) throws java.lang.Exception { return __sourceHandlerCall_b95bb76f201815bcc1b5(this, p0, p1); }


private java.lang.String lambda$recursiveGenerate$2() throws java.lang.Exception {
return ((java.lang.Class)(((java.lang.Object)(this)).getClass())).getCanonicalName();
}


private static java.lang.String lambda$recursiveGenerate$1(int p0, int p1) throws java.lang.Exception {
return java.lang.String.valueOf(((long)(moom.Ee.a(((int)(p0)), ((int)(p1))))));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12712_0() throws E;
}
