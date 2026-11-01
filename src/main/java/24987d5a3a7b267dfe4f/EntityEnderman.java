package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityEnderman extends moom.sZ {

private static java.util.UUID b5;

private static moom.vB b6;

private static java.util.Set<net.minecraft.block.Block> b7;

private boolean b8;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public EntityEnderman(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_028ed6e8087878ef(net.minecraft.entity.monster.EntityEnderman receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 58494037897432L);
    net.minecraft.entity.monster.EntityEnderman.__sourceConstructorInit_028ed6e8087878ef_0(((net.minecraft.entity.monster.EntityEnderman)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityEnderman)(receiver)).a__Void(((float)(0x1.333334p-1f)), ((float)(0x1.733334p1f)));
    ((net.minecraft.entity.monster.EntityEnderman)(receiver)).P = ((float)(0x1.0p0f));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ue(receiver, 0x1.0p0d, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(__sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_9(1160, (1342551269255755985L ^ local2)))), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(__sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_12(26546, (5440804391479335916L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(__sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_16(16342, (194312761525797769L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(__sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_19(11449, (6446257868467409122L ^ local2)))), ((moom.uc)(new moom.vc(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bJ)).a(((int)(__sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_22(8309, (4505224251414780960L ^ local2)))), ((moom.uc)(new moom.vd(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uX(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityEnderman)(receiver)).bK)).a(((int)(3)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.monster.EntityEndermite.class, __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_30(11449, (6446257868467409122L ^ local2)), true, false, __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_31()))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(8968286703849212619L)), ((long)(9100721766144589868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7014384828755L)))));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 128576089862500L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1868_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1868_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1868_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1868_14 = new byte[8];
    (__sourceSpill1868_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1868_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1868_16 = __sourceSpill1868_14;
    ((javax.crypto.Cipher)(__sourceSpill1868_11)).init(((int)(__sourceSpill1868_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1868_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1868_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[18];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "å´0\032ÆËÏu¼õf\037\025ìN!L@35~Cè­]DoiÇYÓ©ÖMIÕ\021ø§þ\021´fo`ü<ùs`z\b2w; ïö\034Ö}<J9Ñ».¸}e³;\017hEõ8Ñ«\006Óí>¾$\005gÍë'{8°kÊ[ÒOÇ½{[i´\004\016þcÊ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1868_25 = local6_life21;
        int __sourceSpill1868_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1868_25)).substring(((int)(__sourceSpill1868_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1868_30 = local8_life19;
        int __sourceSpill1868_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1868_33 = new byte[8];
        (__sourceSpill1868_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1868_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1868_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1868_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1868_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1868_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1868_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1868_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1868_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1868_34)).doFinal(((byte[])(__sourceSpill1868_33)));
        (__sourceSpill1868_30)[__sourceSpill1868_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\002¸ÍÖ¸|d|¡F\\J·"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1868_38 = local6_life21;
        int __sourceSpill1868_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1868_38)).substring(((int)(__sourceSpill1868_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1868_43 = local8_life19;
        int __sourceSpill1868_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1868_46 = new byte[8];
        (__sourceSpill1868_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1868_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1868_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1868_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1868_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1868_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1868_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1868_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1868_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1868_47)).doFinal(((byte[])(__sourceSpill1868_46)));
        (__sourceSpill1868_43)[__sourceSpill1868_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[18]));
    b5 = ((java.util.UUID)(java.util.UUID.fromString(((java.lang.String)("020E0DFB-87AE-4653-9556-831010E291A0")))));
    b6 = ((moom.vB)(((moom.vB)(new moom.vB(net.minecraft.entity.monster.EntityEnderman.b5, "Attacking speed boost", 0x1.333334p-3d, 0))).a(((boolean)(false)))));
    b7 = ((java.util.Set)(com.google.common.collect.Sets.newIdentityHashSet()));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.c)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.d)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.m)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.n)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.N)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.O)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.P)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.Q)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.W)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.aK)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.aL)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.aU)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.a_)));
    ((java.util.Set)(net.minecraft.entity.monster.EntityEnderman.b7)).add(((java.lang.Object)(net.minecraft.init.Blocks.bl)));
}

private static native <E extends Throwable> void __sourceConstructorInit_028ed6e8087878ef_0(net.minecraft.entity.monster.EntityEnderman a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
long local1 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 62537494033717L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.entity.monster.EntityEnderman)(this)).ad()) != 0) ? "mob.endermen.scream" : "mob.endermen.idle");
}


