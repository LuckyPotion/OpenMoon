package net.minecraft.entity.boss;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityWither extends moom.sZ implements net.minecraft.entity.boss.IBossDisplayData, net.minecraft.entity.IRangedAttackMob {

private float[] b5;

private float[] b6;

private float[] b7;

private float[] b8;

private int[] b9;

private int[] b_;

private int ca;

private static com.google.common.base.Predicate<net.minecraft.entity.Entity> cb;

private static long db;

private static long[] jb;

private static java.lang.Integer[] xb;

private static java.util.Map yb;

public EntityWither(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_99b7487b238fc6e3(net.minecraft.entity.boss.EntityWither receiver, net.minecraft.world.World p0) throws Throwable {
long local2_life1 = (net.minecraft.entity.boss.EntityWither.db ^ 32154450330436L);
    net.minecraft.entity.boss.EntityWither.__sourceConstructorInit_99b7487b238fc6e3_0(((net.minecraft.entity.boss.EntityWither)(receiver)), ((net.minecraft.world.World)(p0)));
    net.minecraft.entity.Entity[] __sourceSpill932_5 = moom.vJ.b();
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b5 = ((float[])(new float[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b6 = ((float[])(new float[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b7 = ((float[])(new float[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b8 = ((float[])(new float[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b9 = ((int[])(new int[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).b_ = ((int[])(new int[2]));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).d(((float)(((net.minecraft.entity.boss.EntityWither)(receiver)).a())));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).a__Void(((float)(0x1.ccccccp-1f)), ((float)(0x1.cp1f)));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).ak = ((boolean)(true));
    ((moom.AW)(((moom.AW)(__sourceExactCall_44cde2d029d1f2(((net.minecraft.entity.boss.EntityWither)(receiver))))))).d(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    net.minecraft.entity.Entity[] local4_life20 = __sourceSpill932_5;
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ud(receiver, 0x1.0p0d, __sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_22(4945, (2839626181153689611L ^ local2_life1)), 0x1.4p4f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bJ)).a(((int)(__sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_27(13872, (2951250219265373550L ^ local2_life1)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bJ)).a(((int)(__sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_31(27058, (7841936214981339883L ^ local2_life1)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.boss.EntityWither)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.EntityLiving.class, 0, false, false, net.minecraft.entity.boss.EntityWither.cb))));
    ((net.minecraft.entity.boss.EntityWither)(receiver)).bD = ((int)(__sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_39(28769, (2427795247885022000L ^ local2_life1))));
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.vJ.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));
    }
    return;
}


static {
db = ((long)(((moom._a)(moom._c.a(((long)(4935627261995233694L)), ((long)(5810824773809899296L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(69871838788797L)))));
    yb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.boss.EntityWither.db ^ 7775006177288L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1857_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1857_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1857_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1857_14 = new byte[8];
    (__sourceSpill1857_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1857_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1857_16 = __sourceSpill1857_14;
    ((javax.crypto.Cipher)(__sourceSpill1857_11)).init(((int)(__sourceSpill1857_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1857_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1857_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[21];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ËY^Áä\036ÖSLîïtl¾åxµÇÓ@á.P&àn«\0332î&túïp­÷÷êÌõô½\022¿N^¡w01\033n´\032Kj\022¹|\017×¢haØ®\034\bÓ÷c#È±XÝ7±­ÐA>ïÛ¶À3×Ô\023Rÿ_5\b\002D/÷S\002´ñüqdÓÕ¥7êÆ\0328UWÆaÑÿëÂO\023 ¹Çm`Ñõ\016\"¬"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1857_25 = local6_life21;
        int __sourceSpill1857_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1857_25)).substring(((int)(__sourceSpill1857_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1857_30 = local8_life19;
        int __sourceSpill1857_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1857_33 = new byte[8];
        (__sourceSpill1857_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1857_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1857_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1857_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1857_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1857_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1857_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1857_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1857_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1857_34)).doFinal(((byte[])(__sourceSpill1857_33)));
        (__sourceSpill1857_30)[__sourceSpill1857_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "QºY·\035ç\177\021\020\002,þ¼Ó"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1857_38 = local6_life21;
        int __sourceSpill1857_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1857_38)).substring(((int)(__sourceSpill1857_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1857_43 = local8_life19;
        int __sourceSpill1857_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1857_46 = new byte[8];
        (__sourceSpill1857_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1857_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1857_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1857_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1857_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1857_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1857_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1857_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1857_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1857_47)).doFinal(((byte[])(__sourceSpill1857_46)));
        (__sourceSpill1857_43)[__sourceSpill1857_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    jb = ((long[])(local8_life19));
    xb = ((java.lang.Integer[])(new java.lang.Integer[21]));
    cb = ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1857_52()));
}

private static native <E extends Throwable> void __sourceConstructorInit_99b7487b238fc6e3_0(net.minecraft.entity.boss.EntityWither a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.wither.idle";
}


private double b__sourceReturn_acc714779d(int p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 31123237826573L);
    return ((p0 <= 0) ? (this.o + 0x1.8p1d) : (this.o + 0x1.199999999999ap1d));
}


private float b(float p0, float p1, float p2) {
int forwardValue5018_25_0;
    float forwardValue5018_31_0;
    float forwardValue5018_31_1;
    net.minecraft.entity.Entity[] spill5018_0;
    int spill5018_1;
    float spill5018_2;
    float spill5018_3;
    long life4_3;
    float life7_9;
    net.minecraft.entity.Entity[] life6_10;
    forward_join_31: {
    forward_join_29: {
    forward_join_25: {
    forward_join_19: {
    life4_3 = (net.minecraft.entity.boss.EntityWither.db ^ 105735093305248L);
    spill5018_0 = moom.vJ.b();
    life7_9 = moom.Dr.e(((float)((p1 - p0))));
    life6_10 = spill5018_0;
    spill5018_1 = recovery.source.CarrierOps.fcmpl(((float)(life7_9)), ((float)(p2)));
    if (!((life6_10 == null))) {
        forwardValue5018_25_0 = spill5018_1;
        break forward_join_25;
    }
    if (!((spill5018_1 > 0))) {
        break forward_join_19;
    }
    life7_9 = p2;
    }
    spill5018_2 = life7_9;
    spill5018_3 = (-p2);
    if (!((life6_10 == null))) {
        forwardValue5018_31_0 = spill5018_2;
        forwardValue5018_31_1 = spill5018_3;
        break forward_join_31;
    }
    forwardValue5018_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill5018_2)), ((float)(spill5018_3)));
    }
    if (!((forwardValue5018_25_0 < 0))) {
        break forward_join_29;
    }
    life7_9 = (-p2);
    }
    forwardValue5018_31_0 = p0;
    forwardValue5018_31_1 = life7_9;
    }
    return (forwardValue5018_31_0 + forwardValue5018_31_1);
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.item.EntityItem lexicalValue1568_16_0;
    net.minecraft.world.World lexicalValue1568_25_0;
    net.minecraft.entity.Entity[] spill1568_0;
    net.minecraft.entity.item.EntityItem spill1568_1;
    net.minecraft.world.World spill1568_2;
    long life3_3;
    net.minecraft.entity.item.EntityItem life6_9;
    net.minecraft.entity.Entity[] life5_10;
    java.util.Iterator life7_43;
    net.minecraft.entity.player.EntityPlayer life8_50;
    lexical_join_47: {
    lexical_join_25: {
    lexical_join_17: {
    lexical_join_16: {
    life3_3 = (net.minecraft.entity.boss.EntityWither.db ^ 125369477635896L);
    spill1568_0 = moom.vJ.b();
    life6_9 = ((net.minecraft.entity.boss.EntityWither)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.bO)), ((int)(1)));
    life5_10 = spill1568_0;
    spill1568_1 = life6_9;
    if (!((life5_10 == null))) {
        lexicalValue1568_16_0 = spill1568_1;
        break lexical_join_16;
    }
    if (!((spill1568_1 != null))) {
        break lexical_join_17;
    }
    lexicalValue1568_16_0 = life6_9;
    }
    ((net.minecraft.entity.item.EntityItem)(lexicalValue1568_16_0)).z__sourceReturn_da8c82d5d4();
    }
    spill1568_2 = this.i;
    if (!((life5_10 == null))) {
        lexicalValue1568_25_0 = spill1568_2;
        break lexical_join_25;
    }
    if (!((!((net.minecraft.world.World)(spill1568_2)).G))) {
        break lexical_join_47;
    }
    lexicalValue1568_25_0 = this.i;
    }
    life7_43 = ((java.util.List)(((net.minecraft.world.World)(lexicalValue1568_25_0)).a(((java.lang.Class)(net.minecraft.entity.player.EntityPlayer.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.boss.EntityWither)(this)).b())).b(((double)(0x1.9p5d)), ((double)(0x1.9p6d)), ((double)(0x1.9p5d)))))))).iterator();
    lexical_cycle_35: while (true) {
    if (!(((java.util.Iterator)(life7_43)).hasNext())) {
        break lexical_join_47;
    }
    life8_50 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life7_43)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(life8_50)).a(((moom.BY)(net.minecraft.stats.AchievementList.J)));
    if (!((life5_10 != null))) { continue lexical_cycle_35; }
    break lexical_cycle_35;
    }
    }
    return;
}


public float b__Float(int p0) {
return (this.b5)[p0];
}


public void b(net.minecraft.entity.Entity p0) {
this.g = ((net.minecraft.entity.Entity)(null));
    return;
}


public int b__Int(int p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 105833789784139L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)((__sourceIntrinsic_1680bc5d1bde_originalDynamicSite1888_2(4712, (7050131241725923903L ^ local2)) + p0))));
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14777;
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
            throw new RuntimeException("moom/s0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         xb[var3] = var15;
      }

      return xb[var3];
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_58a47161204bd2(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11296_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int s() {
long local1 = (net.minecraft.entity.boss.EntityWither.db ^ 47931400138794L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a__Int(((int)(__sourceIntrinsic_421c707d57eb_originalDynamicSite1889_2(20529, (8064548396094545922L ^ local1)))));
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.boss.EntityWither)(this)).l(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Invul"))))));
    return;
}


private double c__sourceReturn_acc714779d(int p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 131761412066852L);
    if ((p0 <= 0)) {
        return this.p;
    }
    float local4 = (((this.a2 + ((float) (__sourceIntrinsic_08aafb25a71c_invokedynamic11297_3(31042, (4358870882289497973L ^ local2)) * (p0 - 1)))) / 0x1.68p7f) * 0x1.921fb6p1f);
    float local5 = moom.Dr.a(((float)(local4)));
    return (this.p + (((double) local5) * 0x1.4cccccccccccdp0d));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected java.lang.String c__String() {
return "mob.wither.hurt";
}


protected java.lang.String h__String() {
return "mob.wither.death";
}


public void l(int p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 123446113011160L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1890_2(12406, (5193602477894219194L ^ local2)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.boss.EntityWither.db ^ 61126502103905L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_3(25951, (760179670933495336L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_7(32688, (5571954120833254595L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_11(28568, (3149848783376241894L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_15(12406, (5193536790836775683L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Invul")), ((int)(((net.minecraft.entity.boss.EntityWither)(this)).s())));
    return;
}


public int d__Int() {
return 4;
}


public void d(float p0, float p1) {
return;
}


public float a__Float(int p0) {
return (this.b6)[p0];
}


public void a__sourceReturn_df16004b03(int p0, int p1) {
long local3 = (net.minecraft.entity.boss.EntityWither.db ^ 11477484284936L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)((__sourceIntrinsic_fd0ba049c90e_originalDynamicSite1892_2(25951, (760139161605294401L ^ local3)) + p0))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))));
    return;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.UNDEAD;
}


public static boolean a(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue5015_13_0;
    net.minecraft.block.Block forwardValue5015_13_1;
    net.minecraft.block.Block forwardValue5015_18_0;
    net.minecraft.block.Block forwardValue5015_18_1;
    net.minecraft.block.Block forwardValue5015_23_0;
    net.minecraft.block.Block forwardValue5015_23_1;
    net.minecraft.block.Block forwardValue5015_28_0;
    net.minecraft.block.Block forwardValue5015_28_1;
    int forwardValue5015_32_0;
    net.minecraft.block.Block spill5015_0;
    net.minecraft.block.Block spill5015_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_28: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.boss.EntityWither.db ^ 102685038203590L);
    life3_5 = moom.vJ.b();
    spill5015_0 = p0;
    spill5015_1 = net.minecraft.init.Blocks.h;
    if (!((life3_5 == null))) {
        forwardValue5015_13_0 = spill5015_0;
        forwardValue5015_13_1 = spill5015_1;
        break forward_join_13;
    }
    if (!((spill5015_0 != spill5015_1))) {
        break forward_join_31;
    }
    forwardValue5015_13_0 = p0;
    forwardValue5015_13_1 = net.minecraft.init.Blocks.bu;
    }
    if (!((life3_5 == null))) {
        forwardValue5015_18_0 = forwardValue5015_13_0;
        forwardValue5015_18_1 = forwardValue5015_13_1;
        break forward_join_18;
    }
    if (!((forwardValue5015_13_0 != forwardValue5015_13_1))) {
        break forward_join_31;
    }
    forwardValue5015_18_0 = p0;
    forwardValue5015_18_1 = net.minecraft.init.Blocks.bv;
    }
    if (!((life3_5 == null))) {
        forwardValue5015_23_0 = forwardValue5015_18_0;
        forwardValue5015_23_1 = forwardValue5015_18_1;
        break forward_join_23;
    }
    if (!((forwardValue5015_18_0 != forwardValue5015_18_1))) {
        break forward_join_31;
    }
    forwardValue5015_23_0 = p0;
    forwardValue5015_23_1 = net.minecraft.init.Blocks.bM;
    }
    if (!((life3_5 == null))) {
        forwardValue5015_28_0 = forwardValue5015_23_0;
        forwardValue5015_28_1 = forwardValue5015_23_1;
        break forward_join_28;
    }
    if (!((forwardValue5015_23_0 != forwardValue5015_23_1))) {
        break forward_join_31;
    }
    forwardValue5015_28_0 = p0;
    forwardValue5015_28_1 = net.minecraft.init.Blocks.b_;
    }
    if (!((forwardValue5015_28_0 != forwardValue5015_28_1))) {
        break forward_join_31;
    }
    forwardValue5015_32_0 = 1;
    break forward_join_32;
    }
    forwardValue5015_32_0 = 0;
    }
    return ((forwardValue5015_32_0) != 0);
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int lexicalValue1567_13_0;
    net.minecraft.util.DamageSource lexicalValue1567_20_0;
    int lexicalValue1567_39_0;
    net.minecraft.entity.Entity lexicalValue1567_52_0;
    int lexicalValue1567_55_0;
    int lexicalValue1567_73_0;
    int lexicalValue1567_84_0;
    net.minecraft.entity.boss.EntityWither lexicalValue1567_104_0;
    int lexicalValue1567_109_0;
    boolean spill1567_0;
    net.minecraft.util.DamageSource spill1567_1;
    int spill1567_2;
    int spill1567_3;
    net.minecraft.entity.boss.EntityWither spill1567_4;
    int spill1567_5;
    int spill1567_6;
    net.minecraft.entity.boss.EntityWither spill1567_7;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    net.minecraft.entity.Entity life6_68;
    int life7_135;
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_73: {
    lexical_join_71: {
    lexical_join_55: {
    lexical_join_52: {
    lexical_join_50: {
    lexical_join_39: {
    lexical_join_35: {
    lexical_join_20: {
    lexical_join_14: {
    lexical_join_13: {
    life3_3 = (net.minecraft.entity.boss.EntityWither.db ^ 39975455737776L);
    life5_5 = moom.vJ.b();
    spill1567_0 = ((net.minecraft.entity.boss.EntityWither)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == null))) {
        lexicalValue1567_13_0 = ((spill1567_0) ? 1 : 0);
        break lexical_join_13;
    }
    if (!(spill1567_0)) {
        break lexical_join_14;
    }
    lexicalValue1567_13_0 = 0;
    }
    return ((lexicalValue1567_13_0) != 0);
    }
    spill1567_1 = p0;
    if (!((life5_5 == null))) {
        lexicalValue1567_20_0 = spill1567_1;
        break lexical_join_20;
    }
    if (!((spill1567_1 != net.minecraft.util.DamageSource.f))) {
        break lexical_join_108;
    }
    lexicalValue1567_20_0 = p0;
    }
    spill1567_2 = ((((net.minecraft.util.DamageSource)(lexicalValue1567_20_0)).b__r3() instanceof net.minecraft.entity.boss.EntityWither) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1567_109_0 = spill1567_2;
        break lexical_join_109;
    }
    if (!((spill1567_2 == 0))) {
        break lexical_join_108;
    }
    spill1567_3 = ((net.minecraft.entity.boss.EntityWither)(this)).s();
    if (!((life5_5 == null))) {
        lexicalValue1567_39_0 = spill1567_3;
        break lexical_join_39;
    }
    if (!((spill1567_3 > 0))) {
        break lexical_join_35;
    }
    if (!((p0 != net.minecraft.util.DamageSource.j))) {
        break lexical_join_35;
    }
    return ((0) != 0);
    }
    spill1567_4 = this;
    if (!((life5_5 == null))) {
        lexicalValue1567_52_0 = spill1567_4;
        break lexical_join_52;
    }
    lexicalValue1567_39_0 = ((((net.minecraft.entity.boss.EntityWither)(spill1567_4)).ac()) ? 1 : 0);
    }
    if (!((lexicalValue1567_39_0 != 0))) {
        break lexical_join_50;
    }
    life6_68 = ((net.minecraft.util.DamageSource)(p0)).a__r3();
    spill1567_5 = ((life6_68 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1567_55_0 = spill1567_5;
        break lexical_join_55;
    }
    if (!((spill1567_5 != 0))) {
        break lexical_join_50;
    }
    return ((0) != 0);
    }
    lexicalValue1567_52_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    life6_68 = lexicalValue1567_52_0;
    lexicalValue1567_55_0 = ((life6_68 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1567_73_0 = lexicalValue1567_55_0;
        break lexical_join_73;
    }
    if (!((lexicalValue1567_55_0 == 0))) {
        break lexical_join_71;
    }
    spill1567_6 = ((life6_68 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1567_73_0 = spill1567_6;
        break lexical_join_73;
    }
    if (!((spill1567_6 != 0))) {
        break lexical_join_71;
    }
    if (!((__sourceExactCall_494ef4347d87f9(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life6_68))))) == __sourceExactCall_1a29a432b942d2(((net.minecraft.entity.boss.EntityWither)(this)))))) {
        break lexical_join_71;
    }
    return ((0) != 0);
    }
    lexicalValue1567_73_0 = this.ca;
    }
    if (!((life5_5 == null))) {
        lexicalValue1567_84_0 = lexicalValue1567_73_0;
        break lexical_join_84;
    }
    if (!((lexicalValue1567_73_0 <= 0))) {
        break lexical_join_83;
    }
    this.ca = ((int)(__sourceIntrinsic_153a193fc182_invokedynamic1567_24(12406, (5193554109929158610L ^ life3_3))));
    }
    lexicalValue1567_84_0 = 0;
    }
    life7_135 = lexicalValue1567_84_0;
    lexical_cycle_85: while (true) {
    if (!((life7_135 < (this.b_).length))) {
        break lexical_join_103;
    }
    spill1567_7 = this;
    if (!((life5_5 == null))) {
        lexicalValue1567_104_0 = spill1567_7;
        break lexical_join_104;
    }
    int[] __stackOp1567_28_0 = ((net.minecraft.entity.boss.EntityWither)(spill1567_7)).b_;
    int __stackOp1567_28_1 = life7_135;
    (__stackOp1567_28_0)[__stackOp1567_28_1] = ((__stackOp1567_28_0)[__stackOp1567_28_1] + 3);
    life7_135 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    lexicalValue1567_104_0 = this;
    }
    return __sourceIntrinsic_153a193fc182_call1567_29(lexicalValue1567_104_0, p0, p1);
    }
    lexicalValue1567_109_0 = 0;
    }
    return ((lexicalValue1567_109_0) != 0);
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1) {
((net.minecraft.entity.boss.EntityWither)(this)).a(((int)(0)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    return;
}


private void a(int p0, double p1, double p2, double p3, boolean p4) {
int forwardValue5013_74_0;
    net.minecraft.entity.Entity[] spill5013_0;
    boolean spill5013_1;
    long life9_3;
    double life12_22;
    double life14_26;
    double life16_30;
    double life18_34;
    double life20_38;
    double life22_42;
    moom.tQ life24_52;
    net.minecraft.entity.Entity[] life11_53;
    forward_join_74: {
    forward_join_61: {
    life9_3 = (net.minecraft.entity.boss.EntityWither.db ^ 105877107868455L);
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_69559b5a2c15_invokedynamic5013_2(105, (9078694209788150617L ^ life9_3)))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    spill5013_0 = moom.vJ.b();
    life12_22 = ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_acc714779d(((int)(p0)));
    life14_26 = ((net.minecraft.entity.boss.EntityWither)(this)).b__sourceReturn_acc714779d(((int)(p0)));
    life16_30 = ((net.minecraft.entity.boss.EntityWither)(this)).c__sourceReturn_acc714779d(((int)(p0)));
    life18_34 = (p1 - life12_22);
    life20_38 = (p2 - life14_26);
    life22_42 = (p3 - life16_30);
    life24_52 = new moom.tQ(this.i, this, life18_34, life20_38, life22_42);
    life11_53 = spill5013_0;
    spill5013_1 = p4;
    if (!((life11_53 == null))) {
        forwardValue5013_74_0 = ((spill5013_1) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill5013_1)) {
        break forward_join_61;
    }
    ((moom.tQ)(life24_52)).h(((boolean)(true)));
    }
    ((moom.tQ)(life24_52)).o = ((double)(life14_26));
    ((moom.tQ)(life24_52)).n = ((double)(life12_22));
    ((moom.tQ)(life24_52)).p = ((double)(life16_30));
    forwardValue5013_74_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life24_52)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5013_74_0);
    return;
}


