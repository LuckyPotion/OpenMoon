package net.minecraft.entity.passive;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityBat extends net.minecraft.entity.passive.EntityAmbientCreature {

private moom.DT bX;

private static final long cb;

private static final long[] db;

private static final java.lang.Integer[] eb;

private static final java.util.Map ib;

public EntityBat(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.0000000000000p-1f, 0x1.cccccc0000000p-1f);
    (this).l(true);
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3414120766986080728L)), ((long)(4299616075612341308L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(141047507864560L)))));
    ib = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.passive.EntityBat.cb ^ 127187139527542L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1877_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1877_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1877_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1877_14 = new byte[8];
    (__sourceSpill1877_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1877_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1877_16 = __sourceSpill1877_14;
    ((javax.crypto.Cipher)(__sourceSpill1877_11)).init(((int)(__sourceSpill1877_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1877_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1877_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "?¶e£\nAâÿ\006­\016óåð\nø&m$bÝ:\021=\025=0È\tÍXÊòI`vsÐ]Ô\030\031oHX=\001lô²ú«©SæÜS)fTsëj5«ä\020n)o\034\020']î\026ú¢$iJvp¿ é\023Ñlý"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1877_25 = local6_life21;
        int __sourceSpill1877_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1877_25)).substring(((int)(__sourceSpill1877_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1877_30 = local8_life19;
        int __sourceSpill1877_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1877_33 = new byte[8];
        (__sourceSpill1877_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1877_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1877_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1877_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1877_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1877_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1877_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1877_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1877_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1877_34)).doFinal(((byte[])(__sourceSpill1877_33)));
        (__sourceSpill1877_30)[__sourceSpill1877_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ZñÆR\030\027D]fy°¦7ìÒ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1877_38 = local6_life21;
        int __sourceSpill1877_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1877_38)).substring(((int)(__sourceSpill1877_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1877_43 = local8_life19;
        int __sourceSpill1877_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1877_46 = new byte[8];
        (__sourceSpill1877_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1877_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1877_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1877_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1877_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1877_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1877_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1877_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1877_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1877_47)).doFinal(((byte[])(__sourceSpill1877_46)));
        (__sourceSpill1877_43)[__sourceSpill1877_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    eb = ((java.lang.Integer[])(new java.lang.Integer[15]));
}


protected void I() {
return;
}


protected java.lang.String i__String() {
int forwardValue5227_15_0;
    java.lang.String forwardValue5227_19_0;
    boolean spill5227_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 10308094567064L);
    life3_5 = moom.vR.b();
    spill5227_0 = ((net.minecraft.entity.passive.EntityBat)(this)).Y();
    if (!((life3_5 != 0))) {
        forwardValue5227_15_0 = ((spill5227_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5227_0)) {
        break forward_join_18;
    }
    forwardValue5227_15_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(4)));
    }
    if (!((forwardValue5227_15_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5227_19_0 = null;
    break forward_join_19;
    }
    forwardValue5227_19_0 = "mob.bat.idle";
    }
    return forwardValue5227_19_0;
}


public float e__Float() {
return (((net.minecraft.entity.passive.EntityBat)(this)).H / 0x1.0p1f);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (net.minecraft.entity.passive.EntityBat.cb ^ 13133224197049L);
    super.c(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).b(((int)(__sourceIntrinsic_01f4e1cd062e_originalDynamicSite1959_3(5364, (1499937084279596079L ^ local2)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("BatFlags")))))))));
    return;
}


protected java.lang.String c__String() {
return "mob.bat.hurt";
}


public boolean n__Boolean() {
return ((0) != 0);
}


protected void h(net.minecraft.entity.Entity p0) {
return;
}


protected java.lang.String h__String() {
return "mob.bat.death";
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-4f;
}


