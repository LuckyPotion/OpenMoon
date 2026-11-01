package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;























import moom.cZ;





import net.minecraft.tileentity.MobSpawnerBaseLogic;




import net.minecraft.entity.player.EntityPlayer;
import java.util.Map;
public class TileEntityChest extends moom.Ci implements net.minecraft.util.ITickable, net.minecraft.inventory.IInventory {

private net.minecraft.item.ItemStack[] n;

public boolean o;

public net.minecraft.tileentity.TileEntityChest p;

public net.minecraft.tileentity.TileEntityChest q;

public net.minecraft.tileentity.TileEntityChest r;

public net.minecraft.tileentity.TileEntityChest s;

public float t;

public float u;

public int v;

private int w;

private int x;

private java.lang.String y;

private static long A;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public TileEntityChest() { super(); }

private static void __sourceConstructorBody_a871336d5eceb72f(net.minecraft.tileentity.TileEntityChest receiver) throws Throwable {
long local1 = (net.minecraft.tileentity.TileEntityChest.A ^ 113767394535589L);
    net.minecraft.tileentity.TileEntityChest.__sourceConstructorInit_a871336d5eceb72f_0(((net.minecraft.tileentity.TileEntityChest)(receiver)));
    ((net.minecraft.tileentity.TileEntityChest)(receiver)).n = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_a871336d5eceb72f_originalDynamicSite3972_2(11548, (3586793274178779888L ^ local1))]));
    ((net.minecraft.tileentity.TileEntityChest)(receiver)).x = ((int)(-1));
    return;
}


public TileEntityChest(int p0) { super(); }

private static void __sourceConstructorBody_3a6d9ddf299b3d27(net.minecraft.tileentity.TileEntityChest receiver, int p0) throws Throwable {
long local2 = (net.minecraft.tileentity.TileEntityChest.A ^ 125456590216739L);
    net.minecraft.tileentity.TileEntityChest.__sourceConstructorInit_3a6d9ddf299b3d27_0(((net.minecraft.tileentity.TileEntityChest)(receiver)));
    ((net.minecraft.tileentity.TileEntityChest)(receiver)).n = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_3a6d9ddf299b3d27_originalDynamicSite3973_2(11548, (3586778556773059702L ^ local2))]));
    ((net.minecraft.tileentity.TileEntityChest)(receiver)).x = ((int)(p0));
    return;
}


