package net.minecraft.scoreboard;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
















import moom.Bj;





import net.minecraft.nbt.NBTTagCompound;
import java.util.Map;
public class ScoreboardSaveData extends net.minecraft.world.WorldSavedData {

private static final org.apache.logging.log4j.Logger c;

private net.minecraft.scoreboard.Scoreboard d;

private net.minecraft.nbt.NBTTagCompound e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public ScoreboardSaveData() {
this("scoreboard");
}


public ScoreboardSaveData(java.lang.String p0) {
super(p0);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-6757126566840010980L)), ((long)(2271838641644482192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(217569705842118L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 90924354686707L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1916_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1916_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1916_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1916_14 = new byte[8];
    (__sourceSpill1916_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1916_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1916_16 = __sourceSpill1916_14;
    ((javax.crypto.Cipher)(__sourceSpill1916_11)).init(((int)(__sourceSpill1916_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1916_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1916_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ê*uY\002 é\b¥umþ®\025ÔrjÄr+§ziwÃÄM±\003¶Ã\026c°mqI\007Ë!\001\016\020\021k¡ª\021ì\\Ç _gLý6Þû'pb{hï}Ëuî7X$Vðåñc&¨\026²¦ð(¹HÊeÿ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1916_25 = local6_life21;
        int __sourceSpill1916_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1916_25)).substring(((int)(__sourceSpill1916_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1916_30 = local8_life19;
        int __sourceSpill1916_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1916_33 = new byte[8];
        (__sourceSpill1916_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1916_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1916_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1916_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1916_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1916_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1916_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1916_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1916_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1916_34)).doFinal(((byte[])(__sourceSpill1916_33)));
        (__sourceSpill1916_30)[__sourceSpill1916_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "õ\017\016½bOÊIÜ}\rôÙëÖ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1916_38 = local6_life21;
        int __sourceSpill1916_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1916_38)).substring(((int)(__sourceSpill1916_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1916_43 = local8_life19;
        int __sourceSpill1916_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1916_46 = new byte[8];
        (__sourceSpill1916_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1916_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1916_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1916_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1916_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1916_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1916_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1916_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1916_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1916_47)).doFinal(((byte[])(__sourceSpill1916_46)));
        (__sourceSpill1916_43)[__sourceSpill1916_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[15]));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


protected void b(net.minecraft.nbt.NBTTagList p0) {
java.lang.String lexicalValue1654_49_0;
    java.lang.String[] spill1654_0;
    java.lang.String spill1654_1;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    net.minecraft.nbt.NBTTagCompound life6_15;
    net.minecraft.scoreboard.IScoreObjectiveCriteria life7_22;
    java.lang.String life8_33;
    net.minecraft.scoreboard.ScoreObjective life9_64;
    lexical_join_70: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 68919433744414L);
    spill1654_0 = moom.Bj.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill1654_0;
    lexical_cycle_8: while (true) {
    lexical_join_68: {
    lexical_join_67: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life5_6 < ((net.minecraft.nbt.NBTTagList)(p0)).a__Int()))) {
        break lexical_join_70;
    }
    life6_15 = ((net.minecraft.nbt.NBTTagList)(p0)).a__yw(((int)(life5_6)));
    life7_22 = ((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((java.util.Map)(net.minecraft.scoreboard.IScoreObjectiveCriteria.a)).get(((java.lang.Object)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("CriteriaName"))))))));
    if (!((life4_7 != null))) {
        break lexical_join_68;
    }
    if (!((life7_22 != null))) {
        break lexical_join_67;
    }
    life8_33 = ((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Name")));
    spill1654_1 = life8_33;
    if (!((life4_7 != null))) {
        lexicalValue1654_49_0 = spill1654_1;
        break lexical_join_49;
    }
    if (!((((java.lang.String)(spill1654_1)).length() > __sourceIntrinsic_fe2f420b044e_invokedynamic1654_10(24465, (8922936793679013466L ^ life2_3))))) {
        break lexical_join_50;
    }
    lexicalValue1654_49_0 = ((java.lang.String)(life8_33)).substring(((int)(0)), ((int)(__sourceIntrinsic_fe2f420b044e_invokedynamic1654_11(21932, (8715618468034882656L ^ life2_3)))));
    }
    life8_33 = lexicalValue1654_49_0;
    }
    life9_64 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).a(((java.lang.String)(life8_33)), ((net.minecraft.scoreboard.IScoreObjectiveCriteria)(life7_22)));
    ((net.minecraft.scoreboard.ScoreObjective)(life9_64)).a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("DisplayName"))))));
    ((net.minecraft.scoreboard.ScoreObjective)(life9_64)).a(((moom.bn)(moom.bn.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("RenderType")))))))));
    }
    life5_6 += 1;
    }
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
block4: {
            ScoreboardSaveData scoreboardSaveData;
            block2: {
                block3: {
                    long l = net.minecraft.scoreboard.ScoreboardSaveData.f ^ 0x7B14DC06B132L;
                    String[] stringArray = Bj.b__ArrayString();
                    scoreboardSaveData = this;
                    if (stringArray == null) break block2;
                    if (scoreboardSaveData.d != null) break block3;
                    net.minecraft.scoreboard.ScoreboardSaveData.c.warn("Tried to save scoreboard without having a scoreboard...");
                    if (stringArray != null) break block4;
                }
                p0.a("Objectives", this.b());
                p0.a("PlayerScores", this.c());
                p0.a("Teams", this.a__sourceReturn_070ca65520());
                scoreboardSaveData = this;
            }
            scoreboardSaveData.d(p0);
        }
}


