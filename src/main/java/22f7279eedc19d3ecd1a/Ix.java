package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ix extends moom.Ir {

private final java.util.Set<moom.Ee> e;

private boolean f;

private static final long g;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public Ix() {
super();
    this.e = com.google.common.collect.Sets.newHashSet();
}


public Ix(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) {
super(p2, p3);
    this.e = com.google.common.collect.Sets.newHashSet();
    (this).b(p0, p1, p2, p3);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-2140027567218926273L)), ((long)(-3586137706768565996L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15479006577910L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ix.g ^ 98067643596702L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill866_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill866_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill866_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill866_14 = new byte[8];
    (__sourceSpill866_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill866_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation866_16 = __sourceSpill866_14;
    ((javax.crypto.Cipher)(__sourceSpill866_11)).init(((int)(__sourceSpill866_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill866_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation866_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "a@2^$°Ï¥?àCPL ÂyurÓiÔnVè'Ñ\002¸ÜpæÌ\031ò6\002\035Ã"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill866_25 = local6_life21;
        int __sourceSpill866_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill866_25)).substring(((int)(__sourceSpill866_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill866_30 = local8_life19;
        int __sourceSpill866_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill866_33 = new byte[8];
        (__sourceSpill866_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill866_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill866_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill866_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill866_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill866_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill866_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill866_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill866_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill866_34)).doFinal(((byte[])(__sourceSpill866_33)));
        (__sourceSpill866_30)[__sourceSpill866_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "²éè\001+ÐGÍ\021ÿÖÄ_É"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill866_38 = local6_life21;
        int __sourceSpill866_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill866_38)).substring(((int)(__sourceSpill866_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill866_43 = local8_life19;
        int __sourceSpill866_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill866_46 = new byte[8];
        (__sourceSpill866_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill866_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill866_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill866_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill866_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill866_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill866_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill866_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill866_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill866_47)).doFinal(((byte[])(__sourceSpill866_46)));
        (__sourceSpill866_43)[__sourceSpill866_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue803_27_0;
    java.lang.String lexicalValue803_27_1;
    int lexicalValue803_27_2;
    net.minecraft.entity.Entity[] spill803_0;
    net.minecraft.nbt.NBTTagCompound spill803_1;
    java.lang.String spill803_2;
    int spill803_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.nbt.NBTTagList life5_34;
    int life6_36;
    net.minecraft.nbt.NBTTagCompound life7_44;
    lexical_join_55: {
    lexical_join_27: {
    life2_3 = (moom.Ix.g ^ 44775238311443L);
    spill803_0 = moom.G4.b();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill803_0;
    spill803_1 = p0;
    spill803_2 = "Processed";
    spill803_3 = __sourceIntrinsic_ac4a479fad6b_invokedynamic803_3(31460, (3135672610191928351L ^ life2_3));
    if (!((life4_8 != null))) {
        lexicalValue803_27_0 = spill803_1;
        lexicalValue803_27_1 = spill803_2;
        lexicalValue803_27_2 = spill803_3;
        break lexical_join_27;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill803_1)).a__Boolean(((java.lang.String)(spill803_2)), ((int)(spill803_3))))) {
        break lexical_join_55;
    }
    lexicalValue803_27_0 = p0;
    lexicalValue803_27_1 = "Processed";
    lexicalValue803_27_2 = __sourceIntrinsic_ac4a479fad6b_invokedynamic803_5(2474, (3004590068548181847L ^ life2_3));
    }
    life5_34 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue803_27_0)).a(((java.lang.String)(lexicalValue803_27_1)), ((int)(lexicalValue803_27_2)));
    life6_36 = 0;
    lexical_cycle_31: while (true) {
    if (!((life6_36 < ((net.minecraft.nbt.NBTTagList)(life5_34)).a__Int()))) {
        break lexical_join_55;
    }
    life7_44 = ((net.minecraft.nbt.NBTTagList)(life5_34)).a__yw(((int)(life6_36)));
    ((java.util.Set)(this.e)).add(((java.lang.Object)(new moom.Ee(((net.minecraft.nbt.NBTTagCompound)(life7_44)).a__Int(((java.lang.String)("X"))), ((net.minecraft.nbt.NBTTagCompound)(life7_44)).a__Int(((java.lang.String)("Z")))))));
    life6_36 += 1;
    if (!((life4_8 == null))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    return;
}


private void b(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) {
long local5 = (moom.Ix.g ^ 118262124198858L);
    ((java.util.Random)(p1)).setSeed(((long)(((net.minecraft.world.World)(p0)).a__Long())));
    long local7 = ((java.util.Random)(p1)).nextLong();
    long local9 = ((java.util.Random)(p1)).nextLong();
    long local11 = (((long) p2) * local7);
    long local13 = (((long) p3) * local9);
    ((java.util.Random)(p1)).setSeed(((long)(((local11 ^ local13) ^ ((net.minecraft.world.World)(p0)).a__Long()))));
    int local15 = (((p2 * __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_7(7495, (4306656421149683297L ^ local5))) + __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_8(22555, (7487665262751705916L ^ local5))) - __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_9(19005, (3367861566722865432L ^ local5)));
    int local16 = (((p3 * __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_10(3580, (6529950435368681183L ^ local5))) + __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_11(30785, (7687323489242827617L ^ local5))) - __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_12(1854, (1752681172319777823L ^ local5)));
    moom.bs local17 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)));
    ((java.util.LinkedList)(this.a)).add(((java.lang.Object)(new moom.Hz(p1, local15, local16, local17))));
    ((moom.Ix)(this)).a__Void();
    this.f = ((boolean)(true));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_0098e2109b9e62(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4971_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ix"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x2E75;
        if (k[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Ix.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Ix.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ix", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ix.k[n2] = n3;
        }
        return k[n2];
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
moom.Ix forwardValue2221_23_0;
    moom.Ix spill2221_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_23: {
    forward_join_22: {
    life4_3 = (moom.Ix.g ^ 94827428374913L);
    life6_5 = moom.G4.b();
    spill2221_0 = this;
    if (!((life6_5 != null))) {
        forwardValue2221_23_0 = spill2221_0;
        break forward_join_23;
    }
    if (!((!((moom.Ix)(spill2221_0)).f))) {
        break forward_join_22;
    }
    ((java.util.LinkedList)(this.a)).clear();
    ((moom.Ix)(this)).b(((net.minecraft.world.World)(p0)), ((java.util.Random)(p1)), ((int)(((moom.Ix)(this)).a())), ((int)(((moom.Ix)(this)).b())));
    }
    forwardValue2221_23_0 = this;
    }
    __sourceIntrinsic_e92bb1c78a77_call2221_8(forwardValue2221_23_0, p0, p1, p2);
    return;
}


public boolean a__Boolean(moom.Ee p0) {
int forwardValue2222_16_0;
    int forwardValue2222_20_0;
    int forwardValue2222_22_0;
    boolean spill2222_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.Ix.g ^ 84052844537534L);
    life4_5 = moom.G4.b();
    spill2222_0 = ((java.util.Set)(this.e)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != null))) {
        forwardValue2222_16_0 = ((spill2222_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill2222_0))) {
        break forward_join_21;
    }
    forwardValue2222_16_0 = ((super.a__Boolean(((moom.Ee)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue2222_20_0 = forwardValue2222_16_0;
        break forward_join_20;
    }
    if (!((forwardValue2222_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue2222_20_0 = 1;
    }
    forwardValue2222_22_0 = forwardValue2222_20_0;
    break forward_join_22;
    }
    forwardValue2222_22_0 = 0;
    }
    return ((forwardValue2222_22_0) != 0);
}


public void a(moom.Ee p0) {
super.a(((moom.Ee)(p0)));
    ((java.util.Set)(this.e)).add(((java.lang.Object)(p0)));
    return;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.Entity[] spill802_0;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_11;
    net.minecraft.entity.Entity[] life4_12;
    java.util.Iterator life6_16;
    moom.Ee life7_23;
    net.minecraft.nbt.NBTTagCompound life8_27;
    lexical_join_49: {
    lexical_join_45: {
    life2_3 = (moom.Ix.g ^ 37805556842738L);
    super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    spill802_0 = moom.G4.b();
    life5_11 = new net.minecraft.nbt.NBTTagList();
    life4_12 = spill802_0;
    life6_16 = ((java.util.Set)(this.e)).iterator();
    lexical_cycle_17: while (true) {
    if (!(((java.util.Iterator)(life6_16)).hasNext())) {
        break lexical_join_45;
    }
    life7_23 = ((moom.Ee)(((java.util.Iterator)(life6_16)).next()));
    life8_27 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life8_27)).a__Void(((java.lang.String)("X")), ((int)(((moom.Ee)(life7_23)).a)));
    ((net.minecraft.nbt.NBTTagCompound)(life8_27)).a__Void(((java.lang.String)("Z")), ((int)(((moom.Ee)(life7_23)).b)));
    ((net.minecraft.nbt.NBTTagList)(life5_11)).a(((net.minecraft.nbt.NBTBase)(life8_27)));
    if (!((life4_12 != null))) {
        break lexical_join_49;
    }
    if (!((life4_12 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Processed")), ((net.minecraft.nbt.NBTBase)(life5_11)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic803_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic803_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c6e15db7a4e9_originalDynamicSite1172_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4971_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e92bb1c78a77_call2221_8(moom.Ix a0, net.minecraft.world.World a1, java.util.Random a2, moom.G2 a3) throws E;

private static native int __sourceExactCall_0098e2109b9e62(int p0, long p1);
}