private void a(int p0, net.minecraft.entity.EntityLivingBase p1) {
net.minecraft.entity.boss.EntityWither forestValue662_29_0;
    int forestValue662_29_1;
    double forestValue662_29_2;
    double forestValue662_29_3;
    double forestValue662_29_4;
    int forestValue662_29_5;
    net.minecraft.entity.boss.EntityWither forestValue662_33_0;
    int forestValue662_33_1;
    double forestValue662_33_2;
    double forestValue662_33_3;
    double forestValue662_33_4;
    int forestValue662_33_5;
    net.minecraft.entity.boss.EntityWither forestValue662_34_0;
    int forestValue662_34_1;
    double forestValue662_34_2;
    double forestValue662_34_3;
    double forestValue662_34_4;
    net.minecraft.entity.boss.EntityWither forestValue662_35_0;
    int forestValue662_35_1;
    double forestValue662_35_2;
    double forestValue662_35_3;
    double forestValue662_35_4;
    int forestValue662_35_5;
    net.minecraft.entity.boss.EntityWither spill662_0;
    int spill662_1;
    double spill662_2;
    double spill662_3;
    double spill662_4;
    int spill662_5;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forest_join_35: {
    forest_join_34: {
    forest_join_33: {
    forest_join_29: {
    life3_3 = (net.minecraft.entity.boss.EntityWither.db ^ 100575211563614L);
    life5_5 = moom.vJ.b();
    spill662_0 = this;
    spill662_1 = p0;
    spill662_2 = ((net.minecraft.entity.EntityLivingBase)(p1)).n;
    spill662_3 = (((net.minecraft.entity.EntityLivingBase)(p1)).o + (((double) ((net.minecraft.entity.EntityLivingBase)(p1)).e__Float()) * 0x1.0p-1d));
    spill662_4 = ((net.minecraft.entity.EntityLivingBase)(p1)).p;
    spill662_5 = p0;
    if (!((life5_5 == null))) {
        forestValue662_29_0 = spill662_0;
        forestValue662_29_1 = spill662_1;
        forestValue662_29_2 = spill662_2;
        forestValue662_29_3 = spill662_3;
        forestValue662_29_4 = spill662_4;
        forestValue662_29_5 = spill662_5;
        break forest_join_29;
    }
    if (!((spill662_5 == 0))) {
        forestValue662_34_0 = spill662_0;
        forestValue662_34_1 = spill662_1;
        forestValue662_34_2 = spill662_2;
        forestValue662_34_3 = spill662_3;
        forestValue662_34_4 = spill662_4;
        break forest_join_34;
    }
    forestValue662_29_0 = spill662_0;
    forestValue662_29_1 = spill662_1;
    forestValue662_29_2 = spill662_2;
    forestValue662_29_3 = spill662_3;
    forestValue662_29_4 = spill662_4;
    forestValue662_29_5 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0624dep-10f)));
    }
    if (!((life5_5 == null))) {
        forestValue662_33_0 = forestValue662_29_0;
        forestValue662_33_1 = forestValue662_29_1;
        forestValue662_33_2 = forestValue662_29_2;
        forestValue662_33_3 = forestValue662_29_3;
        forestValue662_33_4 = forestValue662_29_4;
        forestValue662_33_5 = forestValue662_29_5;
        break forest_join_33;
    }
    if (!((forestValue662_29_5 < 0))) {
        forestValue662_34_0 = forestValue662_29_0;
        forestValue662_34_1 = forestValue662_29_1;
        forestValue662_34_2 = forestValue662_29_2;
        forestValue662_34_3 = forestValue662_29_3;
        forestValue662_34_4 = forestValue662_29_4;
        break forest_join_34;
    }
    forestValue662_33_0 = forestValue662_29_0;
    forestValue662_33_1 = forestValue662_29_1;
    forestValue662_33_2 = forestValue662_29_2;
    forestValue662_33_3 = forestValue662_29_3;
    forestValue662_33_4 = forestValue662_29_4;
    forestValue662_33_5 = 1;
    }
    forestValue662_35_0 = forestValue662_33_0;
    forestValue662_35_1 = forestValue662_33_1;
    forestValue662_35_2 = forestValue662_33_2;
    forestValue662_35_3 = forestValue662_33_3;
    forestValue662_35_4 = forestValue662_33_4;
    forestValue662_35_5 = forestValue662_33_5;
    break forest_join_35;
    }
    forestValue662_35_0 = forestValue662_34_0;
    forestValue662_35_1 = forestValue662_34_1;
    forestValue662_35_2 = forestValue662_34_2;
    forestValue662_35_3 = forestValue662_34_3;
    forestValue662_35_4 = forestValue662_34_4;
    forestValue662_35_5 = 0;
    }
    ((net.minecraft.entity.boss.EntityWither)(forestValue662_35_0)).a(((int)(forestValue662_35_1)), ((double)(forestValue662_35_2)), ((double)(forestValue662_35_3)), ((double)(forestValue662_35_4)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue662_35_5))));
    return;
}


