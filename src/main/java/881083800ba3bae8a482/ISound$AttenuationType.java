package net.minecraft.client.audio;


public class ISound$AttenuationType extends sourcebuild.EnumConstructor<net.minecraft.client.audio.ISound$AttenuationType> {

public static net.minecraft.client.audio.ISound$AttenuationType NONE;

public static net.minecraft.client.audio.ISound$AttenuationType LINEAR;

private int a;

private static net.minecraft.client.audio.ISound$AttenuationType[] b;

private ISound$AttenuationType(java.lang.String p0, int p1, int p2) {
super(p0, p1);

    this.a = p2;
}


private static void initialize() {
NONE = ((net.minecraft.client.audio.ISound$AttenuationType)(new net.minecraft.client.audio.ISound$AttenuationType("NONE", 0, 0)));
    LINEAR = ((net.minecraft.client.audio.ISound$AttenuationType)(new net.minecraft.client.audio.ISound$AttenuationType("LINEAR", 1, 2)));
    b = ((net.minecraft.client.audio.ISound$AttenuationType[])(net.minecraft.client.audio.ISound$AttenuationType.a__Arrayau()));
}


public static net.minecraft.client.audio.ISound$AttenuationType[] values() {
return ((net.minecraft.client.audio.ISound$AttenuationType[])(((net.minecraft.client.audio.ISound$AttenuationType[])(net.minecraft.client.audio.ISound$AttenuationType.b)).clone()));
}


public static net.minecraft.client.audio.ISound$AttenuationType valueOf(java.lang.String p0) {
return ((net.minecraft.client.audio.ISound$AttenuationType)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.audio.ISound$AttenuationType.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.client.audio.ISound$AttenuationType[] a__Arrayau() {
return new net.minecraft.client.audio.ISound$AttenuationType[] {net.minecraft.client.audio.ISound$AttenuationType.NONE, net.minecraft.client.audio.ISound$AttenuationType.LINEAR};
}


public int a() {
return this.a;
}

}
