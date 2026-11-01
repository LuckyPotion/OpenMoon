package net.minecraft.entity.monster;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityCreeper extends moom.sZ {

private int b5;

private int b6;

private int b7;

private int b8;

private int b9;

private static long cb;

private static long[] db;

private static java.lang.Integer[] jb;

private static java.util.Map xb;

public EntityCreeper(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }

private static void __sourceConstructorBody_22c76f1909698ca6(net.minecraft.entity.monster.EntityCreeper receiver, net.minecraft.world.World p0) throws Throwable {
long local2 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 2695947728857L);
    net.minecraft.entity.monster.EntityCreeper.__sourceConstructorInit_22c76f1909698ca6_0(((net.minecraft.entity.monster.EntityCreeper)(receiver)), ((net.minecraft.world.World)(p0)));
    ((net.minecraft.entity.monster.EntityCreeper)(receiver)).b7 = ((int)(__sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_2(17976, (6761330670197787499L ^ local2))));
    ((net.minecraft.entity.monster.EntityCreeper)(receiver)).b8 = ((int)(__sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_4(30951, (1916534709111977404L ^ local2))));
    ((net.minecraft.entity.monster.EntityCreeper)(receiver)).b9 = ((int)(0));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uQ(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.ul(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.uh(receiver, net.minecraft.entity.passive.EntityOcelot.class, 0x1.8p2f, 0x1.0p0d, 0x1.3333333333333p0d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.ue(receiver, 0x1.0p0d, false))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.999999999999ap-1d))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(__sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_19(14075, (6404977505575222177L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.0p3f))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bJ)).a(((int)(__sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_23(7617, (3607344464244248729L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.player.EntityPlayer.class, true))));
    ((net.minecraft.entity.ai.EntityAITasks)(((net.minecraft.entity.monster.EntityCreeper)(receiver)).bK)).a(((int)(2)), ((moom.uc)(new moom.uT(receiver, false, new java.lang.Class[0]))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(7390442861560514663L)), ((long)(-1479172609385099304L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272327360803393L)))));
    xb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 17550173758334L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1867_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1867_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1867_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1867_14 = new byte[8];
    (__sourceSpill1867_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1867_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1867_16 = __sourceSpill1867_14;
    ((javax.crypto.Cipher)(__sourceSpill1867_11)).init(((int)(__sourceSpill1867_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1867_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1867_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[12];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?«¤8?V¨Kq¤\007k\0218RÌÑwoxê,Ì\001Xp¼\004¯U8\006\nEé\032\002Ðxú\024¨?\007mrËivWqFjÙ\007ä§\007Y\020ElWPMêh\017Ù0(uLCu=ý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1867_25 = local6_life21;
        int __sourceSpill1867_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1867_25)).substring(((int)(__sourceSpill1867_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1867_30 = local8_life19;
        int __sourceSpill1867_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1867_33 = new byte[8];
        (__sourceSpill1867_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1867_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1867_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1867_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1867_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1867_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1867_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1867_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1867_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1867_34)).doFinal(((byte[])(__sourceSpill1867_33)));
        (__sourceSpill1867_30)[__sourceSpill1867_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "~Tý}\037Ï9¢«/E="))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1867_38 = local6_life21;
        int __sourceSpill1867_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1867_38)).substring(((int)(__sourceSpill1867_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1867_43 = local8_life19;
        int __sourceSpill1867_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1867_46 = new byte[8];
        (__sourceSpill1867_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1867_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1867_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1867_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1867_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1867_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1867_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1867_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1867_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1867_47)).doFinal(((byte[])(__sourceSpill1867_46)));
        (__sourceSpill1867_43)[__sourceSpill1867_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    jb = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_22c76f1909698ca6_0(net.minecraft.entity.monster.EntityCreeper a0, net.minecraft.world.World a1) throws E;

public void Z__sourceReturn_da8c82d5d4() {
this.b9 += 1;
    return;
}


public int i__sourceReturn_8abf5c6871() {
long local1 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 34252782215071L);
    return ((((net.minecraft.entity.monster.EntityCreeper)(this)).d__sourceReturn_d30556f370() == null) ? 3 : (3 + ((int) (((net.minecraft.entity.monster.EntityCreeper)(this)).b__sourceReturn_bc607678b6() - 0x1.0p0f))));
}


public boolean ad() {
int forwardValue5114_18_0;
    int forwardValue5114_20_0;
    byte spill5114_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 127303447586555L);
    life3_5 = moom.vN.b();
    spill5114_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_e0a402d4f733_invokedynamic5114_3(31430, (2734540833307223729L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5114_18_0 = ((int)(spill5114_0));
        break forward_join_18;
    }
    if (!((spill5114_0 != 0))) {
        break forward_join_19;
    }
    forwardValue5114_18_0 = 1;
    }
    forwardValue5114_20_0 = forwardValue5114_18_0;
    break forward_join_20;
    }
    forwardValue5114_20_0 = 0;
    }
    return ((forwardValue5114_20_0) != 0);
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11413_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/s2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.monster.EntityCreeper.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int e(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11690;
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
            throw new RuntimeException("moom/s2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         jb[var3] = var15;
      }

      return jb[var3];
}


public boolean ae() {
int forwardValue5115_17_0;
    int forwardValue5115_21_0;
    int forwardValue5115_23_0;
    int spill5115_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 99055365049255L);
    life3_5 = moom.vN.b();
    spill5115_0 = this.b9;
    if (!((life3_5 == null))) {
        forwardValue5115_17_0 = spill5115_0;
        break forward_join_17;
    }
    if (!((spill5115_0 < 1))) {
        break forward_join_22;
    }
    forwardValue5115_17_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doMobLoot")))) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue5115_21_0 = forwardValue5115_17_0;
        break forward_join_21;
    }
    if (!((forwardValue5115_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue5115_21_0 = 1;
    }
    forwardValue5115_23_0 = forwardValue5115_21_0;
    break forward_join_23;
    }
    forwardValue5115_23_0 = 0;
    }
    return ((forwardValue5115_23_0) != 0);
}


