package net.minecraft.scoreboard;


public class GoalColor implements net.minecraft.scoreboard.IScoreObjectiveCriteria {

private final java.lang.String j;

public GoalColor(java.lang.String p0, net.minecraft.util.EnumChatFormatting p1) {
super();
    this.j = ((java.lang.String)(__sourceIntrinsic_9698165887ca_originalDynamicSite5624_1(p0, ((net.minecraft.util.EnumChatFormatting)(p1)).a__String())));
    ((java.util.Map)(net.minecraft.scoreboard.IScoreObjectiveCriteria.a)).put(((java.lang.Object)(this.j)), ((java.lang.Object)(this)));
    return;
}


public moom.bn a__bn() {
return moom.bn.INTEGER;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public int a(java.util.List<net.minecraft.entity.player.EntityPlayer> p0) {
return 0;
}


public java.lang.String a() {
return this.j;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9698165887ca_originalDynamicSite5624_1(java.lang.String a0, java.lang.String a1) throws E;
}