protected void b(boolean p0, int p1) {
net.minecraft.entity.Entity[] spill1582_0;
    long life3_3;
    net.minecraft.item.Item life6_7;
    net.minecraft.entity.Entity[] life5_8;
    int life7_17;
    int life8_19;
    lexical_join_31: {
    life3_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 13088251098142L);
    spill1582_0 = moom.vN.b();
    life6_7 = ((net.minecraft.entity.monster.EntityEnderman)(this)).a__wQ();
    life5_8 = spill1582_0;
    if (!((life6_7 != null))) {
        break lexical_join_31;
    }
    life7_17 = ((java.util.Random)(this.ah)).nextInt(((int)((2 + p1))));
    life8_19 = 0;
    lexical_cycle_20: while (true) {
    if (!((life8_19 < life7_17))) {
        break lexical_join_31;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.item.Item)(life6_7)), ((int)(1)));
    life8_19 += 1;
    if (!((life5_8 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}


public boolean ad() {
int forwardValue5122_18_0;
    int forwardValue5122_20_0;
    byte spill5122_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 38162953383236L);
    life3_5 = moom.vN.b();
    spill5122_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_e0a402d4f733_invokedynamic5122_3(30468, (3042046334549415620L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5122_18_0 = ((int)(spill5122_0));
        break forward_join_18;
    }
    if (!((spill5122_0 > 0))) {
        break forward_join_19;
    }
    forwardValue5122_18_0 = 1;
    }
    forwardValue5122_20_0 = forwardValue5122_18_0;
    break forward_join_20;
    }
    forwardValue5122_20_0 = 0;
    }
    return ((forwardValue5122_20_0) != 0);
}


protected boolean e__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
long local2 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 24562343077866L);
    moom.DR local4 = new moom.DR((this.n - ((net.minecraft.entity.Entity)(p0)).n), (((((moom.CA)(((net.minecraft.entity.monster.EntityEnderman)(this)).b())).c + ((double) (this.H / 0x1.0p1f))) - ((net.minecraft.entity.Entity)(p0)).o) + ((double) ((net.minecraft.entity.Entity)(p0)).e__Float())), (this.p - ((net.minecraft.entity.Entity)(p0)).p));
    local4 = ((moom.DR)(local4)).a__DR();
    double local5 = 0x1.0p4d;
    double local7 = ((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p3d)) - (((moom.DR)(local4)).a * local5));
    double local9 = ((this.o + ((double) (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebd27df71865_originalDynamicSite1937_17(5318, (3318030588525150124L ^ local2))))) - __sourceIntrinsic_ebd27df71865_originalDynamicSite1937_19(16342, (194346414370739387L ^ local2))))) - (((moom.DR)(local4)).b * local5));
    double local11 = ((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p3d)) - (((moom.DR)(local4)).c * local5));
    return ((net.minecraft.entity.monster.EntityEnderman)(this)).d__sourceReturn_46e1fbf1bc(((double)(local7)), ((double)(local9)), ((double)(local11)));
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityEnderman.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11425_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7693;
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
            throw new RuntimeException("moom/s3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


public float e__Float() {
return 0x1.466666p1f;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5124_40_0;
    net.minecraft.entity.Entity[] spill5124_0;
    boolean spill5124_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    net.minecraft.block.state.IBlockState life5_37;
    forward_join_52: {
    forward_join_40: {
    forward_join_37: {
    life2_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 64259126258708L);
    spill5124_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5124_0;
    spill5124_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("carried")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5124_3(16342, (194315792801554245L ^ life2_3)))));
    if (!((life4_8 == null))) {
        forwardValue5124_40_0 = ((spill5124_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill5124_1)) {
        break forward_join_37;
    }
    life5_37 = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("carried")))))))).b__fE(((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("carriedData"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5124_9(27608, (6571258814936058691L ^ life2_3))))));
    if (!((life4_8 != null))) {
        break forward_join_52;
    }
    }
    forwardValue5124_40_0 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("carried")))));
    }
    life5_37 = ((net.minecraft.block.Block)(net.minecraft.block.Block.a(((int)(forwardValue5124_40_0))))).b__fE(((int)((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("carriedData"))) & __sourceIntrinsic_01f4e1cd062e_invokedynamic5124_15(10765, (4004081641192999573L ^ life2_3))))));
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.block.state.IBlockState)(life5_37)));
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


