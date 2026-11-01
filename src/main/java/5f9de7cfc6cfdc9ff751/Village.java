package net.minecraft.village;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Village {

private net.minecraft.world.World a;

private final java.util.List<moom.Ea> b;

private moom.DT c;

private moom.DT d;

private int e;

private int f;

private int g;

private int h;

private int i;

private final java.util.TreeMap<java.lang.String, java.lang.Integer> j;

private final java.util.List<moom.D_> k;

private int l;

private static final long m;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map p;

public Village() {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = moom.DT.f;
    this.d = moom.DT.f;
    this.j = new java.util.TreeMap();
    this.k = com.google.common.collect.Lists.newArrayList();
}


public Village(net.minecraft.world.World p0) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = moom.DT.f;
    this.d = moom.DT.f;
    this.j = new java.util.TreeMap();
    this.k = com.google.common.collect.Lists.newArrayList();
    this.a = p0;
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-8125141408368835371L)), ((long)(-1540493732160050387L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(247926217609137L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.village.Village.m ^ 13480948962142L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1937_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1937_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1937_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1937_14 = new byte[8];
    (__sourceSpill1937_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1937_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1937_16 = __sourceSpill1937_14;
    ((javax.crypto.Cipher)(__sourceSpill1937_11)).init(((int)(__sourceSpill1937_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1937_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1937_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[22];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ïÈø¡¥:\035¨\032¶úV\013oÄÂ±-ñeª0Nkpc\177°Ø¶YÞõ©sX«?Xi\024)Bg%:(¦6é¯y\t@¤\026sÌJ«\031K\033HP¾ÞT2É7>í¢ÜGè3Û\025F\031B\tX«\017½Ãa MöX·¡Zo*Îy¶ÆgÛæ\034pÜiHæ\016Ösju:Àª\r%\177£zY]·µöÆ­!\020=êê\007ªY"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1937_25 = local6_life21;
        int __sourceSpill1937_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1937_25)).substring(((int)(__sourceSpill1937_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1937_30 = local8_life19;
        int __sourceSpill1937_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1937_33 = new byte[8];
        (__sourceSpill1937_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1937_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1937_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1937_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1937_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1937_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1937_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1937_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1937_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1937_34)).doFinal(((byte[])(__sourceSpill1937_33)));
        (__sourceSpill1937_30)[__sourceSpill1937_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "kô2`\nVÄ\000^\013Kh·Æ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1937_38 = local6_life21;
        int __sourceSpill1937_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1937_38)).substring(((int)(__sourceSpill1937_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1937_43 = local8_life19;
        int __sourceSpill1937_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1937_46 = new byte[8];
        (__sourceSpill1937_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1937_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1937_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1937_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1937_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1937_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1937_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1937_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1937_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1937_47)).doFinal(((byte[])(__sourceSpill1937_46)));
        (__sourceSpill1937_43)[__sourceSpill1937_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[22]));
}


public boolean b__Boolean() {
int forwardValue5768_25_0;
    int forwardValue5768_27_0;
    int spill5768_0;
    int spill5768_1;
    long life1_3;
    int life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (net.minecraft.village.Village.m ^ 134281317038112L);
    life3_5 = ((net.minecraft.village.MerchantRecipe.d()) ? 1 : 0);
    spill5768_0 = this.i;
    if (!((life3_5 == 0))) {
        forwardValue5768_25_0 = spill5768_0;
        break forward_join_25;
    }
    if (!((spill5768_0 != 0))) {
        break forward_join_24;
    }
    spill5768_1 = (this.g - this.i);
    if (!((life3_5 == 0))) {
        forwardValue5768_25_0 = spill5768_1;
        break forward_join_25;
    }
    if (!((spill5768_1 >= __sourceIntrinsic_74e88f4b4822_invokedynamic5768_6(2838, (6556135043540706110L ^ life1_3))))) {
        break forward_join_26;
    }
    }
    forwardValue5768_25_0 = 1;
    }
    forwardValue5768_27_0 = forwardValue5768_25_0;
    break forward_join_27;
    }
    forwardValue5768_27_0 = 0;
    }
    return ((forwardValue5768_27_0) != 0);
}


public void b(int p0) {
boolean spill1719_0;
    long life2_3;
    java.util.Iterator life5_9;
    int life4_10;
    java.lang.String life6_17;
    lexical_join_25: {
    life2_3 = (net.minecraft.village.Village.m ^ 135278202668592L);
    spill1719_0 = net.minecraft.village.MerchantRecipe.e();
    life5_9 = ((java.util.Set)(((java.util.TreeMap)(this.j)).keySet())).iterator();
    life4_10 = ((spill1719_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life5_9)).hasNext())) {
        break lexical_join_25;
    }
    life6_17 = ((java.lang.String)(((java.util.Iterator)(life5_9)).next()));
    this.a(((java.lang.String)(life6_17)), ((int)(p0)));
    if (!((life4_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public int b() {
return ((java.util.List)(this.b)).size();
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
boolean spill1721_0;
    long life2_3;
    int life4_25;
    net.minecraft.nbt.NBTTagList life5_75;
    java.util.Iterator life6_79;
    moom.Ea life7_86;
    net.minecraft.nbt.NBTTagCompound life8_90;
    net.minecraft.nbt.NBTTagList life6_144;
    java.util.Iterator life7_149;
    java.lang.String life8_156;
    net.minecraft.nbt.NBTTagCompound life9_160;
    moom.Bt life10_163;
    com.mojang.authlib.GameProfile life11_167;
    lexical_join_195: {
    lexical_join_191: {
    lexical_join_138: {
    lexical_join_134: {
    life2_3 = (net.minecraft.village.Village.m ^ 10482601631858L);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("PopSize")), ((int)(this.h)));
    spill1721_0 = net.minecraft.village.MerchantRecipe.d();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Radius")), ((int)(this.e)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Golems")), ((int)(this.l)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Stable")), ((int)(this.f)));
    life4_25 = ((spill1721_0) ? 1 : 0);
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Tick")), ((int)(this.g)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("MTick")), ((int)(this.i)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CX")), ((int)(((moom.DT)(this.d)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CY")), ((int)(((moom.DT)(this.d)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("CZ")), ((int)(((moom.DT)(this.d)).c())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ACX")), ((int)(((moom.DT)(this.c)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ACY")), ((int)(((moom.DT)(this.c)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ACZ")), ((int)(((moom.DT)(this.c)).c())));
    life5_75 = new net.minecraft.nbt.NBTTagList();
    life6_79 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_80: while (true) {
    if (!(((java.util.Iterator)(life6_79)).hasNext())) {
        break lexical_join_134;
    }
    life7_86 = ((moom.Ea)(((java.util.Iterator)(life6_79)).next()));
    life8_90 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("X")), ((int)(((moom.DT)(((moom.Ea)(life7_86)).a__DT())).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("Y")), ((int)(((moom.DT)(((moom.Ea)(life7_86)).a__DT())).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("Z")), ((int)(((moom.DT)(((moom.Ea)(life7_86)).a__DT())).c())));
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("IDX")), ((int)(((moom.Ea)(life7_86)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("IDZ")), ((int)(((moom.Ea)(life7_86)).c())));
    ((net.minecraft.nbt.NBTTagCompound)(life8_90)).a__Void(((java.lang.String)("TS")), ((int)(((moom.Ea)(life7_86)).d())));
    ((net.minecraft.nbt.NBTTagList)(life5_75)).a(((net.minecraft.nbt.NBTBase)(life8_90)));
    if (!((life4_25 == 0))) {
        break lexical_join_138;
    }
    if (!((life4_25 != 0))) { continue lexical_cycle_80; }
    break lexical_cycle_80;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Doors")), ((net.minecraft.nbt.NBTBase)(life5_75)));
    }
    life6_144 = new net.minecraft.nbt.NBTTagList();
    life7_149 = ((java.util.Set)(((java.util.TreeMap)(this.j)).keySet())).iterator();
    lexical_cycle_147: while (true) {
    lexical_join_189: {
    lexical_join_186: {
    if (!(((java.util.Iterator)(life7_149)).hasNext())) {
        break lexical_join_191;
    }
    life8_156 = ((java.lang.String)(((java.util.Iterator)(life7_149)).next()));
    life9_160 = new net.minecraft.nbt.NBTTagCompound();
    life10_163 = ((moom.Bl)(moom.Bl.a__Bl())).a__Bt();
    life11_167 = ((moom.Bt)(life10_163)).a(((java.lang.String)(life8_156)));
    if (!((life4_25 == 0))) {
        break lexical_join_195;
    }
    if (!((life4_25 == 0))) {
        break lexical_join_186;
    }
    if (!((life11_167 != null))) {
        break lexical_join_189;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life9_160)).a(((java.lang.String)("UUID")), ((java.lang.String)(((java.util.UUID)(((com.mojang.authlib.GameProfile)(life11_167)).getId())).toString())));
    ((net.minecraft.nbt.NBTTagCompound)(life9_160)).a__Void(((java.lang.String)("S")), ((int)(((java.lang.Integer)(((java.lang.Integer)(((java.util.TreeMap)(this.j)).get(((java.lang.Object)(life8_156))))))).intValue())));
    }
    ((net.minecraft.nbt.NBTTagList)(life6_144)).a(((net.minecraft.nbt.NBTBase)(life9_160)));
    }
    if (!((life4_25 != 0))) { continue lexical_cycle_147; }
    break lexical_cycle_147;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Players")), ((net.minecraft.nbt.NBTBase)(life6_144)));
    }
    return;
}


public moom.Ea b(moom.DT p0) {
int lexicalValue1720_52_0;
    int lexicalValue1720_61_0;
    moom.Ea lexicalValue1720_65_0;
    boolean spill1720_0;
    moom.Ea spill1720_1;
    int spill1720_2;
    int spill1720_3;
    long life2_3;
    moom.Ea life5_6;
    int life4_7;
    int life6_13;
    java.util.Iterator life7_17;
    moom.Ea life8_24;
    int life9_30;
    int life9_50;
    lexical_join_65: {
    lexical_join_64: {
    life2_3 = (net.minecraft.village.Village.m ^ 63361803324033L);
    spill1720_0 = net.minecraft.village.MerchantRecipe.d();
    life5_6 = null;
    life4_7 = ((spill1720_0) ? 1 : 0);
    life6_13 = __sourceIntrinsic_4309144dfeae_invokedynamic1720_3(31283, (8775021178949902501L ^ life2_3));
    life7_17 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_50: {
    if (!(((java.util.Iterator)(life7_17)).hasNext())) {
        break lexical_join_64;
    }
    life8_24 = ((moom.Ea)(((java.util.Iterator)(life7_17)).next()));
    spill1720_1 = life8_24;
    if (!((life4_7 == 0))) {
        lexicalValue1720_65_0 = spill1720_1;
        break lexical_join_65;
    }
    life9_30 = ((moom.Ea)(spill1720_1)).a(((moom.DT)(p0)));
    spill1720_2 = life9_30;
    if (!((life4_7 == 0))) {
        lexicalValue1720_52_0 = spill1720_2;
        break lexical_join_52;
    }
    if (!((spill1720_2 > __sourceIntrinsic_4309144dfeae_invokedynamic1720_10(23235, (7485277256020918355L ^ life2_3))))) {
        break lexical_join_50;
    }
    life9_50 = (life9_30 * __sourceIntrinsic_4309144dfeae_invokedynamic1720_11(16824, (4846530311876975404L ^ life2_3)));
    if (!((life4_7 != 0))) {
        break lexical_join_53;
    }
    }
    lexicalValue1720_52_0 = ((moom.Ea)(life8_24)).a();
    }
    life9_50 = lexicalValue1720_52_0;
    }
    spill1720_3 = life9_50;
    if (!((life4_7 == 0))) {
        lexicalValue1720_61_0 = spill1720_3;
        break lexical_join_61;
    }
    if (!((spill1720_3 < life6_13))) {
        break lexical_join_62;
    }
    life5_6 = life8_24;
    lexicalValue1720_61_0 = life9_50;
    }
    life6_13 = lexicalValue1720_61_0;
    }
    if (!((life4_7 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1720_65_0 = life5_6;
    }
    return lexicalValue1720_65_0;
}


private boolean b__Boolean(moom.DT p0) {
net.minecraft.block.Block forwardValue5769_18_0;
    int forwardValue5769_24_0;
    boolean spill5769_0;
    net.minecraft.block.Block spill5769_1;
    long life2_3;
    net.minecraft.block.Block life5_10;
    int life4_11;
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    life2_3 = (net.minecraft.village.Village.m ^ 91639006643375L);
    spill5769_0 = net.minecraft.village.MerchantRecipe.e();
    life5_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(p0))))).a__ch();
    life4_11 = ((spill5769_0) ? 1 : 0);
    spill5769_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue5769_18_0 = spill5769_1;
        break forward_join_18;
    }
    if (!((((spill5769_1 instanceof net.minecraft.block.BlockDoor) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue5769_18_0 = life5_10;
    }
    if (!((((net.minecraft.block.Block)(forwardValue5769_18_0)).a__fn() == moom.fn.d))) {
        break forward_join_23;
    }
    forwardValue5769_24_0 = 1;
    break forward_join_24;
    }
    forwardValue5769_24_0 = 0;
    }
    return ((forwardValue5769_24_0) != 0);
}


