package moom;


public class tp extends moom.to {

private boolean cm;

private int cn;

private double co;

private double cp;

private double cq;

private double cr;

private double cs;

private static final long eb;

public tp(net.minecraft.world.World p0, com.mojang.authlib.GameProfile p1) {
super(p0, p1);
    this.P = 0x0.0p+0f;
    this.Q = true;
    this.bW = 0x1.0000000000000p-2f;
    this.d = 0x1.4000000000000p+3d;
}


static {
eb = (moom._c.a(-2517626030597318101L, 3848165576597846945L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(98280419901056L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(int p0, net.minecraft.item.ItemStack p1) {
long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_28: {
    forward_join_20: {
    forward_join_18: {
    life3_3 = (moom.tp.eb ^ 34095074282135L);
    life5_5 = moom.hg.b();
    if (!((life5_5 != null))) { break forward_join_18; }
    if (!((p0 == 0))) { break forward_join_20; }
    (((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).c] = p1;
    }
    if (!((life5_5 == null))) { break forward_join_28; }
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).b)[(p0 - 1)] = p1;
    }
    return;
}


public void a(double p0, double p1, double p2, float p3, float p4, int p5, boolean p6) {
this.co = ((double)(p0));
    this.cp = ((double)(p1));
    this.cq = ((double)(p2));
    this.cr = ((double)(((double) p3)));
    this.cs = ((double)(((double) p4)));
    this.cn = ((int)(p5));
    return;
}


public moom.DT a__DT() {
return new moom.DT((((moom.tp)(this)).n + 0x1.0p-1d), (((moom.tp)(this)).o + 0x1.0p-1d), (((moom.tp)(this)).p + 0x1.0p-1d));
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
return ((1) != 0);
}


public boolean a(int p0, java.lang.String p1) {
return ((0) != 0);
}


public void a(net.minecraft.util.IChatComponent p0) {
((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).T)).a__gB())).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


public void g__Void() {
int forwardValue4097_66_0;
    moom.tp forwardValue4097_111_0;
    int forwardValue4097_112_0;
    int forwardValue4097_119_0;
    moom.tp forwardValue4097_123_0;
    net.minecraft.entity.Entity[] spill4097_0;
    int spill4097_1;
    boolean spill4097_2;
    moom.tp spill4097_3;
    moom.tp spill4097_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_10;
    double life4_20;
    double life6_26;
    float life8_37;
    net.minecraft.item.ItemStack life9_109;
    forward_join_125: {
    forward_join_123: {
    forward_join_119: {
    forward_join_112: {
    forward_join_111: {
    forward_join_110: {
    forward_join_66: {
    forward_join_46: {
    life1_3 = (moom.tp.eb ^ 105954555053585L);
    spill4097_0 = moom.hg.b();
    ((moom.tp)(this)).bW = ((float)(0x0.0p0f));
    super.g__Void();
    life3_10 = spill4097_0;
    ((moom.tp)(this)).aU = ((float)(((moom.tp)(this)).aV));
    life4_20 = (((moom.tp)(this)).n - ((moom.tp)(this)).k);
    life6_26 = (((moom.tp)(this)).p - ((moom.tp)(this)).m);
    life8_37 = (moom.Dr.a__Float(((double)(((life4_20 * life4_20) + (life6_26 * life6_26))))) * 0x1.0p2f);
    spill4097_1 = recovery.source.CarrierOps.fcmpl(((float)(life8_37)), ((float)(0x1.0p0f)));
    if (!((life3_10 != null))) {
        forwardValue4097_66_0 = spill4097_1;
        break forward_join_66;
    }
    if (!((spill4097_1 > 0))) {
        break forward_join_46;
    }
    life8_37 = 0x1.0p0f;
    }
    moom.tp __stackOp4097_12_0 = this;
    ((moom.tp)(__stackOp4097_12_0)).aV = ((float)((((moom.tp)(__stackOp4097_12_0)).aV + ((life8_37 - ((moom.tp)(this)).aV) * 0x1.99999ap-2f))));
    moom.tp __stackOp4097_16_0 = this;
    ((moom.tp)(__stackOp4097_16_0)).aW = ((float)((((moom.tp)(__stackOp4097_16_0)).aW + ((moom.tp)(this)).aV)));
    forwardValue4097_66_0 = ((this.cm) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forwardValue4097_112_0 = forwardValue4097_66_0;
        break forward_join_112;
    }
    if (!((forwardValue4097_66_0 == 0))) {
        break forward_join_110;
    }
    spill4097_2 = ((moom.tp)(this)).w();
    if (!((life3_10 != null))) {
        forwardValue4097_112_0 = ((spill4097_2) ? 1 : 0);
        break forward_join_112;
    }
    if (!(spill4097_2)) {
        break forward_join_110;
    }
    spill4097_3 = this;
    if (!((life3_10 != null))) {
        forwardValue4097_111_0 = spill4097_3;
        break forward_join_111;
    }
    if (!(((((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(spill4097_3)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).c] != null))) {
        break forward_join_110;
    }
    life9_109 = (((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).c];
    ((moom.tp)(this)).b(((net.minecraft.item.ItemStack)((((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((moom.tp)(this)).bD)).c])), ((int)(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life9_109)).a__wQ())).a__Int(((net.minecraft.item.ItemStack)(life9_109))))));
    this.cm = ((boolean)(true));
    if (!((life3_10 == null))) {
        break forward_join_125;
    }
    }
    forwardValue4097_111_0 = this;
    }
    forwardValue4097_112_0 = ((((moom.tp)(forwardValue4097_111_0)).cm) ? 1 : 0);
    }
    if (!((life3_10 != null))) {
        forwardValue4097_119_0 = forwardValue4097_112_0;
        break forward_join_119;
    }
    if (!((forwardValue4097_112_0 != 0))) {
        break forward_join_125;
    }
    spill4097_4 = this;
    if (!((life3_10 != null))) {
        forwardValue4097_123_0 = spill4097_4;
        break forward_join_123;
    }
    forwardValue4097_119_0 = ((((moom.tp)(spill4097_4)).w()) ? 1 : 0);
    }
    if (!((forwardValue4097_119_0 == 0))) {
        break forward_join_125;
    }
    ((moom.tp)(this)).O();
    forwardValue4097_123_0 = this;
    }
    ((moom.tp)(forwardValue4097_123_0)).cm = ((boolean)(false));
    }
    return;
}


public void G() {
moom.tp lexicalValue1323_134_0;
    int lexicalValue1323_166_0;
    int lexicalValue1323_173_0;
    int lexicalValue1323_180_0;
    int lexicalValue1323_189_0;
    moom.tp lexicalValue1323_204_0;
    moom.tp spill1323_0;
    int spill1323_1;
    moom.tp spill1323_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    double life4_26;
    double life6_39;
    double life8_52;
    double life10_59;
    float life4_154;
    float life5_164;
    lexical_join_219: {
    lexical_join_204: {
    lexical_join_192: {
    lexical_join_190: {
    lexical_join_189: {
    lexical_join_180: {
    lexical_join_178: {
    lexical_join_176: {
    lexical_join_173: {
    lexical_join_166: {
    lexical_join_164: {
    lexical_join_134: {
    lexical_join_127: {
    lexical_join_121: {
    lexical_join_81: {
    lexical_join_69: {
    life1_3 = (moom.tp.eb ^ 46699144266605L);
    life3_5 = moom.hg.b();
    spill1323_0 = this;
    if (!((life3_5 != null))) {
        lexicalValue1323_134_0 = spill1323_0;
        break lexical_join_134;
    }
    if (!((((moom.tp)(spill1323_0)).cn > 0))) {
        break lexical_join_127;
    }
    life4_26 = (((moom.tp)(this)).n + ((this.co - ((moom.tp)(this)).n) / ((double) this.cn)));
    life6_39 = (((moom.tp)(this)).o + ((this.cp - ((moom.tp)(this)).o) / ((double) this.cn)));
    life8_52 = (((moom.tp)(this)).p + ((this.cq - ((moom.tp)(this)).p) / ((double) this.cn)));
    life10_59 = (this.cr - ((double) ((moom.tp)(this)).w));
    lexical_cycle_57: while (true) {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life10_59)), ((double)(-0x1.68p7d))) < 0))) {
        break lexical_join_69;
    }
    life10_59 = (life10_59 + 0x1.68p8d);
    if (!((life3_5 != null))) {
        break lexical_join_121;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    lexical_cycle_69: while (true) {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life10_59)), ((double)(0x1.68p7d))) >= 0))) {
        break lexical_join_81;
    }
    life10_59 = (life10_59 - 0x1.68p8d);
    if (!((life3_5 != null))) {
        break lexical_join_121;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_69; }
    break lexical_cycle_69;
    }
    }
    ((moom.tp)(this)).w = ((float)(((float) (((double) ((moom.tp)(this)).w) + (life10_59 / ((double) this.cn))))));
    ((moom.tp)(this)).x = ((float)(((float) (((double) ((moom.tp)(this)).x) + ((this.cs - ((double) ((moom.tp)(this)).x)) / ((double) this.cn))))));
    moom.tp __stackOp1323_27_0 = this;
    ((moom.tp)(__stackOp1323_27_0)).cn = ((int)((((moom.tp)(__stackOp1323_27_0)).cn - 1)));
    ((moom.tp)(this)).a__Void(((double)(life4_26)), ((double)(life6_39)), ((double)(life8_52)));
    }
    ((moom.tp)(this)).b(((float)(((moom.tp)(this)).w)), ((float)(((moom.tp)(this)).x)));
    }
    ((moom.tp)(this)).bJ = ((float)(((moom.tp)(this)).bK));
    ((moom.tp)(this)).C();
    lexicalValue1323_134_0 = this;
    }
    life4_154 = moom.Dr.a__Float(((double)(((((moom.tp)(lexicalValue1323_134_0)).t * ((moom.tp)(this)).t) + (((moom.tp)(this)).v * ((moom.tp)(this)).v)))));
    life5_164 = (((float) java.lang.Math.atan(((double)(((-((moom.tp)(this)).u) * 0x1.99999ap-3d))))) * 0x1.ep3f);
    spill1323_1 = recovery.source.CarrierOps.fcmpl(((float)(life4_154)), ((float)(0x1.99999ap-4f)));
    if (!((life3_5 != null))) {
        lexicalValue1323_166_0 = spill1323_1;
        break lexical_join_166;
    }
    if (!((spill1323_1 > 0))) {
        break lexical_join_164;
    }
    life4_154 = 0x1.99999ap-4f;
    }
    lexicalValue1323_166_0 = ((((moom.tp)(this)).A) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1323_173_0 = lexicalValue1323_166_0;
        break lexical_join_173;
    }
    if (!((lexicalValue1323_166_0 != 0))) {
        break lexical_join_176;
    }
    lexicalValue1323_173_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.tp)(this)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 != null))) {
        lexicalValue1323_180_0 = lexicalValue1323_173_0;
        break lexical_join_180;
    }
    if (!((lexicalValue1323_173_0 <= 0))) {
        break lexical_join_178;
    }
    }
    life4_154 = 0x0.0p0f;
    }
    lexicalValue1323_180_0 = ((((moom.tp)(this)).A) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1323_189_0 = lexicalValue1323_180_0;
        break lexical_join_189;
    }
    if (!((lexicalValue1323_180_0 == 0))) {
        break lexical_join_190;
    }
    spill1323_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue1323_204_0 = spill1323_2;
        break lexical_join_204;
    }
    lexicalValue1323_189_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.tp)(spill1323_2)).b__sourceReturn_bc607678b6())), ((float)(0x0.0p0f)));
    }
    if (!((lexicalValue1323_189_0 <= 0))) {
        break lexical_join_192;
    }
    }
    life5_164 = 0x0.0p0f;
    }
    moom.tp __stackOp1323_53_0 = this;
    ((moom.tp)(__stackOp1323_53_0)).bK = ((float)((((moom.tp)(__stackOp1323_53_0)).bK + ((life4_154 - ((moom.tp)(this)).bK) * 0x1.99999ap-2f))));
    lexicalValue1323_204_0 = this;
    }
    moom.tp __stackOp1323_57_0 = lexicalValue1323_204_0;
    ((moom.tp)(__stackOp1323_57_0)).aZ = ((float)((((moom.tp)(__stackOp1323_57_0)).aZ + ((life5_164 - ((moom.tp)(this)).aZ) * 0x1.99999ap-1f))));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break lexical_join_219;
    }
    moom.hg.a(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    return;
}

}
