package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ta extends moom.sZ implements net.minecraft.entity.IRangedAttackMob {

private static java.util.UUID b5;

private static moom.vB b6;

private static net.minecraft.item.Item[] b7;

private int b8;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public ta(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_2de38e770fa0bdb7(moom.ta receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (moom.ta.cb ^ 32794583052508L);
    moom.ta.__sourceConstructorInit_2de38e770fa0bdb7_0(((moom.ta)(receiver)), ((net.minecraft.world.World)(p0)));
    ((moom.ta)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.f33334p0f)));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ud(receiver, 0x1.0p0d, __sourceIntrinsic_2de38e770fa0bdb7_originalDynamicSite2847_6(21565, (1511748112530928717L ^ local2)), 0x1.4p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((moom.ta)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.player.EntityPlayer.class, true))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-2517908778846586326L)), ((long)(-2297306621525469115L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(208662584662498L)))));
    long local11_life6 = (moom.ta.cb ^ 91062368830262L);
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1566_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1566_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1566_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1566_14 = new byte[8];
    (__sourceSpill1566_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1566_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1566_16 = __sourceSpill1566_14;
    ((javax.crypto.Cipher)(__sourceSpill1566_11)).init(((int)(__sourceSpill1566_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1566_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1566_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[19];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "å}ÿUh­+V¸¦¯Åw@t\005të¥!·Lvè©éÆvºÓ0,üXà]¹1PëH=u[k¦\000ýú\006¤ßeñ>Jé c1¥]cÄ\037¼Tv¨Hkp\bÏËÀBr;\032\027w©z¨\032G¸\003}|åM\033G9C¡½ÓBa*X÷t¥ê\032þfnCZÅi|y"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1566_25 = local4_life21;
        int __sourceSpill1566_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1566_25)).substring(((int)(__sourceSpill1566_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1566_30 = local6_life19;
        int __sourceSpill1566_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1566_33 = new byte[8];
        (__sourceSpill1566_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1566_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1566_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1566_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1566_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1566_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1566_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1566_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1566_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1566_34)).doFinal(((byte[])(__sourceSpill1566_33)));
        (__sourceSpill1566_30)[__sourceSpill1566_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = ",É\0343bë¡°ò`otd"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1566_38 = local4_life21;
        int __sourceSpill1566_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1566_38)).substring(((int)(__sourceSpill1566_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1566_43 = local6_life19;
        int __sourceSpill1566_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1566_46 = new byte[8];
        (__sourceSpill1566_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1566_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1566_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1566_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1566_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1566_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1566_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1566_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1566_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1566_47)).doFinal(((byte[])(__sourceSpill1566_46)));
        (__sourceSpill1566_43)[__sourceSpill1566_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    db = ((long[])(local6_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[19]));
    b5 = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("5CD17E52-A79A-43D3-A529-90FDE04B181E")))));
    b6 = ((moom.vB)(((moom.vB)(new moom.vB(moom.ta.b5, "Drinking speed penalty", -0x1.0p-2d, 0))).a(((boolean)(false)))));
    net.minecraft.item.Item[] __sourceSpill1566_59 = new net.minecraft.item.Item[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_57(20634, (2472036838374097678L ^ local11_life6))];
    (__sourceSpill1566_59)[0] = net.minecraft.init.Items.aT;
    (__sourceSpill1566_59)[1] = net.minecraft.init.Items.aY;
    (__sourceSpill1566_59)[2] = net.minecraft.init.Items.aC;
    (__sourceSpill1566_59)[3] = net.minecraft.init.Items.bq;
    (__sourceSpill1566_59)[4] = net.minecraft.init.Items.bp;
    (__sourceSpill1566_59)[5] = net.minecraft.init.Items.H;
    (__sourceSpill1566_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_65(14328, (1911015794280899689L ^ local11_life6))] = net.minecraft.init.Items.y;
    (__sourceSpill1566_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_67(8125, (6564730910483385391L ^ local11_life6))] = net.minecraft.init.Items.y;
    b7 = ((net.minecraft.item.Item[])(__sourceSpill1566_59));
}

private static native <E extends Throwable> void __sourceConstructorInit_2de38e770fa0bdb7_0(moom.ta a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return null;
}


protected void b(boolean p0, int p1) {
int lexicalValue1320_45_0;
    net.minecraft.entity.Entity[] spill1320_0;
    int spill1320_1;
    long life3_3;
    int life6_11;
    net.minecraft.entity.Entity[] life5_12;
    int life7_14;
    int life8_22;
    net.minecraft.item.Item life9_30;
    int life10_48;
    lexical_join_62: {
    life3_3 = (moom.ta.cb ^ 105125629398882L);
    spill1320_0 = moom.vN.b();
    life6_11 = (((java.util.Random)(this.ah)).nextInt(((int)(3))) + 1);
    life5_12 = spill1320_0;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_45: {
    lexical_join_44: {
    if (!((life7_14 < life6_11))) {
        break lexical_join_62;
    }
    life8_22 = ((java.util.Random)(this.ah)).nextInt(((int)(3)));
    life9_30 = (moom.ta.b7)[((java.util.Random)(this.ah)).nextInt(((int)((moom.ta.b7).length)))];
    spill1320_1 = p1;
    if (!((life5_12 == null))) {
        lexicalValue1320_45_0 = spill1320_1;
        break lexical_join_45;
    }
    if (!((spill1320_1 > 0))) {
        break lexical_join_44;
    }
    life8_22 = (life8_22 + ((java.util.Random)(this.ah)).nextInt(((int)((p1 + 1)))));
    }
    lexicalValue1320_45_0 = 0;
    }
    life10_48 = lexicalValue1320_45_0;
    lexical_cycle_46: while (true) {
    if (!((life10_48 < life8_22))) {
        break lexical_join_59;
    }
    ((moom.ta)(this)).a(((net.minecraft.item.Item)(life9_30)), ((int)(1)));
    life10_48 += 1;
    if (!((life5_12 == null))) {
        break lexical_join_60;
    }
    if (!((life5_12 != null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    life7_14 += 1;
    }
    if (!((life5_12 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


protected float b(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.util.DamageSource forwardValue4085_20_0;
    net.minecraft.entity.Entity[] spill4085_0;
    net.minecraft.util.DamageSource spill4085_1;
    long life3_3;
    float life2_9;
    net.minecraft.entity.Entity[] life5_10;
    forward_join_28: {
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.ta.cb ^ 86736980062502L);
    spill4085_0 = moom.vN.b();
    life2_9 = super.b(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)));
    life5_10 = spill4085_0;
    spill4085_1 = p0;
    if (!((life5_10 == null))) {
        forwardValue4085_20_0 = spill4085_1;
        break forward_join_20;
    }
    if (!((((net.minecraft.util.DamageSource)(spill4085_1)).b__r3() == this))) {
        break forward_join_19;
    }
    life2_9 = 0x0.0p0f;
    }
    forwardValue4085_20_0 = p0;
    }
    if (!(((net.minecraft.util.DamageSource)(forwardValue4085_20_0)).h__Boolean())) {
        break forward_join_28;
    }
    life2_9 = ((float) (((double) life2_9) * 0x1.3333333333333p-3d));
    }
    return life2_9;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9188_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ta"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float e__Float() {
return 0x1.9eb852p0f;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ta.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14687;
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
            throw new RuntimeException("moom/ta", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected java.lang.String c__String() {
return null;
}


protected java.lang.String h__String() {
return null;
}


public void l(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue4087_18_0;
    int forwardValue4087_18_1;
    int forwardValue4087_18_2;
    net.minecraft.entity.DataWatcher forwardValue4087_19_0;
    int forwardValue4087_19_1;
    net.minecraft.entity.DataWatcher forwardValue4087_20_0;
    int forwardValue4087_20_1;
    int forwardValue4087_20_2;
    net.minecraft.entity.DataWatcher spill4087_0;
    int spill4087_1;
    boolean spill4087_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.ta.cb ^ 54457822598460L);
    life4_5 = moom.vN.b();
    spill4087_0 = ((moom.ta)(this)).a__r1();
    spill4087_1 = __sourceIntrinsic_93fe014f0768_invokedynamic4087_3(27476, (5127754520783105741L ^ life2_3));
    spill4087_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue4087_18_0 = spill4087_0;
        forwardValue4087_18_1 = spill4087_1;
        forwardValue4087_18_2 = ((spill4087_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4087_2)) {
        forwardValue4087_19_0 = spill4087_0;
        forwardValue4087_19_1 = spill4087_1;
        break forward_join_19;
    }
    forwardValue4087_18_0 = spill4087_0;
    forwardValue4087_18_1 = spill4087_1;
    forwardValue4087_18_2 = 1;
    }
    forwardValue4087_20_0 = forwardValue4087_18_0;
    forwardValue4087_20_1 = forwardValue4087_18_1;
    forwardValue4087_20_2 = forwardValue4087_18_2;
    break forward_join_20;
    }
    forwardValue4087_20_0 = forwardValue4087_19_0;
    forwardValue4087_20_1 = forwardValue4087_19_1;
    forwardValue4087_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue4087_20_0)).b(((int)(forwardValue4087_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue4087_20_2)))))));
    return;
}


