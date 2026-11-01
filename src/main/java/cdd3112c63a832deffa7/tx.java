package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class tx extends net.minecraft.entity.Entity {

private double aE;

private double aF;

private double aG;

private int aH;

private boolean aI;

private static final long bb;

private static final long[] cb;

private static final java.lang.Integer[] db;

private static final java.util.Map eb;

public tx(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0);
    this.aH = 0;
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
    (this).a__Void(p1, p2, p3);
}


public tx(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.0000000000000p-2f, 0x1.0000000000000p-2f);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-6466372541146768507L)), ((long)(-1502478871672231232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(140704591104409L)))));
    eb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.tx.bb ^ 107828295345073L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1038_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1038_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1038_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1038_14 = new byte[8];
    (__sourceSpill1038_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1038_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1038_16 = __sourceSpill1038_14;
    ((javax.crypto.Cipher)(__sourceSpill1038_11)).init(((int)(__sourceSpill1038_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1038_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1038_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "~¤ãY½ß®òÏ[\000­ÎÃÆÆÈ3\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1038_25 = local6_life21;
        int __sourceSpill1038_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1038_25)).substring(((int)(__sourceSpill1038_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1038_30 = local8_life19;
        int __sourceSpill1038_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1038_33 = new byte[8];
        (__sourceSpill1038_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1038_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1038_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1038_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1038_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1038_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1038_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1038_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1038_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1038_34)).doFinal(((byte[])(__sourceSpill1038_33)));
        (__sourceSpill1038_30)[__sourceSpill1038_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    cb = ((long[])(local8_life19));
    db = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9237_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tx"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.tx.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11960;
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
            throw new RuntimeException("moom/tx", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         db[var3] = var15;
      }

      return db[var3];
}


public void b__sourceReturn_8356fc462d(moom.DT p0) {
moom.tx forwardValue4111_94_0;
    int forwardValue4111_94_1;
    moom.tx forwardValue4111_95_0;
    moom.tx forwardValue4111_96_0;
    int forwardValue4111_96_1;
    int spill4111_0;
    moom.tx spill4111_1;
    int spill4111_2;
    long life2_3;
    double life5_7;
    int life7_10;
    double life8_14;
    double life10_20;
    int life4_21;
    double life12_26;
    float life14_35;
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_82: {
    forward_join_79: {
    forward_join_72: {
    life2_3 = (moom.tx.bb ^ 104540251669015L);
    life5_7 = ((double) ((moom.DT)(p0)).a());
    life7_10 = ((moom.DT)(p0)).b();
    life8_14 = ((double) ((moom.DT)(p0)).c());
    spill4111_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life10_20 = (life5_7 - ((moom.tx)(this)).n);
    life4_21 = spill4111_0;
    life12_26 = (life8_14 - ((moom.tx)(this)).p);
    life14_35 = moom.Dr.a__Float(((double)(((life10_20 * life10_20) + (life12_26 * life12_26)))));
    if (!((life4_21 == 0))) {
        break forward_join_79;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life14_35)), ((float)(0x1.8p3f))) > 0))) {
        break forward_join_72;
    }
    this.aE = ((double)((((moom.tx)(this)).n + ((life10_20 / ((double) life14_35)) * 0x1.8p3d))));
    this.aG = ((double)((((moom.tx)(this)).p + ((life12_26 / ((double) life14_35)) * 0x1.8p3d))));
    this.aF = ((double)((((moom.tx)(this)).o + 0x1.0p3d)));
    if (!((life4_21 != 0))) {
        break forward_join_82;
    }
    }
    this.aE = ((double)(life5_7));
    this.aF = ((double)(((double) life7_10)));
    }
    this.aG = ((double)(life8_14));
    }
    this.aH = ((int)(0));
    spill4111_1 = this;
    spill4111_2 = ((java.util.Random)(((moom.tx)(this)).ah)).nextInt(((int)(5)));
    if (!((life4_21 == 0))) {
        forwardValue4111_94_0 = spill4111_1;
        forwardValue4111_94_1 = spill4111_2;
        break forward_join_94;
    }
    if (!((spill4111_2 > 0))) {
        forwardValue4111_95_0 = spill4111_1;
        break forward_join_95;
    }
    forwardValue4111_94_0 = spill4111_1;
    forwardValue4111_94_1 = 1;
    }
    forwardValue4111_96_0 = forwardValue4111_94_0;
    forwardValue4111_96_1 = forwardValue4111_94_1;
    break forward_join_96;
    }
    forwardValue4111_96_0 = forwardValue4111_95_0;
    forwardValue4111_96_1 = 0;
    }
    ((moom.tx)(forwardValue4111_96_0)).aI = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4111_96_1)));
    return;
}