private void b__Void() {
net.minecraft.village.Village forwardValue5770_64_0;
    boolean spill5770_0;
    net.minecraft.village.Village spill5770_1;
    long life1_3;
    java.util.List life4_52;
    int life3_53;
    forward_join_66: {
    forward_join_64: {
    life1_3 = (net.minecraft.village.Village.m ^ 89453407179753L);
    spill5770_0 = net.minecraft.village.MerchantRecipe.e();
    life4_52 = ((net.minecraft.world.World)(this.a)).a(((java.lang.Class)(net.minecraft.entity.passive.EntityVillager.class)), ((moom.CA)(new moom.CA(((double) (((moom.DT)(this.d)).a() - this.e)), ((double) (((moom.DT)(this.d)).b() - 4)), ((double) (((moom.DT)(this.d)).c() - this.e)), ((double) (((moom.DT)(this.d)).a() + this.e)), ((double) (((moom.DT)(this.d)).b() + 4)), ((double) (((moom.DT)(this.d)).c() + this.e))))));
    life3_53 = ((spill5770_0) ? 1 : 0);
    this.h = ((int)(((java.util.List)(life4_52)).size()));
    spill5770_1 = this;
    if (!((life3_53 != 0))) {
        forwardValue5770_64_0 = spill5770_1;
        break forward_join_64;
    }
    if (!((((net.minecraft.village.Village)(spill5770_1)).h == 0))) {
        break forward_join_66;
    }
    forwardValue5770_64_0 = this;
    }
    ((java.util.TreeMap)(((net.minecraft.village.Village)(forwardValue5770_64_0)).j)).clear();
    }
    return;
}