public void l(boolean p0) {
long life2_3;
    int life5_13;
    int life4_14;
    forward_join_51: {
    forward_join_34: {
    forward_join_32: {
    life2_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 45707685004088L);
    int spill5874_0 = moom.vR.b();
    life5_13 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).a(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5874_3(5364, (1499974340649032878L ^ life2_3)))));
    life4_14 = spill5874_0;
    if (!((life4_14 != 0))) { break forward_join_32; }
    if (!(p0)) { break forward_join_34; }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).b(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5874_6(5364, (1499974340649032878L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 | 1))))))));
    }
    if (!((life4_14 == 0))) { break forward_join_51; }
    }
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).b(((int)(__sourceIntrinsic_93fe014f0768_invokedynamic5874_10(5364, (1499974340649032878L ^ life2_3)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(((byte) (life5_13 & __sourceIntrinsic_93fe014f0768_invokedynamic5874_11(11081, (1026728279071990555L ^ life2_3))))))))));
    }
    return;
}


public void d(float p0, float p1) {
return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.passive.EntityBat.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (net.minecraft.entity.passive.EntityBat.cb ^ 60014371184818L);
    super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("BatFlags")), ((byte)(((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).a(((int)(__sourceIntrinsic_458405b53cd1_originalDynamicSite1960_3(5364, (1499951220989935396L ^ local2))))))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20038;
      if (eb[var3] == null) {
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
         Object[] var9 = (Object[])ib.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               ib.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11546_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void d__Void() {
long local1 = (net.minecraft.entity.passive.EntityBat.cb ^ 140712584431594L);
    super.d__Void();
    ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1961_3(5364, (1499888750352554108L ^ local1)))), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(0))))));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((net.minecraft.entity.passive.EntityBat)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.8p2d)));
    return;
}


