package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class h8 extends moom.h5 {

private final java.util.List<moom.hR> y;

private final moom.Dd<net.minecraft.client.gui.Gui> z;

private final java.util.List<moom.hJ> A;

private final moom.hS[][] B;

private int C;

private final moom.hX D;

private net.minecraft.client.gui.Gui E;

private static final long F;

private static final long[] H;

private static final java.lang.Integer[] L;

private static final java.util.Map M;

public h8(net.minecraft.client.Minecraft p0, int p1, int p2, int p3, int p4, int p5, moom.hX p6, moom.hS[][] p7) {
super(p0, p1, p2, p3, p4, p5);
    this.y = com.google.common.collect.Lists.newArrayList();
    this.z = new moom.Dd();
    this.A = com.google.common.collect.Lists.newArrayList();
    this.D = p6;
    this.B = p7;
    this.m = false;
    (this).d();
    (this).e__Void();
}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(6751912997980796789L)), ((long)(8776927243868847332L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112907783514893L)))));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.h8.F ^ 66842049986978L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1245_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1245_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1245_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1245_14 = new byte[8];
    (__sourceSpill1245_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1245_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1245_16 = __sourceSpill1245_14;
    ((javax.crypto.Cipher)(__sourceSpill1245_11)).init(((int)(__sourceSpill1245_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1245_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1245_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\020¨H\001 ®Çí\023Ê\000`ÄBv\013OËCú*\017mZ\032çßÒÜî}9.lÆ1O÷YeÆåIç°\f\026ÎY/~r=\të\t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1245_25 = local6_life21;
        int __sourceSpill1245_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1245_25)).substring(((int)(__sourceSpill1245_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1245_30 = local8_life19;
        int __sourceSpill1245_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1245_33 = new byte[8];
        (__sourceSpill1245_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1245_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1245_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1245_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1245_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1245_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1245_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1245_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1245_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1245_34)).doFinal(((byte[])(__sourceSpill1245_33)));
        (__sourceSpill1245_30)[__sourceSpill1245_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ªi_\boýÆ§\037n&¹³[ñ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1245_38 = local6_life21;
        int __sourceSpill1245_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1245_38)).substring(((int)(__sourceSpill1245_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1245_43 = local8_life19;
        int __sourceSpill1245_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1245_46 = new byte[8];
        (__sourceSpill1245_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1245_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1245_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1245_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1245_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1245_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1245_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1245_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1245_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1245_47)).doFinal(((byte[])(__sourceSpill1245_46)));
        (__sourceSpill1245_43)[__sourceSpill1245_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    H = ((long[])(local8_life19));
    L = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


public int i() {
return (this.B).length;
}


private void e__Void() {
((java.util.List)(this.y)).clear();
    int local1 = 0;
    while ((local1 < ((this.B)[this.C]).length)) {
        moom.hS local2 = ((this.B)[this.C])[local1];
        moom.hS local3 = ((local1 < (((this.B)[this.C]).length - 1)) ? ((this.B)[this.C])[(local1 + 1)] : null);
        net.minecraft.client.gui.Gui local4 = ((net.minecraft.client.gui.Gui)(((moom.Dd)(this.z)).a__Object(((int)(((moom.hS)(local2)).a())))));
        net.minecraft.client.gui.Gui local5 = ((local3 != null) ? ((net.minecraft.client.gui.Gui)(((moom.Dd)(this.z)).a__Object(((int)(((moom.hS)(local3)).a()))))) : null);
        moom.hR local6 = new moom.hR(local4, local5);
        ((java.util.List)(this.y)).add(((java.lang.Object)(local6)));
        local1 += 2;
    }
    return;
}


public int e() {
long local1 = (moom.h8.F ^ 89232068900473L);
    return __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1476_1(32261, (2523106686651437722L ^ local1));
}


public void c(boolean p0) {
java.util.Iterator local2 = ((java.util.List)(this.y)).iterator();
    while (((java.util.Iterator)(local2)).hasNext()) {
        moom.hR local3 = ((moom.hR)(((java.util.Iterator)(local2)).next()));
        if ((((((moom.hR)(local3)).b instanceof moom.gc) ? 1 : 0) != 0)) {
        ((moom.gc)(((moom.gc)(((moom.hR)(local3)).b)))).m = ((boolean)(p0));
    }
        if ((((((moom.hR)(local3)).c instanceof moom.gc) ? 1 : 0) != 0)) {
        ((moom.gc)(((moom.gc)(((moom.hR)(local3)).c)))).m = ((boolean)(p0));
    }
    }
    return;
}


private static moom.Oo c(moom.Oo p0) {
return p0;
}


public void c(int p0) {
int life2_6;
    if ((p0 != this.C)) {
        life2_6 = this.C;
        this.C = ((int)(p0));
        ((moom.h8)(this)).e__Void();
        ((moom.h8)(this)).d(((int)(life2_6)), ((int)(p0)));
        ((moom.h8)(this)).p = ((float)(0x0.0p0f));
    }
    return;
}


public int h() {
return this.C;
}


public void f__Void() {
if ((this.C > 0)) {
        ((moom.h8)(this)).c(((int)((this.C - 1))));
    }
    return;
}


protected int f() {
long local1 = (moom.h8.F ^ 28746500189137L);
    return (super.f() + __sourceIntrinsic_d5f736cb4191_originalDynamicSite1477_2(11319, (518582476789325057L ^ local1)));
}


private void d__sourceReturn_da8c82d5d4() {
long local1 = (moom.h8.F ^ 64583459195305L);
    moom.hS[][] local3 = this.B;
    int local4 = (local3).length;
    int local5 = 0;
    while ((local5 < local4)) {
        moom.hS[] local6 = (local3)[local5];
        int local7 = 0;
        while ((local7 < (local6).length)) {
        moom.hS local8 = (local6)[local7];
        moom.hS local9 = ((local7 < ((local6).length - 1)) ? (local6)[(local7 + 1)] : null);
        net.minecraft.client.gui.Gui local10 = ((moom.h8)(this)).a(((moom.hS)(local8)), ((int)(0)), ((boolean)__sourceIntrinsic_integerToBoolean((((local9 == null) ? 1 : 0)))));
        net.minecraft.client.gui.Gui local11 = ((moom.h8)(this)).a(((moom.hS)(local9)), ((int)(__sourceIntrinsic_6cce62949456_invokedynamic6617_3(12247, (2868345400866765970L ^ local1)))), ((boolean)__sourceIntrinsic_integerToBoolean((((local8 == null) ? 1 : 0)))));
        moom.hR local12 = new moom.hR(local10, local11);
        ((java.util.List)(this.y)).add(((java.lang.Object)(local12)));
        if ((local8 != null)) {
        if ((local10 != null)) {
        ((moom.Dd)(this.z)).a(((int)(((moom.hS)(local8)).a())), ((java.lang.Object)(local10)));
        if ((((local10 instanceof moom.hJ) ? 1 : 0) != 0)) {
        ((java.util.List)(this.A)).add(((java.lang.Object)(((moom.hJ)(local10)))));
    }
    }
    }
        if ((local9 != null)) {
        if ((local11 != null)) {
        ((moom.Dd)(this.z)).a(((int)(((moom.hS)(local9)).a())), ((java.lang.Object)(local11)));
        if ((((local11 instanceof moom.hJ) ? 1 : 0) != 0)) {
        ((java.util.List)(this.A)).add(((java.lang.Object)(((moom.hJ)(local11)))));
    }
    }
    }
        local7 += 2;
    }
        local5 += 1;
    }
    return;
}


private void d(int p0, int p1) {
moom.hS[] local3 = (this.B)[p0];
    int local4 = (local3).length;
    int local5 = 0;
    while ((local5 < local4)) {
        moom.hS local6 = (local3)[local5];
        if ((local6 != null)) {
        ((moom.h8)(this)).a(((net.minecraft.client.gui.Gui)(((net.minecraft.client.gui.Gui)(((moom.Dd)(this.z)).a__Object(((int)(((moom.hS)(local6)).a()))))))), ((boolean)(false)));
    }
        local5 += 1;
    }
    local3 = (this.B)[p1];
    local4 = (local3).length;
    local5 = 0;
    while ((local5 < local4)) {
        moom.hS local6 = (local3)[local5];
        if ((local6 != null)) {
        ((moom.h8)(this)).a(((net.minecraft.client.gui.Gui)(((net.minecraft.client.gui.Gui)(((moom.Dd)(this.z)).a__Object(((int)(((moom.hS)(local6)).a()))))))), ((boolean)(true)));
    }
        local5 += 1;
    }
    return;
}


public moom.hR a__hR(int p0) {
return ((moom.hR)(((java.util.List)(this.y)).get(((int)(p0)))));
}


public int a() {
return ((java.util.List)(this.y)).size();
}


public void a(char p0, int p1) {
long life3_3;
    net.minecraft.client.gui.Gui life6_6;
    moom.hJ life5_12;
    int life6_32;
    moom.hJ life5_68;
    int life7_77;
    int life8_80;
    java.lang.String life6_113;
    java.lang.String[] life7_117;
    int life8_123;
    int life9_125;
    java.lang.String[] life10_127;
    int life11_130;
    int life12_132;
    java.lang.String life13_139;
    forest_join_161: {
    forest_join_109: {
    forest_join_103: {
    forest_join_102: {
    forest_join_94: {
    forest_join_56: {
    forest_join_55: {
    forest_join_45: {
    forest_join_43: {
    life3_3 = (moom.h8.F ^ 32117741293644L);
    life6_6 = this.E;
    if (!((((life6_6 instanceof moom.hJ) ? 1 : 0) != 0))) {
        break forest_join_161;
    }
    life5_12 = ((moom.hJ)(life6_6));
    if (!((!net.minecraft.client.gui.GuiScreen.b__Boolean(((int)(p1)))))) {
        break forest_join_109;
    }
    if (!((p1 == __sourceIntrinsic_f7d59ba1def0_invokedynamic855_5(19474, (6833201225154119357L ^ life3_3))))) {
        break forest_join_103;
    }
    ((moom.hJ)(life5_12)).b(((boolean)(false)));
    life6_32 = ((java.util.List)(this.A)).indexOf(((java.lang.Object)(this.E)));
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) {
        break forest_join_45;
    }
    if (!((life6_32 == 0))) {
        break forest_join_43;
    }
    life6_32 = (((java.util.List)(this.A)).size() - 1);
    break forest_join_56;
    }
    life6_32 += -1;
    break forest_join_56;
    }
    if (!((life6_32 == (((java.util.List)(this.A)).size() - 1)))) {
        break forest_join_55;
    }
    life6_32 = 0;
    break forest_join_56;
    }
    life6_32 += 1;
    }
    this.E = ((net.minecraft.client.gui.Gui)(((net.minecraft.client.gui.Gui)(((java.util.List)(this.A)).get(((int)(life6_32)))))));
    life5_68 = ((moom.hJ)(this.E));
    ((moom.hJ)(life5_68)).b(((boolean)(true)));
    life7_77 = (((moom.hJ)(life5_68)).i + ((moom.h8)(this)).h);
    life8_80 = ((moom.hJ)(life5_68)).i;
    if (!((life7_77 > ((moom.h8)(this)).e))) {
        break forest_join_94;
    }
    moom.h8 __stackOp855_26_0 = this;
    ((moom.h8)(__stackOp855_26_0)).p = ((float)((((moom.h8)(__stackOp855_26_0)).p + ((float) (life7_77 - ((moom.h8)(this)).e)))));
    break forest_join_102;
    }
    if (!((life8_80 < ((moom.h8)(this)).d))) {
        break forest_join_102;
    }
    ((moom.h8)(this)).p = ((float)(((float) life8_80)));
    }
    break forest_join_161;
    }
    ((moom.hJ)(life5_12)).a(((char)(p0)), ((int)(p1)));
    break forest_join_161;
    }
    life6_113 = net.minecraft.client.gui.GuiScreen.a__StringStatic();
    life7_117 = ((java.lang.String)(life6_113)).split(((java.lang.String)(";")));
    life8_123 = ((java.util.List)(this.A)).indexOf(((java.lang.Object)(this.E)));
    life9_125 = life8_123;
    life10_127 = life7_117;
    life11_130 = (life10_127).length;
    life12_132 = 0;
    forest_cycle_130: while (true) {
    forest_join_159: {
    forest_join_155: {
    forest_join_154: {
    if (!((life12_132 < life11_130))) {
        break forest_join_161;
    }
    life13_139 = (life10_127)[life12_132];
    ((moom.hJ)(((moom.hJ)(((java.util.List)(this.A)).get(((int)(life9_125))))))).a(((java.lang.String)(life13_139)));
    if (!((life9_125 == (((java.util.List)(this.A)).size() - 1)))) {
        break forest_join_154;
    }
    life9_125 = 0;
    break forest_join_155;
    }
    life9_125 += 1;
    }
    if (!((life9_125 == life8_123))) {
        break forest_join_159;
    }
    break forest_join_161;
    }
    life12_132 += 1;
    continue forest_cycle_130;
    }
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10087;
      if (L[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])M.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               M.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/h8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         L[var3] = var15;
      }

      return L[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.h8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.hO a__hO(int p0) {
return ((moom.h8)(this)).a__hR(((int)(p0)));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7812_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/h8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(int p0, int p1, int p2) {
int life4_5;
    int life5_10;
    moom.hR life6_16;
    forward_join_38: {
    forward_join_34: {
    life4_5 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    life5_10 = ((moom.h8)(this)).a(((int)(p0)), ((int)(p1)));
    if (!((life5_10 >= 0))) {
        break forward_join_38;
    }
    life6_16 = ((moom.h8)(this)).a__hR(((int)(life5_10)));
    if (!((this.E != ((moom.hR)(life6_16)).d))) {
        break forward_join_34;
    }
    if (!((this.E != null))) {
        break forward_join_34;
    }
    if (!((((this.E instanceof moom.hJ) ? 1 : 0) != 0))) {
        break forward_join_34;
    }
    ((moom.hJ)(((moom.hJ)(this.E)))).b(((boolean)(false)));
    }
    this.E = ((net.minecraft.client.gui.Gui)(((moom.hR)(life6_16)).d));
    }
    return ((life4_5) != 0);
}


private net.minecraft.client.gui.Gui a(moom.hS p0, int p1, boolean p2) {
net.minecraft.client.gui.Gui forwardValue3584_90_0;
    long life4_3;
    forward_join_90: {
    forward_join_89: {
    forward_join_67: {
    forward_join_46: {
    forward_join_25: {
    life4_3 = (moom.h8.F ^ 139531623023420L);
    if (!((((p0 instanceof moom.hW) ? 1 : 0) != 0))) {
        break forward_join_25;
    }
    forwardValue3584_90_0 = ((moom.h8)(this)).a(((int)((((((moom.h8)(this)).b / 2) - __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_3(23133, (1485477060256072581L ^ life4_3))) + p1))), ((int)(0)), ((moom.hW)(((moom.hW)(p0)))));
    break forward_join_90;
    }
    if (!((((p0 instanceof moom.hU) ? 1 : 0) != 0))) {
        break forward_join_46;
    }
    forwardValue3584_90_0 = ((moom.h8)(this)).a(((int)((((((moom.h8)(this)).b / 2) - __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_8(21542, (8208268153718541819L ^ life4_3))) + p1))), ((int)(0)), ((moom.hU)(((moom.hU)(p0)))));
    break forward_join_90;
    }
    if (!((((p0 instanceof moom.hT) ? 1 : 0) != 0))) {
        break forward_join_67;
    }
    forwardValue3584_90_0 = ((moom.h8)(this)).a(((int)((((((moom.h8)(this)).b / 2) - __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_13(21542, (8208268153718541819L ^ life4_3))) + p1))), ((int)(0)), ((moom.hT)(((moom.hT)(p0)))));
    break forward_join_90;
    }
    if (!((((p0 instanceof moom.hV) ? 1 : 0) != 0))) {
        break forward_join_89;
    }
    forwardValue3584_90_0 = ((moom.h8)(this)).a(((int)((((((moom.h8)(this)).b / 2) - __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_18(21542, (8208268153718541819L ^ life4_3))) + p1))), ((int)(0)), ((moom.hV)(((moom.hV)(p0)))), ((boolean)(p2)));
    break forward_join_90;
    }
    forwardValue3584_90_0 = null;
    }
    return forwardValue3584_90_0;
}


private void a(net.minecraft.client.gui.Gui p0, boolean p1) {
if ((((p0 instanceof moom.gc) ? 1 : 0) != 0)) {
        ((moom.gc)(((moom.gc)(p0)))).n = ((boolean)(p1));
    } else {
        if ((((p0 instanceof moom.hJ) ? 1 : 0) != 0)) {
        ((moom.hJ)(((moom.hJ)(p0)))).e(((boolean)(p1)));
    } else {
        if ((((p0 instanceof moom.gA) ? 1 : 0) != 0)) {
        ((moom.gA)(((moom.gA)(p0)))).m = ((boolean)(p1));
    }
    }
    }
    return;
}


public net.minecraft.client.gui.Gui a__sourceReturn_1dcab23318(int p0) {
return ((net.minecraft.client.gui.Gui)(((moom.Dd)(this.z)).a__Object(((int)(p0)))));
}


public net.minecraft.client.gui.Gui a__gb() {
return this.E;
}


private moom.gA a(int p0, int p1, moom.hV p2, boolean p3) {
long local5 = (moom.h8.F ^ 34723484637786L);
    moom.gA local7;
    if (p3) {
        local7 = new moom.gA(((net.minecraft.client.Minecraft)(((moom.h8)(this)).a)).N, ((moom.hV)(p2)).a(), p0, p1, (((moom.h8)(this)).b - (p0 * 2)), __sourceIntrinsic_6a227feb04db_invokedynamic6622_5(19504, (2150032160613387400L ^ local5)), -1);
    } else {
        local7 = new moom.gA(((net.minecraft.client.Minecraft)(((moom.h8)(this)).a)).N, ((moom.hV)(p2)).a(), p0, p1, __sourceIntrinsic_6a227feb04db_invokedynamic6622_9(13381, (7978363164262511871L ^ local5)), __sourceIntrinsic_6a227feb04db_invokedynamic6622_10(5823, (4492646611625940480L ^ local5)), -1);
    }
    ((moom.gA)(local7)).m = ((boolean)(((moom.hV)(p2)).a__Boolean()));
    ((moom.gA)(local7)).a(((java.lang.String)(((moom.hV)(p2)).a__String())));
    ((moom.gA)(local7)).a();
    return local7;
}


private moom.hJ a(int p0, int p1, moom.hT p2) {
long local4 = (moom.h8.F ^ 91354237602816L);
    moom.hJ local6 = new moom.hJ(((moom.hT)(p2)).a(), ((net.minecraft.client.Minecraft)(((moom.h8)(this)).a)).N, p0, p1, __sourceIntrinsic_4236d896849e_originalDynamicSite1478_4(31073, (1073663863191924620L ^ local4)), __sourceIntrinsic_4236d896849e_originalDynamicSite1478_5(5823, (4492721922265940058L ^ local4)));
    ((moom.hJ)(local6)).a(((java.lang.String)(((moom.hT)(p2)).a__String())));
    ((moom.hJ)(local6)).a(((moom.hX)(this.D)));
    ((moom.hJ)(local6)).e(((boolean)(((moom.hT)(p2)).a__Boolean())));
    ((moom.hJ)(local6)).a(((com.google.common.base.Predicate)(((moom.hT)(p2)).a__sourceReturn_d92b96d973())));
    return local6;
}


private moom.gf a(int p0, int p1, moom.hU p2) {
moom.gf local4 = new moom.gf(this.D, ((moom.hU)(p2)).a(), p0, p1, ((moom.hU)(p2)).a__String(), ((moom.hU)(p2)).b());
    ((moom.gf)(local4)).n = ((boolean)(((moom.hU)(p2)).a__Boolean()));
    return local4;
}


private moom.gp a(int p0, int p1, moom.hW p2) {
moom.gp local4 = new moom.gp(this.D, ((moom.hW)(p2)).a(), p0, p1, ((moom.hW)(p2)).a__String(), ((moom.hW)(p2)).a(), ((moom.hW)(p2)).b(), ((moom.hW)(p2)).c(), ((moom.hW)(p2)).a__h0());
    ((moom.gp)(local4)).n = ((boolean)(((moom.hW)(p2)).a__Boolean()));
    return local4;
}


public void g__sourceReturn_da8c82d5d4() {
if ((this.C < ((this.B).length - 1))) {
        ((moom.h8)(this)).c(((int)((this.C + 1))));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic855_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4236d896849e_originalDynamicSite1478_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_4236d896849e_originalDynamicSite1478_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a227feb04db_invokedynamic6622_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a227feb04db_invokedynamic6622_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6a227feb04db_invokedynamic6622_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7812_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15a7d9f1810e_invokedynamic3584_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_invokedynamic6617_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1476_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1477_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
