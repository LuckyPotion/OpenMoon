package net.minecraft.client.audio;


class SoundManager$2 extends java.net.URLStreamHandler {

moom.DD a;

SoundManager$2(moom.DD p0) { super(); }

private static void __sourceConstructorBody_5a4dd705f1b87bc8(net.minecraft.client.audio.SoundManager$2 receiver, moom.DD p0) throws Throwable {
((net.minecraft.client.audio.SoundManager$2)(receiver)).a = ((moom.DD)(p0));
    net.minecraft.client.audio.SoundManager$2.__sourceConstructorInit_5a4dd705f1b87bc8_0(((net.minecraft.client.audio.SoundManager$2)(receiver)));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_5a4dd705f1b87bc8_0(net.minecraft.client.audio.SoundManager$2 a0) throws E;

protected java.net.URLConnection openConnection(java.net.URL p0) {
return new moom.OC(this, p0);
}

}
