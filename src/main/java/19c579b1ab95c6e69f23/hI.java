package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hI extends net.minecraft.client.gui.Gui implements moom.iy {

private static final moom.DD f;

public static final moom.DD g;

private final net.minecraft.client.Minecraft h;

private long i;

private moom.iB j;

private static final long k;

private static final long[] l;

private static final java.lang.Integer[] m;

private static final java.util.Map n;

private static final long o;

public hI(net.minecraft.client.Minecraft p0) {
super();
    this.h = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(-2267490784508475287L)), ((long)(2614840422677815648L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(25929718821278L)))));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.hI.k ^ 102805904858019L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill864_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill864_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill864_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill864_14 = new byte[8];
    (__sourceSpill864_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill864_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation864_16 = __sourceSpill864_14;
    ((javax.crypto.Cipher)(__sourceSpill864_11)).init(((int)(__sourceSpill864_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill864_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation864_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[21];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "a¶÷Ù\"\035\030#\"~\007VìÄÐ¡9ÚR&³\024Áà\b\034\000\037@ýqrá¬®çÈ;¶Ëh*\024.Ãë1\003WÀ\035¾ªàÙ\035sVç1>Í×bÃ\033E4î(Â7ÀÔ\r³·\007äânP:æ\022\017>\013z¤kÈQÈ¨ 8ªAÎT-ÜPq·ÔTmùä\036\036\035]\035¹9ªi0À³\nàJT\177À0ÜT]j"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill864_25 = local11_life21;
        int __sourceSpill864_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill864_25)).substring(((int)(__sourceSpill864_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill864_30 = local13_life19;
        int __sourceSpill864_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill864_33 = new byte[8];
        (__sourceSpill864_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill864_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill864_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill864_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill864_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill864_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill864_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill864_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill864_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill864_34)).doFinal(((byte[])(__sourceSpill864_33)));
        (__sourceSpill864_30)[__sourceSpill864_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "Oü_mµY¡å[!ú\021þÇÁú"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill864_38 = local11_life21;
        int __sourceSpill864_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill864_38)).substring(((int)(__sourceSpill864_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill864_43 = local13_life19;
        int __sourceSpill864_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill864_46 = new byte[8];
        (__sourceSpill864_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill864_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill864_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill864_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill864_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill864_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill864_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill864_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill864_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill864_47)).doFinal(((byte[])(__sourceSpill864_46)));
        (__sourceSpill864_43)[__sourceSpill864_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    l = ((long[])(local13_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[21]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill864_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill864_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill864_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill864_58 = new byte[8];
    (__sourceSpill864_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill864_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation864_60 = __sourceSpill864_58;
    ((javax.crypto.Cipher)(__sourceSpill864_55)).init(((int)(__sourceSpill864_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill864_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation864_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -7791047967369631712L;
    byte[] __sourceSpill864_64 = new byte[8];
    (__sourceSpill864_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill864_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill864_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill864_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill864_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill864_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill864_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill864_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill864_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill864_65)).doFinal(((byte[])(__sourceSpill864_64)));
    o = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
    f = ((moom.DD)(new moom.DD("textures/gui/widgets.png")));
    g = ((moom.DD)(new moom.DD("textures/gui/spectator_widgets.png")));
}


public void b(int p0) {
long life2_3;
    int life4_9;
    lexical_join_52: {
    lexical_join_36: {
    life2_3 = (moom.hI.k ^ 78669652895403L);
    life4_9 = (((moom.iB)(this.j)).a() + p0);
    lexical_cycle_10: while (true) {
    lexical_join_31: {
    if (!((life4_9 >= 0))) {
        break lexical_join_36;
    }
    if (!((life4_9 <= __sourceIntrinsic_8dbec06774c4_invokedynamic1190_3(3335, (7833547873367002498L ^ life2_3))))) {
        break lexical_join_36;
    }
    if (!((((moom.iB)(this.j)).a(((int)(life4_9))) != moom.iB.e))) {
        break lexical_join_31;
    }
    if (!((!((moom.ix)(((moom.iB)(this.j)).a(((int)(life4_9))))).a__Boolean()))) {
        break lexical_join_36;
    }
    }
    life4_9 = (life4_9 + p0);
    continue lexical_cycle_10;
    }
    }
    if (!((life4_9 >= 0))) {
        break lexical_join_52;
    }
    if (!((life4_9 <= __sourceIntrinsic_8dbec06774c4_invokedynamic1190_10(14747, (979439788276300056L ^ life2_3))))) {
        break lexical_join_52;
    }
    ((moom.iB)(this.j)).a__Void(((int)(life4_9)));
    this.i = ((long)(net.minecraft.client.Minecraft.a__Long()));
    }
    return;
}


public void a__Void() {
int life1_9;
    forest_join_24: {
    forest_join_18: {
    forest_join_17: {
    this.i = ((long)(net.minecraft.client.Minecraft.a__Long()));
    if (!(((moom.hI)(this)).a__Boolean())) {
        break forest_join_18;
    }
    life1_9 = ((moom.iB)(this.j)).a();
    if (!((life1_9 != -1))) {
        break forest_join_17;
    }
    ((moom.iB)(this.j)).a__Void(((int)(life1_9)));
    }
    break forest_join_24;
    }
    this.j = ((moom.iB)(new moom.iB(this)));
    }
    return;
}


public boolean a__Boolean() {
return ((((this.j != null) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7874_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_a681c937f39297(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x45EB;
        if (m[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = hI.l[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])hI.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    hI.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/hI", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            hI.m[n4] = n6;
        }
        return m[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.ir p0, float p1, int p2, float p3, moom.iF p4) {
long local6 = (moom.hI.k ^ 110876122761024L);
    moom.kZ.y();
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_3(1409, (1371134532571489509L ^ local6)))), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_4(1897, (1560506958271014427L ^ local6)))), ((int)(1)), ((int)(0)));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(p1)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.h)).a__ok())).a__Void(((moom.DD)(moom.hI.f)));
    ((moom.hI)(this)).a(((float)(((float) (p2 - __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_11(29869, (7840104086524433884L ^ local6)))))), ((float)(p3)), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_12(11077, (742267495601326643L ^ local6)))), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_13(12310, (3365505564611072372L ^ local6)))));
    if ((((moom.iF)(p4)).a() >= 0)) {
        ((moom.hI)(this)).a(((float)(((float) (((p2 - __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_16(26734, (2007686787151530248L ^ local6))) - 1) + (((moom.iF)(p4)).a() * __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_18(22306, (8723651209234232914L ^ local6))))))), ((float)((p3 - 0x1.0p0f))), ((int)(0)), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_19(18337, (504282330660710088L ^ local6)))), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_20(14236, (2205897734610638575L ^ local6)))), ((int)(__sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_21(18337, (504282330660710088L ^ local6)))));
    }
    moom.lt.c();
    int local8 = 0;
    while ((local8 < __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_24(17637, (1205431756167718280L ^ local6)))) {
        ((moom.hI)(this)).a(((int)(local8)), ((int)(((((((moom.ir)(p0)).a__Int() / 2) - __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_26(10931, (4844132673690192850L ^ local6))) + (local8 * __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_27(17151, (124326641307493279L ^ local6)))) + 2))), ((float)((p3 + 0x1.8p1f))), ((float)(p1)), ((moom.ix)(((moom.iF)(p4)).a(((int)(local8))))));
        local8 += 1;
    }
    moom.lt.a();
    moom.kZ.z();
    moom.kZ.k();
    return;
}


