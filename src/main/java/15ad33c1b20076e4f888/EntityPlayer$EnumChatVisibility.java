package net.minecraft.entity.player;


public class EntityPlayer$EnumChatVisibility extends sourcebuild.EnumConstructor<net.minecraft.entity.player.EntityPlayer$EnumChatVisibility> {

public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility FULL;

public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility SYSTEM;

public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility HIDDEN;

private static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] a;

private int b;

private java.lang.String c;

private static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] d;

private EntityPlayer$EnumChatVisibility(java.lang.String p0, int p1, int p2, java.lang.String p3) {
super(p0, p1);
    this.b = p2;
    this.c = p3;
}


private static void initialize() {
net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] life0_31;
    int life1_34;
    int life2_36;
    net.minecraft.entity.player.EntityPlayer$EnumChatVisibility life3_43;
    FULL = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(new net.minecraft.entity.player.EntityPlayer$EnumChatVisibility("FULL", 0, 0, "options.chat.visibility.full")));
    SYSTEM = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(new net.minecraft.entity.player.EntityPlayer$EnumChatVisibility("SYSTEM", 1, 1, "options.chat.visibility.system")));
    HIDDEN = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(new net.minecraft.entity.player.EntityPlayer$EnumChatVisibility("HIDDEN", 2, 2, "options.chat.visibility.hidden")));
    d = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[])(net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.a__ArrayaW()));
    a = ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[])(new net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[(net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.values()).length]));
    life0_31 = net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.values();
    life1_34 = (life0_31).length;
    life2_36 = 0;
    loop_region_37: while ((life2_36 < life1_34)) {
        life3_43 = (life0_31)[life2_36];
        (net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.a)[((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(life3_43)).b] = life3_43;
        life2_36 += 1;
    }
}


public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] values() {
return ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[])(((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[])(net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.d)).clone()));
}


public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility valueOf(java.lang.String p0) {
return ((net.minecraft.entity.player.EntityPlayer$EnumChatVisibility)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.class)), ((java.lang.String)(p0)))));
}


public static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility a(int p0) {
return (net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.a)[(p0 % (net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.a).length)];
}


private static net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] a__ArrayaW() {
return new net.minecraft.entity.player.EntityPlayer$EnumChatVisibility[] {net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.FULL, net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.SYSTEM, net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.HIDDEN};
}


public java.lang.String a__String() {
return this.c;
}


public int a() {
return this.b;
}

}
