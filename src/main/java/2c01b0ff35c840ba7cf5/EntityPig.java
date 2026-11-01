package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityPig extends moom.sK {

private moom.uk cd;

private static long jb;

private static long[] kb;

private static java.lang.Integer[] Ab;

private static java.util.Map Bb;

public EntityPig(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_3d9cdec5b972a409(net.minecraft.entity.passive.EntityPig receiver, net.minecraft.world.World p0) throws Throwable {
long local2_life2 = (net.minecraft.entity.passive.EntityPig.jb ^ 27655882915401L);
    net.minecraft.entity.passive.EntityPig.__sourceConstructorInit_3d9cdec5b972a409_0(((net.minecraft.entity.passive.EntityPig)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.passive.EntityPig)(receiver)).a__Void(((float)(0x1.cccccc0000000p-1F)), ((float)(0x1.cccccc0000000p-1F)));
    ((moom.AW)(((moom.AW)(__sourceExactCall_dd51ea883f0ee6(((net.minecraft.entity.passive.EntityPig)(receiver))))))).a(((boolean)(true)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(((net.minecraft.entity.EntityLiving) receiver)))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uJ(((moom.sI) receiver), 0x1.4000000000000p+0D))));
    net.minecraft.entity.ai.EntityAITasks __sourceSpill484_17 = ((net.minecraft.entity.passive.EntityPig)(receiver)).bJ;
    int __sourceSpill484_18 = 2;
    net.minecraft.entity.passive.EntityPig __stackOp484_19_0 = receiver;
    moom.uk __stackOp484_19_1 = new moom.uk(((net.minecraft.entity.EntityLiving) receiver), 0x1.3333340000000p-2F);
    moom.uk __sourceSpill484_21 = __stackOp484_19_1;
    ((net.minecraft.entity.passive.EntityPig)(__stackOp484_19_0)).cd = ((moom.uk)(__stackOp484_19_1));
    ((net.minecraft.entity.ai.EntityAITasks)(__sourceSpill484_17)).a(((int)(__sourceSpill484_18)), ((moom.uc)(__sourceSpill484_21)));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uz(((moom.sK) receiver), 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.u3(((moom.sI) receiver), 0x1.3333333333333p+0D, net.minecraft.init.Items.bN, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.u3(((moom.sI) receiver), 0x1.3333333333333p+0D, net.minecraft.init.Items.bG, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.uv(((moom.sK) receiver), 0x1.199999999999ap+0D))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(__sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_38(13531, (1290035533695026141L ^ local2_life2)))), ((moom.uc)(new moom.u6(((moom.sI) receiver), 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(__sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_42(5020, (7494575123489399965L ^ local2_life2)))), ((moom.uc)(new moom.u8(((net.minecraft.entity.EntityLiving) receiver), net.minecraft.entity.player.EntityPlayer.class, 0x1.8000000000000p+2F))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.passive.EntityPig)(receiver)).bJ)).a(((int)(__sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_48(7068, (1642990071104973976L ^ local2_life2)))), ((moom.uc)(new moom.uy(((net.minecraft.entity.EntityLiving) receiver)))));
    return;
}


