package moom;


class vw extends net.minecraft.entity.ai.EntityMoveHelper {

private final net.minecraft.entity.monster.EntityGuardian g;

private static final long h;

public vw(net.minecraft.entity.monster.EntityGuardian p0) {
super(p0);
    this.g = p0;
}


static {
h = (moom._c.a(8103241628272531497L, -5174713543693682735L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(210034889685453L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a__Void() {
net.minecraft.entity.ai.EntityLookHelper forwardValue4335_263_0;
    moom.vw forwardValue4335_298_0;
    net.minecraft.entity.monster.EntityGuardian forwardValue4335_299_0;
    moom.vw spill4335_0;
    net.minecraft.entity.monster.EntityGuardian spill4335_1;
    net.minecraft.entity.ai.EntityLookHelper spill4335_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    double life4_33;
    double life6_40;
    double life8_47;
    double life10_59;
    double life10_63;
    double life6_67;
    float life12_78;
    float life13_104;
    double life14_132;
    double life16_142;
    double life18_152;
    double life14_184;
    net.minecraft.entity.ai.EntityLookHelper life20_215;
    double life21_225;
    double life23_238;
    double life25_248;
    double life27_251;
    double life29_254;
    double life31_257;
    forward_join_301: {
    forward_join_299: {
    forward_join_298: {
    forward_join_293: {
    forward_join_263: {
    forward_join_260: {
    life1_3 = (moom.vw.h ^ 105745406425693L);
    life3_5 = moom.vN.b();
    spill4335_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4335_298_0 = spill4335_0;
        break forward_join_298;
    }
    if (!(((moom.vw)(spill4335_0)).f)) {
        break forward_join_293;
    }
    spill4335_1 = this.g;
    if (!((life3_5 == null))) {
        forwardValue4335_299_0 = spill4335_1;
        break forward_join_299;
    }
    if (!((!((moom.AV)(((net.minecraft.entity.monster.EntityGuardian)(spill4335_1)).a__sourceReturn_407923443b())).a__Boolean()))) {
        break forward_join_293;
    }
    life4_33 = (((moom.vw)(this)).b - ((net.minecraft.entity.monster.EntityGuardian)(this.g)).n);
    life6_40 = (((moom.vw)(this)).c - ((net.minecraft.entity.monster.EntityGuardian)(this.g)).o);
    life8_47 = (((moom.vw)(this)).d - ((net.minecraft.entity.monster.EntityGuardian)(this.g)).p);
    life10_59 = (((life4_33 * life4_33) + (life6_40 * life6_40)) + (life8_47 * life8_47));
    life10_63 = ((double) moom.Dr.a__Float(((double)(life10_59))));
    life6_67 = (life6_40 / life10_63);
    life12_78 = (((float) ((moom.Dr.b(((double)(life8_47)), ((double)(life4_33))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f);
    ((net.minecraft.entity.monster.EntityGuardian)(this.g)).w = ((float)(((moom.vw)(this)).a(((float)(((net.minecraft.entity.monster.EntityGuardian)(this.g)).w)), ((float)(life12_78)), ((float)(0x1.ep4f)))));
    ((net.minecraft.entity.monster.EntityGuardian)(this.g)).a2 = ((float)(((net.minecraft.entity.monster.EntityGuardian)(this.g)).w));
    life13_104 = ((float) (((moom.vw)(this)).e * ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGuardian)(this.g)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b()));
    ((net.minecraft.entity.monster.EntityGuardian)(this.g)).f(((float)((((net.minecraft.entity.monster.EntityGuardian)(this.g)).i__sourceReturn_bc607678b6() + ((life13_104 - ((net.minecraft.entity.monster.EntityGuardian)(this.g)).i__sourceReturn_bc607678b6()) * 0x1.0p-3f)))));
    life14_132 = (java.lang.Math.sin(((double)((((double) (((net.minecraft.entity.monster.EntityGuardian)(this.g)).S + ((net.minecraft.entity.monster.EntityGuardian)(this.g)).e__Int())) * 0x1.0p-1d)))) * 0x1.999999999999ap-5d);
    life16_142 = java.lang.Math.cos(((double)(((double) ((((net.minecraft.entity.monster.EntityGuardian)(this.g)).w * 0x1.921fb6p1f) / 0x1.68p7f)))));
    life18_152 = java.lang.Math.sin(((double)(((double) ((((net.minecraft.entity.monster.EntityGuardian)(this.g)).w * 0x1.921fb6p1f) / 0x1.68p7f)))));
    net.minecraft.entity.monster.EntityGuardian __stackOp4335_49_0 = this.g;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_49_0)).t = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_49_0)).t + (life14_132 * life16_142))));
    net.minecraft.entity.monster.EntityGuardian __stackOp4335_53_0 = this.g;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_53_0)).v = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_53_0)).v + (life14_132 * life18_152))));
    life14_184 = (java.lang.Math.sin(((double)((((double) (((net.minecraft.entity.monster.EntityGuardian)(this.g)).S + ((net.minecraft.entity.monster.EntityGuardian)(this.g)).e__Int())) * 0x1.8p-1d)))) * 0x1.999999999999ap-5d);
    net.minecraft.entity.monster.EntityGuardian __stackOp4335_62_0 = this.g;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_62_0)).u = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_62_0)).u + ((life14_184 * (life18_152 + life16_142)) * 0x1.0p-2d))));
    net.minecraft.entity.monster.EntityGuardian __stackOp4335_66_0 = this.g;
    ((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_66_0)).u = ((double)((((net.minecraft.entity.monster.EntityGuardian)(__stackOp4335_66_0)).u + ((((double) ((net.minecraft.entity.monster.EntityGuardian)(this.g)).i__sourceReturn_bc607678b6()) * life6_67) * 0x1.999999999999ap-4d))));
    life20_215 = ((net.minecraft.entity.monster.EntityGuardian)(this.g)).a__vt();
    life21_225 = (((net.minecraft.entity.monster.EntityGuardian)(this.g)).n + ((life4_33 / life10_63) * 0x1.0p1d));
    life23_238 = ((((double) ((net.minecraft.entity.monster.EntityGuardian)(this.g)).e__Float()) + ((net.minecraft.entity.monster.EntityGuardian)(this.g)).o) + (life6_67 / life10_63));
    life25_248 = (((net.minecraft.entity.monster.EntityGuardian)(this.g)).p + ((life8_47 / life10_63) * 0x1.0p1d));
    life27_251 = ((net.minecraft.entity.ai.EntityLookHelper)(life20_215)).a();
    life29_254 = ((net.minecraft.entity.ai.EntityLookHelper)(life20_215)).b();
    life31_257 = ((net.minecraft.entity.ai.EntityLookHelper)(life20_215)).c();
    spill4335_2 = life20_215;
    if (!((life3_5 == null))) {
        forwardValue4335_263_0 = spill4335_2;
        break forward_join_263;
    }
    if (!((!((net.minecraft.entity.ai.EntityLookHelper)(spill4335_2)).a__Boolean()))) {
        break forward_join_260;
    }
    life27_251 = life21_225;
    life29_254 = life23_238;
    life31_257 = life25_248;
    }
    forwardValue4335_263_0 = ((net.minecraft.entity.monster.EntityGuardian)(this.g)).a__vt();
    }
    __sourceExactCall_ab6c1b71c67b80(((net.minecraft.entity.ai.EntityLookHelper)(forwardValue4335_263_0)), ((double)((life27_251 + ((life21_225 - life27_251) * 0x1.0p-3d)))), ((double)((life29_254 + ((life23_238 - life29_254) * 0x1.0p-3d)))), ((double)((life31_257 + ((life25_248 - life31_257) * 0x1.0p-3d)))), ((float)(0x1.4p3f)), ((float)(0x1.4p5f)));
    __sourceExactCall_78d79391fb6ab5(((net.minecraft.entity.monster.EntityGuardian)(this.g)), ((boolean)(true)));
    if (!((life3_5 != null))) {
        break forward_join_301;
    }
    }
    ((net.minecraft.entity.monster.EntityGuardian)(this.g)).f(((float)(0x0.0p0f)));
    forwardValue4335_298_0 = this;
    }
    forwardValue4335_299_0 = ((moom.vw)(forwardValue4335_298_0)).g;
    }
    __sourceExactCall_78d79391fb6ab5(((net.minecraft.entity.monster.EntityGuardian)(forwardValue4335_299_0)), ((boolean)(false)));
    }
    return;
}


private static native void __sourceExactCall_ab6c1b71c67b80(net.minecraft.entity.ai.EntityLookHelper p0, double p1, double p2, double p3, float p4, float p5);

private static native void __sourceExactCall_78d79391fb6ab5(net.minecraft.entity.monster.EntityGuardian p0, boolean p1);
}