private double a__sourceReturn_acc714779d(int p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 107193742029123L);
    if ((p0 <= 0)) {
        return this.n;
    }
    float local4 = (((this.a2 + ((float) (__sourceIntrinsic_974cd9081f16_invokedynamic11302_3(24066, (7896353305622622032L ^ local2)) * (p0 - 1)))) / 0x1.68p7f) * 0x1.921fb6p1f);
    float local5 = moom.Dr.b(((float)(local4)));
    return (this.n + (((double) local5) * 0x1.4cccccccccccdp0d));
}


public void a(net.minecraft.potion.PotionEffect p0) {
return;
}


public int a__Int(float p0) {
long local2 = (net.minecraft.entity.boss.EntityWither.db ^ 36580266689528L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1893_1(10938, (6092735205074856274L ^ local2));
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.boss.EntityWither)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.2cp8d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.boss.EntityWither)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-1d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.boss.EntityWither)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.4p5d)));
    return;
}


public void v() {
return;
}


public boolean ac() {
int forwardValue5017_17_0;
    int forwardValue5017_19_0;
    int spill5017_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.boss.EntityWither.db ^ 110781356588927L);
    life3_5 = moom.vJ.b();
    spill5017_0 = recovery.source.CarrierOps.fcmpg(((float)(__sourceExactCall_15b774b60c4462(((net.minecraft.entity.boss.EntityWither)(this))))), ((float)((((net.minecraft.entity.boss.EntityWither)(this)).a() / 0x1.0p1f))));
    if (!((life3_5 == null))) {
        forwardValue5017_17_0 = spill5017_0;
        break forward_join_17;
    }
    if (!((spill5017_0 <= 0))) {
        break forward_join_18;
    }
    forwardValue5017_17_0 = 1;
    }
    forwardValue5017_19_0 = forwardValue5017_17_0;
    break forward_join_19;
    }
    forwardValue5017_19_0 = 0;
    }
    return ((forwardValue5017_19_0) != 0);
}


