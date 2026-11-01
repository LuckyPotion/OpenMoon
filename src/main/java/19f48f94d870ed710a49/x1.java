package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class x1 implements net.minecraft.item.crafting.IRecipe {

private net.minecraft.item.ItemStack a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public x1() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(8165878672832052860L)), ((long)(-4925206510127795847L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(20048824338252L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.x1.b ^ 134937668990149L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1662_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1662_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1662_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1662_14 = new byte[8];
    (__sourceSpill1662_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1662_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1662_16 = __sourceSpill1662_14;
    ((javax.crypto.Cipher)(__sourceSpill1662_11)).init(((int)(__sourceSpill1662_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1662_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1662_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[4];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\007ºË%9}J¸Îxee"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1662_25 = local6_life21;
        int __sourceSpill1662_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1662_25)).substring(((int)(__sourceSpill1662_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1662_30 = local8_life19;
        int __sourceSpill1662_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1662_33 = new byte[8];
        (__sourceSpill1662_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1662_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1662_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1662_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1662_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1662_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1662_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1662_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1662_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1662_34)).doFinal(((byte[])(__sourceSpill1662_33)));
        (__sourceSpill1662_30)[__sourceSpill1662_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "RÊC\024°Ì¸æÓ$]#"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1662_38 = local6_life21;
        int __sourceSpill1662_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1662_38)).substring(((int)(__sourceSpill1662_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1662_43 = local8_life19;
        int __sourceSpill1662_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1662_46 = new byte[8];
        (__sourceSpill1662_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1662_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1662_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1662_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1662_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1662_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1662_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1662_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1662_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1662_47)).doFinal(((byte[])(__sourceSpill1662_46)));
        (__sourceSpill1662_43)[__sourceSpill1662_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17127;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/x1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9649_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/x1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.x1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a(moom.wx p0, net.minecraft.world.World p1) {
net.minecraft.item.Item lexicalValue1389_52_0;
    net.minecraft.item.Item lexicalValue1389_52_1;
    net.minecraft.item.Item lexicalValue1389_61_0;
    net.minecraft.item.Item lexicalValue1389_61_1;
    net.minecraft.item.Item lexicalValue1389_70_0;
    net.minecraft.item.Item lexicalValue1389_70_1;
    net.minecraft.item.Item lexicalValue1389_79_0;
    net.minecraft.item.Item lexicalValue1389_79_1;
    net.minecraft.item.Item lexicalValue1389_88_0;
    net.minecraft.item.Item lexicalValue1389_88_1;
    net.minecraft.item.Item lexicalValue1389_97_0;
    net.minecraft.item.Item lexicalValue1389_97_1;
    net.minecraft.item.Item lexicalValue1389_106_0;
    net.minecraft.item.Item lexicalValue1389_106_1;
    net.minecraft.item.Item lexicalValue1389_115_0;
    net.minecraft.item.Item lexicalValue1389_115_1;
    net.minecraft.item.Item lexicalValue1389_124_0;
    net.minecraft.item.Item lexicalValue1389_124_1;
    net.minecraft.item.ItemStack lexicalValue1389_206_0;
    int lexicalValue1389_219_0;
    net.minecraft.item.ItemStack lexicalValue1389_244_0;
    int lexicalValue1389_247_0;
    int lexicalValue1389_249_0;
    int lexicalValue1389_252_0;
    int lexicalValue1389_252_1;
    net.minecraft.item.Item lexicalValue1389_327_0;
    net.minecraft.item.Item lexicalValue1389_327_1;
    net.minecraft.item.Item lexicalValue1389_339_0;
    net.minecraft.item.Item lexicalValue1389_339_1;
    net.minecraft.item.Item lexicalValue1389_351_0;
    net.minecraft.item.Item lexicalValue1389_351_1;
    net.minecraft.item.Item lexicalValue1389_361_0;
    net.minecraft.item.Item lexicalValue1389_361_1;
    net.minecraft.item.Item lexicalValue1389_371_0;
    net.minecraft.item.Item lexicalValue1389_371_1;
    net.minecraft.item.Item lexicalValue1389_381_0;
    net.minecraft.item.Item lexicalValue1389_381_1;
    int lexicalValue1389_429_0;
    net.minecraft.item.Item lexicalValue1389_493_0;
    net.minecraft.item.Item lexicalValue1389_493_1;
    net.minecraft.item.ItemStack lexicalValue1389_500_0;
    net.minecraft.item.ItemStack lexicalValue1389_535_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1389_552_0;
    int lexicalValue1389_558_0;
    int lexicalValue1389_560_0;
    int lexicalValue1389_562_0;
    java.lang.String spill1389_0;
    net.minecraft.item.Item spill1389_1;
    net.minecraft.item.Item spill1389_2;
    int spill1389_3;
    int spill1389_4;
    int spill1389_5;
    int spill1389_6;
    int spill1389_7;
    int spill1389_8;
    int spill1389_9;
    int spill1389_10;
    net.minecraft.item.ItemStack spill1389_11;
    net.minecraft.item.ItemStack spill1389_12;
    boolean spill1389_13;
    int spill1389_14;
    int spill1389_15;
    int spill1389_16;
    int spill1389_17;
    net.minecraft.item.Item spill1389_18;
    net.minecraft.item.Item spill1389_19;
    int spill1389_20;
    int spill1389_21;
    int spill1389_22;
    int spill1389_23;
    net.minecraft.item.Item spill1389_24;
    net.minecraft.item.Item spill1389_25;
    net.minecraft.item.ItemStack spill1389_26;
    net.minecraft.item.ItemStack spill1389_27;
    boolean spill1389_28;
    net.minecraft.nbt.NBTTagCompound spill1389_29;
    long life3_3;
    int life6_8;
    int life7_10;
    int life8_12;
    int life9_14;
    int life10_17;
    int life11_19;
    int life12_21;
    java.lang.String life5_22;
    net.minecraft.item.ItemStack life13_30;
    net.minecraft.nbt.NBTTagCompound life12_299;
    net.minecraft.nbt.NBTTagCompound life13_303;
    net.minecraft.nbt.NBTTagList life14_307;
    int life15_309;
    net.minecraft.item.ItemStack life16_317;
    net.minecraft.nbt.NBTTagCompound life12_455;
    net.minecraft.nbt.NBTTagCompound life13_459;
    int life14_461;
    java.util.ArrayList life15_463;
    int life16_465;
    net.minecraft.item.ItemStack life17_473;
    int[] life16_617;
    int life17_619;
    java.util.ArrayList life12_708;
    int life13_710;
    net.minecraft.item.ItemStack life14_718;
    int[] life13_786;
    int life14_788;
    net.minecraft.nbt.NBTTagCompound life14_834;
    lexical_join_562: {
    lexical_join_561: {
    lexical_join_560: {
    lexical_join_559: {
    lexical_join_558: {
    lexical_join_557: {
    lexical_join_552: {
    lexical_join_551: {
    lexical_join_535: {
    lexical_join_528: {
    lexical_join_505: {
    lexical_join_429: {
    lexical_join_428: {
    lexical_join_426: {
    lexical_join_410: {
    lexical_join_387: {
    lexical_join_252: {
    lexical_join_249: {
    lexical_join_248: {
    lexical_join_247: {
    lexical_join_246: {
    lexical_join_244: {
    lexical_join_229: {
    lexical_join_137: {
    lexical_join_131: {
    life3_3 = (moom.x1.b ^ 99169620275497L);
    this.a = ((net.minecraft.item.ItemStack)(null));
    life6_8 = 0;
    life7_10 = 0;
    life8_12 = 0;
    life9_14 = 0;
    spill1389_0 = moom.ye.b();
    life10_17 = 0;
    life11_19 = 0;
    life12_21 = 0;
    life5_22 = spill1389_0;
    lexical_cycle_23: while (true) {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_127: {
    lexical_join_124: {
    lexical_join_121: {
    lexical_join_115: {
    lexical_join_112: {
    lexical_join_106: {
    lexical_join_103: {
    lexical_join_97: {
    lexical_join_94: {
    lexical_join_88: {
    lexical_join_85: {
    lexical_join_79: {
    lexical_join_76: {
    lexical_join_70: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_58: {
    lexical_join_52: {
    lexical_join_49: {
    if (!((life12_21 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_131;
    }
    life13_30 = ((moom.wx)(p0)).a__xW(((int)(life12_21)));
    if (!((life5_22 == null))) {
        break lexical_join_137;
    }
    if (!((life5_22 == null))) {
        break lexical_join_129;
    }
    if (!((life13_30 != null))) {
        break lexical_join_128;
    }
    spill1389_1 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    spill1389_2 = net.minecraft.init.Items.H;
    if (!((life5_22 == null))) {
        lexicalValue1389_52_0 = spill1389_1;
        lexicalValue1389_52_1 = spill1389_2;
        break lexical_join_52;
    }
    if (!((spill1389_1 == spill1389_2))) {
        break lexical_join_49;
    }
    life7_10 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    lexicalValue1389_52_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_52_1 = net.minecraft.init.Items.bR;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_61_0 = lexicalValue1389_52_0;
        lexicalValue1389_61_1 = lexicalValue1389_52_1;
        break lexical_join_61;
    }
    if (!((lexicalValue1389_52_0 == lexicalValue1389_52_1))) {
        break lexical_join_58;
    }
    life9_14 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_61_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_61_1 = net.minecraft.init.Items.aW;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_70_0 = lexicalValue1389_61_0;
        lexicalValue1389_70_1 = lexicalValue1389_61_1;
        break lexical_join_70;
    }
    if (!((lexicalValue1389_61_0 == lexicalValue1389_61_1))) {
        break lexical_join_67;
    }
    life8_12 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_70_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_70_1 = net.minecraft.init.Items.aK;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_79_0 = lexicalValue1389_70_0;
        lexicalValue1389_79_1 = lexicalValue1389_70_1;
        break lexical_join_79;
    }
    if (!((lexicalValue1389_70_0 == lexicalValue1389_70_1))) {
        break lexical_join_76;
    }
    life6_8 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_79_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_79_1 = net.minecraft.init.Items.aT;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_88_0 = lexicalValue1389_79_0;
        lexicalValue1389_88_1 = lexicalValue1389_79_1;
        break lexical_join_88;
    }
    if (!((lexicalValue1389_79_0 == lexicalValue1389_79_1))) {
        break lexical_join_85;
    }
    life10_17 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_88_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_88_1 = net.minecraft.init.Items.i;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_97_0 = lexicalValue1389_88_0;
        lexicalValue1389_97_1 = lexicalValue1389_88_1;
        break lexical_join_97;
    }
    if (!((lexicalValue1389_88_0 == lexicalValue1389_88_1))) {
        break lexical_join_94;
    }
    life10_17 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_97_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_97_1 = net.minecraft.init.Items.bA;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_106_0 = lexicalValue1389_97_0;
        lexicalValue1389_106_1 = lexicalValue1389_97_1;
        break lexical_join_106;
    }
    if (!((lexicalValue1389_97_0 == lexicalValue1389_97_1))) {
        break lexical_join_103;
    }
    life11_19 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_106_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_106_1 = net.minecraft.init.Items.G;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_115_0 = lexicalValue1389_106_0;
        lexicalValue1389_115_1 = lexicalValue1389_106_1;
        break lexical_join_115;
    }
    if (!((lexicalValue1389_106_0 == lexicalValue1389_106_1))) {
        break lexical_join_112;
    }
    life11_19 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_115_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_115_1 = net.minecraft.init.Items.bm;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_124_0 = lexicalValue1389_115_0;
        lexicalValue1389_124_1 = lexicalValue1389_115_1;
        break lexical_join_124;
    }
    if (!((lexicalValue1389_115_0 == lexicalValue1389_115_1))) {
        break lexical_join_121;
    }
    life11_19 += 1;
    if (!((life5_22 != null))) {
        break lexical_join_128;
    }
    }
    lexicalValue1389_124_0 = ((net.minecraft.item.ItemStack)(life13_30)).a__wQ();
    lexicalValue1389_124_1 = net.minecraft.init.Items.bM;
    }
    if (!((lexicalValue1389_124_0 != lexicalValue1389_124_1))) {
        break lexical_join_127;
    }
    return ((0) != 0);
    }
    life11_19 += 1;
    }
    life12_21 += 1;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    life10_17 = ((life10_17 + life8_12) + life11_19);
    }
    spill1389_3 = life7_10;
    if (!((life5_22 == null))) {
        lexicalValue1389_562_0 = spill1389_3;
        break lexical_join_562;
    }
    if (!((spill1389_3 <= 3))) {
        break lexical_join_561;
    }
    spill1389_4 = life6_8;
    if (!((life5_22 == null))) {
        lexicalValue1389_562_0 = spill1389_4;
        break lexical_join_562;
    }
    if (!((spill1389_4 <= 1))) {
        break lexical_join_561;
    }
    spill1389_5 = life7_10;
    spill1389_6 = 1;
    if (!((life5_22 == null))) {
        lexicalValue1389_252_0 = spill1389_5;
        lexicalValue1389_252_1 = spill1389_6;
        break lexical_join_252;
    }
    if (!((spill1389_5 >= spill1389_6))) {
        break lexical_join_248;
    }
    spill1389_7 = life6_8;
    spill1389_8 = 1;
    if (!((life5_22 == null))) {
        lexicalValue1389_252_0 = spill1389_7;
        lexicalValue1389_252_1 = spill1389_8;
        break lexical_join_252;
    }
    if (!((spill1389_7 == spill1389_8))) {
        break lexical_join_248;
    }
    spill1389_9 = life10_17;
    if (!((life5_22 == null))) {
        lexicalValue1389_249_0 = spill1389_9;
        break lexical_join_249;
    }
    if (!((spill1389_9 == 0))) {
        break lexical_join_248;
    }
    this.a = ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bQ)));
    spill1389_10 = life9_14;
    if (!((life5_22 == null))) {
        lexicalValue1389_247_0 = spill1389_10;
        break lexical_join_247;
    }
    if (!((spill1389_10 > 0))) {
        break lexical_join_246;
    }
    life12_299 = new net.minecraft.nbt.NBTTagCompound();
    life13_303 = new net.minecraft.nbt.NBTTagCompound();
    life14_307 = new net.minecraft.nbt.NBTTagList();
    life15_309 = 0;
    lexical_cycle_185: while (true) {
    lexical_join_227: {
    lexical_join_226: {
    lexical_join_219: {
    lexical_join_206: {
    if (!((life15_309 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_229;
    }
    life16_317 = ((moom.wx)(p0)).a__xW(((int)(life15_309)));
    if (!((life5_22 == null))) {
        break lexical_join_227;
    }
    spill1389_11 = life16_317;
    if (!((life5_22 == null))) {
        lexicalValue1389_244_0 = spill1389_11;
        break lexical_join_244;
    }
    if (!((spill1389_11 != null))) {
        break lexical_join_226;
    }
    spill1389_12 = life16_317;
    if (!((life5_22 == null))) {
        lexicalValue1389_206_0 = spill1389_12;
        break lexical_join_206;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1389_12)).a__wQ() == net.minecraft.init.Items.bR))) {
        break lexical_join_226;
    }
    lexicalValue1389_206_0 = life16_317;
    }
    spill1389_13 = ((net.minecraft.item.ItemStack)(lexicalValue1389_206_0)).e__Boolean();
    if (!((life5_22 == null))) {
        lexicalValue1389_219_0 = ((spill1389_13) ? 1 : 0);
        break lexical_join_219;
    }
    if (!(spill1389_13)) {
        break lexical_join_226;
    }
    lexicalValue1389_219_0 = ((((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life16_317)).a__yw())).a__Boolean(((java.lang.String)("Explosion")), ((int)(__sourceIntrinsic_02959d7480d7_invokedynamic1389_36(9486, (8183749093390029141L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue1389_219_0 != 0))) {
        break lexical_join_226;
    }
    ((net.minecraft.nbt.NBTTagList)(life14_307)).a(((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(life16_317)).a__yw())).a__yw(((java.lang.String)("Explosion"))))));
    }
    life15_309 += 1;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_185; }
    break lexical_cycle_185;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(life13_303)).a(((java.lang.String)("Explosions")), ((net.minecraft.nbt.NBTBase)(life14_307)));
    ((net.minecraft.nbt.NBTTagCompound)(life13_303)).a(((java.lang.String)("Flight")), ((byte)(((byte) life7_10))));
    ((net.minecraft.nbt.NBTTagCompound)(life12_299)).a(((java.lang.String)("Fireworks")), ((net.minecraft.nbt.NBTBase)(life13_303)));
    lexicalValue1389_244_0 = this.a;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1389_244_0)).b(((net.minecraft.nbt.NBTTagCompound)(life12_299)));
    }
    lexicalValue1389_247_0 = 1;
    }
    return ((lexicalValue1389_247_0) != 0);
    }
    lexicalValue1389_249_0 = life7_10;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_429_0 = lexicalValue1389_249_0;
        break lexical_join_429;
    }
    lexicalValue1389_252_0 = lexicalValue1389_249_0;
    lexicalValue1389_252_1 = 1;
    }
    if (!((lexicalValue1389_252_0 == lexicalValue1389_252_1))) {
        break lexical_join_428;
    }
    spill1389_14 = life6_8;
    if (!((life5_22 == null))) {
        lexicalValue1389_429_0 = spill1389_14;
        break lexical_join_429;
    }
    if (!((spill1389_14 == 0))) {
        break lexical_join_428;
    }
    spill1389_15 = life9_14;
    if (!((life5_22 == null))) {
        lexicalValue1389_429_0 = spill1389_15;
        break lexical_join_429;
    }
    if (!((spill1389_15 == 0))) {
        break lexical_join_428;
    }
    spill1389_16 = life8_12;
    if (!((life5_22 == null))) {
        lexicalValue1389_429_0 = spill1389_16;
        break lexical_join_429;
    }
    if (!((spill1389_16 > 0))) {
        break lexical_join_428;
    }
    spill1389_17 = life11_19;
    if (!((life5_22 == null))) {
        lexicalValue1389_429_0 = spill1389_17;
        break lexical_join_429;
    }
    if (!((spill1389_17 <= 1))) {
        break lexical_join_428;
    }
    this.a = ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bR)));
    life12_455 = new net.minecraft.nbt.NBTTagCompound();
    life13_459 = new net.minecraft.nbt.NBTTagCompound();
    life14_461 = 0;
    life15_463 = com.google.common.collect.Lists.newArrayList();
    life16_465 = 0;
    lexical_cycle_290: while (true) {
    lexical_join_385: {
    lexical_join_384: {
    lexical_join_381: {
    lexical_join_378: {
    lexical_join_371: {
    lexical_join_368: {
    lexical_join_361: {
    lexical_join_358: {
    lexical_join_351: {
    lexical_join_348: {
    lexical_join_339: {
    lexical_join_336: {
    lexical_join_327: {
    lexical_join_324: {
    if (!((life16_465 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_387;
    }
    life17_473 = ((moom.wx)(p0)).a__xW(((int)(life16_465)));
    if (!((life5_22 == null))) {
        break lexical_join_385;
    }
    if (!((life17_473 != null))) {
        break lexical_join_384;
    }
    spill1389_18 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    spill1389_19 = net.minecraft.init.Items.aW;
    if (!((life5_22 == null))) {
        lexicalValue1389_327_0 = spill1389_18;
        lexicalValue1389_327_1 = spill1389_19;
        break lexical_join_327;
    }
    if (!((spill1389_18 == spill1389_19))) {
        break lexical_join_324;
    }
    ((java.util.List)(life15_463)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)((moom.xd.n)[(((net.minecraft.item.ItemStack)(life17_473)).c() & __sourceIntrinsic_02959d7480d7_invokedynamic1389_57(29025, (6125385197905659195L ^ life3_3)))]))))));
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_327_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_327_1 = net.minecraft.init.Items.aT;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_339_0 = lexicalValue1389_327_0;
        lexicalValue1389_339_1 = lexicalValue1389_327_1;
        break lexical_join_339;
    }
    if (!((lexicalValue1389_327_0 == lexicalValue1389_327_1))) {
        break lexical_join_336;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life13_459)).a(((java.lang.String)("Flicker")), ((boolean)(true)));
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_339_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_339_1 = net.minecraft.init.Items.i;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_351_0 = lexicalValue1389_339_0;
        lexicalValue1389_351_1 = lexicalValue1389_339_1;
        break lexical_join_351;
    }
    if (!((lexicalValue1389_339_0 == lexicalValue1389_339_1))) {
        break lexical_join_348;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life13_459)).a(((java.lang.String)("Trail")), ((boolean)(true)));
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_351_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_351_1 = net.minecraft.init.Items.bA;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_361_0 = lexicalValue1389_351_0;
        lexicalValue1389_361_1 = lexicalValue1389_351_1;
        break lexical_join_361;
    }
    if (!((lexicalValue1389_351_0 == lexicalValue1389_351_1))) {
        break lexical_join_358;
    }
    life14_461 = 1;
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_361_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_361_1 = net.minecraft.init.Items.G;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_371_0 = lexicalValue1389_361_0;
        lexicalValue1389_371_1 = lexicalValue1389_361_1;
        break lexical_join_371;
    }
    if (!((lexicalValue1389_361_0 == lexicalValue1389_361_1))) {
        break lexical_join_368;
    }
    life14_461 = 4;
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_371_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_371_1 = net.minecraft.init.Items.bm;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_381_0 = lexicalValue1389_371_0;
        lexicalValue1389_381_1 = lexicalValue1389_371_1;
        break lexical_join_381;
    }
    if (!((lexicalValue1389_371_0 == lexicalValue1389_371_1))) {
        break lexical_join_378;
    }
    life14_461 = 2;
    if (!((life5_22 != null))) {
        break lexical_join_384;
    }
    }
    lexicalValue1389_381_0 = ((net.minecraft.item.ItemStack)(life17_473)).a__wQ();
    lexicalValue1389_381_1 = net.minecraft.init.Items.bM;
    }
    if (!((lexicalValue1389_381_0 == lexicalValue1389_381_1))) {
        break lexical_join_384;
    }
    life14_461 = 3;
    }
    life16_465 += 1;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_290; }
    break lexical_cycle_290;
    }
    }
    life16_617 = new int[((java.util.List)(life15_463)).size()];
    life17_619 = 0;
    lexical_cycle_393: while (true) {
    if (!((life17_619 < (life16_617).length))) {
        break lexical_join_410;
    }
    (life16_617)[life17_619] = ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(life15_463)).get(((int)(life17_619))))))).intValue();
    life17_619 += 1;
    if (!((life5_22 == null))) {
        break lexical_join_426;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_393; }
    break lexical_cycle_393;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(life13_459)).a(((java.lang.String)("Colors")), ((int[])(life16_617)));
    ((net.minecraft.nbt.NBTTagCompound)(life13_459)).a(((java.lang.String)("Type")), ((byte)(life14_461)));
    ((net.minecraft.nbt.NBTTagCompound)(life12_455)).a(((java.lang.String)("Explosion")), ((net.minecraft.nbt.NBTBase)(life13_459)));
    ((net.minecraft.item.ItemStack)(this.a)).b(((net.minecraft.nbt.NBTTagCompound)(life12_455)));
    }
    return ((1) != 0);
    }
    lexicalValue1389_429_0 = life7_10;
    }
    if (!((life5_22 == null))) {
        lexicalValue1389_560_0 = lexicalValue1389_429_0;
        break lexical_join_560;
    }
    if (!((lexicalValue1389_429_0 == 0))) {
        break lexical_join_559;
    }
    spill1389_20 = life6_8;
    if (!((life5_22 == null))) {
        lexicalValue1389_560_0 = spill1389_20;
        break lexical_join_560;
    }
    if (!((spill1389_20 == 0))) {
        break lexical_join_559;
    }
    spill1389_21 = life9_14;
    if (!((life5_22 == null))) {
        lexicalValue1389_560_0 = spill1389_21;
        break lexical_join_560;
    }
    if (!((spill1389_21 == 1))) {
        break lexical_join_559;
    }
    spill1389_22 = life8_12;
    if (!((life5_22 == null))) {
        lexicalValue1389_560_0 = spill1389_22;
        break lexical_join_560;
    }
    if (!((spill1389_22 > 0))) {
        break lexical_join_559;
    }
    spill1389_23 = life8_12;
    if (!((life5_22 == null))) {
        lexicalValue1389_560_0 = spill1389_23;
        break lexical_join_560;
    }
    if (!((spill1389_23 == life10_17))) {
        break lexical_join_559;
    }
    life12_708 = com.google.common.collect.Lists.newArrayList();
    life13_710 = 0;
    lexical_cycle_454: while (true) {
    lexical_join_503: {
    lexical_join_502: {
    lexical_join_500: {
    lexical_join_493: {
    lexical_join_488: {
    if (!((life13_710 < ((moom.wx)(p0)).b__Int()))) {
        break lexical_join_505;
    }
    life14_718 = ((moom.wx)(p0)).a__xW(((int)(life13_710)));
    if (!((life5_22 == null))) {
        break lexical_join_503;
    }
    if (!((life14_718 != null))) {
        break lexical_join_502;
    }
    spill1389_24 = ((net.minecraft.item.ItemStack)(life14_718)).a__wQ();
    spill1389_25 = net.minecraft.init.Items.aW;
    if (!((life5_22 == null))) {
        lexicalValue1389_493_0 = spill1389_24;
        lexicalValue1389_493_1 = spill1389_25;
        break lexical_join_493;
    }
    if (!((spill1389_24 == spill1389_25))) {
        break lexical_join_488;
    }
    ((java.util.List)(life12_708)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)((moom.xd.n)[(((net.minecraft.item.ItemStack)(life14_718)).c() & __sourceIntrinsic_02959d7480d7_invokedynamic1389_91(8287, (2816966413812765703L ^ life3_3)))]))))));
    if (!((life5_22 != null))) {
        break lexical_join_502;
    }
    }
    spill1389_26 = life14_718;
    if (!((life5_22 == null))) {
        lexicalValue1389_500_0 = spill1389_26;
        break lexical_join_500;
    }
    lexicalValue1389_493_0 = ((net.minecraft.item.ItemStack)(spill1389_26)).a__wQ();
    lexicalValue1389_493_1 = net.minecraft.init.Items.bR;
    }
    if (!((lexicalValue1389_493_0 == lexicalValue1389_493_1))) {
        break lexical_join_502;
    }
    this.a = ((net.minecraft.item.ItemStack)(((net.minecraft.item.ItemStack)(life14_718)).a__xW()));
    lexicalValue1389_500_0 = this.a;
    }
    ((net.minecraft.item.ItemStack)(lexicalValue1389_500_0)).b = ((int)(1));
    }
    life13_710 += 1;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_454; }
    break lexical_cycle_454;
    }
    }
    life13_786 = new int[((java.util.List)(life12_708)).size()];
    life14_788 = 0;
    lexical_cycle_511: while (true) {
    if (!((life14_788 < (life13_786).length))) {
        break lexical_join_528;
    }
    (life13_786)[life14_788] = ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(life12_708)).get(((int)(life14_788))))))).intValue();
    life14_788 += 1;
    if (!((life5_22 == null))) {
        break lexical_join_557;
    }
    if (!((life5_22 != null))) { continue lexical_cycle_511; }
    break lexical_cycle_511;
    }
    }
    spill1389_27 = this.a;
    if (!((life5_22 == null))) {
        lexicalValue1389_535_0 = spill1389_27;
        break lexical_join_535;
    }
    if (!((spill1389_27 != null))) {
        break lexical_join_557;
    }
    lexicalValue1389_535_0 = this.a;
    }
    spill1389_28 = ((net.minecraft.item.ItemStack)(lexicalValue1389_535_0)).e__Boolean();
    if (!((life5_22 == null))) {
        lexicalValue1389_558_0 = ((spill1389_28) ? 1 : 0);
        break lexical_join_558;
    }
    if (!(spill1389_28)) {
        break lexical_join_557;
    }
    life14_834 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(this.a)).a__yw())).a__yw(((java.lang.String)("Explosion")));
    spill1389_29 = life14_834;
    if (!((life5_22 == null))) {
        lexicalValue1389_552_0 = spill1389_29;
        break lexical_join_552;
    }
    if (!((spill1389_29 == null))) {
        break lexical_join_551;
    }
    return ((0) != 0);
    }
    lexicalValue1389_552_0 = life14_834;
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1389_552_0)).a(((java.lang.String)("FadeColors")), ((int[])(life13_786)));
    return ((1) != 0);
    }
    lexicalValue1389_558_0 = 0;
    }
    return ((lexicalValue1389_558_0) != 0);
    }
    lexicalValue1389_560_0 = 0;
    }
    return ((lexicalValue1389_560_0) != 0);
    }
    lexicalValue1389_562_0 = 0;
    }
    return ((lexicalValue1389_562_0) != 0);
}