public int s() {
long local1 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 100179608901927L);
    return ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_421c707d57eb_originalDynamicSite1932_2(26343, (2356107216698000717L ^ local1)))));
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public float c__sourceReturn_f6c4892e39(float p0) {
return ((((float) this.b5) + (((float) (this.b6 - this.b5)) * p0)) / ((float) (this.b7 - 2)));
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.entity.DataWatcher forwardValue5116_23_0;
    int forwardValue5116_23_1;
    int forwardValue5116_23_2;
    net.minecraft.entity.DataWatcher forwardValue5116_24_0;
    int forwardValue5116_24_1;
    net.minecraft.entity.DataWatcher forwardValue5116_25_0;
    int forwardValue5116_25_1;
    int forwardValue5116_25_2;
    int forwardValue5116_52_0;
    int forwardValue5116_63_0;
    net.minecraft.entity.Entity[] spill5116_0;
    net.minecraft.entity.DataWatcher spill5116_1;
    int spill5116_2;
    boolean spill5116_3;
    boolean spill5116_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_66: {
    forward_join_63: {
    forward_join_60: {
    forward_join_52: {
    forward_join_44: {
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 41589693049279L);
    spill5116_0 = moom.vN.b();
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5116_0;
    spill5116_1 = this.al;
    spill5116_2 = __sourceIntrinsic_01f4e1cd062e_invokedynamic5116_4(9237, (1147968557762836266L ^ life2_3));
    spill5116_3 = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("powered")));
    if (!((life4_8 == null))) {
        forwardValue5116_23_0 = spill5116_1;
        forwardValue5116_23_1 = spill5116_2;
        forwardValue5116_23_2 = ((spill5116_3) ? 1 : 0);
        break forward_join_23;
    }
    if (!(spill5116_3)) {
        forwardValue5116_24_0 = spill5116_1;
        forwardValue5116_24_1 = spill5116_2;
        break forward_join_24;
    }
    forwardValue5116_23_0 = spill5116_1;
    forwardValue5116_23_1 = spill5116_2;
    forwardValue5116_23_2 = 1;
    }
    forwardValue5116_25_0 = forwardValue5116_23_0;
    forwardValue5116_25_1 = forwardValue5116_23_1;
    forwardValue5116_25_2 = forwardValue5116_23_2;
    break forward_join_25;
    }
    forwardValue5116_25_0 = forwardValue5116_24_0;
    forwardValue5116_25_1 = forwardValue5116_24_1;
    forwardValue5116_25_2 = 0;
    }
    ((net.minecraft.entity.DataWatcher)(forwardValue5116_25_0)).b(((int)(forwardValue5116_25_1)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) forwardValue5116_25_2)))))));
    spill5116_4 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Fuse")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5116_9(30054, (4966066031424677457L ^ life2_3)))));
    if (!((life4_8 == null))) {
        forwardValue5116_52_0 = ((spill5116_4) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill5116_4)) {
        break forward_join_44;
    }
    this.b7 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Short(((java.lang.String)("Fuse")))));
    }
    forwardValue5116_52_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("ExplosionRadius")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic5116_14(21887, (3362356741814978123L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue5116_63_0 = forwardValue5116_52_0;
        break forward_join_63;
    }
    if (!((forwardValue5116_52_0 != 0))) {
        break forward_join_60;
    }
    this.b8 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("ExplosionRadius")))));
    }
    forwardValue5116_63_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("ignited")))) ? 1 : 0);
    }
    if (!((forwardValue5116_63_0 != 0))) {
        break forward_join_66;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this)).Y__sourceReturn_da8c82d5d4();
    }
    return;
}


