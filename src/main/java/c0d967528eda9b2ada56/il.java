package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class il extends moom.h1 {

private java.util.ArrayList y;

private int z;

private long A;

moom.hH B;

private static long C;

private static java.lang.String[] D;

private static java.lang.String[] E;

private static java.util.Map F;

private static long[] H;

private static java.lang.Integer[] L;

private static java.util.Map M;

public il(moom.hH p0, int p1, int p2, int p3, int p4, int p5) { super((net.minecraft.client.Minecraft)null, 0, 0, 0, 0, 0); }


private static void __sourceConstructorBody_2beaf706d55fc91c(moom.il receiver, moom.hH p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {

long local7_life1 = (moom.il.C ^ 62119921312720L);

    moom.il.__sourceConstructorInit_2beaf706d55fc91c_0(((moom.il)(receiver)), ((net.minecraft.client.Minecraft)(((moom.hH)(p0)).a__fM())), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)));

    ((moom.il)(receiver)).A = ((long)(0L));

    ((moom.il)(receiver)).B = ((moom.hH)(p0));

    ((moom.il)(receiver)).d();

    ((moom.il)(receiver)).p = ((float)(0x0.0p0f));

    int local9_life9 = (((moom.il)(receiver)).z * p5);

    int local10_life10 = ((p4 - p3) / 2);

    if ((local9_life9 > local10_life10)) {

        ((moom.il)(receiver)).a(((int)((local9_life9 - local10_life10))));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_2beaf706d55fc91c_0(moom.il a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6) throws E;

static {
C = ((long)(((moom._a)(moom._c.a(((long)(-3182226067585692662L)), ((long)(-1498762431074453320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(147358108546256L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.il.C ^ 139032859520223L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill883_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill883_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill883_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill883_14 = new byte[8];
    (__sourceSpill883_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill883_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation883_16 = __sourceSpill883_14;
    ((javax.crypto.Cipher)(__sourceSpill883_11)).init(((int)(__sourceSpill883_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill883_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation883_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[11];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Üá{\007ýÙ@2SÞQTåëÖ{åÍñWeÉ¢XâÉð\016E¹\032æ©K­»Ê\\vî±5rXö{\020¯¿¸­yÏo(èØÎ\000] \t\030\033ë/JæÐ½ÞdÐ7M Ö{,Àûà\032Ó\006øqn$0($?\005À\rà®)²gWAÓvªÌ\021{Å-\006x{­_óëÅ\0276\032+\nñT\020ØÄÄòÝâ-Æ&*HçÿL\0238\020\021¹óÏác[ÉÌÌ\036±\030`À`Ü}Ô\b¿0\023IÝ~Qù\034:Þ 1Ç(ÏÕÏ¦<¥NÚ,åPÜ\021ô\034Þgæ_±F#>èYß½\013Ò5Ë\037+Ä0`,\"=y9ÉØçd0\031®¢öþLö·î|V«\037ÙÜ\n?§\0065\bxÀßÒ\nÜÆ\n¡=Öz%"))).length();
    int local16_life24 = 56;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill883_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill883_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill883_29)).doFinal(((byte[])(__sourceSpill883_28)));
        java.lang.String __sourceSpill883_34 = ((java.lang.String)(moom.il.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill883_35 = local20_life19;
        int __sourceSpill883_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill883_35)[__sourceSpill883_36] = __sourceSpill883_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "îZf#Ì\027´Yù»\006+ÄQ\0238xÜBü;µÍ\007<fcycMW\020\037\016\031Z\002jÉPJ\017\013¢k\177Ê\027Ìñzºß¨E\177Clu7¯m\rfÒÛ"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill883_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill883_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill883_42)).doFinal(((byte[])(__sourceSpill883_41)));
        java.lang.String __sourceSpill883_47 = ((java.lang.String)(moom.il.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill883_48 = local20_life19;
        int __sourceSpill883_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill883_48)[__sourceSpill883_49] = __sourceSpill883_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    D = ((java.lang.String[])(local20_life19));
    E = ((java.lang.String[])(new java.lang.String[11]));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill883_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill883_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill883_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill883_60 = new byte[8];
    (__sourceSpill883_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill883_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation883_62 = __sourceSpill883_60;
    ((javax.crypto.Cipher)(__sourceSpill883_57)).init(((int)(__sourceSpill883_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill883_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation883_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[6];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "óäKó)\021­AQ\024ñüoô½x?j+\037ÐK\005úZ0"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill883_71 = local4_life67;
        int __sourceSpill883_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill883_71)).substring(((int)(__sourceSpill883_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill883_76 = local6_life65;
        int __sourceSpill883_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill883_79 = new byte[8];
        (__sourceSpill883_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill883_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill883_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill883_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill883_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill883_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill883_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill883_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill883_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill883_80)).doFinal(((byte[])(__sourceSpill883_79)));
        (__sourceSpill883_76)[__sourceSpill883_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ÁÖ( Û\035~JU½mhraä"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill883_84 = local4_life67;
        int __sourceSpill883_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill883_84)).substring(((int)(__sourceSpill883_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill883_89 = local6_life65;
        int __sourceSpill883_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill883_92 = new byte[8];
        (__sourceSpill883_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill883_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill883_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill883_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill883_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill883_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill883_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill883_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill883_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill883_93)).doFinal(((byte[])(__sourceSpill883_92)));
        (__sourceSpill883_89)[__sourceSpill883_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    H = ((long[])(local6_life65));
    L = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


protected int b() {
long local1 = (moom.il.C ^ 18776650418624L);
    return (((moom.il)(this)).a() * __sourceIntrinsic_e1958f95391c_originalDynamicSite1523_2(16377, (395852459502251341L ^ local1)));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int e() {
long local1 = (moom.il.C ^ 68020502809050L);
    return (this.b - __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1524_2(30050, (2446888469012948939L ^ local1)));
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6486;
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
            throw new RuntimeException("moom/il", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         L[var3] = var15;
      }

      return L[var3];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8063_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/il"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.il.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void c(int p0) {
this.z = ((int)(p0));
    this.A = ((long)(this.r));
    moom.MP.a__Void(((java.lang.String)(((java.lang.String)(((java.util.ArrayList)(this.y)).get(((int)(p0))))))));
    moom.MP.m();
    ((moom.hH)(this.B)).a__Void();
    return;
}


public int h() {
return this.z;
}


protected int f() {
long local1 = (moom.il.C ^ 130702913967218L);
    return (this.b - __sourceIntrinsic_d5f736cb4191_originalDynamicSite1525_2(19801, (68595756492243550L ^ local1)));
}


public void d__sourceReturn_da8c82d5d4() {
moom.il lexicalValue1203_31_0;
    net.minecraft.entity.Entity[] spill1203_0;
    moom.il spill1203_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_11;
    int life4_13;
    int life5_17;
    lexical_join_38: {
    life1_3 = (moom.il.C ^ 136700113411045L);
    spill1203_0 = net.minecraft.potion.Potion.b__Arrayr3();
    this.y = ((java.util.ArrayList)(moom.MP.a__ArrayList()));
    this.z = ((int)(0));
    life3_11 = spill1203_0;
    life4_13 = 0;
    life5_17 = ((java.util.ArrayList)(this.y)).size();
    lexical_cycle_18: while (true) {
    lexical_join_35: {
    lexical_join_31: {
    if (!((life4_13 < life5_17))) {
        break lexical_join_38;
    }
    spill1203_1 = this;
    if (!((life3_11 == null))) {
        lexicalValue1203_31_0 = spill1203_1;
        break lexical_join_31;
    }
    if (!(((java.lang.Object)(((java.util.ArrayList)(((moom.il)(spill1203_1)).y)).get(((int)(life4_13))))).equals(((java.lang.Object)(moom.MP.dW))))) {
        break lexical_join_35;
    }
    lexicalValue1203_31_0 = this;
    }
    ((moom.il)(lexicalValue1203_31_0)).z = ((int)(life4_13));
    if (!((life3_11 != null))) {
        break lexical_join_38;
    }
    }
    life4_13 += 1;
    if (!((life3_11 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return;
}


protected void a(int p0, int p1, int p2, int p3, int p4, int p5) {
int forwardValue3639_40_0;
    java.lang.String forwardValue3639_47_0;
    net.minecraft.entity.Entity[] spill3639_0;
    boolean spill3639_1;
    java.lang.String spill3639_2;
    long life7_3;
    java.lang.String life10_10;
    net.minecraft.entity.Entity[] life9_11;
    forward_join_48: {
    forward_join_47: {
    forward_join_40: {
    forward_join_31: {
    life7_3 = (moom.il.C ^ 116594889012465L);
    spill3639_0 = net.minecraft.potion.Potion.b__Arrayr3();
    life10_10 = ((java.lang.String)(((java.util.ArrayList)(this.y)).get(((int)(p0)))));
    life9_11 = spill3639_0;
    spill3639_1 = ((java.lang.String)(life10_10)).equals(((java.lang.Object)(__sourceIntrinsic_499f7b7391d8_invokedynamic3639_5(31903, (9088046561758017023L ^ life7_3)))));
    if (!((life9_11 == null))) {
        forwardValue3639_40_0 = ((spill3639_1) ? 1 : 0);
        break forward_join_40;
    }
    if (!(spill3639_1)) {
        break forward_join_31;
    }
    life10_10 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_499f7b7391d8_invokedynamic3639_8(23590, (8156219929928815946L ^ life7_3)))));
    if (!((life9_11 != null))) {
        break forward_join_48;
    }
    }
    spill3639_2 = life10_10;
    if (!((life9_11 == null))) {
        forwardValue3639_47_0 = spill3639_2;
        break forward_join_47;
    }
    forwardValue3639_40_0 = ((((java.lang.String)(spill3639_2)).equals(((java.lang.Object)(__sourceIntrinsic_499f7b7391d8_invokedynamic3639_10(5139, (8249379902015118709L ^ life7_3)))))) ? 1 : 0);
    }
    if (!((forwardValue3639_40_0 != 0))) {
        break forward_join_48;
    }
    forwardValue3639_47_0 = moom.JM.a(((java.lang.String)(__sourceIntrinsic_499f7b7391d8_invokedynamic3639_13(25570, (7997968071613246086L ^ life7_3)))));
    }
    life10_10 = forwardValue3639_47_0;
    }
    ((moom.hH)(this.B)).a(((java.lang.String)(life10_10)), ((int)((this.b / 2))), ((int)((p2 + 1))), ((int)(__sourceIntrinsic_499f7b7391d8_invokedynamic3639_17(28640, (2666031209587720291L ^ life7_3)))));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.il.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16308);
    if (((moom.il.E)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.il.F)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.il.F)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/il", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.il.D)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.il.E)[life5_8] = moom.il.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.il.E)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8067_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/il"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected int a() {
return ((java.util.ArrayList)(this.y)).size();
}


protected boolean a__Boolean(int p0) {
int forwardValue3642_13_0;
    int forwardValue3642_15_0;
    int spill3642_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.il.C ^ 85879644942836L);
    life4_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3642_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue3642_13_0 = spill3642_0;
        break forward_join_13;
    }
    if (!((spill3642_0 == this.z))) {
        break forward_join_14;
    }
    forwardValue3642_13_0 = 1;
    }
    forwardValue3642_15_0 = forwardValue3642_13_0;
    break forward_join_15;
    }
    forwardValue3642_15_0 = 0;
    }
    return ((forwardValue3642_15_0) != 0);
}


protected void a__Void() {
return;
}


private boolean a(moom.Mv p0, int p1) {
moom.Mv forwardValue3641_13_0;
    java.lang.String forwardValue3641_56_0;
    int forwardValue3641_66_0;
    moom.Mv spill3641_0;
    java.lang.String spill3641_1;
    int spill3641_2;
    java.lang.String spill3641_3;
    java.lang.Object[] spill3641_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.io.InputStream life6_24;
    java.util.Properties life7_32;
    java.lang.String life8_44;
    java.lang.String life9_48;
    java.lang.String life10_68;
    int life11_72;
    java.lang.String life12_101;
    java.lang.String life13_114;
    java.lang.String life14_123;
    net.minecraft.client.gui.GuiYesNoCallback life15_127;
    moom.hb life16_135;
    forward_join_67: {
    forward_join_66: {
    forward_join_56: {
    forward_join_48: {
    forward_join_32: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (moom.il.C ^ 115731922836324L);
    life5_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3641_0 = p0;
    if (!((life5_5 == null))) {
        forwardValue3641_13_0 = spill3641_0;
        break forward_join_13;
    }
    if (!((spill3641_0 == null))) {
        break forward_join_12;
    }
    return ((1) != 0);
    }
    forwardValue3641_13_0 = p0;
    }
    life6_24 = ((moom.Mv)(forwardValue3641_13_0)).a(((java.lang.String)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_3(3151, (3471598392776157876L ^ life3_3)))));
    life7_32 = moom.N_.a(((java.io.InputStream)(life6_24)), ((java.lang.String)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_5(8142, (2291864459799230778L ^ life3_3)))));
    if (!((life7_32 == null))) {
        break forward_join_32;
    }
    return ((1) != 0);
    }
    life8_44 = __sourceIntrinsic_739e46b58c5c_invokedynamic3641_8(9151, (8285395877977212232L ^ life3_3));
    life9_48 = ((java.util.Properties)(life7_32)).getProperty(((java.lang.String)(life8_44)));
    spill3641_1 = life9_48;
    if (!((life5_5 == null))) {
        forwardValue3641_56_0 = spill3641_1;
        break forward_join_56;
    }
    if (!((spill3641_1 == null))) {
        break forward_join_48;
    }
    return ((1) != 0);
    }
    life9_48 = ((java.lang.String)(life9_48)).trim();
    forwardValue3641_56_0 = __sourceIntrinsic_739e46b58c5c_invokedynamic3641_12(20344, (2523257788949244296L ^ life3_3));
    }
    life10_68 = forwardValue3641_56_0;
    life11_72 = moom.BU.a(((java.lang.String)(life10_68)), ((java.lang.String)(life9_48)));
    spill3641_2 = life11_72;
    if (!((life5_5 == null))) {
        forwardValue3641_66_0 = spill3641_2;
        break forward_join_66;
    }
    if (!((spill3641_2 >= 0))) {
        break forward_join_67;
    }
    forwardValue3641_66_0 = 1;
    }
    return ((forwardValue3641_66_0) != 0);
    }
    java.lang.String __stackOp3641_16_0 = life9_48;
    java.lang.String __stackOp3641_16_1 = __sourceIntrinsic_739e46b58c5c_invokedynamic3641_15(10789, (3015697068086709469L ^ life3_3));
    life12_101 = ((java.lang.String)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_17(__stackOp3641_16_1, __stackOp3641_16_0))).replace(((char)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_18(20599, (2000202269827141733L ^ life3_3)))), ((char)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_19(31487, (6579644167652031212L ^ life3_3)))));
    spill3641_3 = __sourceIntrinsic_739e46b58c5c_invokedynamic3641_21(6954, (3302072336605740508L ^ life3_3));
    java.lang.Object[] __stackOp3641_22_0 = new java.lang.Object[1];
    spill3641_4 = __stackOp3641_22_0;
    (__stackOp3641_22_0)[0] = life12_101;
    life13_114 = moom.oO.a(((java.lang.String)(spill3641_3)), ((java.lang.Object[])(spill3641_4)));
    life14_123 = moom.oO.a(((java.lang.String)(__sourceIntrinsic_739e46b58c5c_invokedynamic3641_24(28573, (4703427664770074991L ^ life3_3)))), ((java.lang.Object[])(new java.lang.Object[0])));
    life15_127 = __sourceIntrinsic_739e46b58c5c_invokedynamic3641_26(this, p1);
    life16_135 = new moom.hb(life15_127, life13_114, life14_123, 0);
    ((net.minecraft.client.Minecraft)(this.a)).a(((net.minecraft.client.gui.GuiScreen)(life16_135)));
    return ((0) != 0);
}


protected void a(int p0, boolean p1, int p2, int p3) {
int forwardValue3640_19_0;
    java.lang.Object forwardValue3640_24_0;
    moom.il forwardValue3640_37_0;
    int spill3640_0;
    moom.il spill3640_1;
    moom.il spill3640_2;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    java.lang.String life8_37;
    moom.Mv life9_40;
    forward_join_39: {
    forward_join_37: {
    forward_join_24: {
    forward_join_20: {
    forward_join_19: {
    life5_3 = (moom.il.C ^ 88205323849513L);
    life7_5 = net.minecraft.potion.Potion.b__Arrayr3();
    spill3640_0 = p0;
    if (!((life7_5 == null))) {
        forwardValue3640_19_0 = spill3640_0;
        break forward_join_19;
    }
    if (!((spill3640_0 == this.z))) {
        break forward_join_20;
    }
    spill3640_1 = this;
    if (!((life7_5 == null))) {
        forwardValue3640_24_0 = spill3640_1;
        break forward_join_24;
    }
    forwardValue3640_19_0 = recovery.source.CarrierOps.lcmp(((long)(((moom.il)(spill3640_1)).r)), ((long)(this.A)));
    }
    if (!((forwardValue3640_19_0 != 0))) {
        break forward_join_39;
    }
    }
    forwardValue3640_24_0 = ((java.util.ArrayList)(this.y)).get(((int)(p0)));
    }
    life8_37 = ((java.lang.String)(forwardValue3640_24_0));
    life9_40 = moom.MP.a__Mv(((java.lang.String)(life8_37)));
    spill3640_2 = this;
    if (!((life7_5 == null))) {
        forwardValue3640_37_0 = spill3640_2;
        break forward_join_37;
    }
    if (!(((moom.il)(spill3640_2)).a(((moom.Mv)(life9_40)), ((int)(p0))))) {
        break forward_join_39;
    }
    forwardValue3640_37_0 = this;
    }
    ((moom.il)(forwardValue3640_37_0)).c(((int)(p0)));
    }
    return;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill4226_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4226_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4226_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4226_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4226_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4226_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void lambda$checkCompatible$0(int p0, boolean p1, int p2) {
long local4 = (moom.il.C ^ 114227865438929L);
    java.lang.Object[] local6 = net.minecraft.potion.Potion.b__Arrayr3();
    if ((local6 == null)) {
        if ((__sourceIntrinsic_booleanComparison(p1) != 0)) {
        ((moom.il)(this)).c(((int)(p0)));
    }
        ((net.minecraft.client.Minecraft)(this.a)).a(((net.minecraft.client.gui.GuiScreen)(this.B)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1523_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c4b63a62bb23_originalDynamicSite1524_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8063_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d5f736cb4191_originalDynamicSite1525_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic3639_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic3639_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic3639_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_499f7b7391d8_invokedynamic3639_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_invokedynamic3639_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8067_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_739e46b58c5c_invokedynamic3641_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_739e46b58c5c_invokedynamic3641_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_739e46b58c5c_invokedynamic3641_24(int a0, long a1) throws E;

private static native <E extends Throwable> net.minecraft.client.gui.GuiYesNoCallback __sourceIntrinsic_739e46b58c5c_invokedynamic3641_26(moom.il a0, int a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
