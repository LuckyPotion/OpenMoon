package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class ItemStack {

public static java.text.DecimalFormat a;

public int b;

public int c;

private net.minecraft.item.Item d;

private net.minecraft.nbt.NBTTagCompound e;

private int f;

private net.minecraft.entity.item.EntityItemFrame g;

private net.minecraft.block.Block h;

private boolean i;

private net.minecraft.block.Block j;

private boolean k;

private static boolean l;

private static long m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public ItemStack(net.minecraft.item.Item p0) {
this(((net.minecraft.item.Item)(p0)), ((int)(1)));
    return;
}


public ItemStack(net.minecraft.item.Item p0, int p1) {
this(((net.minecraft.item.Item)(p0)), ((int)(p1)), ((int)(0)));
    return;
}


public ItemStack(net.minecraft.item.Item p0, int p1, int p2) { super(); }


private static void __sourceConstructorBody_10000a1eb43057b8(net.minecraft.item.ItemStack receiver, net.minecraft.item.Item p0, int p1, int p2) throws Throwable {

long local4 = (net.minecraft.item.ItemStack.m ^ 24545939579797L);

    net.minecraft.item.ItemStack.__sourceConstructorInit_10000a1eb43057b8_0(((net.minecraft.item.ItemStack)(receiver)));

    ((net.minecraft.item.ItemStack)(receiver)).h = ((net.minecraft.block.Block)(null));

    ((net.minecraft.item.ItemStack)(receiver)).i = ((boolean)(false));

    ((net.minecraft.item.ItemStack)(receiver)).j = ((net.minecraft.block.Block)(null));

    ((net.minecraft.item.ItemStack)(receiver)).k = ((boolean)(false));

    ((net.minecraft.item.ItemStack)(receiver)).d = ((net.minecraft.item.Item)(p0));

    ((net.minecraft.item.ItemStack)(receiver)).b = ((int)(p1));

    ((net.minecraft.item.ItemStack)(receiver)).f = ((int)(p2));

    if ((((net.minecraft.item.ItemStack)(receiver)).f < 0)) {

        ((net.minecraft.item.ItemStack)(receiver)).f = ((int)(0));

    }

    return;

}



private ItemStack() {
super();
    this.h = null;
    this.i = false;
    this.j = null;
    this.k = false;
}


public ItemStack(net.minecraft.block.Block p0) {
this(((net.minecraft.block.Block)(p0)), ((int)(1)));
    return;
}


public ItemStack(net.minecraft.block.Block p0, int p1) {
this(((net.minecraft.block.Block)(p0)), ((int)(p1)), ((int)(0)));
    return;
}


public ItemStack(net.minecraft.block.Block p0, int p1, int p2) {
this(((net.minecraft.item.Item)(net.minecraft.item.Item.a(((net.minecraft.block.Block)(p0))))), ((int)(p1)), ((int)(p2)));
    return;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-2355140198774363040L)), ((long)(1433355435284943269L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(270758931339102L)))));
    int __sourceSpill1903_6 = 0;
    p = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.item.ItemStack.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1903_6))));
    long local0_life9 = (net.minecraft.item.ItemStack.m ^ 62038501103363L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1903_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1903_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1903_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1903_16 = new byte[8];
    (__sourceSpill1903_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1903_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1903_18 = __sourceSpill1903_16;
    ((javax.crypto.Cipher)(__sourceSpill1903_13)).init(((int)(__sourceSpill1903_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1903_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1903_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[9];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "aBEs(¥\016A¿fT\020\027ñ×L\006\021Z(Pý_lÞ\031\007MÜ\002md\"®\027\0063©}úÀ\036s\000\177o+÷Ìúï"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1903_27 = local6_life23;
        int __sourceSpill1903_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1903_27)).substring(((int)(__sourceSpill1903_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1903_32 = local8_life21;
        int __sourceSpill1903_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1903_35 = new byte[8];
        (__sourceSpill1903_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1903_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1903_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1903_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1903_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1903_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1903_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1903_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1903_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1903_36)).doFinal(((byte[])(__sourceSpill1903_35)));
        (__sourceSpill1903_32)[__sourceSpill1903_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "ð\034ÐÎä?µxY\033\0005õ"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1903_40 = local6_life23;
        int __sourceSpill1903_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1903_40)).substring(((int)(__sourceSpill1903_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1903_45 = local8_life21;
        int __sourceSpill1903_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1903_48 = new byte[8];
        (__sourceSpill1903_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1903_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1903_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1903_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1903_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1903_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1903_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1903_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1903_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1903_49)).doFinal(((byte[])(__sourceSpill1903_48)));
        (__sourceSpill1903_45)[__sourceSpill1903_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    n = ((long[])(local8_life21));
    o = ((java.lang.Integer[])(new java.lang.Integer[9]));
    a = ((java.text.DecimalFormat)(new java.text.DecimalFormat("#.###")));
}

private static native <E extends Throwable> void __sourceConstructorInit_10000a1eb43057b8_0(net.minecraft.item.ItemStack a0) throws E;

public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite2026_4(this.b, ((net.minecraft.item.Item)(this.d)).a__String(), this.f);
}


public boolean i() {
net.minecraft.nbt.NBTTagCompound forwardValue5526_13_0;
    int forwardValue5526_24_0;
    int forwardValue5526_26_0;
    net.minecraft.nbt.NBTTagCompound spill5526_0;
    boolean spill5526_1;
    long life1_3;
    int life3_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 14207787148528L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5526_0 = this.e;
    if (!((life3_5 != 0))) {
        forwardValue5526_13_0 = spill5526_0;
        break forward_join_13;
    }
    if (!((spill5526_0 != null))) {
        break forward_join_25;
    }
    forwardValue5526_13_0 = this.e;
    }
    spill5526_1 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5526_13_0)).a__Boolean(((java.lang.String)("ench")), ((int)(__sourceIntrinsic_42b3a0d41be4_invokedynamic5526_5(16896, (6183338933559169935L ^ life1_3)))));
    if (!((life3_5 != 0))) {
        forwardValue5526_24_0 = ((spill5526_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill5526_1)) {
        break forward_join_25;
    }
    forwardValue5526_24_0 = 1;
    }
    forwardValue5526_26_0 = forwardValue5526_24_0;
    break forward_join_26;
    }
    forwardValue5526_26_0 = 0;
    }
    return ((forwardValue5526_26_0) != 0);
}


public boolean b(net.minecraft.block.Block p0) {
int lexicalValue1635_75_0;
    boolean spill1635_0;
    boolean spill1635_1;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_58;
    int life6_60;
    net.minecraft.block.Block life7_69;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_71: {
    lexical_join_18: {
    lexical_join_15: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 44579918534424L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((life4_5 == 0))) {
        break lexical_join_18;
    }
    if (!((p0 == this.h))) {
        break lexical_join_15;
    }
    return this.i;
    }
    this.h = ((net.minecraft.block.Block)(p0));
    }
    spill1635_0 = ((net.minecraft.item.ItemStack)(this)).e__Boolean();
    if (!((life4_5 == 0))) {
        lexicalValue1635_75_0 = ((spill1635_0) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1635_0)) {
        break lexical_join_71;
    }
    spill1635_1 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("CanDestroy")), ((int)(__sourceIntrinsic_ac90f16927f6_invokedynamic1635_9(16896, (6183307702434619495L ^ life2_3)))));
    if (!((life4_5 == 0))) {
        lexicalValue1635_75_0 = ((spill1635_1) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1635_1)) {
        break lexical_join_71;
    }
    life5_58 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("CanDestroy")), ((int)(__sourceIntrinsic_ac90f16927f6_invokedynamic1635_13(3573, (1854032155905339295L ^ life2_3)))));
    life6_60 = 0;
    lexical_cycle_47: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life6_60 < ((net.minecraft.nbt.NBTTagList)(life5_58)).a__Int()))) {
        break lexical_join_71;
    }
    life7_69 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life5_58)).a__String(((int)(life6_60))))));
    if (!((life4_5 == 0))) {
        break lexical_join_74;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_69;
    }
    if (!((life7_69 == p0))) {
        break lexical_join_68;
    }
    this.i = ((boolean)(true));
    return ((1) != 0);
    }
    life6_60 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    this.i = ((boolean)(false));
    }
    lexicalValue1635_75_0 = 0;
    }
    return ((lexicalValue1635_75_0) != 0);
}


public void b(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, int p2) {
((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((int)(p2)));
    return;
}


public static boolean b(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5517_15_0;
    net.minecraft.item.ItemStack forwardValue5517_19_0;
    net.minecraft.item.ItemStack forwardValue5517_23_0;
    int forwardValue5517_29_0;
    int forwardValue5517_31_0;
    net.minecraft.item.ItemStack spill5517_0;
    net.minecraft.item.ItemStack spill5517_1;
    boolean spill5517_2;
    long life2_3;
    int life4_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_23: {
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 54578938601149L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5517_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5517_15_0 = spill5517_0;
        break forward_join_15;
    }
    if (!((spill5517_0 == null))) {
        break forward_join_14;
    }
    spill5517_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue5517_15_0 = spill5517_1;
        break forward_join_15;
    }
    if (!((spill5517_1 != null))) {
        break forward_join_28;
    }
    }
    forwardValue5517_15_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue5517_19_0 = forwardValue5517_15_0;
        break forward_join_19;
    }
    if (!((forwardValue5517_15_0 != null))) {
        break forward_join_30;
    }
    forwardValue5517_19_0 = p1;
    }
    if (!((life4_5 == 0))) {
        forwardValue5517_23_0 = forwardValue5517_19_0;
        break forward_join_23;
    }
    if (!((forwardValue5517_19_0 != null))) {
        break forward_join_30;
    }
    forwardValue5517_23_0 = p0;
    }
    spill5517_2 = ((net.minecraft.item.ItemStack)(forwardValue5517_23_0)).a__Boolean(((net.minecraft.item.ItemStack)(p1)));
    if (!((life4_5 == 0))) {
        forwardValue5517_29_0 = ((spill5517_2) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill5517_2)) {
        break forward_join_30;
    }
    }
    forwardValue5517_29_0 = 1;
    }
    forwardValue5517_31_0 = forwardValue5517_29_0;
    break forward_join_31;
    }
    forwardValue5517_31_0 = 0;
    }
    return ((forwardValue5517_31_0) != 0);
}


public boolean b__Boolean() {
net.minecraft.item.Item forwardValue5518_13_0;
    int forwardValue5518_19_0;
    int forwardValue5518_30_0;
    int forwardValue5518_32_0;
    net.minecraft.item.Item spill5518_0;
    int spill5518_1;
    boolean spill5518_2;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_19: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 85923407338987L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5518_0 = this.d;
    if (!((life3_5 != 0))) {
        forwardValue5518_13_0 = spill5518_0;
        break forward_join_13;
    }
    if (!((spill5518_0 != null))) {
        break forward_join_31;
    }
    forwardValue5518_13_0 = this.d;
    }
    spill5518_1 = ((net.minecraft.item.Item)(forwardValue5518_13_0)).b();
    if (!((life3_5 != 0))) {
        forwardValue5518_19_0 = spill5518_1;
        break forward_join_19;
    }
    if (!((spill5518_1 > 0))) {
        break forward_join_31;
    }
    forwardValue5518_19_0 = ((((net.minecraft.item.ItemStack)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5518_30_0 = forwardValue5518_19_0;
        break forward_join_30;
    }
    if (!((forwardValue5518_19_0 != 0))) {
        break forward_join_29;
    }
    spill5518_2 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(this)).a__yw())).b__Boolean(((java.lang.String)("Unbreakable")));
    if (!((life3_5 != 0))) {
        forwardValue5518_30_0 = ((spill5518_2) ? 1 : 0);
        break forward_join_30;
    }
    if (!((!spill5518_2))) {
        break forward_join_31;
    }
    }
    forwardValue5518_30_0 = 1;
    }
    forwardValue5518_32_0 = forwardValue5518_30_0;
    break forward_join_32;
    }
    forwardValue5518_32_0 = 0;
    }
    return ((forwardValue5518_32_0) != 0);
}


public int b() {
return this.f;
}


public void b(int p0) {
net.minecraft.item.ItemStack forwardValue5514_17_0;
    net.minecraft.item.ItemStack spill5514_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 4281318168290L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5514_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5514_17_0 = spill5514_0;
        break forward_join_17;
    }
    if (!((!((net.minecraft.item.ItemStack)(spill5514_0)).e__Boolean()))) {
        break forward_join_16;
    }
    this.e = ((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()));
    }
    forwardValue5514_17_0 = this;
    }
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(forwardValue5514_17_0)).e)).a__Void(((java.lang.String)("RepairCost")), ((int)(p0)));
    return;
}


