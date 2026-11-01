package net.minecraft.client.audio;


public class SoundEventAccessor implements net.minecraft.client.audio.ISoundEventAccessor<net.minecraft.client.audio.SoundPoolEntry> {

private final net.minecraft.client.audio.SoundPoolEntry a;

private final int b;

SoundEventAccessor(net.minecraft.client.audio.SoundPoolEntry p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


public net.minecraft.client.audio.SoundPoolEntry a__Object() {
return ((net.minecraft.client.audio.SoundEventAccessor)(this)).a__f9();
}


public net.minecraft.client.audio.SoundPoolEntry a__f9() {
return new net.minecraft.client.audio.SoundPoolEntry(this.a);
}


public int a() {
return this.b;
}

}