protected java.lang.String c__String() {
return "mob.endermen.hit";
}


protected java.lang.String h__String() {
return "mob.endermen.death";
}


public void l(boolean p0) {
net.minecraft.entity.DataWatcher forwardValue5127_18_0;
    int forwardValue5127_18_1;
    int forwardValue5127_18_2;
    net.minecraft.entity.DataWatcher forwardValue5127_19_0;
    int forwardValue5127_19_1;
    net.minecraft.entity.DataWatcher forwardValue5127_20_0;
    int forwardValue5127_20_1;
    int forwardValue5127_20_2;
    net.minecraft.entity.DataWatcher spill5127_0;
    int spill5127_1;
    boolean spill5127_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 106313105888907L);
    life4_5 = moom.vN.b();
    spill5127_0 = this.al;
    spill5127_1 = __sourceIntrinsic_93fe014f0768_invokedynamic5127_3(4007, (8852221562973312420L ^ life2_3));
    spill5127_2 = p0;
    if (!((life4_5 == null))) {
        forwardValue5127_18_0 = spill5127_0;
        forwardValue5127_18_1 = spill5127_1;
        forwardValue5127_18_2 = ((spill5127_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5127_2)) {
        forwardValue5127_19_0 = spill5127_0;
        forwardValue5127_19_1 = spill5127_1;
        break forward_join_19;
    }
    forwardValue5127_18_0 = spill5127_0;
    forwardValue5127_18_1 = spill5127_1;
    forwardValue5127_18_2 = 1;
    }
    forwardValue5127_20_0 = forwardValue5127_18_0;
    forwardValue5127_20_1 = forwardValue5127_18_1;
    forwardValue5127_20_2 = forwardValue5127_18_2;
    break forward_join_20;
    }
    forwardValue5127_20_0 = forwardValue5127_19_0;
    forwardValue5127_20_1 = forwardValue5127_19_1;
    forwardValue5127_20_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5127_20_0)).b(((int)(forwardValue5127_20_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5127_20_2)))))));
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 86288523923527L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_3(21787, (5480212413055879625L ^ local1)))), ((java.lang.Object)(java.lang.Short.valueOf(((short)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_7(3768, (1835265720643195517L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_11(4007, (8852183878428496744L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    java.lang.Object local2 = ((net.minecraft.entity.monster.EntityEnderman)(this)).a__sourceReturn_474a78d617();
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("carried")), ((short)(((short) net.minecraft.block.Block.a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local2)).a__ch())))))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("carriedData")), ((short)(((short) ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(local2)).a__ch())).b(((net.minecraft.block.state.IBlockState)(local2)))))));
    return;
}


private boolean d__sourceReturn_55ee61ea68(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5126_17_0;
    int forwardValue5126_81_0;
    int forwardValue5126_85_0;
    int forwardValue5126_87_0;
    net.minecraft.entity.Entity[] spill5126_0;
    net.minecraft.item.ItemStack spill5126_1;
    int spill5126_2;
    long life2_3;
    net.minecraft.item.ItemStack life5_10;
    net.minecraft.entity.Entity[] life4_11;
    moom.DR life6_32;
    moom.DR life7_62;
    double life8_65;
    moom.DR life7_68;
    double life10_72;
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_81: {
    forward_join_23: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 39769757883160L);
    spill5126_0 = moom.vN.b();
    life5_10 = (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).b)[3];
    life4_11 = spill5126_0;
    spill5126_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue5126_17_0 = spill5126_1;
        break forward_join_17;
    }
    if (!((spill5126_1 != null))) {
        break forward_join_23;
    }
    forwardValue5126_17_0 = life5_10;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5126_17_0)).a__wQ() == net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aU)))))) {
        break forward_join_23;
    }
    return ((0) != 0);
    }
    life6_32 = ((moom.DR)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__DR(((float)(0x1.0p0f))))).a__DR();
    life7_62 = new moom.DR((this.n - ((net.minecraft.entity.player.EntityPlayer)(p0)).n), ((((moom.CA)(((net.minecraft.entity.monster.EntityEnderman)(this)).b())).c + ((double) (this.H / 0x1.0p1f))) - (((net.minecraft.entity.player.EntityPlayer)(p0)).o + ((double) ((net.minecraft.entity.player.EntityPlayer)(p0)).e__Float()))), (this.p - ((net.minecraft.entity.player.EntityPlayer)(p0)).p));
    life8_65 = ((moom.DR)(life7_62)).a();
    life7_68 = ((moom.DR)(life7_62)).a__DR();
    life10_72 = ((moom.DR)(life6_32)).a(((moom.DR)(life7_68)));
    spill5126_2 = recovery.source.CarrierOps.dcmpl(((double)(life10_72)), ((double)((0x1.0p0d - (0x1.999999999999ap-6d / life8_65)))));
    if (!((life4_11 == null))) {
        forwardValue5126_81_0 = spill5126_2;
        break forward_join_81;
    }
    if (!((spill5126_2 > 0))) {
        break forward_join_86;
    }
    forwardValue5126_81_0 = ((((net.minecraft.entity.player.EntityPlayer)(p0)).d__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(this)))) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        forwardValue5126_85_0 = forwardValue5126_81_0;
        break forward_join_85;
    }
    if (!((forwardValue5126_81_0 != 0))) {
        break forward_join_86;
    }
    forwardValue5126_85_0 = 1;
    }
    forwardValue5126_87_0 = forwardValue5126_85_0;
    break forward_join_87;
    }
    forwardValue5126_87_0 = 0;
    }
    return ((forwardValue5126_87_0) != 0);
}


