package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tw extends net.minecraft.entity.Entity {

public int aE;

public int aF;

private static long bb;

private static long[] cb;

private static java.lang.Integer[] db;

private static java.util.Map eb;

public tw(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_c7492646736e3500(moom.tw receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.tw.bb ^ 90395780058441L);

    moom.tw.__sourceConstructorInit_c7492646736e3500_0(((moom.tw)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.tw)(receiver)).e = ((boolean)(true));

    ((moom.tw)(receiver)).a__Void(((float)(0x1.0p1f)), ((float)(0x1.0p1f)));

    ((moom.tw)(receiver)).aF = ((int)(__sourceIntrinsic_c7492646736e3500_originalDynamicSite3370_4(4570, (4619792176437564843L ^ local2))));

    ((moom.tw)(receiver)).aE = ((int)(((java.util.Random)(((moom.tw)(receiver)).ah)).nextInt(((int)(__sourceIntrinsic_c7492646736e3500_originalDynamicSite3370_7(22482, (1502077421762663328L ^ local2)))))));

    return;

}



public tw(net.minecraft.world.World p0, double p1, double p2, double p3) {
this(((net.minecraft.world.World)(p0)));
    ((moom.tw)(this)).a__Void(((double)(p1)), ((double)(p2)), ((double)(p3)));
    return;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(5916454353116815612L)), ((long)(-9027112679172706956L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47287379436190L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tw.bb ^ 23745452255423L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1572_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1572_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1572_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1572_14 = new byte[8];
    (__sourceSpill1572_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1572_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1572_16 = __sourceSpill1572_14;
    ((javax.crypto.Cipher)(__sourceSpill1572_11)).init(((int)(__sourceSpill1572_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1572_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1572_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ê<×\023¨ò4#!J[Ò¯k"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1572_25 = local6_life21;
        int __sourceSpill1572_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1572_25)).substring(((int)(__sourceSpill1572_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1572_30 = local8_life19;
        int __sourceSpill1572_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1572_33 = new byte[8];
        (__sourceSpill1572_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1572_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1572_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1572_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1572_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1572_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1572_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1572_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1572_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1572_34)).doFinal(((byte[])(__sourceSpill1572_33)));
        (__sourceSpill1572_30)[__sourceSpill1572_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\000\024¨}YO?\037ë> ÙV\""))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1572_38 = local6_life21;
        int __sourceSpill1572_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1572_38)).substring(((int)(__sourceSpill1572_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1572_43 = local8_life19;
        int __sourceSpill1572_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1572_46 = new byte[8];
        (__sourceSpill1572_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1572_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1572_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1572_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1572_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1572_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1572_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1572_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1572_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1572_47)).doFinal(((byte[])(__sourceSpill1572_46)));
        (__sourceSpill1572_43)[__sourceSpill1572_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_c7492646736e3500_0(moom.tw a0, net.minecraft.world.World a1) throws E;

private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9234_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13023;
      if (db[var3] == null) {
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
         long var5 = cb[var3];
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
         Object[] var9 = (Object[])eb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               eb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tw.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d__Void() {
long local1 = (moom.tw.bb ^ 60756277115178L);
    ((net.minecraft.entity.DataWatcher)(this.al)).a(((int)(__sourceIntrinsic_a91ecd6db48f_originalDynamicSite1666_2(2285, (1162164490303748350L ^ local1)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.aF))))));
    return;
}


protected void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4108_16_0;
    int forwardValue4108_55_0;
    boolean spill4108_0;
    boolean spill4108_1;
    int spill4108_2;
    boolean spill4108_3;
    long life3_3;
    int life5_5;
    forward_join_55: {
    forward_join_54: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (moom.tw.bb ^ 40142676411899L);
    life5_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill4108_0 = ((moom.tw)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 == 0))) {
        forwardValue4108_16_0 = ((spill4108_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4108_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4108_16_0 = ((this.F) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue4108_55_0 = forwardValue4108_16_0;
        break forward_join_55;
    }
    if (!((forwardValue4108_16_0 == 0))) {
        break forward_join_54;
    }
    spill4108_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 == 0))) {
        forwardValue4108_55_0 = ((spill4108_1) ? 1 : 0);
        break forward_join_55;
    }
    if (!((!spill4108_1))) {
        break forward_join_54;
    }
    this.aF = ((int)(0));
    spill4108_2 = this.aF;
    if (!((life5_5 == 0))) {
        forwardValue4108_55_0 = spill4108_2;
        break forward_join_55;
    }
    if (!((spill4108_2 <= 0))) {
        break forward_join_54;
    }
    ((moom.tw)(this)).f__Void();
    spill4108_3 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life5_5 == 0))) {
        forwardValue4108_55_0 = ((spill4108_3) ? 1 : 0);
        break forward_join_55;
    }
    if (!((!spill4108_3))) {
        break forward_join_54;
    }
    ((net.minecraft.world.World)(this.i)).a(((net.minecraft.entity.Entity)(null)), ((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((float)(0x1.8p2f)), ((boolean)(true)));
    }
    forwardValue4108_55_0 = 1;
    }
    return ((forwardValue4108_55_0) != 0);
}


