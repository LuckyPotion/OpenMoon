package moom;






import moom.vN;


import moom.DT;


import moom.sZ;


import net.minecraft.init.Blocks;
import moom.Oo;
import moom.vi;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
public class s7 extends moom.sZ {

private final moom.vi b5;

private static final long cb;

public s7(net.minecraft.world.World p0) {
super(((net.minecraft.world.World)(p0)));
    ((moom.s7)(this)).a__Void(((float)(0x1.99999a0000000p-2F)), ((float)(0x1.3333340000000p-2F)));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(((net.minecraft.entity.EntityLiving) this)))));
    net.minecraft.entity.ai.EntityAITasks __sourceSpill448_7 = this.bJ;
    int __sourceSpill448_8 = 3;
    moom.s7 __stackOp448_9_0 = this;
    moom.vi __stackOp448_9_1 = new moom.vi(this);
    moom.vi __sourceSpill448_11 = __stackOp448_9_1;
    ((moom.s7)(__stackOp448_9_0)).b5 = ((moom.vi)(__stackOp448_9_1));
    ((net.minecraft.entity.ai.EntityAITasks)(__sourceSpill448_7)).a(((int)(__sourceSpill448_8)), ((moom.uc)(__sourceSpill448_11)));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(4)), ((moom.uc)(new moom.ue(((moom.sI) this), net.minecraft.entity.player.EntityPlayer.class, 0x1.0p0d, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bJ)).a(((int)(5)), ((moom.uc)(new moom.u7(this))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(1)), ((moom.uc)(new moom.uT(((moom.sI) this), true, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uV(((moom.sI) this), net.minecraft.entity.player.EntityPlayer.class, true))));
    return;
}


static {
moom.s7.cb = (moom._c.a(1130173017774111251L, 3908193101952676616L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(152199501055375L);
}


protected java.lang.String i__String() {
return "mob.silverfish.say";
}


public float e__Float() {
return 0x1.99999ap-4f;
}


protected java.lang.String c__String() {
return "mob.silverfish.hit";
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected java.lang.String h__String() {
return "mob.silverfish.kill";
}


public double d__sourceReturn_fedcb3e4d3() {
return 0x1.999999999999ap-3d;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((moom.s7)(this)).a(((java.lang.String)("mob.silverfish.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return null;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.ARTHROPOD;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue3937_18_0;
    net.minecraft.util.DamageSource forwardValue3937_20_0;
    boolean spill3937_0;
    net.minecraft.util.DamageSource spill3937_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_25: {
    forward_join_22: {
    forward_join_20: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (moom.s7.cb ^ 48789843482213L);
    life5_5 = moom.vN.b();
    spill3937_0 = ((moom.s7)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3937_18_0 = ((spill3937_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3937_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    spill3937_1 = p0;
    if (!((life5_5 == null))) {
        forwardValue3937_20_0 = spill3937_1;
        break forward_join_20;
    }
    forwardValue3937_18_0 = ((spill3937_1 instanceof moom.CV) ? 1 : 0);
    }
    if (!((forwardValue3937_18_0 == 0))) {
        break forward_join_22;
    }
    forwardValue3937_20_0 = p0;
    }
    if (!((forwardValue3937_20_0 == net.minecraft.util.DamageSource.l))) {
        break forward_join_25;
    }
    }
    ((moom.vi)(this.b5)).d__sourceReturn_da8c82d5d4();
    }
    return super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s7)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s7)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s7)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p0d)));
    return;
}


public float a__sourceReturn_8d24afb582(moom.DT p0) {
long l = moom.s7.cb ^ 0x4EA044B2AC09L;
        Entity[] entityArray = vN.b();
        s7 s72 = this;
        if (entityArray == null) {
            if (s72.i.a__fE(__sourceExactCall_bcb977d05e639b(p0)).a__ch() == Blocks.b) {
                return 10.0f;
            }
            s72 = this;
        }
        float f = super.a__sourceReturn_8d24afb582(p0);
        return f;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public void g__Void() {
this.a2 = ((float)(this.w));
    super.g__Void();
    return;
}


public boolean N__Boolean() {
int forwardValue3936_22_0;
    int forwardValue3936_24_0;
    boolean spill3936_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.player.EntityPlayer life4_19;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (moom.s7.cb ^ 5409820805401L);
    life3_5 = moom.vN.b();
    spill3936_0 = super.N__Boolean();
    if (!((life3_5 == null))) {
        forwardValue3936_24_0 = ((spill3936_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3936_0)) {
        break forward_join_23;
    }
    life4_19 = ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.4p2d)));
    if (!((life4_19 == null))) {
        break forward_join_21;
    }
    forwardValue3936_22_0 = 1;
    break forward_join_22;
    }
    forwardValue3936_22_0 = 0;
    }
    return ((forwardValue3936_22_0) != 0);
    }
    forwardValue3936_24_0 = 0;
    }
    return ((forwardValue3936_24_0) != 0);
}


protected boolean ab() {
return ((1) != 0);
}


private static native moom.DT __sourceExactCall_bcb977d05e639b(moom.DT p0);
}
