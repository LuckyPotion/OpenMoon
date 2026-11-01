package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class iI implements moom.ix {

private final moom.Bk a;

private final moom.DD b;

private final java.util.List<moom.jX> c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public iI(moom.Bk p0) {
super();
    this.a = ((moom.Bk)(p0));
    this.c = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    java.util.Iterator local2_life6 = ((java.util.Collection)(((moom.Bk)(p0)).a__Collection())).iterator();
    while (((java.util.Iterator)(local2_life6)).hasNext()) {
        java.lang.String local3_life10 = ((java.lang.String)(((java.util.Iterator)(local2_life6)).next()));
        moom.jX local4_life14 = ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__jS())).a(((java.lang.String)(local3_life10)));
        if ((local4_life14 != null)) {
        ((java.util.List)(this.c)).add(((java.lang.Object)(local4_life14)));
    }
    }
    if ((!((java.util.List)(this.c)).isEmpty())) {
        java.lang.String local2_life27 = ((com.mojang.authlib.GameProfile)(((moom.jX)(((moom.jX)(((java.util.List)(this.c)).get(((int)(((java.util.Random)(new java.util.Random())).nextInt(((int)(((java.util.List)(this.c)).size())))))))))).a__GameProfile())).getName();
        this.b = ((moom.DD)(moom.to.a__DD(((java.lang.String)(local2_life27)))));
        moom.to.b(((moom.DD)(this.b)), ((java.lang.String)(local2_life27)));
    } else {
        this.b = ((moom.DD)(moom.oJ.a()));
    }
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-9107406111046163311L)), ((long)(3603414283897809737L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219014590663850L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iI.d ^ 136548472521447L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1290_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1290_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1290_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1290_14 = new byte[8];
    (__sourceSpill1290_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1290_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1290_16 = __sourceSpill1290_14;
    ((javax.crypto.Cipher)(__sourceSpill1290_11)).init(((int)(__sourceSpill1290_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1290_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1290_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[10];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "º.S&cÒÏ:©£n¢w\037§$=ª±BO:*v5àq7y0\017}w\004\034\013-»\r«oþ-:]\r\032\036O\013.\\õ°âÍÈ\017"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1290_25 = local6_life21;
        int __sourceSpill1290_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1290_25)).substring(((int)(__sourceSpill1290_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1290_30 = local8_life19;
        int __sourceSpill1290_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1290_33 = new byte[8];
        (__sourceSpill1290_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1290_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1290_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1290_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1290_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1290_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1290_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1290_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1290_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1290_34)).doFinal(((byte[])(__sourceSpill1290_33)));
        (__sourceSpill1290_30)[__sourceSpill1290_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "L.*ßk|¢ýdA\016£x"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1290_38 = local6_life21;
        int __sourceSpill1290_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1290_38)).substring(((int)(__sourceSpill1290_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1290_43 = local8_life19;
        int __sourceSpill1290_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1290_46 = new byte[8];
        (__sourceSpill1290_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1290_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1290_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1290_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1290_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1290_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1290_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1290_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1290_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1290_47)).doFinal(((byte[])(__sourceSpill1290_46)));
        (__sourceSpill1290_43)[__sourceSpill1290_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    e = ((long[])(local8_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[10]));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3890;
        if (f[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iI.f[n2] = n3;
        }
        return f[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8010_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM(((moom.Bk)(this.a)).b());
}


public void a(float p0, int p1) {
long life3_3;
    int life5_5;
    java.lang.String life6_10;
    float life7_40;
    float life8_57;
    float life9_68;
    life3_3 = (moom.iI.d ^ 74210630080155L);
    life5_5 = -1;
    life6_10 = net.minecraft.client.gui.FontRenderer.c(((java.lang.String)(((moom.Bk)(this.a)).c())));
    if ((((java.lang.String)(life6_10)).length() >= 2)) {
        life5_5 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).N)).b(((char)(((java.lang.String)(life6_10)).charAt(((int)(1))))));
    }
    if ((life5_5 >= 0)) {
        life7_40 = (((float) ((life5_5 >> __sourceIntrinsic_829be77b853c_invokedynamic6628_9(14824, (3962197203436710017L ^ life3_3))) & __sourceIntrinsic_829be77b853c_invokedynamic6628_10(29665, (4881217317488550538L ^ life3_3)))) / 0x1.fep7f);
        life8_57 = (((float) ((life5_5 >> __sourceIntrinsic_829be77b853c_invokedynamic6628_11(1413, (4494791979834807533L ^ life3_3))) & __sourceIntrinsic_829be77b853c_invokedynamic6628_12(10721, (2140176415286704271L ^ life3_3)))) / 0x1.fep7f);
        life9_68 = (((float) (life5_5 & __sourceIntrinsic_829be77b853c_invokedynamic6628_13(10721, (2140176415286704271L ^ life3_3)))) / 0x1.fep7f);
        net.minecraft.client.gui.Gui.a(((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_14(23880, (1466634182594513966L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_15(5777, (5721607277948438518L ^ life3_3)))), ((int)((moom.Dr.a__Int(((float)((life7_40 * p0))), ((float)((life8_57 * p0))), ((float)((life9_68 * p0)))) | (p1 << __sourceIntrinsic_829be77b853c_invokedynamic6628_17(27106, (9036649529787119759L ^ life3_3)))))));
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a__Void(((moom.DD)(this.b)));
    moom.kZ.c(((float)(p0)), ((float)(p0)), ((float)(p0)), ((float)((((float) p1) / 0x1.fep7f))));
    net.minecraft.client.gui.Gui.a(((int)(2)), ((int)(2)), ((float)(0x1.0p3f)), ((float)(0x1.0p3f)), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_24(5945, (288791368384579157L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_25(5945, (288791368384579157L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_26(1245, (2266931099610584503L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_27(26455, (7914513976981583416L ^ life3_3)))), ((float)(0x1.0p6f)), ((float)(0x1.0p6f)));
    net.minecraft.client.gui.Gui.a(((int)(2)), ((int)(2)), ((float)(0x1.4p5f)), ((float)(0x1.0p3f)), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_29(5945, (288791368384579157L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_30(5945, (288791368384579157L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_31(26455, (7914513976981583416L ^ life3_3)))), ((int)(__sourceIntrinsic_829be77b853c_invokedynamic6628_32(26455, (7914513976981583416L ^ life3_3)))), ((float)(0x1.0p6f)), ((float)(0x1.0p6f)));
    return;
}


public boolean a__Boolean() {
return ((((__sourceIntrinsic_booleanComparison(((java.util.List)(this.c)).isEmpty()) == 0) ? 1 : 0)) != 0);
}


public void a(moom.iB p0) {
((moom.iB)(p0)).a(((moom.iz)(new moom.iG(this.c))));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8010_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_829be77b853c_invokedynamic6628_32(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
