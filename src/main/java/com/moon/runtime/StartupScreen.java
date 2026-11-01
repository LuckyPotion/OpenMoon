package com.moon.runtime;

/** Initializes local components before handing control to the normal menu. */
public final class StartupScreen extends net.minecraft.client.gui.GuiScreen {
    public StartupScreen() { super(); LocalBootstrap.initialize(); }
    public void c__Void() {
        net.minecraft.client.Minecraft.a__fM().a(new net.minecraft.client.gui.GuiMainMenu());
    }
}
