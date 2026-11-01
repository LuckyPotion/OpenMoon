package moom;


public class By {

private static final org.apache.logging.log4j.Logger a;

public static final java.io.File b;

public static final java.io.File c;

public static final java.io.File d;

public static final java.io.File e;

private static final long f;

private static final long g;

public By() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3643060046261533940L)), ((long)(-8721512709157441520L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(3972139294732L)))));
    long local0_life6 = (moom.By.f ^ 74586866887063L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill497_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill497_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill497_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill497_13 = new byte[8];
    (__sourceSpill497_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill497_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation497_15 = __sourceSpill497_13;
    ((javax.crypto.Cipher)(__sourceSpill497_10)).init(((int)(__sourceSpill497_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill497_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation497_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -7447976396354825240L;
    byte[] __sourceSpill497_19 = new byte[8];
    (__sourceSpill497_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill497_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill497_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill497_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill497_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill497_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill497_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill497_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill497_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill497_20)).doFinal(((byte[])(__sourceSpill497_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.io.File)(new java.io.File("banned-ips.txt")));
    c = ((java.io.File)(new java.io.File("banned-players.txt")));
    d = ((java.io.File)(new java.io.File("ops.txt")));
    e = ((java.io.File)(new java.io.File("white-list.txt")));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static java.lang.String a(java.lang.String p0) {
com.mojang.authlib.GameProfile forwardValue1558_30_0;
    java.util.UUID forwardValue1558_36_0;
    int forwardValue1558_45_0;
    java.lang.Object forwardValue1558_72_0;
    java.util.UUID forwardValue1558_82_0;
    java.lang.String forwardValue1558_85_0;
    java.lang.String forwardValue1558_95_0;
    java.lang.String spill1558_0;
    java.lang.String spill1558_1;
    com.mojang.authlib.GameProfile spill1558_2;
    java.util.UUID spill1558_3;
    boolean spill1558_4;
    java.util.ArrayList spill1558_5;
    java.util.UUID spill1558_6;
    long life1_3;
    int life3_5;
    moom.Bl life4_28;
    com.mojang.authlib.GameProfile life5_33;
    java.util.ArrayList life6_71;
    moom.Bz life7_77;
    forward_join_95: {
    forward_join_94: {
    forward_join_86: {
    forward_join_85: {
    forward_join_84: {
    forward_join_82: {
    forward_join_72: {
    forward_join_45: {
    forward_join_38: {
    forward_join_36: {
    forward_join_30: {
    life1_3 = (moom.By.f ^ 5497706352118L);
    life3_5 = ((net.minecraft.server.management.ServerConfigurationManager.b__Boolean()) ? 1 : 0);
    spill1558_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1558_95_0 = spill1558_0;
        break forward_join_95;
    }
    if (!((!moom.DK.a__Boolean(((java.lang.String)(spill1558_0)))))) {
        break forward_join_94;
    }
    spill1558_1 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1558_95_0 = spill1558_1;
        break forward_join_95;
    }
    if (!((((java.lang.String)(spill1558_1)).length() <= ((int) moom.By.g)))) {
        break forward_join_94;
    }
    life4_28 = moom.Bl.a__Bl();
    life5_33 = ((moom.Bt)(((moom.Bl)(life4_28)).a__Bt())).a(((java.lang.String)(p0)));
    spill1558_2 = life5_33;
    if (!((life3_5 == 0))) {
        forwardValue1558_30_0 = spill1558_2;
        break forward_join_30;
    }
    if (!((spill1558_2 != null))) {
        break forward_join_38;
    }
    forwardValue1558_30_0 = life5_33;
    }
    spill1558_3 = ((com.mojang.authlib.GameProfile)(forwardValue1558_30_0)).getId();
    if (!((life3_5 == 0))) {
        forwardValue1558_36_0 = spill1558_3;
        break forward_join_36;
    }
    if (!((spill1558_3 != null))) {
        break forward_join_38;
    }
    forwardValue1558_36_0 = ((com.mojang.authlib.GameProfile)(life5_33)).getId();
    }
    return ((java.util.UUID)(forwardValue1558_36_0)).toString();
    }
    spill1558_4 = ((moom.Bl)(life4_28)).l__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue1558_45_0 = ((spill1558_4) ? 1 : 0);
        break forward_join_45;
    }
    if (!((!spill1558_4))) {
        break forward_join_86;
    }
    forwardValue1558_45_0 = ((((moom.Bl)(life4_28)).p()) ? 1 : 0);
    }
    if (!((forwardValue1558_45_0 != 0))) {
        break forward_join_86;
    }
    life6_71 = com.google.common.collect.Lists.newArrayList();
    life7_77 = new moom.Bz(life4_28, life6_71);
    moom.By.a(((moom.Bl)(life4_28)), ((java.util.Collection)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(new java.lang.String[] {p0}))))), ((com.mojang.authlib.ProfileLookupCallback)(life7_77)));
    spill1558_5 = life6_71;
    if (!((life3_5 == 0))) {
        forwardValue1558_72_0 = spill1558_5;
        break forward_join_72;
    }
    if (!((((java.util.List)(spill1558_5)).size() > 0))) {
        break forward_join_84;
    }
    forwardValue1558_72_0 = ((java.util.List)(life6_71)).get(((int)(0)));
    }
    spill1558_6 = ((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(forwardValue1558_72_0)))).getId();
    if (!((life3_5 == 0))) {
        forwardValue1558_82_0 = spill1558_6;
        break forward_join_82;
    }
    if (!((spill1558_6 != null))) {
        break forward_join_84;
    }
    forwardValue1558_82_0 = ((com.mojang.authlib.GameProfile)(((com.mojang.authlib.GameProfile)(((java.util.List)(life6_71)).get(((int)(0))))))).getId();
    }
    forwardValue1558_85_0 = ((java.util.UUID)(forwardValue1558_82_0)).toString();
    break forward_join_85;
    }
    forwardValue1558_85_0 = "";
    }
    return forwardValue1558_85_0;
    }
    return ((java.util.UUID)(net.minecraft.entity.player.EntityPlayer.a(((com.mojang.authlib.GameProfile)(new com.mojang.authlib.GameProfile(null, p0)))))).toString();
    }
    forwardValue1558_95_0 = p0;
    }
    return forwardValue1558_95_0;
}