protected net.minecraft.nbt.NBTTagList b() {
java.lang.String[] spill1653_0;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    java.util.Iterator life5_13;
    java.lang.String[] life3_14;
    net.minecraft.scoreboard.ScoreObjective life6_21;
    net.minecraft.nbt.NBTTagCompound life7_28;
    lexical_join_56: {
    life1_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 128732456174043L);
    spill1653_0 = moom.Bj.b__ArrayString();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life5_13 = ((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(this.d)).a())).iterator();
    life3_14 = spill1653_0;
    lexical_cycle_15: while (true) {
    lexical_join_54: {
    if (!(((java.util.Iterator)(life5_13)).hasNext())) {
        break lexical_join_56;
    }
    life6_21 = ((net.minecraft.scoreboard.ScoreObjective)(((java.util.Iterator)(life5_13)).next()));
    if (!((((net.minecraft.scoreboard.ScoreObjective)(life6_21)).a__Bb() != null))) {
        break lexical_join_54;
    }
    life7_28 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("Name")), ((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(life6_21)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("CriteriaName")), ((java.lang.String)(((net.minecraft.scoreboard.IScoreObjectiveCriteria)(((net.minecraft.scoreboard.ScoreObjective)(life6_21)).a__Bb())).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("DisplayName")), ((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(life6_21)).b())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("RenderType")), ((java.lang.String)(((moom.bn)(((net.minecraft.scoreboard.ScoreObjective)(life6_21)).a__bn())).a())));
    ((net.minecraft.nbt.NBTTagList)(life4_8)).a(((net.minecraft.nbt.NBTBase)(life7_28)));
    }
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life4_8;
}


