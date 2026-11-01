package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityChicken extends moom.sK {

public float cd;

public float ce;

public float cf;

public float cg;

public float ch;

public int ci;

public boolean cj;

private static long jb;

private static long[] kb;

private static java.lang.Integer[] Ab;

private static java.util.Map Bb;

public EntityChicken(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_d134c78b1d14c45f(net.minecraft.entity.passive.EntityChicken receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.passive.EntityChicken.jb ^ 127989245289538L);
    net.minecraft.entity.passive.EntityChicken.__sourceConstructorInit_d134c78b1d14c45f_0(((net.minecraft.entity.passive.EntityChicken)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityChicken)(receiver)).ch = ((float)(0x1.0p0f));
    ((net.minecraft.entity.passive.EntityChicken)(receiver)).a__Void(((float)(0x1.99999ap-2f)), ((float)(0x1.666666p-1f)));
    ((net.minecraft.entity.passive.EntityChicken)(receiver)).ci = ((int)((((java.util.Random)(((net.minecraft.entity.passive.EntityChicken)(receiver)).ah)).nextInt(((int)(__sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_5(24325, (3023083530905761389L ^ local2))))) + __sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_7(22345, (6412249182238752290L ^ local2)))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uJ(receiver, 0x1.6666666666666p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uz(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u3(receiver, 0x1.0p0d, net.minecraft.init.Items.N, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uv(receiver, 0x1.199999999999ap0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(__sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_23(21108, (4332344038379633433L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityChicken)(receiver)).bJ)).a(((int)(__sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_27(1135, (7991215727227661573L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(5515621673808042354L)), ((long)(257546409178358560L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(275036906680425L)))));
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityChicken.jb ^ 105991980474443L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1878_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1878_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1878_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1878_14 = new byte[8];
    (__sourceSpill1878_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1878_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1878_16 = __sourceSpill1878_14;
    ((javax.crypto.Cipher)(__sourceSpill1878_11)).init(((int)(__sourceSpill1878_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1878_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1878_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "~ÍÛç\036Cº \002¹\034D11\"òØ.ÄÈ\007Ò"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1878_25 = local6_life21;
        int __sourceSpill1878_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1878_25)).substring(((int)(__sourceSpill1878_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1878_30 = local8_life19;
        int __sourceSpill1878_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1878_33 = new byte[8];
        (__sourceSpill1878_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1878_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1878_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1878_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1878_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1878_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1878_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1878_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1878_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1878_34)).doFinal(((byte[])(__sourceSpill1878_33)));
        (__sourceSpill1878_30)[__sourceSpill1878_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\013{\n\"Hàê¨ÄúÈHo\n"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1878_38 = local6_life21;
        int __sourceSpill1878_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1878_38)).substring(((int)(__sourceSpill1878_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1878_43 = local8_life19;
        int __sourceSpill1878_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1878_46 = new byte[8];
        (__sourceSpill1878_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1878_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1878_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1878_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1878_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1878_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1878_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1878_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1878_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1878_47)).doFinal(((byte[])(__sourceSpill1878_46)));
        (__sourceSpill1878_43)[__sourceSpill1878_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    kb = ((long[])(local8_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_d134c78b1d14c45f_0(net.minecraft.entity.passive.EntityChicken a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.chicken.say";
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5232_11_0;
    int forwardValue5232_17_0;
    net.minecraft.item.ItemStack spill5232_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 92888747331895L);
    life4_5 = moom.vR.c();
    spill5232_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5232_11_0 = spill5232_0;
        break forward_join_11;
    }
    if (!((spill5232_0 != null))) {
        break forward_join_16;
    }
    forwardValue5232_11_0 = p0;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5232_11_0)).a__wQ() == net.minecraft.init.Items.N))) {
        break forward_join_16;
    }
    forwardValue5232_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5232_17_0 = 0;
    }
    return ((forwardValue5232_17_0) != 0);
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.passive.EntityChicken lexicalValue1595_46_0;
    int spill1595_0;
    net.minecraft.entity.passive.EntityChicken spill1595_1;
    long life3_3;
    int life6_16;
    int life5_17;
    int life7_19;
    lexical_join_50: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_33: {
    life3_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 111230129613784L);
    spill1595_0 = moom.vR.b();
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(3))) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    life5_17 = spill1595_0;
    life7_19 = 0;
    lexical_cycle_20: while (true) {
    if (!((life7_19 < life6_16))) {
        break lexical_join_33;
    }
    ((net.minecraft.entity.passive.EntityChicken)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.G)), ((int)(1)));
    life7_19 += 1;
    if (!((life5_17 != 0))) {
        break lexical_join_45;
    }
    if (!((life5_17 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    spill1595_1 = this;
    if (!((life5_17 != 0))) {
        lexicalValue1595_46_0 = spill1595_1;
        break lexical_join_46;
    }
    if (!(((net.minecraft.entity.passive.EntityChicken)(spill1595_1)).r__Boolean())) {
        break lexical_join_45;
    }
    ((net.minecraft.entity.passive.EntityChicken)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.ba)), ((int)(1)));
    if (!((life5_17 == 0))) {
        break lexical_join_50;
    }
    }
    lexicalValue1595_46_0 = this;
    }
    ((net.minecraft.entity.passive.EntityChicken)(lexicalValue1595_46_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a_)), ((int)(1)));
    }
    return;
}


public float e__Float() {
return this.H;
}


public boolean ae() {
return ((((this.cj) ? 1 : 0)) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.passive.EntityChicken forwardValue5233_24_0;
    int forwardValue5233_24_1;
    int spill5233_0;
    net.minecraft.entity.passive.EntityChicken spill5233_1;
    boolean spill5233_2;
    long life2_3;
    int life4_8;
    forward_join_25: {
    forward_join_24: {
    life2_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 93183320486866L);
    spill5233_0 = moom.vR.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5233_0;
    spill5233_1 = this;
    spill5233_2 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("IsChickenJockey")));
    if (!((life4_8 != 0))) {
        forwardValue5233_24_0 = spill5233_1;
        forwardValue5233_24_1 = ((spill5233_2) ? 1 : 0);
        break forward_join_24;
    }
    ((net.minecraft.entity.passive.EntityChicken)(spill5233_1)).cj = ((boolean)(spill5233_2));
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("EggLayTime"))))) {
        break forward_join_25;
    }
    forwardValue5233_24_0 = this;
    forwardValue5233_24_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("EggLayTime")));
    }
    ((net.minecraft.entity.passive.EntityChicken)(forwardValue5233_24_0)).ci = ((int)(forwardValue5233_24_1));
    }
    return;
}