public boolean b(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5516_11_0;
    net.minecraft.item.ItemStack forwardValue5516_18_0;
    int forwardValue5516_25_0;
    int forwardValue5516_27_0;
    net.minecraft.item.ItemStack spill5516_0;
    int spill5516_1;
    long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 29035507922964L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5516_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5516_11_0 = spill5516_0;
        break forward_join_11;
    }
    if (!((spill5516_0 != null))) {
        break forward_join_26;
    }
    forwardValue5516_11_0 = this;
    }
    if (!((life4_5 == 0))) {
        forwardValue5516_18_0 = forwardValue5516_11_0;
        break forward_join_18;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5516_11_0)).d == ((net.minecraft.item.ItemStack)(p0)).d))) {
        break forward_join_26;
    }
    forwardValue5516_18_0 = this;
    }
    spill5516_1 = ((net.minecraft.item.ItemStack)(forwardValue5516_18_0)).f;
    if (!((life4_5 == 0))) {
        forwardValue5516_25_0 = spill5516_1;
        break forward_join_25;
    }
    if (!((spill5516_1 == ((net.minecraft.item.ItemStack)(p0)).f))) {
        break forward_join_26;
    }
    forwardValue5516_25_0 = 1;
    }
    forwardValue5516_27_0 = forwardValue5516_25_0;
    break forward_join_27;
    }
    forwardValue5516_27_0 = 0;
    }
    return ((forwardValue5516_27_0) != 0);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
this.e = ((net.minecraft.nbt.NBTTagCompound)(p0));
    return;
}


public java.lang.String b__String() {
net.minecraft.nbt.NBTTagCompound forwardValue5519_18_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5519_31_0;
    java.lang.String forwardValue5519_31_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5519_46_0;
    java.lang.String forwardValue5519_46_1;
    boolean spill5519_0;
    net.minecraft.nbt.NBTTagCompound spill5519_1;
    java.lang.String spill5519_2;
    net.minecraft.nbt.NBTTagCompound spill5519_3;
    java.lang.String spill5519_4;
    long life1_3;
    java.lang.String life4_9;
    int life3_10;
    net.minecraft.nbt.NBTTagCompound life5_44;
    forward_join_48: {
    forward_join_46: {
    forward_join_31: {
    forward_join_18: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 18417043815567L);
    spill5519_0 = net.minecraft.item.ItemStack.l();
    life4_9 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).d(((net.minecraft.item.ItemStack)(this)));
    life3_10 = ((spill5519_0) ? 1 : 0);
    spill5519_1 = this.e;
    if (!((life3_10 == 0))) {
        forwardValue5519_18_0 = spill5519_1;
        break forward_join_18;
    }
    if (!((spill5519_1 != null))) {
        break forward_join_48;
    }
    forwardValue5519_18_0 = this.e;
    }
    spill5519_2 = "display";
    if (!((life3_10 == 0))) {
        forwardValue5519_31_0 = forwardValue5519_18_0;
        forwardValue5519_31_1 = spill5519_2;
        break forward_join_31;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(forwardValue5519_18_0)).a__Boolean(((java.lang.String)(spill5519_2)), ((int)(__sourceIntrinsic_d1398b4921c0_invokedynamic5519_7(16380, (6156347812531402249L ^ life1_3))))))) {
        break forward_join_48;
    }
    forwardValue5519_31_0 = this.e;
    forwardValue5519_31_1 = "display";
    }
    life5_44 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5519_31_0)).a__yw(((java.lang.String)(forwardValue5519_31_1)));
    spill5519_3 = life5_44;
    spill5519_4 = "Name";
    if (!((life3_10 == 0))) {
        forwardValue5519_46_0 = spill5519_3;
        forwardValue5519_46_1 = spill5519_4;
        break forward_join_46;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill5519_3)).a__Boolean(((java.lang.String)(spill5519_4)), ((int)(__sourceIntrinsic_d1398b4921c0_invokedynamic5519_11(31159, (6122191797142237248L ^ life1_3))))))) {
        break forward_join_48;
    }
    forwardValue5519_46_0 = life5_44;
    forwardValue5519_46_1 = "Name";
    }
    life4_9 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5519_46_0)).a__String(((java.lang.String)(forwardValue5519_46_1)));
    }
    return life4_9;
}


public net.minecraft.item.ItemStack b(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1) {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).b(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)));
}


public static void b(boolean p0) {
l = ((boolean)(p0));
    return;
}


public int e() {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a__Int(((net.minecraft.item.ItemStack)(this)));
}


public boolean e__Boolean() {
long local1 = (net.minecraft.item.ItemStack.m ^ 108673733588848L);
    return ((((this.e != null) ? 1 : 0)) != 0);
}


public static boolean c(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5521_15_0;
    net.minecraft.item.ItemStack forwardValue5521_19_0;
    int forwardValue5521_25_0;
    int forwardValue5521_27_0;
    net.minecraft.item.ItemStack spill5521_0;
    net.minecraft.item.ItemStack spill5521_1;
    boolean spill5521_2;
    long life2_3;
    int life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 17363828539395L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5521_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5521_15_0 = spill5521_0;
        break forward_join_15;
    }
    if (!((spill5521_0 == null))) {
        break forward_join_14;
    }
    spill5521_1 = p1;
    if (!((life4_5 == 0))) {
        forwardValue5521_15_0 = spill5521_1;
        break forward_join_15;
    }
    if (!((spill5521_1 != null))) {
        break forward_join_24;
    }
    }
    forwardValue5521_15_0 = p0;
    }
    if (!((life4_5 == 0))) {
        forwardValue5521_19_0 = forwardValue5521_15_0;
        break forward_join_19;
    }
    if (!((forwardValue5521_15_0 != null))) {
        break forward_join_26;
    }
    forwardValue5521_19_0 = p0;
    }
    spill5521_2 = ((net.minecraft.item.ItemStack)(forwardValue5521_19_0)).b(((net.minecraft.item.ItemStack)(p1)));
    if (!((life4_5 == 0))) {
        forwardValue5521_25_0 = ((spill5521_2) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5521_2)) {
        break forward_join_26;
    }
    }
    forwardValue5521_25_0 = 1;
    }
    forwardValue5521_27_0 = forwardValue5521_25_0;
    break forward_join_27;
    }
    forwardValue5521_27_0 = 0;
    }
    return ((forwardValue5521_27_0) != 0);
}


public boolean c(net.minecraft.item.ItemStack p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.ItemStack)(this)).a__Boolean(((net.minecraft.item.ItemStack)(p0))))) != 0);
}


public boolean c(net.minecraft.block.Block p0) {
int lexicalValue1636_75_0;
    boolean spill1636_0;
    boolean spill1636_1;
    long life2_3;
    int life4_5;
    net.minecraft.nbt.NBTTagList life5_58;
    int life6_60;
    net.minecraft.block.Block life7_69;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_71: {
    lexical_join_18: {
    lexical_join_15: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 66369173108394L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((life4_5 != 0))) {
        break lexical_join_18;
    }
    if (!((p0 == this.j))) {
        break lexical_join_15;
    }
    return this.k;
    }
    this.j = ((net.minecraft.block.Block)(p0));
    }
    spill1636_0 = ((net.minecraft.item.ItemStack)(this)).e__Boolean();
    if (!((life4_5 != 0))) {
        lexicalValue1636_75_0 = ((spill1636_0) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1636_0)) {
        break lexical_join_71;
    }
    spill1636_1 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("CanPlaceOn")), ((int)(__sourceIntrinsic_bf46119e52dd_invokedynamic1636_9(22620, (4321288417425005455L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        lexicalValue1636_75_0 = ((spill1636_1) ? 1 : 0);
        break lexical_join_75;
    }
    if (!(spill1636_1)) {
        break lexical_join_71;
    }
    life5_58 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("CanPlaceOn")), ((int)(__sourceIntrinsic_bf46119e52dd_invokedynamic1636_13(3573, (1854019301794270765L ^ life2_3)))));
    life6_60 = 0;
    lexical_cycle_47: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life6_60 < ((net.minecraft.nbt.NBTTagList)(life5_58)).a__Int()))) {
        break lexical_join_71;
    }
    life7_69 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life5_58)).a__String(((int)(life6_60))))));
    if (!((life4_5 != 0))) {
        break lexical_join_74;
    }
    if (!((life4_5 != 0))) {
        break lexical_join_69;
    }
    if (!((life7_69 == p0))) {
        break lexical_join_68;
    }
    this.k = ((boolean)(true));
    return ((1) != 0);
    }
    life6_60 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    this.k = ((boolean)(false));
    }
    lexicalValue1636_75_0 = 0;
    }
    return ((lexicalValue1636_75_0) != 0);
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.Item)(this.d)).a__Boolean())) != 0);
}


public int c() {
return this.f;
}


public boolean h() {
int forwardValue5525_15_0;
    int forwardValue5525_19_0;
    int forwardValue5525_21_0;
    boolean spill5525_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_15: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 26076837619107L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5525_0 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).c__Boolean(((net.minecraft.item.ItemStack)(this)));
    if (!((life3_5 == 0))) {
        forwardValue5525_15_0 = ((spill5525_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5525_0)) {
        break forward_join_20;
    }
    forwardValue5525_15_0 = ((((net.minecraft.item.ItemStack)(this)).i()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5525_19_0 = forwardValue5525_15_0;
        break forward_join_19;
    }
    if (!((forwardValue5525_15_0 == 0))) {
        break forward_join_20;
    }
    forwardValue5525_19_0 = 1;
    }
    forwardValue5525_21_0 = forwardValue5525_19_0;
    break forward_join_21;
    }
    forwardValue5525_21_0 = 0;
    }
    return ((forwardValue5525_21_0) != 0);
}


public boolean f__Boolean() {
net.minecraft.nbt.NBTTagCompound forwardValue5524_13_0;
    int forwardValue5524_34_0;
    int forwardValue5524_38_0;
    int forwardValue5524_40_0;
    net.minecraft.nbt.NBTTagCompound spill5524_0;
    boolean spill5524_1;
    long life1_3;
    int life3_5;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_34: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 117143412881292L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5524_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue5524_13_0 = spill5524_0;
        break forward_join_13;
    }
    if (!((spill5524_0 != null))) {
        break forward_join_39;
    }
    forwardValue5524_13_0 = this.e;
    }
    spill5524_1 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5524_13_0)).a__Boolean(((java.lang.String)("display")), ((int)(__sourceIntrinsic_ee4adb14eef0_invokedynamic5524_5(16380, (6156359105640824074L ^ life1_3)))));
    if (!((life3_5 == 0))) {
        forwardValue5524_34_0 = ((spill5524_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5524_1)) {
        break forward_join_39;
    }
    forwardValue5524_34_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yw(((java.lang.String)("display"))))).a__Boolean(((java.lang.String)("Name")), ((int)(__sourceIntrinsic_ee4adb14eef0_invokedynamic5524_10(3573, (1853963990486863627L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5524_38_0 = forwardValue5524_34_0;
        break forward_join_38;
    }
    if (!((forwardValue5524_34_0 != 0))) {
        break forward_join_39;
    }
    forwardValue5524_38_0 = 1;
    }
    forwardValue5524_40_0 = forwardValue5524_38_0;
    break forward_join_40;
    }
    forwardValue5524_40_0 = 0;
    }
    return ((forwardValue5524_40_0) != 0);
}


public int f() {
int forwardValue5523_16_0;
    int forwardValue5523_23_0;
    int forwardValue5523_25_0;
    boolean spill5523_0;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_16: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 28342524694442L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5523_0 = ((net.minecraft.item.ItemStack)(this)).e__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5523_16_0 = ((spill5523_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5523_0)) {
        break forward_join_24;
    }
    forwardValue5523_16_0 = ((((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("RepairCost")), ((int)(3)))) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5523_23_0 = forwardValue5523_16_0;
        break forward_join_23;
    }
    if (!((forwardValue5523_16_0 != 0))) {
        break forward_join_24;
    }
    forwardValue5523_23_0 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Int(((java.lang.String)("RepairCost")));
    }
    forwardValue5523_25_0 = forwardValue5523_23_0;
    break forward_join_25;
    }
    forwardValue5523_25_0 = 0;
    }
    return forwardValue5523_25_0;
}


public static boolean l() {
return ((((net.minecraft.item.ItemStack.l) ? 1 : 0)) != 0);
}


public int d() {
return ((net.minecraft.item.Item)(this.d)).b();
}


public boolean d__Boolean() {
int forwardValue5522_13_0;
    int forwardValue5522_17_0;
    int forwardValue5522_19_0;
    boolean spill5522_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 87766443836299L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5522_0 = ((net.minecraft.item.ItemStack)(this)).b__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5522_13_0 = ((spill5522_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!(spill5522_0)) {
        break forward_join_18;
    }
    forwardValue5522_13_0 = this.f;
    }
    if (!((life3_5 == 0))) {
        forwardValue5522_17_0 = forwardValue5522_13_0;
        break forward_join_17;
    }
    if (!((forwardValue5522_13_0 > 0))) {
        break forward_join_18;
    }
    forwardValue5522_17_0 = 1;
    }
    forwardValue5522_19_0 = forwardValue5522_17_0;
    break forward_join_19;
    }
    forwardValue5522_19_0 = 0;
    }
    return ((forwardValue5522_19_0) != 0);
}


