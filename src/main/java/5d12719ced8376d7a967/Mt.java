package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Mt implements moom.Mu {

private int a;

private int b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

public Mt(int p0, int p1) { super(); }


private static void __sourceConstructorBody_0785a9807cb23e79(moom.Mt receiver, int p0, int p1) throws Throwable {

long local3_life2 = (moom.Mt.c ^ 48023978981042L);

    moom.Mt.__sourceConstructorInit_0785a9807cb23e79_0(((moom.Mt)(receiver)));

    ((moom.Mt)(receiver)).a = ((int)(org.lwjgl.opengl.GL11.glGenTextures()));

    ((moom.Mt)(receiver)).b = ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_7(23209, (8867656982305932648L ^ local3_life2))));

    byte[] local5_life10 = ((moom.Mt)(receiver)).a(((int)(p0)), ((int)(p1)));

    java.nio.ByteBuffer local6_life12 = org.lwjgl.BufferUtils.createByteBuffer(((int)((local5_life10).length)));

    ((java.nio.ByteBuffer)(local6_life12)).put(((byte[])(local5_life10)));

    ((java.nio.ByteBuffer)(local6_life12)).flip();

    moom.kZ.i(((int)(((moom.Mt)(receiver)).a)));

    org.lwjgl.opengl.GL11.glTexImage2D(((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_18(18668, (4273895475049731902L ^ local3_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_20(14490, (7357226085036123978L ^ local3_life2)))), ((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_22(7628, (51585789703635471L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_24(28744, (5016414528760524674L ^ local3_life2)))), ((java.nio.ByteBuffer)(local6_life12)));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_27(18668, (4273895475049731902L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_29(9478, (1550045609368189632L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_31(21849, (3406584868083468945L ^ local3_life2)))));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_34(18668, (4273895475049731902L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_36(7328, (9015920968387347308L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_38(32702, (8847351767521796219L ^ local3_life2)))));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_41(18668, (4273895475049731902L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_43(10452, (8586273534817629977L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_45(23605, (6655036970575234037L ^ local3_life2)))));

    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_48(18668, (4273895475049731902L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_50(29443, (5703197751626345674L ^ local3_life2)))), ((int)(__sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_52(2370, (2466203112340248205L ^ local3_life2)))));

    moom.kZ.i(((int)(0)));

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-6132826895008882588L)), ((long)(560896374298535200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(51820386270412L)))));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Mt.c ^ 63228400921255L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1029_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1029_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1029_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1029_14 = new byte[8];
    (__sourceSpill1029_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1029_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1029_16 = __sourceSpill1029_14;
    ((javax.crypto.Cipher)(__sourceSpill1029_11)).init(((int)(__sourceSpill1029_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1029_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1029_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[20];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\033A±ÝC\031ó5.£ñ¹z*îÒÉ'[¡¨\033G6!myí´¡\035 N«8\003>ö!;*\\t¼ËZº\033ÖíbÜ Â\0372ÖÏU\025¨e6$â#ßP»\031Ív\037]î{úF0DKáüW#\005ªÜÿök\023ð[\0366ôNµñ\033ú\fèÀ+câ®ë¤\toGqºÔ÷*\007>:´T\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1029_25 = local6_life21;
        int __sourceSpill1029_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1029_25)).substring(((int)(__sourceSpill1029_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1029_30 = local8_life19;
        int __sourceSpill1029_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1029_33 = new byte[8];
        (__sourceSpill1029_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1029_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1029_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1029_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1029_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1029_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1029_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1029_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1029_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1029_34)).doFinal(((byte[])(__sourceSpill1029_33)));
        (__sourceSpill1029_30)[__sourceSpill1029_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "\031\037$Õ8k±WnE<ç"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1029_38 = local6_life21;
        int __sourceSpill1029_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1029_38)).substring(((int)(__sourceSpill1029_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1029_43 = local8_life19;
        int __sourceSpill1029_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1029_46 = new byte[8];
        (__sourceSpill1029_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1029_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1029_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1029_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1029_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1029_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1029_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1029_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1029_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1029_47)).doFinal(((byte[])(__sourceSpill1029_46)));
        (__sourceSpill1029_43)[__sourceSpill1029_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    d = ((long[])(local8_life19));
    e = ((java.lang.Integer[])(new java.lang.Integer[20]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0785a9807cb23e79_0(moom.Mt a0) throws E;

public int b() {
long local1 = (moom.Mt.c ^ 67856523172169L);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    return __sourceIntrinsic_e1958f95391c_originalDynamicSite1327_2(19193, (5626997864122596038L ^ local1));
}


public int c() {
long local1 = (moom.Mt.c ^ 48459472828452L);
    return __sourceIntrinsic_94b06fabf08c_originalDynamicSite1328_1(267, (8082640495054786655L ^ local1));
}


public int d() {
return this.a;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x13AD;
        if (e[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = d[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])f.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    f.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Mt", exception);
            }
            int n8 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Mt.e[n4] = n8;
        }
        return e[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6473_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Mt"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Mt.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private byte a(int p0, int p1, int p2) {
long local4 = (moom.Mt.c ^ 38234492289504L);
    int local6 = (((((moom.Mt)(this)).a(((int)(p0))) + ((moom.Mt)(this)).a(((int)((p1 * __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_2(3063, (5278501746101396322L ^ local4))))))) * ((moom.Mt)(this)).a(((int)((p2 * __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_4(19736, (468804440172619161L ^ local4))))))) - p2);
    return ((byte) (((moom.Mt)(this)).a(((int)(local6))) % __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_7(32691, (8317144211991320362L ^ local4))));
}


private byte[] a(int p0, int p1) {
int forestValue796_18_0;
    int spill796_0;
    int spill796_1;
    long life3_3;
    byte[] life6_10;
    int life7_12;
    int life8_15;
    int life5_16;
    int life9_21;
    int life10_28;
    forest_join_52: {
    life3_3 = (moom.Mt.c ^ 40978609782511L);
    life6_10 = new byte[((p0 * p1) * 3)];
    life7_12 = 0;
    spill796_0 = moom.MS.c();
    life8_15 = 0;
    life5_16 = spill796_0;
    forest_cycle_17: while (true) {
    forest_join_49: {
    forestValue796_18_0 = life8_15;
    forest_cycle_18: while (true) {
    if (!((forestValue796_18_0 < p1))) {
        break forest_join_52;
    }
    life9_21 = 0;
    forest_cycle_22: while (true) {
    forest_join_47: {
    forest_join_46: {
    if (!((life9_21 < p0))) {
        break forest_join_49;
    }
    spill796_1 = 1;
    if (!((life5_16 != 0))) {
        forestValue796_18_0 = spill796_1;
        continue forest_cycle_18;
    }
    life10_28 = spill796_1;
    forest_cycle_29: while (true) {
    if (!((life10_28 < 4))) {
        break forest_join_46;
    }
    (life6_10)[(life7_12++)] = ((moom.Mt)(this)).a(((int)(life9_21)), ((int)(life8_15)), ((int)(life10_28)));
    life10_28 += 1;
    if (!((life5_16 != 0))) {
        break forest_join_47;
    }
    if (!((life5_16 == 0))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    life9_21 += 1;
    }
    if (!((life5_16 == 0))) {
        continue forest_cycle_22;
    }
    break forest_cycle_22;
    }
    break forest_cycle_18;
    }
    }
    life8_15 += 1;
    if (!((life5_16 == 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    return life6_10;
}


public int a() {
return this.a;
}


public void a__Void() {
moom.kZ.h(((int)(this.a)));
    this.a = ((int)(0));
    return;
}


private int a(int p0) {
long local2 = (moom.Mt.c ^ 22531759995780L);
    p0 = (p0 ^ (p0 << __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1330_1(20319, (6762550338516278695L ^ local2))));
    p0 = (p0 ^ (p0 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1330_2(13836, (8990172279449724139L ^ local2))));
    p0 = (p0 ^ (p0 << 5));
    return p0;
}


private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0785a9807cb23e79_originalDynamicSite387_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1330_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1330_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7fc49a7aa40c_originalDynamicSite1329_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6473_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1327_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_94b06fabf08c_originalDynamicSite1328_1(int a0, long a1) throws E;
}