public boolean c__sourceReturn_13640a2b19(net.minecraft.entity.Entity p0) {
return ((1) != 0);
}


protected java.lang.String c__String() {
return "mob.creeper.say";
}


protected java.lang.String h__String() {
return "mob.creeper.death";
}


public void l(int p0) {
long local2 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 60383448486157L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_3c5642f51658_originalDynamicSite1933_2(8609, (4045681837657836066L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) p0)))))));
    return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 27177018880692L);
    net.minecraft.entity.Entity[] spill9460_0 = moom.vN.b();
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    net.minecraft.entity.Entity[] local4 = spill9460_0;
    if ((local4 == null)) {
        if ((((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_458405b53cd1_invokedynamic9460_4(17508, (2491633060321004639L ^ local2))))) == 1)) {
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("powered")), ((boolean)(true)));
    }
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Fuse")), ((short)(((short) this.b7))));
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ExplosionRadius")), ((byte)(((byte) this.b8))));
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("ignited")), ((boolean)(((net.minecraft.entity.monster.EntityCreeper)(this)).ad())));
    }
    return;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 89991247336940L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_3(8609, (4045711316612255427L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(-1))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_7(9237, (1147876231496108921L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_11(31061, (3895682090691614256L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


public void d(float p0, float p1) {
net.minecraft.entity.monster.EntityCreeper forwardValue5117_30_0;
    net.minecraft.entity.Entity[] spill5117_0;
    net.minecraft.entity.monster.EntityCreeper spill5117_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_35: {
    forward_join_30: {
    life3_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 136428959417671L);
    spill5117_0 = moom.vN.b();
    super.d(((float)(p0)), ((float)(p1)));
    life5_9 = spill5117_0;
    this.b6 = ((int)(((int) (((float) this.b6) + (p0 * 0x1.8p0f)))));
    spill5117_1 = this;
    if (!((life5_9 == null))) {
        forwardValue5117_30_0 = spill5117_1;
        break forward_join_30;
    }
    if (!((((net.minecraft.entity.monster.EntityCreeper)(spill5117_1)).b6 > (this.b7 - 5)))) {
        break forward_join_35;
    }
    forwardValue5117_30_0 = this;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(forwardValue5117_30_0)).b6 = ((int)((this.b7 - 5)));
    }
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.monster.EntityCreeper)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.0p-2d)));
    return;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.H;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
int forwardValue5111_45_0;
    net.minecraft.entity.Entity forwardValue5111_48_0;
    net.minecraft.entity.Entity forwardValue5111_54_0;
    int forwardValue5111_65_0;
    net.minecraft.entity.monster.EntityCreeper forwardValue5111_71_0;
    net.minecraft.entity.Entity[] spill5111_0;
    int spill5111_1;
    net.minecraft.entity.Entity spill5111_2;
    boolean spill5111_3;
    net.minecraft.entity.monster.EntityCreeper spill5111_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    int life5_20;
    int life6_23;
    int life7_34;
    forward_join_80: {
    forward_join_71: {
    forward_join_65: {
    forward_join_54: {
    forward_join_48: {
    forward_join_45: {
    forward_join_40: {
    life2_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 2810518440132L);
    spill5111_0 = moom.vN.b();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill5111_0;
    spill5111_1 = ((((net.minecraft.util.DamageSource)(p0)).b__r3() instanceof net.minecraft.entity.monster.EntitySkeleton) ? 1 : 0);
    if (!((life4_8 == null))) {
        forwardValue5111_45_0 = spill5111_1;
        break forward_join_45;
    }
    if (!((spill5111_1 != 0))) {
        break forward_join_40;
    }
    life5_20 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.b5)));
    life6_23 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(net.minecraft.init.Items.cf)));
    life7_34 = (life5_20 + ((java.util.Random)(this.ah)).nextInt(((int)(((life6_23 - life5_20) + 1)))));
    ((net.minecraft.entity.monster.EntityCreeper)(this)).a(((net.minecraft.item.Item)(net.minecraft.item.Item.a__wQ(((int)(life7_34))))), ((int)(1)));
    if (!((life4_8 != null))) {
        break forward_join_80;
    }
    }
    spill5111_2 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    if (!((life4_8 == null))) {
        forwardValue5111_48_0 = spill5111_2;
        break forward_join_48;
    }
    forwardValue5111_45_0 = ((spill5111_2 instanceof net.minecraft.entity.monster.EntityCreeper) ? 1 : 0);
    }
    if (!((forwardValue5111_45_0 != 0))) {
        break forward_join_80;
    }
    forwardValue5111_48_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    if (!((life4_8 == null))) {
        forwardValue5111_54_0 = forwardValue5111_48_0;
        break forward_join_54;
    }
    if (!((forwardValue5111_48_0 != this))) {
        break forward_join_80;
    }
    forwardValue5111_54_0 = ((net.minecraft.util.DamageSource)(p0)).b__r3();
    }
    spill5111_3 = ((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(forwardValue5111_54_0)))).ac();
    if (!((life4_8 == null))) {
        forwardValue5111_65_0 = ((spill5111_3) ? 1 : 0);
        break forward_join_65;
    }
    if (!(spill5111_3)) {
        break forward_join_80;
    }
    spill5111_4 = ((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.util.DamageSource)(p0)).b__r3()));
    if (!((life4_8 == null))) {
        forwardValue5111_71_0 = spill5111_4;
        break forward_join_71;
    }
    forwardValue5111_65_0 = ((((net.minecraft.entity.monster.EntityCreeper)(spill5111_4)).ae()) ? 1 : 0);
    }
    if (!((forwardValue5111_65_0 != 0))) {
        break forward_join_80;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.entity.monster.EntityCreeper)(((net.minecraft.util.DamageSource)(p0)).b__r3())))).Z__sourceReturn_da8c82d5d4();
    forwardValue5111_71_0 = this;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(forwardValue5111_71_0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bM, 1, 4))), ((float)(0x0.0p0f)));
    }
    return;
}