public void X__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.boss.EntityWither.db ^ 17311200565198L);
    ((net.minecraft.entity.boss.EntityWither)(this)).l(((int)(__sourceIntrinsic_296ab52b3f54_originalDynamicSite1894_1(22570, (7888394134719500259L ^ local1)))));
    ((net.minecraft.entity.boss.EntityWither)(this)).d(((float)((((net.minecraft.entity.boss.EntityWither)(this)).a() / 0x1.8p1f))));
    return;
}


private static boolean lambda$static$0(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue5020_12_0;
    int forwardValue5020_19_0;
    net.minecraft.entity.Entity spill5020_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.boss.EntityWither.db ^ 9460153997626L);
    life3_5 = moom.vJ.b();
    spill5020_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue5020_12_0 = spill5020_0;
        break forward_join_12;
    }
    if (!((((spill5020_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_18;
    }
    forwardValue5020_12_0 = p0;
    }
    if (!((((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(forwardValue5020_12_0)))).a__aR() != net.minecraft.entity.EnumCreatureAttribute.UNDEAD))) {
        break forward_join_18;
    }
    forwardValue5020_19_0 = 1;
    break forward_join_19;
    }
    forwardValue5020_19_0 = 0;
    }
    return ((forwardValue5020_19_0) != 0);
}


