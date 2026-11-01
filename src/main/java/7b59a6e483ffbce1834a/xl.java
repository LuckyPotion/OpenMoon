package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xl extends net.minecraft.item.Item {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public xl() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-2448841217521804216L)), ((long)(-2202412712286492615L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(153276214042185L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xl.n ^ 97697944120141L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1113_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1113_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1113_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1113_14 = new byte[8];
    (__sourceSpill1113_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1113_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1113_16 = __sourceSpill1113_14;
    ((javax.crypto.Cipher)(__sourceSpill1113_11)).init(((int)(__sourceSpill1113_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1113_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1113_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\177U\016\002\bpV(º2ðj%b`"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1113_25 = local6_life21;
        int __sourceSpill1113_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1113_25)).substring(((int)(__sourceSpill1113_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1113_30 = local8_life19;
        int __sourceSpill1113_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1113_33 = new byte[8];
        (__sourceSpill1113_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1113_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1113_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1113_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1113_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1113_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1113_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1113_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1113_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1113_34)).doFinal(((byte[])(__sourceSpill1113_33)));
        (__sourceSpill1113_30)[__sourceSpill1113_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9742_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16341;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xl.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
net.minecraft.item.ItemStack lexicalValue1418_12_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1418_21_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1418_47_0;
    java.lang.String lexicalValue1418_47_1;
    int lexicalValue1418_47_2;
    net.minecraft.nbt.NBTTagList lexicalValue1418_54_0;
    int lexicalValue1418_59_0;
    net.minecraft.item.ItemStack spill1418_0;
    net.minecraft.nbt.NBTTagCompound spill1418_1;
    java.lang.String spill1418_2;
    int spill1418_3;
    net.minecraft.nbt.NBTTagList spill1418_4;
    int spill1418_5;
    long life5_3;
    int life7_5;
    net.minecraft.nbt.NBTTagCompound life8_21;
    net.minecraft.nbt.NBTTagList life9_63;
    int life10_80;
    net.minecraft.nbt.NBTTagCompound life11_88;
    java.util.ArrayList life12_90;
    int life13_103;
    lexical_join_105: {
    lexical_join_59: {
    lexical_join_54: {
    lexical_join_47: {
    lexical_join_40: {
    lexical_join_21: {
    lexical_join_12: {
    life5_3 = (moom.xl.n ^ 126966638299831L);
    life7_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1418_0 = p0;
    if (!((life7_5 == 0))) {
        lexicalValue1418_12_0 = spill1418_0;
        break lexical_join_12;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1418_0)).e__Boolean())) {
        break lexical_join_105;
    }
    lexicalValue1418_12_0 = p0;
    }
    life8_21 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(lexicalValue1418_12_0)).a__yw())).a__yw(((java.lang.String)("Fireworks")));
    spill1418_1 = life8_21;
    if (!((life7_5 == 0))) {
        lexicalValue1418_21_0 = spill1418_1;
        break lexical_join_21;
    }
    if (!((spill1418_1 != null))) {
        break lexical_join_105;
    }
    lexicalValue1418_21_0 = life8_21;
    }
    spill1418_2 = "Flight";
    spill1418_3 = __sourceIntrinsic_9085c89dbf75_invokedynamic1418_6(14360, (4425967658198327296L ^ life5_3));
    if (!((life7_5 == 0))) {
        lexicalValue1418_47_0 = lexicalValue1418_21_0;
        lexicalValue1418_47_1 = spill1418_2;
        lexicalValue1418_47_2 = spill1418_3;
        break lexical_join_47;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(lexicalValue1418_21_0)).a__Boolean(((java.lang.String)(spill1418_2)), ((int)(spill1418_3))))) {
        break lexical_join_40;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic1418_10(net.minecraft.util.StatCollector.a(((java.lang.String)("item.fireworks.flight"))), ((net.minecraft.nbt.NBTTagCompound)(life8_21)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Flight")))))));
    }
    lexicalValue1418_47_0 = life8_21;
    lexicalValue1418_47_1 = "Explosions";
    lexicalValue1418_47_2 = __sourceIntrinsic_9085c89dbf75_invokedynamic1418_12(1585, (6202178294061424168L ^ life5_3));
    }
    life9_63 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1418_47_0)).a(((java.lang.String)(lexicalValue1418_47_1)), ((int)(lexicalValue1418_47_2)));
    spill1418_4 = life9_63;
    if (!((life7_5 == 0))) {
        lexicalValue1418_54_0 = spill1418_4;
        break lexical_join_54;
    }
    if (!((spill1418_4 != null))) {
        break lexical_join_105;
    }
    lexicalValue1418_54_0 = life9_63;
    }
    spill1418_5 = ((net.minecraft.nbt.NBTTagList)(lexicalValue1418_54_0)).a__Int();
    if (!((life7_5 == 0))) {
        lexicalValue1418_59_0 = spill1418_5;
        break lexical_join_59;
    }
    if (!((spill1418_5 > 0))) {
        break lexical_join_105;
    }
    lexicalValue1418_59_0 = 0;
    }
    life10_80 = lexicalValue1418_59_0;
    lexical_cycle_60: while (true) {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_98: {
    if (!((life10_80 < ((net.minecraft.nbt.NBTTagList)(life9_63)).a__Int()))) {
        break lexical_join_105;
    }
    life11_88 = ((net.minecraft.nbt.NBTTagList)(life9_63)).a__yw(((int)(life10_80)));
    life12_90 = com.google.common.collect.Lists.newArrayList();
    moom.xm.a(((net.minecraft.nbt.NBTTagCompound)(life11_88)), ((java.util.List)(life12_90)));
    if (!((life7_5 == 0))) {
        break lexical_join_103;
    }
    if (!((((java.util.List)(life12_90)).size() > 0))) {
        break lexical_join_102;
    }
    life13_103 = 1;
    lexical_cycle_80: while (true) {
    if (!((life13_103 < ((java.util.List)(life12_90)).size()))) {
        break lexical_join_98;
    }
    ((java.util.List)(life12_90)).set(((int)(life13_103)), ((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic1418_23(((java.lang.String)(((java.util.List)(life12_90)).get(((int)(life13_103)))))))));
    life13_103 += 1;
    if (!((life7_5 == 0))) {
        break lexical_join_103;
    }
    if (!((life7_5 != 0))) { continue lexical_cycle_80; }
    break lexical_cycle_80;
    }
    }
    ((java.util.List)(p2)).addAll(((java.util.Collection)(life12_90)));
    }
    life10_80 += 1;
    }
    if (!((life7_5 != 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    return;
}


public boolean a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, net.minecraft.world.World p2, moom.DT p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4527_52_0;
    int forwardValue4527_54_0;
    boolean spill4527_0;
    boolean spill4527_1;
    long life9_3;
    int life11_5;
    net.minecraft.entity.item.EntityFireworkRocket life12_37;
    forward_join_54: {
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    life9_3 = (moom.xl.n ^ 99798093258014L);
    life11_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill4527_0 = ((net.minecraft.world.World)(p2)).G;
    if (!((life11_5 != 0))) {
        forwardValue4527_54_0 = ((spill4527_0) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill4527_0))) {
        break forward_join_53;
    }
    life12_37 = new net.minecraft.entity.item.EntityFireworkRocket(p2, ((double) (((float) ((moom.DT)(p3)).a()) + p5)), ((double) (((float) ((moom.DT)(p3)).b()) + p6)), ((double) (((float) ((moom.DT)(p3)).c()) + p7)), p0);
    ((net.minecraft.world.World)(p2)).b__Boolean(((net.minecraft.entity.Entity)(life12_37)));
    spill4527_1 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p1)).b1)).d;
    if (!((life11_5 != 0))) {
        forwardValue4527_52_0 = ((spill4527_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!((!spill4527_1))) {
        break forward_join_51;
    }
    net.minecraft.item.ItemStack __stackOp4527_12_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp4527_12_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp4527_12_0)).b - 1)));
    }
    forwardValue4527_52_0 = 1;
    }
    return ((forwardValue4527_52_0) != 0);
    }
    forwardValue4527_54_0 = 0;
    }
    return ((forwardValue4527_54_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9742_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9085c89dbf75_invokedynamic1418_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic1418_10(java.lang.String a0, byte a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9085c89dbf75_invokedynamic1418_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic1418_23(java.lang.String a0) throws E;
}