private void e() {
int lexicalValue1724_48_0;
    boolean spill1724_0;
    int spill1724_1;
    long life1_3;
    int life4_8;
    int life3_9;
    int life5_57;
    java.util.Iterator life6_61;
    moom.Ea life7_68;
    lexical_join_85: {
    lexical_join_71: {
    lexical_join_48: {
    lexical_join_27: {
    life1_3 = (net.minecraft.village.Village.m ^ 21663939657395L);
    spill1724_0 = net.minecraft.village.MerchantRecipe.e();
    life4_8 = ((java.util.List)(this.b)).size();
    life3_9 = ((spill1724_0) ? 1 : 0);
    spill1724_1 = life4_8;
    if (!((life3_9 != 0))) {
        lexicalValue1724_48_0 = spill1724_1;
        break lexical_join_48;
    }
    if (!((spill1724_1 == 0))) {
        break lexical_join_27;
    }
    this.d = ((moom.DT)(new moom.DT(0, 0, 0)));
    this.e = ((int)(0));
    if (!((life3_9 == 0))) {
        break lexical_join_85;
    }
    }
    this.d = ((moom.DT)(new moom.DT((((moom.DT)(this.c)).a() / life4_8), (((moom.DT)(this.c)).b() / life4_8), (((moom.DT)(this.c)).c() / life4_8))));
    lexicalValue1724_48_0 = 0;
    }
    life5_57 = lexicalValue1724_48_0;
    life6_61 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_53: while (true) {
    if (!(((java.util.Iterator)(life6_61)).hasNext())) {
        break lexical_join_71;
    }
    life7_68 = ((moom.Ea)(((java.util.Iterator)(life6_61)).next()));
    life5_57 = java.lang.Math.max(((int)(((moom.Ea)(life7_68)).a(((moom.DT)(this.d))))), ((int)(life5_57)));
    if (!((life3_9 != 0))) {
        break lexical_join_85;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_53; }
    break lexical_cycle_53;
    }
    }
    this.e = ((int)(java.lang.Math.max(((int)(__sourceIntrinsic_85f1dd884e89_invokedynamic1724_22(16044, (7389897545601716230L ^ life1_3)))), ((int)((((int) java.lang.Math.sqrt(((double)(((double) life5_57))))) + 1))))));
    }
    return;
}


public moom.Ea c(moom.DT p0) {
net.minecraft.village.Village lexicalValue1722_23_0;
    int lexicalValue1722_46_0;
    int lexicalValue1722_46_1;
    int lexicalValue1722_59_0;
    int lexicalValue1722_59_1;
    moom.Ea lexicalValue1722_61_0;
    net.minecraft.village.Village spill1722_0;
    int spill1722_1;
    int spill1722_2;
    moom.Ea spill1722_3;
    long life2_3;
    int life4_5;
    java.util.Iterator life5_30;
    moom.Ea life6_37;
    lexical_join_64: {
    lexical_join_23: {
    lexical_join_22: {
    life2_3 = (net.minecraft.village.Village.m ^ 127270740081945L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.e()) ? 1 : 0);
    spill1722_0 = this;
    if (!((life4_5 != 0))) {
        lexicalValue1722_23_0 = spill1722_0;
        break lexical_join_23;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DT)(((net.minecraft.village.Village)(spill1722_0)).d)).a(((moom.DS)(p0))))), ((double)(((double) (this.e * this.e))))) > 0))) {
        break lexical_join_22;
    }
    return null;
    }
    lexicalValue1722_23_0 = this;
    }
    life5_30 = ((java.util.List)(((net.minecraft.village.Village)(lexicalValue1722_23_0)).b)).iterator();
    lexical_cycle_26: while (true) {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life5_30)).hasNext())) {
        break lexical_join_64;
    }
    life6_37 = ((moom.Ea)(((java.util.Iterator)(life5_30)).next()));
    spill1722_1 = ((moom.DT)(((moom.Ea)(life6_37)).a__DT())).a();
    spill1722_2 = ((moom.DT)(p0)).a();
    if (!((life4_5 != 0))) {
        lexicalValue1722_46_0 = spill1722_1;
        lexicalValue1722_46_1 = spill1722_2;
        break lexical_join_46;
    }
    if (!((spill1722_1 == spill1722_2))) {
        break lexical_join_62;
    }
    lexicalValue1722_46_0 = ((moom.DT)(((moom.Ea)(life6_37)).a__DT())).c();
    lexicalValue1722_46_1 = ((moom.DT)(p0)).c();
    }
    if (!((life4_5 != 0))) {
        lexicalValue1722_59_0 = lexicalValue1722_46_0;
        lexicalValue1722_59_1 = lexicalValue1722_46_1;
        break lexical_join_59;
    }
    if (!((lexicalValue1722_46_0 == lexicalValue1722_46_1))) {
        break lexical_join_62;
    }
    spill1722_3 = life6_37;
    if (!((life4_5 != 0))) {
        lexicalValue1722_61_0 = spill1722_3;
        break lexical_join_61;
    }
    lexicalValue1722_59_0 = java.lang.Math.abs(((int)((((moom.DT)(((moom.Ea)(spill1722_3)).a__DT())).b() - ((moom.DT)(p0)).b()))));
    lexicalValue1722_59_1 = 1;
    }
    if (!((lexicalValue1722_59_0 <= lexicalValue1722_59_1))) {
        break lexical_join_62;
    }
    lexicalValue1722_61_0 = life6_37;
    }
    return lexicalValue1722_61_0;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    return null;
}


private void c__Void() {
((java.util.List)(this.k)).removeIf(((java.util.function.Predicate)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite2059_1(this))));
    return;
}


public int c() {
return (this.g - this.f);
}


public void f() {
this.i = ((int)(this.g));
    return;
}