private boolean a(java.util.Calendar p0) {
int forwardValue5224_40_0;
    int forwardValue5224_40_1;
    int forwardValue5224_49_0;
    int forwardValue5224_49_1;
    int forwardValue5224_51_0;
    int forwardValue5224_53_0;
    int spill5224_0;
    int spill5224_1;
    int spill5224_2;
    int spill5224_3;
    long life2_3;
    int life4_5;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_49: {
    forward_join_40: {
    forward_join_30: {
    life2_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 34350688340407L);
    life4_5 = moom.vR.b();
    spill5224_0 = (((java.util.Calendar)(p0)).get(((int)(2))) + 1);
    spill5224_1 = __sourceIntrinsic_8079f3c87391_invokedynamic5224_3(8201, (4059671608922645200L ^ life2_3));
    if (!((life4_5 != 0))) {
        forwardValue5224_40_0 = spill5224_0;
        forwardValue5224_40_1 = spill5224_1;
        break forward_join_40;
    }
    if (!((spill5224_0 == spill5224_1))) {
        break forward_join_30;
    }
    spill5224_2 = ((java.util.Calendar)(p0)).get(((int)(5)));
    if (!((life4_5 != 0))) {
        forwardValue5224_51_0 = spill5224_2;
        break forward_join_51;
    }
    if (!((spill5224_2 < __sourceIntrinsic_8079f3c87391_invokedynamic5224_5(25112, (8857516113879097539L ^ life2_3))))) {
        break forward_join_50;
    }
    }
    forwardValue5224_40_0 = (((java.util.Calendar)(p0)).get(((int)(2))) + 1);
    forwardValue5224_40_1 = __sourceIntrinsic_8079f3c87391_invokedynamic5224_7(2124, (2952255608007920283L ^ life2_3));
    }
    if (!((life4_5 != 0))) {
        forwardValue5224_49_0 = forwardValue5224_40_0;
        forwardValue5224_49_1 = forwardValue5224_40_1;
        break forward_join_49;
    }
    if (!((forwardValue5224_40_0 == forwardValue5224_40_1))) {
        break forward_join_52;
    }
    spill5224_3 = ((java.util.Calendar)(p0)).get(((int)(5)));
    if (!((life4_5 != 0))) {
        forwardValue5224_51_0 = spill5224_3;
        break forward_join_51;
    }
    forwardValue5224_49_0 = spill5224_3;
    forwardValue5224_49_1 = 3;
    }
    if (!((forwardValue5224_49_0 <= forwardValue5224_49_1))) {
        break forward_join_52;
    }
    }
    forwardValue5224_51_0 = 1;
    }
    forwardValue5224_53_0 = forwardValue5224_51_0;
    break forward_join_53;
    }
    forwardValue5224_53_0 = 0;
    }
    return ((forwardValue5224_53_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(double p0, boolean p1, net.minecraft.block.Block p2, moom.DT p3) {
return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue5225_17_0;
    int forwardValue5225_32_0;
    boolean spill5225_0;
    boolean spill5225_1;
    long life3_3;
    int life5_5;
    forward_join_32: {
    forward_join_28: {
    forward_join_17: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 118994992053051L);
    life5_5 = moom.vR.b();
    spill5225_0 = ((net.minecraft.entity.passive.EntityBat)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue5225_17_0 = ((spill5225_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5225_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue5225_17_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).G) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue5225_32_0 = forwardValue5225_17_0;
        break forward_join_32;
    }
    if (!((forwardValue5225_17_0 == 0))) {
        break forward_join_28;
    }
    spill5225_1 = ((net.minecraft.entity.passive.EntityBat)(this)).Y();
    if (!((life5_5 != 0))) {
        forwardValue5225_32_0 = ((spill5225_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!(spill5225_1)) {
        break forward_join_28;
    }
    ((net.minecraft.entity.passive.EntityBat)(this)).l(((boolean)(false)));
    }
    forwardValue5225_32_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue5225_32_0) != 0);
}


public void g__Void() {
net.minecraft.entity.passive.EntityBat forestValue667_37_0;
    int spill667_0;
    net.minecraft.entity.passive.EntityBat spill667_1;
    net.minecraft.entity.passive.EntityBat spill667_2;
    net.minecraft.entity.passive.EntityBat spill667_3;
    double spill667_4;
    double spill667_5;
    long life1_3;
    int life3_7;
    forest_join_42: {
    forest_join_37: {
    forest_join_36: {
    life1_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 69280254055629L);
    spill667_0 = moom.vR.c();
    super.g__Void();
    life3_7 = spill667_0;
    spill667_1 = this;
    if (!((life3_7 == 0))) {
        forestValue667_37_0 = spill667_1;
        break forest_join_37;
    }
    if (!(((net.minecraft.entity.passive.EntityBat)(spill667_1)).Y())) {
        break forest_join_36;
    }
    spill667_2 = this;
    spill667_3 = this;
    net.minecraft.entity.passive.EntityBat __stackOp667_4_0 = this;
    double __stackOp667_4_1 = 0x0.0p0d;
    spill667_4 = __stackOp667_4_1;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp667_4_0)).v = ((double)(__stackOp667_4_1));
    net.minecraft.entity.passive.EntityBat __stackOp667_6_0 = spill667_3;
    double __stackOp667_6_1 = spill667_4;
    spill667_5 = __stackOp667_6_1;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp667_6_0)).u = ((double)(__stackOp667_6_1));
    ((net.minecraft.entity.passive.EntityBat)(spill667_2)).t = ((double)(spill667_5));
    ((net.minecraft.entity.passive.EntityBat)(this)).o = ((double)(((((double) moom.Dr.b__Int(((double)(((net.minecraft.entity.passive.EntityBat)(this)).o)))) + 0x1.0p0d) - ((double) ((net.minecraft.entity.passive.EntityBat)(this)).H))));
    if (!((life3_7 != 0))) {
        break forest_join_42;
    }
    }
    forestValue667_37_0 = this;
    }
    net.minecraft.entity.passive.EntityBat __stackOp667_13_0 = forestValue667_37_0;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp667_13_0)).u = ((double)((((net.minecraft.entity.passive.EntityBat)(__stackOp667_13_0)).u * 0x1.333334p-1d)));
    }
    return;
}


protected float g__sourceReturn_bc607678b6() {
return (super.g__sourceReturn_bc607678b6() * 0x1.e66666p-1f);
}


protected boolean g__Boolean() {
return ((0) != 0);
}


public boolean y__sourceReturn_aae029aa0a() {
return ((1) != 0);
}


