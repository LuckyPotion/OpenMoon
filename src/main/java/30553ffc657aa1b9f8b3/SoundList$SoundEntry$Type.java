package net.minecraft.client.audio;


public class SoundList$SoundEntry$Type extends sourcebuild.EnumConstructor<net.minecraft.client.audio.SoundList$SoundEntry$Type> {

public static net.minecraft.client.audio.SoundList$SoundEntry$Type FILE;

public static net.minecraft.client.audio.SoundList$SoundEntry$Type SOUND_EVENT;

private java.lang.String a;

private static net.minecraft.client.audio.SoundList$SoundEntry$Type[] b;

private static long c;

private SoundList$SoundEntry$Type(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
c = ((long)(((moom._a)(moom._c.a(((long)(1033972784118226124L)), ((long)(4150523551949533437L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(4206135027358L)))));
    FILE = ((net.minecraft.client.audio.SoundList$SoundEntry$Type)(new net.minecraft.client.audio.SoundList$SoundEntry$Type("FILE", 0, "file")));
    SOUND_EVENT = ((net.minecraft.client.audio.SoundList$SoundEntry$Type)(new net.minecraft.client.audio.SoundList$SoundEntry$Type("SOUND_EVENT", 1, "event")));
    b = ((net.minecraft.client.audio.SoundList$SoundEntry$Type[])(net.minecraft.client.audio.SoundList$SoundEntry$Type.a()));
}


public static net.minecraft.client.audio.SoundList$SoundEntry$Type[] values() {
return ((net.minecraft.client.audio.SoundList$SoundEntry$Type[])(((net.minecraft.client.audio.SoundList$SoundEntry$Type[])(net.minecraft.client.audio.SoundList$SoundEntry$Type.b)).clone()));
}


public static net.minecraft.client.audio.SoundList$SoundEntry$Type valueOf(java.lang.String p0) {
return ((net.minecraft.client.audio.SoundList$SoundEntry$Type)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.audio.SoundList$SoundEntry$Type.class)), ((java.lang.String)(p0)))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static net.minecraft.client.audio.SoundList$SoundEntry$Type[] a() {
return new net.minecraft.client.audio.SoundList$SoundEntry$Type[] {net.minecraft.client.audio.SoundList$SoundEntry$Type.FILE, net.minecraft.client.audio.SoundList$SoundEntry$Type.SOUND_EVENT};
}


public static net.minecraft.client.audio.SoundList$SoundEntry$Type a(java.lang.String p0) {
java.lang.String spill1473_0;
    long life1_3;
    net.minecraft.client.audio.SoundList$SoundEntry$Type[] life4_6;
    java.lang.String life3_7;
    int life5_10;
    int life6_12;
    net.minecraft.client.audio.SoundList$SoundEntry$Type life7_19;
    lexical_join_32: {
    life1_3 = (net.minecraft.client.audio.SoundList$SoundEntry$Type.c ^ 36799136605048L);
    spill1473_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_6 = net.minecraft.client.audio.SoundList$SoundEntry$Type.values();
    life3_7 = spill1473_0;
    life5_10 = (life4_6).length;
    life6_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_30: {
    lexical_join_29: {
    if (!((life6_12 < life5_10))) {
        break lexical_join_32;
    }
    life7_19 = (life4_6)[life6_12];
    if (!((life3_7 == null))) {
        break lexical_join_30;
    }
    if (!(((java.lang.String)(((net.minecraft.client.audio.SoundList$SoundEntry$Type)(life7_19)).a)).equals(((java.lang.Object)(p0))))) {
        break lexical_join_29;
    }
    return life7_19;
    }
    life6_12 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return null;
}

}
