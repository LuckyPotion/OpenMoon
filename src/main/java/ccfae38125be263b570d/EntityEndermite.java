package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityEndermite extends moom.sZ {

private int b5;

private boolean b6;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public EntityEndermite(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_e531315173c537e2(net.minecraft.entity.monster.EntityEndermite receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (net.minecraft.entity.monster.EntityEndermite.cb ^ 133010334457733L);

    net.minecraft.entity.monster.EntityEndermite.__sourceConstructorInit_e531315173c537e2_0(((net.minecraft.entity.monster.EntityEndermite)(receiver)), ((net.minecraft.world.World)(p0)));

    ((net.minecraft.entity.monster.EntityEndermite)(receiver)).b5 = ((int)(0));

    ((net.minecraft.entity.monster.EntityEndermite)(receiver)).b6 = ((boolean)(false));

    ((net.minecraft.entity.monster.EntityEndermite)(receiver)).bD = ((int)(__sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_4(17344, (4036975634714645491L ^ local2))));

    ((net.minecraft.entity.monster.EntityEndermite)(receiver)).a__Void(((float)(0x1.99999ap-2f)), ((float)(0x1.333334p-2f)));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ue(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p0d, false))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_15(24900, (8231333268949037430L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bJ)).a(((int)(__sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_19(21314, (374565613406339955L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, true, new java.lang.Class[0]))));

    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEndermite)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.player.EntityPlayer.class, true))));

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(3125348518546415022L)), ((long)(142374047967255016L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(84515268526878L)))));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityEndermite.cb ^ 88202454953786L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1869_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1869_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1869_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1869_14 = new byte[8];
    (__sourceSpill1869_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1869_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1869_16 = __sourceSpill1869_14;
    ((javax.crypto.Cipher)(__sourceSpill1869_11)).init(((int)(__sourceSpill1869_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1869_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1869_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "nóVXÃ[¸ô\000Ás"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1869_25 = local6_life21;
        int __sourceSpill1869_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1869_25)).substring(((int)(__sourceSpill1869_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1869_30 = local8_life19;
        int __sourceSpill1869_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1869_33 = new byte[8];
        (__sourceSpill1869_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1869_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1869_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1869_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1869_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1869_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1869_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1869_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1869_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1869_34)).doFinal(((byte[])(__sourceSpill1869_33)));
        (__sourceSpill1869_30)[__sourceSpill1869_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "¡\\½C×}©»QÀ\bh\b(^"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1869_38 = local6_life21;
        int __sourceSpill1869_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1869_38)).substring(((int)(__sourceSpill1869_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1869_43 = local8_life19;
        int __sourceSpill1869_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1869_46 = new byte[8];
        (__sourceSpill1869_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1869_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1869_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1869_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1869_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1869_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1869_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1869_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1869_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1869_47)).doFinal(((byte[])(__sourceSpill1869_46)));
        (__sourceSpill1869_43)[__sourceSpill1869_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e531315173c537e2_0(net.minecraft.entity.monster.EntityEndermite a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.silverfish.say";
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11433_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17114;
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
            throw new RuntimeException("moom/s4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityEndermite.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public float e__Float() {
return 0x1.99999ap-4f;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.b5 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Lifetime")))));
    this.b6 = ((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("PlayerSpawned")))));
    return;
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


public void l(boolean p0) {
this.b6 = ((boolean)(p0));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("Lifetime")), ((int)(this.b5)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("PlayerSpawned")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.b6) ? 1 : 0)))));
    return;
}


