package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class zI implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private int e;

private int f;

private int g;

private int h;

private byte i;

private byte j;

private byte k;

private net.minecraft.entity.DataWatcher l;

private java.util.List<moom.r2> m;

private static long n;

private static long[] o;

private static java.lang.Integer[] p;

private static java.util.Map q;

public zI() {
super();
}


public zI(net.minecraft.entity.EntityLivingBase p0) { super(); }

private static void __sourceConstructorBody_1fa9bf1e13745a56(moom.zI receiver, net.minecraft.entity.EntityLivingBase p0) throws Throwable {
int __initValue771_93_0;
    int __initValue771_103_0;
    int __initValue771_112_0;
    int __initValue771_120_0;
    int __initValue771_130_0;
    double __initValue771_132_0;
    long local2_life2;
    int[] local4_life22;
    double local5_life36;
    double local7_life38;
    double local9_life40;
    double local11_life42;
    init_join_160: {
    init_join_133: {
    init_join_132: {
    init_join_130: {
    init_join_125: {
    init_join_120: {
    init_join_117: {
    init_join_112: {
    init_join_109: {
    init_join_103: {
    init_join_99: {
    init_join_93: {
    init_join_89: {
    local2_life2 = (moom.zI.n ^ 35903674484223L);
    moom.zI.__sourceConstructorInit_1fa9bf1e13745a56_0(((moom.zI)(receiver)));
    ((moom.zI)(receiver)).a = ((int)(((net.minecraft.entity.EntityLivingBase)(p0)).e__Int()));
    ((moom.zI)(receiver)).b = ((int)(((byte) net.minecraft.entity.EntityList.a(((net.minecraft.entity.Entity)(p0))))));
    ((moom.zI)(receiver)).c = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.EntityLivingBase)(p0)).n * 0x1.0000000000000p+5D))))));
    ((moom.zI)(receiver)).d = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.EntityLivingBase)(p0)).o * 0x1.0000000000000p+5D))))));
    int[] __sourceSpill771_21 = moom.zN.b__ArrayInt();
    ((moom.zI)(receiver)).e = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.EntityLivingBase)(p0)).p * 0x1.0000000000000p+5D))))));
    local4_life22 = __sourceSpill771_21;
    ((moom.zI)(receiver)).i = ((byte)(((byte) ((int) ((((net.minecraft.entity.EntityLivingBase)(p0)).w * 0x1.0000000000000p+8F) / 0x1.6800000000000p+8F)))));
    ((moom.zI)(receiver)).j = ((byte)(((byte) ((int) ((((net.minecraft.entity.EntityLivingBase)(p0)).x * 0x1.0000000000000p+8F) / 0x1.6800000000000p+8F)))));
    ((moom.zI)(receiver)).k = ((byte)(((byte) ((int) ((((net.minecraft.entity.EntityLivingBase)(p0)).a4 * 0x1.0000000000000p+8F) / 0x1.6800000000000p+8F)))));
    local5_life36 = 0x1.f333333333333p+1D;
    local7_life38 = ((net.minecraft.entity.EntityLivingBase)(p0)).t;
    local9_life40 = ((net.minecraft.entity.EntityLivingBase)(p0)).u;
    local11_life42 = ((net.minecraft.entity.EntityLivingBase)(p0)).v;
    int __sourceSpill771_44 = recovery.source.CarrierOps.dcmpg(((double)(local7_life38)), ((double)((-local5_life36))));
    if (!((local4_life22 == null))) {
        __initValue771_93_0 = __sourceSpill771_44;
        break init_join_93;
    }
    if (!((__sourceSpill771_44 < 0))) {
        break init_join_89;
    }
    local7_life38 = (-local5_life36);
    }
    __initValue771_93_0 = recovery.source.CarrierOps.dcmpg(((double)(local9_life40)), ((double)((-local5_life36))));
    }
    int __sourceSpill771_46 = __initValue771_93_0;
    if (!((local4_life22 == null))) {
        __initValue771_103_0 = __sourceSpill771_46;
        break init_join_103;
    }
    if (!((__sourceSpill771_46 < 0))) {
        break init_join_99;
    }
    local9_life40 = (-local5_life36);
    }
    __initValue771_103_0 = recovery.source.CarrierOps.dcmpg(((double)(local11_life42)), ((double)((-local5_life36))));
    }
    int __sourceSpill771_48 = __initValue771_103_0;
    if (!((local4_life22 == null))) {
        __initValue771_112_0 = __sourceSpill771_48;
        break init_join_112;
    }
    if (!((__sourceSpill771_48 < 0))) {
        break init_join_109;
    }
    local11_life42 = (-local5_life36);
    }
    __initValue771_112_0 = recovery.source.CarrierOps.dcmpl(((double)(local7_life38)), ((double)(local5_life36)));
    }
    int __sourceSpill771_50 = __initValue771_112_0;
    if (!((local4_life22 == null))) {
        __initValue771_120_0 = __sourceSpill771_50;
        break init_join_120;
    }
    if (!((__sourceSpill771_50 > 0))) {
        break init_join_117;
    }
    local7_life38 = local5_life36;
    }
    __initValue771_120_0 = recovery.source.CarrierOps.dcmpl(((double)(local9_life40)), ((double)(local5_life36)));
    }
    int __sourceSpill771_52 = __initValue771_120_0;
    if (!((local4_life22 == null))) {
        __initValue771_130_0 = __sourceSpill771_52;
        break init_join_130;
    }
    if (!((__sourceSpill771_52 > 0))) {
        break init_join_125;
    }
    local9_life40 = local5_life36;
    }
    double __sourceSpill771_53 = local11_life42;
    if (!((local4_life22 == null))) {
        __initValue771_132_0 = __sourceSpill771_53;
        break init_join_132;
    }
    __initValue771_130_0 = recovery.source.CarrierOps.dcmpl(((double)(__sourceSpill771_53)), ((double)(local5_life36)));
    }
    if (!((__initValue771_130_0 > 0))) {
        break init_join_133;
    }
    __initValue771_132_0 = local5_life36;
    }
    local11_life42 = __initValue771_132_0;
    }
    ((moom.zI)(receiver)).f = ((int)(((int) (local7_life38 * 0x1.f400000000000p+12D))));
    ((moom.zI)(receiver)).g = ((int)(((int) (local9_life40 * 0x1.f400000000000p+12D))));
    ((moom.zI)(receiver)).h = ((int)(((int) (local11_life42 * 0x1.f400000000000p+12D))));
    ((moom.zI)(receiver)).l = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.EntityLivingBase)(p0)).a__r1()));
    if (!((local4_life22 != null))) {
        break init_join_160;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-2265984066231443780L)), ((long)(-6777933860838698404L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(220422512983904L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.zI.n ^ 133404873264465L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1143_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1143_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1143_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1143_14 = new byte[8];
    (__sourceSpill1143_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1143_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1143_16 = __sourceSpill1143_14;
    ((javax.crypto.Cipher)(__sourceSpill1143_11)).init(((int)(__sourceSpill1143_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1143_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1143_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ã¡\006@PÎfQ\005f¨FO"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1143_25 = local6_life21;
        int __sourceSpill1143_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1143_25)).substring(((int)(__sourceSpill1143_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1143_30 = local8_life19;
        int __sourceSpill1143_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1143_33 = new byte[8];
        (__sourceSpill1143_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1143_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1143_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1143_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1143_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1143_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1143_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1143_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1143_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1143_34)).doFinal(((byte[])(__sourceSpill1143_33)));
        (__sourceSpill1143_30)[__sourceSpill1143_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_1fa9bf1e13745a56_0(moom.zI a0) throws E;

public int b__Int() {
return this.b;
}


public byte b() {
return this.j;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.zI.n ^ 111203668506169L);
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)((this.b & __sourceIntrinsic_0875c19f50e0_originalDynamicSite1734_4(31288, (8755375540847513354L ^ local2))))));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.i)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.j)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.k)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.g)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.h)));
    ((net.minecraft.entity.DataWatcher)(this.l)).a__Void(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public int e() {
return this.e;
}


public byte c() {
return this.k;
}


public int c__Int() {
return this.c;
}


public int h() {
return this.h;
}


public int f() {
return this.f;
}


public int d() {
return this.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long local2 = (moom.zI.n ^ 21949119587760L);
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((int)((((net.minecraft.network.PacketBuffer)(p0)).readByte() & __sourceIntrinsic_ba748fb9d83f_originalDynamicSite1735_4(22191, (3590507624010674197L ^ local2)))));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.i = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.j = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.k = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.f = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.g = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.h = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.m = ((java.util.List)(net.minecraft.entity.DataWatcher.a(((net.minecraft.network.PacketBuffer)(p0)))));
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x18D2;
        if (p[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/zI", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            zI.p[n2] = n4;
        }
        return p[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.zI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/zI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int() {
return this.a;
}


public byte a() {
return this.i;
}


public java.util.List<moom.r2> a__List() {
java.util.List forwardValue4594_18_0;
    java.util.List spill4594_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.zI.n ^ 93596321165466L);
    life3_5 = moom.zN.b__ArrayInt();
    spill4594_0 = this.m;
    if (!((life3_5 == null))) {
        forwardValue4594_18_0 = spill4594_0;
        break forward_join_18;
    }
    if (!((spill4594_0 == null))) {
        break forward_join_16;
    }
    this.m = ((java.util.List)(((net.minecraft.entity.DataWatcher)(this.l)).b()));
    }
    forwardValue4594_18_0 = this.m;
    }
    return forwardValue4594_18_0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zI)(this)));
    return;
}


public int g() {
return this.g;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9880_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ba748fb9d83f_originalDynamicSite1735_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0875c19f50e0_originalDynamicSite1734_4(int a0, long a1) throws E;
}