protected java.lang.String c__String() {
return "mob.chicken.hurt";
}


public void n(boolean p0) {
this.cj = ((boolean)(p0));
    return;
}


protected java.lang.String h__String() {
return "mob.chicken.hurt";
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11556_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16484;
      if (Ab[var3] == null) {
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
         long var5 = kb[var3];
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
         Object[] var9 = (Object[])Bb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               Bb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityChicken.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("IsChickenJockey")), ((boolean)__sourceIntrinsic_integerToBoolean((((this.cj) ? 1 : 0)))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("EggLayTime")), ((int)(this.ci)));
    return;
}


public void d(float p0, float p1) {
return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityChicken)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityChicken)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityChicken)(this)).a__sL(((moom.sJ)(p0)));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.entity.passive.EntityChicken a__sL(moom.sJ p0) {
return new net.minecraft.entity.passive.EntityChicken(this.i);
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.G;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.passive.EntityChicken)(this)).a(((java.lang.String)("mob.chicken.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


protected int a(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.entity.passive.EntityChicken forwardValue5230_18_0;
    int forwardValue5230_20_0;
    net.minecraft.entity.passive.EntityChicken spill5230_0;
    long life2_3;
    int life4_5;
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 103730037604300L);
    life4_5 = moom.vR.c();
    spill5230_0 = this;
    if (!((life4_5 == 0))) {
        forwardValue5230_18_0 = spill5230_0;
        break forward_join_18;
    }
    if (!(((net.minecraft.entity.passive.EntityChicken)(spill5230_0)).ae())) {
        break forward_join_17;
    }
    forwardValue5230_20_0 = __sourceIntrinsic_635fc168609b_invokedynamic5230_3(32175, (517860754052353864L ^ life2_3));
    break forward_join_20;
    }
    forwardValue5230_18_0 = this;
    }
    forwardValue5230_20_0 = __sourceIntrinsic_635fc168609b_call5230_4(forwardValue5230_18_0, p0);
    }
    return forwardValue5230_20_0;
}


public void t__Void() {
net.minecraft.entity.Entity forwardValue5234_68_0;
    int spill5234_0;
    net.minecraft.entity.Entity spill5234_1;
    long life1_3;
    float life4_14;
    float life5_22;
    float life6_24;
    float life7_26;
    int life3_27;
    forward_join_72: {
    forward_join_68: {
    life1_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 97199665917132L);
    super.t__Void();
    spill5234_0 = moom.vR.c();
    life4_14 = moom.Dr.a(((float)(((this.a2 * 0x1.921fb6p1f) / 0x1.68p7f))));
    life5_22 = moom.Dr.b(((float)(((this.a2 * 0x1.921fb6p1f) / 0x1.68p7f))));
    life6_24 = 0x1.99999ap-4f;
    life7_26 = 0x0.0p0f;
    life3_27 = spill5234_0;
    ((net.minecraft.entity.Entity)(this.f)).a__Void(((double)((this.n + ((double) (life6_24 * life4_14))))), ((double)((((this.o + ((double) (this.H * 0x1.0p-1f))) + ((net.minecraft.entity.Entity)(this.f)).d()) + ((double) life7_26)))), ((double)((this.p - ((double) (life6_24 * life5_22))))));
    spill5234_1 = this.f;
    if (!((life3_27 == 0))) {
        forwardValue5234_68_0 = spill5234_1;
        break forward_join_68;
    }
    if (!((((spill5234_1 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0) != 0))) {
        break forward_join_72;
    }
    forwardValue5234_68_0 = this.f;
    }
    ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(forwardValue5234_68_0)))).a2 = ((float)(this.a2));
    }
    return;
}


