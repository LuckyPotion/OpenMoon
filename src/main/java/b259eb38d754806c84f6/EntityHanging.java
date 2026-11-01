package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class EntityHanging extends net.minecraft.entity.Entity {

private int aE;

protected moom.DT aF;

public moom.bs aG;

private static final long bb;

private static final long[] db;

private static final java.lang.Integer[] eb;

private static final java.util.Map gb;

public EntityHanging(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.0000000000000p-1f, 0x1.0000000000000p-1f);
}


public EntityHanging(net.minecraft.world.World p0, moom.DT p1) {
this(p0);
    this.aF = p1;
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(-4001694289018285786L)), ((long)(-2097448674850093796L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175819585200984L)))));
    gb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.entity.EntityHanging.bb ^ 81863767554068L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1848_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1848_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1848_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1848_14 = new byte[8];
    (__sourceSpill1848_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1848_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1848_16 = __sourceSpill1848_14;
    ((javax.crypto.Cipher)(__sourceSpill1848_11)).init(((int)(__sourceSpill1848_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1848_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1848_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "%ºò¾7Ò*¡óGB¨@5\031\fçk¡\035@ô#,{®~¢É¶\032wocÎÅq"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1848_25 = local6_life21;
        int __sourceSpill1848_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1848_25)).substring(((int)(__sourceSpill1848_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1848_30 = local8_life19;
        int __sourceSpill1848_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1848_33 = new byte[8];
        (__sourceSpill1848_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1848_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1848_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1848_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1848_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1848_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1848_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1848_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1848_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1848_34)).doFinal(((byte[])(__sourceSpill1848_33)));
        (__sourceSpill1848_30)[__sourceSpill1848_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÿÅ\037IÆÍÊµÄfx)üÆÏ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1848_38 = local6_life21;
        int __sourceSpill1848_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1848_38)).substring(((int)(__sourceSpill1848_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1848_43 = local8_life19;
        int __sourceSpill1848_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1848_46 = new byte[8];
        (__sourceSpill1848_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1848_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1848_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1848_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1848_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1848_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1848_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1848_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1848_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1848_47)).doFinal(((byte[])(__sourceSpill1848_46)));
        (__sourceSpill1848_43)[__sourceSpill1848_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    db = ((long[])(local8_life19));
    eb = ((java.lang.Integer[])(new java.lang.Integer[7]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11141_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public abstract int b__sourceReturn_8abf5c6871();

public void b__Void(double p0, double p1, double p2) {
int forwardValue4895_14_0;
    int forwardValue4895_30_0;
    boolean spill4895_0;
    long life7_3;
    int life9_5;
    forward_join_36: {
    forward_join_30: {
    forward_join_14: {
    life7_3 = (net.minecraft.entity.EntityHanging.bb ^ 4250443985191L);
    life9_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4895_0 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).G;
    if (!((life9_5 == 0))) {
        forwardValue4895_14_0 = ((spill4895_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4895_0))) {
        break forward_join_36;
    }
    forwardValue4895_14_0 = ((((net.minecraft.entity.EntityHanging)(this)).F) ? 1 : 0);
    }
    if (!((life9_5 == 0))) {
        forwardValue4895_30_0 = forwardValue4895_14_0;
        break forward_join_30;
    }
    if (!((forwardValue4895_14_0 == 0))) {
        break forward_join_36;
    }
    forwardValue4895_30_0 = recovery.source.CarrierOps.dcmpl(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2)))), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue4895_30_0 > 0))) {
        break forward_join_36;
    }
    ((net.minecraft.entity.EntityHanging)(this)).f__Void();
    ((net.minecraft.entity.EntityHanging)(this)).f(((net.minecraft.entity.Entity)(null)));
    }
    return;
}


public moom.bs b__bs() {
return this.aG;
}


public moom.DT b__DT() {
return this.aF;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28912;
      if (eb[var3] == null) {
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
         long var5 = db[var3];
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
         Object[] var9 = (Object[])gb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               gb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/sC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         eb[var3] = var15;
      }

      return eb[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_c13ed83c93a10e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean() {
int forestValue1104_28_0;
    int forestValue1104_54_0;
    int forestValue1104_96_0;
    int forestValue1104_124_0;
    int forestValue1104_126_0;
    boolean spill1104_0;
    boolean spill1104_1;
    boolean spill1104_2;
    int spill1104_3;
    long life1_3;
    int life3_5;
    int life4_29;
    int life5_40;
    moom.DT life6_47;
    moom.bs life7_51;
    int life8_53;
    int life9_58;
    moom.DT life10_68;
    net.minecraft.block.Block life11_74;
    java.util.Iterator life8_108;
    net.minecraft.entity.Entity life9_115;
    forest_join_126: {
    forest_join_125: {
    forest_join_124: {
    forest_join_123: {
    forest_join_97: {
    forest_join_96: {
    forest_join_95: {
    forest_join_28: {
    forest_join_18: {
    life1_3 = (net.minecraft.entity.EntityHanging.bb ^ 100387924055988L);
    life3_5 = __sourceExactCall_6a62635cc0564c();
    spill1104_0 = ((java.util.List)(((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).a(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.EntityHanging)(this)).b()))))).isEmpty();
    if (!((life3_5 == 0))) {
        forestValue1104_28_0 = ((spill1104_0) ? 1 : 0);
        break forest_join_28;
    }
    if (!((!spill1104_0))) {
        break forest_join_18;
    }
    return ((0) != 0);
    }
    forestValue1104_28_0 = java.lang.Math.max(((int)(1)), ((int)((((net.minecraft.entity.EntityHanging)(this)).a() / __sourceIntrinsic_74e88f4b4822_invokedynamic1104_9(7940, (7462462059312442210L ^ life1_3))))));
    }
    life4_29 = forestValue1104_28_0;
    life5_40 = java.lang.Math.max(((int)(1)), ((int)((__sourceExactCall_f125faae6847fb(((net.minecraft.entity.EntityHanging)(this))) / __sourceIntrinsic_74e88f4b4822_invokedynamic1104_12(30308, (7958836938054959620L ^ life1_3))))));
    life6_47 = __sourceExactCall_0ffdb6d06aab9b(((moom.DT)(this.aF)), ((moom.bs)(__sourceExactCall_5c1b03b58311e4(((moom.bs)(this.aG))))));
    life7_51 = ((moom.bs)(this.aG)).e__bs();
    life8_53 = 0;
    forest_cycle_53: while (true) {
    forest_join_91: {
    forestValue1104_54_0 = life8_53;
    forest_cycle_54: while (true) {
    if (!((forestValue1104_54_0 < life4_29))) {
        break forest_join_97;
    }
    life9_58 = 0;
    forest_cycle_58: while (true) {
    forest_join_89: {
    forest_join_88: {
    if (!((life9_58 < life5_40))) {
        break forest_join_91;
    }
    life10_68 = ((moom.DT)(((moom.DT)(life6_47)).a(((moom.bs)(life7_51)), ((int)(life8_53))))).a(((int)(life9_58)));
    life11_74 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).a__fE(((moom.DT)(life10_68))))).a__ch();
    if (!((life3_5 == 0))) {
        break forest_join_89;
    }
    spill1104_1 = ((moom.fn)(((net.minecraft.block.Block)(life11_74)).a__fn())).b__Boolean();
    if (!((life3_5 == 0))) {
        forestValue1104_54_0 = ((spill1104_1) ? 1 : 0);
        continue forest_cycle_54;
    }
    if (!((!spill1104_1))) {
        break forest_join_88;
    }
    spill1104_2 = __sourceExactCall_e34bf054ad06be(((net.minecraft.block.Block)(life11_74)));
    if (!((life3_5 == 0))) {
        forestValue1104_96_0 = ((spill1104_2) ? 1 : 0);
        break forest_join_96;
    }
    if (!((!spill1104_2))) {
        break forest_join_88;
    }
    break forest_join_95;
    }
    life9_58 += 1;
    }
    if (!((life3_5 != 0))) {
        continue forest_cycle_58;
    }
    break forest_cycle_58;
    }
    break forest_cycle_54;
    }
    }
    life8_53 += 1;
    if (!((life3_5 != 0))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    break forest_join_97;
    }
    forestValue1104_96_0 = 0;
    }
    return ((forestValue1104_96_0) != 0);
    }
    life8_108 = ((java.util.List)(((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).b(((net.minecraft.entity.Entity)(this)), ((moom.CA)(((net.minecraft.entity.EntityHanging)(this)).b()))))).iterator();
    forest_cycle_105: while (true) {
    forest_join_120: {
    if (!(((java.util.Iterator)(life8_108)).hasNext())) {
        break forest_join_125;
    }
    life9_115 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life8_108)).next()));
    spill1104_3 = ((life9_115 instanceof net.minecraft.entity.EntityHanging) ? 1 : 0);
    if (!((life3_5 == 0))) {
        forestValue1104_126_0 = spill1104_3;
        break forest_join_126;
    }
    if (!((life3_5 == 0))) {
        forestValue1104_124_0 = spill1104_3;
        break forest_join_124;
    }
    if (!((spill1104_3 != 0))) {
        break forest_join_120;
    }
    break forest_join_123;
    }
    if (!((life3_5 != 0))) {
        continue forest_cycle_105;
    }
    break forest_cycle_105;
    }
    break forest_join_125;
    }
    forestValue1104_124_0 = 0;
    }
    return ((forestValue1104_124_0) != 0);
    }
    forestValue1104_126_0 = 1;
    }
    return ((forestValue1104_126_0) != 0);
}