private void d__Void() {
int lexicalValue1723_21_0;
    int lexicalValue1723_23_0;
    int lexicalValue1723_47_0;
    int lexicalValue1723_72_0;
    int lexicalValue1723_81_0;
    boolean spill1723_0;
    int spill1723_1;
    int spill1723_2;
    int spill1723_3;
    long life1_3;
    int life4_6;
    int life3_7;
    int life5_26;
    java.util.Iterator life6_30;
    moom.Ea life7_37;
    lexical_join_84: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_23: {
    lexical_join_22: {
    lexical_join_21: {
    life1_3 = (net.minecraft.village.Village.m ^ 94831111129747L);
    spill1723_0 = net.minecraft.village.MerchantRecipe.d();
    life4_6 = 0;
    life3_7 = ((spill1723_0) ? 1 : 0);
    spill1723_1 = ((java.util.Random)(((net.minecraft.world.World)(this.a)).u)).nextInt(((int)(__sourceIntrinsic_a91ecd6db48f_invokedynamic1723_5(28718, (986954455074400937L ^ life1_3)))));
    if (!((life3_7 == 0))) {
        lexicalValue1723_21_0 = spill1723_1;
        break lexical_join_21;
    }
    if (!((spill1723_1 == 0))) {
        break lexical_join_22;
    }
    lexicalValue1723_21_0 = 1;
    }
    lexicalValue1723_23_0 = lexicalValue1723_21_0;
    break lexical_join_23;
    }
    lexicalValue1723_23_0 = 0;
    }
    life5_26 = lexicalValue1723_23_0;
    life6_30 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_28: while (true) {
    lexical_join_78: {
    lexical_join_72: {
    lexical_join_64: {
    lexical_join_47: {
    lexical_join_43: {
    if (!(((java.util.Iterator)(life6_30)).hasNext())) {
        break lexical_join_80;
    }
    life7_37 = ((moom.Ea)(((java.util.Iterator)(life6_30)).next()));
    spill1723_2 = life5_26;
    if (!((life3_7 == 0))) {
        lexicalValue1723_81_0 = spill1723_2;
        break lexical_join_81;
    }
    if (!((life3_7 == 0))) {
        lexicalValue1723_47_0 = spill1723_2;
        break lexical_join_47;
    }
    if (!((spill1723_2 != 0))) {
        break lexical_join_43;
    }
    ((moom.Ea)(life7_37)).a__Void();
    }
    lexicalValue1723_47_0 = ((((net.minecraft.village.Village)(this)).b__Boolean(((moom.DT)(((moom.Ea)(life7_37)).a__DT())))) ? 1 : 0);
    }
    if (!((life3_7 == 0))) {
        lexicalValue1723_72_0 = lexicalValue1723_47_0;
        break lexical_join_72;
    }
    if (!((lexicalValue1723_47_0 != 0))) {
        break lexical_join_64;
    }
    spill1723_3 = java.lang.Math.abs(((int)((this.g - ((moom.Ea)(life7_37)).d()))));
    if (!((life3_7 == 0))) {
        lexicalValue1723_72_0 = spill1723_3;
        break lexical_join_72;
    }
    if (!((spill1723_3 > __sourceIntrinsic_a91ecd6db48f_invokedynamic1723_19(20828, (3262374606691748825L ^ life1_3))))) {
        break lexical_join_78;
    }
    }
    this.c = ((moom.DT)(((moom.DT)(this.c)).b(((moom.DS)(((moom.Ea)(life7_37)).a__DT())))));
    lexicalValue1723_72_0 = 1;
    }
    life4_6 = lexicalValue1723_72_0;
    ((moom.Ea)(life7_37)).a(((boolean)(true)));
    ((java.util.Iterator)(life6_30)).remove();
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue1723_81_0 = life4_6;
    }
    if (!((lexicalValue1723_81_0 != 0))) {
        break lexical_join_84;
    }
    this.e();
    }
    return;
}


public int d() {
return this.h;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27639;
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
            throw new RuntimeException("moom/D9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.village.Village.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12400_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/D9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1716_119_0;
    java.lang.Object lexicalValue1716_166_0;
    java.lang.Object lexicalValue1716_179_0;
    int lexicalValue1716_190_0;
    boolean spill1716_0;
    net.minecraft.nbt.NBTTagCompound spill1716_1;
    net.minecraft.nbt.NBTTagCompound spill1716_2;
    com.mojang.authlib.GameProfile spill1716_3;
    long life2_3;
    int life4_15;
    net.minecraft.nbt.NBTTagList life5_72;
    int life6_74;
    net.minecraft.nbt.NBTTagCompound life7_84;
    moom.Ea life8_109;
    net.minecraft.nbt.NBTTagList life6_126;
    int life7_128;
    net.minecraft.nbt.NBTTagCompound life8_136;
    moom.Bt life9_148;
    com.mojang.authlib.GameProfile life10_155;
    lexical_join_191: {
    lexical_join_190: {
    lexical_join_189: {
    lexical_join_183: {
    lexical_join_119: {
    lexical_join_118: {
    life2_3 = (net.minecraft.village.Village.m ^ 101986216148821L);
    this.h = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("PopSize")))));
    spill1716_0 = net.minecraft.village.MerchantRecipe.e();
    this.e = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Radius")))));
    life4_15 = ((spill1716_0) ? 1 : 0);
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Golems")))));
    this.f = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Stable")))));
    this.g = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Tick")))));
    this.i = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("MTick")))));
    this.d = ((moom.DT)(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CX"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CY"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("CZ"))))));
    this.c = ((moom.DT)(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ACX"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ACY"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("ACZ"))))));
    life5_72 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Doors")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1716_23(20515, (4205287013495865196L ^ life2_3)))));
    life6_74 = 0;
    lexical_cycle_75: while (true) {
    if (!((life6_74 < ((net.minecraft.nbt.NBTTagList)(life5_72)).a__Int()))) {
        break lexical_join_118;
    }
    spill1716_1 = ((net.minecraft.nbt.NBTTagList)(life5_72)).a__yw(((int)(life6_74)));
    if (!((life4_15 != 0))) {
        lexicalValue1716_119_0 = spill1716_1;
        break lexical_join_119;
    }
    life7_84 = spill1716_1;
    life8_109 = new moom.Ea(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("X"))), ((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("Y"))), ((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("Z")))), ((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("IDX"))), ((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("IDZ"))), ((net.minecraft.nbt.NBTTagCompound)(life7_84)).a__Int(((java.lang.String)("TS"))));
    ((java.util.List)(this.b)).add(((java.lang.Object)(life8_109)));
    life6_74 += 1;
    if (!((life4_15 == 0))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    lexicalValue1716_119_0 = p0;
    }
    life6_126 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1716_119_0)).a(((java.lang.String)("Players")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic1716_35(31580, (8370287964043170821L ^ life2_3)))));
    life7_128 = 0;
    lexical_cycle_129: while (true) {
    lexical_join_180: {
    lexical_join_179: {
    lexical_join_169: {
    lexical_join_167: {
    lexical_join_166: {
    if (!((life7_128 < ((net.minecraft.nbt.NBTTagList)(life6_126)).a__Int()))) {
        break lexical_join_183;
    }
    life8_136 = ((net.minecraft.nbt.NBTTagList)(life6_126)).a__yw(((int)(life7_128)));
    spill1716_2 = life8_136;
    if (!((life4_15 != 0))) {
        lexicalValue1716_179_0 = spill1716_2;
        break lexical_join_179;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1716_2)).a__Boolean(((java.lang.String)("UUID"))))) {
        break lexical_join_169;
    }
    life9_148 = ((moom.Bl)(moom.Bl.a__Bl())).a__Bt();
    life10_155 = ((moom.Bt)(life9_148)).a(((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life8_136)).a__String(((java.lang.String)("UUID")))))))));
    spill1716_3 = life10_155;
    if (!((life4_15 != 0))) {
        lexicalValue1716_166_0 = spill1716_3;
        break lexical_join_166;
    }
    if (!((spill1716_3 != null))) {
        break lexical_join_167;
    }
    lexicalValue1716_166_0 = ((java.util.TreeMap)(this.j)).put(((java.lang.Object)(((com.mojang.authlib.GameProfile)(life10_155)).getName())), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.nbt.NBTTagCompound)(life8_136)).a__Int(((java.lang.String)("S")))))))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1716_166_0);
    }
    if (!((life4_15 == 0))) {
        break lexical_join_180;
    }
    }
    lexicalValue1716_179_0 = ((java.util.TreeMap)(this.j)).put(((java.lang.Object)(((net.minecraft.nbt.NBTTagCompound)(life8_136)).a__String(((java.lang.String)("Name"))))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.nbt.NBTTagCompound)(life8_136)).a__Int(((java.lang.String)("S")))))))));
    }
    recovery.source.CarrierOps.discard(lexicalValue1716_179_0);
    }
    life7_128 += 1;
    if (!((life4_15 == 0))) { continue lexical_cycle_129; }
    break lexical_cycle_129;
    }
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_191;
    }
    if (!((life4_15 != 0))) {
        break lexical_join_189;
    }
    lexicalValue1716_190_0 = 0;
    break lexical_join_190;
    }
    lexicalValue1716_190_0 = 1;
    }
    net.minecraft.village.MerchantRecipe.b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1716_190_0))));
    }
    return;
}


