package moom;


class OC extends java.net.URLConnection {

net.minecraft.client.audio.SoundManager$2 a;

OC(net.minecraft.client.audio.SoundManager$2 p0, java.net.URL p1) { super((java.net.URL)null); }


private static void __sourceConstructorBody_a17b457d1838a2ec(moom.OC receiver, net.minecraft.client.audio.SoundManager$2 p0, java.net.URL p1) throws Throwable {

((moom.OC)(receiver)).a = ((net.minecraft.client.audio.SoundManager$2)(p0));

    moom.OC.__sourceConstructorInit_a17b457d1838a2ec_0(((moom.OC)(receiver)), ((java.net.URL)(p1)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_a17b457d1838a2ec_0(moom.OC a0, java.net.URL a1) throws E;

public void connect() throws java.io.IOException {
return;
}


public java.io.InputStream getInputStream() throws java.io.IOException {
return ((net.minecraft.client.resources.IResource)(((moom.oR)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__oR())).a__oQ(((moom.DD)(((net.minecraft.client.audio.SoundManager$2)(this.a)).a))))).a();
}

}