public boolean x__Boolean() {
return ((0) != 0);
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public void d(double p0, double p1, double p2) {
int forwardValue4112_28_0;
    float forwardValue4112_37_0;
    int spill4112_0;
    int spill4112_1;
    float spill4112_2;
    moom.tx spill4112_3;
    float spill4112_4;
    moom.tx spill4112_5;
    float spill4112_6;
    long life7_3;
    int life9_14;
    float life10_49;
    forward_join_65: {
    forward_join_37: {
    forward_join_28: {
    life7_3 = (moom.tx.bb ^ 9916428455804L);
    spill4112_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    ((moom.tx)(this)).t = ((double)(p0));
    ((moom.tx)(this)).u = ((double)(p1));
    ((moom.tx)(this)).v = ((double)(p2));
    life9_14 = spill4112_0;
    spill4112_1 = recovery.source.CarrierOps.fcmpl(((float)(((moom.tx)(this)).z)), ((float)(0x0.0p0f)));
    if (!((life9_14 == 0))) {
        forwardValue4112_28_0 = spill4112_1;
        break forward_join_28;
    }
    if (!((spill4112_1 == 0))) {
        break forward_join_65;
    }
    spill4112_2 = ((moom.tx)(this)).y;
    if (!((life9_14 == 0))) {
        forwardValue4112_37_0 = spill4112_2;
        break forward_join_37;
    }
    forwardValue4112_28_0 = recovery.source.CarrierOps.fcmpl(((float)(spill4112_2)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue4112_28_0 == 0))) {
        break forward_join_65;
    }
    forwardValue4112_37_0 = moom.Dr.a__Float(((double)(((p0 * p0) + (p2 * p2)))));
    }
    life10_49 = forwardValue4112_37_0;
    spill4112_3 = this;
    moom.tx __stackOp4112_11_0 = this;
    float __stackOp4112_11_1 = ((float) ((moom.Dr.b(((double)(p0)), ((double)(p2))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill4112_4 = __stackOp4112_11_1;
    ((moom.tx)(__stackOp4112_11_0)).w = ((float)(__stackOp4112_11_1));
    ((moom.tx)(spill4112_3)).y = ((float)(spill4112_4));
    spill4112_5 = this;
    moom.tx __stackOp4112_15_0 = this;
    float __stackOp4112_15_1 = ((float) ((moom.Dr.b(((double)(p1)), ((double)(((double) life10_49)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d));
    spill4112_6 = __stackOp4112_15_1;
    ((moom.tx)(__stackOp4112_15_0)).x = ((float)(__stackOp4112_15_1));
    ((moom.tx)(spill4112_5)).z = ((float)(spill4112_6));
    }
    return;
}


protected void d__Void() {
return;
}


public boolean a(double p0) {
int forwardValue4110_28_0;
    int forwardValue4110_32_0;
    int forwardValue4110_34_0;
    int spill4110_0;
    boolean spill4110_1;
    long life3_3;
    double life6_10;
    int life5_11;
    double life6_25;
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (moom.tx.bb ^ 111181393198819L);
    spill4110_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    life6_10 = (((moom.CA)(((moom.tx)(this)).b())).a() * 0x1.0p2d);
    life5_11 = spill4110_0;
    spill4110_1 = java.lang.Double.isNaN(((double)(life6_10)));
    if (!((life5_11 == 0))) {
        forwardValue4110_28_0 = ((spill4110_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill4110_1)) {
        break forward_join_19;
    }
    life6_10 = 0x1.0p2d;
    }
    life6_25 = (life6_10 * 0x1.0p6d);
    forwardValue4110_28_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)((life6_25 * life6_25))));
    }
    if (!((life5_11 == 0))) {
        forwardValue4110_32_0 = forwardValue4110_28_0;
        break forward_join_32;
    }
    if (!((forwardValue4110_28_0 < 0))) {
        break forward_join_33;
    }
    forwardValue4110_32_0 = 1;
    }
    forwardValue4110_34_0 = forwardValue4110_32_0;
    break forward_join_34;
    }
    forwardValue4110_34_0 = 0;
    }
    return ((forwardValue4110_34_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a__Int(float p0) {
long local2 = (moom.tx.bb ^ 95579521863172L);
    return __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1667_1(23891, (2949013130236692925L ^ local2));
}


public float a(float p0) {
return 0x1.0p0f;
}


public void g__Void() {
moom.tx lexicalValue1327_181_0;
    int lexicalValue1327_254_0;
    moom.tx lexicalValue1327_269_0;
    moom.tx lexicalValue1327_335_0;
    int lexicalValue1327_410_0;
    int lexicalValue1327_421_0;
    int lexicalValue1327_430_0;
    moom.tx lexicalValue1327_453_0;
    int spill1327_0;
    moom.tx spill1327_1;
    int spill1327_2;
    moom.tx spill1327_3;
    moom.tx spill1327_4;
    boolean spill1327_5;
    moom.tx spill1327_6;
    long life1_3;
    int life3_19;
    float life4_53;
    double life5_209;
    double life7_215;
    float life9_225;
    float life10_230;
    double life11_240;
    float life5_316;
    int life6_326;
    lexical_join_465: {
    lexical_join_453: {
    lexical_join_452: {
    lexical_join_430: {
    lexical_join_421: {
    lexical_join_410: {
    lexical_join_388: {
    lexical_join_335: {
    lexical_join_334: {
    lexical_join_332: {
    lexical_join_279: {
    lexical_join_269: {
    lexical_join_268: {
    lexical_join_254: {
    lexical_join_233: {
    lexical_join_181: {
    lexical_join_174: {
    lexical_join_150: {
    lexical_join_132: {
    lexical_join_114: {
    lexical_join_96: {
    life1_3 = (moom.tx.bb ^ 860784207290L);
    ((moom.tx)(this)).M = ((double)(((moom.tx)(this)).n));
    ((moom.tx)(this)).N = ((double)(((moom.tx)(this)).o));
    ((moom.tx)(this)).O = ((double)(((moom.tx)(this)).p));
    spill1327_0 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.b();
    super.g__Void();
    life3_19 = spill1327_0;
    moom.tx __stackOp1327_9_0 = this;
    ((moom.tx)(__stackOp1327_9_0)).n = ((double)((((moom.tx)(__stackOp1327_9_0)).n + ((moom.tx)(this)).t)));
    moom.tx __stackOp1327_13_0 = this;
    ((moom.tx)(__stackOp1327_13_0)).o = ((double)((((moom.tx)(__stackOp1327_13_0)).o + ((moom.tx)(this)).u)));
    moom.tx __stackOp1327_17_0 = this;
    ((moom.tx)(__stackOp1327_17_0)).p = ((double)((((moom.tx)(__stackOp1327_17_0)).p + ((moom.tx)(this)).v)));
    life4_53 = moom.Dr.a__Float(((double)(((((moom.tx)(this)).t * ((moom.tx)(this)).t) + (((moom.tx)(this)).v * ((moom.tx)(this)).v)))));
    ((moom.tx)(this)).w = ((float)(((float) ((moom.Dr.b(((double)(((moom.tx)(this)).t)), ((double)(((moom.tx)(this)).v))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    ((moom.tx)(this)).x = ((float)(((float) ((moom.Dr.b(((double)(((moom.tx)(this)).u)), ((double)(((double) life4_53)))) * 0x1.68p7d) / 0x1.921fb54442d18p1d))));
    lexical_cycle_78: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((((moom.tx)(this)).x - ((moom.tx)(this)).z))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_96;
    }
    moom.tx __stackOp1327_36_0 = this;
    ((moom.tx)(__stackOp1327_36_0)).z = ((float)((((moom.tx)(__stackOp1327_36_0)).z - 0x1.68p8f)));
    if (!((life3_19 != 0))) {
        break lexical_join_114;
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_78; }
    break lexical_cycle_78;
    }
    }
    lexical_cycle_96: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((((moom.tx)(this)).x - ((moom.tx)(this)).z))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_114;
    }
    moom.tx __stackOp1327_42_0 = this;
    ((moom.tx)(__stackOp1327_42_0)).z = ((float)((((moom.tx)(__stackOp1327_42_0)).z + 0x1.68p8f)));
    if (!((life3_19 != 0))) {
        break lexical_join_132;
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_96; }
    break lexical_cycle_96;
    }
    }
    lexical_cycle_114: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)((((moom.tx)(this)).w - ((moom.tx)(this)).y))), ((float)(-0x1.68p7f))) < 0))) {
        break lexical_join_132;
    }
    moom.tx __stackOp1327_48_0 = this;
    ((moom.tx)(__stackOp1327_48_0)).y = ((float)((((moom.tx)(__stackOp1327_48_0)).y - 0x1.68p8f)));
    if (!((life3_19 != 0))) {
        break lexical_join_174;
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_114; }
    break lexical_cycle_114;
    }
    }
    lexical_cycle_132: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)((((moom.tx)(this)).w - ((moom.tx)(this)).y))), ((float)(0x1.68p7f))) >= 0))) {
        break lexical_join_150;
    }
    moom.tx __stackOp1327_54_0 = this;
    ((moom.tx)(__stackOp1327_54_0)).y = ((float)((((moom.tx)(__stackOp1327_54_0)).y + 0x1.68p8f)));
    if (!((life3_19 != 0))) {
        break lexical_join_174;
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_132; }
    break lexical_cycle_132;
    }
    }
    ((moom.tx)(this)).x = ((float)((((moom.tx)(this)).z + ((((moom.tx)(this)).x - ((moom.tx)(this)).z) * 0x1.99999ap-3f))));
    ((moom.tx)(this)).w = ((float)((((moom.tx)(this)).y + ((((moom.tx)(this)).w - ((moom.tx)(this)).y) * 0x1.99999ap-3f))));
    }
    spill1327_1 = this;
    if (!((life3_19 != 0))) {
        lexicalValue1327_181_0 = spill1327_1;
        break lexical_join_181;
    }
    if (!((!((net.minecraft.world.World)(((moom.tx)(spill1327_1)).i)).G))) {
        break lexical_join_279;
    }
    lexicalValue1327_181_0 = this;
    }
    life5_209 = (((moom.tx)(lexicalValue1327_181_0)).aE - ((moom.tx)(this)).n);
    life7_215 = (this.aG - ((moom.tx)(this)).p);
    life9_225 = ((float) java.lang.Math.sqrt(((double)(((life5_209 * life5_209) + (life7_215 * life7_215))))));
    life10_230 = ((float) moom.Dr.b(((double)(life7_215)), ((double)(life5_209))));
    life11_240 = (((double) life4_53) + (((double) (life9_225 - life4_53)) * 0x1.47ae147ae147bp-9d));
    spill1327_2 = recovery.source.CarrierOps.fcmpg(((float)(life9_225)), ((float)(0x1.0p0f)));
    if (!((life3_19 != 0))) {
        lexicalValue1327_254_0 = spill1327_2;
        break lexical_join_254;
    }
    if (!((spill1327_2 < 0))) {
        break lexical_join_233;
    }
    life11_240 = (life11_240 * 0x1.999999999999ap-1d);
    moom.tx __stackOp1327_74_0 = this;
    ((moom.tx)(__stackOp1327_74_0)).u = ((double)((((moom.tx)(__stackOp1327_74_0)).u * 0x1.999999999999ap-1d)));
    }
    ((moom.tx)(this)).t = ((double)((java.lang.Math.cos(((double)(((double) life10_230)))) * life11_240)));
    ((moom.tx)(this)).v = ((double)((java.lang.Math.sin(((double)(((double) life10_230)))) * life11_240)));
    spill1327_3 = this;
    if (!((life3_19 != 0))) {
        lexicalValue1327_269_0 = spill1327_3;
        break lexical_join_269;
    }
    lexicalValue1327_254_0 = recovery.source.CarrierOps.dcmpg(((double)(((moom.tx)(spill1327_3)).o)), ((double)(this.aF)));
    }
    if (!((lexicalValue1327_254_0 < 0))) {
        break lexical_join_268;
    }
    moom.tx __stackOp1327_84_0 = this;
    ((moom.tx)(__stackOp1327_84_0)).u = ((double)((((moom.tx)(__stackOp1327_84_0)).u + ((0x1.0p0d - ((moom.tx)(this)).u) * 0x1.eb851ep-7d))));
    if (!((life3_19 == 0))) {
        break lexical_join_279;
    }
    }
    lexicalValue1327_269_0 = this;
    }
    moom.tx __stackOp1327_88_0 = lexicalValue1327_269_0;
    ((moom.tx)(__stackOp1327_88_0)).u = ((double)((((moom.tx)(__stackOp1327_88_0)).u + ((-0x1.0p0d - ((moom.tx)(this)).u) * 0x1.eb851ep-7d))));
    }
    life5_316 = 0x1.0p-2f;
    spill1327_4 = this;
    if (!((life3_19 != 0))) {
        lexicalValue1327_335_0 = spill1327_4;
        break lexical_join_335;
    }
    if (!(((moom.tx)(spill1327_4)).j__Boolean())) {
        break lexical_join_334;
    }
    life6_326 = 0;
    lexical_cycle_288: while (true) {
    if (!((life6_326 < 4))) {
        break lexical_join_332;
    }
    ((net.minecraft.world.World)(((moom.tx)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.WATER_BUBBLE)), ((double)((((moom.tx)(this)).n - (((moom.tx)(this)).t * ((double) life5_316))))), ((double)((((moom.tx)(this)).o - (((moom.tx)(this)).u * ((double) life5_316))))), ((double)((((moom.tx)(this)).p - (((moom.tx)(this)).v * ((double) life5_316))))), ((double)(((moom.tx)(this)).t)), ((double)(((moom.tx)(this)).u)), ((double)(((moom.tx)(this)).v)), ((int[])(new int[0])));
    life6_326 += 1;
    if (!((life3_19 != 0))) {
        break lexical_join_388;
    }
    if (!((life3_19 == 0))) { continue lexical_cycle_288; }
    break lexical_cycle_288;
    }
    }
    if (!((life3_19 == 0))) {
        break lexical_join_388;
    }
    }
    lexicalValue1327_335_0 = this;
    }
    ((net.minecraft.world.World)(((moom.tx)(lexicalValue1327_335_0)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)((((((moom.tx)(this)).n - (((moom.tx)(this)).t * ((double) life5_316))) + (((java.util.Random)(((moom.tx)(this)).ah)).nextDouble() * 0x1.3333333333333p-1d)) - 0x1.3333333333333p-2d))), ((double)(((((moom.tx)(this)).o - (((moom.tx)(this)).u * ((double) life5_316))) - 0x1.0p-1d))), ((double)((((((moom.tx)(this)).p - (((moom.tx)(this)).v * ((double) life5_316))) + (((java.util.Random)(((moom.tx)(this)).ah)).nextDouble() * 0x1.3333333333333p-1d)) - 0x1.3333333333333p-2d))), ((double)(((moom.tx)(this)).t)), ((double)(((moom.tx)(this)).u)), ((double)(((moom.tx)(this)).v)), ((int[])(new int[0])));
    }
    spill1327_5 = ((net.minecraft.world.World)(((moom.tx)(this)).i)).G;
    if (!((life3_19 != 0))) {
        lexicalValue1327_410_0 = ((spill1327_5) ? 1 : 0);
        break lexical_join_410;
    }
    if (!((!spill1327_5))) {
        break lexical_join_465;
    }
    ((moom.tx)(this)).a__Void(((double)(((moom.tx)(this)).n)), ((double)(((moom.tx)(this)).o)), ((double)(((moom.tx)(this)).p)));
    moom.tx __stackOp1327_128_0 = this;
    ((moom.tx)(__stackOp1327_128_0)).aH = ((int)((((moom.tx)(__stackOp1327_128_0)).aH + 1)));
    lexicalValue1327_410_0 = this.aH;
    }
    if (!((life3_19 != 0))) {
        lexicalValue1327_421_0 = lexicalValue1327_410_0;
        break lexical_join_421;
    }
    if (!((lexicalValue1327_410_0 > __sourceIntrinsic_736a66cda11e_invokedynamic1327_132(13267, (2535394090538830978L ^ life1_3))))) {
        break lexical_join_465;
    }
    lexicalValue1327_421_0 = ((((net.minecraft.world.World)(((moom.tx)(this)).i)).G) ? 1 : 0);
    }
    if (!((life3_19 != 0))) {
        lexicalValue1327_430_0 = lexicalValue1327_421_0;
        break lexical_join_430;
    }
    if (!((lexicalValue1327_421_0 == 0))) {
        break lexical_join_465;
    }
    ((moom.tx)(this)).f__Void();
    spill1327_6 = this;
    if (!((life3_19 != 0))) {
        lexicalValue1327_453_0 = spill1327_6;
        break lexical_join_453;
    }
    lexicalValue1327_430_0 = ((((moom.tx)(spill1327_6)).aI) ? 1 : 0);
    }
    if (!((lexicalValue1327_430_0 != 0))) {
        break lexical_join_452;
    }
    ((net.minecraft.world.World)(((moom.tx)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.item.EntityItem(((moom.tx)(this)).i, ((moom.tx)(this)).n, ((moom.tx)(this)).o, ((moom.tx)(this)).p, new net.minecraft.item.ItemStack(net.minecraft.init.Items.bw)))));
    if (!((life3_19 == 0))) {
        break lexical_join_465;
    }
    }
    lexicalValue1327_453_0 = this;
    }
    ((net.minecraft.world.World)(((moom.tx)(lexicalValue1327_453_0)).i)).b(((int)(__sourceIntrinsic_736a66cda11e_invokedynamic1327_147(24257, (9141382677584044434L ^ life1_3)))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9237_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dbecb07edf7c_originalDynamicSite1667_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1327_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic1327_147(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