public java.util.List<java.lang.String> a(net.minecraft.entity.player.EntityPlayer p0, boolean p1) {
int forestValue900108_25_0;
    int forestValue900108_43_0;
    int forestValue900108_93_0;
    int forestValue900108_110_0;
    int forestValue900108_140_0;
    int forestValue900108_154_0;
    net.minecraft.item.ItemStack forestValue900108_204_0;
    int forestValue900108_214_0;
    int forestValue900108_248_0;
    int forestValue900108_254_0;
    net.minecraft.nbt.NBTTagCompound forestValue900108_262_0;
    java.lang.String forestValue900108_262_1;
    int forestValue900108_275_0;
    net.minecraft.item.ItemStack forestValue900108_293_0;
    moom.vB forestValue900108_344_0;
    int forestValue900108_352_0;
    int forestValue900108_352_1;
    int forestValue900108_397_0;
    int forestValue900108_428_0;
    int forestValue900108_433_0;
    int forestValue900108_458_0;
    int forestValue900108_545_0;
    net.minecraft.block.Block forestValue900108_631_0;
    int forestValue900108_693_0;
    int forestValue900108_698_0;
    int forestValue900108_727_0;
    java.util.ArrayList forestValue900108_738_0;
    boolean spill900108_0;
    boolean spill900108_1;
    int spill900108_2;
    java.lang.String spill900108_3;
    java.lang.String spill900108_4;
    java.lang.Object[] spill900108_5;
    java.lang.Object[] spill900108_6;
    java.lang.Object[] spill900108_7;
    java.lang.String spill900108_8;
    java.lang.String spill900108_9;
    java.lang.Object[] spill900108_10;
    java.lang.Object[] spill900108_11;
    boolean spill900108_12;
    boolean spill900108_13;
    net.minecraft.item.ItemStack spill900108_14;
    int spill900108_15;
    net.minecraft.item.ItemStack spill900108_16;
    int spill900108_17;
    boolean spill900108_18;
    boolean spill900108_19;
    net.minecraft.nbt.NBTTagCompound spill900108_20;
    java.lang.String spill900108_21;
    int spill900108_22;
    boolean spill900108_23;
    int spill900108_24;
    moom.vB spill900108_25;
    int spill900108_26;
    int spill900108_27;
    int spill900108_28;
    java.util.ArrayList spill900108_29;
    net.minecraft.util.EnumChatFormatting spill900108_30;
    java.lang.String spill900108_31;
    java.lang.Object[] spill900108_32;
    java.lang.Object[] spill900108_33;
    java.util.ArrayList spill900108_34;
    net.minecraft.util.EnumChatFormatting spill900108_35;
    java.lang.String spill900108_36;
    java.lang.Object[] spill900108_37;
    java.lang.Object[] spill900108_38;
    boolean spill900108_39;
    int spill900108_40;
    boolean spill900108_41;
    int spill900108_42;
    int spill900108_43;
    net.minecraft.block.Block spill900108_44;
    boolean spill900108_45;
    int spill900108_46;
    int spill900108_47;
    net.minecraft.block.Block spill900108_48;
    java.util.ArrayList spill900108_49;
    long life3_3;
    java.util.ArrayList life6_5;
    java.lang.String life7_9;
    int life5_10;
    java.lang.String life8_37;
    int life9_56;
    int life8_138;
    net.minecraft.nbt.NBTTagList life9_215;
    int life10_220;
    int life11_232;
    int life12_238;
    net.minecraft.nbt.NBTTagCompound life9_284;
    net.minecraft.nbt.NBTTagList life10_348;
    int life11_359;
    com.google.common.collect.Multimap life9_382;
    java.util.Iterator life10_408;
    java.util.Map.Entry life11_417;
    moom.vB life12_421;
    double life13_424;
    double life15_463;
    double life15_523;
    net.minecraft.nbt.NBTTagList life10_640;
    int life11_661;
    net.minecraft.block.Block life12_672;
    net.minecraft.nbt.NBTTagList life10_753;
    int life11_774;
    net.minecraft.block.Block life12_785;
    forest_join_738: {
    forest_join_737: {
    forest_join_727: {
    forest_join_712: {
    forest_join_698: {
    forest_join_693: {
    forest_join_692: {
    forest_join_631: {
    forest_join_545: {
    forest_join_543: {
    forest_join_458: {
    forest_join_456: {
    forest_join_433: {
    forest_join_431: {
    forest_join_293: {
    forest_join_292: {
    forest_join_275: {
    forest_join_262: {
    forest_join_254: {
    forest_join_249: {
    forest_join_248: {
    forest_join_242: {
    forest_join_214: {
    forest_join_204: {
    forest_join_203: {
    forest_join_154: {
    forest_join_150: {
    forest_join_140: {
    forest_join_133: {
    forest_join_110: {
    forest_join_105: {
    forest_join_93: {
    forest_join_91: {
    forest_join_89: {
    forest_join_73: {
    forest_join_71: {
    forest_join_43: {
    forest_join_40: {
    forest_join_25: {
    forest_join_20: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 61772937450979L);
    life6_5 = com.google.common.collect.Lists.newArrayList();
    spill900108_0 = net.minecraft.item.ItemStack.m();
    life7_9 = ((net.minecraft.item.ItemStack)(this)).b__String();
    life5_10 = ((spill900108_0) ? 1 : 0);
    spill900108_1 = ((net.minecraft.item.ItemStack)(this)).f__Boolean();
    if (!((life5_10 != 0))) {
        forestValue900108_25_0 = ((spill900108_1) ? 1 : 0);
        break forest_join_25;
    }
    if (!(spill900108_1)) {
        break forest_join_20;
    }
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_8(net.minecraft.util.EnumChatFormatting.ITALIC, life7_9);
    }
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_10(life7_9, net.minecraft.util.EnumChatFormatting.RESET);
    forestValue900108_25_0 = ((p1) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_93_0 = forestValue900108_25_0;
        break forest_join_93;
    }
    if (!((forestValue900108_25_0 != 0))) {
        break forest_join_91;
    }
    life8_37 = "";
    spill900108_2 = ((java.lang.String)(life7_9)).length();
    if (!((life5_10 != 0))) {
        forestValue900108_43_0 = spill900108_2;
        break forest_join_43;
    }
    if (!((spill900108_2 > 0))) {
        break forest_join_40;
    }
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_13(life7_9);
    life8_37 = ")";
    }
    forestValue900108_43_0 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)));
    }
    life9_56 = forestValue900108_43_0;
    if (!((life5_10 != 0))) {
        break forest_join_71;
    }
    if (!(((net.minecraft.item.ItemStack)(this)).c__Boolean())) {
        break forest_join_73;
    }
    spill900108_3 = life7_9;
    spill900108_4 = "#%04d/%d%s";
    java.lang.Object[] __stackOp900108_17_0 = new java.lang.Object[3];
    spill900108_5 = __stackOp900108_17_0;
    (__stackOp900108_17_0)[0] = java.lang.Integer.valueOf(((int)(life9_56)));
    java.lang.Object[] __stackOp900108_19_0 = spill900108_5;
    spill900108_6 = __stackOp900108_19_0;
    (__stackOp900108_19_0)[1] = java.lang.Integer.valueOf(((int)(this.f)));
    java.lang.Object[] __stackOp900108_22_0 = spill900108_6;
    spill900108_7 = __stackOp900108_22_0;
    (__stackOp900108_22_0)[2] = life8_37;
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_24(spill900108_3, java.lang.String.format(((java.lang.String)(spill900108_4)), ((java.lang.Object[])(spill900108_7))));
    }
    if (!((life5_10 == 0))) {
        break forest_join_89;
    }
    }
    spill900108_8 = life7_9;
    spill900108_9 = "#%04d%s";
    java.lang.Object[] __stackOp900108_25_0 = new java.lang.Object[2];
    spill900108_10 = __stackOp900108_25_0;
    (__stackOp900108_25_0)[0] = java.lang.Integer.valueOf(((int)(life9_56)));
    java.lang.Object[] __stackOp900108_27_0 = spill900108_10;
    spill900108_11 = __stackOp900108_27_0;
    (__stackOp900108_27_0)[1] = life8_37;
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_29(spill900108_8, java.lang.String.format(((java.lang.String)(spill900108_9)), ((java.lang.Object[])(spill900108_11))));
    }
    if (!((life5_10 == 0))) {
        break forest_join_105;
    }
    }
    forestValue900108_93_0 = ((((net.minecraft.item.ItemStack)(this)).f__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_110_0 = forestValue900108_93_0;
        break forest_join_110;
    }
    if (!((forestValue900108_93_0 == 0))) {
        break forest_join_105;
    }
    if (!((this.d == net.minecraft.init.Items.a3))) {
        break forest_join_105;
    }
    life7_9 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_35(life7_9, this.f);
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(life7_9)));
    forestValue900108_110_0 = 0;
    }
    life8_138 = forestValue900108_110_0;
    spill900108_12 = ((net.minecraft.item.ItemStack)(this)).e__Boolean();
    if (!((life5_10 != 0))) {
        forestValue900108_140_0 = ((spill900108_12) ? 1 : 0);
        break forest_join_140;
    }
    if (!(spill900108_12)) {
        break forest_join_133;
    }
    spill900108_13 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("HideFlags")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_40(24044, (3502645538153954676L ^ life3_3)))));
    if (!((life5_10 != 0))) {
        forestValue900108_140_0 = ((spill900108_13) ? 1 : 0);
        break forest_join_140;
    }
    if (!(spill900108_13)) {
        break forest_join_133;
    }
    life8_138 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Int(((java.lang.String)("HideFlags")));
    }
    forestValue900108_140_0 = (life8_138 & __sourceIntrinsic_c49c75fd3588_invokedynamic900108_45(19831, (9044184498440269290L ^ life3_3)));
    }
    if (!((life5_10 != 0))) {
        forestValue900108_154_0 = forestValue900108_140_0;
        break forest_join_154;
    }
    if (!((forestValue900108_140_0 == 0))) {
        break forest_join_150;
    }
    ((net.minecraft.item.Item)(this.d)).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((java.util.List)(life6_5)), ((boolean)(p1)));
    }
    spill900108_14 = this;
    if (!((life5_10 != 0))) {
        forestValue900108_293_0 = spill900108_14;
        break forest_join_293;
    }
    forestValue900108_154_0 = ((((net.minecraft.item.ItemStack)(spill900108_14)).e__Boolean()) ? 1 : 0);
    }
    if (!((forestValue900108_154_0 != 0))) {
        break forest_join_292;
    }
    spill900108_15 = (life8_138 & 1);
    if (!((life5_10 != 0))) {
        forestValue900108_214_0 = spill900108_15;
        break forest_join_214;
    }
    if (!((spill900108_15 == 0))) {
        break forest_join_203;
    }
    spill900108_16 = this;
    if (!((life5_10 != 0))) {
        forestValue900108_204_0 = spill900108_16;
        break forest_join_204;
    }
    life9_215 = ((net.minecraft.item.ItemStack)(spill900108_16)).a__yz();
    if (!((life9_215 != null))) {
        break forest_join_203;
    }
    life10_220 = 0;
    forest_cycle_170: while (true) {
    forest_join_201: {
    forest_join_200: {
    if (!((life10_220 < ((net.minecraft.nbt.NBTTagList)(life9_215)).a__Int()))) {
        break forest_join_203;
    }
    life11_232 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life9_215)).a__yw(((int)(life10_220))))).a__Short(((java.lang.String)("id")));
    life12_238 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life9_215)).a__yw(((int)(life10_220))))).a__Short(((java.lang.String)("lvl")));
    if (!((life5_10 != 0))) {
        break forest_join_201;
    }
    spill900108_17 = life11_232;
    if (!((life5_10 != 0))) {
        forestValue900108_214_0 = spill900108_17;
        break forest_join_214;
    }
    if (!((net.minecraft.enchantment.Enchantment.a__rD(((int)(spill900108_17))) != null))) {
        break forest_join_200;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.a__rD(((int)(life11_232))))).a__String(((int)(life12_238))))));
    }
    life10_220 += 1;
    }
    if (!((life5_10 == 0))) {
        continue forest_cycle_170;
    }
    break forest_cycle_170;
    }
    }
    forestValue900108_204_0 = this;
    }
    if (!((life5_10 != 0))) {
        forestValue900108_293_0 = forestValue900108_204_0;
        break forest_join_293;
    }
    forestValue900108_214_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(forestValue900108_204_0)).e)).a__Boolean(((java.lang.String)("display")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_61(16380, (6156303425442881381L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((forestValue900108_214_0 != 0))) {
        break forest_join_292;
    }
    life9_284 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yw(((java.lang.String)("display")));
    spill900108_18 = ((net.minecraft.nbt.NBTTagCompound)(life9_284)).a__Boolean(((java.lang.String)("color")), ((int)(3)));
    if (!((life5_10 != 0))) {
        forestValue900108_254_0 = ((spill900108_18) ? 1 : 0);
        break forest_join_254;
    }
    if (!(spill900108_18)) {
        break forest_join_249;
    }
    spill900108_19 = p1;
    if (!((life5_10 != 0))) {
        forestValue900108_248_0 = ((spill900108_19) ? 1 : 0);
        break forest_join_248;
    }
    if (!(spill900108_19)) {
        break forest_join_242;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_72(((java.lang.String)(java.lang.Integer.toHexString(((int)(((net.minecraft.nbt.NBTTagCompound)(life9_284)).a__Int(((java.lang.String)("color")))))))).toUpperCase()))));
    if (!((life5_10 == 0))) {
        break forest_join_249;
    }
    }
    forestValue900108_248_0 = ((((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_76(net.minecraft.util.EnumChatFormatting.ITALIC, net.minecraft.util.StatCollector.a(((java.lang.String)("item.dyed")))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue900108_248_0);
    }
    spill900108_20 = life9_284;
    spill900108_21 = "Lore";
    if (!((life5_10 != 0))) {
        forestValue900108_262_0 = spill900108_20;
        forestValue900108_262_1 = spill900108_21;
        break forest_join_262;
    }
    forestValue900108_254_0 = ((int)(((net.minecraft.nbt.NBTTagCompound)(spill900108_20)).a(((java.lang.String)(spill900108_21)))));
    }
    if (!((forestValue900108_254_0 == __sourceIntrinsic_c49c75fd3588_invokedynamic900108_82(16896, (6183324904629625500L ^ life3_3))))) {
        break forest_join_292;
    }
    forestValue900108_262_0 = life9_284;
    forestValue900108_262_1 = "Lore";
    }
    life10_348 = ((net.minecraft.nbt.NBTTagCompound)(forestValue900108_262_0)).a(((java.lang.String)(forestValue900108_262_1)), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_83(3573, (1854014962316914020L ^ life3_3)))));
    spill900108_22 = ((net.minecraft.nbt.NBTTagList)(life10_348)).a__Int();
    if (!((life5_10 != 0))) {
        forestValue900108_275_0 = spill900108_22;
        break forest_join_275;
    }
    if (!((spill900108_22 > 0))) {
        break forest_join_292;
    }
    forestValue900108_275_0 = 0;
    }
    life11_359 = forestValue900108_275_0;
    forest_cycle_276: while (true) {
    if (!((life11_359 < ((net.minecraft.nbt.NBTTagList)(life10_348)).a__Int()))) {
        break forest_join_292;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_90(net.minecraft.util.EnumChatFormatting.DARK_PURPLE, net.minecraft.util.EnumChatFormatting.ITALIC, ((net.minecraft.nbt.NBTTagList)(life10_348)).a__String(((int)(life11_359)))))));
    life11_359 += 1;
    if (!((life5_10 == 0))) {
        continue forest_cycle_276;
    }
    break forest_cycle_276;
    }
    }
    forestValue900108_293_0 = this;
    }
    life9_382 = ((net.minecraft.item.ItemStack)(forestValue900108_293_0)).a__Multimap();
    spill900108_23 = ((com.google.common.collect.Multimap)(life9_382)).isEmpty();
    if (!((life5_10 != 0))) {
        forestValue900108_433_0 = ((spill900108_23) ? 1 : 0);
        break forest_join_433;
    }
    if (!((!spill900108_23))) {
        break forest_join_431;
    }
    spill900108_24 = (life8_138 & 2);
    if (!((life5_10 != 0))) {
        forestValue900108_433_0 = spill900108_24;
        break forest_join_433;
    }
    if (!((spill900108_24 == 0))) {
        break forest_join_431;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)("")));
    life10_408 = ((java.util.Collection)(((com.google.common.collect.Multimap)(life9_382)).entries())).iterator();
    forest_cycle_314: while (true) {
    forest_join_429: {
    forest_join_428: {
    forest_join_397: {
    forest_join_394: {
    forest_join_361: {
    forest_join_357: {
    forest_join_352: {
    forest_join_344: {
    forest_join_343: {
    if (!(((java.util.Iterator)(life10_408)).hasNext())) {
        break forest_join_431;
    }
    life11_417 = ((java.util.Map.Entry)(((java.util.Iterator)(life10_408)).next()));
    life12_421 = ((moom.vB)(((java.util.Map.Entry)(life11_417)).getValue()));
    life13_424 = ((moom.vB)(life12_421)).a();
    if (!((life5_10 != 0))) {
        break forest_join_456;
    }
    spill900108_25 = life12_421;
    if (!((life5_10 != 0))) {
        forestValue900108_344_0 = spill900108_25;
        break forest_join_344;
    }
    if (!((((moom.vB)(spill900108_25)).a__UUID() == net.minecraft.item.Item.c))) {
        break forest_join_343;
    }
    life13_424 = (life13_424 + ((double) moom.rV.a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.entity.EnumCreatureAttribute)(net.minecraft.entity.EnumCreatureAttribute.UNDEFINED)))));
    }
    forestValue900108_344_0 = life12_421;
    }
    spill900108_26 = ((moom.vB)(forestValue900108_344_0)).a__Int();
    spill900108_27 = 1;
    if (!((life5_10 != 0))) {
        forestValue900108_352_0 = spill900108_26;
        forestValue900108_352_1 = spill900108_27;
        break forest_join_352;
    }
    if (!((spill900108_26 != spill900108_27))) {
        break forest_join_357;
    }
    forestValue900108_352_0 = ((moom.vB)(life12_421)).a__Int();
    forestValue900108_352_1 = 2;
    }
    if (!((forestValue900108_352_0 != forestValue900108_352_1))) {
        break forest_join_357;
    }
    life15_463 = life13_424;
    if (!((life5_10 == 0))) {
        break forest_join_361;
    }
    }
    life15_463 = (life13_424 * 0x1.9p6d);
    }
    spill900108_28 = recovery.source.CarrierOps.dcmpl(((double)(life13_424)), ((double)(0x0.0p0d)));
    if (!((life5_10 != 0))) {
        forestValue900108_397_0 = spill900108_28;
        break forest_join_397;
    }
    if (!((spill900108_28 > 0))) {
        break forest_join_394;
    }
    spill900108_29 = life6_5;
    spill900108_30 = net.minecraft.util.EnumChatFormatting.BLUE;
    spill900108_31 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_113(((moom.vB)(life12_421)).a__Int());
    java.lang.Object[] __stackOp900108_114_0 = new java.lang.Object[2];
    spill900108_32 = __stackOp900108_114_0;
    (__stackOp900108_114_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_463)));
    java.lang.Object[] __stackOp900108_117_0 = spill900108_32;
    spill900108_33 = __stackOp900108_117_0;
    (__stackOp900108_117_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_120(((java.lang.String)(((java.util.Map.Entry)(life11_417)).getKey()))))));
    ((java.util.List)(spill900108_29)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_123(spill900108_30, net.minecraft.util.StatCollector.a(((java.lang.String)(spill900108_31)), ((java.lang.Object[])(spill900108_33)))))));
    if (!((life5_10 == 0))) {
        break forest_join_429;
    }
    }
    forestValue900108_397_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_424)), ((double)(0x0.0p0d)));
    }
    if (!((life5_10 != 0))) {
        forestValue900108_428_0 = forestValue900108_397_0;
        break forest_join_428;
    }
    if (!((forestValue900108_397_0 < 0))) {
        break forest_join_429;
    }
    life15_523 = (life15_463 * -0x1.0p0d);
    spill900108_34 = life6_5;
    spill900108_35 = net.minecraft.util.EnumChatFormatting.RED;
    spill900108_36 = __sourceIntrinsic_c49c75fd3588_invokedynamic900108_128(((moom.vB)(life12_421)).a__Int());
    java.lang.Object[] __stackOp900108_129_0 = new java.lang.Object[2];
    spill900108_37 = __stackOp900108_129_0;
    (__stackOp900108_129_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_523)));
    java.lang.Object[] __stackOp900108_132_0 = spill900108_37;
    spill900108_38 = __stackOp900108_132_0;
    (__stackOp900108_132_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_135(((java.lang.String)(((java.util.Map.Entry)(life11_417)).getKey()))))));
    forestValue900108_428_0 = ((((java.util.List)(spill900108_34)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_138(spill900108_35, net.minecraft.util.StatCollector.a(((java.lang.String)(spill900108_36)), ((java.lang.Object[])(spill900108_38)))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue900108_428_0);
    }
    if (!((life5_10 == 0))) {
        continue forest_cycle_314;
    }
    break forest_cycle_314;
    }
    }
    forestValue900108_433_0 = ((((net.minecraft.item.ItemStack)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_458_0 = forestValue900108_433_0;
        break forest_join_458;
    }
    if (!((forestValue900108_433_0 != 0))) {
        break forest_join_456;
    }
    spill900108_39 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(this)).a__yw())).b__Boolean(((java.lang.String)("Unbreakable")));
    if (!((life5_10 != 0))) {
        forestValue900108_458_0 = ((spill900108_39) ? 1 : 0);
        break forest_join_458;
    }
    if (!(spill900108_39)) {
        break forest_join_456;
    }
    spill900108_40 = (life8_138 & 4);
    if (!((life5_10 != 0))) {
        forestValue900108_458_0 = spill900108_40;
        break forest_join_458;
    }
    if (!((spill900108_40 == 0))) {
        break forest_join_456;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_149(net.minecraft.util.EnumChatFormatting.BLUE, net.minecraft.util.StatCollector.a(((java.lang.String)("item.unbreakable")))))));
    }
    forestValue900108_458_0 = ((((net.minecraft.item.ItemStack)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_545_0 = forestValue900108_458_0;
        break forest_join_545;
    }
    if (!((forestValue900108_458_0 != 0))) {
        break forest_join_543;
    }
    spill900108_41 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("CanDestroy")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_154(16896, (6183324904629625500L ^ life3_3)))));
    if (!((life5_10 != 0))) {
        forestValue900108_545_0 = ((spill900108_41) ? 1 : 0);
        break forest_join_545;
    }
    if (!(spill900108_41)) {
        break forest_join_543;
    }
    spill900108_42 = (life8_138 & __sourceIntrinsic_c49c75fd3588_invokedynamic900108_157(3573, (1854014962316914020L ^ life3_3)));
    if (!((life5_10 != 0))) {
        forestValue900108_545_0 = spill900108_42;
        break forest_join_545;
    }
    if (!((spill900108_42 == 0))) {
        break forest_join_543;
    }
    life10_640 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("CanDestroy")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_159(3573, (1854014962316914020L ^ life3_3)))));
    spill900108_43 = ((net.minecraft.nbt.NBTTagList)(life10_640)).a__Int();
    if (!((life5_10 != 0))) {
        forestValue900108_545_0 = spill900108_43;
        break forest_join_545;
    }
    if (!((spill900108_43 > 0))) {
        break forest_join_543;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)("")));
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_165(net.minecraft.util.EnumChatFormatting.GRAY, net.minecraft.util.StatCollector.a(((java.lang.String)("item.canBreak")))))));
    life11_661 = 0;
    forest_cycle_511: while (true) {
    forest_join_540: {
    forest_join_535: {
    forest_join_533: {
    if (!((life11_661 < ((net.minecraft.nbt.NBTTagList)(life10_640)).a__Int()))) {
        break forest_join_543;
    }
    life12_672 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life10_640)).a__String(((int)(life11_661))))));
    if (!((life5_10 != 0))) {
        break forest_join_533;
    }
    spill900108_44 = life12_672;
    if (!((life5_10 != 0))) {
        forestValue900108_631_0 = spill900108_44;
        break forest_join_631;
    }
    if (!((spill900108_44 != null))) {
        break forest_join_535;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_172(net.minecraft.util.EnumChatFormatting.DARK_GRAY, ((net.minecraft.block.Block)(life12_672)).a__String()))));
    }
    if (!((life5_10 == 0))) {
        break forest_join_540;
    }
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_175(net.minecraft.util.EnumChatFormatting.DARK_GRAY))));
    }
    life11_661 += 1;
    if (!((life5_10 == 0))) {
        continue forest_cycle_511;
    }
    break forest_cycle_511;
    }
    }
    forestValue900108_545_0 = ((((net.minecraft.item.ItemStack)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_693_0 = forestValue900108_545_0;
        break forest_join_693;
    }
    if (!((forestValue900108_545_0 != 0))) {
        break forest_join_692;
    }
    spill900108_45 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Boolean(((java.lang.String)("CanPlaceOn")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_180(16896, (6183324904629625500L ^ life3_3)))));
    if (!((life5_10 != 0))) {
        forestValue900108_693_0 = ((spill900108_45) ? 1 : 0);
        break forest_join_693;
    }
    if (!(spill900108_45)) {
        break forest_join_692;
    }
    spill900108_46 = (life8_138 & __sourceIntrinsic_c49c75fd3588_invokedynamic900108_183(4520, (7786672651563675959L ^ life3_3)));
    if (!((life5_10 != 0))) {
        forestValue900108_693_0 = spill900108_46;
        break forest_join_693;
    }
    if (!((spill900108_46 == 0))) {
        break forest_join_692;
    }
    life10_753 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("CanPlaceOn")), ((int)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_185(3573, (1854014962316914020L ^ life3_3)))));
    spill900108_47 = ((net.minecraft.nbt.NBTTagList)(life10_753)).a__Int();
    if (!((life5_10 != 0))) {
        forestValue900108_693_0 = spill900108_47;
        break forest_join_693;
    }
    if (!((spill900108_47 > 0))) {
        break forest_join_692;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)("")));
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_191(net.minecraft.util.EnumChatFormatting.GRAY, net.minecraft.util.StatCollector.a(((java.lang.String)("item.canPlace")))))));
    life11_774 = 0;
    forest_cycle_598: while (true) {
    forest_join_627: {
    forest_join_622: {
    forest_join_620: {
    if (!((life11_774 < ((net.minecraft.nbt.NBTTagList)(life10_753)).a__Int()))) {
        break forest_join_692;
    }
    life12_785 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life10_753)).a__String(((int)(life11_774))))));
    if (!((life5_10 != 0))) {
        break forest_join_737;
    }
    if (!((life5_10 != 0))) {
        break forest_join_620;
    }
    if (!((life12_785 != null))) {
        break forest_join_622;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_198(net.minecraft.util.EnumChatFormatting.DARK_GRAY, ((net.minecraft.block.Block)(life12_785)).a__String()))));
    }
    if (!((life5_10 == 0))) {
        break forest_join_627;
    }
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_201(net.minecraft.util.EnumChatFormatting.DARK_GRAY))));
    }
    life11_774 += 1;
    if (!((life5_10 == 0))) {
        continue forest_cycle_598;
    }
    break forest_cycle_598;
    }
    break forest_join_692;
    }
    forest_cycle_631: while (true) {
    forest_join_690: {
    forest_join_664: {
    if (!((forestValue900108_631_0 != null))) {
        break forest_join_664;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_205(net.minecraft.util.EnumChatFormatting.DARK_GRAY, ((net.minecraft.block.Block)(life12_672)).a__String()))));
    forest_cycle_639: while (true) {
    forest_join_650: {
    forest_join_646: {
    if (!((life5_10 == 0))) {
        break forest_join_646;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_208(net.minecraft.util.EnumChatFormatting.DARK_GRAY))));
    }
    life11_661 += 1;
    if (!((life5_10 == 0))) {
        break forest_join_650;
    }
    break forest_join_692;
    }
    if (!((life11_661 < ((net.minecraft.nbt.NBTTagList)(life10_640)).a__Int()))) {
        break forest_join_692;
    }
    life12_672 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life10_640)).a__String(((int)(life11_661))))));
    if (!((life5_10 != 0))) {
        break forest_join_737;
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_639;
    }
    break forest_cycle_639;
    }
    break forest_join_690;
    }
    forest_cycle_664: while (true) {
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_214(net.minecraft.util.EnumChatFormatting.DARK_GRAY))));
    forest_cycle_669: while (true) {
    forest_join_687: {
    forest_join_673: {
    life11_661 += 1;
    if (!((life5_10 == 0))) {
        break forest_join_673;
    }
    break forest_join_692;
    }
    if (!((life11_661 < ((net.minecraft.nbt.NBTTagList)(life10_640)).a__Int()))) {
        break forest_join_692;
    }
    life12_672 = net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(life10_640)).a__String(((int)(life11_661))))));
    if (!((life5_10 != 0))) {
        break forest_join_737;
    }
    if (!((life5_10 != 0))) {
        break forest_join_687;
    }
    break forest_join_690;
    }
    if (!((life5_10 == 0))) {
        continue forest_cycle_669;
    }
    break forest_cycle_669;
    }
    continue forest_cycle_664;
    }
    }
    spill900108_48 = life12_672;
    forestValue900108_631_0 = spill900108_48;
    continue forest_cycle_631;
    }
    }
    forestValue900108_693_0 = ((p1) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_698_0 = forestValue900108_693_0;
        break forest_join_698;
    }
    if (!((forestValue900108_693_0 != 0))) {
        break forest_join_737;
    }
    forestValue900108_698_0 = ((((net.minecraft.item.ItemStack)(this)).d__Boolean()) ? 1 : 0);
    }
    if (!((life5_10 != 0))) {
        forestValue900108_727_0 = forestValue900108_698_0;
        break forest_join_727;
    }
    if (!((forestValue900108_698_0 != 0))) {
        break forest_join_712;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_225((((net.minecraft.item.ItemStack)(this)).d() - ((net.minecraft.item.ItemStack)(this)).b()), ((net.minecraft.item.ItemStack)(this)).d()))));
    }
    spill900108_49 = life6_5;
    if (!((life5_10 != 0))) {
        forestValue900108_738_0 = spill900108_49;
        break forest_join_738;
    }
    ((java.util.List)(spill900108_49)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_233(net.minecraft.util.EnumChatFormatting.DARK_GRAY, ((moom.DD)(((moom.DD)(((moom.DB)(net.minecraft.item.Item.a)).b(((java.lang.Object)(this.d))))))).toString()))));
    forestValue900108_727_0 = ((((net.minecraft.item.ItemStack)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((forestValue900108_727_0 != 0))) {
        break forest_join_737;
    }
    ((java.util.List)(life6_5)).add(((java.lang.Object)(__sourceIntrinsic_c49c75fd3588_invokedynamic900108_241(net.minecraft.util.EnumChatFormatting.DARK_GRAY, ((java.util.Set)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(this)).a__yw())).a__Set())).size()))));
    }
    forestValue900108_738_0 = life6_5;
    }
    return forestValue900108_738_0;
}