public boolean a__Boolean(java.lang.String p0) {
int forwardValue5761_18_0;
    int forwardValue5761_20_0;
    int spill5761_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.village.Village.m ^ 75746383363932L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.e()) ? 1 : 0);
    spill5761_0 = this.a(((java.lang.String)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue5761_18_0 = spill5761_0;
        break forward_join_18;
    }
    if (!((spill5761_0 <= __sourceIntrinsic_051b43f8cbc1_invokedynamic5761_4(32738, (7574568908773970103L ^ life2_3))))) {
        break forward_join_19;
    }
    forwardValue5761_18_0 = 1;
    }
    forwardValue5761_20_0 = forwardValue5761_18_0;
    break forward_join_20;
    }
    forwardValue5761_20_0 = 0;
    }
    return ((forwardValue5761_20_0) != 0);
}


public int a(java.lang.String p0, int p1) {
long local3 = (net.minecraft.village.Village.m ^ 62442793097308L);
    int local5 = this.a(((java.lang.String)(p0)));
    int local6 = moom.Dr.a(((int)((local5 + p1))), ((int)(__sourceIntrinsic_5e130d9b8037_originalDynamicSite2060_2(3957, (2220408663343859509L ^ local3)))), ((int)(__sourceIntrinsic_5e130d9b8037_originalDynamicSite2060_3(31580, (8370318711238325004L ^ local3)))));
    ((java.util.TreeMap)(this.j)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local6))))));
    return local6;
}


public int a(java.lang.String p0) {
java.lang.Integer forwardValue5755_17_0;
    int forwardValue5755_20_0;
    boolean spill5755_0;
    java.lang.Integer spill5755_1;
    long life2_3;
    java.lang.Integer life5_10;
    int life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (net.minecraft.village.Village.m ^ 33118876396708L);
    spill5755_0 = net.minecraft.village.MerchantRecipe.e();
    life5_10 = ((java.lang.Integer)(((java.util.TreeMap)(this.j)).get(((java.lang.Object)(p0)))));
    life4_11 = ((spill5755_0) ? 1 : 0);
    spill5755_1 = life5_10;
    if (!((life4_11 != 0))) {
        forwardValue5755_17_0 = spill5755_1;
        break forward_join_17;
    }
    if (!((spill5755_1 != null))) {
        break forward_join_19;
    }
    forwardValue5755_17_0 = life5_10;
    }
    forwardValue5755_20_0 = ((java.lang.Integer)(forwardValue5755_17_0)).intValue();
    break forward_join_20;
    }
    forwardValue5755_20_0 = 0;
    }
    return forwardValue5755_20_0;
}


private void a__Void() {
java.util.List local1 = ((net.minecraft.world.World)(this.a)).a(((java.lang.Class)(net.minecraft.entity.monster.EntityIronGolem.class)), ((moom.CA)(new moom.CA(((double) (((moom.DT)(this.d)).a() - this.e)), ((double) (((moom.DT)(this.d)).b() - 4)), ((double) (((moom.DT)(this.d)).c() - this.e)), ((double) (((moom.DT)(this.d)).a() + this.e)), ((double) (((moom.DT)(this.d)).b() + 4)), ((double) (((moom.DT)(this.d)).c() + this.e))))));
    this.l = ((int)(((java.util.List)(local1)).size()));
    return;
}


public moom.DT a__DT() {
return this.d;
}


public int a() {
return this.e;
}


public boolean a__Boolean(moom.DT p0) {
int forwardValue5762_21_0;
    int forwardValue5762_23_0;
    int spill5762_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (net.minecraft.village.Village.m ^ 121504772665804L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.e()) ? 1 : 0);
    spill5762_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DT)(this.d)).a(((moom.DS)(p0))))), ((double)(((double) (this.e * this.e)))));
    if (!((life4_5 != 0))) {
        forwardValue5762_21_0 = spill5762_0;
        break forward_join_21;
    }
    if (!((spill5762_0 < 0))) {
        break forward_join_22;
    }
    forwardValue5762_21_0 = 1;
    }
    forwardValue5762_23_0 = forwardValue5762_21_0;
    break forward_join_23;
    }
    forwardValue5762_23_0 = 0;
    }
    return ((forwardValue5762_23_0) != 0);
}


public void a(net.minecraft.world.World p0) {
this.a = ((net.minecraft.world.World)(p0));
    return;
}


