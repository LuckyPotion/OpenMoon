package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tJ extends net.minecraft.entity.item.EntityMinecart {

private int aQ;

private static final long bb;

private static final long[] db;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public tJ(net.minecraft.world.World p0) {
super(p0);
    this.aQ = -1;
}


public tJ(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
    this.aQ = -1;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-8593603209754296972L)), ((long)(5198254836671407928L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(46288957016171L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tJ.bb ^ 52981667700337L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1555_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1555_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1555_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1555_14 = new byte[8];
    (__sourceSpill1555_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1555_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1555_16 = __sourceSpill1555_14;
    ((javax.crypto.Cipher)(__sourceSpill1555_11)).init(((int)(__sourceSpill1555_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1555_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1555_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\035\030!Ã\rrâÀÍy×\\%Ã1"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1555_25 = local6_life21;
        int __sourceSpill1555_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1555_25)).substring(((int)(__sourceSpill1555_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1555_30 = local8_life19;
        int __sourceSpill1555_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1555_33 = new byte[8];
        (__sourceSpill1555_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1555_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1555_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1555_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1555_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1555_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1555_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1555_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1555_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1555_34)).doFinal(((byte[])(__sourceSpill1555_33)));
        (__sourceSpill1555_30)[__sourceSpill1555_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ï[Ûd\f\bäÅQ®ayl"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1555_38 = local6_life21;
        int __sourceSpill1555_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1555_38)).substring(((int)(__sourceSpill1555_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1555_43 = local8_life19;
        int __sourceSpill1555_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1555_46 = new byte[8];
        (__sourceSpill1555_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1555_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1555_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1555_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1555_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1555_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1555_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1555_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1555_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1555_47)).doFinal(((byte[])(__sourceSpill1555_46)));
        (__sourceSpill1555_43)[__sourceSpill1555_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b__Boolean() {
int forwardValue4051_13_0;
    int forwardValue4051_15_0;
    int spill4051_0;
    long life1_3;
    int life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.tJ.bb ^ 62405491147063L);
    life3_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4051_0 = this.aQ;
    if (!((life3_5 == 0))) {
        forwardValue4051_13_0 = spill4051_0;
        break forward_join_13;
    }
    if (!((spill4051_0 > -1))) {
        break forward_join_14;
    }
    forwardValue4051_13_0 = 1;
    }
    forwardValue4051_15_0 = forwardValue4051_13_0;
    break forward_join_15;
    }
    forwardValue4051_15_0 = 0;
    }
    return ((forwardValue4051_15_0) != 0);
}


public net.minecraft.block.state.IBlockState b__fE() {
return ((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)).a__fE();
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral9141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tJ.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
moom.tJ forwardValue4052_22_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4052_22_1;
    moom.tJ spill4052_0;
    net.minecraft.nbt.NBTTagCompound spill4052_1;
    long life2_3;
    int life4_5;
    forward_join_25: {
    forward_join_22: {
    life2_3 = (moom.tJ.bb ^ 7759123697147L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4052_0 = this;
    spill4052_1 = p0;
    if (!((life4_5 != 0))) {
        forwardValue4052_22_0 = spill4052_0;
        forwardValue4052_22_1 = spill4052_1;
        break forward_join_22;
    }
    __sourceIntrinsic_01f4e1cd062e_call4052_2(spill4052_0, spill4052_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("TNTFuse")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic4052_3(13870, (5313901791842396901L ^ life2_3))))))) {
        break forward_join_25;
    }
    forwardValue4052_22_0 = this;
    forwardValue4052_22_1 = p0;
    }
    ((moom.tJ)(forwardValue4052_22_0)).aQ = ((int)(((net.minecraft.nbt.NBTTagCompound)(forwardValue4052_22_1)).a__Int(((java.lang.String)("TNTFuse")))));
    }
    return;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8791;
      if (ib[var3] == null) {
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
         Object[] var9 = (Object[])jb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               jb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         ib[var3] = var15;
      }

      return ib[var3];
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
super.d(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("TNTFuse")), ((int)(this.aQ)));
    return;
}


public void d(float p0, float p1) {
long life3_3;
    int life5_5;
    float life6_18;
    life3_3 = (moom.tJ.bb ^ 104217423864067L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    if ((life5_5 != 0)) {
        if ((p0 >= 0x1.8p1f)) {
        life6_18 = (p0 / 0x1.4p3f);
        ((moom.tJ)(this)).a__sourceReturn_2c20cf5948(((double)(((double) (life6_18 * life6_18)))));
    }
        super.d(((float)(p0)), ((float)(p1)));
    }
    return;
}


protected void a__sourceReturn_2c20cf5948(double p0) {
long life3_3;
    int life5_5;
    double life6_12;
    life3_3 = (moom.tJ.bb ^ 108017186571250L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    if ((!((net.minecraft.world.World)(this.i)).G)) {
        life6_12 = java.lang.Math.sqrt(((double)(p0)));
        if ((life5_5 != 0)) {
        if ((life6_12 > 0x1.4p2d)) {
        life6_12 = 0x1.4p2d;
    }
        ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(((float) (0x1.0p2d + ((((java.util.Random)(this.ah)).nextDouble() * 0x1.8p0d) * life6_12))))), ((boolean)(true)));
    }
        ((moom.tJ)(this)).f__Void();
    }
    return;
}


public void a__sourceReturn_7889e8f768(net.minecraft.util.DamageSource p0) {
int forwardValue4048_45_0;
    int forwardValue4048_50_0;
    int forwardValue4048_56_0;
    int spill4048_0;
    boolean spill4048_1;
    boolean spill4048_2;
    long life2_3;
    int life4_8;
    double life5_20;
    forward_join_60: {
    forward_join_57: {
    forward_join_56: {
    forward_join_50: {
    forward_join_45: {
    forward_join_43: {
    life2_3 = (moom.tJ.bb ^ 15141285181504L);
    spill4048_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.a__sourceReturn_7889e8f768(((net.minecraft.util.DamageSource)(p0)));
    life4_8 = spill4048_0;
    life5_20 = ((this.t * this.t) + (this.v * this.v));
    spill4048_1 = ((net.minecraft.util.DamageSource)(p0)).b__Boolean();
    if (!((life4_8 != 0))) {
        forwardValue4048_45_0 = ((spill4048_1) ? 1 : 0);
        break forward_join_45;
    }
    if (!((!spill4048_1))) {
        break forward_join_43;
    }
    spill4048_2 = ((net.minecraft.world.GameRules)(((net.minecraft.world.World)(this.i)).a__Ej())).a__Boolean(((java.lang.String)("doEntityDrops")));
    if (!((life4_8 != 0))) {
        forwardValue4048_45_0 = ((spill4048_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill4048_2)) {
        break forward_join_43;
    }
    ((moom.tJ)(this)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.W, 1))), ((float)(0x0.0p0f)));
    }
    forwardValue4048_45_0 = ((((net.minecraft.util.DamageSource)(p0)).f__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4048_50_0 = forwardValue4048_45_0;
        break forward_join_50;
    }
    if (!((forwardValue4048_45_0 == 0))) {
        break forward_join_57;
    }
    forwardValue4048_50_0 = ((((net.minecraft.util.DamageSource)(p0)).b__Boolean()) ? 1 : 0);
    }
    if (!((life4_8 != 0))) {
        forwardValue4048_56_0 = forwardValue4048_50_0;
        break forward_join_56;
    }
    if (!((forwardValue4048_50_0 == 0))) {
        break forward_join_57;
    }
    forwardValue4048_56_0 = recovery.source.CarrierOps.dcmpl(((double)(life5_20)), ((double)(0x1.47ae14p-7d)));
    }
    if (!((forwardValue4048_56_0 >= 0))) {
        break forward_join_60;
    }
    }
    ((moom.tJ)(this)).a__sourceReturn_2c20cf5948(((double)(life5_20)));
    }
    return;
}


public void a__Void() {
int forwardValue4050_32_0;
    moom.tJ forwardValue4050_34_0;
    int spill4050_0;
    boolean spill4050_1;
    moom.tJ spill4050_2;
    long life1_3;
    int life3_12;
    forward_join_40: {
    forward_join_34: {
    forward_join_32: {
    life1_3 = (moom.tJ.bb ^ 51003808877458L);
    spill4050_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    this.aQ = ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic4050_2(187, (1413759681278974491L ^ life1_3))));
    life3_12 = spill4050_0;
    spill4050_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_12 != 0))) {
        forwardValue4050_32_0 = ((spill4050_1) ? 1 : 0);
        break forward_join_32;
    }
    if (!((!spill4050_1))) {
        break forward_join_40;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(this)), ((byte)(__sourceIntrinsic_b82a5b29b709_invokedynamic4050_8(13372, (8966324557945548445L ^ life1_3)))));
    spill4050_2 = this;
    if (!((life3_12 != 0))) {
        forwardValue4050_34_0 = spill4050_2;
        break forward_join_34;
    }
    forwardValue4050_32_0 = ((((moom.tJ)(spill4050_2)).f__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4050_32_0 == 0))) {
        break forward_join_40;
    }
    forwardValue4050_34_0 = this;
    }
    ((net.minecraft.world.World)(((moom.tJ)(forwardValue4050_34_0)).i)).a(((net.minecraft.entity.Entity)(this)), ((java.lang.String)("game.tnt.primed")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4049_45_0;
    int spill4049_0;
    int spill4049_1;
    boolean spill4049_2;
    long life3_3;
    net.minecraft.entity.Entity life6_7;
    int life5_8;
    net.minecraft.entity.projectile.EntityArrow life7_19;
    forward_join_45: {
    forward_join_41: {
    life3_3 = (moom.tJ.bb ^ 106407560826233L);
    spill4049_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life6_7 = ((net.minecraft.util.DamageSource)(p0)).a__r3();
    life5_8 = spill4049_0;
    spill4049_1 = ((life6_7 instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    if (!((life5_8 == 0))) {
        forwardValue4049_45_0 = spill4049_1;
        break forward_join_45;
    }
    if (!((spill4049_1 != 0))) {
        break forward_join_41;
    }
    life7_19 = ((net.minecraft.entity.projectile.EntityArrow)(life6_7));
    spill4049_2 = ((net.minecraft.entity.projectile.EntityArrow)(life7_19)).r__Boolean();
    if (!((life5_8 == 0))) {
        forwardValue4049_45_0 = ((spill4049_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill4049_2)) {
        break forward_join_41;
    }
    ((moom.tJ)(this)).a__sourceReturn_2c20cf5948(((double)((((((net.minecraft.entity.projectile.EntityArrow)(life7_19)).t * ((net.minecraft.entity.projectile.EntityArrow)(life7_19)).t) + (((net.minecraft.entity.projectile.EntityArrow)(life7_19)).u * ((net.minecraft.entity.projectile.EntityArrow)(life7_19)).u)) + (((net.minecraft.entity.projectile.EntityArrow)(life7_19)).v * ((net.minecraft.entity.projectile.EntityArrow)(life7_19)).v)))));
    }
    forwardValue4049_45_0 = ((super.a__Boolean(((net.minecraft.util.DamageSource)(p0)), ((float)(p1)))) ? 1 : 0);
    }
    return ((forwardValue4049_45_0) != 0);
}


public net.minecraft.entity.item.EntityMinecart$EnumMinecartType a__aT() {
return net.minecraft.entity.item.EntityMinecart$EnumMinecartType.TNT;
}


public void a(int p0, int p1, int p2, boolean p3) {
int forwardValue4045_14_0;
    moom.tJ forwardValue4045_16_0;
    boolean spill4045_0;
    moom.tJ spill4045_1;
    long life5_3;
    int life7_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life5_3 = (moom.tJ.bb ^ 8510287838613L);
    life7_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4045_0 = p3;
    if (!((life7_5 == 0))) {
        forwardValue4045_14_0 = ((spill4045_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill4045_0)) {
        break forward_join_17;
    }
    spill4045_1 = this;
    if (!((life7_5 == 0))) {
        forwardValue4045_16_0 = spill4045_1;
        break forward_join_16;
    }
    forwardValue4045_14_0 = ((moom.tJ)(spill4045_1)).aQ;
    }
    if (!((forwardValue4045_14_0 < 0))) {
        break forward_join_17;
    }
    forwardValue4045_16_0 = this;
    }
    ((moom.tJ)(forwardValue4045_16_0)).a__Void();
    }
    return;
}


public void a(byte p0) {
long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (moom.tJ.bb ^ 23489407572394L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    if (!((life4_5 == 0))) { break forward_join_17; }
    if (!((p0 == __sourceIntrinsic_6121ff5511c4_invokedynamic4664_2(23922, (2593452189087798761L ^ life2_3))))) { break forward_join_19; }
    ((moom.tJ)(this)).a__Void();
    }
    if (!((life4_5 != 0))) { break forward_join_22; }
    }
    super.a(((byte)(p0)));
    }
    return;
}


