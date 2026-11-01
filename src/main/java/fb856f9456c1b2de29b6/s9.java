package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class s9 extends moom.sZ {

private static long db;

private static long[] jb;

private static java.lang.Integer[] xb;

private static java.util.Map yb;

public s9(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_a36dbbf4bc67d068(moom.s9 receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.s9.db ^ 22103714663651L);

    moom.s9.__sourceConstructorInit_a36dbbf4bc67d068_0(((moom.s9)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.s9)(receiver)).a__Void(((float)(0x1.666666p0f)), ((float)(0x1.ccccccp-1f)));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uw(receiver, 0x1.99999ap-2f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uf(receiver, net.minecraft.entity.player.EntityPlayer.class))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uf(receiver, net.minecraft.entity.monster.EntityIronGolem.class))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.999999999999ap-1d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(__sourceIntrinsic_a36dbbf4bc67d068_originalDynamicSite2765_16(16523, (306406884019280105L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bJ)).a(((int)(__sourceIntrinsic_a36dbbf4bc67d068_originalDynamicSite2765_20(15069, (1085643016058626744L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.u0(receiver, net.minecraft.entity.player.EntityPlayer.class))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.s9)(receiver)).bK)).a(((int)(3)), ((moom.uc)(new moom.u0(receiver, net.minecraft.entity.monster.EntityIronGolem.class))));

    return;

}



static {
db = ((long)(((moom._a)(moom._c.a(((long)(8383829837795390340L)), ((long)(6277813823195512264L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225700818193065L)))));
    yb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.s9.db ^ 51834744753939L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1517_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1517_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1517_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1517_14 = new byte[8];
    (__sourceSpill1517_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1517_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1517_16 = __sourceSpill1517_14;
    ((javax.crypto.Cipher)(__sourceSpill1517_11)).init(((int)(__sourceSpill1517_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1517_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1517_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\035x\003\022:8\"3Y=n\022¡qâËï.\bbª\177dîÄ¡Á°%ÿÏIlüoh÷w"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1517_25 = local6_life21;
        int __sourceSpill1517_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1517_25)).substring(((int)(__sourceSpill1517_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1517_30 = local8_life19;
        int __sourceSpill1517_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1517_33 = new byte[8];
        (__sourceSpill1517_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1517_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1517_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1517_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1517_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1517_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1517_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1517_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1517_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1517_34)).doFinal(((byte[])(__sourceSpill1517_33)));
        (__sourceSpill1517_30)[__sourceSpill1517_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¶1JªÿÞgñ uÙ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1517_38 = local6_life21;
        int __sourceSpill1517_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1517_38)).substring(((int)(__sourceSpill1517_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1517_43 = local8_life19;
        int __sourceSpill1517_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1517_46 = new byte[8];
        (__sourceSpill1517_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1517_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1517_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1517_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1517_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1517_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1517_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1517_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1517_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1517_47)).doFinal(((byte[])(__sourceSpill1517_46)));
        (__sourceSpill1517_43)[__sourceSpill1517_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    jb = ((long[])(local8_life19));
    xb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a36dbbf4bc67d068_0(moom.s9 a0, net.minecraft.world.World a1) throws E;

public boolean I__Boolean() {
return (__sourceIntrinsic_booleanComparison((((moom.s9)(this)).ac())) != 0);
}


protected java.lang.String i__String() {
return "mob.spider.say";
}


protected void b(boolean p0, int p1) {
int forwardValue3941_20_0;
    moom.s9 forwardValue3941_31_0;
    net.minecraft.entity.Entity[] spill3941_0;
    boolean spill3941_1;
    moom.s9 spill3941_2;
    moom.s9 spill3941_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_35: {
    forward_join_31: {
    forward_join_30: {
    forward_join_20: {
    life3_3 = (moom.s9.db ^ 128489015712766L);
    spill3941_0 = moom.vN.b();
    super.b(((boolean)(p0)), ((int)(p1)));
    life5_9 = spill3941_0;
    spill3941_1 = p0;
    if (!((life5_9 == null))) {
        forwardValue3941_20_0 = ((spill3941_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill3941_1)) {
        break forward_join_35;
    }
    spill3941_2 = this;
    if (!((life5_9 == null))) {
        forwardValue3941_31_0 = spill3941_2;
        break forward_join_31;
    }
    forwardValue3941_20_0 = ((java.util.Random)(((moom.s9)(spill3941_2)).ah)).nextInt(((int)(3)));
    }
    if (!((forwardValue3941_20_0 != 0))) {
        break forward_join_30;
    }
    spill3941_3 = this;
    if (!((life5_9 == null))) {
        forwardValue3941_31_0 = spill3941_3;
        break forward_join_31;
    }
    if (!((((java.util.Random)(((moom.s9)(spill3941_3)).ah)).nextInt(((int)((1 + p1)))) > 0))) {
        break forward_join_35;
    }
    }
    forwardValue3941_31_0 = this;
    }
    ((moom.s9)(forwardValue3941_31_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bq)), ((int)(1)));
    }
    return;
}


public float e__Float() {
return 0x1.4cccccp-1f;
}


public double e() {
return ((double) (this.H * 0x1.0p-1f));
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral8982_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.s9.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27118;
      if (xb[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = jb[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])yb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               yb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/s9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         xb[var3] = var15;
      }

      return xb[var3];
}


protected java.lang.String c__String() {
return "mob.spider.say";
}


protected java.lang.String h__String() {
return "mob.spider.death";
}


public void l(boolean p0) {
int forwardValue3943_34_0;
    net.minecraft.entity.Entity[] spill3943_0;
    boolean spill3943_1;
    long life2_3;
    int life5_13;
    net.minecraft.entity.Entity[] life4_14;
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (moom.s9.db ^ 79180603432103L);
    spill3943_0 = moom.vN.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic3943_3(27495, (3063828222726873927L ^ life2_3)))));
    life4_14 = spill3943_0;
    spill3943_1 = p0;
    if (!((life4_14 == null))) {
        forwardValue3943_34_0 = ((spill3943_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill3943_1)) {
        break forward_join_26;
    }
    life5_13 = ((byte) (life5_13 | 1));
    if (!((life4_14 != null))) {
        break forward_join_35;
    }
    }
    forwardValue3943_34_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_93fe014f0768_invokedynamic3943_6(20227, (4956496231837140768L ^ life2_3))))));
    }
    life5_13 = forwardValue3943_34_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic3943_9(27495, (3063828222726873927L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


protected void d__Void() {
long local1 = (moom.s9.db ^ 54159176646567L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1629_3(22596, (3263275683813208934L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


protected moom.AV a__sourceReturn_8101e02423(net.minecraft.world.World p0) {
return new moom.AX(this, p0);
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.F;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((moom.s9)(this)).a(((java.lang.String)("mob.spider.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s9)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p4d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.s9)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    return;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.ARTHROPOD;
}


public boolean a__Boolean(net.minecraft.potion.PotionEffect p0) {
int forwardValue3939_16_0;
    int forwardValue3939_20_0;
    int forwardValue3939_22_0;
    int spill3939_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (moom.s9.db ^ 81766308733859L);
    life4_5 = moom.vN.b();
    spill3939_0 = ((net.minecraft.potion.PotionEffect)(p0)).a();
    if (!((life4_5 == null))) {
        forwardValue3939_16_0 = spill3939_0;
        break forward_join_16;
    }
    if (!((spill3939_0 != ((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)).I))) {
        break forward_join_21;
    }
    forwardValue3939_16_0 = ((super.a__Boolean(((net.minecraft.potion.PotionEffect)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue3939_20_0 = forwardValue3939_16_0;
        break forward_join_20;
    }
    if (!((forwardValue3939_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue3939_20_0 = 1;
    }
    forwardValue3939_22_0 = forwardValue3939_20_0;
    break forward_join_22;
    }
    forwardValue3939_22_0 = 0;
    }
    return ((forwardValue3939_22_0) != 0);
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
net.minecraft.entity.IEntityLivingData forestValue18_54_0;
    net.minecraft.entity.IEntityLivingData forestValue18_87_0;
    int forestValue18_90_0;
    net.minecraft.entity.IEntityLivingData forestValue18_115_0;
    net.minecraft.entity.IEntityLivingData spill18_0;
    moom.vN spill18_1;
    int spill18_2;
    moom.vN spill18_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.monster.EntitySkeleton life6_30;
    int life6_117;
    forest_join_115: {
    forest_join_114: {
    forest_join_90: {
    forest_join_87: {
    forest_join_86: {
    forest_join_54: {
    forest_join_53: {
    life3_3 = (moom.s9.db ^ 115451218701307L);
    life5_5 = moom.vN.b();
    spill18_0 = super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    if (!((life5_5 == null))) {
        forestValue18_54_0 = spill18_0;
        break forest_join_54;
    }
    p1 = spill18_0;
    if (!((((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextInt(((int)(__sourceIntrinsic_07d6d39f9236_invokedynamic18_5(31209, (3340709551250048657L ^ life3_3))))) == 0))) {
        break forest_join_53;
    }
    life6_30 = new net.minecraft.entity.monster.EntitySkeleton(this.i);
    ((net.minecraft.entity.monster.EntitySkeleton)(life6_30)).c(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(this.w)), ((float)(0x0.0p0f)));
    ((net.minecraft.entity.monster.EntitySkeleton)(life6_30)).a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(null)));
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life6_30)));
    ((net.minecraft.entity.monster.EntitySkeleton)(life6_30)).b(((net.minecraft.entity.Entity)(this)));
    }
    forestValue18_54_0 = p1;
    }
    if (!((life5_5 == null))) {
        forestValue18_87_0 = forestValue18_54_0;
        break forest_join_87;
    }
    if (!((forestValue18_54_0 == null))) {
        break forest_join_86;
    }
    spill18_1 = new moom.vN();
    if (!((life5_5 == null))) {
        forestValue18_87_0 = spill18_1;
        break forest_join_87;
    }
    p1 = spill18_1;
    if (!((((net.minecraft.world.World)(this.i)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break forest_join_86;
    }
    spill18_2 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((net.minecraft.world.World)(this.i)).u)).nextFloat())), ((float)((0x1.99999ap-4f * ((moom.Eh)(p0)).b()))));
    if (!((life5_5 == null))) {
        forestValue18_90_0 = spill18_2;
        break forest_join_90;
    }
    if (!((spill18_2 < 0))) {
        break forest_join_86;
    }
    ((moom.vN)(((moom.vN)(p1)))).a(((java.util.Random)(((net.minecraft.world.World)(this.i)).u)));
    }
    forestValue18_87_0 = p1;
    }
    if (!((life5_5 == null))) {
        forestValue18_115_0 = forestValue18_87_0;
        break forest_join_115;
    }
    forestValue18_90_0 = ((forestValue18_87_0 instanceof moom.vN) ? 1 : 0);
    }
    if (!((forestValue18_90_0 != 0))) {
        break forest_join_114;
    }
    spill18_3 = ((moom.vN)(p1));
    if (!((life5_5 == null))) {
        forestValue18_115_0 = spill18_3;
        break forest_join_115;
    }
    life6_117 = ((moom.vN)(spill18_3)).a;
    if (!((life6_117 > 0))) {
        break forest_join_114;
    }
    if (!(((net.minecraft.potion.Potion.a)[life6_117] != null))) {
        break forest_join_114;
    }
    ((moom.s9)(this)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(life6_117, __sourceIntrinsic_07d6d39f9236_invokedynamic18_33(14451, (7485005883345651466L ^ life3_3))))));
    }
    forestValue18_115_0 = p1;
    }
    return forestValue18_115_0;
}


public void g__Void() {
moom.s9 forwardValue3942_15_0;
    net.minecraft.entity.Entity[] spill3942_0;
    moom.s9 spill3942_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_18: {
    forward_join_15: {
    life1_3 = (moom.s9.db ^ 125040608586880L);
    spill3942_0 = moom.vN.b();
    super.g__Void();
    life3_7 = spill3942_0;
    spill3942_1 = this;
    if (!((life3_7 == null))) {
        forwardValue3942_15_0 = spill3942_1;
        break forward_join_15;
    }
    if (!((!((net.minecraft.world.World)(((moom.s9)(spill3942_1)).i)).G))) {
        break forward_join_18;
    }
    forwardValue3942_15_0 = this;
    }
    ((moom.s9)(forwardValue3942_15_0)).l(((boolean)(this.B)));
    }
    return;
}


public void v() {
return;
}


public boolean ac() {
int forwardValue3940_20_0;
    int forwardValue3940_22_0;
    int spill3940_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (moom.s9.db ^ 132714460183762L);
    life3_5 = moom.vN.b();
    spill3940_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_d73cace8ce31_invokedynamic3940_3(27495, (3063810288237101874L ^ life1_3))))) & 1);
    if (!((life3_5 == null))) {
        forwardValue3940_20_0 = spill3940_0;
        break forward_join_20;
    }
    if (!((spill3940_0 != 0))) {
        break forward_join_21;
    }
    forwardValue3940_20_0 = 1;
    }
    forwardValue3940_22_0 = forwardValue3940_20_0;
    break forward_join_22;
    }
    forwardValue3940_22_0 = 0;
    }
    return ((forwardValue3940_22_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_a36dbbf4bc67d068_originalDynamicSite2765_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a36dbbf4bc67d068_originalDynamicSite2765_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic18_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_07d6d39f9236_invokedynamic18_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_invokedynamic3940_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1629_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral8982_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic3943_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic3943_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic3943_9(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
