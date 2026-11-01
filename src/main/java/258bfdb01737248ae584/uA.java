package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uA extends moom.uc {

private final moom.sI c;

private moom.Ea d;

private int e;

private int f;

private static final long g;

private static final long[] h;

private static final java.lang.Integer[] i;

private static final java.util.Map j;

public uA(moom.sI p0) {
super();
    this.e = -1;
    this.f = -1;
    this.c = p0;
    (this).a(1);
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-430463699977109696L)), ((long)(-8747249106570432159L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(17038324640060L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uA.g ^ 68741960262076L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1042_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1042_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1042_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1042_14 = new byte[8];
    (__sourceSpill1042_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1042_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1042_16 = __sourceSpill1042_14;
    ((javax.crypto.Cipher)(__sourceSpill1042_11)).init(((int)(__sourceSpill1042_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1042_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1042_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¸/A£úw\005\037vyÖñ<\022õu\r$7Ô"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1042_25 = local6_life21;
        int __sourceSpill1042_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1042_25)).substring(((int)(__sourceSpill1042_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1042_30 = local8_life19;
        int __sourceSpill1042_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1042_33 = new byte[8];
        (__sourceSpill1042_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1042_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1042_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1042_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1042_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1042_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1042_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1042_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1042_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1042_34)).doFinal(((byte[])(__sourceSpill1042_33)));
        (__sourceSpill1042_30)[__sourceSpill1042_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public void b__Void() {
this.e = ((int)(((moom.DT)(((moom.Ea)(this.d)).b__DT())).a()));
    this.f = ((int)(((moom.DT)(((moom.Ea)(this.d)).b__DT())).c()));
    this.d = ((moom.Ea)(null));
    return;
}


public boolean b__Boolean() {
int forwardValue4135_14_0;
    int forwardValue4135_16_0;
    boolean spill4135_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.uA.g ^ 77252820136074L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4135_0 = ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4135_14_0 = ((spill4135_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4135_0))) {
        break forward_join_15;
    }
    forwardValue4135_14_0 = 1;
    }
    forwardValue4135_16_0 = forwardValue4135_14_0;
    break forward_join_16;
    }
    forwardValue4135_16_0 = 0;
    }
    return ((forwardValue4135_16_0) != 0);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13563;
      if (i[var3] == null) {
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uA", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9269_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4133_40_0;
    int forwardValue4133_61_0;
    moom.uA forwardValue4133_83_0;
    moom.sI forwardValue4133_84_0;
    int forwardValue4133_111_0;
    int forwardValue4133_113_0;
    boolean spill4133_0;
    boolean spill4133_1;
    boolean spill4133_2;
    boolean spill4133_3;
    int spill4133_4;
    moom.uA spill4133_5;
    moom.sI spill4133_6;
    long life1_3;
    moom.DT life4_10;
    int life3_11;
    net.minecraft.village.Village life5_133;
    forward_join_113: {
    forward_join_112: {
    forward_join_111: {
    forward_join_110: {
    forward_join_105: {
    forward_join_100: {
    forward_join_84: {
    forward_join_83: {
    forward_join_82: {
    forward_join_61: {
    forward_join_57: {
    forward_join_40: {
    forward_join_35: {
    life1_3 = (moom.uA.g ^ 51615349872667L);
    spill4133_0 = moom.uc.d();
    life4_10 = new moom.DT(this.c);
    life3_11 = ((spill4133_0) ? 1 : 0);
    spill4133_1 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).e__Boolean();
    if (!((life3_11 != 0))) {
        forwardValue4133_40_0 = ((spill4133_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill4133_1)) {
        break forward_join_35;
    }
    spill4133_2 = ((net.minecraft.world.World)(((moom.sI)(this.c)).i)).g__Boolean();
    if (!((life3_11 != 0))) {
        forwardValue4133_113_0 = ((spill4133_2) ? 1 : 0);
        break forward_join_113;
    }
    if (!(spill4133_2)) {
        break forward_join_112;
    }
    spill4133_3 = ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(((moom.sI)(this.c)).i)).a__ES(((moom.DT)(life4_10))))).b__Boolean();
    if (!((life3_11 != 0))) {
        forwardValue4133_113_0 = ((spill4133_3) ? 1 : 0);
        break forward_join_113;
    }
    if (!((!spill4133_3))) {
        break forward_join_112;
    }
    }
    forwardValue4133_40_0 = ((((moom.EA)(((net.minecraft.world.World)(((moom.sI)(this.c)).i)).v)).e()) ? 1 : 0);
    }
    if (!((life3_11 != 0))) {
        forwardValue4133_113_0 = forwardValue4133_40_0;
        break forward_join_113;
    }
    if (!((forwardValue4133_40_0 == 0))) {
        break forward_join_112;
    }
    spill4133_4 = ((java.util.Random)(((moom.sI)(this.c)).a__Random())).nextInt(((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4133_24(9265, (6148664575512963135L ^ life1_3)))));
    if (!((life3_11 != 0))) {
        forwardValue4133_61_0 = spill4133_4;
        break forward_join_61;
    }
    if (!((spill4133_4 != 0))) {
        break forward_join_57;
    }
    return ((0) != 0);
    }
    spill4133_5 = this;
    if (!((life3_11 != 0))) {
        forwardValue4133_83_0 = spill4133_5;
        break forward_join_83;
    }
    forwardValue4133_61_0 = ((moom.uA)(spill4133_5)).e;
    }
    if (!((forwardValue4133_61_0 != -1))) {
        break forward_join_82;
    }
    spill4133_6 = this.c;
    if (!((life3_11 != 0))) {
        forwardValue4133_84_0 = spill4133_6;
        break forward_join_84;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((moom.sI)(spill4133_6)).a(((double)(((double) this.e))), ((double)(((moom.sI)(this.c)).o)), ((double)(((double) this.f)))))), ((double)(0x1.0p2d))) < 0))) {
        break forward_join_82;
    }
    return ((0) != 0);
    }
    forwardValue4133_83_0 = this;
    }
    forwardValue4133_84_0 = ((moom.uA)(forwardValue4133_83_0)).c;
    }
    life5_133 = ((moom.EG)(((net.minecraft.world.World)(((moom.sI)(forwardValue4133_84_0)).i)).a__EG())).a(((moom.DT)(life4_10)), ((int)(__sourceIntrinsic_1a14968dced5_invokedynamic4133_39(5452, (4832021510557129024L ^ life1_3)))));
    if (!((life3_11 != 0))) {
        break forward_join_105;
    }
    if (!((life5_133 == null))) {
        break forward_join_100;
    }
    return ((0) != 0);
    }
    this.d = ((moom.Ea)(((net.minecraft.village.Village)(life5_133)).b(((moom.DT)(life4_10)))));
    }
    if (!((this.d != null))) {
        break forward_join_110;
    }
    forwardValue4133_111_0 = 1;
    break forward_join_111;
    }
    forwardValue4133_111_0 = 0;
    }
    return ((forwardValue4133_111_0) != 0);
    }
    forwardValue4133_113_0 = 0;
    }
    return ((forwardValue4133_113_0) != 0);
}