public net.minecraft.nbt.NBTTagList a__yz() {
net.minecraft.nbt.NBTTagCompound forwardValue5513_15_0;
    net.minecraft.nbt.NBTTagList forwardValue5513_22_0;
    net.minecraft.nbt.NBTTagCompound spill5513_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 69125775497400L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5513_0 = this.e;
    if (!((life3_5 != 0))) {
        forwardValue5513_15_0 = spill5513_0;
        break forward_join_15;
    }
    if (!((spill5513_0 == null))) {
        break forward_join_13;
    }
    forwardValue5513_22_0 = null;
    break forward_join_22;
    }
    forwardValue5513_15_0 = this.e;
    }
    forwardValue5513_22_0 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5513_15_0)).a(((java.lang.String)("ench")), ((int)(__sourceIntrinsic_95926cba30f2_invokedynamic5513_5(16380, (6156301570431406654L ^ life1_3)))));
    }
    return forwardValue5513_22_0;
}


public void a__Void() {
net.minecraft.nbt.NBTTagCompound forwardValue5509_13_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5509_26_0;
    java.lang.String forwardValue5509_26_1;
    int forwardValue5509_45_0;
    net.minecraft.item.ItemStack forwardValue5509_47_0;
    net.minecraft.nbt.NBTTagCompound spill5509_0;
    java.lang.String spill5509_1;
    boolean spill5509_2;
    net.minecraft.item.ItemStack spill5509_3;
    long life1_3;
    int life3_5;
    net.minecraft.nbt.NBTTagCompound life4_39;
    forward_join_49: {
    forward_join_47: {
    forward_join_45: {
    forward_join_26: {
    forward_join_13: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 81900290608025L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5509_0 = this.e;
    if (!((life3_5 != 0))) {
        forwardValue5509_13_0 = spill5509_0;
        break forward_join_13;
    }
    if (!((spill5509_0 != null))) {
        break forward_join_49;
    }
    forwardValue5509_13_0 = this.e;
    }
    spill5509_1 = "display";
    if (!((life3_5 != 0))) {
        forwardValue5509_26_0 = forwardValue5509_13_0;
        forwardValue5509_26_1 = spill5509_1;
        break forward_join_26;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(forwardValue5509_13_0)).a__Boolean(((java.lang.String)(spill5509_1)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic5509_5(16380, (6156393251534258463L ^ life1_3))))))) {
        break forward_join_49;
    }
    forwardValue5509_26_0 = this.e;
    forwardValue5509_26_1 = "display";
    }
    life4_39 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5509_26_0)).a__yw(((java.lang.String)(forwardValue5509_26_1)));
    ((net.minecraft.nbt.NBTTagCompound)(life4_39)).a__Void(((java.lang.String)("Name")));
    spill5509_2 = ((net.minecraft.nbt.NBTTagCompound)(life4_39)).a__Boolean();
    if (!((life3_5 != 0))) {
        forwardValue5509_45_0 = ((spill5509_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill5509_2)) {
        break forward_join_49;
    }
    ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__Void(((java.lang.String)("display")));
    spill5509_3 = this;
    if (!((life3_5 != 0))) {
        forwardValue5509_47_0 = spill5509_3;
        break forward_join_47;
    }
    forwardValue5509_45_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(spill5509_3)).e)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5509_45_0 != 0))) {
        break forward_join_49;
    }
    forwardValue5509_47_0 = this;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5509_47_0)).b(((net.minecraft.nbt.NBTTagCompound)(null)));
    }
    return;
}


