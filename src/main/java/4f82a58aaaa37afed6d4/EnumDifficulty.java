package net.minecraft.world;


public class EnumDifficulty extends sourcebuild.EnumConstructor<net.minecraft.world.EnumDifficulty> {

public static net.minecraft.world.EnumDifficulty PEACEFUL;

public static net.minecraft.world.EnumDifficulty EASY;

public static net.minecraft.world.EnumDifficulty NORMAL;

public static net.minecraft.world.EnumDifficulty HARD;

private static net.minecraft.world.EnumDifficulty[] a;

private int b;

private java.lang.String c;

private static net.minecraft.world.EnumDifficulty[] d;

private EnumDifficulty(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
net.minecraft.world.EnumDifficulty[] life0_39;
    int life1_42;
    int life2_44;
    net.minecraft.world.EnumDifficulty life3_51;
    PEACEFUL = ((net.minecraft.world.EnumDifficulty)(new net.minecraft.world.EnumDifficulty("PEACEFUL", 0, 0, "options.difficulty.peaceful")));
    EASY = ((net.minecraft.world.EnumDifficulty)(new net.minecraft.world.EnumDifficulty("EASY", 1, 1, "options.difficulty.easy")));
    NORMAL = ((net.minecraft.world.EnumDifficulty)(new net.minecraft.world.EnumDifficulty("NORMAL", 2, 2, "options.difficulty.normal")));
    HARD = ((net.minecraft.world.EnumDifficulty)(new net.minecraft.world.EnumDifficulty("HARD", 3, 3, "options.difficulty.hard")));
    d = ((net.minecraft.world.EnumDifficulty[])(net.minecraft.world.EnumDifficulty.a__ArraybB()));
    a = ((net.minecraft.world.EnumDifficulty[])(new net.minecraft.world.EnumDifficulty[(net.minecraft.world.EnumDifficulty.values()).length]));
    life0_39 = net.minecraft.world.EnumDifficulty.values();
    life1_42 = (life0_39).length;
    life2_44 = 0;
    loop_region_45: while ((life2_44 < life1_42)) {
        life3_51 = (life0_39)[life2_44];
        (net.minecraft.world.EnumDifficulty.a)[((net.minecraft.world.EnumDifficulty)(life3_51)).b] = life3_51;
        life2_44 += 1;
    }
}


public static net.minecraft.world.EnumDifficulty[] values() {
return ((net.minecraft.world.EnumDifficulty[])(((net.minecraft.world.EnumDifficulty[])(net.minecraft.world.EnumDifficulty.d)).clone()));
}


public static net.minecraft.world.EnumDifficulty valueOf(java.lang.String p0) {
return ((net.minecraft.world.EnumDifficulty)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.world.EnumDifficulty.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.world.EnumDifficulty a(int p0) {
return (net.minecraft.world.EnumDifficulty.a)[(p0 % (net.minecraft.world.EnumDifficulty.a).length)];
}


private static net.minecraft.world.EnumDifficulty[] a__ArraybB() {
return new net.minecraft.world.EnumDifficulty[] {net.minecraft.world.EnumDifficulty.PEACEFUL, net.minecraft.world.EnumDifficulty.EASY, net.minecraft.world.EnumDifficulty.NORMAL, net.minecraft.world.EnumDifficulty.HARD};
}


public java.lang.String a__String() {
return this.c;
}


public int a() {
return this.b;
}

}
