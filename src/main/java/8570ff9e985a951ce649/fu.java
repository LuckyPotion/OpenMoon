package com.moon;


public class fu extends com.moon.e2<com.moon.module.impl.LongJump> {

private static final long e;

public fu() {
super(com.moon.module.impl.LongJump.class);
}


static {
e = (moom._c.a(-5999446246225677858L, 2739352839789266932L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(50396335188864L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MotionEvent p0) {
com.moon.event.MotionEvent forwardValue191_37_0;
    java.lang.Object forwardValue191_37_1;
    com.moon.event.MotionEvent forwardValue191_41_0;
    com.moon.event.MotionEvent forwardValue191_42_0;
    double forwardValue191_42_1;
    com.moon.event.MotionEvent spill191_0;
    double spill191_1;
    com.moon.event.MotionEvent spill191_2;
    net.minecraft.client.entity.EntityPlayerSP spill191_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_37: {
    forward_join_25: {
    life2_3 = (com.moon.fu.e ^ 96396018763104L);
    life4_5 = net.minecraft.client.gui.GuiScreen.a__Arrayr3();
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fu.a)).K)).A)) {
        break forward_join_25;
    }
    spill191_0 = p0;
    net.minecraft.client.entity.EntityPlayerSP __stackOp191_13_0 = ((net.minecraft.client.Minecraft)(com.moon.fu.a)).K;
    double __stackOp191_13_1 = ((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.LongJump)(((com.moon.module.impl.LongJump)(((com.moon.fu)(this)).a())))).a__kZ())).getValue())))).floatValue());
    spill191_1 = __stackOp191_13_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp191_13_0)).u = ((double)(__stackOp191_13_1));
    ((com.moon.event.MotionEvent)(spill191_0)).setMotionY(((double)(spill191_1)));
    }
    spill191_2 = p0;
    spill191_3 = ((net.minecraft.client.Minecraft)(com.moon.fu.a)).K;
    if (!((life4_5 != null))) {
        forwardValue191_37_0 = spill191_2;
        forwardValue191_37_1 = spill191_3;
        break forward_join_37;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill191_3)).ae())) {
        forwardValue191_41_0 = spill191_2;
        break forward_join_41;
    }
    forwardValue191_37_0 = spill191_2;
    forwardValue191_37_1 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.LongJump)(((com.moon.module.impl.LongJump)(((com.moon.fu)(this)).a())))).b())).getValue();
    }
    forwardValue191_42_0 = forwardValue191_37_0;
    forwardValue191_42_1 = ((double) ((java.lang.Float)(((java.lang.Float)(forwardValue191_37_1)))).floatValue());
    break forward_join_42;
    }
    forwardValue191_42_0 = forwardValue191_41_0;
    forwardValue191_42_1 = 0x0.0p0d;
    }
    ((com.moon.event.MotionEvent)(forwardValue191_42_0)).applyMotionSpeed(((double)(forwardValue191_42_1)));
    return;
}

}
