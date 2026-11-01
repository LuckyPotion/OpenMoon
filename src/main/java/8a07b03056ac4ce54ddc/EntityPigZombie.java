package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityPigZombie extends net.minecraft.entity.monster.EntityZombie {

private static final java.util.UUID cc;

private static final moom.vB cd;

private int ce;

private int cf;

private java.util.UUID cg;

private static final long db;

private static final long[] Ab;

private static final java.lang.Integer[] Bb;

private static final java.util.Map Cb;

public EntityPigZombie(net.minecraft.world.World p0) {
super(p0);
    this.ak = true;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(1360477260039974984L)), ((long)(-1368710481722521803L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91190204776853L)))));
    Cb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 5800468129094L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1194_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1194_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1194_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1194_14 = new byte[8];
    (__sourceSpill1194_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1194_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1194_16 = __sourceSpill1194_14;
    ((javax.crypto.Cipher)(__sourceSpill1194_11)).init(((int)(__sourceSpill1194_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1194_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1194_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "³3D)\024ï8º\034mPîì$ö\016%Ö8sY\032"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1194_25 = local6_life21;
        int __sourceSpill1194_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1194_25)).substring(((int)(__sourceSpill1194_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1194_30 = local8_life19;
        int __sourceSpill1194_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1194_33 = new byte[8];
        (__sourceSpill1194_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1194_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1194_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1194_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1194_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1194_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1194_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1194_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1194_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1194_34)).doFinal(((byte[])(__sourceSpill1194_33)));
        (__sourceSpill1194_30)[__sourceSpill1194_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Ab = ((long[])(local8_life19));
    Bb = ((java.lang.Integer[])(new java.lang.Integer[3]));
    cc = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("49455A49-7EC5-45BA-B886-3B90B23A1718")))));
    cd = ((moom.vB)(((moom.vB)(new moom.vB(net.minecraft.entity.monster.EntityPigZombie.cc, "Attacking speed boost", 0x1.999999999999ap-5d, 0))).a(((boolean)(false)))));
}


