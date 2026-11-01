package net.minecraft.command;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CommandReplaceItem extends net.minecraft.command.CommandBase {

private static java.util.Map<java.lang.String, java.lang.Integer> c;

private static long d;

private static long[] e;

private static java.lang.Integer[] g;

private static java.util.Map k;

public CommandReplaceItem() {
super();
}


static { __sourceHandlerCall_b708e84c605dda6f5d24(); }

private static native <E extends Throwable> void __sourceHandlerCall_b708e84c605dda6f5d24() throws E;
private static final class __SourceHandler_b708e84c605dda6f5d24 {

public static void f556() throws Throwable {
    javax.crypto.Cipher forestValue556_36_0;
    int forestValue556_36_1;
    javax.crypto.SecretKeyFactory forestValue556_36_2;
    byte[] forestValue556_36_3;
    javax.crypto.Cipher forestValue556_53_0;
    int forestValue556_53_1;
    javax.crypto.SecretKeyFactory forestValue556_53_2;
    byte[] forestValue556_53_3;
    long[] forestValue556_157_0;
    int forestValue556_157_1;
    long forestValue556_157_2;
    int forestValue556_157_3;
    long[] forestValue556_300_0;
    int forestValue556_300_1;
    long forestValue556_300_2;
    long[] forestValue556_312_0;
    int forestValue556_312_1;
    long forestValue556_312_2;
    javax.crypto.Cipher spill556_0;
    int spill556_1;
    javax.crypto.SecretKeyFactory spill556_2;
    byte[] spill556_3;
    byte[] spill556_4;
    java.lang.String spill556_5;
    int spill556_6;
    int spill556_7;
    long spill556_8;
    byte[] spill556_9;
    byte[] spill556_10;
    byte[] spill556_11;
    byte[] spill556_12;
    byte[] spill556_13;
    byte[] spill556_14;
    byte[] spill556_15;
    byte[] spill556_16;
    long spill556_17;
    int spill556_18;
    java.lang.String spill556_19;
    int spill556_20;
    long[] spill556_21;
    int spill556_22;
    long spill556_23;
    int spill556_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    int life13_409;
    int life13_427;
    int life13_445;
    int life13_469;
    int life13_493;
    int life13_517;
    forest_join_538: {
    forest_join_514: {
    forest_join_490: {
    forest_join_466: {
    forest_join_442: {
    forest_join_424: {
    forest_join_399: {
    forest_join_53: {
    __fieldWrite556_4(__call556_3(__call556_2(5069908657045664082L, 6077408572258492028L, __call556_1(__call556_0())), 279235829316619L));
    life11_11 = (__fieldRead556_5() ^ 48562379169918L);
    __fieldWrite556_6(new java.util.HashMap(13));
    spill556_0 = (life0_20 = __call556_7("DES/CBC/NoPadding"));
    spill556_1 = 2;
    spill556_2 = __call556_8("DES");
    byte[] __stackOp556_9_0 = new byte[8];
    spill556_3 = __stackOp556_9_0;
    (__stackOp556_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue556_36_0 = spill556_0;
    forestValue556_36_1 = spill556_1;
    forestValue556_36_2 = spill556_2;
    forestValue556_36_3 = spill556_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue556_53_0 = forestValue556_36_0;
        forestValue556_53_1 = forestValue556_36_1;
        forestValue556_53_2 = forestValue556_36_2;
        forestValue556_53_3 = forestValue556_36_3;
        break forest_join_53;
    }
    byte[] __stackOp556_10_0 = forestValue556_36_3;
    spill556_4 = __stackOp556_10_0;
    (__stackOp556_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue556_36_3 = spill556_4;
    continue forest_cycle_36;
    }
    }
    __call556_12(forestValue556_53_0, forestValue556_53_1, __call556_11(forestValue556_53_2, new javax.crypto.spec.DESKeySpec(forestValue556_53_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life6_66 = new long[21];
    life3_68 = 0;
    life5_73 = __call556_13((life4_71 = "Kø-ÿ¶èBÆÁÃ\017U\033§Ò'\024Tzºh6\034\fjr-¢SòÜÜ×EGxò\027K\037\fíHê·Ü{ÕK3äbzH®òÑ3{M ¿Å&¸F¥}îf\037suÄ`05q¢\000d\001\025»dA¢¬¢1$`i´2ÛÅï[}Àepï(ÒN7x'|\005\020D6ùT\032ªL6ALó(3\001çð"));
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill556_5 = life4_71;
    spill556_6 = life2_75;
    life2_75 += 8;
    life7_83 = __call556_15(__call556_14(spill556_5, spill556_6, life2_75), "ISO-8859-1");
    forestValue556_157_0 = life6_66;
    forestValue556_157_1 = (life3_68++);
    forestValue556_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue556_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp556_16_0 = forestValue556_157_2;
    int __stackOp556_16_1 = forestValue556_157_3;
    spill556_7 = __stackOp556_16_1;
    spill556_8 = __stackOp556_16_0;
    __discardScalar556_17(__stackOp556_16_1);
    life8_160 = spill556_8;
    byte[] __stackOp556_18_0 = new byte[8];
    spill556_9 = __stackOp556_18_0;
    (__stackOp556_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp556_19_0 = spill556_9;
    spill556_10 = __stackOp556_19_0;
    (__stackOp556_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp556_20_0 = spill556_10;
    spill556_11 = __stackOp556_20_0;
    (__stackOp556_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp556_21_0 = spill556_11;
    spill556_12 = __stackOp556_21_0;
    (__stackOp556_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp556_22_0 = spill556_12;
    spill556_13 = __stackOp556_22_0;
    (__stackOp556_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp556_23_0 = spill556_13;
    spill556_14 = __stackOp556_23_0;
    (__stackOp556_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp556_24_0 = spill556_14;
    spill556_15 = __stackOp556_24_0;
    (__stackOp556_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp556_25_0 = spill556_15;
    spill556_16 = __stackOp556_25_0;
    (__stackOp556_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp556_26_0 = spill556_16;
    javax.crypto.Cipher __stackOp556_26_1 = life0_20;
    life10_228 = __call556_27(__stackOp556_26_1, __stackOp556_26_0);
    int __stackOp556_28_0 = spill556_7;
    long __stackOp556_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill556_17 = __stackOp556_28_1;
    spill556_18 = __stackOp556_28_0;
    __discardWide556_29(__stackOp556_28_1);
    switch (spill556_18) {
default:
{
        forestValue556_300_0 = forestValue556_157_0;
        forestValue556_300_1 = forestValue556_157_1;
        forestValue556_300_2 = spill556_17;
        break forest_join_300;
    }
case 0:
{
        forestValue556_312_0 = forestValue556_157_0;
        forestValue556_312_1 = forestValue556_157_1;
        forestValue556_312_2 = spill556_17;
        break forest_join_312;
    }
}
    }
    (forestValue556_300_0)[forestValue556_300_1] = forestValue556_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = __call556_30((life4_71 = "%ju'Ò]P ©3Eá|\007"));
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue556_312_0)[forestValue556_312_1] = forestValue556_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill556_19 = life4_71;
    spill556_20 = life2_75;
    life2_75 += 8;
    life7_325 = __call556_32(__call556_31(spill556_19, spill556_20, life2_75), "ISO-8859-1");
    spill556_21 = life6_66;
    spill556_22 = (life3_68++);
    spill556_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill556_24 = 0;
    forestValue556_157_0 = spill556_21;
    forestValue556_157_1 = spill556_22;
    forestValue556_157_2 = spill556_23;
    forestValue556_157_3 = spill556_24;
    continue forest_cycle_157;
    }
    }
    }
    __fieldWrite556_33(life6_66);
    __fieldWrite556_34(new java.lang.Integer[21]);
    __fieldWrite556_36(__call556_35());
    life13_409 = 0;
    forest_cycle_408: while (true) {
    if (!((life13_409 < __invokedynamic556_37(16785, (1407262198308732459L ^ life11_11))))) {
        break forest_join_424;
    }
    __call556_41(__fieldRead556_38(), __invokedynamic556_39(life13_409), __call556_40(life13_409));
    life13_409 += 1;
    continue forest_cycle_408;
    }
    }
    life13_427 = 0;
    forest_cycle_426: while (true) {
    if (!((life13_427 < __invokedynamic556_42(11557, (8022883466887172757L ^ life11_11))))) {
        break forest_join_442;
    }
    __call556_46(__fieldRead556_43(), __invokedynamic556_44(life13_427), __call556_45(life13_427));
    life13_427 += 1;
    continue forest_cycle_426;
    }
    }
    life13_445 = 0;
    forest_cycle_444: while (true) {
    if (!((life13_445 < __invokedynamic556_47(17253, (6751962741097856217L ^ life11_11))))) {
        break forest_join_466;
    }
    __call556_52(__fieldRead556_48(), __invokedynamic556_49(life13_445), __call556_51((__invokedynamic556_50(19938, (8455263788282770007L ^ life11_11)) + life13_445)));
    life13_445 += 1;
    continue forest_cycle_444;
    }
    }
    life13_469 = 0;
    forest_cycle_468: while (true) {
    if (!((life13_469 < __invokedynamic556_53(16281, (2640820303847784506L ^ life11_11))))) {
        break forest_join_490;
    }
    __call556_58(__fieldRead556_54(), __invokedynamic556_55(life13_469), __call556_57((__invokedynamic556_56(16178, (6725641452944621709L ^ life11_11)) + life13_469)));
    life13_469 += 1;
    continue forest_cycle_468;
    }
    }
    life13_493 = 0;
    forest_cycle_492: while (true) {
    if (!((life13_493 < __invokedynamic556_59(8245, (2049103436440313730L ^ life11_11))))) {
        break forest_join_514;
    }
    __call556_64(__fieldRead556_60(), __invokedynamic556_61(life13_493), __call556_63((__invokedynamic556_62(2191, (888880885833348910L ^ life11_11)) + life13_493)));
    life13_493 += 1;
    continue forest_cycle_492;
    }
    }
    life13_517 = 0;
    forest_cycle_516: while (true) {
    if (!((life13_517 < __invokedynamic556_65(9652, (8626077016391424521L ^ life11_11))))) {
        break forest_join_538;
    }
    __call556_70(__fieldRead556_66(), __invokedynamic556_67(life13_517), __call556_69((__invokedynamic556_68(6733, (3571562314446448123L ^ life11_11)) + life13_517)));
    life13_517 += 1;
    continue forest_cycle_516;
    }
    }
    __call556_74(__fieldRead556_71(), "slot.weapon", __call556_73(__invokedynamic556_72(20523, (1903795839344144282L ^ life11_11))));
    __call556_78(__fieldRead556_75(), "slot.armor.head", __call556_77(__invokedynamic556_76(20857, (2043940578585833177L ^ life11_11))));
    __call556_82(__fieldRead556_79(), "slot.armor.chest", __call556_81(__invokedynamic556_80(6523, (5995762064085952207L ^ life11_11))));
    __call556_86(__fieldRead556_83(), "slot.armor.legs", __call556_85(__invokedynamic556_84(28688, (2331667506019454903L ^ life11_11))));
    __call556_90(__fieldRead556_87(), "slot.armor.feet", __call556_89(__invokedynamic556_88(7812, (4417569464085258551L ^ life11_11))));
    __call556_94(__fieldRead556_91(), "slot.horse.saddle", __call556_93(__invokedynamic556_92(22137, (7319144900794771905L ^ life11_11))));
    __call556_98(__fieldRead556_95(), "slot.horse.armor", __call556_97(__invokedynamic556_96(13202, (2491902851647212576L ^ life11_11))));
    __call556_102(__fieldRead556_99(), "slot.horse.chest", __call556_101(__invokedynamic556_100(3928, (8177577946624274662L ^ life11_11))));
    return;
}
public static void h556_0(moom.Oo p0) throws Throwable {
    throw __call3055600_0(p0);
}
public static void h556_1(moom.Oo p0) throws Throwable {
    throw __call3055601_0(p0);
}
public static void h556_2(moom.Oo p0) throws Throwable {
    throw __call3055602_0(p0);
}
public static void h556_3(moom.Oo p0) throws Throwable {
    throw __call3055603_0(p0);
}
public static void h556_4(moom.Oo p0) throws Throwable {
    throw __call3055604_0(p0);
}
public static void h556_5(moom.Oo p0) throws Throwable {
    throw __call3055605_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call556_0() throws Throwable;
private static native java.lang.Class __call556_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call556_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call556_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite556_4(long a0) throws Throwable;
private static native long __fieldRead556_5() throws Throwable;
private static native void __fieldWrite556_6(java.util.HashMap a0) throws Throwable;
private static native javax.crypto.Cipher __call556_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call556_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call556_11(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call556_12(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call556_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call556_14(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call556_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar556_17(int a0) throws Throwable;
private static native byte[] __call556_27(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide556_29(long a0) throws Throwable;
private static native int __call556_30(java.lang.String a0) throws Throwable;
private static native java.lang.String __call556_31(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call556_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite556_33(long[] a0) throws Throwable;
private static native void __fieldWrite556_34(java.lang.Integer[] a0) throws Throwable;
private static native java.util.HashMap __call556_35() throws Throwable;
private static native void __fieldWrite556_36(java.util.HashMap a0) throws Throwable;
private static native int __invokedynamic556_37(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_38() throws Throwable;
private static native java.lang.String __invokedynamic556_39(int a0) throws Throwable;
private static native java.lang.Integer __call556_40(int a0) throws Throwable;
private static native java.lang.Object __call556_41(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __invokedynamic556_42(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_43() throws Throwable;
private static native java.lang.String __invokedynamic556_44(int a0) throws Throwable;
private static native java.lang.Integer __call556_45(int a0) throws Throwable;
private static native java.lang.Object __call556_46(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __invokedynamic556_47(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_48() throws Throwable;
private static native java.lang.String __invokedynamic556_49(int a0) throws Throwable;
private static native int __invokedynamic556_50(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_51(int a0) throws Throwable;
private static native java.lang.Object __call556_52(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __invokedynamic556_53(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_54() throws Throwable;
private static native java.lang.String __invokedynamic556_55(int a0) throws Throwable;
private static native int __invokedynamic556_56(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_57(int a0) throws Throwable;
private static native java.lang.Object __call556_58(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __invokedynamic556_59(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_60() throws Throwable;
private static native java.lang.String __invokedynamic556_61(int a0) throws Throwable;
private static native int __invokedynamic556_62(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_63(int a0) throws Throwable;
private static native java.lang.Object __call556_64(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native int __invokedynamic556_65(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead556_66() throws Throwable;
private static native java.lang.String __invokedynamic556_67(int a0) throws Throwable;
private static native int __invokedynamic556_68(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_69(int a0) throws Throwable;
private static native java.lang.Object __call556_70(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_71() throws Throwable;
private static native int __invokedynamic556_72(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_73(int a0) throws Throwable;
private static native java.lang.Object __call556_74(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_75() throws Throwable;
private static native int __invokedynamic556_76(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_77(int a0) throws Throwable;
private static native java.lang.Object __call556_78(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_79() throws Throwable;
private static native int __invokedynamic556_80(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_81(int a0) throws Throwable;
private static native java.lang.Object __call556_82(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_83() throws Throwable;
private static native int __invokedynamic556_84(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_85(int a0) throws Throwable;
private static native java.lang.Object __call556_86(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_87() throws Throwable;
private static native int __invokedynamic556_88(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_89(int a0) throws Throwable;
private static native java.lang.Object __call556_90(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_91() throws Throwable;
private static native int __invokedynamic556_92(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_93(int a0) throws Throwable;
private static native java.lang.Object __call556_94(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_95() throws Throwable;
private static native int __invokedynamic556_96(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_97(int a0) throws Throwable;
private static native java.lang.Object __call556_98(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead556_99() throws Throwable;
private static native int __invokedynamic556_100(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call556_101(int a0) throws Throwable;
private static native java.lang.Object __call556_102(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Exception __call3055600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3055605_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3e2d8a553752d2f0762(net.minecraft.command.CommandReplaceItem a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_b3e2d8a553752d2f0762 {

public static void f644(net.minecraft.command.CommandReplaceItem receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int forestValue644_24_0;
    int forestValue644_36_0;
    int forestValue644_47_0;
    int forestValue644_70_0;
    int forestValue644_75_0;
    int forestValue644_87_0;
    int forestValue644_119_0;
    int forestValue644_121_0;
    int forestValue644_133_0;
    int forestValue644_135_0;
    net.minecraft.tileentity.TileEntity forestValue644_187_0;
    int forestValue644_221_0;
    int forestValue644_253_0;
    moom.b7 forestValue644_277_0;
    moom.b7 forestValue644_277_1;
    java.lang.String forestValue644_277_2;
    java.lang.Object[] forestValue644_277_3;
    java.lang.Object[] forestValue644_277_4;
    int forestValue644_277_5;
    moom.b7 forestValue644_279_0;
    moom.b7 forestValue644_279_1;
    java.lang.String forestValue644_279_2;
    java.lang.Object[] forestValue644_279_3;
    java.lang.Object[] forestValue644_279_4;
    int forestValue644_279_5;
    java.lang.Object forestValue644_279_6;
    int forestValue644_286_0;
    net.minecraft.command.ICommandSender forestValue644_296_0;
    net.minecraft.command.ICommandSender forestValue644_318_0;
    net.minecraft.command.CommandReplaceItem forestValue644_318_1;
    java.lang.String forestValue644_318_2;
    java.lang.Object[] forestValue644_318_3;
    java.lang.Object[] forestValue644_318_4;
    int forestValue644_318_5;
    net.minecraft.command.ICommandSender forestValue644_319_0;
    net.minecraft.command.CommandReplaceItem forestValue644_319_1;
    java.lang.String forestValue644_319_2;
    java.lang.Object[] forestValue644_319_3;
    java.lang.Object[] forestValue644_319_4;
    int forestValue644_319_5;
    net.minecraft.item.ItemStack forestValue644_319_6;
    net.minecraft.command.ICommandSender forestValue644_320_0;
    net.minecraft.command.CommandReplaceItem forestValue644_320_1;
    java.lang.String forestValue644_320_2;
    java.lang.Object[] forestValue644_320_3;
    java.lang.Object[] forestValue644_320_4;
    int forestValue644_320_5;
    java.lang.Object forestValue644_320_6;
    int spill644_0;
    moom.cc spill644_1;
    moom.cc spill644_2;
    int spill644_3;
    int spill644_4;
    moom.cc spill644_5;
    moom.cc spill644_6;
    int spill644_7;
    int spill644_8;
    net.minecraft.item.ItemStack spill644_9;
    net.minecraft.tileentity.TileEntity spill644_10;
    moom.b7 spill644_11;
    moom.b7 spill644_12;
    java.lang.String spill644_13;
    java.lang.Object[] spill644_14;
    java.lang.Object[] spill644_15;
    java.lang.Object[] spill644_16;
    int spill644_17;
    int spill644_18;
    moom.b7 spill644_19;
    moom.b7 spill644_20;
    java.lang.String spill644_21;
    java.lang.Object[] spill644_22;
    java.lang.Object[] spill644_23;
    java.lang.Object[] spill644_24;
    java.lang.Object[] spill644_25;
    int spill644_26;
    net.minecraft.entity.Entity spill644_27;
    net.minecraft.command.CommandReplaceItem spill644_28;
    java.lang.String spill644_29;
    java.lang.Object[] spill644_30;
    java.lang.Object[] spill644_31;
    java.lang.Object[] spill644_32;
    java.lang.Object[] spill644_33;
    int spill644_34;
    net.minecraft.item.ItemStack spill644_35;
    long life3_3;
    int life5_5;
    int life6_30;
    int life7_77;
    int life8_103;
    net.minecraft.item.Item life9_109;
    int life10_133;
    int life11_149;
    net.minecraft.item.ItemStack life12_156;
    java.lang.String life13_166;
    moom.DT life13_188;
    net.minecraft.world.World life14_191;
    net.minecraft.tileentity.TileEntity life15_195;
    net.minecraft.inventory.IInventory life16_205;
    net.minecraft.entity.Entity life13_254;
    forest_join_320: {
    forest_join_319: {
    forest_join_318: {
    forest_join_296: {
    forest_join_291: {
    forest_join_286: {
    forest_join_282: {
    forest_join_279: {
    forest_join_277: {
    forest_join_253: {
    forest_join_249: {
    forest_join_230: {
    forest_join_228: {
    forest_join_221: {
    forest_join_216: {
    forest_join_191: {
    forest_join_187: {
    forest_join_162: {
    forest_join_157: {
    forest_join_135: {
    forest_join_134: {
    forest_join_133: {
    forest_join_121: {
    forest_join_120: {
    forest_join_119: {
    forest_join_88: {
    forest_join_87: {
    forest_join_86: {
    forest_join_75: {
    forest_join_73: {
    forest_join_70: {
    forest_join_69: {
    forest_join_48: {
    forest_join_47: {
    forest_join_46: {
    forest_join_36: {
    forest_join_31: {
    forest_join_24: {
    forest_join_19: {
    life3_3 = (__fieldRead644_0() ^ 27070739507338L);
    life5_5 = __integerCategory644_2(__call644_1());
    spill644_0 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue644_24_0 = spill644_0;
        break forest_join_24;
    }
    if (!((spill644_0 < 1))) {
        break forest_join_19;
    }
    moom.cc __stackOp644_4_0 = __sourceUninitializedNEW644_3();
    spill644_1 = __stackOp644_4_0;
    __explicitNewInit644_5(__stackOp644_4_0, "commands.replaceitem.usage", new java.lang.Object[0]);
    throw spill644_1;
    }
    forestValue644_24_0 = __integerCategory644_7(__call644_6((p1)[0], "entity"));
    }
    if (!((life5_5 != 0))) {
        forestValue644_36_0 = forestValue644_24_0;
        break forest_join_36;
    }
    if (!((forestValue644_24_0 != 0))) {
        break forest_join_31;
    }
    life6_30 = 0;
    if (!((life5_5 == 0))) {
        break forest_join_48;
    }
    }
    forestValue644_36_0 = __integerCategory644_9(__call644_8((p1)[0], "block"));
    }
    if (!((life5_5 != 0))) {
        forestValue644_47_0 = forestValue644_36_0;
        break forest_join_47;
    }
    if (!((forestValue644_36_0 == 0))) {
        break forest_join_46;
    }
    moom.cc __stackOp644_11_0 = __sourceUninitializedNEW644_10();
    spill644_2 = __stackOp644_11_0;
    __explicitNewInit644_12(__stackOp644_11_0, "commands.replaceitem.usage", new java.lang.Object[0]);
    throw spill644_2;
    }
    forestValue644_47_0 = 1;
    }
    life6_30 = forestValue644_47_0;
    }
    spill644_3 = life6_30;
    if (!((life5_5 != 0))) {
        forestValue644_75_0 = spill644_3;
        break forest_join_75;
    }
    if (!((spill644_3 != 0))) {
        break forest_join_73;
    }
    spill644_4 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue644_70_0 = spill644_4;
        break forest_join_70;
    }
    if (!((spill644_4 < __invokedynamic644_13(14150, (6582721752508416016L ^ life3_3))))) {
        break forest_join_69;
    }
    moom.cc __stackOp644_15_0 = __sourceUninitializedNEW644_14();
    spill644_5 = __stackOp644_15_0;
    __explicitNewInit644_16(__stackOp644_15_0, "commands.replaceitem.block.usage", new java.lang.Object[0]);
    throw spill644_5;
    }
    forestValue644_70_0 = 4;
    }
    life7_77 = forestValue644_70_0;
    if (!((life5_5 == 0))) {
        break forest_join_88;
    }
    }
    forestValue644_75_0 = (p1).length;
    }
    if (!((life5_5 != 0))) {
        forestValue644_87_0 = forestValue644_75_0;
        break forest_join_87;
    }
    if (!((forestValue644_75_0 < 4))) {
        break forest_join_86;
    }
    moom.cc __stackOp644_18_0 = __sourceUninitializedNEW644_17();
    spill644_6 = __stackOp644_18_0;
    __explicitNewInit644_19(__stackOp644_18_0, "commands.replaceitem.entity.usage", new java.lang.Object[0]);
    throw spill644_6;
    }
    forestValue644_87_0 = 2;
    }
    life7_77 = forestValue644_87_0;
    }
    life8_103 = __call644_20(receiver, (p1)[(life7_77++)]);
    life9_109 = __call644_21(p0, (p1)[life7_77]);
    life7_77 += 1;
    spill644_7 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue644_119_0 = spill644_7;
        break forest_join_119;
    }
    if (!((spill644_7 > life7_77))) {
        break forest_join_120;
    }
    forestValue644_119_0 = __call644_23((p1)[(life7_77++)], 1, __invokedynamic644_22(13249, (9042476364155765900L ^ life3_3)));
    }
    forestValue644_121_0 = forestValue644_119_0;
    break forest_join_121;
    }
    forestValue644_121_0 = 1;
    }
    life10_133 = forestValue644_121_0;
    spill644_8 = (p1).length;
    if (!((life5_5 != 0))) {
        forestValue644_133_0 = spill644_8;
        break forest_join_133;
    }
    if (!((spill644_8 > life7_77))) {
        break forest_join_134;
    }
    forestValue644_133_0 = __call644_24((p1)[(life7_77++)]);
    }
    forestValue644_135_0 = forestValue644_133_0;
    break forest_join_135;
    }
    forestValue644_135_0 = 0;
    }
    life11_149 = forestValue644_135_0;
    net.minecraft.item.ItemStack __stackOp644_26_0 = __sourceUninitializedNEW644_25();
    spill644_9 = __stackOp644_26_0;
    __explicitNewInit644_27(__stackOp644_26_0, life9_109, life10_133, life11_149);
    life12_156 = spill644_9;
    if (!(((p1).length > life7_77))) {
        break forest_join_157;
    }
    life13_166 = __call644_29(__call644_28(p0, p1, life7_77));
    __call644_31(life12_156, __call644_30(life13_166));
    }
    if (!((__call644_32(life12_156) == null))) {
        break forest_join_162;
    }
    life12_156 = null;
    }
    if (!((life6_30 != 0))) {
        break forest_join_230;
    }
    __call644_34(p0, __fieldRead644_33(), 0);
    life13_188 = __call644_35(p0, p1, 1, 0);
    life14_191 = __call644_36(p0);
    life15_195 = __call644_37(life14_191, life13_188);
    spill644_10 = life15_195;
    if (!((life5_5 != 0))) {
        forestValue644_187_0 = spill644_10;
        break forest_join_187;
    }
    if (!((__instanceOf644_38(spill644_10) != 0))) {
        break forest_join_191;
    }
    forestValue644_187_0 = life15_195;
    }
    life16_205 = __cast644_39(forestValue644_187_0);
    if (!((life5_5 == 0))) {
        break forest_join_216;
    }
    }
    moom.b7 __stackOp644_41_0 = __sourceUninitializedNEW644_40();
    spill644_11 = __stackOp644_41_0;
    spill644_12 = __stackOp644_41_0;
    spill644_13 = "commands.replaceitem.noContainer";
    java.lang.Object[] __stackOp644_42_0 = new java.lang.Object[3];
    spill644_14 = __stackOp644_42_0;
    (__stackOp644_42_0)[0] = __call644_44(__call644_43(life13_188));
    java.lang.Object[] __stackOp644_45_0 = spill644_14;
    spill644_15 = __stackOp644_45_0;
    (__stackOp644_45_0)[1] = __call644_47(__call644_46(life13_188));
    java.lang.Object[] __stackOp644_48_0 = spill644_15;
    spill644_16 = __stackOp644_48_0;
    (__stackOp644_48_0)[2] = __call644_50(__call644_49(life13_188));
    __explicitNewInit644_51(spill644_12, spill644_13, spill644_16);
    throw spill644_11;
    }
    spill644_17 = life8_103;
    if (!((life5_5 != 0))) {
        forestValue644_221_0 = spill644_17;
        break forest_join_221;
    }
    if (!((spill644_17 >= 0))) {
        break forest_join_228;
    }
    forestValue644_221_0 = life8_103;
    }
    if (!((forestValue644_221_0 < __call644_52(life16_205)))) {
        break forest_join_228;
    }
    __call644_53(life16_205, life8_103, life12_156);
    }
    if (!((life5_5 == 0))) {
        break forest_join_291;
    }
    }
    life13_254 = __call644_54(p0, (p1)[1]);
    __call644_56(p0, __fieldRead644_55(), 0);
    spill644_18 = __instanceOf644_57(life13_254);
    if (!((life5_5 != 0))) {
        forestValue644_253_0 = spill644_18;
        break forest_join_253;
    }
    if (!((spill644_18 != 0))) {
        break forest_join_249;
    }
    __call644_60(__fieldRead644_59(__cast644_58(life13_254)));
    }
    forestValue644_253_0 = __integerCategory644_62(__call644_61(life13_254, life8_103, life12_156));
    }
    if (!((life5_5 != 0))) {
        forestValue644_286_0 = forestValue644_253_0;
        break forest_join_286;
    }
    if (!((forestValue644_253_0 == 0))) {
        break forest_join_282;
    }
    moom.b7 __stackOp644_64_0 = __sourceUninitializedNEW644_63();
    spill644_19 = __stackOp644_64_0;
    spill644_20 = __stackOp644_64_0;
    spill644_21 = "commands.replaceitem.failed";
    java.lang.Object[] __stackOp644_65_0 = new java.lang.Object[3];
    spill644_22 = __stackOp644_65_0;
    (__stackOp644_65_0)[0] = __call644_66(life8_103);
    java.lang.Object[] __stackOp644_67_0 = spill644_22;
    spill644_23 = __stackOp644_67_0;
    (__stackOp644_67_0)[1] = __call644_68(life10_133);
    java.lang.Object[] __stackOp644_69_0 = spill644_23;
    spill644_24 = __stackOp644_69_0;
    spill644_25 = __stackOp644_69_0;
    spill644_26 = 2;
    if (!((life12_156 == null))) {
        forestValue644_277_0 = spill644_19;
        forestValue644_277_1 = spill644_20;
        forestValue644_277_2 = spill644_21;
        forestValue644_277_3 = spill644_24;
        forestValue644_277_4 = spill644_25;
        forestValue644_277_5 = spill644_26;
        break forest_join_277;
    }
    forestValue644_279_0 = spill644_19;
    forestValue644_279_1 = spill644_20;
    forestValue644_279_2 = spill644_21;
    forestValue644_279_3 = spill644_24;
    forestValue644_279_4 = spill644_25;
    forestValue644_279_5 = spill644_26;
    forestValue644_279_6 = "Air";
    break forest_join_279;
    }
    forestValue644_279_0 = forestValue644_277_0;
    forestValue644_279_1 = forestValue644_277_1;
    forestValue644_279_2 = forestValue644_277_2;
    forestValue644_279_3 = forestValue644_277_3;
    forestValue644_279_4 = forestValue644_277_4;
    forestValue644_279_5 = forestValue644_277_5;
    forestValue644_279_6 = __call644_70(life12_156);
    }
    (forestValue644_279_4)[forestValue644_279_5] = forestValue644_279_6;
    __explicitNewInit644_71(forestValue644_279_1, forestValue644_279_2, forestValue644_279_3);
    throw forestValue644_279_0;
    }
    spill644_27 = life13_254;
    if (!((life5_5 != 0))) {
        forestValue644_296_0 = spill644_27;
        break forest_join_296;
    }
    forestValue644_286_0 = __instanceOf644_72(spill644_27);
    }
    if (!((forestValue644_286_0 != 0))) {
        break forest_join_291;
    }
    __call644_75(__fieldRead644_74(__cast644_73(life13_254)));
    }
    __call644_77(p0, __fieldRead644_76(), life10_133);
    forestValue644_296_0 = p0;
    }
    spill644_28 = receiver;
    spill644_29 = "commands.replaceitem.success";
    java.lang.Object[] __stackOp644_78_0 = new java.lang.Object[3];
    spill644_30 = __stackOp644_78_0;
    (__stackOp644_78_0)[0] = __call644_79(life8_103);
    java.lang.Object[] __stackOp644_80_0 = spill644_30;
    spill644_31 = __stackOp644_80_0;
    (__stackOp644_80_0)[1] = __call644_81(life10_133);
    java.lang.Object[] __stackOp644_82_0 = spill644_31;
    spill644_32 = __stackOp644_82_0;
    spill644_33 = __stackOp644_82_0;
    spill644_34 = 2;
    spill644_35 = life12_156;
    if (!((life5_5 != 0))) {
        forestValue644_319_0 = forestValue644_296_0;
        forestValue644_319_1 = spill644_28;
        forestValue644_319_2 = spill644_29;
        forestValue644_319_3 = spill644_32;
        forestValue644_319_4 = spill644_33;
        forestValue644_319_5 = spill644_34;
        forestValue644_319_6 = spill644_35;
        break forest_join_319;
    }
    if (!((spill644_35 == null))) {
        forestValue644_318_0 = forestValue644_296_0;
        forestValue644_318_1 = spill644_28;
        forestValue644_318_2 = spill644_29;
        forestValue644_318_3 = spill644_32;
        forestValue644_318_4 = spill644_33;
        forestValue644_318_5 = spill644_34;
        break forest_join_318;
    }
    forestValue644_320_0 = forestValue644_296_0;
    forestValue644_320_1 = spill644_28;
    forestValue644_320_2 = spill644_29;
    forestValue644_320_3 = spill644_32;
    forestValue644_320_4 = spill644_33;
    forestValue644_320_5 = spill644_34;
    forestValue644_320_6 = "Air";
    break forest_join_320;
    }
    forestValue644_319_0 = forestValue644_318_0;
    forestValue644_319_1 = forestValue644_318_1;
    forestValue644_319_2 = forestValue644_318_2;
    forestValue644_319_3 = forestValue644_318_3;
    forestValue644_319_4 = forestValue644_318_4;
    forestValue644_319_5 = forestValue644_318_5;
    forestValue644_319_6 = life12_156;
    }
    forestValue644_320_0 = forestValue644_319_0;
    forestValue644_320_1 = forestValue644_319_1;
    forestValue644_320_2 = forestValue644_319_2;
    forestValue644_320_3 = forestValue644_319_3;
    forestValue644_320_4 = forestValue644_319_4;
    forestValue644_320_5 = forestValue644_319_5;
    forestValue644_320_6 = __call644_83(forestValue644_319_6);
    }
    (forestValue644_320_4)[forestValue644_320_5] = forestValue644_320_6;
    __call644_84(forestValue644_320_0, forestValue644_320_1, forestValue644_320_2, forestValue644_320_3);
    return;
}
public static void h644_0(moom.b_ p0) throws Throwable {
    throw __call3064400_0(p0);
}
public static void h644_1(moom.b_ p0) throws Throwable {
    throw __call3064401_0(p0);
}
public static void h644_2(moom.b_ p0) throws Throwable {
    throw __call3064402_0(p0);
}
public static void h644_3(moom.b_ p0) throws Throwable {
    throw __call3064403_0(p0);
}
public static void h644_4(moom.b_ p0) throws Throwable {
    throw __call3064404_0(p0);
}
public static void h644_5(moom.b_ p0) throws Throwable {
    throw __call3064405_0(p0);
}
public static void h644_6(moom.b_ p0) throws Throwable {
    throw __call3064406_0(p0);
}
public static void h644_7(moom.b_ p0) throws Throwable {
    throw __call3064407_0(p0);
}
public static void h644_8(moom.b_ p0) throws Throwable {
    throw __call3064408_0(p0);
}
public static void h644_9(moom.b_ p0) throws Throwable {
    throw __call3064409_0(p0);
}
public static void h644_10(moom.b_ p0) throws Throwable {
    throw __call3064410_0(p0);
}
public static void h644_11(moom.b_ p0) throws Throwable {
    throw __call3064411_0(p0);
}
public static void h644_12(moom.b_ p0) throws Throwable {
    throw __call3064412_0(p0);
}
public static void h644_13(moom.b_ p0, net.minecraft.command.CommandReplaceItem p1, net.minecraft.command.ICommandSender p2, java.lang.String[] p3, long p4, int p5, int p6, int p7, int p8, net.minecraft.item.Item p9) throws Throwable {
    int forestValue3064413_30_0;
    int forestValue3064413_32_0;
    int forestValue3064413_44_0;
    int forestValue3064413_46_0;
    net.minecraft.tileentity.TileEntity forestValue3064413_98_0;
    int forestValue3064413_132_0;
    int forestValue3064413_164_0;
    moom.b7 forestValue3064413_188_0;
    moom.b7 forestValue3064413_188_1;
    java.lang.String forestValue3064413_188_2;
    java.lang.Object[] forestValue3064413_188_3;
    java.lang.Object[] forestValue3064413_188_4;
    int forestValue3064413_188_5;
    moom.b7 forestValue3064413_190_0;
    moom.b7 forestValue3064413_190_1;
    java.lang.String forestValue3064413_190_2;
    java.lang.Object[] forestValue3064413_190_3;
    java.lang.Object[] forestValue3064413_190_4;
    int forestValue3064413_190_5;
    java.lang.Object forestValue3064413_190_6;
    int forestValue3064413_197_0;
    net.minecraft.command.ICommandSender forestValue3064413_207_0;
    net.minecraft.command.ICommandSender forestValue3064413_229_0;
    net.minecraft.command.CommandReplaceItem forestValue3064413_229_1;
    java.lang.String forestValue3064413_229_2;
    java.lang.Object[] forestValue3064413_229_3;
    java.lang.Object[] forestValue3064413_229_4;
    int forestValue3064413_229_5;
    net.minecraft.command.ICommandSender forestValue3064413_230_0;
    net.minecraft.command.CommandReplaceItem forestValue3064413_230_1;
    java.lang.String forestValue3064413_230_2;
    java.lang.Object[] forestValue3064413_230_3;
    java.lang.Object[] forestValue3064413_230_4;
    int forestValue3064413_230_5;
    net.minecraft.item.ItemStack forestValue3064413_230_6;
    net.minecraft.command.ICommandSender forestValue3064413_231_0;
    net.minecraft.command.CommandReplaceItem forestValue3064413_231_1;
    java.lang.String forestValue3064413_231_2;
    java.lang.Object[] forestValue3064413_231_3;
    java.lang.Object[] forestValue3064413_231_4;
    int forestValue3064413_231_5;
    java.lang.Object forestValue3064413_231_6;
    int spill3064413_0;
    int spill3064413_1;
    net.minecraft.item.ItemStack spill3064413_2;
    net.minecraft.tileentity.TileEntity spill3064413_3;
    moom.b7 spill3064413_4;
    moom.b7 spill3064413_5;
    java.lang.String spill3064413_6;
    java.lang.Object[] spill3064413_7;
    java.lang.Object[] spill3064413_8;
    java.lang.Object[] spill3064413_9;
    int spill3064413_10;
    int spill3064413_11;
    moom.b7 spill3064413_12;
    moom.b7 spill3064413_13;
    java.lang.String spill3064413_14;
    java.lang.Object[] spill3064413_15;
    java.lang.Object[] spill3064413_16;
    java.lang.Object[] spill3064413_17;
    java.lang.Object[] spill3064413_18;
    int spill3064413_19;
    net.minecraft.entity.Entity spill3064413_20;
    net.minecraft.command.CommandReplaceItem spill3064413_21;
    java.lang.String spill3064413_22;
    java.lang.Object[] spill3064413_23;
    java.lang.Object[] spill3064413_24;
    java.lang.Object[] spill3064413_25;
    java.lang.Object[] spill3064413_26;
    int spill3064413_27;
    net.minecraft.item.ItemStack spill3064413_28;
    moom.b_ life11_2;
    net.minecraft.item.Item life10_12;
    int life11_35;
    int life12_51;
    net.minecraft.item.ItemStack life13_58;
    java.lang.String life14_68;
    moom.DT life14_90;
    net.minecraft.world.World life15_93;
    net.minecraft.tileentity.TileEntity life16_97;
    net.minecraft.inventory.IInventory life17_107;
    net.minecraft.entity.Entity life14_156;
    forest_join_231: {
    forest_join_230: {
    forest_join_229: {
    forest_join_207: {
    forest_join_202: {
    forest_join_197: {
    forest_join_193: {
    forest_join_190: {
    forest_join_188: {
    forest_join_164: {
    forest_join_160: {
    forest_join_141: {
    forest_join_139: {
    forest_join_132: {
    forest_join_127: {
    forest_join_102: {
    forest_join_98: {
    forest_join_73: {
    forest_join_68: {
    forest_join_46: {
    forest_join_45: {
    forest_join_44: {
    forest_join_32: {
    forest_join_31: {
    forest_join_30: {
    forest_join_10: {
    life11_2 = p0;
    if (!((__call3064413_0((p3)[p7]) != __fieldRead3064413_1()))) {
        break forest_join_10;
    }
    throw life11_2;
    }
    life10_12 = null;
    p7 += 1;
    spill3064413_0 = (p3).length;
    if (!((p5 != 0))) {
        forestValue3064413_30_0 = spill3064413_0;
        break forest_join_30;
    }
    if (!((spill3064413_0 > p7))) {
        break forest_join_31;
    }
    forestValue3064413_30_0 = __call3064413_3((p3)[(p7++)], 1, __invokedynamic3064413_2(13249, (9042476364155765900L ^ p4)));
    }
    forestValue3064413_32_0 = forestValue3064413_30_0;
    break forest_join_32;
    }
    forestValue3064413_32_0 = 1;
    }
    life11_35 = forestValue3064413_32_0;
    spill3064413_1 = (p3).length;
    if (!((p5 != 0))) {
        forestValue3064413_44_0 = spill3064413_1;
        break forest_join_44;
    }
    if (!((spill3064413_1 > p7))) {
        break forest_join_45;
    }
    forestValue3064413_44_0 = __call3064413_4((p3)[(p7++)]);
    }
    forestValue3064413_46_0 = forestValue3064413_44_0;
    break forest_join_46;
    }
    forestValue3064413_46_0 = 0;
    }
    life12_51 = forestValue3064413_46_0;
    net.minecraft.item.ItemStack __stackOp3064413_6_0 = __sourceUninitializedNEW3064413_5();
    spill3064413_2 = __stackOp3064413_6_0;
    __explicitNewInit3064413_7(__stackOp3064413_6_0, life10_12, life11_35, life12_51);
    life13_58 = spill3064413_2;
    if (!(((p3).length > p7))) {
        break forest_join_68;
    }
    life14_68 = __call3064413_9(__call3064413_8(p2, p3, p7));
    __call3064413_11(life13_58, __call3064413_10(life14_68));
    }
    if (!((__call3064413_12(life13_58) == null))) {
        break forest_join_73;
    }
    life13_58 = null;
    }
    if (!((p6 != 0))) {
        break forest_join_141;
    }
    __call3064413_14(p2, __fieldRead3064413_13(), 0);
    life14_90 = __call3064413_15(p2, p3, 1, 0);
    life15_93 = __call3064413_16(p2);
    life16_97 = __call3064413_17(life15_93, life14_90);
    spill3064413_3 = life16_97;
    if (!((p5 != 0))) {
        forestValue3064413_98_0 = spill3064413_3;
        break forest_join_98;
    }
    if (!((__instanceOf3064413_18(spill3064413_3) != 0))) {
        break forest_join_102;
    }
    forestValue3064413_98_0 = life16_97;
    }
    life17_107 = __cast3064413_19(forestValue3064413_98_0);
    if (!((p5 == 0))) {
        break forest_join_127;
    }
    }
    moom.b7 __stackOp3064413_21_0 = __sourceUninitializedNEW3064413_20();
    spill3064413_4 = __stackOp3064413_21_0;
    spill3064413_5 = __stackOp3064413_21_0;
    spill3064413_6 = "commands.replaceitem.noContainer";
    java.lang.Object[] __stackOp3064413_22_0 = new java.lang.Object[3];
    spill3064413_7 = __stackOp3064413_22_0;
    (__stackOp3064413_22_0)[0] = __call3064413_24(__call3064413_23(life14_90));
    java.lang.Object[] __stackOp3064413_25_0 = spill3064413_7;
    spill3064413_8 = __stackOp3064413_25_0;
    (__stackOp3064413_25_0)[1] = __call3064413_27(__call3064413_26(life14_90));
    java.lang.Object[] __stackOp3064413_28_0 = spill3064413_8;
    spill3064413_9 = __stackOp3064413_28_0;
    (__stackOp3064413_28_0)[2] = __call3064413_30(__call3064413_29(life14_90));
    __explicitNewInit3064413_31(spill3064413_5, spill3064413_6, spill3064413_9);
    throw spill3064413_4;
    }
    spill3064413_10 = p8;
    if (!((p5 != 0))) {
        forestValue3064413_132_0 = spill3064413_10;
        break forest_join_132;
    }
    if (!((spill3064413_10 >= 0))) {
        break forest_join_139;
    }
    forestValue3064413_132_0 = p8;
    }
    if (!((forestValue3064413_132_0 < __call3064413_32(life17_107)))) {
        break forest_join_139;
    }
    __call3064413_33(life17_107, p8, life13_58);
    }
    if (!((p5 == 0))) {
        break forest_join_202;
    }
    }
    life14_156 = __call3064413_34(p2, (p3)[1]);
    __call3064413_36(p2, __fieldRead3064413_35(), 0);
    spill3064413_11 = __instanceOf3064413_37(life14_156);
    if (!((p5 != 0))) {
        forestValue3064413_164_0 = spill3064413_11;
        break forest_join_164;
    }
    if (!((spill3064413_11 != 0))) {
        break forest_join_160;
    }
    __call3064413_40(__fieldRead3064413_39(__cast3064413_38(life14_156)));
    }
    forestValue3064413_164_0 = __integerCategory3064413_42(__call3064413_41(life14_156, p8, life13_58));
    }
    if (!((p5 != 0))) {
        forestValue3064413_197_0 = forestValue3064413_164_0;
        break forest_join_197;
    }
    if (!((forestValue3064413_164_0 == 0))) {
        break forest_join_193;
    }
    moom.b7 __stackOp3064413_44_0 = __sourceUninitializedNEW3064413_43();
    spill3064413_12 = __stackOp3064413_44_0;
    spill3064413_13 = __stackOp3064413_44_0;
    spill3064413_14 = "commands.replaceitem.failed";
    java.lang.Object[] __stackOp3064413_45_0 = new java.lang.Object[3];
    spill3064413_15 = __stackOp3064413_45_0;
    (__stackOp3064413_45_0)[0] = __call3064413_46(p8);
    java.lang.Object[] __stackOp3064413_47_0 = spill3064413_15;
    spill3064413_16 = __stackOp3064413_47_0;
    (__stackOp3064413_47_0)[1] = __call3064413_48(life11_35);
    java.lang.Object[] __stackOp3064413_49_0 = spill3064413_16;
    spill3064413_17 = __stackOp3064413_49_0;
    spill3064413_18 = __stackOp3064413_49_0;
    spill3064413_19 = 2;
    if (!((life13_58 == null))) {
        forestValue3064413_188_0 = spill3064413_12;
        forestValue3064413_188_1 = spill3064413_13;
        forestValue3064413_188_2 = spill3064413_14;
        forestValue3064413_188_3 = spill3064413_17;
        forestValue3064413_188_4 = spill3064413_18;
        forestValue3064413_188_5 = spill3064413_19;
        break forest_join_188;
    }
    forestValue3064413_190_0 = spill3064413_12;
    forestValue3064413_190_1 = spill3064413_13;
    forestValue3064413_190_2 = spill3064413_14;
    forestValue3064413_190_3 = spill3064413_17;
    forestValue3064413_190_4 = spill3064413_18;
    forestValue3064413_190_5 = spill3064413_19;
    forestValue3064413_190_6 = "Air";
    break forest_join_190;
    }
    forestValue3064413_190_0 = forestValue3064413_188_0;
    forestValue3064413_190_1 = forestValue3064413_188_1;
    forestValue3064413_190_2 = forestValue3064413_188_2;
    forestValue3064413_190_3 = forestValue3064413_188_3;
    forestValue3064413_190_4 = forestValue3064413_188_4;
    forestValue3064413_190_5 = forestValue3064413_188_5;
    forestValue3064413_190_6 = __call3064413_50(life13_58);
    }
    (forestValue3064413_190_4)[forestValue3064413_190_5] = forestValue3064413_190_6;
    __explicitNewInit3064413_51(forestValue3064413_190_1, forestValue3064413_190_2, forestValue3064413_190_3);
    throw forestValue3064413_190_0;
    }
    spill3064413_20 = life14_156;
    if (!((p5 != 0))) {
        forestValue3064413_207_0 = spill3064413_20;
        break forest_join_207;
    }
    forestValue3064413_197_0 = __instanceOf3064413_52(spill3064413_20);
    }
    if (!((forestValue3064413_197_0 != 0))) {
        break forest_join_202;
    }
    __call3064413_55(__fieldRead3064413_54(__cast3064413_53(life14_156)));
    }
    __call3064413_57(p2, __fieldRead3064413_56(), life11_35);
    forestValue3064413_207_0 = p2;
    }
    spill3064413_21 = p1;
    spill3064413_22 = "commands.replaceitem.success";
    java.lang.Object[] __stackOp3064413_58_0 = new java.lang.Object[3];
    spill3064413_23 = __stackOp3064413_58_0;
    (__stackOp3064413_58_0)[0] = __call3064413_59(p8);
    java.lang.Object[] __stackOp3064413_60_0 = spill3064413_23;
    spill3064413_24 = __stackOp3064413_60_0;
    (__stackOp3064413_60_0)[1] = __call3064413_61(life11_35);
    java.lang.Object[] __stackOp3064413_62_0 = spill3064413_24;
    spill3064413_25 = __stackOp3064413_62_0;
    spill3064413_26 = __stackOp3064413_62_0;
    spill3064413_27 = 2;
    spill3064413_28 = life13_58;
    if (!((p5 != 0))) {
        forestValue3064413_230_0 = forestValue3064413_207_0;
        forestValue3064413_230_1 = spill3064413_21;
        forestValue3064413_230_2 = spill3064413_22;
        forestValue3064413_230_3 = spill3064413_25;
        forestValue3064413_230_4 = spill3064413_26;
        forestValue3064413_230_5 = spill3064413_27;
        forestValue3064413_230_6 = spill3064413_28;
        break forest_join_230;
    }
    if (!((spill3064413_28 == null))) {
        forestValue3064413_229_0 = forestValue3064413_207_0;
        forestValue3064413_229_1 = spill3064413_21;
        forestValue3064413_229_2 = spill3064413_22;
        forestValue3064413_229_3 = spill3064413_25;
        forestValue3064413_229_4 = spill3064413_26;
        forestValue3064413_229_5 = spill3064413_27;
        break forest_join_229;
    }
    forestValue3064413_231_0 = forestValue3064413_207_0;
    forestValue3064413_231_1 = spill3064413_21;
    forestValue3064413_231_2 = spill3064413_22;
    forestValue3064413_231_3 = spill3064413_25;
    forestValue3064413_231_4 = spill3064413_26;
    forestValue3064413_231_5 = spill3064413_27;
    forestValue3064413_231_6 = "Air";
    break forest_join_231;
    }
    forestValue3064413_230_0 = forestValue3064413_229_0;
    forestValue3064413_230_1 = forestValue3064413_229_1;
    forestValue3064413_230_2 = forestValue3064413_229_2;
    forestValue3064413_230_3 = forestValue3064413_229_3;
    forestValue3064413_230_4 = forestValue3064413_229_4;
    forestValue3064413_230_5 = forestValue3064413_229_5;
    forestValue3064413_230_6 = life13_58;
    }
    forestValue3064413_231_0 = forestValue3064413_230_0;
    forestValue3064413_231_1 = forestValue3064413_230_1;
    forestValue3064413_231_2 = forestValue3064413_230_2;
    forestValue3064413_231_3 = forestValue3064413_230_3;
    forestValue3064413_231_4 = forestValue3064413_230_4;
    forestValue3064413_231_5 = forestValue3064413_230_5;
    forestValue3064413_231_6 = __call3064413_63(forestValue3064413_230_6);
    }
    (forestValue3064413_231_4)[forestValue3064413_231_5] = forestValue3064413_231_6;
    __call3064413_64(forestValue3064413_231_0, forestValue3064413_231_1, forestValue3064413_231_2, forestValue3064413_231_3);
    return;
}
public static void h644_14(moom.b_ p0) throws Throwable {
    throw __call3064414_0(p0);
}
public static void h644_15(moom.b_ p0) throws Throwable {
    throw __call3064415_0(p0);
}
public static void h644_16(moom.b_ p0) throws Throwable {
    throw __call3064416_0(p0);
}
public static void h644_17(moom.b_ p0) throws Throwable {
    throw __call3064417_0(p0);
}
public static void h644_18(moom.b_ p0) throws Throwable {
    throw __call3064418_0(p0);
}
public static void h644_19(net.minecraft.nbt.NBTException p0) throws Throwable {
    moom.b7 spill3064419_0;
    moom.b7 spill3064419_1;
    java.lang.String spill3064419_2;
    java.lang.Object[] spill3064419_3;
    net.minecraft.nbt.NBTException life1_2;
    life1_2 = p0;
    moom.b7 __stackOp3064419_1_0 = __sourceUninitializedNEW3064419_0();
    spill3064419_0 = __stackOp3064419_1_0;
    spill3064419_1 = __stackOp3064419_1_0;
    spill3064419_2 = "commands.replaceitem.tagError";
    java.lang.Object[] __stackOp3064419_2_0 = new java.lang.Object[1];
    spill3064419_3 = __stackOp3064419_2_0;
    (__stackOp3064419_2_0)[0] = __call3064419_3(life1_2);
    __explicitNewInit3064419_4(spill3064419_1, spill3064419_2, spill3064419_3);
    throw spill3064419_0;
}
public static void h644_20(moom.b_ p0) throws Throwable {
    throw __call3064420_0(p0);
}
public static void h644_21(moom.b_ p0) throws Throwable {
    throw __call3064421_0(p0);
}
public static void h644_22(moom.b_ p0) throws Throwable {
    throw __call3064422_0(p0);
}
public static void h644_23(moom.b_ p0) throws Throwable {
    throw __call3064423_0(p0);
}
public static void h644_24(moom.b_ p0) throws Throwable {
    throw __call3064424_0(p0);
}
public static void h644_25(moom.b_ p0) throws Throwable {
    throw __call3064425_0(p0);
}
public static void h644_26(moom.b_ p0) throws Throwable {
    throw __call3064426_0(p0);
}
public static void h644_27(moom.b_ p0) throws Throwable {
    throw __call3064427_0(p0);
}
public static void h644_28(moom.b_ p0) throws Throwable {
    throw __call3064428_0(p0);
}
public static void h644_29(moom.b_ p0) throws Throwable {
    throw __call3064429_0(p0);
}
public static void h644_30(moom.b_ p0) throws Throwable {
    throw __call3064430_0(p0);
}
public static void h644_31(moom.b_ p0) throws Throwable {
    throw __call3064431_0(p0);
}
public static void h644_32(moom.b_ p0) throws Throwable {
    throw __call3064432_0(p0);
}
public static void h644_33(moom.b_ p0) throws Throwable {
    throw __call3064433_0(p0);
}
private static native long __fieldRead644_0() throws Throwable;
private static native boolean __call644_1() throws Throwable;
private static native int __integerCategory644_2(boolean value) throws Throwable;
private static native moom.cc __sourceUninitializedNEW644_3() throws Throwable;
private static native void __explicitNewInit644_5(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call644_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory644_7(boolean value) throws Throwable;
private static native boolean __call644_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory644_9(boolean value) throws Throwable;
private static native moom.cc __sourceUninitializedNEW644_10() throws Throwable;
private static native void __explicitNewInit644_12(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __invokedynamic644_13(int a0, long a1) throws Throwable;
private static native moom.cc __sourceUninitializedNEW644_14() throws Throwable;
private static native void __explicitNewInit644_16(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.cc __sourceUninitializedNEW644_17() throws Throwable;
private static native void __explicitNewInit644_19(moom.cc a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call644_20(net.minecraft.command.CommandReplaceItem a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.item.Item __call644_21(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic644_22(int a0, long a1) throws Throwable;
private static native int __call644_23(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call644_24(java.lang.String a0) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW644_25() throws Throwable;
private static native void __explicitNewInit644_27(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.IChatComponent __call644_28(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call644_29(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call644_30(java.lang.String a0) throws Throwable;
private static native void __call644_31(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.Item __call644_32(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead644_33() throws Throwable;
private static native void __call644_34(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call644_35(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __call644_36(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call644_37(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf644_38(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast644_39(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW644_40() throws Throwable;
private static native int __call644_43(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call644_44(int a0) throws Throwable;
private static native int __call644_46(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call644_47(int a0) throws Throwable;
private static native int __call644_49(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call644_50(int a0) throws Throwable;
private static native void __explicitNewInit644_51(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call644_52(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native void __call644_53(net.minecraft.inventory.IInventory a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.entity.Entity __call644_54(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead644_55() throws Throwable;
private static native void __call644_56(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __instanceOf644_57(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast644_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.v8 __fieldRead644_59(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call644_60(moom.v8 a0) throws Throwable;
private static native boolean __call644_61(net.minecraft.entity.Entity a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __integerCategory644_62(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW644_63() throws Throwable;
private static native java.lang.Integer __call644_66(int a0) throws Throwable;
private static native java.lang.Integer __call644_68(int a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call644_70(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit644_71(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __instanceOf644_72(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast644_73(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.v8 __fieldRead644_74(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call644_75(moom.v8 a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead644_76() throws Throwable;
private static native void __call644_77(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call644_79(int a0) throws Throwable;
private static native java.lang.Integer __call644_81(int a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call644_83(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call644_84(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandReplaceItem a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3064400_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064401_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064402_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064403_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064404_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064405_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064406_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064407_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064408_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064409_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064410_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064411_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064412_0(moom.b_ a0) throws Throwable;
private static native net.minecraft.block.Block __call3064413_0(java.lang.String a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead3064413_1() throws Throwable;
private static native int __invokedynamic3064413_2(int a0, long a1) throws Throwable;
private static native int __call3064413_3(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call3064413_4(java.lang.String a0) throws Throwable;
private static native net.minecraft.item.ItemStack __sourceUninitializedNEW3064413_5() throws Throwable;
private static native void __explicitNewInit3064413_7(net.minecraft.item.ItemStack a0, net.minecraft.item.Item a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3064413_8(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2) throws Throwable;
private static native java.lang.String __call3064413_9(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call3064413_10(java.lang.String a0) throws Throwable;
private static native void __call3064413_11(net.minecraft.item.ItemStack a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.item.Item __call3064413_12(net.minecraft.item.ItemStack a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead3064413_13() throws Throwable;
private static native void __call3064413_14(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native moom.DT __call3064413_15(net.minecraft.command.ICommandSender a0, java.lang.String[] a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __call3064413_16(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call3064413_17(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __instanceOf3064413_18(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.inventory.IInventory __cast3064413_19(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3064413_20() throws Throwable;
private static native int __call3064413_23(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call3064413_24(int a0) throws Throwable;
private static native int __call3064413_26(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call3064413_27(int a0) throws Throwable;
private static native int __call3064413_29(moom.DT a0) throws Throwable;
private static native java.lang.Integer __call3064413_30(int a0) throws Throwable;
private static native void __explicitNewInit3064413_31(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call3064413_32(net.minecraft.inventory.IInventory a0) throws Throwable;
private static native void __call3064413_33(net.minecraft.inventory.IInventory a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native net.minecraft.entity.Entity __call3064413_34(net.minecraft.command.ICommandSender a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead3064413_35() throws Throwable;
private static native void __call3064413_36(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native int __instanceOf3064413_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast3064413_38(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.v8 __fieldRead3064413_39(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call3064413_40(moom.v8 a0) throws Throwable;
private static native boolean __call3064413_41(net.minecraft.entity.Entity a0, int a1, net.minecraft.item.ItemStack a2) throws Throwable;
private static native int __integerCategory3064413_42(boolean value) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3064413_43() throws Throwable;
private static native java.lang.Integer __call3064413_46(int a0) throws Throwable;
private static native java.lang.Integer __call3064413_48(int a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3064413_50(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit3064413_51(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __instanceOf3064413_52(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast3064413_53(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.v8 __fieldRead3064413_54(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __call3064413_55(moom.v8 a0) throws Throwable;
private static native net.minecraft.command.CommandResultStats$Type __fieldRead3064413_56() throws Throwable;
private static native void __call3064413_57(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandResultStats$Type a1, int a2) throws Throwable;
private static native java.lang.Integer __call3064413_59(int a0) throws Throwable;
private static native java.lang.Integer __call3064413_61(int a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call3064413_63(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __call3064413_64(net.minecraft.command.ICommandSender a0, net.minecraft.command.CommandReplaceItem a1, java.lang.String a2, java.lang.Object[] a3) throws Throwable;
private static native java.lang.Exception __call3064414_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064415_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064416_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064417_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064418_0(moom.b_ a0) throws Throwable;
private static native moom.b7 __sourceUninitializedNEW3064419_0() throws Throwable;
private static native java.lang.String __call3064419_3(net.minecraft.nbt.NBTException a0) throws Throwable;
private static native void __explicitNewInit3064419_4(moom.b7 a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Exception __call3064420_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064421_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064422_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064423_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064424_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064425_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064426_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064427_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064428_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064429_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064430_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064431_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064432_0(moom.b_ a0) throws Throwable;
private static native java.lang.Exception __call3064433_0(moom.b_ a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_780899635da37369dc59(net.minecraft.command.CommandReplaceItem a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2, moom.DT a3) throws E;
private static final class __SourceHandler_780899635da37369dc59 {

public static java.util.List f1479(net.minecraft.command.CommandReplaceItem receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) throws Throwable {
    int forwardValue1479_28_0;
    int forwardValue1479_28_1;
    int forwardValue1479_46_0;
    int forwardValue1479_47_0;
    int forwardValue1479_47_1;
    int forwardValue1479_71_0;
    int forwardValue1479_72_0;
    int forwardValue1479_72_1;
    int forwardValue1479_86_0;
    int forwardValue1479_86_1;
    int forwardValue1479_100_0;
    int forwardValue1479_100_1;
    int forwardValue1479_120_0;
    int forwardValue1479_120_1;
    int forwardValue1479_128_0;
    java.lang.String[] forwardValue1479_132_0;
    java.lang.String[] forwardValue1479_137_0;
    java.util.List forwardValue1479_140_0;
    int spill1479_0;
    int spill1479_1;
    boolean spill1479_2;
    int spill1479_3;
    int spill1479_4;
    boolean spill1479_5;
    java.lang.String[] spill1479_6;
    java.lang.String[] spill1479_7;
    java.lang.String[] spill1479_8;
    int spill1479_9;
    java.lang.String[] spill1479_10;
    long life4_3;
    int life6_5;
    forward_join_140: {
    forward_join_137: {
    forward_join_136: {
    forward_join_132: {
    forward_join_131: {
    forward_join_129: {
    forward_join_128: {
    forward_join_120: {
    forward_join_111: {
    forward_join_100: {
    forward_join_97: {
    forward_join_86: {
    forward_join_83: {
    forward_join_72: {
    forward_join_71: {
    forward_join_69: {
    forward_join_47: {
    forward_join_46: {
    forward_join_44: {
    forward_join_28: {
    forward_join_25: {
    life4_3 = (__fieldRead1479_0() ^ 105098770479369L);
    life6_5 = __integerCategory1479_2(__call1479_1());
    spill1479_0 = (p1).length;
    spill1479_1 = 1;
    if (!((life6_5 == 0))) {
        forwardValue1479_28_0 = spill1479_0;
        forwardValue1479_28_1 = spill1479_1;
        break forward_join_28;
    }
    if (!((spill1479_0 == spill1479_1))) {
        break forward_join_25;
    }
    forwardValue1479_140_0 = __call1479_3(p1, new java.lang.String[] {"entity", "block"});
    break forward_join_140;
    }
    forwardValue1479_28_0 = (p1).length;
    forwardValue1479_28_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue1479_47_0 = forwardValue1479_28_0;
        forwardValue1479_47_1 = forwardValue1479_28_1;
        break forward_join_47;
    }
    if (!((forwardValue1479_28_0 == forwardValue1479_28_1))) {
        break forward_join_44;
    }
    spill1479_2 = __call1479_4((p1)[0], "entity");
    if (!((life6_5 == 0))) {
        forwardValue1479_46_0 = __integerCategory1479_5(spill1479_2);
        break forward_join_46;
    }
    if (!(spill1479_2)) {
        break forward_join_44;
    }
    forwardValue1479_140_0 = __call1479_7(p1, __call1479_6(receiver));
    break forward_join_140;
    }
    forwardValue1479_46_0 = (p1).length;
    }
    forwardValue1479_47_0 = forwardValue1479_46_0;
    forwardValue1479_47_1 = 2;
    }
    if (!((life6_5 == 0))) {
        forwardValue1479_72_0 = forwardValue1479_47_0;
        forwardValue1479_72_1 = forwardValue1479_47_1;
        break forward_join_72;
    }
    if (!((forwardValue1479_47_0 >= forwardValue1479_47_1))) {
        break forward_join_69;
    }
    spill1479_3 = (p1).length;
    spill1479_4 = 4;
    if (!((life6_5 == 0))) {
        forwardValue1479_72_0 = spill1479_3;
        forwardValue1479_72_1 = spill1479_4;
        break forward_join_72;
    }
    if (!((spill1479_3 <= spill1479_4))) {
        break forward_join_69;
    }
    spill1479_5 = __call1479_8((p1)[0], "block");
    if (!((life6_5 == 0))) {
        forwardValue1479_71_0 = __integerCategory1479_9(spill1479_5);
        break forward_join_71;
    }
    if (!(spill1479_5)) {
        break forward_join_69;
    }
    forwardValue1479_140_0 = __call1479_10(p1, 1, p2);
    break forward_join_140;
    }
    forwardValue1479_71_0 = (p1).length;
    }
    forwardValue1479_72_0 = forwardValue1479_71_0;
    forwardValue1479_72_1 = 3;
    }
    if (!((life6_5 == 0))) {
        forwardValue1479_86_0 = forwardValue1479_72_0;
        forwardValue1479_86_1 = forwardValue1479_72_1;
        break forward_join_86;
    }
    if (!((forwardValue1479_72_0 == forwardValue1479_72_1))) {
        break forward_join_83;
    }
    spill1479_6 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1479_137_0 = spill1479_6;
        break forward_join_137;
    }
    if (!((!__call1479_11((spill1479_6)[0], "entity")))) {
        break forward_join_136;
    }
    }
    forwardValue1479_86_0 = (p1).length;
    forwardValue1479_86_1 = 5;
    }
    if (!((life6_5 == 0))) {
        forwardValue1479_100_0 = forwardValue1479_86_0;
        forwardValue1479_100_1 = forwardValue1479_86_1;
        break forward_join_100;
    }
    if (!((forwardValue1479_86_0 == forwardValue1479_86_1))) {
        break forward_join_97;
    }
    spill1479_7 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1479_137_0 = spill1479_7;
        break forward_join_137;
    }
    if (!((!__call1479_12((spill1479_7)[0], "block")))) {
        break forward_join_136;
    }
    }
    forwardValue1479_100_0 = (p1).length;
    forwardValue1479_100_1 = 4;
    }
    if (!((life6_5 == 0))) {
        forwardValue1479_120_0 = forwardValue1479_100_0;
        forwardValue1479_120_1 = forwardValue1479_100_1;
        break forward_join_120;
    }
    if (!((forwardValue1479_100_0 == forwardValue1479_100_1))) {
        break forward_join_111;
    }
    spill1479_8 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1479_132_0 = spill1479_8;
        break forward_join_132;
    }
    if (!((!__call1479_13((spill1479_8)[0], "entity")))) {
        break forward_join_131;
    }
    }
    spill1479_9 = (p1).length;
    if (!((life6_5 == 0))) {
        forwardValue1479_128_0 = spill1479_9;
        break forward_join_128;
    }
    forwardValue1479_120_0 = spill1479_9;
    forwardValue1479_120_1 = __invokedynamic1479_14(22029, (1186755387556933825L ^ life4_3));
    }
    if (!((forwardValue1479_120_0 == forwardValue1479_120_1))) {
        break forward_join_129;
    }
    spill1479_10 = p1;
    if (!((life6_5 == 0))) {
        forwardValue1479_132_0 = spill1479_10;
        break forward_join_132;
    }
    forwardValue1479_128_0 = __integerCategory1479_16(__call1479_15((spill1479_10)[0], "block"));
    }
    if (!((forwardValue1479_128_0 == 0))) {
        break forward_join_131;
    }
    }
    forwardValue1479_140_0 = null;
    break forward_join_140;
    }
    forwardValue1479_132_0 = p1;
    }
    forwardValue1479_140_0 = __call1479_19(forwardValue1479_132_0, __call1479_18(__fieldRead1479_17()));
    break forward_join_140;
    }
    forwardValue1479_137_0 = p1;
    }
    forwardValue1479_140_0 = __call1479_22(forwardValue1479_137_0, __call1479_21(__fieldRead1479_20()));
    }
    return forwardValue1479_140_0;
}
public static void h1479_0(moom.Oo p0) throws Throwable {
    throw __call1147900_0(p0);
}
public static void h1479_1(moom.Oo p0) throws Throwable {
    throw __call1147901_0(p0);
}
public static void h1479_2(moom.Oo p0) throws Throwable {
    throw __call1147902_0(p0);
}
public static void h1479_3(moom.Oo p0) throws Throwable {
    throw __call1147903_0(p0);
}
public static void h1479_4(moom.Oo p0) throws Throwable {
    throw __call1147904_0(p0);
}
public static void h1479_5(moom.Oo p0) throws Throwable {
    throw __call1147905_0(p0);
}
public static void h1479_6(moom.Oo p0) throws Throwable {
    throw __call1147906_0(p0);
}
public static void h1479_7(moom.Oo p0) throws Throwable {
    throw __call1147907_0(p0);
}
public static void h1479_8(moom.Oo p0) throws Throwable {
    throw __call1147908_0(p0);
}
public static void h1479_9(moom.Oo p0) throws Throwable {
    throw __call1147909_0(p0);
}
public static void h1479_10(moom.Oo p0) throws Throwable {
    throw __call1147910_0(p0);
}
public static void h1479_11(moom.Oo p0) throws Throwable {
    throw __call1147911_0(p0);
}
public static void h1479_12(moom.Oo p0) throws Throwable {
    throw __call1147912_0(p0);
}
public static void h1479_13(moom.Oo p0) throws Throwable {
    throw __call1147913_0(p0);
}
public static void h1479_14(moom.Oo p0) throws Throwable {
    throw __call1147914_0(p0);
}
public static void h1479_15(moom.Oo p0) throws Throwable {
    throw __call1147915_0(p0);
}
public static void h1479_16(moom.Oo p0) throws Throwable {
    throw __call1147916_0(p0);
}
public static void h1479_17(moom.Oo p0) throws Throwable {
    throw __call1147917_0(p0);
}
public static void h1479_18(moom.Oo p0) throws Throwable {
    throw __call1147918_0(p0);
}
public static void h1479_19(moom.Oo p0) throws Throwable {
    throw __call1147919_0(p0);
}
public static void h1479_20(moom.Oo p0) throws Throwable {
    throw __call1147920_0(p0);
}
public static void h1479_21(moom.Oo p0) throws Throwable {
    throw __call1147921_0(p0);
}
public static void h1479_22(moom.Oo p0) throws Throwable {
    throw __call1147922_0(p0);
}
public static void h1479_23(moom.Oo p0) throws Throwable {
    throw __call1147923_0(p0);
}
public static void h1479_24(moom.Oo p0) throws Throwable {
    throw __call1147924_0(p0);
}
public static void h1479_25(moom.Oo p0) throws Throwable {
    throw __call1147925_0(p0);
}
public static void h1479_26(moom.Oo p0) throws Throwable {
    throw __call1147926_0(p0);
}
public static void h1479_27(moom.Oo p0) throws Throwable {
    throw __call1147927_0(p0);
}
private static native long __fieldRead1479_0() throws Throwable;
private static native boolean __call1479_1() throws Throwable;
private static native int __integerCategory1479_2(boolean value) throws Throwable;
private static native java.util.List __call1479_3(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call1479_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1479_5(boolean value) throws Throwable;
private static native java.lang.String[] __call1479_6(net.minecraft.command.CommandReplaceItem a0) throws Throwable;
private static native java.util.List __call1479_7(java.lang.String[] a0, java.lang.String[] a1) throws Throwable;
private static native boolean __call1479_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1479_9(boolean value) throws Throwable;
private static native java.util.List __call1479_10(java.lang.String[] a0, int a1, moom.DT a2) throws Throwable;
private static native boolean __call1479_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1479_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call1479_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1479_14(int a0, long a1) throws Throwable;
private static native boolean __call1479_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1479_16(boolean value) throws Throwable;
private static native moom.DB __fieldRead1479_17() throws Throwable;
private static native java.util.Set __call1479_18(moom.DB a0) throws Throwable;
private static native java.util.List __call1479_19(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.util.Map __fieldRead1479_20() throws Throwable;
private static native java.util.Set __call1479_21(java.util.Map a0) throws Throwable;
private static native java.util.List __call1479_22(java.lang.String[] a0, java.util.Set a1) throws Throwable;
private static native java.lang.Exception __call1147900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1147927_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_28171a9ef1c667d61333(net.minecraft.command.CommandReplaceItem a0, java.lang.String[] a1, int a2) throws E;
private static final class __SourceHandler_28171a9ef1c667d61333 {

public static boolean f1480(net.minecraft.command.CommandReplaceItem receiver, java.lang.String[] p0, int p1) throws Throwable {
    int forwardValue1480_16_0;
    int forwardValue1480_20_0;
    int forwardValue1480_25_0;
    int forwardValue1480_27_0;
    int spill1480_0;
    long life3_3;
    int life5_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (__fieldRead1480_0() ^ 113467590232338L);
    life5_5 = __integerCategory1480_2(__call1480_1());
    spill1480_0 = (p0).length;
    if (!((life5_5 == 0))) {
        forwardValue1480_16_0 = spill1480_0;
        break forward_join_16;
    }
    if (!((spill1480_0 > 0))) {
        break forward_join_26;
    }
    forwardValue1480_16_0 = __integerCategory1480_4(__call1480_3((p0)[0], "entity"));
    }
    if (!((life5_5 == 0))) {
        forwardValue1480_20_0 = forwardValue1480_16_0;
        break forward_join_20;
    }
    if (!((forwardValue1480_16_0 != 0))) {
        break forward_join_26;
    }
    forwardValue1480_20_0 = p1;
    }
    if (!((life5_5 == 0))) {
        forwardValue1480_25_0 = forwardValue1480_20_0;
        break forward_join_25;
    }
    if (!((forwardValue1480_20_0 == 1))) {
        break forward_join_26;
    }
    forwardValue1480_25_0 = 1;
    }
    forwardValue1480_27_0 = forwardValue1480_25_0;
    break forward_join_27;
    }
    forwardValue1480_27_0 = 0;
    }
    return __integerCategory1480_5(forwardValue1480_27_0);
}
public static void h1480_0(moom.Oo p0) throws Throwable {
    throw __call1148000_0(p0);
}
public static void h1480_1(moom.Oo p0) throws Throwable {
    throw __call1148001_0(p0);
}
public static void h1480_2(moom.Oo p0) throws Throwable {
    throw __call1148002_0(p0);
}
public static void h1480_3(moom.Oo p0) throws Throwable {
    throw __call1148003_0(p0);
}
public static void h1480_4(moom.Oo p0) throws Throwable {
    throw __call1148004_0(p0);
}
private static native long __fieldRead1480_0() throws Throwable;
private static native boolean __call1480_1() throws Throwable;
private static native int __integerCategory1480_2(boolean value) throws Throwable;
private static native boolean __call1480_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1480_4(boolean value) throws Throwable;
private static native boolean __integerCategory1480_5(int value) throws Throwable;
private static native java.lang.Exception __call1148000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1148001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1148002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1148003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1148004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_6948f59c9bb2b9253724(net.minecraft.command.CommandReplaceItem a0, java.lang.String a1) throws E;
private static final class __SourceHandler_6948f59c9bb2b9253724 {

public static int f1481(net.minecraft.command.CommandReplaceItem receiver, java.lang.String p0) throws Throwable {
    int forwardValue1481_28_0;
    boolean spill1481_0;
    long life2_3;
    int life4_5;
    forward_join_28: {
    forward_join_23: {
    life2_3 = (__fieldRead1481_0() ^ 34855890263495L);
    life4_5 = __integerCategory1481_2(__call1481_1());
    spill1481_0 = __call1481_4(__fieldRead1481_3(), p0);
    if (!((life4_5 == 0))) {
        forwardValue1481_28_0 = __integerCategory1481_5(spill1481_0);
        break forward_join_28;
    }
    if (!((!spill1481_0))) {
        break forward_join_23;
    }
    throw new moom.b7("commands.generic.parameter.invalid", new java.lang.Object[] {p0});
    }
    forwardValue1481_28_0 = __call1481_9(__cast1481_8(__call1481_7(__fieldRead1481_6(), p0)));
    }
    return forwardValue1481_28_0;
}
public static void h1481_0(moom.b7 p0) throws Throwable {
    throw __call1148100_0(p0);
}
public static void h1481_1(moom.b7 p0) throws Throwable {
    throw __call1148101_0(p0);
}
private static native long __fieldRead1481_0() throws Throwable;
private static native boolean __call1481_1() throws Throwable;
private static native int __integerCategory1481_2(boolean value) throws Throwable;
private static native java.util.Map __fieldRead1481_3() throws Throwable;
private static native boolean __call1481_4(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1481_5(boolean value) throws Throwable;
private static native java.util.Map __fieldRead1481_6() throws Throwable;
private static native java.lang.Object __call1481_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast1481_8(java.lang.Object a0) throws Throwable;
private static native int __call1481_9(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1148100_0(moom.b7 a0) throws Throwable;
private static native java.lang.Exception __call1148101_0(moom.b7 a0) throws Throwable;

}


private int b__sourceReturn_2f485d5ba3(java.lang.String p0) throws moom.b7 { return __sourceHandlerCall_6948f59c9bb2b9253724(this, p0); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11043_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/p4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.command.CommandReplaceItem.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31800;
      if (g[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/p4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
return 2;
}


public java.lang.String a__String() {
return "replaceitem";
}


protected java.lang.String[] a__ArrayString() {
return ((moom.Bl)(moom.Bl.a__Bl())).a__ArrayString();
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) { return __sourceHandlerCall_780899635da37369dc59(this, p0, p1, p2); }


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_b3e2d8a553752d2f0762(this, p0, p1); }


public boolean a__Boolean(java.lang.String[] p0, int p1) { return __sourceHandlerCall_28171a9ef1c667d61333(this, p0, p1); }


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.replaceitem.usage";
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11043_0() throws E;
}
