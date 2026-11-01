package moom;


public class NL implements java.util.Comparator {

private static final long a;

public NL() {
super();
}


static {
a = (moom._c.a(3682054566183251173L, 8988803819460186849L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(27393542749664L);
}


public int compare(java.lang.Object p0, java.lang.Object p1) {
int forwardValue2807_29_0;
    int forwardValue2807_29_1;
    int forwardValue2807_42_0;
    int forwardValue2807_42_1;
    int forwardValue2807_55_0;
    int forwardValue2807_55_1;
    int forwardValue2807_62_0;
    int forwardValue2807_62_1;
    int forwardValue2807_65_0;
    int spill2807_0;
    int spill2807_1;
    int spill2807_2;
    long life3_3;
    org.lwjgl.opengl.DisplayMode life6_7;
    org.lwjgl.opengl.DisplayMode life7_10;
    int life5_11;
    forward_join_65: {
    forward_join_64: {
    forward_join_62: {
    forward_join_55: {
    forward_join_51: {
    forward_join_42: {
    forward_join_38: {
    forward_join_29: {
    forward_join_25: {
    life3_3 = (moom.NL.a ^ 86889913743939L);
    spill2807_0 = moom.Ob.c();
    life6_7 = ((org.lwjgl.opengl.DisplayMode)(p0));
    life7_10 = ((org.lwjgl.opengl.DisplayMode)(p1));
    life5_11 = spill2807_0;
    spill2807_1 = ((org.lwjgl.opengl.DisplayMode)(life6_7)).getWidth();
    spill2807_2 = ((org.lwjgl.opengl.DisplayMode)(life7_10)).getWidth();
    if (!((life5_11 != 0))) {
        forwardValue2807_29_0 = spill2807_1;
        forwardValue2807_29_1 = spill2807_2;
        break forward_join_29;
    }
    if (!((spill2807_1 != spill2807_2))) {
        break forward_join_25;
    }
    forwardValue2807_65_0 = (((org.lwjgl.opengl.DisplayMode)(life6_7)).getWidth() - ((org.lwjgl.opengl.DisplayMode)(life7_10)).getWidth());
    break forward_join_65;
    }
    forwardValue2807_29_0 = ((org.lwjgl.opengl.DisplayMode)(life6_7)).getHeight();
    forwardValue2807_29_1 = ((org.lwjgl.opengl.DisplayMode)(life7_10)).getHeight();
    }
    if (!((life5_11 != 0))) {
        forwardValue2807_42_0 = forwardValue2807_29_0;
        forwardValue2807_42_1 = forwardValue2807_29_1;
        break forward_join_42;
    }
    if (!((forwardValue2807_29_0 != forwardValue2807_29_1))) {
        break forward_join_38;
    }
    forwardValue2807_65_0 = (((org.lwjgl.opengl.DisplayMode)(life6_7)).getHeight() - ((org.lwjgl.opengl.DisplayMode)(life7_10)).getHeight());
    break forward_join_65;
    }
    forwardValue2807_42_0 = ((org.lwjgl.opengl.DisplayMode)(life6_7)).getBitsPerPixel();
    forwardValue2807_42_1 = ((org.lwjgl.opengl.DisplayMode)(life7_10)).getBitsPerPixel();
    }
    if (!((life5_11 != 0))) {
        forwardValue2807_55_0 = forwardValue2807_42_0;
        forwardValue2807_55_1 = forwardValue2807_42_1;
        break forward_join_55;
    }
    if (!((forwardValue2807_42_0 != forwardValue2807_42_1))) {
        break forward_join_51;
    }
    forwardValue2807_65_0 = (((org.lwjgl.opengl.DisplayMode)(life6_7)).getBitsPerPixel() - ((org.lwjgl.opengl.DisplayMode)(life7_10)).getBitsPerPixel());
    break forward_join_65;
    }
    forwardValue2807_55_0 = ((org.lwjgl.opengl.DisplayMode)(life6_7)).getFrequency();
    forwardValue2807_55_1 = ((org.lwjgl.opengl.DisplayMode)(life7_10)).getFrequency();
    }
    if (!((life5_11 != 0))) {
        forwardValue2807_62_0 = forwardValue2807_55_0;
        forwardValue2807_62_1 = forwardValue2807_55_1;
        break forward_join_62;
    }
    if (!((forwardValue2807_55_0 != forwardValue2807_55_1))) {
        break forward_join_64;
    }
    forwardValue2807_62_0 = ((org.lwjgl.opengl.DisplayMode)(life6_7)).getFrequency();
    forwardValue2807_62_1 = ((org.lwjgl.opengl.DisplayMode)(life7_10)).getFrequency();
    }
    forwardValue2807_65_0 = (forwardValue2807_62_0 - forwardValue2807_62_1);
    break forward_join_65;
    }
    forwardValue2807_65_0 = 0;
    }
    return forwardValue2807_65_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