public void a__Void() {
int forwardValue4134_85_0;
    boolean spill4134_0;
    int spill4134_1;
    long life1_3;
    moom.DT life4_11;
    int life3_12;
    int life5_15;
    int life6_18;
    int life7_21;
    moom.DR life8_56;
    forward_join_86: {
    forward_join_85: {
    forward_join_70: {
    forward_join_68: {
    life1_3 = (moom.uA.g ^ 44933366325287L);
    spill4134_0 = moom.uc.d();
    this.e = ((int)(-1));
    life4_11 = ((moom.Ea)(this.d)).b__DT();
    life3_12 = ((spill4134_0) ? 1 : 0);
    life5_15 = ((moom.DT)(life4_11)).a();
    life6_18 = ((moom.DT)(life4_11)).b();
    life7_21 = ((moom.DT)(life4_11)).c();
    spill4134_1 = recovery.source.CarrierOps.dcmpl(((double)(((moom.sI)(this.c)).a(((moom.DT)(life4_11))))), ((double)(0x1.0p8d)));
    if (!((life3_12 != 0))) {
        forwardValue4134_85_0 = spill4134_1;
        break forward_join_85;
    }
    if (!((spill4134_1 > 0))) {
        break forward_join_70;
    }
    life8_56 = moom.vA.a(((moom.sI)(this.c)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic4134_13(9069, (3640154719594075996L ^ life1_3)))), ((int)(3)), ((moom.DR)(new moom.DR((((double) life5_15) + 0x1.0p-1d), ((double) life6_18), (((double) life7_21) + 0x1.0p-1d)))));
    if (!((life8_56 != null))) {
        break forward_join_68;
    }
    ((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)(((moom.DR)(life8_56)).a)), ((double)(((moom.DR)(life8_56)).b)), ((double)(((moom.DR)(life8_56)).c)), ((double)(0x1.0p0d)));
    }
    if (!((life3_12 == 0))) {
        break forward_join_86;
    }
    }
    forwardValue4134_85_0 = ((((moom.AV)(((moom.sI)(this.c)).a__sourceReturn_407923443b())).a(((double)((((double) life5_15) + 0x1.0p-1d))), ((double)(((double) life6_18))), ((double)((((double) life7_21) + 0x1.0p-1d))), ((double)(0x1.0p0d)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4134_85_0);
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9269_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4133_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1a14968dced5_invokedynamic4133_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic4134_13(int a0, long a1) throws E;
}