public boolean N__Boolean() {
int forwardValue5221_31_0;
    int forwardValue5221_53_0;
    int forwardValue5221_59_0;
    int forwardValue5221_68_0;
    int forwardValue5221_72_0;
    int forwardValue5221_74_0;
    int spill5221_0;
    int spill5221_1;
    boolean spill5221_2;
    long life1_3;
    moom.DT life4_15;
    int life3_16;
    int life5_36;
    int life6_38;
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_68: {
    forward_join_59: {
    forward_join_58: {
    forward_join_53: {
    forward_join_50: {
    forward_join_31: {
    forward_join_27: {
    life1_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 75376558842951L);
    spill5221_0 = moom.vR.b();
    life4_15 = new moom.DT(((net.minecraft.entity.passive.EntityBat)(this)).n, ((moom.CA)(((net.minecraft.entity.passive.EntityBat)(this)).b())).c, ((net.minecraft.entity.passive.EntityBat)(this)).p);
    life3_16 = spill5221_0;
    spill5221_1 = ((moom.DT)(life4_15)).b();
    if (!((life3_16 != 0))) {
        forwardValue5221_31_0 = spill5221_1;
        break forward_join_31;
    }
    if (!((spill5221_1 >= ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).c()))) {
        break forward_join_27;
    }
    return ((0) != 0);
    }
    forwardValue5221_31_0 = ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).b(((moom.DT)(life4_15)));
    }
    life5_36 = forwardValue5221_31_0;
    life6_38 = 4;
    spill5221_2 = ((net.minecraft.entity.passive.EntityBat)(this)).a(((java.util.Calendar)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).a__Calendar())));
    if (!((life3_16 != 0))) {
        forwardValue5221_53_0 = ((spill5221_2) ? 1 : 0);
        break forward_join_53;
    }
    if (!(spill5221_2)) {
        break forward_join_50;
    }
    life6_38 = __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5221_16(18192, (2827978566865283122L ^ life1_3));
    if (!((life3_16 == 0))) {
        break forward_join_58;
    }
    }
    forwardValue5221_53_0 = ((((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextBoolean()) ? 1 : 0);
    }
    if (!((life3_16 != 0))) {
        forwardValue5221_59_0 = forwardValue5221_53_0;
        break forward_join_59;
    }
    if (!((forwardValue5221_53_0 != 0))) {
        break forward_join_58;
    }
    return ((0) != 0);
    }
    forwardValue5221_59_0 = life5_36;
    }
    if (!((life3_16 != 0))) {
        forwardValue5221_68_0 = forwardValue5221_59_0;
        break forward_join_68;
    }
    if (!((forwardValue5221_59_0 <= ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(life6_38)))))) {
        break forward_join_73;
    }
    forwardValue5221_68_0 = ((super.N__Boolean()) ? 1 : 0);
    }
    if (!((life3_16 != 0))) {
        forwardValue5221_72_0 = forwardValue5221_68_0;
        break forward_join_72;
    }
    if (!((forwardValue5221_68_0 != 0))) {
        break forward_join_73;
    }
    forwardValue5221_72_0 = 1;
    }
    forwardValue5221_74_0 = forwardValue5221_72_0;
    break forward_join_74;
    }
    forwardValue5221_74_0 = 0;
    }
    return ((forwardValue5221_74_0) != 0);
}


public boolean Y() {
int forwardValue5223_20_0;
    int forwardValue5223_22_0;
    int spill5223_0;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life1_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 102225977392639L);
    life3_5 = moom.vR.c();
    spill5223_0 = (((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.passive.EntityBat)(this)).al)).a(((int)(__sourceIntrinsic_b8853d294699_invokedynamic5223_3(7974, (6920230341378976177L ^ life1_3))))) & 1);
    if (!((life3_5 == 0))) {
        forwardValue5223_20_0 = spill5223_0;
        break forward_join_20;
    }
    if (!((spill5223_0 != 0))) {
        break forward_join_21;
    }
    forwardValue5223_20_0 = 1;
    }
    forwardValue5223_22_0 = forwardValue5223_20_0;
    break forward_join_22;
    }
    forwardValue5223_22_0 = 0;
    }
    return ((forwardValue5223_22_0) != 0);
}


