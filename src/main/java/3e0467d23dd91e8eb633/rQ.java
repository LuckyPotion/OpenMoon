package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class rQ extends net.minecraft.enchantment.Enchantment {

private static java.lang.String[] G;

private static int[] H;

private static int[] I;

private static int[] J;

public int K;

private static long M;

private static long[] Q;

private static java.lang.Integer[] R;

private static java.util.Map S;

public rQ(int p0, moom.DD p1, int p2, int p3) { super(0, (moom.DD)null, 0, (net.minecraft.enchantment.EnumEnchantmentType)null); }


private static void __sourceConstructorBody_9bc48f1cabf30445(moom.rQ receiver, int p0, moom.DD p1, int p2, int p3) throws Throwable {

long local5 = (moom.rQ.M ^ 34398946188126L);

    moom.rQ.__sourceConstructorInit_9bc48f1cabf30445_0(((moom.rQ)(receiver)), ((int)(p0)), ((moom.DD)(p1)), ((int)(p2)), ((net.minecraft.enchantment.EnumEnchantmentType)(net.minecraft.enchantment.EnumEnchantmentType.ARMOR)));

    ((moom.rQ)(receiver)).K = ((int)(p3));

    if ((p3 == 2)) {

        ((moom.rQ)(receiver)).E = ((net.minecraft.enchantment.EnumEnchantmentType)(net.minecraft.enchantment.EnumEnchantmentType.ARMOR_FEET));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9bc48f1cabf30445_0(moom.rQ a0, int a1, moom.DD a2, int a3, net.minecraft.enchantment.EnumEnchantmentType a4) throws E;

static {
M = ((long)(((moom._a)(moom._c.a(((long)(2974167947873397257L)), ((long)(-2417382467908276987L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(26501538066686L)))));
    long local11_life6 = (moom.rQ.M ^ 93055975483284L);
    S = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1499_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1499_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1499_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1499_14 = new byte[8];
    (__sourceSpill1499_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1499_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1499_16 = __sourceSpill1499_14;
    ((javax.crypto.Cipher)(__sourceSpill1499_11)).init(((int)(__sourceSpill1499_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1499_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1499_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[11];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\005miãyÂ¶°½sÚ¤\000Oz½\031JcÖT°h®û¼¢Ôå9\001l¯¹Á¼WÌÙ\r1}¼pìpº\021Ú¯¦èìÂÿv¿\021\000³&ø"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1499_25 = local4_life21;
        int __sourceSpill1499_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1499_25)).substring(((int)(__sourceSpill1499_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1499_30 = local6_life19;
        int __sourceSpill1499_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1499_33 = new byte[8];
        (__sourceSpill1499_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1499_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1499_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1499_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1499_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1499_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1499_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1499_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1499_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1499_34)).doFinal(((byte[])(__sourceSpill1499_33)));
        (__sourceSpill1499_30)[__sourceSpill1499_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "*¥`5yÔAZ\004qPºcj"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1499_38 = local4_life21;
        int __sourceSpill1499_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1499_38)).substring(((int)(__sourceSpill1499_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1499_43 = local6_life19;
        int __sourceSpill1499_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1499_46 = new byte[8];
        (__sourceSpill1499_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1499_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1499_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1499_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1499_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1499_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1499_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1499_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1499_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1499_47)).doFinal(((byte[])(__sourceSpill1499_46)));
        (__sourceSpill1499_43)[__sourceSpill1499_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    Q = ((long[])(local6_life19));
    R = ((java.lang.Integer[])(new java.lang.Integer[11]));
    java.lang.String[] __sourceSpill1499_52 = new java.lang.String[5];
    (__sourceSpill1499_52)[0] = "all";
    (__sourceSpill1499_52)[1] = "fire";
    (__sourceSpill1499_52)[2] = "fall";
    (__sourceSpill1499_52)[3] = "explosion";
    (__sourceSpill1499_52)[4] = "projectile";
    G = ((java.lang.String[])(__sourceSpill1499_52));
    int[] __sourceSpill1499_54 = new int[5];
    (__sourceSpill1499_54)[0] = 1;
    (__sourceSpill1499_54)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_55(20300, (2332291919104123953L ^ local11_life6));
    (__sourceSpill1499_54)[2] = 5;
    (__sourceSpill1499_54)[3] = 5;
    (__sourceSpill1499_54)[4] = 3;
    H = ((int[])(__sourceSpill1499_54));
    int[] __sourceSpill1499_58 = new int[5];
    (__sourceSpill1499_58)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_57(32043, (7396329634966804053L ^ local11_life6));
    (__sourceSpill1499_58)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_59(26916, (3323944572102312531L ^ local11_life6));
    (__sourceSpill1499_58)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_60(26074, (7950595637090946722L ^ local11_life6));
    (__sourceSpill1499_58)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_61(18351, (3227497881729739995L ^ local11_life6));
    (__sourceSpill1499_58)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_62(14367, (5726131079481447270L ^ local11_life6));
    I = ((int[])(__sourceSpill1499_58));
    int[] __sourceSpill1499_65 = new int[5];
    (__sourceSpill1499_65)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_64(7014, (5009294157580300314L ^ local11_life6));
    (__sourceSpill1499_65)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_66(29339, (8617173955124140516L ^ local11_life6));
    (__sourceSpill1499_65)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_67(31746, (8009036408357033849L ^ local11_life6));
    (__sourceSpill1499_65)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_68(4046, (7357841053998671028L ^ local11_life6));
    (__sourceSpill1499_65)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_69(22001, (8177293981896949380L ^ local11_life6));
    J = ((int[])(__sourceSpill1499_65));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8923_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/rQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x77F9;
        if (R[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])S.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    S.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/rQ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            rQ.R[n2] = n3;
        }
        return R[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.rQ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b(int p0) {
return (((moom.rQ)(this)).a(((int)(p0))) + (moom.rQ.J)[this.K]);
}


public int c() {
return 4;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(int p0) {
return ((moom.rQ.H)[this.K] + ((p0 - 1) * (moom.rQ.I)[this.K]));
}


public static int a(net.minecraft.entity.Entity p0, int p1) {
int forwardValue3899_28_0;
    boolean spill3899_0;
    int spill3899_1;
    long life2_3;
    int life5_10;
    int life4_11;
    forward_join_28: {
    forward_join_27: {
    life2_3 = (moom.rQ.M ^ 125604959232415L);
    spill3899_0 = moom.rV.b();
    life5_10 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.e)).C)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.Entity)(p0)).a__ArrayxW())));
    life4_11 = ((spill3899_0) ? 1 : 0);
    spill3899_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue3899_28_0 = spill3899_1;
        break forward_join_28;
    }
    if (!((spill3899_1 > 0))) {
        break forward_join_27;
    }
    p1 = (p1 - moom.Dr.a__Int(((float)(((((float) p1) * ((float) life5_10)) * 0x1.333334p-3f)))));
    }
    forwardValue3899_28_0 = p1;
    }
    return forwardValue3899_28_0;
}


public boolean a(net.minecraft.enchantment.Enchantment p0) {
int forwardValue3898_26_0;
    int forwardValue3898_26_1;
    int forwardValue3898_34_0;
    int forwardValue3898_36_0;
    int forwardValue3898_40_0;
    int spill3898_0;
    int spill3898_1;
    int spill3898_2;
    int spill3898_3;
    int spill3898_4;
    long life2_3;
    int life4_5;
    moom.rQ life5_16;
    forward_join_40: {
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_26: {
    life2_3 = (moom.rQ.M ^ 3063992568138L);
    life4_5 = ((moom.rV.b()) ? 1 : 0);
    spill3898_0 = ((p0 instanceof moom.rQ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue3898_40_0 = spill3898_0;
        break forward_join_40;
    }
    if (!((spill3898_0 != 0))) {
        break forward_join_37;
    }
    life5_16 = ((moom.rQ)(p0));
    spill3898_1 = ((moom.rQ)(life5_16)).K;
    spill3898_2 = this.K;
    if (!((life4_5 != 0))) {
        forwardValue3898_26_0 = spill3898_1;
        forwardValue3898_26_1 = spill3898_2;
        break forward_join_26;
    }
    if (!((spill3898_1 != spill3898_2))) {
        break forward_join_35;
    }
    spill3898_3 = this.K;
    if (!((life4_5 != 0))) {
        forwardValue3898_34_0 = spill3898_3;
        break forward_join_34;
    }
    forwardValue3898_26_0 = spill3898_3;
    forwardValue3898_26_1 = 2;
    }
    if (!((forwardValue3898_26_0 != forwardValue3898_26_1))) {
        break forward_join_33;
    }
    spill3898_4 = ((moom.rQ)(life5_16)).K;
    if (!((life4_5 != 0))) {
        forwardValue3898_34_0 = spill3898_4;
        break forward_join_34;
    }
    if (!((spill3898_4 == 2))) {
        break forward_join_35;
    }
    }
    forwardValue3898_34_0 = 1;
    }
    forwardValue3898_36_0 = forwardValue3898_34_0;
    break forward_join_36;
    }
    forwardValue3898_36_0 = 0;
    }
    return ((forwardValue3898_36_0) != 0);
    }
    forwardValue3898_40_0 = ((super.a(((net.minecraft.enchantment.Enchantment)(p0)))) ? 1 : 0);
    }
    return ((forwardValue3898_40_0) != 0);
}