protected boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue5112_15_0;
    int forwardValue5112_61_0;
    net.minecraft.entity.Entity[] spill5112_0;
    net.minecraft.item.ItemStack spill5112_1;
    boolean spill5112_2;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    net.minecraft.entity.Entity[] life4_9;
    forward_join_61: {
    forward_join_58: {
    forward_join_15: {
    life2_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 6691616925447L);
    spill5112_0 = moom.vN.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill5112_0;
    spill5112_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue5112_15_0 = spill5112_1;
        break forward_join_15;
    }
    if (!((spill5112_1 != null))) {
        break forward_join_58;
    }
    forwardValue5112_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue5112_15_0)).a__wQ() == net.minecraft.init.Items.d))) {
        break forward_join_58;
    }
    ((net.minecraft.world.World)(this.i)).a(((double)((this.n + 0x1.0p-1d))), ((double)((this.o + 0x1.0p-1d))), ((double)((this.p + 0x1.0p-1d))), ((java.lang.String)("fire.ignite")), ((float)(0x1.0p0f)), ((float)(((((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f))));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).B__sourceReturn_da8c82d5d4();
    spill5112_2 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life4_9 == null))) {
        forwardValue5112_61_0 = ((spill5112_2) ? 1 : 0);
        break forward_join_61;
    }
    if (!((!spill5112_2))) {
        break forward_join_58;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this)).Y__sourceReturn_da8c82d5d4();
    ((net.minecraft.item.ItemStack)(life5_8)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    return ((1) != 0);
    }
    forwardValue5112_61_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue5112_61_0) != 0);
}