public boolean b__Boolean(net.minecraft.entity.Entity p0) {
int forwardValue4894_17_0;
    int forwardValue4894_21_0;
    int forwardValue4894_23_0;
    int spill4894_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life2_3 = (net.minecraft.entity.EntityHanging.bb ^ 7005306613215L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4894_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4894_17_0 = spill4894_0;
        break forward_join_17;
    }
    if (!((spill4894_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4894_17_0 = ((((net.minecraft.entity.EntityHanging)(this)).a__Boolean(((net.minecraft.util.DamageSource)(__sourceExactCall_10a743b01f087c(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0))))))), ((float)(0x0.0p0f)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue4894_21_0 = forwardValue4894_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4894_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4894_21_0 = 1;
    }
    forwardValue4894_23_0 = forwardValue4894_21_0;
    break forward_join_23;
    }
    forwardValue4894_23_0 = 0;
    }
    return ((forwardValue4894_23_0) != 0);
}


public void c(double p0, double p1, double p2) {
int forwardValue4896_14_0;
    int forwardValue4896_30_0;
    boolean spill4896_0;
    long life7_3;
    int life9_5;
    forward_join_36: {
    forward_join_30: {
    forward_join_14: {
    life7_3 = (net.minecraft.entity.EntityHanging.bb ^ 122415121873093L);
    life9_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4896_0 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).G;
    if (!((life9_5 != 0))) {
        forwardValue4896_14_0 = ((spill4896_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill4896_0))) {
        break forward_join_36;
    }
    forwardValue4896_14_0 = ((((net.minecraft.entity.EntityHanging)(this)).F) ? 1 : 0);
    }
    if (!((life9_5 != 0))) {
        forwardValue4896_30_0 = forwardValue4896_14_0;
        break forward_join_30;
    }
    if (!((forwardValue4896_14_0 == 0))) {
        break forward_join_36;
    }
    forwardValue4896_30_0 = recovery.source.CarrierOps.dcmpl(((double)((((p0 * p0) + (p1 * p1)) + (p2 * p2)))), ((double)(0x0.0p0d)));
    }
    if (!((forwardValue4896_30_0 > 0))) {
        break forward_join_36;
    }
    ((net.minecraft.entity.EntityHanging)(this)).f__Void();
    ((net.minecraft.entity.EntityHanging)(this)).f(((net.minecraft.entity.Entity)(null)));
    }
    return;
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
int forwardValue4897_52_0;
    int forwardValue4897_65_0;
    int spill4897_0;
    boolean spill4897_1;
    long life2_3;
    int life4_19;
    moom.bs life5_38;
    forward_join_67: {
    forward_join_65: {
    forward_join_62: {
    forward_join_52: {
    forward_join_44: {
    life2_3 = (net.minecraft.entity.EntityHanging.bb ^ 37845930765757L);
    spill4897_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    this.aF = ((moom.DT)(new moom.DT(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TileX"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TileY"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("TileZ"))))));
    life4_19 = spill4897_0;
    spill4897_1 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Direction")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic4897_6(10462, (6924690501992457909L ^ life2_3)))));
    if (!((life4_19 != 0))) {
        forwardValue4897_52_0 = ((spill4897_1) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill4897_1)) {
        break forward_join_44;
    }
    life5_38 = moom.bs.b(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Direction"))))));
    this.aF = ((moom.DT)(((moom.DT)(this.aF)).a(((moom.bs)(life5_38)))));
    if (!((life4_19 == 0))) {
        break forward_join_67;
    }
    }
    forwardValue4897_52_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("Facing")), ((int)(__sourceIntrinsic_01f4e1cd062e_invokedynamic4897_14(16889, (4830324182277705617L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_19 != 0))) {
        forwardValue4897_65_0 = forwardValue4897_52_0;
        break forward_join_65;
    }
    if (!((forwardValue4897_52_0 != 0))) {
        break forward_join_62;
    }
    life5_38 = moom.bs.b(((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Facing"))))));
    if (!((life4_19 == 0))) {
        break forward_join_67;
    }
    }
    forwardValue4897_65_0 = ((int)(((net.minecraft.nbt.NBTTagCompound)(p0)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Dir")))));
    }
    life5_38 = moom.bs.b(((int)(forwardValue4897_65_0)));
    }
    ((net.minecraft.entity.EntityHanging)(this)).a(((moom.bs)(life5_38)));
    return;
}


public abstract void f(net.minecraft.entity.Entity p0);

protected void d__Void() {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Facing")), ((byte)(((byte) ((moom.bs)(this.aG)).b()))));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("TileX")), ((int)(((moom.DT)(((net.minecraft.entity.EntityHanging)(this)).b__DT())).a())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("TileY")), ((int)(((moom.DT)(((net.minecraft.entity.EntityHanging)(this)).b__DT())).b())));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Void(((java.lang.String)("TileZ")), ((int)(((moom.DT)(((net.minecraft.entity.EntityHanging)(this)).b__DT())).c())));
    return;
}


private double a__sourceReturn_acc714779d(int p0) {
long local2 = (net.minecraft.entity.EntityHanging.bb ^ 54431746683390L);
    return (((p0 % __sourceIntrinsic_974cd9081f16_invokedynamic11147_1(32166, (6915782746970255243L ^ local2))) == 0) ? 0x1.0p-1d : 0x0.0p0d);
}


public void a__Void(double p0, double p1, double p2) {
net.minecraft.entity.EntityHanging forwardValue4892_36_0;
    int spill4892_0;
    net.minecraft.entity.EntityHanging spill4892_1;
    long life7_3;
    moom.DT life10_16;
    int life9_17;
    forward_join_38: {
    forward_join_36: {
    life7_3 = (net.minecraft.entity.EntityHanging.bb ^ 93360305310565L);
    ((net.minecraft.entity.EntityHanging)(this)).n = ((double)(p0));
    ((net.minecraft.entity.EntityHanging)(this)).o = ((double)(p1));
    ((net.minecraft.entity.EntityHanging)(this)).p = ((double)(p2));
    spill4892_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life10_16 = this.aF;
    life9_17 = spill4892_0;
    this.aF = ((moom.DT)(new moom.DT(p0, p1, p2)));
    spill4892_1 = this;
    if (!((life9_17 == 0))) {
        forwardValue4892_36_0 = spill4892_1;
        break forward_join_36;
    }
    if (!((!((moom.DT)(((net.minecraft.entity.EntityHanging)(spill4892_1)).aF)).equals(((java.lang.Object)(life10_16)))))) {
        break forward_join_38;
    }
    ((net.minecraft.entity.EntityHanging)(this)).a__Void();
    forwardValue4892_36_0 = this;
    }
    ((net.minecraft.entity.EntityHanging)(forwardValue4892_36_0)).ad = ((boolean)(true));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.bs p0) {
long local2_life2 = (net.minecraft.entity.EntityHanging.bb ^ 123071585166260L);
    org.apache.commons.lang3.Validate.notNull(((java.lang.Object)(p0)));
    org.apache.commons.lang3.Validate.isTrue(((boolean)(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p0)).a__bt())).b__Boolean())));
    this.aG = ((moom.bs)(p0));
    net.minecraft.entity.EntityHanging __sourceSpill833_12 = this;
    net.minecraft.entity.EntityHanging __stackOp833_13_0 = this;
    float __stackOp833_13_1 = ((float) (((moom.bs)(this.aG)).b() * __sourceIntrinsic_7750e4cae25c_originalDynamicSite833_11(7113, (7331789170011495341L ^ local2_life2))));
    float __sourceSpill833_15 = __stackOp833_13_1;
    ((net.minecraft.entity.EntityHanging)(__stackOp833_13_0)).w = ((float)(__stackOp833_13_1));
    ((net.minecraft.entity.EntityHanging)(__sourceSpill833_12)).y = ((float)(__sourceSpill833_15));
    ((net.minecraft.entity.EntityHanging)(this)).a__Void();
    return;
}


private void a__Void() {
net.minecraft.entity.EntityHanging forwardValue4891_12_0;
    net.minecraft.entity.EntityHanging spill4891_0;
    long life1_3;
    int life3_5;
    double life4_23;
    double life6_30;
    double life8_37;
    double life10_39;
    double life12_44;
    double life14_49;
    double life4_58;
    double life8_67;
    double life6_71;
    moom.bs life16_75;
    double life4_83;
    double life8_91;
    double life17_104;
    double life19_108;
    double life21_112;
    double life17_132;
    double life19_136;
    double life21_140;
    forward_join_155: {
    forward_join_120: {
    forward_join_118: {
    forward_join_116: {
    forward_join_12: {
    life1_3 = (net.minecraft.entity.EntityHanging.bb ^ 129811876975906L);
    life3_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4891_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue4891_12_0 = spill4891_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.entity.EntityHanging)(spill4891_0)).aG != null))) {
        break forward_join_155;
    }
    forwardValue4891_12_0 = this;
    }
    life4_23 = (((double) ((moom.DT)(((net.minecraft.entity.EntityHanging)(forwardValue4891_12_0)).aF)).a()) + 0x1.0p-1d);
    life6_30 = (((double) ((moom.DT)(this.aF)).b()) + 0x1.0p-1d);
    life8_37 = (((double) ((moom.DT)(this.aF)).c()) + 0x1.0p-1d);
    life10_39 = 0x1.ep-2d;
    life12_44 = ((net.minecraft.entity.EntityHanging)(this)).a__sourceReturn_acc714779d(((int)(((net.minecraft.entity.EntityHanging)(this)).a())));
    life14_49 = ((net.minecraft.entity.EntityHanging)(this)).a__sourceReturn_acc714779d(((int)(((net.minecraft.entity.EntityHanging)(this)).b__sourceReturn_8abf5c6871())));
    life4_58 = (life4_23 - (((double) ((moom.bs)(this.aG)).c()) * 0x1.ep-2d));
    life8_67 = (life8_37 - (((double) ((moom.bs)(this.aG)).e()) * 0x1.ep-2d));
    life6_71 = (life6_30 + life14_49);
    life16_75 = ((moom.bs)(this.aG)).e__bs();
    life4_83 = (life4_58 + (life12_44 * ((double) ((moom.bs)(life16_75)).c())));
    life8_91 = (life8_67 + (life12_44 * ((double) ((moom.bs)(life16_75)).e())));
    ((net.minecraft.entity.EntityHanging)(this)).n = ((double)(life4_83));
    ((net.minecraft.entity.EntityHanging)(this)).o = ((double)(life6_71));
    ((net.minecraft.entity.EntityHanging)(this)).p = ((double)(life8_91));
    life17_104 = ((double) ((net.minecraft.entity.EntityHanging)(this)).a());
    life19_108 = ((double) ((net.minecraft.entity.EntityHanging)(this)).b__sourceReturn_8abf5c6871());
    life21_112 = ((double) ((net.minecraft.entity.EntityHanging)(this)).a());
    if (!((life3_5 == 0))) {
        break forward_join_116;
    }
    if (!((((moom.bs)(this.aG)).a__bt() == net.minecraft.util.EnumFacing$Axis.Z))) {
        break forward_join_118;
    }
    life21_112 = 0x1.0p0d;
    }
    if (!((life3_5 != 0))) {
        break forward_join_120;
    }
    }
    life17_104 = 0x1.0p0d;
    }
    life17_132 = (life17_104 / 0x1.0p5d);
    life19_136 = (life19_108 / 0x1.0p5d);
    life21_140 = (life21_112 / 0x1.0p5d);
    ((net.minecraft.entity.EntityHanging)(this)).a(((moom.CA)(new moom.CA((life4_83 - life17_132), (life6_71 - life19_136), (life8_91 - life21_140), (life4_83 + life17_132), (life6_71 + life19_136), (life8_91 + life21_140)))));
    }
    return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
