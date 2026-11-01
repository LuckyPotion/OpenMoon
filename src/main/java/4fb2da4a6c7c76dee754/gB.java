package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gB extends net.minecraft.client.gui.Gui {

private static final org.apache.logging.log4j.Logger f;

private final net.minecraft.client.Minecraft g;

private final java.util.List<java.lang.String> h;

private final java.util.List<moom.f_> i;

private final java.util.List<moom.f_> j;

private int k;

private boolean l;

private com.moon.module.impl.CustomMinecraft m;

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public gB(net.minecraft.client.Minecraft p0) {
super();
    this.h = com.google.common.collect.Lists.newArrayList();
    this.i = com.google.common.collect.Lists.newArrayList();
    this.j = com.google.common.collect.Lists.newArrayList();
    this.g = p0;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(6075244404796317063L)), ((long)(3184554393244165192L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(229181641070646L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gB.n ^ 47593862911681L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1208_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1208_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1208_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1208_14 = new byte[8];
    (__sourceSpill1208_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1208_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1208_16 = __sourceSpill1208_14;
    ((javax.crypto.Cipher)(__sourceSpill1208_11)).init(((int)(__sourceSpill1208_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1208_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1208_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\031cú!>NãBÐ\004ÚØ\tæü§Ü\021÷áûm¯,èB\013c´>³þKÖóYa¾êòÞÙ»ÿÂKç38ÆÀ:ä\031Á§q$Þ\023XDñ¿p\035¡jyþÂ\rÀé1û)ï/¦\"ì\177·DOföºCÈ2WV\\Ñ!cb\034 (%^°Z°·`î<µ'\020\020þ\002û®;6Aî\006`"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1208_25 = local6_life21;
        int __sourceSpill1208_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1208_25)).substring(((int)(__sourceSpill1208_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1208_30 = local8_life19;
        int __sourceSpill1208_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1208_33 = new byte[8];
        (__sourceSpill1208_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1208_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1208_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1208_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1208_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1208_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1208_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1208_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1208_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1208_34)).doFinal(((byte[])(__sourceSpill1208_33)));
        (__sourceSpill1208_30)[__sourceSpill1208_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = ".Î(síÉþ4éP\035¥a"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1208_38 = local6_life21;
        int __sourceSpill1208_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1208_38)).substring(((int)(__sourceSpill1208_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1208_43 = local8_life19;
        int __sourceSpill1208_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1208_46 = new byte[8];
        (__sourceSpill1208_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1208_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1208_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1208_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1208_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1208_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1208_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1208_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1208_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1208_47)).doFinal(((byte[])(__sourceSpill1208_46)));
        (__sourceSpill1208_43)[__sourceSpill1208_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[20]));
    f = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}


public boolean b__Boolean() {
return ((((this.l) ? 1 : 0)) != 0);
}


public void b(int p0) {
int life2_9;
    moom.gB __stackOp3555_0_0 = this;
    ((moom.gB)(__stackOp3555_0_0)).k = ((int)((((moom.gB)(__stackOp3555_0_0)).k + p0)));
    life2_9 = ((java.util.List)(this.j)).size();
    if ((this.k > (life2_9 - ((moom.gB)(this)).c()))) {
        this.k = ((int)((life2_9 - ((moom.gB)(this)).c())));
    }
    if ((this.k <= 0)) {
        this.k = ((int)(0));
        this.l = ((boolean)(false));
    }
    return;
}


public int b() {
return moom.gB.b(((float)(((__sourceIntrinsic_booleanComparison(((moom.gB)(this)).a__Boolean()) != 0) ? ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).T : ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).S))));
}


public java.util.List<java.lang.String> b__List() {
return this.h;
}


public static int b(float p0) {
long local1 = (moom.gB.n ^ 2140304607181L);
    int local3 = __sourceIntrinsic_44ccaa2d223d_originalDynamicSite1442_1(4776, (7906541950913807695L ^ local1));
    int local4 = __sourceIntrinsic_44ccaa2d223d_originalDynamicSite1442_2(27658, (6549954772335557621L ^ local1));
    return moom.Dr.a__Int(((float)(((p0 * ((float) (local3 - local4))) + ((float) local4)))));
}


public void b__Void() {
int life1_10;
    moom.f_ life2_18;
    ((java.util.List)(this.j)).clear();
    ((moom.gB)(this)).c__Void();
    life1_10 = (((java.util.List)(this.i)).size() - 1);
    while ((life1_10 >= 0)) {
        life2_18 = ((moom.f_)(((java.util.List)(this.i)).get(((int)(life1_10)))));
        ((moom.gB)(this)).a(((net.minecraft.util.IChatComponent)(((moom.f_)(life2_18)).a__C5())), ((int)(((moom.f_)(life2_18)).b())), ((int)(((moom.f_)(life2_18)).a())), ((boolean)(true)));
        life1_10 += -1;
    }
    return;
}


public java.util.List<moom.f_> c__List() {
return this.i;
}


public int c() {
long local1 = (moom.gB.n ^ 53544898418523L);
    return (((moom.gB)(this)).b() / __sourceIntrinsic_94b06fabf08c_originalDynamicSite1443_2(21040, (2690765167708935514L ^ local1)));
}


public void c(int p0) {
java.util.Iterator life2_3;
    moom.f_ life3_10;
    java.util.Iterator life2_22;
    moom.f_ life3_29;
    forest_join_37: {
    forest_join_35: {
    forest_join_18: {
    life2_3 = ((java.util.List)(this.j)).iterator();
    forest_cycle_4: while (true) {
    forest_join_17: {
    if (!(((java.util.Iterator)(life2_3)).hasNext())) {
        break forest_join_18;
    }
    life3_10 = ((moom.f_)(((java.util.Iterator)(life2_3)).next()));
    if (!((((moom.f_)(life3_10)).b() == p0))) {
        break forest_join_17;
    }
    ((java.util.Iterator)(life2_3)).remove();
    }
    continue forest_cycle_4;
    }
    }
    life2_22 = ((java.util.List)(this.i)).iterator();
    forest_cycle_22: while (true) {
    forest_join_34: {
    if (!(((java.util.Iterator)(life2_22)).hasNext())) {
        break forest_join_37;
    }
    life3_29 = ((moom.f_)(((java.util.Iterator)(life2_22)).next()));
    if (!((((moom.f_)(life3_29)).b() == p0))) {
        break forest_join_34;
    }
    break forest_join_35;
    }
    continue forest_cycle_22;
    }
    }
    ((java.util.Iterator)(life2_22)).remove();
    }
    return;
}


public void c__Void() {
this.k = ((int)(0));
    this.l = ((boolean)(false));
    return;
}


public java.util.List<moom.f_> d__List() {
return this.j;
}


public int d() {
return this.k;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7681_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.client.Minecraft a__fM() {
return this.g;
}


public com.moon.module.impl.CustomMinecraft a__lT() {
return this.m;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gB.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11391;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/gB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<java.lang.String> a__List() {
return this.h;
}


private void a(net.minecraft.util.IChatComponent p0, int p1, int p2, boolean p3) {
net.minecraft.util.IChatComponent lexicalValue1177_47_0;
    int lexicalValue1177_47_1;
    net.minecraft.client.gui.FontRenderer lexicalValue1177_47_2;
    int lexicalValue1177_47_3;
    int lexicalValue1177_47_4;
    net.minecraft.util.IChatComponent lexicalValue1177_48_0;
    int lexicalValue1177_48_1;
    net.minecraft.client.gui.FontRenderer lexicalValue1177_48_2;
    int lexicalValue1177_48_3;
    int lexicalValue1177_48_4;
    int lexicalValue1177_48_5;
    net.minecraft.util.IChatComponent spill1177_0;
    int spill1177_1;
    net.minecraft.client.gui.FontRenderer spill1177_2;
    int spill1177_3;
    int spill1177_4;
    long life5_3;
    int life7_32;
    java.util.List life8_64;
    int life9_67;
    java.util.Iterator life10_70;
    net.minecraft.util.IChatComponent life11_77;
    lexical_join_139: {
    lexical_join_108: {
    lexical_join_89: {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_19: {
    lexical_join_14: {
    life5_3 = (moom.gB.n ^ 33223537108260L);
    if (!((this.m == null))) {
        break lexical_join_14;
    }
    this.m = ((com.moon.module.impl.CustomMinecraft)(((com.moon.module.impl.CustomMinecraft)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.CustomMinecraft.class)))))));
    }
    if (!((p1 != 0))) {
        break lexical_join_19;
    }
    ((moom.gB)(this)).c(((int)(p1)));
    }
    life7_32 = moom.Dr.a__Int(((float)((((float) ((moom.gB)(this)).a__Int()) / ((moom.gB)(this)).a()))));
    spill1177_0 = p0;
    spill1177_1 = life7_32;
    spill1177_2 = ((net.minecraft.client.Minecraft)(this.g)).N;
    spill1177_3 = 0;
    spill1177_4 = 0;
    if (!(((com.moon.module.impl.CustomMinecraft)(this.m)).isEnabled())) {
        lexicalValue1177_47_0 = spill1177_0;
        lexicalValue1177_47_1 = spill1177_1;
        lexicalValue1177_47_2 = spill1177_2;
        lexicalValue1177_47_3 = spill1177_3;
        lexicalValue1177_47_4 = spill1177_4;
        break lexical_join_47;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(this.m)).v)).getValue())))).booleanValue())) {
        lexicalValue1177_47_0 = spill1177_0;
        lexicalValue1177_47_1 = spill1177_1;
        lexicalValue1177_47_2 = spill1177_2;
        lexicalValue1177_47_3 = spill1177_3;
        lexicalValue1177_47_4 = spill1177_4;
        break lexical_join_47;
    }
    lexicalValue1177_48_0 = spill1177_0;
    lexicalValue1177_48_1 = spill1177_1;
    lexicalValue1177_48_2 = spill1177_2;
    lexicalValue1177_48_3 = spill1177_3;
    lexicalValue1177_48_4 = spill1177_4;
    lexicalValue1177_48_5 = 1;
    break lexical_join_48;
    }
    lexicalValue1177_48_0 = lexicalValue1177_47_0;
    lexicalValue1177_48_1 = lexicalValue1177_47_1;
    lexicalValue1177_48_2 = lexicalValue1177_47_2;
    lexicalValue1177_48_3 = lexicalValue1177_47_3;
    lexicalValue1177_48_4 = lexicalValue1177_47_4;
    lexicalValue1177_48_5 = 0;
    }
    life8_64 = moom.im.a(((net.minecraft.util.IChatComponent)(lexicalValue1177_48_0)), ((int)(lexicalValue1177_48_1)), ((net.minecraft.client.gui.FontRenderer)(lexicalValue1177_48_2)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1177_48_3))), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1177_48_4))), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1177_48_5))), ((com.moon.jm)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM))))));
    life9_67 = ((((moom.gB)(this)).a__Boolean()) ? 1 : 0);
    life10_70 = ((java.util.List)(life8_64)).iterator();
    lexical_cycle_60: while (true) {
    lexical_join_78: {
    if (!(((java.util.Iterator)(life10_70)).hasNext())) {
        break lexical_join_89;
    }
    life11_77 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life10_70)).next()));
    if (!((life9_67 != 0))) {
        break lexical_join_78;
    }
    if (!((this.k > 0))) {
        break lexical_join_78;
    }
    this.l = ((boolean)(true));
    ((moom.gB)(this)).b(((int)(1)));
    }
    ((java.util.List)(this.j)).add(((int)(0)), ((java.lang.Object)(new moom.f_(p2, life11_77, p1))));
    continue lexical_cycle_60;
    }
    }
    lexical_cycle_89: while (true) {
    if (!((((java.util.List)(this.j)).size() > __sourceIntrinsic_f43072aa98f1_invokedynamic1177_39(20037, (6941635775049202504L ^ life5_3))))) {
        break lexical_join_108;
    }
    ((java.util.List)(this.j)).remove(((int)((((java.util.List)(this.j)).size() - 1))));
    continue lexical_cycle_89;
    }
    }
    if (!((!p3))) {
        break lexical_join_139;
    }
    ((java.util.List)(this.i)).add(((int)(0)), ((java.lang.Object)(new moom.f_(p2, p0, p1))));
    lexical_cycle_120: while (true) {
    if (!((((java.util.List)(this.i)).size() > __sourceIntrinsic_f43072aa98f1_invokedynamic1177_48(22839, (8701971989518249011L ^ life5_3))))) {
        break lexical_join_139;
    }
    ((java.util.List)(this.i)).remove(((int)((((java.util.List)(this.i)).size() - 1))));
    continue lexical_cycle_120;
    }
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0, int p1) {
((moom.gB)(this)).a(((net.minecraft.util.IChatComponent)(p0)), ((int)(p1)), ((int)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.g)).T)).a())), ((boolean)(false)));
    ((org.apache.logging.log4j.Logger)(moom.gB.f)).info(((java.lang.String)(__sourceIntrinsic_e5e83b2da18f_originalDynamicSite1444_6(((net.minecraft.util.IChatComponent)(p0)).b()))));
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
((moom.gB)(this)).a(((net.minecraft.util.IChatComponent)(p0)), ((int)(0)));
    return;
}


