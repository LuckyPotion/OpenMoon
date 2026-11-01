package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class sS extends moom.sK implements net.minecraft.entity.IEntityOwnable {

protected moom.uP cd;

private static long kb;

private static long[] Ab;

private static java.lang.Integer[] Bb;

private static java.util.Map Cb;

public sS(net.minecraft.world.World p0) {
super(p0);
    this.cd = new moom.uP(this);
    __sourceExactCall_b57e594af5c5d1((this));
}


static {
kb = ((long)(((moom._a)(moom._c.a(((long)(-4780439221592229424L)), ((long)(-3613556751138682847L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(2986281168819L)))));
    Cb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sS.kb ^ 82832347972608L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1523_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1523_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1523_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1523_14 = new byte[8];
    (__sourceSpill1523_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1523_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1523_16 = __sourceSpill1523_14;
    ((javax.crypto.Cipher)(__sourceSpill1523_11)).init(((int)(__sourceSpill1523_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1523_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1523_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "·«\034º\021\007Ý5;'·À\002í¥ê%n­àëY¶ÃG\026æ+w,UÉ¹Ó\026F\">àKÛáF¹£òao¢Gm>Îsá[º\026"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1523_25 = local6_life21;
        int __sourceSpill1523_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1523_25)).substring(((int)(__sourceSpill1523_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1523_30 = local8_life19;
        int __sourceSpill1523_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1523_33 = new byte[8];
        (__sourceSpill1523_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1523_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1523_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1523_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1523_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1523_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1523_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1523_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1523_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1523_34)).doFinal(((byte[])(__sourceSpill1523_33)));
        (__sourceSpill1523_30)[__sourceSpill1523_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "D°4\1779è´^ë\017¾\013U"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1523_38 = local6_life21;
        int __sourceSpill1523_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1523_38)).substring(((int)(__sourceSpill1523_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1523_43 = local8_life19;
        int __sourceSpill1523_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1523_46 = new byte[8];
        (__sourceSpill1523_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1523_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1523_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1523_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1523_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1523_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1523_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1523_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1523_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1523_47)).doFinal(((byte[])(__sourceSpill1523_46)));
        (__sourceSpill1523_43)[__sourceSpill1523_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Ab = ((long[])(local8_life19));
    Bb = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> net.minecraft.entity.EntityLivingBase __sourceHandlerCall_7a5e85f14590e24559a5(moom.sS a0) throws E;
private static final class __SourceHandler_7a5e85f14590e24559a5 {

public static net.minecraft.entity.EntityLivingBase f502(moom.sS receiver) throws Throwable {
    long life1_3;
    java.util.UUID life3_7;
    life1_3 = (__fieldRead502_0() ^ 102407324179673L);
    life3_7 = __call502_2(__call502_1(receiver));
    return ((life3_7 == null) ? null : __call502_4(__fieldRead502_3(receiver), life3_7));
}
public static net.minecraft.entity.EntityLivingBase h502_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2050200_0(p0);
}
public static net.minecraft.entity.EntityLivingBase h502_1(java.lang.IllegalArgumentException p0) throws Throwable {
    java.lang.IllegalArgumentException local1 = p0;
    return null;
}
private static native long __fieldRead502_0() throws Throwable;
private static native java.lang.String __call502_1(moom.sS a0) throws Throwable;
private static native java.util.UUID __call502_2(java.lang.String a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead502_3(moom.sS a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __call502_4(net.minecraft.world.World a0, java.util.UUID a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call2050200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


protected void Z__sourceReturn_da8c82d5d4() {
return;
}


public java.lang.String b__sourceReturn_0e30dfc966() {
long local1 = (moom.sS.kb ^ 112821654234912L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__String(((int)(__sourceIntrinsic_d5893d8e80ad_originalDynamicSite1636_2(28576, (8467181484367207848L ^ local1)))));
}


public void b(java.lang.String p0) {
long local2 = (moom.sS.kb ^ 118085604125014L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite1637_2(15347, (2177746484965738377L ^ local2)))), ((java.lang.Object)(p0)));
    return;
}


public net.minecraft.entity.Entity b__r3() {
return ((moom.sS)(this)).e__sourceReturn_d30556f370();
}


public boolean b__sourceReturn_55fa5355bc(net.minecraft.entity.EntityLivingBase p0) {
long local2 = (moom.sS.kb ^ 29792619230476L);
    return ((((p0 == ((moom.sS)(this)).e__sourceReturn_d30556f370()) ? 1 : 0)) != 0);
}


public net.minecraft.entity.EntityLivingBase e__sourceReturn_d30556f370() { return __sourceHandlerCall_7a5e85f14590e24559a5(this); }


public boolean ae() {
int forwardValue3979_20_0;
    int forwardValue3979_22_0;
    int spill3979_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.sS.kb ^ 50778409305842L);
    life3_5 = moom.vR.c();
    spill3979_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a627c59d8423_invokedynamic3979_3(4312, (821149718485304071L ^ life1_3))))) & 4);
    if (!((life3_5 == 0))) {
        forwardValue3979_20_0 = spill3979_0;
        break forward_join_20;
    }
    if (!((spill3979_0 != 0))) {
        break forward_join_21;
    }
    forwardValue3979_20_0 = 1;
    }
    forwardValue3979_22_0 = forwardValue3979_20_0;
    break forward_join_22;
    }
    forwardValue3979_22_0 = 0;
    }
    return ((forwardValue3979_22_0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue3981_30_0;
    java.lang.String forwardValue3981_30_1;
    int spill3981_0;
    net.minecraft.nbt.NBTTagCompound spill3981_1;
    java.lang.String spill3981_2;
    long life2_3;
    java.lang.String life5_9;
    int life4_10;
    java.lang.String life5_28;
    java.lang.String life6_37;
    forward_join_44: {
    forward_join_35: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (moom.sS.kb ^ 67465500007833L);
    spill3981_0 = moom.vR.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_9 = "";
    life4_10 = spill3981_0;
    spill3981_1 = p0;
    spill3981_2 = "OwnerUUID";
    if (!((life4_10 != 0))) {
        forwardValue3981_30_0 = spill3981_1;
        forwardValue3981_30_1 = spill3981_2;
        break forward_join_30;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill3981_1)).a__Boolean(((java.lang.String)(spill3981_2)), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic3981_3(18228, (9037788158354476930L ^ life2_3))))))) {
        break forward_join_28;
    }
    life5_28 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("OwnerUUID")));
    if (!((life4_10 == 0))) {
        break forward_join_35;
    }
    }
    forwardValue3981_30_0 = p0;
    forwardValue3981_30_1 = "Owner";
    }
    life6_37 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue3981_30_0)).a__String(((java.lang.String)(forwardValue3981_30_1)));
    life5_28 = moom.By.a(((java.lang.String)(life6_37)));
    }
    if (!((((java.lang.String)(life5_28)).length() > 0))) {
        break forward_join_44;
    }
    ((moom.sS)(this)).b(((java.lang.String)(life5_28)));
    ((moom.sS)(this)).o(((boolean)(true)));
    }
    ((moom.uP)(this.cd)).a(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Sitting"))))));
    ((moom.sS)(this)).p(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Sitting"))))));
    return;
}


protected void n(boolean p0) {
int lexicalValue1301_15_0;
    int spill1301_0;
    boolean spill1301_1;
    long life2_3;
    net.minecraft.util.EnumParticleTypes life5_6;
    int life4_7;
    int life6_18;
    double life7_31;
    double life9_37;
    double life11_43;
    lexical_join_97: {
    lexical_join_15: {
    lexical_join_14: {
    life2_3 = (moom.sS.kb ^ 90373593969795L);
    spill1301_0 = moom.vR.c();
    life5_6 = net.minecraft.util.EnumParticleTypes.HEART;
    life4_7 = spill1301_0;
    spill1301_1 = p0;
    if (!((life4_7 == 0))) {
        lexicalValue1301_15_0 = ((spill1301_1) ? 1 : 0);
        break lexical_join_15;
    }
    if (!((!spill1301_1))) {
        break lexical_join_14;
    }
    life5_6 = net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL;
    }
    lexicalValue1301_15_0 = 0;
    }
    life6_18 = lexicalValue1301_15_0;
    lexical_cycle_16: while (true) {
    if (!((life6_18 < __sourceIntrinsic_1b79f0ed2644_invokedynamic1301_5(12756, (2341643772782710910L ^ life2_3))))) {
        break lexical_join_97;
    }
    life7_31 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life9_37 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    life11_43 = (((java.util.Random)(this.ah)).nextGaussian() * 0x1.47ae147ae147bp-6d);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(life5_6)), ((double)(((this.n + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(((this.o + 0x1.0p-1d) + ((double) (((java.util.Random)(this.ah)).nextFloat() * this.H))))), ((double)(((this.p + ((double) ((((java.util.Random)(this.ah)).nextFloat() * this.G) * 0x1.0p1f))) - ((double) this.G)))), ((double)(life7_31)), ((double)(life9_37)), ((double)(life11_43)), ((int[])(new int[0])));
    life6_18 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral9030_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sS.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int f(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7628;
        if (Bb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Cb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Cb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sS.Bb[n2] = n3;
        }
        return Bb[n2];
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    int life4_8;
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (moom.sS.kb ^ 244666762898L);
    int spill4597_0 = moom.vR.c();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill4597_0;
    if (!((life4_8 == 0))) { break forward_join_18; }
    if (!((((moom.sS)(this)).b__sourceReturn_0e30dfc966() == null))) { break forward_join_20; }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("OwnerUUID")), ((java.lang.String)("")));
    }
    if (!((life4_8 != 0))) { break forward_join_25; }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("OwnerUUID")), ((java.lang.String)(((moom.sS)(this)).b__sourceReturn_0e30dfc966())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Sitting")), ((boolean)(((moom.sS)(this)).af())));
    return;
}


protected void d__Void() {
long local1 = (moom.sS.kb ^ 80641963876810L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1638_3(15649, (3368616674282719681L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1638_7(28576, (8467144952935816002L ^ local1)))), ((java.lang.Object)("")));
    return;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
moom.sS forwardValue3977_38_0;
    moom.sS spill3977_0;
    moom.sS spill3977_1;
    moom.sS spill3977_2;
    moom.sS spill3977_3;
    long life2_3;
    int life4_5;
    forward_join_38: {
    forward_join_37: {
    life2_3 = (moom.sS.kb ^ 28591802612962L);
    life4_5 = moom.vR.c();
    spill3977_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue3977_38_0 = spill3977_0;
        break forward_join_38;
    }
    if (!((!((net.minecraft.world.World)(((moom.sS)(spill3977_0)).i)).G))) {
        break forward_join_37;
    }
    spill3977_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue3977_38_0 = spill3977_1;
        break forward_join_38;
    }
    if (!(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((moom.sS)(spill3977_1)).i)).a__Ej())).a__Boolean(((java.lang.String)("showDeathMessages"))))) {
        break forward_join_37;
    }
    spill3977_2 = this;
    if (!((life4_5 == 0))) {
        forwardValue3977_38_0 = spill3977_2;
        break forward_join_38;
    }
    if (!(((moom.sS)(spill3977_2)).e__Boolean())) {
        break forward_join_37;
    }
    spill3977_3 = this;
    if (!((life4_5 == 0))) {
        forwardValue3977_38_0 = spill3977_3;
        break forward_join_38;
    }
    if (!((((((moom.sS)(spill3977_3)).e__sourceReturn_d30556f370() instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    ((net.minecraft.entity.EntityLivingBase)(((moom.sS)(this)).e__sourceReturn_d30556f370())).a(((net.minecraft.util.IChatComponent)(((net.minecraft.util.CombatTracker)(((moom.sS)(this)).a__CS())).a__C5())));
    }
    forwardValue3977_38_0 = this;
    }
    __sourceIntrinsic_1cc68e538389_call3977_14(forwardValue3977_38_0, p0);
    return;
}


public boolean a__sourceReturn_55fa5355bc(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.EntityLivingBase forwardValue3976_22_0;
    net.minecraft.entity.EntityLivingBase forwardValue3976_26_0;
    int forwardValue3976_32_0;
    boolean spill3976_0;
    net.minecraft.entity.EntityLivingBase spill3976_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.EntityLivingBase life5_16;
    forward_join_32: {
    forward_join_29: {
    forward_join_26: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.sS.kb ^ 31937294271864L);
    life4_5 = moom.vR.c();
    spill3976_0 = ((moom.sS)(this)).ae();
    if (!((life4_5 == 0))) {
        forwardValue3976_32_0 = ((spill3976_0) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill3976_0)) {
        break forward_join_29;
    }
    life5_16 = ((moom.sS)(this)).e__sourceReturn_d30556f370();
    spill3976_1 = p0;
    if (!((life4_5 == 0))) {
        forwardValue3976_22_0 = spill3976_1;
        break forward_join_22;
    }
    if (!((spill3976_1 == life5_16))) {
        break forward_join_21;
    }
    return ((1) != 0);
    }
    forwardValue3976_22_0 = life5_16;
    }
    if (!((life4_5 == 0))) {
        forwardValue3976_26_0 = forwardValue3976_22_0;
        break forward_join_26;
    }
    if (!((forwardValue3976_22_0 != null))) {
        break forward_join_29;
    }
    forwardValue3976_26_0 = life5_16;
    }
    return ((net.minecraft.entity.EntityLivingBase)(forwardValue3976_26_0)).a__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    forwardValue3976_32_0 = ((super.a__sourceReturn_55fa5355bc(((net.minecraft.entity.EntityLivingBase)(p0)))) ? 1 : 0);
    }
    return ((forwardValue3976_32_0) != 0);
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public void a(byte p0) {
int forestValue501_26_0;
    int forestValue501_26_1;
    byte spill501_0;
    int spill501_1;
    long life2_3;
    int life4_5;
    forest_join_35: {
    forest_join_32: {
    forest_join_26: {
    forest_join_20: {
    life2_3 = (moom.sS.kb ^ 51743805999560L);
    life4_5 = moom.vR.c();
    spill501_0 = p0;
    spill501_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic501_2(187, (4668265215814343768L ^ life2_3));
    if (!((life4_5 == 0))) {
        forestValue501_26_0 = ((int)(spill501_0));
        forestValue501_26_1 = spill501_1;
        break forest_join_26;
    }
    if (!((spill501_0 == spill501_1))) {
        break forest_join_20;
    }
    ((moom.sS)(this)).n(((boolean)(true)));
    if (!((life4_5 != 0))) {
        break forest_join_35;
    }
    }
    forestValue501_26_0 = ((int)(p0));
    forestValue501_26_1 = __sourceIntrinsic_6121ff5511c4_invokedynamic501_5(26552, (4136773927363803989L ^ life2_3));
    }
    if (!((forestValue501_26_0 == forestValue501_26_1))) {
        break forest_join_32;
    }
    ((moom.sS)(this)).n(((boolean)(false)));
    if (!((life4_5 != 0))) {
        break forest_join_35;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public moom.uP a__uP() {
return this.cd;
}


public boolean a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.EntityLivingBase p1) {
return ((1) != 0);
}


public moom.Bj a__Bj() {
moom.sS forwardValue3978_22_0;
    moom.sS spill3978_0;
    moom.sS spill3978_1;
    long life1_3;
    int life3_5;
    net.minecraft.entity.EntityLivingBase life4_21;
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.sS.kb ^ 13947948255517L);
    life3_5 = moom.vR.b();
    spill3978_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue3978_22_0 = spill3978_0;
        break forward_join_22;
    }
    if (!(((moom.sS)(spill3978_0)).ae())) {
        break forward_join_21;
    }
    spill3978_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue3978_22_0 = spill3978_1;
        break forward_join_22;
    }
    life4_21 = ((moom.sS)(spill3978_1)).e__sourceReturn_d30556f370();
    if (!((life4_21 != null))) {
        break forward_join_21;
    }
    return ((net.minecraft.entity.EntityLivingBase)(life4_21)).a__Bj();
    }
    forwardValue3978_22_0 = this;
    }
    return __sourceIntrinsic_83f983cbe868_call3978_5(forwardValue3978_22_0);
}


