package moom;


public class qC extends net.minecraft.command.CommandBase {

private static long c;

private static long d;

public qC() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4631580489799645873L)), ((long)(5676338128540702044L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183170051387683L)))));
    long local0_life6 = (moom.qC.c ^ 122598050066261L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill968_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill968_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill968_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill968_13 = new byte[8];
    (__sourceSpill968_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill968_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation968_15 = __sourceSpill968_13;
    ((javax.crypto.Cipher)(__sourceSpill968_10)).init(((int)(__sourceSpill968_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill968_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation968_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 7116055999667248316L;
    byte[] __sourceSpill968_19 = new byte[8];
    (__sourceSpill968_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill968_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill968_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill968_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill968_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill968_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill968_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill968_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill968_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill968_20)).doFinal(((byte[])(__sourceSpill968_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_195cddc03d4523e97071(moom.qC a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_195cddc03d4523e97071 {

public static void f151(moom.qC receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] lexicalValue151_20_0;
    int lexicalValue151_91_0;
    int lexicalValue151_103_0;
    net.minecraft.entity.Entity lexicalValue151_155_0;
    int lexicalValue151_186_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue151_203_0;
    java.lang.String lexicalValue151_203_1;
    net.minecraft.entity.Entity lexicalValue151_228_0;
    java.lang.String[] spill151_0;
    boolean spill151_1;
    net.minecraft.entity.Entity spill151_2;
    int spill151_3;
    int spill151_4;
    net.minecraft.nbt.NBTTagCompound spill151_5;
    java.lang.String spill151_6;
    net.minecraft.entity.Entity spill151_7;
    long life3_3;
    int life5_5;
    java.lang.String life6_27;
    moom.DT life7_30;
    moom.DR life8_33;
    double life9_36;
    double life11_39;
    double life13_42;
    net.minecraft.world.World life15_82;
    net.minecraft.nbt.NBTTagCompound life16_134;
    int life17_136;
    net.minecraft.util.IChatComponent life18_150;
    net.minecraft.entity.Entity life18_178;
    net.minecraft.entity.Entity life19_250;
    net.minecraft.nbt.NBTTagCompound life20_252;
    net.minecraft.entity.Entity life21_274;
    lexical_join_241: {
    lexical_join_235: {
    lexical_join_186: {
    lexical_join_183: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_139: {
    lexical_join_135: {
    lexical_join_112: {
    lexical_join_103: {
    lexical_join_91: {
    lexical_join_88: {
    lexical_join_72: {
    lexical_join_65: {
    lexical_join_20: {
    lexical_join_19: {
    life3_3 = (__fieldRead151_0() ^ 88268286826599L);
    life5_5 = __call151_1();
    spill151_0 = p1;
    if (!((life5_5 != 0))) {
        lexicalValue151_20_0 = spill151_0;
        break lexical_join_20;
    }
    if (!(((spill151_0).length < 1))) {
        break lexical_join_19;
    }
    throw new moom.cc("commands.summon.usage", new java.lang.Object[0]);
    }
    lexicalValue151_20_0 = p1;
    }
    life6_27 = (lexicalValue151_20_0)[0];
    life7_30 = __call151_2(p0);
    life8_33 = __call151_3(p0);
    life9_36 = __fieldRead151_4(life8_33);
    life11_39 = __fieldRead151_5(life8_33);
    life13_42 = __fieldRead151_6(life8_33);
    if (!((life5_5 != 0))) {
        break lexical_join_65;
    }
    if (!(((p1).length >= 4))) {
        break lexical_join_72;
    }
    life9_36 = __call151_7(life9_36, (p1)[1], 1);
    life11_39 = __call151_8(life11_39, (p1)[2], 0);
    life13_42 = __call151_9(life13_42, (p1)[3], 1);
    }
    life7_30 = new moom.DT(life9_36, life11_39, life13_42);
    }
    life15_82 = __call151_10(p0);
    spill151_1 = __call151_11(life15_82, life7_30);
    if (!((life5_5 != 0))) {
        lexicalValue151_91_0 = __integerCategory151_12(spill151_1);
        break lexical_join_91;
    }
    if (!((!spill151_1))) {
        break lexical_join_88;
    }
    throw new moom.b7("commands.summon.outOfWorld", new java.lang.Object[0]);
    }
    lexicalValue151_91_0 = __integerCategory151_14(__call151_13("LightningBolt", life6_27));
    }
    if (!((life5_5 != 0))) {
        lexicalValue151_103_0 = lexicalValue151_91_0;
        break lexical_join_103;
    }
    if (!((lexicalValue151_91_0 != 0))) {
        break lexical_join_112;
    }
    lexicalValue151_103_0 = __integerCategory151_16(__call151_15(life15_82, new moom.tu(life15_82, life9_36, life11_39, life13_42)));
    }
    __discardScalar151_17(lexicalValue151_103_0);
    __call151_18(p0, receiver, "commands.summon.success", new java.lang.Object[0]);
    if (!((life5_5 == 0))) {
        break lexical_join_241;
    }
    }
    life16_134 = new net.minecraft.nbt.NBTTagCompound();
    life17_136 = 0;
    if (!((life5_5 != 0))) {
        break lexical_join_139;
    }
    if (!(((p1).length >= 5))) {
        break lexical_join_135;
    }
    life18_150 = __call151_19(p0, p1, 4);
    life16_134 = __call151_21(__call151_20(life18_150));
    life17_136 = 1;
    }
    __call151_22(life16_134, "id", life6_27);
    }
    life18_178 = __call151_23(life16_134, life15_82);
    spill151_2 = life18_178;
    if (!((life5_5 != 0))) {
        lexicalValue151_155_0 = spill151_2;
        break lexical_join_155;
    }
    if (!((spill151_2 == null))) {
        break lexical_join_154;
    }
    throw new moom.b7("commands.summon.failed", new java.lang.Object[0]);
    }
    lexicalValue151_155_0 = life18_178;
    }
    __call151_26(lexicalValue151_155_0, life9_36, life11_39, life13_42, __fieldRead151_24(life18_178), __fieldRead151_25(life18_178));
    spill151_3 = life17_136;
    if (!((life5_5 != 0))) {
        lexicalValue151_186_0 = spill151_3;
        break lexical_join_186;
    }
    if (!((spill151_3 == 0))) {
        break lexical_join_183;
    }
    spill151_4 = __instanceOf151_27(life18_178);
    if (!((life5_5 != 0))) {
        lexicalValue151_186_0 = spill151_4;
        break lexical_join_186;
    }
    if (!((spill151_4 != 0))) {
        break lexical_join_183;
    }
    __call151_30(__cast151_28(life18_178), __call151_29(life15_82, new moom.DT(life18_178)), null);
    }
    lexicalValue151_186_0 = __integerCategory151_32(__call151_31(life15_82, life18_178));
    }
    __discardScalar151_33(lexicalValue151_186_0);
    life19_250 = life18_178;
    life20_252 = life16_134;
    lexical_cycle_191: while (true) {
    lexical_join_228: {
    lexical_join_227: {
    lexical_join_203: {
    if (!((life19_250 != null))) {
        break lexical_join_235;
    }
    spill151_5 = life20_252;
    spill151_6 = "Riding";
    if (!((life5_5 != 0))) {
        lexicalValue151_203_0 = spill151_5;
        lexicalValue151_203_1 = spill151_6;
        break lexical_join_203;
    }
    if (!(__call151_35(spill151_5, spill151_6, ((int) __fieldRead151_34())))) {
        break lexical_join_235;
    }
    lexicalValue151_203_0 = life20_252;
    lexicalValue151_203_1 = "Riding";
    }
    life21_274 = __call151_37(__call151_36(lexicalValue151_203_0, lexicalValue151_203_1), life15_82);
    spill151_7 = life21_274;
    if (!((life5_5 != 0))) {
        lexicalValue151_228_0 = spill151_7;
        break lexical_join_228;
    }
    if (!((spill151_7 != null))) {
        break lexical_join_227;
    }
    __call151_40(life21_274, life9_36, life11_39, life13_42, __fieldRead151_38(life21_274), __fieldRead151_39(life21_274));
    __call151_41(life15_82, life21_274);
    __call151_42(life19_250, life21_274);
    }
    lexicalValue151_228_0 = life21_274;
    }
    life19_250 = lexicalValue151_228_0;
    life20_252 = __call151_43(life20_252, "Riding");
    if (!((life5_5 == 0))) { continue lexical_cycle_191; }
    break lexical_cycle_191;
    }
    }
    __call151_44(p0, receiver, "commands.summon.success", new java.lang.Object[0]);
    }
    return;
}
public static void h151_0(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015100_0(p0);
}
public static void h151_1(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015101_0(p0);
}
public static void h151_2(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015102_0(p0);
}
public static void h151_3(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015103_0(p0);
}
public static void h151_4(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015104_0(p0);
}
public static void h151_5(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015105_0(p0);
}
public static void h151_6(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015106_0(p0);
}
public static void h151_7(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015107_0(p0);
}
public static void h151_8(net.minecraft.nbt.NBTException p0, net.minecraft.entity.Entity p1) throws Throwable {
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.summon.tagError", new java.lang.Object[] {__call3015108_0(life1_2)});
}
public static void h151_9(java.lang.RuntimeException p0, net.minecraft.entity.Entity p1) throws Throwable {
    java.lang.RuntimeException life1_2;
    life1_2 = p0;
    throw new moom.b7("commands.summon.failed", new java.lang.Object[0]);
}
public static void h151_10(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015110_0(p0);
}
public static void h151_11(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015111_0(p0);
}
public static void h151_12(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015112_0(p0);
}
public static void h151_13(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015113_0(p0);
}
public static void h151_14(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015114_0(p0);
}
public static void h151_15(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015115_0(p0);
}
public static void h151_16(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015116_0(p0);
}
public static void h151_17(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015117_0(p0);
}
public static void h151_18(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015118_0(p0);
}
public static void h151_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    throw __call3015119_0(p0);
}
private static native long __fieldRead151_0() throws Throwable;
private static native int __call151_1() throws Throwable;
private static native moom.DT __call151_2(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.DR __call151_3(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native double __fieldRead151_4(moom.DR a0) throws Throwable;
private static native double __fieldRead151_5(moom.DR a0) throws Throwable;
private static native double __fieldRead151_6(moom.DR a0) throws Throwable;
private static native double __call151_7(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call151_8(double a0, java.lang.String a1, int a2) throws Throwable;
private static native double __call151_9(double a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.World __call151_10(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native boolean __call151_11(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory151_12(boolean value) throws Throwable;
private static native boolean __call151_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory151_14(boolean value) throws Throwable;
private static native boolean __call151_15(net.minecraft.world.World a0, moom.tu a1) throws Throwable;
private static native int __integerCategory151_16(boolean value) throws Throwable;
private static native void __discardScalar151_17(int a0) throws Throwable;
private static native void __call151_18(net.minecraft.command.ICommandSender a0, moom.qC a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native net.minecraft.util.IChatComponent __call151_19(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call151_20(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call151_21(java.lang.String a0) throws Throwable;
private static native void __call151_22(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.entity.Entity __call151_23(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws Throwable;
private static native float __fieldRead151_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead151_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call151_26(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native int __instanceOf151_27(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast151_28(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.Eh __call151_29(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call151_30(net.minecraft.entity.EntityLiving a0, moom.Eh a1, java.lang.Object a2) throws Throwable;
private static native boolean __call151_31(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory151_32(boolean value) throws Throwable;
private static native void __discardScalar151_33(int a0) throws Throwable;
private static native long __fieldRead151_34() throws Throwable;
private static native boolean __call151_35(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call151_36(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity __call151_37(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws Throwable;
private static native float __fieldRead151_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __fieldRead151_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __call151_40(net.minecraft.entity.Entity a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __call151_41(net.minecraft.world.World a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call151_42(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call151_43(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call151_44(net.minecraft.command.ICommandSender a0, moom.qC a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3015100_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015101_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015102_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015103_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015104_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015105_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015106_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015107_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.String __call3015108_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015110_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015111_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015112_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015113_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015114_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015115_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015116_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015117_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015118_0(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native java.lang.Exception __call3015119_0(net.minecraft.nbt.NBTException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_871a604419e9413e12ca(moom.qC a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_871a604419e9413e12ca {

public static java.util.List f1142(moom.qC receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1142_19_0;
    int forwardValue1142_19_1;
    int forwardValue1142_27_0;
    int forwardValue1142_27_1;
    java.lang.String[] forwardValue1142_29_0;
    java.util.List forwardValue1142_34_0;
    int spill1142_0;
    int spill1142_1;
    java.lang.String[] spill1142_2;
    long life4_3;
    int life6_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_29: {
    forward_join_27: {
    forward_join_19: {
    forward_join_16: {
    life4_3 = (__fieldRead1142_0() ^ 25629626927588L);
    life6_5 = __call1142_1();
    spill1142_0 = (p1).length;
    spill1142_1 = 1;
    if (!((life6_5 != 0))) {
        forwardValue1142_19_0 = spill1142_0;
        forwardValue1142_19_1 = spill1142_1;
        break forward_join_19;
    }
    if (!((spill1142_0 == spill1142_1))) {
        break forward_join_16;
    }
    forwardValue1142_34_0 = __call1142_3(p1, __call1142_2());
    break forward_join_34;
    }
    forwardValue1142_19_0 = (p1).length;
    forwardValue1142_19_1 = 1;
    }
    if (!((life6_5 != 0))) {
        forwardValue1142_27_0 = forwardValue1142_19_0;
        forwardValue1142_27_1 = forwardValue1142_19_1;
        break forward_join_27;
    }
    if (!((forwardValue1142_19_0 > forwardValue1142_19_1))) {
        break forward_join_33;
    }
    spill1142_2 = p1;
    if (!((life6_5 != 0))) {
        forwardValue1142_29_0 = spill1142_2;
        break forward_join_29;
    }
    forwardValue1142_27_0 = (spill1142_2).length;
    forwardValue1142_27_1 = 4;
    }
    if (!((forwardValue1142_27_0 <= forwardValue1142_27_1))) {
        break forward_join_33;
    }
    forwardValue1142_29_0 = p1;
    }
    forwardValue1142_34_0 = __call1142_4(forwardValue1142_29_0, 1, p2);
    break forward_join_34;
    }
    forwardValue1142_34_0 = null;
    }
    return forwardValue1142_34_0;
}
public static void h1142_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1114200_0(p0);
}
public static void h1142_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1114201_0(p0);
}
public static void h1142_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1114202_0(p0);
}
public static void h1142_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1114203_0(p0);
}
public static void h1142_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1114204_0(p0);
}
private static native long __fieldRead1142_0() throws Throwable;
private static native int __call1142_1() throws Throwable;
private static native java.util.List __call1142_2() throws Throwable;
private static native java.util.List __call1142_3(java.lang.String[] a0, java.util.List a1) throws Throwable;
private static native java.util.List __call1142_4(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native java.lang.Exception __call1114200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1114201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1114202_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1114203_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1114204_0(java.lang.RuntimeException a0) throws Throwable;

}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_871a604419e9413e12ca(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_195cddc03d4523e97071(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.summon.usage";
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "summon";
}

}
