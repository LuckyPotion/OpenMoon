package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Cp extends moom.Ci implements net.minecraft.tileentity.IHopper, net.minecraft.util.ITickable {

private net.minecraft.item.ItemStack[] n;

private java.lang.String o;

private int p;

private static final long q;

private static final long[] r;

private static final java.lang.Integer[] s;

private static final java.util.Map t;

public Cp() {
super();
    this.n = new net.minecraft.item.ItemStack[5];
    this.p = -1;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(8876491205923973516L)), ((long)(804674188403192376L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(9295953832312L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Cp.q ^ 64041919169748L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill682_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill682_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill682_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill682_14 = new byte[8];
    (__sourceSpill682_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill682_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation682_16 = __sourceSpill682_14;
    ((javax.crypto.Cipher)(__sourceSpill682_11)).init(((int)(__sourceSpill682_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill682_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation682_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ç?r<`Ï­¯(æü^\003"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill682_25 = local6_life21;
        int __sourceSpill682_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill682_25)).substring(((int)(__sourceSpill682_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill682_30 = local8_life19;
        int __sourceSpill682_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill682_33 = new byte[8];
        (__sourceSpill682_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill682_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill682_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill682_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill682_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill682_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill682_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill682_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill682_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill682_34)).doFinal(((byte[])(__sourceSpill682_33)));
        (__sourceSpill682_30)[__sourceSpill682_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "sÄÜxt'ï±M·)Ò*"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill682_38 = local6_life21;
        int __sourceSpill682_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill682_38)).substring(((int)(__sourceSpill682_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill682_43 = local8_life19;
        int __sourceSpill682_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill682_46 = new byte[8];
        (__sourceSpill682_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill682_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill682_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill682_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill682_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill682_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill682_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill682_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill682_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill682_47)).doFinal(((byte[])(__sourceSpill682_46)));
        (__sourceSpill682_43)[__sourceSpill682_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    r = ((long[])(local8_life19));
    s = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private boolean i() {
java.lang.String[] spill544_0;
    long life1_3;
    net.minecraft.item.ItemStack[] life4_7;
    int life5_10;
    java.lang.String[] life3_11;
    int life6_13;
    net.minecraft.item.ItemStack life7_20;
    lexical_join_30: {
    life1_3 = (moom.Cp.q ^ 17663932409846L);
    spill544_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = this.n;
    life5_10 = (life4_7).length;
    life3_11 = spill544_0;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_28: {
    lexical_join_27: {
    if (!((life6_13 < life5_10))) {
        break lexical_join_30;
    }
    life7_20 = (life4_7)[life6_13];
    if (!((life3_11 != null))) {
        break lexical_join_28;
    }
    if (!((life7_20 != null))) {
        break lexical_join_27;
    }
    return ((0) != 0);
    }
    life6_13 += 1;
    }
    if (!((life3_11 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return ((1) != 0);
}


private static boolean b(net.minecraft.inventory.IInventory p0, net.minecraft.item.ItemStack p1, int p2, moom.bs p3) {
int forwardValue1662_21_0;
    int forwardValue1662_23_0;
    int spill1662_0;
    boolean spill1662_1;
    long life4_3;
    java.lang.String[] life6_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life4_3 = (moom.Cp.q ^ 31887340575083L);
    life6_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1662_0 = ((p0 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    if (!((life6_5 != null))) {
        forwardValue1662_21_0 = spill1662_0;
        break forward_join_21;
    }
    if (!((spill1662_0 != 0))) {
        break forward_join_20;
    }
    spill1662_1 = ((net.minecraft.inventory.ISidedInventory)(((net.minecraft.inventory.ISidedInventory)(p0)))).b(((int)(p2)), ((net.minecraft.item.ItemStack)(p1)), ((moom.bs)(p3)));
    if (!((life6_5 != null))) {
        forwardValue1662_21_0 = ((spill1662_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill1662_1)) {
        break forward_join_22;
    }
    }
    forwardValue1662_21_0 = 1;
    }
    forwardValue1662_23_0 = forwardValue1662_21_0;
    break forward_join_23;
    }
    forwardValue1662_23_0 = 0;
    }
    return ((forwardValue1662_23_0) != 0);
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.n)), ((java.lang.Object)(null)));
    return;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public double b__sourceReturn_fedcb3e4d3() {
return (((double) ((moom.DT)(((moom.Cp)(this)).e)).b()) + 0x1.0p-1d);
}


private static boolean b(net.minecraft.inventory.IInventory p0, moom.bs p1) {
int lexicalValue542_49_0;
    int spill542_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.inventory.ISidedInventory life5_16;
    int[] life6_20;
    int[] life7_22;
    int life8_25;
    int life9_27;
    int life10_34;
    int life6_63;
    int life7_65;
    lexical_join_64: {
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_45: {
    life2_3 = (moom.Cp.q ^ 72555027567016L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill542_0 = ((p0 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    if (!((life4_5 != null))) {
        lexicalValue542_49_0 = spill542_0;
        break lexical_join_49;
    }
    if (!((spill542_0 != 0))) {
        break lexical_join_47;
    }
    life5_16 = ((net.minecraft.inventory.ISidedInventory)(p0));
    life6_20 = ((net.minecraft.inventory.ISidedInventory)(life5_16)).a(((moom.bs)(p1)));
    life7_22 = life6_20;
    life8_25 = (life7_22).length;
    life9_27 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life9_27 < life8_25))) {
        break lexical_join_45;
    }
    life10_34 = (life7_22)[life9_27];
    if (!((life4_5 != null))) {
        break lexical_join_64;
    }
    if (!((life4_5 != null))) {
        break lexical_join_43;
    }
    if (!((__sourceExactCall_9baebc2ed27c57(((net.minecraft.inventory.ISidedInventory)(life5_16)), ((int)(life10_34))) != null))) {
        break lexical_join_42;
    }
    return ((0) != 0);
    }
    life9_27 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    if (!((life4_5 == null))) {
        break lexical_join_64;
    }
    }
    lexicalValue542_49_0 = ((net.minecraft.inventory.IInventory)(p0)).b__Int();
    }
    life6_63 = lexicalValue542_49_0;
    life7_65 = 0;
    lexical_cycle_52: while (true) {
    lexical_join_61: {
    if (!((life7_65 < life6_63))) {
        break lexical_join_64;
    }
    if (!((__sourceExactCall_d566cd036e054c(((net.minecraft.inventory.IInventory)(p0)), ((int)(life7_65))) != null))) {
        break lexical_join_61;
    }
    return ((0) != 0);
    }
    life7_65 += 1;
    if (!((life4_5 == null))) { continue lexical_cycle_52; }
    break lexical_cycle_52;
    }
    }
    return ((1) != 0);
}


public int b__Int() {
return (this.n).length;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
moom.Cp lexicalValue543_61_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue543_66_0;
    java.lang.String lexicalValue543_66_1;
    moom.Cp lexicalValue543_66_2;
    java.lang.String[] spill543_0;
    moom.Cp spill543_1;
    net.minecraft.nbt.NBTTagCompound spill543_2;
    java.lang.String spill543_3;
    moom.Cp spill543_4;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_10;
    int life6_13;
    java.lang.String[] life4_14;
    net.minecraft.nbt.NBTTagCompound life7_33;
    lexical_join_68: {
    lexical_join_66: {
    lexical_join_61: {
    lexical_join_49: {
    life2_3 = (moom.Cp.q ^ 139648096977678L);
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_10 = new net.minecraft.nbt.NBTTagList();
    spill543_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life6_13 = 0;
    life4_14 = spill543_0;
    lexical_cycle_15: while (true) {
    lexical_join_46: {
    if (!((life6_13 < (this.n).length))) {
        break lexical_join_49;
    }
    spill543_1 = this;
    if (!((life4_14 != null))) {
        lexicalValue543_61_0 = spill543_1;
        break lexical_join_61;
    }
    if (!(((((moom.Cp)(spill543_1)).n)[life6_13] != null))) {
        break lexical_join_46;
    }
    life7_33 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_33)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_13))));
    ((net.minecraft.item.ItemStack)((this.n)[life6_13])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_33)));
    ((net.minecraft.nbt.NBTTagList)(life5_10)).a(((net.minecraft.nbt.NBTBase)(life7_33)));
    }
    life6_13 += 1;
    if (!((life4_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((net.minecraft.nbt.NBTBase)(life5_10)));
    spill543_2 = p0;
    spill543_3 = "TransferCooldown";
    spill543_4 = this;
    if (!((life4_14 != null))) {
        lexicalValue543_66_0 = spill543_2;
        lexicalValue543_66_1 = spill543_3;
        lexicalValue543_66_2 = spill543_4;
        break lexical_join_66;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill543_2)).a__Void(((java.lang.String)(spill543_3)), ((int)(((moom.Cp)(spill543_4)).p)));
    lexicalValue543_61_0 = this;
    }
    if (!(((moom.Cp)(lexicalValue543_61_0)).e__Boolean())) {
        break lexical_join_68;
    }
    lexicalValue543_66_0 = p0;
    lexicalValue543_66_1 = "CustomName";
    lexicalValue543_66_2 = this;
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue543_66_0)).a(((java.lang.String)(lexicalValue543_66_1)), ((java.lang.String)(((moom.Cp)(lexicalValue543_66_2)).o)));
    }
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue1664_17_0;
    net.minecraft.item.ItemStack spill1664_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.Cp.q ^ 64138199170744L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1664_0 = (this.n)[p0];
    if (!((life4_5 != null))) {
        forwardValue1664_17_0 = spill1664_0;
        break forward_join_17;
    }
    if (!((spill1664_0 != null))) {
        break forward_join_25;
    }
    forwardValue1664_17_0 = (this.n)[p0];
    }
    life5_23 = forwardValue1664_17_0;
    (this.n)[p0] = null;
    return life5_23;
    }
    return null;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean e__Boolean() {
java.lang.String forwardValue1666_13_0;
    int forwardValue1666_18_0;
    int forwardValue1666_20_0;
    java.lang.String spill1666_0;
    int spill1666_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.Cp.q ^ 118253119611907L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1666_0 = this.o;
    if (!((life3_5 != null))) {
        forwardValue1666_13_0 = spill1666_0;
        break forward_join_13;
    }
    if (!((spill1666_0 != null))) {
        break forward_join_19;
    }
    forwardValue1666_13_0 = this.o;
    }
    spill1666_1 = ((java.lang.String)(forwardValue1666_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue1666_18_0 = spill1666_1;
        break forward_join_18;
    }
    if (!((spill1666_1 > 0))) {
        break forward_join_19;
    }
    forwardValue1666_18_0 = 1;
    }
    forwardValue1666_20_0 = forwardValue1666_18_0;
    break forward_join_20;
    }
    forwardValue1666_20_0 = 0;
    }
    return ((forwardValue1666_20_0) != 0);
}


public void c__Void() {
net.minecraft.world.World forwardValue1665_13_0;
    int forwardValue1665_25_0;
    int forwardValue1665_33_0;
    net.minecraft.world.World spill1665_0;
    boolean spill1665_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_25: {
    forward_join_13: {
    life1_3 = (moom.Cp.q ^ 39820144873125L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1665_0 = ((moom.Cp)(this)).d;
    if (!((life3_5 != null))) {
        forwardValue1665_13_0 = spill1665_0;
        break forward_join_13;
    }
    if (!((spill1665_0 != null))) {
        break forward_join_34;
    }
    forwardValue1665_13_0 = ((moom.Cp)(this)).d;
    }
    spill1665_1 = ((net.minecraft.world.World)(forwardValue1665_13_0)).G;
    if (!((life3_5 != null))) {
        forwardValue1665_25_0 = ((spill1665_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!((!spill1665_1))) {
        break forward_join_34;
    }
    moom.Cp __stackOp1665_6_0 = this;
    ((moom.Cp)(__stackOp1665_6_0)).p = ((int)((((moom.Cp)(__stackOp1665_6_0)).p - 1)));
    forwardValue1665_25_0 = ((((moom.Cp)(this)).l()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue1665_33_0 = forwardValue1665_25_0;
        break forward_join_33;
    }
    if (!((forwardValue1665_25_0 == 0))) {
        break forward_join_34;
    }
    ((moom.Cp)(this)).a__Void(((int)(0)));
    forwardValue1665_33_0 = ((((moom.Cp)(this)).h()) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1665_33_0);
    }
    return;
}


public java.lang.String c__String() {
return "minecraft:hopper";
}


public double c__sourceReturn_fedcb3e4d3() {
return (((double) ((moom.DT)(((moom.Cp)(this)).e)).c()) + 0x1.0p-1d);
}


public int c__Int() {
long local1 = (moom.Cp.q ^ 139948050532240L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite1096_1(13600, (8950092416952021897L ^ local1));
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public boolean h() {
net.minecraft.world.World forwardValue1667_13_0;
    int forwardValue1667_40_0;
    int forwardValue1667_53_0;
    int forwardValue1667_55_0;
    int forwardValue1667_57_0;
    int forwardValue1667_72_0;
    net.minecraft.world.World spill1667_0;
    boolean spill1667_1;
    boolean spill1667_2;
    boolean spill1667_3;
    boolean spill1667_4;
    boolean spill1667_5;
    int spill1667_6;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_50;
    forward_join_72: {
    forward_join_71: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_40: {
    forward_join_38: {
    forward_join_13: {
    life1_3 = (moom.Cp.q ^ 26784749457907L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1667_0 = ((moom.Cp)(this)).d;
    if (!((life3_5 != null))) {
        forwardValue1667_13_0 = spill1667_0;
        break forward_join_13;
    }
    if (!((spill1667_0 != null))) {
        break forward_join_71;
    }
    forwardValue1667_13_0 = ((moom.Cp)(this)).d;
    }
    spill1667_1 = ((net.minecraft.world.World)(forwardValue1667_13_0)).G;
    if (!((life3_5 != null))) {
        forwardValue1667_72_0 = ((spill1667_1) ? 1 : 0);
        break forward_join_72;
    }
    if (!((!spill1667_1))) {
        break forward_join_71;
    }
    spill1667_2 = ((moom.Cp)(this)).l();
    if (!((life3_5 != null))) {
        forwardValue1667_72_0 = ((spill1667_2) ? 1 : 0);
        break forward_join_72;
    }
    if (!((!spill1667_2))) {
        break forward_join_71;
    }
    spill1667_3 = __sourceExactCall_8deadf247ea7dd(((int)(((moom.Cp)(this)).e())));
    if (!((life3_5 != null))) {
        forwardValue1667_72_0 = ((spill1667_3) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill1667_3)) {
        break forward_join_71;
    }
    life4_50 = 0;
    spill1667_4 = ((moom.Cp)(this)).i();
    if (!((life3_5 != null))) {
        forwardValue1667_40_0 = ((spill1667_4) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill1667_4))) {
        break forward_join_38;
    }
    life4_50 = ((((moom.Cp)(this)).k()) ? 1 : 0);
    }
    forwardValue1667_40_0 = ((((moom.Cp)(this)).j()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue1667_57_0 = forwardValue1667_40_0;
        break forward_join_57;
    }
    if (!((forwardValue1667_40_0 == 0))) {
        break forward_join_56;
    }
    spill1667_5 = moom.Cp.a__Boolean(((net.minecraft.tileentity.IHopper)(this)));
    if (!((life3_5 != null))) {
        forwardValue1667_53_0 = ((spill1667_5) ? 1 : 0);
        break forward_join_53;
    }
    if (!((!spill1667_5))) {
        break forward_join_52;
    }
    spill1667_6 = life4_50;
    if (!((life3_5 != null))) {
        forwardValue1667_53_0 = spill1667_6;
        break forward_join_53;
    }
    if (!((spill1667_6 != 0))) {
        break forward_join_54;
    }
    }
    forwardValue1667_53_0 = 1;
    }
    forwardValue1667_55_0 = forwardValue1667_53_0;
    break forward_join_55;
    }
    forwardValue1667_55_0 = 0;
    }
    life4_50 = forwardValue1667_55_0;
    }
    forwardValue1667_57_0 = life4_50;
    }
    if (!((life3_5 != null))) {
        forwardValue1667_72_0 = forwardValue1667_57_0;
        break forward_join_72;
    }
    if (!((forwardValue1667_57_0 != 0))) {
        break forward_join_71;
    }
    ((moom.Cp)(this)).a__Void(((int)(__sourceIntrinsic_4d53036195fc_invokedynamic1667_19(19442, (5509081606327638843L ^ life1_3)))));
    ((moom.Cp)(this)).a__Void();
    return ((1) != 0);
    }
    forwardValue1667_72_0 = 0;
    }
    return ((forwardValue1667_72_0) != 0);
}


public boolean l() {
int forwardValue1671_12_0;
    int forwardValue1671_14_0;
    int spill1671_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.Cp.q ^ 48958301244663L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1671_0 = this.p;
    if (!((life3_5 != null))) {
        forwardValue1671_12_0 = spill1671_0;
        break forward_join_12;
    }
    if (!((spill1671_0 > 0))) {
        break forward_join_13;
    }
    forwardValue1671_12_0 = 1;
    }
    forwardValue1671_14_0 = forwardValue1671_12_0;
    break forward_join_14;
    }
    forwardValue1671_14_0 = 0;
    }
    return ((forwardValue1671_14_0) != 0);
}


public int d__Int() {
return 0;
}


public static net.minecraft.inventory.IInventory a(net.minecraft.tileentity.IHopper p0) {
return moom.Cp.a__wo(((net.minecraft.world.World)(((net.minecraft.tileentity.IHopper)(p0)).c__sourceInterfaceWorld())), ((double)(__sourceExactCall_e61cc3e63667fb(((net.minecraft.tileentity.IHopper)(p0))))), ((double)((__sourceExactCall_1e0dd557f11538(((net.minecraft.tileentity.IHopper)(p0))) + 0x1.0p0d))), ((double)(((net.minecraft.tileentity.IHopper)(p0)).c__sourceReturn_fedcb3e4d3())));
}


private static boolean a(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue1653_14_0;
    int forwardValue1653_26_0;
    int forwardValue1653_26_1;
    int forwardValue1653_30_0;
    int forwardValue1653_34_0;
    int forwardValue1653_36_0;
    net.minecraft.item.ItemStack spill1653_0;
    int spill1653_1;
    int spill1653_2;
    int spill1653_3;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_26: {
    forward_join_14: {
    life2_3 = (moom.Cp.q ^ 78329493293364L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1653_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue1653_14_0 = spill1653_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1653_0)).a__wQ() == ((net.minecraft.item.ItemStack)(p1)).a__wQ()))) {
        break forward_join_35;
    }
    forwardValue1653_14_0 = p0;
    }
    spill1653_1 = __sourceExactCall_0a73aed9fe6bb5(((net.minecraft.item.ItemStack)(forwardValue1653_14_0)));
    spill1653_2 = __sourceExactCall_0a73aed9fe6bb5(((net.minecraft.item.ItemStack)(p1)));
    if (!((life4_5 != null))) {
        forwardValue1653_26_0 = spill1653_1;
        forwardValue1653_26_1 = spill1653_2;
        break forward_join_26;
    }
    if (!((spill1653_1 == spill1653_2))) {
        break forward_join_35;
    }
    spill1653_3 = ((net.minecraft.item.ItemStack)(p0)).b;
    if (!((life4_5 != null))) {
        forwardValue1653_30_0 = spill1653_3;
        break forward_join_30;
    }
    forwardValue1653_26_0 = spill1653_3;
    forwardValue1653_26_1 = ((net.minecraft.item.ItemStack)(p0)).a();
    }
    if (!((forwardValue1653_26_0 <= forwardValue1653_26_1))) {
        break forward_join_35;
    }
    forwardValue1653_30_0 = ((__sourceExactCall_89d668202ff0ca(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.item.ItemStack)(p1)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue1653_34_0 = forwardValue1653_30_0;
        break forward_join_34;
    }
    if (!((forwardValue1653_30_0 != 0))) {
        break forward_join_35;
    }
    forwardValue1653_34_0 = 1;
    }
    forwardValue1653_36_0 = forwardValue1653_34_0;
    break forward_join_36;
    }
    forwardValue1653_36_0 = 0;
    }
    return ((forwardValue1653_36_0) != 0);
}


public static net.minecraft.inventory.IInventory a__wo(net.minecraft.world.World p0, double p1, double p2, double p3) {
net.minecraft.tileentity.TileEntity forestValue1_42_0;
    net.minecraft.block.Block forestValue1_55_0;
    net.minecraft.inventory.IInventory forestValue1_61_0;
    java.lang.Object forestValue1_102_0;
    net.minecraft.inventory.IInventory forestValue1_105_0;
    java.lang.String[] spill1_0;
    net.minecraft.tileentity.TileEntity spill1_1;
    net.minecraft.inventory.IInventory spill1_2;
    net.minecraft.block.Block spill1_3;
    java.util.List spill1_4;
    long life7_3;
    net.minecraft.inventory.IInventory life10_5;
    int life11_9;
    int life12_12;
    java.lang.String[] life9_13;
    int life13_16;
    moom.DT life14_23;
    net.minecraft.block.Block life15_28;
    net.minecraft.tileentity.TileEntity life16_36;
    java.util.List life16_107;
    forest_join_105: {
    forest_join_104: {
    forest_join_102: {
    forest_join_61: {
    forest_join_60: {
    forest_join_55: {
    forest_join_42: {
    life7_3 = (moom.Cp.q ^ 25222428735467L);
    life10_5 = null;
    spill1_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life11_9 = moom.Dr.b__Int(((double)(p1)));
    life12_12 = moom.Dr.b__Int(((double)(p2)));
    life9_13 = spill1_0;
    life13_16 = moom.Dr.b__Int(((double)(p3)));
    life14_23 = new moom.DT(life11_9, life12_12, life13_16);
    life15_28 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life14_23))))).a__ch();
    if (!(((net.minecraft.block.Block)(life15_28)).i())) {
        break forest_join_60;
    }
    life16_36 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life14_23)));
    spill1_1 = life16_36;
    if (!((life9_13 != null))) {
        forestValue1_42_0 = spill1_1;
        break forest_join_42;
    }
    if (!((((spill1_1 instanceof net.minecraft.inventory.IInventory) ? 1 : 0) != 0))) {
        break forest_join_60;
    }
    forestValue1_42_0 = life16_36;
    }
    life10_5 = ((net.minecraft.inventory.IInventory)(forestValue1_42_0));
    spill1_2 = life10_5;
    if (!((life9_13 != null))) {
        forestValue1_61_0 = spill1_2;
        break forest_join_61;
    }
    if (!((((spill1_2 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forest_join_60;
    }
    spill1_3 = life15_28;
    if (!((life9_13 != null))) {
        forestValue1_55_0 = spill1_3;
        break forest_join_55;
    }
    if (!((((spill1_3 instanceof moom.cZ) ? 1 : 0) != 0))) {
        break forest_join_60;
    }
    forestValue1_55_0 = life15_28;
    }
    life10_5 = ((moom.cZ)(((moom.cZ)(forestValue1_55_0)))).a__sourceReturn_5599c2b7a2(((net.minecraft.world.World)(p0)), ((moom.DT)(life14_23)));
    }
    forestValue1_61_0 = life10_5;
    }
    if (!((life9_13 != null))) {
        forestValue1_105_0 = forestValue1_61_0;
        break forest_join_105;
    }
    if (!((forestValue1_61_0 == null))) {
        break forest_join_104;
    }
    life16_107 = ((net.minecraft.world.World)(p0)).a(((net.minecraft.entity.Entity)(null)), ((moom.CA)(new moom.CA((p1 - 0x1.0p-1d), (p2 - 0x1.0p-1d), (p3 - 0x1.0p-1d), (p1 + 0x1.0p-1d), (p2 + 0x1.0p-1d), (p3 + 0x1.0p-1d)))), ((com.google.common.base.Predicate)(moom.CY.c)));
    spill1_4 = life16_107;
    if (!((life9_13 != null))) {
        forestValue1_102_0 = spill1_4;
        break forest_join_102;
    }
    if (!((((java.util.List)(spill1_4)).size() > 0))) {
        break forest_join_104;
    }
    forestValue1_102_0 = ((java.util.List)(life16_107)).get(((int)(((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(((java.util.List)(life16_107)).size()))))));
    }
    life10_5 = ((net.minecraft.inventory.IInventory)(forestValue1_102_0));
    }
    forestValue1_105_0 = life10_5;
    }
    return forestValue1_105_0;
}


public double a__sourceReturn_fedcb3e4d3() {
return (((double) ((moom.DT)(((moom.Cp)(this)).e)).a()) + 0x1.0p-1d);
}


public static java.util.List<net.minecraft.entity.item.EntityItem> a(net.minecraft.world.World p0, double p1, double p2, double p3) {
return ((net.minecraft.world.World)(p0)).a(((java.lang.Class)(net.minecraft.entity.item.EntityItem.class)), ((moom.CA)(new moom.CA((p1 - 0x1.0p-1d), (p2 - 0x1.0p-1d), (p3 - 0x1.0p-1d), (p1 + 0x1.0p-1d), (p2 + 0x1.0p-1d), (p3 + 0x1.0p-1d)))), ((com.google.common.base.Predicate)(moom.CY.a)));
}


public void a__Void(int p0, int p1) {
return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9055;
      if (s[var3] == null) {
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
         long var5 = r[var3];
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
         Object[] var9 = (Object[])t.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               t.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Cp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         s[var3] = var15;
      }

      return s[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_877369ccf6b0dd(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4124_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wg(p0, this, p1);
}


public void a__Void(int p0) {
this.p = ((int)(p0));
    return;
}


public java.lang.String a__String() {
moom.Cp forwardValue1657_12_0;
    java.lang.String forwardValue1657_15_0;
    moom.Cp spill1657_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.Cp.q ^ 37371685874461L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1657_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1657_12_0 = spill1657_0;
        break forward_join_12;
    }
    if (!(((moom.Cp)(spill1657_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue1657_12_0 = this;
    }
    forwardValue1657_15_0 = ((moom.Cp)(forwardValue1657_12_0)).o;
    break forward_join_15;
    }
    forwardValue1657_15_0 = "container.hopper";
    }
    return forwardValue1657_15_0;
}


public void a(java.lang.String p0) {
this.o = ((java.lang.String)(p0));
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue1648_39_0;
    int forwardValue1648_41_0;
    int spill1648_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (moom.Cp.q ^ 1977176956236L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(((moom.Cp)(this)).d)).a__B9(((moom.DT)(((moom.Cp)(this)).e))) == this))) {
        break forward_join_40;
    }
    spill1648_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(((moom.Cp)(this)).e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((moom.Cp)(this)).e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((moom.Cp)(this)).e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue1648_39_0 = spill1648_0;
        break forward_join_39;
    }
    if (!((spill1648_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1648_39_0 = 1;
    }
    forwardValue1648_41_0 = forwardValue1648_39_0;
    break forward_join_41;
    }
    forwardValue1648_41_0 = 0;
    }
    return ((forwardValue1648_41_0) != 0);
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue541_45_0;
    java.lang.String[] spill541_0;
    boolean spill541_1;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_16;
    java.lang.String[] life4_22;
    int life6_51;
    net.minecraft.nbt.NBTTagCompound life7_59;
    int life8_63;
    lexical_join_76: {
    lexical_join_45: {
    lexical_join_39: {
    life2_3 = (moom.Cp.q ^ 33255512015375L);
    spill541_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic541_3(22826, (7738129413511584286L ^ life2_3)))));
    this.n = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((moom.Cp)(this)).b__Int()]));
    life4_22 = spill541_0;
    spill541_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic541_7(22643, (1822709407232203588L ^ life2_3)))));
    if (!((life4_22 != null))) {
        lexicalValue541_45_0 = ((spill541_1) ? 1 : 0);
        break lexical_join_45;
    }
    if (!(spill541_1)) {
        break lexical_join_39;
    }
    this.o = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName")))));
    }
    this.p = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TransferCooldown")))));
    lexicalValue541_45_0 = 0;
    }
    life6_51 = lexicalValue541_45_0;
    lexical_cycle_46: while (true) {
    lexical_join_74: {
    lexical_join_73: {
    if (!((life6_51 < ((net.minecraft.nbt.NBTTagList)(life5_16)).a__Int()))) {
        break lexical_join_76;
    }
    life7_59 = ((net.minecraft.nbt.NBTTagList)(life5_16)).a__yw(((int)(life6_51)));
    life8_63 = ((net.minecraft.nbt.NBTTagCompound)(life7_59)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot")));
    if (!((life4_22 != null))) {
        break lexical_join_74;
    }
    if (!((life8_63 >= 0))) {
        break lexical_join_73;
    }
    if (!((life8_63 < (this.n).length))) {
        break lexical_join_73;
    }
    (this.n)[life8_63] = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(life7_59)));
    }
    life6_51 += 1;
    }
    if (!((life4_22 == null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}


public void a__Void() {
super.a__Void();
    return;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.n)[p0];
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue1647_17_0;
    net.minecraft.item.ItemStack forwardValue1647_40_0;
    net.minecraft.item.ItemStack forwardValue1647_55_0;
    net.minecraft.item.ItemStack spill1647_0;
    net.minecraft.item.ItemStack spill1647_1;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_49;
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_40: {
    forward_join_34: {
    forward_join_17: {
    life3_3 = (moom.Cp.q ^ 91169073856496L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1647_0 = (this.n)[p0];
    if (!((life5_5 != null))) {
        forwardValue1647_17_0 = spill1647_0;
        break forward_join_17;
    }
    if (!((spill1647_0 != null))) {
        break forward_join_56;
    }
    forwardValue1647_17_0 = (this.n)[p0];
    }
    if (!((life5_5 != null))) {
        forwardValue1647_40_0 = forwardValue1647_17_0;
        break forward_join_40;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue1647_17_0)).b <= p1))) {
        break forward_join_34;
    }
    life6_35 = (this.n)[p0];
    (this.n)[p0] = null;
    return life6_35;
    }
    forwardValue1647_40_0 = ((net.minecraft.item.ItemStack)((this.n)[p0])).a(((int)(p1)));
    }
    life6_49 = forwardValue1647_40_0;
    spill1647_1 = (this.n)[p0];
    if (!((life5_5 != null))) {
        forwardValue1647_55_0 = spill1647_1;
        break forward_join_55;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1647_1)).b == 0))) {
        break forward_join_54;
    }
    (this.n)[p0] = null;
    }
    forwardValue1647_55_0 = life6_49;
    }
    return forwardValue1647_55_0;
    }
    return null;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue1658_16_0;
    net.minecraft.item.ItemStack forwardValue1658_23_0;
    java.lang.String[] spill1658_0;
    net.minecraft.item.ItemStack spill1658_1;
    long life3_3;
    java.lang.String[] life5_10;
    forward_join_26: {
    forward_join_23: {
    forward_join_16: {
    life3_3 = (moom.Cp.q ^ 140408265365443L);
    spill1658_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    (this.n)[p0] = p1;
    life5_10 = spill1658_0;
    spill1658_1 = p1;
    if (!((life5_10 != null))) {
        forwardValue1658_16_0 = spill1658_1;
        break forward_join_16;
    }
    if (!((spill1658_1 != null))) {
        break forward_join_26;
    }
    forwardValue1658_16_0 = p1;
    }
    if (!((life5_10 != null))) {
        forwardValue1658_23_0 = forwardValue1658_16_0;
        break forward_join_23;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue1658_16_0)).b > ((moom.Cp)(this)).c__Int()))) {
        break forward_join_26;
    }
    forwardValue1658_23_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(forwardValue1658_23_0)).b = ((int)(((moom.Cp)(this)).c__Int()));
    }
    return;
}


private static boolean a(net.minecraft.tileentity.IHopper p0, net.minecraft.inventory.IInventory p1, int p2, moom.bs p3) {
int forwardValue1654_43_0;
    int forwardValue1654_49_0;
    java.lang.String[] spill1654_0;
    boolean spill1654_1;
    int spill1654_2;
    long life4_3;
    net.minecraft.item.ItemStack life7_8;
    java.lang.String[] life6_9;
    net.minecraft.item.ItemStack life8_28;
    net.minecraft.item.ItemStack life9_36;
    forward_join_49: {
    forward_join_48: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_40: {
    life4_3 = (moom.Cp.q ^ 134375815890270L);
    spill1654_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life7_8 = ((net.minecraft.inventory.IInventory)(p1)).a__xW(((int)(p2)));
    life6_9 = spill1654_0;
    if (!((life7_8 != null))) {
        break forward_join_48;
    }
    spill1654_1 = moom.Cp.b(((net.minecraft.inventory.IInventory)(p1)), ((net.minecraft.item.ItemStack)(life7_8)), ((int)(p2)), ((moom.bs)(p3)));
    if (!((life6_9 != null))) {
        forwardValue1654_49_0 = ((spill1654_1) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill1654_1)) {
        break forward_join_48;
    }
    life8_28 = ((net.minecraft.item.ItemStack)(life7_8)).a__xW();
    life9_36 = __sourceExactCall_ff276ee9017469(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.item.ItemStack)(((net.minecraft.inventory.IInventory)(p1)).a(((int)(p2)), ((int)(1))))), ((moom.bs)(null)));
    if (!((life6_9 != null))) {
        break forward_join_42;
    }
    if (!((life9_36 != null))) {
        break forward_join_40;
    }
    spill1654_2 = ((net.minecraft.item.ItemStack)(life9_36)).b;
    if (!((life6_9 != null))) {
        forwardValue1654_43_0 = spill1654_2;
        break forward_join_43;
    }
    if (!((spill1654_2 == 0))) {
        break forward_join_44;
    }
    }
    ((net.minecraft.inventory.IInventory)(p1)).a__Void();
    }
    forwardValue1654_43_0 = 1;
    }
    return ((forwardValue1654_43_0) != 0);
    }
    ((net.minecraft.inventory.IInventory)(p1)).a__Void(((int)(p2)), ((net.minecraft.item.ItemStack)(life8_28)));
    }
    forwardValue1654_49_0 = 0;
    }
    return ((forwardValue1654_49_0) != 0);
}


private net.minecraft.inventory.IInventory a__wo() {
java.lang.Object local1 = __sourceExactCall_ab5ffeed94d386(((int)(((moom.Cp)(this)).e())));
    return moom.Cp.a__wo(((net.minecraft.world.World)(((moom.Cp)(this)).c__sourceInterfaceWorld())), ((double)(((double) (((moom.DT)(((moom.Cp)(this)).e)).a() + ((moom.bs)(local1)).c())))), ((double)(((double) (((moom.DT)(((moom.Cp)(this)).e)).b() + ((moom.bs)(local1)).d())))), ((double)(((double) (((moom.DT)(((moom.Cp)(this)).e)).c() + ((moom.bs)(local1)).e())))));
}


public static net.minecraft.item.ItemStack a(net.minecraft.inventory.IInventory p0, net.minecraft.item.ItemStack p1, moom.bs p2) {
net.minecraft.item.ItemStack lexicalValue539_35_0;
    net.minecraft.item.ItemStack lexicalValue539_46_0;
    net.minecraft.inventory.IInventory lexicalValue539_53_0;
    int lexicalValue539_54_0;
    net.minecraft.item.ItemStack lexicalValue539_81_0;
    net.minecraft.item.ItemStack lexicalValue539_92_0;
    int spill539_0;
    net.minecraft.inventory.ISidedInventory spill539_1;
    net.minecraft.item.ItemStack spill539_2;
    net.minecraft.item.ItemStack spill539_3;
    net.minecraft.item.ItemStack spill539_4;
    net.minecraft.item.ItemStack spill539_5;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.inventory.ISidedInventory life6_21;
    int[] life7_27;
    int life8_29;
    int life7_75;
    int life8_77;
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_50: {
    life3_3 = (moom.Cp.q ^ 25576885830358L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill539_0 = ((p0 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    if (!((life5_5 != null))) {
        lexicalValue539_54_0 = spill539_0;
        break lexical_join_54;
    }
    if (!((spill539_0 != 0))) {
        break lexical_join_52;
    }
    spill539_1 = ((net.minecraft.inventory.ISidedInventory)(p0));
    if (!((life5_5 != null))) {
        lexicalValue539_53_0 = spill539_1;
        break lexical_join_53;
    }
    life6_21 = spill539_1;
    if (!((p2 != null))) {
        break lexical_join_52;
    }
    life7_27 = ((net.minecraft.inventory.ISidedInventory)(life6_21)).a(((moom.bs)(p2)));
    life8_29 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_46: {
    lexical_join_35: {
    if (!((life8_29 < (life7_27).length))) {
        break lexical_join_50;
    }
    spill539_2 = p1;
    if (!((life5_5 != null))) {
        lexicalValue539_81_0 = spill539_2;
        break lexical_join_81;
    }
    if (!((life5_5 != null))) {
        lexicalValue539_35_0 = spill539_2;
        break lexical_join_35;
    }
    if (!((spill539_2 != null))) {
        break lexical_join_50;
    }
    lexicalValue539_35_0 = p1;
    }
    if (!((life5_5 != null))) {
        lexicalValue539_46_0 = lexicalValue539_35_0;
        break lexical_join_46;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue539_35_0)).b > 0))) {
        break lexical_join_50;
    }
    lexicalValue539_46_0 = moom.Cp.a(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((int)((life7_27)[life8_29])), ((moom.bs)(p2)));
    }
    p1 = lexicalValue539_46_0;
    life8_29 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    if (!((life5_5 == null))) {
        break lexical_join_80;
    }
    }
    lexicalValue539_53_0 = p0;
    }
    lexicalValue539_54_0 = ((net.minecraft.inventory.IInventory)(lexicalValue539_53_0)).b__Int();
    }
    life7_75 = lexicalValue539_54_0;
    life8_77 = 0;
    lexical_cycle_57: while (true) {
    if (!((life8_77 < life7_75))) {
        break lexical_join_80;
    }
    spill539_3 = p1;
    if (!((life5_5 != null))) {
        lexicalValue539_81_0 = spill539_3;
        break lexical_join_81;
    }
    if (!((life5_5 != null))) {
        lexicalValue539_81_0 = spill539_3;
        break lexical_join_81;
    }
    if (!((spill539_3 != null))) {
        break lexical_join_80;
    }
    spill539_4 = p1;
    if (!((life5_5 != null))) {
        lexicalValue539_81_0 = spill539_4;
        break lexical_join_81;
    }
    if (!((((net.minecraft.item.ItemStack)(spill539_4)).b > 0))) {
        break lexical_join_80;
    }
    p1 = moom.Cp.a(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((int)(life8_77)), ((moom.bs)(p2)));
    life8_77 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    lexicalValue539_81_0 = p1;
    }
    if (!((life5_5 != null))) {
        lexicalValue539_92_0 = lexicalValue539_81_0;
        break lexical_join_92;
    }
    if (!((lexicalValue539_81_0 != null))) {
        break lexical_join_91;
    }
    spill539_5 = p1;
    if (!((life5_5 != null))) {
        lexicalValue539_92_0 = spill539_5;
        break lexical_join_92;
    }
    if (!((((net.minecraft.item.ItemStack)(spill539_5)).b == 0))) {
        break lexical_join_91;
    }
    p1 = null;
    }
    lexicalValue539_92_0 = p1;
    }
    return lexicalValue539_92_0;
}


private static boolean a__Boolean(net.minecraft.inventory.IInventory p0, net.minecraft.item.ItemStack p1, int p2, moom.bs p3) {
int forwardValue1655_15_0;
    int forwardValue1655_28_0;
    int forwardValue1655_30_0;
    boolean spill1655_0;
    boolean spill1655_1;
    long life4_3;
    java.lang.String[] life6_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_15: {
    life4_3 = (moom.Cp.q ^ 15998285083576L);
    life6_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1655_0 = ((net.minecraft.inventory.IInventory)(p0)).a__Boolean(((int)(p2)), ((net.minecraft.item.ItemStack)(p1)));
    if (!((life6_5 != null))) {
        forwardValue1655_15_0 = ((spill1655_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill1655_0)) {
        break forward_join_29;
    }
    forwardValue1655_15_0 = ((p0 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue1655_28_0 = forwardValue1655_15_0;
        break forward_join_28;
    }
    if (!((forwardValue1655_15_0 != 0))) {
        break forward_join_27;
    }
    spill1655_1 = ((net.minecraft.inventory.ISidedInventory)(((net.minecraft.inventory.ISidedInventory)(p0)))).a(((int)(p2)), ((net.minecraft.item.ItemStack)(p1)), ((moom.bs)(p3)));
    if (!((life6_5 != null))) {
        forwardValue1655_28_0 = ((spill1655_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill1655_1)) {
        break forward_join_29;
    }
    }
    forwardValue1655_28_0 = 1;
    }
    forwardValue1655_30_0 = forwardValue1655_28_0;
    break forward_join_30;
    }
    forwardValue1655_30_0 = 0;
    }
    return ((forwardValue1655_30_0) != 0);
}


private static net.minecraft.item.ItemStack a(net.minecraft.inventory.IInventory p0, net.minecraft.item.ItemStack p1, int p2, moom.bs p3) {
int forwardValue1651_19_0;
    net.minecraft.item.ItemStack forwardValue1651_34_0;
    int forwardValue1651_67_0;
    int forwardValue1651_69_0;
    int forwardValue1651_71_0;
    int forwardValue1651_78_0;
    net.minecraft.inventory.IInventory forwardValue1651_95_0;
    net.minecraft.inventory.IInventory forwardValue1651_97_0;
    java.lang.String[] spill1651_0;
    boolean spill1651_1;
    net.minecraft.item.ItemStack spill1651_2;
    boolean spill1651_3;
    int spill1651_4;
    net.minecraft.inventory.IInventory spill1651_5;
    moom.Cp spill1651_6;
    long life4_3;
    net.minecraft.item.ItemStack life7_8;
    java.lang.String[] life6_9;
    int life8_22;
    int life9_53;
    int life10_58;
    moom.Cp life9_102;
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_78: {
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_67: {
    forward_join_34: {
    forward_join_33: {
    forward_join_19: {
    life4_3 = (moom.Cp.q ^ 86429495159647L);
    spill1651_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life7_8 = ((net.minecraft.inventory.IInventory)(p0)).a__xW(((int)(p2)));
    life6_9 = spill1651_0;
    spill1651_1 = moom.Cp.a__Boolean(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.item.ItemStack)(p1)), ((int)(p2)), ((moom.bs)(p3)));
    if (!((life6_9 != null))) {
        forwardValue1651_19_0 = ((spill1651_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill1651_1)) {
        break forward_join_98;
    }
    forwardValue1651_19_0 = 0;
    }
    life8_22 = forwardValue1651_19_0;
    spill1651_2 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue1651_34_0 = spill1651_2;
        break forward_join_34;
    }
    if (!((spill1651_2 == null))) {
        break forward_join_33;
    }
    ((net.minecraft.inventory.IInventory)(p0)).a__Void(((int)(p2)), ((net.minecraft.item.ItemStack)(p1)));
    p1 = null;
    life8_22 = 1;
    break forward_join_70;
    }
    forwardValue1651_34_0 = life7_8;
    }
    spill1651_3 = __sourceExactCall_8c62618051c2c8(((net.minecraft.item.ItemStack)(forwardValue1651_34_0)), ((net.minecraft.item.ItemStack)(p1)));
    if (!((life6_9 != null))) {
        forwardValue1651_71_0 = ((spill1651_3) ? 1 : 0);
        break forward_join_71;
    }
    if (!(spill1651_3)) {
        break forward_join_70;
    }
    life9_53 = (((net.minecraft.item.ItemStack)(p1)).a() - ((net.minecraft.item.ItemStack)(life7_8)).b);
    life10_58 = java.lang.Math.min(((int)(((net.minecraft.item.ItemStack)(p1)).b)), ((int)(life9_53)));
    net.minecraft.item.ItemStack __stackOp1651_12_0 = p1;
    ((net.minecraft.item.ItemStack)(__stackOp1651_12_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1651_12_0)).b - life10_58)));
    net.minecraft.item.ItemStack __stackOp1651_15_0 = life7_8;
    ((net.minecraft.item.ItemStack)(__stackOp1651_15_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1651_15_0)).b + life10_58)));
    spill1651_4 = life10_58;
    if (!((life6_9 != null))) {
        forwardValue1651_67_0 = spill1651_4;
        break forward_join_67;
    }
    if (!((spill1651_4 > 0))) {
        break forward_join_68;
    }
    forwardValue1651_67_0 = 1;
    }
    forwardValue1651_69_0 = forwardValue1651_67_0;
    break forward_join_69;
    }
    forwardValue1651_69_0 = 0;
    }
    life8_22 = forwardValue1651_69_0;
    }
    forwardValue1651_71_0 = life8_22;
    }
    if (!((life6_9 != null))) {
        forwardValue1651_78_0 = forwardValue1651_71_0;
        break forward_join_78;
    }
    if (!((forwardValue1651_71_0 != 0))) {
        break forward_join_98;
    }
    spill1651_5 = p0;
    if (!((life6_9 != null))) {
        forwardValue1651_97_0 = spill1651_5;
        break forward_join_97;
    }
    forwardValue1651_78_0 = ((spill1651_5 instanceof moom.Cp) ? 1 : 0);
    }
    if (!((forwardValue1651_78_0 != 0))) {
        break forward_join_96;
    }
    life9_102 = ((moom.Cp)(p0));
    spill1651_6 = life9_102;
    if (!((life6_9 != null))) {
        forwardValue1651_95_0 = spill1651_6;
        break forward_join_95;
    }
    if (!(((moom.Cp)(spill1651_6)).m())) {
        break forward_join_94;
    }
    ((moom.Cp)(life9_102)).a__Void(((int)(__sourceIntrinsic_555a89bd2824_invokedynamic1651_21(19442, (5509140735681454487L ^ life4_3)))));
    }
    forwardValue1651_95_0 = p0;
    }
    ((net.minecraft.inventory.IInventory)(forwardValue1651_95_0)).a__Void();
    }
    forwardValue1651_97_0 = p0;
    }
    ((net.minecraft.inventory.IInventory)(forwardValue1651_97_0)).a__Void();
    }
    return p1;
}


public static boolean a(net.minecraft.inventory.IInventory p0, net.minecraft.entity.item.EntityItem p1) {
net.minecraft.entity.item.EntityItem forwardValue1650_15_0;
    int forwardValue1650_38_0;
    java.lang.String[] spill1650_0;
    net.minecraft.entity.item.EntityItem spill1650_1;
    int spill1650_2;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    net.minecraft.item.ItemStack life6_22;
    net.minecraft.item.ItemStack life7_27;
    forward_join_41: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.Cp.q ^ 99417699433931L);
    spill1650_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill1650_0;
    spill1650_1 = p1;
    if (!((life4_7 != null))) {
        forwardValue1650_15_0 = spill1650_1;
        break forward_join_15;
    }
    if (!((spill1650_1 == null))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue1650_15_0 = p1;
    }
    life6_22 = ((net.minecraft.item.ItemStack)(((net.minecraft.entity.item.EntityItem)(forwardValue1650_15_0)).a__xW())).a__xW();
    life7_27 = __sourceExactCall_ff276ee9017469(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.item.ItemStack)(life6_22)), ((moom.bs)(null)));
    if (!((life4_7 != null))) {
        break forward_join_39;
    }
    if (!((life7_27 != null))) {
        break forward_join_37;
    }
    spill1650_2 = ((net.minecraft.item.ItemStack)(life7_27)).b;
    if (!((life4_7 != null))) {
        forwardValue1650_38_0 = spill1650_2;
        break forward_join_38;
    }
    if (!((spill1650_2 != 0))) {
        break forward_join_37;
    }
    ((net.minecraft.entity.item.EntityItem)(p1)).a(((net.minecraft.item.ItemStack)(life7_27)));
    if (!((life4_7 == null))) {
        break forward_join_41;
    }
    }
    forwardValue1650_38_0 = 1;
    }
    life5_6 = forwardValue1650_38_0;
    }
    ((net.minecraft.entity.item.EntityItem)(p1)).f__Void();
    }
    return ((life5_6) != 0);
}


private boolean a(net.minecraft.inventory.IInventory p0, moom.bs p1) {
net.minecraft.item.ItemStack lexicalValue538_43_0;
    int lexicalValue538_50_0;
    int lexicalValue538_58_0;
    net.minecraft.item.ItemStack lexicalValue538_73_0;
    int lexicalValue538_80_0;
    int spill538_0;
    net.minecraft.item.ItemStack spill538_1;
    int spill538_2;
    net.minecraft.item.ItemStack spill538_3;
    int spill538_4;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.inventory.ISidedInventory life6_16;
    int[] life7_20;
    int[] life8_22;
    int life9_25;
    int life10_27;
    int life11_34;
    net.minecraft.item.ItemStack life12_38;
    int life7_76;
    int life8_78;
    net.minecraft.item.ItemStack life9_85;
    lexical_join_84: {
    lexical_join_58: {
    lexical_join_56: {
    lexical_join_54: {
    life3_3 = (moom.Cp.q ^ 76859853472652L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill538_0 = ((p0 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    if (!((life5_5 != null))) {
        lexicalValue538_58_0 = spill538_0;
        break lexical_join_58;
    }
    if (!((spill538_0 != 0))) {
        break lexical_join_56;
    }
    life6_16 = ((net.minecraft.inventory.ISidedInventory)(p0));
    life7_20 = ((net.minecraft.inventory.ISidedInventory)(life6_16)).a(((moom.bs)(p1)));
    life8_22 = life7_20;
    life9_25 = (life8_22).length;
    life10_27 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_43: {
    if (!((life10_27 < life9_25))) {
        break lexical_join_54;
    }
    life11_34 = (life8_22)[life10_27];
    life12_38 = __sourceExactCall_9baebc2ed27c57(((net.minecraft.inventory.ISidedInventory)(life6_16)), ((int)(life11_34)));
    if (!((life5_5 != null))) {
        break lexical_join_84;
    }
    spill538_1 = life12_38;
    if (!((life5_5 != null))) {
        lexicalValue538_43_0 = spill538_1;
        break lexical_join_43;
    }
    if (!((spill538_1 != null))) {
        break lexical_join_49;
    }
    lexicalValue538_43_0 = life12_38;
    }
    spill538_2 = ((net.minecraft.item.ItemStack)(lexicalValue538_43_0)).b;
    if (!((life5_5 != null))) {
        lexicalValue538_50_0 = spill538_2;
        break lexical_join_50;
    }
    if (!((spill538_2 != ((net.minecraft.item.ItemStack)(life12_38)).a()))) {
        break lexical_join_51;
    }
    }
    lexicalValue538_50_0 = 0;
    }
    return ((lexicalValue538_50_0) != 0);
    }
    life10_27 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    if (!((life5_5 == null))) {
        break lexical_join_84;
    }
    }
    lexicalValue538_58_0 = ((net.minecraft.inventory.IInventory)(p0)).b__Int();
    }
    life7_76 = lexicalValue538_58_0;
    life8_78 = 0;
    lexical_cycle_61: while (true) {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_73: {
    if (!((life8_78 < life7_76))) {
        break lexical_join_84;
    }
    life9_85 = __sourceExactCall_d566cd036e054c(((net.minecraft.inventory.IInventory)(p0)), ((int)(life8_78)));
    spill538_3 = life9_85;
    if (!((life5_5 != null))) {
        lexicalValue538_73_0 = spill538_3;
        break lexical_join_73;
    }
    if (!((spill538_3 != null))) {
        break lexical_join_79;
    }
    lexicalValue538_73_0 = life9_85;
    }
    spill538_4 = ((net.minecraft.item.ItemStack)(lexicalValue538_73_0)).b;
    if (!((life5_5 != null))) {
        lexicalValue538_80_0 = spill538_4;
        break lexical_join_80;
    }
    if (!((spill538_4 != ((net.minecraft.item.ItemStack)(life9_85)).a()))) {
        break lexical_join_81;
    }
    }
    lexicalValue538_80_0 = 0;
    }
    return ((lexicalValue538_80_0) != 0);
    }
    life8_78 += 1;
    if (!((life5_5 == null))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    return ((1) != 0);
}


public static boolean a__Boolean(net.minecraft.tileentity.IHopper p0) {
int lexicalValue540_23_0;
    int lexicalValue540_66_0;
    int lexicalValue540_83_0;
    int lexicalValue540_118_0;
    int lexicalValue540_122_0;
    java.lang.String[] spill540_0;
    boolean spill540_1;
    boolean spill540_2;
    boolean spill540_3;
    boolean spill540_4;
    long life1_3;
    net.minecraft.inventory.IInventory life4_7;
    java.lang.String[] life3_8;
    moom.bs life5_12;
    net.minecraft.inventory.ISidedInventory life6_36;
    int[] life7_40;
    int[] life8_42;
    int life9_45;
    int life10_47;
    int life11_54;
    int life7_85;
    int life8_87;
    java.util.Iterator life5_126;
    net.minecraft.entity.item.EntityItem life6_133;
    lexical_join_122: {
    lexical_join_121: {
    lexical_join_89: {
    lexical_join_87: {
    lexical_join_66: {
    lexical_join_64: {
    lexical_join_62: {
    lexical_join_23: {
    lexical_join_21: {
    life1_3 = (moom.Cp.q ^ 61765811491066L);
    spill540_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = __sourceExactCall_c3870ce80e5f8a(((net.minecraft.tileentity.IHopper)(p0)));
    life3_8 = spill540_0;
    if (!((life4_7 != null))) {
        break lexical_join_89;
    }
    life5_12 = moom.bs.DOWN;
    spill540_1 = __sourceExactCall_701e21f36b0b65(((net.minecraft.inventory.IInventory)(life4_7)), ((moom.bs)(life5_12)));
    if (!((life3_8 != null))) {
        lexicalValue540_23_0 = ((spill540_1) ? 1 : 0);
        break lexical_join_23;
    }
    if (!(spill540_1)) {
        break lexical_join_21;
    }
    return ((0) != 0);
    }
    lexicalValue540_23_0 = ((life4_7 instanceof net.minecraft.inventory.ISidedInventory) ? 1 : 0);
    }
    if (!((life3_8 != null))) {
        lexicalValue540_66_0 = lexicalValue540_23_0;
        break lexical_join_66;
    }
    if (!((lexicalValue540_23_0 != 0))) {
        break lexical_join_64;
    }
    life6_36 = ((net.minecraft.inventory.ISidedInventory)(life4_7));
    life7_40 = __sourceExactCall_3625691491bce4(((net.minecraft.inventory.ISidedInventory)(life6_36)), ((moom.bs)(life5_12)));
    life8_42 = life7_40;
    life9_45 = (life8_42).length;
    life10_47 = 0;
    lexical_cycle_40: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    if (!((life10_47 < life9_45))) {
        break lexical_join_62;
    }
    life11_54 = (life8_42)[life10_47];
    if (!((life3_8 != null))) {
        break lexical_join_60;
    }
    spill540_2 = __sourceExactCall_c5abb405783959(((net.minecraft.tileentity.IHopper)(p0)), ((net.minecraft.inventory.IInventory)(life4_7)), ((int)(life11_54)), ((moom.bs)(life5_12)));
    if (!((life3_8 != null))) {
        lexicalValue540_122_0 = ((spill540_2) ? 1 : 0);
        break lexical_join_122;
    }
    if (!(spill540_2)) {
        break lexical_join_59;
    }
    return ((1) != 0);
    }
    life10_47 += 1;
    }
    if (!((life3_8 == null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    if (!((life3_8 == null))) {
        break lexical_join_87;
    }
    }
    lexicalValue540_66_0 = ((net.minecraft.inventory.IInventory)(life4_7)).b__Int();
    }
    life7_85 = lexicalValue540_66_0;
    life8_87 = 0;
    lexical_cycle_69: while (true) {
    lexical_join_84: {
    lexical_join_83: {
    if (!((life8_87 < life7_85))) {
        break lexical_join_87;
    }
    spill540_3 = __sourceExactCall_c5abb405783959(((net.minecraft.tileentity.IHopper)(p0)), ((net.minecraft.inventory.IInventory)(life4_7)), ((int)(life8_87)), ((moom.bs)(life5_12)));
    if (!((life3_8 != null))) {
        lexicalValue540_122_0 = ((spill540_3) ? 1 : 0);
        break lexical_join_122;
    }
    if (!((life3_8 != null))) {
        lexicalValue540_83_0 = ((spill540_3) ? 1 : 0);
        break lexical_join_83;
    }
    if (!(spill540_3)) {
        break lexical_join_84;
    }
    lexicalValue540_83_0 = 1;
    }
    return ((lexicalValue540_83_0) != 0);
    }
    life8_87 += 1;
    if (!((life3_8 == null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    if (!((life3_8 == null))) {
        break lexical_join_121;
    }
    }
    life5_126 = ((java.util.List)(__sourceExactCall_9d41e14219f795(((net.minecraft.world.World)(((net.minecraft.tileentity.IHopper)(p0)).c__sourceInterfaceWorld())), ((double)(__sourceExactCall_e61cc3e63667fb(((net.minecraft.tileentity.IHopper)(p0))))), ((double)((__sourceExactCall_1e0dd557f11538(((net.minecraft.tileentity.IHopper)(p0))) + 0x1.0p0d))), ((double)(((net.minecraft.tileentity.IHopper)(p0)).c__sourceReturn_fedcb3e4d3()))))).iterator();
    lexical_cycle_102: while (true) {
    lexical_join_119: {
    lexical_join_118: {
    if (!(((java.util.Iterator)(life5_126)).hasNext())) {
        break lexical_join_121;
    }
    life6_133 = ((net.minecraft.entity.item.EntityItem)(((java.util.Iterator)(life5_126)).next()));
    spill540_4 = __sourceExactCall_c3802b3f9ca905(((net.minecraft.inventory.IInventory)(p0)), ((net.minecraft.entity.item.EntityItem)(life6_133)));
    if (!((life3_8 != null))) {
        lexicalValue540_122_0 = ((spill540_4) ? 1 : 0);
        break lexical_join_122;
    }
    if (!((life3_8 != null))) {
        lexicalValue540_118_0 = ((spill540_4) ? 1 : 0);
        break lexical_join_118;
    }
    if (!(spill540_4)) {
        break lexical_join_119;
    }
    lexicalValue540_118_0 = 1;
    }
    return ((lexicalValue540_118_0) != 0);
    }
    if (!((life3_8 == null))) { continue lexical_cycle_102; }
    break lexical_cycle_102;
    }
    }
    lexicalValue540_122_0 = 0;
    }
    return ((lexicalValue540_122_0) != 0);
}


public boolean m() {
int forwardValue1672_13_0;
    int forwardValue1672_15_0;
    int spill1672_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.Cp.q ^ 123500398431422L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1672_0 = this.p;
    if (!((life3_5 != null))) {
        forwardValue1672_13_0 = spill1672_0;
        break forward_join_13;
    }
    if (!((spill1672_0 <= 1))) {
        break forward_join_14;
    }
    forwardValue1672_13_0 = 1;
    }
    forwardValue1672_15_0 = forwardValue1672_13_0;
    break forward_join_15;
    }
    forwardValue1672_15_0 = 0;
    }
    return ((forwardValue1672_15_0) != 0);
}


private boolean k() {
int lexicalValue546_28_0;
    net.minecraft.item.ItemStack lexicalValue546_43_0;
    int lexicalValue546_64_0;
    java.lang.String[] spill546_0;
    boolean spill546_1;
    net.minecraft.item.ItemStack spill546_2;
    int spill546_3;
    long life1_3;
    net.minecraft.inventory.IInventory life4_7;
    java.lang.String[] life3_8;
    moom.bs life5_19;
    int life6_35;
    net.minecraft.item.ItemStack life7_56;
    net.minecraft.item.ItemStack life8_64;
    lexical_join_72: {
    lexical_join_28: {
    lexical_join_27: {
    lexical_join_13: {
    life1_3 = (moom.Cp.q ^ 71535479712559L);
    spill546_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = ((moom.Cp)(this)).a__wo();
    life3_8 = spill546_0;
    if (!((life4_7 == null))) {
        break lexical_join_13;
    }
    return ((0) != 0);
    }
    life5_19 = ((moom.bs)(__sourceExactCall_ab5ffeed94d386(((int)(((moom.Cp)(this)).e()))))).a__bs();
    spill546_1 = ((moom.Cp)(this)).a(((net.minecraft.inventory.IInventory)(life4_7)), ((moom.bs)(life5_19)));
    if (!((life3_8 != null))) {
        lexicalValue546_28_0 = ((spill546_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill546_1)) {
        break lexical_join_27;
    }
    return ((0) != 0);
    }
    lexicalValue546_28_0 = 0;
    }
    life6_35 = lexicalValue546_28_0;
    lexical_cycle_29: while (true) {
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_61: {
    lexical_join_43: {
    if (!((life6_35 < ((moom.Cp)(this)).b__Int()))) {
        break lexical_join_72;
    }
    spill546_2 = ((moom.Cp)(this)).a__xW(((int)(life6_35)));
    if (!((life3_8 != null))) {
        lexicalValue546_43_0 = spill546_2;
        break lexical_join_43;
    }
    if (!((spill546_2 != null))) {
        break lexical_join_69;
    }
    lexicalValue546_43_0 = ((net.minecraft.item.ItemStack)(((moom.Cp)(this)).a__xW(((int)(life6_35))))).a__xW();
    }
    life7_56 = lexicalValue546_43_0;
    life8_64 = __sourceExactCall_ff276ee9017469(((net.minecraft.inventory.IInventory)(life4_7)), ((net.minecraft.item.ItemStack)(((moom.Cp)(this)).a(((int)(life6_35)), ((int)(1))))), ((moom.bs)(life5_19)));
    if (!((life3_8 != null))) {
        break lexical_join_63;
    }
    if (!((life8_64 != null))) {
        break lexical_join_61;
    }
    spill546_3 = ((net.minecraft.item.ItemStack)(life8_64)).b;
    if (!((life3_8 != null))) {
        lexicalValue546_64_0 = spill546_3;
        break lexical_join_64;
    }
    if (!((spill546_3 == 0))) {
        break lexical_join_65;
    }
    }
    ((net.minecraft.inventory.IInventory)(life4_7)).a__Void();
    }
    lexicalValue546_64_0 = 1;
    }
    return ((lexicalValue546_64_0) != 0);
    }
    ((moom.Cp)(this)).a__Void(((int)(life6_35)), ((net.minecraft.item.ItemStack)(life7_56)));
    }
    life6_35 += 1;
    if (!((life3_8 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return ((0) != 0);
}


private boolean j() {
net.minecraft.item.ItemStack lexicalValue545_26_0;
    int lexicalValue545_33_0;
    java.lang.String[] spill545_0;
    net.minecraft.item.ItemStack spill545_1;
    int spill545_2;
    long life1_3;
    net.minecraft.item.ItemStack[] life4_7;
    java.lang.String[] life3_8;
    int life5_11;
    int life6_13;
    net.minecraft.item.ItemStack life7_20;
    lexical_join_37: {
    life1_3 = (moom.Cp.q ^ 49419184455973L);
    spill545_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_7 = this.n;
    life3_8 = spill545_0;
    life5_11 = (life4_7).length;
    life6_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_26: {
    if (!((life6_13 < life5_11))) {
        break lexical_join_37;
    }
    life7_20 = (life4_7)[life6_13];
    spill545_1 = life7_20;
    if (!((life3_8 != null))) {
        lexicalValue545_26_0 = spill545_1;
        break lexical_join_26;
    }
    if (!((spill545_1 != null))) {
        break lexical_join_32;
    }
    lexicalValue545_26_0 = life7_20;
    }
    spill545_2 = ((net.minecraft.item.ItemStack)(lexicalValue545_26_0)).b;
    if (!((life3_8 != null))) {
        lexicalValue545_33_0 = spill545_2;
        break lexical_join_33;
    }
    if (!((spill545_2 != ((net.minecraft.item.ItemStack)(life7_20)).a()))) {
        break lexical_join_34;
    }
    }
    lexicalValue545_33_0 = 0;
    }
    return ((lexicalValue545_33_0) != 0);
    }
    life6_13 += 1;
    if (!((life3_8 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return ((1) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4124_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_555a89bd2824_invokedynamic1651_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic541_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic541_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite1096_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4d53036195fc_invokedynamic1667_19(int a0, long a1) throws E;

private static native boolean __sourceExactCall_8deadf247ea7dd(int p0);
private static native boolean __sourceExactCall_89d668202ff0ca(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1);
private static native int __sourceExactCall_877369ccf6b0dd(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);
private static native net.minecraft.item.ItemStack __sourceExactCall_ff276ee9017469(net.minecraft.inventory.IInventory p0, net.minecraft.item.ItemStack p1, moom.bs p2);
private static native moom.bs __sourceExactCall_ab5ffeed94d386(int p0);
private static native boolean __sourceExactCall_8c62618051c2c8(net.minecraft.item.ItemStack p0, net.minecraft.item.ItemStack p1);
private static native net.minecraft.inventory.IInventory __sourceExactCall_c3870ce80e5f8a(net.minecraft.tileentity.IHopper p0);
private static native boolean __sourceExactCall_c3802b3f9ca905(net.minecraft.inventory.IInventory p0, net.minecraft.entity.item.EntityItem p1);

private static native net.minecraft.item.ItemStack __sourceExactCall_9baebc2ed27c57(net.minecraft.inventory.ISidedInventory p0, int p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_d566cd036e054c(net.minecraft.inventory.IInventory p0, int p1);

private static native double __sourceExactCall_e61cc3e63667fb(net.minecraft.tileentity.IHopper p0);
private static native double __sourceExactCall_1e0dd557f11538(net.minecraft.tileentity.IHopper p0);
private static native int __sourceExactCall_0a73aed9fe6bb5(net.minecraft.item.ItemStack p0);
private static native boolean __sourceExactCall_701e21f36b0b65(net.minecraft.inventory.IInventory p0, moom.bs p1);
private static native int[] __sourceExactCall_3625691491bce4(net.minecraft.inventory.ISidedInventory p0, moom.bs p1);
private static native boolean __sourceExactCall_c5abb405783959(net.minecraft.tileentity.IHopper p0, net.minecraft.inventory.IInventory p1, int p2, moom.bs p3);
private static native java.util.List __sourceExactCall_9d41e14219f795(net.minecraft.world.World p0, double p1, double p2, double p3);
}
