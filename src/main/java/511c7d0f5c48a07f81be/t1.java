package moom;


public class t1 {

private static final java.util.HashMap<java.lang.Class, net.minecraft.entity.EntityLiving$SpawnPlacementType> a;

public t1() {
super();
}


static {
moom.t1.a = com.google.common.collect.Maps.newHashMap();
    (moom.t1.a).put(net.minecraft.entity.passive.EntityBat.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityChicken.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.sM.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityHorse.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.sN.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityOcelot.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityPig.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityRabbit.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntitySheep.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.sY.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.tl.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.IN_WATER);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityIronGolem.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityWolf.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.passive.EntityVillager.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.boss.EntityDragon.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.boss.EntityWither.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityBlaze.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.s_.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityCreeper.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityEnderman.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityEndermite.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityGhast.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.s5.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityGuardian.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.IN_WATER);
    (moom.t1.a).put(moom.th.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityPigZombie.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.s7.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntitySkeleton.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntitySlime.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.s9.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(moom.ta.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
    (moom.t1.a).put(net.minecraft.entity.monster.EntityZombie.class, net.minecraft.entity.EntityLiving$SpawnPlacementType.ON_GROUND);
}


public static net.minecraft.entity.EntityLiving$SpawnPlacementType a(java.lang.Class p0) {
return ((net.minecraft.entity.EntityLiving$SpawnPlacementType)(((java.util.HashMap)(moom.t1.a)).get(((java.lang.Object)(p0)))));
}

}