public boolean m__Boolean() {
return ((1) != 0);
}


public void g__Void() {
net.minecraft.world.World forwardValue4109_56_0;
    net.minecraft.world.World forwardValue4109_76_0;
    moom.DT forwardValue4109_76_1;
    int spill4109_0;
    net.minecraft.world.World spill4109_1;
    moom.DT spill4109_2;
    long life1_3;
    int life3_34;
    int life4_38;
    int life5_42;
    int life6_46;
    forward_join_80: {
    forward_join_76: {
    forward_join_56: {
    life1_3 = (moom.tw.bb ^ 131637780294157L);
    this.k = ((double)(this.n));
    this.l = ((double)(this.o));
    this.m = ((double)(this.p));
    moom.tw __stackOp4109_7_0 = this;
    ((moom.tw)(__stackOp4109_7_0)).aE = ((int)((((moom.tw)(__stackOp4109_7_0)).aE + 1)));
    spill4109_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    ((net.minecraft.entity.DataWatcher)(this.al)).b(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic4109_12(15996, (7786569850619895115L ^ life1_3)))), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.aF))))));
    life3_34 = spill4109_0;
    life4_38 = moom.Dr.b__Int(((double)(this.n)));
    life5_42 = moom.Dr.b__Int(((double)(this.o)));
    life6_46 = moom.Dr.b__Int(((double)(this.p)));
    spill4109_1 = this.i;
    if (!((life3_34 != 0))) {
        forwardValue4109_56_0 = spill4109_1;
        break forward_join_56;
    }
    if (!((((((net.minecraft.world.World)(spill4109_1)).v instanceof moom.EB) ? 1 : 0) != 0))) {
        break forward_join_80;
    }
    forwardValue4109_56_0 = this.i;
    }
    spill4109_2 = new moom.DT(life4_38, life5_42, life6_46);
    if (!((life3_34 != 0))) {
        forwardValue4109_76_0 = forwardValue4109_56_0;
        forwardValue4109_76_1 = spill4109_2;
        break forward_join_76;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(forwardValue4109_56_0)).a__fE(((moom.DT)(spill4109_2))))).a__ch() != net.minecraft.init.Blocks.ab))) {
        break forward_join_80;
    }
    forwardValue4109_76_0 = this.i;
    forwardValue4109_76_1 = new moom.DT(life4_38, life5_42, life6_46);
    }
    ((net.minecraft.world.World)(forwardValue4109_76_0)).a(((moom.DT)(forwardValue4109_76_1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockFire)(net.minecraft.init.Blocks.ab)).a__fE())));
    }
    return;
}


protected boolean g__Boolean() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_c7492646736e3500_originalDynamicSite3370_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7492646736e3500_originalDynamicSite3370_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9234_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a91ecd6db48f_originalDynamicSite1666_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4109_12(int a0, long a1) throws E;
}