public void a(moom.tu p0) {
long local2 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 74349481921861L);
    super.a(((moom.tu)(p0)));
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_1aa9a6746006_originalDynamicSite1935_3(9237, (1147856190874686416L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    return;
}


public void g__Void() {
int forwardValue5118_25_0;
    int forwardValue5118_48_0;
    int forwardValue5118_58_0;
    net.minecraft.entity.monster.EntityCreeper forwardValue5118_68_0;
    net.minecraft.entity.monster.EntityCreeper spill5118_0;
    boolean spill5118_1;
    int spill5118_2;
    int spill5118_3;
    net.minecraft.entity.monster.EntityCreeper spill5118_4;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_37;
    forward_join_68: {
    forward_join_67: {
    forward_join_58: {
    forward_join_54: {
    forward_join_48: {
    forward_join_40: {
    forward_join_25: {
    forward_join_23: {
    life1_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 18829592102603L);
    life3_5 = moom.vN.b();
    spill5118_0 = this;
    if (!((life3_5 == null))) {
        forwardValue5118_68_0 = spill5118_0;
        break forward_join_68;
    }
    if (!(((net.minecraft.entity.monster.EntityCreeper)(spill5118_0)).p__Boolean())) {
        break forward_join_67;
    }
    this.b5 = ((int)(this.b6));
    spill5118_1 = ((net.minecraft.entity.monster.EntityCreeper)(this)).ad();
    if (!((life3_5 == null))) {
        forwardValue5118_25_0 = ((spill5118_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill5118_1)) {
        break forward_join_23;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this)).l(((int)(1)));
    }
    forwardValue5118_25_0 = ((net.minecraft.entity.monster.EntityCreeper)(this)).s();
    }
    life4_37 = forwardValue5118_25_0;
    spill5118_2 = life4_37;
    if (!((life3_5 == null))) {
        forwardValue5118_48_0 = spill5118_2;
        break forward_join_48;
    }
    if (!((spill5118_2 > 0))) {
        break forward_join_40;
    }
    spill5118_3 = this.b6;
    if (!((life3_5 == null))) {
        forwardValue5118_48_0 = spill5118_3;
        break forward_join_48;
    }
    if (!((spill5118_3 == 0))) {
        break forward_join_40;
    }
    ((net.minecraft.entity.monster.EntityCreeper)(this)).a(((java.lang.String)("creeper.primed")), ((float)(0x1.0p0f)), ((float)(0x1.0p-1f)));
    }
    net.minecraft.entity.monster.EntityCreeper __stackOp5118_11_0 = this;
    ((net.minecraft.entity.monster.EntityCreeper)(__stackOp5118_11_0)).b6 = ((int)((((net.minecraft.entity.monster.EntityCreeper)(__stackOp5118_11_0)).b6 + life4_37)));
    forwardValue5118_48_0 = this.b6;
    }
    if (!((life3_5 == null))) {
        forwardValue5118_58_0 = forwardValue5118_48_0;
        break forward_join_58;
    }
    if (!((forwardValue5118_48_0 < 0))) {
        break forward_join_54;
    }
    this.b6 = ((int)(0));
    }
    spill5118_4 = this;
    if (!((life3_5 == null))) {
        forwardValue5118_68_0 = spill5118_4;
        break forward_join_68;
    }
    forwardValue5118_58_0 = ((net.minecraft.entity.monster.EntityCreeper)(spill5118_4)).b6;
    }
    if (!((forwardValue5118_58_0 >= this.b7))) {
        break forward_join_67;
    }
    this.b6 = ((int)(this.b7));
    ((net.minecraft.entity.monster.EntityCreeper)(this)).X__sourceReturn_da8c82d5d4();
    }
    forwardValue5118_68_0 = this;
    }
    __sourceIntrinsic_736a66cda11e_call5118_21(forwardValue5118_68_0);
    return;
}