public void a__Void() {
((java.util.List)(this.j)).clear();
    ((java.util.List)(this.i)).clear();
    ((java.util.List)(this.h)).clear();
    return;
}


public void a(int p0) {
int lexicalValue1175_264_0;
    int lexicalValue1175_279_0;
    long life2_3;
    int life4_12;
    int life5_14;
    int life6_16;
    int life7_20;
    float life8_29;
    float life9_42;
    int life10_49;
    int life11_60;
    moom.f_ life12_83;
    int life13_90;
    double life14_107;
    double life14_111;
    double life14_115;
    double life14_120;
    double life14_124;
    int life16_129;
    int life16_143;
    int life17_149;
    int life18_158;
    java.lang.String life19_186;
    int life11_227;
    int life12_237;
    int life13_243;
    int life14_250;
    int life15_256;
    int life16_278;
    int life17_295;
    lexical_join_321: {
    lexical_join_320: {
    lexical_join_279: {
    lexical_join_274: {
    lexical_join_264: {
    lexical_join_259: {
    lexical_join_212: {
    lexical_join_37: {
    life2_3 = (moom.gB.n ^ 3730794359115L);
    if (!((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).x != net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.HIDDEN))) {
        break lexical_join_321;
    }
    life4_12 = ((moom.gB)(this)).c();
    life5_14 = 0;
    life6_16 = 0;
    life7_20 = ((java.util.List)(this.j)).size();
    life8_29 = ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).B * 0x1.ccccccp-1f) + 0x1.99999ap-4f);
    if (!((life7_20 > 0))) {
        break lexical_join_321;
    }
    if (!(((moom.gB)(this)).a__Boolean())) {
        break lexical_join_37;
    }
    life5_14 = 1;
    }
    life9_42 = ((moom.gB)(this)).a();
    life10_49 = moom.Dr.b__Int(((float)((((float) ((moom.gB)(this)).a__Int()) / life9_42))));
    moom.kZ.B();
    moom.kZ.b(((float)(0x1.0p1f)), ((float)(0x1.4p4f)), ((float)(0x0.0p0f)));
    moom.kZ.a(((float)(life9_42)), ((float)(life9_42)), ((float)(0x1.0p0f)));
    life11_60 = 0;
    lexical_cycle_58: while (true) {
    lexical_join_210: {
    lexical_join_129: {
    lexical_join_94: {
    if (!(((life11_60 + this.k) < ((java.util.List)(this.j)).size()))) {
        break lexical_join_212;
    }
    if (!((life11_60 < life4_12))) {
        break lexical_join_212;
    }
    life12_83 = ((moom.f_)(((java.util.List)(this.j)).get(((int)((life11_60 + this.k))))));
    if (!((life12_83 != null))) {
        break lexical_join_210;
    }
    life13_90 = (p0 - ((moom.f_)(life12_83)).a());
    if (!((life13_90 >= __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_26(5071, (6348625877705304746L ^ life2_3))))) {
        break lexical_join_94;
    }
    if (!((life5_14 != 0))) {
        break lexical_join_210;
    }
    }
    life14_107 = (((double) life13_90) / 0x1.9p7d);
    life14_111 = (0x1.0p0d - life14_107);
    life14_115 = (life14_111 * 0x1.4p3d);
    life14_120 = moom.Dr.a(((double)(life14_115)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life14_124 = (life14_120 * life14_120);
    life16_129 = ((int) (0x1.fep7d * life14_124));
    if (!((life5_14 != 0))) {
        break lexical_join_129;
    }
    life16_129 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_28(26432, (2793921369001614883L ^ life2_3));
    }
    life16_143 = ((int) (((float) life16_129) * life8_29));
    life6_16 += 1;
    if (!((life16_143 > 3))) {
        break lexical_join_210;
    }
    life17_149 = 0;
    life18_158 = ((-life11_60) * __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_29(5551, (6912259455362411732L ^ life2_3)));
    moom.gB.a(((int)(life17_149)), ((int)((life18_158 - __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_30(5551, (6912259455362411732L ^ life2_3))))), ((int)(((life17_149 + life10_49) + 4))), ((int)(life18_158)), ((int)(((life16_143 / 2) << __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_31(29343, (1841051417074355175L ^ life2_3))))));
    life19_186 = ((net.minecraft.util.IChatComponent)(((moom.f_)(life12_83)).a__C5())).c();
    moom.kZ.l();
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(life19_186)), ((float)(((float) life17_149))), ((float)(((float) (life18_158 - __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_38(23696, (505132951318947322L ^ life2_3)))))), ((int)((__sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_39(13860, (3457472829066121034L ^ life2_3)) + (life16_143 << __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_40(16386, (4081597978718075236L ^ life2_3)))))));
    moom.kZ.c__Void();
    moom.kZ.k();
    }
    life11_60 += 1;
    continue lexical_cycle_58;
    }
    }
    if (!((life5_14 != 0))) {
        break lexical_join_320;
    }
    life11_227 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c;
    moom.kZ.b(((float)(-0x1.8p1f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    life12_237 = ((life7_20 * life11_227) + life7_20);
    life13_243 = ((life6_16 * life11_227) + life6_16);
    life14_250 = ((this.k * life13_243) / life7_20);
    life15_256 = ((life13_243 * life13_243) / life12_237);
    if (!((life12_237 != life13_243))) {
        break lexical_join_320;
    }
    if (!((life14_250 > 0))) {
        break lexical_join_259;
    }
    lexicalValue1175_264_0 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_49(5655, (1768066105136459640L ^ life2_3));
    break lexical_join_264;
    }
    lexicalValue1175_264_0 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_50(4576, (3109429810448607372L ^ life2_3));
    }
    life16_278 = lexicalValue1175_264_0;
    if (!(this.l)) {
        break lexical_join_274;
    }
    lexicalValue1175_279_0 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_52(15071, (3001968298874373051L ^ life2_3));
    break lexical_join_279;
    }
    lexicalValue1175_279_0 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_53(22051, (8039640571282747203L ^ life2_3));
    }
    life17_295 = lexicalValue1175_279_0;
    moom.gB.a(((int)(0)), ((int)((-life14_250))), ((int)(2)), ((int)(((-life14_250) - life15_256))), ((int)((life17_295 + (life16_278 << __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_54(16386, (4081597978718075236L ^ life2_3)))))));
    moom.gB.a(((int)(2)), ((int)((-life14_250))), ((int)(1)), ((int)(((-life14_250) - life15_256))), ((int)((__sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_56(25293, (439263476444748704L ^ life2_3)) + (life16_278 << __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_57(16386, (4081597978718075236L ^ life2_3)))))));
    }
    moom.kZ.C();
    }
    return;
}