public net.minecraft.item.ItemStack a__xW(moom.wx p0) {
return ((net.minecraft.item.ItemStack)(this.a)).a__xW();
}


public int a() {
long local1 = (moom.x1.b ^ 45006109654165L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1697_1(16756, (6185660929769961617L ^ local1));
}


public net.minecraft.item.ItemStack a__xW() {
return this.a;
}


public net.minecraft.item.ItemStack[] a__ArrayxW(moom.wx p0) {
java.lang.String spill1390_0;
    long life2_3;
    net.minecraft.item.ItemStack[] life5_8;
    int life6_10;
    java.lang.String life4_11;
    net.minecraft.item.ItemStack life7_19;
    lexical_join_40: {
    life2_3 = (moom.x1.b ^ 84670286501213L);
    spill1390_0 = moom.ye.b();
    life5_8 = new net.minecraft.item.ItemStack[((moom.wx)(p0)).b__Int()];
    life6_10 = 0;
    life4_11 = spill1390_0;
    lexical_cycle_12: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life6_10 < (life5_8).length))) {
        break lexical_join_40;
    }
    life7_19 = ((moom.wx)(p0)).a__xW(((int)(life6_10)));
    if (!((life4_11 == null))) {
        break lexical_join_38;
    }
    if (!((life7_19 != null))) {
        break lexical_join_37;
    }
    if (!(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).f())) {
        break lexical_join_37;
    }
    (life5_8)[life6_10] = new net.minecraft.item.ItemStack(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life7_19)).a__wQ())).b__wQ());
    }
    life6_10 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life5_8;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9649_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02959d7480d7_invokedynamic1389_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02959d7480d7_invokedynamic1389_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02959d7480d7_invokedynamic1389_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1697_1(int a0, long a1) throws E;
}