protected net.minecraft.nbt.NBTTagList c() {
java.lang.String[] spill1655_0;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    java.lang.String[] life3_9;
    java.util.Iterator life5_14;
    net.minecraft.scoreboard.Score life6_21;
    net.minecraft.nbt.NBTTagCompound life7_28;
    lexical_join_55: {
    life1_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 100948500031881L);
    spill1655_0 = moom.Bj.b__ArrayString();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life3_9 = spill1655_0;
    life5_14 = ((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(this.d)).c())).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_53: {
    if (!(((java.util.Iterator)(life5_14)).hasNext())) {
        break lexical_join_55;
    }
    life6_21 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life5_14)).next()));
    if (!((((net.minecraft.scoreboard.Score)(life6_21)).a__Bg() != null))) {
        break lexical_join_53;
    }
    life7_28 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("Name")), ((java.lang.String)(((net.minecraft.scoreboard.Score)(life6_21)).a__String())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("Objective")), ((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(((net.minecraft.scoreboard.Score)(life6_21)).a__Bg())).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a__Void(((java.lang.String)("Score")), ((int)(((net.minecraft.scoreboard.Score)(life6_21)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_28)).a(((java.lang.String)("Locked")), ((boolean)(((net.minecraft.scoreboard.Score)(life6_21)).a__Boolean())));
    ((net.minecraft.nbt.NBTTagList)(life4_8)).a(((net.minecraft.nbt.NBTBase)(life7_28)));
    }
    if (!((life3_9 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life4_8;
}


protected void c(net.minecraft.nbt.NBTTagList p0) {
java.lang.String lexicalValue1657_45_0;
    java.lang.String[] spill1657_0;
    java.lang.String spill1657_1;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    net.minecraft.nbt.NBTTagCompound life6_15;
    net.minecraft.scoreboard.ScoreObjective life7_22;
    java.lang.String life8_26;
    net.minecraft.scoreboard.Score life9_57;
    lexical_join_71: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 118348887458151L);
    spill1657_0 = moom.Bj.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill1657_0;
    lexical_cycle_8: while (true) {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_46: {
    lexical_join_45: {
    if (!((life5_6 < ((net.minecraft.nbt.NBTTagList)(p0)).a__Int()))) {
        break lexical_join_71;
    }
    life6_15 = ((net.minecraft.nbt.NBTTagList)(p0)).a__yw(((int)(life5_6)));
    life7_22 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).a__Bg(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Objective"))))));
    life8_26 = ((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Name")));
    spill1657_1 = life8_26;
    if (!((life4_7 != null))) {
        lexicalValue1657_45_0 = spill1657_1;
        break lexical_join_45;
    }
    if (!((((java.lang.String)(spill1657_1)).length() > __sourceIntrinsic_ab284d75e6af_invokedynamic1657_9(30137, (311930452385094917L ^ life2_3))))) {
        break lexical_join_46;
    }
    lexicalValue1657_45_0 = ((java.lang.String)(life8_26)).substring(((int)(0)), ((int)(__sourceIntrinsic_ab284d75e6af_invokedynamic1657_10(15741, (8763054754798835148L ^ life2_3)))));
    }
    life8_26 = lexicalValue1657_45_0;
    }
    life9_57 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).a(((java.lang.String)(life8_26)), ((net.minecraft.scoreboard.ScoreObjective)(life7_22)));
    ((net.minecraft.scoreboard.Score)(life9_57)).c(((int)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Int(((java.lang.String)("Score"))))));
    if (!((life4_7 != null))) {
        break lexical_join_69;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Boolean(((java.lang.String)("Locked"))))) {
        break lexical_join_68;
    }
    ((net.minecraft.scoreboard.Score)(life9_57)).a(((boolean)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).b__Boolean(((java.lang.String)("Locked"))))));
    }
    life5_6 += 1;
    }
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound lexicalValue1656_30_0;
    java.lang.String lexicalValue1656_30_1;
    java.lang.String[] spill1656_0;
    net.minecraft.nbt.NBTTagCompound spill1656_1;
    java.lang.String spill1656_2;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    java.lang.String life6_37;
    net.minecraft.scoreboard.ScoreObjective life7_42;
    lexical_join_45: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 26860464961779L);
    spill1656_0 = moom.Bj.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill1656_0;
    lexical_cycle_8: while (true) {
    lexical_join_42: {
    lexical_join_30: {
    if (!((life5_6 < __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_2(16837, (7205697699118158054L ^ life2_3))))) {
        break lexical_join_45;
    }
    spill1656_1 = p0;
    spill1656_2 = __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_3(life5_6);
    if (!((life4_7 != null))) {
        lexicalValue1656_30_0 = spill1656_1;
        lexicalValue1656_30_1 = spill1656_2;
        break lexical_join_30;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1656_1)).a__Boolean(((java.lang.String)(spill1656_2)), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic1656_4(1393, (2533947724025812054L ^ life2_3))))))) {
        break lexical_join_42;
    }
    lexicalValue1656_30_0 = p0;
    lexicalValue1656_30_1 = __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_6(life5_6);
    }
    life6_37 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1656_30_0)).a__String(((java.lang.String)(lexicalValue1656_30_1)));
    life7_42 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).a__Bg(((java.lang.String)(life6_37)));
    ((net.minecraft.scoreboard.Scoreboard)(this.d)).a(((int)(life5_6)), ((net.minecraft.scoreboard.ScoreObjective)(life7_42)));
    }
    life5_6 += 1;
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
java.lang.String[] spill1658_0;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_8;
    java.lang.String[] life4_9;
    int life6_11;
    int life7_13;
    net.minecraft.scoreboard.ScoreObjective life8_25;
    lexical_join_49: {
    lexical_join_43: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 73677590641165L);
    spill1658_0 = moom.Bj.b__ArrayString();
    life5_8 = new net.minecraft.nbt.NBTTagCompound();
    life4_9 = spill1658_0;
    life6_11 = 0;
    life7_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life7_13 < __sourceIntrinsic_458405b53cd1_invokedynamic1658_2(4793, (6249460220839821671L ^ life2_3))))) {
        break lexical_join_43;
    }
    life8_25 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).a__Bg(((int)(life7_13)));
    if (!((life4_9 != null))) {
        break lexical_join_49;
    }
    if (!((life4_9 != null))) {
        break lexical_join_41;
    }
    if (!((life8_25 != null))) {
        break lexical_join_40;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life5_8)).a(((java.lang.String)(__sourceIntrinsic_458405b53cd1_invokedynamic1658_5(life7_13))), ((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(life8_25)).a())));
    life6_11 = 1;
    }
    life7_13 += 1;
    }
    if (!((life4_9 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    if (!((life6_11 != 0))) {
        break lexical_join_49;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("DisplaySlots")), ((net.minecraft.nbt.NBTBase)(life5_8)));
    }
    return;
}


