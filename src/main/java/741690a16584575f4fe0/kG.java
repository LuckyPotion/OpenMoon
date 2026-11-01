package com.moon;


public class kG {

private static java.lang.String b;

private static final long a;

public kG() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(7006869951641196393L)), ((long)(2224370190235456853L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170007091215568L)))));
    if ((com.moon.kG.b() == null)) {
        com.moon.kG.b(((java.lang.String)("k2v4cc")));
    }
}


public static java.lang.String b() {
return com.moon.kG.b;
}


public static void b(java.lang.String p0) {
com.moon.kG.b = ((java.lang.String)(p0));
    return;
}


public static com.moon.ce a(com.moon.scripting.api.enums.CustomFontType p0) {
long local1 = (com.moon.kG.a ^ 99308771097710L);
    java.lang.String local3 = com.moon.kG.b();
    switch ((com.moon.kH.a)[((com.moon.scripting.api.enums.CustomFontType)(p0)).ordinal()]) {
case 1:
{
        return com.moon.ce.SF;
    }
case 2:
{
        return com.moon.ce.TAHOMA;
    }
case 3:
{
        return com.moon.ce.VERDANA;
    }
case 4:
{
        return com.moon.ce.INTER_MEDIUM;
    }
case 5:
{
        return com.moon.ce.PRODUCT_SANS;
    }
case 6:
{
        return com.moon.ce.ROBOTO_MEDIUM;
    }
case 7:
{
        return com.moon.ce.MATERIAL_ICONS;
    }
case 8:
{
        return com.moon.ce.VOLTE_SEMI_BOLD;
    }
case 9:
{
        return com.moon.ce.MATERIAL_SYMBOLS_OUTLINED_REGULAR;
    }
default:
{
        com.moon.ce spill1727_0 = com.moon.ce.VERDANA;
        if ((local3 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
        return spill1727_0;
    }
}
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