static {
jb = ((long)(((moom._a)(moom._c.a(((long)(7444719923619404671L)), ((long)(2330754882699904628L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213962933853851L)))));
    Bb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityPig.jb ^ 76725799701296L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1881_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1881_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1881_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1881_14 = new byte[8];
    (__sourceSpill1881_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1881_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1881_16 = __sourceSpill1881_14;
    ((javax.crypto.Cipher)(__sourceSpill1881_11)).init(((int)(__sourceSpill1881_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1881_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1881_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\005ØGðZ»¢h¤Â³S'%]*\037§8y"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1881_25 = local6_life21;
        int __sourceSpill1881_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1881_25)).substring(((int)(__sourceSpill1881_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1881_30 = local8_life19;
        int __sourceSpill1881_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1881_33 = new byte[8];
        (__sourceSpill1881_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1881_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1881_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1881_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1881_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1881_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1881_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1881_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1881_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1881_34)).doFinal(((byte[])(__sourceSpill1881_33)));
        (__sourceSpill1881_30)[__sourceSpill1881_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "7Bt3A\002K×AÐ B¸úÒ¦"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1881_38 = local6_life21;
        int __sourceSpill1881_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1881_38)).substring(((int)(__sourceSpill1881_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1881_43 = local8_life19;
        int __sourceSpill1881_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1881_46 = new byte[8];
        (__sourceSpill1881_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1881_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1881_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1881_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1881_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1881_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1881_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1881_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1881_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1881_47)).doFinal(((byte[])(__sourceSpill1881_46)));
        (__sourceSpill1881_43)[__sourceSpill1881_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    kb = ((long[])(local8_life19));
    Ab = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3d9cdec5b972a409_0(net.minecraft.entity.passive.EntityPig a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.pig.say";
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
net.minecraft.item.ItemStack forwardValue5306_11_0;
    int forwardValue5306_17_0;
    net.minecraft.item.ItemStack spill5306_0;
    long life2_3;
    int life4_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_11: {
    life2_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 3365744051892L);
    life4_5 = moom.vR.b();
    spill5306_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue5306_11_0 = spill5306_0;
        break forward_join_11;
    }
    if (!((spill5306_0 != null))) {
        break forward_join_16;
    }
    forwardValue5306_11_0 = p0;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5306_11_0)).a__wQ() == net.minecraft.init.Items.bG))) {
        break forward_join_16;
    }
    forwardValue5306_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5306_17_0 = 0;
    }
    return ((forwardValue5306_17_0) != 0);
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.passive.EntityPig lexicalValue1603_40_0;
    int lexicalValue1603_51_0;
    net.minecraft.entity.passive.EntityPig lexicalValue1603_53_0;
    int spill1603_0;
    net.minecraft.entity.passive.EntityPig spill1603_1;
    boolean spill1603_2;
    net.minecraft.entity.passive.EntityPig spill1603_3;
    long life3_3;
    int life6_18;
    int life5_19;
    int life7_21;
    lexical_join_57: {
    lexical_join_53: {
    lexical_join_51: {
    lexical_join_47: {
    life3_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 55375909780571L);
    spill1603_0 = moom.vR.c();
    life6_18 = ((((java.util.Random)(this.ah)).nextInt(((int)(3))) + 1) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    life5_19 = spill1603_0;
    life7_21 = 0;
    lexical_cycle_22: while (true) {
    lexical_join_44: {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life7_21 < life6_18))) {
        break lexical_join_47;
    }
    spill1603_1 = this;
    if (!((life5_19 == 0))) {
        lexicalValue1603_40_0 = spill1603_1;
        break lexical_join_40;
    }
    spill1603_2 = ((net.minecraft.entity.passive.EntityPig)(spill1603_1)).r__Boolean();
    if (!((life5_19 == 0))) {
        lexicalValue1603_51_0 = ((spill1603_2) ? 1 : 0);
        break lexical_join_51;
    }
    if (!(spill1603_2)) {
        break lexical_join_39;
    }
    ((net.minecraft.entity.passive.EntityPig)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.am)), ((int)(1)));
    if (!((life5_19 != 0))) {
        break lexical_join_44;
    }
    }
    lexicalValue1603_40_0 = this;
    }
    ((net.minecraft.entity.passive.EntityPig)(lexicalValue1603_40_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.al)), ((int)(1)));
    }
    life7_21 += 1;
    if (!((life5_19 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    spill1603_3 = this;
    if (!((life5_19 == 0))) {
        lexicalValue1603_53_0 = spill1603_3;
        break lexical_join_53;
    }
    lexicalValue1603_51_0 = ((((net.minecraft.entity.passive.EntityPig)(spill1603_3)).ae()) ? 1 : 0);
    }
    if (!((lexicalValue1603_51_0 != 0))) {
        break lexical_join_57;
    }
    lexicalValue1603_53_0 = this;
    }
    ((net.minecraft.entity.passive.EntityPig)(lexicalValue1603_53_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aA)), ((int)(1)));
    }
    return;
}


public boolean ae() {
int forwardValue5304_20_0;
    int forwardValue5304_22_0;
    int spill5304_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 83191675392889L);
    life3_5 = moom.vR.c();
    spill5304_0 = (((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a627c59d8423_invokedynamic5304_3(16695, (2447907928322333440L ^ life1_3))))) & 1);
    if (!((life3_5 == 0))) {
        forwardValue5304_20_0 = spill5304_0;
        break forward_join_20;
    }
    if (!((spill5304_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5304_20_0 = 1;
    }
    forwardValue5304_22_0 = forwardValue5304_20_0;
    break forward_join_22;
    }
    forwardValue5304_22_0 = 0;
    }
    return ((forwardValue5304_22_0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.passive.EntityPig)(this)).n(((boolean)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("Saddle"))))));
    return;
}


