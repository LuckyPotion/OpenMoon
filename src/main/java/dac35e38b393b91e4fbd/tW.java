package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tW extends net.minecraft.entity.projectile.EntityThrowable {

private net.minecraft.item.ItemStack aO;

private static final long bb;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public tW(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.ItemStack p4) {
super(p0, p1, p2, p3);
    this.aO = p4;
}


public tW(net.minecraft.world.World p0, double p1, double p2, double p3, int p4) {
this(p0, p1, p2, p3, new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, p4));
}


public tW(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, net.minecraft.item.ItemStack p2) {
super(p0, p1);
    this.aO = p2;
}


public tW(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1, int p2) {
this(p0, p1, new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, p2));
}


public tW(net.minecraft.world.World p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-1582457470653503096L)), ((long)(-2082722799425772572L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269397630656114L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tW.bb ^ 61667654746615L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1031_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1031_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1031_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1031_14 = new byte[8];
    (__sourceSpill1031_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1031_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1031_16 = __sourceSpill1031_14;
    ((javax.crypto.Cipher)(__sourceSpill1031_11)).init(((int)(__sourceSpill1031_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1031_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1031_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\001òÚSúwy*¯ýçÛæaXÐ\037¸"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1031_25 = local6_life21;
        int __sourceSpill1031_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1031_25)).substring(((int)(__sourceSpill1031_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1031_30 = local8_life19;
        int __sourceSpill1031_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1031_33 = new byte[8];
        (__sourceSpill1031_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1031_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1031_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1031_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1031_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1031_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1031_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1031_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1031_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1031_34)).doFinal(((byte[])(__sourceSpill1031_33)));
        (__sourceSpill1031_30)[__sourceSpill1031_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


protected float b__sourceReturn_bc607678b6() {
return -0x1.4p4f;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
moom.tW forwardValue4076_30_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4076_30_1;
    moom.tW forwardValue4076_39_0;
    moom.tW spill4076_0;
    net.minecraft.nbt.NBTTagCompound spill4076_1;
    moom.tW spill4076_2;
    long life2_3;
    int[] life4_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_33: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (moom.tW.bb ^ 31058862838499L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4076_0 = this;
    spill4076_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue4076_30_0 = spill4076_0;
        forwardValue4076_30_1 = spill4076_1;
        break forward_join_30;
    }
    __sourceIntrinsic_01f4e1cd062e_call4076_2(spill4076_0, spill4076_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Potion")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic4076_3(30938, (2555010412670909834L ^ life2_3))))))) {
        break forward_join_28;
    }
    this.aO = ((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Potion"))))))));
    if (!((life4_5 == null))) {
        break forward_join_33;
    }
    }
    forwardValue4076_30_0 = this;
    forwardValue4076_30_1 = p0;
    }
    ((moom.tW)(forwardValue4076_30_0)).g(((int)(((net.minecraft.nbt.NBTTagCompound)(forwardValue4076_30_1)).a__Int(((java.lang.String)("potionValue"))))));
    }
    spill4076_2 = this;
    if (!((life4_5 != null))) {
        forwardValue4076_39_0 = spill4076_2;
        break forward_join_39;
    }
    if (!((((moom.tW)(spill4076_2)).aO == null))) {
        break forward_join_40;
    }
    forwardValue4076_39_0 = this;
    }
    ((moom.tW)(forwardValue4076_39_0)).f__Void();
    }
    return;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7BCC;
        if (ib[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/tW", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            tW.ib[n2] = n4;
        }
        return ib[n2];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tW.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9177_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-5f;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.tW.bb ^ 36677042276840L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    if ((this.aO != null)) {
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Potion")), ((net.minecraft.nbt.NBTBase)(((net.minecraft.item.ItemStack)(this.aO)).a__yw(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()))))));
    }
    return;
}


protected float a() {
return 0x1.0p-1f;
}


public int a__Int() {
net.minecraft.item.ItemStack forwardValue4075_21_0;
    net.minecraft.item.ItemStack spill4075_0;
    long life1_3;
    int[] life3_5;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (moom.tW.bb ^ 71805978073883L);
    life3_5 = moom.h1.a__ArrayInt();
    spill4075_0 = this.aO;
    if (!((life3_5 != null))) {
        forwardValue4075_21_0 = spill4075_0;
        break forward_join_21;
    }
    if (!((spill4075_0 == null))) {
        break forward_join_19;
    }
    this.aO = ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, 0)));
    }
    forwardValue4075_21_0 = this.aO;
    }
    return ((net.minecraft.item.ItemStack)(forwardValue4075_21_0)).c();
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
int forestValue505_45_0;
    double forestValue505_67_0;
    double forestValue505_67_1;
    int forestValue505_118_0;
    double spill505_0;
    double spill505_1;
    boolean spill505_2;
    long life2_3;
    int[] life4_5;
    java.util.List life5_14;
    moom.CA life6_30;
    java.util.List life7_36;
    java.util.Iterator life8_45;
    net.minecraft.entity.EntityLivingBase life9_52;
    double life10_56;
    double life12_74;
    java.util.Iterator life14_83;
    net.minecraft.potion.PotionEffect life15_90;
    int life16_93;
    int life17_127;
    forest_join_155: {
    forest_join_153: {
    forest_join_139: {
    life2_3 = (moom.tW.bb ^ 98399142849870L);
    life4_5 = moom.h1.a__ArrayInt();
    if (!((!((net.minecraft.world.World)(this.i)).G))) {
        break forest_join_155;
    }
    life5_14 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__List(((net.minecraft.item.ItemStack)(this.aO)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    if (!((life5_14 != null))) {
        break forest_join_139;
    }
    if (!((!((java.util.List)(life5_14)).isEmpty()))) {
        break forest_join_139;
    }
    life6_30 = ((moom.CA)(((moom.tW)(this)).b())).b(((double)(0x1.0p2d)), ((double)(0x1.0p1d)), ((double)(0x1.0p2d)));
    life7_36 = ((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(net.minecraft.entity.EntityLivingBase.class)), ((moom.CA)(life6_30)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    if (!((!((java.util.List)(life7_36)).isEmpty()))) {
        break forest_join_139;
    }
    life8_45 = ((java.util.List)(life7_36)).iterator();
    forest_cycle_43: while (true) {
    forest_join_137: {
    forestValue505_45_0 = ((((java.util.Iterator)(life8_45)).hasNext()) ? 1 : 0);
    forest_cycle_45: while (true) {
    forest_join_75: {
    forest_join_67: {
    if (!((forestValue505_45_0 != 0))) {
        break forest_join_139;
    }
    life9_52 = ((net.minecraft.entity.EntityLivingBase)(((java.util.Iterator)(life8_45)).next()));
    life10_56 = ((moom.tW)(this)).a(((net.minecraft.entity.Entity)(life9_52)));
    if (!((life4_5 != null))) {
        break forest_join_153;
    }
    spill505_0 = life10_56;
    spill505_1 = 0x1.0p4d;
    if (!((life4_5 != null))) {
        forestValue505_67_0 = spill505_0;
        forestValue505_67_1 = spill505_1;
        break forest_join_67;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill505_0)), ((double)(spill505_1))) < 0))) {
        break forest_join_137;
    }
    forestValue505_67_0 = 0x1.0p0d;
    forestValue505_67_1 = (java.lang.Math.sqrt(((double)(life10_56))) / 0x1.0p2d);
    }
    life12_74 = (forestValue505_67_0 - forestValue505_67_1);
    if (!((life9_52 == ((net.minecraft.util.MovingObjectPosition)(p0)).e))) {
        break forest_join_75;
    }
    life12_74 = 0x1.0p0d;
    }
    life14_83 = ((java.util.List)(life5_14)).iterator();
    forest_cycle_78: while (true) {
    forest_join_135: {
    forest_join_118: {
    forest_join_110: {
    if (!(((java.util.Iterator)(life14_83)).hasNext())) {
        break forest_join_137;
    }
    life15_90 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life14_83)).next()));
    life16_93 = ((net.minecraft.potion.PotionEffect)(life15_90)).a();
    spill505_2 = ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[life16_93])).a__Boolean();
    if (!((life4_5 != null))) {
        forestValue505_45_0 = ((spill505_2) ? 1 : 0);
        continue forest_cycle_45;
    }
    if (!((life4_5 != null))) {
        forestValue505_118_0 = ((spill505_2) ? 1 : 0);
        break forest_join_118;
    }
    if (!(spill505_2)) {
        break forest_join_110;
    }
    ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[life16_93])).a(((net.minecraft.entity.Entity)(this)), ((net.minecraft.entity.Entity)(((moom.tW)(this)).a__sG())), ((net.minecraft.entity.EntityLivingBase)(life9_52)), ((int)(((net.minecraft.potion.PotionEffect)(life15_90)).c())), ((double)(life12_74)));
    if (!((life4_5 == null))) {
        break forest_join_135;
    }
    }
    forestValue505_118_0 = ((int) ((life12_74 * ((double) ((net.minecraft.potion.PotionEffect)(life15_90)).b())) + 0x1.0p-1d));
    }
    life17_127 = forestValue505_118_0;
    if (!((life17_127 > __sourceIntrinsic_791342a704ed_invokedynamic505_37(15783, (2331864627005982553L ^ life2_3))))) {
        break forest_join_135;
    }
    ((net.minecraft.entity.EntityLivingBase)(life9_52)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(life16_93, life17_127, ((net.minecraft.potion.PotionEffect)(life15_90)).c()))));
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_78;
    }
    break forest_cycle_78;
    }
    break forest_cycle_45;
    }
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_43;
    }
    break forest_cycle_43;
    }
    }
    ((net.minecraft.world.World)(this.i)).b(((int)(__sourceIntrinsic_791342a704ed_invokedynamic505_41(3945, (355104120120292757L ^ life2_3)))), ((moom.DT)(new moom.DT(this))), ((int)(((moom.tW)(this)).a__Int())));
    }
    ((moom.tW)(this)).f__Void();
    }
    return;
}


public void g(int p0) {
net.minecraft.item.ItemStack forwardValue4077_21_0;
    net.minecraft.item.ItemStack spill4077_0;
    long life2_3;
    int[] life4_5;
    forward_join_21: {
    forward_join_19: {
    life2_3 = (moom.tW.bb ^ 1456955053324L);
    life4_5 = moom.h1.a__ArrayInt();
    spill4077_0 = this.aO;
    if (!((life4_5 != null))) {
        forwardValue4077_21_0 = spill4077_0;
        break forward_join_21;
    }
    if (!((spill4077_0 == null))) {
        break forward_join_19;
    }
    this.aO = ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, 0)));
    }
    forwardValue4077_21_0 = this.aO;
    }
    ((net.minecraft.item.ItemStack)(forwardValue4077_21_0)).a__Void(((int)(p0)));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic505_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_791342a704ed_invokedynamic505_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9177_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_01f4e1cd062e_call4076_2(moom.tW a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic4076_3(int a0, long a1) throws E;
}
