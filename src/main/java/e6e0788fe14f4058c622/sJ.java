package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class sJ extends moom.sI {

protected int b4;

protected int b5;

protected int b6;

private float b7;

private float b8;

private static boolean b9;

private static final long db;

private static final long[] ub;

private static final java.lang.Integer[] vb;

private static final java.util.Map wb;

public sJ(net.minecraft.world.World p0) {
super(p0);
    this.b7 = -0x1.0000000000000p+0f;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(-6643178472469213L)), ((long)(6721499916077028988L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15399831935059L)))));
    int __sourceSpill1520_6 = 0;
    wb = ((java.util.Map)(new java.util.HashMap(13)));
    moom.sJ.m(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1520_6))));
    long local0_life9 = (moom.sJ.db ^ 116244818738709L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1520_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1520_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1520_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1520_16 = new byte[8];
    (__sourceSpill1520_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1520_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1520_18 = __sourceSpill1520_16;
    ((javax.crypto.Cipher)(__sourceSpill1520_13)).init(((int)(__sourceSpill1520_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1520_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1520_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[5];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\004³lz\027§1\t\n\013×\005P ´Ø³Î±\036\016\013¾"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1520_27 = local6_life23;
        int __sourceSpill1520_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1520_27)).substring(((int)(__sourceSpill1520_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1520_32 = local8_life21;
        int __sourceSpill1520_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1520_35 = new byte[8];
        (__sourceSpill1520_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1520_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1520_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1520_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1520_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1520_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1520_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1520_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1520_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1520_36)).doFinal(((byte[])(__sourceSpill1520_35)));
        (__sourceSpill1520_32)[__sourceSpill1520_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ØG4¬\005ènúÚ\027\007}"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1520_40 = local6_life23;
        int __sourceSpill1520_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1520_40)).substring(((int)(__sourceSpill1520_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1520_45 = local8_life21;
        int __sourceSpill1520_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1520_48 = new byte[8];
        (__sourceSpill1520_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1520_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1520_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1520_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1520_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1520_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1520_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1520_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1520_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1520_49)).doFinal(((byte[])(__sourceSpill1520_48)));
        (__sourceSpill1520_45)[__sourceSpill1520_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    ub = ((long[])(local8_life21));
    vb = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public void b(int p0, boolean p1) {
int forwardValue3958_36_0;
    int forwardValue3958_66_0;
    moom.sJ forwardValue3958_68_0;
    int spill3958_0;
    int spill3958_1;
    int spill3958_2;
    boolean spill3958_3;
    int spill3958_4;
    moom.sJ spill3958_5;
    long life3_3;
    int life6_7;
    int life5_8;
    int life7_10;
    int life6_20;
    int life8_45;
    forward_join_71: {
    forward_join_68: {
    forward_join_66: {
    forward_join_62: {
    forward_join_36: {
    forward_join_33: {
    life3_3 = (moom.sJ.db ^ 102241176354110L);
    spill3958_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life6_7 = ((moom.sJ)(this)).q__sourceReturn_8abf5c6871();
    life5_8 = spill3958_0;
    life7_10 = life6_7;
    life6_20 = (life6_7 + (p0 * __sourceIntrinsic_7cf220b54d33_invokedynamic3958_3(30355, (5764720765580352312L ^ life3_3))));
    spill3958_1 = life6_20;
    if (!((life5_8 == 0))) {
        forwardValue3958_36_0 = spill3958_1;
        break forward_join_36;
    }
    if (!((spill3958_1 > 0))) {
        break forward_join_33;
    }
    life6_20 = 0;
    spill3958_2 = life7_10;
    if (!((life5_8 == 0))) {
        forwardValue3958_36_0 = spill3958_2;
        break forward_join_36;
    }
    if (!((spill3958_2 < 0))) {
        break forward_join_33;
    }
    ((moom.sJ)(this)).X__sourceReturn_da8c82d5d4();
    }
    forwardValue3958_36_0 = (life6_20 - life7_10);
    }
    life8_45 = forwardValue3958_36_0;
    ((moom.sJ)(this)).l(((int)(life6_20)));
    spill3958_3 = p1;
    if (!((life5_8 == 0))) {
        forwardValue3958_66_0 = ((spill3958_3) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill3958_3)) {
        break forward_join_62;
    }
    moom.sJ __stackOp3958_7_0 = this;
    ((moom.sJ)(__stackOp3958_7_0)).b5 = ((int)((((moom.sJ)(__stackOp3958_7_0)).b5 + life8_45)));
    spill3958_4 = this.b6;
    if (!((life5_8 == 0))) {
        forwardValue3958_66_0 = spill3958_4;
        break forward_join_66;
    }
    if (!((spill3958_4 == 0))) {
        break forward_join_62;
    }
    this.b6 = ((int)(__sourceIntrinsic_7cf220b54d33_invokedynamic3958_11(7823, (2013693057815671590L ^ life3_3))));
    }
    spill3958_5 = this;
    if (!((life5_8 == 0))) {
        forwardValue3958_68_0 = spill3958_5;
        break forward_join_68;
    }
    forwardValue3958_66_0 = ((moom.sJ)(spill3958_5)).q__sourceReturn_8abf5c6871();
    }
    if (!((forwardValue3958_66_0 == 0))) {
        break forward_join_71;
    }
    forwardValue3958_68_0 = this;
    }
    ((moom.sJ)(forwardValue3958_68_0)).l(((int)(this.b5)));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((moom.sJ)(this)).l(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Age"))))));
    this.b5 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ForcedAge")))));
    return;
}


public boolean c__Boolean() {
int forwardValue3959_12_0;
    int forwardValue3959_14_0;
    int spill3959_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.sJ.db ^ 19945507061341L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill3959_0 = ((moom.sJ)(this)).q__sourceReturn_8abf5c6871();
    if (!((life3_5 == 0))) {
        forwardValue3959_12_0 = spill3959_0;
        break forward_join_12;
    }
    if (!((spill3959_0 < 0))) {
        break forward_join_13;
    }
    forwardValue3959_12_0 = 1;
    }
    forwardValue3959_14_0 = forwardValue3959_12_0;
    break forward_join_14;
    }
    forwardValue3959_14_0 = 0;
    }
    return ((forwardValue3959_14_0) != 0);
}


public void l(boolean p0) {
long local2 = (moom.sJ.db ^ 62432819629126L);
    ((moom.sJ)(this)).j(((float)((p0 ? 0x1.0p-1f : 0x1.0p0f))));
    return;
}


public void l(int p0) {
long local2 = (moom.sJ.db ^ 58798454379708L);
    ((net.minecraft.entity.DataWatcher)(((moom.sJ)(this)).al)).b(((int)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1632_2(9750, (8495068095083881020L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) moom.Dr.a(((int)(p0)), ((int)(-1)), ((int)(1))))))))));
    this.b4 = ((int)(p0));
    ((moom.sJ)(this)).l(((boolean)(((moom.sJ)(this)).c__Boolean())));
    return;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x508C;
        if (vb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = ub[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])wb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    wb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sJ.vb[n2] = n3;
        }
        return vb[n2];
}


