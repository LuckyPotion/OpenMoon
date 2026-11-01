package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uj extends moom.uc {

private final net.minecraft.entity.passive.EntityWolf c;

private net.minecraft.entity.player.EntityPlayer d;

private final net.minecraft.world.World e;

private final float f;

private int g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public uj(net.minecraft.entity.passive.EntityWolf p0, float p1) {
super();
    this.c = p0;
    this.e = p0.i;
    this.f = p1;
    (this).a(2);
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(4002110680446503845L)), ((long)(-8351756056581838155L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(187274951777513L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uj.h ^ 133517148594573L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1057_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1057_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1057_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1057_14 = new byte[8];
    (__sourceSpill1057_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1057_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1057_16 = __sourceSpill1057_14;
    ((javax.crypto.Cipher)(__sourceSpill1057_11)).init(((int)(__sourceSpill1057_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1057_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1057_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "SÓOìÕÕ÷óD\b\\çÈ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1057_25 = local6_life21;
        int __sourceSpill1057_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1057_25)).substring(((int)(__sourceSpill1057_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1057_30 = local8_life19;
        int __sourceSpill1057_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1057_33 = new byte[8];
        (__sourceSpill1057_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1057_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1057_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1057_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1057_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1057_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1057_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1057_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1057_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1057_34)).doFinal(((byte[])(__sourceSpill1057_33)));
        (__sourceSpill1057_30)[__sourceSpill1057_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    i = ((long[])(local8_life19));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public void b__Void() {
((net.minecraft.entity.passive.EntityWolf)(this.c)).r(((boolean)(false)));
    this.d = ((net.minecraft.entity.player.EntityPlayer)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4207_24_0;
    int forwardValue4207_29_0;
    int forwardValue4207_36_0;
    int forwardValue4207_40_0;
    int forwardValue4207_42_0;
    boolean spill4207_0;
    long life1_3;
    int life3_5;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_29: {
    forward_join_24: {
    life1_3 = (moom.uj.h ^ 13086496696546L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4207_0 = ((net.minecraft.entity.player.EntityPlayer)(this.d)).p__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4207_24_0 = ((spill4207_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill4207_0)) {
        break forward_join_41;
    }
    forwardValue4207_24_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.passive.EntityWolf)(this.c)).a(((net.minecraft.entity.Entity)(this.d))))), ((double)(((double) (this.f * this.f)))));
    }
    if (!((life3_5 == 0))) {
        forwardValue4207_29_0 = forwardValue4207_24_0;
        break forward_join_29;
    }
    if (!((forwardValue4207_24_0 <= 0))) {
        break forward_join_41;
    }
    forwardValue4207_29_0 = this.g;
    }
    if (!((life3_5 == 0))) {
        forwardValue4207_36_0 = forwardValue4207_29_0;
        break forward_join_36;
    }
    if (!((forwardValue4207_29_0 > 0))) {
        break forward_join_41;
    }
    forwardValue4207_36_0 = ((((moom.uj)(this)).a(((net.minecraft.entity.player.EntityPlayer)(this.d)))) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4207_40_0 = forwardValue4207_36_0;
        break forward_join_40;
    }
    if (!((forwardValue4207_36_0 != 0))) {
        break forward_join_41;
    }
    forwardValue4207_40_0 = 1;
    }
    forwardValue4207_42_0 = forwardValue4207_40_0;
    break forward_join_42;
    }
    forwardValue4207_42_0 = 0;
    }
    return ((forwardValue4207_42_0) != 0);
}


public void c() {
((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.passive.EntityWolf)(this.c)).a__vt())).a(((double)(((net.minecraft.entity.player.EntityPlayer)(this.d)).n)), ((double)((((net.minecraft.entity.player.EntityPlayer)(this.d)).o + ((double) ((net.minecraft.entity.player.EntityPlayer)(this.d)).e__Float())))), ((double)(((net.minecraft.entity.player.EntityPlayer)(this.d)).p)), ((float)(0x1.4p3f)), ((float)(((float) ((net.minecraft.entity.passive.EntityWolf)(this.c)).m__Int()))));
    this.g -= 1;
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9356_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7414;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue4205_26_0;
    int forwardValue4205_30_0;
    int forwardValue4205_32_0;
    boolean spill4205_0;
    boolean spill4205_1;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_26: {
    forward_join_22: {
    life2_3 = (moom.uj.h ^ 123797493548266L);
    spill4205_0 = moom.uc.d();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = ((spill4205_0) ? 1 : 0);
    if (!((life5_8 != null))) {
        break forward_join_31;
    }
    spill4205_1 = ((net.minecraft.entity.passive.EntityWolf)(this.c)).ae();
    if (!((life4_9 != 0))) {
        forwardValue4205_26_0 = ((spill4205_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill4205_1))) {
        break forward_join_22;
    }
    if (!((((net.minecraft.item.ItemStack)(life5_8)).a__wQ() != net.minecraft.init.Items.aX))) {
        break forward_join_29;
    }
    }
    forwardValue4205_26_0 = ((((net.minecraft.entity.passive.EntityWolf)(this.c)).b__Boolean(((net.minecraft.item.ItemStack)(life5_8)))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue4205_30_0 = forwardValue4205_26_0;
        break forward_join_30;
    }
    if (!((forwardValue4205_26_0 != 0))) {
        break forward_join_31;
    }
    }
    forwardValue4205_30_0 = 1;
    }
    forwardValue4205_32_0 = forwardValue4205_30_0;
    break forward_join_32;
    }
    forwardValue4205_32_0 = 0;
    }
    return ((forwardValue4205_32_0) != 0);
}


public void a__Void() {
long local1 = (moom.uj.h ^ 111574128588879L);
    ((net.minecraft.entity.passive.EntityWolf)(this.c)).r(((boolean)(true)));
    this.g = ((int)((__sourceIntrinsic_b82a5b29b709_originalDynamicSite1675_3(31115, (5555959752662197687L ^ local1)) + ((java.util.Random)(((net.minecraft.entity.passive.EntityWolf)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite1675_6(24114, (6884733998770749967L ^ local1))))))));
    return;
}


public boolean a__Boolean() {
moom.uj forwardValue4206_22_0;
    int forwardValue4206_29_0;
    int forwardValue4206_31_0;
    boolean spill4206_0;
    moom.uj spill4206_1;
    boolean spill4206_2;
    long life1_3;
    int life3_15;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_22: {
    life1_3 = (moom.uj.h ^ 109219399483507L);
    spill4206_0 = moom.uc.e();
    this.d = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.world.World)(this.e)).a(((net.minecraft.entity.Entity)(this.c)), ((double)(((double) this.f))))));
    life3_15 = ((spill4206_0) ? 1 : 0);
    spill4206_1 = this;
    if (!((life3_15 == 0))) {
        forwardValue4206_22_0 = spill4206_1;
        break forward_join_22;
    }
    if (!((((moom.uj)(spill4206_1)).d != null))) {
        break forward_join_30;
    }
    forwardValue4206_22_0 = this;
    }
    spill4206_2 = ((moom.uj)(forwardValue4206_22_0)).a(((net.minecraft.entity.player.EntityPlayer)(this.d)));
    if (!((life3_15 == 0))) {
        forwardValue4206_29_0 = ((spill4206_2) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill4206_2)) {
        break forward_join_30;
    }
    forwardValue4206_29_0 = 1;
    }
    forwardValue4206_31_0 = forwardValue4206_29_0;
    break forward_join_31;
    }
    forwardValue4206_31_0 = 0;
    }
    return ((forwardValue4206_31_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9356_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1675_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite1675_6(int a0, long a1) throws E;
}
