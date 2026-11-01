package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cM extends net.minecraft.block.Block {

public static final moom.fy Q;

private static final long R;

private static final long[] S;

private static final java.lang.Integer[] T;

private static final java.util.Map U;

protected cM() {
super(moom.fn.A);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cM.Q, java.lang.Integer.valueOf(0)));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(-1874340839193574170L)), ((long)(-9094887764036248143L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240281731129799L)))));
    long local11_life6 = (moom.cM.R ^ 140102728448383L);
    U = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill786_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill786_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill786_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill786_14 = new byte[8];
    (__sourceSpill786_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill786_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation786_16 = __sourceSpill786_14;
    ((javax.crypto.Cipher)(__sourceSpill786_11)).init(((int)(__sourceSpill786_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill786_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation786_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\006´næÏéLÛ¨Ìïaûi"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill786_25 = local4_life21;
        int __sourceSpill786_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill786_25)).substring(((int)(__sourceSpill786_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill786_30 = local6_life19;
        int __sourceSpill786_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill786_33 = new byte[8];
        (__sourceSpill786_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill786_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill786_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill786_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill786_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill786_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill786_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill786_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill786_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill786_34)).doFinal(((byte[])(__sourceSpill786_33)));
        (__sourceSpill786_30)[__sourceSpill786_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    S = ((long[])(local6_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[2]));
    Q = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite786_39(14726, (5049160774516487970L ^ local11_life6)))))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7091_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cM)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cM.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cM.Q))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cM.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x17F7;
        if (T[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = S[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])U.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    U.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/cM", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            cM.T[n2] = n4;
        }
        return T[n2];
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3075_17_0;
    int forwardValue3075_21_0;
    int forwardValue3075_23_0;
    boolean spill3075_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (moom.cM.R ^ 128767274193603L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3075_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3075_17_0 = ((spill3075_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill3075_0)) {
        break forward_join_22;
    }
    forwardValue3075_17_0 = ((((moom.cM)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue3075_21_0 = forwardValue3075_17_0;
        break forward_join_21;
    }
    if (!((forwardValue3075_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue3075_21_0 = 1;
    }
    forwardValue3075_23_0 = forwardValue3075_21_0;
    break forward_join_23;
    }
    forwardValue3075_23_0 = 0;
    }
    return ((forwardValue3075_23_0) != 0);
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1075_16_0;
    int lexicalValue1075_40_0;
    int lexicalValue1075_87_0;
    int[] spill1075_0;
    boolean spill1075_1;
    int spill1075_2;
    int spill1075_3;
    long life5_3;
    moom.DT life8_7;
    int[] life7_8;
    int life9_19;
    int life10_52;
    net.minecraft.block.state.IBlockState life11_76;
    lexical_join_88: {
    lexical_join_87: {
    lexical_join_76: {
    lexical_join_40: {
    lexical_join_30: {
    lexical_join_16: {
    life5_3 = (moom.cM.R ^ 94563528141110L);
    spill1075_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_7 = ((moom.DT)(p1)).a__DT();
    life7_8 = spill1075_0;
    spill1075_1 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life8_7)));
    if (!((life7_8 != null))) {
        lexicalValue1075_16_0 = ((spill1075_1) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill1075_1)) {
        break lexical_join_88;
    }
    lexicalValue1075_16_0 = 1;
    }
    life9_19 = lexicalValue1075_16_0;
    lexical_cycle_17: while (true) {
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b(((int)(life9_19)))))))).a__ch() == this))) {
        break lexical_join_30;
    }
    life9_19 += 1;
    if (!((life7_8 != null))) {
        break lexical_join_88;
    }
    if (!((life7_8 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    spill1075_2 = life9_19;
    if (!((life7_8 != null))) {
        lexicalValue1075_40_0 = spill1075_2;
        break lexical_join_40;
    }
    if (!((spill1075_2 < 3))) {
        break lexical_join_88;
    }
    lexicalValue1075_40_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cM.Q))))))).intValue();
    }
    life10_52 = lexicalValue1075_40_0;
    spill1075_3 = life10_52;
    if (!((life7_8 != null))) {
        lexicalValue1075_87_0 = spill1075_3;
        break lexical_join_87;
    }
    if (!((spill1075_3 == __sourceIntrinsic_b4b54c999db9_invokedynamic1075_12(15656, (7164154484747510724L ^ life5_3))))) {
        break lexical_join_76;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life8_7)), ((net.minecraft.block.state.IBlockState)(((moom.cM)(this)).a__fE())));
    life11_76 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cM.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life11_76)), ((int)(4)));
    ((moom.cM)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life8_7)), ((net.minecraft.block.state.IBlockState)(life11_76)), ((net.minecraft.block.Block)(this)));
    if (!((life7_8 == null))) {
        break lexical_join_88;
    }
    }
    lexicalValue1075_87_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cM.Q)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life10_52 + 1))))))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1075_87_0);
    }
    return;
}