static {
A = ((long)(((moom._a)(moom._c.a(((long)(-7719407131793526440L)), ((long)(1912432383957091601L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(177983381192926L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.tileentity.TileEntityChest.A ^ 210751048952L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1927_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1927_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1927_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1927_14 = new byte[8];
    (__sourceSpill1927_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1927_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1927_16 = __sourceSpill1927_14;
    ((javax.crypto.Cipher)(__sourceSpill1927_11)).init(((int)(__sourceSpill1927_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1927_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1927_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "H´¾8\0302ÜV;\035wÄ»\r-(A¦}á(½¸ù\037 \033¹£³K\035"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1927_25 = local6_life21;
        int __sourceSpill1927_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1927_25)).substring(((int)(__sourceSpill1927_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1927_30 = local8_life19;
        int __sourceSpill1927_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1927_33 = new byte[8];
        (__sourceSpill1927_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1927_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1927_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1927_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1927_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1927_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1927_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1927_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1927_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1927_34)).doFinal(((byte[])(__sourceSpill1927_33)));
        (__sourceSpill1927_30)[__sourceSpill1927_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "0Vdã\001QË§¦KÇ|­À\034"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1927_38 = local6_life21;
        int __sourceSpill1927_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1927_38)).substring(((int)(__sourceSpill1927_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1927_43 = local8_life19;
        int __sourceSpill1927_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1927_46 = new byte[8];
        (__sourceSpill1927_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1927_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1927_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1927_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1927_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1927_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1927_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1927_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1927_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1927_47)).doFinal(((byte[])(__sourceSpill1927_46)));
        (__sourceSpill1927_43)[__sourceSpill1927_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    C = ((long[])(local8_life19));
    D = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a871336d5eceb72f_0(net.minecraft.tileentity.TileEntityChest a0) throws E;
private static native <E extends Throwable> void __sourceConstructorInit_3a6d9ddf299b3d27_0(net.minecraft.tileentity.TileEntityChest a0) throws E;

public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.n)), ((java.lang.Object)(null)));
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.tileentity.TileEntityChest lexicalValue1697_56_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1697_60_0;
    java.lang.String lexicalValue1697_60_1;
    java.lang.String[] spill1697_0;
    net.minecraft.tileentity.TileEntityChest spill1697_1;
    net.minecraft.nbt.NBTTagCompound spill1697_2;
    java.lang.String spill1697_3;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_11;
    int life6_13;
    java.lang.String[] life4_14;
    net.minecraft.nbt.NBTTagCompound life7_33;
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_49: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 96063094560512L);
    spill1697_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_11 = new net.minecraft.nbt.NBTTagList();
    life6_13 = 0;
    life4_14 = spill1697_0;
    lexical_cycle_15: while (true) {
    lexical_join_46: {
    if (!((life6_13 < (this.n).length))) {
        break lexical_join_49;
    }
    spill1697_1 = this;
    if (!((life4_14 != null))) {
        lexicalValue1697_56_0 = spill1697_1;
        break lexical_join_56;
    }
    if (!(((((net.minecraft.tileentity.TileEntityChest)(spill1697_1)).n)[life6_13] != null))) {
        break lexical_join_46;
    }
    life7_33 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_33)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_13))));
    ((net.minecraft.item.ItemStack)((this.n)[life6_13])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_33)));
    ((net.minecraft.nbt.NBTTagList)(life5_11)).a(((net.minecraft.nbt.NBTBase)(life7_33)));
    }
    life6_13 += 1;
    if (!((life4_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    spill1697_2 = p0;
    spill1697_3 = "Items";
    if (!((life4_14 != null))) {
        lexicalValue1697_60_0 = spill1697_2;
        lexicalValue1697_60_1 = spill1697_3;
        break lexical_join_60;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill1697_2)).a(((java.lang.String)(spill1697_3)), ((net.minecraft.nbt.NBTBase)(life5_11)));
    lexicalValue1697_56_0 = this;
    }
    if (!(((net.minecraft.tileentity.TileEntityChest)(lexicalValue1697_56_0)).e__Boolean())) {
        break lexical_join_63;
    }
    lexicalValue1697_60_0 = p0;
    lexicalValue1697_60_1 = "CustomName";
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1697_60_0)).a(((java.lang.String)(lexicalValue1697_60_1)), ((java.lang.String)(this.y)));
    }
    return;
}


public int b__Int() {
long local1 = (net.minecraft.tileentity.TileEntityChest.A ^ 7252717204586L);
    return __sourceIntrinsic_a63cd0a8780c_originalDynamicSite2044_1(11513, (8400065214450214872L ^ local1));
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5679_15_0;
    net.minecraft.tileentity.TileEntityChest forwardValue5679_43_0;
    boolean spill5679_0;
    net.minecraft.tileentity.TileEntityChest spill5679_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_50: {
    forward_join_43: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 70824337777739L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5679_0 = ((net.minecraft.entity.player.EntityPlayer)(p0)).U__Boolean();
    if (!((life4_5 != null))) {
        forwardValue5679_15_0 = ((spill5679_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill5679_0))) {
        break forward_join_50;
    }
    spill5679_1 = this;
    if (!((life4_5 != null))) {
        forwardValue5679_43_0 = spill5679_1;
        break forward_join_43;
    }
    forwardValue5679_15_0 = ((net.minecraft.tileentity.TileEntityChest)(spill5679_1)).v;
    }
    if (!((forwardValue5679_15_0 < 0))) {
        break forward_join_19;
    }
    this.v = ((int)(0));
    }
    net.minecraft.tileentity.TileEntityChest __stackOp5679_6_0 = this;
    ((net.minecraft.tileentity.TileEntityChest)(__stackOp5679_6_0)).v = ((int)((((net.minecraft.tileentity.TileEntityChest)(__stackOp5679_6_0)).v + 1)));
    ((net.minecraft.world.World)(this.d)).c(((moom.DT)(this.e)), ((net.minecraft.block.Block)(((net.minecraft.tileentity.TileEntityChest)(this)).a__ch())), ((int)(1)), ((int)(this.v)));
    ((net.minecraft.world.World)(this.d)).b(((moom.DT)(this.e)), ((net.minecraft.block.Block)(((net.minecraft.tileentity.TileEntityChest)(this)).a__ch())));
    forwardValue5679_43_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(forwardValue5679_43_0)).d)).b(((moom.DT)(((moom.DT)(this.e)).b__DT())), ((net.minecraft.block.Block)(((net.minecraft.tileentity.TileEntityChest)(this)).a__ch())));
    }
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue5681_17_0;
    net.minecraft.item.ItemStack spill5681_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 19831525321398L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5681_0 = (this.n)[p0];
    if (!((life4_5 != null))) {
        forwardValue5681_17_0 = spill5681_0;
        break forward_join_17;
    }
    if (!((spill5681_0 != null))) {
        break forward_join_25;
    }
    forwardValue5681_17_0 = (this.n)[p0];
    }
    life5_23 = forwardValue5681_17_0;
    (this.n)[p0] = null;
    return life5_23;
    }
    return null;
}


public boolean e__Boolean() {
java.lang.String forwardValue5683_13_0;
    int forwardValue5683_18_0;
    int forwardValue5683_20_0;
    java.lang.String spill5683_0;
    int spill5683_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 74563965054989L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5683_0 = this.y;
    if (!((life3_5 != null))) {
        forwardValue5683_13_0 = spill5683_0;
        break forward_join_13;
    }
    if (!((spill5683_0 != null))) {
        break forward_join_19;
    }
    forwardValue5683_13_0 = this.y;
    }
    spill5683_1 = ((java.lang.String)(forwardValue5683_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue5683_18_0 = spill5683_1;
        break forward_join_18;
    }
    if (!((spill5683_1 > 0))) {
        break forward_join_19;
    }
    forwardValue5683_18_0 = 1;
    }
    forwardValue5683_20_0 = forwardValue5683_18_0;
    break forward_join_20;
    }
    forwardValue5683_20_0 = 0;
    }
    return ((forwardValue5683_20_0) != 0);
}


public java.lang.String c__String() {
return "minecraft:chest";
}


