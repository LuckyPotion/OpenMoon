package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iS extends moom.iQ {

public moom.jD i;

public moom.jD j;

public moom.jD k;

public moom.jD l;

public moom.jD m;

public moom.jD n;

private static long o;

private static long[] p;

private static java.lang.Integer[] q;

private static java.util.Map r;

public iS() { super(); }


private static void __sourceConstructorBody_f5cbf53540d00dc2(moom.iS receiver) throws Throwable {

long local1 = (moom.iS.o ^ 112181118340605L);

    moom.iS.__sourceConstructorInit_f5cbf53540d00dc2_0(((moom.iS)(receiver)));

    ((moom.iS)(receiver)).f = ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_2(8290, (1876529362218661387L ^ local1))));

    ((moom.iS)(receiver)).g = ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_4(14505, (1455385258116853442L ^ local1))));

    ((moom.iS)(receiver)).i = ((moom.jD)(new moom.jD(receiver, 0, 0)));

    ((moom.jD)(((moom.iS)(receiver)).i)).a(((float)(-0x1.8p1f)), ((float)(-0x1.8p1f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_8(2014, (6316002269747155384L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_9(26823, (6953621159110868648L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_10(26823, (6953621159110868648L ^ local1)))));

    moom.jD local3 = new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_12(26711, (8464743775739870764L ^ local1)), 0);

    ((moom.jD)(local3)).a(((float)(-0x1.0p2f)), ((float)(-0x1.8p2f)), ((float)(-0x1.0p1f)), ((int)(3)), ((int)(4)), ((int)(1)));

    ((moom.jD)(((moom.iS)(receiver)).i)).a(((moom.jD)(local3)));

    moom.jD local4 = new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_16(6986, (3306150145199213862L ^ local1)), 0);

    ((moom.jD)(local4)).m = ((boolean)(true));

    ((moom.jD)(local4)).a(((float)(0x1.0p0f)), ((float)(-0x1.8p2f)), ((float)(-0x1.0p1f)), ((int)(3)), ((int)(4)), ((int)(1)));

    ((moom.jD)(((moom.iS)(receiver)).i)).a(((moom.jD)(local4)));

    ((moom.iS)(receiver)).j = ((moom.jD)(new moom.jD(receiver, 0, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_21(9973, (3252833797412434075L ^ local1)))));

    ((moom.jD)(((moom.iS)(receiver)).j)).a(((float)(-0x1.8p1f)), ((float)(0x1.0p2f)), ((float)(-0x1.8p1f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_24(26823, (6953621159110868648L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_25(18139, (9119457137516761270L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_26(26823, (6953621159110868648L ^ local1)))));

    ((moom.jD)(((moom.jD)(((moom.iS)(receiver)).j)).a(((int)(0)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_29(30270, (8091825611336081501L ^ local1))))))).a(((float)(-0x1.4p2f)), ((float)(0x1.0p4f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_31(21310, (2707519571025675611L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_32(26823, (6953621159110868648L ^ local1)))), ((int)(1)));

    ((moom.iS)(receiver)).k = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_34(20629, (769059283249678077L ^ local1)), 0)));

    ((moom.jD)(((moom.iS)(receiver)).k)).a(((float)(-0x1.8p3f)), ((float)(0x1.0p0f)), ((float)(0x1.8p0f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_37(568, (8854784680787579993L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_38(24995, (3183182138417969091L ^ local1)))), ((int)(1)));

    ((moom.iS)(receiver)).m = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_40(6986, (3306150145199213862L ^ local1)), __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_41(24995, (3183182138417969091L ^ local1)))));

    ((moom.jD)(((moom.iS)(receiver)).m)).a(((float)(-0x1.8p3f)), ((float)(0x1.0p0f)), ((float)(0x1.8p0f)));

    ((moom.jD)(((moom.iS)(receiver)).m)).a(((float)(-0x1.0p3f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_46(5805, (201385786070991047L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_47(1759, (6556247849048215739L ^ local1)))), ((int)(1)));

    ((moom.iS)(receiver)).l = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_49(29320, (1372533207141999850L ^ local1)), 0)));

    ((moom.jD)(((moom.iS)(receiver)).l)).m = ((boolean)(true));

    ((moom.jD)(((moom.iS)(receiver)).l)).a(((float)(0x1.0p1f)), ((float)(0x1.0p0f)), ((float)(0x1.8p0f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_54(568, (8854784680787579993L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_55(24995, (3183182138417969091L ^ local1)))), ((int)(1)));

    ((moom.iS)(receiver)).n = ((moom.jD)(new moom.jD(receiver, __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_57(6986, (3306150145199213862L ^ local1)), __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_58(24995, (3183182138417969091L ^ local1)))));

    ((moom.jD)(((moom.iS)(receiver)).n)).m = ((boolean)(true));

    ((moom.jD)(((moom.iS)(receiver)).n)).a(((float)(0x1.8p3f)), ((float)(0x1.0p0f)), ((float)(0x1.8p0f)));

    ((moom.jD)(((moom.iS)(receiver)).n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_65(23058, (5565250506313092213L ^ local1)))), ((int)(__sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_66(1759, (6556247849048215739L ^ local1)))), ((int)(1)));

    ((moom.jD)(((moom.iS)(receiver)).j)).a(((moom.jD)(((moom.iS)(receiver)).k)));

    ((moom.jD)(((moom.iS)(receiver)).j)).a(((moom.jD)(((moom.iS)(receiver)).l)));

    ((moom.jD)(((moom.iS)(receiver)).k)).a(((moom.jD)(((moom.iS)(receiver)).m)));

    ((moom.jD)(((moom.iS)(receiver)).l)).a(((moom.jD)(((moom.iS)(receiver)).n)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_f5cbf53540d00dc2_0(moom.iS a0) throws E;

static {
o = ((long)(((moom._a)(moom._c.a(((long)(-2513581460222307436L)), ((long)(1630497567290436277L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180996411929876L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.iS.o ^ 30760193890159L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1294_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1294_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1294_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1294_14 = new byte[8];
    (__sourceSpill1294_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1294_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1294_16 = __sourceSpill1294_14;
    ((javax.crypto.Cipher)(__sourceSpill1294_11)).init(((int)(__sourceSpill1294_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1294_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1294_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÿê·Õâÿ¸¿uÔ^\006e\026?ë\037½!|H\"ñlÑÑ¼È/!ü\030)qòÜãq´tñQ¸ \037n-»³\016â¨]#p\n\0371hiÇ0ã¨ë<ãKS\025÷¸²¨Rj\"í\033¸\177ÎjL^¯RÿaÄ<××À.LJ3ÅSbt]G\024v°Wý\t"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1294_25 = local6_life21;
        int __sourceSpill1294_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1294_25)).substring(((int)(__sourceSpill1294_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1294_30 = local8_life19;
        int __sourceSpill1294_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1294_33 = new byte[8];
        (__sourceSpill1294_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1294_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1294_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1294_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1294_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1294_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1294_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1294_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1294_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1294_34)).doFinal(((byte[])(__sourceSpill1294_33)));
        (__sourceSpill1294_30)[__sourceSpill1294_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "D\021w\033¦ß]Û»:ù6Ê\007"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1294_38 = local6_life21;
        int __sourceSpill1294_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1294_38)).substring(((int)(__sourceSpill1294_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1294_43 = local8_life19;
        int __sourceSpill1294_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1294_46 = new byte[8];
        (__sourceSpill1294_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1294_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1294_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1294_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1294_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1294_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1294_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1294_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1294_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1294_47)).doFinal(((byte[])(__sourceSpill1294_46)));
        (__sourceSpill1294_43)[__sourceSpill1294_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[17]));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.iS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8017_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/iS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x50F2;
        if (q[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])r.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    r.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/iS", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            iS.q[n2] = n4;
        }
        return q[n2];
}


public void a(net.minecraft.entity.Entity p0, float p1, float p2, float p3, float p4, float p5, float p6) {
((moom.iS)(this)).a(((float)(p1)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)), ((float)(p6)), ((net.minecraft.entity.Entity)(p0)));
    ((moom.jD)(this.i)).a(((float)(p6)));
    ((moom.jD)(this.j)).a(((float)(p6)));
    return;
}


public void a(float p0, float p1, float p2, float p3, float p4, float p5, net.minecraft.entity.Entity p6) {
long life8_3;
    net.minecraft.entity.Entity[] life10_5;
    float life11_11;
    float life11_87;
    forward_join_172: {
    forward_join_86: {
    life8_3 = (moom.iS.o ^ 76296430911222L);
    life10_5 = moom.iQ.b();
    if (!(((net.minecraft.entity.passive.EntityBat)(((net.minecraft.entity.passive.EntityBat)(p6)))).Y())) { break forward_join_86; }
    life11_11 = 0x1.ca5dcp5f;
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).i = ((float)((0x1.921fb6p1f - (p3 / 0x1.ca5dcp5f))));
    ((moom.jD)(this.i)).j = ((float)(0x1.921fb6p1f));
    ((moom.jD)(this.i)).a(((float)(0x0.0p0f)), ((float)(-0x1.0p1f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.k)).a(((float)(-0x1.8p1f)), ((float)(0x0.0p0f)), ((float)(0x1.8p1f)));
    ((moom.jD)(this.l)).a(((float)(0x1.8p1f)), ((float)(0x0.0p0f)), ((float)(0x1.8p1f)));
    ((moom.jD)(this.j)).h = ((float)(0x1.921fb6p1f));
    ((moom.jD)(this.k)).h = ((float)(-0x1.41b2f8p-3f));
    ((moom.jD)(this.k)).i = ((float)(-0x1.41b2f8p0f));
    ((moom.jD)(this.m)).i = ((float)(-0x1.ba5616p0f));
    ((moom.jD)(this.l)).h = ((float)(((moom.jD)(this.k)).h));
    ((moom.jD)(this.l)).i = ((float)((-((moom.jD)(this.k)).i)));
    ((moom.jD)(this.n)).i = ((float)((-((moom.jD)(this.m)).i)));
    if (!((life10_5 == null))) { break forward_join_172; }
    }
    life11_87 = 0x1.ca5dcp5f;
    ((moom.jD)(this.i)).h = ((float)((p4 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).i = ((float)((p3 / 0x1.ca5dcp5f)));
    ((moom.jD)(this.i)).j = ((float)(0x0.0p0f));
    ((moom.jD)(this.i)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.k)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.l)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((moom.jD)(this.j)).h = ((float)((0x1.921fb6p-1f + (moom.Dr.b(((float)((p2 * 0x1.99999ap-4f)))) * 0x1.333334p-3f))));
    ((moom.jD)(this.j)).i = ((float)(0x0.0p0f));
    ((moom.jD)(this.k)).i = ((float)(((moom.Dr.b(((float)((p2 * 0x1.4cccccp0f)))) * 0x1.921fb6p1f) * 0x1.0p-2f)));
    ((moom.jD)(this.l)).i = ((float)((-((moom.jD)(this.k)).i)));
    ((moom.jD)(this.m)).i = ((float)((((moom.jD)(this.k)).i * 0x1.0p-1f)));
    ((moom.jD)(this.n)).i = ((float)(((-((moom.jD)(this.k)).i) * 0x1.0p-1f)));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f5cbf53540d00dc2_originalDynamicSite2891_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8017_0() throws E;
}