public boolean c(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1076_30_0;
    net.minecraft.block.Block lexicalValue1076_38_0;
    net.minecraft.block.Block lexicalValue1076_45_0;
    int lexicalValue1076_50_0;
    int[] spill1076_0;
    net.minecraft.block.Block spill1076_1;
    boolean spill1076_2;
    net.minecraft.block.Block spill1076_3;
    long life3_3;
    java.util.Iterator life6_7;
    int[] life5_8;
    moom.bs life7_15;
    net.minecraft.block.Block life6_44;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_45: {
    lexical_join_38: {
    lexical_join_33: {
    life3_3 = (moom.cM.R ^ 45362518051457L);
    spill1076_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_7 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    life5_8 = spill1076_0;
    lexical_cycle_9: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life6_7)).hasNext())) {
        break lexical_join_33;
    }
    life7_15 = ((moom.bs)(((java.util.Iterator)(life6_7)).next()));
    spill1076_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life7_15)))))))).a__ch();
    if (!((life5_8 != null))) {
        lexicalValue1076_38_0 = spill1076_1;
        break lexical_join_38;
    }
    spill1076_2 = ((moom.fn)(((net.minecraft.block.Block)(spill1076_1)).a__fn())).b__Boolean();
    if (!((life5_8 != null))) {
        lexicalValue1076_30_0 = ((spill1076_2) ? 1 : 0);
        break lexical_join_30;
    }
    if (!(spill1076_2)) {
        break lexical_join_31;
    }
    lexicalValue1076_30_0 = 0;
    }
    return ((lexicalValue1076_30_0) != 0);
    }
    if (!((life5_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    lexicalValue1076_38_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch();
    }
    life6_44 = lexicalValue1076_38_0;
    spill1076_3 = life6_44;
    if (!((life5_8 != null))) {
        lexicalValue1076_45_0 = spill1076_3;
        break lexical_join_45;
    }
    if (!((spill1076_3 != net.minecraft.init.Blocks.aK))) {
        break lexical_join_47;
    }
    lexicalValue1076_45_0 = life6_44;
    }
    if (!((lexicalValue1076_45_0 == net.minecraft.init.Blocks.m))) {
        break lexical_join_49;
    }
    }
    lexicalValue1076_50_0 = 1;
    break lexical_join_50;
    }
    lexicalValue1076_50_0 = 0;
    }
    return ((lexicalValue1076_50_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
float local3 = 0x1.0p-4f;
    return new moom.CA(((double) (((float) ((moom.DT)(p1)).a()) + local3)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + local3)), ((double) (((float) (((moom.DT)(p1)).a() + 1)) - local3)), ((double) (((moom.DT)(p1)).b() + 1)), ((double) (((float) (((moom.DT)(p1)).c() + 1)) - local3)));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
float local4 = 0x1.0p-4f;
    return new moom.CA(((double) (((float) ((moom.DT)(p1)).a()) + local4)), ((double) ((moom.DT)(p1)).b()), ((double) (((float) ((moom.DT)(p1)).c()) + local4)), ((double) (((float) (((moom.DT)(p1)).a() + 1)) - local4)), ((double) (((float) (((moom.DT)(p1)).b() + 1)) - local4)), ((double) (((float) (((moom.DT)(p1)).c() + 1)) - local4)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
((net.minecraft.entity.Entity)(p3)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.h)), ((float)(0x1.0p0f)));
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3073_17_0;
    boolean spill3073_0;
    long life5_3;
    int[] life7_5;
    forward_join_18: {
    forward_join_17: {
    life5_3 = (moom.cM.R ^ 74171692488119L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3073_0 = ((moom.cM)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life7_5 != null))) {
        forwardValue3073_17_0 = ((spill3073_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill3073_0))) {
        break forward_join_18;
    }
    forwardValue3073_17_0 = ((((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((boolean)(true)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3073_17_0);
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cM.Q});
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite786_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7091_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1075_12(int a0, long a1) throws E;
}
