package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EG extends net.minecraft.world.WorldSavedData {

private net.minecraft.world.World c;

private final java.util.List<moom.DT> d;

private final java.util.List<moom.Ea> e;

private final java.util.List<net.minecraft.village.Village> f;

private int g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public EG(java.lang.String p0) {
super(p0);
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = com.google.common.collect.Lists.newArrayList();
    this.f = com.google.common.collect.Lists.newArrayList();
}


public EG(net.minecraft.world.World p0) {
super(__sourceExactCall_09acb03cb83da5(p0.v));
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = com.google.common.collect.Lists.newArrayList();
    this.f = com.google.common.collect.Lists.newArrayList();
    this.c = p0;
    (this).a();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(1974251138737907529L)), ((long)(-2336515767502841076L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(261364991669591L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EG.h ^ 72979043625835L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill706_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill706_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill706_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill706_14 = new byte[8];
    (__sourceSpill706_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill706_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation706_16 = __sourceSpill706_14;
    ((javax.crypto.Cipher)(__sourceSpill706_11)).init(((int)(__sourceSpill706_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill706_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation706_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "j¦S5tfC¢óm\r\006Náëjm1Õ,á\000ÁÔT`YQ*"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill706_25 = local6_life21;
        int __sourceSpill706_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill706_25)).substring(((int)(__sourceSpill706_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill706_30 = local8_life19;
        int __sourceSpill706_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill706_33 = new byte[8];
        (__sourceSpill706_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill706_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill706_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill706_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill706_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill706_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill706_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill706_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill706_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill706_34)).doFinal(((byte[])(__sourceSpill706_33)));
        (__sourceSpill706_30)[__sourceSpill706_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "§uî®\017\033Ðyê¥V1 Yâ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill706_38 = local6_life21;
        int __sourceSpill706_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill706_38)).substring(((int)(__sourceSpill706_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill706_43 = local8_life19;
        int __sourceSpill706_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill706_46 = new byte[8];
        (__sourceSpill706_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill706_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill706_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill706_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill706_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill706_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill706_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill706_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill706_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill706_47)).doFinal(((byte[])(__sourceSpill706_46)));
        (__sourceSpill706_43)[__sourceSpill706_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private void b(moom.DT p0) {
int forestValue601_24_0;
    int forestValue601_30_0;
    moom.Ea forestValue601_68_0;
    boolean spill601_0;
    int spill601_1;
    boolean spill601_2;
    moom.Ea spill601_3;
    long life2_3;
    int life5_10;
    int life6_12;
    int life7_18;
    int life4_19;
    int life8_22;
    int life9_28;
    int life10_36;
    moom.DT life11_45;
    moom.Ea life12_58;
    forest_join_80: {
    life2_3 = (moom.EG.h ^ 130312511517485L);
    spill601_0 = net.minecraft.village.MerchantRecipe.d();
    life5_10 = __sourceIntrinsic_0dd38c3318e1_invokedynamic601_2(27678, (6646706282515923338L ^ life2_3));
    life6_12 = 4;
    life7_18 = __sourceIntrinsic_0dd38c3318e1_invokedynamic601_3(18974, (2722122709410621326L ^ life2_3));
    life4_19 = ((spill601_0) ? 1 : 0);
    life8_22 = (-life5_10);
    forest_cycle_23: while (true) {
    forest_join_77: {
    forestValue601_24_0 = life8_22;
    forest_cycle_24: while (true) {
    if (!((forestValue601_24_0 < life5_10))) {
        break forest_join_80;
    }
    life9_28 = (-life6_12);
    forest_cycle_29: while (true) {
    forest_join_74: {
    forestValue601_30_0 = life9_28;
    forest_cycle_30: while (true) {
    if (!((forestValue601_30_0 < life6_12))) {
        break forest_join_77;
    }
    spill601_1 = (-life7_18);
    if (!((life4_19 == 0))) {
        forestValue601_24_0 = spill601_1;
        continue forest_cycle_24;
    }
    life10_36 = spill601_1;
    forest_cycle_37: while (true) {
    forest_join_72: {
    forest_join_71: {
    forest_join_68: {
    forest_join_67: {
    if (!((life10_36 < life7_18))) {
        break forest_join_74;
    }
    life11_45 = ((moom.DT)(p0)).a(((int)(life8_22)), ((int)(life9_28)), ((int)(life10_36)));
    if (!((life4_19 == 0))) {
        break forest_join_72;
    }
    spill601_2 = ((moom.EG)(this)).b__Boolean(((moom.DT)(life11_45)));
    if (!((life4_19 == 0))) {
        forestValue601_30_0 = ((spill601_2) ? 1 : 0);
        continue forest_cycle_30;
    }
    if (!(spill601_2)) {
        break forest_join_71;
    }
    life12_58 = ((moom.EG)(this)).a(((moom.DT)(life11_45)));
    spill601_3 = life12_58;
    if (!((life4_19 == 0))) {
        forestValue601_68_0 = spill601_3;
        break forest_join_68;
    }
    if (!((spill601_3 == null))) {
        break forest_join_67;
    }
    this.c(((moom.DT)(life11_45)));
    if (!((life4_19 != 0))) {
        break forest_join_71;
    }
    }
    forestValue601_68_0 = life12_58;
    }
    ((moom.Ea)(forestValue601_68_0)).a(((int)(this.g)));
    }
    life10_36 += 1;
    }
    if (!((life4_19 != 0))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    break forest_cycle_30;
    }
    }
    life9_28 += 1;
    if (!((life4_19 != 0))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_cycle_24;
    }
    }
    life8_22 += 1;
    if (!((life4_19 != 0))) {
        continue forest_cycle_23;
    }
    break forest_cycle_23;
    }
    }
    return;
}


private boolean b__Boolean(moom.DT p0) {
net.minecraft.block.Block forwardValue1801_18_0;
    int forwardValue1801_24_0;
    boolean spill1801_0;
    net.minecraft.block.Block spill1801_1;
    long life2_3;
    net.minecraft.block.Block life5_10;
    int life4_11;
    forward_join_24: {
    forward_join_23: {
    forward_join_18: {
    life2_3 = (moom.EG.h ^ 21928808167294L);
    spill1801_0 = net.minecraft.village.MerchantRecipe.d();
    life5_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.c)).a__fE(((moom.DT)(p0))))).a__ch();
    life4_11 = ((spill1801_0) ? 1 : 0);
    spill1801_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue1801_18_0 = spill1801_1;
        break forward_join_18;
    }
    if (!((((spill1801_1 instanceof net.minecraft.block.BlockDoor) ? 1 : 0) != 0))) {
        break forward_join_23;
    }
    forwardValue1801_18_0 = life5_10;
    }
    if (!((((net.minecraft.block.Block)(forwardValue1801_18_0)).a__fn() == moom.fn.d))) {
        break forward_join_23;
    }
    forwardValue1801_24_0 = 1;
    break forward_join_24;
    }
    forwardValue1801_24_0 = 0;
    }
    return ((forwardValue1801_24_0) != 0);
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
boolean spill584_0;
    long life2_3;
    int life4_10;
    net.minecraft.nbt.NBTTagList life5_14;
    java.util.Iterator life6_18;
    net.minecraft.village.Village life7_25;
    net.minecraft.nbt.NBTTagCompound life8_29;
    lexical_join_44: {
    lexical_join_40: {
    life2_3 = (moom.EG.h ^ 114444361955909L);
    spill584_0 = net.minecraft.village.MerchantRecipe.e();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Tick")), ((int)(this.g)));
    life4_10 = ((spill584_0) ? 1 : 0);
    life5_14 = new net.minecraft.nbt.NBTTagList();
    life6_18 = ((java.util.List)(this.f)).iterator();
    lexical_cycle_19: while (true) {
    if (!(((java.util.Iterator)(life6_18)).hasNext())) {
        break lexical_join_40;
    }
    life7_25 = ((net.minecraft.village.Village)(((java.util.Iterator)(life6_18)).next()));
    life8_29 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.village.Village)(life7_25)).b(((net.minecraft.nbt.NBTTagCompound)(life8_29)));
    ((net.minecraft.nbt.NBTTagList)(life5_14)).a(((net.minecraft.nbt.NBTBase)(life8_29)));
    if (!((life4_10 != 0))) {
        break lexical_join_44;
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Villages")), ((net.minecraft.nbt.NBTBase)(life5_14)));
    }
    return;
}


public void b() {
moom.EG lexicalValue582_49_0;
    boolean spill582_0;
    moom.EG spill582_1;
    long life1_3;
    java.util.Iterator life4_14;
    int life3_15;
    net.minecraft.village.Village life5_22;
    lexical_join_50: {
    lexical_join_49: {
    lexical_join_37: {
    lexical_join_31: {
    life1_3 = (moom.EG.h ^ 118614673516327L);
    moom.EG __stackOp582_1_0 = this;
    ((moom.EG)(__stackOp582_1_0)).g = ((int)((((moom.EG)(__stackOp582_1_0)).g + 1)));
    spill582_0 = net.minecraft.village.MerchantRecipe.d();
    life4_14 = ((java.util.List)(this.f)).iterator();
    life3_15 = ((spill582_0) ? 1 : 0);
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life4_14)).hasNext())) {
        break lexical_join_31;
    }
    life5_22 = ((net.minecraft.village.Village)(((java.util.Iterator)(life4_14)).next()));
    ((net.minecraft.village.Village)(life5_22)).a(((int)(this.g)));
    if (!((life3_15 == 0))) {
        break lexical_join_37;
    }
    if (!((life3_15 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    this.c();
    this.d();
    this.e();
    }
    spill582_1 = this;
    if (!((life3_15 == 0))) {
        lexicalValue582_49_0 = spill582_1;
        break lexical_join_49;
    }
    if (!(((((moom.EG)(spill582_1)).g % __sourceIntrinsic_938da207dded_invokedynamic582_17(12333, (631929079335504308L ^ life1_3))) == 0))) {
        break lexical_join_50;
    }
    lexicalValue582_49_0 = this;
    }
    ((moom.EG)(lexicalValue582_49_0)).a();
    }
    return;
}


private void e() {
net.minecraft.village.Village lexicalValue586_47_0;
    boolean spill586_0;
    net.minecraft.village.Village spill586_1;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    moom.Ea life5_16;
    net.minecraft.village.Village life6_26;
    lexical_join_54: {
    lexical_join_51: {
    life1_3 = (moom.EG.h ^ 99447461064002L);
    spill586_0 = net.minecraft.village.MerchantRecipe.d();
    life4_8 = ((java.util.List)(this.e)).iterator();
    life3_9 = ((spill586_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_47: {
    lexical_join_46: {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_51;
    }
    life5_16 = ((moom.Ea)(((java.util.Iterator)(life4_8)).next()));
    life6_26 = ((moom.EG)(this)).a(((moom.DT)(((moom.Ea)(life5_16)).a__DT())), ((int)(__sourceIntrinsic_85f1dd884e89_invokedynamic586_9(15084, (8403975186733762838L ^ life1_3)))));
    if (!((life3_9 == 0))) {
        break lexical_join_54;
    }
    spill586_1 = life6_26;
    if (!((life3_9 == 0))) {
        lexicalValue586_47_0 = spill586_1;
        break lexical_join_47;
    }
    if (!((spill586_1 == null))) {
        break lexical_join_46;
    }
    life6_26 = new net.minecraft.village.Village(this.c);
    ((java.util.List)(this.f)).add(((java.lang.Object)(life6_26)));
    ((moom.EG)(this)).a();
    }
    lexicalValue586_47_0 = life6_26;
    }
    ((net.minecraft.village.Village)(lexicalValue586_47_0)).a(((moom.Ea)(life5_16)));
    if (!((life3_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    ((java.util.List)(this.e)).clear();
    }
    return;
}


private void c(moom.DT p0) {
long life2_3;
    moom.bs life4_8;
    moom.bs life5_11;
    int life6_17;
    int life7_25;
    life2_3 = (moom.EG.h ^ 97685309271413L);
    life4_8 = __sourceExactCall_84852e47c31c83(((net.minecraft.world.IBlockAccess)(this.c)), ((moom.DT)(p0)));
    life5_11 = ((moom.bs)(life4_8)).a__bs();
    life6_17 = ((moom.EG)(this)).a(((moom.DT)(p0)), ((moom.bs)(life4_8)), ((int)(5)));
    life7_25 = ((moom.EG)(this)).a(((moom.DT)(p0)), ((moom.bs)(life5_11)), ((int)((life6_17 + 1))));
    if ((life6_17 != life7_25)) {
        ((java.util.List)(this.e)).add(((java.lang.Object)(new moom.Ea(p0, ((life6_17 < life7_25) ? life4_8 : life5_11), this.g))));
    } else {
        
    }
    return;
}


private void c() {
boolean spill585_0;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    net.minecraft.village.Village life5_16;
    lexical_join_28: {
    life1_3 = (moom.EG.h ^ 112390296571520L);
    spill585_0 = net.minecraft.village.MerchantRecipe.e();
    life4_8 = ((java.util.List)(this.f)).iterator();
    life3_9 = ((spill585_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_26: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_28;
    }
    life5_16 = ((net.minecraft.village.Village)(((java.util.Iterator)(life4_8)).next()));
    if (!((life3_9 != 0))) {
        break lexical_join_24;
    }
    if (!(((net.minecraft.village.Village)(life5_16)).a__Boolean())) {
        break lexical_join_26;
    }
    ((java.util.Iterator)(life4_8)).remove();
    }
    ((moom.EG)(this)).a();
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private void d() {
moom.EG forwardValue1804_13_0;
    moom.EG spill1804_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_13: {
    life1_3 = (moom.EG.h ^ 106496104733611L);
    life3_5 = ((net.minecraft.village.MerchantRecipe.d()) ? 1 : 0);
    spill1804_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue1804_13_0 = spill1804_0;
        break forward_join_13;
    }
    if (!((!((java.util.List)(((moom.EG)(spill1804_0)).d)).isEmpty()))) {
        break forward_join_19;
    }
    forwardValue1804_13_0 = this;
    }
    ((moom.EG)(forwardValue1804_13_0)).b(((moom.DT)(((moom.DT)(((java.util.List)(this.d)).remove(((int)(0))))))));
    }
    return;
}


public void a(net.minecraft.world.World p0) {
boolean spill580_0;
    long life2_3;
    java.util.Iterator life5_11;
    int life4_12;
    net.minecraft.village.Village life6_19;
    lexical_join_25: {
    life2_3 = (moom.EG.h ^ 60442078501316L);
    spill580_0 = net.minecraft.village.MerchantRecipe.d();
    this.c = ((net.minecraft.world.World)(p0));
    life5_11 = ((java.util.List)(this.f)).iterator();
    life4_12 = ((spill580_0) ? 1 : 0);
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life5_11)).hasNext())) {
        break lexical_join_25;
    }
    life6_19 = ((net.minecraft.village.Village)(((java.util.Iterator)(life5_11)).next()));
    ((net.minecraft.village.Village)(life6_19)).a(((net.minecraft.world.World)(p0)));
    if (!((life4_12 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public static java.lang.String a(moom.EA p0) {
return __sourceIntrinsic_e11da66f04cb_originalDynamicSite1128_1(((moom.EA)(p0)).b__String());
}


public void a__Void(moom.DT p0) {
int forwardValue1797_20_0;
    int forwardValue1797_27_0;
    int spill1797_0;
    long life2_3;
    int life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_20: {
    life2_3 = (moom.EG.h ^ 43372171178591L);
    life4_5 = ((net.minecraft.village.MerchantRecipe.e()) ? 1 : 0);
    spill1797_0 = ((java.util.List)(this.d)).size();
    if (!((life4_5 != 0))) {
        forwardValue1797_20_0 = spill1797_0;
        break forward_join_20;
    }
    if (!((spill1797_0 <= __sourceIntrinsic_2bdbd8ad1edc_invokedynamic1797_5(23575, (4280975713376891124L ^ life2_3))))) {
        break forward_join_28;
    }
    forwardValue1797_20_0 = ((((moom.EG)(this)).a__Boolean(((moom.DT)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue1797_27_0 = forwardValue1797_20_0;
        break forward_join_27;
    }
    if (!((forwardValue1797_20_0 == 0))) {
        break forward_join_28;
    }
    forwardValue1797_27_0 = ((((java.util.List)(this.d)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue1797_27_0);
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4313_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_d9a4ea19f7818e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20077;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/EG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.village.Village a(moom.DT p0, int p1) {
int lexicalValue577_38_0;
    double lexicalValue577_52_0;
    net.minecraft.village.Village lexicalValue577_56_0;
    boolean spill577_0;
    net.minecraft.village.Village spill577_1;
    int spill577_2;
    double spill577_3;
    long life3_3;
    net.minecraft.village.Village life6_6;
    int life5_7;
    double life7_9;
    java.util.Iterator life9_13;
    net.minecraft.village.Village life10_20;
    double life11_27;
    float life13_45;
    lexical_join_56: {
    lexical_join_55: {
    life3_3 = (moom.EG.h ^ 113850292367564L);
    spill577_0 = net.minecraft.village.MerchantRecipe.d();
    life6_6 = null;
    life5_7 = ((spill577_0) ? 1 : 0);
    life7_9 = 0x1.fffffep127d;
    life9_13 = ((java.util.List)(this.f)).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_38: {
    if (!(((java.util.Iterator)(life9_13)).hasNext())) {
        break lexical_join_55;
    }
    life10_20 = ((net.minecraft.village.Village)(((java.util.Iterator)(life9_13)).next()));
    spill577_1 = life10_20;
    if (!((life5_7 == 0))) {
        lexicalValue577_56_0 = spill577_1;
        break lexical_join_56;
    }
    life11_27 = ((moom.DT)(((net.minecraft.village.Village)(spill577_1)).a__DT())).a(((moom.DS)(p0)));
    spill577_2 = recovery.source.CarrierOps.dcmpg(((double)(life11_27)), ((double)(life7_9)));
    if (!((life5_7 == 0))) {
        lexicalValue577_38_0 = spill577_2;
        break lexical_join_38;
    }
    if (!((spill577_2 < 0))) {
        break lexical_join_53;
    }
    lexicalValue577_38_0 = (p1 + ((net.minecraft.village.Village)(life10_20)).a());
    }
    life13_45 = ((float) lexicalValue577_38_0);
    spill577_3 = life11_27;
    if (!((life5_7 == 0))) {
        lexicalValue577_52_0 = spill577_3;
        break lexical_join_52;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill577_3)), ((double)(((double) (life13_45 * life13_45))))) <= 0))) {
        break lexical_join_53;
    }
    life6_6 = life10_20;
    lexicalValue577_52_0 = life11_27;
    }
    life7_9 = lexicalValue577_52_0;
    }
    if (!((life5_7 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue577_56_0 = life6_6;
    }
    return lexicalValue577_56_0;
}


private moom.Ea a(moom.DT p0) {
int forestValue238_32_0;
    int forestValue238_32_1;
    int forestValue238_45_0;
    int forestValue238_45_1;
    moom.Ea forestValue238_51_0;
    int forestValue238_77_0;
    moom.Ea forestValue238_98_0;
    boolean spill238_0;
    int spill238_1;
    int spill238_2;
    moom.Ea spill238_3;
    moom.Ea spill238_4;
    moom.Ea spill238_5;
    boolean spill238_6;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.Ea life6_18;
    java.util.Iterator life5_72;
    net.minecraft.village.Village life6_82;
    moom.Ea life7_86;
    net.minecraft.village.Village life6_103;
    forest_join_99: {
    forest_join_98: {
    forest_join_97: {
    forest_join_77: {
    forest_join_76: {
    forest_join_75: {
    forest_join_52: {
    forest_join_51: {
    forest_join_50: {
    life2_3 = (moom.EG.h ^ 113251782681598L);
    spill238_0 = net.minecraft.village.MerchantRecipe.d();
    life5_8 = ((java.util.List)(this.e)).iterator();
    life4_9 = ((spill238_0) ? 1 : 0);
    forest_cycle_10: while (true) {
    forest_join_47: {
    forest_join_45: {
    forest_join_32: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break forest_join_52;
    }
    life6_18 = ((moom.Ea)(((java.util.Iterator)(life5_8)).next()));
    spill238_1 = ((moom.DT)(((moom.Ea)(life6_18)).a__DT())).a();
    if (!((life4_9 == 0))) {
        forestValue238_77_0 = spill238_1;
        break forest_join_77;
    }
    spill238_2 = ((moom.DT)(p0)).a();
    if (!((life4_9 == 0))) {
        forestValue238_32_0 = spill238_1;
        forestValue238_32_1 = spill238_2;
        break forest_join_32;
    }
    if (!((spill238_1 == spill238_2))) {
        break forest_join_47;
    }
    forestValue238_32_0 = ((moom.DT)(((moom.Ea)(life6_18)).a__DT())).c();
    forestValue238_32_1 = ((moom.DT)(p0)).c();
    }
    if (!((life4_9 == 0))) {
        forestValue238_45_0 = forestValue238_32_0;
        forestValue238_45_1 = forestValue238_32_1;
        break forest_join_45;
    }
    if (!((forestValue238_32_0 == forestValue238_32_1))) {
        break forest_join_47;
    }
    spill238_3 = life6_18;
    if (!((life4_9 == 0))) {
        forestValue238_51_0 = spill238_3;
        break forest_join_51;
    }
    forestValue238_45_0 = java.lang.Math.abs(((int)((((moom.DT)(((moom.Ea)(spill238_3)).a__DT())).b() - ((moom.DT)(p0)).b()))));
    forestValue238_45_1 = 1;
    }
    if (!((forestValue238_45_0 <= forestValue238_45_1))) {
        break forest_join_47;
    }
    break forest_join_50;
    }
    if (!((life4_9 != 0))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    break forest_join_52;
    }
    forestValue238_51_0 = life6_18;
    }
    return forestValue238_51_0;
    }
    life5_72 = ((java.util.List)(this.f)).iterator();
    forest_cycle_56: while (true) {
    forest_join_72: {
    if (!(((java.util.Iterator)(life5_72)).hasNext())) {
        break forest_join_99;
    }
    life6_82 = ((net.minecraft.village.Village)(((java.util.Iterator)(life5_72)).next()));
    life7_86 = ((net.minecraft.village.Village)(life6_82)).c(((moom.DT)(p0)));
    spill238_4 = life7_86;
    if (!((life4_9 == 0))) {
        forestValue238_98_0 = spill238_4;
        break forest_join_98;
    }
    if (!((spill238_4 != null))) {
        break forest_join_72;
    }
    break forest_join_75;
    }
    if (!((life4_9 != 0))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_join_76;
    }
    break forest_join_97;
    }
    break forest_join_99;
    }
    forest_cycle_77: while (true) {
    forest_join_94: {
    forest_join_91: {
    if (!((forestValue238_77_0 != 0))) {
        break forest_join_99;
    }
    life6_103 = ((net.minecraft.village.Village)(((java.util.Iterator)(life5_8)).next()));
    life7_86 = ((net.minecraft.village.Village)(life6_103)).c(((moom.DT)(p0)));
    spill238_5 = life7_86;
    if (!((life4_9 == 0))) {
        forestValue238_98_0 = spill238_5;
        break forest_join_98;
    }
    if (!((spill238_5 != null))) {
        break forest_join_91;
    }
    break forest_join_97;
    }
    if (!((life4_9 != 0))) {
        break forest_join_94;
    }
    break forest_join_99;
    }
    spill238_6 = ((java.util.Iterator)(life5_8)).hasNext();
    forestValue238_77_0 = ((spill238_6) ? 1 : 0);
    continue forest_cycle_77;
    }
    }
    forestValue238_98_0 = life7_86;
    }
    return forestValue238_98_0;
    }
    return null;
}


public java.util.List<net.minecraft.village.Village> a__sourceReturn_3f0615080b() {
return this.f;
}


private int a(moom.DT p0, moom.bs p1, int p2) {
int lexicalValue578_29_0;
    int lexicalValue578_37_0;
    boolean spill578_0;
    boolean spill578_1;
    long life4_3;
    int life7_6;
    int life8_8;
    int life6_9;
    lexical_join_37: {
    lexical_join_36: {
    life4_3 = (moom.EG.h ^ 89853373486050L);
    spill578_0 = net.minecraft.village.MerchantRecipe.e();
    life7_6 = 0;
    life8_8 = 1;
    life6_9 = ((spill578_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    lexical_join_29: {
    if (!((life8_8 <= 5))) {
        break lexical_join_36;
    }
    spill578_1 = ((net.minecraft.world.World)(this.c)).e(((moom.DT)(((moom.DT)(p0)).a(((moom.bs)(p1)), ((int)(life8_8))))));
    if (!((life6_9 != 0))) {
        lexicalValue578_37_0 = ((spill578_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!((life6_9 != 0))) {
        lexicalValue578_29_0 = ((spill578_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill578_1)) {
        break lexical_join_33;
    }
    life7_6 += 1;
    if (!((life6_9 != 0))) {
        break lexical_join_34;
    }
    lexicalValue578_29_0 = life7_6;
    }
    if (!((lexicalValue578_29_0 >= p2))) {
        break lexical_join_33;
    }
    return life7_6;
    }
    life8_8 += 1;
    }
    if (!((life6_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue578_37_0 = life7_6;
    }
    return lexicalValue578_37_0;
}


private boolean a__Boolean(moom.DT p0) {
int lexicalValue581_26_0;
    int lexicalValue581_30_0;
    boolean spill581_0;
    boolean spill581_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    moom.DT life6_16;
    lexical_join_30: {
    lexical_join_29: {
    life2_3 = (moom.EG.h ^ 124728431675898L);
    spill581_0 = net.minecraft.village.MerchantRecipe.e();
    life5_8 = ((java.util.List)(this.d)).iterator();
    life4_9 = ((spill581_0) ? 1 : 0);
    lexical_cycle_10: while (true) {
    lexical_join_27: {
    lexical_join_26: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_29;
    }
    life6_16 = ((moom.DT)(((java.util.Iterator)(life5_8)).next()));
    spill581_1 = ((moom.DT)(life6_16)).equals(((java.lang.Object)(p0)));
    if (!((life4_9 != 0))) {
        lexicalValue581_30_0 = ((spill581_1) ? 1 : 0);
        break lexical_join_30;
    }
    if (!((life4_9 != 0))) {
        lexicalValue581_26_0 = ((spill581_1) ? 1 : 0);
        break lexical_join_26;
    }
    if (!(spill581_1)) {
        break lexical_join_27;
    }
    lexicalValue581_26_0 = 1;
    }
    return ((lexicalValue581_26_0) != 0);
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    lexicalValue581_30_0 = 0;
    }
    return ((lexicalValue581_30_0) != 0);
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
boolean spill579_0;
    long life2_3;
    int life4_10;
    net.minecraft.nbt.NBTTagList life5_19;
    int life6_21;
    net.minecraft.nbt.NBTTagCompound life7_29;
    net.minecraft.village.Village life8_33;
    lexical_join_45: {
    life2_3 = (moom.EG.h ^ 109824653420306L);
    spill579_0 = net.minecraft.village.MerchantRecipe.e();
    this.g = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Tick")))));
    life4_10 = ((spill579_0) ? 1 : 0);
    life5_19 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Villages")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic579_5(23090, (7072522478920377247L ^ life2_3)))));
    life6_21 = 0;
    lexical_cycle_22: while (true) {
    if (!((life6_21 < ((net.minecraft.nbt.NBTTagList)(life5_19)).a__Int()))) {
        break lexical_join_45;
    }
    life7_29 = ((net.minecraft.nbt.NBTTagList)(life5_19)).a__yw(((int)(life6_21)));
    life8_33 = new net.minecraft.village.Village();
    ((net.minecraft.village.Village)(life8_33)).a(((net.minecraft.nbt.NBTTagCompound)(life7_29)));
    ((java.util.List)(this.f)).add(((java.lang.Object)(life8_33)));
    life6_21 += 1;
    if (!((life4_10 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4313_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e11da66f04cb_originalDynamicSite1128_1(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic579_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bdbd8ad1edc_invokedynamic1797_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_938da207dded_invokedynamic582_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0dd38c3318e1_invokedynamic601_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0dd38c3318e1_invokedynamic601_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85f1dd884e89_invokedynamic586_9(int a0, long a1) throws E;

private static native java.lang.String __sourceExactCall_09acb03cb83da5(moom.EA p0);
private static native moom.bs __sourceExactCall_84852e47c31c83(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native int __sourceExactCall_d9a4ea19f7818e(int p0, long p1);
}
