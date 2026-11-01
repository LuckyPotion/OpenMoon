package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class un extends moom.um {

private int i;

private int j;

private static final long k;

private static final long[] m;

private static final java.lang.Integer[] n;

private static final java.util.Map o;

public un(net.minecraft.entity.EntityLiving p0) {
super(p0);
    this.j = -1;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-6472699403792700357L)), ((long)(-1672932206185304652L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(238450965766688L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.un.k ^ 7639125544929L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1602_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1602_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1602_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1602_14 = new byte[8];
    (__sourceSpill1602_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1602_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1602_16 = __sourceSpill1602_14;
    ((javax.crypto.Cipher)(__sourceSpill1602_11)).init(((int)(__sourceSpill1602_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1602_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1602_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Àå,ü\006¬ç2úYÿ3ôÁ\035¼$\025;ÎÊb@=Fæ&6h"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1602_25 = local6_life21;
        int __sourceSpill1602_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1602_25)).substring(((int)(__sourceSpill1602_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1602_30 = local8_life19;
        int __sourceSpill1602_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1602_33 = new byte[8];
        (__sourceSpill1602_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1602_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1602_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1602_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1602_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1602_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1602_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1602_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1602_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1602_34)).doFinal(((byte[])(__sourceSpill1602_33)));
        (__sourceSpill1602_30)[__sourceSpill1602_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ">'ÍbQ¦:'é¥{ñQ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1602_38 = local6_life21;
        int __sourceSpill1602_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1602_38)).substring(((int)(__sourceSpill1602_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1602_43 = local8_life19;
        int __sourceSpill1602_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1602_46 = new byte[8];
        (__sourceSpill1602_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1602_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1602_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1602_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1602_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1602_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1602_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1602_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1602_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1602_47)).doFinal(((byte[])(__sourceSpill1602_46)));
        (__sourceSpill1602_43)[__sourceSpill1602_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public boolean b__Boolean() {
int forwardValue4218_45_0;
    boolean spill4218_0;
    int spill4218_1;
    boolean spill4218_2;
    int spill4218_3;
    long life1_3;
    double life4_10;
    int life3_11;
    net.minecraft.block.BlockDoor life7_27;
    int life6_53;
    int life6_57;
    forward_join_45: {
    forward_join_44: {
    life1_3 = (moom.un.k ^ 9894804771488L);
    spill4218_0 = moom.uc.e();
    life4_10 = ((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).a(((moom.DT)(((moom.un)(this)).d)));
    life3_11 = ((spill4218_0) ? 1 : 0);
    spill4218_1 = this.i;
    if (!((life3_11 == 0))) {
        forwardValue4218_45_0 = spill4218_1;
        break forward_join_45;
    }
    if (!((spill4218_1 <= __sourceIntrinsic_74e88f4b4822_invokedynamic4218_7(8746, (8814692562654028133L ^ life1_3))))) {
        break forward_join_44;
    }
    life7_27 = ((moom.un)(this)).e;
    spill4218_2 = __sourceExactCall_f6b3daee52de1b(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)), ((moom.DT)(((moom.un)(this)).d)));
    if (!((life3_11 == 0))) {
        forwardValue4218_45_0 = ((spill4218_2) ? 1 : 0);
        break forward_join_45;
    }
    if (!((!spill4218_2))) {
        break forward_join_44;
    }
    spill4218_3 = recovery.source.CarrierOps.dcmpg(((double)(life4_10)), ((double)(0x1.0p2d)));
    if (!((life3_11 == 0))) {
        forwardValue4218_45_0 = spill4218_3;
        break forward_join_45;
    }
    if (!((spill4218_3 < 0))) {
        break forward_join_44;
    }
    life6_53 = 1;
    return ((life6_53) != 0);
    }
    forwardValue4218_45_0 = 0;
    }
    life6_57 = forwardValue4218_45_0;
    return ((life6_57) != 0);
}


public void b__Void() {
super.b__Void();
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)).c(((int)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).e__Int())), ((moom.DT)(((moom.un)(this)).d)), ((int)(-1)));
    return;
}


public void c() {
int forwardValue4219_46_0;
    int forwardValue4219_75_0;
    int forwardValue4219_75_1;
    moom.un forwardValue4219_77_0;
    net.minecraft.world.World forwardValue4219_106_0;
    boolean spill4219_0;
    int spill4219_1;
    int spill4219_2;
    int spill4219_3;
    moom.un spill4219_4;
    net.minecraft.world.World spill4219_5;
    long life1_3;
    int life3_7;
    int life4_52;
    forward_join_117: {
    forward_join_106: {
    forward_join_77: {
    forward_join_75: {
    forward_join_66: {
    forward_join_46: {
    forward_join_32: {
    life1_3 = (moom.un.k ^ 103234610212867L);
    spill4219_0 = moom.uc.d();
    super.c();
    life3_7 = ((spill4219_0) ? 1 : 0);
    spill4219_1 = ((java.util.Random)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).a__Random())).nextInt(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_6(29200, (536562776686023679L ^ life1_3)))));
    if (!((life3_7 != 0))) {
        forwardValue4219_46_0 = spill4219_1;
        break forward_join_46;
    }
    if (!((spill4219_1 == 0))) {
        break forward_join_32;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)).b(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_10(21541, (2351269873000084936L ^ life1_3)))), ((moom.DT)(((moom.un)(this)).d)), ((int)(0)));
    }
    moom.un __stackOp4219_13_0 = this;
    ((moom.un)(__stackOp4219_13_0)).i = ((int)((((moom.un)(__stackOp4219_13_0)).i + 1)));
    forwardValue4219_46_0 = ((int) ((((float) this.i) / 0x1.ep7f) * 0x1.4p3f));
    }
    life4_52 = forwardValue4219_46_0;
    spill4219_2 = life4_52;
    spill4219_3 = this.j;
    if (!((life3_7 != 0))) {
        forwardValue4219_75_0 = spill4219_2;
        forwardValue4219_75_1 = spill4219_3;
        break forward_join_75;
    }
    if (!((spill4219_2 != spill4219_3))) {
        break forward_join_66;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)).c(((int)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).e__Int())), ((moom.DT)(((moom.un)(this)).d)), ((int)(life4_52)));
    this.j = ((int)(life4_52));
    }
    spill4219_4 = this;
    if (!((life3_7 != 0))) {
        forwardValue4219_77_0 = spill4219_4;
        break forward_join_77;
    }
    forwardValue4219_75_0 = ((moom.un)(spill4219_4)).i;
    forwardValue4219_75_1 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_26(12780, (1230070067527028740L ^ life1_3));
    }
    if (!((forwardValue4219_75_0 == forwardValue4219_75_1))) {
        break forward_join_117;
    }
    forwardValue4219_77_0 = this;
    }
    spill4219_5 = ((net.minecraft.entity.EntityLiving)(((moom.un)(forwardValue4219_77_0)).c)).i;
    if (!((life3_7 != 0))) {
        forwardValue4219_106_0 = spill4219_5;
        break forward_join_106;
    }
    if (!((((net.minecraft.world.World)(spill4219_5)).a__bB() == net.minecraft.world.EnumDifficulty.HARD))) {
        break forward_join_117;
    }
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)).d__Boolean(((moom.DT)(((moom.un)(this)).d)));
    ((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)).b(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_37(20077, (992458492251598723L ^ life1_3)))), ((moom.DT)(((moom.un)(this)).d)), ((int)(0)));
    forwardValue4219_106_0 = ((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i;
    }
    ((net.minecraft.world.World)(forwardValue4219_106_0)).b(((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_42(6376, (1121885869642168577L ^ life1_3)))), ((moom.DT)(((moom.un)(this)).d)), ((int)(__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(((moom.un)(this)).e))))));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9372_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/un"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.un.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21288;
      if (n[var3] == null) {
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
         long var5 = m[var3];
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
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/un", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean() {
int forwardValue4217_21_0;
    moom.un forwardValue4217_25_0;
    int forwardValue4217_37_0;
    int forwardValue4217_39_0;
    boolean spill4217_0;
    moom.un spill4217_1;
    boolean spill4217_2;
    long life1_3;
    int life3_5;
    net.minecraft.block.BlockDoor life4_36;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (moom.un.k ^ 105882221034033L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4217_0 = super.a__Boolean();
    if (!((life3_5 == 0))) {
        forwardValue4217_21_0 = ((spill4217_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill4217_0))) {
        break forward_join_13;
    }
    return ((0) != 0);
    }
    spill4217_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4217_25_0 = spill4217_1;
        break forward_join_25;
    }
    forwardValue4217_21_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLiving)(((moom.un)(spill4217_1)).c)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))) ? 1 : 0);
    }
    if (!((forwardValue4217_21_0 == 0))) {
        break forward_join_24;
    }
    return ((0) != 0);
    }
    forwardValue4217_25_0 = this;
    }
    life4_36 = ((moom.un)(forwardValue4217_25_0)).e;
    spill4217_2 = __sourceExactCall_f6b3daee52de1b(((net.minecraft.world.IBlockAccess)(((net.minecraft.entity.EntityLiving)(((moom.un)(this)).c)).i)), ((moom.DT)(((moom.un)(this)).d)));
    if (!((life3_5 == 0))) {
        forwardValue4217_37_0 = ((spill4217_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!((!spill4217_2))) {
        break forward_join_38;
    }
    forwardValue4217_37_0 = 1;
    }
    forwardValue4217_39_0 = forwardValue4217_37_0;
    break forward_join_39;
    }
    forwardValue4217_39_0 = 0;
    }
    return ((forwardValue4217_39_0) != 0);
}


public void a__Void() {
super.a__Void();
    this.i = ((int)(0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic4218_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic4219_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9372_0() throws E;

private static native boolean __sourceExactCall_f6b3daee52de1b(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
}
