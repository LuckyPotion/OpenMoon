package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class p0 extends net.minecraft.command.CommandBase {

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map g;

public p0() {
super();
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-1604763308463567253L)), ((long)(-5533886445762957764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112482119350661L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.p0.c ^ 96151909491185L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill958_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill958_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill958_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill958_14 = new byte[8];
    (__sourceSpill958_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill958_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation958_16 = __sourceSpill958_14;
    ((javax.crypto.Cipher)(__sourceSpill958_11)).init(((int)(__sourceSpill958_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill958_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation958_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "kv½éï$\023åÀ8è\tùL,w"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill958_25 = local6_life21;
        int __sourceSpill958_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill958_25)).substring(((int)(__sourceSpill958_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill958_30 = local8_life19;
        int __sourceSpill958_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill958_33 = new byte[8];
        (__sourceSpill958_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill958_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill958_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill958_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill958_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill958_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill958_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill958_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill958_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill958_34)).doFinal(((byte[])(__sourceSpill958_33)));
        (__sourceSpill958_30)[__sourceSpill958_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_c26e0834edc31646e6e4(moom.p0 a0, net.minecraft.command.ICommandSender a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_c26e0834edc31646e6e4 {

public static void f141(moom.p0 receiver, net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws Throwable {
    int lexicalValue141_44_0;
    int lexicalValue141_46_0;
    int lexicalValue141_139_0;
    boolean spill141_0;
    int spill141_1;
    int spill141_2;
    long life3_3;
    java.util.List life6_8;
    int life5_9;
    int life7_15;
    int life8_26;
    int life9_28;
    int life9_51;
    int life10_104;
    moom.CN life11_125;
    int life12_141;
    net.minecraft.command.ICommand life13_149;
    moom.CN life14_158;
    moom.CN life12_200;
    lexical_join_155: {
    lexical_join_139: {
    lexical_join_133: {
    lexical_join_46: {
    lexical_join_44: {
    lexical_join_36: {
    life3_3 = (__fieldRead141_0() ^ 114822948441164L);
    spill141_0 = __call141_1();
    life6_8 = __call141_2(receiver, p0);
    life5_9 = __integerCategory141_3(spill141_0);
    life7_15 = __invokedynamic141_4(16940, (5318316386693711364L ^ life3_3));
    life8_26 = ((__call141_5(life6_8) - 1) / __invokedynamic141_6(24125, (3811374262021790228L ^ life3_3)));
    life9_28 = 0;
    spill141_1 = (p1).length;
    if (!((life5_9 != 0))) {
        lexicalValue141_44_0 = spill141_1;
        break lexical_join_44;
    }
    if (!((spill141_1 == 0))) {
        break lexical_join_36;
    }
    lexicalValue141_46_0 = 0;
    break lexical_join_46;
    }
    lexicalValue141_44_0 = __call141_7((p1)[0], 1, (life8_26 + 1));
    }
    lexicalValue141_46_0 = (lexicalValue141_44_0 - 1);
    }
    life9_51 = lexicalValue141_46_0;
    life10_104 = __call141_10(((life9_51 + 1) * __invokedynamic141_8(24125, (3811374262021790228L ^ life3_3))), __call141_9(life6_8));
    life11_125 = new moom.CN("commands.help.header", new java.lang.Object[] {__call141_11((life9_51 + 1)), __call141_12((life8_26 + 1))});
    __call141_15(__call141_13(life11_125), __fieldRead141_14());
    __call141_16(p0, life11_125);
    life12_141 = (life9_51 * __invokedynamic141_17(24125, (3811374262021790228L ^ life3_3)));
    lexical_cycle_97: while (true) {
    if (!((life12_141 < life10_104))) {
        break lexical_join_133;
    }
    life13_149 = __cast141_19(__call141_18(life6_8, life12_141));
    life14_158 = new moom.CN(__call141_20(life13_149, p0), new java.lang.Object[0]);
    __call141_25(__call141_21(life14_158), new moom.v2(__fieldRead141_22(), __invokedynamic141_24(__call141_23(life13_149))));
    __call141_26(p0, life14_158);
    life12_141 += 1;
    if (!((life5_9 != 0))) {
        break lexical_join_155;
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_97; }
    break lexical_cycle_97;
    }
    }
    spill141_2 = life9_51;
    if (!((life5_9 != 0))) {
        lexicalValue141_139_0 = spill141_2;
        break lexical_join_139;
    }
    if (!((spill141_2 == 0))) {
        break lexical_join_155;
    }
    lexicalValue141_139_0 = __instanceOf141_27(p0);
    }
    if (!((lexicalValue141_139_0 != 0))) {
        break lexical_join_155;
    }
    life12_200 = new moom.CN("commands.help.footer", new java.lang.Object[0]);
    __call141_30(__call141_28(life12_200), __fieldRead141_29());
    __call141_31(p0, life12_200);
    }
    return;
}
public static void h141_0(moom.b_ p0) throws Throwable {
    throw __call3014100_0(p0);
}
public static void h141_1(moom.b_ p0) throws Throwable {
    throw __call3014101_0(p0);
}
public static void h141_2(moom.b_ p0, moom.p0 p1, net.minecraft.command.ICommandSender p2, java.lang.String[] p3, int p4, moom.CN p5) throws Throwable {
    moom.b_ life4_2;
    java.util.Map life5_5;
    net.minecraft.command.ICommand life6_12;
    life4_2 = p0;
    life5_5 = __call3014102_0(p1);
    life6_12 = __cast3014102_2(__call3014102_1(life5_5, (p3)[0]));
    if ((life6_12 != null)) {
        throw new moom.cc(__call3014102_3(life6_12, p2), new java.lang.Object[0]);
    }
    if ((__call3014102_4((p3)[0], -1) != -1)) {
        throw life4_2;
    }
    throw new moom.b8();
}
public static void h141_3(moom.b_ p0) throws Throwable {
    throw __call3014103_0(p0);
}
public static void h141_4(moom.b_ p0) throws Throwable {
    throw __call3014104_0(p0);
}
public static void h141_5(moom.b_ p0) throws Throwable {
    throw __call3014105_0(p0);
}
public static void h141_6(moom.b_ p0) throws Throwable {
    throw __call3014106_0(p0);
}
public static void h141_7(moom.b_ p0) throws Throwable {
    throw __call3014107_0(p0);
}
private static native long __fieldRead141_0() throws Throwable;
private static native boolean __call141_1() throws Throwable;
private static native java.util.List __call141_2(moom.p0 a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __integerCategory141_3(boolean value) throws Throwable;
private static native int __invokedynamic141_4(int a0, long a1) throws Throwable;
private static native int __call141_5(java.util.List a0) throws Throwable;
private static native int __invokedynamic141_6(int a0, long a1) throws Throwable;
private static native int __call141_7(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic141_8(int a0, long a1) throws Throwable;
private static native int __call141_9(java.util.List a0) throws Throwable;
private static native int __call141_10(int a0, int a1) throws Throwable;
private static native java.lang.Integer __call141_11(int a0) throws Throwable;
private static native java.lang.Integer __call141_12(int a0) throws Throwable;
private static native moom.CO __call141_13(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead141_14() throws Throwable;
private static native moom.CO __call141_15(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call141_16(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native int __invokedynamic141_17(int a0, long a1) throws Throwable;
private static native java.lang.Object __call141_18(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.command.ICommand __cast141_19(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call141_20(net.minecraft.command.ICommand a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native moom.CO __call141_21(moom.CN a0) throws Throwable;
private static native net.minecraft.event.ClickEvent$Action __fieldRead141_22() throws Throwable;
private static native java.lang.String __call141_23(net.minecraft.command.ICommand a0) throws Throwable;
private static native java.lang.String __invokedynamic141_24(java.lang.String a0) throws Throwable;
private static native moom.CO __call141_25(moom.CO a0, moom.v2 a1) throws Throwable;
private static native void __call141_26(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native int __instanceOf141_27(net.minecraft.command.ICommandSender a0) throws Throwable;
private static native moom.CO __call141_28(moom.CN a0) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead141_29() throws Throwable;
private static native moom.CO __call141_30(moom.CO a0, net.minecraft.util.EnumChatFormatting a1) throws Throwable;
private static native void __call141_31(net.minecraft.command.ICommandSender a0, moom.CN a1) throws Throwable;
private static native moom.b_ __call3014100_0(moom.b_ a0) throws Throwable;
private static native moom.b_ __call3014101_0(moom.b_ a0) throws Throwable;
private static native java.util.Map __call3014102_0(moom.p0 a0) throws Throwable;
private static native java.lang.Object __call3014102_1(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.command.ICommand __cast3014102_2(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call3014102_3(net.minecraft.command.ICommand a0, net.minecraft.command.ICommandSender a1) throws Throwable;
private static native int __call3014102_4(java.lang.String a0, int a1) throws Throwable;
private static native moom.b_ __call3014103_0(moom.b_ a0) throws Throwable;
private static native moom.b_ __call3014104_0(moom.b_ a0) throws Throwable;
private static native moom.b_ __call3014105_0(moom.b_ a0) throws Throwable;
private static native moom.b_ __call3014106_0(moom.b_ a0) throws Throwable;
private static native moom.b_ __call3014107_0(moom.b_ a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8628_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/p0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20311;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/p0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.p0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__sourceReturn_abea8daec3(net.minecraft.command.ICommandSender p0) {
return "commands.help.usage";
}


private static moom.b_ a(moom.b_ p0) {
return p0;
}


public int a() {
return 0;
}


public java.lang.String a__String() {
return "help";
}


protected java.util.Map<java.lang.String, net.minecraft.command.ICommand> a__Map() {
return ((net.minecraft.command.ICommandManager)(((moom.Bl)(moom.Bl.a__Bl())).a__qS())).a();
}


public void a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1) throws moom.b7 { __sourceHandlerCall_c26e0834edc31646e6e4(this, p0, p1); }


protected java.util.List<net.minecraft.command.ICommand> a__List(net.minecraft.command.ICommandSender p0) {
java.lang.Object local2 = ((net.minecraft.command.ICommandManager)(((moom.Bl)(moom.Bl.a__Bl())).a__qS())).a(((net.minecraft.command.ICommandSender)(p0)));
    java.util.Collections.sort(((java.util.List)(local2)));
    return ((java.util.List<net.minecraft.command.ICommand>)(local2));
}


public java.util.List<java.lang.String> a__List() {
return java.util.List.of((("?")));
}


public java.util.List<java.lang.String> a(net.minecraft.command.ICommandSender p0, java.lang.String[] p1, moom.DT p2) {
long local4 = (moom.p0.c ^ 52117786287567L);
    if (((p1).length == 1)) {
        java.util.Set local6 = ((java.util.Map)(((moom.p0)(this)).a__Map())).keySet();
        return __sourceExactCall_ce7ad4af7ecf4b(((java.lang.String[])(p1)), ((java.lang.String[])(((java.lang.String[])(((java.util.Set)(local6)).toArray(((java.lang.Object[])(new java.lang.String[0]))))))));
    }
    return null;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8628_0() throws E;

private static native java.util.List __sourceExactCall_ce7ad4af7ecf4b(java.lang.String[] p0, java.lang.String[] p1);
}
