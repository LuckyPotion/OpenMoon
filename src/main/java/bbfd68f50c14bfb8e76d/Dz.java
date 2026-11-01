package moom;


public class Dz extends moom.Dy<moom.DD, net.minecraft.client.audio.SoundEventAccessorComposite> {

private java.util.Map<moom.DD, net.minecraft.client.audio.SoundEventAccessorComposite> c;

public Dz() {
super();
}


public void a__Void() {
((java.util.Map)(this.c)).clear();
    return;
}


public void a(net.minecraft.client.audio.SoundEventAccessorComposite p0) {
((moom.Dz)(this)).a(((((net.minecraft.client.audio.SoundEventAccessorComposite)(p0)).a__DD())), ((p0)));
    return;
}


protected java.util.Map<moom.DD, net.minecraft.client.audio.SoundEventAccessorComposite> a() {
this.c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    return this.c;
}

}
