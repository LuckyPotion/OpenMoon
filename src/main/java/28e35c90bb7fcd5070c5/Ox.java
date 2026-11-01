package moom;


public class Ox extends java.lang.Thread {

private java.lang.String a;

private moom.LV b;

public Ox(java.lang.String p0, moom.LV p1) {
super();
    this.a = null;
    this.b = null;
    this.a = p0;
    this.b = p1;
}


public void run() {
byte[] life1_5;
    try {
        life1_5 = moom.LO.a__ArrayByte(((java.lang.String)(this.a)), ((java.net.Proxy)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__Proxy())));
        ((moom.LV)(this.b)).a(((java.lang.String)(this.a)), ((byte[])(life1_5)), ((java.lang.Throwable)(null)));
    } catch (java.lang.Exception life1_14) {
        ((moom.LV)(this.b)).a(((java.lang.String)(this.a)), ((byte[])(null)), ((java.lang.Throwable)(life1_14)));
    }
    return;
}


public moom.LV a__LV() {
return this.b;
}


public java.lang.String a() {
return this.a;
}

}