protected void R() {
int forestValue661_68_0;
    net.minecraft.entity.boss.EntityWither forestValue661_70_0;
    int forestValue661_77_0;
    int forestValue661_79_0;
    net.minecraft.entity.boss.EntityWither forestValue661_118_0;
    net.minecraft.world.EnumDifficulty forestValue661_130_0;
    net.minecraft.world.EnumDifficulty forestValue661_130_1;
    net.minecraft.entity.boss.EntityWither forestValue661_226_0;
    int forestValue661_230_0;
    net.minecraft.entity.Entity forestValue661_241_0;
    int forestValue661_252_0;
    int forestValue661_268_0;
    net.minecraft.entity.boss.EntityWither forestValue661_315_0;
    java.lang.Object forestValue661_357_0;
    int forestValue661_384_0;
    int forestValue661_402_0;
    net.minecraft.entity.boss.EntityWither forestValue661_423_0;
    int forestValue661_467_0;
    int forestValue661_526_0;
    int forestValue661_534_0;
    int forestValue661_536_0;
    int forestValue661_547_0;
    int forestValue661_573_0;
    int forestValue661_573_1;
    int forestValue661_574_0;
    net.minecraft.entity.boss.EntityWither forestValue661_576_0;
    int spill661_0;
    int spill661_1;
    net.minecraft.entity.boss.EntityWither spill661_2;
    net.minecraft.entity.boss.EntityWither spill661_3;
    int spill661_4;
    int spill661_5;
    net.minecraft.world.EnumDifficulty spill661_6;
    net.minecraft.world.EnumDifficulty spill661_7;
    net.minecraft.entity.boss.EntityWither spill661_8;
    int spill661_9;
    net.minecraft.entity.Entity spill661_10;
    boolean spill661_11;
    net.minecraft.entity.boss.EntityWither spill661_12;
    net.minecraft.entity.boss.EntityWither spill661_13;
    int spill661_14;
    java.util.List spill661_15;
    boolean spill661_16;
    boolean spill661_17;
    boolean spill661_18;
    int spill661_19;
    net.minecraft.entity.boss.EntityWither spill661_20;
    int spill661_21;
    int spill661_22;
    boolean spill661_23;
    int spill661_24;
    int spill661_25;
    boolean spill661_26;
    int spill661_27;
    net.minecraft.entity.boss.EntityWither spill661_28;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_16;
    int life4_82;
    int life5_145;
    int life6_152;
    float life7_176;
    float life8_178;
    double life9_192;
    double life11_206;
    double life13_220;
    net.minecraft.entity.Entity life6_247;
    java.util.List life6_357;
    int life7_359;
    net.minecraft.entity.EntityLivingBase life8_384;
    int life4_498;
    int life5_502;
    int life6_506;
    int life7_508;
    int life8_510;
    int life9_517;
    int life10_524;
    int life11_531;
    int life12_535;
    int life13_539;
    moom.DT life14_546;
    net.minecraft.block.Block life15_552;
    forest_join_578: {
    forest_join_576: {
    forest_join_574: {
    forest_join_573: {
    forest_join_564: {
    forest_join_547: {
    forest_join_546: {
    forest_join_426: {
    forest_join_423: {
    forest_join_422: {
    forest_join_409: {
    forest_join_77: {
    forest_join_74: {
    forest_join_72: {
    forest_join_70: {
    forest_join_68: {
    forest_join_55: {
    life1_3 = (net.minecraft.entity.boss.EntityWither.db ^ 21833884440720L);
    life3_5 = moom.vJ.b();
    spill661_0 = ((net.minecraft.entity.boss.EntityWither)(this)).s();
    if (!((life3_5 == null))) {
        forestValue661_77_0 = spill661_0;
        break forest_join_77;
    }
    if (!((spill661_0 > 0))) {
        break forest_join_74;
    }
    life4_16 = (((net.minecraft.entity.boss.EntityWither)(this)).s() - 1);
    spill661_1 = life4_16;
    if (!((life3_5 == null))) {
        forestValue661_68_0 = spill661_1;
        break forest_join_68;
    }
    if (!((spill661_1 <= 0))) {
        break forest_join_55;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(this.n)), ((double)((this.o + ((double) ((net.minecraft.entity.boss.EntityWither)(this)).e__Float())))), ((double)(this.p)), ((float)(0x1.cp2f)), ((boolean)(false)), ((boolean)(((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing"))))));
    ((net.minecraft.world.World)(this.i)).a(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic661_14(24438, (2471143664405825534L ^ life1_3)))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).l(((int)(life4_16)));
    spill661_2 = this;
    if (!((life3_5 == null))) {
        forestValue661_70_0 = spill661_2;
        break forest_join_70;
    }
    forestValue661_68_0 = (((net.minecraft.entity.boss.EntityWither)(spill661_2)).S % __sourceIntrinsic_ebf98100c39e_invokedynamic661_18(8501, (2500163325021043105L ^ life1_3)));
    }
    if (!((forestValue661_68_0 == 0))) {
        break forest_join_72;
    }
    forestValue661_70_0 = this;
    }
    ((net.minecraft.entity.boss.EntityWither)(forestValue661_70_0)).c(((float)(0x1.4p3f)));
    }
    if (!((life3_5 != null))) {
        break forest_join_578;
    }
    }
    super.R();
    forestValue661_77_0 = 1;
    }
    life4_82 = forestValue661_77_0;
    forest_cycle_78: while (true) {
    forest_join_406: {
    forestValue661_79_0 = life4_82;
    forest_cycle_79: while (true) {
    forest_join_320: {
    forest_join_318: {
    forest_join_315: {
    forest_join_314: {
    forest_join_275: {
    forest_join_268: {
    forest_join_252: {
    forest_join_241: {
    forest_join_230: {
    forest_join_226: {
    forest_join_225: {
    forest_join_131: {
    forest_join_130: {
    forest_join_118: {
    if (!((forestValue661_79_0 < 3))) {
        break forest_join_409;
    }
    spill661_3 = this;
    if (!((life3_5 == null))) {
        forestValue661_118_0 = spill661_3;
        break forest_join_118;
    }
    spill661_4 = ((net.minecraft.entity.boss.EntityWither)(spill661_3)).S;
    spill661_5 = (this.b9)[(life4_82 - 1)];
    if (!((life3_5 == null))) {
        forestValue661_573_0 = spill661_4;
        forestValue661_573_1 = spill661_5;
        break forest_join_573;
    }
    if (!((spill661_4 >= spill661_5))) {
        break forest_join_406;
    }
    (this.b9)[(life4_82 - 1)] = ((this.S + __sourceIntrinsic_ebf98100c39e_invokedynamic661_25(20625, (6212079692325701658L ^ life1_3))) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic661_27(20625, (6212079692325701658L ^ life1_3))))));
    forestValue661_118_0 = this;
    }
    spill661_6 = ((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityWither)(forestValue661_118_0)).i)).a__bB();
    spill661_7 = net.minecraft.world.EnumDifficulty.NORMAL;
    if (!((life3_5 == null))) {
        forestValue661_130_0 = spill661_6;
        forestValue661_130_1 = spill661_7;
        break forest_join_130;
    }
    if (!((spill661_6 != spill661_7))) {
        break forest_join_131;
    }
    spill661_8 = this;
    if (!((life3_5 == null))) {
        forestValue661_226_0 = spill661_8;
        break forest_join_226;
    }
    forestValue661_130_0 = ((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityWither)(spill661_8)).i)).a__bB();
    forestValue661_130_1 = net.minecraft.world.EnumDifficulty.HARD;
    }
    if (!((forestValue661_130_0 == forestValue661_130_1))) {
        break forest_join_225;
    }
    }
    life5_145 = (life4_82 - 1);
    life6_152 = (this.b_)[(life4_82 - 1)];
    (this.b_)[life5_145] = ((this.b_)[(life4_82 - 1)] + 1);
    spill661_9 = life6_152;
    if (!((life3_5 == null))) {
        forestValue661_230_0 = spill661_9;
        break forest_join_230;
    }
    if (!((spill661_9 > __sourceIntrinsic_ebf98100c39e_invokedynamic661_38(21941, (4854912951540698407L ^ life1_3))))) {
        break forest_join_225;
    }
    life7_176 = 0x1.4p3f;
    life8_178 = 0x1.4p2f;
    life9_192 = moom.Dr.a(((java.util.Random)(this.ah)), ((double)((this.n - ((double) life7_176)))), ((double)((this.n + ((double) life7_176)))));
    life11_206 = moom.Dr.a(((java.util.Random)(this.ah)), ((double)((this.o - ((double) life8_178)))), ((double)((this.o + ((double) life8_178)))));
    life13_220 = moom.Dr.a(((java.util.Random)(this.ah)), ((double)((this.p - ((double) life7_176)))), ((double)((this.p + ((double) life7_176)))));
    ((net.minecraft.entity.boss.EntityWither)(this)).a(((int)((life4_82 + 1))), ((double)(life9_192)), ((double)(life11_206)), ((double)(life13_220)), ((boolean)(true)));
    (this.b_)[(life4_82 - 1)] = 0;
    }
    forestValue661_226_0 = this;
    }
    life5_145 = ((net.minecraft.entity.boss.EntityWither)(forestValue661_226_0)).b__Int(((int)(life4_82)));
    forestValue661_230_0 = life5_145;
    }
    if (!((forestValue661_230_0 > 0))) {
        break forest_join_320;
    }
    life6_247 = ((net.minecraft.world.World)(this.i)).a(((int)(life5_145)));
    spill661_10 = life6_247;
    if (!((life3_5 == null))) {
        forestValue661_241_0 = spill661_10;
        break forest_join_241;
    }
    if (!((spill661_10 != null))) {
        break forest_join_314;
    }
    forestValue661_241_0 = life6_247;
    }
    spill661_11 = __sourceExactCall_a898d24b0a18b2(((net.minecraft.entity.Entity)(forestValue661_241_0)));
    if (!((life3_5 == null))) {
        forestValue661_252_0 = ((spill661_11) ? 1 : 0);
        break forest_join_252;
    }
    if (!(spill661_11)) {
        break forest_join_314;
    }
    spill661_12 = this;
    if (!((life3_5 == null))) {
        forestValue661_315_0 = spill661_12;
        break forest_join_315;
    }
    forestValue661_252_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.boss.EntityWither)(spill661_12)).a(((net.minecraft.entity.Entity)(life6_247))))), ((double)(0x1.c2p9d)));
    }
    if (!((forestValue661_252_0 <= 0))) {
        break forest_join_314;
    }
    spill661_13 = this;
    if (!((life3_5 == null))) {
        forestValue661_315_0 = spill661_13;
        break forest_join_315;
    }
    if (!(((net.minecraft.entity.boss.EntityWither)(spill661_13)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life6_247))))) {
        break forest_join_314;
    }
    spill661_14 = ((life6_247 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_5 == null))) {
        forestValue661_268_0 = spill661_14;
        break forest_join_268;
    }
    if (!((spill661_14 != 0))) {
        break forest_join_275;
    }
    forestValue661_268_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life6_247)))).b1)).a) ? 1 : 0);
    }
    if (!((forestValue661_268_0 != 0))) {
        break forest_join_275;
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_df16004b03(((int)(life4_82)), ((int)(0)));
    if (!((life3_5 != null))) {
        break forest_join_318;
    }
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).a(((int)((life4_82 + 1))), ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life6_247)))));
    (this.b9)[(life4_82 - 1)] = ((this.S + __sourceIntrinsic_ebf98100c39e_invokedynamic661_71(15948, (7421638458791470810L ^ life1_3))) + ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic661_73(12406, (5193497485517203698L ^ life1_3))))));
    (this.b_)[(life4_82 - 1)] = 0;
    if (!((life3_5 != null))) {
        break forest_join_318;
    }
    }
    forestValue661_315_0 = this;
    }
    ((net.minecraft.entity.boss.EntityWither)(forestValue661_315_0)).a__sourceReturn_df16004b03(((int)(life4_82)), ((int)(0)));
    }
    if (!((life3_5 != null))) {
        break forest_join_406;
    }
    }
    life6_357 = ((net.minecraft.world.World)(this.i)).a(((java.lang.Class)(net.minecraft.entity.EntityLivingBase.class)), ((moom.CA)(((moom.CA)(((net.minecraft.entity.boss.EntityWither)(this)).b())).b(((double)(0x1.4p4d)), ((double)(0x1.0p3d)), ((double)(0x1.4p4d))))), ((com.google.common.base.Predicate)(com.google.common.base.Predicates.and(((com.google.common.base.Predicate)(net.minecraft.entity.boss.EntityWither.cb)), ((com.google.common.base.Predicate)(moom.CY.d))))));
    life7_359 = 0;
    forest_cycle_336: while (true) {
    forest_join_404: {
    forest_join_402: {
    forest_join_399: {
    forest_join_392: {
    forest_join_384: {
    forest_join_357: {
    if (!((life7_359 < __sourceIntrinsic_ebf98100c39e_invokedynamic661_85(20625, (6212079692325701658L ^ life1_3))))) {
        break forest_join_406;
    }
    spill661_15 = life6_357;
    if (!((life3_5 == null))) {
        forestValue661_357_0 = spill661_15;
        break forest_join_357;
    }
    spill661_16 = ((java.util.List)(spill661_15)).isEmpty();
    if (!((life3_5 == null))) {
        forestValue661_79_0 = ((spill661_16) ? 1 : 0);
        continue forest_cycle_79;
    }
    if (!((!spill661_16))) {
        break forest_join_406;
    }
    forestValue661_357_0 = ((java.util.List)(life6_357)).get(((int)(((java.util.Random)(this.ah)).nextInt(((int)(((java.util.List)(life6_357)).size()))))));
    }
    life8_384 = ((net.minecraft.entity.EntityLivingBase)(forestValue661_357_0));
    if (!((life3_5 == null))) {
        break forest_join_404;
    }
    if (!((life8_384 != this))) {
        break forest_join_399;
    }
    spill661_17 = __sourceExactCall_cb825fd6418dbd(((net.minecraft.entity.EntityLivingBase)(life8_384)));
    if (!((life3_5 == null))) {
        forestValue661_402_0 = ((spill661_17) ? 1 : 0);
        break forest_join_402;
    }
    if (!(spill661_17)) {
        break forest_join_399;
    }
    spill661_18 = ((net.minecraft.entity.boss.EntityWither)(this)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(life8_384)));
    if (!((life3_5 == null))) {
        forestValue661_402_0 = ((spill661_18) ? 1 : 0);
        break forest_join_402;
    }
    if (!(spill661_18)) {
        break forest_join_399;
    }
    spill661_19 = ((life8_384 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_5 == null))) {
        forestValue661_384_0 = spill661_19;
        break forest_join_384;
    }
    if (!((spill661_19 != 0))) {
        break forest_join_392;
    }
    forestValue661_384_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(life8_384)))).b1)).a) ? 1 : 0);
    }
    if (!((forestValue661_384_0 == 0))) {
        break forest_join_406;
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_df16004b03(((int)(life4_82)), ((int)(((net.minecraft.entity.EntityLivingBase)(life8_384)).e__Int())));
    if (!((life3_5 != null))) {
        break forest_join_406;
    }
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_df16004b03(((int)(life4_82)), ((int)(((net.minecraft.entity.EntityLivingBase)(life8_384)).e__Int())));
    if (!((life3_5 != null))) {
        break forest_join_406;
    }
    }
    forestValue661_402_0 = ((((java.util.List)(life6_357)).remove(((java.lang.Object)(life8_384)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue661_402_0);
    life7_359 += 1;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_336;
    }
    break forest_cycle_336;
    }
    break forest_cycle_79;
    }
    }
    life4_82 += 1;
    if (!((life3_5 != null))) {
        continue forest_cycle_78;
    }
    break forest_cycle_78;
    }
    }
    spill661_20 = this;
    if (!((life3_5 == null))) {
        forestValue661_423_0 = spill661_20;
        break forest_join_423;
    }
    if (!((((net.minecraft.entity.boss.EntityWither)(spill661_20)).d__sourceReturn_d30556f370() != null))) {
        break forest_join_422;
    }
    ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_df16004b03(((int)(0)), ((int)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.boss.EntityWither)(this)).d__sourceReturn_d30556f370())).e__Int())));
    if (!((life3_5 != null))) {
        break forest_join_426;
    }
    }
    forestValue661_423_0 = this;
    }
    ((net.minecraft.entity.boss.EntityWither)(forestValue661_423_0)).a__sourceReturn_df16004b03(((int)(0)), ((int)(0)));
    }
    spill661_21 = this.ca;
    if (!((life3_5 == null))) {
        forestValue661_574_0 = spill661_21;
        break forest_join_574;
    }
    if (!((spill661_21 > 0))) {
        break forest_join_564;
    }
    net.minecraft.entity.boss.EntityWither __stackOp661_115_0 = this;
    ((net.minecraft.entity.boss.EntityWither)(__stackOp661_115_0)).ca = ((int)((((net.minecraft.entity.boss.EntityWither)(__stackOp661_115_0)).ca - 1)));
    spill661_22 = this.ca;
    if (!((life3_5 == null))) {
        forestValue661_574_0 = spill661_22;
        break forest_join_574;
    }
    if (!((spill661_22 == 0))) {
        break forest_join_564;
    }
    spill661_23 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")));
    if (!((life3_5 == null))) {
        forestValue661_574_0 = ((spill661_23) ? 1 : 0);
        break forest_join_574;
    }
    if (!(spill661_23)) {
        break forest_join_564;
    }
    life4_498 = moom.Dr.b__Int(((double)(this.o)));
    life5_502 = moom.Dr.b__Int(((double)(this.n)));
    life6_506 = moom.Dr.b__Int(((double)(this.p)));
    life7_508 = 0;
    life8_510 = -1;
    forest_cycle_466: while (true) {
    forest_join_543: {
    forestValue661_467_0 = life8_510;
    forest_cycle_467: while (true) {
    if (!((forestValue661_467_0 <= 1))) {
        break forest_join_546;
    }
    spill661_24 = -1;
    if (!((life3_5 == null))) {
        forestValue661_547_0 = spill661_24;
        break forest_join_547;
    }
    life9_517 = spill661_24;
    forest_cycle_473: while (true) {
    forest_join_541: {
    forest_join_540: {
    if (!((life9_517 <= 1))) {
        break forest_join_543;
    }
    spill661_25 = 0;
    if (!((life3_5 == null))) {
        forestValue661_467_0 = spill661_25;
        continue forest_cycle_467;
    }
    life10_524 = spill661_25;
    forest_cycle_480: while (true) {
    forest_join_538: {
    forest_join_537: {
    forest_join_536: {
    forest_join_535: {
    forest_join_534: {
    forest_join_533: {
    forest_join_526: {
    if (!((life10_524 <= 3))) {
        break forest_join_540;
    }
    life11_531 = (life5_502 + life8_510);
    life12_535 = (life4_498 + life10_524);
    life13_539 = (life6_506 + life9_517);
    life14_546 = new moom.DT(life11_531, life12_535, life13_539);
    life15_552 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life14_546))))).a__ch();
    if (!((life3_5 == null))) {
        break forest_join_541;
    }
    if (!((life3_5 == null))) {
        break forest_join_538;
    }
    if (!((((net.minecraft.block.Block)(life15_552)).a__fn() != moom.fn.a))) {
        break forest_join_537;
    }
    spill661_26 = __sourceExactCall_11da7e0ca46fc6(((net.minecraft.block.Block)(life15_552)));
    if (!((life3_5 == null))) {
        forestValue661_526_0 = ((spill661_26) ? 1 : 0);
        break forest_join_526;
    }
    if (!(spill661_26)) {
        break forest_join_537;
    }
    forestValue661_526_0 = ((((net.minecraft.world.World)(this.i)).b(((moom.DT)(life14_546)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forestValue661_534_0 = forestValue661_526_0;
        break forest_join_534;
    }
    if (!((forestValue661_526_0 == 0))) {
        break forest_join_533;
    }
    spill661_27 = life7_508;
    if (!((life3_5 == null))) {
        forestValue661_534_0 = spill661_27;
        break forest_join_534;
    }
    if (!((spill661_27 != 0))) {
        break forest_join_535;
    }
    }
    forestValue661_534_0 = 1;
    }
    forestValue661_536_0 = forestValue661_534_0;
    break forest_join_536;
    }
    forestValue661_536_0 = 0;
    }
    life7_508 = forestValue661_536_0;
    }
    life10_524 += 1;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_480;
    }
    break forest_cycle_480;
    }
    }
    life9_517 += 1;
    }
    if (!((life3_5 != null))) {
        continue forest_cycle_473;
    }
    break forest_cycle_473;
    }
    break forest_cycle_467;
    }
    }
    life8_510 += 1;
    if (!((life3_5 != null))) {
        continue forest_cycle_466;
    }
    break forest_cycle_466;
    }
    }
    forestValue661_547_0 = life7_508;
    }
    if (!((life3_5 == null))) {
        forestValue661_574_0 = forestValue661_547_0;
        break forest_join_574;
    }
    if (!((forestValue661_547_0 != 0))) {
        break forest_join_564;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic661_140(13970, (8523310833333644807L ^ life1_3)))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    }
    spill661_28 = this;
    if (!((life3_5 == null))) {
        forestValue661_576_0 = spill661_28;
        break forest_join_576;
    }
    forestValue661_573_0 = ((net.minecraft.entity.boss.EntityWither)(spill661_28)).S;
    forestValue661_573_1 = __sourceIntrinsic_ebf98100c39e_invokedynamic661_143(12406, (5193497485517203698L ^ life1_3));
    }
    forestValue661_574_0 = (forestValue661_573_0 % forestValue661_573_1);
    }
    if (!((forestValue661_574_0 == 0))) {
        break forest_join_578;
    }
    forestValue661_576_0 = this;
    }
    ((net.minecraft.entity.boss.EntityWither)(forestValue661_576_0)).c(((float)(0x1.0p0f)));
    }
    return;
}