protected boolean d__sourceReturn_46e1fbf1bc(double p0, double p1, double p2) {
int lexicalValue1583_84_0;
    int lexicalValue1583_116_0;
    int lexicalValue1583_131_0;
    net.minecraft.entity.Entity[] spill1583_0;
    boolean spill1583_1;
    int spill1583_2;
    boolean spill1583_3;
    boolean spill1583_4;
    long life7_3;
    double life10_7;
    net.minecraft.entity.Entity[] life9_8;
    double life12_11;
    double life14_14;
    int life16_25;
    moom.DT life17_35;
    int life18_47;
    moom.DT life19_65;
    net.minecraft.block.Block life20_71;
    int life18_166;
    int life19_168;
    double life20_179;
    float life22_187;
    float life23_195;
    float life24_203;
    double life25_224;
    double life27_241;
    double life29_262;
    lexical_join_262: {
    lexical_join_248: {
    lexical_join_131: {
    lexical_join_126: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_84: {
    lexical_join_83: {
    life7_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 4479639508349L);
    spill1583_0 = moom.vN.b();
    life10_7 = this.n;
    life9_8 = spill1583_0;
    life12_11 = this.o;
    life14_14 = this.p;
    this.n = ((double)(p0));
    this.o = ((double)(p1));
    this.p = ((double)(p2));
    life16_25 = 0;
    life17_35 = new moom.DT(this.n, this.o, this.p);
    spill1583_1 = ((net.minecraft.world.World)(this.i)).c__Boolean(((moom.DT)(life17_35)));
    if (!((life9_8 == null))) {
        lexicalValue1583_116_0 = ((spill1583_1) ? 1 : 0);
        break lexical_join_116;
    }
    if (!(spill1583_1)) {
        break lexical_join_115;
    }
    life18_47 = 0;
    lexical_cycle_45: while (true) {
    lexical_join_81: {
    lexical_join_79: {
    lexical_join_73: {
    if (!((life18_47 == 0))) {
        break lexical_join_83;
    }
    spill1583_2 = ((moom.DT)(life17_35)).b();
    if (!((life9_8 == null))) {
        lexicalValue1583_84_0 = spill1583_2;
        break lexical_join_84;
    }
    if (!((life9_8 == null))) {
        lexicalValue1583_84_0 = spill1583_2;
        break lexical_join_84;
    }
    if (!((spill1583_2 > 0))) {
        break lexical_join_83;
    }
    life19_65 = ((moom.DT)(life17_35)).b__DT();
    life20_71 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life19_65))))).a__ch();
    if (!((life9_8 == null))) {
        break lexical_join_79;
    }
    if (!(((moom.fn)(((net.minecraft.block.Block)(life20_71)).a__fn())).d__Boolean())) {
        break lexical_join_73;
    }
    life18_47 = 1;
    if (!((life9_8 != null))) {
        break lexical_join_81;
    }
    }
    net.minecraft.entity.monster.EntityEnderman __stackOp1583_21_0 = this;
    ((net.minecraft.entity.monster.EntityEnderman)(__stackOp1583_21_0)).o = ((double)((((net.minecraft.entity.monster.EntityEnderman)(__stackOp1583_21_0)).o - 0x1.0p0d)));
    }
    life17_35 = life19_65;
    }
    if (!((life9_8 != null))) { continue lexical_cycle_45; }
    break lexical_cycle_45;
    }
    }
    lexicalValue1583_84_0 = life18_47;
    }
    if (!((life9_8 == null))) {
        lexicalValue1583_116_0 = lexicalValue1583_84_0;
        break lexical_join_116;
    }
    if (!((lexicalValue1583_84_0 != 0))) {
        break lexical_join_115;
    }
    super.e(((double)(this.n)), ((double)(this.o)), ((double)(this.p)));
    spill1583_3 = ((java.util.List)(((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.monster.EntityEnderman)(this)).b()))))).isEmpty();
    if (!((life9_8 == null))) {
        lexicalValue1583_116_0 = ((spill1583_3) ? 1 : 0);
        break lexical_join_116;
    }
    if (!(spill1583_3)) {
        break lexical_join_115;
    }
    spill1583_4 = ((net.minecraft.world.World)(this.i)).c(((moom.CA)(((net.minecraft.entity.monster.EntityEnderman)(this)).b())));
    if (!((life9_8 == null))) {
        lexicalValue1583_116_0 = ((spill1583_4) ? 1 : 0);
        break lexical_join_116;
    }
    if (!((!spill1583_4))) {
        break lexical_join_115;
    }
    life16_25 = 1;
    }
    lexicalValue1583_116_0 = life16_25;
    }
    if (!((life9_8 == null))) {
        lexicalValue1583_131_0 = lexicalValue1583_116_0;
        break lexical_join_131;
    }
    if (!((lexicalValue1583_116_0 == 0))) {
        break lexical_join_126;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).a__Void(((double)(life10_7)), ((double)(life12_11)), ((double)(life14_14)));
    return ((0) != 0);
    }
    lexicalValue1583_131_0 = __sourceIntrinsic_6336ddba0183_invokedynamic1583_39(30898, (6114824604579111242L ^ life7_3));
    }
    life18_166 = lexicalValue1583_131_0;
    life19_168 = 0;
    lexical_cycle_134: while (true) {
    if (!((life19_168 < life18_166))) {
        break lexical_join_248;
    }
    life20_179 = (((double) life19_168) / (((double) life18_166) - 0x1.0p0d));
    life22_187 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life23_195 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life24_203 = ((((java.util.Random)(this.ah)).nextFloat() - 0x1.0p-1f) * 0x1.99999ap-3f);
    life25_224 = ((life10_7 + ((this.n - life10_7) * life20_179)) + (((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G)) * 0x1.0p1d));
    life27_241 = ((life12_11 + ((this.o - life12_11) * life20_179)) + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H)));
    life29_262 = ((life14_14 + ((this.p - life14_14) * life20_179)) + (((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G)) * 0x1.0p1d));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)(life25_224)), ((double)(life27_241)), ((double)(life29_262)), ((double)(((double) life22_187))), ((double)(((double) life23_195))), ((double)(((double) life24_203))), ((int[])(new int[0])));
    life19_168 += 1;
    if (!((life9_8 == null))) {
        break lexical_join_262;
    }
    if (!((life9_8 != null))) { continue lexical_cycle_134; }
    break lexical_cycle_134;
    }
    }
    ((net.minecraft.world.World)(this.i)).a(((double)(life10_7)), ((double)(life12_11)), ((double)(life14_14)), ((java.lang.String)("mob.endermen.portal")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.entity.monster.EntityEnderman)(this)).a(((java.lang.String)("mob.endermen.portal")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return ((1) != 0);
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p5d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.333334p-2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.f))))).a(((double)(0x1.cp2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityEnderman)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.c))))).a(((double)(0x1.0p6d)));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.bj;
}