public int a__sourceReturn_8abf5c6871() {
return this.aQ;
}


public float a(moom.Ei p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int forwardValue4046_20_0;
    moom.tJ forwardValue4046_22_0;
    float forwardValue4046_29_0;
    moom.tJ spill4046_0;
    boolean spill4046_1;
    long life5_3;
    int life7_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life5_3 = (moom.tJ.bb ^ 137269977167045L);
    life7_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4046_0 = this;
    if (!((life7_5 == 0))) {
        forwardValue4046_22_0 = spill4046_0;
        break forward_join_22;
    }
    if (!(((moom.tJ)(spill4046_0)).b__Boolean())) {
        break forward_join_21;
    }
    spill4046_1 = __sourceIntrinsic_integerToBoolean(moom.d2.a(((net.minecraft.block.state.IBlockState)(p3))));
    if (!((life7_5 == 0))) {
        forwardValue4046_20_0 = ((spill4046_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4046_1))) {
        break forward_join_28;
    }
    forwardValue4046_20_0 = ((moom.d2.c(((net.minecraft.world.World)(p1)), ((moom.DT)(((moom.DT)(p2)).a__DT())))) ? 1 : 0);
    }
    if (!((forwardValue4046_20_0 == 0))) {
        break forward_join_28;
    }
    }
    forwardValue4046_22_0 = this;
    }
    forwardValue4046_29_0 = __sourceIntrinsic_7a30d023d909_call4046_8(forwardValue4046_22_0, p0, p1, p2, p3);
    break forward_join_29;
    }
    forwardValue4046_29_0 = 0x0.0p0f;
    }
    return forwardValue4046_29_0;
}