public void c__Void() {
moom.v8 lexicalValue1698_121_0;
    net.minecraft.inventory.IInventory lexicalValue1698_130_0;
    int lexicalValue1698_138_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_148_0;
    int lexicalValue1698_155_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_196_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_204_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_223_0;
    int lexicalValue1698_224_0;
    int lexicalValue1698_236_0;
    int lexicalValue1698_245_0;
    float lexicalValue1698_248_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_263_0;
    float lexicalValue1698_279_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_324_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_332_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_351_0;
    int lexicalValue1698_356_0;
    net.minecraft.tileentity.TileEntityChest lexicalValue1698_358_0;
    java.lang.String[] spill1698_0;
    net.minecraft.tileentity.TileEntityChest spill1698_1;
    net.minecraft.tileentity.TileEntityChest spill1698_2;
    net.minecraft.tileentity.TileEntityChest spill1698_3;
    moom.v8 spill1698_4;
    int spill1698_5;
    net.minecraft.inventory.IInventory spill1698_6;
    int spill1698_7;
    int spill1698_8;
    net.minecraft.tileentity.TileEntityChest spill1698_9;
    net.minecraft.tileentity.TileEntityChest spill1698_10;
    net.minecraft.tileentity.TileEntityChest spill1698_11;
    float spill1698_12;
    float spill1698_13;
    net.minecraft.tileentity.TileEntityChest spill1698_14;
    float spill1698_15;
    int spill1698_16;
    int spill1698_17;
    net.minecraft.tileentity.TileEntityChest spill1698_18;
    net.minecraft.tileentity.TileEntityChest spill1698_19;
    net.minecraft.tileentity.TileEntityChest spill1698_20;
    long life1_3;
    int life4_10;
    java.lang.String[] life3_11;
    int life5_15;
    int life6_19;
    float life7_73;
    java.util.Iterator life8_118;
    net.minecraft.entity.player.EntityPlayer life9_125;
    net.minecraft.inventory.IInventory life10_147;
    double life8_239;
    double life10_244;
    float life8_338;
    float life9_384;
    double life10_433;
    double life12_438;
    lexical_join_360: {
    lexical_join_358: {
    lexical_join_356: {
    lexical_join_351: {
    lexical_join_350: {
    lexical_join_332: {
    lexical_join_331: {
    lexical_join_324: {
    lexical_join_322: {
    lexical_join_279: {
    lexical_join_278: {
    lexical_join_268: {
    lexical_join_263: {
    lexical_join_262: {
    lexical_join_248: {
    lexical_join_246: {
    lexical_join_245: {
    lexical_join_236: {
    lexical_join_234: {
    lexical_join_224: {
    lexical_join_223: {
    lexical_join_222: {
    lexical_join_204: {
    lexical_join_203: {
    lexical_join_196: {
    lexical_join_194: {
    lexical_join_155: {
    lexical_join_148: {
    lexical_join_147: {
    life1_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 13655513062059L);
    spill1698_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    ((net.minecraft.tileentity.TileEntityChest)(this)).g__sourceReturn_da8c82d5d4();
    life4_10 = ((moom.DT)(this.e)).a();
    life3_11 = spill1698_0;
    life5_15 = ((moom.DT)(this.e)).b();
    life6_19 = ((moom.DT)(this.e)).c();
    net.minecraft.tileentity.TileEntityChest __stackOp1698_9_0 = this;
    ((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_9_0)).w = ((int)((((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_9_0)).w + 1)));
    spill1698_1 = this;
    if (!((life3_11 != null))) {
        lexicalValue1698_148_0 = spill1698_1;
        break lexical_join_148;
    }
    if (!((!((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(spill1698_1)).d)).G))) {
        break lexical_join_147;
    }
    spill1698_2 = this;
    if (!((life3_11 != null))) {
        lexicalValue1698_148_0 = spill1698_2;
        break lexical_join_148;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(spill1698_2)).v != 0))) {
        break lexical_join_147;
    }
    spill1698_3 = this;
    if (!((life3_11 != null))) {
        lexicalValue1698_148_0 = spill1698_3;
        break lexical_join_148;
    }
    if (!((((((((net.minecraft.tileentity.TileEntityChest)(spill1698_3)).w + life4_10) + life5_15) + life6_19) % __sourceIntrinsic_7ac46ee229a8_invokedynamic1698_16(17578, (4262504503698612556L ^ life1_3))) == 0))) {
        break lexical_join_147;
    }
    this.v = ((int)(0));
    life7_73 = 0x1.4p2f;
    life8_118 = ((java.util.List)(((net.minecraft.world.World)(this.d)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(new moom.CA(((double) (((float) life4_10) - life7_73)), ((double) (((float) life5_15) - life7_73)), ((double) (((float) life6_19) - life7_73)), ((double) (((float) (life4_10 + 1)) + life7_73)), ((double) (((float) (life5_15 + 1)) + life7_73)), ((double) (((float) (life6_19 + 1)) + life7_73)))))))).iterator();
    lexical_cycle_104: while (true) {
    lexical_join_145: {
    lexical_join_139: {
    lexical_join_138: {
    lexical_join_130: {
    lexical_join_121: {
    if (!(((java.util.Iterator)(life8_118)).hasNext())) {
        break lexical_join_147;
    }
    life9_125 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life8_118)).next()));
    spill1698_4 = ((net.minecraft.entity.player.EntityPlayer)(life9_125)).bG;
    if (!((life3_11 != null))) {
        lexicalValue1698_121_0 = spill1698_4;
        break lexical_join_121;
    }
    spill1698_5 = ((spill1698_4 instanceof moom.wc) ? 1 : 0);
    if (!((life3_11 != null))) {
        lexicalValue1698_155_0 = spill1698_5;
        break lexical_join_155;
    }
    if (!((spill1698_5 != 0))) {
        break lexical_join_145;
    }
    lexicalValue1698_121_0 = ((net.minecraft.entity.player.EntityPlayer)(life9_125)).bG;
    }
    life10_147 = ((moom.wc)(((moom.wc)(lexicalValue1698_121_0)))).a__sourceReturn_6fb8138116();
    spill1698_6 = life10_147;
    if (!((life3_11 != null))) {
        lexicalValue1698_130_0 = spill1698_6;
        break lexical_join_130;
    }
    if (!((spill1698_6 != this))) {
        break lexical_join_139;
    }
    lexicalValue1698_130_0 = life10_147;
    }
    spill1698_7 = ((lexicalValue1698_130_0 instanceof moom.wz) ? 1 : 0);
    if (!((life3_11 != null))) {
        lexicalValue1698_138_0 = spill1698_7;
        break lexical_join_138;
    }
    if (!((spill1698_7 != 0))) {
        break lexical_join_145;
    }
    lexicalValue1698_138_0 = ((((moom.wz)(((moom.wz)(life10_147)))).a(((net.minecraft.inventory.IInventory)(this)))) ? 1 : 0);
    }
    if (!((lexicalValue1698_138_0 != 0))) {
        break lexical_join_145;
    }
    }
    net.minecraft.tileentity.TileEntityChest __stackOp1698_34_0 = this;
    ((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_34_0)).v = ((int)((((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_34_0)).v + 1)));
    }
    if (!((life3_11 == null))) { continue lexical_cycle_104; }
    break lexical_cycle_104;
    }
    }
    lexicalValue1698_148_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_148_0)).u = ((float)(this.t));
    life7_73 = 0x1.99999ap-4f;
    lexicalValue1698_155_0 = this.v;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_224_0 = lexicalValue1698_155_0;
        break lexical_join_224;
    }
    if (!((lexicalValue1698_155_0 > 0))) {
        break lexical_join_222;
    }
    spill1698_8 = recovery.source.CarrierOps.fcmpl(((float)(this.t)), ((float)(0x0.0p0f)));
    if (!((life3_11 != null))) {
        lexicalValue1698_224_0 = spill1698_8;
        break lexical_join_224;
    }
    if (!((spill1698_8 == 0))) {
        break lexical_join_222;
    }
    spill1698_9 = this.p;
    if (!((life3_11 != null))) {
        lexicalValue1698_223_0 = spill1698_9;
        break lexical_join_223;
    }
    if (!((spill1698_9 == null))) {
        break lexical_join_222;
    }
    spill1698_10 = this.r;
    if (!((life3_11 != null))) {
        lexicalValue1698_223_0 = spill1698_10;
        break lexical_join_223;
    }
    if (!((spill1698_10 == null))) {
        break lexical_join_222;
    }
    life8_239 = (((double) life4_10) + 0x1.0p-1d);
    life10_244 = (((double) life6_19) + 0x1.0p-1d);
    spill1698_11 = this.s;
    if (!((life3_11 != null))) {
        lexicalValue1698_196_0 = spill1698_11;
        break lexical_join_196;
    }
    if (!((spill1698_11 != null))) {
        break lexical_join_194;
    }
    life10_244 = (life10_244 + 0x1.0p-1d);
    }
    lexicalValue1698_196_0 = this.q;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_204_0 = lexicalValue1698_196_0;
        break lexical_join_204;
    }
    if (!((lexicalValue1698_196_0 != null))) {
        break lexical_join_203;
    }
    life8_239 = (life8_239 + 0x1.0p-1d);
    }
    lexicalValue1698_204_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_204_0)).d)).a(((double)(life8_239)), ((double)((((double) life5_15) + 0x1.0p-1d))), ((double)(life10_244)), ((java.lang.String)("random.chestopen")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    }
    lexicalValue1698_223_0 = this;
    }
    lexicalValue1698_224_0 = ((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_223_0)).v;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_236_0 = lexicalValue1698_224_0;
        break lexical_join_236;
    }
    if (!((lexicalValue1698_224_0 == 0))) {
        break lexical_join_234;
    }
    spill1698_12 = this.t;
    if (!((life3_11 != null))) {
        lexicalValue1698_248_0 = spill1698_12;
        break lexical_join_248;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1698_12)), ((float)(0x0.0p0f))) <= 0))) {
        break lexical_join_246;
    }
    }
    lexicalValue1698_236_0 = this.v;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_245_0 = lexicalValue1698_236_0;
        break lexical_join_245;
    }
    if (!((lexicalValue1698_236_0 > 0))) {
        break lexical_join_360;
    }
    spill1698_13 = this.t;
    if (!((life3_11 != null))) {
        lexicalValue1698_248_0 = spill1698_13;
        break lexical_join_248;
    }
    lexicalValue1698_245_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1698_13)), ((float)(0x1.0p0f)));
    }
    if (!((lexicalValue1698_245_0 < 0))) {
        break lexical_join_360;
    }
    }
    lexicalValue1698_248_0 = this.t;
    }
    life8_338 = lexicalValue1698_248_0;
    spill1698_14 = this;
    if (!((life3_11 != null))) {
        lexicalValue1698_263_0 = spill1698_14;
        break lexical_join_263;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(spill1698_14)).v > 0))) {
        break lexical_join_262;
    }
    net.minecraft.tileentity.TileEntityChest __stackOp1698_59_0 = this;
    ((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_59_0)).t = ((float)((((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_59_0)).t + life7_73)));
    if (!((life3_11 == null))) {
        break lexical_join_268;
    }
    }
    lexicalValue1698_263_0 = this;
    }
    net.minecraft.tileentity.TileEntityChest __stackOp1698_62_0 = lexicalValue1698_263_0;
    ((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_62_0)).t = ((float)((((net.minecraft.tileentity.TileEntityChest)(__stackOp1698_62_0)).t - life7_73)));
    }
    spill1698_15 = this.t;
    if (!((life3_11 != null))) {
        lexicalValue1698_279_0 = spill1698_15;
        break lexical_join_279;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1698_15)), ((float)(0x1.0p0f))) > 0))) {
        break lexical_join_278;
    }
    this.t = ((float)(0x1.0p0f));
    }
    lexicalValue1698_279_0 = 0x1.0p-1f;
    }
    life9_384 = lexicalValue1698_279_0;
    spill1698_16 = recovery.source.CarrierOps.fcmpg(((float)(this.t)), ((float)(life9_384)));
    if (!((life3_11 != null))) {
        lexicalValue1698_356_0 = spill1698_16;
        break lexical_join_356;
    }
    if (!((spill1698_16 < 0))) {
        break lexical_join_350;
    }
    spill1698_17 = recovery.source.CarrierOps.fcmpl(((float)(life8_338)), ((float)(life9_384)));
    if (!((life3_11 != null))) {
        lexicalValue1698_356_0 = spill1698_17;
        break lexical_join_356;
    }
    if (!((spill1698_17 >= 0))) {
        break lexical_join_350;
    }
    spill1698_18 = this.p;
    if (!((life3_11 != null))) {
        lexicalValue1698_351_0 = spill1698_18;
        break lexical_join_351;
    }
    if (!((spill1698_18 == null))) {
        break lexical_join_350;
    }
    spill1698_19 = this.r;
    if (!((life3_11 != null))) {
        lexicalValue1698_351_0 = spill1698_19;
        break lexical_join_351;
    }
    if (!((spill1698_19 == null))) {
        break lexical_join_350;
    }
    life10_433 = (((double) life4_10) + 0x1.0p-1d);
    life12_438 = (((double) life6_19) + 0x1.0p-1d);
    spill1698_20 = this.s;
    if (!((life3_11 != null))) {
        lexicalValue1698_324_0 = spill1698_20;
        break lexical_join_324;
    }
    if (!((spill1698_20 != null))) {
        break lexical_join_322;
    }
    life12_438 = (life12_438 + 0x1.0p-1d);
    }
    lexicalValue1698_324_0 = this.q;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_332_0 = lexicalValue1698_324_0;
        break lexical_join_332;
    }
    if (!((lexicalValue1698_324_0 != null))) {
        break lexical_join_331;
    }
    life10_433 = (life10_433 + 0x1.0p-1d);
    }
    lexicalValue1698_332_0 = this;
    }
    ((net.minecraft.world.World)(((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_332_0)).d)).a(((double)(life10_433)), ((double)((((double) life5_15) + 0x1.0p-1d))), ((double)(life12_438)), ((java.lang.String)("random.chestclosed")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(this.d)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    }
    lexicalValue1698_351_0 = this;
    }
    if (!((life3_11 != null))) {
        lexicalValue1698_358_0 = lexicalValue1698_351_0;
        break lexical_join_358;
    }
    lexicalValue1698_356_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_351_0)).t)), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue1698_356_0 < 0))) {
        break lexical_join_360;
    }
    lexicalValue1698_358_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(lexicalValue1698_358_0)).t = ((float)(0x0.0p0f));
    }
    return;
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
block3: {
            TileEntityChest tileEntityChest;
            block4: {
                boolean bl;
                block2: {
                    long l = net.minecraft.tileentity.TileEntityChest.A ^ 0x561337A32E16L;
                    String[] stringArray = MobSpawnerBaseLogic.b__ArrayString();
                    bl = p0.U__Boolean();
                    if (stringArray == null) break block2;
                    if (bl) break block3;
                    tileEntityChest = this;
                    if (stringArray == null) break block4;
                    bl = tileEntityChest.a__ch() instanceof cZ;
                }
                if (!bl) break block3;
                --this.v;
                this.d.c(this.e, this.a__ch(), 1, this.v);
                this.d.b(this.e, this.a__ch());
                tileEntityChest = this;
            }
            tileEntityChest.d.b(__sourceExactCall_bcb977d05e639b(this.e), this.a__ch());
        }
}


