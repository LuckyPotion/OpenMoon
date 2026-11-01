package net.minecraft.scoreboard;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Scoreboard {

private java.util.Map<java.lang.String, net.minecraft.scoreboard.ScoreObjective> a;

private java.util.Map<net.minecraft.scoreboard.IScoreObjectiveCriteria, java.util.List<net.minecraft.scoreboard.ScoreObjective>> b;

private java.util.Map<java.lang.String, java.util.Map<net.minecraft.scoreboard.ScoreObjective, net.minecraft.scoreboard.Score>> c;

private net.minecraft.scoreboard.ScoreObjective[] d;

private java.util.Map<java.lang.String, moom.Bk> e;

private java.util.Map<java.lang.String, moom.Bk> f;

private static java.lang.String[] g;

private static long k;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

public Scoreboard() { super(); }


private static void __sourceConstructorBody_dc6209d5236a8e7e(net.minecraft.scoreboard.Scoreboard receiver) throws Throwable {

long local1 = (net.minecraft.scoreboard.Scoreboard.k ^ 41258774844562L);

    net.minecraft.scoreboard.Scoreboard.__sourceConstructorInit_dc6209d5236a8e7e_0(((net.minecraft.scoreboard.Scoreboard)(receiver)));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).d = ((net.minecraft.scoreboard.ScoreObjective[])(new net.minecraft.scoreboard.ScoreObjective[__sourceIntrinsic_dc6209d5236a8e7e_originalDynamicSite3949_8(9585, (5387255976092573659L ^ local1))]));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).e = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    ((net.minecraft.scoreboard.Scoreboard)(receiver)).f = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));

    return;

}