public void a(net.minecraft.block.state.IBlockState p0) {
long local2 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 40699298950151L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_a8577dc7acd3_originalDynamicSite1939_2(5318, (3318080279839618113L ^ local2)))), ((java.lang.Object)(java.lang.Short.valueOf(((short)(((short) (net.minecraft.block.Block.a(((net.minecraft.block.state.IBlockState)(p0))) & __sourceIntrinsic_a8577dc7acd3_originalDynamicSite1939_4(10765, (4004056846160464518L ^ local2))))))))));
    return;
}


public net.minecraft.block.state.IBlockState a__sourceReturn_474a78d617() {
long local1 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 104044185062866L);
    return net.minecraft.block.Block.a__fE(((int)((((net.minecraft.entity.DataWatcher)(this.al)).a__Short(((int)(__sourceIntrinsic_fbd36083e528_originalDynamicSite1940_2(5318, (3318110364605945236L ^ local1))))) & __sourceIntrinsic_fbd36083e528_originalDynamicSite1940_4(10765, (4004051740925963091L ^ local1))))));
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.entity.Entity lexicalValue1581_16_0;
    net.minecraft.entity.Entity lexicalValue1581_21_0;
    int lexicalValue1581_36_0;
    int lexicalValue1581_56_0;
    int lexicalValue1581_67_0;
    int lexicalValue1581_90_0;
    int lexicalValue1581_95_0;
    int lexicalValue1581_100_0;
    int lexicalValue1581_121_0;
    net.minecraft.entity.monster.EntityEnderman spill1581_0;
    int spill1581_1;
    boolean spill1581_2;
    int spill1581_3;
    int spill1581_4;
    boolean spill1581_5;
    boolean spill1581_6;
    int spill1581_7;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_124;
    int life6_156;
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_100: {
    lexical_join_96: {
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_67: {
    lexical_join_65: {
    lexical_join_62: {
    lexical_join_56: {
    lexical_join_36: {
    lexical_join_34: {
    lexical_join_25: {
    lexical_join_21: {
    lexical_join_16: {
    lexical_join_14: {
    life3_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 103049174871190L);
    life5_5 = moom.vN.b();
    spill1581_0 = this;
    if (!((life5_5 == null))) {
        lexicalValue1581_16_0 = spill1581_0;
        break lexical_join_16;
    }
    if (!(((net.minecraft.entity.monster.EntityEnderman)(spill1581_0)).a(((net.minecraft.util.DamageSource)(p0))))) {
        break lexical_join_14;
    }
    return ((0) != 0);
    }
    lexicalValue1581_16_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    if (!((life5_5 == null))) {
        lexicalValue1581_21_0 = lexicalValue1581_16_0;
        break lexical_join_21;
    }
    if (!((lexicalValue1581_16_0 != null))) {
        break lexical_join_25;
    }
    lexicalValue1581_21_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    spill1581_1 = ((lexicalValue1581_21_0 instanceof net.minecraft.entity.monster.EntityEndermite) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1581_100_0 = spill1581_1;
        break lexical_join_100;
    }
    if (!((spill1581_1 == 0))) {
        break lexical_join_96;
    }
    }
    spill1581_2 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 == null))) {
        lexicalValue1581_36_0 = ((spill1581_2) ? 1 : 0);
        break lexical_join_36;
    }
    if (!((!spill1581_2))) {
        break lexical_join_34;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).l(((boolean)(true)));
    }
    lexicalValue1581_36_0 = ((p0 instanceof moom.CV) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1581_67_0 = lexicalValue1581_36_0;
        break lexical_join_67;
    }
    if (!((lexicalValue1581_36_0 != 0))) {
        break lexical_join_65;
    }
    spill1581_3 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1581_67_0 = spill1581_3;
        break lexical_join_67;
    }
    if (!((spill1581_3 != 0))) {
        break lexical_join_65;
    }
    spill1581_4 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0);
    if (!((life5_5 == null))) {
        lexicalValue1581_56_0 = spill1581_4;
        break lexical_join_56;
    }
    if (!((spill1581_4 != 0))) {
        break lexical_join_62;
    }
    lexicalValue1581_56_0 = ((((moom.Bo)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).ci)).b__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1581_56_0 != 0))) {
        break lexical_join_62;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).l(((boolean)(false)));
    if (!((life5_5 != null))) {
        break lexical_join_65;
    }
    }
    this.b8 = ((boolean)(true));
    }
    lexicalValue1581_67_0 = ((p0 instanceof moom.CW) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        lexicalValue1581_100_0 = lexicalValue1581_67_0;
        break lexical_join_100;
    }
    if (!((lexicalValue1581_67_0 != 0))) {
        break lexical_join_96;
    }
    this.b8 = ((boolean)(false));
    life6_124 = 0;
    lexical_cycle_75: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    if (!((life6_124 < __sourceIntrinsic_153a193fc182_invokedynamic1581_25(32671, (7312067516235063197L ^ life3_3))))) {
        break lexical_join_94;
    }
    spill1581_5 = ((net.minecraft.entity.monster.EntityEnderman)(this)).ac();
    if (!((life5_5 == null))) {
        lexicalValue1581_95_0 = ((spill1581_5) ? 1 : 0);
        break lexical_join_95;
    }
    if (!((life5_5 == null))) {
        lexicalValue1581_90_0 = ((spill1581_5) ? 1 : 0);
        break lexical_join_90;
    }
    if (!(spill1581_5)) {
        break lexical_join_91;
    }
    lexicalValue1581_90_0 = 1;
    }
    return ((lexicalValue1581_90_0) != 0);
    }
    life6_124 += 1;
    if (!((life5_5 != null))) { continue lexical_cycle_75; }
    break lexical_cycle_75;
    }
    }
    lexicalValue1581_95_0 = 0;
    }
    return ((lexicalValue1581_95_0) != 0);
    }
    lexicalValue1581_100_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    life6_156 = lexicalValue1581_100_0;
    spill1581_6 = ((net.minecraft.util.DamageSource)(p0)).c__Boolean();
    if (!((life5_5 == null))) {
        lexicalValue1581_121_0 = ((spill1581_6) ? 1 : 0);
        break lexical_join_121;
    }
    if (!(spill1581_6)) {
        break lexical_join_120;
    }
    spill1581_7 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_153a193fc182_invokedynamic1581_36(474, (1600100912338264518L ^ life3_3)))));
    if (!((life5_5 == null))) {
        lexicalValue1581_121_0 = spill1581_7;
        break lexical_join_121;
    }
    if (!((spill1581_7 != 0))) {
        break lexical_join_120;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).ac();
    }
    lexicalValue1581_121_0 = life6_156;
    }
    return ((lexicalValue1581_121_0) != 0);
}