private void i(net.minecraft.entity.Entity p0) {
net.minecraft.entity.monster.EntityPigZombie forwardValue665_40_0;
    net.minecraft.entity.EntityLivingBase forwardValue665_40_1;
    net.minecraft.entity.Entity[] spill665_0;
    net.minecraft.entity.monster.EntityPigZombie spill665_1;
    net.minecraft.entity.monster.EntityPigZombie spill665_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_21;
    forward_join_41: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 91533517460777L);
    spill665_0 = moom.vN.b();
    this.ce = ((int)((__sourceIntrinsic_cbff4fe7bc61_invokedynamic665_2(4362, (4269859095300108186L ^ life2_3)) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_cbff4fe7bc61_invokedynamic665_4(14113, (4608892558481476016L ^ life2_3))))))));
    life4_21 = spill665_0;
    spill665_1 = this;
    spill665_2 = this;
    if (!((life4_21 == null))) {
        forwardValue665_40_0 = spill665_1;
        forwardValue665_40_1 = spill665_2;
        break forward_join_40;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(spill665_1)).cf = ((int)(((java.util.Random)(((net.minecraft.entity.monster.EntityPigZombie)(spill665_2)).ah)).nextInt(((int)(__sourceIntrinsic_cbff4fe7bc61_invokedynamic665_8(12091, (3671538724503114152L ^ life2_3)))))));
    if (!((((p0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_41;
    }
    forwardValue665_40_0 = this;
    forwardValue665_40_1 = ((net.minecraft.entity.EntityLivingBase)(p0));
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(forwardValue665_40_0)).b(((net.minecraft.entity.EntityLivingBase)(forwardValue665_40_1)));
    }
    return;
}


protected java.lang.String i__String() {
return "mob.zombiepig.zpig";
}


public void b(net.minecraft.entity.EntityLivingBase p0) {
net.minecraft.entity.monster.EntityPigZombie forwardValue5168_15_0;
    net.minecraft.entity.EntityLivingBase forwardValue5168_15_1;
    net.minecraft.entity.monster.EntityPigZombie spill5168_0;
    net.minecraft.entity.EntityLivingBase spill5168_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_17: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 73708468977342L);
    life4_5 = moom.vN.b();
    spill5168_0 = this;
    spill5168_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue5168_15_0 = spill5168_0;
        forwardValue5168_15_1 = spill5168_1;
        break forward_join_15;
    }
    __sourceIntrinsic_a628b713ec83_call5168_2(spill5168_0, spill5168_1);
    if (!((p0 != null))) {
        break forward_join_17;
    }
    forwardValue5168_15_0 = this;
    forwardValue5168_15_1 = p0;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(forwardValue5168_15_0)).cg = ((java.util.UUID)(((net.minecraft.entity.EntityLivingBase)(forwardValue5168_15_1)).a__UUID()));
    }
    return;
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.Entity[] spill1589_0;
    long life3_3;
    int life6_11;
    net.minecraft.entity.Entity[] life5_12;
    int life7_14;
    int life7_39;
    lexical_join_48: {
    lexical_join_35: {
    lexical_join_28: {
    life3_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 125334768176406L);
    spill1589_0 = moom.vN.b();
    life6_11 = ((java.util.Random)(this.ah)).nextInt(((int)((2 + p1))));
    life5_12 = spill1589_0;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    if (!((life7_14 < life6_11))) {
        break lexical_join_28;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bi)), ((int)(1)));
    life7_14 += 1;
    if (!((life5_12 == null))) {
        break lexical_join_35;
    }
    if (!((life5_12 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    life6_11 = ((java.util.Random)(this.ah)).nextInt(((int)((2 + p1))));
    }
    life7_39 = 0;
    lexical_cycle_37: while (true) {
    if (!((life7_39 < life6_11))) {
        break lexical_join_48;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bm)), ((int)(1)));
    life7_39 += 1;
    if (!((life5_12 != null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    java.lang.String life5_17;
    net.minecraft.entity.player.EntityPlayer life6_38;
    forward_join_47: {
    forward_join_43: {
    forward_join_27: {
    life2_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 70832076330268L);
    net.minecraft.entity.Entity[] spill5815_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5815_0;
    this.ce = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Anger")))));
    life5_17 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("HurtBy")));
    if (!((life4_8 == null))) { break forward_join_27; }
    if (!((((java.lang.String)(life5_17)).length() > 0))) { break forward_join_47; }
    this.cg = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)(life5_17)))));
    }
    life6_38 = ((net.minecraft.world.World)(this.i)).a(((java.util.UUID)(this.cg)));
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).b(((net.minecraft.entity.EntityLivingBase)(life6_38)));
    if (!((life4_8 == null))) { break forward_join_43; }
    if (!((life6_38 != null))) { break forward_join_47; }
    this.a7 = ((net.minecraft.entity.player.EntityPlayer)(life6_38));
    }
    this.a8 = ((int)(((net.minecraft.entity.monster.EntityPigZombie)(this)).a__Int()));
    }
    return;
}


protected java.lang.String c__String() {
return "mob.zombiepig.zpighurt";
}


protected java.lang.String h__String() {
return "mob.zombiepig.zpigdeath";
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 57;
      if (Bb[var3] == null) {
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
         long var5 = Ab[var3];
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
         Object[] var9 = (Object[])Cb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Cb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tc", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Bb[var3] = var15;
      }

      return Bb[var3];
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11480_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tc"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityPigZombie.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5170_30_0;
    java.lang.String forwardValue5170_30_1;
    net.minecraft.entity.Entity[] spill5170_0;
    net.minecraft.nbt.NBTTagCompound spill5170_1;
    java.lang.String spill5170_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_32: {
    forward_join_30: {
    forward_join_28: {
    life2_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 137503894965783L);
    spill5170_0 = moom.vN.b();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5170_0;
    spill5170_1 = p0;
    spill5170_2 = "Anger";
    if (!((life4_8 == null))) {
        forwardValue5170_30_0 = spill5170_1;
        forwardValue5170_30_1 = spill5170_2;
        break forward_join_30;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill5170_1)).a(((java.lang.String)(spill5170_2)), ((short)(((short) this.ce))));
    if (!((this.cg != null))) {
        break forward_join_28;
    }
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("HurtBy")), ((java.lang.String)(((java.util.UUID)(this.cg)).toString())));
    if (!((life4_8 != null))) {
        break forward_join_32;
    }
    }
    forwardValue5170_30_0 = p0;
    forwardValue5170_30_1 = "HurtBy";
    }
    ((net.minecraft.nbt.NBTTagCompound)(forwardValue5170_30_0)).a(((java.lang.String)(forwardValue5170_30_1)), ((java.lang.String)("")));
    }
    return;
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
return ((0) != 0);
}


