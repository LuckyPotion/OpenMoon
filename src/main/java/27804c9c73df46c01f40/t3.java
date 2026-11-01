package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

























import moom.vF;












import java.util.Set;









import moom.zV;


import net.minecraft.entity.DataWatcher;

import moom.zZ;

import net.minecraft.entity.EntityLivingBase;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
public class t3 {

private static org.apache.logging.log4j.Logger a;

public net.minecraft.entity.Entity b;

public int c;

public int d;

public int e;

public int f;

public int g;

public int h;

public int i;

public int j;

public double k;

public double l;

public double m;

public int n;

private double o;

private double p;

private double q;

private boolean r;

private boolean s;

private int t;

private net.minecraft.entity.Entity u;

private boolean v;

private boolean w;

public boolean x;

public java.util.Set<net.minecraft.entity.player.EntityPlayerMP> y;

private static long z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public t3(net.minecraft.entity.Entity p0, int p1, int p2, boolean p3) {
super();
    this.y = com.google.common.collect.Sets.newHashSet();
    this.b = p0;
    this.c = p1;
    this.d = p2;
    this.s = p3;
    this.e = moom.Dr.b__Int((p0.n * 0x1.0000000000000p+5d));
    this.f = moom.Dr.b__Int((p0.o * 0x1.0000000000000p+5d));
    this.g = moom.Dr.b__Int((p0.p * 0x1.0000000000000p+5d));
    this.h = moom.Dr.a__Int(((p0.w * 0x1.0000000000000p+8f) / 0x1.6800000000000p+8f));
    this.i = moom.Dr.a__Int(((p0.x * 0x1.0000000000000p+8f) / 0x1.6800000000000p+8f));
    this.j = moom.Dr.a__Int((((p0).d__Float() * 0x1.0000000000000p+8f) / 0x1.6800000000000p+8f));
    this.w = p0.A;
}


static {
z = ((long)(((moom._a)(moom._c.a(((long)(6443614711120782309L)), ((long)(-8948513692759003776L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(270291859832308L)))));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.t3.z ^ 104964144527698L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1550_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1550_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1550_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1550_14 = new byte[8];
    (__sourceSpill1550_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1550_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1550_16 = __sourceSpill1550_14;
    ((javax.crypto.Cipher)(__sourceSpill1550_11)).init(((int)(__sourceSpill1550_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1550_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1550_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[28];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ôÎB*r\013|;·Ôù(ÓÊË/k@û³ùqç\bâ«I±Îªë\027Ò\022Öþá (ªý{GhôWûí\0243\037,\bC\004:¸\t\rKê´&\013QÅBoÀ¯5þ?ï¼\bþF`\036nÕ¢\026\022ÅªL\005mDüì]\032ocÖ\022ºJQ\0138( b5r²½%1}æåBpÿ8íXùÊ¿ÀSõÅ\000P?Fe\031\030\020ùlµÖ\0241q|/Ï\037¸\030kÈ¹Üó\000qü+\003£®£É(\\,í¤ËcQM¶Á¬\035³¤\017\027\006\016JY"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1550_25 = local6_life21;
        int __sourceSpill1550_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1550_25)).substring(((int)(__sourceSpill1550_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1550_30 = local8_life19;
        int __sourceSpill1550_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1550_33 = new byte[8];
        (__sourceSpill1550_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1550_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1550_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1550_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1550_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1550_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1550_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1550_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1550_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1550_34)).doFinal(((byte[])(__sourceSpill1550_33)));
        (__sourceSpill1550_30)[__sourceSpill1550_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "µ\031 «ì±ïhéö¾m\017ë"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1550_38 = local6_life21;
        int __sourceSpill1550_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1550_38)).substring(((int)(__sourceSpill1550_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1550_43 = local8_life19;
        int __sourceSpill1550_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1550_46 = new byte[8];
        (__sourceSpill1550_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1550_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1550_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1550_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1550_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1550_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1550_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1550_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1550_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1550_47)).doFinal(((byte[])(__sourceSpill1550_46)));
        (__sourceSpill1550_43)[__sourceSpill1550_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    A = ((long[])(local8_life19));
    B = ((java.lang.Integer[])(new java.lang.Integer[28]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> moom.yK __sourceHandlerCall_a12f8f9234cbd2d3a8f7(moom.t3 a0) throws E;
private static final class __SourceHandler_a12f8f9234cbd2d3a8f7 {

public static moom.yK f300111(moom.t3 receiver) throws Throwable {
    int forwardValue300111_18_0;
    int forwardValue300111_34_0;
    net.minecraft.entity.Entity forwardValue300111_44_0;
    int forwardValue300111_70_0;
    int forwardValue300111_83_0;
    int forwardValue300111_106_0;
    moom.zH forwardValue300111_128_0;
    moom.zH forwardValue300111_128_1;
    net.minecraft.entity.Entity forwardValue300111_128_2;
    int forwardValue300111_128_3;
    moom.zH forwardValue300111_131_0;
    moom.zH forwardValue300111_131_1;
    net.minecraft.entity.Entity forwardValue300111_131_2;
    int forwardValue300111_131_3;
    int forwardValue300111_131_4;
    int forwardValue300111_136_0;
    moom.zH forwardValue300111_158_0;
    moom.zH forwardValue300111_158_1;
    net.minecraft.entity.Entity forwardValue300111_158_2;
    int forwardValue300111_158_3;
    moom.zH forwardValue300111_161_0;
    moom.zH forwardValue300111_161_1;
    net.minecraft.entity.Entity forwardValue300111_161_2;
    int forwardValue300111_161_3;
    int forwardValue300111_161_4;
    int forwardValue300111_166_0;
    int forwardValue300111_183_0;
    int forwardValue300111_204_0;
    int forwardValue300111_221_0;
    int forwardValue300111_238_0;
    int forwardValue300111_255_0;
    int forwardValue300111_274_0;
    int forwardValue300111_305_0;
    int forwardValue300111_313_0;
    int forwardValue300111_364_0;
    int forwardValue300111_381_0;
    int forwardValue300111_398_0;
    int forwardValue300111_417_0;
    int forwardValue300111_440_0;
    int forwardValue300111_457_0;
    int forwardValue300111_472_0;
    int forwardValue300111_538_0;
    int forwardValue300111_599_0;
    boolean spill300111_0;
    moom.zH spill300111_1;
    net.minecraft.entity.Entity spill300111_2;
    moom.zF spill300111_3;
    int spill300111_4;
    moom.zH spill300111_5;
    moom.zH spill300111_6;
    moom.zI spill300111_7;
    moom.zH spill300111_8;
    moom.zH spill300111_9;
    net.minecraft.entity.Entity spill300111_10;
    int spill300111_11;
    moom.zH spill300111_12;
    moom.zH spill300111_13;
    net.minecraft.entity.Entity spill300111_14;
    int spill300111_15;
    moom.zH spill300111_16;
    moom.zH spill300111_17;
    moom.zH spill300111_18;
    moom.zH spill300111_19;
    moom.zH spill300111_20;
    moom.zH spill300111_21;
    int spill300111_22;
    int spill300111_23;
    moom.zH spill300111_24;
    moom.zH spill300111_25;
    moom.zH spill300111_26;
    moom.zH spill300111_27;
    moom.zH spill300111_28;
    moom.zH spill300111_29;
    moom.zH spill300111_30;
    moom.zJ spill300111_31;
    moom.zH spill300111_32;
    moom.zH spill300111_33;
    moom.zK spill300111_34;
    java.lang.IllegalArgumentException spill300111_35;
    long life1_3;
    int life3_5;
    net.minecraft.entity.Entity life9_60;
    net.minecraft.entity.item.EntityMinecart life4_71;
    net.minecraft.entity.player.EntityPlayer life9_145;
    net.minecraft.entity.Entity life9_180;
    net.minecraft.entity.projectile.EntityFireball life5_351;
    java.lang.Object life9_354;
    int life10_359;
    moom.zH life9_409;
    net.minecraft.entity.item.EntityFallingBlock life6_521;
    net.minecraft.entity.item.EntityItemFrame life7_589;
    moom.zH life9_603;
    moom.DT life10_606;
    moom.sD life8_658;
    moom.zH life9_669;
    moom.DT life10_672;
    forward_join_607: {
    forward_join_599: {
    forward_join_596: {
    forward_join_538: {
    forward_join_533: {
    forward_join_472: {
    forward_join_467: {
    forward_join_457: {
    forward_join_454: {
    forward_join_440: {
    forward_join_437: {
    forward_join_417: {
    forward_join_412: {
    forward_join_398: {
    forward_join_395: {
    forward_join_381: {
    forward_join_378: {
    forward_join_364: {
    forward_join_361: {
    forward_join_338: {
    forward_join_330: {
    forward_join_314: {
    forward_join_313: {
    forward_join_305: {
    forward_join_302: {
    forward_join_274: {
    forward_join_269: {
    forward_join_255: {
    forward_join_252: {
    forward_join_238: {
    forward_join_235: {
    forward_join_221: {
    forward_join_218: {
    forward_join_204: {
    forward_join_201: {
    forward_join_183: {
    forward_join_180: {
    forward_join_166: {
    forward_join_163: {
    forward_join_161: {
    forward_join_158: {
    forward_join_136: {
    forward_join_133: {
    forward_join_131: {
    forward_join_128: {
    forward_join_106: {
    forward_join_103: {
    forward_join_83: {
    forward_join_80: {
    forward_join_70: {
    forward_join_67: {
    forward_join_44: {
    forward_join_42: {
    forward_join_34: {
    forward_join_29: {
    forward_join_18: {
    forward_join_15: {
    life1_3 = (__fieldRead300111_0() ^ 71414182187074L);
    life3_5 = __call300111_1();
    spill300111_0 = __fieldRead300111_3(__fieldRead300111_2(receiver));
    if (!((life3_5 != 0))) {
        forwardValue300111_18_0 = __integerCategory300111_4(spill300111_0);
        break forward_join_18;
    }
    if (!(spill300111_0)) {
        break forward_join_15;
    }
    __call300111_6(__fieldRead300111_5(), "Fetching addPacket for removed entity");
    }
    forwardValue300111_18_0 = __instanceOf300111_8(__fieldRead300111_7(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_34_0 = forwardValue300111_18_0;
        break forward_join_34;
    }
    if (!((forwardValue300111_18_0 != 0))) {
        break forward_join_29;
    }
    moom.zH __stackOp300111_10_0 = __sourceUninitializedNEW300111_9();
    spill300111_1 = __stackOp300111_10_0;
    __explicitNewInit300111_12(__stackOp300111_10_0, __fieldRead300111_11(receiver), 2, 1);
    return spill300111_1;
    }
    spill300111_2 = __fieldRead300111_13(receiver);
    if (!((life3_5 != 0))) {
        forwardValue300111_44_0 = spill300111_2;
        break forward_join_44;
    }
    forwardValue300111_34_0 = __instanceOf300111_14(spill300111_2);
    }
    if (!((forwardValue300111_34_0 != 0))) {
        break forward_join_42;
    }
    moom.zF __stackOp300111_16_0 = __sourceUninitializedNEW300111_15();
    spill300111_3 = __stackOp300111_16_0;
    __explicitNewInit300111_19(__stackOp300111_16_0, __cast300111_18(__fieldRead300111_17(receiver)));
    return spill300111_3;
    }
    forwardValue300111_44_0 = __fieldRead300111_20(receiver);
    }
    life9_60 = forwardValue300111_44_0;
    spill300111_4 = __instanceOf300111_21(life9_60);
    if (!((life3_5 != 0))) {
        forwardValue300111_70_0 = spill300111_4;
        break forward_join_70;
    }
    if (!((spill300111_4 != 0))) {
        break forward_join_67;
    }
    life4_71 = __cast300111_22(life9_60);
    moom.zH __stackOp300111_24_0 = __sourceUninitializedNEW300111_23();
    spill300111_5 = __stackOp300111_24_0;
    __explicitNewInit300111_29(__stackOp300111_24_0, __fieldRead300111_25(receiver), __invokedynamic300111_26(21971, (7952831839326490872L ^ life1_3)), __call300111_28(__call300111_27(life4_71)));
    return spill300111_5;
    }
    forwardValue300111_70_0 = __instanceOf300111_31(__fieldRead300111_30(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_83_0 = forwardValue300111_70_0;
        break forward_join_83;
    }
    if (!((forwardValue300111_70_0 != 0))) {
        break forward_join_80;
    }
    moom.zH __stackOp300111_33_0 = __sourceUninitializedNEW300111_32();
    spill300111_6 = __stackOp300111_33_0;
    __explicitNewInit300111_35(__stackOp300111_33_0, __fieldRead300111_34(receiver), 1);
    return spill300111_6;
    }
    forwardValue300111_83_0 = __instanceOf300111_37(__fieldRead300111_36(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_106_0 = forwardValue300111_83_0;
        break forward_join_106;
    }
    if (!((forwardValue300111_83_0 != 0))) {
        break forward_join_103;
    }
    __fieldWrite300111_41(receiver, __call300111_40(((__call300111_39(__fieldRead300111_38(receiver)) * 0x1.0p8f) / 0x1.68p8f)));
    moom.zI __stackOp300111_43_0 = __sourceUninitializedNEW300111_42();
    spill300111_7 = __stackOp300111_43_0;
    __explicitNewInit300111_46(__stackOp300111_43_0, __cast300111_45(__fieldRead300111_44(receiver)));
    return spill300111_7;
    }
    forwardValue300111_106_0 = __instanceOf300111_48(__fieldRead300111_47(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_136_0 = forwardValue300111_106_0;
        break forward_join_136;
    }
    if (!((forwardValue300111_106_0 != 0))) {
        break forward_join_133;
    }
    life9_145 = __fieldRead300111_51(__cast300111_50(__fieldRead300111_49(receiver)));
    moom.zH __stackOp300111_53_0 = __sourceUninitializedNEW300111_52();
    spill300111_8 = __stackOp300111_53_0;
    spill300111_9 = __stackOp300111_53_0;
    spill300111_10 = __fieldRead300111_54(receiver);
    spill300111_11 = __invokedynamic300111_55(19487, (5805760363626481965L ^ life1_3));
    if (!((life9_145 != null))) {
        forwardValue300111_128_0 = spill300111_8;
        forwardValue300111_128_1 = spill300111_9;
        forwardValue300111_128_2 = spill300111_10;
        forwardValue300111_128_3 = spill300111_11;
        break forward_join_128;
    }
    forwardValue300111_131_0 = spill300111_8;
    forwardValue300111_131_1 = spill300111_9;
    forwardValue300111_131_2 = spill300111_10;
    forwardValue300111_131_3 = spill300111_11;
    forwardValue300111_131_4 = __call300111_56(life9_145);
    break forward_join_131;
    }
    forwardValue300111_131_0 = forwardValue300111_128_0;
    forwardValue300111_131_1 = forwardValue300111_128_1;
    forwardValue300111_131_2 = forwardValue300111_128_2;
    forwardValue300111_131_3 = forwardValue300111_128_3;
    forwardValue300111_131_4 = __call300111_58(__fieldRead300111_57(receiver));
    }
    __explicitNewInit300111_59(forwardValue300111_131_1, forwardValue300111_131_2, forwardValue300111_131_3, forwardValue300111_131_4);
    return forwardValue300111_131_0;
    }
    forwardValue300111_136_0 = __instanceOf300111_61(__fieldRead300111_60(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_166_0 = forwardValue300111_136_0;
        break forward_join_166;
    }
    if (!((forwardValue300111_136_0 != 0))) {
        break forward_join_163;
    }
    life9_180 = __fieldRead300111_64(__cast300111_63(__fieldRead300111_62(receiver)));
    moom.zH __stackOp300111_66_0 = __sourceUninitializedNEW300111_65();
    spill300111_12 = __stackOp300111_66_0;
    spill300111_13 = __stackOp300111_66_0;
    spill300111_14 = __fieldRead300111_67(receiver);
    spill300111_15 = __invokedynamic300111_68(2631, (5860708936036355967L ^ life1_3));
    if (!((life9_180 != null))) {
        forwardValue300111_158_0 = spill300111_12;
        forwardValue300111_158_1 = spill300111_13;
        forwardValue300111_158_2 = spill300111_14;
        forwardValue300111_158_3 = spill300111_15;
        break forward_join_158;
    }
    forwardValue300111_161_0 = spill300111_12;
    forwardValue300111_161_1 = spill300111_13;
    forwardValue300111_161_2 = spill300111_14;
    forwardValue300111_161_3 = spill300111_15;
    forwardValue300111_161_4 = __call300111_69(life9_180);
    break forward_join_161;
    }
    forwardValue300111_161_0 = forwardValue300111_158_0;
    forwardValue300111_161_1 = forwardValue300111_158_1;
    forwardValue300111_161_2 = forwardValue300111_158_2;
    forwardValue300111_161_3 = forwardValue300111_158_3;
    forwardValue300111_161_4 = __call300111_71(__fieldRead300111_70(receiver));
    }
    __explicitNewInit300111_72(forwardValue300111_161_1, forwardValue300111_161_2, forwardValue300111_161_3, forwardValue300111_161_4);
    return forwardValue300111_161_0;
    }
    forwardValue300111_166_0 = __instanceOf300111_74(__fieldRead300111_73(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_183_0 = forwardValue300111_166_0;
        break forward_join_183;
    }
    if (!((forwardValue300111_166_0 != 0))) {
        break forward_join_180;
    }
    moom.zH __stackOp300111_76_0 = __sourceUninitializedNEW300111_75();
    spill300111_16 = __stackOp300111_76_0;
    __explicitNewInit300111_79(__stackOp300111_76_0, __fieldRead300111_77(receiver), __invokedynamic300111_78(17783, (170981976255807578L ^ life1_3)));
    return spill300111_16;
    }
    forwardValue300111_183_0 = __instanceOf300111_81(__fieldRead300111_80(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_204_0 = forwardValue300111_183_0;
        break forward_join_204;
    }
    if (!((forwardValue300111_183_0 != 0))) {
        break forward_join_201;
    }
    moom.zH __stackOp300111_83_0 = __sourceUninitializedNEW300111_82();
    spill300111_17 = __stackOp300111_83_0;
    __explicitNewInit300111_89(__stackOp300111_83_0, __fieldRead300111_84(receiver), __invokedynamic300111_85(32448, (1411008663995284456L ^ life1_3)), __call300111_88(__cast300111_87(__fieldRead300111_86(receiver))));
    return spill300111_17;
    }
    forwardValue300111_204_0 = __instanceOf300111_91(__fieldRead300111_90(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_221_0 = forwardValue300111_204_0;
        break forward_join_221;
    }
    if (!((forwardValue300111_204_0 != 0))) {
        break forward_join_218;
    }
    moom.zH __stackOp300111_93_0 = __sourceUninitializedNEW300111_92();
    spill300111_18 = __stackOp300111_93_0;
    __explicitNewInit300111_96(__stackOp300111_93_0, __fieldRead300111_94(receiver), __invokedynamic300111_95(6001, (7294981895186453058L ^ life1_3)));
    return spill300111_18;
    }
    forwardValue300111_221_0 = __instanceOf300111_98(__fieldRead300111_97(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_238_0 = forwardValue300111_221_0;
        break forward_join_238;
    }
    if (!((forwardValue300111_221_0 != 0))) {
        break forward_join_235;
    }
    moom.zH __stackOp300111_100_0 = __sourceUninitializedNEW300111_99();
    spill300111_19 = __stackOp300111_100_0;
    __explicitNewInit300111_103(__stackOp300111_100_0, __fieldRead300111_101(receiver), __invokedynamic300111_102(31330, (7710607382650715980L ^ life1_3)));
    return spill300111_19;
    }
    forwardValue300111_238_0 = __instanceOf300111_105(__fieldRead300111_104(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_255_0 = forwardValue300111_238_0;
        break forward_join_255;
    }
    if (!((forwardValue300111_238_0 != 0))) {
        break forward_join_252;
    }
    moom.zH __stackOp300111_107_0 = __sourceUninitializedNEW300111_106();
    spill300111_20 = __stackOp300111_107_0;
    __explicitNewInit300111_110(__stackOp300111_107_0, __fieldRead300111_108(receiver), __invokedynamic300111_109(13500, (4826362155853263248L ^ life1_3)));
    return spill300111_20;
    }
    forwardValue300111_255_0 = __instanceOf300111_112(__fieldRead300111_111(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_274_0 = forwardValue300111_255_0;
        break forward_join_274;
    }
    if (!((forwardValue300111_255_0 != 0))) {
        break forward_join_269;
    }
    moom.zH __stackOp300111_114_0 = __sourceUninitializedNEW300111_113();
    spill300111_21 = __stackOp300111_114_0;
    __explicitNewInit300111_117(__stackOp300111_114_0, __fieldRead300111_115(receiver), __invokedynamic300111_116(21791, (5684471060626919470L ^ life1_3)));
    return spill300111_21;
    }
    life9_60 = __fieldRead300111_118(receiver);
    forwardValue300111_274_0 = __instanceOf300111_119(life9_60);
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_364_0 = forwardValue300111_274_0;
        break forward_join_364;
    }
    if (!((forwardValue300111_274_0 != 0))) {
        break forward_join_361;
    }
    life5_351 = __cast300111_120(life9_60);
    spill300111_22 = 3281;
    life9_354 = null;
    life10_359 = __invokedynamic300111_121(spill300111_22, (8474278496386681339L ^ life1_3));
    spill300111_23 = __instanceOf300111_123(__fieldRead300111_122(receiver));
    if (!((life3_5 != 0))) {
        forwardValue300111_305_0 = spill300111_23;
        break forward_join_305;
    }
    if (!((spill300111_23 != 0))) {
        break forward_join_302;
    }
    life10_359 = __invokedynamic300111_124(6310, (8417201143789329799L ^ life1_3));
    if (!((life3_5 == 0))) {
        break forward_join_314;
    }
    }
    forwardValue300111_305_0 = __instanceOf300111_126(__fieldRead300111_125(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_313_0 = forwardValue300111_305_0;
        break forward_join_313;
    }
    if (!((forwardValue300111_305_0 != 0))) {
        break forward_join_314;
    }
    forwardValue300111_313_0 = __invokedynamic300111_127(15230, (9157626237035691584L ^ life1_3));
    }
    life10_359 = forwardValue300111_313_0;
    }
    if (!((__fieldRead300111_128(life5_351) != null))) {
        break forward_join_330;
    }
    moom.zH __stackOp300111_130_0 = __sourceUninitializedNEW300111_129();
    spill300111_24 = __stackOp300111_130_0;
    __explicitNewInit300111_136(__stackOp300111_130_0, __fieldRead300111_131(receiver), life10_359, __call300111_135(__fieldRead300111_134(__cast300111_133(__fieldRead300111_132(receiver)))));
    life9_409 = spill300111_24;
    break forward_join_338;
    }
    moom.zH __stackOp300111_138_0 = __sourceUninitializedNEW300111_137();
    spill300111_25 = __stackOp300111_138_0;
    __explicitNewInit300111_140(__stackOp300111_138_0, __fieldRead300111_139(receiver), life10_359, 0);
    life9_409 = spill300111_25;
    }
    __call300111_142(life9_409, ((int) (__fieldRead300111_141(life5_351) * 0x1.f4p12d)));
    __call300111_144(life9_409, ((int) (__fieldRead300111_143(life5_351) * 0x1.f4p12d)));
    __call300111_146(life9_409, ((int) (__fieldRead300111_145(life5_351) * 0x1.f4p12d)));
    return life9_409;
    }
    forwardValue300111_364_0 = __instanceOf300111_148(__fieldRead300111_147(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_381_0 = forwardValue300111_364_0;
        break forward_join_381;
    }
    if (!((forwardValue300111_364_0 != 0))) {
        break forward_join_378;
    }
    moom.zH __stackOp300111_150_0 = __sourceUninitializedNEW300111_149();
    spill300111_26 = __stackOp300111_150_0;
    __explicitNewInit300111_153(__stackOp300111_150_0, __fieldRead300111_151(receiver), __invokedynamic300111_152(18733, (5223804243905268765L ^ life1_3)));
    return spill300111_26;
    }
    forwardValue300111_381_0 = __instanceOf300111_155(__fieldRead300111_154(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_398_0 = forwardValue300111_381_0;
        break forward_join_398;
    }
    if (!((forwardValue300111_381_0 != 0))) {
        break forward_join_395;
    }
    moom.zH __stackOp300111_157_0 = __sourceUninitializedNEW300111_156();
    spill300111_27 = __stackOp300111_157_0;
    __explicitNewInit300111_160(__stackOp300111_157_0, __fieldRead300111_158(receiver), __invokedynamic300111_159(32355, (7190892825423248195L ^ life1_3)));
    return spill300111_27;
    }
    forwardValue300111_398_0 = __instanceOf300111_162(__fieldRead300111_161(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_417_0 = forwardValue300111_398_0;
        break forward_join_417;
    }
    if (!((forwardValue300111_398_0 != 0))) {
        break forward_join_412;
    }
    moom.zH __stackOp300111_164_0 = __sourceUninitializedNEW300111_163();
    spill300111_28 = __stackOp300111_164_0;
    __explicitNewInit300111_167(__stackOp300111_164_0, __fieldRead300111_165(receiver), __invokedynamic300111_166(3952, (7499651238761302605L ^ life1_3)));
    return spill300111_28;
    }
    life9_60 = __fieldRead300111_168(receiver);
    forwardValue300111_417_0 = __instanceOf300111_169(life9_60);
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_440_0 = forwardValue300111_417_0;
        break forward_join_440;
    }
    if (!((forwardValue300111_417_0 != 0))) {
        break forward_join_437;
    }
    life6_521 = __cast300111_170(life9_60);
    moom.zH __stackOp300111_172_0 = __sourceUninitializedNEW300111_171();
    spill300111_29 = __stackOp300111_172_0;
    __explicitNewInit300111_177(__stackOp300111_172_0, __fieldRead300111_173(receiver), __invokedynamic300111_174(3339, (5002536390588237868L ^ life1_3)), __call300111_176(__call300111_175(life6_521)));
    return spill300111_29;
    }
    forwardValue300111_440_0 = __instanceOf300111_179(__fieldRead300111_178(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_457_0 = forwardValue300111_440_0;
        break forward_join_457;
    }
    if (!((forwardValue300111_440_0 != 0))) {
        break forward_join_454;
    }
    moom.zH __stackOp300111_181_0 = __sourceUninitializedNEW300111_180();
    spill300111_30 = __stackOp300111_181_0;
    __explicitNewInit300111_184(__stackOp300111_181_0, __fieldRead300111_182(receiver), __invokedynamic300111_183(31602, (9025187365977423451L ^ life1_3)));
    return spill300111_30;
    }
    forwardValue300111_457_0 = __instanceOf300111_186(__fieldRead300111_185(receiver));
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_472_0 = forwardValue300111_457_0;
        break forward_join_472;
    }
    if (!((forwardValue300111_457_0 != 0))) {
        break forward_join_467;
    }
    moom.zJ __stackOp300111_188_0 = __sourceUninitializedNEW300111_187();
    spill300111_31 = __stackOp300111_188_0;
    __explicitNewInit300111_191(__stackOp300111_188_0, __cast300111_190(__fieldRead300111_189(receiver)));
    return spill300111_31;
    }
    life9_60 = __fieldRead300111_192(receiver);
    forwardValue300111_472_0 = __instanceOf300111_193(life9_60);
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_538_0 = forwardValue300111_472_0;
        break forward_join_538;
    }
    if (!((forwardValue300111_472_0 != 0))) {
        break forward_join_533;
    }
    life7_589 = __cast300111_194(life9_60);
    moom.zH __stackOp300111_196_0 = __sourceUninitializedNEW300111_195();
    spill300111_32 = __stackOp300111_196_0;
    __explicitNewInit300111_201(__stackOp300111_196_0, __fieldRead300111_197(receiver), __invokedynamic300111_198(11847, (8376885079638846305L ^ life1_3)), __call300111_200(__fieldRead300111_199(life7_589)));
    life9_603 = spill300111_32;
    life10_606 = __call300111_202(life7_589);
    __call300111_206(life9_603, __call300111_205(((float) (__call300111_203(life10_606) * __invokedynamic300111_204(13920, (5941953044250571612L ^ life1_3))))));
    __call300111_210(life9_603, __call300111_209(((float) (__call300111_207(life10_606) * __invokedynamic300111_208(13920, (5941953044250571612L ^ life1_3))))));
    __call300111_214(life9_603, __call300111_213(((float) (__call300111_211(life10_606) * __invokedynamic300111_212(13920, (5941953044250571612L ^ life1_3))))));
    return life9_603;
    }
    life9_60 = __fieldRead300111_215(receiver);
    forwardValue300111_538_0 = __instanceOf300111_216(life9_60);
    }
    if (!((life3_5 != 0))) {
        forwardValue300111_599_0 = forwardValue300111_538_0;
        break forward_join_599;
    }
    if (!((forwardValue300111_538_0 != 0))) {
        break forward_join_596;
    }
    life8_658 = __cast300111_217(life9_60);
    moom.zH __stackOp300111_219_0 = __sourceUninitializedNEW300111_218();
    spill300111_33 = __stackOp300111_219_0;
    __explicitNewInit300111_222(__stackOp300111_219_0, __fieldRead300111_220(receiver), __invokedynamic300111_221(27628, (3182950098255769283L ^ life1_3)));
    life9_669 = spill300111_33;
    life10_672 = __call300111_223(life8_658);
    __call300111_227(life9_669, __call300111_226(((float) (__call300111_224(life10_672) * __invokedynamic300111_225(13920, (5941953044250571612L ^ life1_3))))));
    __call300111_231(life9_669, __call300111_230(((float) (__call300111_228(life10_672) * __invokedynamic300111_229(13920, (5941953044250571612L ^ life1_3))))));
    __call300111_235(life9_669, __call300111_234(((float) (__call300111_232(life10_672) * __invokedynamic300111_233(13920, (5941953044250571612L ^ life1_3))))));
    return life9_669;
    }
    forwardValue300111_599_0 = __instanceOf300111_237(__fieldRead300111_236(receiver));
    }
    if (!((forwardValue300111_599_0 != 0))) {
        break forward_join_607;
    }
    moom.zK __stackOp300111_239_0 = __sourceUninitializedNEW300111_238();
    spill300111_34 = __stackOp300111_239_0;
    __explicitNewInit300111_242(__stackOp300111_239_0, __cast300111_241(__fieldRead300111_240(receiver)));
    return spill300111_34;
    }
    java.lang.IllegalArgumentException __stackOp300111_244_0 = __sourceUninitializedNEW300111_243();
    spill300111_35 = __stackOp300111_244_0;
    __explicitNewInit300111_248(__stackOp300111_244_0, __invokedynamic300111_247(__call300111_246(__fieldRead300111_245(receiver))));
    throw spill300111_35;
}
private static native long __fieldRead300111_0() throws Throwable;
private static native int __call300111_1() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_2(moom.t3 a0) throws Throwable;
private static native boolean __fieldRead300111_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory300111_4(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead300111_5() throws Throwable;
private static native void __call300111_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_7(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_9() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_11(moom.t3 a0) throws Throwable;
private static native void __explicitNewInit300111_12(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_13(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zF __sourceUninitializedNEW300111_15() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_17(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast300111_18(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_19(moom.zF a0, net.minecraft.entity.player.EntityPlayer a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_20(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart __cast300111_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_23() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_25(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_26(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __call300111_27(net.minecraft.entity.item.EntityMinecart a0) throws Throwable;
private static native int __call300111_28(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native void __explicitNewInit300111_29(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_30(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_32() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_34(moom.t3 a0) throws Throwable;
private static native void __explicitNewInit300111_35(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_36(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_37(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_38(moom.t3 a0) throws Throwable;
private static native float __call300111_39(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call300111_40(float a0) throws Throwable;
private static native void __fieldWrite300111_41(moom.t3 a0, int a1) throws Throwable;
private static native moom.zI __sourceUninitializedNEW300111_42() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_44(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast300111_45(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_46(moom.zI a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_47(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_48(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_49(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityFishHook __cast300111_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __fieldRead300111_51(net.minecraft.entity.projectile.EntityFishHook a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_52() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_54(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_55(int a0, long a1) throws Throwable;
private static native int __call300111_56(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_57(moom.t3 a0) throws Throwable;
private static native int __call300111_58(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_59(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_60(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_61(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_62(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityArrow __cast300111_63(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_64(net.minecraft.entity.projectile.EntityArrow a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_65() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_67(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_68(int a0, long a1) throws Throwable;
private static native int __call300111_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_70(moom.t3 a0) throws Throwable;
private static native int __call300111_71(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_72(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_73(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_74(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_75() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_77(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_78(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_79(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_80(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_81(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_82() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_84(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_85(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_86(moom.t3 a0) throws Throwable;
private static native moom.tW __cast300111_87(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call300111_88(moom.tW a0) throws Throwable;
private static native void __explicitNewInit300111_89(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_90(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_91(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_92() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_94(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_95(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_96(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_97(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_98(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_99() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_101(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_102(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_103(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_104(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_105(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_106() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_108(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_109(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_110(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_111(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_112(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_113() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_115(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_116(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_117(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_118(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_119(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityFireball __cast300111_120(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic300111_121(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_122(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_123(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic300111_124(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_125(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_126(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __invokedynamic300111_127(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead300111_128(net.minecraft.entity.projectile.EntityFireball a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_129() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_131(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_132(moom.t3 a0) throws Throwable;
private static native net.minecraft.entity.projectile.EntityFireball __cast300111_133(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead300111_134(net.minecraft.entity.projectile.EntityFireball a0) throws Throwable;
private static native int __call300111_135(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit300111_136(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_137() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_139(moom.t3 a0) throws Throwable;
private static native void __explicitNewInit300111_140(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native double __fieldRead300111_141(net.minecraft.entity.projectile.EntityFireball a0) throws Throwable;
private static native void __call300111_142(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead300111_143(net.minecraft.entity.projectile.EntityFireball a0) throws Throwable;
private static native void __call300111_144(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead300111_145(net.minecraft.entity.projectile.EntityFireball a0) throws Throwable;
private static native void __call300111_146(moom.zH a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_147(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_148(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_149() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_151(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_152(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_153(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_154(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_155(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_156() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_158(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_159(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_160(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_161(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_162(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_163() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_165(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_166(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_167(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_168(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_169(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.item.EntityFallingBlock __cast300111_170(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_171() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_173(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_174(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call300111_175(net.minecraft.entity.item.EntityFallingBlock a0) throws Throwable;
private static native int __call300111_176(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native void __explicitNewInit300111_177(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_178(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_179(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_180() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_182(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_183(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_184(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_185(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_186(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zJ __sourceUninitializedNEW300111_187() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_189(moom.t3 a0) throws Throwable;
private static native moom.sF __cast300111_190(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_191(moom.zJ a0, moom.sF a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_192(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_193(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.item.EntityItemFrame __cast300111_194(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_195() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_197(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_198(int a0, long a1) throws Throwable;
private static native moom.bs __fieldRead300111_199(net.minecraft.entity.item.EntityItemFrame a0) throws Throwable;
private static native int __call300111_200(moom.bs a0) throws Throwable;
private static native void __explicitNewInit300111_201(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws Throwable;
private static native moom.DT __call300111_202(net.minecraft.entity.item.EntityItemFrame a0) throws Throwable;
private static native int __call300111_203(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_204(int a0, long a1) throws Throwable;
private static native int __call300111_205(float a0) throws Throwable;
private static native void __call300111_206(moom.zH a0, int a1) throws Throwable;
private static native int __call300111_207(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_208(int a0, long a1) throws Throwable;
private static native int __call300111_209(float a0) throws Throwable;
private static native void __call300111_210(moom.zH a0, int a1) throws Throwable;
private static native int __call300111_211(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_212(int a0, long a1) throws Throwable;
private static native int __call300111_213(float a0) throws Throwable;
private static native void __call300111_214(moom.zH a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_215(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_216(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.sD __cast300111_217(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zH __sourceUninitializedNEW300111_218() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_220(moom.t3 a0) throws Throwable;
private static native int __invokedynamic300111_221(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300111_222(moom.zH a0, net.minecraft.entity.Entity a1, int a2) throws Throwable;
private static native moom.DT __call300111_223(moom.sD a0) throws Throwable;
private static native int __call300111_224(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_225(int a0, long a1) throws Throwable;
private static native int __call300111_226(float a0) throws Throwable;
private static native void __call300111_227(moom.zH a0, int a1) throws Throwable;
private static native int __call300111_228(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_229(int a0, long a1) throws Throwable;
private static native int __call300111_230(float a0) throws Throwable;
private static native void __call300111_231(moom.zH a0, int a1) throws Throwable;
private static native int __call300111_232(moom.DT a0) throws Throwable;
private static native int __invokedynamic300111_233(int a0, long a1) throws Throwable;
private static native int __call300111_234(float a0) throws Throwable;
private static native void __call300111_235(moom.zH a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_236(moom.t3 a0) throws Throwable;
private static native int __instanceOf300111_237(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.zK __sourceUninitializedNEW300111_238() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_240(moom.t3 a0) throws Throwable;
private static native moom.tL __cast300111_241(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __explicitNewInit300111_242(moom.zK a0, moom.tL a1) throws Throwable;
private static native java.lang.IllegalArgumentException __sourceUninitializedNEW300111_243() throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead300111_245(moom.t3 a0) throws Throwable;
private static native java.lang.Class __call300111_246(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __invokedynamic300111_247(java.lang.Class a0) throws Throwable;
private static native void __explicitNewInit300111_248(java.lang.IllegalArgumentException a0, java.lang.String a1) throws Throwable;

}


public boolean equals(java.lang.Object p0) {
int forwardValue4025_15_0;
    int forwardValue4025_22_0;
    int forwardValue4025_24_0;
    int spill4025_0;
    long life2_3;
    int life4_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_15: {
    life2_3 = (moom.t3.z ^ 68154459069501L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4025_0 = ((p0 instanceof moom.t3) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forwardValue4025_15_0 = spill4025_0;
        break forward_join_15;
    }
    if (!((spill4025_0 != 0))) {
        break forward_join_23;
    }
    forwardValue4025_15_0 = ((net.minecraft.entity.Entity)(((moom.t3)(((moom.t3)(p0)))).b)).e__Int();
    }
    if (!((life4_5 == 0))) {
        forwardValue4025_22_0 = forwardValue4025_15_0;
        break forward_join_22;
    }
    if (!((forwardValue4025_15_0 == ((net.minecraft.entity.Entity)(this.b)).e__Int()))) {
        break forward_join_23;
    }
    forwardValue4025_22_0 = 1;
    }
    forwardValue4025_24_0 = forwardValue4025_22_0;
    break forward_join_24;
    }
    forwardValue4025_24_0 = 0;
    }
    return ((forwardValue4025_24_0) != 0);
}


public int hashCode() {
return ((net.minecraft.entity.Entity)(this.b)).e__Int();
}


public void b() {
int spill1308_0;
    long life1_3;
    java.util.Iterator life4_8;
    int life3_9;
    net.minecraft.entity.player.EntityPlayerMP life5_16;
    lexical_join_23: {
    life1_3 = (moom.t3.z ^ 66170371918010L);
    spill1308_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life4_8 = ((java.util.Set)(this.y)).iterator();
    life3_9 = spill1308_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_23;
    }
    life5_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.entity.player.EntityPlayerMP)(life5_16)).m(((net.minecraft.entity.Entity)(this.b)));
    if (!((life3_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void b(net.minecraft.entity.player.EntityPlayerMP p0) {
int lexicalValue1310_26_0;
    int lexicalValue1310_39_0;
    net.minecraft.entity.Entity lexicalValue1310_69_0;
    int lexicalValue1310_132_0;
    moom.t3 lexicalValue1310_155_0;
    net.minecraft.entity.Entity lexicalValue1310_174_0;
    net.minecraft.entity.Entity lexicalValue1310_200_0;
    int lexicalValue1310_203_0;
    net.minecraft.entity.Entity lexicalValue1310_237_0;
    int lexicalValue1310_270_0;
    net.minecraft.entity.Entity lexicalValue1310_272_0;
    int lexicalValue1310_305_0;
    int lexicalValue1310_312_0;
    boolean spill1310_0;
    boolean spill1310_1;
    boolean spill1310_2;
    net.minecraft.entity.Entity spill1310_3;
    int spill1310_4;
    boolean spill1310_5;
    moom.t3 spill1310_6;
    net.minecraft.entity.Entity spill1310_7;
    int spill1310_8;
    net.minecraft.entity.Entity spill1310_9;
    int spill1310_10;
    boolean spill1310_11;
    net.minecraft.entity.Entity spill1310_12;
    long life2_3;
    int life4_5;
    moom.yK life5_69;
    net.minecraft.nbt.NBTTagCompound life6_103;
    moom.vF life7_133;
    java.util.Collection life8_136;
    int life7_280;
    net.minecraft.item.ItemStack life8_289;
    net.minecraft.entity.Entity life8_321;
    net.minecraft.entity.player.EntityPlayer life7_332;
    net.minecraft.entity.EntityLivingBase life7_369;
    java.util.Iterator life8_373;
    net.minecraft.potion.PotionEffect life9_380;
    lexical_join_317: {
    lexical_join_312: {
    lexical_join_305: {
    lexical_join_301: {
    lexical_join_299: {
    lexical_join_272: {
    lexical_join_270: {
    lexical_join_263: {
    lexical_join_237: {
    lexical_join_235: {
    lexical_join_203: {
    lexical_join_200: {
    lexical_join_198: {
    lexical_join_174: {
    lexical_join_172: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_132: {
    lexical_join_113: {
    lexical_join_83: {
    lexical_join_69: {
    lexical_join_67: {
    lexical_join_39: {
    lexical_join_35: {
    lexical_join_26: {
    life2_3 = (moom.t3.z ^ 77761559801801L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    if (!((p0 != this.b))) {
        break lexical_join_317;
    }
    spill1310_0 = ((moom.t3)(this)).a__Boolean(((net.minecraft.entity.player.EntityPlayerMP)(p0)));
    if (!((life4_5 != 0))) {
        lexicalValue1310_305_0 = ((spill1310_0) ? 1 : 0);
        break lexical_join_305;
    }
    if (!(spill1310_0)) {
        break lexical_join_301;
    }
    spill1310_1 = ((java.util.Set)(this.y)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != 0))) {
        lexicalValue1310_26_0 = ((spill1310_1) ? 1 : 0);
        break lexical_join_26;
    }
    if (!((!spill1310_1))) {
        break lexical_join_317;
    }
    lexicalValue1310_26_0 = ((((moom.t3)(this)).b__Boolean(((net.minecraft.entity.player.EntityPlayerMP)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1310_39_0 = lexicalValue1310_26_0;
        break lexical_join_39;
    }
    if (!((lexicalValue1310_26_0 == 0))) {
        break lexical_join_35;
    }
    spill1310_2 = ((net.minecraft.entity.Entity)(this.b)).h;
    if (!((life4_5 != 0))) {
        lexicalValue1310_39_0 = ((spill1310_2) ? 1 : 0);
        break lexical_join_39;
    }
    if (!(spill1310_2)) {
        break lexical_join_317;
    }
    }
    lexicalValue1310_39_0 = ((((java.util.Set)(this.y)).add(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1310_39_0);
    life5_69 = ((moom.t3)(this)).a();
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(life5_69)));
    spill1310_3 = this.b;
    if (!((life4_5 != 0))) {
        lexicalValue1310_69_0 = spill1310_3;
        break lexical_join_69;
    }
    if (!((!((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.Entity)(spill1310_3)).a__r1())).b__Boolean()))) {
        break lexical_join_67;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zV(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((net.minecraft.entity.Entity)(this.b)).a__r1(), true))));
    }
    lexicalValue1310_69_0 = this.b;
    }
    life6_103 = ((net.minecraft.entity.Entity)(lexicalValue1310_69_0)).a__yw();
    if (!((life6_103 != null))) {
        break lexical_join_83;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.AK(((net.minecraft.entity.Entity)(this.b)).e__Int(), life6_103))));
    }
    spill1310_4 = ((this.b instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue1310_132_0 = spill1310_4;
        break lexical_join_132;
    }
    if (!((spill1310_4 != 0))) {
        break lexical_join_113;
    }
    life7_133 = ((moom.vF)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.b)))).a__vE()));
    life8_136 = ((moom.vF)(life7_133)).b();
    spill1310_5 = ((java.util.Collection)(life8_136)).isEmpty();
    if (!((life4_5 != 0))) {
        lexicalValue1310_132_0 = ((spill1310_5) ? 1 : 0);
        break lexical_join_132;
    }
    if (!((!spill1310_5))) {
        break lexical_join_113;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zZ(((net.minecraft.entity.Entity)(this.b)).e__Int(), life8_136))));
    }
    this.k = ((double)(((net.minecraft.entity.Entity)(this.b)).t));
    this.l = ((double)(((net.minecraft.entity.Entity)(this.b)).u));
    this.m = ((double)(((net.minecraft.entity.Entity)(this.b)).v));
    spill1310_6 = this;
    if (!((life4_5 != 0))) {
        lexicalValue1310_155_0 = spill1310_6;
        break lexical_join_155;
    }
    lexicalValue1310_132_0 = ((((moom.t3)(spill1310_6)).s) ? 1 : 0);
    }
    if (!((lexicalValue1310_132_0 != 0))) {
        break lexical_join_154;
    }
    if (!((((life5_69 instanceof moom.zI) ? 1 : 0) == 0))) {
        break lexical_join_154;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zL(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((net.minecraft.entity.Entity)(this.b)).t, ((net.minecraft.entity.Entity)(this.b)).u, ((net.minecraft.entity.Entity)(this.b)).v))));
    }
    lexicalValue1310_155_0 = this;
    }
    spill1310_7 = ((net.minecraft.entity.Entity)(((moom.t3)(lexicalValue1310_155_0)).b)).g;
    if (!((life4_5 != 0))) {
        lexicalValue1310_174_0 = spill1310_7;
        break lexical_join_174;
    }
    if (!((spill1310_7 != null))) {
        break lexical_join_172;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zU(0, this.b, ((net.minecraft.entity.Entity)(this.b)).g))));
    }
    lexicalValue1310_174_0 = this.b;
    }
    spill1310_8 = ((lexicalValue1310_174_0 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue1310_203_0 = spill1310_8;
        break lexical_join_203;
    }
    if (!((spill1310_8 != 0))) {
        break lexical_join_198;
    }
    spill1310_9 = ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(this.b)))).c__sourceReturn_09c029d8c3();
    if (!((life4_5 != 0))) {
        lexicalValue1310_200_0 = spill1310_9;
        break lexical_join_200;
    }
    if (!((spill1310_9 != null))) {
        break lexical_join_198;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zU(1, this.b, ((net.minecraft.entity.EntityLiving)(((net.minecraft.entity.EntityLiving)(this.b)))).c__sourceReturn_09c029d8c3()))));
    }
    lexicalValue1310_200_0 = this.b;
    }
    if (!((life4_5 != 0))) {
        lexicalValue1310_237_0 = lexicalValue1310_200_0;
        break lexical_join_237;
    }
    lexicalValue1310_203_0 = ((lexicalValue1310_200_0 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((lexicalValue1310_203_0 != 0))) {
        break lexical_join_235;
    }
    life7_280 = 0;
    lexical_cycle_206: while (true) {
    lexical_join_233: {
    lexical_join_232: {
    if (!((life7_280 < 5))) {
        break lexical_join_235;
    }
    life8_289 = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(this.b)))).a__xW(((int)(life7_280)));
    if (!((life4_5 != 0))) {
        break lexical_join_299;
    }
    if (!((life4_5 != 0))) {
        break lexical_join_233;
    }
    if (!((life8_289 != null))) {
        break lexical_join_232;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zx(((net.minecraft.entity.Entity)(this.b)).e__Int(), life7_280, life8_289))));
    }
    life7_280 += 1;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_206; }
    break lexical_cycle_206;
    }
    }
    lexicalValue1310_237_0 = this.b;
    }
    life8_321 = lexicalValue1310_237_0;
    spill1310_10 = ((life8_321 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_5 != 0))) {
        lexicalValue1310_270_0 = spill1310_10;
        break lexical_join_270;
    }
    if (!((spill1310_10 != 0))) {
        break lexical_join_263;
    }
    life7_332 = ((net.minecraft.entity.player.EntityPlayer)(life8_321));
    spill1310_11 = ((net.minecraft.entity.player.EntityPlayer)(life7_332)).K__Boolean();
    if (!((life4_5 != 0))) {
        lexicalValue1310_270_0 = ((spill1310_11) ? 1 : 0);
        break lexical_join_270;
    }
    if (!(spill1310_11)) {
        break lexical_join_263;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zD(life7_332, new moom.DT(this.b)))));
    }
    life8_321 = this.b;
    spill1310_12 = life8_321;
    if (!((life4_5 != 0))) {
        lexicalValue1310_272_0 = spill1310_12;
        break lexical_join_272;
    }
    lexicalValue1310_270_0 = ((spill1310_12 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((lexicalValue1310_270_0 != 0))) {
        break lexical_join_299;
    }
    lexicalValue1310_272_0 = life8_321;
    }
    life7_369 = ((net.minecraft.entity.EntityLivingBase)(lexicalValue1310_272_0));
    life8_373 = ((java.util.Collection)(((net.minecraft.entity.EntityLivingBase)(life7_369)).a__Collection())).iterator();
    lexical_cycle_278: while (true) {
    if (!(((java.util.Iterator)(life8_373)).hasNext())) {
        break lexical_join_299;
    }
    life9_380 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life8_373)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).cg)).a(((moom.yK)(new moom.zW(((net.minecraft.entity.Entity)(this.b)).e__Int(), life9_380))));
    if (!((life4_5 != 0))) {
        break lexical_join_317;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_278; }
    break lexical_cycle_278;
    }
    }
    if (!((life4_5 == 0))) {
        break lexical_join_317;
    }
    }
    lexicalValue1310_305_0 = ((((java.util.Set)(this.y)).contains(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        lexicalValue1310_312_0 = lexicalValue1310_305_0;
        break lexical_join_312;
    }
    if (!((lexicalValue1310_305_0 != 0))) {
        break lexical_join_317;
    }
    lexicalValue1310_312_0 = ((((java.util.Set)(this.y)).remove(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1310_312_0);
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).m(((net.minecraft.entity.Entity)(this.b)));
    }
    return;
}


private boolean b__Boolean(net.minecraft.entity.player.EntityPlayerMP p0) {
return (__sourceIntrinsic_booleanComparison((((moom.Br)(((net.minecraft.world.WorldServer)(((net.minecraft.entity.player.EntityPlayerMP)(p0)).a__Ew())).a__Br())).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)), ((int)(((net.minecraft.entity.Entity)(this.b)).W)), ((int)(((net.minecraft.entity.Entity)(this.b)).Y))))) != 0);
}


public void b(java.util.List<net.minecraft.entity.player.EntityPlayer> p0) {
int spill1309_0;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    net.minecraft.entity.player.EntityPlayer life6_15;
    lexical_join_22: {
    life2_3 = (moom.t3.z ^ 2665436050785L);
    spill1309_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_7 = ((java.util.List)(p0)).iterator();
    life4_8 = spill1309_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_22;
    }
    life6_15 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life5_7)).next()));
    ((moom.t3)(this)).b(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(life6_15)))));
    if (!((life4_8 != 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public void b(moom.yK p0) {
net.minecraft.entity.Entity forwardValue4022_17_0;
    int spill4022_0;
    net.minecraft.entity.Entity spill4022_1;
    long life2_3;
    int life4_8;
    forward_join_21: {
    forward_join_17: {
    life2_3 = (moom.t3.z ^ 28107132503427L);
    spill4022_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    ((moom.t3)(this)).a(((moom.yK)(p0)));
    life4_8 = spill4022_0;
    spill4022_1 = this.b;
    if (!((life4_8 == 0))) {
        forwardValue4022_17_0 = spill4022_1;
        break forward_join_17;
    }
    if (!((((spill4022_1 instanceof net.minecraft.entity.player.EntityPlayerMP) ? 1 : 0) != 0))) {
        break forward_join_21;
    }
    forwardValue4022_17_0 = this.b;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(((net.minecraft.entity.player.EntityPlayerMP)(forwardValue4022_17_0)))).cg)).a(((moom.yK)(p0)));
    }
    return;
}


public void c(net.minecraft.entity.player.EntityPlayerMP p0) {
int forwardValue4024_17_0;
    boolean spill4024_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_17: {
    life2_3 = (moom.t3.z ^ 72119124775555L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.b();
    spill4024_0 = ((java.util.Set)(this.y)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue4024_17_0 = ((spill4024_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill4024_0)) {
        break forward_join_22;
    }
    forwardValue4024_17_0 = ((((java.util.Set)(this.y)).remove(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4024_17_0);
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).m(((net.minecraft.entity.Entity)(this.b)));
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9110_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/t3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.t3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6713;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/t3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


public void a(java.util.List<net.minecraft.entity.player.EntityPlayer> p0) {
moom.t3 forestValue910006_50_0;
    net.minecraft.entity.Entity forestValue910006_57_0;
    moom.t3 forestValue910006_57_1;
    moom.t3 forestValue910006_83_0;
    moom.t3 forestValue910006_94_0;
    net.minecraft.entity.Entity forestValue910006_95_0;
    net.minecraft.item.ItemStack forestValue910006_123_0;
    int forestValue910006_177_0;
    moom.t3 forestValue910006_192_0;
    net.minecraft.entity.Entity forestValue910006_194_0;
    int forestValue910006_289_0;
    int forestValue910006_291_0;
    int forestValue910006_311_0;
    int forestValue910006_313_0;
    int forestValue910006_326_0;
    int forestValue910006_340_0;
    int forestValue910006_340_1;
    int forestValue910006_349_0;
    int forestValue910006_349_1;
    int forestValue910006_358_0;
    int forestValue910006_358_1;
    int forestValue910006_367_0;
    int forestValue910006_367_1;
    int forestValue910006_376_0;
    int forestValue910006_376_1;
    int forestValue910006_388_0;
    int forestValue910006_388_1;
    int forestValue910006_413_0;
    int forestValue910006_417_0;
    int forestValue910006_438_0;
    moom.t3 forestValue910006_481_0;
    moom.t3 forestValue910006_506_0;
    int forestValue910006_559_0;
    int forestValue910006_567_0;
    int forestValue910006_577_0;
    moom.t3 forestValue910006_594_0;
    int forestValue910006_628_0;
    net.minecraft.entity.Entity forestValue910006_641_0;
    int forestValue910006_676_0;
    int forestValue910006_678_0;
    net.minecraft.entity.Entity forestValue910006_765_0;
    int forestValue910006_778_0;
    net.minecraft.entity.Entity forestValue910006_788_0;
    int spill910006_0;
    moom.t3 spill910006_1;
    net.minecraft.entity.Entity spill910006_2;
    moom.t3 spill910006_3;
    moom.t3 spill910006_4;
    net.minecraft.entity.Entity spill910006_5;
    moom.t3 spill910006_6;
    int spill910006_7;
    int spill910006_8;
    net.minecraft.item.ItemStack spill910006_9;
    moom.t3 spill910006_10;
    net.minecraft.entity.Entity spill910006_11;
    boolean spill910006_12;
    int spill910006_13;
    int spill910006_14;
    int spill910006_15;
    int spill910006_16;
    int spill910006_17;
    int spill910006_18;
    int spill910006_19;
    int spill910006_20;
    int spill910006_21;
    moom.t3 spill910006_22;
    moom.t3 spill910006_23;
    moom.t3 spill910006_24;
    int spill910006_25;
    int spill910006_26;
    moom.t3 spill910006_27;
    int spill910006_28;
    moom.t3 spill910006_29;
    int spill910006_30;
    int spill910006_31;
    int spill910006_32;
    net.minecraft.entity.Entity spill910006_33;
    net.minecraft.entity.Entity spill910006_34;
    long life2_3;
    int life4_8;
    net.minecraft.entity.Entity life6_119;
    net.minecraft.entity.item.EntityItemFrame life5_130;
    net.minecraft.item.ItemStack life6_147;
    net.minecraft.world.storage.MapData life7_167;
    java.util.Iterator life8_170;
    net.minecraft.entity.player.EntityPlayer life9_179;
    net.minecraft.entity.player.EntityPlayerMP life10_182;
    moom.yK life11_194;
    int life5_268;
    int life6_275;
    int life7_282;
    int life8_291;
    int life9_300;
    int life10_305;
    int life11_310;
    int life12_315;
    moom.yK life13_317;
    int life14_367;
    int life15_398;
    double life16_663;
    double life18_670;
    double life20_677;
    double life22_679;
    double life24_691;
    int life5_831;
    int life6_840;
    int life7_871;
    int life5_943;
    forest_join_790: {
    forest_join_788: {
    forest_join_778: {
    forest_join_767: {
    forest_join_765: {
    forest_join_763: {
    forest_join_733: {
    forest_join_730: {
    forest_join_704: {
    forest_join_678: {
    forest_join_677: {
    forest_join_676: {
    forest_join_675: {
    forest_join_641: {
    forest_join_639: {
    forest_join_635: {
    forest_join_628: {
    forest_join_627: {
    forest_join_612: {
    forest_join_607: {
    forest_join_594: {
    forest_join_593: {
    forest_join_578: {
    forest_join_577: {
    forest_join_567: {
    forest_join_559: {
    forest_join_506: {
    forest_join_500: {
    forest_join_481: {
    forest_join_475: {
    forest_join_454: {
    forest_join_438: {
    forest_join_437: {
    forest_join_417: {
    forest_join_413: {
    forest_join_410: {
    forest_join_388: {
    forest_join_376: {
    forest_join_367: {
    forest_join_358: {
    forest_join_349: {
    forest_join_340: {
    forest_join_326: {
    forest_join_325: {
    forest_join_313: {
    forest_join_312: {
    forest_join_311: {
    forest_join_310: {
    forest_join_291: {
    forest_join_290: {
    forest_join_289: {
    forest_join_288: {
    forest_join_194: {
    forest_join_192: {
    forest_join_191: {
    forest_join_177: {
    forest_join_170: {
    forest_join_168: {
    forest_join_123: {
    forest_join_95: {
    forest_join_94: {
    forest_join_93: {
    forest_join_83: {
    forest_join_77: {
    forest_join_57: {
    forest_join_52: {
    forest_join_50: {
    forest_join_28: {
    life2_3 = (moom.t3.z ^ 58795975804323L);
    spill910006_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    this.x = ((boolean)(false));
    life4_8 = spill910006_0;
    spill910006_1 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_50_0 = spill910006_1;
        break forest_join_50;
    }
    if (!(((moom.t3)(spill910006_1)).r)) {
        break forest_join_28;
    }
    spill910006_2 = this.b;
    spill910006_3 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_57_0 = spill910006_2;
        forestValue910006_57_1 = spill910006_3;
        break forest_join_57;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(spill910006_2)).a(((double)(((moom.t3)(spill910006_3)).o)), ((double)(this.p)), ((double)(this.q))))), ((double)(0x1.0p4d))) > 0))) {
        break forest_join_52;
    }
    }
    this.o = ((double)(((net.minecraft.entity.Entity)(this.b)).n));
    this.p = ((double)(((net.minecraft.entity.Entity)(this.b)).o));
    this.q = ((double)(((net.minecraft.entity.Entity)(this.b)).p));
    this.r = ((boolean)(true));
    this.x = ((boolean)(true));
    forestValue910006_50_0 = this;
    }
    ((moom.t3)(forestValue910006_50_0)).b(((java.util.List)(p0)));
    }
    spill910006_4 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_83_0 = spill910006_4;
        break forest_join_83;
    }
    forestValue910006_57_0 = ((moom.t3)(spill910006_4)).u;
    forestValue910006_57_1 = this;
    }
    if (!((forestValue910006_57_0 == ((net.minecraft.entity.Entity)(((moom.t3)(forestValue910006_57_1)).b)).g))) {
        break forest_join_77;
    }
    spill910006_5 = ((net.minecraft.entity.Entity)(this.b)).g;
    if (!((life4_8 == 0))) {
        forestValue910006_95_0 = spill910006_5;
        break forest_join_95;
    }
    if (!((spill910006_5 != null))) {
        break forest_join_93;
    }
    spill910006_6 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_94_0 = spill910006_6;
        break forest_join_94;
    }
    if (!(((((moom.t3)(spill910006_6)).n % __sourceIntrinsic_80f4afb34920_invokedynamic910006_28(31850, (3240835411931294897L ^ life2_3))) == 0))) {
        break forest_join_93;
    }
    }
    this.u = ((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(this.b)).g));
    forestValue910006_83_0 = this;
    }
    ((moom.t3)(forestValue910006_83_0)).a(((moom.yK)(new moom.zU(0, this.b, ((net.minecraft.entity.Entity)(this.b)).g))));
    }
    forestValue910006_94_0 = this;
    }
    forestValue910006_95_0 = ((moom.t3)(forestValue910006_94_0)).b;
    }
    life6_119 = forestValue910006_95_0;
    spill910006_7 = ((life6_119 instanceof net.minecraft.entity.item.EntityItemFrame) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forestValue910006_177_0 = spill910006_7;
        break forest_join_177;
    }
    if (!((spill910006_7 != 0))) {
        break forest_join_170;
    }
    life5_130 = ((net.minecraft.entity.item.EntityItemFrame)(life6_119));
    spill910006_8 = (this.n % __sourceIntrinsic_80f4afb34920_invokedynamic910006_40(4062, (6832185837033168666L ^ life2_3)));
    if (!((life4_8 == 0))) {
        forestValue910006_177_0 = spill910006_8;
        break forest_join_177;
    }
    if (!((spill910006_8 == 0))) {
        break forest_join_170;
    }
    life6_147 = ((net.minecraft.entity.item.EntityItemFrame)(life5_130)).a__xW();
    spill910006_9 = life6_147;
    if (!((life4_8 == 0))) {
        forestValue910006_123_0 = spill910006_9;
        break forest_join_123;
    }
    if (!((spill910006_9 != null))) {
        break forest_join_168;
    }
    forestValue910006_123_0 = life6_147;
    }
    if (!((((((net.minecraft.item.ItemStack)(forestValue910006_123_0)).a__wQ() instanceof moom.xA) ? 1 : 0) != 0))) {
        break forest_join_168;
    }
    life7_167 = ((moom.xA)(net.minecraft.init.Items.a3)).a(((net.minecraft.item.ItemStack)(life6_147)), ((net.minecraft.world.World)(((net.minecraft.entity.Entity)(this.b)).i)));
    life8_170 = ((java.util.List)(p0)).iterator();
    forest_cycle_136: while (true) {
    forest_join_166: {
    if (!(((java.util.Iterator)(life8_170)).hasNext())) {
        break forest_join_168;
    }
    life9_179 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life8_170)).next()));
    life10_182 = ((net.minecraft.entity.player.EntityPlayerMP)(life9_179));
    ((net.minecraft.world.storage.MapData)(life7_167)).a(((net.minecraft.entity.player.EntityPlayer)(life10_182)), ((net.minecraft.item.ItemStack)(life6_147)));
    life11_194 = ((moom.xA)(net.minecraft.init.Items.a3)).a__sourceReturn_5511132723(((net.minecraft.item.ItemStack)(life6_147)), ((net.minecraft.world.World)(((net.minecraft.entity.Entity)(this.b)).i)), ((net.minecraft.entity.player.EntityPlayer)(life10_182)));
    if (!((life4_8 == 0))) {
        break forest_join_170;
    }
    if (!((life11_194 != null))) {
        break forest_join_166;
    }
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life10_182)).cg)).a(((moom.yK)(life11_194)));
    }
    if (!((life4_8 != 0))) {
        continue forest_cycle_136;
    }
    break forest_cycle_136;
    }
    }
    ((moom.t3)(this)).a__Void();
    }
    spill910006_10 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_192_0 = spill910006_10;
        break forest_join_192;
    }
    forestValue910006_177_0 = (((moom.t3)(spill910006_10)).n % this.d);
    }
    if (!((forestValue910006_177_0 != 0))) {
        break forest_join_191;
    }
    spill910006_11 = this.b;
    if (!((life4_8 == 0))) {
        forestValue910006_194_0 = spill910006_11;
        break forest_join_194;
    }
    if (!((!((net.minecraft.entity.Entity)(spill910006_11)).ad))) {
        break forest_join_191;
    }
    spill910006_12 = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.Entity)(this.b)).a__r1())).a__Boolean();
    if (!((life4_8 == 0))) {
        forestValue910006_778_0 = ((spill910006_12) ? 1 : 0);
        break forest_join_778;
    }
    if (!(spill910006_12)) {
        break forest_join_767;
    }
    }
    forestValue910006_192_0 = this;
    }
    forestValue910006_194_0 = ((net.minecraft.entity.Entity)(((moom.t3)(forestValue910006_192_0)).b)).g;
    }
    if (!((life4_8 == 0))) {
        forestValue910006_641_0 = forestValue910006_194_0;
        break forest_join_641;
    }
    if (!((forestValue910006_194_0 == null))) {
        break forest_join_639;
    }
    moom.t3 __stackOp910006_71_0 = this;
    ((moom.t3)(__stackOp910006_71_0)).t = ((int)((((moom.t3)(__stackOp910006_71_0)).t + 1)));
    life5_268 = moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).n * 0x1.0p5d))));
    life6_275 = moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).o * 0x1.0p5d))));
    life7_282 = moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).p * 0x1.0p5d))));
    life8_291 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.Entity)(this.b)).w * 0x1.0p8f) / 0x1.68p8f))));
    life9_300 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.Entity)(this.b)).x * 0x1.0p8f) / 0x1.68p8f))));
    life10_305 = (life5_268 - this.e);
    life11_310 = (life6_275 - this.f);
    life12_315 = (life7_282 - this.g);
    life13_317 = null;
    spill910006_13 = java.lang.Math.abs(((int)(life10_305)));
    if (!((life4_8 == 0))) {
        forestValue910006_289_0 = spill910006_13;
        break forest_join_289;
    }
    if (!((spill910006_13 < 4))) {
        break forest_join_288;
    }
    spill910006_14 = java.lang.Math.abs(((int)(life11_310)));
    if (!((life4_8 == 0))) {
        forestValue910006_289_0 = spill910006_14;
        break forest_join_289;
    }
    if (!((spill910006_14 < 4))) {
        break forest_join_288;
    }
    spill910006_15 = java.lang.Math.abs(((int)(life12_315)));
    if (!((life4_8 == 0))) {
        forestValue910006_289_0 = spill910006_15;
        break forest_join_289;
    }
    if (!((spill910006_15 < 4))) {
        break forest_join_288;
    }
    spill910006_16 = (this.n % __sourceIntrinsic_80f4afb34920_invokedynamic910006_96(31850, (3240835411931294897L ^ life2_3)));
    if (!((life4_8 == 0))) {
        forestValue910006_289_0 = spill910006_16;
        break forest_join_289;
    }
    if (!((spill910006_16 == 0))) {
        break forest_join_290;
    }
    }
    forestValue910006_289_0 = 1;
    }
    forestValue910006_291_0 = forestValue910006_289_0;
    break forest_join_291;
    }
    forestValue910006_291_0 = 0;
    }
    life14_367 = forestValue910006_291_0;
    spill910006_17 = java.lang.Math.abs(((int)((life8_291 - this.h))));
    if (!((life4_8 == 0))) {
        forestValue910006_311_0 = spill910006_17;
        break forest_join_311;
    }
    if (!((spill910006_17 < 4))) {
        break forest_join_310;
    }
    spill910006_18 = java.lang.Math.abs(((int)((life9_300 - this.i))));
    if (!((life4_8 == 0))) {
        forestValue910006_311_0 = spill910006_18;
        break forest_join_311;
    }
    if (!((spill910006_18 >= 4))) {
        break forest_join_312;
    }
    }
    forestValue910006_311_0 = 1;
    }
    forestValue910006_313_0 = forestValue910006_311_0;
    break forest_join_313;
    }
    forestValue910006_313_0 = 0;
    }
    life15_398 = forestValue910006_313_0;
    spill910006_19 = this.n;
    if (!((life4_8 == 0))) {
        forestValue910006_326_0 = spill910006_19;
        break forest_join_326;
    }
    if (!((spill910006_19 <= 0))) {
        break forest_join_325;
    }
    spill910006_20 = ((this.b instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forestValue910006_326_0 = spill910006_20;
        break forest_join_326;
    }
    if (!((spill910006_20 != 0))) {
        break forest_join_500;
    }
    }
    forestValue910006_326_0 = life10_305;
    }
    spill910006_21 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_104(16531, (8799269331922767953L ^ life2_3));
    if (!((life4_8 == 0))) {
        forestValue910006_340_0 = forestValue910006_326_0;
        forestValue910006_340_1 = spill910006_21;
        break forest_join_340;
    }
    if (!((forestValue910006_326_0 >= spill910006_21))) {
        break forest_join_475;
    }
    forestValue910006_340_0 = life10_305;
    forestValue910006_340_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_105(27315, (5856540240104520310L ^ life2_3));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_349_0 = forestValue910006_340_0;
        forestValue910006_349_1 = forestValue910006_340_1;
        break forest_join_349;
    }
    if (!((forestValue910006_340_0 < forestValue910006_340_1))) {
        break forest_join_475;
    }
    forestValue910006_349_0 = life11_310;
    forestValue910006_349_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_106(1954, (9044835981043636092L ^ life2_3));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_358_0 = forestValue910006_349_0;
        forestValue910006_358_1 = forestValue910006_349_1;
        break forest_join_358;
    }
    if (!((forestValue910006_349_0 >= forestValue910006_349_1))) {
        break forest_join_475;
    }
    forestValue910006_358_0 = life11_310;
    forestValue910006_358_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_107(19906, (7980016806462151937L ^ life2_3));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_367_0 = forestValue910006_358_0;
        forestValue910006_367_1 = forestValue910006_358_1;
        break forest_join_367;
    }
    if (!((forestValue910006_358_0 < forestValue910006_358_1))) {
        break forest_join_475;
    }
    forestValue910006_367_0 = life12_315;
    forestValue910006_367_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_108(1954, (9044835981043636092L ^ life2_3));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_376_0 = forestValue910006_367_0;
        forestValue910006_376_1 = forestValue910006_367_1;
        break forest_join_376;
    }
    if (!((forestValue910006_367_0 >= forestValue910006_367_1))) {
        break forest_join_475;
    }
    forestValue910006_376_0 = life12_315;
    forestValue910006_376_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_109(19906, (7980016806462151937L ^ life2_3));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_388_0 = forestValue910006_376_0;
        forestValue910006_388_1 = forestValue910006_376_1;
        break forest_join_388;
    }
    if (!((forestValue910006_376_0 < forestValue910006_376_1))) {
        break forest_join_475;
    }
    spill910006_22 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_481_0 = spill910006_22;
        break forest_join_481;
    }
    forestValue910006_388_0 = ((moom.t3)(spill910006_22)).t;
    forestValue910006_388_1 = __sourceIntrinsic_80f4afb34920_invokedynamic910006_111(9750, (8561305178479212238L ^ life2_3));
    }
    if (!((forestValue910006_388_0 <= forestValue910006_388_1))) {
        break forest_join_475;
    }
    spill910006_23 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_481_0 = spill910006_23;
        break forest_join_481;
    }
    if (!((!((moom.t3)(spill910006_23)).v))) {
        break forest_join_475;
    }
    spill910006_24 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_481_0 = spill910006_24;
        break forest_join_481;
    }
    if (!((((moom.t3)(spill910006_24)).w == ((net.minecraft.entity.Entity)(this.b)).A))) {
        break forest_join_475;
    }
    spill910006_25 = life14_367;
    if (!((life4_8 == 0))) {
        forestValue910006_413_0 = spill910006_25;
        break forest_join_413;
    }
    if (!((spill910006_25 != 0))) {
        break forest_join_410;
    }
    spill910006_26 = life15_398;
    if (!((life4_8 == 0))) {
        forestValue910006_413_0 = spill910006_26;
        break forest_join_413;
    }
    if (!((spill910006_26 == 0))) {
        break forest_join_454;
    }
    }
    forestValue910006_413_0 = ((this.b instanceof net.minecraft.entity.projectile.EntityArrow) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forestValue910006_417_0 = forestValue910006_413_0;
        break forest_join_417;
    }
    if (!((forestValue910006_413_0 == 0))) {
        break forest_join_454;
    }
    forestValue910006_417_0 = life14_367;
    }
    if (!((life4_8 == 0))) {
        forestValue910006_438_0 = forestValue910006_417_0;
        break forest_join_438;
    }
    if (!((forestValue910006_417_0 != 0))) {
        break forest_join_437;
    }
    life13_317 = new moom.zO(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((byte) life10_305), ((byte) life11_310), ((byte) life12_315), ((net.minecraft.entity.Entity)(this.b)).A);
    break forest_join_500;
    }
    forestValue910006_438_0 = life15_398;
    }
    if (!((forestValue910006_438_0 != 0))) {
        break forest_join_500;
    }
    life13_317 = new moom.zP(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((byte) life8_291), ((byte) life9_300), ((net.minecraft.entity.Entity)(this.b)).A);
    break forest_join_500;
    }
    life13_317 = new moom.zQ(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((byte) life10_305), ((byte) life11_310), ((byte) life12_315), ((byte) life8_291), ((byte) life9_300), ((net.minecraft.entity.Entity)(this.b)).A);
    break forest_join_500;
    }
    this.w = ((boolean)(((net.minecraft.entity.Entity)(this.b)).A));
    forestValue910006_481_0 = this;
    }
    ((moom.t3)(forestValue910006_481_0)).t = ((int)(0));
    life13_317 = new moom.zR(((net.minecraft.entity.Entity)(this.b)).e__Int(), life5_268, life6_275, life7_282, ((byte) life8_291), ((byte) life9_300), ((net.minecraft.entity.Entity)(this.b)).A);
    }
    spill910006_27 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_506_0 = spill910006_27;
        break forest_join_506;
    }
    if (!(((moom.t3)(spill910006_27)).s)) {
        break forest_join_607;
    }
    forestValue910006_506_0 = this;
    }
    life16_663 = (((net.minecraft.entity.Entity)(((moom.t3)(forestValue910006_506_0)).b)).t - this.k);
    life18_670 = (((net.minecraft.entity.Entity)(this.b)).u - this.l);
    life20_677 = (((net.minecraft.entity.Entity)(this.b)).v - this.m);
    life22_679 = 0x1.47ae147ae147bp-6d;
    life24_691 = (((life16_663 * life16_663) + (life18_670 * life18_670)) + (life20_677 * life20_677));
    if (!((life4_8 == 0))) {
        break forest_join_593;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life24_691)), ((double)((life22_679 * life22_679)))) <= 0))) {
        break forest_join_578;
    }
    spill910006_28 = recovery.source.CarrierOps.dcmpl(((double)(life24_691)), ((double)(0x0.0p0d)));
    if (!((life4_8 == 0))) {
        forestValue910006_559_0 = spill910006_28;
        break forest_join_559;
    }
    if (!((spill910006_28 > 0))) {
        break forest_join_607;
    }
    forestValue910006_559_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(this.b)).t)), ((double)(0x0.0p0d)));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_567_0 = forestValue910006_559_0;
        break forest_join_567;
    }
    if (!((forestValue910006_559_0 == 0))) {
        break forest_join_607;
    }
    forestValue910006_567_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(this.b)).u)), ((double)(0x0.0p0d)));
    }
    if (!((life4_8 == 0))) {
        forestValue910006_577_0 = forestValue910006_567_0;
        break forest_join_577;
    }
    if (!((forestValue910006_567_0 == 0))) {
        break forest_join_607;
    }
    spill910006_29 = this;
    if (!((life4_8 == 0))) {
        forestValue910006_594_0 = spill910006_29;
        break forest_join_594;
    }
    forestValue910006_577_0 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(((moom.t3)(spill910006_29)).b)).v)), ((double)(0x0.0p0d)));
    }
    if (!((forestValue910006_577_0 == 0))) {
        break forest_join_607;
    }
    }
    this.k = ((double)(((net.minecraft.entity.Entity)(this.b)).t));
    this.l = ((double)(((net.minecraft.entity.Entity)(this.b)).u));
    this.m = ((double)(((net.minecraft.entity.Entity)(this.b)).v));
    }
    forestValue910006_594_0 = this;
    }
    ((moom.t3)(forestValue910006_594_0)).a(((moom.yK)(new moom.zL(((net.minecraft.entity.Entity)(this.b)).e__Int(), this.k, this.l, this.m))));
    }
    if (!((life13_317 != null))) {
        break forest_join_612;
    }
    ((moom.t3)(this)).a(((moom.yK)(life13_317)));
    }
    ((moom.t3)(this)).a__Void();
    spill910006_30 = life14_367;
    if (!((life4_8 == 0))) {
        forestValue910006_628_0 = spill910006_30;
        break forest_join_628;
    }
    if (!((spill910006_30 != 0))) {
        break forest_join_627;
    }
    this.e = ((int)(life5_268));
    this.f = ((int)(life6_275));
    this.g = ((int)(life7_282));
    }
    forestValue910006_628_0 = life15_398;
    }
    if (!((forestValue910006_628_0 != 0))) {
        break forest_join_635;
    }
    this.h = ((int)(life8_291));
    this.i = ((int)(life9_300));
    }
    this.v = ((boolean)(false));
    break forest_join_733;
    }
    forestValue910006_641_0 = this.b;
    }
    life5_831 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.Entity)(forestValue910006_641_0)).w * 0x1.0p8f) / 0x1.68p8f))));
    life6_840 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.Entity)(this.b)).x * 0x1.0p8f) / 0x1.68p8f))));
    spill910006_31 = java.lang.Math.abs(((int)((life5_831 - this.h))));
    if (!((life4_8 == 0))) {
        forestValue910006_676_0 = spill910006_31;
        break forest_join_676;
    }
    if (!((spill910006_31 < 4))) {
        break forest_join_675;
    }
    spill910006_32 = java.lang.Math.abs(((int)((life6_840 - this.i))));
    if (!((life4_8 == 0))) {
        forestValue910006_676_0 = spill910006_32;
        break forest_join_676;
    }
    if (!((spill910006_32 >= 4))) {
        break forest_join_677;
    }
    }
    forestValue910006_676_0 = 1;
    }
    forestValue910006_678_0 = forestValue910006_676_0;
    break forest_join_678;
    }
    forestValue910006_678_0 = 0;
    }
    life7_871 = forestValue910006_678_0;
    if (!((life4_8 == 0))) {
        break forest_join_730;
    }
    if (!((life7_871 != 0))) {
        break forest_join_704;
    }
    ((moom.t3)(this)).a(((moom.yK)(new moom.zP(((net.minecraft.entity.Entity)(this.b)).e__Int(), ((byte) life5_831), ((byte) life6_840), ((net.minecraft.entity.Entity)(this.b)).A))));
    this.h = ((int)(life5_831));
    this.i = ((int)(life6_840));
    }
    this.e = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).n * 0x1.0p5d))))));
    this.f = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).o * 0x1.0p5d))))));
    this.g = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.Entity)(this.b)).p * 0x1.0p5d))))));
    ((moom.t3)(this)).a__Void();
    }
    this.v = ((boolean)(true));
    }
    spill910006_33 = this.b;
    if (!((life4_8 == 0))) {
        forestValue910006_765_0 = spill910006_33;
        break forest_join_765;
    }
    life5_943 = moom.Dr.a__Int(((float)(((((net.minecraft.entity.Entity)(spill910006_33)).d__Float() * 0x1.0p8f) / 0x1.68p8f))));
    if (!((java.lang.Math.abs(((int)((life5_943 - this.j)))) >= 4))) {
        break forest_join_763;
    }
    ((moom.t3)(this)).a(((moom.yK)(new moom.zS(this.b, ((byte) life5_943)))));
    this.j = ((int)(life5_943));
    }
    forestValue910006_765_0 = this.b;
    }
    ((net.minecraft.entity.Entity)(forestValue910006_765_0)).ad = ((boolean)(false));
    }
    moom.t3 __stackOp910006_223_0 = this;
    ((moom.t3)(__stackOp910006_223_0)).n = ((int)((((moom.t3)(__stackOp910006_223_0)).n + 1)));
    spill910006_34 = this.b;
    if (!((life4_8 == 0))) {
        forestValue910006_788_0 = spill910006_34;
        break forest_join_788;
    }
    forestValue910006_778_0 = ((((net.minecraft.entity.Entity)(spill910006_34)).E) ? 1 : 0);
    }
    if (!((forestValue910006_778_0 != 0))) {
        break forest_join_790;
    }
    ((moom.t3)(this)).b(((moom.yK)(new moom.zL(this.b))));
    forestValue910006_788_0 = this.b;
    }
    ((net.minecraft.entity.Entity)(forestValue910006_788_0)).E = ((boolean)(false));
    }
    return;
}


private void a__Void() {
block8: {
            Set<IAttributeInstance> set;
            Entity entity;
            int n;
            block7: {
                boolean bl;
                block6: {
                    long l = moom.t3.z ^ 0x4FC7521F7129L;
                    n = SharedMonsterAttributes.c();
                    DataWatcher dataWatcher = this.b.a__r1();
                    bl = dataWatcher.a__Boolean();
                    if (n == 0) break block6;
                    if (bl) {
                        this.b(new zV(this.b.e__Int(), dataWatcher, false));
                    }
                    entity = this.b;
                    if (n == 0) break block7;
                    bl = entity instanceof EntityLivingBase;
                }
                if (!bl) break block8;
                entity = this.b;
            }
            vF vF2 = (vF)((EntityLivingBase)entity).a__vE();
            Set<IAttributeInstance> set2 = set = vF2.a();
            if (n != 0) {
                if (!set2.isEmpty()) {
                    this.b(new zZ(this.b.e__Int(), set));
                }
                set2 = set;
            }
            set2.clear();
        }
}


public void a(moom.yK p0) {
int spill1307_0;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    net.minecraft.entity.player.EntityPlayerMP life6_16;
    lexical_join_23: {
    life2_3 = (moom.t3.z ^ 46404510347155L);
    spill1307_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_8 = ((java.util.Set)(this.y)).iterator();
    life4_9 = spill1307_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_23;
    }
    life6_16 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life5_8)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life6_16)).cg)).a(((moom.yK)(p0)));
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public void a(net.minecraft.entity.player.EntityPlayerMP p0) {
int forwardValue4018_21_0;
    boolean spill4018_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.t3.z ^ 127502227498207L);
    life4_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill4018_0 = ((java.util.Set)(this.y)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != 0))) {
        forwardValue4018_21_0 = ((spill4018_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill4018_0)) {
        break forward_join_22;
    }
    ((net.minecraft.entity.player.EntityPlayerMP)(p0)).m(((net.minecraft.entity.Entity)(this.b)));
    forwardValue4018_21_0 = ((((java.util.Set)(this.y)).remove(((java.lang.Object)(p0)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4018_21_0);
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayerMP p0) {
int forwardValue4019_46_0;
    int forwardValue4019_55_0;
    int forwardValue4019_63_0;
    int forwardValue4019_70_0;
    int forwardValue4019_74_0;
    int forwardValue4019_76_0;
    int spill4019_0;
    int spill4019_1;
    long life2_3;
    double life5_17;
    int life4_18;
    double life7_31;
    forward_join_76: {
    forward_join_75: {
    forward_join_74: {
    forward_join_70: {
    forward_join_63: {
    forward_join_55: {
    forward_join_46: {
    life2_3 = (moom.t3.z ^ 120682677464628L);
    spill4019_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life5_17 = (((net.minecraft.entity.player.EntityPlayerMP)(p0)).n - ((double) (this.e / __sourceIntrinsic_3c7d0d23e8cc_invokedynamic4019_4(2890, (6384636048246829063L ^ life2_3)))));
    life4_18 = spill4019_0;
    life7_31 = (((net.minecraft.entity.player.EntityPlayerMP)(p0)).p - ((double) (this.g / __sourceIntrinsic_3c7d0d23e8cc_invokedynamic4019_7(13920, (5941976332500192554L ^ life2_3)))));
    spill4019_1 = recovery.source.CarrierOps.dcmpl(((double)(life5_17)), ((double)(((double) (-this.c)))));
    if (!((life4_18 != 0))) {
        forwardValue4019_46_0 = spill4019_1;
        break forward_join_46;
    }
    if (!((spill4019_1 >= 0))) {
        break forward_join_75;
    }
    forwardValue4019_46_0 = recovery.source.CarrierOps.dcmpg(((double)(life5_17)), ((double)(((double) this.c))));
    }
    if (!((life4_18 != 0))) {
        forwardValue4019_55_0 = forwardValue4019_46_0;
        break forward_join_55;
    }
    if (!((forwardValue4019_46_0 <= 0))) {
        break forward_join_75;
    }
    forwardValue4019_55_0 = recovery.source.CarrierOps.dcmpl(((double)(life7_31)), ((double)(((double) (-this.c)))));
    }
    if (!((life4_18 != 0))) {
        forwardValue4019_63_0 = forwardValue4019_55_0;
        break forward_join_63;
    }
    if (!((forwardValue4019_55_0 >= 0))) {
        break forward_join_75;
    }
    forwardValue4019_63_0 = recovery.source.CarrierOps.dcmpg(((double)(life7_31)), ((double)(((double) this.c))));
    }
    if (!((life4_18 != 0))) {
        forwardValue4019_70_0 = forwardValue4019_63_0;
        break forward_join_70;
    }
    if (!((forwardValue4019_63_0 <= 0))) {
        break forward_join_75;
    }
    forwardValue4019_70_0 = ((((net.minecraft.entity.Entity)(this.b)).a(((net.minecraft.entity.player.EntityPlayerMP)(p0)))) ? 1 : 0);
    }
    if (!((life4_18 != 0))) {
        forwardValue4019_74_0 = forwardValue4019_70_0;
        break forward_join_74;
    }
    if (!((forwardValue4019_70_0 != 0))) {
        break forward_join_75;
    }
    forwardValue4019_74_0 = 1;
    }
    forwardValue4019_76_0 = forwardValue4019_74_0;
    break forward_join_76;
    }
    forwardValue4019_76_0 = 0;
    }
    return ((forwardValue4019_76_0) != 0);
}


private moom.yK a() { return __sourceHandlerCall_a12f8f9234cbd2d3a8f7(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9110_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_80f4afb34920_invokedynamic910006_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c7d0d23e8cc_invokedynamic4019_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3c7d0d23e8cc_invokedynamic4019_7(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