protected boolean M() {
net.minecraft.entity.Entity forwardValue5229_13_0;
    int forwardValue5229_17_0;
    net.minecraft.entity.passive.EntityChicken spill5229_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 4616460633662L);
    life3_5 = moom.vR.c();
    spill5229_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue5229_13_0 = spill5229_0;
        break forward_join_13;
    }
    if (!(((net.minecraft.entity.passive.EntityChicken)(spill5229_0)).ae())) {
        break forward_join_16;
    }
    forwardValue5229_13_0 = this.f;
    }
    if (!((forwardValue5229_13_0 == null))) {
        break forward_join_16;
    }
    forwardValue5229_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5229_17_0 = 0;
    }
    return ((forwardValue5229_17_0) != 0);
}


public void G() {
net.minecraft.entity.passive.EntityChicken forestValue668_26_0;
    double forestValue668_26_1;
    int forestValue668_26_2;
    net.minecraft.entity.passive.EntityChicken forestValue668_27_0;
    double forestValue668_27_1;
    net.minecraft.entity.passive.EntityChicken forestValue668_28_0;
    double forestValue668_28_1;
    int forestValue668_28_2;
    int forestValue668_66_0;
    int forestValue668_94_0;
    int forestValue668_99_0;
    int forestValue668_104_0;
    int forestValue668_116_0;
    net.minecraft.entity.passive.EntityChicken forestValue668_152_0;
    int forestValue668_152_1;
    int spill668_0;
    net.minecraft.entity.passive.EntityChicken spill668_1;
    double spill668_2;
    boolean spill668_3;
    boolean spill668_4;
    int spill668_5;
    int spill668_6;
    net.minecraft.entity.passive.EntityChicken spill668_7;
    int spill668_8;
    int spill668_9;
    long life1_3;
    int life3_15;
    forest_join_153: {
    forest_join_152: {
    forest_join_116: {
    forest_join_104: {
    forest_join_99: {
    forest_join_94: {
    forest_join_82: {
    forest_join_66: {
    forest_join_56: {
    forest_join_28: {
    forest_join_27: {
    forest_join_26: {
    life1_3 = (net.minecraft.entity.passive.EntityChicken.jb ^ 46631081351642L);
    spill668_0 = moom.vR.b();
    super.G();
    this.cg = ((float)(this.cd));
    this.cf = ((float)(this.ce));
    life3_15 = spill668_0;
    spill668_1 = this;
    spill668_2 = ((double) this.ce);
    spill668_3 = this.A;
    if (!((life3_15 != 0))) {
        forestValue668_26_0 = spill668_1;
        forestValue668_26_1 = spill668_2;
        forestValue668_26_2 = ((spill668_3) ? 1 : 0);
        break forest_join_26;
    }
    if (!(spill668_3)) {
        forestValue668_27_0 = spill668_1;
        forestValue668_27_1 = spill668_2;
        break forest_join_27;
    }
    forestValue668_26_0 = spill668_1;
    forestValue668_26_1 = spill668_2;
    forestValue668_26_2 = -1;
    }
    forestValue668_28_0 = forestValue668_26_0;
    forestValue668_28_1 = forestValue668_26_1;
    forestValue668_28_2 = forestValue668_26_2;
    break forest_join_28;
    }
    forestValue668_28_0 = forestValue668_27_0;
    forestValue668_28_1 = forestValue668_27_1;
    forestValue668_28_2 = 4;
    }
    ((net.minecraft.entity.passive.EntityChicken)(forestValue668_28_0)).ce = ((float)(((float) (forestValue668_28_1 + (((double) forestValue668_28_2) * 0x1.3333333333333p-2d)))));
    this.ce = ((float)(moom.Dr.a(((float)(this.ce)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
    spill668_4 = this.A;
    if (!((life3_15 != 0))) {
        forestValue668_66_0 = ((spill668_4) ? 1 : 0);
        break forest_join_66;
    }
    if (!((!spill668_4))) {
        break forest_join_56;
    }
    spill668_5 = recovery.source.CarrierOps.fcmpg(((float)(this.ch)), ((float)(0x1.0p0f)));
    if (!((life3_15 != 0))) {
        forestValue668_66_0 = spill668_5;
        break forest_join_66;
    }
    if (!((spill668_5 < 0))) {
        break forest_join_56;
    }
    this.ch = ((float)(0x1.0p0f));
    }
    this.ch = ((float)(((float) (((double) this.ch) * 0x1.ccccccccccccdp-1d))));
    forestValue668_66_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_15 != 0))) {
        forestValue668_94_0 = forestValue668_66_0;
        break forest_join_94;
    }
    if (!((forestValue668_66_0 == 0))) {
        break forest_join_82;
    }
    spill668_6 = recovery.source.CarrierOps.dcmpg(((double)(this.u)), ((double)(0x0.0p0d)));
    if (!((life3_15 != 0))) {
        forestValue668_94_0 = spill668_6;
        break forest_join_94;
    }
    if (!((spill668_6 < 0))) {
        break forest_join_82;
    }
    net.minecraft.entity.passive.EntityChicken __stackOp668_25_0 = this;
    ((net.minecraft.entity.passive.EntityChicken)(__stackOp668_25_0)).u = ((double)((((net.minecraft.entity.passive.EntityChicken)(__stackOp668_25_0)).u * 0x1.3333333333333p-1d)));
    }
    net.minecraft.entity.passive.EntityChicken __stackOp668_28_0 = this;
    ((net.minecraft.entity.passive.EntityChicken)(__stackOp668_28_0)).cd = ((float)((((net.minecraft.entity.passive.EntityChicken)(__stackOp668_28_0)).cd + (this.ch * 0x1.0p1f))));
    forestValue668_94_0 = ((((net.minecraft.world.World)(this.i)).G) ? 1 : 0);
    }
    if (!((life3_15 != 0))) {
        forestValue668_99_0 = forestValue668_94_0;
        break forest_join_99;
    }
    if (!((forestValue668_94_0 == 0))) {
        break forest_join_153;
    }
    forestValue668_99_0 = ((((net.minecraft.entity.passive.EntityChicken)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((life3_15 != 0))) {
        forestValue668_104_0 = forestValue668_99_0;
        break forest_join_104;
    }
    if (!((forestValue668_99_0 == 0))) {
        break forest_join_153;
    }
    forestValue668_104_0 = ((((net.minecraft.entity.passive.EntityChicken)(this)).ae()) ? 1 : 0);
    }
    if (!((life3_15 != 0))) {
        forestValue668_116_0 = forestValue668_104_0;
        break forest_join_116;
    }
    if (!((forestValue668_104_0 == 0))) {
        break forest_join_153;
    }
    net.minecraft.entity.passive.EntityChicken __stackOp668_39_0 = this;
    spill668_7 = __stackOp668_39_0;
    spill668_8 = (((net.minecraft.entity.passive.EntityChicken)(__stackOp668_39_0)).ci - 1);
    if (!((life3_15 != 0))) {
        forestValue668_152_0 = spill668_7;
        forestValue668_152_1 = spill668_8;
        break forest_join_152;
    }
    net.minecraft.entity.passive.EntityChicken __stackOp668_41_0 = spill668_7;
    int __stackOp668_41_1 = spill668_8;
    spill668_9 = __stackOp668_41_1;
    ((net.minecraft.entity.passive.EntityChicken)(__stackOp668_41_0)).ci = ((int)(__stackOp668_41_1));
    forestValue668_116_0 = spill668_9;
    }
    if (!((forestValue668_116_0 <= 0))) {
        break forest_join_153;
    }
    ((net.minecraft.entity.passive.EntityChicken)(this)).a(((java.lang.String)("mob.chicken.plop")), ((float)(0x1.0p0f)), ((float)((((((java.util.Random)(this.ah)).nextFloat() - ((java.util.Random)(this.ah)).nextFloat()) * 0x1.99999ap-3f) + 0x1.0p0f))));
    ((net.minecraft.entity.passive.EntityChicken)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aP)), ((int)(1)));
    forestValue668_152_0 = this;
    forestValue668_152_1 = (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic668_51(22345, (6412207393474282426L ^ life1_3))))) + __sourceIntrinsic_c7b45e3c376e_invokedynamic668_53(22345, (6412207393474282426L ^ life1_3)));
    }
    ((net.minecraft.entity.passive.EntityChicken)(forestValue668_152_0)).ci = ((int)(forestValue668_152_1));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d134c78b1d14c45f_originalDynamicSite3381_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic668_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic668_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_635fc168609b_invokedynamic5230_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_635fc168609b_call5230_4(net.minecraft.entity.passive.EntityChicken a0, net.minecraft.entity.player.EntityPlayer a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11556_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