protected void Q() {
this.a_ = ((int)(0));
    return;
}


public void G() {
int lexicalValue1565_64_0;
    net.minecraft.entity.boss.EntityWither lexicalValue1565_69_0;
    net.minecraft.entity.Entity lexicalValue1565_80_0;
    double lexicalValue1565_83_0;
    double lexicalValue1565_83_1;
    net.minecraft.entity.boss.EntityWither lexicalValue1565_140_0;
    int lexicalValue1565_152_0;
    int lexicalValue1565_170_0;
    int lexicalValue1565_333_0;
    net.minecraft.world.World lexicalValue1565_395_0;
    int lexicalValue1565_428_0;
    int lexicalValue1565_432_0;
    net.minecraft.entity.Entity[] spill1565_0;
    boolean spill1565_1;
    int spill1565_2;
    net.minecraft.entity.boss.EntityWither spill1565_3;
    int spill1565_4;
    net.minecraft.entity.boss.EntityWither spill1565_5;
    double spill1565_6;
    double spill1565_7;
    net.minecraft.entity.boss.EntityWither spill1565_8;
    int spill1565_9;
    int spill1565_10;
    int spill1565_11;
    net.minecraft.world.World spill1565_12;
    long life1_3;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.entity.Entity life4_44;
    double life5_123;
    double life7_129;
    double life9_137;
    double life11_150;
    int life4_218;
    int life5_256;
    net.minecraft.entity.Entity life6_258;
    double life7_278;
    double life9_284;
    double life11_290;
    double life13_295;
    double life15_304;
    double life17_309;
    double life19_319;
    float life21_330;
    float life22_340;
    int life5_390;
    double life6_397;
    double life8_401;
    double life10_405;
    int life5_507;
    lexical_join_469: {
    lexical_join_432: {
    lexical_join_428: {
    lexical_join_426: {
    lexical_join_333: {
    lexical_join_329: {
    lexical_join_197: {
    lexical_join_195: {
    lexical_join_170: {
    lexical_join_167: {
    lexical_join_152: {
    lexical_join_140: {
    lexical_join_139: {
    lexical_join_83: {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_64: {
    lexical_join_58: {
    life1_3 = (net.minecraft.entity.boss.EntityWither.db ^ 67367475948858L);
    spill1565_0 = moom.vJ.b();
    net.minecraft.entity.boss.EntityWither __stackOp1565_2_0 = this;
    ((net.minecraft.entity.boss.EntityWither)(__stackOp1565_2_0)).u = ((double)((((net.minecraft.entity.boss.EntityWither)(__stackOp1565_2_0)).u * 0x1.333334p-1d)));
    life3_11 = spill1565_0;
    spill1565_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_11 == null))) {
        lexicalValue1565_152_0 = ((spill1565_1) ? 1 : 0);
        break lexical_join_152;
    }
    if (!((!spill1565_1))) {
        break lexical_join_139;
    }
    spill1565_2 = ((net.minecraft.entity.boss.EntityWither)(this)).b__Int(((int)(0)));
    if (!((life3_11 == null))) {
        lexicalValue1565_152_0 = spill1565_2;
        break lexical_join_152;
    }
    if (!((spill1565_2 > 0))) {
        break lexical_join_139;
    }
    spill1565_3 = this;
    if (!((life3_11 == null))) {
        lexicalValue1565_140_0 = spill1565_3;
        break lexical_join_140;
    }
    life4_44 = ((net.minecraft.world.World)(((net.minecraft.entity.boss.EntityWither)(spill1565_3)).i)).a(((int)(((net.minecraft.entity.boss.EntityWither)(this)).b__Int(((int)(0))))));
    if (!((life4_44 != null))) {
        break lexical_join_139;
    }
    spill1565_4 = recovery.source.CarrierOps.dcmpg(((double)(this.o)), ((double)(((net.minecraft.entity.Entity)(life4_44)).o)));
    if (!((life3_11 == null))) {
        lexicalValue1565_64_0 = spill1565_4;
        break lexical_join_64;
    }
    if (!((spill1565_4 >= 0))) {
        break lexical_join_58;
    }
    spill1565_5 = this;
    if (!((life3_11 == null))) {
        lexicalValue1565_80_0 = spill1565_5;
        break lexical_join_80;
    }
    if (!((!((net.minecraft.entity.boss.EntityWither)(spill1565_5)).ac()))) {
        break lexical_join_79;
    }
    spill1565_6 = this.o;
    spill1565_7 = (((net.minecraft.entity.Entity)(life4_44)).o + 0x1.4p2d);
    if (!((life3_11 == null))) {
        lexicalValue1565_83_0 = spill1565_6;
        lexicalValue1565_83_1 = spill1565_7;
        break lexical_join_83;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1565_6)), ((double)(spill1565_7))) < 0))) {
        break lexical_join_79;
    }
    }
    spill1565_8 = this;
    if (!((life3_11 == null))) {
        lexicalValue1565_69_0 = spill1565_8;
        break lexical_join_69;
    }
    lexicalValue1565_64_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.boss.EntityWither)(spill1565_8)).u)), ((double)(0x0.0p0d)));
    }
    if (!((lexicalValue1565_64_0 < 0))) {
        break lexical_join_68;
    }
    this.u = ((double)(0x0.0p0d));
    }
    lexicalValue1565_69_0 = this;
    }
    net.minecraft.entity.boss.EntityWither __stackOp1565_22_0 = lexicalValue1565_69_0;
    ((net.minecraft.entity.boss.EntityWither)(__stackOp1565_22_0)).u = ((double)((((net.minecraft.entity.boss.EntityWither)(__stackOp1565_22_0)).u + ((0x1.0p-1d - this.u) * 0x1.333334p-1d))));
    }
    lexicalValue1565_80_0 = life4_44;
    }
    lexicalValue1565_83_0 = ((net.minecraft.entity.Entity)(lexicalValue1565_80_0)).n;
    lexicalValue1565_83_1 = this.n;
    }
    life5_123 = (lexicalValue1565_83_0 - lexicalValue1565_83_1);
    life7_129 = (((net.minecraft.entity.Entity)(life4_44)).p - this.p);
    life9_137 = ((life5_123 * life5_123) + (life7_129 * life7_129));
    spill1565_9 = recovery.source.CarrierOps.dcmpl(((double)(life9_137)), ((double)(0x1.2p3d)));
    if (!((life3_11 == null))) {
        lexicalValue1565_152_0 = spill1565_9;
        break lexical_join_152;
    }
    if (!((spill1565_9 > 0))) {
        break lexical_join_139;
    }
    life11_150 = ((double) moom.Dr.a__Float(((double)(life9_137))));
    net.minecraft.entity.boss.EntityWither __stackOp1565_32_0 = this;
    ((net.minecraft.entity.boss.EntityWither)(__stackOp1565_32_0)).t = ((double)((((net.minecraft.entity.boss.EntityWither)(__stackOp1565_32_0)).t + ((((life5_123 / life11_150) * 0x1.0p-1d) - this.t) * 0x1.333334p-1d))));
    net.minecraft.entity.boss.EntityWither __stackOp1565_36_0 = this;
    ((net.minecraft.entity.boss.EntityWither)(__stackOp1565_36_0)).v = ((double)((((net.minecraft.entity.boss.EntityWither)(__stackOp1565_36_0)).v + ((((life7_129 / life11_150) * 0x1.0p-1d) - this.v) * 0x1.333334p-1d))));
    }
    lexicalValue1565_140_0 = this;
    }
    lexicalValue1565_152_0 = recovery.source.CarrierOps.dcmpl(((double)(((((net.minecraft.entity.boss.EntityWither)(lexicalValue1565_140_0)).t * this.t) + (this.v * this.v)))), ((double)(0x1.99999ap-5d)));
    }
    if (!((life3_11 == null))) {
        lexicalValue1565_170_0 = lexicalValue1565_152_0;
        break lexical_join_170;
    }
    if (!((lexicalValue1565_152_0 > 0))) {
        break lexical_join_167;
    }
    this.w = ((float)(((((float) moom.Dr.b(((double)(this.v)), ((double)(this.t)))) * 0x1.ca5dcp5f) - 0x1.68p6f)));
    }
    super.G();
    lexicalValue1565_170_0 = 0;
    }
    life4_218 = lexicalValue1565_170_0;
    lexical_cycle_171: while (true) {
    if (!((life4_218 < 2))) {
        break lexical_join_195;
    }
    (this.b8)[life4_218] = (this.b6)[life4_218];
    (this.b7)[life4_218] = (this.b5)[life4_218];
    life4_218 += 1;
    if (!((life3_11 == null))) {
        break lexical_join_197;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_171; }
    break lexical_cycle_171;
    }
    }
    life4_218 = 0;
    }
    lexical_cycle_197: while (true) {
    lexical_join_326: {
    lexical_join_313: {
    lexical_join_217: {
    if (!((life4_218 < 2))) {
        break lexical_join_329;
    }
    life5_256 = ((net.minecraft.entity.boss.EntityWither)(this)).b__Int(((int)((life4_218 + 1))));
    life6_258 = null;
    spill1565_10 = life5_256;
    if (!((life3_11 == null))) {
        lexicalValue1565_333_0 = spill1565_10;
        break lexical_join_333;
    }
    if (!((spill1565_10 > 0))) {
        break lexical_join_217;
    }
    life6_258 = ((net.minecraft.world.World)(this.i)).a(((int)(life5_256)));
    }
    if (!((life6_258 != null))) {
        break lexical_join_313;
    }
    life7_278 = ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_acc714779d(((int)((life4_218 + 1))));
    life9_284 = ((net.minecraft.entity.boss.EntityWither)(this)).b__sourceReturn_acc714779d(((int)((life4_218 + 1))));
    life11_290 = ((net.minecraft.entity.boss.EntityWither)(this)).c__sourceReturn_acc714779d(((int)((life4_218 + 1))));
    life13_295 = (((net.minecraft.entity.Entity)(life6_258)).n - life7_278);
    life15_304 = ((((net.minecraft.entity.Entity)(life6_258)).o + ((double) ((net.minecraft.entity.Entity)(life6_258)).e__Float())) - life9_284);
    life17_309 = (((net.minecraft.entity.Entity)(life6_258)).p - life11_290);
    life19_319 = ((double) moom.Dr.a__Float(((double)(((life13_295 * life13_295) + (life17_309 * life17_309))))));
    life21_330 = (((float) ((moom.Dr.b(((double)(life17_309)), ((double)(life13_295))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f);
    life22_340 = ((float) (-((moom.Dr.b(((double)(life15_304)), ((double)(life19_319))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
    (this.b5)[life4_218] = ((net.minecraft.entity.boss.EntityWither)(this)).b(((float)((this.b5)[life4_218])), ((float)(life22_340)), ((float)(0x1.4p5f)));
    (this.b6)[life4_218] = ((net.minecraft.entity.boss.EntityWither)(this)).b(((float)((this.b6)[life4_218])), ((float)(life21_330)), ((float)(0x1.4p3f)));
    if (!((life3_11 != null))) {
        break lexical_join_326;
    }
    }
    (this.b6)[life4_218] = ((net.minecraft.entity.boss.EntityWither)(this)).b(((float)((this.b6)[life4_218])), ((float)(this.a2)), ((float)(0x1.4p3f)));
    }
    life4_218 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_197; }
    break lexical_cycle_197;
    }
    }
    life4_218 = ((((net.minecraft.entity.boss.EntityWither)(this)).ac()) ? 1 : 0);
    lexicalValue1565_333_0 = 0;
    }
    life5_390 = lexicalValue1565_333_0;
    lexical_cycle_334: while (true) {
    lexical_join_424: {
    lexical_join_423: {
    lexical_join_395: {
    if (!((life5_390 < 3))) {
        break lexical_join_426;
    }
    life6_397 = ((net.minecraft.entity.boss.EntityWither)(this)).a__sourceReturn_acc714779d(((int)(life5_390)));
    life8_401 = ((net.minecraft.entity.boss.EntityWither)(this)).b__sourceReturn_acc714779d(((int)(life5_390)));
    life10_405 = ((net.minecraft.entity.boss.EntityWither)(this)).c__sourceReturn_acc714779d(((int)(life5_390)));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)((life6_397 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)((life8_401 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)((life10_405 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life3_11 == null))) {
        break lexical_join_424;
    }
    spill1565_11 = life4_218;
    if (!((life3_11 == null))) {
        lexicalValue1565_428_0 = spill1565_11;
        break lexical_join_428;
    }
    if (!((spill1565_11 != 0))) {
        break lexical_join_423;
    }
    spill1565_12 = this.i;
    if (!((life3_11 == null))) {
        lexicalValue1565_395_0 = spill1565_12;
        break lexical_join_395;
    }
    if (!((((java.util.Random)(((net.minecraft.world.World)(spill1565_12)).u)).nextInt(((int)(4))) == 0))) {
        break lexical_join_423;
    }
    lexicalValue1565_395_0 = this.i;
    }
    ((net.minecraft.world.World)(lexicalValue1565_395_0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_MOB)), ((double)((life6_397 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)((life8_401 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)((life10_405 + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.333334p-2d)))), ((double)(0x1.666666p-1d)), ((double)(0x1.666666p-1d)), ((double)(0x1.0p-1d)), ((int[])(new int[0])));
    }
    life5_390 += 1;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_334; }
    break lexical_cycle_334;
    }
    }
    lexicalValue1565_428_0 = ((net.minecraft.entity.boss.EntityWither)(this)).s();
    }
    if (!((life3_11 == null))) {
        lexicalValue1565_432_0 = lexicalValue1565_428_0;
        break lexical_join_432;
    }
    if (!((lexicalValue1565_428_0 > 0))) {
        break lexical_join_469;
    }
    lexicalValue1565_432_0 = 0;
    }
    life5_507 = lexicalValue1565_432_0;
    lexical_cycle_433: while (true) {
    if (!((life5_507 < 3))) {
        break lexical_join_469;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_MOB)), ((double)((this.n + ((java.util.Random)(this.ah)).nextGaussian()))), ((double)((this.o + ((double) (((java.util.Random)(this.ah)).nextFloat() * 0x1.a66666p1f))))), ((double)((this.p + ((java.util.Random)(this.ah)).nextGaussian()))), ((double)(0x1.666666p-1d)), ((double)(0x1.666666p-1d)), ((double)(0x1.ccccccp-1d)), ((int[])(new int[0])));
    life5_507 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_433; }
    break lexical_cycle_433;
    }
    }
    return;
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1857_52() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_99b7487b238fc6e3_originalDynamicSite932_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic661_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_296ab52b3f54_originalDynamicSite1894_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_974cd9081f16_invokedynamic11302_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_69559b5a2c15_invokedynamic5013_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite1892_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1567_24(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_153a193fc182_call1567_29(net.minecraft.entity.boss.EntityWither a0, net.minecraft.util.DamageSource a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1893_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1680bc5d1bde_originalDynamicSite1888_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_08aafb25a71c_invokedynamic11297_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1891_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11296_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1890_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_originalDynamicSite1889_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_58a47161204bd2(int p0, long p1);
private static native float __sourceExactCall_15b774b60c4462(net.minecraft.entity.boss.EntityWither p0);
private static native boolean __sourceExactCall_11da7e0ca46fc6(net.minecraft.block.Block p0);

private static native net.minecraft.entity.EnumCreatureAttribute __sourceExactCall_494ef4347d87f9(net.minecraft.entity.EntityLivingBase p0);
private static native net.minecraft.entity.EnumCreatureAttribute __sourceExactCall_1a29a432b942d2(net.minecraft.entity.boss.EntityWither p0);
private static native boolean __sourceExactCall_a898d24b0a18b2(net.minecraft.entity.Entity p0);
private static native boolean __sourceExactCall_cb825fd6418dbd(net.minecraft.entity.EntityLivingBase p0);

private static native moom.AV __sourceExactCall_44cde2d029d1f2(net.minecraft.entity.boss.EntityWither p0);
}
