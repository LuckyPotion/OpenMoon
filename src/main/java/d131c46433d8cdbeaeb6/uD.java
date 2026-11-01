package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class uD extends moom.uC {

private net.minecraft.entity.passive.EntityVillager k;

private boolean l;

private boolean m;

private int n;

private static long o;

private static long[] t;

private static java.lang.Integer[] u;

private static java.util.Map v;

public uD(net.minecraft.entity.passive.EntityVillager p0, double p1) { super((moom.sI)null, 0.0D, 0); }


private static void __sourceConstructorBody_f1992267966cf355(moom.uD receiver, net.minecraft.entity.passive.EntityVillager p0, double p1) throws Throwable {

long local4 = (moom.uD.o ^ 83060300206823L);

    moom.uD.__sourceConstructorInit_f1992267966cf355_0(((moom.uD)(receiver)), ((net.minecraft.entity.passive.EntityVillager)(p0)), ((double)(p1)), ((int)(__sourceIntrinsic_f1992267966cf355_originalDynamicSite3386_1(28763, (6616429525129127129L ^ local4)))));

    ((moom.uD)(receiver)).k = ((net.minecraft.entity.passive.EntityVillager)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f1992267966cf355_0(moom.uD a0, net.minecraft.entity.passive.EntityVillager a1, double a2, int a3) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(9223018118606305689L)), ((long)(3014754234368508312L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(117729479373006L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.uD.o ^ 131339123680261L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1582_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1582_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1582_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1582_14 = new byte[8];
    (__sourceSpill1582_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1582_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1582_16 = __sourceSpill1582_14;
    ((javax.crypto.Cipher)(__sourceSpill1582_11)).init(((int)(__sourceSpill1582_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1582_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1582_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "kYZ@Ë\016Æô¶®Z}¢"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1582_25 = local6_life21;
        int __sourceSpill1582_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1582_25)).substring(((int)(__sourceSpill1582_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1582_30 = local8_life19;
        int __sourceSpill1582_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1582_33 = new byte[8];
        (__sourceSpill1582_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1582_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1582_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1582_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1582_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1582_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1582_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1582_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1582_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1582_34)).doFinal(((byte[])(__sourceSpill1582_33)));
        (__sourceSpill1582_30)[__sourceSpill1582_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ý>z$D«×ßÃ\036\032Él&\033"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1582_38 = local6_life21;
        int __sourceSpill1582_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1582_38)).substring(((int)(__sourceSpill1582_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1582_43 = local8_life19;
        int __sourceSpill1582_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1582_46 = new byte[8];
        (__sourceSpill1582_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1582_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1582_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1582_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1582_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1582_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1582_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1582_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1582_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1582_47)).doFinal(((byte[])(__sourceSpill1582_46)));
        (__sourceSpill1582_43)[__sourceSpill1582_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9284_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/uD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13761;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/uD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.uD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean() {
int forwardValue4148_13_0;
    int forwardValue4148_17_0;
    int forwardValue4148_19_0;
    int spill4148_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    forward_join_13: {
    life1_3 = (moom.uD.o ^ 68627456287680L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4148_0 = this.n;
    if (!((life3_5 == 0))) {
        forwardValue4148_13_0 = spill4148_0;
        break forward_join_13;
    }
    if (!((spill4148_0 >= 0))) {
        break forward_join_18;
    }
    forwardValue4148_13_0 = ((super.b__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue4148_17_0 = forwardValue4148_13_0;
        break forward_join_17;
    }
    if (!((forwardValue4148_13_0 != 0))) {
        break forward_join_18;
    }
    forwardValue4148_17_0 = 1;
    }
    forwardValue4148_19_0 = forwardValue4148_17_0;
    break forward_join_19;
    }
    forwardValue4148_19_0 = 0;
    }
    return ((forwardValue4148_19_0) != 0);
}


public void b__Void() {
super.b__Void();
    return;
}


public void c() {
moom.uD lexicalValue1331_41_0;
    int lexicalValue1331_89_0;
    int lexicalValue1331_90_0;
    int lexicalValue1331_90_1;
    net.minecraft.item.ItemStack lexicalValue1331_117_0;
    net.minecraft.item.Item lexicalValue1331_136_0;
    net.minecraft.item.Item lexicalValue1331_136_1;
    net.minecraft.item.Item lexicalValue1331_153_0;
    net.minecraft.item.Item lexicalValue1331_153_1;
    int lexicalValue1331_177_0;
    moom.uD lexicalValue1331_191_0;
    boolean spill1331_0;
    moom.uD spill1331_1;
    int spill1331_2;
    int spill1331_3;
    int spill1331_4;
    int spill1331_5;
    moom.uD spill1331_6;
    net.minecraft.item.ItemStack spill1331_7;
    net.minecraft.item.Item spill1331_8;
    net.minecraft.item.Item spill1331_9;
    int spill1331_10;
    long life1_3;
    int life3_34;
    net.minecraft.world.World life4_49;
    moom.DT life5_53;
    net.minecraft.block.state.IBlockState life6_57;
    net.minecraft.block.Block life7_60;
    moom.wq life8_130;
    int life9_132;
    net.minecraft.item.ItemStack life10_140;
    int life11_142;
    lexical_join_197: {
    lexical_join_191: {
    lexical_join_190: {
    lexical_join_187: {
    lexical_join_90: {
    lexical_join_89: {
    lexical_join_85: {
    lexical_join_41: {
    life1_3 = (moom.uD.o ^ 118134907371875L);
    spill1331_0 = moom.uc.d();
    super.c();
    ((net.minecraft.entity.ai.EntityLookHelper)(((net.minecraft.entity.passive.EntityVillager)(this.k)).a__vt())).a(((double)((((double) ((moom.DT)(this.h)).a()) + 0x1.0p-1d))), ((double)(((double) (((moom.DT)(this.h)).b() + 1)))), ((double)((((double) ((moom.DT)(this.h)).c()) + 0x1.0p-1d))), ((float)(0x1.4p3f)), ((float)(((float) ((net.minecraft.entity.passive.EntityVillager)(this.k)).m__Int()))));
    life3_34 = ((spill1331_0) ? 1 : 0);
    spill1331_1 = this;
    if (!((life3_34 != 0))) {
        lexicalValue1331_41_0 = spill1331_1;
        break lexical_join_41;
    }
    if (!(((moom.uD)(spill1331_1)).f())) {
        break lexical_join_197;
    }
    lexicalValue1331_41_0 = this;
    }
    life4_49 = ((net.minecraft.entity.passive.EntityVillager)(((moom.uD)(lexicalValue1331_41_0)).k)).i;
    life5_53 = ((moom.DT)(this.h)).a__DT();
    life6_57 = ((net.minecraft.world.World)(life4_49)).a__fE(((moom.DT)(life5_53)));
    life7_60 = ((net.minecraft.block.state.IBlockState)(life6_57)).a__ch();
    spill1331_2 = this.n;
    if (!((life3_34 != 0))) {
        lexicalValue1331_89_0 = spill1331_2;
        break lexical_join_89;
    }
    if (!((spill1331_2 == 0))) {
        break lexical_join_85;
    }
    spill1331_3 = ((life7_60 instanceof moom.cv) ? 1 : 0);
    if (!((life3_34 != 0))) {
        lexicalValue1331_89_0 = spill1331_3;
        break lexical_join_89;
    }
    if (!((spill1331_3 != 0))) {
        break lexical_join_85;
    }
    spill1331_4 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life6_57)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
    spill1331_5 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic1331_28(19176, (6927125784484744684L ^ life1_3));
    if (!((life3_34 != 0))) {
        lexicalValue1331_90_0 = spill1331_4;
        lexicalValue1331_90_1 = spill1331_5;
        break lexical_join_90;
    }
    if (!((spill1331_4 == spill1331_5))) {
        break lexical_join_85;
    }
    ((net.minecraft.world.World)(life4_49)).b(((moom.DT)(life5_53)), ((boolean)(true)));
    if (!((life3_34 == 0))) {
        break lexical_join_187;
    }
    }
    spill1331_6 = this;
    if (!((life3_34 != 0))) {
        lexicalValue1331_191_0 = spill1331_6;
        break lexical_join_191;
    }
    lexicalValue1331_89_0 = ((moom.uD)(spill1331_6)).n;
    }
    lexicalValue1331_90_0 = lexicalValue1331_89_0;
    lexicalValue1331_90_1 = 1;
    }
    if (!((lexicalValue1331_90_0 == lexicalValue1331_90_1))) {
        break lexical_join_187;
    }
    if (!((life7_60 == net.minecraft.init.Blocks.a))) {
        break lexical_join_187;
    }
    life8_130 = ((net.minecraft.entity.passive.EntityVillager)(this.k)).a__wq();
    life9_132 = 0;
    lexical_cycle_100: while (true) {
    lexical_join_184: {
    lexical_join_177: {
    lexical_join_163: {
    lexical_join_153: {
    lexical_join_150: {
    lexical_join_136: {
    lexical_join_133: {
    lexical_join_117: {
    if (!((life9_132 < ((moom.wq)(life8_130)).b__Int()))) {
        break lexical_join_187;
    }
    life10_140 = ((moom.wq)(life8_130)).a__xW(((int)(life9_132)));
    life11_142 = 0;
    if (!((life3_34 != 0))) {
        break lexical_join_190;
    }
    spill1331_7 = life10_140;
    if (!((life3_34 != 0))) {
        lexicalValue1331_117_0 = spill1331_7;
        break lexical_join_117;
    }
    if (!((spill1331_7 != null))) {
        break lexical_join_163;
    }
    lexicalValue1331_117_0 = life10_140;
    }
    spill1331_8 = ((net.minecraft.item.ItemStack)(lexicalValue1331_117_0)).a__wQ();
    spill1331_9 = net.minecraft.init.Items.N;
    if (!((life3_34 != 0))) {
        lexicalValue1331_136_0 = spill1331_8;
        lexicalValue1331_136_1 = spill1331_9;
        break lexical_join_136;
    }
    if (!((spill1331_8 == spill1331_9))) {
        break lexical_join_133;
    }
    ((net.minecraft.world.World)(life4_49)).a(((moom.DT)(life5_53)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aj)).a__fE())), ((int)(3)));
    life11_142 = 1;
    if (!((life3_34 == 0))) {
        break lexical_join_163;
    }
    }
    lexicalValue1331_136_0 = ((net.minecraft.item.ItemStack)(life10_140)).a__wQ();
    lexicalValue1331_136_1 = net.minecraft.init.Items.bH;
    }
    if (!((life3_34 != 0))) {
        lexicalValue1331_153_0 = lexicalValue1331_136_0;
        lexicalValue1331_153_1 = lexicalValue1331_136_1;
        break lexical_join_153;
    }
    if (!((lexicalValue1331_136_0 == lexicalValue1331_136_1))) {
        break lexical_join_150;
    }
    ((net.minecraft.world.World)(life4_49)).a(((moom.DT)(life5_53)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bR)).a__fE())), ((int)(3)));
    life11_142 = 1;
    if (!((life3_34 == 0))) {
        break lexical_join_163;
    }
    }
    lexicalValue1331_153_0 = ((net.minecraft.item.ItemStack)(life10_140)).a__wQ();
    lexicalValue1331_153_1 = net.minecraft.init.Items.bG;
    }
    if (!((lexicalValue1331_153_0 == lexicalValue1331_153_1))) {
        break lexical_join_163;
    }
    ((net.minecraft.world.World)(life4_49)).a(((moom.DT)(life5_53)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bQ)).a__fE())), ((int)(3)));
    life11_142 = 1;
    }
    spill1331_10 = life11_142;
    if (!((life3_34 != 0))) {
        lexicalValue1331_177_0 = spill1331_10;
        break lexical_join_177;
    }
    if (!((spill1331_10 != 0))) {
        break lexical_join_184;
    }
    net.minecraft.item.ItemStack __stackOp1331_51_0 = life10_140;
    ((net.minecraft.item.ItemStack)(__stackOp1331_51_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1331_51_0)).b - 1)));
    if (!((life3_34 != 0))) {
        break lexical_join_190;
    }
    lexicalValue1331_177_0 = ((net.minecraft.item.ItemStack)(life10_140)).b;
    }
    if (!((lexicalValue1331_177_0 <= 0))) {
        break lexical_join_187;
    }
    ((moom.wq)(life8_130)).a__Void(((int)(life9_132)), ((net.minecraft.item.ItemStack)(null)));
    if (!((life3_34 == 0))) {
        break lexical_join_187;
    }
    }
    life9_132 += 1;
    if (!((life3_34 == 0))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    this.n = ((int)(-1));
    }
    lexicalValue1331_191_0 = this;
    }
    ((moom.uD)(lexicalValue1331_191_0)).e = ((int)(__sourceIntrinsic_5b7380e7aa7c_invokedynamic1331_57(7445, (3452766198875904528L ^ life1_3))));
    }
    return;
}


public void a__Void() {
super.a__Void();
    return;
}


public boolean a__Boolean() {
moom.uD forwardValue4147_31_0;
    int forwardValue4147_37_0;
    int spill4147_0;
    moom.uD spill4147_1;
    long life1_3;
    int life3_5;
    forward_join_37: {
    forward_join_35: {
    forward_join_31: {
    forward_join_22: {
    life1_3 = (moom.uD.o ^ 95493822188369L);
    life3_5 = ((moom.uc.e()) ? 1 : 0);
    spill4147_0 = this.e;
    if (!((life3_5 == 0))) {
        forwardValue4147_37_0 = spill4147_0;
        break forward_join_37;
    }
    if (!((spill4147_0 <= 0))) {
        break forward_join_35;
    }
    spill4147_1 = this;
    if (!((life3_5 == 0))) {
        forwardValue4147_31_0 = spill4147_1;
        break forward_join_31;
    }
    if (!((!((net.minecraft.world.GameRules)(((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityVillager)(((moom.uD)(spill4147_1)).k)).i)).a__Ej())).a__Boolean(((java.lang.String)("mobGriefing")))))) {
        break forward_join_22;
    }
    return ((0) != 0);
    }
    this.n = ((int)(-1));
    this.l = ((boolean)(((net.minecraft.entity.passive.EntityVillager)(this.k)).aj()));
    forwardValue4147_31_0 = this;
    }
    ((moom.uD)(forwardValue4147_31_0)).m = ((boolean)(((net.minecraft.entity.passive.EntityVillager)(this.k)).ai()));
    }
    forwardValue4147_37_0 = ((super.a__Boolean()) ? 1 : 0);
    }
    return ((forwardValue4147_37_0) != 0);
}


