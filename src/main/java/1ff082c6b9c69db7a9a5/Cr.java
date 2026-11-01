package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Cr extends net.minecraft.tileentity.TileEntity {

public byte l;

public boolean m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public Cr() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-5044604586502393839L)), ((long)(4226820874127874865L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104248835391605L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Cr.n ^ 97570392425791L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill508_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill508_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill508_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill508_14 = new byte[8];
    (__sourceSpill508_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill508_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation508_16 = __sourceSpill508_14;
    ((javax.crypto.Cipher)(__sourceSpill508_11)).init(((int)(__sourceSpill508_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill508_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation508_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ò;t«9\037à¯Gobài"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill508_25 = local6_life21;
        int __sourceSpill508_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill508_25)).substring(((int)(__sourceSpill508_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill508_30 = local8_life19;
        int __sourceSpill508_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill508_33 = new byte[8];
        (__sourceSpill508_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill508_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill508_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill508_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill508_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill508_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill508_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill508_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill508_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill508_34)).doFinal(((byte[])(__sourceSpill508_33)));
        (__sourceSpill508_30)[__sourceSpill508_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b() {
long local1 = (moom.Cr.n ^ 43469410901179L);
    this.l = ((byte)(((byte) ((this.l + 1) % __sourceIntrinsic_938da207dded_originalDynamicSite1097_2(18768, (5731833480614584296L ^ local1))))));
    ((moom.Cr)(this)).a__Void();
    return;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("note")), ((byte)(this.l)));
    return;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5066;
        if (p[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n4];
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
                throw new RuntimeException("moom/Cr", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Cr.p[n4] = n6;
        }
        return p[n4];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Cr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, moom.DT p1) {
moom.fn forwardValue1674_22_0;
    moom.fn forwardValue1674_34_0;
    moom.fn forwardValue1674_34_1;
    moom.fn forwardValue1674_41_0;
    moom.fn forwardValue1674_41_1;
    moom.fn forwardValue1674_48_0;
    moom.fn forwardValue1674_48_1;
    moom.fn spill1674_0;
    moom.fn spill1674_1;
    moom.fn spill1674_2;
    long life3_3;
    java.lang.String[] life5_5;
    moom.fn life6_28;
    int life7_30;
    forward_join_58: {
    forward_join_51: {
    forward_join_48: {
    forward_join_46: {
    forward_join_41: {
    forward_join_39: {
    forward_join_34: {
    forward_join_32: {
    forward_join_22: {
    life3_3 = (moom.Cr.n ^ 29037884309754L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1674_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())).a__fn();
    if (!((life5_5 != null))) {
        forwardValue1674_22_0 = spill1674_0;
        break forward_join_22;
    }
    if (!((spill1674_0 == moom.fn.a))) {
        break forward_join_58;
    }
    forwardValue1674_22_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch())).a__fn();
    }
    life6_28 = forwardValue1674_22_0;
    life7_30 = 0;
    spill1674_1 = life6_28;
    spill1674_2 = moom.fn.e;
    if (!((life5_5 != null))) {
        forwardValue1674_34_0 = spill1674_1;
        forwardValue1674_34_1 = spill1674_2;
        break forward_join_34;
    }
    if (!((spill1674_1 == spill1674_2))) {
        break forward_join_32;
    }
    life7_30 = 1;
    }
    forwardValue1674_34_0 = life6_28;
    forwardValue1674_34_1 = moom.fn.p;
    }
    if (!((life5_5 != null))) {
        forwardValue1674_41_0 = forwardValue1674_34_0;
        forwardValue1674_41_1 = forwardValue1674_34_1;
        break forward_join_41;
    }
    if (!((forwardValue1674_34_0 == forwardValue1674_34_1))) {
        break forward_join_39;
    }
    life7_30 = 2;
    }
    forwardValue1674_41_0 = life6_28;
    forwardValue1674_41_1 = moom.fn.s;
    }
    if (!((life5_5 != null))) {
        forwardValue1674_48_0 = forwardValue1674_41_0;
        forwardValue1674_48_1 = forwardValue1674_41_1;
        break forward_join_48;
    }
    if (!((forwardValue1674_41_0 == forwardValue1674_41_1))) {
        break forward_join_46;
    }
    life7_30 = 3;
    }
    forwardValue1674_48_0 = life6_28;
    forwardValue1674_48_1 = moom.fn.d;
    }
    if (!((forwardValue1674_48_0 == forwardValue1674_48_1))) {
        break forward_join_51;
    }
    life7_30 = 4;
    }
    ((net.minecraft.world.World)(p0)).c(((moom.DT)(p1)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.B)), ((int)(life7_30)), ((int)(this.l)));
    }
    return;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.Cr.n ^ 40446432082445L);
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((byte)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("note")))));
    this.l = ((byte)(((byte) moom.Dr.a(((int)(this.l)), ((int)(0)), ((int)(__sourceIntrinsic_03d9340fa09f_originalDynamicSite1098_5(4502, (8334948565906727321L ^ local2))))))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_originalDynamicSite1097_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4141_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_originalDynamicSite1098_5(int a0, long a1) throws E;
}