public void a(net.minecraft.scoreboard.Scoreboard p0) {
net.minecraft.scoreboard.ScoreboardSaveData forwardValue5579_15_0;
    java.lang.String[] spill5579_0;
    net.minecraft.scoreboard.ScoreboardSaveData spill5579_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_18: {
    forward_join_15: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 127160456907255L);
    spill5579_0 = moom.Bj.b__ArrayString();
    this.d = ((net.minecraft.scoreboard.Scoreboard)(p0));
    life4_8 = spill5579_0;
    spill5579_1 = this;
    if (!((life4_8 != null))) {
        forwardValue5579_15_0 = spill5579_1;
        break forward_join_15;
    }
    if (!((((net.minecraft.scoreboard.ScoreboardSaveData)(spill5579_1)).e != null))) {
        break forward_join_18;
    }
    forwardValue5579_15_0 = this;
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(forwardValue5579_15_0)).a(((net.minecraft.nbt.NBTTagCompound)(this.e)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12920;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/EF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a1109663d813c1(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12146_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(moom.Bk p0, net.minecraft.nbt.NBTTagList p1) {
java.lang.String[] spill1651_0;
    long life3_3;
    int life6_6;
    java.lang.String[] life5_7;
    lexical_join_24: {
    life3_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 110692471242519L);
    spill1651_0 = moom.Bj.b__ArrayString();
    life6_6 = 0;
    life5_7 = spill1651_0;
    lexical_cycle_8: while (true) {
    if (!((life6_6 < ((net.minecraft.nbt.NBTTagList)(p1)).a__Int()))) {
        break lexical_join_24;
    }
    ((net.minecraft.scoreboard.Scoreboard)(this.d)).a(((java.lang.String)(((net.minecraft.nbt.NBTTagList)(p1)).a__String(((int)(life6_6))))), ((java.lang.String)(((moom.Bk)(p0)).a__String())));
    life6_6 += 1;
    if (!((life5_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected void a(net.minecraft.nbt.NBTTagList p0) {
java.lang.String lexicalValue1652_38_0;
    int lexicalValue1652_78_0;
    int lexicalValue1652_105_0;
    int lexicalValue1652_121_0;
    int lexicalValue1652_137_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1652_154_0;
    java.lang.String lexicalValue1652_154_1;
    int lexicalValue1652_162_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1652_165_0;
    java.lang.String lexicalValue1652_165_1;
    java.lang.String[] spill1652_0;
    java.lang.String spill1652_1;
    int spill1652_2;
    net.minecraft.nbt.NBTTagCompound spill1652_3;
    java.lang.String spill1652_4;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    net.minecraft.nbt.NBTTagCompound life6_15;
    java.lang.String life7_19;
    moom.Bk life8_49;
    java.lang.String life9_53;
    net.minecraft.scoreboard.Team$EnumVisible life10_179;
    net.minecraft.scoreboard.Team$EnumVisible life10_209;
    lexical_join_189: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 40677241475053L);
    spill1652_0 = moom.Bj.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill1652_0;
    lexical_cycle_8: while (true) {
    lexical_join_187: {
    lexical_join_175: {
    lexical_join_165: {
    lexical_join_162: {
    lexical_join_154: {
    lexical_join_152: {
    lexical_join_137: {
    lexical_join_129: {
    lexical_join_121: {
    lexical_join_113: {
    lexical_join_105: {
    lexical_join_87: {
    lexical_join_78: {
    lexical_join_67: {
    lexical_join_39: {
    lexical_join_38: {
    if (!((life5_6 < ((net.minecraft.nbt.NBTTagList)(p0)).a__Int()))) {
        break lexical_join_189;
    }
    life6_15 = ((net.minecraft.nbt.NBTTagList)(p0)).a__yw(((int)(life5_6)));
    life7_19 = ((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Name")));
    spill1652_1 = life7_19;
    if (!((life4_7 != null))) {
        lexicalValue1652_38_0 = spill1652_1;
        break lexical_join_38;
    }
    if (!((((java.lang.String)(spill1652_1)).length() > __sourceIntrinsic_752284641be1_invokedynamic1652_6(21932, (8715593934758687635L ^ life2_3))))) {
        break lexical_join_39;
    }
    lexicalValue1652_38_0 = ((java.lang.String)(life7_19)).substring(((int)(0)), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_7(21932, (8715593934758687635L ^ life2_3)))));
    }
    life7_19 = lexicalValue1652_38_0;
    }
    life8_49 = ((net.minecraft.scoreboard.Scoreboard)(this.d)).b(((java.lang.String)(life7_19)));
    life9_53 = ((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("DisplayName")));
    spill1652_2 = ((java.lang.String)(life9_53)).length();
    if (!((life4_7 != null))) {
        lexicalValue1652_78_0 = spill1652_2;
        break lexical_join_78;
    }
    if (!((spill1652_2 > __sourceIntrinsic_752284641be1_invokedynamic1652_13(1793, (6506249930087522609L ^ life2_3))))) {
        break lexical_join_67;
    }
    life9_53 = ((java.lang.String)(life9_53)).substring(((int)(0)), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_14(7127, (4175210463906004461L ^ life2_3)))));
    }
    ((moom.Bk)(life8_49)).a__Void(((java.lang.String)(life9_53)));
    lexicalValue1652_78_0 = ((((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Boolean(((java.lang.String)("TeamColor")), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_17(9469, (5210899668064518857L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        lexicalValue1652_105_0 = lexicalValue1652_78_0;
        break lexical_join_105;
    }
    if (!((lexicalValue1652_78_0 != 0))) {
        break lexical_join_87;
    }
    ((moom.Bk)(life8_49)).a(((net.minecraft.util.EnumChatFormatting)(net.minecraft.util.EnumChatFormatting.a__br(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("TeamColor")))))))));
    }
    ((moom.Bk)(life8_49)).b(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Prefix"))))));
    ((moom.Bk)(life8_49)).c(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Suffix"))))));
    lexicalValue1652_105_0 = ((((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Boolean(((java.lang.String)("AllowFriendlyFire")), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_27(18612, (2972365602931977857L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        lexicalValue1652_121_0 = lexicalValue1652_105_0;
        break lexical_join_121;
    }
    if (!((lexicalValue1652_105_0 != 0))) {
        break lexical_join_113;
    }
    ((moom.Bk)(life8_49)).a(((boolean)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).b__Boolean(((java.lang.String)("AllowFriendlyFire"))))));
    }
    lexicalValue1652_121_0 = ((((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Boolean(((java.lang.String)("SeeFriendlyInvisibles")), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_32(5708, (429330997872488575L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        lexicalValue1652_137_0 = lexicalValue1652_121_0;
        break lexical_join_137;
    }
    if (!((lexicalValue1652_121_0 != 0))) {
        break lexical_join_129;
    }
    ((moom.Bk)(life8_49)).b(((boolean)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).b__Boolean(((java.lang.String)("SeeFriendlyInvisibles"))))));
    }
    lexicalValue1652_137_0 = ((((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__Boolean(((java.lang.String)("NameTagVisibility")), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_37(1393, (2533935135326757704L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        lexicalValue1652_162_0 = lexicalValue1652_137_0;
        break lexical_join_162;
    }
    if (!((lexicalValue1652_137_0 != 0))) {
        break lexical_join_152;
    }
    spill1652_3 = life6_15;
    spill1652_4 = "NameTagVisibility";
    if (!((life4_7 != null))) {
        lexicalValue1652_154_0 = spill1652_3;
        lexicalValue1652_154_1 = spill1652_4;
        break lexical_join_154;
    }
    life10_179 = net.minecraft.scoreboard.Team$EnumVisible.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(spill1652_3)).a__String(((java.lang.String)(spill1652_4))))));
    if (!((life10_179 != null))) {
        break lexical_join_152;
    }
    ((moom.Bk)(life8_49)).a(((net.minecraft.scoreboard.Team$EnumVisible)(life10_179)));
    }
    lexicalValue1652_154_0 = life6_15;
    lexicalValue1652_154_1 = "DeathMessageVisibility";
    }
    if (!((life4_7 != null))) {
        lexicalValue1652_165_0 = lexicalValue1652_154_0;
        lexicalValue1652_165_1 = lexicalValue1652_154_1;
        break lexical_join_165;
    }
    lexicalValue1652_162_0 = ((((net.minecraft.nbt.NBTTagCompound)(lexicalValue1652_154_0)).a__Boolean(((java.lang.String)(lexicalValue1652_154_1)), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_43(1393, (2533935135326757704L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1652_162_0 != 0))) {
        break lexical_join_175;
    }
    lexicalValue1652_165_0 = life6_15;
    lexicalValue1652_165_1 = "DeathMessageVisibility";
    }
    life10_209 = net.minecraft.scoreboard.Team$EnumVisible.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1652_165_0)).a__String(((java.lang.String)(lexicalValue1652_165_1))))));
    if (!((life4_7 != null))) {
        break lexical_join_187;
    }
    if (!((life10_209 != null))) {
        break lexical_join_175;
    }
    ((moom.Bk)(life8_49)).b(((net.minecraft.scoreboard.Team$EnumVisible)(life10_209)));
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(this)).a(((moom.Bk)(life8_49)), ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a(((java.lang.String)("Players")), ((int)(__sourceIntrinsic_752284641be1_invokedynamic1652_49(1393, (2533935135326757704L ^ life2_3))))))));
    life5_6 += 1;
    }
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


protected net.minecraft.nbt.NBTTagList a__sourceReturn_070ca65520() {
java.lang.String[] spill1650_0;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    java.util.Iterator life5_13;
    java.lang.String[] life3_14;
    moom.Bk life6_21;
    net.minecraft.nbt.NBTTagCompound life7_25;
    net.minecraft.nbt.NBTTagList life8_89;
    java.util.Iterator life9_93;
    java.lang.String life10_100;
    lexical_join_114: {
    life1_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 27684698257855L);
    spill1650_0 = moom.Bj.b__ArrayString();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life5_13 = ((java.util.Collection)(((net.minecraft.scoreboard.Scoreboard)(this.d)).e())).iterator();
    life3_14 = spill1650_0;
    lexical_cycle_15: while (true) {
    lexical_join_112: {
    lexical_join_105: {
    lexical_join_80: {
    lexical_join_48: {
    if (!(((java.util.Iterator)(life5_13)).hasNext())) {
        break lexical_join_114;
    }
    life6_21 = ((moom.Bk)(((java.util.Iterator)(life5_13)).next()));
    life7_25 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("Name")), ((java.lang.String)(((moom.Bk)(life6_21)).a__String())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("DisplayName")), ((java.lang.String)(((moom.Bk)(life6_21)).b())));
    if (!((life3_14 != null))) {
        break lexical_join_80;
    }
    if (!((((net.minecraft.util.EnumChatFormatting)(((moom.Bk)(life6_21)).a__br())).a() >= 0))) {
        break lexical_join_48;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("TeamColor")), ((java.lang.String)(((net.minecraft.util.EnumChatFormatting)(((moom.Bk)(life6_21)).a__br())).a__String())));
    }
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("Prefix")), ((java.lang.String)(((moom.Bk)(life6_21)).c())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("Suffix")), ((java.lang.String)(((moom.Bk)(life6_21)).d())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("AllowFriendlyFire")), ((boolean)(((moom.Bk)(life6_21)).b__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("SeeFriendlyInvisibles")), ((boolean)(((moom.Bk)(life6_21)).a__Boolean())));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("NameTagVisibility")), ((java.lang.String)(((net.minecraft.scoreboard.Team$EnumVisible)(((moom.Bk)(life6_21)).a__bo())).internalName)));
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("DeathMessageVisibility")), ((java.lang.String)(((net.minecraft.scoreboard.Team$EnumVisible)(((moom.Bk)(life6_21)).b__bo())).internalName)));
    }
    life8_89 = new net.minecraft.nbt.NBTTagList();
    life9_93 = ((java.util.Collection)(((moom.Bk)(life6_21)).a__Collection())).iterator();
    lexical_cycle_88: while (true) {
    if (!(((java.util.Iterator)(life9_93)).hasNext())) {
        break lexical_join_105;
    }
    life10_100 = ((java.lang.String)(((java.util.Iterator)(life9_93)).next()));
    ((net.minecraft.nbt.NBTTagList)(life8_89)).a(((net.minecraft.nbt.NBTBase)(new moom.yA(life10_100))));
    if (!((life3_14 != null))) {
        break lexical_join_112;
    }
    if (!((life3_14 == null))) { continue lexical_cycle_88; }
    break lexical_cycle_88;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(life7_25)).a(((java.lang.String)("Players")), ((net.minecraft.nbt.NBTBase)(life8_89)));
    ((net.minecraft.nbt.NBTTagList)(life4_8)).a(((net.minecraft.nbt.NBTBase)(life7_25)));
    }
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life4_8;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.scoreboard.ScoreboardSaveData forwardValue5577_27_0;
    int forwardValue5577_60_0;
    net.minecraft.scoreboard.ScoreboardSaveData spill5577_0;
    boolean spill5577_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_71: {
    forward_join_60: {
    forward_join_52: {
    forward_join_27: {
    forward_join_16: {
    life2_3 = (net.minecraft.scoreboard.ScoreboardSaveData.f ^ 124109270330469L);
    life4_5 = moom.Bj.b__ArrayString();
    spill5577_0 = this;
    if (!((life4_5 != null))) {
        forwardValue5577_27_0 = spill5577_0;
        break forward_join_27;
    }
    if (!((((net.minecraft.scoreboard.ScoreboardSaveData)(spill5577_0)).d == null))) {
        break forward_join_16;
    }
    this.e = ((net.minecraft.nbt.NBTTagCompound)(p0));
    if (!((life4_5 == null))) {
        break forward_join_71;
    }
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(this)).b(((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Objectives")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5577_4(533, (3795510730377070511L ^ life2_3))))))));
    forwardValue5577_27_0 = this;
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(forwardValue5577_27_0)).c(((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PlayerScores")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5577_7(18959, (5967853770849537968L ^ life2_3))))))));
    spill5577_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("DisplaySlots")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5577_10(18959, (5967853770849537968L ^ life2_3)))));
    if (!((life4_5 != null))) {
        forwardValue5577_60_0 = ((spill5577_1) ? 1 : 0);
        break forward_join_60;
    }
    if (!(spill5577_1)) {
        break forward_join_52;
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(this)).c(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("DisplaySlots"))))));
    }
    forwardValue5577_60_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Teams")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5577_15(6039, (6098632792289022510L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5577_60_0 != 0))) {
        break forward_join_71;
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(this)).a(((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Teams")), ((int)(__sourceIntrinsic_658b606e7852_invokedynamic5577_18(18959, (5967853770849537968L ^ life2_3))))))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_fe2f420b044e_invokedynamic1654_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fe2f420b044e_invokedynamic1654_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab284d75e6af_invokedynamic1657_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab284d75e6af_invokedynamic1657_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_3(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_01f4e1cd062e_invokedynamic1656_6(int a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_458405b53cd1_invokedynamic1658_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_458405b53cd1_invokedynamic1658_5(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12146_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1652_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5577_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5577_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5577_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5577_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_658b606e7852_invokedynamic5577_18(int a0, long a1) throws E;

private static native int __sourceExactCall_a1109663d813c1(int p0, long p1);
}