public net.minecraft.item.ItemStack a(java.lang.String p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5496_18_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5496_40_0;
    java.lang.String forwardValue5496_40_1;
    net.minecraft.nbt.NBTTagCompound spill5496_0;
    java.lang.String spill5496_1;
    long life2_3;
    int life4_5;
    forward_join_40: {
    forward_join_35: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 115457328860612L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5496_0 = this.e;
    if (!((life4_5 == 0))) {
        forwardValue5496_18_0 = spill5496_0;
        break forward_join_18;
    }
    if (!((spill5496_0 == null))) {
        break forward_join_16;
    }
    this.e = ((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound()));
    }
    forwardValue5496_18_0 = this.e;
    }
    spill5496_1 = "display";
    if (!((life4_5 == 0))) {
        forwardValue5496_40_0 = forwardValue5496_18_0;
        forwardValue5496_40_1 = spill5496_1;
        break forward_join_40;
    }
    if (!((!((net.minecraft.nbt.NBTTagCompound)(forwardValue5496_18_0)).a__Boolean(((java.lang.String)(spill5496_1)), ((int)(__sourceIntrinsic_d884e91c16a2_invokedynamic5496_6(25303, (8499023310359911022L ^ life2_3)))))))) {
        break forward_join_35;
    }
    ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("display")), ((net.minecraft.nbt.NBTBase)(new net.minecraft.nbt.NBTTagCompound())));
    }
    forwardValue5496_40_0 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yw(((java.lang.String)("display")));
    forwardValue5496_40_1 = "Name";
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5496_40_0)).a(((java.lang.String)(forwardValue5496_40_1)), ((java.lang.String)(p0)));
    return this;
}


