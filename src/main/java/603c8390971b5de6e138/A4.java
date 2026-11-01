package moom;


public class A4 extends net.minecraft.potion.Potion {

private static final long S;

public A4(int p0, moom.DD p1, boolean p2, int p3) {
super(p0, p1, p2, p3);
}


static {
S = (moom._c.a(5892969129207175713L, -6683813396259183248L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(49486223616989L);
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.entity.EntityLivingBase p0, net.minecraft.entity.ai.attributes.BaseAttributeMap p1, int p2) {
net.minecraft.entity.EntityLivingBase forwardValue1404_20_0;
    java.lang.String[] spill1404_0;
    net.minecraft.entity.EntityLivingBase spill1404_1;
    long life4_3;
    java.lang.String[] life6_10;
    forward_join_23: {
    forward_join_20: {
    life4_3 = (moom.A4.S ^ 107850114773064L);
    spill1404_0 = net.minecraft.potion.PotionEffect.b__ArrayString();
    super.a(((net.minecraft.entity.EntityLivingBase)(p0)), ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p1)), ((int)(p2)));
    life6_10 = spill1404_0;
    spill1404_1 = p0;
    if (!((life6_10 != null))) {
        forwardValue1404_20_0 = spill1404_1;
        break forward_join_20;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(spill1404_1)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).a()))) > 0))) {
        break forward_join_23;
    }
    forwardValue1404_20_0 = p0;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue1404_20_0)).d(((float)(((net.minecraft.entity.EntityLivingBase)(p0)).a())));
    }
    return;
}

}