public void a(moom.ir p0, float p1) {
float life3_5;
    int life4_20;
    float life5_23;
    float life6_34;
    moom.iF life7_38;
    if ((this.j != null)) {
        life3_5 = ((moom.hI)(this)).a();
        if ((life3_5 <= 0x0.0p0f)) {
        ((moom.iB)(this.j)).a__Void();
    } else {
        life4_20 = (((moom.ir)(p0)).a__Int() / 2);
        life5_23 = ((moom.hI)(this)).d;
        ((moom.hI)(this)).d = ((float)(-0x1.68p6f));
        life6_34 = (((float) ((moom.ir)(p0)).b__Int()) - (0x1.6p4f * life3_5));
        life7_38 = ((moom.iB)(this.j)).a__iF();
        ((moom.hI)(this)).a(((moom.ir)(p0)), ((float)(life3_5)), ((int)(life4_20)), ((float)(life6_34)), ((moom.iF)(life7_38)));
        ((moom.hI)(this)).d = ((float)(life5_23));
    }
    }
    return;
}


private float a() {
long local1 = (moom.hI.k ^ 18278352705690L);
    long local3 = ((this.i - net.minecraft.client.Minecraft.a__Long()) + moom.hI.o);
    return moom.Dr.a(((float)((((float) local3) / 0x1.f4p10f))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
}


public void a(int p0) {
this.i = ((long)(net.minecraft.client.Minecraft.a__Long()));
    if ((this.j != null)) {
        ((moom.iB)(this.j)).a__Void(((int)(p0)));
    } else {
        this.j = ((moom.iB)(new moom.iB(this)));
    }
    return;
}


private void a(int p0, int p1, float p2, float p3, moom.ix p4) {
long life6_3;
    int life8_16;
    float life9_31;
    java.lang.String life10_51;
    life6_3 = (moom.hI.k ^ 97005663497932L);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.h)).a__ok())).a__Void(((moom.DD)(moom.hI.g)));
    if ((p4 != moom.iB.e)) {
        life8_16 = ((int) (p3 * 0x1.fep7f));
        moom.kZ.B();
        moom.kZ.b(((float)(((float) p1))), ((float)(p2)), ((float)(0x0.0p0f)));
        life9_31 = (((moom.ix)(p4)).a__Boolean() ? 0x1.0p0f : 0x1.0p-2f);
        moom.kZ.c(((float)(life9_31)), ((float)(life9_31)), ((float)(life9_31)), ((float)(p3)));
        ((moom.ix)(p4)).a(((float)(life9_31)), ((int)(life8_16)));
        moom.kZ.C();
        life10_51 = java.lang.String.valueOf(((java.lang.Object)(__sourceExactCall_8c6467d9b9664e(((int)(((moom.pz)((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.h)).W)).aJ)[p0])).b()))))));
        if ((life8_16 > 3)) {
        if (((moom.ix)(p4)).a__Boolean()) {
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.h)).N)).a(((java.lang.String)(life10_51)), ((float)(((float) (((p1 + __sourceIntrinsic_89509938c03d_invokedynamic6544_21(7619, (5380636759650112800L ^ life6_3))) - 2) - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.h)).N)).a(((java.lang.String)(life10_51))))))), ((float)(((p2 + 0x1.8p2f) + 0x1.8p1f))), ((int)((__sourceIntrinsic_89509938c03d_invokedynamic6544_25(25724, (2679253335798443155L ^ life6_3)) + (life8_16 << __sourceIntrinsic_89509938c03d_invokedynamic6544_26(14236, (2205867319722917731L ^ life6_3)))))));
    }
    }
    }
    return;
}