protected void d__Void() {
long local1 = (moom.sJ.db ^ 53013033796309L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((moom.sJ)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1633_3(9750, (8495071071354647637L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9005_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Age")), ((int)(((moom.sJ)(this)).q__sourceReturn_8abf5c6871())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ForcedAge")), ((int)(this.b5)));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sJ.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue3956_15_0;
    moom.sJ forwardValue3956_41_0;
    moom.sJ forwardValue3956_64_0;
    int forwardValue3956_80_0;
    int forwardValue3956_102_0;
    int spill3956_0;
    net.minecraft.item.ItemStack spill3956_1;
    boolean spill3956_2;
    int spill3956_3;
    moom.sJ spill3956_4;
    moom.sJ spill3956_5;
    boolean spill3956_6;
    int spill3956_7;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    java.lang.Class life6_41;
    moom.sJ life7_62;
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_80: {
    forward_join_77: {
    forward_join_64: {
    forward_join_41: {
    forward_join_15: {
    life2_3 = (moom.sJ.db ^ 114322167296062L);
    spill3956_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill3956_0;
    spill3956_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue3956_15_0 = spill3956_1;
        break forward_join_15;
    }
    if (!((spill3956_1 != null))) {
        break forward_join_103;
    }
    forwardValue3956_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3956_15_0)).a__wQ() == net.minecraft.init.Items.by))) {
        break forward_join_103;
    }
    spill3956_2 = ((net.minecraft.world.World)(((moom.sJ)(this)).i)).G;
    if (!((life4_9 == 0))) {
        forwardValue3956_102_0 = ((spill3956_2) ? 1 : 0);
        break forward_join_102;
    }
    if (!((!spill3956_2))) {
        break forward_join_101;
    }
    spill3956_3 = ((net.minecraft.item.ItemStack)(life5_8)).c();
    if (!((life4_9 == 0))) {
        forwardValue3956_102_0 = spill3956_3;
        break forward_join_102;
    }
    life6_41 = net.minecraft.entity.EntityList.a(((int)(spill3956_3)));
    if (!((life6_41 != null))) {
        break forward_join_101;
    }
    spill3956_4 = this;
    if (!((life4_9 == 0))) {
        forwardValue3956_41_0 = spill3956_4;
        break forward_join_41;
    }
    if (!((((java.lang.Object)(spill3956_4)).getClass() == life6_41))) {
        break forward_join_101;
    }
    forwardValue3956_41_0 = ((moom.sJ)(this)).a(((moom.sJ)(this)));
    }
    life7_62 = forwardValue3956_41_0;
    spill3956_5 = life7_62;
    if (!((life4_9 == 0))) {
        forwardValue3956_64_0 = spill3956_5;
        break forward_join_64;
    }
    if (!((spill3956_5 != null))) {
        break forward_join_101;
    }
    ((moom.sJ)(life7_62)).l(((int)(__sourceIntrinsic_d6a7991b4c91_invokedynamic3956_13(16898, (2964871512847950504L ^ life2_3)))));
    ((moom.sJ)(life7_62)).c(((double)(((moom.sJ)(this)).n)), ((double)(((moom.sJ)(this)).o)), ((double)(((moom.sJ)(this)).p)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    forwardValue3956_64_0 = this;
    }
    ((net.minecraft.world.World)(((moom.sJ)(forwardValue3956_64_0)).i)).b__Boolean(((net.minecraft.entity.Entity)(life7_62)));
    spill3956_6 = ((net.minecraft.item.ItemStack)(life5_8)).f__Boolean();
    if (!((life4_9 == 0))) {
        forwardValue3956_80_0 = ((spill3956_6) ? 1 : 0);
        break forward_join_80;
    }
    if (!(spill3956_6)) {
        break forward_join_77;
    }
    ((moom.sJ)(life7_62)).a(((java.lang.String)(((net.minecraft.item.ItemStack)(life5_8)).b__String())));
    }
    forwardValue3956_80_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue3956_102_0 = forwardValue3956_80_0;
        break forward_join_102;
    }
    if (!((forwardValue3956_80_0 == 0))) {
        break forward_join_101;
    }
    net.minecraft.item.ItemStack __stackOp3956_28_0 = life5_8;
    ((net.minecraft.item.ItemStack)(__stackOp3956_28_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp3956_28_0)).b - 1)));
    spill3956_7 = ((net.minecraft.item.ItemStack)(life5_8)).b;
    if (!((life4_9 == 0))) {
        forwardValue3956_102_0 = spill3956_7;
        break forward_join_102;
    }
    if (!((spill3956_7 <= 0))) {
        break forward_join_101;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue3956_102_0 = 1;
    }
    return ((forwardValue3956_102_0) != 0);
    }
    return ((0) != 0);
}


