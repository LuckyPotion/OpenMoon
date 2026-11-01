package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hx extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Hx() {
super();
}


public Hx(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 1, 1, 2);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-5691929023065963854L)), ((long)(-7412653449570736059L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(210774906782742L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hx.p ^ 23718509526604L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill850_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill850_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill850_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill850_14 = new byte[8];
    (__sourceSpill850_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill850_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation850_16 = __sourceSpill850_14;
    ((javax.crypto.Cipher)(__sourceSpill850_11)).init(((int)(__sourceSpill850_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill850_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation850_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¤\033°T ?âþ@zsÚ?ìr¹¨\020¾Çhì;Ô4÷­I\0229_µñ ±;üR&Êû²íß«\020ÍÜµ[\003râÅNDh»\004<±z½ðö\034ság+ú\023B\032#=Í§\032:Ï\n\0351\000\f]2}g²±ôîQÖ.¦áÚ¸Ð>Â<G\032oÁiU¤èWNt\021t2dÚ0b¸È®<Ç ë<@ü½"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill850_25 = local6_life21;
        int __sourceSpill850_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill850_25)).substring(((int)(__sourceSpill850_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill850_30 = local8_life19;
        int __sourceSpill850_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill850_33 = new byte[8];
        (__sourceSpill850_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill850_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill850_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill850_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill850_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill850_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill850_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill850_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill850_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill850_34)).doFinal(((byte[])(__sourceSpill850_33)));
        (__sourceSpill850_30)[__sourceSpill850_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "IÃÁw\002?ô\033v\tÓ\004\bÄ;"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill850_38 = local6_life21;
        int __sourceSpill850_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill850_38)).substring(((int)(__sourceSpill850_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill850_43 = local8_life19;
        int __sourceSpill850_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill850_46 = new byte[8];
        (__sourceSpill850_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill850_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill850_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill850_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill850_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill850_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill850_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill850_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill850_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill850_47)).doFinal(((byte[])(__sourceSpill850_46)));
        (__sourceSpill850_43)[__sourceSpill850_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[21]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4072;
        if (r[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = q[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Hx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hx.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hx.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il forwardValue2162_59_0;
    moom.Il forwardValue2162_86_0;
    moom.Il forwardValue2162_781_0;
    int forwardValue2162_804_0;
    int forwardValue2162_831_0;
    int forwardValue2162_850_0;
    int forwardValue2162_877_0;
    int forwardValue2162_904_0;
    int forwardValue2162_935_0;
    net.minecraft.entity.Entity[] spill2162_0;
    moom.Il spill2162_1;
    boolean spill2162_2;
    long life4_3;
    moom.Il life7_11;
    net.minecraft.entity.Entity[] life6_12;
    moom.Il life8_15;
    forward_join_935: {
    forward_join_934: {
    forward_join_904: {
    forward_join_899: {
    forward_join_877: {
    forward_join_872: {
    forward_join_850: {
    forward_join_845: {
    forward_join_831: {
    forward_join_826: {
    forward_join_804: {
    forward_join_799: {
    forward_join_781: {
    forward_join_112: {
    forward_join_86: {
    forward_join_81: {
    forward_join_59: {
    forward_join_54: {
    life4_3 = (moom.Hx.p ^ 71117868674401L);
    spill2162_0 = moom.G4.b();
    life7_11 = (((moom.Il)(((moom.Hx)(this)).o)).b)[((moom.bs)(moom.bs.NORTH)).a()];
    life6_12 = spill2162_0;
    life8_15 = ((moom.Hx)(this)).o;
    spill2162_1 = ((moom.Hx)(this)).o;
    if (!((life6_12 != null))) {
        forwardValue2162_59_0 = spill2162_1;
        break forward_join_59;
    }
    if (!(((((moom.Il)(spill2162_1)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic2162_9(31893, (2284934418006695873L ^ life4_3))) > 0))) {
        break forward_join_54;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_10(24980, (253467062582854341L ^ life4_3)))), ((boolean)((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(life8_15)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    forwardValue2162_59_0 = (((moom.Il)(life8_15)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_12 != null))) {
        forwardValue2162_86_0 = forwardValue2162_59_0;
        break forward_join_86;
    }
    if (!((forwardValue2162_59_0 == null))) {
        break forward_join_81;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_22(17384, (6153442962889793701L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_23(18362, (2140971401541706986L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)));
    }
    forwardValue2162_86_0 = (((moom.Il)(life7_11)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    if (!((life6_12 != null))) {
        forwardValue2162_781_0 = forwardValue2162_86_0;
        break forward_join_781;
    }
    if (!((forwardValue2162_86_0 == null))) {
        break forward_join_112;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_29(32677, (6109458936909618412L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_30(20599, (5093881380209816353L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_31(6136, (5254677111705416875L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)));
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(0)), ((int)(0)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_34(26856, (3376080705745636277L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_38(25681, (4046897012288767753L ^ life4_3)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_39(25681, (4046897012288767753L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_40(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_44(25681, (4046897012288767753L ^ life4_3)))), ((int)(3)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_48(31154, (6816944809838566124L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_49(20599, (5093881380209816353L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_50(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(2)), ((int)(0)), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_54(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_58(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_59(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_60(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_64(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_68(31154, (6816944809838566124L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_69(20599, (5093881380209816353L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_70(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((net.minecraft.block.state.IBlockState)(moom.Hx.e)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(0)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_74(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_78(25681, (4046897012288767753L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_79(25681, (4046897012288767753L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_80(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_84(25681, (4046897012288767753L ^ life4_3)))), ((int)(1)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_88(31154, (6816944809838566124L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_89(20599, (5093881380209816353L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_90(31154, (6816944809838566124L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_97(20599, (5093881380209816353L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_98(20599, (5093881380209816353L ^ life4_3)))), ((int)(1)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_105(20599, (5093881380209816353L ^ life4_3)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_106(20599, (5093881380209816353L ^ life4_3)))), ((int)(3)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_110(32409, (7462596909275766219L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_111(16320, (2119471019457485977L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_115(20599, (5093881380209816353L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_116(5606, (5369199731861403325L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_117(20599, (5093881380209816353L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_118(16320, (2119471019457485977L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_122(5606, (5369199731861403325L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_123(16320, (2119471019457485977L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_127(20599, (5093881380209816353L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_128(5606, (5369199731861403325L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_129(20599, (5093881380209816353L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_130(16320, (2119471019457485977L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_134(20599, (5093881380209816353L ^ life4_3)))), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_135(20599, (5093881380209816353L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_139(20599, (5093881380209816353L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_140(20599, (5093881380209816353L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_144(125, (7799735138695914273L ^ life4_3)))), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_145(9843, (5684117109275886884L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_149(9843, (5684117109275886884L ^ life4_3)))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_150(9843, (5684117109275886884L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_154(20599, (5093881380209816353L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_155(20599, (5093881380209816353L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_159(9843, (5684117109275886884L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_160(9843, (5684117109275886884L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_164(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_165(32677, (6109458936909618412L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_169(25681, (4046897012288767753L ^ life4_3)))), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_170(32677, (6109458936909618412L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((boolean)(false)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.i)), ((int)(2)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.i)), ((int)(5)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.i)), ((int)(2)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_179(24360, (3394856080319118455L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.i)), ((int)(5)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_182(15705, (8310906882081594897L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((int)(2)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((int)(5)), ((int)(3)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((int)(2)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_189(15705, (8310906882081594897L ^ life4_3)))), ((moom.G2)(p2)));
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(moom.Hx.f)), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_192(15705, (8310906882081594897L ^ life4_3)))), ((moom.G2)(p2)));
    forwardValue2162_781_0 = life8_15;
    }
    spill2162_2 = (((moom.Il)(forwardValue2162_781_0)).c)[((moom.bs)(moom.bs.SOUTH)).a()];
    if (!((life6_12 != null))) {
        forwardValue2162_804_0 = ((spill2162_2) ? 1 : 0);
        break forward_join_804;
    }
    if (!(spill2162_2)) {
        break forward_join_799;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(0)), ((int)(4)), ((int)(2)), ((int)(0)), ((boolean)(false)));
    }
    forwardValue2162_804_0 = (((((moom.Il)(life8_15)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_12 != null))) {
        forwardValue2162_831_0 = forwardValue2162_804_0;
        break forward_join_831;
    }
    if (!((forwardValue2162_804_0 != 0))) {
        break forward_join_826;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_203(25681, (4046897012288767753L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_204(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2162_831_0 = (((((moom.Il)(life8_15)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_12 != null))) {
        forwardValue2162_850_0 = forwardValue2162_831_0;
        break forward_join_850;
    }
    if (!((forwardValue2162_831_0 != 0))) {
        break forward_join_845;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(3)), ((int)(0)), ((int)(2)), ((int)(4)), ((boolean)(false)));
    }
    forwardValue2162_850_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.NORTH)).a()]) ? 1 : 0);
    }
    if (!((life6_12 != null))) {
        forwardValue2162_877_0 = forwardValue2162_850_0;
        break forward_join_877;
    }
    if (!((forwardValue2162_850_0 != 0))) {
        break forward_join_872;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_215(31154, (6816944809838566124L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_216(31154, (6816944809838566124L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2162_877_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.WEST)).a()]) ? 1 : 0);
    }
    if (!((life6_12 != null))) {
        forwardValue2162_904_0 = forwardValue2162_877_0;
        break forward_join_904;
    }
    if (!((forwardValue2162_877_0 != 0))) {
        break forward_join_899;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_222(11947, (9138145926192205310L ^ life4_3)))), ((int)(0)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_223(20228, (7291489926078065742L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2162_904_0 = (((((moom.Il)(life7_11)).c)[((moom.bs)(moom.bs.EAST)).a()]) ? 1 : 0);
    }
    if (!((life6_12 != null))) {
        forwardValue2162_935_0 = forwardValue2162_904_0;
        break forward_join_935;
    }
    if (!((forwardValue2162_904_0 != 0))) {
        break forward_join_934;
    }
    ((moom.Hx)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_229(25681, (4046897012288767753L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_230(16251, (1987975285916048417L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_231(25681, (4046897012288767753L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic2162_232(2080, (9029456523491126123L ^ life4_3)))), ((boolean)(false)));
    }
    forwardValue2162_935_0 = 1;
    }
    return ((forwardValue2162_935_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4880_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_216(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_222(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_223(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_229(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic2162_232(int a0, long a1) throws E;
}
