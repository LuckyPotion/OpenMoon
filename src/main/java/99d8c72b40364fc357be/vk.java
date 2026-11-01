package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class vk extends moom.uc {

private final net.minecraft.entity.monster.EntitySlime c;

private float d;

private int e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public vk(net.minecraft.entity.monster.EntitySlime p0) {
super();
    this.c = p0;
    (this).a(2);
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(1330605041058214068L)), ((long)(6466994768937394292L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(126625373666619L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.vk.f ^ 137091623577274L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1078_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1078_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1078_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1078_14 = new byte[8];
    (__sourceSpill1078_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1078_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1078_16 = __sourceSpill1078_14;
    ((javax.crypto.Cipher)(__sourceSpill1078_11)).init(((int)(__sourceSpill1078_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1078_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1078_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "×µ\fôjàî«IÈûa\021ãY\f©É±7cî\022"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1078_25 = local6_life21;
        int __sourceSpill1078_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1078_25)).substring(((int)(__sourceSpill1078_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1078_30 = local8_life19;
        int __sourceSpill1078_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1078_33 = new byte[8];
        (__sourceSpill1078_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1078_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1078_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1078_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1078_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1078_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1078_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1078_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1078_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1078_34)).doFinal(((byte[])(__sourceSpill1078_33)));
        (__sourceSpill1078_30)[__sourceSpill1078_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public void c() {
moom.vk forwardValue4328_46_0;
    moom.vk spill4328_0;
    int spill4328_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_46: {
    forward_join_45: {
    life1_3 = (moom.vk.f ^ 66445589781674L);
    life3_5 = moom.vN.b();
    spill4328_0 = this;
    if (!((life3_5 == null))) {
        forwardValue4328_46_0 = spill4328_0;
        break forward_join_46;
    }
    moom.vk __stackOp4328_2_0 = spill4328_0;
    moom.vk __stackOp4328_4_0 = __stackOp4328_2_0;
    int __stackOp4328_4_1 = (((moom.vk)(__stackOp4328_2_0)).e - 1);
    spill4328_1 = __stackOp4328_4_1;
    ((moom.vk)(__stackOp4328_4_0)).e = ((int)(__stackOp4328_4_1));
    if (!((spill4328_1 <= 0))) {
        break forward_join_45;
    }
    this.e = ((int)((__sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_6(6070, (4484066541109552427L ^ life1_3)) + ((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_9(21536, (3319925425395492543L ^ life1_3))))))));
    this.d = ((float)(((float) ((java.util.Random)(((net.minecraft.entity.monster.EntitySlime)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_14(18398, (4174001318731183426L ^ life1_3))))))));
    }
    forwardValue4328_46_0 = this;
    }
    ((moom.vx)(((moom.vx)(((net.minecraft.entity.monster.EntitySlime)(((moom.vk)(forwardValue4328_46_0)).c)).a__vu())))).a(((float)(this.d)), ((boolean)(false)));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16472;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/vk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.vk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9500_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/vk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
net.minecraft.entity.monster.EntitySlime forwardValue4327_14_0;
    int forwardValue4327_31_0;
    int forwardValue4327_33_0;
    net.minecraft.entity.monster.EntitySlime spill4327_0;
    boolean spill4327_1;
    boolean spill4327_2;
    boolean spill4327_3;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_14: {
    life1_3 = (moom.vk.f ^ 1950446753432L);
    life3_5 = moom.vN.b();
    spill4327_0 = this.c;
    if (!((life3_5 == null))) {
        forwardValue4327_14_0 = spill4327_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.entity.monster.EntitySlime)(spill4327_0)).d__sourceReturn_d30556f370() == null))) {
        break forward_join_32;
    }
    forwardValue4327_14_0 = this.c;
    }
    spill4327_1 = ((net.minecraft.entity.monster.EntitySlime)(forwardValue4327_14_0)).A;
    if (!((life3_5 == null))) {
        forwardValue4327_31_0 = ((spill4327_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4327_1))) {
        break forward_join_30;
    }
    spill4327_2 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).j__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4327_31_0 = ((spill4327_2) ? 1 : 0);
        break forward_join_31;
    }
    if (!((!spill4327_2))) {
        break forward_join_30;
    }
    spill4327_3 = ((net.minecraft.entity.monster.EntitySlime)(this.c)).l__Boolean();
    if (!((life3_5 == null))) {
        forwardValue4327_31_0 = ((spill4327_3) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill4327_3)) {
        break forward_join_32;
    }
    }
    forwardValue4327_31_0 = 1;
    }
    forwardValue4327_33_0 = forwardValue4327_31_0;
    break forward_join_33;
    }
    forwardValue4327_33_0 = 0;
    }
    return ((forwardValue4327_33_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9500_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4328_14(int a0, long a1) throws E;
}
