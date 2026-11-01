package com.moon.runtime;

/** Local startup; intentionally independent of the original native verifier. */
public final class LocalBootstrap {
    private static volatile boolean initialized;
    private LocalBootstrap() {}
    public static boolean isReady() { return initialized; }
    public static synchronized void initialize() {
        if (initialized) return;
        ClientContext context = ClientContext.getInstance();
        if (context == null || context.getEventBus() == null)
            throw new IllegalStateException("Client rendering context is not initialized");
        java.io.File directory = new java.io.File("OpenMoon");
        if (!directory.isDirectory() && !directory.mkdirs())
            throw new IllegalStateException("Cannot create OpenMoon directory");
        context.a(directory);
        context.a(new LocalClientProfile());
        context.a(java.util.concurrent.Executors.newFixedThreadPool(5));
        com.moon.o4.a__o4().a(new java.io.File(directory, "protocol"));
        context.a(new com.moon.fU());
        context.a(new com.moon.fW(directory.toPath()));
        context.a(new com.moon.de());
        context.a(new com.moon.cX());
        context.a(new com.moon.hO());
        context.a(new com.moon.dE());
        context.a(new com.moon.eV());
        context.a(new com.moon.ml());
        context.a(new com.moon.hI());
        context.a(new com.moon.nN());
        context.a(new com.moon.cs());
        context.a(new com.moon.ct(directory.toPath()));
        context.a(new com.moon.jK());
        context.a(new com.moon.hD());
        context.a(new com.moon.eY());
        context.a("OpenMoon");
        registerModules(context);
        context.a(new com.moon.g5((com.moon.module.impl.ESP) context.a__fU().a(com.moon.module.impl.ESP.class),
                                  (com.moon.module.impl.StorageEsp) context.a__fU().a(com.moon.module.impl.StorageEsp.class)));
        context.a(new com.moon.pe());
        context.a__de().a(new com.moon.c1("bind", "Bind a module key", new String[]{"b"}));
        context.a__de().a(new com.moon.c_("toggle", "Toggle a module", new String[]{"t"}));
        context.a__de().a(new com.moon.c3("config", "Manage local configurations", new String[]{"c", "conf"}));
        context.a__de().a(new com.moon.c4("friend", "Manage friends", new String[]{"f"}));
        context.a__de().a(new com.moon.c9("target", "Manage targets", new String[0]));
        context.a__de().a(new com.moon.c5("hide", "Change module visibility", new String[0]));
        context.a__de().a(new com.moon.c6("hclip", "Horizontal position offset", new String[0]));
        context.a__de().a(new com.moon.db("vclip", "Vertical position offset", new String[0]));
        context.a__de().a(new com.moon.c8("script", "Manage local scripts", new String[]{"s"}));
        context.a__de().a(new com.moon.c7("ign", "Copy the current player name", new String[0]));
        context.getEventBus().subscribe(new com.moon.dx(context.a__de().a()));
        context.getEventBus().subscribe(new com.moon.dy(context.a__de().a()));
        context.getEventBus().subscribe(new com.moon.n0());
        context.getEventBus().subscribe(context.a__g5());
        context.getEventBus().subscribe(context.a__nN());
        context.getEventBus().subscribe(context.a__hO());
        context.getEventBus().subscribe(context.a__eY());
        com.moon.module.impl.HUD hud = (com.moon.module.impl.HUD) context.a__fU().a(com.moon.module.impl.HUD.class);
        context.getEventBus().subscribe(new com.moon.hw(hud.aK, hud));
        context.a__hO().a();
        context.a__dE().a(directory);
        context.a__eV().a(directory);
        context.a__ml().a(directory);
        context.a__ct().a();
        context.a__jK().a(directory, true);
        LocalClientState.c = true;
        initialized = true;
        context.a__fW().a(context.a__fU().a__fV());
    }
    private static void registerModules(ClientContext context) {
        context.a__fU().a(new com.moon.module.impl.Animations("Animations", "Animations", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.AntiBlind("AntiBlind", "AntiBlind", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.AntiBot("AntiBot", "AntiBot", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.AntiFireball("AntiFireball", "AntiFireball", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.AntiResourceExploit("AntiResourceExploit", "AntiResourceExploit", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.AntiVoid("AntiVoid", "AntiVoid", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.AutoClicker("AutoClicker", "AutoClicker", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.AutoRespawn("AutoRespawn", "AutoRespawn", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.AutoTool("AutoTool", "AutoTool", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Backtrack("Backtrack", "Backtrack", "", com.moon.module.ModuleCategory.EXPLOIT));
        context.a__fU().a(new com.moon.module.impl.BedBreaker("BedBreaker", "BedBreaker", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Blink("Blink", "Blink", "", com.moon.module.ModuleCategory.EXPLOIT));
        context.a__fU().a(new com.moon.module.impl.Camera("Camera", "Camera", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Capes("Capes", "Capes", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.ChestStealer("ChestStealer", "ChestStealer", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.ClickGUI("ClickGUI", "ClickGUI", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Criticals("Criticals", "Criticals", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.CustomMinecraft("CustomMinecraft", "CustomMinecraft", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Disabler("Disabler", "Disabler", "", com.moon.module.ModuleCategory.EXPLOIT));
        context.a__fU().a(new com.moon.module.impl.ESP("ESP", "ESP", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Effects("Effects", "Effects", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.FastPlace("FastPlace", "FastPlace", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Flight("Flight", "Flight", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.FullBright("FullBright", "FullBright", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Glint("Glint", "Glint", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.GuiMove("GuiMove", "GuiMove", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.HUD("HUD", "HUD", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.HitBox("HitBox", "HitBox", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.InventoryManager("InventoryManager", "InventoryManager", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.KillAura("KillAura", "KillAura", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.LongJump("LongJump", "LongJump", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.MiddleClickFriends("MiddleClickFriends", "MiddleClickFriends", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.ModelModifier("ModelModifier", "ModelModifier", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Nametags("Nametags", "Nametags", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.NoFall("NoFall", "NoFall", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.NoJumpDelay("NoJumpDelay", "NoJumpDelay", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.NoRotate("NoRotate", "NoRotate", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.NoSlowDown("NoSlowDown", "NoSlowDown", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.PacketSniffer("PacketSniffer", "PacketSniffer", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.PingSpoof("PingSpoof", "PingSpoof", "", com.moon.module.ModuleCategory.EXPLOIT));
        context.a__fU().a(new com.moon.module.impl.Pointers("Pointers", "Pointers", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Reach("Reach", "Reach", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.RichPresence("RichPresence", "RichPresence", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.SafeWalk("SafeWalk", "SafeWalk", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.ScaffoldWalk("ScaffoldWalk", "ScaffoldWalk", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.SessionInformation("SessionInformation", "SessionInformation", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Speed("Speed", "Speed", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.SpeedMine("SpeedMine", "SpeedMine", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Spider("Spider", "Spider", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.Sprint("Sprint", "Sprint", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.Step("Step", "Step", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.StorageEsp("StorageEsp", "StorageEsp", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.TargetHud("TargetHud", "TargetHud", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.TargetStrafe("TargetStrafe", "TargetStrafe", "", com.moon.module.ModuleCategory.MOVEMENT));
        context.a__fU().a(new com.moon.module.impl.Teams("Teams", "Teams", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.ThePit("ThePit", "ThePit", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Tickbase("Tickbase", "Tickbase", "", com.moon.module.ModuleCategory.EXPLOIT));
        context.a__fU().a(new com.moon.module.impl.TimeChanger("TimeChanger", "TimeChanger", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Timer("Timer", "Timer", "", com.moon.module.ModuleCategory.PLAYER));
        context.a__fU().a(new com.moon.module.impl.Trajectories("Trajectories", "Trajectories", "", com.moon.module.ModuleCategory.VISUAL));
        context.a__fU().a(new com.moon.module.impl.Velocity("Velocity", "Velocity", "", com.moon.module.ModuleCategory.COMBAT));
        context.a__fU().a(new com.moon.module.impl.WTap("WTap", "WTap", "", com.moon.module.ModuleCategory.COMBAT));
        com.moon.module.impl.HUD hud = (com.moon.module.impl.HUD) context.a__fU().a(com.moon.module.impl.HUD.class);
        for (Object value : context.a__fU().a().values()) {
            com.moon.module.Module module = (com.moon.module.Module) value;
            ((com.moon.module.SettingOwner) module).discoverSettings();
            context.a__cX().a(module);
            if (((com.moon.module.SettingOwner) module).getSetting("individual-module-color") == null)
                ((com.moon.module.SettingOwner) module).getSettings().add(com.moon.setting.ColorSetting.builder("individual-module-color")
                    .a("Arraylist Color", -1).a(new com.moon.gR(hud))
                    .a(new com.moon.gQ(hud, hud.a__hq())).a());
        }
        com.moon.module.Module click = context.a__fU().a(com.moon.module.impl.ClickGUI.class);
        click.setKeyCode(54).setPressType(com.moon.module.PressType.PRESS)
            .setInputSource(com.moon.module.InputSource.KEYBOARD);
    }
}