public int c__Int() {
long local1 = (net.minecraft.tileentity.TileEntityChest.A ^ 95743482303390L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite2045_1(23164, (5825423243446105768L ^ local1));
}


public int h() {
net.minecraft.tileentity.TileEntityChest forwardValue5685_18_0;
    net.minecraft.tileentity.TileEntityChest forwardValue5685_26_0;
    int forwardValue5685_33_0;
    int spill5685_0;
    net.minecraft.tileentity.TileEntityChest spill5685_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_33: {
    forward_join_31: {
    forward_join_26: {
    forward_join_25: {
    forward_join_23: {
    forward_join_18: {
    life1_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 116529556631484L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5685_0 = this.x;
    if (!((life3_5 != null))) {
        forwardValue5685_33_0 = spill5685_0;
        break forward_join_33;
    }
    if (!((spill5685_0 == -1))) {
        break forward_join_31;
    }
    spill5685_1 = this;
    if (!((life3_5 != null))) {
        forwardValue5685_18_0 = spill5685_1;
        break forward_join_18;
    }
    if (!((((net.minecraft.tileentity.TileEntityChest)(spill5685_1)).d != null))) {
        break forward_join_23;
    }
    forwardValue5685_18_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue5685_26_0 = forwardValue5685_18_0;
        break forward_join_26;
    }
    if (!((((((net.minecraft.tileentity.TileEntityChest)(forwardValue5685_18_0)).a__ch() instanceof moom.cZ) ? 1 : 0) == 0))) {
        break forward_join_25;
    }
    }
    return 0;
    }
    forwardValue5685_26_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue5685_26_0)).x = ((int)(((moom.cZ)(((moom.cZ)(((net.minecraft.tileentity.TileEntityChest)(this)).a__ch())))).S));
    }
    forwardValue5685_33_0 = this.x;
    }
    return forwardValue5685_33_0;
}