protected void a(moom.Eh p0) {
((net.minecraft.entity.monster.EntityPigZombie)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.B))));
    return;
}


public net.minecraft.entity.IEntityLivingData a(moom.Eh p0, net.minecraft.entity.IEntityLivingData p1) {
super.a(((moom.Eh)(p0)), ((net.minecraft.entity.IEntityLivingData)(p1)));
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).n(((boolean)(false)));
    return p1;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.Entity forwardValue5166_16_0;
    int forwardValue5166_29_0;
    net.minecraft.entity.monster.EntityPigZombie spill5166_0;
    int spill5166_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.Entity life6_21;
    forward_join_29: {
    forward_join_25: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 43583712073118L);
    life5_5 = moom.vN.b();
    spill5166_0 = this;
    if (!((life5_5 == null))) {
        forwardValue5166_16_0 = spill5166_0;
        break forward_join_16;
    }
    if (!(((net.minecraft.entity.monster.EntityPigZombie)(spill5166_0)).a(((net.minecraft.util.DamageSource)(p0))))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5166_16_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    life6_21 = forwardValue5166_16_0;
    spill5166_1 = ((life6_21 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue5166_29_0 = spill5166_1;
        break forward_join_29;
    }
    if (!((spill5166_1 != 0))) {
        break forward_join_25;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).i(((net.minecraft.entity.Entity)(life6_21)));
    }
    forwardValue5166_29_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5166_29_0) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.monster.EntityPigZombie.b5))))).a(((double)(0x0.0p0d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.d70a3ep-3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.4p2d)));
    return;
}


public void g__Void() {
super.g__Void();
    return;
}


protected void A__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.k)), ((int)(1)));
    return;
}


public boolean N__Boolean() {
long local1 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 16594823908066L);
    return ((((((net.minecraft.world.World)(this.i)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL) ? 1 : 0)) != 0);
}


protected void X__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(1)), ((moom.uc)(new moom.uU(this))));
    ((net.minecraft.entity.ai.EntityAITasks)(this.bK)).a(((int)(2)), ((moom.uc)(new moom.uZ(this))));
    return;
}


