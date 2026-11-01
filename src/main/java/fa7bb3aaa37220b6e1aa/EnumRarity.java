package net.minecraft.item;


public class EnumRarity extends sourcebuild.EnumConstructor<net.minecraft.item.EnumRarity> {

public static net.minecraft.item.EnumRarity COMMON;

public static net.minecraft.item.EnumRarity UNCOMMON;

public static net.minecraft.item.EnumRarity RARE;

public static net.minecraft.item.EnumRarity EPIC;

public net.minecraft.util.EnumChatFormatting rarityColor;

public java.lang.String rarityName;

private static net.minecraft.item.EnumRarity[] a;

private EnumRarity(java.lang.String p0, int p1, net.minecraft.util.EnumChatFormatting p2, java.lang.String p3) {
super(p0, p1);

    this.rarityColor = p2;
    this.rarityName = p3;
}


private static void initialize() {
COMMON = ((net.minecraft.item.EnumRarity)(new net.minecraft.item.EnumRarity("COMMON", 0, net.minecraft.util.EnumChatFormatting.WHITE, "Common")));
    UNCOMMON = ((net.minecraft.item.EnumRarity)(new net.minecraft.item.EnumRarity("UNCOMMON", 1, net.minecraft.util.EnumChatFormatting.YELLOW, "Uncommon")));
    RARE = ((net.minecraft.item.EnumRarity)(new net.minecraft.item.EnumRarity("RARE", 2, net.minecraft.util.EnumChatFormatting.AQUA, "Rare")));
    EPIC = ((net.minecraft.item.EnumRarity)(new net.minecraft.item.EnumRarity("EPIC", 3, net.minecraft.util.EnumChatFormatting.LIGHT_PURPLE, "Epic")));
    a = ((net.minecraft.item.EnumRarity[])(net.minecraft.item.EnumRarity.a()));
}


public static net.minecraft.item.EnumRarity[] values() {
return ((net.minecraft.item.EnumRarity[])(((net.minecraft.item.EnumRarity[])(net.minecraft.item.EnumRarity.a)).clone()));
}


public static net.minecraft.item.EnumRarity valueOf(java.lang.String p0) {
return ((net.minecraft.item.EnumRarity)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.item.EnumRarity.class)), ((java.lang.String)(p0)))));
}


private static net.minecraft.item.EnumRarity[] a() {
return new net.minecraft.item.EnumRarity[] {net.minecraft.item.EnumRarity.COMMON, net.minecraft.item.EnumRarity.UNCOMMON, net.minecraft.item.EnumRarity.RARE, net.minecraft.item.EnumRarity.EPIC};
}

}