private static void a(moom.Bl p0, java.util.Collection<java.lang.String> p1, com.mojang.authlib.ProfileLookupCallback p2) {
moom.Bl lexicalValue520_20_0;
    boolean spill520_0;
    moom.Bl spill520_1;
    long life3_3;
    java.lang.String[] life6_12;
    int life5_13;
    java.lang.String[] life7_34;
    int life8_37;
    int life9_39;
    java.lang.String life10_46;
    java.util.UUID life11_53;
    com.mojang.authlib.GameProfile life12_59;
    lexical_join_60: {
    lexical_join_27: {
    lexical_join_20: {
    life3_3 = (moom.By.f ^ 73084024032143L);
    spill520_0 = net.minecraft.server.management.ServerConfigurationManager.b__Boolean();
    life6_12 = ((java.lang.String[])(com.google.common.collect.Iterators.toArray(((java.util.Iterator)(com.google.common.collect.Iterators.filter(((java.util.Iterator)(((java.util.Collection)(p1)).iterator())), ((com.google.common.base.Predicate)(__sourceIntrinsic_f52b51792545_invokedynamic520_3()))))), ((java.lang.Class)(java.lang.String.class)))));
    life5_13 = ((spill520_0) ? 1 : 0);
    spill520_1 = p0;
    if (!((life5_13 == 0))) {
        lexicalValue520_20_0 = spill520_1;
        break lexical_join_20;
    }
    if (!(((moom.Bl)(spill520_1)).p())) {
        break lexical_join_27;
    }
    lexicalValue520_20_0 = p0;
    }
    ((com.mojang.authlib.GameProfileRepository)(((moom.Bl)(lexicalValue520_20_0)).a__GameProfileRepository())).findProfilesByNames(((java.lang.String[])(life6_12)), ((com.mojang.authlib.Agent)(com.mojang.authlib.Agent.MINECRAFT)), ((com.mojang.authlib.ProfileLookupCallback)(p2)));
    if (!((life5_13 != 0))) {
        break lexical_join_60;
    }
    }
    life7_34 = life6_12;
    life8_37 = (life7_34).length;
    life9_39 = 0;
    lexical_cycle_34: while (true) {
    if (!((life9_39 < life8_37))) {
        break lexical_join_60;
    }
    life10_46 = (life7_34)[life9_39];
    life11_53 = net.minecraft.entity.player.EntityPlayer.a(((com.mojang.authlib.GameProfile)(new com.mojang.authlib.GameProfile(null, life10_46))));
    life12_59 = new com.mojang.authlib.GameProfile(life11_53, life10_46);
    ((com.mojang.authlib.ProfileLookupCallback)(p2)).onProfileLookupSucceeded(((com.mojang.authlib.GameProfile)(life12_59)));
    life9_39 += 1;
    if (!((life5_13 != 0))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return;
}


private static boolean lambda$lookupNames$0(java.lang.String p0) {
int forwardValue1560_12_0;
    int forwardValue1560_14_0;
    boolean spill1560_0;
    long life1_3;
    int life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.By.f ^ 10714284562941L);
    life3_5 = ((net.minecraft.server.management.ServerConfigurationManager.c__Boolean()) ? 1 : 0);
    spill1560_0 = moom.DK.a__Boolean(((java.lang.String)(p0)));
    if (!((life3_5 != 0))) {
        forwardValue1560_12_0 = ((spill1560_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!((!spill1560_0))) {
        break forward_join_13;
    }
    forwardValue1560_12_0 = 1;
    }
    forwardValue1560_14_0 = forwardValue1560_12_0;
    break forward_join_14;
    }
    forwardValue1560_14_0 = 0;
    }
    return ((forwardValue1560_14_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_f52b51792545_invokedynamic520_3() throws E;
}
