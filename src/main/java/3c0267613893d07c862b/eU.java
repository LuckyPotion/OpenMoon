package com.moon;


public class eU {

private final java.lang.String a;

private java.lang.String b;

public eU(java.lang.String p0) {
super();
    this.b = "";
    this.a = p0;
}


public java.lang.String b() {
return this.b;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
return (__sourceIntrinsic_booleanComparison((((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__String())).equals(((java.lang.Object)(this.a))))) != 0);
}


public java.lang.String a() {
return this.a;
}


public com.moon.eU a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
