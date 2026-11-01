package com.moon;


public class kI {

private static final long a;

public kI() {
super();
}


static {
a = (moom._c.a(-258643986659104111L, -2473559165100919015L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(201249922914553L);
}


public static com.moon.cb a(com.moon.scripting.api.enums.TemplateType p0) {
long local1 = (com.moon.kI.a ^ 45695134253784L);
    java.lang.String local3 = com.moon.kG.b();
    switch ((com.moon.kJ.a)[((com.moon.scripting.api.enums.TemplateType)(p0)).ordinal()]) {
case 1:
{
        return com.moon.cb.RECTANGLE;
    }
case 2:
{
        return com.moon.cb.MSDF;
    }
case 3:
{
        return com.moon.cb.GRADIENT;
    }
case 4:
{
        return com.moon.cb.TRIANGLE;
    }
case 5:
{
        return com.moon.cb.ROUNDED_RECTANGLE;
    }
case 6:
{
        return com.moon.cb.OUTLINE_ROUNDED_RECTANGLE;
    }
default:
{
        com.moon.cb spill1728_0 = com.moon.cb.RECTANGLE;
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.kG.b(((java.lang.String)("VWD6x")));
    }
        return spill1728_0;
    }
}
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
