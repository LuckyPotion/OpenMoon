package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityGhast extends moom.td implements moom.vP {

private int bX;

private static long db;

private static long[] eb;

private static java.lang.Integer[] ib;

private static java.util.Map jb;

public EntityGhast(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_baebb2a7a14152e7(net.minecraft.entity.monster.EntityGhast receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.monster.EntityGhast.db ^ 51127613656497L);
    net.minecraft.entity.monster.EntityGhast.__sourceConstructorInit_baebb2a7a14152e7_0(((net.minecraft.entity.monster.EntityGhast)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityGhast)(receiver)).bX = ((int)(1));
    ((net.minecraft.entity.monster.EntityGhast)(receiver)).a__Void(((float)(0x1.0p2f)), ((float)(0x1.0p2f)));
    ((net.minecraft.entity.monster.EntityGhast)(receiver)).ak = ((boolean)(true));
    ((net.minecraft.entity.monster.EntityGhast)(receiver)).bD = ((int)(__sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_5(4693, (4288319848472813999L ^ local2))));
    ((net.minecraft.entity.monster.EntityGhast)(receiver)).bF = ((net.minecraft.entity.ai.EntityMoveHelper)(new moom.vv(receiver)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGhast)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.vg(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGhast)(receiver)).bJ)).a(((int)(__sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_11(18430, (560473759861666816L ^ local2)))), ((moom.uc)(new moom.vf(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGhast)(receiver)).bJ)).a(((int)(__sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_14(26094, (6487891263529276951L ^ local2)))), ((moom.uc)(new moom.ve(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityGhast)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.ur(receiver))));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_baebb2a7a14152e7_0(net.minecraft.entity.monster.EntityGhast a0, net.minecraft.world.World a1) throws E;