protected final void a__Void(float p0, float p1) {
int forwardValue3957_14_0;
    int forwardValue3957_16_0;
    moom.sJ forwardValue3957_29_0;
    float forwardValue3957_29_1;
    int spill3957_0;
    moom.sJ spill3957_1;
    float spill3957_2;
    long life3_3;
    int life5_5;
    int life6_19;
    forward_join_30: {
    forward_join_29: {
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (moom.sJ.db ^ 43540414484108L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill3957_0 = recovery.source.CarrierOps.fcmpl(((float)(this.b7)), ((float)(0x0.0p0f)));
    if (!((life5_5 == 0))) {
        forwardValue3957_14_0 = spill3957_0;
        break forward_join_14;
    }
    if (!((spill3957_0 > 0))) {
        break forward_join_15;
    }
    forwardValue3957_14_0 = 1;
    }
    forwardValue3957_16_0 = forwardValue3957_14_0;
    break forward_join_16;
    }
    forwardValue3957_16_0 = 0;
    }
    life6_19 = forwardValue3957_16_0;
    this.b7 = ((float)(p0));
    spill3957_1 = this;
    spill3957_2 = p1;
    if (!((life5_5 == 0))) {
        forwardValue3957_29_0 = spill3957_1;
        forwardValue3957_29_1 = spill3957_2;
        break forward_join_29;
    }
    ((moom.sJ)(spill3957_1)).b8 = ((float)(spill3957_2));
    if (!((life6_19 == 0))) {
        break forward_join_30;
    }
    forwardValue3957_29_0 = this;
    forwardValue3957_29_1 = 0x1.0p0f;
    }
    ((moom.sJ)(forwardValue3957_29_0)).j(((float)(forwardValue3957_29_1)));
    }
    return;
}