static {
k = ((long)(((moom._a)(moom._c.a(((long)(1129720618883325100L)), ((long)(8881469175613437365L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(78122692878641L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.scoreboard.Scoreboard.k ^ 94520468423866L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1915_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1915_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1915_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1915_14 = new byte[8];
    (__sourceSpill1915_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1915_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1915_16 = __sourceSpill1915_14;
    ((javax.crypto.Cipher)(__sourceSpill1915_11)).init(((int)(__sourceSpill1915_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1915_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1915_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "°Æk9k\007°¯ØI*;ò\022ª®üÚ¬l¾QS\177³Ä\031¹49èUýº2"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1915_25 = local6_life21;
        int __sourceSpill1915_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1915_25)).substring(((int)(__sourceSpill1915_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1915_30 = local8_life19;
        int __sourceSpill1915_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1915_33 = new byte[8];
        (__sourceSpill1915_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1915_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1915_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1915_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1915_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1915_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1915_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1915_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1915_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1915_34)).doFinal(((byte[])(__sourceSpill1915_33)));
        (__sourceSpill1915_30)[__sourceSpill1915_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "4R$Ð\003<=3Ô]­w¹m<¹"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1915_38 = local6_life21;
        int __sourceSpill1915_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1915_38)).substring(((int)(__sourceSpill1915_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1915_43 = local8_life19;
        int __sourceSpill1915_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1915_46 = new byte[8];
        (__sourceSpill1915_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1915_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1915_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1915_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1915_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1915_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1915_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1915_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1915_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1915_47)).doFinal(((byte[])(__sourceSpill1915_46)));
        (__sourceSpill1915_43)[__sourceSpill1915_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    m = ((long[])(local8_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[7]));
    g = ((java.lang.String[])(null));
}

private static native <E extends Throwable> void __sourceConstructorInit_dc6209d5236a8e7e_0(net.minecraft.scoreboard.Scoreboard a0) throws E;

public moom.Bk b(java.lang.String p0) {
moom.Bk forwardValue5573_50_0;
    moom.Bk spill5573_0;
    long life2_3;
    java.lang.String[] life4_5;
    moom.Bk life5_25;
    moom.Bk life5_46;
    forward_join_50: {
    forward_join_34: {
    forward_join_20: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 113777431791709L);
    life4_5 = moom.Bj.b__ArrayString();
    if (!((((java.lang.String)(p0)).length() > __sourceIntrinsic_845b9d51acd5_invokedynamic5573_3(28832, (2505134408995624640L ^ life2_3))))) {
        break forward_join_20;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_845b9d51acd5_invokedynamic5573_4(p0));
    }
    life5_25 = ((net.minecraft.scoreboard.Scoreboard)(this)).a__Bk(((java.lang.String)(p0)));
    spill5573_0 = life5_25;
    if (!((life4_5 != null))) {
        forwardValue5573_50_0 = spill5573_0;
        break forward_join_50;
    }
    if (!((spill5573_0 != null))) {
        break forward_join_34;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_845b9d51acd5_invokedynamic5573_6(p0));
    }
    life5_46 = new moom.Bk(this, p0);
    ((java.util.Map)(this.e)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life5_46)));
    ((net.minecraft.scoreboard.Scoreboard)(this)).b(((moom.Bk)(life5_46)));
    forwardValue5573_50_0 = life5_46;
    }
    return forwardValue5573_50_0;
}


public void b__Void(net.minecraft.scoreboard.ScoreObjective p0) {
return;
}


public java.util.Collection<java.lang.String> b() {
return ((java.util.Map)(this.c)).keySet();
}


public void b(java.lang.String p0, net.minecraft.scoreboard.ScoreObjective p1) {
return;
}


public void b(moom.Bk p0) {
return;
}


public java.util.Collection<moom.Bk> e() {
return ((java.util.Map)(this.e)).values();
}


public void c(net.minecraft.scoreboard.ScoreObjective p0) {
return;
}


public moom.Bk c(java.lang.String p0) {
return ((moom.Bk)(((java.util.Map)(this.f)).get(((java.lang.Object)(p0)))));
}


public java.util.Collection<net.minecraft.scoreboard.Score> c() {
java.util.ArrayList lexicalValue1649_32_0;
    java.lang.String[] spill1649_0;
    java.util.ArrayList spill1649_1;
    long life1_3;
    java.util.Collection life4_8;
    java.util.ArrayList life5_10;
    java.util.Iterator life6_13;
    java.lang.String[] life3_14;
    java.util.Map life7_21;
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 32451841548919L);
    spill1649_0 = moom.Bj.b__ArrayString();
    life4_8 = ((java.util.Map)(this.c)).values();
    life5_10 = com.google.common.collect.Lists.newArrayList();
    life6_13 = ((java.util.Collection)(life4_8)).iterator();
    life3_14 = spill1649_0;
    lexical_cycle_15: while (true) {
    if (!(((java.util.Iterator)(life6_13)).hasNext())) {
        break lexical_join_31;
    }
    life7_21 = ((java.util.Map)(((java.util.Iterator)(life6_13)).next()));
    spill1649_1 = life5_10;
    if (!((life3_14 != null))) {
        lexicalValue1649_32_0 = spill1649_1;
        break lexical_join_32;
    }
    ((java.util.List)(spill1649_1)).addAll(((java.util.Collection)(((java.util.Map)(life7_21)).values())));
    if (!((life3_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue1649_32_0 = life5_10;
    }
    return lexicalValue1649_32_0;
}


public void c(moom.Bk p0) {
return;
}


public java.util.Collection<java.lang.String> d() {
return ((java.util.Map)(this.e)).keySet();
}


public void d(moom.Bk p0) {
return;
}


public void d(net.minecraft.scoreboard.ScoreObjective p0) {
return;
}


public java.util.Collection<net.minecraft.scoreboard.ScoreObjective> a(net.minecraft.scoreboard.IScoreObjectiveCriteria p0) {
java.util.Collection forwardValue5566_19_0;
    java.util.ArrayList forwardValue5566_20_0;
    java.lang.String[] spill5566_0;
    java.util.Collection spill5566_1;
    long life2_3;
    java.util.Collection life5_10;
    java.lang.String[] life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 14090174171021L);
    spill5566_0 = moom.Bj.b__ArrayString();
    life5_10 = ((java.util.Collection)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
    life4_11 = spill5566_0;
    spill5566_1 = life5_10;
    if (!((life4_11 != null))) {
        forwardValue5566_19_0 = spill5566_1;
        break forward_join_19;
    }
    if (!((spill5566_1 == null))) {
        break forward_join_18;
    }
    forwardValue5566_20_0 = com.google.common.collect.Lists.newArrayList();
    break forward_join_20;
    }
    forwardValue5566_19_0 = life5_10;
    }
    forwardValue5566_20_0 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(forwardValue5566_19_0)));
    }
    return forwardValue5566_20_0;
}


public void a(net.minecraft.scoreboard.Score p0) {
return;
}


public net.minecraft.scoreboard.ScoreObjective a(java.lang.String p0, net.minecraft.scoreboard.IScoreObjectiveCriteria p1) {
java.lang.Object forwardValue5562_46_0;
    net.minecraft.scoreboard.ScoreObjective forwardValue5562_67_0;
    net.minecraft.scoreboard.ScoreObjective spill5562_0;
    net.minecraft.scoreboard.ScoreObjective spill5562_1;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.scoreboard.ScoreObjective life6_25;
    java.util.List life7_54;
    forward_join_67: {
    forward_join_46: {
    forward_join_34: {
    forward_join_20: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 62384577116478L);
    life5_5 = moom.Bj.b__ArrayString();
    if (!((((java.lang.String)(p0)).length() > __sourceIntrinsic_05e2674e6bd2_invokedynamic5562_3(3661, (1625286977245550922L ^ life3_3))))) {
        break forward_join_20;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_05e2674e6bd2_invokedynamic5562_4(p0));
    }
    life6_25 = ((net.minecraft.scoreboard.Scoreboard)(this)).a__Bg(((java.lang.String)(p0)));
    spill5562_0 = life6_25;
    if (!((life5_5 != null))) {
        forwardValue5562_46_0 = spill5562_0;
        break forward_join_46;
    }
    if (!((spill5562_0 != null))) {
        break forward_join_34;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_05e2674e6bd2_invokedynamic5562_6(p0));
    }
    life6_25 = new net.minecraft.scoreboard.ScoreObjective(this, p0, p1);
    forwardValue5562_46_0 = ((java.util.Map)(this.b)).computeIfAbsent(((java.lang.Object)(p1)), ((java.util.function.Function)(__sourceIntrinsic_05e2674e6bd2_invokedynamic5562_8())));
    }
    life7_54 = ((java.util.List)(forwardValue5562_46_0));
    ((java.util.List)(life7_54)).add(((java.lang.Object)(life6_25)));
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_25)));
    ((net.minecraft.scoreboard.Scoreboard)(this)).b__Void(((net.minecraft.scoreboard.ScoreObjective)(life6_25)));
    spill5562_1 = life6_25;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue5562_67_0 = spill5562_1;
        break forward_join_67;
    }
    moom.Bj.b(((java.lang.String[])(new java.lang.String[3])));
    forwardValue5562_67_0 = spill5562_1;
    }
    return forwardValue5562_67_0;
}


public void a__Void(java.lang.String p0) {
return;
}


public net.minecraft.scoreboard.ScoreObjective a__Bg(java.lang.String p0) {
return ((net.minecraft.scoreboard.ScoreObjective)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15152;
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
            throw new RuntimeException("moom/Bh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.scoreboard.Scoreboard.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12124_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(int p0) {
int forwardValue567_17_0;
    int forwardValue567_27_0;
    int forwardValue567_27_1;
    int forwardValue567_32_0;
    int forwardValue567_32_1;
    net.minecraft.util.EnumChatFormatting forwardValue567_40_0;
    net.minecraft.util.EnumChatFormatting forwardValue567_45_0;
    int spill567_0;
    int spill567_1;
    net.minecraft.util.EnumChatFormatting spill567_2;
    long life1_3;
    java.lang.String[] life3_5;
    net.minecraft.util.EnumChatFormatting life4_50;
    forward_join_48: {
    forward_join_45: {
    forward_join_40: {
    forward_join_32: {
    forward_join_27: {
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    forward_join_12: {
    forward_join_10: {
    life1_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 1377757903049L);
    life3_5 = moom.Bj.b__ArrayString();
    spill567_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue567_17_0 = spill567_0;
        break forward_join_17;
    }
    switch (spill567_0) {
case 0:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_12;
    }
case 2:
{
        break forward_join_14;
    }
default:
{
        break forward_join_16;
    }
}
    }
    return "list";
    }
    return "sidebar";
    }
    return "belowName";
    }
    forwardValue567_17_0 = p0;
    }
    spill567_1 = 3;
    if (!((life3_5 != null))) {
        forwardValue567_27_0 = forwardValue567_17_0;
        forwardValue567_27_1 = spill567_1;
        break forward_join_27;
    }
    if (!((forwardValue567_17_0 >= spill567_1))) {
        break forward_join_48;
    }
    forwardValue567_27_0 = p0;
    forwardValue567_27_1 = __sourceIntrinsic_008018dcd7e9_invokedynamic567_2(14026, (4476573285283913791L ^ life1_3));
    }
    if (!((life3_5 != null))) {
        forwardValue567_32_0 = forwardValue567_27_0;
        forwardValue567_32_1 = forwardValue567_27_1;
        break forward_join_32;
    }
    if (!((forwardValue567_27_0 <= forwardValue567_27_1))) {
        break forward_join_48;
    }
    forwardValue567_32_0 = p0;
    forwardValue567_32_1 = 3;
    }
    life4_50 = net.minecraft.util.EnumChatFormatting.a(((int)((forwardValue567_32_0 - forwardValue567_32_1))));
    spill567_2 = life4_50;
    if (!((life3_5 != null))) {
        forwardValue567_40_0 = spill567_2;
        break forward_join_40;
    }
    if (!((spill567_2 != null))) {
        break forward_join_48;
    }
    forwardValue567_40_0 = life4_50;
    }
    if (!((life3_5 != null))) {
        forwardValue567_45_0 = forwardValue567_40_0;
        break forward_join_45;
    }
    if (!((forwardValue567_40_0 != net.minecraft.util.EnumChatFormatting.RESET))) {
        break forward_join_48;
    }
    forwardValue567_45_0 = life4_50;
    }
    return __sourceIntrinsic_008018dcd7e9_invokedynamic567_6(((net.minecraft.util.EnumChatFormatting)(forwardValue567_45_0)).a__String());
    }
    return null;
}