protected boolean a(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue4146_46_0;
    int forwardValue4146_51_0;
    int forwardValue4146_63_0;
    net.minecraft.block.Block forwardValue4146_65_0;
    int forwardValue4146_87_0;
    int forwardValue4146_89_0;
    boolean spill4146_0;
    net.minecraft.block.Block spill4146_1;
    int spill4146_2;
    int spill4146_3;
    boolean spill4146_4;
    int spill4146_5;
    int spill4146_6;
    long life3_3;
    net.minecraft.block.Block life6_9;
    int life5_10;
    net.minecraft.block.state.IBlockState life7_25;
    net.minecraft.block.Block life6_28;
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_83: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_59: {
    forward_join_51: {
    forward_join_46: {
    forward_join_19: {
    life3_3 = (moom.uD.o ^ 85948431359638L);
    spill4146_0 = moom.uc.e();
    life6_9 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch();
    life5_10 = ((spill4146_0) ? 1 : 0);
    if (!((life5_10 == 0))) {
        break forward_join_19;
    }
    if (!((life6_9 == net.minecraft.init.Blocks.ak))) {
        break forward_join_88;
    }
    p1 = ((moom.DT)(p1)).a__DT();
    }
    life7_25 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life6_28 = ((net.minecraft.block.state.IBlockState)(life7_25)).a__ch();
    spill4146_1 = life6_28;
    if (!((life5_10 == 0))) {
        forwardValue4146_65_0 = spill4146_1;
        break forward_join_65;
    }
    if (!((((spill4146_1 instanceof moom.cv) ? 1 : 0) != 0))) {
        break forward_join_64;
    }
    spill4146_2 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(life7_25)).a(((net.minecraft.block.properties.IProperty)(moom.cv.R))))))).intValue();
    if (!((life5_10 == 0))) {
        forwardValue4146_46_0 = spill4146_2;
        break forward_join_46;
    }
    if (!((spill4146_2 == __sourceIntrinsic_a8ffddd0fe52_invokedynamic4146_14(13426, (5001011813369457792L ^ life3_3))))) {
        break forward_join_64;
    }
    forwardValue4146_46_0 = ((this.m) ? 1 : 0);
    }
    if (!((life5_10 == 0))) {
        forwardValue4146_51_0 = forwardValue4146_46_0;
        break forward_join_51;
    }
    if (!((forwardValue4146_46_0 != 0))) {
        break forward_join_64;
    }
    forwardValue4146_51_0 = this.n;
    }
    if (!((life5_10 == 0))) {
        forwardValue4146_63_0 = forwardValue4146_51_0;
        break forward_join_63;
    }
    if (!((forwardValue4146_51_0 != 0))) {
        break forward_join_59;
    }
    spill4146_3 = this.n;
    if (!((life5_10 == 0))) {
        forwardValue4146_63_0 = spill4146_3;
        break forward_join_63;
    }
    if (!((spill4146_3 < 0))) {
        break forward_join_64;
    }
    }
    this.n = ((int)(0));
    forwardValue4146_63_0 = 1;
    }
    return ((forwardValue4146_63_0) != 0);
    }
    forwardValue4146_65_0 = life6_28;
    }
    if (!((forwardValue4146_65_0 == net.minecraft.init.Blocks.a))) {
        break forward_join_88;
    }
    spill4146_4 = this.l;
    if (!((life5_10 == 0))) {
        forwardValue4146_89_0 = ((spill4146_4) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill4146_4)) {
        break forward_join_88;
    }
    spill4146_5 = this.n;
    if (!((life5_10 == 0))) {
        forwardValue4146_87_0 = spill4146_5;
        break forward_join_87;
    }
    if (!((spill4146_5 != 1))) {
        break forward_join_83;
    }
    spill4146_6 = this.n;
    if (!((life5_10 == 0))) {
        forwardValue4146_89_0 = spill4146_6;
        break forward_join_89;
    }
    if (!((spill4146_6 < 0))) {
        break forward_join_88;
    }
    }
    this.n = ((int)(1));
    forwardValue4146_87_0 = 1;
    }
    return ((forwardValue4146_87_0) != 0);
    }
    forwardValue4146_89_0 = 0;
    }
    return ((forwardValue4146_89_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_f1992267966cf355_originalDynamicSite3386_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9284_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1331_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic1331_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a8ffddd0fe52_invokedynamic4146_14(int a0, long a1) throws E;
}