public abstract moom.sJ a(moom.sJ p0);

public static void m(boolean p0) {
moom.sJ.b9 = ((boolean)(p0));
    return;
}


public void k(int p0) {
((moom.sJ)(this)).b(((int)(p0)), ((boolean)(false)));
    return;
}


protected final void j(float p0) {
super.a__Void(((float)((this.b7 * p0))), ((float)((this.b8 * p0))));
    return;
}


public int q__sourceReturn_8abf5c6871() {
moom.sJ forwardValue3960_22_0;
    int forwardValue3960_23_0;
    moom.sJ spill3960_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.sJ.db ^ 85810722176784L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill3960_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue3960_22_0 = spill3960_0;
        break forward_join_22;
    }
    if (!(((net.minecraft.world.World)(((moom.sJ)(spill3960_0)).i)).G)) {
        break forward_join_21;
    }
    forwardValue3960_23_0 = ((int)(((net.minecraft.entity.DataWatcher)(((moom.sJ)(this)).al)).a(((int)(__sourceIntrinsic_8eec3f92325c_invokedynamic3960_5(29135, (7672011663864110668L ^ life1_3)))))));
    break forward_join_23;
    }
    forwardValue3960_22_0 = this;
    }
    forwardValue3960_23_0 = ((moom.sJ)(forwardValue3960_22_0)).b4;
    }
    return forwardValue3960_23_0;
}


