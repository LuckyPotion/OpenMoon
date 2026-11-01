package net.minecraft.scoreboard;

import com.google.common.collect.Maps;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Map;
import moom.Be;
import moom._c;
import moom.bn;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumChatFormatting;

/** Source carrier: initialize is compiled in the final owner and adapted to interface clinit. */

public interface IScoreObjectiveCriteria {
public static final java.util.Map a = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria b = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria c = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria d = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria e = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria f = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria g = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria[] h = null;
public static final net.minecraft.scoreboard.IScoreObjectiveCriteria[] i = null;
public java.lang.String a();
public moom.bn a__bn();
public boolean a__Boolean();
public int a(java.util.List<net.minecraft.entity.player.EntityPlayer> p0);
}
abstract class __SourceInterface_IScoreObjectiveCriteria  implements net.minecraft.scoreboard.IScoreObjectiveCriteria {
    public static Map<String, IScoreObjectiveCriteria> a;
    public static IScoreObjectiveCriteria b;
    public static IScoreObjectiveCriteria c;
    public static IScoreObjectiveCriteria d;
    public static IScoreObjectiveCriteria e;
    public static IScoreObjectiveCriteria f;
    public static IScoreObjectiveCriteria g;
    public static IScoreObjectiveCriteria[] h;
    public static IScoreObjectiveCriteria[] i;

    private static void initialize() {

        // This unused value preserves the original key-runtime initialization side effects.
        long initializationSeed = _c.a(622937511615351808L, 1160510559329318092L, MethodHandles.lookup().lookupClass()).a(48571019609567L) ^ 137986059957190L;

        a = Maps.newHashMap();
        b = new ScoreDummyCriteria("dummy");
        c = new ScoreDummyCriteria("trigger");
        d = new ScoreDummyCriteria("deathCount");
        e = new ScoreDummyCriteria("playerKillCount");
        f = new ScoreDummyCriteria("totalKillCount");
        g = new Be("health");
        h = new IScoreObjectiveCriteria[]{
            new GoalColor("teamkill.", EnumChatFormatting.BLACK),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_BLUE),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_GREEN),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_AQUA),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_RED),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_PURPLE),
            new GoalColor("teamkill.", EnumChatFormatting.GOLD),
            new GoalColor("teamkill.", EnumChatFormatting.GRAY),
            new GoalColor("teamkill.", EnumChatFormatting.DARK_GRAY),
            new GoalColor("teamkill.", EnumChatFormatting.BLUE),
            new GoalColor("teamkill.", EnumChatFormatting.GREEN),
            new GoalColor("teamkill.", EnumChatFormatting.AQUA),
            new GoalColor("teamkill.", EnumChatFormatting.RED),
            new GoalColor("teamkill.", EnumChatFormatting.LIGHT_PURPLE),
            new GoalColor("teamkill.", EnumChatFormatting.YELLOW),
            new GoalColor("teamkill.", EnumChatFormatting.WHITE)
        };
        i = new IScoreObjectiveCriteria[]{
            new GoalColor("killedByTeam.", EnumChatFormatting.BLACK),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_BLUE),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_GREEN),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_AQUA),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_RED),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_PURPLE),
            new GoalColor("killedByTeam.", EnumChatFormatting.GOLD),
            new GoalColor("killedByTeam.", EnumChatFormatting.GRAY),
            new GoalColor("killedByTeam.", EnumChatFormatting.DARK_GRAY),
            new GoalColor("killedByTeam.", EnumChatFormatting.BLUE),
            new GoalColor("killedByTeam.", EnumChatFormatting.GREEN),
            new GoalColor("killedByTeam.", EnumChatFormatting.AQUA),
            new GoalColor("killedByTeam.", EnumChatFormatting.RED),
            new GoalColor("killedByTeam.", EnumChatFormatting.LIGHT_PURPLE),
            new GoalColor("killedByTeam.", EnumChatFormatting.YELLOW),
            new GoalColor("killedByTeam.", EnumChatFormatting.WHITE)
        };
    }


    public abstract String a();

    public abstract bn a__bn();

    public abstract boolean a__Boolean();

    public abstract int a(List<EntityPlayer> var1);


}
