package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HM extends moom.HF {

private boolean f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public HM() {
super();
}


public HM(int p0, java.util.Random p1, moom.G2 p2, moom.bs p3) {
super(p0);
    this.b = p3;
    this.a = p2;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(3966348860035674259L)), ((long)(1432317227332221529L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(198618650883820L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.HM.g ^ 97367843709790L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill815_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill815_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill815_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill815_14 = new byte[8];
    (__sourceSpill815_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill815_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation815_16 = __sourceSpill815_14;
    ((javax.crypto.Cipher)(__sourceSpill815_11)).init(((int)(__sourceSpill815_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill815_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation815_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÂæóùÝ±e¤D¶\016\002¡pq\021×\024ü«]3Ç¡p4\034 |ämÃ\021»>Qê\021k\n\024×^¨\030*á«9îFPd\033\022Q-Æb}\nöë\023*r{ßE\\6ý£,\000Ô-?\004¥½4l\033ßO>_Î\020u`EûãÜÿ'1;³\022\\\177köp%(±ê{/&=\rÜpT2ÒK\000B"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill815_25 = local6_life21;
        int __sourceSpill815_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill815_25)).substring(((int)(__sourceSpill815_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill815_30 = local8_life19;
        int __sourceSpill815_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill815_33 = new byte[8];
        (__sourceSpill815_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill815_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill815_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill815_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill815_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill815_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill815_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill815_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill815_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill815_34)).doFinal(((byte[])(__sourceSpill815_33)));
        (__sourceSpill815_30)[__sourceSpill815_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "BRF\024SÌaD\naÆÿ-³"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill815_38 = local6_life21;
        int __sourceSpill815_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill815_38)).substring(((int)(__sourceSpill815_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill815_43 = local8_life19;
        int __sourceSpill815_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill815_46 = new byte[8];
        (__sourceSpill815_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill815_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill815_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill815_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill815_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill815_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill815_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill815_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill815_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill815_47)).doFinal(((byte[])(__sourceSpill815_46)));
        (__sourceSpill815_43)[__sourceSpill815_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[20]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4755_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/HM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x373B;
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
                throw new RuntimeException("moom/HM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            HM.i[n2] = n3;
        }
        return i[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.HM.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.f = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Mob")))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue278_497_0;
    moom.HM forestValue278_527_0;
    moom.HM forestValue278_540_0;
    net.minecraft.world.World forestValue278_540_1;
    net.minecraft.block.state.IBlockState forestValue278_540_2;
    moom.fv forestValue278_540_3;
    int forestValue278_540_4;
    moom.HM forestValue278_541_0;
    net.minecraft.world.World forestValue278_541_1;
    net.minecraft.block.state.IBlockState forestValue278_541_2;
    moom.fv forestValue278_541_3;
    moom.HM forestValue278_542_0;
    net.minecraft.world.World forestValue278_542_1;
    net.minecraft.block.state.IBlockState forestValue278_542_2;
    moom.fv forestValue278_542_3;
    int forestValue278_542_4;
    moom.HM forestValue278_567_0;
    net.minecraft.world.World forestValue278_567_1;
    net.minecraft.block.state.IBlockState forestValue278_567_2;
    moom.fv forestValue278_567_3;
    int forestValue278_567_4;
    moom.HM forestValue278_568_0;
    net.minecraft.world.World forestValue278_568_1;
    net.minecraft.block.state.IBlockState forestValue278_568_2;
    moom.fv forestValue278_568_3;
    moom.HM forestValue278_569_0;
    net.minecraft.world.World forestValue278_569_1;
    net.minecraft.block.state.IBlockState forestValue278_569_2;
    moom.fv forestValue278_569_3;
    int forestValue278_569_4;
    moom.HM forestValue278_594_0;
    net.minecraft.world.World forestValue278_594_1;
    net.minecraft.block.state.IBlockState forestValue278_594_2;
    moom.fv forestValue278_594_3;
    int forestValue278_594_4;
    moom.HM forestValue278_595_0;
    net.minecraft.world.World forestValue278_595_1;
    net.minecraft.block.state.IBlockState forestValue278_595_2;
    moom.fv forestValue278_595_3;
    moom.HM forestValue278_596_0;
    net.minecraft.world.World forestValue278_596_1;
    net.minecraft.block.state.IBlockState forestValue278_596_2;
    moom.fv forestValue278_596_3;
    int forestValue278_596_4;
    moom.HM forestValue278_625_0;
    net.minecraft.world.World forestValue278_625_1;
    net.minecraft.block.state.IBlockState forestValue278_625_2;
    moom.fv forestValue278_625_3;
    int forestValue278_625_4;
    moom.HM forestValue278_626_0;
    net.minecraft.world.World forestValue278_626_1;
    net.minecraft.block.state.IBlockState forestValue278_626_2;
    moom.fv forestValue278_626_3;
    moom.HM forestValue278_627_0;
    net.minecraft.world.World forestValue278_627_1;
    net.minecraft.block.state.IBlockState forestValue278_627_2;
    moom.fv forestValue278_627_3;
    int forestValue278_627_4;
    moom.HM forestValue278_652_0;
    net.minecraft.world.World forestValue278_652_1;
    net.minecraft.block.state.IBlockState forestValue278_652_2;
    moom.fv forestValue278_652_3;
    int forestValue278_652_4;
    moom.HM forestValue278_653_0;
    net.minecraft.world.World forestValue278_653_1;
    net.minecraft.block.state.IBlockState forestValue278_653_2;
    moom.fv forestValue278_653_3;
    moom.HM forestValue278_654_0;
    net.minecraft.world.World forestValue278_654_1;
    net.minecraft.block.state.IBlockState forestValue278_654_2;
    moom.fv forestValue278_654_3;
    int forestValue278_654_4;
    moom.HM forestValue278_679_0;
    net.minecraft.world.World forestValue278_679_1;
    net.minecraft.block.state.IBlockState forestValue278_679_2;
    moom.fv forestValue278_679_3;
    int forestValue278_679_4;
    moom.HM forestValue278_680_0;
    net.minecraft.world.World forestValue278_680_1;
    net.minecraft.block.state.IBlockState forestValue278_680_2;
    moom.fv forestValue278_680_3;
    moom.HM forestValue278_681_0;
    net.minecraft.world.World forestValue278_681_1;
    net.minecraft.block.state.IBlockState forestValue278_681_2;
    moom.fv forestValue278_681_3;
    int forestValue278_681_4;
    moom.HM forestValue278_710_0;
    net.minecraft.world.World forestValue278_710_1;
    net.minecraft.block.state.IBlockState forestValue278_710_2;
    moom.fv forestValue278_710_3;
    int forestValue278_710_4;
    moom.HM forestValue278_711_0;
    net.minecraft.world.World forestValue278_711_1;
    net.minecraft.block.state.IBlockState forestValue278_711_2;
    moom.fv forestValue278_711_3;
    moom.HM forestValue278_712_0;
    net.minecraft.world.World forestValue278_712_1;
    net.minecraft.block.state.IBlockState forestValue278_712_2;
    moom.fv forestValue278_712_3;
    int forestValue278_712_4;
    moom.HM forestValue278_737_0;
    net.minecraft.world.World forestValue278_737_1;
    net.minecraft.block.state.IBlockState forestValue278_737_2;
    moom.fv forestValue278_737_3;
    int forestValue278_737_4;
    moom.HM forestValue278_738_0;
    net.minecraft.world.World forestValue278_738_1;
    net.minecraft.block.state.IBlockState forestValue278_738_2;
    moom.fv forestValue278_738_3;
    moom.HM forestValue278_739_0;
    net.minecraft.world.World forestValue278_739_1;
    net.minecraft.block.state.IBlockState forestValue278_739_2;
    moom.fv forestValue278_739_3;
    int forestValue278_739_4;
    moom.HM forestValue278_764_0;
    net.minecraft.world.World forestValue278_764_1;
    net.minecraft.block.state.IBlockState forestValue278_764_2;
    moom.fv forestValue278_764_3;
    int forestValue278_764_4;
    moom.HM forestValue278_765_0;
    net.minecraft.world.World forestValue278_765_1;
    net.minecraft.block.state.IBlockState forestValue278_765_2;
    moom.fv forestValue278_765_3;
    moom.HM forestValue278_766_0;
    net.minecraft.world.World forestValue278_766_1;
    net.minecraft.block.state.IBlockState forestValue278_766_2;
    moom.fv forestValue278_766_3;
    int forestValue278_766_4;
    moom.HM forestValue278_791_0;
    net.minecraft.world.World forestValue278_791_1;
    net.minecraft.block.state.IBlockState forestValue278_791_2;
    moom.fv forestValue278_791_3;
    int forestValue278_791_4;
    moom.HM forestValue278_792_0;
    net.minecraft.world.World forestValue278_792_1;
    net.minecraft.block.state.IBlockState forestValue278_792_2;
    moom.fv forestValue278_792_3;
    moom.HM forestValue278_793_0;
    net.minecraft.world.World forestValue278_793_1;
    net.minecraft.block.state.IBlockState forestValue278_793_2;
    moom.fv forestValue278_793_3;
    int forestValue278_793_4;
    moom.HM forestValue278_822_0;
    net.minecraft.world.World forestValue278_822_1;
    net.minecraft.block.state.IBlockState forestValue278_822_2;
    moom.fv forestValue278_822_3;
    int forestValue278_822_4;
    moom.HM forestValue278_823_0;
    net.minecraft.world.World forestValue278_823_1;
    net.minecraft.block.state.IBlockState forestValue278_823_2;
    moom.fv forestValue278_823_3;
    moom.HM forestValue278_824_0;
    net.minecraft.world.World forestValue278_824_1;
    net.minecraft.block.state.IBlockState forestValue278_824_2;
    moom.fv forestValue278_824_3;
    int forestValue278_824_4;
    moom.HM forestValue278_853_0;
    net.minecraft.world.World forestValue278_853_1;
    net.minecraft.block.state.IBlockState forestValue278_853_2;
    moom.fv forestValue278_853_3;
    int forestValue278_853_4;
    moom.HM forestValue278_854_0;
    net.minecraft.world.World forestValue278_854_1;
    net.minecraft.block.state.IBlockState forestValue278_854_2;
    moom.fv forestValue278_854_3;
    moom.HM forestValue278_855_0;
    net.minecraft.world.World forestValue278_855_1;
    net.minecraft.block.state.IBlockState forestValue278_855_2;
    moom.fv forestValue278_855_3;
    int forestValue278_855_4;
    int forestValue278_931_0;
    net.minecraft.entity.Entity[] spill278_0;
    moom.HM spill278_1;
    int spill278_2;
    net.minecraft.world.World spill278_3;
    net.minecraft.block.state.IBlockState spill278_4;
    moom.fv spill278_5;
    int spill278_6;
    moom.HM spill278_7;
    net.minecraft.world.World spill278_8;
    net.minecraft.block.state.IBlockState spill278_9;
    moom.fv spill278_10;
    int spill278_11;
    moom.HM spill278_12;
    net.minecraft.world.World spill278_13;
    net.minecraft.block.state.IBlockState spill278_14;
    moom.fv spill278_15;
    int spill278_16;
    moom.HM spill278_17;
    net.minecraft.world.World spill278_18;
    net.minecraft.block.state.IBlockState spill278_19;
    moom.fv spill278_20;
    int spill278_21;
    moom.HM spill278_22;
    net.minecraft.world.World spill278_23;
    net.minecraft.block.state.IBlockState spill278_24;
    moom.fv spill278_25;
    int spill278_26;
    moom.HM spill278_27;
    net.minecraft.world.World spill278_28;
    net.minecraft.block.state.IBlockState spill278_29;
    moom.fv spill278_30;
    int spill278_31;
    moom.HM spill278_32;
    net.minecraft.world.World spill278_33;
    net.minecraft.block.state.IBlockState spill278_34;
    moom.fv spill278_35;
    int spill278_36;
    moom.HM spill278_37;
    net.minecraft.world.World spill278_38;
    net.minecraft.block.state.IBlockState spill278_39;
    moom.fv spill278_40;
    int spill278_41;
    moom.HM spill278_42;
    net.minecraft.world.World spill278_43;
    net.minecraft.block.state.IBlockState spill278_44;
    moom.fv spill278_45;
    int spill278_46;
    moom.HM spill278_47;
    net.minecraft.world.World spill278_48;
    net.minecraft.block.state.IBlockState spill278_49;
    moom.fv spill278_50;
    int spill278_51;
    moom.HM spill278_52;
    net.minecraft.world.World spill278_53;
    net.minecraft.block.state.IBlockState spill278_54;
    moom.fv spill278_55;
    int spill278_56;
    moom.HM spill278_57;
    net.minecraft.world.World spill278_58;
    net.minecraft.block.state.IBlockState spill278_59;
    moom.fv spill278_60;
    int spill278_61;
    boolean spill278_62;
    boolean spill278_63;
    int spill278_64;
    long life4_3;
    net.minecraft.entity.Entity[] life6_39;
    int life7_45;
    int life8_255;
    int life9_423;
    int life10_476;
    int life11_479;
    int life12_482;
    int life7_897;
    moom.DT life13_918;
    net.minecraft.tileentity.TileEntity life14_939;
    forest_join_931: {
    forest_join_930: {
    forest_join_855: {
    forest_join_854: {
    forest_join_853: {
    forest_join_824: {
    forest_join_823: {
    forest_join_822: {
    forest_join_793: {
    forest_join_792: {
    forest_join_791: {
    forest_join_766: {
    forest_join_765: {
    forest_join_764: {
    forest_join_739: {
    forest_join_738: {
    forest_join_737: {
    forest_join_712: {
    forest_join_711: {
    forest_join_710: {
    forest_join_681: {
    forest_join_680: {
    forest_join_679: {
    forest_join_654: {
    forest_join_653: {
    forest_join_652: {
    forest_join_627: {
    forest_join_626: {
    forest_join_625: {
    forest_join_596: {
    forest_join_595: {
    forest_join_594: {
    forest_join_569: {
    forest_join_568: {
    forest_join_567: {
    forest_join_542: {
    forest_join_541: {
    forest_join_540: {
    forest_join_527: {
    forest_join_526: {
    forest_join_514: {
    forest_join_500: {
    forest_join_497: {
    forest_join_492: {
    forest_join_470: {
    forest_join_467: {
    forest_join_419: {
    forest_join_343: {
    forest_join_308: {
    forest_join_306: {
    life4_3 = (moom.HM.g ^ 97725038954381L);
    spill278_0 = moom.G4.b();
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_2(14062, (1317370376126882555L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_3(10896, (8931472592671833745L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_4(21724, (3160640040218755265L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((moom.G2)(p2)), ((moom.bJ)(moom.bJ.GRATES)), ((int)(4)), ((int)(1)), ((int)(0)));
    life6_39 = spill278_0;
    life7_45 = __sourceIntrinsic_5ac1d031d896_invokedynamic278_9(29653, (3278511266710988739L ^ life4_3));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(life7_45)), ((int)(1)), ((int)(1)), ((int)(life7_45)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_10(2512, (8373828911716785601L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_13(18949, (4174975902345534981L ^ life4_3)))), ((int)(life7_45)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_14(28774, (7527202086478586993L ^ life4_3)))), ((int)(life7_45)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_15(2710, (917149476846952076L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(life7_45)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_18(26141, (9173421007289037316L ^ life4_3)))), ((int)(life7_45)), ((int)(2)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(life7_45)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_21(2710, (917149476846952076L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_22(26141, (9173421007289037316L ^ life4_3)))), ((int)(life7_45)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_23(2710, (917149476846952076L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(2)), ((int)(1)), ((int)(4)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_28(26141, (9173421007289037316L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_29(28774, (7527202086478586993L ^ life4_3)))), ((int)(1)), ((int)(4)), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((boolean)(false)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_37(28774, (7527202086478586993L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_38(28774, (7527202086478586993L ^ life4_3)))), ((int)(1)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((boolean)(false)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_44(26141, (9173421007289037316L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_45(22490, (4768228103338853317L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_46(28618, (6100305455983868890L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_49(28774, (7527202086478586993L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_50(24895, (8630119187665401127L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_51(3695, (8919446797405608573L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((net.minecraft.block.state.IBlockState)(((moom.dM)(net.minecraft.init.Blocks.k)).a__fE())), ((boolean)(false)));
    life8_255 = 3;
    forest_cycle_256: while (true) {
    if (!((life8_255 < __sourceIntrinsic_5ac1d031d896_invokedynamic278_57(2710, (917149476846952076L ^ life4_3))))) {
        break forest_join_306;
    }
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(3)), ((int)(life8_255)), ((int)(0)), ((int)(4)), ((int)(life8_255)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((boolean)(false)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_63(78, (4703242203238585429L ^ life4_3)))), ((int)(3)), ((int)(life8_255)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_64(78, (4703242203238585429L ^ life4_3)))), ((int)(4)), ((int)(life8_255)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((boolean)(false)));
    life8_255 += 2;
    if (!((life6_39 != null))) {
        break forest_join_308;
    }
    if (!((life6_39 == null))) {
        continue forest_cycle_256;
    }
    break forest_cycle_256;
    }
    }
    life8_255 = 2;
    }
    forest_cycle_308: while (true) {
    if (!((life8_255 < __sourceIntrinsic_5ac1d031d896_invokedynamic278_70(28774, (7527202086478586993L ^ life4_3))))) {
        break forest_join_343;
    }
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life8_255)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_71(25056, (6200932461959198195L ^ life4_3)))), ((int)(life8_255)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_72(25056, (6200932461959198195L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a8)).a__fE())), ((boolean)(false)));
    life8_255 += 2;
    if (!((life6_39 != null))) {
        break forest_join_419;
    }
    if (!((life6_39 == null))) {
        continue forest_cycle_308;
    }
    break forest_cycle_308;
    }
    }
    life8_255 = ((moom.HM)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bk)), ((int)(3)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_80(24895, (8630119187665401127L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_81(22490, (4768228103338853317L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_84(24895, (8630119187665401127L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_85(24895, (8630119187665401127L ^ life4_3)))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_86(22490, (4768228103338853317L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_89(22490, (4768228103338853317L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_90(24895, (8630119187665401127L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_91(22490, (4768228103338853317L ^ life4_3)))), ((boolean)(false)), ((java.util.Random)(p1)), ((moom.H9)(net.minecraft.world.gen.structure.StructureStrongholdPieces.e)));
    }
    life9_423 = 4;
    forest_cycle_421: while (true) {
    if (!((life9_423 <= __sourceIntrinsic_5ac1d031d896_invokedynamic278_94(24895, (8630119187665401127L ^ life4_3))))) {
        break forest_join_467;
    }
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bk)).b__fE(((int)(life8_255))))), ((int)(life9_423)), ((int)(1)), ((int)(4)), ((moom.G2)(p2)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bk)).b__fE(((int)(life8_255))))), ((int)(life9_423)), ((int)(2)), ((int)(5)), ((moom.G2)(p2)));
    ((moom.HM)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bk)).b__fE(((int)(life8_255))))), ((int)(life9_423)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_103(24895, (8630119187665401127L ^ life4_3)))), ((moom.G2)(p2)));
    life9_423 += 1;
    if (!((life6_39 != null))) {
        break forest_join_470;
    }
    if (!((life6_39 == null))) {
        continue forest_cycle_421;
    }
    break forest_cycle_421;
    }
    }
    life9_423 = ((moom.bs)(moom.bs.NORTH)).b();
    }
    life10_476 = ((moom.bs)(moom.bs.SOUTH)).b();
    life11_479 = ((moom.bs)(moom.bs.EAST)).b();
    life12_482 = ((moom.bs)(moom.bs.WEST)).b();
    spill278_1 = this;
    if (!((life6_39 != null))) {
        forestValue278_527_0 = spill278_1;
        break forest_join_527;
    }
    if (!((((moom.HM)(spill278_1)).b != null))) {
        break forest_join_526;
    }
    spill278_2 = (moom.Iz.a)[((moom.bs)(((moom.HM)(this)).b)).ordinal()];
    if (!((life6_39 != null))) {
        forestValue278_497_0 = spill278_2;
        break forest_join_497;
    }
    switch (spill278_2) {
case 1:
{
        break forest_join_492;
    }
case 2:
{
        break forest_join_500;
    }
case 3:
{
        break forest_join_514;
    }
default:
{
        break forest_join_526;
    }
}
    }
    life9_423 = ((moom.bs)(moom.bs.SOUTH)).b();
    forestValue278_497_0 = ((moom.bs)(moom.bs.NORTH)).b();
    }
    life10_476 = forestValue278_497_0;
    if (!((life6_39 == null))) {
        break forest_join_526;
    }
    }
    life9_423 = ((moom.bs)(moom.bs.WEST)).b();
    life10_476 = ((moom.bs)(moom.bs.EAST)).b();
    life11_479 = ((moom.bs)(moom.bs.SOUTH)).b();
    life12_482 = ((moom.bs)(moom.bs.NORTH)).b();
    if (!((life6_39 == null))) {
        break forest_join_526;
    }
    }
    life9_423 = ((moom.bs)(moom.bs.EAST)).b();
    life10_476 = ((moom.bs)(moom.bs.WEST)).b();
    life11_479 = ((moom.bs)(moom.bs.SOUTH)).b();
    life12_482 = ((moom.bs)(moom.bs.NORTH)).b();
    }
    forestValue278_527_0 = this;
    }
    spill278_3 = p0;
    spill278_4 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life9_423)));
    spill278_5 = moom.dt.R;
    spill278_6 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_540_0 = forestValue278_527_0;
        forestValue278_540_1 = spill278_3;
        forestValue278_540_2 = spill278_4;
        forestValue278_540_3 = spill278_5;
        forestValue278_540_4 = spill278_6;
        break forest_join_540;
    }
    if (!((spill278_6 > 0))) {
        forestValue278_541_0 = forestValue278_527_0;
        forestValue278_541_1 = spill278_3;
        forestValue278_541_2 = spill278_4;
        forestValue278_541_3 = spill278_5;
        break forest_join_541;
    }
    forestValue278_540_0 = forestValue278_527_0;
    forestValue278_540_1 = spill278_3;
    forestValue278_540_2 = spill278_4;
    forestValue278_540_3 = spill278_5;
    forestValue278_540_4 = 1;
    }
    forestValue278_542_0 = forestValue278_540_0;
    forestValue278_542_1 = forestValue278_540_1;
    forestValue278_542_2 = forestValue278_540_2;
    forestValue278_542_3 = forestValue278_540_3;
    forestValue278_542_4 = forestValue278_540_4;
    break forest_join_542;
    }
    forestValue278_542_0 = forestValue278_541_0;
    forestValue278_542_1 = forestValue278_541_1;
    forestValue278_542_2 = forestValue278_541_2;
    forestValue278_542_3 = forestValue278_541_3;
    forestValue278_542_4 = 0;
    }
    ((moom.HM)(forestValue278_542_0)).a(((net.minecraft.world.World)(forestValue278_542_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_542_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_542_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_542_4))))))))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_144(26141, (9173421007289037316L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_7 = this;
    spill278_8 = p0;
    spill278_9 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life9_423)));
    spill278_10 = moom.dt.R;
    spill278_11 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_567_0 = spill278_7;
        forestValue278_567_1 = spill278_8;
        forestValue278_567_2 = spill278_9;
        forestValue278_567_3 = spill278_10;
        forestValue278_567_4 = spill278_11;
        break forest_join_567;
    }
    if (!((spill278_11 > 0))) {
        forestValue278_568_0 = spill278_7;
        forestValue278_568_1 = spill278_8;
        forestValue278_568_2 = spill278_9;
        forestValue278_568_3 = spill278_10;
        break forest_join_568;
    }
    forestValue278_567_0 = spill278_7;
    forestValue278_567_1 = spill278_8;
    forestValue278_567_2 = spill278_9;
    forestValue278_567_3 = spill278_10;
    forestValue278_567_4 = 1;
    }
    forestValue278_569_0 = forestValue278_567_0;
    forestValue278_569_1 = forestValue278_567_1;
    forestValue278_569_2 = forestValue278_567_2;
    forestValue278_569_3 = forestValue278_567_3;
    forestValue278_569_4 = forestValue278_567_4;
    break forest_join_569;
    }
    forestValue278_569_0 = forestValue278_568_0;
    forestValue278_569_1 = forestValue278_568_1;
    forestValue278_569_2 = forestValue278_568_2;
    forestValue278_569_3 = forestValue278_568_3;
    forestValue278_569_4 = 0;
    }
    ((moom.HM)(forestValue278_569_0)).a(((net.minecraft.world.World)(forestValue278_569_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_569_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_569_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_569_4))))))))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_153(26141, (9173421007289037316L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_12 = this;
    spill278_13 = p0;
    spill278_14 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life9_423)));
    spill278_15 = moom.dt.R;
    spill278_16 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_594_0 = spill278_12;
        forestValue278_594_1 = spill278_13;
        forestValue278_594_2 = spill278_14;
        forestValue278_594_3 = spill278_15;
        forestValue278_594_4 = spill278_16;
        break forest_join_594;
    }
    if (!((spill278_16 > 0))) {
        forestValue278_595_0 = spill278_12;
        forestValue278_595_1 = spill278_13;
        forestValue278_595_2 = spill278_14;
        forestValue278_595_3 = spill278_15;
        break forest_join_595;
    }
    forestValue278_594_0 = spill278_12;
    forestValue278_594_1 = spill278_13;
    forestValue278_594_2 = spill278_14;
    forestValue278_594_3 = spill278_15;
    forestValue278_594_4 = 1;
    }
    forestValue278_596_0 = forestValue278_594_0;
    forestValue278_596_1 = forestValue278_594_1;
    forestValue278_596_2 = forestValue278_594_2;
    forestValue278_596_3 = forestValue278_594_3;
    forestValue278_596_4 = forestValue278_594_4;
    break forest_join_596;
    }
    forestValue278_596_0 = forestValue278_595_0;
    forestValue278_596_1 = forestValue278_595_1;
    forestValue278_596_2 = forestValue278_595_2;
    forestValue278_596_3 = forestValue278_595_3;
    forestValue278_596_4 = 0;
    }
    ((moom.HM)(forestValue278_596_0)).a(((net.minecraft.world.World)(forestValue278_596_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_596_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_596_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_596_4))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_162(24895, (8630119187665401127L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_163(26141, (9173421007289037316L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_17 = this;
    spill278_18 = p0;
    spill278_19 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life10_476)));
    spill278_20 = moom.dt.R;
    spill278_21 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_625_0 = spill278_17;
        forestValue278_625_1 = spill278_18;
        forestValue278_625_2 = spill278_19;
        forestValue278_625_3 = spill278_20;
        forestValue278_625_4 = spill278_21;
        break forest_join_625;
    }
    if (!((spill278_21 > 0))) {
        forestValue278_626_0 = spill278_17;
        forestValue278_626_1 = spill278_18;
        forestValue278_626_2 = spill278_19;
        forestValue278_626_3 = spill278_20;
        break forest_join_626;
    }
    forestValue278_625_0 = spill278_17;
    forestValue278_625_1 = spill278_18;
    forestValue278_625_2 = spill278_19;
    forestValue278_625_3 = spill278_20;
    forestValue278_625_4 = 1;
    }
    forestValue278_627_0 = forestValue278_625_0;
    forestValue278_627_1 = forestValue278_625_1;
    forestValue278_627_2 = forestValue278_625_2;
    forestValue278_627_3 = forestValue278_625_3;
    forestValue278_627_4 = forestValue278_625_4;
    break forest_join_627;
    }
    forestValue278_627_0 = forestValue278_626_0;
    forestValue278_627_1 = forestValue278_626_1;
    forestValue278_627_2 = forestValue278_626_2;
    forestValue278_627_3 = forestValue278_626_3;
    forestValue278_627_4 = 0;
    }
    ((moom.HM)(forestValue278_627_0)).a(((net.minecraft.world.World)(forestValue278_627_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_627_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_627_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_627_4))))))))), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_172(22166, (3961129302610477716L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_22 = this;
    spill278_23 = p0;
    spill278_24 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life10_476)));
    spill278_25 = moom.dt.R;
    spill278_26 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_652_0 = spill278_22;
        forestValue278_652_1 = spill278_23;
        forestValue278_652_2 = spill278_24;
        forestValue278_652_3 = spill278_25;
        forestValue278_652_4 = spill278_26;
        break forest_join_652;
    }
    if (!((spill278_26 > 0))) {
        forestValue278_653_0 = spill278_22;
        forestValue278_653_1 = spill278_23;
        forestValue278_653_2 = spill278_24;
        forestValue278_653_3 = spill278_25;
        break forest_join_653;
    }
    forestValue278_652_0 = spill278_22;
    forestValue278_652_1 = spill278_23;
    forestValue278_652_2 = spill278_24;
    forestValue278_652_3 = spill278_25;
    forestValue278_652_4 = 1;
    }
    forestValue278_654_0 = forestValue278_652_0;
    forestValue278_654_1 = forestValue278_652_1;
    forestValue278_654_2 = forestValue278_652_2;
    forestValue278_654_3 = forestValue278_652_3;
    forestValue278_654_4 = forestValue278_652_4;
    break forest_join_654;
    }
    forestValue278_654_0 = forestValue278_653_0;
    forestValue278_654_1 = forestValue278_653_1;
    forestValue278_654_2 = forestValue278_653_2;
    forestValue278_654_3 = forestValue278_653_3;
    forestValue278_654_4 = 0;
    }
    ((moom.HM)(forestValue278_654_0)).a(((net.minecraft.world.World)(forestValue278_654_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_654_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_654_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_654_4))))))))), ((int)(5)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_181(22166, (3961129302610477716L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_27 = this;
    spill278_28 = p0;
    spill278_29 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life10_476)));
    spill278_30 = moom.dt.R;
    spill278_31 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_679_0 = spill278_27;
        forestValue278_679_1 = spill278_28;
        forestValue278_679_2 = spill278_29;
        forestValue278_679_3 = spill278_30;
        forestValue278_679_4 = spill278_31;
        break forest_join_679;
    }
    if (!((spill278_31 > 0))) {
        forestValue278_680_0 = spill278_27;
        forestValue278_680_1 = spill278_28;
        forestValue278_680_2 = spill278_29;
        forestValue278_680_3 = spill278_30;
        break forest_join_680;
    }
    forestValue278_679_0 = spill278_27;
    forestValue278_679_1 = spill278_28;
    forestValue278_679_2 = spill278_29;
    forestValue278_679_3 = spill278_30;
    forestValue278_679_4 = 1;
    }
    forestValue278_681_0 = forestValue278_679_0;
    forestValue278_681_1 = forestValue278_679_1;
    forestValue278_681_2 = forestValue278_679_2;
    forestValue278_681_3 = forestValue278_679_3;
    forestValue278_681_4 = forestValue278_679_4;
    break forest_join_681;
    }
    forestValue278_681_0 = forestValue278_680_0;
    forestValue278_681_1 = forestValue278_680_1;
    forestValue278_681_2 = forestValue278_680_2;
    forestValue278_681_3 = forestValue278_680_3;
    forestValue278_681_4 = 0;
    }
    ((moom.HM)(forestValue278_681_0)).a(((net.minecraft.world.World)(forestValue278_681_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_681_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_681_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_681_4))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_190(24895, (8630119187665401127L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_191(22166, (3961129302610477716L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_32 = this;
    spill278_33 = p0;
    spill278_34 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life11_479)));
    spill278_35 = moom.dt.R;
    spill278_36 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_710_0 = spill278_32;
        forestValue278_710_1 = spill278_33;
        forestValue278_710_2 = spill278_34;
        forestValue278_710_3 = spill278_35;
        forestValue278_710_4 = spill278_36;
        break forest_join_710;
    }
    if (!((spill278_36 > 0))) {
        forestValue278_711_0 = spill278_32;
        forestValue278_711_1 = spill278_33;
        forestValue278_711_2 = spill278_34;
        forestValue278_711_3 = spill278_35;
        break forest_join_711;
    }
    forestValue278_710_0 = spill278_32;
    forestValue278_710_1 = spill278_33;
    forestValue278_710_2 = spill278_34;
    forestValue278_710_3 = spill278_35;
    forestValue278_710_4 = 1;
    }
    forestValue278_712_0 = forestValue278_710_0;
    forestValue278_712_1 = forestValue278_710_1;
    forestValue278_712_2 = forestValue278_710_2;
    forestValue278_712_3 = forestValue278_710_3;
    forestValue278_712_4 = forestValue278_710_4;
    break forest_join_712;
    }
    forestValue278_712_0 = forestValue278_711_0;
    forestValue278_712_1 = forestValue278_711_1;
    forestValue278_712_2 = forestValue278_711_2;
    forestValue278_712_3 = forestValue278_711_3;
    forestValue278_712_4 = 0;
    }
    ((moom.HM)(forestValue278_712_0)).a(((net.minecraft.world.World)(forestValue278_712_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_712_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_712_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_712_4))))))))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_200(28774, (7527202086478586993L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_37 = this;
    spill278_38 = p0;
    spill278_39 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life11_479)));
    spill278_40 = moom.dt.R;
    spill278_41 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_737_0 = spill278_37;
        forestValue278_737_1 = spill278_38;
        forestValue278_737_2 = spill278_39;
        forestValue278_737_3 = spill278_40;
        forestValue278_737_4 = spill278_41;
        break forest_join_737;
    }
    if (!((spill278_41 > 0))) {
        forestValue278_738_0 = spill278_37;
        forestValue278_738_1 = spill278_38;
        forestValue278_738_2 = spill278_39;
        forestValue278_738_3 = spill278_40;
        break forest_join_738;
    }
    forestValue278_737_0 = spill278_37;
    forestValue278_737_1 = spill278_38;
    forestValue278_737_2 = spill278_39;
    forestValue278_737_3 = spill278_40;
    forestValue278_737_4 = 1;
    }
    forestValue278_739_0 = forestValue278_737_0;
    forestValue278_739_1 = forestValue278_737_1;
    forestValue278_739_2 = forestValue278_737_2;
    forestValue278_739_3 = forestValue278_737_3;
    forestValue278_739_4 = forestValue278_737_4;
    break forest_join_739;
    }
    forestValue278_739_0 = forestValue278_738_0;
    forestValue278_739_1 = forestValue278_738_1;
    forestValue278_739_2 = forestValue278_738_2;
    forestValue278_739_3 = forestValue278_738_3;
    forestValue278_739_4 = 0;
    }
    ((moom.HM)(forestValue278_739_0)).a(((net.minecraft.world.World)(forestValue278_739_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_739_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_739_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_739_4))))))))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_209(78, (4703242203238585429L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_42 = this;
    spill278_43 = p0;
    spill278_44 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life11_479)));
    spill278_45 = moom.dt.R;
    spill278_46 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_764_0 = spill278_42;
        forestValue278_764_1 = spill278_43;
        forestValue278_764_2 = spill278_44;
        forestValue278_764_3 = spill278_45;
        forestValue278_764_4 = spill278_46;
        break forest_join_764;
    }
    if (!((spill278_46 > 0))) {
        forestValue278_765_0 = spill278_42;
        forestValue278_765_1 = spill278_43;
        forestValue278_765_2 = spill278_44;
        forestValue278_765_3 = spill278_45;
        break forest_join_765;
    }
    forestValue278_764_0 = spill278_42;
    forestValue278_764_1 = spill278_43;
    forestValue278_764_2 = spill278_44;
    forestValue278_764_3 = spill278_45;
    forestValue278_764_4 = 1;
    }
    forestValue278_766_0 = forestValue278_764_0;
    forestValue278_766_1 = forestValue278_764_1;
    forestValue278_766_2 = forestValue278_764_2;
    forestValue278_766_3 = forestValue278_764_3;
    forestValue278_766_4 = forestValue278_764_4;
    break forest_join_766;
    }
    forestValue278_766_0 = forestValue278_765_0;
    forestValue278_766_1 = forestValue278_765_1;
    forestValue278_766_2 = forestValue278_765_2;
    forestValue278_766_3 = forestValue278_765_3;
    forestValue278_766_4 = 0;
    }
    ((moom.HM)(forestValue278_766_0)).a(((net.minecraft.world.World)(forestValue278_766_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_766_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_766_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_766_4))))))))), ((int)(3)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_218(3695, (8919446797405608573L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_47 = this;
    spill278_48 = p0;
    spill278_49 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life12_482)));
    spill278_50 = moom.dt.R;
    spill278_51 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_791_0 = spill278_47;
        forestValue278_791_1 = spill278_48;
        forestValue278_791_2 = spill278_49;
        forestValue278_791_3 = spill278_50;
        forestValue278_791_4 = spill278_51;
        break forest_join_791;
    }
    if (!((spill278_51 > 0))) {
        forestValue278_792_0 = spill278_47;
        forestValue278_792_1 = spill278_48;
        forestValue278_792_2 = spill278_49;
        forestValue278_792_3 = spill278_50;
        break forest_join_792;
    }
    forestValue278_791_0 = spill278_47;
    forestValue278_791_1 = spill278_48;
    forestValue278_791_2 = spill278_49;
    forestValue278_791_3 = spill278_50;
    forestValue278_791_4 = 1;
    }
    forestValue278_793_0 = forestValue278_791_0;
    forestValue278_793_1 = forestValue278_791_1;
    forestValue278_793_2 = forestValue278_791_2;
    forestValue278_793_3 = forestValue278_791_3;
    forestValue278_793_4 = forestValue278_791_4;
    break forest_join_793;
    }
    forestValue278_793_0 = forestValue278_792_0;
    forestValue278_793_1 = forestValue278_792_1;
    forestValue278_793_2 = forestValue278_792_2;
    forestValue278_793_3 = forestValue278_792_3;
    forestValue278_793_4 = 0;
    }
    ((moom.HM)(forestValue278_793_0)).a(((net.minecraft.world.World)(forestValue278_793_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_793_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_793_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_793_4))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_227(22490, (4768228103338853317L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_228(28774, (7527202086478586993L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_52 = this;
    spill278_53 = p0;
    spill278_54 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life12_482)));
    spill278_55 = moom.dt.R;
    spill278_56 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_822_0 = spill278_52;
        forestValue278_822_1 = spill278_53;
        forestValue278_822_2 = spill278_54;
        forestValue278_822_3 = spill278_55;
        forestValue278_822_4 = spill278_56;
        break forest_join_822;
    }
    if (!((spill278_56 > 0))) {
        forestValue278_823_0 = spill278_52;
        forestValue278_823_1 = spill278_53;
        forestValue278_823_2 = spill278_54;
        forestValue278_823_3 = spill278_55;
        break forest_join_823;
    }
    forestValue278_822_0 = spill278_52;
    forestValue278_822_1 = spill278_53;
    forestValue278_822_2 = spill278_54;
    forestValue278_822_3 = spill278_55;
    forestValue278_822_4 = 1;
    }
    forestValue278_824_0 = forestValue278_822_0;
    forestValue278_824_1 = forestValue278_822_1;
    forestValue278_824_2 = forestValue278_822_2;
    forestValue278_824_3 = forestValue278_822_3;
    forestValue278_824_4 = forestValue278_822_4;
    break forest_join_824;
    }
    forestValue278_824_0 = forestValue278_823_0;
    forestValue278_824_1 = forestValue278_823_1;
    forestValue278_824_2 = forestValue278_823_2;
    forestValue278_824_3 = forestValue278_823_3;
    forestValue278_824_4 = 0;
    }
    ((moom.HM)(forestValue278_824_0)).a(((net.minecraft.world.World)(forestValue278_824_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_824_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_824_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_824_4))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_237(22490, (4768228103338853317L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_238(78, (4703242203238585429L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_57 = this;
    spill278_58 = p0;
    spill278_59 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bv)).b__fE(((int)(life12_482)));
    spill278_60 = moom.dt.R;
    spill278_61 = recovery.source.CarrierOps.fcmpl(((float)(((java.util.Random)(p1)).nextFloat())), ((float)(0x1.ccccccp-1f)));
    if (!((life6_39 != null))) {
        forestValue278_853_0 = spill278_57;
        forestValue278_853_1 = spill278_58;
        forestValue278_853_2 = spill278_59;
        forestValue278_853_3 = spill278_60;
        forestValue278_853_4 = spill278_61;
        break forest_join_853;
    }
    if (!((spill278_61 > 0))) {
        forestValue278_854_0 = spill278_57;
        forestValue278_854_1 = spill278_58;
        forestValue278_854_2 = spill278_59;
        forestValue278_854_3 = spill278_60;
        break forest_join_854;
    }
    forestValue278_853_0 = spill278_57;
    forestValue278_853_1 = spill278_58;
    forestValue278_853_2 = spill278_59;
    forestValue278_853_3 = spill278_60;
    forestValue278_853_4 = 1;
    }
    forestValue278_855_0 = forestValue278_853_0;
    forestValue278_855_1 = forestValue278_853_1;
    forestValue278_855_2 = forestValue278_853_2;
    forestValue278_855_3 = forestValue278_853_3;
    forestValue278_855_4 = forestValue278_853_4;
    break forest_join_855;
    }
    forestValue278_855_0 = forestValue278_854_0;
    forestValue278_855_1 = forestValue278_854_1;
    forestValue278_855_2 = forestValue278_854_2;
    forestValue278_855_3 = forestValue278_854_3;
    forestValue278_855_4 = 0;
    }
    ((moom.HM)(forestValue278_855_0)).a(((net.minecraft.world.World)(forestValue278_855_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(forestValue278_855_2)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue278_855_3)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forestValue278_855_4))))))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_247(22490, (4768228103338853317L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_248(3695, (8919446797405608573L ^ life4_3)))), ((moom.G2)(p2)));
    spill278_62 = this.f;
    if (!((life6_39 != null))) {
        forestValue278_931_0 = ((spill278_62) ? 1 : 0);
        break forest_join_931;
    }
    if (!((!spill278_62))) {
        break forest_join_930;
    }
    life7_897 = ((moom.HM)(this)).a(((int)(3)));
    life13_918 = new moom.DT(((moom.HM)(this)).a(((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_253(24895, (8630119187665401127L ^ life4_3))))), life7_897, ((moom.HM)(this)).b(((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic278_255(24895, (8630119187665401127L ^ life4_3))))));
    spill278_63 = ((moom.G2)(p2)).a(((moom.DS)(life13_918)));
    if (!((life6_39 != null))) {
        forestValue278_931_0 = ((spill278_63) ? 1 : 0);
        break forest_join_931;
    }
    if (!(spill278_63)) {
        break forest_join_930;
    }
    this.f = ((boolean)(true));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_918)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)).a__fE())), ((int)(2)));
    life14_939 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life13_918)));
    spill278_64 = ((life14_939 instanceof moom.Cq) ? 1 : 0);
    if (!((life6_39 != null))) {
        forestValue278_931_0 = spill278_64;
        break forest_join_931;
    }
    if (!((spill278_64 != 0))) {
        break forest_join_930;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(((moom.Cq)(((moom.Cq)(life14_939)))).a__sourceReturn_30e49adebc())).a(((java.lang.String)("Silverfish")));
    }
    forestValue278_931_0 = 1;
    }
    return ((forestValue278_931_0) != 0);
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Mob")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.f) ? 1 : 0)))));
    return;
}


public static moom.HM a(java.util.List<moom.G4> p0, java.util.Random p1, int p2, int p3, int p4, moom.bs p5, int p6) {
moom.HM forwardValue2076_48_0;
    long life7_3;
    moom.G2 life9_31;
    forward_join_48: {
    forward_join_47: {
    life7_3 = (moom.HM.g ^ 17230546276890L);
    life9_31 = moom.G2.a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_611aada7f76c_invokedynamic2076_1(23702, (7329865075474472194L ^ life7_3)))), ((int)(-1)), ((int)(0)), ((int)(__sourceIntrinsic_611aada7f76c_invokedynamic2076_2(17557, (6901151202988066076L ^ life7_3)))), ((int)(__sourceIntrinsic_611aada7f76c_invokedynamic2076_3(182, (891297800560165181L ^ life7_3)))), ((int)(__sourceIntrinsic_611aada7f76c_invokedynamic2076_4(8850, (7341578058217054993L ^ life7_3)))), ((moom.bs)(p5)));
    if (!(moom.HM.a(((moom.G2)(life9_31))))) {
        break forward_join_47;
    }
    if (!((moom.G4.a(((java.util.List)(p0)), ((moom.G2)(life9_31))) == null))) {
        break forward_join_47;
    }
    forwardValue2076_48_0 = new moom.HM(p6, p1, life9_31, p5);
    break forward_join_48;
    }
    forwardValue2076_48_0 = null;
    }
    return forwardValue2076_48_0;
}


public void a(moom.G4 p0, java.util.List<moom.G4> p1, java.util.Random p2) {
moom.G4 forwardValue2077_11_0;
    moom.G4 spill2077_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_14: {
    forward_join_11: {
    life4_3 = (moom.HM.g ^ 45534962077003L);
    life6_5 = moom.G4.b();
    spill2077_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue2077_11_0 = spill2077_0;
        break forward_join_11;
    }
    if (!((spill2077_0 != null))) {
        break forward_join_14;
    }
    forwardValue2077_11_0 = p0;
    }
    ((moom.HQ)(((moom.HQ)(forwardValue2077_11_0)))).h = ((moom.HM)(this));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_611aada7f76c_invokedynamic2076_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_611aada7f76c_invokedynamic2076_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_611aada7f76c_invokedynamic2076_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_611aada7f76c_invokedynamic2076_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_191(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_200(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_218(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_237(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_248(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic278_255(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4755_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