public void f__Void() {
super.f__Void();
    this.o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    return;
}


public int d__Int() {
return 0;
}


public void d__Void() {
super.d__Void();
    ((net.minecraft.tileentity.TileEntityChest)(this)).f__Void();
    ((net.minecraft.tileentity.TileEntityChest)(this)).g__sourceReturn_da8c82d5d4();
    return;
}


public void a__Void(int p0, int p1) {
return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12286_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_752e1341a52ea7(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18720;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Cl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wc(p0, this, p1);
}


public java.lang.String a__String() {
net.minecraft.tileentity.TileEntityChest forwardValue5676_12_0;
    java.lang.String forwardValue5676_15_0;
    net.minecraft.tileentity.TileEntityChest spill5676_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 10589033856787L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5676_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5676_12_0 = spill5676_0;
        break forward_join_12;
    }
    if (!(((net.minecraft.tileentity.TileEntityChest)(spill5676_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue5676_12_0 = this;
    }
    forwardValue5676_15_0 = ((net.minecraft.tileentity.TileEntityChest)(forwardValue5676_12_0)).y;
    break forward_join_15;
    }
    forwardValue5676_15_0 = "container.chest";
    }
    return forwardValue5676_15_0;
}


public void a(java.lang.String p0) {
this.y = ((java.lang.String)(p0));
    return;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue1696_40_0;
    java.lang.String[] spill1696_0;
    boolean spill1696_1;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_16;
    java.lang.String[] life4_17;
    int life6_46;
    net.minecraft.nbt.NBTTagCompound life7_54;
    int life8_64;
    lexical_join_77: {
    lexical_join_40: {
    lexical_join_39: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 59798081852929L);
    spill1696_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1696_3(22520, (3198093504187760305L ^ life2_3)))));
    life4_17 = spill1696_0;
    this.n = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((net.minecraft.tileentity.TileEntityChest)(this)).b__Int()]));
    spill1696_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1696_7(27301, (252637804810585067L ^ life2_3)))));
    if (!((life4_17 != null))) {
        lexicalValue1696_40_0 = ((spill1696_1) ? 1 : 0);
        break lexical_join_40;
    }
    if (!(spill1696_1)) {
        break lexical_join_39;
    }
    this.y = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName")))));
    }
    lexicalValue1696_40_0 = 0;
    }
    life6_46 = lexicalValue1696_40_0;
    lexical_cycle_41: while (true) {
    lexical_join_75: {
    lexical_join_74: {
    if (!((life6_46 < ((net.minecraft.nbt.NBTTagList)(life5_16)).a__Int()))) {
        break lexical_join_77;
    }
    life7_54 = ((net.minecraft.nbt.NBTTagList)(life5_16)).a__yw(((int)(life6_46)));
    life8_64 = (((net.minecraft.nbt.NBTTagCompound)(life7_54)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot"))) & __sourceIntrinsic_03d9340fa09f_invokedynamic1696_15(2852, (278590020070122089L ^ life2_3)));
    if (!((life4_17 != null))) {
        break lexical_join_75;
    }
    if (!((life8_64 >= 0))) {
        break lexical_join_74;
    }
    if (!((life8_64 < (this.n).length))) {
        break lexical_join_74;
    }
    (this.n)[life8_64] = __sourceExactCall_b20cc06766c170(((net.minecraft.nbt.NBTTagCompound)(life7_54)));
    }
    life6_46 += 1;
    }
    if (!((life4_17 == null))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5673_39_0;
    int forwardValue5673_41_0;
    int spill5673_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 45700288629058L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(this.d)).a__B9(((moom.DT)(this.e))) == this))) {
        break forward_join_40;
    }
    spill5673_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue5673_39_0 = spill5673_0;
        break forward_join_39;
    }
    if (!((spill5673_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue5673_39_0 = 1;
    }
    forwardValue5673_41_0 = forwardValue5673_39_0;
    break forward_join_41;
    }
    forwardValue5673_41_0 = 0;
    }
    return ((forwardValue5673_41_0) != 0);
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue5677_23_0;
    java.lang.String[] spill5677_0;
    net.minecraft.item.ItemStack spill5677_1;
    long life3_3;
    java.lang.String[] life5_10;
    forward_join_28: {
    forward_join_26: {
    forward_join_23: {
    life3_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 96685842858957L);
    spill5677_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    (this.n)[p0] = p1;
    life5_10 = spill5677_0;
    if (!((life5_10 != null))) {
        break forward_join_28;
    }
    if (!((p1 != null))) {
        break forward_join_26;
    }
    spill5677_1 = p1;
    if (!((life5_10 != null))) {
        forwardValue5677_23_0 = spill5677_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5677_1)).b > ((net.minecraft.tileentity.TileEntityChest)(this)).c__Int()))) {
        break forward_join_26;
    }
    forwardValue5677_23_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(forwardValue5677_23_0)).b = ((int)(((net.minecraft.tileentity.TileEntityChest)(this)).c__Int()));
    }
    ((net.minecraft.tileentity.TileEntityChest)(this)).a__Void();
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue5670_17_0;
    net.minecraft.item.ItemStack forwardValue5670_42_0;
    net.minecraft.item.ItemStack forwardValue5670_59_0;
    net.minecraft.item.ItemStack spill5670_0;
    net.minecraft.item.ItemStack spill5670_1;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_51;
    forward_join_60: {
    forward_join_59: {
    forward_join_56: {
    forward_join_42: {
    forward_join_36: {
    forward_join_17: {
    life3_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 134925354576894L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5670_0 = (this.n)[p0];
    if (!((life5_5 != null))) {
        forwardValue5670_17_0 = spill5670_0;
        break forward_join_17;
    }
    if (!((spill5670_0 != null))) {
        break forward_join_60;
    }
    forwardValue5670_17_0 = (this.n)[p0];
    }
    if (!((life5_5 != null))) {
        forwardValue5670_42_0 = forwardValue5670_17_0;
        break forward_join_42;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5670_17_0)).b <= p1))) {
        break forward_join_36;
    }
    life6_35 = (this.n)[p0];
    (this.n)[p0] = null;
    ((net.minecraft.tileentity.TileEntityChest)(this)).a__Void();
    return life6_35;
    }
    forwardValue5670_42_0 = ((net.minecraft.item.ItemStack)((this.n)[p0])).a(((int)(p1)));
    }
    life6_51 = forwardValue5670_42_0;
    spill5670_1 = (this.n)[p0];
    if (!((life5_5 != null))) {
        forwardValue5670_59_0 = spill5670_1;
        break forward_join_59;
    }
    if (!((((net.minecraft.item.ItemStack)(spill5670_1)).b == 0))) {
        break forward_join_56;
    }
    (this.n)[p0] = null;
    }
    ((net.minecraft.tileentity.TileEntityChest)(this)).a__Void();
    forwardValue5670_59_0 = life6_51;
    }
    return forwardValue5670_59_0;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.n)[p0];
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue5675_20_0;
    int spill5675_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_20: {
    forward_join_16: {
    life3_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 23414788499481L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5675_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5675_20_0 = spill5675_0;
        break forward_join_20;
    }
    if (!((spill5675_0 == 1))) {
        break forward_join_16;
    }
    this.v = ((int)(p1));
    return ((1) != 0);
    }
    forwardValue5675_20_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5675_20_0) != 0);
}