public void a(net.minecraft.item.Item p0) {
this.d = ((net.minecraft.item.Item)(p0));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
long life1_3;
    moom.CM life3_9;
    net.minecraft.util.IChatComponent life4_29;
    net.minecraft.nbt.NBTTagCompound life5_36;
    life1_3 = (net.minecraft.item.ItemStack.m ^ 17953397590487L);
    life3_9 = new moom.CM(((net.minecraft.item.ItemStack)(this)).b__String());
    if (((net.minecraft.item.ItemStack)(this)).f__Boolean()) {
        ((moom.CO)(((moom.CM)(life3_9)).a__CO())).b(((java.lang.Boolean)(java.lang.Boolean.TRUE)));
    }
    life4_29 = ((net.minecraft.util.IChatComponent)(((moom.CM)(new moom.CM("["))).a(((net.minecraft.util.IChatComponent)(life3_9))))).a(((java.lang.String)("]")));
    if ((this.d != null)) {
        life5_36 = new net.minecraft.nbt.NBTTagCompound();
        ((net.minecraft.item.ItemStack)(this)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life5_36)));
        ((moom.CO)(((net.minecraft.util.IChatComponent)(life4_29)).a__CO())).a(((moom.v3)(new moom.v3(net.minecraft.event.HoverEvent$Action.SHOW_ITEM, new moom.CM(((net.minecraft.nbt.NBTTagCompound)(life5_36)).toString())))));
        ((moom.CO)(((net.minecraft.util.IChatComponent)(life4_29)).a__CO())).a(((net.minecraft.util.EnumChatFormatting)(((net.minecraft.item.EnumRarity)(((net.minecraft.item.ItemStack)(this)).a__a3())).rarityColor)));
    }
    return life4_29;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1385;
      if (o[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = n[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.ItemStack.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11954_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.item.EnumRarity a__a3() {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a__a3(((net.minecraft.item.ItemStack)(this)));
}


public void a(net.minecraft.enchantment.Enchantment p0, int p1) {
net.minecraft.nbt.NBTTagCompound forwardValue5499_18_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5499_43_0;
    java.lang.String forwardValue5499_43_1;
    int forwardValue5499_43_2;
    net.minecraft.nbt.NBTTagCompound spill5499_0;
    java.lang.String spill5499_1;
    int spill5499_2;
    long life3_3;
    int life5_5;
    net.minecraft.nbt.NBTTagList life6_56;
    net.minecraft.nbt.NBTTagCompound life7_60;
    forward_join_43: {
    forward_join_35: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 58720918400012L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5499_0 = this.e;
    if (!((life5_5 == 0))) {
        forwardValue5499_18_0 = spill5499_0;
        break forward_join_18;
    }
    if (!((spill5499_0 == null))) {
        break forward_join_16;
    }
    ((net.minecraft.item.ItemStack)(this)).b(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())));
    }
    forwardValue5499_18_0 = this.e;
    }
    spill5499_1 = "ench";
    spill5499_2 = __sourceIntrinsic_a41a0e1dc9ae_invokedynamic5499_6(16896, (6183328470970620787L ^ life3_3));
    if (!((life5_5 == 0))) {
        forwardValue5499_43_0 = forwardValue5499_18_0;
        forwardValue5499_43_1 = spill5499_1;
        forwardValue5499_43_2 = spill5499_2;
        break forward_join_43;
    }
    if (!((!((net.minecraft.nbt.NBTTagCompound)(forwardValue5499_18_0)).a__Boolean(((java.lang.String)(spill5499_1)), ((int)(spill5499_2)))))) {
        break forward_join_35;
    }
    ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("ench")), ((net.minecraft.nbt.NBTBase)(new net.minecraft.nbt.NBTTagList())));
    }
    forwardValue5499_43_0 = this.e;
    forwardValue5499_43_1 = "ench";
    forwardValue5499_43_2 = __sourceIntrinsic_a41a0e1dc9ae_invokedynamic5499_11(16380, (6156306477596157578L ^ life3_3));
    }
    life6_56 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5499_43_0)).a(((java.lang.String)(forwardValue5499_43_1)), ((int)(forwardValue5499_43_2)));
    life7_60 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_60)).a(((java.lang.String)("id")), ((short)(((short) ((net.minecraft.enchantment.Enchantment)(p0)).C))));
    ((net.minecraft.nbt.NBTTagCompound)(life7_60)).a(((java.lang.String)("lvl")), ((short)(((short) ((byte) p1)))));
    ((net.minecraft.nbt.NBTTagList)(life6_56)).a(((net.minecraft.nbt.NBTBase)(life7_60)));
    return;
}


public void a(java.lang.String p0, net.minecraft.nbt.NBTBase p1) {
net.minecraft.nbt.NBTTagCompound forwardValue5497_18_0;
    net.minecraft.nbt.NBTTagCompound spill5497_0;
    long life3_3;
    int life5_5;
    forward_join_18: {
    forward_join_16: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 56124477669198L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5497_0 = this.e;
    if (!((life5_5 == 0))) {
        forwardValue5497_18_0 = spill5497_0;
        break forward_join_18;
    }
    if (!((spill5497_0 == null))) {
        break forward_join_16;
    }
    ((net.minecraft.item.ItemStack)(this)).b(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())));
    }
    forwardValue5497_18_0 = this.e;
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5497_18_0)).a(((java.lang.String)(p0)), ((net.minecraft.nbt.NBTBase)(p1)));
    return;
}


public void a(net.minecraft.entity.item.EntityItemFrame p0) {
this.g = ((net.minecraft.entity.item.EntityItemFrame)(p0));
    return;
}


public net.minecraft.entity.item.EntityItemFrame a__sE() {
return this.g;
}


public com.google.common.collect.Multimap<java.lang.String, moom.vB> a__Multimap() {
int forestValue28_67_0;
    int forestValue28_76_0;
    net.minecraft.item.ItemStack forestValue28_83_0;
    net.minecraft.item.ItemStack spill28_0;
    net.minecraft.item.ItemStack spill28_1;
    int spill28_2;
    long life1_3;
    int life3_5;
    com.google.common.collect.Multimap life4_31;
    net.minecraft.nbt.NBTTagList life5_41;
    int life6_43;
    net.minecraft.nbt.NBTTagCompound life7_53;
    moom.vB life8_56;
    forest_join_86: {
    forest_join_83: {
    forest_join_82: {
    forest_join_80: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 16778797573793L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill28_0 = this;
    if (!((life3_5 == 0))) {
        forestValue28_83_0 = spill28_0;
        break forest_join_83;
    }
    if (!(((net.minecraft.item.ItemStack)(spill28_0)).e__Boolean())) {
        break forest_join_82;
    }
    spill28_1 = this;
    if (!((life3_5 == 0))) {
        forestValue28_83_0 = spill28_1;
        break forest_join_83;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(spill28_1)).e)).a__Boolean(((java.lang.String)("AttributeModifiers")), ((int)(__sourceIntrinsic_5ae44f917aa9_invokedynamic28_5(16896, (6183339283403559390L ^ life1_3))))))) {
        break forest_join_82;
    }
    life4_31 = com.google.common.collect.HashMultimap.create();
    life5_41 = ((net.minecraft.nbt.NBTTagCompound)(this.e)).a(((java.lang.String)("AttributeModifiers")), ((int)(__sourceIntrinsic_5ae44f917aa9_invokedynamic28_9(16380, (6156317564905565223L ^ life1_3)))));
    life6_43 = 0;
    forest_cycle_37: while (true) {
    forest_join_78: {
    forest_join_77: {
    forest_join_76: {
    forest_join_67: {
    if (!((life6_43 < ((net.minecraft.nbt.NBTTagList)(life5_41)).a__Int()))) {
        break forest_join_80;
    }
    life7_53 = ((net.minecraft.nbt.NBTTagList)(life5_41)).a__yw(((int)(life6_43)));
    life8_56 = net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.nbt.NBTTagCompound)(life7_53)));
    if (!((life3_5 == 0))) {
        break forest_join_86;
    }
    if (!((life3_5 == 0))) {
        break forest_join_78;
    }
    if (!((life8_56 != null))) {
        break forest_join_77;
    }
    spill28_2 = recovery.source.CarrierOps.lcmp(((long)(((java.util.UUID)(((moom.vB)(life8_56)).a__UUID())).getLeastSignificantBits())), ((long)(0L)));
    if (!((life3_5 == 0))) {
        forestValue28_67_0 = spill28_2;
        break forest_join_67;
    }
    if (!((spill28_2 != 0))) {
        break forest_join_77;
    }
    forestValue28_67_0 = recovery.source.CarrierOps.lcmp(((long)(((java.util.UUID)(((moom.vB)(life8_56)).a__UUID())).getMostSignificantBits())), ((long)(0L)));
    }
    if (!((life3_5 == 0))) {
        forestValue28_76_0 = forestValue28_67_0;
        break forest_join_76;
    }
    if (!((forestValue28_67_0 != 0))) {
        break forest_join_77;
    }
    forestValue28_76_0 = ((((com.google.common.collect.Multimap)(life4_31)).put(((java.lang.Object)(((net.minecraft.nbt.NBTTagCompound)(life7_53)).a__String(((java.lang.String)("AttributeName"))))), ((java.lang.Object)(life8_56)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue28_76_0);
    }
    life6_43 += 1;
    }
    if (!((life3_5 != 0))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    if (!((life3_5 != 0))) {
        break forest_join_86;
    }
    }
    forestValue28_83_0 = this;
    }
    life4_31 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forestValue28_83_0)).a__wQ())).a__Multimap();
    }
    return life4_31;
}


public void a__Void(int p0) {
net.minecraft.item.ItemStack forwardValue5510_15_0;
    boolean spill5510_0;
    net.minecraft.item.ItemStack spill5510_1;
    long life2_3;
    int life4_8;
    forward_join_17: {
    forward_join_15: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 118976723071792L);
    spill5510_0 = net.minecraft.item.ItemStack.l();
    this.f = ((int)(p0));
    life4_8 = ((spill5510_0) ? 1 : 0);
    spill5510_1 = this;
    if (!((life4_8 == 0))) {
        forwardValue5510_15_0 = spill5510_1;
        break forward_join_15;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5510_1)).f < 0))) {
        break forward_join_17;
    }
    forwardValue5510_15_0 = this;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5510_15_0)).f = ((int)(0));
    }
    return;
}


public boolean a__Boolean() {
int forwardValue5506_14_0;
    int forwardValue5506_23_0;
    int forwardValue5506_25_0;
    int spill5506_0;
    boolean spill5506_1;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 25845643085553L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5506_0 = ((net.minecraft.item.ItemStack)(this)).a();
    if (!((life3_5 == 0))) {
        forwardValue5506_14_0 = spill5506_0;
        break forward_join_14;
    }
    if (!((spill5506_0 > 1))) {
        break forward_join_24;
    }
    forwardValue5506_14_0 = ((((net.minecraft.item.ItemStack)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue5506_23_0 = forwardValue5506_14_0;
        break forward_join_23;
    }
    if (!((forwardValue5506_14_0 != 0))) {
        break forward_join_22;
    }
    spill5506_1 = ((net.minecraft.item.ItemStack)(this)).d__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue5506_23_0 = ((spill5506_1) ? 1 : 0);
        break forward_join_23;
    }
    if (!((!spill5506_1))) {
        break forward_join_24;
    }
    }
    forwardValue5506_23_0 = 1;
    }
    forwardValue5506_25_0 = forwardValue5506_23_0;
    break forward_join_25;
    }
    forwardValue5506_25_0 = 0;
    }
    return ((forwardValue5506_25_0) != 0);
}


public int a() {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a();
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5511_57_0;
    net.minecraft.item.Item forwardValue5511_70_0;
    int spill5511_0;
    net.minecraft.item.Item spill5511_1;
    long life2_3;
    int life4_5;
    forward_join_74: {
    forward_join_70: {
    forward_join_57: {
    forward_join_49: {
    forward_join_31: {
    forward_join_25: {
    forward_join_23: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 89874074456686L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    if (!((life4_5 == 0))) {
        break forward_join_23;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("id")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic5511_3(3573, (1853971608102677225L ^ life2_3))))))) {
        break forward_join_25;
    }
    this.d = ((net.minecraft.item.Item)(net.minecraft.item.Item.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("id"))))))));
    }
    if (!((life4_5 != 0))) {
        break forward_join_31;
    }
    }
    this.d = ((net.minecraft.item.Item)(net.minecraft.item.Item.a__wQ(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("id"))))))));
    }
    this.b = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Count")))));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Damage")))));
    spill5511_0 = this.f;
    if (!((life4_5 == 0))) {
        forwardValue5511_57_0 = spill5511_0;
        break forward_join_57;
    }
    if (!((spill5511_0 < 0))) {
        break forward_join_49;
    }
    this.f = ((int)(0));
    }
    forwardValue5511_57_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("tag")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic5511_17(16380, (6156417163419523304L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5511_57_0 != 0))) {
        break forward_join_74;
    }
    this.e = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("tag")))));
    spill5511_1 = this.d;
    if (!((life4_5 == 0))) {
        forwardValue5511_70_0 = spill5511_1;
        break forward_join_70;
    }
    if (!((spill5511_1 != null))) {
        break forward_join_74;
    }
    forwardValue5511_70_0 = this.d;
    }
    ((net.minecraft.item.Item)(forwardValue5511_70_0)).a(((net.minecraft.nbt.NBTTagCompound)(this.e)));
    }
    return;
}


public void a(net.minecraft.world.World p0, net.minecraft.block.Block p1, moom.DT p2, net.minecraft.entity.player.EntityPlayer p3) {
long local5 = (net.minecraft.item.ItemStack.m ^ 86948625652153L);
    int local7 = __sourceIntrinsic_booleanToInteger(((net.minecraft.item.Item)(this.d)).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.block.Block)(p1)), ((moom.DT)(p2)), ((net.minecraft.entity.EntityLivingBase)(p3))));
    if ((local7 != 0)) {
        ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)))])));
    }
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.player.EntityPlayer p1) {
long local3 = (net.minecraft.item.ItemStack.m ^ 87849777891664L);
    int local5 = __sourceIntrinsic_booleanToInteger(((net.minecraft.item.Item)(this.d)).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.entity.EntityLivingBase)(p0)), ((net.minecraft.entity.EntityLivingBase)(p1))));
    if ((local5 != 0)) {
        ((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)))])));
    }
    return;
}