public static boolean ac() {
int local0 = __sourceIntrinsic_booleanToInteger(moom.sJ.ab());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


protected void X__sourceReturn_da8c82d5d4() {
return;
}


public static boolean ab() {
return ((((moom.sJ.b9) ? 1 : 0)) != 0);
}


public void G() {
moom.sJ forwardValue3955_80_0;
    moom.sJ forwardValue3955_86_0;
    int forwardValue3955_93_0;
    int forwardValue3955_111_0;
    int spill3955_0;
    boolean spill3955_1;
    moom.sJ spill3955_2;
    moom.sJ spill3955_3;
    int spill3955_4;
    long life1_3;
    int life3_7;
    int life4_114;
    forward_join_116: {
    forward_join_111: {
    forward_join_110: {
    forward_join_108: {
    forward_join_93: {
    forward_join_91: {
    forward_join_86: {
    forward_join_85: {
    forward_join_80: {
    forward_join_79: {
    life1_3 = (moom.sJ.db ^ 64777334609038L);
    spill3955_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    super.G();
    life3_7 = spill3955_0;
    spill3955_1 = ((net.minecraft.world.World)(((moom.sJ)(this)).i)).G;
    if (!((life3_7 == 0))) {
        forwardValue3955_93_0 = ((spill3955_1) ? 1 : 0);
        break forward_join_93;
    }
    if (!(spill3955_1)) {
        break forward_join_91;
    }
    spill3955_2 = this;
    if (!((life3_7 == 0))) {
        forwardValue3955_86_0 = spill3955_2;
        break forward_join_86;
    }
    if (!((((moom.sJ)(spill3955_2)).b6 > 0))) {
        break forward_join_85;
    }
    spill3955_3 = this;
    if (!((life3_7 == 0))) {
        forwardValue3955_80_0 = spill3955_3;
        break forward_join_80;
    }
    if (!(((((moom.sJ)(spill3955_3)).b6 % 4) == 0))) {
        break forward_join_79;
    }
    ((net.minecraft.world.World)(((moom.sJ)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.VILLAGER_HAPPY)), ((double)(((((moom.sJ)(this)).n + ((double) ((((java.util.Random)(((moom.sJ)(this)).ah)).nextFloat() * ((moom.sJ)(this)).G) * 0x1.0p1f))) - ((double) ((moom.sJ)(this)).G)))), ((double)(((((moom.sJ)(this)).o + 0x1.0p-1d) + ((double) (((java.util.Random)(((moom.sJ)(this)).ah)).nextFloat() * ((moom.sJ)(this)).H))))), ((double)(((((moom.sJ)(this)).p + ((double) ((((java.util.Random)(((moom.sJ)(this)).ah)).nextFloat() * ((moom.sJ)(this)).G) * 0x1.0p1f))) - ((double) ((moom.sJ)(this)).G)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    }
    forwardValue3955_80_0 = this;
    }
    moom.sJ __stackOp3955_25_0 = forwardValue3955_80_0;
    ((moom.sJ)(__stackOp3955_25_0)).b6 = ((int)((((moom.sJ)(__stackOp3955_25_0)).b6 - 1)));
    }
    forwardValue3955_86_0 = this;
    }
    ((moom.sJ)(forwardValue3955_86_0)).l(((boolean)(((moom.sJ)(this)).c__Boolean())));
    if (!((life3_7 != 0))) {
        break forward_join_116;
    }
    }
    forwardValue3955_93_0 = ((moom.sJ)(this)).q__sourceReturn_8abf5c6871();
    }
    life4_114 = forwardValue3955_93_0;
    spill3955_4 = life4_114;
    if (!((life3_7 == 0))) {
        forwardValue3955_111_0 = spill3955_4;
        break forward_join_111;
    }
    if (!((spill3955_4 < 0))) {
        break forward_join_110;
    }
    life4_114 += 1;
    ((moom.sJ)(this)).l(((int)(life4_114)));
    if (!((life3_7 == 0))) {
        break forward_join_108;
    }
    if (!((life4_114 == 0))) {
        break forward_join_116;
    }
    ((moom.sJ)(this)).X__sourceReturn_da8c82d5d4();
    }
    if (!((life3_7 != 0))) {
        break forward_join_116;
    }
    }
    forwardValue3955_111_0 = life4_114;
    }
    if (!((forwardValue3955_111_0 > 0))) {
        break forward_join_116;
    }
    life4_114 += -1;
    ((moom.sJ)(this)).l(((int)(life4_114)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic3958_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7cf220b54d33_invokedynamic3958_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1632_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1633_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9005_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d6a7991b4c91_invokedynamic3956_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8eec3f92325c_invokedynamic3960_5(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