public void a(int p0) {
int forwardValue5754_32_0;
    int forwardValue5754_45_0;
    int forwardValue5754_62_0;
    int forwardValue5754_62_1;
    int forwardValue5754_74_0;
    net.minecraft.village.Village forwardValue5754_76_0;
    boolean spill5754_0;
    int spill5754_1;
    int spill5754_2;
    int spill5754_3;
    int spill5754_4;
    net.minecraft.village.Village spill5754_5;
    long life2_3;
    int life4_10;
    int life5_57;
    moom.DR life6_109;
    net.minecraft.entity.monster.EntityIronGolem life7_117;
    forward_join_110: {
    forward_join_76: {
    forward_join_74: {
    forward_join_62: {
    forward_join_45: {
    forward_join_37: {
    forward_join_32: {
    forward_join_25: {
    life2_3 = (net.minecraft.village.Village.m ^ 1367229322680L);
    this.g = ((int)(p0));
    spill5754_0 = net.minecraft.village.MerchantRecipe.d();
    ((net.minecraft.village.Village)(this)).d__Void();
    life4_10 = ((spill5754_0) ? 1 : 0);
    ((net.minecraft.village.Village)(this)).c__Void();
    spill5754_1 = (p0 % __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_6(14747, (5598439188585266232L ^ life2_3)));
    if (!((life4_10 == 0))) {
        forwardValue5754_32_0 = spill5754_1;
        break forward_join_32;
    }
    if (!((spill5754_1 == 0))) {
        break forward_join_25;
    }
    ((net.minecraft.village.Village)(this)).b__Void();
    }
    forwardValue5754_32_0 = (p0 % __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_8(19171, (1570773667798404934L ^ life2_3)));
    }
    if (!((life4_10 == 0))) {
        forwardValue5754_45_0 = forwardValue5754_32_0;
        break forward_join_45;
    }
    if (!((forwardValue5754_32_0 == 0))) {
        break forward_join_37;
    }
    ((net.minecraft.village.Village)(this)).a__Void();
    }
    forwardValue5754_45_0 = (this.h / __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_11(31580, (8370328524390530792L ^ life2_3)));
    }
    life5_57 = forwardValue5754_45_0;
    spill5754_2 = this.l;
    spill5754_3 = life5_57;
    if (!((life4_10 == 0))) {
        forwardValue5754_62_0 = spill5754_2;
        forwardValue5754_62_1 = spill5754_3;
        break forward_join_62;
    }
    if (!((spill5754_2 < spill5754_3))) {
        break forward_join_110;
    }
    spill5754_4 = ((java.util.List)(this.b)).size();
    if (!((life4_10 == 0))) {
        forwardValue5754_74_0 = spill5754_4;
        break forward_join_74;
    }
    forwardValue5754_62_0 = spill5754_4;
    forwardValue5754_62_1 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_15(14420, (4953458695537606118L ^ life2_3));
    }
    if (!((forwardValue5754_62_0 > forwardValue5754_62_1))) {
        break forward_join_110;
    }
    spill5754_5 = this;
    if (!((life4_10 == 0))) {
        forwardValue5754_76_0 = spill5754_5;
        break forward_join_76;
    }
    forwardValue5754_74_0 = ((java.util.Random)(((net.minecraft.world.World)(((net.minecraft.village.Village)(spill5754_5)).a)).u)).nextInt(((int)(__sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_18(30237, (97643621991904181L ^ life2_3)))));
    }
    if (!((forwardValue5754_74_0 == 0))) {
        break forward_join_110;
    }
    forwardValue5754_76_0 = this;
    }
    life6_109 = ((net.minecraft.village.Village)(forwardValue5754_76_0)).a(((moom.DT)(this.d)), ((int)(2)), ((int)(4)), ((int)(2)));
    if (!((life6_109 != null))) {
        break forward_join_110;
    }
    life7_117 = new net.minecraft.entity.monster.EntityIronGolem(this.a);
    ((net.minecraft.entity.monster.EntityIronGolem)(life7_117)).a__Void(((double)(((moom.DR)(life6_109)).a)), ((double)(((moom.DR)(life6_109)).b)), ((double)(((moom.DR)(life6_109)).c)));
    ((net.minecraft.world.World)(this.a)).b__Boolean(((net.minecraft.entity.Entity)(life7_117)));
    net.minecraft.village.Village __stackOp5754_29_0 = this;
    ((net.minecraft.village.Village)(__stackOp5754_29_0)).l = ((int)((((net.minecraft.village.Village)(__stackOp5754_29_0)).l + 1)));
    }
    return;
}