public void a(int p0, net.minecraft.entity.EntityLivingBase p1) {
int forwardValue5495_20_0;
    int forwardValue5495_28_0;
    int forwardValue5495_42_0;
    int forwardValue5495_72_0;
    net.minecraft.item.ItemStack forwardValue5495_77_0;
    int spill5495_0;
    boolean spill5495_1;
    int spill5495_2;
    int spill5495_3;
    net.minecraft.item.ItemStack spill5495_4;
    long life3_3;
    int life5_5;
    net.minecraft.entity.player.EntityPlayer life6_74;
    forward_join_79: {
    forward_join_77: {
    forward_join_76: {
    forward_join_72: {
    forward_join_68: {
    forward_join_42: {
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 66735628060564L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5495_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5495_20_0 = spill5495_0;
        break forward_join_20;
    }
    if (!((spill5495_0 != 0))) {
        break forward_join_18;
    }
    spill5495_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p1)))).b1)).d;
    if (!((life5_5 != 0))) {
        forwardValue5495_20_0 = ((spill5495_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5495_1))) {
        break forward_join_79;
    }
    }
    forwardValue5495_20_0 = ((((net.minecraft.item.ItemStack)(this)).b__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5495_28_0 = forwardValue5495_20_0;
        break forward_join_28;
    }
    if (!((forwardValue5495_20_0 != 0))) {
        break forward_join_79;
    }
    forwardValue5495_28_0 = ((((net.minecraft.item.ItemStack)(this)).a(((int)(p0)), ((java.util.Random)(((net.minecraft.entity.EntityLivingBase)(p1)).a__Random())))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5495_42_0 = forwardValue5495_28_0;
        break forward_join_42;
    }
    if (!((forwardValue5495_28_0 != 0))) {
        break forward_join_79;
    }
    ((net.minecraft.entity.EntityLivingBase)(p1)).b(((net.minecraft.item.ItemStack)(this)));
    net.minecraft.item.ItemStack __stackOp5495_14_0 = this;
    ((net.minecraft.item.ItemStack)(__stackOp5495_14_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5495_14_0)).b - 1)));
    forwardValue5495_42_0 = ((p1 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5495_72_0 = forwardValue5495_42_0;
        break forward_join_72;
    }
    if (!((forwardValue5495_42_0 != 0))) {
        break forward_join_68;
    }
    life6_74 = ((net.minecraft.entity.player.EntityPlayer)(p1));
    ((net.minecraft.entity.player.EntityPlayer)(life6_74)).a(((moom.BY)((net.minecraft.stats.StatList.ae)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)))])));
    spill5495_2 = this.b;
    if (!((life5_5 != 0))) {
        forwardValue5495_72_0 = spill5495_2;
        break forward_join_72;
    }
    if (!((spill5495_2 == 0))) {
        break forward_join_68;
    }
    spill5495_3 = ((((net.minecraft.item.ItemStack)(this)).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    if (!((life5_5 != 0))) {
        forwardValue5495_72_0 = spill5495_3;
        break forward_join_72;
    }
    if (!((spill5495_3 != 0))) {
        break forward_join_68;
    }
    ((net.minecraft.entity.player.EntityPlayer)(life6_74)).R();
    }
    spill5495_4 = this;
    if (!((life5_5 != 0))) {
        forwardValue5495_77_0 = spill5495_4;
        break forward_join_77;
    }
    forwardValue5495_72_0 = ((net.minecraft.item.ItemStack)(spill5495_4)).b;
    }
    if (!((forwardValue5495_72_0 < 0))) {
        break forward_join_76;
    }
    this.b = ((int)(0));
    }
    forwardValue5495_77_0 = this;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5495_77_0)).f = ((int)(0));
    }
    return;
}


public boolean a(int p0, java.util.Random p1) {
int lexicalValue1632_14_0;
    int lexicalValue1632_46_0;
    int lexicalValue1632_46_1;
    int lexicalValue1632_62_0;
    int lexicalValue1632_68_0;
    int lexicalValue1632_70_0;
    boolean spill1632_0;
    int spill1632_1;
    int spill1632_2;
    int spill1632_3;
    long life3_3;
    int life5_5;
    int life6_29;
    int life7_31;
    int life8_33;
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_62: {
    lexical_join_54: {
    lexical_join_46: {
    lexical_join_44: {
    lexical_join_14: {
    lexical_join_13: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 20908816294469L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill1632_0 = ((net.minecraft.item.ItemStack)(this)).b__Boolean();
    if (!((life5_5 != 0))) {
        lexicalValue1632_14_0 = ((spill1632_0) ? 1 : 0);
        break lexical_join_14;
    }
    if (!((!spill1632_0))) {
        break lexical_join_13;
    }
    return ((0) != 0);
    }
    lexicalValue1632_14_0 = p0;
    }
    if (!((life5_5 != 0))) {
        lexicalValue1632_62_0 = lexicalValue1632_14_0;
        break lexical_join_62;
    }
    if (!((lexicalValue1632_14_0 > 0))) {
        break lexical_join_54;
    }
    life6_29 = moom.rV.a(((int)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.u)).C)), ((net.minecraft.item.ItemStack)(this)));
    life7_31 = 0;
    life8_33 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_41: {
    if (!((life6_29 > 0))) {
        break lexical_join_44;
    }
    spill1632_1 = life8_33;
    spill1632_2 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1632_46_0 = spill1632_1;
        lexicalValue1632_46_1 = spill1632_2;
        break lexical_join_46;
    }
    if (!((life5_5 != 0))) {
        lexicalValue1632_46_0 = spill1632_1;
        lexicalValue1632_46_1 = spill1632_2;
        break lexical_join_46;
    }
    if (!((spill1632_1 < spill1632_2))) {
        break lexical_join_44;
    }
    if (!(moom.rK.a(((net.minecraft.item.ItemStack)(this)), ((int)(life6_29)), ((java.util.Random)(p1))))) {
        break lexical_join_41;
    }
    life7_31 += 1;
    }
    life8_33 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    lexicalValue1632_46_0 = p0;
    lexicalValue1632_46_1 = life7_31;
    }
    p0 = (lexicalValue1632_46_0 - lexicalValue1632_46_1);
    spill1632_3 = p0;
    if (!((life5_5 != 0))) {
        lexicalValue1632_62_0 = spill1632_3;
        break lexical_join_62;
    }
    if (!((spill1632_3 <= 0))) {
        break lexical_join_54;
    }
    return ((0) != 0);
    }
    net.minecraft.item.ItemStack __stackOp1632_11_0 = this;
    ((net.minecraft.item.ItemStack)(__stackOp1632_11_0)).f = ((int)((((net.minecraft.item.ItemStack)(__stackOp1632_11_0)).f + p0)));
    lexicalValue1632_62_0 = this.f;
    }
    if (!((life5_5 != 0))) {
        lexicalValue1632_68_0 = lexicalValue1632_62_0;
        break lexical_join_68;
    }
    if (!((lexicalValue1632_62_0 > ((net.minecraft.item.ItemStack)(this)).d()))) {
        break lexical_join_69;
    }
    lexicalValue1632_68_0 = 1;
    }
    lexicalValue1632_70_0 = lexicalValue1632_68_0;
    break lexical_join_70;
    }
    lexicalValue1632_70_0 = 0;
    }
    return ((lexicalValue1632_70_0) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, moom.DT p2, moom.bs p3, float p4, float p5, float p6) {
int forwardValue5500_30_0;
    boolean spill5500_0;
    int spill5500_1;
    long life8_3;
    int life11_16;
    int life10_17;
    forward_join_30: {
    forward_join_29: {
    life8_3 = (net.minecraft.item.ItemStack.m ^ 113269928945529L);
    spill5500_0 = net.minecraft.item.ItemStack.m();
    life11_16 = ((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p2)), ((moom.bs)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)))) ? 1 : 0);
    life10_17 = ((spill5500_0) ? 1 : 0);
    spill5500_1 = life11_16;
    if (!((life10_17 != 0))) {
        forwardValue5500_30_0 = spill5500_1;
        break forward_join_30;
    }
    if (!((spill5500_1 != 0))) {
        break forward_join_29;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)))])));
    }
    forwardValue5500_30_0 = life11_16;
    }
    return ((forwardValue5500_30_0) != 0);
}


public net.minecraft.item.Item a__wQ() {
return this.d;
}


public net.minecraft.item.ItemStack a(int p0) {
net.minecraft.item.ItemStack forwardValue5493_33_0;
    boolean spill5493_0;
    net.minecraft.item.ItemStack spill5493_1;
    long life2_3;
    net.minecraft.item.ItemStack life5_13;
    int life4_14;
    forward_join_33: {
    forward_join_26: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 89978347357565L);
    spill5493_0 = net.minecraft.item.ItemStack.m();
    life5_13 = new net.minecraft.item.ItemStack(this.d, p0, this.f);
    life4_14 = ((spill5493_0) ? 1 : 0);
    spill5493_1 = this;
    if (!((life4_14 != 0))) {
        forwardValue5493_33_0 = spill5493_1;
        break forward_join_33;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5493_1)).e != null))) {
        break forward_join_26;
    }
    ((net.minecraft.item.ItemStack)(life5_13)).e = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yn()))));
    }
    net.minecraft.item.ItemStack __stackOp5493_10_0 = this;
    ((net.minecraft.item.ItemStack)(__stackOp5493_10_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5493_10_0)).b - p0)));
    forwardValue5493_33_0 = life5_13;
    }
    return forwardValue5493_33_0;
}


public static net.minecraft.item.ItemStack a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.item.ItemStack forwardValue5504_19_0;
    net.minecraft.item.ItemStack forwardValue5504_21_0;
    boolean spill5504_0;
    net.minecraft.item.ItemStack spill5504_1;
    long life1_3;
    net.minecraft.item.ItemStack life4_7;
    int life3_12;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 75689956371046L);
    life4_7 = new net.minecraft.item.ItemStack();
    spill5504_0 = net.minecraft.item.ItemStack.m();
    ((net.minecraft.item.ItemStack)(life4_7)).a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life3_12 = ((spill5504_0) ? 1 : 0);
    spill5504_1 = life4_7;
    if (!((life3_12 != 0))) {
        forwardValue5504_19_0 = spill5504_1;
        break forward_join_19;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5504_1)).a__wQ() != null))) {
        break forward_join_20;
    }
    forwardValue5504_19_0 = life4_7;
    }
    forwardValue5504_21_0 = forwardValue5504_19_0;
    break forward_join_21;
    }
    forwardValue5504_21_0 = null;
    }
    return forwardValue5504_21_0;
}


public float a(net.minecraft.block.Block p0) {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.block.Block)(p0)));
}


public net.minecraft.item.ItemStack a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1) {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)));
}


public net.minecraft.nbt.NBTTagCompound a__yw(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5512_20_0;
    java.lang.String forwardValue5512_20_1;
    net.minecraft.nbt.NBTTagCompound forwardValue5512_21_0;
    java.lang.String forwardValue5512_21_1;
    moom.DD forwardValue5512_21_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5512_22_0;
    java.lang.String forwardValue5512_22_1;
    java.lang.String forwardValue5512_22_2;
    net.minecraft.nbt.NBTTagCompound forwardValue5512_46_0;
    boolean spill5512_0;
    net.minecraft.nbt.NBTTagCompound spill5512_1;
    java.lang.String spill5512_2;
    moom.DD spill5512_3;
    net.minecraft.nbt.NBTTagCompound spill5512_4;
    long life2_3;
    moom.DD life5_10;
    int life4_11;
    forward_join_46: {
    forward_join_45: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 85637773795379L);
    spill5512_0 = net.minecraft.item.ItemStack.m();
    life5_10 = ((moom.DD)(((moom.DB)(net.minecraft.item.Item.a)).b(((java.lang.Object)(this.d)))));
    life4_11 = ((spill5512_0) ? 1 : 0);
    spill5512_1 = p0;
    spill5512_2 = "id";
    spill5512_3 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue5512_21_0 = spill5512_1;
        forwardValue5512_21_1 = spill5512_2;
        forwardValue5512_21_2 = spill5512_3;
        break forward_join_21;
    }
    if (!((spill5512_3 == null))) {
        forwardValue5512_20_0 = spill5512_1;
        forwardValue5512_20_1 = spill5512_2;
        break forward_join_20;
    }
    forwardValue5512_22_0 = spill5512_1;
    forwardValue5512_22_1 = spill5512_2;
    forwardValue5512_22_2 = "minecraft:air";
    break forward_join_22;
    }
    forwardValue5512_21_0 = forwardValue5512_20_0;
    forwardValue5512_21_1 = forwardValue5512_20_1;
    forwardValue5512_21_2 = life5_10;
    }
    forwardValue5512_22_0 = forwardValue5512_21_0;
    forwardValue5512_22_1 = forwardValue5512_21_1;
    forwardValue5512_22_2 = ((moom.DD)(forwardValue5512_21_2)).toString();
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5512_22_0)).a(((java.lang.String)(forwardValue5512_22_1)), ((java.lang.String)(forwardValue5512_22_2)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Count")), ((byte)(((byte) this.b))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Damage")), ((short)(((short) this.f))));
    spill5512_4 = this.e;
    if (!((life4_11 != 0))) {
        forwardValue5512_46_0 = spill5512_4;
        break forward_join_46;
    }
    if (!((spill5512_4 != null))) {
        break forward_join_45;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("tag")), ((net.minecraft.nbt.NBTBase)(this.e)));
    }
    forwardValue5512_46_0 = p0;
    }
    return forwardValue5512_46_0;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, int p2, boolean p3) {
net.minecraft.item.ItemStack forwardValue5505_18_0;
    net.minecraft.item.ItemStack spill5505_0;
    long life5_3;
    int life7_5;
    forward_join_18: {
    forward_join_17: {
    life5_3 = (net.minecraft.item.ItemStack.m ^ 122135500142094L);
    life7_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5505_0 = this;
    if (!((life7_5 == 0))) {
        forwardValue5505_18_0 = spill5505_0;
        break forward_join_18;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5505_0)).c > 0))) {
        break forward_join_17;
    }
    net.minecraft.item.ItemStack __stackOp5505_4_0 = this;
    ((net.minecraft.item.ItemStack)(__stackOp5505_4_0)).c = ((int)((((net.minecraft.item.ItemStack)(__stackOp5505_4_0)).c - 1)));
    }
    forwardValue5505_18_0 = this;
    }
    ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(forwardValue5505_18_0)).d)).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.entity.Entity)(p1)), ((int)(p2)), ((boolean)(p3)));
    return;
}


