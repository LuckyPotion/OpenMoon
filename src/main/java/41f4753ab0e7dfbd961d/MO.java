package moom;


public class MO {

private static final long a;

public MO() {
super();
}


static {
a = (moom._c.a(-5769667656678995411L, -6787944635523263267L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(88694360983333L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static boolean a(moom.Nh p0, moom.M7[] p1, boolean p2) {
java.lang.String lexicalValue959_46_0;
    long life3_3;
    int life5_5;
    java.lang.String[] life6_20;
    java.lang.String[] life7_22;
    int life8_25;
    int life9_27;
    java.lang.String life10_34;
    moom.M7 life11_38;
    java.lang.String life12_58;
    java.lang.String life13_62;
    lexical_join_62: {
    lexical_join_14: {
    lexical_join_10: {
    life3_3 = (moom.MO.a ^ 58507318947189L);
    life5_5 = moom.MS.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return ((0) != 0);
    }
    if (!((p1 == null))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    life6_20 = ((moom.Nh)(p0)).a__ArrayString();
    life7_22 = life6_20;
    life8_25 = (life7_22).length;
    life9_27 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_46: {
    lexical_join_44: {
    if (!((life9_27 < life8_25))) {
        break lexical_join_62;
    }
    life10_34 = (life7_22)[life9_27];
    life11_38 = moom.MO.a(((java.lang.String)(life10_34)), ((moom.M7[])(p1)));
    if (!((life5_5 == 0))) {
        break lexical_join_60;
    }
    if (!((life11_38 != null))) {
        break lexical_join_59;
    }
    if (!(p2)) {
        break lexical_join_44;
    }
    lexicalValue959_46_0 = ((moom.M7)(life11_38)).e();
    break lexical_join_46;
    }
    lexicalValue959_46_0 = ((moom.M7)(life11_38)).d();
    }
    life12_58 = lexicalValue959_46_0;
    life13_62 = ((moom.Nh)(p0)).a(((java.lang.String)(life10_34)));
    if (!((life5_5 == 0))) {
        break lexical_join_60;
    }
    if (!((!moom.BU.a(((java.lang.Object)(life12_58)), ((java.lang.Object)(life13_62)))))) {
        break lexical_join_59;
    }
    return ((0) != 0);
    }
    life9_27 += 1;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    return ((1) != 0);
}


public static moom.Nh a(moom.Nh[] p0, moom.M7[] p1, boolean p2) {
moom.Nh[] lexicalValue960_11_0;
    moom.Nh[] spill960_0;
    long life3_3;
    int life5_5;
    moom.Nh[] life6_14;
    int life7_17;
    int life8_19;
    moom.Nh life9_26;
    lexical_join_36: {
    lexical_join_11: {
    life3_3 = (moom.MO.a ^ 66537872068145L);
    life5_5 = moom.MS.b();
    spill960_0 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue960_11_0 = spill960_0;
        break lexical_join_11;
    }
    if (!((spill960_0 != null))) {
        break lexical_join_36;
    }
    lexicalValue960_11_0 = p0;
    }
    life6_14 = lexicalValue960_11_0;
    life7_17 = (life6_14).length;
    life8_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life8_19 < life7_17))) {
        break lexical_join_36;
    }
    life9_26 = (life6_14)[life8_19];
    if (!((life5_5 == 0))) {
        break lexical_join_34;
    }
    if (!(moom.MO.a(((moom.Nh)(life9_26)), ((moom.M7[])(p1)), ((boolean)(p2))))) {
        break lexical_join_33;
    }
    return life9_26;
    }
    life8_19 += 1;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


public static moom.M7 a(java.lang.String p0, moom.M7[] p1) {
moom.M7[] lexicalValue958_11_0;
    moom.M7[] spill958_0;
    long life2_3;
    int life4_5;
    moom.M7[] life5_14;
    int life6_17;
    int life7_19;
    moom.M7 life8_26;
    lexical_join_36: {
    lexical_join_11: {
    life2_3 = (moom.MO.a ^ 25879706653075L);
    life4_5 = moom.MS.c();
    spill958_0 = p1;
    if (!((life4_5 != 0))) {
        lexicalValue958_11_0 = spill958_0;
        break lexical_join_11;
    }
    if (!((spill958_0 != null))) {
        break lexical_join_36;
    }
    lexicalValue958_11_0 = p1;
    }
    life5_14 = lexicalValue958_11_0;
    life6_17 = (life5_14).length;
    life7_19 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life7_19 < life6_17))) {
        break lexical_join_36;
    }
    life8_26 = (life5_14)[life7_19];
    if (!((life4_5 != 0))) {
        break lexical_join_34;
    }
    if (!(((java.lang.String)(((moom.M7)(life8_26)).a__String())).equals(((java.lang.Object)(p0))))) {
        break lexical_join_33;
    }
    return life8_26;
    }
    life7_19 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}

}