private moom.DR a(moom.DT p0, int p1, int p2, int p3) {
boolean spill1713_0;
    long life5_3;
    int life8_6;
    int life7_7;
    moom.DT life9_58;
    lexical_join_91: {
    life5_3 = (net.minecraft.village.Village.m ^ 38602586307962L);
    spill1713_0 = net.minecraft.village.MerchantRecipe.d();
    life8_6 = 0;
    life7_7 = ((spill1713_0) ? 1 : 0);
    lexical_cycle_8: while (true) {
    lexical_join_89: {
    lexical_join_88: {
    if (!((life8_6 < __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_3(31580, (8370295412209980970L ^ life5_3))))) {
        break lexical_join_91;
    }
    life9_58 = ((moom.DT)(p0)).a(((int)((((java.util.Random)(((net.minecraft.world.World)(this.a)).u)).nextInt(((int)(__sourceIntrinsic_a4cc9655dca8_invokedynamic1713_6(18929, (1580953465230730388L ^ life5_3))))) - __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_8(22170, (7465454231761861630L ^ life5_3))))), ((int)((((java.util.Random)(((net.minecraft.world.World)(this.a)).u)).nextInt(((int)(__sourceIntrinsic_a4cc9655dca8_invokedynamic1713_11(29849, (4923419192994830832L ^ life5_3))))) - 3))), ((int)((((java.util.Random)(((net.minecraft.world.World)(this.a)).u)).nextInt(((int)(__sourceIntrinsic_a4cc9655dca8_invokedynamic1713_15(32031, (5567857299648942199L ^ life5_3))))) - __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_17(8015, (448645874571473453L ^ life5_3))))));
    if (!((life7_7 == 0))) {
        break lexical_join_89;
    }
    if (!(((net.minecraft.village.Village)(this)).a__Boolean(((moom.DT)(life9_58))))) {
        break lexical_join_88;
    }
    if (!(this.a(((moom.DT)(new moom.DT(p1, p2, p3))), ((moom.DT)(life9_58))))) {
        break lexical_join_88;
    }
    return new moom.DR(((double) ((moom.DT)(life9_58)).a()), ((double) ((moom.DT)(life9_58)).b()), ((double) ((moom.DT)(life9_58)).c()));
    }
    life8_6 += 1;
    }
    if (!((life7_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return null;
}


private boolean a(moom.DT p0, moom.DT p1) {
int forestValue1143_23_0;
    int forestValue1143_35_0;
    int forestValue1143_46_0;
    int forestValue1143_90_0;
    int forestValue1143_92_0;
    boolean spill1143_0;
    int spill1143_1;
    int spill1143_2;
    boolean spill1143_3;
    long life3_3;
    int life5_5;
    int life6_24;
    int life7_32;
    int life8_34;
    int life9_45;
    int life10_56;
    forest_join_92: {
    forest_join_91: {
    forest_join_90: {
    forest_join_89: {
    forest_join_23: {
    forest_join_16: {
    life3_3 = (net.minecraft.village.Village.m ^ 59018651785666L);
    life5_5 = ((net.minecraft.village.MerchantRecipe.d()) ? 1 : 0);
    spill1143_0 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(this.a)), ((moom.DT)(((moom.DT)(p1)).b__DT())));
    if (!((life5_5 == 0))) {
        forestValue1143_23_0 = ((spill1143_0) ? 1 : 0);
        break forest_join_23;
    }
    if (!((!spill1143_0))) {
        break forest_join_16;
    }
    return ((0) != 0);
    }
    forestValue1143_23_0 = (((moom.DT)(p1)).a() - (((moom.DT)(p0)).a() / 2));
    }
    life6_24 = forestValue1143_23_0;
    life7_32 = (((moom.DT)(p1)).c() - (((moom.DT)(p0)).c() / 2));
    life8_34 = life6_24;
    forest_cycle_34: while (true) {
    forest_join_85: {
    forestValue1143_35_0 = life8_34;
    forest_cycle_35: while (true) {
    if (!((forestValue1143_35_0 < (life6_24 + ((moom.DT)(p0)).a())))) {
        break forest_join_91;
    }
    spill1143_1 = ((moom.DT)(p1)).b();
    if (!((life5_5 == 0))) {
        forestValue1143_92_0 = spill1143_1;
        break forest_join_92;
    }
    life9_45 = spill1143_1;
    forest_cycle_45: while (true) {
    forest_join_82: {
    forestValue1143_46_0 = life9_45;
    forest_cycle_46: while (true) {
    if (!((forestValue1143_46_0 < (((moom.DT)(p1)).b() + ((moom.DT)(p0)).b())))) {
        break forest_join_85;
    }
    spill1143_2 = life7_32;
    if (!((life5_5 == 0))) {
        forestValue1143_35_0 = spill1143_2;
        continue forest_cycle_35;
    }
    life10_56 = spill1143_2;
    forest_cycle_56: while (true) {
    forest_join_79: {
    if (!((life10_56 < (life7_32 + ((moom.DT)(p0)).c())))) {
        break forest_join_82;
    }
    spill1143_3 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.a)).a__fE(((moom.DT)(new moom.DT(life8_34, life9_45, life10_56)))))).a__ch())).e__Boolean();
    if (!((life5_5 == 0))) {
        forestValue1143_46_0 = ((spill1143_3) ? 1 : 0);
        continue forest_cycle_46;
    }
    if (!((life5_5 == 0))) {
        forestValue1143_90_0 = ((spill1143_3) ? 1 : 0);
        break forest_join_90;
    }
    if (!(spill1143_3)) {
        break forest_join_79;
    }
    break forest_join_89;
    }
    life10_56 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_cycle_46;
    }
    }
    life9_45 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    break forest_cycle_35;
    }
    }
    life8_34 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_34;
    }
    break forest_cycle_34;
    }
    break forest_join_91;
    }
    forestValue1143_90_0 = 0;
    }
    return ((forestValue1143_90_0) != 0);
    }
    forestValue1143_92_0 = 1;
    }
    return ((forestValue1143_92_0) != 0);
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.b)).isEmpty())) != 0);
}


public void a__Void(net.minecraft.entity.EntityLivingBase p0) {
moom.D_ lexicalValue1717_26_0;
    boolean spill1717_0;
    moom.D_ spill1717_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.D_ life6_16;
    lexical_join_42: {
    lexical_join_32: {
    life2_3 = (net.minecraft.village.Village.m ^ 20278535977412L);
    spill1717_0 = net.minecraft.village.MerchantRecipe.d();
    life5_8 = ((java.util.List)(this.k)).iterator();
    life4_9 = ((spill1717_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_30: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_32;
    }
    life6_16 = ((moom.D_)(((java.util.Iterator)(life5_8)).next()));
    if (!((life4_9 == 0))) {
        break lexical_join_42;
    }
    spill1717_1 = life6_16;
    if (!((life4_9 == 0))) {
        lexicalValue1717_26_0 = spill1717_1;
        break lexical_join_26;
    }
    if (!((((moom.D_)(spill1717_1)).a == p0))) {
        break lexical_join_30;
    }
    lexicalValue1717_26_0 = life6_16;
    }
    ((moom.D_)(lexicalValue1717_26_0)).b = ((int)(this.g));
    return;
    }
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    ((java.util.List)(this.k)).add(((java.lang.Object)(new moom.D_(p0, this.g))));
    }
    return;
}


public net.minecraft.entity.EntityLivingBase a(net.minecraft.entity.EntityLivingBase p0) {
double lexicalValue1715_37_0;
    moom.D_ lexicalValue1715_45_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1715_48_0;
    boolean spill1715_0;
    double spill1715_1;
    moom.D_ spill1715_2;
    long life2_3;
    double life5_6;
    moom.D_ life7_8;
    java.util.Iterator life8_12;
    int life4_13;
    moom.D_ life9_20;
    double life10_25;
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_45: {
    lexical_join_40: {
    life2_3 = (net.minecraft.village.Village.m ^ 65026860869501L);
    spill1715_0 = net.minecraft.village.MerchantRecipe.d();
    life5_6 = 0x1.fffffffffffffp1023d;
    life7_8 = null;
    life8_12 = ((java.util.List)(this.k)).iterator();
    life4_13 = ((spill1715_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!(((java.util.Iterator)(life8_12)).hasNext())) {
        break lexical_join_40;
    }
    life9_20 = ((moom.D_)(((java.util.Iterator)(life8_12)).next()));
    life10_25 = ((net.minecraft.entity.EntityLivingBase)(((moom.D_)(life9_20)).a)).a(((net.minecraft.entity.Entity)(p0)));
    if (!((life4_13 == 0))) {
        break lexical_join_47;
    }
    spill1715_1 = life10_25;
    if (!((life4_13 == 0))) {
        lexicalValue1715_37_0 = spill1715_1;
        break lexical_join_37;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1715_1)), ((double)(life5_6))) <= 0))) {
        break lexical_join_38;
    }
    life7_8 = life9_20;
    lexicalValue1715_37_0 = life10_25;
    }
    life5_6 = lexicalValue1715_37_0;
    }
    if (!((life4_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    spill1715_2 = life7_8;
    if (!((life4_13 == 0))) {
        lexicalValue1715_45_0 = spill1715_2;
        break lexical_join_45;
    }
    if (!((spill1715_2 != null))) {
        break lexical_join_47;
    }
    lexicalValue1715_45_0 = life7_8;
    }
    lexicalValue1715_48_0 = ((moom.D_)(lexicalValue1715_45_0)).a;
    break lexical_join_48;
    }
    lexicalValue1715_48_0 = null;
    }
    return lexicalValue1715_48_0;
}