public net.minecraft.entity.EnumCreatureAttribute a__aR() {
return net.minecraft.entity.EnumCreatureAttribute.ARTHROPOD;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.monster.EntityEndermite)(this)).a(((java.lang.String)("mob.silverfish.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEndermite)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEndermite)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEndermite)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.0p1d)));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return null;
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
int forwardValue5129_22_0;
    int forwardValue5129_24_0;
    boolean spill5129_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    net.minecraft.entity.player.EntityPlayer life4_19;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life1_3 = (net.minecraft.entity.monster.EntityEndermite.cb ^ 5341979257870L);
    life3_5 = moom.vN.b();
    spill5129_0 = super.N__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5129_24_0 = ((spill5129_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill5129_0)) {
        break forward_join_23;
    }
    life4_19 = ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.4p2d)));
    if (!((life4_19 == null))) {
        break forward_join_21;
    }
    forwardValue5129_22_0 = 1;
    break forward_join_22;
    }
    forwardValue5129_22_0 = 0;
    }
    return ((forwardValue5129_22_0) != 0);
    }
    forwardValue5129_24_0 = 0;
    }
    return ((forwardValue5129_24_0) != 0);
}


public boolean ac() {
return ((((this.b6) ? 1 : 0)) != 0);
}


protected boolean ab() {
return ((1) != 0);
}


public void G() {
int lexicalValue1584_86_0;
    int lexicalValue1584_99_0;
    net.minecraft.entity.monster.EntityEndermite lexicalValue1584_106_0;
    net.minecraft.entity.Entity[] spill1584_0;
    boolean spill1584_1;
    net.minecraft.entity.monster.EntityEndermite spill1584_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_18;
    lexical_join_107: {
    lexical_join_106: {
    lexical_join_99: {
    lexical_join_95: {
    lexical_join_86: {
    lexical_join_84: {
    lexical_join_82: {
    life1_3 = (net.minecraft.entity.monster.EntityEndermite.cb ^ 58760073697784L);
    spill1584_0 = moom.vN.b();
    super.G();
    life3_7 = spill1584_0;
    spill1584_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 == null))) {
        lexicalValue1584_86_0 = ((spill1584_1) ? 1 : 0);
        break lexical_join_86;
    }
    if (!(spill1584_1)) {
        break lexical_join_84;
    }
    life4_18 = 0;
    lexical_cycle_16: while (true) {
    if (!((life4_18 < 2))) {
        break lexical_join_82;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)((this.o + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H))))), ((double)((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)(((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p1d))), ((double)((-((java.util.Random)(this.ah)).nextDouble()))), ((double)(((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p1d))), ((int[])(new int[0])));
    life4_18 += 1;
    if (!((life3_7 == null))) {
        break lexical_join_107;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    if (!((life3_7 != null))) {
        break lexical_join_107;
    }
    }
    lexicalValue1584_86_0 = ((((net.minecraft.entity.monster.EntityEndermite)(this)).R__Boolean()) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        lexicalValue1584_99_0 = lexicalValue1584_86_0;
        break lexical_join_99;
    }
    if (!((lexicalValue1584_86_0 == 0))) {
        break lexical_join_95;
    }
    net.minecraft.entity.monster.EntityEndermite __stackOp1584_29_0 = this;
    ((net.minecraft.entity.monster.EntityEndermite)(__stackOp1584_29_0)).b5 = ((int)((((net.minecraft.entity.monster.EntityEndermite)(__stackOp1584_29_0)).b5 + 1)));
    }
    spill1584_2 = this;
    if (!((life3_7 == null))) {
        lexicalValue1584_106_0 = spill1584_2;
        break lexical_join_106;
    }
    lexicalValue1584_99_0 = ((net.minecraft.entity.monster.EntityEndermite)(spill1584_2)).b5;
    }
    if (!((lexicalValue1584_99_0 >= __sourceIntrinsic_c7b45e3c376e_invokedynamic1584_33(5307, (7156698208775619318L ^ life1_3))))) {
        break lexical_join_107;
    }
    lexicalValue1584_106_0 = this;
    }
    ((net.minecraft.entity.monster.EntityEndermite)(lexicalValue1584_106_0)).f__Void();
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e531315173c537e2_originalDynamicSite3364_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic1584_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11433_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
