package net.minecraft.client.renderer.texture;


public class TextureCompass extends net.minecraft.client.renderer.texture.TextureAtlasSprite {

public double H;

public double I;

public static java.lang.String J;

public TextureCompass(java.lang.String p0) {
super(p0);
    net.minecraft.client.renderer.texture.TextureCompass.J = p0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.world.World p0, double p1, double p2, double p3, boolean p4, boolean p5) {
double life10_5;
    moom.DT life12_15;
    double life13_21;
    double life15_27;
    double life6_31;
    double life12_67;
    double life12_90;
    int life12_128;
    if ((!((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).isEmpty())) {
        life10_5 = 0x0.0p0d;
        if ((p0 != null)) {
        if ((!p4)) {
        life12_15 = ((net.minecraft.world.World)(p0)).a__DT();
        life13_21 = (((double) ((moom.DT)(life12_15)).a()) - p1);
        life15_27 = (((double) ((moom.DT)(life12_15)).c()) - p2);
        life6_31 = (p3 % 0x1.68p8d);
        life10_5 = (-((((life6_31 - 0x1.68p6d) * 0x1.921fb54442d18p1d) / 0x1.68p7d) - java.lang.Math.atan2(((double)(life15_27)), ((double)(life13_21)))));
        if ((!((moom.EA)(((net.minecraft.world.World)(p0)).v)).a__Boolean())) {
        life10_5 = ((java.lang.Math.random() * 0x1.921fb54442d18p1d) * 0x1.0p1d);
    }
    }
    }
        if (p5) {
        this.H = ((double)(life10_5));
    } else {
        life12_67 = (life10_5 - this.H);
        loop_region_63: while ((life12_67 < -0x1.921fb54442d18p1d)) {
        life12_67 = (life12_67 + 0x1.921fb54442d18p2d);
    }
        loop_region_72: while ((life12_67 >= 0x1.921fb54442d18p1d)) {
        life12_67 = (life12_67 - 0x1.921fb54442d18p2d);
    }
        life12_90 = moom.Dr.a(((double)(life12_67)), ((double)(-0x1.0p0d)), ((double)(0x1.0p0d)));
        net.minecraft.client.renderer.texture.TextureCompass __stackOp1501_12_0 = this;
        ((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_12_0)).I = ((double)((((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_12_0)).I + (life12_90 * 0x1.999999999999ap-4d))));
        net.minecraft.client.renderer.texture.TextureCompass __stackOp1501_15_0 = this;
        ((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_15_0)).I = ((double)((((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_15_0)).I * 0x1.999999999999ap-1d)));
        net.minecraft.client.renderer.texture.TextureCompass __stackOp1501_18_0 = this;
        ((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_18_0)).H = ((double)((((net.minecraft.client.renderer.texture.TextureCompass)(__stackOp1501_18_0)).H + this.I)));
    }
        life12_128 = (((int) (((this.H / 0x1.921fb54442d18p2d) + 0x1.0p0d) * ((double) ((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).size()))) % ((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).size());
        loop_region_124: while ((life12_128 < 0)) {
        life12_128 = ((life12_128 + ((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).size()) % ((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).size());
    }
        if ((life12_128 != ((net.minecraft.client.renderer.texture.TextureCompass)(this)).n)) {
        ((net.minecraft.client.renderer.texture.TextureCompass)(this)).n = ((int)(life12_128));
        moom.ol.a(((int[][])(((int[][])(((java.util.List)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).b)).get(((int)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).n))))))), ((int)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).h)), ((int)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).i)), ((int)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).f)), ((int)(((net.minecraft.client.renderer.texture.TextureCompass)(this)).g)), ((boolean)(false)), ((boolean)(false)));
    }
    }
    return;
}


public void a__Void() {
net.minecraft.client.Minecraft life1_1;
    forward_join_33: {
    forward_join_25: {
    life1_1 = net.minecraft.client.Minecraft.a__fM();
    if (!((((net.minecraft.client.Minecraft)(life1_1)).I != null))) { break forward_join_25; }
    if (!((((net.minecraft.client.Minecraft)(life1_1)).K != null))) { break forward_join_25; }
    ((net.minecraft.client.renderer.texture.TextureCompass)(this)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(life1_1)).I)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(life1_1)).K)).n)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(life1_1)).K)).p)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(life1_1)).K)).w))), ((boolean)(false)), ((boolean)(false)));
    break forward_join_33;
    }
    ((net.minecraft.client.renderer.texture.TextureCompass)(this)).a(((net.minecraft.world.World)(null)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((boolean)(true)), ((boolean)(false)));
    }
    return;
}

}