public static int a(float p0) {
long local1 = (moom.gB.n ^ 134062765127928L);
    int local3 = __sourceIntrinsic_abfe0021584b_originalDynamicSite1445_1(27346, (5172058491208090120L ^ local1));
    int local4 = __sourceIntrinsic_abfe0021584b_originalDynamicSite1445_2(31669, (4276514907354485601L ^ local1));
    return moom.Dr.a__Int(((float)(((p0 * ((float) (local3 - local4))) + ((float) local4)))));
}


public float a() {
return ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).Q;
}


public int a__Int() {
return moom.gB.a(((float)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.g)).W)).R)));
}


public boolean a__Boolean() {
return ((((((net.minecraft.client.Minecraft)(this.g)).P instanceof moom.gF) ? 1 : 0)) != 0);
}


public net.minecraft.util.IChatComponent a(int p0, int p1) {
int forestValue844_39_0;
    float forestValue844_110_0;
    float forestValue844_184_0;
    float forestValue844_194_0;
    float forestValue844_194_1;
    float spill844_0;
    long life3_3;
    int life5_25;
    int life6_41;
    com.moon.jm life7_46;
    moom.ir life8_52;
    int life9_55;
    float life10_58;
    int life11_64;
    int life12_74;
    int life11_80;
    int life12_86;
    int life13_98;
    float life14_113;
    int life15_144;
    moom.f_ life16_158;
    int life17_160;
    java.util.Iterator life18_164;
    net.minecraft.util.IChatComponent life19_171;
    forest_join_206: {
    forest_join_204: {
    forest_join_202: {
    forest_join_110: {
    forest_join_105: {
    forest_join_39: {
    forest_join_38: {
    forest_join_19: {
    forest_join_9: {
    life3_3 = (moom.gB.n ^ 14857813699996L);
    if (!((!((moom.gB)(this)).a__Boolean()))) {
        break forest_join_9;
    }
    return null;
    }
    if (!((this.m == null))) {
        break forest_join_19;
    }
    this.m = ((com.moon.module.impl.CustomMinecraft)(((com.moon.module.impl.CustomMinecraft)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.CustomMinecraft.class)))))));
    }
    life5_25 = __sourceIntrinsic_979a2493dec4_invokedynamic844_9(5551, (6912262083043076099L ^ life3_3));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(this.m)).v)).getValue())))).booleanValue())) {
        break forest_join_38;
    }
    if (!(((com.moon.module.impl.CustomMinecraft)(this.m)).isEnabled())) {
        break forest_join_38;
    }
    forestValue844_39_0 = 1;
    break forest_join_39;
    }
    forestValue844_39_0 = 0;
    }
    life6_41 = forestValue844_39_0;
    life7_46 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life8_52 = new moom.ir(this.g);
    life9_55 = ((moom.ir)(life8_52)).c();
    life10_58 = ((moom.gB)(this)).a();
    life11_64 = ((p0 / life9_55) - 3);
    life12_74 = ((p1 / life9_55) - __sourceIntrinsic_979a2493dec4_invokedynamic844_24(17985, (7782570823049772030L ^ life3_3)));
    life11_80 = moom.Dr.a__Int(((float)((((float) life11_64) / life10_58))));
    life12_86 = moom.Dr.a__Int(((float)((((float) life12_74) / life10_58))));
    if (!((life11_80 >= 0))) {
        break forest_join_206;
    }
    if (!((life12_86 >= 0))) {
        break forest_join_206;
    }
    life13_98 = java.lang.Math.min(((int)(((moom.gB)(this)).c())), ((int)(((java.util.List)(this.j)).size())));
    if (!((life6_41 != 0))) {
        break forest_join_105;
    }
    forestValue844_110_0 = ((float) java.lang.Math.round(((float)(((com.moon.jm)(life7_46)).a(((float)(((float) life5_25))))))));
    break forest_join_110;
    }
    forestValue844_110_0 = ((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).c);
    }
    life14_113 = forestValue844_110_0;
    if (!((life11_80 <= moom.Dr.a__Int(((float)((((float) ((moom.gB)(this)).a__Int()) / ((moom.gB)(this)).a()))))))) {
        break forest_join_204;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((float) life12_86))), ((float)(((life14_113 * ((float) life13_98)) + ((float) life13_98))))) < 0))) {
        break forest_join_204;
    }
    life15_144 = ((int) ((((float) life12_86) / life14_113) + ((float) this.k)));
    if (!((life15_144 >= 0))) {
        break forest_join_204;
    }
    if (!((life15_144 < ((java.util.List)(this.j)).size()))) {
        break forest_join_204;
    }
    life16_158 = ((moom.f_)(((java.util.List)(this.j)).get(((int)(life15_144)))));
    life17_160 = 0;
    life18_164 = ((net.minecraft.util.IChatComponent)(((moom.f_)(life16_158)).a__C5())).iterator();
    forest_cycle_160: while (true) {
    forest_join_201: {
    forest_join_194: {
    forest_join_184: {
    if (!(((java.util.Iterator)(life18_164)).hasNext())) {
        break forest_join_204;
    }
    life19_171 = ((net.minecraft.util.IChatComponent)(((java.util.Iterator)(life18_164)).next()));
    if (!((((life19_171 instanceof moom.CM) ? 1 : 0) != 0))) {
        break forest_join_201;
    }
    spill844_0 = ((float) life17_160);
    if (!((life6_41 != 0))) {
        forestValue844_184_0 = spill844_0;
        break forest_join_184;
    }
    forestValue844_194_0 = spill844_0;
    forestValue844_194_1 = ((com.moon.jm)(life7_46)).a(((java.lang.String)(moom.im.a(((java.lang.String)(((moom.CM)(((moom.CM)(life19_171)))).d())), ((boolean)(false))))), ((float)(((float) life5_25))));
    break forest_join_194;
    }
    forestValue844_194_0 = forestValue844_184_0;
    forestValue844_194_1 = ((float) ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.g)).N)).a(((java.lang.String)(moom.im.a(((java.lang.String)(((moom.CM)(((moom.CM)(life19_171)))).d())), ((boolean)(false)))))));
    }
    life17_160 = ((int) (forestValue844_194_0 + forestValue844_194_1));
    if (!((life17_160 > life11_80))) {
        break forest_join_201;
    }
    break forest_join_202;
    }
    continue forest_cycle_160;
    }
    }
    return life19_171;
    }
    return null;
    }
    return null;
}


public void a(java.lang.String p0) {
forward_join_21: {
    forward_join_16: {
    if (!((!((java.util.List)(this.h)).isEmpty()))) { break forward_join_16; }
    if (!((!((java.lang.String)(((java.lang.String)(((java.util.List)(this.h)).get(((int)((((java.util.List)(this.h)).size() - 1)))))))).equals(((java.lang.Object)(p0)))))) { break forward_join_21; }
    }
    ((java.util.List)(this.h)).add(((java.lang.Object)(p0)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_abfe0021584b_originalDynamicSite1445_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_abfe0021584b_originalDynamicSite1445_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic1175_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_979a2493dec4_invokedynamic844_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_979a2493dec4_invokedynamic844_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7681_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e5e83b2da18f_originalDynamicSite1444_6(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f43072aa98f1_invokedynamic1177_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f43072aa98f1_invokedynamic1177_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44ccaa2d223d_originalDynamicSite1442_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_44ccaa2d223d_originalDynamicSite1442_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94b06fabf08c_originalDynamicSite1443_2(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