public void o(boolean p0) {
long life2_3;
    int life5_13;
    int life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (moom.sS.kb ^ 23857819279317L);
    int spill4599_0 = moom.vR.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_e276b0aa449e_invokedynamic4599_3(15649, (3368666000930109406L ^ life2_3)))));
    life4_14 = spill4599_0;
    if (!((life4_14 != 0))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_e276b0aa449e_invokedynamic4599_6(15649, (3368666000930109406L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 4))))))));
    }
    if (!((life4_14 == 0))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_e276b0aa449e_invokedynamic4599_10(15649, (3368666000930109406L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_e276b0aa449e_invokedynamic4599_11(31197, (8107923102636192556L ^ life2_3))))))))));
    }
    ((moom.sS)(this)).Z__sourceReturn_da8c82d5d4();
    return;
}


public void p(boolean p0) {
long life2_3;
    int life5_13;
    int life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (moom.sS.kb ^ 46132070980475L);
    int spill4600_0 = moom.vR.c();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_335dd01b6fe5_invokedynamic4600_3(15649, (3368652558233777008L ^ life2_3)))));
    life4_14 = spill4600_0;
    if (!((life4_14 == 0))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_335dd01b6fe5_invokedynamic4600_6(15649, (3368652558233777008L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 1))))))));
    }
    if (!((life4_14 != 0))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_335dd01b6fe5_invokedynamic4600_10(15649, (3368652558233777008L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_335dd01b6fe5_invokedynamic4600_11(31515, (396885608762078542L ^ life2_3))))))))));
    }
    return;
}