public boolean a(moom.Ei p0, net.minecraft.world.World p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, float p4) {
int forwardValue4047_20_0;
    int forwardValue4047_30_0;
    int forwardValue4047_34_0;
    int forwardValue4047_36_0;
    boolean spill4047_0;
    boolean spill4047_1;
    long life6_3;
    int life8_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_30: {
    forward_join_23: {
    forward_join_20: {
    life6_3 = (moom.tJ.bb ^ 8434773232089L);
    life8_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    spill4047_0 = ((moom.tJ)(this)).b__Boolean();
    if (!((life8_5 != 0))) {
        forwardValue4047_30_0 = ((spill4047_0) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill4047_0)) {
        break forward_join_23;
    }
    spill4047_1 = __sourceIntrinsic_integerToBoolean(moom.d2.a(((net.minecraft.block.state.IBlockState)(p3))));
    if (!((life8_5 != 0))) {
        forwardValue4047_20_0 = ((spill4047_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill4047_1))) {
        break forward_join_35;
    }
    forwardValue4047_20_0 = ((moom.d2.c(((net.minecraft.world.World)(p1)), ((moom.DT)(((moom.DT)(p2)).a__DT())))) ? 1 : 0);
    }
    if (!((life8_5 != 0))) {
        forwardValue4047_30_0 = forwardValue4047_20_0;
        break forward_join_30;
    }
    if (!((forwardValue4047_20_0 == 0))) {
        break forward_join_35;
    }
    }
    forwardValue4047_30_0 = ((super.a(((moom.Ei)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((float)(p4)))) ? 1 : 0);
    }
    if (!((life8_5 != 0))) {
        forwardValue4047_34_0 = forwardValue4047_30_0;
        break forward_join_34;
    }
    if (!((forwardValue4047_30_0 != 0))) {
        break forward_join_35;
    }
    forwardValue4047_34_0 = 1;
    }
    forwardValue4047_36_0 = forwardValue4047_34_0;
    break forward_join_36;
    }
    forwardValue4047_36_0 = 0;
    }
    return ((forwardValue4047_36_0) != 0);
}


