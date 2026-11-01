package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xU extends net.minecraft.item.Item {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public xU() {
super();
    (this).b(1);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(6636152220060487922L)), ((long)(-2585299527360042640L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50674109995279L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xU.n ^ 11875374181971L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1105_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1105_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1105_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1105_14 = new byte[8];
    (__sourceSpill1105_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1105_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1105_16 = __sourceSpill1105_14;
    ((javax.crypto.Cipher)(__sourceSpill1105_11)).init(((int)(__sourceSpill1105_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1105_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1105_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Z^\t\030\001ùoG¨#c±Û\037\035f\007×\005ÓÖ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1105_25 = local6_life21;
        int __sourceSpill1105_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1105_25)).substring(((int)(__sourceSpill1105_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1105_30 = local8_life19;
        int __sourceSpill1105_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1105_33 = new byte[8];
        (__sourceSpill1105_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1105_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1105_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1105_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1105_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1105_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1105_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1105_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1105_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1105_34)).doFinal(((byte[])(__sourceSpill1105_33)));
        (__sourceSpill1105_30)[__sourceSpill1105_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9706_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5FB8;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/xU", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            xU.p[n2] = n3;
        }
        return p[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xU.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static boolean b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1409_13_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1409_32_0;
    java.lang.String lexicalValue1409_32_1;
    int lexicalValue1409_32_2;
    java.lang.String lexicalValue1409_51_0;
    int lexicalValue1409_61_0;
    net.minecraft.nbt.NBTTagCompound spill1409_0;
    java.lang.String spill1409_1;
    int spill1409_2;
    java.lang.String spill1409_3;
    int spill1409_4;
    long life1_3;
    int life3_5;
    net.minecraft.nbt.NBTTagList life4_43;
    int life5_45;
    java.lang.String life6_53;
    lexical_join_65: {
    lexical_join_32: {
    lexical_join_25: {
    lexical_join_13: {
    lexical_join_12: {
    life1_3 = (moom.xU.n ^ 130936448095425L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1409_0 = p0;
    if (!((life3_5 == 0))) {
        lexicalValue1409_13_0 = spill1409_0;
        break lexical_join_13;
    }
    if (!((spill1409_0 == null))) {
        break lexical_join_12;
    }
    return ((0) != 0);
    }
    lexicalValue1409_13_0 = p0;
    }
    spill1409_1 = "pages";
    spill1409_2 = __sourceIntrinsic_a723832baa20_invokedynamic1409_4(12062, (6438312678149782047L ^ life1_3));
    if (!((life3_5 == 0))) {
        lexicalValue1409_32_0 = lexicalValue1409_13_0;
        lexicalValue1409_32_1 = spill1409_1;
        lexicalValue1409_32_2 = spill1409_2;
        break lexical_join_32;
    }
    if (!((!((net.minecraft.nbt.NBTTagCompound)(lexicalValue1409_13_0)).a__Boolean(((java.lang.String)(spill1409_1)), ((int)(spill1409_2)))))) {
        break lexical_join_25;
    }
    return ((0) != 0);
    }
    lexicalValue1409_32_0 = p0;
    lexicalValue1409_32_1 = "pages";
    lexicalValue1409_32_2 = __sourceIntrinsic_a723832baa20_invokedynamic1409_7(6525, (4535660296887356542L ^ life1_3));
    }
    life4_43 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1409_32_0)).a(((java.lang.String)(lexicalValue1409_32_1)), ((int)(lexicalValue1409_32_2)));
    life5_45 = 0;
    lexical_cycle_36: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_51: {
    lexical_join_50: {
    if (!((life5_45 < ((net.minecraft.nbt.NBTTagList)(life4_43)).a__Int()))) {
        break lexical_join_65;
    }
    life6_53 = ((net.minecraft.nbt.NBTTagList)(life4_43)).a__String(((int)(life5_45)));
    spill1409_3 = life6_53;
    if (!((life3_5 == 0))) {
        lexicalValue1409_51_0 = spill1409_3;
        break lexical_join_51;
    }
    if (!((spill1409_3 == null))) {
        break lexical_join_50;
    }
    return ((0) != 0);
    }
    lexicalValue1409_51_0 = life6_53;
    }
    spill1409_4 = ((java.lang.String)(lexicalValue1409_51_0)).length();
    if (!((life3_5 == 0))) {
        lexicalValue1409_61_0 = spill1409_4;
        break lexical_join_61;
    }
    if (!((spill1409_4 > __sourceIntrinsic_a723832baa20_invokedynamic1409_13(16742, (3062143204071216228L ^ life1_3))))) {
        break lexical_join_62;
    }
    lexicalValue1409_61_0 = 0;
    }
    return ((lexicalValue1409_61_0) != 0);
    }
    life5_45 += 1;
    if (!((life3_5 != 0))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    return ((1) != 0);
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.item.ItemStack)(p0)));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    return p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9706_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a723832baa20_invokedynamic1409_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a723832baa20_invokedynamic1409_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a723832baa20_invokedynamic1409_13(int a0, long a1) throws E;
}
