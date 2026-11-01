package net.minecraft.client.renderer.texture;


public class TextureClock extends net.minecraft.client.renderer.texture.TextureAtlasSprite {

private double H;

private double I;

public TextureClock(java.lang.String p0) {
super(p0);
}


public void a__Void() {
net.minecraft.client.Minecraft life1_5;
    double life2_7;
    double life4_34;
    double life4_57;
    int life6_93;
    if ((!((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).isEmpty())) {
        life1_5 = net.minecraft.client.Minecraft.a__fM();
        life2_7 = 0x0.0p0d;
        if ((((net.minecraft.client.Minecraft)(life1_5)).I != null)) {
        if ((((net.minecraft.client.Minecraft)(life1_5)).K != null)) {
        life2_7 = ((double) ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(life1_5)).I)).b(((float)(0x1.0p0f))));
        if ((!((moom.EA)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(life1_5)).I)).v)).a__Boolean())) {
        life2_7 = java.lang.Math.random();
    }
    }
    }
        life4_34 = (life2_7 - this.H);
        loop_region_32: while ((life4_34 < -0x1.0p-1d)) {
        life4_34 = (life4_34 + 0x1.0p0d);
    }
        loop_region_41: while ((life4_34 >= 0x1.0p-1d)) {
        life4_34 = (life4_34 - 0x1.0p0d);
    }
        life4_57 = moom.Dr.a(((double)(life4_34)), ((double)(-0x1.0p0d)), ((double)(0x1.0p0d)));
        net.minecraft.client.renderer.texture.TextureClock __stackOp1500_13_0 = this;
        ((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_13_0)).I = ((double)((((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_13_0)).I + (life4_57 * 0x1.999999999999ap-4d))));
        net.minecraft.client.renderer.texture.TextureClock __stackOp1500_16_0 = this;
        ((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_16_0)).I = ((double)((((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_16_0)).I * 0x1.999999999999ap-1d)));
        net.minecraft.client.renderer.texture.TextureClock __stackOp1500_19_0 = this;
        ((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_19_0)).H = ((double)((((net.minecraft.client.renderer.texture.TextureClock)(__stackOp1500_19_0)).H + this.I)));
        life6_93 = (((int) ((this.H + 0x1.0p0d) * ((double) ((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).size()))) % ((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).size());
        loop_region_91: while ((life6_93 < 0)) {
        life6_93 = ((life6_93 + ((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).size()) % ((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).size());
    }
        if ((life6_93 != ((net.minecraft.client.renderer.texture.TextureClock)(this)).n)) {
        ((net.minecraft.client.renderer.texture.TextureClock)(this)).n = ((int)(life6_93));
        moom.ol.a(((int[][])(((int[][])(((java.util.List)(((net.minecraft.client.renderer.texture.TextureClock)(this)).b)).get(((int)(((net.minecraft.client.renderer.texture.TextureClock)(this)).n))))))), ((int)(((net.minecraft.client.renderer.texture.TextureClock)(this)).h)), ((int)(((net.minecraft.client.renderer.texture.TextureClock)(this)).i)), ((int)(((net.minecraft.client.renderer.texture.TextureClock)(this)).f)), ((int)(((net.minecraft.client.renderer.texture.TextureClock)(this)).g)), ((boolean)(false)), ((boolean)(false)));
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