int forwardValue4890_16_0;
    int forwardValue4890_34_0;
    boolean spill4890_0;
    boolean spill4890_1;
    long life3_3;
    int life5_5;
    forward_join_34: {
    forward_join_33: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (net.minecraft.entity.EntityHanging.bb ^ 76569843395903L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4890_0 = ((net.minecraft.entity.EntityHanging)(this)).a(((net.minecraft.util.DamageSource)(p0)));
    if (!((life5_5 != 0))) {
        forwardValue4890_16_0 = ((spill4890_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill4890_0)) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue4890_16_0 = ((((net.minecraft.entity.EntityHanging)(this)).F) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        forwardValue4890_34_0 = forwardValue4890_16_0;
        break forward_join_34;
    }
    if (!((forwardValue4890_16_0 == 0))) {
        break forward_join_33;
    }
    spill4890_1 = ((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).G;
    if (!((life5_5 != 0))) {
        forwardValue4890_34_0 = ((spill4890_1) ? 1 : 0);
        break forward_join_34;
    }
    if (!((!spill4890_1))) {
        break forward_join_33;
    }
    ((net.minecraft.entity.EntityHanging)(this)).f__Void();
    ((net.minecraft.entity.EntityHanging)(this)).q();
    ((net.minecraft.entity.EntityHanging)(this)).f(((net.minecraft.entity.Entity)(((net.minecraft.util.DamageSource)(p0)).b__r3())));
    }
    forwardValue4890_34_0 = 1;
    }
    return ((forwardValue4890_34_0) != 0);
}


public abstract int a();

public boolean m__Boolean() {
return ((1) != 0);
}


protected boolean o__Boolean() {
return ((0) != 0);
}


public void g__Void() {
int forwardValue4898_36_0;
    int forwardValue4898_44_0;
    int forwardValue4898_51_0;
    net.minecraft.entity.EntityHanging forwardValue4898_55_0;
    int spill4898_0;
    int spill4898_1;
    net.minecraft.entity.EntityHanging spill4898_2;
    long life1_3;
    int life3_9;
    forward_join_57: {
    forward_join_55: {
    forward_join_51: {
    forward_join_44: {
    forward_join_36: {
    life1_3 = (net.minecraft.entity.EntityHanging.bb ^ 24846126088905L);
    spill4898_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    ((net.minecraft.entity.EntityHanging)(this)).k = ((double)(((net.minecraft.entity.EntityHanging)(this)).n));
    life3_9 = spill4898_0;
    ((net.minecraft.entity.EntityHanging)(this)).l = ((double)(((net.minecraft.entity.EntityHanging)(this)).o));
    ((net.minecraft.entity.EntityHanging)(this)).m = ((double)(((net.minecraft.entity.EntityHanging)(this)).p));
    net.minecraft.entity.EntityHanging __stackOp4898_8_0 = this;
    net.minecraft.entity.EntityHanging __stackOp4898_10_0 = __stackOp4898_8_0;
    int __stackOp4898_10_1 = ((net.minecraft.entity.EntityHanging)(__stackOp4898_8_0)).aE;
    spill4898_1 = __stackOp4898_10_1;
    ((net.minecraft.entity.EntityHanging)(__stackOp4898_10_0)).aE = ((int)((__stackOp4898_10_1 + 1)));
    if (!((life3_9 == 0))) {
        forwardValue4898_36_0 = spill4898_1;
        break forward_join_36;
    }
    if (!((spill4898_1 == __sourceIntrinsic_736a66cda11e_invokedynamic4898_12(13095, (2722682131948655167L ^ life1_3))))) {
        break forward_join_57;
    }
    forwardValue4898_36_0 = ((((net.minecraft.world.World)(((net.minecraft.entity.EntityHanging)(this)).i)).G) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4898_44_0 = forwardValue4898_36_0;
        break forward_join_44;
    }
    if (!((forwardValue4898_36_0 == 0))) {
        break forward_join_57;
    }
    this.aE = ((int)(0));
    forwardValue4898_44_0 = ((((net.minecraft.entity.EntityHanging)(this)).F) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue4898_51_0 = forwardValue4898_44_0;
        break forward_join_51;
    }
    if (!((forwardValue4898_44_0 == 0))) {
        break forward_join_57;
    }
    spill4898_2 = this;
    if (!((life3_9 == 0))) {
        forwardValue4898_55_0 = spill4898_2;
        break forward_join_55;
    }
    forwardValue4898_51_0 = ((((net.minecraft.entity.EntityHanging)(spill4898_2)).b__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue4898_51_0 == 0))) {
        break forward_join_57;
    }
    ((net.minecraft.entity.EntityHanging)(this)).f__Void();
    forwardValue4898_55_0 = this;
    }
    ((net.minecraft.entity.EntityHanging)(forwardValue4898_55_0)).f(((net.minecraft.entity.Entity)(null)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_974cd9081f16_invokedynamic11147_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7750e4cae25c_originalDynamicSite833_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11141_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic1104_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e88f4b4822_invokedynamic1104_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic4897_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_01f4e1cd062e_invokedynamic4897_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_736a66cda11e_invokedynamic4898_12(int a0, long a1) throws E;

private static native int __sourceExactCall_c13ed83c93a10e(int p0, long p1);
private static native boolean __sourceExactCall_e34bf054ad06be(net.minecraft.block.Block p0);
private static native net.minecraft.util.DamageSource __sourceExactCall_10a743b01f087c(net.minecraft.entity.player.EntityPlayer p0);

private static native int __sourceExactCall_6a62635cc0564c();

private static native moom.DT __sourceExactCall_0ffdb6d06aab9b(moom.DT p0, moom.bs p1);
private static native moom.bs __sourceExactCall_5c1b03b58311e4(moom.bs p0);

private static native int __sourceExactCall_f125faae6847fb(net.minecraft.entity.EntityHanging p0);
}
