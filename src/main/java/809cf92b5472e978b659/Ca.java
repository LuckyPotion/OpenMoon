package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ca extends net.minecraft.tileentity.TileEntity {

private int l;

private net.minecraft.nbt.NBTTagList m;

private boolean n;

private java.util.List<moom.bq> o;

private java.util.List<net.minecraft.item.EnumDyeColor> p;

private java.lang.String q;

private static final long r;

private static final long[] s;

private static final java.lang.Integer[] t;

private static final java.util.Map u;

public Ca() {
super();
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(7810357886545337448L)), ((long)(-8232828142267371139L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(65552148981233L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ca.r ^ 117397801843766L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill676_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill676_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill676_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill676_14 = new byte[8];
    (__sourceSpill676_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill676_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation676_16 = __sourceSpill676_14;
    ((javax.crypto.Cipher)(__sourceSpill676_11)).init(((int)(__sourceSpill676_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill676_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation676_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\016öfñ¥î=¾Áª\n÷h\016Â®µÑC`,¦\004ö-\025ýÚ$æ\r\004n_e"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill676_25 = local6_life21;
        int __sourceSpill676_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill676_25)).substring(((int)(__sourceSpill676_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill676_30 = local8_life19;
        int __sourceSpill676_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill676_33 = new byte[8];
        (__sourceSpill676_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill676_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill676_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill676_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill676_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill676_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill676_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill676_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill676_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill676_34)).doFinal(((byte[])(__sourceSpill676_33)));
        (__sourceSpill676_30)[__sourceSpill676_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "æ\037²Äu0.&@\035'\002×fX"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill676_38 = local6_life21;
        int __sourceSpill676_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill676_38)).substring(((int)(__sourceSpill676_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill676_43 = local8_life19;
        int __sourceSpill676_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill676_46 = new byte[8];
        (__sourceSpill676_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill676_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill676_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill676_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill676_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill676_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill676_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill676_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill676_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill676_47)).doFinal(((byte[])(__sourceSpill676_46)));
        (__sourceSpill676_43)[__sourceSpill676_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


public static void b__Void(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1622_16_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1622_33_0;
    java.lang.String forwardValue1622_33_1;
    int forwardValue1622_33_2;
    int forwardValue1622_49_0;
    int forwardValue1622_61_0;
    net.minecraft.item.ItemStack forwardValue1622_63_0;
    java.lang.String[] spill1622_0;
    net.minecraft.nbt.NBTTagCompound spill1622_1;
    java.lang.String spill1622_2;
    int spill1622_3;
    int spill1622_4;
    net.minecraft.item.ItemStack spill1622_5;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_9;
    java.lang.String[] life3_10;
    net.minecraft.nbt.NBTTagList life5_43;
    forward_join_65: {
    forward_join_63: {
    forward_join_61: {
    forward_join_49: {
    forward_join_33: {
    forward_join_16: {
    life1_3 = (moom.Ca.r ^ 25696540020856L);
    spill1622_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_9 = ((net.minecraft.item.ItemStack)(p0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(false)));
    life3_10 = spill1622_0;
    spill1622_1 = life4_9;
    if (!((life3_10 != null))) {
        forwardValue1622_16_0 = spill1622_1;
        break forward_join_16;
    }
    if (!((spill1622_1 != null))) {
        break forward_join_65;
    }
    forwardValue1622_16_0 = life4_9;
    }
    spill1622_2 = "Patterns";
    spill1622_3 = __sourceIntrinsic_dd09ebd2fc53_invokedynamic1622_3(6238, (6543244511593015229L ^ life1_3));
    if (!((life3_10 != null))) {
        forwardValue1622_33_0 = forwardValue1622_16_0;
        forwardValue1622_33_1 = spill1622_2;
        forwardValue1622_33_2 = spill1622_3;
        break forward_join_33;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(forwardValue1622_16_0)).a__Boolean(((java.lang.String)(spill1622_2)), ((int)(spill1622_3))))) {
        break forward_join_65;
    }
    forwardValue1622_33_0 = life4_9;
    forwardValue1622_33_1 = "Patterns";
    forwardValue1622_33_2 = __sourceIntrinsic_dd09ebd2fc53_invokedynamic1622_5(19127, (7954183081312154965L ^ life1_3));
    }
    life5_43 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue1622_33_0)).a(((java.lang.String)(forwardValue1622_33_1)), ((int)(forwardValue1622_33_2)));
    spill1622_4 = ((net.minecraft.nbt.NBTTagList)(life5_43)).a__Int();
    if (!((life3_10 != null))) {
        forwardValue1622_49_0 = spill1622_4;
        break forward_join_49;
    }
    if (!((spill1622_4 > 0))) {
        break forward_join_65;
    }
    ((net.minecraft.nbt.NBTTagList)(life5_43)).a__yn(((int)((((net.minecraft.nbt.NBTTagList)(life5_43)).a__Int() - 1))));
    forwardValue1622_49_0 = ((((net.minecraft.nbt.NBTTagList)(life5_43)).a__Boolean()) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forwardValue1622_61_0 = forwardValue1622_49_0;
        break forward_join_61;
    }
    if (!((forwardValue1622_49_0 != 0))) {
        break forward_join_65;
    }
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a__Void(((java.lang.String)("BlockEntityTag")));
    spill1622_5 = p0;
    if (!((life3_10 != null))) {
        forwardValue1622_63_0 = spill1622_5;
        break forward_join_63;
    }
    forwardValue1622_61_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(spill1622_5)).a__yw())).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue1622_61_0 != 0))) {
        break forward_join_65;
    }
    forwardValue1622_63_0 = p0;
    }
    ((net.minecraft.item.ItemStack)(forwardValue1622_63_0)).b(((net.minecraft.nbt.NBTTagCompound)(null)));
    }
    return;
}


public static int b(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1620_16_0;
    int forwardValue1620_30_0;
    int forwardValue1620_32_0;
    java.lang.String[] spill1620_0;
    net.minecraft.nbt.NBTTagCompound spill1620_1;
    boolean spill1620_2;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_9;
    java.lang.String[] life3_10;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_16: {
    life1_3 = (moom.Ca.r ^ 108185249357275L);
    spill1620_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_9 = ((net.minecraft.item.ItemStack)(p0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(false)));
    life3_10 = spill1620_0;
    spill1620_1 = life4_9;
    if (!((life3_10 != null))) {
        forwardValue1620_16_0 = spill1620_1;
        break forward_join_16;
    }
    if (!((spill1620_1 != null))) {
        break forward_join_31;
    }
    forwardValue1620_16_0 = life4_9;
    }
    spill1620_2 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue1620_16_0)).a__Boolean(((java.lang.String)("Patterns")));
    if (!((life3_10 != null))) {
        forwardValue1620_30_0 = ((spill1620_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill1620_2)) {
        break forward_join_31;
    }
    forwardValue1620_30_0 = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(life4_9)).a(((java.lang.String)("Patterns")), ((int)(__sourceIntrinsic_9dbdbdfe5e0e_invokedynamic1620_5(15309, (345285670758140297L ^ life1_3))))))).a__Int();
    }
    forwardValue1620_32_0 = forwardValue1620_30_0;
    break forward_join_32;
    }
    forwardValue1620_32_0 = 0;
    }
    return forwardValue1620_32_0;
}


private void b__Void() {
moom.Ca lexicalValue532_22_0;
    int lexicalValue532_48_0;
    int lexicalValue532_60_0;
    moom.Ca spill532_0;
    moom.Ca spill532_1;
    moom.Ca spill532_2;
    boolean spill532_3;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_93;
    net.minecraft.nbt.NBTTagCompound life5_103;
    moom.bq life6_108;
    int life7_124;
    lexical_join_106: {
    lexical_join_60: {
    lexical_join_48: {
    lexical_join_31: {
    lexical_join_22: {
    lexical_join_21: {
    life1_3 = (moom.Ca.r ^ 125988511707771L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill532_0 = this;
    if (!((life3_5 != null))) {
        lexicalValue532_22_0 = spill532_0;
        break lexical_join_22;
    }
    if (!((((moom.Ca)(spill532_0)).o != null))) {
        break lexical_join_21;
    }
    spill532_1 = this;
    if (!((life3_5 != null))) {
        lexicalValue532_22_0 = spill532_1;
        break lexical_join_22;
    }
    if (!((((moom.Ca)(spill532_1)).p != null))) {
        break lexical_join_21;
    }
    spill532_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue532_22_0 = spill532_2;
        break lexical_join_22;
    }
    if (!((((moom.Ca)(spill532_2)).q == null))) {
        break lexical_join_106;
    }
    }
    lexicalValue532_22_0 = this;
    }
    spill532_3 = ((moom.Ca)(lexicalValue532_22_0)).n;
    if (!((life3_5 != null))) {
        lexicalValue532_48_0 = ((spill532_3) ? 1 : 0);
        break lexical_join_48;
    }
    if (!((!spill532_3))) {
        break lexical_join_31;
    }
    this.q = ((java.lang.String)(""));
    if (!((life3_5 == null))) {
        break lexical_join_106;
    }
    }
    this.o = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    this.p = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    ((java.util.List)(this.o)).add(((java.lang.Object)(moom.bq.BASE)));
    lexicalValue532_48_0 = ((((java.util.List)(this.p)).add(((java.lang.Object)(net.minecraft.item.EnumDyeColor.a(((int)(this.l))))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue532_60_0 = lexicalValue532_48_0;
        break lexical_join_60;
    }
    recovery.source.CarrierOps.discard(lexicalValue532_48_0);
    this.q = ((java.lang.String)(__sourceIntrinsic_9bf881b104f5_invokedynamic532_22(this.l)));
    if (!((this.m != null))) {
        break lexical_join_106;
    }
    lexicalValue532_60_0 = 0;
    }
    life4_93 = lexicalValue532_60_0;
    lexical_cycle_61: while (true) {
    lexical_join_104: {
    lexical_join_103: {
    if (!((life4_93 < ((net.minecraft.nbt.NBTTagList)(this.m)).a__Int()))) {
        break lexical_join_106;
    }
    life5_103 = ((net.minecraft.nbt.NBTTagList)(this.m)).a__yw(((int)(life4_93)));
    life6_108 = moom.bq.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life5_103)).a__String(((java.lang.String)("Pattern"))))));
    if (!((life3_5 != null))) {
        break lexical_join_104;
    }
    if (!((life6_108 != null))) {
        break lexical_join_103;
    }
    ((java.util.List)(this.o)).add(((java.lang.Object)(life6_108)));
    life7_124 = ((net.minecraft.nbt.NBTTagCompound)(life5_103)).a__Int(((java.lang.String)("Color")));
    ((java.util.List)(this.p)).add(((java.lang.Object)(net.minecraft.item.EnumDyeColor.a(((int)(life7_124))))));
    this.q = ((java.lang.String)(__sourceIntrinsic_9bf881b104f5_invokedynamic532_39(this.q, ((moom.bq)(life6_108)).b(), life7_124)));
    }
    life4_93 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    return;
}


public java.util.List<net.minecraft.item.EnumDyeColor> b() {
((moom.Ca)(this)).b__Void();
    return this.p;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    moom.Ca.a(((net.minecraft.nbt.NBTTagCompound)(p0)), ((int)(this.l)), ((net.minecraft.nbt.NBTTagList)(this.m)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ca.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
((moom.Ca)(this)).b__Void();
    return this.q;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4083_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ca"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x113F;
        if (t[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = s[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ca", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ca.t[n4] = n6;
        }
        return t[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.yK a__yK() {
long local1 = (moom.Ca.r ^ 96140338973207L);
    net.minecraft.nbt.NBTTagCompound local3 = new net.minecraft.nbt.NBTTagCompound();
    ((moom.Ca)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local3)));
    return new moom.Am(((moom.Ca)(this)).e, __sourceIntrinsic_758318602aa6_originalDynamicSite1090_3(12066, (1969635670541634221L ^ local1)), local3);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.Ca.r ^ 21015076511436L);
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Base")))));
    this.m = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Patterns")), ((int)(__sourceIntrinsic_03d9340fa09f_originalDynamicSite1091_4(15309, (345301647454522014L ^ local2)))))));
    this.o = ((java.util.List)(null));
    this.p = ((java.util.List)(null));
    this.q = ((java.lang.String)(null));
    this.n = ((boolean)(true));
    return;
}


public static void a(net.minecraft.nbt.NBTTagCompound p0, int p1, net.minecraft.nbt.NBTTagList p2) {
net.minecraft.nbt.NBTTagCompound forwardValue1618_16_0;
    java.lang.String forwardValue1618_16_1;
    net.minecraft.nbt.NBTTagCompound spill1618_0;
    java.lang.String spill1618_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_18: {
    forward_join_16: {
    life3_3 = (moom.Ca.r ^ 65619710130145L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1618_0 = p0;
    spill1618_1 = "Base";
    if (!((life5_5 != null))) {
        forwardValue1618_16_0 = spill1618_0;
        forwardValue1618_16_1 = spill1618_1;
        break forward_join_16;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1618_0)).a__Void(((java.lang.String)(spill1618_1)), ((int)(p1)));
    if (!((p2 != null))) {
        break forward_join_18;
    }
    forwardValue1618_16_0 = p0;
    forwardValue1618_16_1 = "Patterns";
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue1618_16_0)).a(((java.lang.String)(forwardValue1618_16_1)), ((net.minecraft.nbt.NBTBase)(p2)));
    }
    return;
}


public void a__Void(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1619_29_0;
    java.lang.String forwardValue1619_29_1;
    int forwardValue1619_57_0;
    moom.Ca forwardValue1619_78_0;
    moom.Ca spill1619_0;
    net.minecraft.nbt.NBTTagCompound spill1619_1;
    java.lang.String spill1619_2;
    boolean spill1619_3;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.nbt.NBTTagCompound life5_42;
    forward_join_87: {
    forward_join_78: {
    forward_join_77: {
    forward_join_75: {
    forward_join_65: {
    forward_join_57: {
    forward_join_49: {
    forward_join_29: {
    life2_3 = (moom.Ca.r ^ 115263619381472L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1619_0 = this;
    if (!((life4_5 != null))) {
        forwardValue1619_78_0 = spill1619_0;
        break forward_join_78;
    }
    ((moom.Ca)(spill1619_0)).m = ((net.minecraft.nbt.NBTTagList)(null));
    if (!(((net.minecraft.item.ItemStack)(p0)).e__Boolean())) {
        break forward_join_77;
    }
    spill1619_1 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    spill1619_2 = "BlockEntityTag";
    if (!((life4_5 != null))) {
        forwardValue1619_29_0 = spill1619_1;
        forwardValue1619_29_1 = spill1619_2;
        break forward_join_29;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1619_1)).a__Boolean(((java.lang.String)(spill1619_2)), ((int)(__sourceIntrinsic_0b7541fcf940_invokedynamic1619_5(15309, (345292610625039538L ^ life2_3))))))) {
        break forward_join_77;
    }
    forwardValue1619_29_0 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    forwardValue1619_29_1 = "BlockEntityTag";
    }
    life5_42 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue1619_29_0)).a__yw(((java.lang.String)(forwardValue1619_29_1)));
    spill1619_3 = ((net.minecraft.nbt.NBTTagCompound)(life5_42)).a__Boolean(((java.lang.String)("Patterns")));
    if (!((life4_5 != null))) {
        forwardValue1619_57_0 = ((spill1619_3) ? 1 : 0);
        break forward_join_57;
    }
    if (!(spill1619_3)) {
        break forward_join_49;
    }
    this.m = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(life5_42)).a(((java.lang.String)("Patterns")), ((int)(__sourceIntrinsic_0b7541fcf940_invokedynamic1619_11(15309, (345292610625039538L ^ life2_3))))))).a__yn()))));
    }
    forwardValue1619_57_0 = ((((net.minecraft.nbt.NBTTagCompound)(life5_42)).a__Boolean(((java.lang.String)("Base")), ((int)(__sourceIntrinsic_0b7541fcf940_invokedynamic1619_16(968, (1748168664039543990L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue1619_57_0 != 0))) {
        break forward_join_65;
    }
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(life5_42)).a__Int(((java.lang.String)("Base")))));
    if (!((life4_5 == null))) {
        break forward_join_75;
    }
    }
    this.l = ((int)((((net.minecraft.item.ItemStack)(p0)).c() & __sourceIntrinsic_0b7541fcf940_invokedynamic1619_22(8267, (4556806906894055222L ^ life2_3)))));
    }
    if (!((life4_5 == null))) {
        break forward_join_87;
    }
    }
    forwardValue1619_78_0 = this;
    }
    ((moom.Ca)(forwardValue1619_78_0)).l = ((int)((((net.minecraft.item.ItemStack)(p0)).c() & __sourceIntrinsic_0b7541fcf940_invokedynamic1619_25(15543, (6569332721605372878L ^ life2_3)))));
    }
    this.o = ((java.util.List)(null));
    this.p = ((java.util.List)(null));
    this.q = ((java.lang.String)(""));
    this.n = ((boolean)(true));
    return;
}


public net.minecraft.nbt.NBTTagList a__yz() {
return this.m;
}


public java.util.List<moom.bq> a__List() {
((moom.Ca)(this)).b__Void();
    return this.o;
}


public static int a(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue1617_16_0;
    int forwardValue1617_24_0;
    int forwardValue1617_27_0;
    java.lang.String[] spill1617_0;
    net.minecraft.nbt.NBTTagCompound spill1617_1;
    boolean spill1617_2;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_9;
    java.lang.String[] life3_10;
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (moom.Ca.r ^ 118041752286002L);
    spill1617_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_9 = ((net.minecraft.item.ItemStack)(p0)).a(((java.lang.String)("BlockEntityTag")), ((boolean)(false)));
    life3_10 = spill1617_0;
    spill1617_1 = life4_9;
    if (!((life3_10 != null))) {
        forwardValue1617_16_0 = spill1617_1;
        break forward_join_16;
    }
    if (!((spill1617_1 != null))) {
        break forward_join_25;
    }
    forwardValue1617_16_0 = life4_9;
    }
    spill1617_2 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue1617_16_0)).a__Boolean(((java.lang.String)("Base")));
    if (!((life3_10 != null))) {
        forwardValue1617_24_0 = ((spill1617_2) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill1617_2)) {
        break forward_join_25;
    }
    forwardValue1617_24_0 = ((net.minecraft.nbt.NBTTagCompound)(life4_9)).a__Int(((java.lang.String)("Base")));
    }
    forwardValue1617_27_0 = forwardValue1617_24_0;
    break forward_join_27;
    }
    forwardValue1617_27_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    return forwardValue1617_27_0;
}


public int a__sourceReturn_8abf5c6871() {
return this.l;
}


private static native <E extends Throwable> int __sourceIntrinsic_dd09ebd2fc53_invokedynamic1622_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dd09ebd2fc53_invokedynamic1622_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9dbdbdfe5e0e_invokedynamic1620_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic532_22(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic532_39(java.lang.String a0, java.lang.String a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4083_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_758318602aa6_originalDynamicSite1090_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_originalDynamicSite1091_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7541fcf940_invokedynamic1619_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7541fcf940_invokedynamic1619_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7541fcf940_invokedynamic1619_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7541fcf940_invokedynamic1619_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b7541fcf940_invokedynamic1619_25(int a0, long a1) throws E;
}
