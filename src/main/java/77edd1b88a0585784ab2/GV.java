package moom;


public class GV extends moom.GD {

private static final long f;

public GV(long p0, moom.GD p1) {
super(p0);
    ((moom.GD)(this)).b = ((moom.GD)(p1));
    return;
}


static {
f = (moom._c.a(7212448597802681220L, 4778223374218086800L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(109330390995132L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected int a__sourceReturn_7cf53c2591(int p0, int p1) {
int forwardValue2011_15_0;
    int forwardValue2011_17_0;
    net.minecraft.entity.Entity[] spill2011_0;
    int spill2011_1;
    long life3_3;
    int life6_8;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (moom.GV.f ^ 125911414816785L);
    spill2011_0 = moom.GD.b();
    life6_8 = ((moom.GV)(this)).a(((int)(2)));
    life5_9 = spill2011_0;
    spill2011_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue2011_15_0 = spill2011_1;
        break forward_join_15;
    }
    if (!((spill2011_1 == 0))) {
        break forward_join_16;
    }
    forwardValue2011_15_0 = p0;
    }
    forwardValue2011_17_0 = forwardValue2011_15_0;
    break forward_join_17;
    }
    forwardValue2011_17_0 = p1;
    }
    return forwardValue2011_17_0;
}


public static moom.GD a(long p0, moom.GD p1, int p2) {
moom.GD forestValue3_28_0;
    net.minecraft.entity.Entity[] spill3_0;
    moom.GV spill3_1;
    long life4_3;
    moom.GD life7_6;
    net.minecraft.entity.Entity[] life6_7;
    int life8_9;
    forest_join_28: {
    forest_join_27: {
    life4_3 = (moom.GV.f ^ 126280003454144L);
    spill3_0 = moom.GD.b();
    life7_6 = p1;
    life6_7 = spill3_0;
    life8_9 = 0;
    forest_cycle_10: while (true) {
    if (!((life8_9 < p2))) {
        break forest_join_27;
    }
    spill3_1 = new moom.GV((p0 + ((long) life8_9)), life7_6);
    if (!((life6_7 != null))) {
        forestValue3_28_0 = spill3_1;
        break forest_join_28;
    }
    life7_6 = spill3_1;
    life8_9 += 1;
    if (!((life6_7 == null))) {
        continue forest_cycle_10;
    }
    break forest_cycle_10;
    }
    }
    forestValue3_28_0 = life7_6;
    }
    return forestValue3_28_0;
}


public int[] a__ArrayInt(int p0, int p1, int p2, int p3) {
int lexicalValue698_177_0;
    int[] lexicalValue698_208_0;
    net.minecraft.entity.Entity[] spill698_0;
    int spill698_1;
    int[] spill698_2;
    long life5_3;
    int life8_7;
    int life9_11;
    int life10_17;
    int life11_24;
    int[] life12_32;
    int life13_38;
    int life14_44;
    net.minecraft.entity.Entity[] life7_45;
    int[] life15_50;
    int life16_52;
    int life17_63;
    int life18_65;
    int life19_73;
    int life20_85;
    int life21_116;
    int life22_128;
    int[] life16_181;
    int life17_183;
    lexical_join_208: {
    lexical_join_207: {
    lexical_join_177: {
    lexical_join_174: {
    life5_3 = (moom.GV.f ^ 101581424616864L);
    life8_7 = (p0 >> 1);
    life9_11 = (p1 >> 1);
    life10_17 = ((p2 >> 1) + 2);
    spill698_0 = moom.GD.b();
    life11_24 = ((p3 >> 1) + 2);
    life12_32 = ((moom.GD)(((moom.GV)(this)).b)).a__ArrayInt(((int)(life8_7)), ((int)(life9_11)), ((int)(life10_17)), ((int)(life11_24)));
    life13_38 = ((life10_17 - 1) << 1);
    life14_44 = ((life11_24 - 1) << 1);
    life7_45 = spill698_0;
    life15_50 = moom.GY.a(((int)((life13_38 * life14_44))));
    life16_52 = 0;
    lexical_cycle_53: while (true) {
    lexical_join_172: {
    lexical_join_171: {
    if (!((life16_52 < (life11_24 - 1)))) {
        break lexical_join_174;
    }
    life17_63 = ((life16_52 << 1) * life13_38);
    life18_65 = 0;
    life19_73 = (life12_32)[(life18_65 + (life16_52 * life10_17))];
    spill698_1 = (life12_32)[(life18_65 + ((life16_52 + 1) * life10_17))];
    if (!((life7_45 != null))) {
        lexicalValue698_177_0 = spill698_1;
        break lexical_join_177;
    }
    life20_85 = spill698_1;
    lexical_cycle_86: while (true) {
    if (!((life18_65 < (life10_17 - 1)))) {
        break lexical_join_171;
    }
    ((moom.GV)(this)).a(((long)(((((long) life18_65) + ((long) life8_7)) << 1))), ((long)(((((long) life16_52) + ((long) life9_11)) << 1))));
    life21_116 = (life12_32)[((life18_65 + 1) + (life16_52 * life10_17))];
    life22_128 = (life12_32)[((life18_65 + 1) + ((life16_52 + 1) * life10_17))];
    (life15_50)[life17_63] = life19_73;
    (life15_50)[((life17_63++) + life13_38)] = ((moom.GV)(this)).a__sourceReturn_7cf53c2591(((int)(life19_73)), ((int)(life20_85)));
    (life15_50)[life17_63] = ((moom.GV)(this)).a__sourceReturn_7cf53c2591(((int)(life19_73)), ((int)(life21_116)));
    (life15_50)[((life17_63++) + life13_38)] = ((moom.GV)(this)).a(((int)(life19_73)), ((int)(life21_116)), ((int)(life20_85)), ((int)(life22_128)));
    life19_73 = life21_116;
    life20_85 = life22_128;
    life18_65 += 1;
    if (!((life7_45 != null))) {
        break lexical_join_172;
    }
    if (!((life7_45 == null))) { continue lexical_cycle_86; }
    break lexical_cycle_86;
    }
    }
    life16_52 += 1;
    }
    if (!((life7_45 == null))) { continue lexical_cycle_53; }
    break lexical_cycle_53;
    }
    }
    lexicalValue698_177_0 = (p2 * p3);
    }
    life16_181 = moom.GY.a(((int)(lexicalValue698_177_0)));
    life17_183 = 0;
    lexical_cycle_181: while (true) {
    if (!((life17_183 < p3))) {
        break lexical_join_207;
    }
    spill698_2 = life15_50;
    if (!((life7_45 != null))) {
        lexicalValue698_208_0 = spill698_2;
        break lexical_join_208;
    }
    java.lang.System.arraycopy(((java.lang.Object)(spill698_2)), ((int)((((life17_183 + (p1 & 1)) * life13_38) + (p0 & 1)))), ((java.lang.Object)(life16_181)), ((int)((life17_183 * p2))), ((int)(p2)));
    life17_183 += 1;
    if (!((life7_45 == null))) { continue lexical_cycle_181; }
    break lexical_cycle_181;
    }
    }
    lexicalValue698_208_0 = life16_181;
    }
    return lexicalValue698_208_0;
}

}