protected java.lang.String c__String() {
return "mob.pig.say";
}


public void n(boolean p0) {
long life2_3;
    int life4_5;
    forward_join_32: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 10092587069592L);
    life4_5 = moom.vR.b();
    if (!((life4_5 != 0))) { break forward_join_20; }
    if (!(p0)) { break forward_join_22; }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5957_3(745, (2081587108996070205L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    }
    if (!((life4_5 == 0))) { break forward_join_32; }
    }
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1b79f0ed2644_invokedynamic5957_7(745, (2081587108996070205L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    }
    return;
}


protected java.lang.String h__String() {
return "mob.pig.death";
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityPig.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral11636_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21376;
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
            throw new RuntimeException("moom/sP", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Ab[var3] = var15;
      }

      return Ab[var3];
}


public void d(float p0, float p1) {
int forwardValue5307_21_0;
    net.minecraft.entity.Entity forwardValue5307_24_0;
    int spill5307_0;
    int spill5307_1;
    net.minecraft.entity.Entity spill5307_2;
    long life3_3;
    int life5_9;
    forward_join_27: {
    forward_join_24: {
    forward_join_21: {
    life3_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 99010250311849L);
    spill5307_0 = moom.vR.b();
    super.d(((float)(p0)), ((float)(p1)));
    life5_9 = spill5307_0;
    spill5307_1 = recovery.source.CarrierOps.fcmpl(((float)(p0)), ((float)(0x1.4p2f)));
    if (!((life5_9 != 0))) {
        forwardValue5307_21_0 = spill5307_1;
        break forward_join_21;
    }
    if (!((spill5307_1 > 0))) {
        break forward_join_27;
    }
    spill5307_2 = this.f;
    if (!((life5_9 != 0))) {
        forwardValue5307_24_0 = spill5307_2;
        break forward_join_24;
    }
    forwardValue5307_21_0 = ((spill5307_2 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((forwardValue5307_21_0 != 0))) {
        break forward_join_27;
    }
    forwardValue5307_24_0 = this.f;
    }
    ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(forwardValue5307_24_0)))).a(((moom.BY)(net.minecraft.stats.AchievementList.u)));
    }
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Saddle")), ((boolean)(((net.minecraft.entity.passive.EntityPig)(this)).ae())));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityPig.jb ^ 131670564001794L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1985_3(745, (2081567510454260647L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityPig)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityPig)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue5303_16_0;
    net.minecraft.entity.Entity forwardValue5303_32_0;
    int forwardValue5303_35_0;
    boolean spill5303_0;
    boolean spill5303_1;
    net.minecraft.entity.Entity spill5303_2;
    long life2_3;
    int life4_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_32: {
    forward_join_16: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 35245744614121L);
    life4_5 = moom.vR.c();
    spill5303_0 = super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue5303_16_0 = ((spill5303_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5303_0)) {
        break forward_join_14;
    }
    return ((1) != 0);
    }
    forwardValue5303_16_0 = ((((net.minecraft.entity.passive.EntityPig)(this)).ae()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue5303_35_0 = forwardValue5303_16_0;
        break forward_join_35;
    }
    if (!((forwardValue5303_16_0 != 0))) {
        break forward_join_34;
    }
    spill5303_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 == 0))) {
        forwardValue5303_35_0 = ((spill5303_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill5303_1))) {
        break forward_join_34;
    }
    spill5303_2 = this.f;
    if (!((life4_5 == 0))) {
        forwardValue5303_32_0 = spill5303_2;
        break forward_join_32;
    }
    if (!((spill5303_2 != null))) {
        break forward_join_36;
    }
    forwardValue5303_32_0 = this.f;
    }
    if (!((forwardValue5303_32_0 != p0))) {
        break forward_join_36;
    }
    }
    forwardValue5303_35_0 = 0;
    }
    return ((forwardValue5303_35_0) != 0);
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).b(((net.minecraft.entity.Entity)(this)));
    return ((1) != 0);
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((net.minecraft.entity.passive.EntityPig)(this)).a(((java.lang.String)("mob.pig.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


public moom.uk a__sourceReturn_3358aa1956() {
return this.cd;
}


public void a(moom.tu p0) {
int forwardValue5302_14_0;
    int forwardValue5302_61_0;
    boolean spill5302_0;
    boolean spill5302_1;
    long life2_3;
    int life4_5;
    net.minecraft.entity.monster.EntityPigZombie life5_26;
    forward_join_64: {
    forward_join_61: {
    forward_join_57: {
    forward_join_14: {
    life2_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 111628868698283L);
    life4_5 = moom.vR.b();
    spill5302_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_5 != 0))) {
        forwardValue5302_14_0 = ((spill5302_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill5302_0))) {
        break forward_join_64;
    }
    forwardValue5302_14_0 = ((this.F) ? 1 : 0);
    }
    if (!((forwardValue5302_14_0 == 0))) {
        break forward_join_64;
    }
    life5_26 = new net.minecraft.entity.monster.EntityPigZombie(this.i);
    ((net.minecraft.entity.monster.EntityPigZombie)(life5_26)).b(((int)(0)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.B))));
    ((net.minecraft.entity.monster.EntityPigZombie)(life5_26)).c(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(this.w)), ((float)(this.x)));
    ((net.minecraft.entity.monster.EntityPigZombie)(life5_26)).j(((boolean)(((net.minecraft.entity.passive.EntityPig)(this)).U__Boolean())));
    spill5302_1 = ((net.minecraft.entity.passive.EntityPig)(this)).e__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue5302_61_0 = ((spill5302_1) ? 1 : 0);
        break forward_join_61;
    }
    if (!(spill5302_1)) {
        break forward_join_57;
    }
    ((net.minecraft.entity.monster.EntityPigZombie)(life5_26)).a(((java.lang.String)(((net.minecraft.entity.passive.EntityPig)(this)).g__String())));
    ((net.minecraft.entity.monster.EntityPigZombie)(life5_26)).f(((boolean)(((net.minecraft.entity.passive.EntityPig)(this)).B())));
    }
    forwardValue5302_61_0 = ((((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(life5_26)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue5302_61_0);
    ((net.minecraft.entity.passive.EntityPig)(this)).f__Void();
    }
    return;
}


protected net.minecraft.item.Item a__wQ() {
long local1 = (net.minecraft.entity.passive.EntityPig.jb ^ 97745981797619L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.passive.EntityPig)(this)).r__Boolean()) != 0) ? net.minecraft.init.Items.am : net.minecraft.init.Items.al);
}