public static int a(java.lang.String p0) {
int forwardValue5559_17_0;
    int forwardValue5559_25_0;
    int forwardValue5559_33_0;
    net.minecraft.util.EnumChatFormatting forwardValue5559_49_0;
    int forwardValue5559_59_0;
    boolean spill5559_0;
    net.minecraft.util.EnumChatFormatting spill5559_1;
    int spill5559_2;
    long life1_3;
    java.lang.String[] life3_5;
    java.lang.String life4_58;
    net.minecraft.util.EnumChatFormatting life5_61;
    forward_join_59: {
    forward_join_58: {
    forward_join_49: {
    forward_join_33: {
    forward_join_30: {
    forward_join_25: {
    forward_join_22: {
    forward_join_17: {
    forward_join_14: {
    life1_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 51814558402443L);
    life3_5 = moom.Bj.b__ArrayString();
    spill5559_0 = ((java.lang.String)(p0)).equalsIgnoreCase(((java.lang.String)("list")));
    if (!((life3_5 != null))) {
        forwardValue5559_17_0 = ((spill5559_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill5559_0)) {
        break forward_join_14;
    }
    return 0;
    }
    forwardValue5559_17_0 = ((((java.lang.String)(p0)).equalsIgnoreCase(((java.lang.String)("sidebar")))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5559_25_0 = forwardValue5559_17_0;
        break forward_join_25;
    }
    if (!((forwardValue5559_17_0 != 0))) {
        break forward_join_22;
    }
    return 1;
    }
    forwardValue5559_25_0 = ((((java.lang.String)(p0)).equalsIgnoreCase(((java.lang.String)("belowName")))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5559_33_0 = forwardValue5559_25_0;
        break forward_join_33;
    }
    if (!((forwardValue5559_25_0 != 0))) {
        break forward_join_30;
    }
    return 2;
    }
    forwardValue5559_33_0 = ((((java.lang.String)(p0)).startsWith(((java.lang.String)("sidebar.team.")))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue5559_59_0 = forwardValue5559_33_0;
        break forward_join_59;
    }
    if (!((forwardValue5559_33_0 != 0))) {
        break forward_join_58;
    }
    life4_58 = ((java.lang.String)(p0)).substring(((int)(((java.lang.String)("sidebar.team.")).length())));
    life5_61 = net.minecraft.util.EnumChatFormatting.a__br(((java.lang.String)(life4_58)));
    spill5559_1 = life5_61;
    if (!((life3_5 != null))) {
        forwardValue5559_49_0 = spill5559_1;
        break forward_join_49;
    }
    if (!((spill5559_1 != null))) {
        break forward_join_58;
    }
    forwardValue5559_49_0 = life5_61;
    }
    spill5559_2 = ((net.minecraft.util.EnumChatFormatting)(forwardValue5559_49_0)).a();
    if (!((life3_5 != null))) {
        forwardValue5559_59_0 = spill5559_2;
        break forward_join_59;
    }
    if (!((spill5559_2 >= 0))) {
        break forward_join_58;
    }
    return (((net.minecraft.util.EnumChatFormatting)(life5_61)).a() + 3);
    }
    forwardValue5559_59_0 = -1;
    }
    return forwardValue5559_59_0;
}


public static java.lang.String[] a__ArrayString() {
java.lang.String[] lexicalValue1647_37_0;
    java.lang.String[] spill1647_0;
    java.lang.String[] spill1647_1;
    long life0_3;
    java.lang.String[] life2_5;
    int life3_21;
    lexical_join_37: {
    lexical_join_36: {
    life0_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 78621934889117L);
    life2_5 = moom.Bj.b__ArrayString();
    spill1647_0 = net.minecraft.scoreboard.Scoreboard.g;
    if (!((life2_5 != null))) {
        lexicalValue1647_37_0 = spill1647_0;
        break lexical_join_37;
    }
    if (!((spill1647_0 == null))) {
        break lexical_join_36;
    }
    g = ((java.lang.String[])(new java.lang.String[__sourceIntrinsic_b40ddfd35a1d_invokedynamic1647_3(29356, (6662001637269845002L ^ life0_3))]));
    life3_21 = 0;
    lexical_cycle_19: while (true) {
    if (!((life3_21 < __sourceIntrinsic_b40ddfd35a1d_invokedynamic1647_5(9585, (5387152618609402836L ^ life0_3))))) {
        break lexical_join_36;
    }
    spill1647_1 = net.minecraft.scoreboard.Scoreboard.g;
    if (!((life2_5 != null))) {
        lexicalValue1647_37_0 = spill1647_1;
        break lexical_join_37;
    }
    (spill1647_1)[life3_21] = net.minecraft.scoreboard.Scoreboard.a(((int)(life3_21)));
    life3_21 += 1;
    if (!((life2_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    lexicalValue1647_37_0 = net.minecraft.scoreboard.Scoreboard.g;
    }
    return lexicalValue1647_37_0;
}


public void a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue5565_11_0;
    int forwardValue5565_19_0;
    net.minecraft.entity.Entity forwardValue5565_21_0;
    net.minecraft.entity.Entity spill5565_0;
    int spill5565_1;
    net.minecraft.entity.Entity spill5565_2;
    long life2_3;
    java.lang.String[] life4_5;
    java.lang.String life5_35;
    forward_join_32: {
    forward_join_21: {
    forward_join_19: {
    forward_join_11: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 115996206011192L);
    life4_5 = moom.Bj.b__ArrayString();
    spill5565_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue5565_11_0 = spill5565_0;
        break forward_join_11;
    }
    if (!((spill5565_0 != null))) {
        break forward_join_32;
    }
    forwardValue5565_11_0 = p0;
    }
    spill5565_1 = ((forwardValue5565_11_0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue5565_19_0 = spill5565_1;
        break forward_join_19;
    }
    if (!((spill5565_1 == 0))) {
        break forward_join_32;
    }
    spill5565_2 = p0;
    if (!((life4_5 != null))) {
        forwardValue5565_21_0 = spill5565_2;
        break forward_join_21;
    }
    forwardValue5565_19_0 = ((((net.minecraft.entity.Entity)(spill5565_2)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5565_19_0 == 0))) {
        break forward_join_32;
    }
    forwardValue5565_21_0 = p0;
    }
    life5_35 = ((java.util.UUID)(((net.minecraft.entity.Entity)(forwardValue5565_21_0)).a__UUID())).toString();
    ((net.minecraft.scoreboard.Scoreboard)(this)).a__Void(((java.lang.String)(life5_35)), ((net.minecraft.scoreboard.ScoreObjective)(null)));
    ((net.minecraft.scoreboard.Scoreboard)(this)).a__Boolean(((java.lang.String)(life5_35)));
    }
    return;
}


public void a(int p0, net.minecraft.scoreboard.ScoreObjective p1) {
(this.d)[p0] = p1;
    return;
}


public net.minecraft.scoreboard.ScoreObjective a__Bg(int p0) {
return (this.d)[p0];
}


public moom.Bk a__Bk(java.lang.String p0) {
return ((moom.Bk)(((java.util.Map)(this.e)).get(((java.lang.Object)(p0)))));
}


public java.util.Collection<net.minecraft.scoreboard.Score> a(net.minecraft.scoreboard.ScoreObjective p0) {
java.lang.String[] spill1646_0;
    long life2_3;
    java.util.ArrayList life5_6;
    java.util.Iterator life6_11;
    java.lang.String[] life4_12;
    java.util.Map life7_19;
    net.minecraft.scoreboard.Score life8_24;
    lexical_join_38: {
    lexical_join_35: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 3658808789903L);
    spill1646_0 = moom.Bj.b__ArrayString();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life6_11 = ((java.util.Collection)(((java.util.Map)(this.c)).values())).iterator();
    life4_12 = spill1646_0;
    lexical_cycle_13: while (true) {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life6_11)).hasNext())) {
        break lexical_join_35;
    }
    life7_19 = ((java.util.Map)(((java.util.Iterator)(life6_11)).next()));
    life8_24 = ((net.minecraft.scoreboard.Score)(((java.util.Map)(life7_19)).get(((java.lang.Object)(p0)))));
    if (!((life4_12 != null))) {
        break lexical_join_38;
    }
    if (!((life8_24 != null))) {
        break lexical_join_33;
    }
    ((java.util.List)(life5_6)).add(((java.lang.Object)(life8_24)));
    }
    if (!((life4_12 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    ((java.util.List)(life5_6)).sort(((java.util.Comparator)(net.minecraft.scoreboard.Score.a)));
    }
    return life5_6;
}


public void a__Void(net.minecraft.scoreboard.ScoreObjective p0) {
net.minecraft.scoreboard.Scoreboard lexicalValue1648_32_0;
    int lexicalValue1648_32_1;
    java.lang.Object lexicalValue1648_42_0;
    java.util.Collection lexicalValue1648_55_0;
    java.lang.String[] spill1648_0;
    net.minecraft.scoreboard.Scoreboard spill1648_1;
    int spill1648_2;
    net.minecraft.scoreboard.ScoreObjective spill1648_3;
    java.util.List spill1648_4;
    long life2_3;
    int life5_12;
    java.lang.String[] life4_13;
    java.util.List life5_52;
    java.util.Iterator life6_71;
    java.util.Map life7_78;
    lexical_join_75: {
    lexical_join_72: {
    lexical_join_55: {
    lexical_join_52: {
    lexical_join_42: {
    lexical_join_37: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 13021181142799L);
    spill1648_0 = moom.Bj.b__ArrayString();
    ((java.util.Map)(this.a)).remove(((java.lang.Object)(((net.minecraft.scoreboard.ScoreObjective)(p0)).a())));
    life5_12 = 0;
    life4_13 = spill1648_0;
    lexical_cycle_14: while (true) {
    lexical_join_34: {
    lexical_join_32: {
    if (!((life5_12 < __sourceIntrinsic_59590b2ceed6_invokedynamic1648_5(9585, (5387235983360470086L ^ life2_3))))) {
        break lexical_join_37;
    }
    spill1648_1 = this;
    spill1648_2 = life5_12;
    if (!((life4_13 != null))) {
        lexicalValue1648_32_0 = spill1648_1;
        lexicalValue1648_32_1 = spill1648_2;
        break lexical_join_32;
    }
    spill1648_3 = ((net.minecraft.scoreboard.Scoreboard)(spill1648_1)).a__Bg(((int)(spill1648_2)));
    if (!((life4_13 != null))) {
        lexicalValue1648_42_0 = spill1648_3;
        break lexical_join_42;
    }
    if (!((spill1648_3 == p0))) {
        break lexical_join_34;
    }
    lexicalValue1648_32_0 = this;
    lexicalValue1648_32_1 = life5_12;
    }
    ((net.minecraft.scoreboard.Scoreboard)(lexicalValue1648_32_0)).a(((int)(lexicalValue1648_32_1)), ((net.minecraft.scoreboard.ScoreObjective)(null)));
    }
    life5_12 += 1;
    if (!((life4_13 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1648_42_0 = ((java.util.Map)(this.b)).get(((java.lang.Object)(((net.minecraft.scoreboard.ScoreObjective)(p0)).a__Bb())));
    }
    life5_52 = ((java.util.List)(lexicalValue1648_42_0));
    spill1648_4 = life5_52;
    if (!((life4_13 != null))) {
        lexicalValue1648_55_0 = spill1648_4;
        break lexical_join_55;
    }
    if (!((spill1648_4 != null))) {
        break lexical_join_52;
    }
    ((java.util.List)(life5_52)).remove(((java.lang.Object)(p0)));
    }
    lexicalValue1648_55_0 = ((java.util.Map)(this.c)).values();
    }
    life6_71 = ((java.util.Collection)(lexicalValue1648_55_0)).iterator();
    lexical_cycle_57: while (true) {
    if (!(((java.util.Iterator)(life6_71)).hasNext())) {
        break lexical_join_72;
    }
    life7_78 = ((java.util.Map)(((java.util.Iterator)(life6_71)).next()));
    ((java.util.Map)(life7_78)).remove(((java.lang.Object)(p0)));
    if (!((life4_13 != null))) {
        break lexical_join_75;
    }
    if (!((life4_13 == null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).d(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    }
    return;
}


public java.util.Map<net.minecraft.scoreboard.ScoreObjective, net.minecraft.scoreboard.Score> a__Map(java.lang.String p0) {
java.util.Map forestValue61_19_0;
    java.lang.String[] spill61_0;
    java.util.Map spill61_1;
    long life2_3;
    java.util.Map life5_10;
    java.lang.String[] life4_11;
    forest_join_19: {
    forest_join_18: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 89597692137156L);
    spill61_0 = moom.Bj.b__ArrayString();
    life5_10 = ((java.util.Map)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
    life4_11 = spill61_0;
    spill61_1 = life5_10;
    if (!((life4_11 != null))) {
        forestValue61_19_0 = spill61_1;
        break forest_join_19;
    }
    if (!((spill61_1 == null))) {
        break forest_join_18;
    }
    life5_10 = com.google.common.collect.Maps.newHashMap();
    }
    forestValue61_19_0 = life5_10;
    }
    return forestValue61_19_0;
}


public void a__Void(java.lang.String p0, net.minecraft.scoreboard.ScoreObjective p1) {
java.lang.Object forwardValue5571_27_0;
    java.lang.Object forwardValue5571_36_0;
    java.util.Map forwardValue5571_49_0;
    net.minecraft.scoreboard.ScoreObjective spill5571_0;
    java.util.Map spill5571_1;
    java.util.Map spill5571_2;
    long life3_3;
    java.lang.String[] life5_5;
    java.util.Map life6_18;
    java.util.Map life6_37;
    net.minecraft.scoreboard.Score life7_52;
    java.util.Map life8_70;
    forward_join_63: {
    forward_join_57: {
    forward_join_55: {
    forward_join_49: {
    forward_join_36: {
    forward_join_27: {
    forward_join_23: {
    forward_join_21: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 112158828753615L);
    life5_5 = moom.Bj.b__ArrayString();
    spill5571_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue5571_27_0 = spill5571_0;
        break forward_join_27;
    }
    if (!((spill5571_0 == null))) {
        break forward_join_23;
    }
    life6_18 = ((java.util.Map)(((java.util.Map)(this.c)).remove(((java.lang.Object)(p0)))));
    if (!((life6_18 != null))) {
        break forward_join_21;
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).a__Void(((java.lang.String)(p0)));
    }
    if (!((life5_5 == null))) {
        break forward_join_63;
    }
    }
    forwardValue5571_27_0 = ((java.util.Map)(this.c)).get(((java.lang.Object)(p0)));
    }
    life6_37 = ((java.util.Map)(forwardValue5571_27_0));
    spill5571_1 = life6_37;
    if (!((life5_5 != null))) {
        forwardValue5571_36_0 = spill5571_1;
        break forward_join_36;
    }
    if (!((spill5571_1 != null))) {
        break forward_join_63;
    }
    forwardValue5571_36_0 = ((java.util.Map)(life6_37)).remove(((java.lang.Object)(p1)));
    }
    life7_52 = ((net.minecraft.scoreboard.Score)(forwardValue5571_36_0));
    spill5571_2 = life6_37;
    if (!((life5_5 != null))) {
        forwardValue5571_49_0 = spill5571_2;
        break forward_join_49;
    }
    if (!((((java.util.Map)(spill5571_2)).size() < 1))) {
        break forward_join_57;
    }
    forwardValue5571_49_0 = ((java.util.Map)(((java.util.Map)(this.c)).remove(((java.lang.Object)(p0)))));
    }
    life8_70 = forwardValue5571_49_0;
    if (!((life8_70 != null))) {
        break forward_join_55;
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).a__Void(((java.lang.String)(p0)));
    }
    if (!((life5_5 == null))) {
        break forward_join_63;
    }
    }
    if (!((life7_52 != null))) {
        break forward_join_63;
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).b(((java.lang.String)(p0)), ((net.minecraft.scoreboard.ScoreObjective)(p1)));
    }
    return;
}


public boolean a__Boolean(java.lang.String p0) {
long life2_3;
    moom.Bk life5_8;
    java.lang.String[] life4_9;
    forward_join_20: {
    forward_join_18: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 40202640947572L);
    java.lang.String[] spill6229_0 = moom.Bj.b__ArrayString();
    life5_8 = ((net.minecraft.scoreboard.Scoreboard)(this)).c(((java.lang.String)(p0)));
    life4_9 = spill6229_0;
    if (!((life4_9 != null))) { break forward_join_18; }
    if (!((life5_8 != null))) { break forward_join_20; }
    ((net.minecraft.scoreboard.Scoreboard)(this)).a(((java.lang.String)(p0)), ((moom.Bk)(life5_8)));
    }
    return true;
    }
    return false;
}


public void a(java.lang.String p0, moom.Bk p1) {
moom.Bk forwardValue5561_26_0;
    moom.Bk spill5561_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_26: {
    forward_join_20: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 93572100535217L);
    life5_5 = moom.Bj.b__ArrayString();
    spill5561_0 = ((net.minecraft.scoreboard.Scoreboard)(this)).c(((java.lang.String)(p0)));
    if (!((life5_5 != null))) {
        forwardValue5561_26_0 = spill5561_0;
        break forward_join_26;
    }
    if (!((spill5561_0 != p1))) {
        break forward_join_20;
    }
    throw new java.lang.IllegalStateException(__sourceIntrinsic_4a6ce420962b_invokedynamic5561_4(((moom.Bk)(p1)).a__String()));
    }
    ((java.util.Map)(this.f)).remove(((java.lang.Object)(p0)));
    forwardValue5561_26_0 = p1;
    }
    ((java.util.Collection)(((moom.Bk)(forwardValue5561_26_0)).a__Collection())).remove(((java.lang.Object)(p0)));
    return;
}


public net.minecraft.scoreboard.Score a(java.lang.String p0, net.minecraft.scoreboard.ScoreObjective p1) {
java.lang.Object forwardValue5563_27_0;
    net.minecraft.scoreboard.Score forwardValue5563_51_0;
    java.lang.String spill5563_0;
    net.minecraft.scoreboard.Score spill5563_1;
    long life3_3;
    java.lang.String[] life5_5;
    java.util.Map life6_33;
    net.minecraft.scoreboard.Score life7_38;
    forward_join_51: {
    forward_join_50: {
    forward_join_27: {
    forward_join_22: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 136915477633389L);
    life5_5 = moom.Bj.b__ArrayString();
    spill5563_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue5563_27_0 = spill5563_0;
        break forward_join_27;
    }
    if (!((((java.lang.String)(spill5563_0)).length() > __sourceIntrinsic_dc31c56e0076_invokedynamic5563_3(27955, (761453697920604768L ^ life3_3))))) {
        break forward_join_22;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_dc31c56e0076_invokedynamic5563_4(p0));
    }
    forwardValue5563_27_0 = ((java.util.Map)(this.c)).computeIfAbsent(((java.lang.Object)(p0)), ((java.util.function.Function)(__sourceIntrinsic_dc31c56e0076_invokedynamic5563_6())));
    }
    life6_33 = ((java.util.Map)(forwardValue5563_27_0));
    life7_38 = ((net.minecraft.scoreboard.Score)(((java.util.Map)(life6_33)).get(((java.lang.Object)(p1)))));
    spill5563_1 = life7_38;
    if (!((life5_5 != null))) {
        forwardValue5563_51_0 = spill5563_1;
        break forward_join_51;
    }
    if (!((spill5563_1 == null))) {
        break forward_join_50;
    }
    life7_38 = new net.minecraft.scoreboard.Score(this, p1, p0);
    ((java.util.Map)(life6_33)).put(((java.lang.Object)(p1)), ((java.lang.Object)(life7_38)));
    }
    forwardValue5563_51_0 = life7_38;
    }
    return forwardValue5563_51_0;
}


public boolean a__Boolean(java.lang.String p0, net.minecraft.scoreboard.ScoreObjective p1) {
java.lang.Object forwardValue5569_21_0;
    int forwardValue5569_28_0;
    java.lang.String[] spill5569_0;
    java.util.Map spill5569_1;
    long life3_3;
    java.util.Map life6_10;
    java.lang.String[] life5_11;
    net.minecraft.scoreboard.Score life7_27;
    forward_join_28: {
    forward_join_27: {
    forward_join_21: {
    forward_join_18: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 62075240709267L);
    spill5569_0 = moom.Bj.b__ArrayString();
    life6_10 = ((java.util.Map)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
    life5_11 = spill5569_0;
    spill5569_1 = life6_10;
    if (!((life5_11 != null))) {
        forwardValue5569_21_0 = spill5569_1;
        break forward_join_21;
    }
    if (!((spill5569_1 == null))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue5569_21_0 = ((java.util.Map)(life6_10)).get(((java.lang.Object)(p1)));
    }
    life7_27 = ((net.minecraft.scoreboard.Score)(forwardValue5569_21_0));
    if (!((life7_27 != null))) {
        break forward_join_27;
    }
    forwardValue5569_28_0 = 1;
    break forward_join_28;
    }
    forwardValue5569_28_0 = 0;
    }
    return ((forwardValue5569_28_0) != 0);
}


public java.util.Collection<net.minecraft.scoreboard.ScoreObjective> a() {
return ((java.util.Map)(this.a)).values();
}


public void a(moom.Bk p0) {
java.lang.String[] spill1645_0;
    long life2_3;
    java.lang.String[] life4_11;
    java.util.Iterator life5_15;
    java.lang.String life6_22;
    lexical_join_35: {
    lexical_join_32: {
    life2_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 125013999053269L);
    spill1645_0 = moom.Bj.b__ArrayString();
    ((java.util.Map)(this.e)).remove(((java.lang.Object)(((moom.Bk)(p0)).a__String())));
    life4_11 = spill1645_0;
    life5_15 = ((java.util.Collection)(((moom.Bk)(p0)).a__Collection())).iterator();
    lexical_cycle_16: while (true) {
    if (!(((java.util.Iterator)(life5_15)).hasNext())) {
        break lexical_join_32;
    }
    life6_22 = ((java.lang.String)(((java.util.Iterator)(life5_15)).next()));
    ((java.util.Map)(this.f)).remove(((java.lang.Object)(life6_22)));
    if (!((life4_11 != null))) {
        break lexical_join_35;
    }
    if (!((life4_11 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).d(((moom.Bk)(p0)));
    }
    return;
}


public boolean a(java.lang.String p0, java.lang.String p1) {
int forwardValue5560_28_0;
    net.minecraft.scoreboard.Scoreboard forwardValue5560_32_0;
    moom.Bk forwardValue5560_52_0;
    int spill5560_0;
    net.minecraft.scoreboard.Scoreboard spill5560_1;
    moom.Bk spill5560_2;
    long life3_3;
    java.lang.String[] life5_5;
    moom.Bk life6_44;
    forward_join_52: {
    forward_join_45: {
    forward_join_32: {
    forward_join_31: {
    forward_join_28: {
    forward_join_22: {
    life3_3 = (net.minecraft.scoreboard.Scoreboard.k ^ 3136466059939L);
    life5_5 = moom.Bj.b__ArrayString();
    spill5560_0 = ((java.lang.String)(p0)).length();
    if (!((life5_5 != null))) {
        forwardValue5560_28_0 = spill5560_0;
        break forward_join_28;
    }
    if (!((spill5560_0 > __sourceIntrinsic_6282b5e30453_invokedynamic5560_3(14598, (6624243052406429082L ^ life3_3))))) {
        break forward_join_22;
    }
    throw new java.lang.IllegalArgumentException(__sourceIntrinsic_6282b5e30453_invokedynamic5560_4(p0));
    }
    spill5560_1 = this;
    if (!((life5_5 != null))) {
        forwardValue5560_32_0 = spill5560_1;
        break forward_join_32;
    }
    forwardValue5560_28_0 = ((((java.util.Map)(((net.minecraft.scoreboard.Scoreboard)(spill5560_1)).e)).containsKey(((java.lang.Object)(p1)))) ? 1 : 0);
    }
    if (!((forwardValue5560_28_0 == 0))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue5560_32_0 = this;
    }
    life6_44 = ((net.minecraft.scoreboard.Scoreboard)(forwardValue5560_32_0)).a__Bk(((java.lang.String)(p1)));
    spill5560_2 = ((net.minecraft.scoreboard.Scoreboard)(this)).c(((java.lang.String)(p0)));
    if (!((life5_5 != null))) {
        forwardValue5560_52_0 = spill5560_2;
        break forward_join_52;
    }
    if (!((spill5560_2 != null))) {
        break forward_join_45;
    }
    ((net.minecraft.scoreboard.Scoreboard)(this)).a__Boolean(((java.lang.String)(p0)));
    }
    ((java.util.Map)(this.f)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life6_44)));
    forwardValue5560_52_0 = life6_44;
    }
    ((java.util.Collection)(((moom.Bk)(forwardValue5560_52_0)).a__Collection())).add(((java.lang.Object)(p0)));
    return ((1) != 0);
}


private static java.util.List lambda$addScoreObjective$0(net.minecraft.scoreboard.IScoreObjectiveCriteria p0) {
return com.google.common.collect.Lists.newArrayList();
}


private static java.util.Map lambda$getValueFromObjective$1(java.lang.String p0) {
return com.google.common.collect.Maps.newHashMap();
}


private static native <E extends Throwable> int __sourceIntrinsic_dc6209d5236a8e7e_originalDynamicSite3949_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_008018dcd7e9_invokedynamic567_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_008018dcd7e9_invokedynamic567_6(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6282b5e30453_invokedynamic5560_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6282b5e30453_invokedynamic5560_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4a6ce420962b_invokedynamic5561_4(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_05e2674e6bd2_invokedynamic5562_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_05e2674e6bd2_invokedynamic5562_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_05e2674e6bd2_invokedynamic5562_6(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_05e2674e6bd2_invokedynamic5562_8() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_dc31c56e0076_invokedynamic5563_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dc31c56e0076_invokedynamic5563_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_dc31c56e0076_invokedynamic5563_6() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12124_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b40ddfd35a1d_invokedynamic1647_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b40ddfd35a1d_invokedynamic1647_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_59590b2ceed6_invokedynamic1648_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_845b9d51acd5_invokedynamic5573_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_845b9d51acd5_invokedynamic5573_4(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_845b9d51acd5_invokedynamic5573_6(java.lang.String a0) throws E;
}