public boolean af() {
int forwardValue3980_20_0;
    int forwardValue3980_22_0;
    int spill3980_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.sS.kb ^ 13395485586639L);
    life3_5 = moom.vR.c();
    spill3980_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_aee1ff61f102_invokedynamic3980_3(15649, (3368690861094264004L ^ life1_3))))) & 1);
    if (!((life3_5 == 0))) {
        forwardValue3980_20_0 = spill3980_0;
        break forward_join_20;
    }
    if (!((spill3980_0 != 0))) {
        break forward_join_21;
    }
    forwardValue3980_20_0 = 1;
    }
    forwardValue3980_22_0 = forwardValue3980_20_0;
    break forward_join_22;
    }
    forwardValue3980_22_0 = 0;
    }
    return ((forwardValue3980_22_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic501_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic501_5(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_1cc68e538389_call3977_14(moom.sS a0, net.minecraft.util.DamageSource a1) throws E;

private static native <E extends Throwable> moom.Bj __sourceIntrinsic_83f983cbe868_call3978_5(moom.sS a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic3979_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aee1ff61f102_invokedynamic3980_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5893d8e80ad_originalDynamicSite1636_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite1637_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic3981_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1638_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1638_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral9030_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic1301_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e276b0aa449e_invokedynamic4599_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e276b0aa449e_invokedynamic4599_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e276b0aa449e_invokedynamic4599_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e276b0aa449e_invokedynamic4599_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335dd01b6fe5_invokedynamic4600_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335dd01b6fe5_invokedynamic4600_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335dd01b6fe5_invokedynamic4600_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_335dd01b6fe5_invokedynamic4600_11(int a0, long a1) throws E;

private static native void __sourceExactCall_b57e594af5c5d1(moom.sS p0);
}