public net.minecraft.entity.passive.EntityPig a__sP(moom.sJ p0) {
return new net.minecraft.entity.passive.EntityPig(this.i);
}


public moom.sJ a(moom.sJ p0) {
return ((net.minecraft.entity.passive.EntityPig)(this)).a__sP(((moom.sJ)(p0)));
}


public boolean P__Boolean() {
net.minecraft.item.ItemStack forwardValue5301_16_0;
    int forwardValue5301_22_0;
    int spill5301_0;
    net.minecraft.item.ItemStack spill5301_1;
    long life1_3;
    net.minecraft.item.ItemStack life4_9;
    int life3_10;
    forward_join_22: {
    forward_join_21: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.passive.EntityPig.jb ^ 2327294246857L);
    spill5301_0 = moom.vR.c();
    life4_9 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(this.f)))).a__xW();
    life3_10 = spill5301_0;
    spill5301_1 = life4_9;
    if (!((life3_10 == 0))) {
        forwardValue5301_16_0 = spill5301_1;
        break forward_join_16;
    }
    if (!((spill5301_1 != null))) {
        break forward_join_21;
    }
    forwardValue5301_16_0 = life4_9;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5301_16_0)).a__wQ() == net.minecraft.init.Items.bN))) {
        break forward_join_21;
    }
    forwardValue5301_22_0 = 1;
    break forward_join_22;
    }
    forwardValue5301_22_0 = 0;
    }
    return ((forwardValue5301_22_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3d9cdec5b972a409_originalDynamicSite484_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a627c59d8423_invokedynamic5304_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1985_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral11636_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5957_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1b79f0ed2644_invokedynamic5957_7(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native moom.AV __sourceExactCall_dd51ea883f0ee6(net.minecraft.entity.passive.EntityPig p0);
}
