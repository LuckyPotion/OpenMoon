package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityBlaze extends moom.sZ {

private float b5;

private int b6;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public EntityBlaze(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_7a5882199e92217a(net.minecraft.entity.monster.EntityBlaze receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 40055368151040L);
    net.minecraft.entity.monster.EntityBlaze.__sourceConstructorInit_7a5882199e92217a_0(((net.minecraft.entity.monster.EntityBlaze)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityBlaze)(receiver)).b5 = ((float)(0x1.0p-1f));
    ((net.minecraft.entity.monster.EntityBlaze)(receiver)).ak = ((boolean)(true));
    ((net.minecraft.entity.monster.EntityBlaze)(receiver)).bD = ((int)(__sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_4(29837, (8351247279222390959L ^ local2))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.vb(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.uG(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bJ)).a(((int)(__sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_11(29714, (4417212635542356018L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bJ)).a(((int)(__sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_14(5162, (1983385554542605L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bJ)).a(((int)(__sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_18(17104, (2525067176824289009L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, true, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityBlaze)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.player.EntityPlayer.class, true))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(3682542783911274544L)), ((long)(-7897888335951135380L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(277738412654895L)))));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 83227294930898L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1866_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1866_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1866_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1866_14 = new byte[8];
    (__sourceSpill1866_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1866_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1866_16 = __sourceSpill1866_14;
    ((javax.crypto.Cipher)(__sourceSpill1866_11)).init(((int)(__sourceSpill1866_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1866_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1866_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ê\036ê0;4,~ã ý9Váç»Q¦\"u:²ø´l\033gd\002Íþ¹å1È]ãôrªÞùHÊæ@i ±ÀÒ-\030¹ÚdÜO;ºRT"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1866_25 = local6_life21;
        int __sourceSpill1866_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1866_25)).substring(((int)(__sourceSpill1866_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1866_30 = local8_life19;
        int __sourceSpill1866_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1866_33 = new byte[8];
        (__sourceSpill1866_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1866_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1866_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1866_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1866_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1866_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1866_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1866_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1866_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1866_34)).doFinal(((byte[])(__sourceSpill1866_33)));
        (__sourceSpill1866_30)[__sourceSpill1866_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "iò¹xÕkèz,} ÅfF"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1866_38 = local6_life21;
        int __sourceSpill1866_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1866_38)).substring(((int)(__sourceSpill1866_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1866_43 = local8_life19;
        int __sourceSpill1866_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1866_46 = new byte[8];
        (__sourceSpill1866_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1866_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1866_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1866_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1866_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1866_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1866_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1866_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1866_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1866_47)).doFinal(((byte[])(__sourceSpill1866_46)));
        (__sourceSpill1866_43)[__sourceSpill1866_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[10]));
}

private static native <E extends Throwable> void __sourceConstructorInit_7a5882199e92217a_0(net.minecraft.entity.monster.EntityBlaze a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.blaze.breathe";
}


protected void b(boolean p0, int p1) {
int lexicalValue1579_16_0;
    boolean spill1579_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_22;
    int life7_24;
    lexical_join_30: {
    lexical_join_16: {
    life3_3 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 69280636330401L);
    life5_5 = moom.vN.b();
    spill1579_0 = p0;
    if (!((life5_5 == null))) {
        lexicalValue1579_16_0 = ((spill1579_0) ? 1 : 0);
        break lexical_join_16;
    }
    if (!(spill1579_0)) {
        break lexical_join_30;
    }
    lexicalValue1579_16_0 = ((java.util.Random)(this.ah)).nextInt(((int)((2 + p1))));
    }
    life6_22 = lexicalValue1579_16_0;
    life7_24 = 0;
    lexical_cycle_19: while (true) {
    if (!((life7_24 < life6_22))) {
        break lexical_join_30;
    }
    ((net.minecraft.entity.monster.EntityBlaze)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bk)), ((int)(1)));
    life7_24 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11407_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17171;
      if (jb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])xb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               xb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/s1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityBlaze.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected java.lang.String c__String() {
return "mob.blaze.hit";
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected java.lang.String h__String() {
return "mob.blaze.death";
}


public void l(boolean p0) {
int forwardValue5109_34_0;
    net.minecraft.entity.Entity[] spill5109_0;
    boolean spill5109_1;
    long life2_3;
    int life5_13;
    net.minecraft.entity.Entity[] life4_14;
    forward_join_35: {
    forward_join_34: {
    forward_join_26: {
    life2_3 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 34997387561072L);
    spill5109_0 = moom.vN.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5109_3(22597, (4118277474776634387L ^ life2_3)))));
    life4_14 = spill5109_0;
    spill5109_1 = p0;
    if (!((life4_14 == null))) {
        forwardValue5109_34_0 = ((spill5109_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!(spill5109_1)) {
        break forward_join_26;
    }
    life5_13 = ((byte) (life5_13 | 1));
    if (!((life4_14 != null))) {
        break forward_join_35;
    }
    }
    forwardValue5109_34_0 = ((int)(((byte) (life5_13 & __sourceIntrinsic_93fe014f0768_invokedynamic5109_6(5512, (661566881252088284L ^ life2_3))))));
    }
    life5_13 = forwardValue5109_34_0;
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5109_9(12367, (4650643414376725532L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(life5_13))))));
    return;
}


public void d(float p0, float p1) {
return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 134824994555384L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1929_3(12367, (4650532591149904276L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.bk;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityBlaze)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.8p2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityBlaze)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.d70a3ep-3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityBlaze)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.8p5d)));
    return;
}


public int a__Int(float p0) {
long local2 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 119032826346849L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1930_1(2988, (7522640174706733792L ^ local2));
}


public float a(float p0) {
return 0x1.0p0f;
}


public boolean r__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.entity.monster.EntityBlaze)(this)).ac())) != 0);
}