protected void R() {
net.minecraft.entity.ai.attributes.IAttributeInstance forwardValue5165_28_0;
    moom.vB forwardValue5165_28_1;
    net.minecraft.entity.monster.EntityPigZombie forwardValue5165_30_0;
    int forwardValue5165_40_0;
    int forwardValue5165_48_0;
    int forwardValue5165_85_0;
    net.minecraft.entity.monster.EntityPigZombie forwardValue5165_113_0;
    net.minecraft.entity.Entity[] spill5165_0;
    boolean spill5165_1;
    net.minecraft.entity.monster.EntityPigZombie spill5165_2;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill5165_3;
    moom.vB spill5165_4;
    int spill5165_5;
    net.minecraft.entity.monster.EntityPigZombie spill5165_6;
    net.minecraft.entity.monster.EntityPigZombie spill5165_7;
    net.minecraft.entity.monster.EntityPigZombie spill5165_8;
    long life1_3;
    net.minecraft.entity.ai.attributes.IAttributeInstance life4_8;
    net.minecraft.entity.Entity[] life3_9;
    net.minecraft.entity.player.EntityPlayer life5_155;
    forward_join_113: {
    forward_join_112: {
    forward_join_85: {
    forward_join_81: {
    forward_join_48: {
    forward_join_46: {
    forward_join_40: {
    forward_join_37: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life1_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 17744751151806L);
    spill5165_0 = moom.vN.b();
    life4_8 = ((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    life3_9 = spill5165_0;
    spill5165_1 = ((net.minecraft.entity.monster.EntityPigZombie)(this)).af();
    if (!((life3_9 == null))) {
        forwardValue5165_40_0 = ((spill5165_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill5165_1)) {
        break forward_join_37;
    }
    spill5165_2 = this;
    if (!((life3_9 == null))) {
        forwardValue5165_30_0 = spill5165_2;
        break forward_join_30;
    }
    if (!((!((net.minecraft.entity.monster.EntityPigZombie)(spill5165_2)).c__Boolean()))) {
        break forward_join_29;
    }
    spill5165_3 = life4_8;
    spill5165_4 = net.minecraft.entity.monster.EntityPigZombie.cd;
    if (!((life3_9 == null))) {
        forwardValue5165_28_0 = spill5165_3;
        forwardValue5165_28_1 = spill5165_4;
        break forward_join_28;
    }
    if (!((!((net.minecraft.entity.ai.attributes.IAttributeInstance)(spill5165_3)).a__Boolean(((moom.vB)(spill5165_4)))))) {
        break forward_join_29;
    }
    forwardValue5165_28_0 = life4_8;
    forwardValue5165_28_1 = net.minecraft.entity.monster.EntityPigZombie.cd;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(forwardValue5165_28_0)).a(((moom.vB)(forwardValue5165_28_1)));
    }
    forwardValue5165_30_0 = this;
    }
    net.minecraft.entity.monster.EntityPigZombie __stackOp5165_11_0 = forwardValue5165_30_0;
    ((net.minecraft.entity.monster.EntityPigZombie)(__stackOp5165_11_0)).ce = ((int)((((net.minecraft.entity.monster.EntityPigZombie)(__stackOp5165_11_0)).ce - 1)));
    if (!((life3_9 != null))) {
        break forward_join_46;
    }
    }
    forwardValue5165_40_0 = ((((net.minecraft.entity.ai.attributes.IAttributeInstance)(life4_8)).a__Boolean(((moom.vB)(net.minecraft.entity.monster.EntityPigZombie.cd)))) ? 1 : 0);
    }
    if (!((life3_9 == null))) {
        forwardValue5165_48_0 = forwardValue5165_40_0;
        break forward_join_48;
    }
    if (!((forwardValue5165_40_0 != 0))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life4_8)).b(((moom.vB)(net.minecraft.entity.monster.EntityPigZombie.cd)));
    }
    forwardValue5165_48_0 = this.cf;
    }
    if (!((life3_9 == null))) {
        forwardValue5165_85_0 = forwardValue5165_48_0;
        break forward_join_85;
    }
    if (!((forwardValue5165_48_0 > 0))) {
        break forward_join_81;
    }
    net.minecraft.entity.monster.EntityPigZombie __stackOp5165_20_0 = this;
    net.minecraft.entity.monster.EntityPigZombie __stackOp5165_22_0 = __stackOp5165_20_0;
    int __stackOp5165_22_1 = (((net.minecraft.entity.monster.EntityPigZombie)(__stackOp5165_20_0)).cf - 1);
    spill5165_5 = __stackOp5165_22_1;
    ((net.minecraft.entity.monster.EntityPigZombie)(__stackOp5165_22_0)).cf = ((int)(__stackOp5165_22_1));
    if (!((life3_9 == null))) {
        forwardValue5165_85_0 = spill5165_5;
        break forward_join_85;
    }
    if (!((spill5165_5 == 0))) {
        break forward_join_81;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).a(((java.lang.String)("mob.zombiepig.zpigangry")), ((float)((((net.minecraft.entity.monster.EntityPigZombie)(this)).f__sourceReturn_bc607678b6() * 0x1.0p1f))), ((float)(((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f) * 0x1.ccccccp0f))));
    }
    spill5165_6 = this;
    if (!((life3_9 == null))) {
        forwardValue5165_113_0 = spill5165_6;
        break forward_join_113;
    }
    forwardValue5165_85_0 = ((net.minecraft.entity.monster.EntityPigZombie)(spill5165_6)).ce;
    }
    if (!((forwardValue5165_85_0 > 0))) {
        break forward_join_112;
    }
    spill5165_7 = this;
    if (!((life3_9 == null))) {
        forwardValue5165_113_0 = spill5165_7;
        break forward_join_113;
    }
    if (!((((net.minecraft.entity.monster.EntityPigZombie)(spill5165_7)).cg != null))) {
        break forward_join_112;
    }
    spill5165_8 = this;
    if (!((life3_9 == null))) {
        forwardValue5165_113_0 = spill5165_8;
        break forward_join_113;
    }
    if (!((((net.minecraft.entity.monster.EntityPigZombie)(spill5165_8)).a__sG() == null))) {
        break forward_join_112;
    }
    life5_155 = ((net.minecraft.world.World)(this.i)).a(((java.util.UUID)(this.cg)));
    ((net.minecraft.entity.monster.EntityPigZombie)(this)).b(((net.minecraft.entity.EntityLivingBase)(life5_155)));
    this.a7 = ((net.minecraft.entity.player.EntityPlayer)(life5_155));
    this.a8 = ((int)(((net.minecraft.entity.monster.EntityPigZombie)(this)).a__Int()));
    }
    forwardValue5165_113_0 = this;
    }
    __sourceIntrinsic_ebf98100c39e_call5165_40(forwardValue5165_113_0);
    return;
}