private boolean a__sourceReturn_744e2be5d4(moom.DT p0) {
net.minecraft.world.World forwardValue5671_15_0;
    int forwardValue5671_27_0;
    int forwardValue5671_33_0;
    int forwardValue5671_35_0;
    net.minecraft.world.World spill5671_0;
    int spill5671_1;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.block.Block life5_23;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_27: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 33592578773031L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5671_0 = this.d;
    if (!((life4_5 != null))) {
        forwardValue5671_15_0 = spill5671_0;
        break forward_join_15;
    }
    if (!((spill5671_0 == null))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    forwardValue5671_15_0 = this.d;
    }
    life5_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue5671_15_0)).a__fE(((moom.DT)(p0))))).a__ch();
    spill5671_1 = ((life5_23 instanceof moom.cZ) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue5671_27_0 = spill5671_1;
        break forward_join_27;
    }
    if (!((spill5671_1 != 0))) {
        break forward_join_34;
    }
    forwardValue5671_27_0 = ((moom.cZ)(((moom.cZ)(life5_23)))).S;
    }
    if (!((life4_5 != null))) {
        forwardValue5671_33_0 = forwardValue5671_27_0;
        break forward_join_33;
    }
    if (!((forwardValue5671_27_0 == ((net.minecraft.tileentity.TileEntityChest)(this)).h()))) {
        break forward_join_34;
    }
    forwardValue5671_33_0 = 1;
    }
    forwardValue5671_35_0 = forwardValue5671_33_0;
    break forward_join_35;
    }
    forwardValue5671_35_0 = 0;
    }
    return ((forwardValue5671_35_0) != 0);
}