protected boolean ac() {
long local1 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 107881468173286L);
    double local3 = (this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p6d));
    double local5 = (this.o + ((double) (((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_d73cace8ce31_originalDynamicSite1941_6(7197, (8511095845778557813L ^ local1))))) - __sourceIntrinsic_d73cace8ce31_originalDynamicSite1941_8(1817, (8952308971100180598L ^ local1)))));
    double local7 = (this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p6d));
    return ((net.minecraft.entity.monster.EntityEnderman)(this)).d__sourceReturn_46e1fbf1bc(((double)(local3)), ((double)(local5)), ((double)(local7)));
}


protected void R() {
int forwardValue5120_18_0;
    int forwardValue5120_45_0;
    net.minecraft.entity.monster.EntityEnderman forwardValue5120_93_0;
    boolean spill5120_0;
    boolean spill5120_1;
    int spill5120_2;
    net.minecraft.entity.monster.EntityEnderman spill5120_3;
    net.minecraft.entity.monster.EntityEnderman spill5120_4;
    net.minecraft.entity.monster.EntityEnderman spill5120_5;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    float life4_76;
    forward_join_94: {
    forward_join_93: {
    forward_join_92: {
    forward_join_45: {
    forward_join_40: {
    forward_join_18: {
    forward_join_16: {
    life1_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 116793503757238L);
    life3_5 = moom.vN.b();
    spill5120_0 = ((net.minecraft.entity.monster.EntityEnderman)(this)).i__Boolean();
    if (!((life3_5 == null))) {
        forwardValue5120_18_0 = ((spill5120_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill5120_0)) {
        break forward_join_16;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.f)), ((float)(0x1.0p0f)));
    }
    forwardValue5120_18_0 = ((((net.minecraft.entity.monster.EntityEnderman)(this)).ad()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5120_45_0 = forwardValue5120_18_0;
        break forward_join_45;
    }
    if (!((forwardValue5120_18_0 != 0))) {
        break forward_join_40;
    }
    spill5120_1 = this.b8;
    if (!((life3_5 == null))) {
        forwardValue5120_45_0 = ((spill5120_1) ? 1 : 0);
        break forward_join_45;
    }
    if (!((!spill5120_1))) {
        break forward_join_40;
    }
    spill5120_2 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5120_11(4230, (1489841006290382779L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5120_45_0 = spill5120_2;
        break forward_join_45;
    }
    if (!((spill5120_2 == 0))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).l(((boolean)(false)));
    }
    spill5120_3 = this;
    if (!((life3_5 == null))) {
        forwardValue5120_93_0 = spill5120_3;
        break forward_join_93;
    }
    forwardValue5120_45_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityEnderman)(spill5120_3)).i)).e__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5120_45_0 != 0))) {
        break forward_join_92;
    }
    life4_76 = ((net.minecraft.entity.monster.EntityEnderman)(this)).a(((float)(0x1.0p0f)));
    if (!((life3_5 == null))) {
        break forward_join_94;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life4_76)), ((float)(0x1.0p-1f))) > 0))) {
        break forward_join_92;
    }
    spill5120_4 = this;
    if (!((life3_5 == null))) {
        forwardValue5120_93_0 = spill5120_4;
        break forward_join_93;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityEnderman)(spill5120_4)).i)).e(((moom.DT)(new moom.DT(this)))))) {
        break forward_join_92;
    }
    spill5120_5 = this;
    if (!((life3_5 == null))) {
        forwardValue5120_93_0 = spill5120_5;
        break forward_join_93;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)((((java.util.Random)(((net.minecraft.entity.monster.EntityEnderman)(spill5120_5)).ah)).nextFloat() * 0x1.ep4f))), ((float)(((life4_76 - 0x1.99999ap-2f) * 0x1.0p1f)))) < 0))) {
        break forward_join_92;
    }
    ((net.minecraft.entity.monster.EntityEnderman)(this)).c(((net.minecraft.entity.EntityLivingBase)(null)));
    ((net.minecraft.entity.monster.EntityEnderman)(this)).l(((boolean)(false)));
    this.b8 = ((boolean)(false));
    ((net.minecraft.entity.monster.EntityEnderman)(this)).ac();
    }
    forwardValue5120_93_0 = this;
    }
    __sourceIntrinsic_ebf98100c39e_call5120_28(forwardValue5120_93_0);
    }
    return;
}


