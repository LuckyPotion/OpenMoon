package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Hv extends moom.Hs {

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map t;

public Hv() {
super();
}


public Hv(moom.bs p0, moom.Il p1, java.util.Random p2) {
super(1, p0, p1, 1, 2, 1);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(3308044177746813616L)), ((long)(5850637254997538629L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47605289129590L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Hv.p ^ 71386387855055L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill848_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill848_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill848_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill848_14 = new byte[8];
    (__sourceSpill848_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill848_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation848_16 = __sourceSpill848_14;
    ((javax.crypto.Cipher)(__sourceSpill848_11)).init(((int)(__sourceSpill848_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill848_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation848_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ãb¯f¾f\030\få,A]&v¢ØQ0pO¸\nMkMÈ=Ð \026g¶²\021"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill848_25 = local6_life21;
        int __sourceSpill848_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill848_25)).substring(((int)(__sourceSpill848_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill848_30 = local8_life19;
        int __sourceSpill848_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill848_33 = new byte[8];
        (__sourceSpill848_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill848_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill848_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill848_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill848_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill848_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill848_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill848_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill848_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill848_34)).doFinal(((byte[])(__sourceSpill848_33)));
        (__sourceSpill848_30)[__sourceSpill848_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "áD¯\021¡-#z¨Í_.>"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill848_38 = local6_life21;
        int __sourceSpill848_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill848_38)).substring(((int)(__sourceSpill848_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill848_43 = local8_life19;
        int __sourceSpill848_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill848_46 = new byte[8];
        (__sourceSpill848_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill848_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill848_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill848_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill848_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill848_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill848_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill848_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill848_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill848_47)).doFinal(((byte[])(__sourceSpill848_46)));
        (__sourceSpill848_43)[__sourceSpill848_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6D69;
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
                throw new RuntimeException("moom/Hv", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Hv.r[n2] = n3;
        }
        return r[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Hv.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4876_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Hv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Il lexicalValue775_36_0;
    moom.Il lexicalValue775_286_0;
    int lexicalValue775_704_0;
    moom.Il spill775_0;
    moom.Il spill775_1;
    boolean spill775_2;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    moom.Il life7_42;
    moom.Il life8_298;
    int life9_300;
    int life10_305;
    int life10_422;
    int life11_530;
    int life11_642;
    lexical_join_704: {
    lexical_join_703: {
    lexical_join_286: {
    lexical_join_72: {
    lexical_join_36: {
    lexical_join_30: {
    life4_3 = (moom.Hv.p ^ 115842575145757L);
    life6_5 = moom.G4.b();
    spill775_0 = ((moom.Hv)(this)).o;
    if (!((life6_5 != null))) {
        lexicalValue775_36_0 = spill775_0;
        break lexical_join_36;
    }
    if (!(((((moom.Il)(spill775_0)).a / __sourceIntrinsic_5ac1d031d896_invokedynamic775_4(26346, (2343669084394711214L ^ life4_3))) > 0))) {
        break lexical_join_30;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((boolean)((((moom.Il)(((moom.Hv)(this)).o)).c)[((moom.bs)(moom.bs.DOWN)).a()])));
    }
    lexicalValue775_36_0 = (((moom.Il)(((moom.Hv)(this)).o)).b)[((moom.bs)(moom.bs.UP)).a()];
    }
    life7_42 = lexicalValue775_36_0;
    spill775_1 = (((moom.Il)(life7_42)).b)[((moom.bs)(moom.bs.UP)).a()];
    if (!((life6_5 != null))) {
        lexicalValue775_286_0 = spill775_1;
        break lexical_join_286;
    }
    if (!((spill775_1 == null))) {
        break lexical_join_72;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_17(29826, (1601095719320257L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_18(30335, (7565111980408928318L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_19(28232, (225089940474880014L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_20(3025, (2735662197721236886L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)));
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(4)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_23(14619, (7883986315576489817L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_27(9015, (1675174722396826999L ^ life4_3)))), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_28(9015, (1675174722396826999L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_29(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_33(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(0)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_37(9015, (1675174722396826999L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_38(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_39(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(2)), ((int)(1)), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_52(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_53(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(4)), ((int)(5)), ((int)(2)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_57(3025, (2735662197721236886L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(4)), ((int)(5)), ((int)(1)), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(5)), ((int)(5)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_64(3025, (2735662197721236886L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_68(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_69(3025, (2735662197721236886L ^ life4_3)))), ((int)(4)), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    lexicalValue775_286_0 = ((moom.Hv)(this)).o;
    }
    life8_298 = lexicalValue775_286_0;
    life9_300 = 1;
    lexical_cycle_289: while (true) {
    lexical_join_698: {
    lexical_join_677: {
    lexical_join_658: {
    lexical_join_595: {
    lexical_join_574: {
    lexical_join_555: {
    lexical_join_496: {
    lexical_join_475: {
    lexical_join_456: {
    lexical_join_393: {
    lexical_join_372: {
    lexical_join_353: {
    if (!((life9_300 <= 5))) {
        break lexical_join_703;
    }
    life10_305 = 0;
    if (!((life6_5 != null))) {
        break lexical_join_372;
    }
    spill775_2 = (((moom.Il)(life8_298)).c)[((moom.bs)(moom.bs.SOUTH)).a()];
    if (!((life6_5 != null))) {
        lexicalValue775_704_0 = ((spill775_2) ? 1 : 0);
        break lexical_join_704;
    }
    if (!(spill775_2)) {
        break lexical_join_353;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(life9_300)), ((int)(life10_305)), ((int)(2)), ((int)((life9_300 + 2))), ((int)(life10_305)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(life9_300)), ((int)(life10_305)), ((int)(5)), ((int)((life9_300 + 2))), ((int)(life10_305)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)((life9_300 + 2))), ((int)(life10_305)), ((int)(4)), ((int)((life9_300 + 2))), ((int)(life10_305)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_393;
    }
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life9_300)), ((int)(life10_305)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_87(9015, (1675174722396826999L ^ life4_3)))), ((int)((life9_300 + 2))), ((int)(life10_305)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)((life9_300 + 1))), ((int)(life10_305)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_91(9015, (1675174722396826999L ^ life4_3)))), ((int)((life9_300 + 1))), ((int)(life10_305)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((boolean)(false)));
    }
    life10_422 = __sourceIntrinsic_5ac1d031d896_invokedynamic775_95(9015, (1675174722396826999L ^ life4_3));
    if (!((life6_5 != null))) {
        break lexical_join_475;
    }
    if (!((((moom.Il)(life8_298)).c)[((moom.bs)(moom.bs.NORTH)).a()])) {
        break lexical_join_456;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(life9_300)), ((int)(life10_422)), ((int)(2)), ((int)((life9_300 + 2))), ((int)(life10_422)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(life9_300)), ((int)(life10_422)), ((int)(5)), ((int)((life9_300 + 2))), ((int)(life10_422)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)((life9_300 + 2))), ((int)(life10_422)), ((int)(4)), ((int)((life9_300 + 2))), ((int)(life10_422)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_496;
    }
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(life9_300)), ((int)(life10_422)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_108(9015, (1675174722396826999L ^ life4_3)))), ((int)((life9_300 + 2))), ((int)(life10_422)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)((life9_300 + 1))), ((int)(life10_422)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_112(9015, (1675174722396826999L ^ life4_3)))), ((int)((life9_300 + 1))), ((int)(life10_422)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((boolean)(false)));
    }
    life11_530 = 0;
    if (!((life6_5 != null))) {
        break lexical_join_574;
    }
    if (!((((moom.Il)(life8_298)).c)[((moom.bs)(moom.bs.WEST)).a()])) {
        break lexical_join_555;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_530)), ((int)(life9_300)), ((int)(2)), ((int)(life11_530)), ((int)((life9_300 + 2))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_530)), ((int)(life9_300)), ((int)(5)), ((int)(life11_530)), ((int)((life9_300 + 2))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_530)), ((int)((life9_300 + 2))), ((int)(3)), ((int)(life11_530)), ((int)((life9_300 + 2))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_595;
    }
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_530)), ((int)(life9_300)), ((int)(0)), ((int)(life11_530)), ((int)((life9_300 + 2))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_128(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_530)), ((int)((life9_300 + 1))), ((int)(0)), ((int)(life11_530)), ((int)((life9_300 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_132(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((boolean)(false)));
    }
    life11_642 = __sourceIntrinsic_5ac1d031d896_invokedynamic775_136(9015, (1675174722396826999L ^ life4_3));
    if (!((life6_5 != null))) {
        break lexical_join_677;
    }
    if (!((((moom.Il)(life8_298)).c)[((moom.bs)(moom.bs.EAST)).a()])) {
        break lexical_join_658;
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_642)), ((int)(life9_300)), ((int)(2)), ((int)(life11_642)), ((int)((life9_300 + 2))), ((int)(2)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_642)), ((int)(life9_300)), ((int)(5)), ((int)(life11_642)), ((int)((life9_300 + 2))), ((int)(5)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_642)), ((int)((life9_300 + 2))), ((int)(3)), ((int)(life11_642)), ((int)((life9_300 + 2))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    if (!((life6_5 == null))) {
        break lexical_join_698;
    }
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_642)), ((int)(life9_300)), ((int)(0)), ((int)(life11_642)), ((int)((life9_300 + 2))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_149(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((net.minecraft.block.state.IBlockState)(moom.Hv.f)), ((boolean)(false)));
    }
    ((moom.Hv)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life11_642)), ((int)((life9_300 + 1))), ((int)(0)), ((int)(life11_642)), ((int)((life9_300 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic775_153(9015, (1675174722396826999L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((net.minecraft.block.state.IBlockState)(moom.Hv.e)), ((boolean)(false)));
    }
    life8_298 = life7_42;
    life9_300 += 4;
    if (!((life6_5 == null))) { continue lexical_cycle_289; }
    break lexical_cycle_289;
    }
    }
    lexicalValue775_704_0 = 1;
    }
    return ((lexicalValue775_704_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4876_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic775_153(int a0, long a1) throws E;
}