public boolean O__Boolean() {
int forwardValue5164_22_0;
    int forwardValue5164_30_0;
    int forwardValue5164_34_0;
    int forwardValue5164_36_0;
    boolean spill5164_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_22: {
    life1_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 118517850550807L);
    life3_5 = moom.vN.b();
    spill5164_0 = ((net.minecraft.world.World)(this.i)).a(((moom.CA)(((net.minecraft.entity.monster.EntityPigZombie)(this)).b())), ((net.minecraft.entity.Entity)(this)));
    if (!((life3_5 == null))) {
        forwardValue5164_22_0 = ((spill5164_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill5164_0)) {
        break forward_join_35;
    }
    forwardValue5164_22_0 = ((((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.monster.EntityPigZombie)(this)).b()))))).isEmpty()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5164_30_0 = forwardValue5164_22_0;
        break forward_join_30;
    }
    if (!((forwardValue5164_22_0 != 0))) {
        break forward_join_35;
    }
    forwardValue5164_30_0 = ((((net.minecraft.world.World)(this.i)).c(((moom.CA)(((net.minecraft.entity.monster.EntityPigZombie)(this)).b())))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5164_34_0 = forwardValue5164_30_0;
        break forward_join_34;
    }
    if (!((forwardValue5164_30_0 == 0))) {
        break forward_join_35;
    }
    forwardValue5164_34_0 = 1;
    }
    forwardValue5164_36_0 = forwardValue5164_34_0;
    break forward_join_36;
    }
    forwardValue5164_36_0 = 0;
    }
    return ((forwardValue5164_36_0) != 0);
}


public boolean af() {
int forwardValue5167_12_0;
    int forwardValue5167_14_0;
    int spill5167_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.monster.EntityPigZombie.db ^ 80321827964860L);
    life3_5 = moom.vN.b();
    spill5167_0 = this.ce;
    if (!((life3_5 == null))) {
        forwardValue5167_12_0 = spill5167_0;
        break forward_join_12;
    }
    if (!((spill5167_0 > 0))) {
        break forward_join_13;
    }
    forwardValue5167_12_0 = 1;
    }
    forwardValue5167_14_0 = forwardValue5167_12_0;
    break forward_join_14;
    }
    forwardValue5167_14_0 = 0;
    }
    return ((forwardValue5167_14_0) != 0);
}


private static native <E extends Throwable> void __sourceIntrinsic_ebf98100c39e_call5165_40(net.minecraft.entity.monster.EntityPigZombie a0) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_a628b713ec83_call5168_2(net.minecraft.entity.monster.EntityPigZombie a0, net.minecraft.entity.EntityLivingBase a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11480_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbff4fe7bc61_invokedynamic665_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbff4fe7bc61_invokedynamic665_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cbff4fe7bc61_invokedynamic665_8(int a0, long a1) throws E;
}