static {
db = ((long)(((moom._a)(moom._c.a(((long)(3353415157455646133L)), ((long)(3471473707848524068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189876387998386L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityGhast.db ^ 121864933331852L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1870_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1870_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1870_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1870_14 = new byte[8];
    (__sourceSpill1870_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1870_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1870_16 = __sourceSpill1870_14;
    ((javax.crypto.Cipher)(__sourceSpill1870_11)).init(((int)(__sourceSpill1870_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1870_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1870_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "1\025»\0376\024\021Ì¼¤ìÙ:&\031°cCHôi°Â\"%ríT®Ñ\rqëß"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1870_25 = local6_life21;
        int __sourceSpill1870_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1870_25)).substring(((int)(__sourceSpill1870_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1870_30 = local8_life19;
        int __sourceSpill1870_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1870_33 = new byte[8];
        (__sourceSpill1870_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1870_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1870_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1870_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1870_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1870_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1870_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1870_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1870_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1870_34)).doFinal(((byte[])(__sourceSpill1870_33)));
        (__sourceSpill1870_30)[__sourceSpill1870_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ";0×¤2÷¦ªøTxP¼ï"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1870_38 = local6_life21;
        int __sourceSpill1870_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1870_38)).substring(((int)(__sourceSpill1870_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1870_43 = local8_life19;
        int __sourceSpill1870_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1870_46 = new byte[8];
        (__sourceSpill1870_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1870_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1870_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1870_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1870_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1870_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1870_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1870_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1870_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1870_47)).doFinal(((byte[])(__sourceSpill1870_46)));
        (__sourceSpill1870_43)[__sourceSpill1870_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    eb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


protected java.lang.String i__String() {
return "mob.ghast.moan";
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.Entity[] spill1585_0;
    long life3_3;
    int life6_16;
    int life7_18;
    net.minecraft.entity.Entity[] life5_19;
    int life7_49;
    lexical_join_58: {
    lexical_join_45: {
    lexical_join_33: {
    life3_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 106350042888510L);
    spill1585_0 = moom.vN.b();
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(2))) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    life7_18 = 0;
    life5_19 = spill1585_0;
    lexical_cycle_20: while (true) {
    if (!((life7_18 < life6_16))) {
        break lexical_join_33;
    }
    ((net.minecraft.entity.monster.EntityGhast)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bl)), ((int)(1)));
    life7_18 += 1;
    if (!((life5_19 == null))) {
        break lexical_join_45;
    }
    if (!((life5_19 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(3))) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    }
    life7_49 = 0;
    lexical_cycle_47: while (true) {
    if (!((life7_49 < life6_16))) {
        break lexical_join_58;
    }
    ((net.minecraft.entity.monster.EntityGhast)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.H)), ((int)(1)));
    life7_49 += 1;
    if (!((life5_19 != null))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    return;
}


public float e__Float() {
return 0x1.4cccccp1f;
}


protected java.lang.String c__String() {
return "mob.ghast.scream";
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.monster.EntityGhast forwardValue5134_22_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5134_22_1;
    net.minecraft.entity.monster.EntityGhast spill5134_0;
    net.minecraft.nbt.NBTTagCompound spill5134_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_25: {
    forward_join_22: {
    life2_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 89265164607796L);
    life4_5 = moom.vN.b();
    spill5134_0 = this;
    spill5134_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue5134_22_0 = spill5134_0;
        forwardValue5134_22_1 = spill5134_1;
        break forward_join_22;
    }
    __sourceIntrinsic_01f4e1cd062e_call5134_2(spill5134_0, spill5134_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ExplosionPower")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5134_3(5130, (8518442814608821106L ^ life2_3))))))) {
        break forward_join_25;
    }
    forwardValue5134_22_0 = this;
    forwardValue5134_22_1 = p0;
    }
    ((net.minecraft.entity.monster.EntityGhast)(forwardValue5134_22_0)).bX = ((int)(((net.minecraft.nbt.NBTTagCompound)(forwardValue5134_22_1)).a__Int(((java.lang.String)("ExplosionPower")))));
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public int n__Int() {
return 1;
}


protected java.lang.String h__String() {
return "mob.ghast.death";
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.4p3f;
}


public void l(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue5136_18_0;
    int forwardValue5136_18_1;
    int forwardValue5136_18_2;
    net.minecraft.entity.DataWatcher forwardValue5136_19_0;
    int forwardValue5136_19_1;
    net.minecraft.entity.DataWatcher forwardValue5136_20_0;
    int forwardValue5136_20_1;
    int forwardValue5136_20_2;
    net.minecraft.entity.DataWatcher spill5136_0;
    int spill5136_1;
    boolean spill5136_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 32631009701862L);
    life4_5 = moom.vN.b();
    spill5136_0 = this.al;
    spill5136_1 = __sourceIntrinsic_93fe014f0768_invokedynamic5136_3(12449, (927374817064771853L ^ life2_3));
    spill5136_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue5136_18_0 = spill5136_0;
        forwardValue5136_18_1 = spill5136_1;
        forwardValue5136_18_2 = ((spill5136_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5136_2)) {
        forwardValue5136_19_0 = spill5136_0;
        forwardValue5136_19_1 = spill5136_1;
        break forward_join_19;
    }
    forwardValue5136_18_0 = spill5136_0;
    forwardValue5136_18_1 = spill5136_1;
    forwardValue5136_18_2 = 1;
    }
    forwardValue5136_20_0 = forwardValue5136_18_0;
    forwardValue5136_20_1 = forwardValue5136_18_1;
    forwardValue5136_20_2 = forwardValue5136_18_2;
    break forward_join_20;
    }
    forwardValue5136_20_0 = forwardValue5136_19_0;
    forwardValue5136_20_1 = forwardValue5136_19_1;
    forwardValue5136_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5136_20_0)).b(((int)(forwardValue5136_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5136_20_2)))))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8675;
      if (ib[var3] == null) {
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
         long var5 = eb[var3];
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/te", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityGhast.db ^ 40837771205991L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1942_3(12449, (927331348084724620L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11439_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/te"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("ExplosionPower")), ((int)(this.bX)));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityGhast.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5132_18_0;
    int forwardValue5132_43_0;
    boolean spill5132_0;
    int spill5132_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_43: {
    forward_join_39: {
    forward_join_18: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 60369347273142L);
    life5_5 = moom.vN.b();
    spill5132_0 = ((net.minecraft.entity.monster.EntityGhast)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == null))) {
        forwardValue5132_18_0 = ((spill5132_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5132_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5132_18_0 = ((((java.lang.String)("fireball")).equals(((java.lang.Object)(((net.minecraft.util.DamageSource)(p0)).a__String())))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue5132_43_0 = forwardValue5132_18_0;
        break forward_join_43;
    }
    if (!((forwardValue5132_18_0 != 0))) {
        break forward_join_39;
    }
    spill5132_1 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue5132_43_0 = spill5132_1;
        break forward_join_43;
    }
    if (!((spill5132_1 != 0))) {
        break forward_join_39;
    }
    super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(0x1.f4p9f)));
    ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).a(((moom.BY)(net.minecraft.stats.AchievementList.z)));
    return ((1) != 0);
    }
    forwardValue5132_43_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5132_43_0) != 0);
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.H;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGhast)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityGhast)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.9p6d)));
    return;
}