public boolean ac() {
int forwardValue5113_19_0;
    int forwardValue5113_21_0;
    byte spill5113_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 113327882403462L);
    life3_5 = moom.vN.b();
    spill5113_0 = ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_d73cace8ce31_invokedynamic5113_3(9237, (1147896269860528147L ^ life1_3)))));
    if (!((life3_5 == null))) {
        forwardValue5113_19_0 = ((int)(spill5113_0));
        break forward_join_19;
    }
    if (!((spill5113_0 == 1))) {
        break forward_join_20;
    }
    forwardValue5113_19_0 = 1;
    }
    forwardValue5113_21_0 = forwardValue5113_19_0;
    break forward_join_21;
    }
    forwardValue5113_21_0 = 0;
    }
    return ((forwardValue5113_21_0) != 0);
}


private void X__sourceReturn_da8c82d5d4() {
int forwardValue5110_17_0;
    float forwardValue5110_24_0;
    boolean spill5110_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_23;
    float life5_32;
    forward_join_44: {
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life1_3 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 76067851887081L);
    life3_5 = moom.vN.b();
    spill5110_0 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_5 == null))) {
        forwardValue5110_17_0 = ((spill5110_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill5110_0))) {
        break forward_join_44;
    }
    forwardValue5110_17_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))) ? 1 : 0);
    }
    life4_23 = forwardValue5110_17_0;
    if (!(((net.minecraft.entity.monster.EntityCreeper)(this)).ac())) {
        break forward_join_23;
    }
    forwardValue5110_24_0 = 0x1.0p1f;
    break forward_join_24;
    }
    forwardValue5110_24_0 = 0x1.0p0f;
    }
    life5_32 = forwardValue5110_24_0;
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)((((float) this.b8) * life5_32))), ((boolean)__sourceIntrinsic_integerToBoolean((life4_23))));
    ((net.minecraft.entity.monster.EntityCreeper)(this)).f__Void();
    }
    return;
}


public void Y__sourceReturn_da8c82d5d4() {
long local1 = (net.minecraft.entity.monster.EntityCreeper.cb ^ 123615881059072L);
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_5910df8f1d95_originalDynamicSite1936_2(31061, (3895648370500245724L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_22c76f1909698ca6_originalDynamicSite3359_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5910df8f1d95_originalDynamicSite1936_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1aa9a6746006_originalDynamicSite1935_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d73cace8ce31_invokedynamic5113_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e0a402d4f733_invokedynamic5114_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5116_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5116_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic5116_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_458405b53cd1_invokedynamic9460_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1934_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral11413_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_736a66cda11e_call5118_21(net.minecraft.entity.monster.EntityCreeper a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c5642f51658_originalDynamicSite1933_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_421c707d57eb_originalDynamicSite1932_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
