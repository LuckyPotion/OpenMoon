package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class wv extends moom.wq {

private moom.Cg f;

private static long g;

private static long[] h;

private static java.lang.Integer[] k;

private static java.util.Map l;

public wv() { super((java.lang.String)null, false, 0); }

private static void __sourceConstructorBody_dd4046670d965e0a(moom.wv receiver) throws Throwable {
long local1 = (moom.wv.g ^ 74322451897729L);
    moom.wv.__sourceConstructorInit_dd4046670d965e0a_0(((moom.wv)(receiver)), ((java.lang.String)("container.enderchest")), ((int)(0)), ((int)(__sourceIntrinsic_dd4046670d965e0a_originalDynamicSite3512_1(29148, (4299858747535855396L ^ local1)))));
    return;
}

private static native <E extends Throwable> void __sourceConstructorInit_dd4046670d965e0a_0(moom.wv a0, java.lang.String a1, int a2, int a3) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(-4841770850033837472L)), ((long)(3600637285474183344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229263132810798L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.wv.g ^ 2458968966995L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1092_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1092_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1092_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1092_14 = new byte[8];
    (__sourceSpill1092_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1092_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1092_16 = __sourceSpill1092_14;
    ((javax.crypto.Cipher)(__sourceSpill1092_11)).init(((int)(__sourceSpill1092_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1092_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1092_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\"-\177ñûµ\\n\0325/P==é"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1092_25 = local6_life21;
        int __sourceSpill1092_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1092_25)).substring(((int)(__sourceSpill1092_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1092_30 = local8_life19;
        int __sourceSpill1092_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1092_33 = new byte[8];
        (__sourceSpill1092_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1092_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1092_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1092_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1092_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1092_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1092_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1092_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1092_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1092_34)).doFinal(((byte[])(__sourceSpill1092_33)));
        (__sourceSpill1092_30)[__sourceSpill1092_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
moom.wv forwardValue4436_15_0;
    moom.wv spill4436_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.wv.g ^ 14780609725038L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4436_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4436_15_0 = spill4436_0;
        break forward_join_15;
    }
    if (!((((moom.wv)(spill4436_0)).f != null))) {
        break forward_join_14;
    }
    ((moom.Cg)(this.f)).b();
    }
    forwardValue4436_15_0 = this;
    }
    __sourceIntrinsic_ece4dce6330d_call4436_5(forwardValue4436_15_0, p0);
    return;
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
moom.wv forwardValue4437_18_0;
    moom.wv spill4437_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_18: {
    forward_join_14: {
    life2_3 = (moom.wv.g ^ 29722316867635L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4437_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4437_18_0 = spill4437_0;
        break forward_join_18;
    }
    if (!((((moom.wv)(spill4437_0)).f != null))) {
        break forward_join_14;
    }
    ((moom.Cg)(this.f)).g__sourceReturn_da8c82d5d4();
    }
    __sourceExactCall_485bb6b0e2a58f(this, ((net.minecraft.entity.player.EntityPlayer)(p0)));
    forwardValue4437_18_0 = this;
    }
    ((moom.wv)(forwardValue4437_18_0)).f = ((moom.Cg)(null));
    return;
}


public void a(moom.Cg p0) {
this.f = ((moom.Cg)(p0));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29492;
      if (k[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/wv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.wv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9624_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/wv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.nbt.NBTTagList p0) {
net.minecraft.entity.Entity[] spill1383_0;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    net.minecraft.nbt.NBTTagCompound life6_33;
    int life7_43;
    lexical_join_57: {
    lexical_join_23: {
    lexical_join_21: {
    life2_3 = (moom.wv.g ^ 135275317027204L);
    spill1383_0 = moom.v8.b__Arrayr3();
    life5_6 = 0;
    life4_7 = spill1383_0;
    lexical_cycle_8: while (true) {
    if (!((life5_6 < ((moom.wv)(this)).b__Int()))) {
        break lexical_join_21;
    }
    ((moom.wv)(this)).a__Void(((int)(life5_6)), ((net.minecraft.item.ItemStack)(null)));
    life5_6 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_23;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    life5_6 = 0;
    }
    lexical_cycle_23: while (true) {
    lexical_join_55: {
    lexical_join_54: {
    if (!((life5_6 < ((net.minecraft.nbt.NBTTagList)(p0)).a__Int()))) {
        break lexical_join_57;
    }
    life6_33 = ((net.minecraft.nbt.NBTTagList)(p0)).a__yw(((int)(life5_6)));
    life7_43 = (((net.minecraft.nbt.NBTTagCompound)(life6_33)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot"))) & __sourceIntrinsic_752284641be1_invokedynamic1383_7(7223, (73328370674540235L ^ life2_3)));
    if (!((life4_7 == null))) {
        break lexical_join_55;
    }
    if (!((life7_43 >= 0))) {
        break lexical_join_54;
    }
    if (!((life7_43 < ((moom.wv)(this)).b__Int()))) {
        break lexical_join_54;
    }
    ((moom.wv)(this)).a__Void(((int)(life7_43)), ((net.minecraft.item.ItemStack)(net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life6_33))))));
    }
    life5_6 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return;
}


public net.minecraft.nbt.NBTTagList a() {
net.minecraft.entity.Entity[] spill1382_0;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_7;
    int life5_10;
    net.minecraft.entity.Entity[] life3_11;
    net.minecraft.item.ItemStack life6_19;
    net.minecraft.nbt.NBTTagCompound life7_30;
    lexical_join_43: {
    life1_3 = (moom.wv.g ^ 69789184115687L);
    life4_7 = new net.minecraft.nbt.NBTTagList();
    spill1382_0 = moom.v8.b__Arrayr3();
    life5_10 = 0;
    life3_11 = spill1382_0;
    lexical_cycle_12: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!((life5_10 < ((moom.wv)(this)).b__Int()))) {
        break lexical_join_43;
    }
    life6_19 = ((moom.wv)(this)).a__xW(((int)(life5_10)));
    if (!((life3_11 == null))) {
        break lexical_join_41;
    }
    if (!((life6_19 != null))) {
        break lexical_join_40;
    }
    life7_30 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_30)).a(((java.lang.String)("Slot")), ((byte)(((byte) life5_10))));
    ((net.minecraft.item.ItemStack)(life6_19)).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_30)));
    ((net.minecraft.nbt.NBTTagList)(life4_7)).a(((net.minecraft.nbt.NBTBase)(life7_30)));
    }
    life5_10 += 1;
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_7;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
moom.wv forwardValue4434_19_0;
    int forwardValue4434_21_0;
    int forwardValue4434_25_0;
    int forwardValue4434_27_0;
    moom.wv spill4434_0;
    boolean spill4434_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (moom.wv.g ^ 110548682862439L);
    life4_5 = moom.v8.b__Arrayr3();
    spill4434_0 = this;
    if (!((life4_5 == null))) {
        forwardValue4434_19_0 = spill4434_0;
        break forward_join_19;
    }
    if (!((((moom.wv)(spill4434_0)).f != null))) {
        break forward_join_18;
    }
    spill4434_1 = ((moom.Cg)(this.f)).a(((net.minecraft.entity.player.EntityPlayer)(p0)));
    if (!((life4_5 == null))) {
        forwardValue4434_21_0 = ((spill4434_1) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4434_1)) {
        break forward_join_26;
    }
    }
    forwardValue4434_19_0 = this;
    }
    forwardValue4434_21_0 = ((__sourceIntrinsic_ad9112c8f842_call4434_6(forwardValue4434_19_0, p0)) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue4434_25_0 = forwardValue4434_21_0;
        break forward_join_25;
    }
    if (!((forwardValue4434_21_0 != 0))) {
        break forward_join_26;
    }
    forwardValue4434_25_0 = 1;
    }
    forwardValue4434_27_0 = forwardValue4434_25_0;
    break forward_join_27;
    }
    forwardValue4434_27_0 = 0;
    }
    return ((forwardValue4434_27_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_dd4046670d965e0a_originalDynamicSite3512_1(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_ece4dce6330d_call4436_5(moom.wv a0, net.minecraft.entity.player.EntityPlayer a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9624_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_752284641be1_invokedynamic1383_7(int a0, long a1) throws E;

private static native <E extends Throwable> boolean __sourceIntrinsic_ad9112c8f842_call4434_6(moom.wv a0, net.minecraft.entity.player.EntityPlayer a1) throws E;

private static native void __sourceExactCall_485bb6b0e2a58f(moom.wq p0, net.minecraft.entity.player.EntityPlayer p1);
}