public int a(int p0, net.minecraft.util.DamageSource p1) {
int forwardValue3897_22_0;
    int forwardValue3897_38_0;
    int forwardValue3897_54_0;
    int forwardValue3897_55_0;
    int forwardValue3897_55_1;
    int forwardValue3897_69_0;
    int forwardValue3897_69_1;
    int forwardValue3897_84_0;
    int forwardValue3897_87_0;
    int forwardValue3897_87_1;
    int forwardValue3897_90_0;
    int forwardValue3897_97_0;
    int forwardValue3897_99_0;
    boolean spill3897_0;
    int spill3897_1;
    int spill3897_2;
    boolean spill3897_3;
    boolean spill3897_4;
    long life3_3;
    int life5_5;
    float life6_30;
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_90: {
    forward_join_87: {
    forward_join_84: {
    forward_join_82: {
    forward_join_69: {
    forward_join_66: {
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    forward_join_38: {
    forward_join_36: {
    forward_join_22: {
    forward_join_13: {
    life3_3 = (moom.rQ.M ^ 28695810497892L);
    life5_5 = ((moom.rV.c()) ? 1 : 0);
    spill3897_0 = ((net.minecraft.util.DamageSource)(p1)).d__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue3897_22_0 = ((spill3897_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill3897_0)) {
        break forward_join_13;
    }
    return 0;
    }
    forwardValue3897_22_0 = (__sourceIntrinsic_3d8ec42e385d_invokedynamic3897_5(14367, (5726049144529447318L ^ life3_3)) + (p0 * p0));
    }
    life6_30 = (((float) forwardValue3897_22_0) / 0x1.8p1f);
    spill3897_1 = this.K;
    if (!((life5_5 == 0))) {
        forwardValue3897_38_0 = spill3897_1;
        break forward_join_38;
    }
    if (!((spill3897_1 == 0))) {
        break forward_join_36;
    }
    forwardValue3897_99_0 = moom.Dr.a__Int(((float)((life6_30 * 0x1.8p-1f))));
    break forward_join_99;
    }
    forwardValue3897_38_0 = this.K;
    }
    spill3897_2 = 1;
    if (!((life5_5 == 0))) {
        forwardValue3897_55_0 = forwardValue3897_38_0;
        forwardValue3897_55_1 = spill3897_2;
        break forward_join_55;
    }
    if (!((forwardValue3897_38_0 == spill3897_2))) {
        break forward_join_52;
    }
    spill3897_3 = ((net.minecraft.util.DamageSource)(p1)).f__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue3897_54_0 = ((spill3897_3) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill3897_3)) {
        break forward_join_52;
    }
    forwardValue3897_99_0 = moom.Dr.a__Int(((float)((life6_30 * 0x1.4p0f))));
    break forward_join_99;
    }
    forwardValue3897_54_0 = this.K;
    }
    forwardValue3897_55_0 = forwardValue3897_54_0;
    forwardValue3897_55_1 = 2;
    }
    if (!((life5_5 == 0))) {
        forwardValue3897_69_0 = forwardValue3897_55_0;
        forwardValue3897_69_1 = forwardValue3897_55_1;
        break forward_join_69;
    }
    if (!((forwardValue3897_55_0 == forwardValue3897_55_1))) {
        break forward_join_66;
    }
    if (!((p1 == net.minecraft.util.DamageSource.i))) {
        break forward_join_66;
    }
    forwardValue3897_99_0 = moom.Dr.a__Int(((float)((life6_30 * 0x1.4p1f))));
    break forward_join_99;
    }
    forwardValue3897_69_0 = this.K;
    forwardValue3897_69_1 = 3;
    }
    if (!((life5_5 == 0))) {
        forwardValue3897_87_0 = forwardValue3897_69_0;
        forwardValue3897_87_1 = forwardValue3897_69_1;
        break forward_join_87;
    }
    if (!((forwardValue3897_69_0 == forwardValue3897_69_1))) {
        break forward_join_82;
    }
    spill3897_4 = ((net.minecraft.util.DamageSource)(p1)).b__Boolean();
    if (!((life5_5 == 0))) {
        forwardValue3897_84_0 = ((spill3897_4) ? 1 : 0);
        break forward_join_84;
    }
    if (!(spill3897_4)) {
        break forward_join_82;
    }
    forwardValue3897_99_0 = moom.Dr.a__Int(((float)((life6_30 * 0x1.8p0f))));
    break forward_join_99;
    }
    forwardValue3897_84_0 = this.K;
    }
    if (!((life5_5 == 0))) {
        forwardValue3897_90_0 = forwardValue3897_84_0;
        break forward_join_90;
    }
    forwardValue3897_87_0 = forwardValue3897_84_0;
    forwardValue3897_87_1 = 4;
    }
    if (!((forwardValue3897_87_0 == forwardValue3897_87_1))) {
        break forward_join_98;
    }
    forwardValue3897_90_0 = ((((net.minecraft.util.DamageSource)(p1)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue3897_97_0 = forwardValue3897_90_0;
        break forward_join_97;
    }
    if (!((forwardValue3897_90_0 != 0))) {
        break forward_join_98;
    }
    forwardValue3897_97_0 = moom.Dr.a__Int(((float)((life6_30 * 0x1.8p0f))));
    }
    forwardValue3897_99_0 = forwardValue3897_97_0;
    break forward_join_99;
    }
    forwardValue3897_99_0 = 0;
    }
    return forwardValue3897_99_0;
}


public static double a(net.minecraft.entity.Entity p0, double p1) {
long local3 = (moom.rQ.M ^ 27803403028027L);
    int local5 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.g)).C)), ((net.minecraft.item.ItemStack[])(((net.minecraft.entity.Entity)(p0)).a__ArrayxW())));
    if ((local5 > 0)) {
        p1 = (p1 - ((double) moom.Dr.b__Int(((double)((p1 * ((double) (((float) local5) * 0x1.333334p-3f))))))));
    }
    return p1;
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite1617_2((moom.rQ.G)[this.K]);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1499_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8923_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3d8ec42e385d_invokedynamic3897_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1617_2(java.lang.String a0) throws E;
}
