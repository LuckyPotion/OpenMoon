package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class us extends moom.uc {

private final moom.sI c;

private double d;

private double e;

private double f;

private final double g;

private final net.minecraft.world.World h;

private static final long i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public us(moom.sI p0, double p1) {
super();
    this.c = p0;
    this.g = p1;
    this.h = p0.i;
    (this).a(1);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(4277637335908472276L)), ((long)(7302906222615539004L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(100313836092620L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.us.i ^ 90128070322523L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1605_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1605_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1605_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1605_14 = new byte[8];
    (__sourceSpill1605_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1605_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1605_16 = __sourceSpill1605_14;
    ((javax.crypto.Cipher)(__sourceSpill1605_11)).init(((int)(__sourceSpill1605_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1605_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1605_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[5];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Èæ3¦m75¿ß_åÏw,ê\004ë>"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1605_25 = local6_life21;
        int __sourceSpill1605_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1605_25)).substring(((int)(__sourceSpill1605_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1605_30 = local8_life19;
        int __sourceSpill1605_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1605_33 = new byte[8];
        (__sourceSpill1605_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1605_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1605_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1605_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1605_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1605_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1605_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1605_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1605_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1605_34)).doFinal(((byte[])(__sourceSpill1605_33)));
        (__sourceSpill1605_30)[__sourceSpill1605_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\037\\Ys¨\032CÙN\013´ f"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1605_38 = local6_life21;
        int __sourceSpill1605_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1605_38)).substring(((int)(__sourceSpill1605_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1605_43 = local8_life19;
        int __sourceSpill1605_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1605_46 = new byte[8];
        (__sourceSpill1605_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1605_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1605_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1605_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1605_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1605_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1605_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1605_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1605_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1605_47)).doFinal(((byte[])(__sourceSpill1605_46)));
        (__sourceSpill1605_43)[__sourceSpill1605_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public boolean b__Boolean() {
int forwardValue4235_14_0;
    int forwardValue4235_16_0;
    boolean spill4235_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.us.i ^ 116947612304791L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4235_0 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4235_14_0 = ((spill4235_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4235_0))) {
        break forward_join_15;
    }
    forwardValue4235_14_0 = 1;
    }
    forwardValue4235_16_0 = forwardValue4235_14_0;
    break forward_join_16;
    }
    forwardValue4235_16_0 = 0;
    }
    return ((forwardValue4235_16_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20835;
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
         long var5 = j[var3];
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
            throw new RuntimeException("moom/us", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.us.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9389_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/us"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean() {
int forwardValue4234_17_0;
    int forwardValue4234_40_0;
    moom.us forwardValue4234_44_0;
    boolean spill4234_0;
    moom.us spill4234_1;
    long life1_3;
    int life3_5;
    moom.DR life4_60;
    forward_join_64: {
    forward_join_52: {
    forward_join_44: {
    forward_join_43: {
    forward_join_40: {
    forward_join_22: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (moom.us.i ^ 3227879566598L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4234_0 = ((net.minecraft.world.World)(this.h)).e__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4234_17_0 = ((spill4234_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill4234_0))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4234_17_0 = ((((moom.sI)(this.c)).r__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4234_40_0 = forwardValue4234_17_0;
        break forward_join_40;
    }
    if (!((forwardValue4234_17_0 == 0))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    spill4234_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4234_44_0 = spill4234_1;
        break forward_join_44;
    }
    forwardValue4234_40_0 = ((((net.minecraft.world.World)(((moom.us)(spill4234_1)).h)).e(((moom.DT)(new moom.DT(((moom.sI)(this.c)).n, ((moom.CA)(((moom.sI)(this.c)).b())).c, ((moom.sI)(this.c)).p))))) ? 1 : 0);
    }
    if (!((forwardValue4234_40_0 == 0))) {
        break forward_join_43;
    }
    return ((0) != 0);
    }
    forwardValue4234_44_0 = this;
    }
    life4_60 = ((moom.us)(forwardValue4234_44_0)).a__sourceReturn_75088e57f4();
    if (!((life3_5 == 0))) {
        break forward_join_64;
    }
    if (!((life4_60 == null))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    this.d = ((double)(((moom.DR)(life4_60)).a));
    this.e = ((double)(((moom.DR)(life4_60)).b));
    this.f = ((double)(((moom.DR)(life4_60)).c));
    }
    return ((1) != 0);
}


private moom.DR a__sourceReturn_75088e57f4() {
boolean spill1335_0;
    long life1_3;
    java.util.Random life4_8;
    int life3_9;
    moom.DT life5_23;
    int life6_25;
    moom.DT life7_70;
    lexical_join_101: {
    life1_3 = (moom.us.i ^ 13925219481157L);
    spill1335_0 = moom.uc.d();
    life4_8 = ((moom.sI)(this.c)).a__Random();
    life3_9 = ((spill1335_0) ? 1 : 0);
    life5_23 = new moom.DT(((moom.sI)(this.c)).n, ((moom.CA)(((moom.sI)(this.c)).b())).c, ((moom.sI)(this.c)).p);
    life6_25 = 0;
    lexical_cycle_26: while (true) {
    lexical_join_99: {
    lexical_join_98: {
    if (!((life6_25 < __sourceIntrinsic_5882d62f8e18_invokedynamic1335_12(17930, (7770727491194533087L ^ life1_3))))) {
        break lexical_join_101;
    }
    life7_70 = ((moom.DT)(life5_23)).a(((int)((((java.util.Random)(life4_8)).nextInt(((int)(__sourceIntrinsic_5882d62f8e18_invokedynamic1335_13(14937, (6800606760327825549L ^ life1_3))))) - __sourceIntrinsic_5882d62f8e18_invokedynamic1335_15(20505, (7575875015200514766L ^ life1_3))))), ((int)((((java.util.Random)(life4_8)).nextInt(((int)(__sourceIntrinsic_5882d62f8e18_invokedynamic1335_16(32654, (3136727712289328477L ^ life1_3))))) - 3))), ((int)((((java.util.Random)(life4_8)).nextInt(((int)(__sourceIntrinsic_5882d62f8e18_invokedynamic1335_18(26153, (1132934263146026239L ^ life1_3))))) - __sourceIntrinsic_5882d62f8e18_invokedynamic1335_20(20505, (7575875015200514766L ^ life1_3))))));
    if (!((life3_9 != 0))) {
        break lexical_join_99;
    }
    if (!((!((net.minecraft.world.World)(this.h)).e(((moom.DT)(life7_70)))))) {
        break lexical_join_98;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((moom.sI)(this.c)).a__sourceReturn_8d24afb582(((moom.DT)(life7_70))))), ((float)(0x0.0p0f))) < 0))) {
        break lexical_join_98;
    }
    return new moom.DR(((double) ((moom.DT)(life7_70)).a()), ((double) ((moom.DT)(life7_70)).b()), ((double) ((moom.DT)(life7_70)).c()));
    }
    life6_25 += 1;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    return null;
}


public void a__Void() {
((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)(this.d)), ((double)(this.e)), ((double)(this.f)), ((double)(this.g)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9389_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5882d62f8e18_invokedynamic1335_20(int a0, long a1) throws E;
}