protected void R() {
int forwardValue5222_56_0;
    net.minecraft.entity.passive.EntityBat forwardValue5222_69_0;
    net.minecraft.world.World forwardValue5222_81_0;
    net.minecraft.entity.passive.EntityBat forwardValue5222_93_0;
    net.minecraft.entity.passive.EntityBat forwardValue5222_113_0;
    moom.DT forwardValue5222_119_0;
    net.minecraft.entity.passive.EntityBat forwardValue5222_152_0;
    int forwardValue5222_215_0;
    int forwardValue5222_331_0;
    net.minecraft.entity.passive.EntityBat forwardValue5222_333_0;
    int spill5222_0;
    net.minecraft.entity.passive.EntityBat spill5222_1;
    boolean spill5222_2;
    net.minecraft.entity.passive.EntityBat spill5222_3;
    net.minecraft.world.World spill5222_4;
    moom.DT spill5222_5;
    net.minecraft.entity.passive.EntityBat spill5222_6;
    moom.DT spill5222_7;
    net.minecraft.entity.passive.EntityBat spill5222_8;
    net.minecraft.entity.passive.EntityBat spill5222_9;
    int spill5222_10;
    int spill5222_11;
    net.minecraft.entity.passive.EntityBat spill5222_12;
    long life1_3;
    int life3_7;
    moom.DT life4_12;
    moom.DT life5_15;
    double life6_284;
    double life8_294;
    double life10_304;
    float life12_359;
    float life13_365;
    forward_join_335: {
    forward_join_333: {
    forward_join_331: {
    forward_join_215: {
    forward_join_212: {
    forward_join_152: {
    forward_join_151: {
    forward_join_119: {
    forward_join_115: {
    forward_join_113: {
    forward_join_112: {
    forward_join_93: {
    forward_join_92: {
    forward_join_81: {
    forward_join_69: {
    forward_join_68: {
    forward_join_56: {
    forward_join_46: {
    life1_3 = (net.minecraft.entity.passive.EntityBat.cb ^ 100853147034651L);
    spill5222_0 = moom.vR.b();
    super.R();
    life3_7 = spill5222_0;
    life4_12 = new moom.DT(this);
    life5_15 = ((moom.DT)(life4_12)).a__DT();
    spill5222_1 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_93_0 = spill5222_1;
        break forward_join_93;
    }
    if (!(((net.minecraft.entity.passive.EntityBat)(spill5222_1)).Y())) {
        break forward_join_92;
    }
    spill5222_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).a__fE(((moom.DT)(life5_15))))).a__ch())).e__Boolean();
    if (!((life3_7 != 0))) {
        forwardValue5222_56_0 = ((spill5222_2) ? 1 : 0);
        break forward_join_56;
    }
    if (!((!spill5222_2))) {
        break forward_join_46;
    }
    ((net.minecraft.entity.passive.EntityBat)(this)).l(((boolean)(false)));
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(this)).i)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_12(10793, (8183834275511715156L ^ life1_3)))), ((moom.DT)(life4_12)), ((int)(0)));
    if (!((life3_7 == 0))) {
        break forward_join_335;
    }
    }
    spill5222_3 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_69_0 = spill5222_3;
        break forward_join_69;
    }
    forwardValue5222_56_0 = ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(spill5222_3)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_15(27331, (6877339918530545083L ^ life1_3)))));
    }
    if (!((forwardValue5222_56_0 == 0))) {
        break forward_join_68;
    }
    ((net.minecraft.entity.passive.EntityBat)(this)).a4 = ((float)(((float) ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_18(16381, (6047960197186900103L ^ life1_3))))))));
    }
    forwardValue5222_69_0 = this;
    }
    spill5222_4 = ((net.minecraft.entity.passive.EntityBat)(forwardValue5222_69_0)).i;
    if (!((life3_7 != 0))) {
        forwardValue5222_81_0 = spill5222_4;
        break forward_join_81;
    }
    if (!((((net.minecraft.world.World)(spill5222_4)).a(((net.minecraft.entity.Entity)(this)), ((double)(0x1.0p2d))) != null))) {
        break forward_join_335;
    }
    ((net.minecraft.entity.passive.EntityBat)(this)).l(((boolean)(false)));
    forwardValue5222_81_0 = ((net.minecraft.entity.passive.EntityBat)(this)).i;
    }
    ((net.minecraft.world.World)(forwardValue5222_81_0)).a(((net.minecraft.entity.player.EntityPlayer)(null)), ((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_25(32595, (2876888208254439459L ^ life1_3)))), ((moom.DT)(life4_12)), ((int)(0)));
    if (!((life3_7 == 0))) {
        break forward_join_335;
    }
    }
    forwardValue5222_93_0 = this;
    }
    spill5222_5 = ((net.minecraft.entity.passive.EntityBat)(forwardValue5222_93_0)).bX;
    if (!((life3_7 != 0))) {
        forwardValue5222_119_0 = spill5222_5;
        break forward_join_119;
    }
    if (!((spill5222_5 != null))) {
        break forward_join_115;
    }
    spill5222_6 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_113_0 = spill5222_6;
        break forward_join_113;
    }
    if (!(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(spill5222_6)).i)).a__Boolean(((moom.DT)(this.bX))))) {
        break forward_join_112;
    }
    spill5222_7 = this.bX;
    if (!((life3_7 != 0))) {
        forwardValue5222_119_0 = spill5222_7;
        break forward_join_119;
    }
    if (!((((moom.DT)(spill5222_7)).b() < 1))) {
        break forward_join_115;
    }
    }
    forwardValue5222_113_0 = this;
    }
    ((net.minecraft.entity.passive.EntityBat)(forwardValue5222_113_0)).bX = ((moom.DT)(null));
    }
    spill5222_8 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_152_0 = spill5222_8;
        break forward_join_152;
    }
    forwardValue5222_119_0 = ((net.minecraft.entity.passive.EntityBat)(spill5222_8)).bX;
    }
    if (!((forwardValue5222_119_0 != null))) {
        break forward_join_151;
    }
    spill5222_9 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_152_0 = spill5222_9;
        break forward_join_152;
    }
    if (!((((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(spill5222_9)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_36(15381, (5787137358806864743L ^ life1_3))))) != 0))) {
        break forward_join_151;
    }
    spill5222_10 = recovery.source.CarrierOps.dcmpg(((double)(((moom.DT)(this.bX)).a(((double)(((double) ((int) ((net.minecraft.entity.passive.EntityBat)(this)).n)))), ((double)(((double) ((int) ((net.minecraft.entity.passive.EntityBat)(this)).o)))), ((double)(((double) ((int) ((net.minecraft.entity.passive.EntityBat)(this)).p))))))), ((double)(0x1.0p2d)));
    if (!((life3_7 != 0))) {
        forwardValue5222_215_0 = spill5222_10;
        break forward_join_215;
    }
    if (!((spill5222_10 < 0))) {
        break forward_join_212;
    }
    }
    forwardValue5222_152_0 = this;
    }
    ((net.minecraft.entity.passive.EntityBat)(forwardValue5222_152_0)).bX = ((moom.DT)(new moom.DT(((((int) ((net.minecraft.entity.passive.EntityBat)(this)).n) + ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_46(30112, (2119126765337516767L ^ life1_3)))))) - ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_49(18192, (2827944669993707630L ^ life1_3)))))), ((((int) ((net.minecraft.entity.passive.EntityBat)(this)).o) + ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_53(16191, (996360310431731787L ^ life1_3)))))) - 2), ((((int) ((net.minecraft.entity.passive.EntityBat)(this)).p) + ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_57(18192, (2827944669993707630L ^ life1_3)))))) - ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_60(18192, (2827944669993707630L ^ life1_3)))))))));
    }
    forwardValue5222_215_0 = ((moom.DT)(this.bX)).a();
    }
    life6_284 = ((((double) forwardValue5222_215_0) + 0x1.0p-1d) - ((net.minecraft.entity.passive.EntityBat)(this)).n);
    life8_294 = ((((double) ((moom.DT)(this.bX)).b()) + 0x1.999999999999ap-4d) - ((net.minecraft.entity.passive.EntityBat)(this)).o);
    life10_304 = ((((double) ((moom.DT)(this.bX)).c()) + 0x1.0p-1d) - ((net.minecraft.entity.passive.EntityBat)(this)).p);
    net.minecraft.entity.passive.EntityBat __stackOp5222_72_0 = this;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp5222_72_0)).t = ((double)((((net.minecraft.entity.passive.EntityBat)(__stackOp5222_72_0)).t + (((java.lang.Math.signum(((double)(life6_284))) * 0x1.0p-1d) - ((net.minecraft.entity.passive.EntityBat)(this)).t) * 0x1.99999ap-4d))));
    net.minecraft.entity.passive.EntityBat __stackOp5222_77_0 = this;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp5222_77_0)).u = ((double)((((net.minecraft.entity.passive.EntityBat)(__stackOp5222_77_0)).u + (((java.lang.Math.signum(((double)(life8_294))) * 0x1.666666p-1d) - ((net.minecraft.entity.passive.EntityBat)(this)).u) * 0x1.99999ap-4d))));
    net.minecraft.entity.passive.EntityBat __stackOp5222_82_0 = this;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp5222_82_0)).v = ((double)((((net.minecraft.entity.passive.EntityBat)(__stackOp5222_82_0)).v + (((java.lang.Math.signum(((double)(life10_304))) * 0x1.0p-1d) - ((net.minecraft.entity.passive.EntityBat)(this)).v) * 0x1.99999ap-4d))));
    life12_359 = (((float) ((moom.Dr.b(((double)(((net.minecraft.entity.passive.EntityBat)(this)).v)), ((double)(((net.minecraft.entity.passive.EntityBat)(this)).t))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)) - 0x1.68p6f);
    life13_365 = moom.Dr.e(((float)((life12_359 - ((net.minecraft.entity.passive.EntityBat)(this)).w))));
    ((net.minecraft.entity.passive.EntityBat)(this)).bk = ((float)(0x1.0p-1f));
    net.minecraft.entity.passive.EntityBat __stackOp5222_93_0 = this;
    ((net.minecraft.entity.passive.EntityBat)(__stackOp5222_93_0)).w = ((float)((((net.minecraft.entity.passive.EntityBat)(__stackOp5222_93_0)).w + life13_365)));
    spill5222_11 = ((java.util.Random)(((net.minecraft.entity.passive.EntityBat)(this)).ah)).nextInt(((int)(__sourceIntrinsic_ebf98100c39e_invokedynamic5222_97(25996, (8885966015922572016L ^ life1_3)))));
    if (!((life3_7 != 0))) {
        forwardValue5222_331_0 = spill5222_11;
        break forward_join_331;
    }
    if (!((spill5222_11 == 0))) {
        break forward_join_335;
    }
    spill5222_12 = this;
    if (!((life3_7 != 0))) {
        forwardValue5222_333_0 = spill5222_12;
        break forward_join_333;
    }
    forwardValue5222_331_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityBat)(spill5222_12)).i)).a__fE(((moom.DT)(life5_15))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5222_331_0 != 0))) {
        break forward_join_335;
    }
    forwardValue5222_333_0 = this;
    }
    ((net.minecraft.entity.passive.EntityBat)(forwardValue5222_333_0)).l(((boolean)(true)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_a97bfb6c3ddd_invokedynamic5221_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ebf98100c39e_invokedynamic5222_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b8853d294699_invokedynamic5223_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8079f3c87391_invokedynamic5224_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8079f3c87391_invokedynamic5224_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8079f3c87391_invokedynamic5224_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_originalDynamicSite1959_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral11546_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_458405b53cd1_originalDynamicSite1960_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1961_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5874_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5874_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5874_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93fe014f0768_invokedynamic5874_11(int a0, long a1) throws E;
}