protected void d__Void() {
long local1 = (moom.ta.cb ^ 28594610088763L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((moom.ta)(this)).a__r1())).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1653_3(10424, (251907846361158440L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void a(byte p0) {
int lexicalValue1319_16_0;
    byte spill1319_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_22;
    lexical_join_79: {
    lexical_join_76: {
    lexical_join_74: {
    lexical_join_16: {
    life2_3 = (moom.ta.cb ^ 136725236204345L);
    life4_5 = moom.vN.b();
    spill1319_0 = p0;
    if (!((life4_5 == null))) {
        lexicalValue1319_16_0 = ((int)(spill1319_0));
        break lexical_join_16;
    }
    if (!((spill1319_0 == __sourceIntrinsic_6121ff5511c4_invokedynamic1319_3(32490, (5611278318904618347L ^ life2_3))))) {
        break lexical_join_76;
    }
    lexicalValue1319_16_0 = 0;
    }
    life5_22 = lexicalValue1319_16_0;
    lexical_cycle_17: while (true) {
    if (!((life5_22 < (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_6121ff5511c4_invokedynamic1319_5(25240, (4211867753787666690L ^ life2_3))))) + __sourceIntrinsic_6121ff5511c4_invokedynamic1319_7(31742, (8565837471208384621L ^ life2_3)))))) {
        break lexical_join_74;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SPELL_WITCH)), ((double)((this.n + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0a3d7p-3d)))), ((double)(((((moom.CA)(((moom.ta)(this)).b())).f + 0x1.0p-1d) + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0a3d7p-3d)))), ((double)((this.p + (((java.util.Random)(this.ah)).nextGaussian() * 0x1.0a3d7p-3d)))), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    life5_22 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_79;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    if (!((life4_5 != null))) {
        break lexical_join_79;
    }
    }
    super.a(((byte)(p0)));
    }
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.ta)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.ap4d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.ta)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1) {
int forwardValue4083_93_0;
    int forwardValue4083_114_0;
    int forwardValue4083_154_0;
    int spill4083_0;
    boolean spill4083_1;
    boolean spill4083_2;
    boolean spill4083_3;
    int spill4083_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.tW life6_20;
    double life7_29;
    double life9_44;
    double life11_49;
    double life13_58;
    float life15_67;
    forward_join_155: {
    forward_join_154: {
    forward_join_138: {
    forward_join_114: {
    forward_join_111: {
    forward_join_93: {
    forward_join_89: {
    life3_3 = (moom.ta.cb ^ 84985441199484L);
    life5_5 = moom.vN.b();
    if (!((!((moom.ta)(this)).ac()))) {
        break forward_join_155;
    }
    life6_20 = new moom.tW(this.i, this, __sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_4(22074, (766837067594392572L ^ life3_3)));
    life7_29 = ((((net.minecraft.entity.EntityLivingBase)(p0)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p0)).e__Float())) - 0x1.19999ap0d);
    moom.tW __stackOp4083_7_0 = life6_20;
    ((moom.tW)(__stackOp4083_7_0)).x = ((float)((((moom.tW)(__stackOp4083_7_0)).x - -0x1.4p4f)));
    life9_44 = ((((net.minecraft.entity.EntityLivingBase)(p0)).n + ((net.minecraft.entity.EntityLivingBase)(p0)).t) - this.n);
    life11_49 = (life7_29 - this.o);
    life13_58 = ((((net.minecraft.entity.EntityLivingBase)(p0)).p + ((net.minecraft.entity.EntityLivingBase)(p0)).v) - this.p);
    life15_67 = moom.Dr.a__Float(((double)(((life9_44 * life9_44) + (life13_58 * life13_58)))));
    spill4083_0 = recovery.source.CarrierOps.fcmpl(((float)(life15_67)), ((float)(0x1.0p3f)));
    if (!((life5_5 == null))) {
        forwardValue4083_93_0 = spill4083_0;
        break forward_join_93;
    }
    if (!((spill4083_0 >= 0))) {
        break forward_join_89;
    }
    spill4083_1 = ((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.e)));
    if (!((life5_5 == null))) {
        forwardValue4083_93_0 = ((spill4083_1) ? 1 : 0);
        break forward_join_93;
    }
    if (!((!spill4083_1))) {
        break forward_join_89;
    }
    ((moom.tW)(life6_20)).g(((int)(__sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_22(17032, (7804092995667523418L ^ life3_3)))));
    if (!((life5_5 != null))) {
        break forward_join_138;
    }
    }
    forwardValue4083_93_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6())), ((float)(0x1.0p3f)));
    }
    if (!((life5_5 == null))) {
        forwardValue4083_114_0 = forwardValue4083_93_0;
        break forward_join_114;
    }
    if (!((forwardValue4083_93_0 >= 0))) {
        break forward_join_111;
    }
    spill4083_2 = ((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.v)));
    if (!((life5_5 == null))) {
        forwardValue4083_114_0 = ((spill4083_2) ? 1 : 0);
        break forward_join_114;
    }
    if (!((!spill4083_2))) {
        break forward_join_111;
    }
    ((moom.tW)(life6_20)).g(((int)(__sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_29(7418, (964975727854758191L ^ life3_3)))));
    if (!((life5_5 != null))) {
        break forward_join_138;
    }
    }
    forwardValue4083_114_0 = recovery.source.CarrierOps.fcmpg(((float)(life15_67)), ((float)(0x1.8p1f)));
    }
    if (!((life5_5 == null))) {
        forwardValue4083_154_0 = forwardValue4083_114_0;
        break forward_join_154;
    }
    if (!((forwardValue4083_114_0 <= 0))) {
        break forward_join_138;
    }
    spill4083_3 = ((net.minecraft.entity.EntityLivingBase)(p0)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.u)));
    if (!((life5_5 == null))) {
        forwardValue4083_154_0 = ((spill4083_3) ? 1 : 0);
        break forward_join_154;
    }
    if (!((!spill4083_3))) {
        break forward_join_138;
    }
    spill4083_4 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0p-2f)));
    if (!((life5_5 == null))) {
        forwardValue4083_154_0 = spill4083_4;
        break forward_join_154;
    }
    if (!((spill4083_4 < 0))) {
        break forward_join_138;
    }
    ((moom.tW)(life6_20)).g(((int)(__sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_38(12185, (3252638990624004702L ^ life3_3)))));
    }
    ((moom.tW)(life6_20)).a(((double)(life9_44)), ((double)((life11_49 + ((double) (life15_67 * 0x1.99999ap-3f))))), ((double)(life13_58)), ((float)(0x1.8p-1f)), ((float)(0x1.0p3f)));
    forwardValue4083_154_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life6_20)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4083_154_0);
    }
    return;
}


