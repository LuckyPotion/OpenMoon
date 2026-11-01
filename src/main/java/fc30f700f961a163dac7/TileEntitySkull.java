package net.minecraft.tileentity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TileEntitySkull extends net.minecraft.tileentity.TileEntity {

private int l;

private int m;

private com.mojang.authlib.GameProfile n;

private static final long o;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public TileEntitySkull() {
super();
    this.n = null;
}


static {
o = ((long)(((moom._a)(moom._c.a(((long)(-3808507159255704820L)), ((long)(1515567936761269744L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(215670590396567L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.tileentity.TileEntitySkull.o ^ 24637934997091L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1929_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1929_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1929_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1929_14 = new byte[8];
    (__sourceSpill1929_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1929_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1929_16 = __sourceSpill1929_14;
    ((javax.crypto.Cipher)(__sourceSpill1929_11)).init(((int)(__sourceSpill1929_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1929_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1929_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "§wõøXäD¬ó^\b-¡Þ-ãL\004§@"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1929_25 = local6_life21;
        int __sourceSpill1929_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1929_25)).substring(((int)(__sourceSpill1929_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1929_30 = local8_life19;
        int __sourceSpill1929_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1929_33 = new byte[8];
        (__sourceSpill1929_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1929_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1929_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1929_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1929_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1929_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1929_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1929_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1929_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1929_34)).doFinal(((byte[])(__sourceSpill1929_33)));
        (__sourceSpill1929_30)[__sourceSpill1929_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "w\016BíHóXÆ£ëZÔ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1929_38 = local6_life21;
        int __sourceSpill1929_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1929_38)).substring(((int)(__sourceSpill1929_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1929_43 = local8_life19;
        int __sourceSpill1929_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1929_46 = new byte[8];
        (__sourceSpill1929_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1929_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1929_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1929_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1929_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1929_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1929_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1929_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1929_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1929_47)).doFinal(((byte[])(__sourceSpill1929_46)));
        (__sourceSpill1929_43)[__sourceSpill1929_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


private void b__Void() {
this.n = ((com.mojang.authlib.GameProfile)(__sourceExactCall_06c1873aaef3a9(((com.mojang.authlib.GameProfile)(this.n)))));
    ((net.minecraft.tileentity.TileEntitySkull)(this)).a__Void();
    return;
}


public int b() {
return this.m;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
net.minecraft.nbt.NBTTagCompound forwardValue5715_41_0;
    java.lang.String[] spill5715_0;
    net.minecraft.nbt.NBTTagCompound spill5715_1;
    long life2_3;
    java.lang.String[] life4_8;
    net.minecraft.nbt.NBTTagCompound life5_47;
    forward_join_51: {
    forward_join_41: {
    life2_3 = (net.minecraft.tileentity.TileEntitySkull.o ^ 12492359363784L);
    spill5715_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life4_8 = spill5715_0;
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("SkullType")), ((byte)(((byte) (this.l & __sourceIntrinsic_ac4a479fad6b_invokedynamic5715_4(24129, (5199071684860738279L ^ life2_3)))))));
    spill5715_1 = p0;
    if (!((life4_8 != null))) {
        forwardValue5715_41_0 = spill5715_1;
        break forward_join_41;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill5715_1)).a(((java.lang.String)("Rot")), ((byte)(((byte) (this.m & __sourceIntrinsic_ac4a479fad6b_invokedynamic5715_7(18236, (7300946765036872600L ^ life2_3)))))));
    if (!((this.n != null))) {
        break forward_join_51;
    }
    forwardValue5715_41_0 = new net.minecraft.nbt.NBTTagCompound();
    }
    life5_47 = forwardValue5715_41_0;
    moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(life5_47)), ((com.mojang.authlib.GameProfile)(this.n)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Owner")), ((net.minecraft.nbt.NBTBase)(life5_47)));
    }
    return;
}


public void c(int p0) {
this.m = ((int)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1487;
      if (q[var3] == null) {
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
         long var5 = p[var3];
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
         Object[] var9 = (Object[])r.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               r.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Cu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         q[var3] = var15;
      }

      return q[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12326_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.tileentity.TileEntitySkull.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0) {
this.l = ((int)(p0));
    this.n = ((com.mojang.authlib.GameProfile)(null));
    return;
}


public moom.yK a__yK() {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.tileentity.TileEntitySkull)(this)).b(((net.minecraft.nbt.NBTTagCompound)(local1)));
    return new moom.Am(((net.minecraft.tileentity.TileEntitySkull)(this)).e, 4, local1);
}


public com.mojang.authlib.GameProfile a__GameProfile() {
return this.n;
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue5714_33_0;
    int forwardValue5714_54_0;
    net.minecraft.nbt.NBTTagCompound forwardValue5714_57_0;
    java.lang.String forwardValue5714_57_1;
    java.lang.String[] spill5714_0;
    int spill5714_1;
    net.minecraft.nbt.NBTTagCompound spill5714_2;
    java.lang.String spill5714_3;
    long life2_3;
    java.lang.String[] life4_18;
    java.lang.String life5_79;
    forward_join_73: {
    forward_join_71: {
    forward_join_57: {
    forward_join_54: {
    forward_join_44: {
    forward_join_33: {
    life2_3 = (net.minecraft.tileentity.TileEntitySkull.o ^ 116961210641865L);
    spill5714_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    this.l = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("SkullType")))));
    this.m = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Rot")))));
    life4_18 = spill5714_0;
    spill5714_1 = this.l;
    if (!((life4_18 != null))) {
        forwardValue5714_33_0 = spill5714_1;
        break forward_join_33;
    }
    if (!((spill5714_1 == 3))) {
        break forward_join_73;
    }
    forwardValue5714_33_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Owner")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic5714_8(4174, (3387611912336176621L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_18 != null))) {
        forwardValue5714_54_0 = forwardValue5714_33_0;
        break forward_join_54;
    }
    if (!((forwardValue5714_33_0 != 0))) {
        break forward_join_44;
    }
    this.n = ((com.mojang.authlib.GameProfile)(moom.yD.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__yw(((java.lang.String)("Owner"))))))));
    if (!((life4_18 == null))) {
        break forward_join_73;
    }
    }
    spill5714_2 = p0;
    spill5714_3 = "ExtraType";
    if (!((life4_18 != null))) {
        forwardValue5714_57_0 = spill5714_2;
        forwardValue5714_57_1 = spill5714_3;
        break forward_join_57;
    }
    forwardValue5714_54_0 = ((((net.minecraft.nbt.NBTTagCompound)(spill5714_2)).a__Boolean(((java.lang.String)(spill5714_3)), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic5714_14(13112, (915134492734051998L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue5714_54_0 != 0))) {
        break forward_join_73;
    }
    forwardValue5714_57_0 = p0;
    forwardValue5714_57_1 = "ExtraType";
    }
    life5_79 = ((net.minecraft.nbt.NBTTagCompound)(forwardValue5714_57_0)).a__String(((java.lang.String)(forwardValue5714_57_1)));
    if (!((life4_18 != null))) {
        break forward_join_71;
    }
    if (!((!moom.DK.a__Boolean(((java.lang.String)(life5_79)))))) {
        break forward_join_73;
    }
    this.n = ((com.mojang.authlib.GameProfile)(new com.mojang.authlib.GameProfile(null, life5_79)));
    }
    ((net.minecraft.tileentity.TileEntitySkull)(this)).b__Void();
    }
    return;
}


public void a__Void(com.mojang.authlib.GameProfile p0) {
long local2 = (net.minecraft.tileentity.TileEntitySkull.o ^ 31568657442176L);
    this.l = ((int)(__sourceIntrinsic_cae0d3c54c33_originalDynamicSite2049_1(7480, (647569323856507093L ^ local2))));
    this.n = ((com.mojang.authlib.GameProfile)(p0));
    ((net.minecraft.tileentity.TileEntitySkull)(this)).b__Void();
    return;
}


public static com.mojang.authlib.GameProfile a(com.mojang.authlib.GameProfile p0) {
int forwardValue5713_27_0;
    com.mojang.authlib.GameProfile forwardValue5713_29_0;
    moom.Bl forwardValue5713_37_0;
    java.lang.Object forwardValue5713_54_0;
    com.mojang.authlib.GameProfile forwardValue5713_67_0;
    com.mojang.authlib.GameProfile spill5713_0;
    com.mojang.authlib.GameProfile spill5713_1;
    boolean spill5713_2;
    com.mojang.authlib.GameProfile spill5713_3;
    moom.Bl spill5713_4;
    com.mojang.authlib.GameProfile spill5713_5;
    long life1_3;
    java.lang.String[] life3_5;
    com.mojang.authlib.GameProfile life4_67;
    com.mojang.authlib.properties.Property life5_86;
    forward_join_67: {
    forward_join_66: {
    forward_join_64: {
    forward_join_54: {
    forward_join_48: {
    forward_join_37: {
    forward_join_36: {
    forward_join_30: {
    forward_join_29: {
    forward_join_27: {
    life1_3 = (net.minecraft.tileentity.TileEntitySkull.o ^ 77198100581476L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill5713_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue5713_67_0 = spill5713_0;
        break forward_join_67;
    }
    if (!((spill5713_0 != null))) {
        break forward_join_66;
    }
    spill5713_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue5713_67_0 = spill5713_1;
        break forward_join_67;
    }
    if (!((!moom.DK.a__Boolean(((java.lang.String)(((com.mojang.authlib.GameProfile)(spill5713_1)).getName())))))) {
        break forward_join_66;
    }
    spill5713_2 = ((com.mojang.authlib.GameProfile)(p0)).isComplete();
    if (!((life3_5 != null))) {
        forwardValue5713_27_0 = ((spill5713_2) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill5713_2)) {
        break forward_join_30;
    }
    spill5713_3 = p0;
    if (!((life3_5 != null))) {
        forwardValue5713_29_0 = spill5713_3;
        break forward_join_29;
    }
    forwardValue5713_27_0 = ((((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(spill5713_3)).getProperties())).containsKey(((java.lang.Object)("textures")))) ? 1 : 0);
    }
    if (!((forwardValue5713_27_0 != 0))) {
        break forward_join_30;
    }
    forwardValue5713_29_0 = p0;
    }
    return forwardValue5713_29_0;
    }
    spill5713_4 = moom.Bl.a__Bl();
    if (!((life3_5 != null))) {
        forwardValue5713_37_0 = spill5713_4;
        break forward_join_37;
    }
    if (!((spill5713_4 == null))) {
        break forward_join_36;
    }
    return p0;
    }
    forwardValue5713_37_0 = moom.Bl.a__Bl();
    }
    life4_67 = ((moom.Bt)(((moom.Bl)(forwardValue5713_37_0)).a__Bt())).a(((java.lang.String)(((com.mojang.authlib.GameProfile)(p0)).getName())));
    spill5713_5 = life4_67;
    if (!((life3_5 != null))) {
        forwardValue5713_54_0 = spill5713_5;
        break forward_join_54;
    }
    if (!((spill5713_5 == null))) {
        break forward_join_48;
    }
    return p0;
    }
    forwardValue5713_54_0 = com.google.common.collect.Iterables.getFirst(((java.lang.Iterable)(((com.mojang.authlib.properties.PropertyMap)(((com.mojang.authlib.GameProfile)(life4_67)).getProperties())).get((("textures"))))), ((java.lang.Object)(null)));
    }
    life5_86 = ((com.mojang.authlib.properties.Property)(forwardValue5713_54_0));
    if (!((life5_86 == null))) {
        break forward_join_64;
    }
    life4_67 = ((com.mojang.authlib.minecraft.MinecraftSessionService)(((moom.Bl)(moom.Bl.a__Bl())).a__MinecraftSessionService())).fillProfileProperties(((com.mojang.authlib.GameProfile)(life4_67)), ((boolean)(true)));
    }
    return life4_67;
    }
    forwardValue5713_67_0 = p0;
    }
    return forwardValue5713_67_0;
}


public int a__sourceReturn_8abf5c6871() {
return this.l;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12326_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cae0d3c54c33_originalDynamicSite2049_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic5714_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic5714_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic5715_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ac4a479fad6b_invokedynamic5715_7(int a0, long a1) throws E;

private static native com.mojang.authlib.GameProfile __sourceExactCall_06c1873aaef3a9(com.mojang.authlib.GameProfile p0);
}