public void g__Void() {
int forwardValue4053_40_0;
    int forwardValue4053_60_0;
    moom.tJ forwardValue4053_62_0;
    int spill4053_0;
    int spill4053_1;
    moom.tJ spill4053_2;
    long life1_3;
    int life3_7;
    double life4_90;
    forward_join_80: {
    forward_join_62: {
    forward_join_60: {
    forward_join_56: {
    forward_join_40: {
    forward_join_38: {
    life1_3 = (moom.tJ.bb ^ 57165176414863L);
    spill4053_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.g__Void();
    life3_7 = spill4053_0;
    spill4053_1 = this.aQ;
    if (!((life3_7 != 0))) {
        forwardValue4053_40_0 = spill4053_1;
        break forward_join_40;
    }
    if (!((spill4053_1 > 0))) {
        break forward_join_38;
    }
    moom.tJ __stackOp4053_4_0 = this;
    ((moom.tJ)(__stackOp4053_4_0)).aQ = ((int)((((moom.tJ)(__stackOp4053_4_0)).aQ - 1)));
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.SMOKE_NORMAL)), ((double)(this.n)), ((double)((this.o + 0x1.0p-1d))), ((double)(this.p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    if (!((life3_7 == 0))) {
        break forward_join_56;
    }
    }
    forwardValue4053_40_0 = this.aQ;
    }
    if (!((life3_7 != 0))) {
        forwardValue4053_60_0 = forwardValue4053_40_0;
        break forward_join_60;
    }
    if (!((forwardValue4053_40_0 == 0))) {
        break forward_join_56;
    }
    ((moom.tJ)(this)).a__sourceReturn_2c20cf5948(((double)(((this.t * this.t) + (this.v * this.v)))));
    }
    spill4053_2 = this;
    if (!((life3_7 != 0))) {
        forwardValue4053_62_0 = spill4053_2;
        break forward_join_62;
    }
    forwardValue4053_60_0 = ((((moom.tJ)(spill4053_2)).B) ? 1 : 0);
    }
    if (!((forwardValue4053_60_0 != 0))) {
        break forward_join_80;
    }
    forwardValue4053_62_0 = this;
    }
    life4_90 = ((((moom.tJ)(forwardValue4053_62_0)).t * this.t) + (this.v * this.v));
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life4_90)), ((double)(0x1.47ae14p-7d))) >= 0))) {
        break forward_join_80;
    }
    ((moom.tJ)(this)).a__sourceReturn_2c20cf5948(((double)(life4_90)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral9141_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_01f4e1cd062e_call4052_2(moom.tJ a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic4052_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic4050_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic4050_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6121ff5511c4_invokedynamic4664_2(int a0, long a1) throws E;

private static native <E extends Throwable> float __sourceIntrinsic_7a30d023d909_call4046_8(moom.tJ a0, moom.Ei a1, net.minecraft.world.World a2, moom.DT a3, net.minecraft.block.state.IBlockState a4) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