public net.minecraft.entity.player.EntityPlayer a__tn(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.village.Village lexicalValue1718_29_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1718_38_0;
    double lexicalValue1718_50_0;
    boolean spill1718_0;
    net.minecraft.village.Village spill1718_1;
    net.minecraft.entity.player.EntityPlayer spill1718_2;
    double spill1718_3;
    long life2_3;
    double life5_6;
    net.minecraft.entity.player.EntityPlayer life7_8;
    java.util.Iterator life8_13;
    int life4_14;
    java.lang.String life9_21;
    net.minecraft.entity.player.EntityPlayer life10_38;
    double life11_49;
    lexical_join_53: {
    life2_3 = (net.minecraft.village.Village.m ^ 4354635292710L);
    spill1718_0 = net.minecraft.village.MerchantRecipe.d();
    life5_6 = 0x1.fffffffffffffp1023d;
    life7_8 = null;
    life8_13 = ((java.util.Set)(((java.util.TreeMap)(this.j)).keySet())).iterator();
    life4_14 = ((spill1718_0) ? 1 : 0);
    lexical_cycle_15: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_38: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life8_13)).hasNext())) {
        break lexical_join_53;
    }
    life9_21 = ((java.lang.String)(((java.util.Iterator)(life8_13)).next()));
    spill1718_1 = this;
    if (!((life4_14 == 0))) {
        lexicalValue1718_29_0 = spill1718_1;
        break lexical_join_29;
    }
    if (!(((net.minecraft.village.Village)(spill1718_1)).a__Boolean(((java.lang.String)(life9_21))))) {
        break lexical_join_51;
    }
    lexicalValue1718_29_0 = this;
    }
    life10_38 = ((net.minecraft.world.World)(((net.minecraft.village.Village)(lexicalValue1718_29_0)).a)).a__tn(((java.lang.String)(life9_21)));
    spill1718_2 = life10_38;
    if (!((life4_14 == 0))) {
        lexicalValue1718_38_0 = spill1718_2;
        break lexical_join_38;
    }
    if (!((spill1718_2 != null))) {
        break lexical_join_51;
    }
    lexicalValue1718_38_0 = life10_38;
    }
    life11_49 = ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1718_38_0)).a(((net.minecraft.entity.Entity)(p0)));
    spill1718_3 = life11_49;
    if (!((life4_14 == 0))) {
        lexicalValue1718_50_0 = spill1718_3;
        break lexical_join_50;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1718_3)), ((double)(life5_6))) <= 0))) {
        break lexical_join_51;
    }
    life7_8 = life10_38;
    lexicalValue1718_50_0 = life11_49;
    }
    life5_6 = lexicalValue1718_50_0;
    }
    if (!((life4_14 != 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life7_8;
}


public java.util.List<moom.Ea> a__List() {
return this.b;
}


public moom.Ea a(moom.DT p0) {
int lexicalValue1712_39_0;
    moom.Ea lexicalValue1712_43_0;
    boolean spill1712_0;
    moom.Ea spill1712_1;
    int spill1712_2;
    long life2_3;
    moom.Ea life5_6;
    int life6_12;
    java.util.Iterator life7_16;
    int life4_17;
    moom.Ea life8_24;
    int life9_30;
    lexical_join_43: {
    lexical_join_42: {
    life2_3 = (net.minecraft.village.Village.m ^ 1149459361210L);
    spill1712_0 = net.minecraft.village.MerchantRecipe.d();
    life5_6 = null;
    life6_12 = __sourceIntrinsic_3a6fe40141a0_invokedynamic1712_2(16807, (406637652681882640L ^ life2_3));
    life7_16 = ((java.util.List)(this.b)).iterator();
    life4_17 = ((spill1712_0) ? 1 : 0);
    lexical_cycle_18: while (true) {
    lexical_join_40: {
    lexical_join_39: {
    if (!(((java.util.Iterator)(life7_16)).hasNext())) {
        break lexical_join_42;
    }
    life8_24 = ((moom.Ea)(((java.util.Iterator)(life7_16)).next()));
    spill1712_1 = life8_24;
    if (!((life4_17 == 0))) {
        lexicalValue1712_43_0 = spill1712_1;
        break lexical_join_43;
    }
    life9_30 = ((moom.Ea)(spill1712_1)).a(((moom.DT)(p0)));
    spill1712_2 = life9_30;
    if (!((life4_17 == 0))) {
        lexicalValue1712_39_0 = spill1712_2;
        break lexical_join_39;
    }
    if (!((spill1712_2 < life6_12))) {
        break lexical_join_40;
    }
    life5_6 = life8_24;
    lexicalValue1712_39_0 = life9_30;
    }
    life6_12 = lexicalValue1712_39_0;
    }
    if (!((life4_17 != 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1712_43_0 = life5_6;
    }
    return lexicalValue1712_43_0;
}


public void a(moom.Ea p0) {
((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    this.c = ((moom.DT)(((moom.DT)(this.c)).a__DT(((moom.DS)(((moom.Ea)(p0)).a__DT())))));
    this.e();
    this.f = ((int)(((moom.Ea)(p0)).d()));
    return;
}


private boolean lambda$removeDeadAndOldAgressors$0(moom.D_ p0) {
int forwardValue5774_27_0;
    int forwardValue5774_29_0;
    boolean spill5774_0;
    int spill5774_1;
    long life2_3;
    int life4_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (net.minecraft.village.Village.m ^ 96454800967516L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.d()) ? 1 : 0);
    spill5774_0 = ((net.minecraft.entity.EntityLivingBase)(((moom.D_)(p0)).a)).p__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue5774_27_0 = ((spill5774_0) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5774_0)) {
        break forward_join_26;
    }
    spill5774_1 = java.lang.Math.abs(((int)((this.g - ((moom.D_)(p0)).b))));
    if (!((life4_5 == 0))) {
        forwardValue5774_27_0 = spill5774_1;
        break forward_join_27;
    }
    if (!((spill5774_1 > __sourceIntrinsic_c68c5fee393e_invokedynamic5774_9(18457, (3568804284052152142L ^ life2_3))))) {
        break forward_join_28;
    }
    }
    forwardValue5774_27_0 = 1;
    }
    forwardValue5774_29_0 = forwardValue5774_27_0;
    break forward_join_29;
    }
    forwardValue5774_29_0 = 0;
    }
    return ((forwardValue5774_29_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic5754_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e130d9b8037_originalDynamicSite2060_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5e130d9b8037_originalDynamicSite2060_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12400_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a6fe40141a0_invokedynamic1712_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a4cc9655dca8_invokedynamic1713_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1716_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic1716_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_051b43f8cbc1_invokedynamic5761_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4309144dfeae_invokedynamic1720_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4309144dfeae_invokedynamic1720_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4309144dfeae_invokedynamic1720_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic5768_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_7ac46ee229a8_originalDynamicSite2059_1(net.minecraft.village.Village a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic1723_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_invokedynamic1723_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85f1dd884e89_invokedynamic1724_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c68c5fee393e_invokedynamic5774_9(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