public void G() {
net.minecraft.entity.monster.EntityEnderman lexicalValue1580_86_0;
    net.minecraft.entity.monster.EntityEnderman spill1580_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_16;
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_82: {
    life1_3 = (net.minecraft.entity.monster.EntityEnderman.cb ^ 75487101158940L);
    life3_5 = moom.vN.b();
    spill1580_0 = this;
    if (!((life3_5 == null))) {
        lexicalValue1580_86_0 = spill1580_0;
        break lexical_join_86;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.monster.EntityEnderman)(spill1580_0)).i)).G)) {
        break lexical_join_82;
    }
    life4_16 = 0;
    lexical_cycle_14: while (true) {
    if (!((life4_16 < 2))) {
        break lexical_join_82;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)((this.n + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)(((this.o + (((java.util.Random)(this.ah)).nextDouble() * ((double) this.H))) - 0x1.0p-2d))), ((double)((this.p + ((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * ((double) this.G))))), ((double)(((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p1d))), ((double)((-((java.util.Random)(this.ah)).nextDouble()))), ((double)(((((java.util.Random)(this.ah)).nextDouble() - 0x1.0p-1d) * 0x1.0p1d))), ((int[])(new int[0])));
    life4_16 += 1;
    if (!((life3_5 == null))) {
        break lexical_join_87;
    }
    if (!((life3_5 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    this.bi = ((boolean)(false));
    lexicalValue1580_86_0 = this;
    }
    __sourceIntrinsic_c7b45e3c376e_call1580_26(lexicalValue1580_86_0);
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_30(int a0, long a1) throws E;

private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_028ed6e8087878ef_originalDynamicSite3362_31() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_c7b45e3c376e_call1580_26(net.minecraft.entity.monster.EntityEnderman a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5120_11(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_ebf98100c39e_call5120_28(net.minecraft.entity.monster.EntityEnderman a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbd36083e528_originalDynamicSite1940_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbd36083e528_originalDynamicSite1940_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a8577dc7acd3_originalDynamicSite1939_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a8577dc7acd3_originalDynamicSite1939_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1581_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_153a193fc182_invokedynamic1581_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_originalDynamicSite1941_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_originalDynamicSite1941_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0a402d4f733_invokedynamic5122_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5124_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5124_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5124_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6336ddba0183_invokedynamic1583_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1938_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11425_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebd27df71865_originalDynamicSite1937_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebd27df71865_originalDynamicSite1937_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5127_3(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
