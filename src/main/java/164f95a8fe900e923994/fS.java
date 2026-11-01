package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class fS implements net.minecraft.util.ITickable {

private java.util.Random a;

private net.minecraft.client.Minecraft b;

private net.minecraft.client.audio.ISound c;

private int d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public fS(net.minecraft.client.Minecraft p0) { super(); }


private static void __sourceConstructorBody_59297768d6dfcfe2(moom.fS receiver, net.minecraft.client.Minecraft p0) throws Throwable {

long local2 = (moom.fS.e ^ 3165094543297L);

    moom.fS.__sourceConstructorInit_59297768d6dfcfe2_0(((moom.fS)(receiver)));

    ((moom.fS)(receiver)).a = ((java.util.Random)(new java.util.Random()));

    ((moom.fS)(receiver)).d = ((int)(__sourceIntrinsic_59297768d6dfcfe2_originalDynamicSite2719_3(19559, (7933722913369643144L ^ local2))));

    ((moom.fS)(receiver)).b = ((net.minecraft.client.Minecraft)(p0));

    return;

}



static {
e = ((long)(((moom._a)(moom._c.a(((long)(2746924575105003709L)), ((long)(8428945246690953100L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(179568649534565L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.fS.e ^ 42204648026743L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill839_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill839_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill839_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill839_14 = new byte[8];
    (__sourceSpill839_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill839_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation839_16 = __sourceSpill839_14;
    ((javax.crypto.Cipher)(__sourceSpill839_11)).init(((int)(__sourceSpill839_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill839_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation839_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ÔÞ\036\024\fjhåóå²"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill839_25 = local6_life21;
        int __sourceSpill839_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill839_25)).substring(((int)(__sourceSpill839_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill839_30 = local8_life19;
        int __sourceSpill839_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill839_33 = new byte[8];
        (__sourceSpill839_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill839_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill839_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill839_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill839_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill839_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill839_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill839_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill839_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill839_34)).doFinal(((byte[])(__sourceSpill839_33)));
        (__sourceSpill839_30)[__sourceSpill839_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_59297768d6dfcfe2_0(moom.fS a0) throws E;

public void c__Void() {
int forwardValue3539_48_0;
    moom.fS forwardValue3539_65_0;
    net.minecraft.client.audio.ISound forwardValue3539_68_0;
    moom.fS forwardValue3539_70_0;
    moom.fS forwardValue3539_80_0;
    java.lang.String spill3539_0;
    net.minecraft.client.audio.ISound spill3539_1;
    boolean spill3539_2;
    moom.fS spill3539_3;
    int spill3539_4;
    long life1_3;
    net.minecraft.client.audio.MusicTicker$MusicType life4_8;
    java.lang.String life3_9;
    forward_join_82: {
    forward_join_80: {
    forward_join_70: {
    forward_join_68: {
    forward_join_65: {
    forward_join_64: {
    forward_join_48: {
    forward_join_40: {
    life1_3 = (moom.fS.e ^ 45771156161049L);
    spill3539_0 = net.minecraft.client.audio.SoundHandler.b();
    life4_8 = ((net.minecraft.client.Minecraft)(this.b)).a__av();
    life3_9 = spill3539_0;
    spill3539_1 = this.c;
    if (!((life3_9 == null))) {
        forwardValue3539_68_0 = spill3539_1;
        break forward_join_68;
    }
    if (!((spill3539_1 != null))) {
        break forward_join_64;
    }
    spill3539_2 = ((moom.DD)(((net.minecraft.client.audio.MusicTicker$MusicType)(life4_8)).a__DD())).equals(((java.lang.Object)(((net.minecraft.client.audio.ISound)(this.c)).a__DD())));
    if (!((life3_9 == null))) {
        forwardValue3539_48_0 = ((spill3539_2) ? 1 : 0);
        break forward_join_48;
    }
    if (!((!spill3539_2))) {
        break forward_join_40;
    }
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.b)).a__f1())).b(((net.minecraft.client.audio.ISound)(this.c)));
    this.d = ((int)(moom.Dr.a(((java.util.Random)(this.a)), ((int)(0)), ((int)((((net.minecraft.client.audio.MusicTicker$MusicType)(life4_8)).a() / 2))))));
    }
    spill3539_3 = this;
    if (!((life3_9 == null))) {
        forwardValue3539_65_0 = spill3539_3;
        break forward_join_65;
    }
    forwardValue3539_48_0 = ((((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(((moom.fS)(spill3539_3)).b)).a__f1())).a__Boolean(((net.minecraft.client.audio.ISound)(this.c)))) ? 1 : 0);
    }
    if (!((forwardValue3539_48_0 == 0))) {
        break forward_join_64;
    }
    this.c = ((net.minecraft.client.audio.ISound)(null));
    this.d = ((int)(java.lang.Math.min(((int)(moom.Dr.a(((java.util.Random)(this.a)), ((int)(((net.minecraft.client.audio.MusicTicker$MusicType)(life4_8)).a())), ((int)(((net.minecraft.client.audio.MusicTicker$MusicType)(life4_8)).b()))))), ((int)(this.d)))));
    }
    forwardValue3539_65_0 = this;
    }
    if (!((life3_9 == null))) {
        forwardValue3539_70_0 = forwardValue3539_65_0;
        break forward_join_70;
    }
    forwardValue3539_68_0 = ((moom.fS)(forwardValue3539_65_0)).c;
    }
    if (!((forwardValue3539_68_0 == null))) {
        break forward_join_82;
    }
    forwardValue3539_70_0 = this;
    }
    if (!((life3_9 == null))) {
        forwardValue3539_80_0 = forwardValue3539_70_0;
        break forward_join_80;
    }
    moom.fS __stackOp3539_32_0 = forwardValue3539_70_0;
    moom.fS __stackOp3539_34_0 = __stackOp3539_32_0;
    int __stackOp3539_34_1 = ((moom.fS)(__stackOp3539_32_0)).d;
    spill3539_4 = __stackOp3539_34_1;
    ((moom.fS)(__stackOp3539_34_0)).d = ((int)((__stackOp3539_34_1 - 1)));
    if (!((spill3539_4 <= 0))) {
        break forward_join_82;
    }
    forwardValue3539_80_0 = this;
    }
    ((moom.fS)(forwardValue3539_80_0)).a(((net.minecraft.client.audio.MusicTicker$MusicType)(life4_8)));
    }
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5F5;
        if (g[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/fS", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            fS.g[n2] = n4;
        }
        return g[n2];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7637_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/fS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.fS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a() {
moom.fS forwardValue3538_21_0;
    moom.fS spill3538_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_23: {
    forward_join_21: {
    life1_3 = (moom.fS.e ^ 49411350347235L);
    life3_5 = net.minecraft.client.audio.SoundHandler.b();
    spill3538_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3538_21_0 = spill3538_0;
        break forward_join_21;
    }
    if (!((((moom.fS)(spill3538_0)).c != null))) {
        break forward_join_23;
    }
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.b)).a__f1())).b(((net.minecraft.client.audio.ISound)(this.c)));
    this.c = ((net.minecraft.client.audio.ISound)(null));
    forwardValue3538_21_0 = this;
    }
    ((moom.fS)(forwardValue3538_21_0)).d = ((int)(0));
    }
    return;
}


public void a(net.minecraft.client.audio.MusicTicker$MusicType p0) {
long local2 = (moom.fS.e ^ 122220276556790L);
    this.c = ((net.minecraft.client.audio.ISound)(moom.fY.a(((moom.DD)(((net.minecraft.client.audio.MusicTicker$MusicType)(p0)).a__DD())))));
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.b)).a__f1())).a(((net.minecraft.client.audio.ISound)(this.c)));
    this.d = ((int)(__sourceIntrinsic_c80d302b4ba2_originalDynamicSite1435_8(11409, (5770136839557899336L ^ local2))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_59297768d6dfcfe2_originalDynamicSite2719_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7637_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c80d302b4ba2_originalDynamicSite1435_8(int a0, long a1) throws E;
}