public int o__sourceReturn_8abf5c6871() {
return this.bX;
}


public void g__Void() {
net.minecraft.world.World forwardValue5135_18_0;
    net.minecraft.entity.monster.EntityGhast forwardValue5135_22_0;
    net.minecraft.entity.Entity[] spill5135_0;
    net.minecraft.world.World spill5135_1;
    net.minecraft.entity.monster.EntityGhast spill5135_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 111999521001024L);
    spill5135_0 = moom.vN.b();
    super.g__Void();
    life3_7 = spill5135_0;
    spill5135_1 = this.i;
    if (!((life3_7 == null))) {
        forwardValue5135_18_0 = spill5135_1;
        break forward_join_18;
    }
    if (!((!((net.minecraft.world.World)(spill5135_1)).G))) {
        break forward_join_23;
    }
    spill5135_2 = this;
    if (!((life3_7 == null))) {
        forwardValue5135_22_0 = spill5135_2;
        break forward_join_22;
    }
    forwardValue5135_18_0 = ((net.minecraft.entity.monster.EntityGhast)(spill5135_2)).i;
    }
    if (!((((net.minecraft.world.World)(forwardValue5135_18_0)).a__bB() == net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_23;
    }
    forwardValue5135_22_0 = this;
    }
    ((net.minecraft.entity.monster.EntityGhast)(forwardValue5135_22_0)).f__Void();
    }
    return;
}


public boolean N__Boolean() {
int forwardValue5130_21_0;
    net.minecraft.entity.monster.EntityGhast forwardValue5130_23_0;
    int forwardValue5130_30_0;
    int spill5130_0;
    net.minecraft.entity.monster.EntityGhast spill5130_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_23: {
    forward_join_21: {
    life1_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 33344016842442L);
    life3_5 = moom.vN.b();
    spill5130_0 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_a97bfb6c3ddd_invokedynamic5130_3(15926, (5663166032902061749L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5130_21_0 = spill5130_0;
        break forward_join_21;
    }
    if (!((spill5130_0 == 0))) {
        break forward_join_29;
    }
    spill5130_1 = this;
    if (!((life3_5 == null))) {
        forwardValue5130_23_0 = spill5130_1;
        break forward_join_23;
    }
    forwardValue5130_21_0 = ((__sourceIntrinsic_a97bfb6c3ddd_call5130_5(spill5130_1)) ? 1 : 0);
    }
    if (!((forwardValue5130_21_0 != 0))) {
        break forward_join_29;
    }
    forwardValue5130_23_0 = this;
    }
    if (!((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityGhast)(forwardValue5130_23_0)).i)).a__bB() != net.minecraft.world.EnumDifficulty.PEACEFUL))) {
        break forward_join_29;
    }
    forwardValue5130_30_0 = 1;
    break forward_join_30;
    }
    forwardValue5130_30_0 = 0;
    }
    return ((forwardValue5130_30_0) != 0);
}


public boolean Y() {
int forwardValue5131_18_0;
    int forwardValue5131_20_0;
    byte spill5131_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityGhast.db ^ 128430879965647L);
    life3_5 = moom.vN.b();
    spill5131_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_b8853d294699_invokedynamic5131_3(11116, (8094868385795314925L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5131_18_0 = ((int)(spill5131_0));
        break forward_join_18;
    }
    if (!((spill5131_0 != 0))) {
        break forward_join_19;
    }
    forwardValue5131_18_0 = 1;
    }
    forwardValue5131_20_0 = forwardValue5131_18_0;
    break forward_join_20;
    }
    forwardValue5131_20_0 = 0;
    }
    return ((forwardValue5131_20_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_baebb2a7a14152e7_originalDynamicSite3860_14(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_01f4e1cd062e_call5134_2(net.minecraft.entity.monster.EntityGhast a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5134_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5136_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1942_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11439_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5130_3(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_a97bfb6c3ddd_call5130_5(net.minecraft.entity.monster.EntityGhast a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b8853d294699_invokedynamic5131_3(int a0, long a1) throws E;
}