protected net.minecraft.tileentity.TileEntityChest a(moom.bs p0) {
net.minecraft.tileentity.TileEntity forwardValue5672_21_0;
    net.minecraft.tileentity.TileEntity forwardValue5672_28_0;
    java.lang.String[] spill5672_0;
    net.minecraft.tileentity.TileEntityChest spill5672_1;
    net.minecraft.tileentity.TileEntity spill5672_2;
    long life2_3;
    moom.DT life5_9;
    java.lang.String[] life4_10;
    net.minecraft.tileentity.TileEntity life6_27;
    net.minecraft.tileentity.TileEntityChest life7_41;
    forward_join_37: {
    forward_join_28: {
    forward_join_21: {
    life2_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 115344483283629L);
    spill5672_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_9 = ((moom.DT)(this.e)).a(((moom.bs)(p0)));
    life4_10 = spill5672_0;
    spill5672_1 = this;
    if (!((life4_10 != null))) {
        forwardValue5672_21_0 = spill5672_1;
        break forward_join_21;
    }
    if (!(((net.minecraft.tileentity.TileEntityChest)(spill5672_1)).a__sourceReturn_744e2be5d4(((moom.DT)(life5_9))))) {
        break forward_join_37;
    }
    forwardValue5672_21_0 = ((net.minecraft.world.World)(this.d)).a__B9(((moom.DT)(life5_9)));
    }
    life6_27 = forwardValue5672_21_0;
    spill5672_2 = life6_27;
    if (!((life4_10 != null))) {
        forwardValue5672_28_0 = spill5672_2;
        break forward_join_28;
    }
    if (!((((spill5672_2 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forward_join_37;
    }
    forwardValue5672_28_0 = life6_27;
    }
    life7_41 = ((net.minecraft.tileentity.TileEntityChest)(forwardValue5672_28_0));
    ((net.minecraft.tileentity.TileEntityChest)(life7_41)).a(((net.minecraft.tileentity.TileEntityChest)(this)), ((moom.bs)(((moom.bs)(p0)).a__bs())));
    return life7_41;
    }
    return null;
}


private void a(net.minecraft.tileentity.TileEntityChest p0, moom.bs p1) {
int forwardValue577_18_0;
    int forwardValue577_25_0;
    net.minecraft.tileentity.TileEntityChest forwardValue577_33_0;
    net.minecraft.tileentity.TileEntityChest forwardValue577_44_0;
    net.minecraft.tileentity.TileEntityChest forwardValue577_55_0;
    net.minecraft.tileentity.TileEntityChest forwardValue577_66_0;
    boolean spill577_0;
    net.minecraft.tileentity.TileEntityChest spill577_1;
    net.minecraft.tileentity.TileEntityChest spill577_2;
    net.minecraft.tileentity.TileEntityChest spill577_3;
    net.minecraft.tileentity.TileEntityChest spill577_4;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_68: {
    forward_join_66: {
    forward_join_59: {
    forward_join_55: {
    forward_join_48: {
    forward_join_44: {
    forward_join_37: {
    forward_join_33: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 85641509638810L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill577_0 = ((net.minecraft.tileentity.TileEntityChest)(p0)).f__Boolean();
    if (!((life5_5 != null))) {
        forwardValue577_18_0 = ((spill577_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill577_0)) {
        break forward_join_16;
    }
    this.o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    if (!((life5_5 == null))) {
        break forward_join_68;
    }
    }
    forwardValue577_18_0 = ((this.o) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue577_25_0 = forwardValue577_18_0;
        break forward_join_25;
    }
    if (!((forwardValue577_18_0 != 0))) {
        break forward_join_68;
    }
    forwardValue577_25_0 = (moom.Cw.a)[((moom.bs)(p1)).ordinal()];
    }
    switch (forwardValue577_25_0) {
case 1:
{
        break forward_join_26;
    }
case 2:
{
        break forward_join_37;
    }
case 3:
{
        break forward_join_48;
    }
case 4:
{
        break forward_join_59;
    }
default:
{
        break forward_join_68;
    }
}
    }
    spill577_1 = this.p;
    if (!((life5_5 != null))) {
        forwardValue577_33_0 = spill577_1;
        break forward_join_33;
    }
    if (!((spill577_1 != p0))) {
        break forward_join_68;
    }
    forwardValue577_33_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue577_33_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    if (!((life5_5 == null))) {
        break forward_join_68;
    }
    }
    spill577_2 = this.s;
    if (!((life5_5 != null))) {
        forwardValue577_44_0 = spill577_2;
        break forward_join_44;
    }
    if (!((spill577_2 != p0))) {
        break forward_join_68;
    }
    forwardValue577_44_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue577_44_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    if (!((life5_5 == null))) {
        break forward_join_68;
    }
    }
    spill577_3 = this.q;
    if (!((life5_5 != null))) {
        forwardValue577_55_0 = spill577_3;
        break forward_join_55;
    }
    if (!((spill577_3 != p0))) {
        break forward_join_68;
    }
    forwardValue577_55_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue577_55_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    if (!((life5_5 == null))) {
        break forward_join_68;
    }
    }
    spill577_4 = this.r;
    if (!((life5_5 != null))) {
        forwardValue577_66_0 = spill577_4;
        break forward_join_66;
    }
    if (!((spill577_4 != p0))) {
        break forward_join_68;
    }
    forwardValue577_66_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue577_66_0)).o = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    }
    return;
}


public void g__sourceReturn_da8c82d5d4() {
net.minecraft.tileentity.TileEntityChest forwardValue5684_30_0;
    net.minecraft.tileentity.TileEntityChest spill5684_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_34: {
    forward_join_30: {
    life1_3 = (net.minecraft.tileentity.TileEntityChest.A ^ 124377986402919L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5684_0 = this;
    if (!((life3_5 != null))) {
        forwardValue5684_30_0 = spill5684_0;
        break forward_join_30;
    }
    if (!((!((net.minecraft.tileentity.TileEntityChest)(spill5684_0)).o))) {
        break forward_join_34;
    }
    this.o = ((boolean)__sourceIntrinsic_integerToBoolean((1)));
    this.r = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(this)).a(((moom.bs)(moom.bs.WEST)))));
    this.q = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(this)).a(((moom.bs)(moom.bs.EAST)))));
    this.p = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(this)).a(((moom.bs)(moom.bs.NORTH)))));
    forwardValue5684_30_0 = this;
    }
    ((net.minecraft.tileentity.TileEntityChest)(forwardValue5684_30_0)).s = ((net.minecraft.tileentity.TileEntityChest)(((net.minecraft.tileentity.TileEntityChest)(this)).a(((moom.bs)(moom.bs.SOUTH)))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a871336d5eceb72f_originalDynamicSite3972_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a6d9ddf299b3d27_originalDynamicSite3973_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12286_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1696_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1696_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1696_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a63cd0a8780c_originalDynamicSite2044_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite2045_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1698_16(int a0, long a1) throws E;

private static native int __sourceExactCall_752e1341a52ea7(int p0, long p1);
private static native net.minecraft.item.ItemStack __sourceExactCall_b20cc06766c170(net.minecraft.nbt.NBTTagCompound p0);

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native moom.DT __sourceExactCall_bcb977d05e639b(moom.DT p0);
}