public boolean ac() {
int forwardValue5107_20_0;
    int forwardValue5107_22_0;
    int spill5107_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 137612396536171L);
    life3_5 = moom.vN.b();
    spill5107_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_d73cace8ce31_invokedynamic5107_3(12367, (4650535576124429575L ^ life1_3))))) & 1);
    if (!((life3_5 == null))) {
        forwardValue5107_20_0 = spill5107_0;
        break forward_join_20;
    }
    if (!((spill5107_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5107_20_0 = 1;
    }
    forwardValue5107_22_0 = forwardValue5107_20_0;
    break forward_join_22;
    }
    forwardValue5107_22_0 = 0;
    }
    return ((forwardValue5107_22_0) != 0);
}


protected void R() {
int forwardValue5106_26_0;
    net.minecraft.entity.EntityLivingBase forwardValue5106_46_0;
    boolean spill5106_0;
    net.minecraft.entity.monster.EntityBlaze spill5106_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.EntityLivingBase life4_58;
    forward_join_85: {
    forward_join_83: {
    forward_join_46: {
    forward_join_44: {
    forward_join_26: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 104302818682377L);
    life3_5 = moom.vN.b();
    spill5106_0 = ((net.minecraft.entity.monster.EntityBlaze)(this)).i__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5106_26_0 = ((spill5106_0) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill5106_0)) {
        break forward_join_16;
    }
    ((net.minecraft.entity.monster.EntityBlaze)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.f)), ((float)(0x1.0p0f)));
    }
    net.minecraft.entity.monster.EntityBlaze __stackOp5106_6_0 = this;
    ((net.minecraft.entity.monster.EntityBlaze)(__stackOp5106_6_0)).b6 = ((int)((((net.minecraft.entity.monster.EntityBlaze)(__stackOp5106_6_0)).b6 - 1)));
    spill5106_1 = this;
    if (!((life3_5 == null))) {
        forwardValue5106_46_0 = spill5106_1;
        break forward_join_46;
    }
    forwardValue5106_26_0 = ((net.minecraft.entity.monster.EntityBlaze)(spill5106_1)).b6;
    }
    if (!((forwardValue5106_26_0 <= 0))) {
        break forward_join_44;
    }
    this.b6 = ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5106_10(17285, (394294671069716905L ^ life1_3))));
    this.b5 = ((float)((0x1.0p-1f + (((float) ((java.util.Random)(this.ah)).nextGaussian()) * 0x1.8p1f))));
    }
    forwardValue5106_46_0 = ((net.minecraft.entity.monster.EntityBlaze)(this)).d__sourceReturn_d30556f370();
    }
    life4_58 = forwardValue5106_46_0;
    if (!((life3_5 == null))) {
        break forward_join_85;
    }
    if (!((life4_58 != null))) {
        break forward_join_83;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)((((net.minecraft.entity.EntityLivingBase)(life4_58)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(life4_58)).e__Float())))), ((double)(((this.o + ((double) ((net.minecraft.entity.monster.EntityBlaze)(this)).e__Float())) + ((double) this.b5))))) > 0))) {
        break forward_join_83;
    }
    net.minecraft.entity.monster.EntityBlaze __stackOp5106_22_0 = this;
    ((net.minecraft.entity.monster.EntityBlaze)(__stackOp5106_22_0)).u = ((double)((((net.minecraft.entity.monster.EntityBlaze)(__stackOp5106_22_0)).u + ((0x1.333334p-2d - this.u) * 0x1.333334p-2d))));
    this.ad = ((boolean)(true));
    }
    super.R();
    }
    return;
}


