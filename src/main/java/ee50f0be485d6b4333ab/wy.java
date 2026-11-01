package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wy {

private static final java.util.Random a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public wy() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(3491117200645578744L)), ((long)(-6902689652593585904L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178112654720887L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wy.b ^ 5266393055328L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1095_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1095_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1095_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1095_14 = new byte[8];
    (__sourceSpill1095_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1095_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1095_16 = __sourceSpill1095_14;
    ((javax.crypto.Cipher)(__sourceSpill1095_11)).init(((int)(__sourceSpill1095_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1095_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1095_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "À\t:ÉJä[i\tsõG¦\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1095_25 = local6_life21;
        int __sourceSpill1095_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1095_25)).substring(((int)(__sourceSpill1095_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1095_30 = local8_life19;
        int __sourceSpill1095_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1095_33 = new byte[8];
        (__sourceSpill1095_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1095_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1095_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1095_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1095_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1095_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1095_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1095_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1095_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1095_34)).doFinal(((byte[])(__sourceSpill1095_33)));
        (__sourceSpill1095_30)[__sourceSpill1095_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((java.util.Random)(new java.util.Random()));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25430;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wy", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wy.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9635_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wy"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a(net.minecraft.world.World p0, net.minecraft.entity.Entity p1, net.minecraft.inventory.IInventory p2) {
moom.wy.a(((net.minecraft.world.World)(p0)), ((double)(((net.minecraft.entity.Entity)(p1)).n)), ((double)(((net.minecraft.entity.Entity)(p1)).o)), ((double)(((net.minecraft.entity.Entity)(p1)).p)), ((net.minecraft.inventory.IInventory)(p2)));
    return;
}


private static void a(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.inventory.IInventory p4) {
net.minecraft.entity.Entity[] spill1384_0;
    long life8_3;
    int life11_6;
    net.minecraft.entity.Entity[] life10_7;
    net.minecraft.item.ItemStack life12_15;
    lexical_join_29: {
    life8_3 = (moom.wy.b ^ 6461577957831L);
    spill1384_0 = moom.v8.b__Arrayr3();
    life11_6 = 0;
    life10_7 = spill1384_0;
    lexical_cycle_8: while (true) {
    lexical_join_27: {
    lexical_join_26: {
    if (!((life11_6 < ((net.minecraft.inventory.IInventory)(p4)).b__Int()))) {
        break lexical_join_29;
    }
    life12_15 = ((net.minecraft.inventory.IInventory)(p4)).a__xW(((int)(life11_6)));
    if (!((life10_7 == null))) {
        break lexical_join_27;
    }
    if (!((life12_15 != null))) {
        break lexical_join_26;
    }
    moom.wy.a(((net.minecraft.world.World)(p0)), ((double)(p1)), ((double)(p2)), ((double)(p3)), ((net.minecraft.item.ItemStack)(life12_15)));
    }
    life11_6 += 1;
    }
    if (!((life10_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static void a(net.minecraft.world.World p0, double p1, double p2, double p3, net.minecraft.item.ItemStack p4) {
net.minecraft.item.ItemStack lexicalValue1385_91_0;
    net.minecraft.entity.Entity[] spill1385_0;
    net.minecraft.item.ItemStack spill1385_1;
    long life8_3;
    float life11_10;
    float life12_18;
    net.minecraft.entity.Entity[] life10_19;
    float life13_26;
    int life14_43;
    net.minecraft.entity.item.EntityItem life15_86;
    float life16_106;
    lexical_join_127: {
    life8_3 = (moom.wy.b ^ 14731400240754L);
    life11_10 = ((((java.util.Random)(moom.wy.a)).nextFloat() * 0x1.99999ap-1f) + 0x1.99999ap-4f);
    spill1385_0 = moom.v8.b__Arrayr3();
    life12_18 = ((((java.util.Random)(moom.wy.a)).nextFloat() * 0x1.99999ap-1f) + 0x1.99999ap-4f);
    life10_19 = spill1385_0;
    life13_26 = ((((java.util.Random)(moom.wy.a)).nextFloat() * 0x1.99999ap-1f) + 0x1.99999ap-4f);
    lexical_cycle_27: while (true) {
    lexical_join_96: {
    lexical_join_91: {
    lexical_join_59: {
    lexical_join_53: {
    if (!((((net.minecraft.item.ItemStack)(p4)).b > 0))) {
        break lexical_join_127;
    }
    life14_43 = (((java.util.Random)(moom.wy.a)).nextInt(((int)(__sourceIntrinsic_bc3317239282_invokedynamic1385_10(10796, (8272235844931713849L ^ life8_3))))) + __sourceIntrinsic_bc3317239282_invokedynamic1385_12(17488, (4292033092745041220L ^ life8_3)));
    if (!((life10_19 == null))) {
        break lexical_join_59;
    }
    if (!((life14_43 > ((net.minecraft.item.ItemStack)(p4)).b))) {
        break lexical_join_53;
    }
    life14_43 = ((net.minecraft.item.ItemStack)(p4)).b;
    }
    net.minecraft.item.ItemStack __stackOp1385_15_0 = p4;
    ((net.minecraft.item.ItemStack)(__stackOp1385_15_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1385_15_0)).b - life14_43)));
    }
    life15_86 = new net.minecraft.entity.item.EntityItem(p0, (p1 + ((double) life11_10)), (p2 + ((double) life12_18)), (p3 + ((double) life13_26)), new net.minecraft.item.ItemStack(((net.minecraft.item.ItemStack)(p4)).a__wQ(), life14_43, ((net.minecraft.item.ItemStack)(p4)).c()));
    spill1385_1 = p4;
    if (!((life10_19 == null))) {
        lexicalValue1385_91_0 = spill1385_1;
        break lexical_join_91;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1385_1)).e__Boolean())) {
        break lexical_join_96;
    }
    lexicalValue1385_91_0 = ((net.minecraft.entity.item.EntityItem)(life15_86)).a__xW();
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1385_91_0)).b(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p4)).a__yw())).a__yn())))));
    }
    life16_106 = 0x1.99999ap-5f;
    ((net.minecraft.entity.item.EntityItem)(life15_86)).t = ((double)((((java.util.Random)(moom.wy.a)).nextGaussian() * ((double) life16_106))));
    ((net.minecraft.entity.item.EntityItem)(life15_86)).u = ((double)(((((java.util.Random)(moom.wy.a)).nextGaussian() * ((double) life16_106)) + 0x1.99999ap-3d)));
    ((net.minecraft.entity.item.EntityItem)(life15_86)).v = ((double)((((java.util.Random)(moom.wy.a)).nextGaussian() * ((double) life16_106))));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(life15_86)));
    if (!((life10_19 != null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    return;
}


public static void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.inventory.IInventory p2) {
moom.wy.a(((net.minecraft.world.World)(p0)), ((double)(((double) ((moom.DT)(p1)).a()))), ((double)(((double) ((moom.DT)(p1)).b()))), ((double)(((double) ((moom.DT)(p1)).c()))), ((net.minecraft.inventory.IInventory)(p2)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9635_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bc3317239282_invokedynamic1385_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bc3317239282_invokedynamic1385_12(int a0, long a1) throws E;
}
