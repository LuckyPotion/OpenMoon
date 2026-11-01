package moom;


public class Be extends net.minecraft.scoreboard.ScoreDummyCriteria {

private static final long k;

public Be(java.lang.String p0) {
super(p0);
}


static {
k = (moom._c.a(908725400269318101L, 268162390910948729L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(80143848357596L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.bn a__bn() {
return moom.bn.HEARTS;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public int a(java.util.List<net.minecraft.entity.player.EntityPlayer> p0) {
int lexicalValue502_43_0;
    java.lang.String[] spill502_0;
    int spill502_1;
    long life2_3;
    float life5_6;
    java.lang.String[] life4_7;
    java.util.Iterator life6_10;
    net.minecraft.entity.player.EntityPlayer life7_17;
    lexical_join_43: {
    lexical_join_41: {
    lexical_join_30: {
    life2_3 = (moom.Be.k ^ 15820536611460L);
    spill502_0 = moom.Bj.b__ArrayString();
    life5_6 = 0x0.0p0f;
    life4_7 = spill502_0;
    life6_10 = ((java.util.List)(p0)).iterator();
    lexical_cycle_11: while (true) {
    if (!(((java.util.Iterator)(life6_10)).hasNext())) {
        break lexical_join_30;
    }
    life7_17 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life6_10)).next()));
    life5_6 = (life5_6 + (((net.minecraft.entity.player.EntityPlayer)(life7_17)).b__sourceReturn_bc607678b6() + ((net.minecraft.entity.player.EntityPlayer)(life7_17)).j__sourceReturn_bc607678b6()));
    if (!((life4_7 != null))) {
        break lexical_join_41;
    }
    if (!((life4_7 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    spill502_1 = ((java.util.List)(p0)).size();
    if (!((life4_7 != null))) {
        lexicalValue502_43_0 = spill502_1;
        break lexical_join_43;
    }
    if (!((spill502_1 > 0))) {
        break lexical_join_41;
    }
    life5_6 = (life5_6 / ((float) ((java.util.List)(p0)).size()));
    }
    lexicalValue502_43_0 = moom.Dr.b__Int(((float)(life5_6)));
    }
    return lexicalValue502_43_0;
}

}