protected boolean ab() {
return ((1) != 0);
}


public void G() {
int lexicalValue1578_29_0;
    int lexicalValue1578_76_0;
    net.minecraft.entity.monster.EntityBlaze lexicalValue1578_129_0;
    boolean spill1578_0;
    int spill1578_1;
    net.minecraft.entity.monster.EntityBlaze spill1578_2;
    int spill1578_3;
    boolean spill1578_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_106;
    lexical_join_130: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_76: {
    lexical_join_75: {
    lexical_join_29: {
    lexical_join_24: {
    life1_3 = (net.minecraft.entity.monster.EntityBlaze.cb ^ 123430026400675L);
    life3_5 = moom.vN.b();
    spill1578_0 = this.A;
    if (!((life3_5 == null))) {
        lexicalValue1578_29_0 = ((spill1578_0) ? 1 : 0);
        break lexical_join_29;
    }
    if (!((!spill1578_0))) {
        break lexical_join_24;
    }
    spill1578_1 = recovery.source.CarrierOps.dcmpg(((double)(this.u)), ((double)(0x0.0p0d)));
    if (!((life3_5 == null))) {
        lexicalValue1578_29_0 = spill1578_1;
        break lexical_join_29;
    }
    if (!((spill1578_1 < 0))) {
        break lexical_join_24;
    }
    net.minecraft.entity.monster.EntityBlaze __stackOp1578_6_0 = this;
    ((net.minecraft.entity.monster.EntityBlaze)(__stackOp1578_6_0)).u = ((double)((((net.minecraft.entity.monster.EntityBlaze)(__stackOp1578_6_0)).u * 0x1.3333333333333p-1d)));
    }
    spill1578_2 = this;
    if (!((life3_5 == null))) {
        lexicalValue1578_129_0 = spill1578_2;
        break lexical_join_129;
    }
    lexicalValue1578_29_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityBlaze)(spill1578_2)).i)).G) ? 1 : 0);
    }
    if (!((lexicalValue1578_29_0 != 0))) {
        break lexical_join_128;
    }
    spill1578_3 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic1578_13(17763, (6958735216501691116L ^ life1_3)))));
    if (!((life3_5 == null))) {
        lexicalValue1578_76_0 = spill1578_3;
        break lexical_join_76;
    }
    if (!((spill1578_3 == 0))) {
        break lexical_join_75;
    }
    spill1578_4 = ((net.minecraft.entity.monster.EntityBlaze)(this)).f__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1578_76_0 = ((spill1578_4) ? 1 : 0);
        break lexical_join_76;
    }
    if (!((!spill1578_4))) {
        break lexical_join_75;
    }
    ((net.minecraft.world.World)(this.i)).a(((double)((this.n + 0x1.0p-1d))), ((double)((this.o + 0x1.0p-1d))), ((double)((this.p + 0x1.0p-1d))), ((java.lang.String)("fire.fire")), ((float)((0x1.0p0f + ((java.util.Random)(this.ah)).nextFloat()))), ((float)(((((java.util.Random)(this.ah)).nextFloat() * 0x1.666666p-1f) + 0x1.333334p-2f))), ((boolean)(false)));
    }
    lexicalValue1578_76_0 = 0;
    }
    life4_106 = lexicalValue1578_76_0;
    lexical_cycle_77: while (true) {
    if (!((life4_106 < 2))) {
        break lexical_join_128;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_LARGE)), ((double)((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)((this.o + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H))))), ((double)((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life4_106 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_130;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_77; }
    break lexical_cycle_77;
    }
    }
    lexicalValue1578_129_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call1578_41(lexicalValue1578_129_0);
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a5882199e92217a_originalDynamicSite3357_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1578_13(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call1578_41(net.minecraft.entity.monster.EntityBlaze a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5106_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1930_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_invokedynamic5107_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1929_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11407_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5109_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5109_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5109_9(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
