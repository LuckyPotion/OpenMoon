package com.moon;


public class cS {

private java.lang.String a;

private com.moon.cT b;

private static int c;

public cS() {
super();
}


public cS(java.lang.String p0, com.moon.cT p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
if ((com.moon.cS.b() == 0)) {
        com.moon.cS.b(((int)(44)));
    }
}


public static int b() {
return com.moon.cS.c;
}


public static void b(int p0) {
c = ((int)(p0));
    return;
}


public static int c() {
int local0 = com.moon.cS.b();
    if ((local0 == 0)) {
        return 105;
    }
    return 0;
}


public java.lang.String a__String() {
return this.a;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.cS a(com.moon.cT p0) {
this.b = ((com.moon.cT)(p0));
    return this;
}


public com.moon.cT a() {
return this.b;
}


public com.moon.cS a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}

}