public static net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5502_13_0;
    net.minecraft.item.ItemStack forwardValue5502_14_0;
    net.minecraft.item.ItemStack spill5502_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.item.ItemStack.m ^ 116849640799283L);
    life3_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5502_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue5502_13_0 = spill5502_0;
        break forward_join_13;
    }
    if (!((spill5502_0 == null))) {
        break forward_join_12;
    }
    forwardValue5502_14_0 = null;
    break forward_join_14;
    }
    forwardValue5502_13_0 = p0;
    }
    forwardValue5502_14_0 = ((net.minecraft.item.ItemStack)(forwardValue5502_13_0)).a__xW();
    }
    return forwardValue5502_14_0;
}


public net.minecraft.nbt.NBTTagCompound a(java.lang.String p0, boolean p1) {
net.minecraft.nbt.NBTTagCompound forwardValue5498_13_0;
    int forwardValue5498_29_0;
    net.minecraft.nbt.NBTTagCompound spill5498_0;
    boolean spill5498_1;
    long life3_3;
    int life5_5;
    net.minecraft.nbt.NBTTagCompound life6_44;
    forward_join_40: {
    forward_join_29: {
    forward_join_28: {
    forward_join_13: {
    life3_3 = (net.minecraft.item.ItemStack.m ^ 13888331638071L);
    life5_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5498_0 = this.e;
    if (!((life5_5 != 0))) {
        forwardValue5498_13_0 = spill5498_0;
        break forward_join_13;
    }
    if (!((spill5498_0 != null))) {
        break forward_join_28;
    }
    forwardValue5498_13_0 = this.e;
    }
    spill5498_1 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5498_13_0)).a__Boolean(((java.lang.String)(p0)), ((int)(__sourceIntrinsic_38af97430f56_invokedynamic5498_5(16380, (6156317156467781553L ^ life3_3)))));
    if (!((life5_5 != 0))) {
        forwardValue5498_29_0 = ((spill5498_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill5498_1)) {
        break forward_join_28;
    }
    return ((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yw(((java.lang.String)(p0)));
    }
    forwardValue5498_29_0 = ((p1) ? 1 : 0);
    }
    if (!((forwardValue5498_29_0 != 0))) {
        break forward_join_40;
    }
    life6_44 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.item.ItemStack)(this)).a(((java.lang.String)(p0)), ((net.minecraft.nbt.NBTBase)(life6_44)));
    return life6_44;
    }
    return null;
}


public java.lang.String a__String() {
return ((net.minecraft.item.Item)(this.d)).b__String(((net.minecraft.item.ItemStack)(this)));
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, int p2) {
((net.minecraft.entity.player.EntityPlayer)(p1)).a(((moom.BY)((net.minecraft.stats.StatList.ac)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this.d)))])), ((int)(p2)));
    ((net.minecraft.item.Item)(this.d)).a__Void(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)));
    return;
}


public moom.a1 a__a1() {
return ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).a__a1(((net.minecraft.item.ItemStack)(this)));
}


public net.minecraft.nbt.NBTTagCompound a__yw() {
return this.e;
}


public boolean a__Boolean(net.minecraft.block.Block p0) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.Item)(this.d)).a__Boolean(((net.minecraft.block.Block)(p0))))) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.EntityLivingBase p1) {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.Item)(this.d)).a(((net.minecraft.item.ItemStack)(this)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.entity.EntityLivingBase)(p1))))) != 0);
}


public net.minecraft.item.ItemStack a__xW() {
long local1 = (net.minecraft.item.ItemStack.m ^ 18812599031920L);
    net.minecraft.item.ItemStack local3 = new net.minecraft.item.ItemStack(this.d, this.b, this.f);
    if ((this.e != null)) {
        ((net.minecraft.item.ItemStack)(local3)).e = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(this.e)).a__yn()))));
    }
    return local3;
}


public static boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5503_15_0;
    net.minecraft.item.ItemStack forwardValue5503_19_0;
    net.minecraft.item.ItemStack forwardValue5503_23_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5503_34_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5503_39_0;
    int forwardValue5503_46_0;
    int forwardValue5503_48_0;
    net.minecraft.item.ItemStack spill5503_0;
    net.minecraft.item.ItemStack spill5503_1;
    net.minecraft.nbt.NBTTagCompound spill5503_2;
    net.minecraft.nbt.NBTTagCompound spill5503_3;
    boolean spill5503_4;
    long life2_3;
    int life4_5;
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_39: {
    forward_join_34: {
    forward_join_32: {
    forward_join_23: {
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 135654783849769L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5503_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5503_15_0 = spill5503_0;
        break forward_join_15;
    }
    if (!((spill5503_0 == null))) {
        break forward_join_14;
    }
    spill5503_1 = p1;
    if (!((life4_5 != 0))) {
        forwardValue5503_15_0 = spill5503_1;
        break forward_join_15;
    }
    if (!((spill5503_1 != null))) {
        break forward_join_45;
    }
    }
    forwardValue5503_15_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue5503_19_0 = forwardValue5503_15_0;
        break forward_join_19;
    }
    if (!((forwardValue5503_15_0 != null))) {
        break forward_join_47;
    }
    forwardValue5503_19_0 = p1;
    }
    if (!((life4_5 != 0))) {
        forwardValue5503_23_0 = forwardValue5503_19_0;
        break forward_join_23;
    }
    if (!((forwardValue5503_19_0 != null))) {
        break forward_join_47;
    }
    forwardValue5503_23_0 = p0;
    }
    spill5503_2 = ((net.minecraft.item.ItemStack)(forwardValue5503_23_0)).e;
    if (!((life4_5 != 0))) {
        forwardValue5503_34_0 = spill5503_2;
        break forward_join_34;
    }
    if (!((spill5503_2 == null))) {
        break forward_join_32;
    }
    spill5503_3 = ((net.minecraft.item.ItemStack)(p1)).e;
    if (!((life4_5 != 0))) {
        forwardValue5503_34_0 = spill5503_3;
        break forward_join_34;
    }
    if (!((spill5503_3 == null))) {
        break forward_join_47;
    }
    }
    forwardValue5503_34_0 = ((net.minecraft.item.ItemStack)(p0)).e;
    }
    if (!((life4_5 != 0))) {
        forwardValue5503_39_0 = forwardValue5503_34_0;
        break forward_join_39;
    }
    if (!((forwardValue5503_34_0 != null))) {
        break forward_join_45;
    }
    forwardValue5503_39_0 = ((net.minecraft.item.ItemStack)(p0)).e;
    }
    spill5503_4 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5503_39_0)).equals(((java.lang.Object)(((net.minecraft.item.ItemStack)(p1)).e)));
    if (!((life4_5 != 0))) {
        forwardValue5503_46_0 = ((spill5503_4) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill5503_4)) {
        break forward_join_47;
    }
    }
    forwardValue5503_46_0 = 1;
    }
    forwardValue5503_48_0 = forwardValue5503_46_0;
    break forward_join_48;
    }
    forwardValue5503_48_0 = 0;
    }
    return ((forwardValue5503_48_0) != 0);
}


private boolean a__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5507_14_0;
    net.minecraft.item.ItemStack forwardValue5507_21_0;
    net.minecraft.item.ItemStack forwardValue5507_28_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5507_39_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5507_44_0;
    int forwardValue5507_51_0;
    int forwardValue5507_53_0;
    net.minecraft.item.ItemStack spill5507_0;
    net.minecraft.nbt.NBTTagCompound spill5507_1;
    net.minecraft.nbt.NBTTagCompound spill5507_2;
    boolean spill5507_3;
    long life2_3;
    int life4_5;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_44: {
    forward_join_39: {
    forward_join_37: {
    forward_join_28: {
    forward_join_21: {
    forward_join_14: {
    life2_3 = (net.minecraft.item.ItemStack.m ^ 85939516588498L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5507_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue5507_14_0 = spill5507_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5507_0)).b == ((net.minecraft.item.ItemStack)(p0)).b))) {
        break forward_join_52;
    }
    forwardValue5507_14_0 = this;
    }
    if (!((life4_5 != 0))) {
        forwardValue5507_21_0 = forwardValue5507_14_0;
        break forward_join_21;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5507_14_0)).d == ((net.minecraft.item.ItemStack)(p0)).d))) {
        break forward_join_52;
    }
    forwardValue5507_21_0 = this;
    }
    if (!((life4_5 != 0))) {
        forwardValue5507_28_0 = forwardValue5507_21_0;
        break forward_join_28;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5507_21_0)).f == ((net.minecraft.item.ItemStack)(p0)).f))) {
        break forward_join_52;
    }
    forwardValue5507_28_0 = this;
    }
    spill5507_1 = ((net.minecraft.item.ItemStack)(forwardValue5507_28_0)).e;
    if (!((life4_5 != 0))) {
        forwardValue5507_39_0 = spill5507_1;
        break forward_join_39;
    }
    if (!((spill5507_1 == null))) {
        break forward_join_37;
    }
    spill5507_2 = ((net.minecraft.item.ItemStack)(p0)).e;
    if (!((life4_5 != 0))) {
        forwardValue5507_39_0 = spill5507_2;
        break forward_join_39;
    }
    if (!((spill5507_2 == null))) {
        break forward_join_52;
    }
    }
    forwardValue5507_39_0 = this.e;
    }
    if (!((life4_5 != 0))) {
        forwardValue5507_44_0 = forwardValue5507_39_0;
        break forward_join_44;
    }
    if (!((forwardValue5507_39_0 != null))) {
        break forward_join_50;
    }
    forwardValue5507_44_0 = this.e;
    }
    spill5507_3 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5507_44_0)).equals(((java.lang.Object)(((net.minecraft.item.ItemStack)(p0)).e)));
    if (!((life4_5 != 0))) {
        forwardValue5507_51_0 = ((spill5507_3) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill5507_3)) {
        break forward_join_52;
    }
    }
    forwardValue5507_51_0 = 1;
    }
    forwardValue5507_53_0 = forwardValue5507_51_0;
    break forward_join_53;
    }
    forwardValue5507_53_0 = 0;
    }
    return ((forwardValue5507_53_0) != 0);
}


public static boolean m() {
int local0 = __sourceIntrinsic_booleanToInteger(net.minecraft.item.ItemStack.l());
    if ((local0 == 0)) {
        return ((1) != 0);
    }
    return ((0) != 0);
}


public boolean k() {
long local1 = (net.minecraft.item.ItemStack.m ^ 13264038082117L);
    return ((((this.g != null) ? 1 : 0)) != 0);
}


public boolean g() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).b__Boolean(((net.minecraft.item.ItemStack)(this))))) != 0);
}


public boolean j() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(this)).a__wQ())).h())) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_d884e91c16a2_invokedynamic5496_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_38af97430f56_invokedynamic5498_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11954_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a41a0e1dc9ae_invokedynamic5499_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a41a0e1dc9ae_invokedynamic5499_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_8(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_10(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_13(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_29(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_35(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_72(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_76(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_83(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_90(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_113(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_120(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_123(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_128(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_135(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_138(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_149(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_165(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_172(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_175(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c49c75fd3588_invokedynamic900108_185(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_191(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_198(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_201(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_205(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_208(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_214(net.minecraft.util.EnumChatFormatting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_225(int a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_233(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c49c75fd3588_invokedynamic900108_241(net.minecraft.util.EnumChatFormatting a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ae44f917aa9_invokedynamic28_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ae44f917aa9_invokedynamic28_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic5509_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic5511_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic5511_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95926cba30f2_invokedynamic5513_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac90f16927f6_invokedynamic1635_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac90f16927f6_invokedynamic1635_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1398b4921c0_invokedynamic5519_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d1398b4921c0_invokedynamic5519_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf46119e52dd_invokedynamic1636_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bf46119e52dd_invokedynamic1636_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee4adb14eef0_invokedynamic5524_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ee4adb14eef0_invokedynamic5524_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_42b3a0d41be4_invokedynamic5526_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite2026_4(int a0, java.lang.String a1, int a2) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
