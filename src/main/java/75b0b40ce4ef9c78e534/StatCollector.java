package net.minecraft.util;


public class StatCollector {

private static final moom.DJ a;

private static final moom.DJ b;

public StatCollector() {
super();
}


static {
a = moom.DJ.a__DJ();
    b = new moom.DJ();
}


public static java.lang.String b(java.lang.String p0) {
return ((moom.DJ)(net.minecraft.util.StatCollector.b)).a(((java.lang.String)(p0)));
}


public static java.lang.String a(java.lang.String p0, java.lang.Object[] p1) {
return ((moom.DJ)(net.minecraft.util.StatCollector.a)).a(((java.lang.String)(p0)), ((java.lang.Object[])(p1)));
}


public static long a() {
return ((moom.DJ)(net.minecraft.util.StatCollector.a)).a();
}


public static boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((moom.DJ)(net.minecraft.util.StatCollector.a)).a__Boolean(((java.lang.String)(p0))))) != 0);
}


public static java.lang.String a(java.lang.String p0) {
return ((moom.DJ)(net.minecraft.util.StatCollector.a)).a(((java.lang.String)(p0)));
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