public boolean ac() {
int forwardValue4084_19_0;
    int forwardValue4084_21_0;
    byte spill4084_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.ta.cb ^ 28484936830367L);
    life3_5 = moom.vN.b();
    spill4084_0 = ((net.minecraft.entity.DataWatcher)(((moom.ta)(this)).a__r1())).a(((int)(__sourceIntrinsic_d73cace8ce31_invokedynamic4084_3(27476, (5127728601601373806L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue4084_19_0 = ((int)(spill4084_0));
        break forward_join_19;
    }
    if (!((spill4084_0 == 1))) {
        break forward_join_20;
    }
    forwardValue4084_19_0 = 1;
    }
    forwardValue4084_21_0 = forwardValue4084_19_0;
    break forward_join_21;
    }
    forwardValue4084_21_0 = 0;
    }
    return ((forwardValue4084_21_0) != 0);
}


public void G() {
int lexicalValue1318_81_0;
    int lexicalValue1318_115_0;
    int lexicalValue1318_142_0;
    int lexicalValue1318_166_0;
    moom.ta lexicalValue1318_198_0;
    int lexicalValue1318_202_0;
    moom.ta lexicalValue1318_211_0;
    int lexicalValue1318_232_0;
    int lexicalValue1318_270_0;
    moom.ta lexicalValue1318_281_0;
    moom.ta spill1318_0;
    boolean spill1318_1;
    int spill1318_2;
    int spill1318_3;
    boolean spill1318_4;
    boolean spill1318_5;
    boolean spill1318_6;
    boolean spill1318_7;
    int spill1318_8;
    moom.ta spill1318_9;
    boolean spill1318_10;
    int spill1318_11;
    moom.ta spill1318_12;
    boolean spill1318_13;
    int spill1318_14;
    moom.ta spill1318_15;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.item.ItemStack life4_47;
    java.util.List life5_69;
    java.util.Iterator life6_79;
    net.minecraft.potion.PotionEffect life7_86;
    int life4_111;
    net.minecraft.entity.ai.attributes.IAttributeInstance life5_382;
    lexical_join_281: {
    lexical_join_280: {
    lexical_join_270: {
    lexical_join_263: {
    lexical_join_232: {
    lexical_join_231: {
    lexical_join_211: {
    lexical_join_202: {
    lexical_join_198: {
    lexical_join_197: {
    lexical_join_166: {
    lexical_join_161: {
    lexical_join_142: {
    lexical_join_137: {
    lexical_join_115: {
    lexical_join_110: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_78: {
    lexical_join_73: {
    life1_3 = (moom.ta.cb ^ 18539672714592L);
    life3_5 = moom.vN.b();
    spill1318_0 = this;
    if (!((life3_5 == null))) {
        lexicalValue1318_281_0 = spill1318_0;
        break lexical_join_281;
    }
    if (!((!((net.minecraft.world.World)(((moom.ta)(spill1318_0)).i)).G))) {
        break lexical_join_280;
    }
    spill1318_1 = ((moom.ta)(this)).ac();
    if (!((life3_5 == null))) {
        lexicalValue1318_81_0 = ((spill1318_1) ? 1 : 0);
        break lexical_join_81;
    }
    if (!(spill1318_1)) {
        break lexical_join_80;
    }
    moom.ta __stackOp1318_6_0 = this;
    moom.ta __stackOp1318_8_0 = __stackOp1318_6_0;
    int __stackOp1318_8_1 = ((moom.ta)(__stackOp1318_6_0)).b8;
    spill1318_2 = __stackOp1318_8_1;
    ((moom.ta)(__stackOp1318_8_0)).b8 = ((int)((__stackOp1318_8_1 - 1)));
    if (!((life3_5 == null))) {
        lexicalValue1318_270_0 = spill1318_2;
        break lexical_join_270;
    }
    if (!((spill1318_2 <= 0))) {
        break lexical_join_263;
    }
    ((moom.ta)(this)).l(((boolean)(false)));
    life4_47 = ((moom.ta)(this)).a__xW();
    ((moom.ta)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(null)));
    if (!((life3_5 == null))) {
        break lexical_join_78;
    }
    if (!((life4_47 != null))) {
        break lexical_join_73;
    }
    if (!((((net.minecraft.item.ItemStack)(life4_47)).a__wQ() == net.minecraft.init.Items.bo))) {
        break lexical_join_73;
    }
    life5_69 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__List(((net.minecraft.item.ItemStack)(life4_47)));
    if (!((life3_5 == null))) {
        break lexical_join_78;
    }
    if (!((life5_69 != null))) {
        break lexical_join_73;
    }
    life6_79 = ((java.util.List)(life5_69)).iterator();
    lexical_cycle_56: while (true) {
    if (!(((java.util.Iterator)(life6_79)).hasNext())) {
        break lexical_join_73;
    }
    life7_86 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life6_79)).next()));
    ((moom.ta)(this)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(life7_86))));
    if (!((life3_5 == null))) {
        break lexical_join_78;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.ta)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).b(((moom.vB)(moom.ta.b6)));
    }
    if (!((life3_5 != null))) {
        break lexical_join_263;
    }
    }
    lexicalValue1318_81_0 = -1;
    }
    life4_111 = lexicalValue1318_81_0;
    spill1318_3 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.333334p-3f)));
    if (!((life3_5 == null))) {
        lexicalValue1318_115_0 = spill1318_3;
        break lexical_join_115;
    }
    if (!((spill1318_3 < 0))) {
        break lexical_join_110;
    }
    spill1318_4 = ((moom.ta)(this)).a(((moom.fn)(moom.fn.h)));
    if (!((life3_5 == null))) {
        lexicalValue1318_115_0 = ((spill1318_4) ? 1 : 0);
        break lexical_join_115;
    }
    if (!(spill1318_4)) {
        break lexical_join_110;
    }
    spill1318_5 = ((moom.ta)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.p)));
    if (!((life3_5 == null))) {
        lexicalValue1318_115_0 = ((spill1318_5) ? 1 : 0);
        break lexical_join_115;
    }
    if (!((!spill1318_5))) {
        break lexical_join_110;
    }
    life4_111 = __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_35(17273, (1604449393684573881L ^ life1_3));
    if (!((life3_5 != null))) {
        break lexical_join_231;
    }
    }
    lexicalValue1318_115_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.333334p-3f)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1318_142_0 = lexicalValue1318_115_0;
        break lexical_join_142;
    }
    if (!((lexicalValue1318_115_0 < 0))) {
        break lexical_join_137;
    }
    spill1318_6 = ((moom.ta)(this)).r__Boolean();
    if (!((life3_5 == null))) {
        lexicalValue1318_142_0 = ((spill1318_6) ? 1 : 0);
        break lexical_join_142;
    }
    if (!(spill1318_6)) {
        break lexical_join_137;
    }
    spill1318_7 = ((moom.ta)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.o)));
    if (!((life3_5 == null))) {
        lexicalValue1318_142_0 = ((spill1318_7) ? 1 : 0);
        break lexical_join_142;
    }
    if (!((!spill1318_7))) {
        break lexical_join_137;
    }
    life4_111 = __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_44(24892, (8592009519453261053L ^ life1_3));
    if (!((life3_5 != null))) {
        break lexical_join_231;
    }
    }
    lexicalValue1318_142_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.99999ap-5f)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1318_166_0 = lexicalValue1318_142_0;
        break lexical_join_166;
    }
    if (!((lexicalValue1318_142_0 < 0))) {
        break lexical_join_161;
    }
    spill1318_8 = recovery.source.CarrierOps.fcmpg(((float)(((moom.ta)(this)).b__sourceReturn_bc607678b6())), ((float)(((moom.ta)(this)).a())));
    if (!((life3_5 == null))) {
        lexicalValue1318_166_0 = spill1318_8;
        break lexical_join_166;
    }
    if (!((spill1318_8 < 0))) {
        break lexical_join_161;
    }
    life4_111 = __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_51(17243, (8386104637796413085L ^ life1_3));
    if (!((life3_5 != null))) {
        break lexical_join_231;
    }
    }
    lexicalValue1318_166_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(this.ah)).nextFloat())), ((float)(0x1.0p-2f)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1318_202_0 = lexicalValue1318_166_0;
        break lexical_join_202;
    }
    if (!((lexicalValue1318_166_0 < 0))) {
        break lexical_join_197;
    }
    spill1318_9 = this;
    if (!((life3_5 == null))) {
        lexicalValue1318_198_0 = spill1318_9;
        break lexical_join_198;
    }
    if (!((((moom.ta)(spill1318_9)).d__sourceReturn_d30556f370() != null))) {
        break lexical_join_197;
    }
    spill1318_10 = ((moom.ta)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life3_5 == null))) {
        lexicalValue1318_202_0 = ((spill1318_10) ? 1 : 0);
        break lexical_join_202;
    }
    if (!((!spill1318_10))) {
        break lexical_join_197;
    }
    spill1318_11 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(((moom.ta)(this)).d__sourceReturn_d30556f370())).a(((net.minecraft.entity.Entity)(this))))), ((double)(0x1.e4p6d)));
    if (!((life3_5 == null))) {
        lexicalValue1318_202_0 = spill1318_11;
        break lexical_join_202;
    }
    if (!((spill1318_11 > 0))) {
        break lexical_join_197;
    }
    life4_111 = __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_62(4639, (4013827465484648402L ^ life1_3));
    if (!((life3_5 != null))) {
        break lexical_join_231;
    }
    }
    lexicalValue1318_198_0 = this;
    }
    lexicalValue1318_202_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((moom.ta)(lexicalValue1318_198_0)).ah)).nextFloat())), ((float)(0x1.0p-2f)));
    }
    if (!((life3_5 == null))) {
        lexicalValue1318_232_0 = lexicalValue1318_202_0;
        break lexical_join_232;
    }
    if (!((lexicalValue1318_202_0 < 0))) {
        break lexical_join_231;
    }
    spill1318_12 = this;
    if (!((life3_5 == null))) {
        lexicalValue1318_211_0 = spill1318_12;
        break lexical_join_211;
    }
    if (!((((moom.ta)(spill1318_12)).d__sourceReturn_d30556f370() != null))) {
        break lexical_join_231;
    }
    lexicalValue1318_211_0 = this;
    }
    spill1318_13 = ((moom.ta)(lexicalValue1318_211_0)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life3_5 == null))) {
        lexicalValue1318_232_0 = ((spill1318_13) ? 1 : 0);
        break lexical_join_232;
    }
    if (!((!spill1318_13))) {
        break lexical_join_231;
    }
    spill1318_14 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.EntityLivingBase)(((moom.ta)(this)).d__sourceReturn_d30556f370())).a(((net.minecraft.entity.Entity)(this))))), ((double)(0x1.e4p6d)));
    if (!((life3_5 == null))) {
        lexicalValue1318_232_0 = spill1318_14;
        break lexical_join_232;
    }
    if (!((spill1318_14 > 0))) {
        break lexical_join_231;
    }
    life4_111 = __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_73(26432, (6671818251104209544L ^ life1_3));
    }
    lexicalValue1318_232_0 = life4_111;
    }
    if (!((life3_5 == null))) {
        lexicalValue1318_270_0 = lexicalValue1318_232_0;
        break lexical_join_270;
    }
    if (!((lexicalValue1318_232_0 > -1))) {
        break lexical_join_263;
    }
    ((moom.ta)(this)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bo, 1, life4_111))));
    this.b8 = ((int)(((net.minecraft.item.ItemStack)(((moom.ta)(this)).a__xW())).e()));
    ((moom.ta)(this)).l(((boolean)(true)));
    life5_382 = ((moom.ta)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life5_382)).b(((moom.vB)(moom.ta.b6)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(life5_382)).a(((moom.vB)(moom.ta.b6)));
    }
    spill1318_15 = this;
    if (!((life3_5 == null))) {
        lexicalValue1318_281_0 = spill1318_15;
        break lexical_join_281;
    }
    lexicalValue1318_270_0 = recovery.source.CarrierOps.fcmpg(((float)(((java.util.Random)(((moom.ta)(spill1318_15)).ah)).nextFloat())), ((float)(0x1.89374cp-11f)));
    }
    if (!((lexicalValue1318_270_0 < 0))) {
        break lexical_join_280;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_c7b45e3c376e_invokedynamic1318_90(16819, (818485056563080316L ^ life1_3)))));
    }
    lexicalValue1318_281_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call1318_92(lexicalValue1318_281_0);
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1566_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2de38e770fa0bdb7_originalDynamicSite2847_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1318_90(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call1318_92(moom.ta a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1319_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1319_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic1319_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4b9f98ea96d2_invokedynamic4083_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_invokedynamic4084_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1653_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral9188_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic4087_3(int a0, long a1) throws E;
}