public void a(moom.ir p0) {
long life2_3;
    int life4_9;
    moom.ix life5_22;
    java.lang.String life6_37;
    int life7_50;
    int life8_59;
    life2_3 = (moom.hI.k ^ 25199818693852L);
    life4_9 = ((int) (((moom.hI)(this)).a() * 0x1.fep7f));
    if ((life4_9 > 3)) {
        if ((this.j != null)) {
        life5_22 = ((moom.iB)(this.j)).a__ix();
        life6_37 = ((life5_22 != moom.iB.e) ? ((net.minecraft.util.IChatComponent)(((moom.ix)(life5_22)).a__C5())).c() : ((net.minecraft.util.IChatComponent)(((moom.iz)(((moom.iB)(this.j)).a__iz())).b__C5())).c());
        if ((life6_37 != null)) {
        life7_50 = ((((moom.ir)(p0)).a__Int() - ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.h)).N)).a(((java.lang.String)(life6_37)))) / 2);
        life8_59 = (((moom.ir)(p0)).b__Int() - __sourceIntrinsic_b9db2db4e947_invokedynamic6545_17(15607, (3513649555982173710L ^ life2_3)));
        int spill6545_0 = 2326;
        moom.kZ.B();
        long spill6545_1 = (4860991175805826022L ^ life2_3);
        moom.kZ.l();
        moom.kZ.a(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic6545_20(spill6545_0, spill6545_1))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic6545_21(27438, (2839845012756926936L ^ life2_3)))), ((int)(1)), ((int)(0)));
        ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(this.h)).N)).a(((java.lang.String)(life6_37)), ((float)(((float) life7_50))), ((float)(((float) life8_59))), ((int)((__sourceIntrinsic_b9db2db4e947_invokedynamic6545_25(11926, (91785425129886829L ^ life2_3)) + (life4_9 << __sourceIntrinsic_b9db2db4e947_invokedynamic6545_26(1106, (6617922120920039077L ^ life2_3)))))));
        moom.kZ.k();
        moom.kZ.C();
    }
    }
    }
    return;
}


public void a(moom.iB p0) {
this.j = ((moom.iB)(null));
    this.i = ((long)(0L));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_89509938c03d_invokedynamic6544_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89509938c03d_invokedynamic6544_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_89509938c03d_invokedynamic6544_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7874_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic6545_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic6545_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic6545_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic6545_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic6545_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bd7bd9b2cb63_invokedynamic7875_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic1190_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8dbec06774c4_invokedynamic1190_10(int a0, long a1) throws E;

private static native int __sourceExactCall_a681c937f39297(int p0, long p1);
private static native java.lang.String __sourceExactCall_8c6467d9b9664e(int p0);
}
