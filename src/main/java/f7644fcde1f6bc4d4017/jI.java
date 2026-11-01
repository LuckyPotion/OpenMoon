package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jI {

public static float a;

public static float b;

private final net.minecraft.client.Minecraft c;

private final net.minecraft.client.network.NetHandlerPlayClient d;

private moom.DT e;

private net.minecraft.item.ItemStack f;

public float g;

private float h;

public int i;

private boolean j;

private net.minecraft.world.WorldSettings$GameType k;

private int l;

private static final long q;

private static final long[] s;

private static final java.lang.Integer[] t;

private static final java.util.Map u;

private static final long[] v;

private static final java.lang.Long[] w;

private static final java.util.Map x;

public jI(net.minecraft.client.Minecraft p0, net.minecraft.client.network.NetHandlerPlayClient p1) {
super();
    this.e = new moom.DT(-1, -1, -1);
    this.k = net.minecraft.world.WorldSettings$GameType.SURVIVAL;
    this.c = p0;
    this.d = p1;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(8338213211492666957L)), ((long)(-4850561581716458863L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(254236883062214L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.jI.q ^ 77608378709092L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill892_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill892_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill892_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill892_14 = new byte[8];
    (__sourceSpill892_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill892_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation892_16 = __sourceSpill892_14;
    ((javax.crypto.Cipher)(__sourceSpill892_11)).init(((int)(__sourceSpill892_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill892_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation892_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[3];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\031z±ý\033Ý\\\017x\005bY!64Uh^*Ï£"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill892_25 = local17_life21;
        int __sourceSpill892_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill892_25)).substring(((int)(__sourceSpill892_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill892_30 = local19_life19;
        int __sourceSpill892_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill892_33 = new byte[8];
        (__sourceSpill892_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill892_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill892_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill892_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill892_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill892_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill892_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill892_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill892_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill892_34)).doFinal(((byte[])(__sourceSpill892_33)));
        (__sourceSpill892_30)[__sourceSpill892_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    s = ((long[])(local19_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[3]));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill892_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill892_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill892_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill892_46 = new byte[8];
    (__sourceSpill892_46)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill892_46)[local1_life47] = ((byte) ((int) ((local11_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation892_48 = __sourceSpill892_46;
    ((javax.crypto.Cipher)(__sourceSpill892_43)).init(((int)(__sourceSpill892_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill892_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation892_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life51 = new long[2];
    int local3_life52 = 0;
    java.lang.String local4_life53;
    int local5_life55 = ((java.lang.String)((local4_life53 = "\034\022 \036JóÐÇ\002@­ãmÇ-"))).length();
    int local2_life56 = 0;
    do {
        java.lang.String __sourceSpill892_57 = local4_life53;
        int __sourceSpill892_58 = local2_life56;
        local2_life56 += 8;
        byte[] local7_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill892_57)).substring(((int)(__sourceSpill892_58)), ((int)(local2_life56))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill892_62 = local6_life51;
        int __sourceSpill892_63 = local3_life52;
        local3_life52 += 1;
        long local8_life64 = (((((((((((long) (local7_life61)[0]) & 255L) << 56) | ((((long) (local7_life61)[1]) & 255L) << 48)) | ((((long) (local7_life61)[2]) & 255L) << 40)) | ((((long) (local7_life61)[3]) & 255L) << 32)) | ((((long) (local7_life61)[4]) & 255L) << 24)) | ((((long) (local7_life61)[5]) & 255L) << 16)) | ((((long) (local7_life61)[6]) & 255L) << 8)) | (((long) (local7_life61)[7]) & 255L));
        byte[] __sourceSpill892_65 = new byte[8];
        (__sourceSpill892_65)[0] = ((byte) ((int) (local8_life64 >>> 56)));
        (__sourceSpill892_65)[1] = ((byte) ((int) (local8_life64 >>> 48)));
        (__sourceSpill892_65)[2] = ((byte) ((int) (local8_life64 >>> 40)));
        (__sourceSpill892_65)[3] = ((byte) ((int) (local8_life64 >>> 32)));
        (__sourceSpill892_65)[4] = ((byte) ((int) (local8_life64 >>> 24)));
        (__sourceSpill892_65)[5] = ((byte) ((int) (local8_life64 >>> 16)));
        (__sourceSpill892_65)[6] = ((byte) ((int) (local8_life64 >>> 8)));
        (__sourceSpill892_65)[7] = ((byte) ((int) local8_life64));
        javax.crypto.Cipher __sourceSpill892_66 = local0_life41;
        byte[] local10_life68 = ((javax.crypto.Cipher)(__sourceSpill892_66)).doFinal(((byte[])(__sourceSpill892_65)));
        (__sourceSpill892_62)[__sourceSpill892_63] = (((((((((((long) (local10_life68)[0]) & 255L) << 56) | ((((long) (local10_life68)[1]) & 255L) << 48)) | ((((long) (local10_life68)[2]) & 255L) << 40)) | ((((long) (local10_life68)[3]) & 255L) << 32)) | ((((long) (local10_life68)[4]) & 255L) << 24)) | ((((long) (local10_life68)[5]) & 255L) << 16)) | ((((long) (local10_life68)[6]) & 255L) << 8)) | (((long) (local10_life68)[7]) & 255L));
    } while ((!(local2_life56 >= local5_life55)));
    v = ((long[])(local6_life51));
    w = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((float)(0x0.0p0f));
    b = ((float)(-0x1.0p0f));
}


public boolean i() {
return ((((this.j) ? 1 : 0)) != 0);
}


public boolean b(moom.DT p0, moom.bs p1) {
int forwardValue3673_28_0;
    int forwardValue3673_32_0;
    int forwardValue3673_34_0;
    int forwardValue3673_44_0;
    moom.jI forwardValue3673_56_0;
    net.minecraft.item.ItemStack forwardValue3673_81_0;
    int forwardValue3673_94_0;
    int forwardValue3673_102_0;
    int forwardValue3673_131_0;
    int forwardValue3673_144_0;
    moom.jI forwardValue3673_165_0;
    int forwardValue3673_178_0;
    int forwardValue3673_200_0;
    int forwardValue3673_215_0;
    int forwardValue3673_222_0;
    int forwardValue3673_261_0;
    boolean spill3673_0;
    boolean spill3673_1;
    int spill3673_2;
    moom.jI spill3673_3;
    boolean spill3673_4;
    net.minecraft.item.ItemStack spill3673_5;
    boolean spill3673_6;
    boolean spill3673_7;
    moom.jI spill3673_8;
    int spill3673_9;
    int spill3673_10;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_52;
    net.minecraft.block.Block life7_105;
    net.minecraft.item.ItemStack life8_110;
    net.minecraft.block.Block life7_249;
    int life8_259;
    forward_join_261: {
    forward_join_260: {
    forward_join_225: {
    forward_join_222: {
    forward_join_215: {
    forward_join_200: {
    forward_join_199: {
    forward_join_178: {
    forward_join_177: {
    forward_join_165: {
    forward_join_155: {
    forward_join_144: {
    forward_join_140: {
    forward_join_131: {
    forward_join_129: {
    forward_join_102: {
    forward_join_99: {
    forward_join_94: {
    forward_join_88: {
    forward_join_81: {
    forward_join_80: {
    forward_join_56: {
    forward_join_55: {
    forward_join_44: {
    forward_join_41: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (moom.jI.q ^ 45825529116066L);
    life5_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3673_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life5_5 == null))) {
        forwardValue3673_28_0 = ((spill3673_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill3673_0)) {
        break forward_join_19;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() != null))) {
        break forward_join_19;
    }
    spill3673_1 = com.moon.security.e.c;
    if (!((life5_5 == null))) {
        forwardValue3673_28_0 = ((spill3673_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3673_1))) {
        break forward_join_33;
    }
    }
    forwardValue3673_28_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_cefec3467f45_invokedynamic3673_11(28553, (4666932906526649245L ^ life3_3)))));
    }
    if (!((life5_5 == null))) {
        forwardValue3673_32_0 = forwardValue3673_28_0;
        break forward_join_32;
    }
    if (!((forwardValue3673_28_0 > 0))) {
        break forward_join_33;
    }
    forwardValue3673_32_0 = 1;
    }
    forwardValue3673_34_0 = forwardValue3673_32_0;
    break forward_join_34;
    }
    forwardValue3673_34_0 = 0;
    }
    life6_52 = forwardValue3673_34_0;
    spill3673_2 = life6_52;
    if (!((life5_5 == null))) {
        forwardValue3673_44_0 = spill3673_2;
        break forward_join_44;
    }
    if (!((spill3673_2 != 0))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    forwardValue3673_44_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3673_94_0 = forwardValue3673_44_0;
        break forward_join_94;
    }
    if (!((forwardValue3673_44_0 != 0))) {
        break forward_join_88;
    }
    spill3673_3 = this;
    if (!((life5_5 == null))) {
        forwardValue3673_56_0 = spill3673_3;
        break forward_join_56;
    }
    if (!((((moom.jI)(spill3673_3)).k == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_55;
    }
    return ((0) != 0);
    }
    forwardValue3673_56_0 = this;
    }
    spill3673_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((moom.jI)(forwardValue3673_56_0)).c)).K)).T__Boolean();
    if (!((life5_5 == null))) {
        forwardValue3673_94_0 = ((spill3673_4) ? 1 : 0);
        break forward_join_94;
    }
    if (!((!spill3673_4))) {
        break forward_join_88;
    }
    life7_105 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    life8_110 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).c__xW();
    spill3673_5 = life8_110;
    if (!((life5_5 == null))) {
        forwardValue3673_81_0 = spill3673_5;
        break forward_join_81;
    }
    if (!((spill3673_5 == null))) {
        break forward_join_80;
    }
    return ((0) != 0);
    }
    forwardValue3673_81_0 = life8_110;
    }
    spill3673_6 = ((net.minecraft.item.ItemStack)(forwardValue3673_81_0)).b(((net.minecraft.block.Block)(life7_105)));
    if (!((life5_5 == null))) {
        forwardValue3673_94_0 = ((spill3673_6) ? 1 : 0);
        break forward_join_94;
    }
    if (!((!spill3673_6))) {
        break forward_join_88;
    }
    return ((0) != 0);
    }
    forwardValue3673_94_0 = ((((net.minecraft.world.border.WorldBorder)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__Fi())).a(((moom.DT)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3673_102_0 = forwardValue3673_94_0;
        break forward_join_102;
    }
    if (!((forwardValue3673_94_0 == 0))) {
        break forward_join_99;
    }
    return ((0) != 0);
    }
    forwardValue3673_102_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).b()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3673_131_0 = forwardValue3673_102_0;
        break forward_join_131;
    }
    if (!((forwardValue3673_102_0 != 0))) {
        break forward_join_129;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, p0, p1))));
    moom.jI.a(((net.minecraft.client.Minecraft)(this.c)), ((moom.jI)(this)), ((moom.DT)(p0)), ((moom.bs)(p1)));
    this.i = ((int)(__sourceIntrinsic_cefec3467f45_invokedynamic3673_49(2673, (7186940890411693510L ^ life3_3))));
    if (!((life5_5 != null))) {
        break forward_join_260;
    }
    }
    forwardValue3673_131_0 = ((this.j) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3673_144_0 = forwardValue3673_131_0;
        break forward_join_144;
    }
    if (!((forwardValue3673_131_0 != 0))) {
        break forward_join_140;
    }
    spill3673_7 = this.a(((moom.DT)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3673_261_0 = ((spill3673_7) ? 1 : 0);
        break forward_join_261;
    }
    if (!((!spill3673_7))) {
        break forward_join_260;
    }
    }
    spill3673_8 = this;
    if (!((life5_5 == null))) {
        forwardValue3673_165_0 = spill3673_8;
        break forward_join_165;
    }
    forwardValue3673_144_0 = ((((moom.jI)(spill3673_8)).j) ? 1 : 0);
    }
    if (!((forwardValue3673_144_0 != 0))) {
        break forward_join_155;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, this.e, p1))));
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, p0, p1))));
    forwardValue3673_165_0 = this;
    }
    life7_249 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(((moom.jI)(forwardValue3673_165_0)).c)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    if (!((((net.minecraft.block.Block)(life7_249)).a__fn() != moom.fn.a))) {
        break forward_join_177;
    }
    forwardValue3673_178_0 = 1;
    break forward_join_178;
    }
    forwardValue3673_178_0 = 0;
    }
    life8_259 = forwardValue3673_178_0;
    spill3673_9 = life8_259;
    if (!((life5_5 == null))) {
        forwardValue3673_200_0 = spill3673_9;
        break forward_join_200;
    }
    if (!((spill3673_9 != 0))) {
        break forward_join_199;
    }
    spill3673_10 = recovery.source.CarrierOps.fcmpl(((float)(this.g)), ((float)(0x0.0p0f)));
    if (!((life5_5 == null))) {
        forwardValue3673_200_0 = spill3673_10;
        break forward_join_200;
    }
    if (!((spill3673_10 == 0))) {
        break forward_join_199;
    }
    ((net.minecraft.block.Block)(life7_249)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(this.c)).I)), ((moom.DT)(p0)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.c)).K)));
    }
    forwardValue3673_200_0 = life8_259;
    }
    if (!((life5_5 == null))) {
        forwardValue3673_215_0 = forwardValue3673_200_0;
        break forward_join_215;
    }
    if (!((forwardValue3673_200_0 != 0))) {
        break forward_join_225;
    }
    forwardValue3673_215_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.block.Block)(life7_249)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.c)).K)), ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).i)), ((moom.DT)(p0))))), ((float)(0x1.0p0f)));
    }
    if (!((life5_5 == null))) {
        forwardValue3673_222_0 = forwardValue3673_215_0;
        break forward_join_222;
    }
    if (!((forwardValue3673_215_0 >= 0))) {
        break forward_join_225;
    }
    forwardValue3673_222_0 = ((this.a(((moom.DT)(p0)), ((moom.bs)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3673_222_0);
    if (!((life5_5 != null))) {
        break forward_join_260;
    }
    }
    this.j = ((boolean)(true));
    this.e = ((moom.DT)(p0));
    this.f = ((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).a__xW()));
    this.g = ((float)(0x0.0p0f));
    this.h = ((float)(0x0.0p0f));
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).c(((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).e__Int())), ((moom.DT)(this.e)), ((int)((((int) (this.g * 0x1.4p3f)) - 1))));
    }
    forwardValue3673_261_0 = 1;
    }
    return ((forwardValue3673_261_0) != 0);
}


public void b() {
net.minecraft.network.NetworkManager forwardValue3672_24_0;
    net.minecraft.entity.Entity[] spill3672_0;
    net.minecraft.network.NetworkManager spill3672_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_25: {
    forward_join_24: {
    forward_join_21: {
    life1_3 = (moom.jI.q ^ 92289699740789L);
    spill3672_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    this.c();
    life3_7 = spill3672_0;
    spill3672_1 = ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a__r();
    if (!((life3_7 == null))) {
        forwardValue3672_24_0 = spill3672_1;
        break forward_join_24;
    }
    if (!(((net.minecraft.network.NetworkManager)(spill3672_1)).c__Boolean())) {
        break forward_join_21;
    }
    ((net.minecraft.network.NetworkManager)(((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a__r())).b();
    if (!((life3_7 != null))) {
        break forward_join_25;
    }
    }
    forwardValue3672_24_0 = ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a__r();
    }
    ((net.minecraft.network.NetworkManager)(forwardValue3672_24_0)).d();
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8117_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.jI.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11567);
    if (((moom.jI.w)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.jI.v)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.jI.x)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.jI.x)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/jI", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.jI.w)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.jI.w)[life3_8])).longValue();
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
((net.minecraft.entity.player.EntityPlayer)(p0)).w = ((float)(-0x1.68p7f));
    return;
}


public boolean b__Boolean() {
int forwardValue3674_24_0;
    int forwardValue3674_28_0;
    int forwardValue3674_30_0;
    int forwardValue3674_40_0;
    boolean spill3674_0;
    int spill3674_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_42;
    forward_join_40: {
    forward_join_37: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life1_3 = (moom.jI.q ^ 53759480154336L);
    life3_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3674_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life3_5 == null))) {
        forwardValue3674_24_0 = ((spill3674_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3674_0)) {
        break forward_join_15;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() == null))) {
        break forward_join_29;
    }
    }
    forwardValue3674_24_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_74e88f4b4822_invokedynamic3674_9(29874, (2716948723551440357L ^ life1_3)))));
    }
    if (!((life3_5 == null))) {
        forwardValue3674_28_0 = forwardValue3674_24_0;
        break forward_join_28;
    }
    if (!((forwardValue3674_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue3674_28_0 = 1;
    }
    forwardValue3674_30_0 = forwardValue3674_28_0;
    break forward_join_30;
    }
    forwardValue3674_30_0 = 0;
    }
    life4_42 = forwardValue3674_30_0;
    spill3674_1 = life4_42;
    if (!((life3_5 == null))) {
        forwardValue3674_40_0 = spill3674_1;
        break forward_join_40;
    }
    if (!((spill3674_1 != 0))) {
        break forward_join_37;
    }
    return ((0) != 0);
    }
    forwardValue3674_40_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).c()) ? 1 : 0);
    }
    return ((forwardValue3674_40_0) != 0);
}


public boolean e() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.WorldSettings$GameType)(this.k)).b())) != 0);
}


public void c(net.minecraft.entity.player.EntityPlayer p0) {
this.c();
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.RELEASE_USE_ITEM, moom.DT.f, moom.bs.DOWN))));
    ((net.minecraft.entity.player.EntityPlayer)(p0)).N();
    return;
}


public void c() {
long life1_3;
    int life4_10;
    net.minecraft.entity.Entity[] life3_11;
    forward_join_29: {
    forward_join_21: {
    life1_3 = (moom.jI.q ^ 98389730430366L);
    net.minecraft.entity.Entity[] spill4260_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life4_10 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).bD)).c;
    life3_11 = spill4260_0;
    if (!((life3_11 == null))) { break forward_join_21; }
    if (!((life4_10 != this.l))) { break forward_join_29; }
    this.l = ((int)(life4_10));
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.zc(this.l))));
    }
    return;
}


public boolean c(moom.DT p0, moom.bs p1) {
int forwardValue3675_28_0;
    int forwardValue3675_32_0;
    int forwardValue3675_34_0;
    int forwardValue3675_45_0;
    int forwardValue3675_59_0;
    int forwardValue3675_98_0;
    int forwardValue3675_193_0;
    int forwardValue3675_244_0;
    int forwardValue3675_249_0;
    boolean spill3675_0;
    boolean spill3675_1;
    int spill3675_2;
    boolean spill3675_3;
    int spill3675_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_52;
    net.minecraft.block.Block life7_149;
    forward_join_249: {
    forward_join_245: {
    forward_join_244: {
    forward_join_226: {
    forward_join_193: {
    forward_join_183: {
    forward_join_134: {
    forward_join_119: {
    forward_join_98: {
    forward_join_95: {
    forward_join_59: {
    forward_join_56: {
    forward_join_45: {
    forward_join_41: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life3_3 = (moom.jI.q ^ 107551449629201L);
    life5_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3675_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life5_5 == null))) {
        forwardValue3675_28_0 = ((spill3675_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill3675_0)) {
        break forward_join_19;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() != null))) {
        break forward_join_19;
    }
    spill3675_1 = com.moon.security.e.c;
    if (!((life5_5 == null))) {
        forwardValue3675_28_0 = ((spill3675_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3675_1))) {
        break forward_join_33;
    }
    }
    forwardValue3675_28_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_564d2bc75d37_invokedynamic3675_11(28553, (4666871315948051502L ^ life3_3)))));
    }
    if (!((life5_5 == null))) {
        forwardValue3675_32_0 = forwardValue3675_28_0;
        break forward_join_32;
    }
    if (!((forwardValue3675_28_0 > 0))) {
        break forward_join_33;
    }
    forwardValue3675_32_0 = 1;
    }
    forwardValue3675_34_0 = forwardValue3675_32_0;
    break forward_join_34;
    }
    forwardValue3675_34_0 = 0;
    }
    life6_52 = forwardValue3675_34_0;
    spill3675_2 = life6_52;
    if (!((life5_5 == null))) {
        forwardValue3675_45_0 = spill3675_2;
        break forward_join_45;
    }
    if (!((spill3675_2 != 0))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    this.c();
    forwardValue3675_45_0 = this.i;
    }
    if (!((life5_5 == null))) {
        forwardValue3675_59_0 = forwardValue3675_45_0;
        break forward_join_59;
    }
    if (!((forwardValue3675_45_0 > 0))) {
        break forward_join_56;
    }
    moom.jI __stackOp3675_16_0 = this;
    ((moom.jI)(__stackOp3675_16_0)).i = ((int)((((moom.jI)(__stackOp3675_16_0)).i - 1)));
    return ((1) != 0);
    }
    forwardValue3675_59_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).b()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3675_98_0 = forwardValue3675_59_0;
        break forward_join_98;
    }
    if (!((forwardValue3675_59_0 != 0))) {
        break forward_join_95;
    }
    spill3675_3 = ((net.minecraft.world.border.WorldBorder)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__Fi())).a(((moom.DT)(p0)));
    if (!((life5_5 == null))) {
        forwardValue3675_98_0 = ((spill3675_3) ? 1 : 0);
        break forward_join_98;
    }
    if (!(spill3675_3)) {
        break forward_join_95;
    }
    this.i = ((int)(__sourceIntrinsic_564d2bc75d37_invokedynamic3675_28(10355, (1328407104024764532L ^ life3_3))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, p0, p1))));
    moom.jI.a(((net.minecraft.client.Minecraft)(this.c)), ((moom.jI)(this)), ((moom.DT)(p0)), ((moom.bs)(p1)));
    return ((1) != 0);
    }
    forwardValue3675_98_0 = ((this.a(((moom.DT)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3675_249_0 = forwardValue3675_98_0;
        break forward_join_249;
    }
    if (!((forwardValue3675_98_0 != 0))) {
        break forward_join_245;
    }
    life7_149 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    if (!((life5_5 == null))) {
        break forward_join_134;
    }
    if (!((((net.minecraft.block.Block)(life7_149)).a__fn() == moom.fn.a))) {
        break forward_join_119;
    }
    this.j = ((boolean)(false));
    return ((0) != 0);
    }
    moom.jI __stackOp3675_46_0 = this;
    ((moom.jI)(__stackOp3675_46_0)).g = ((float)((((moom.jI)(__stackOp3675_46_0)).g + ((net.minecraft.block.Block)(life7_149)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.c)).K)), ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).i)), ((moom.DT)(p0))))));
    }
    spill3675_4 = recovery.source.CarrierOps.fcmpl(((float)((this.h % 0x1.0p2f))), ((float)(0x0.0p0f)));
    if (!((life5_5 == null))) {
        forwardValue3675_193_0 = spill3675_4;
        break forward_join_193;
    }
    if (!((spill3675_4 == 0))) {
        break forward_join_183;
    }
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.c)).a__f1())).a(((net.minecraft.client.audio.ISound)(new moom.fY(new moom.DD(((moom.eJ)(((net.minecraft.block.Block)(life7_149)).H)).b__String()), ((((moom.eJ)(((net.minecraft.block.Block)(life7_149)).H)).a() + 0x1.0p0f) / 0x1.0p3f), (((moom.eJ)(((net.minecraft.block.Block)(life7_149)).H)).b() * 0x1.0p-1f), (((float) ((moom.DT)(p0)).a()) + 0x1.0p-1f), (((float) ((moom.DT)(p0)).b()) + 0x1.0p-1f), (((float) ((moom.DT)(p0)).c()) + 0x1.0p-1f)))));
    }
    moom.jI __stackOp3675_69_0 = this;
    ((moom.jI)(__stackOp3675_69_0)).h = ((float)((((moom.jI)(__stackOp3675_69_0)).h + 0x1.0p0f)));
    forwardValue3675_193_0 = recovery.source.CarrierOps.fcmpl(((float)(this.g)), ((float)(0x1.0p0f)));
    }
    if (!((life5_5 == null))) {
        forwardValue3675_244_0 = forwardValue3675_193_0;
        break forward_join_244;
    }
    if (!((forwardValue3675_193_0 >= 0))) {
        break forward_join_226;
    }
    this.j = ((boolean)(false));
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, p0, p1))));
    this.a(((moom.DT)(p0)), ((moom.bs)(p1)));
    this.g = ((float)(0x0.0p0f));
    this.h = ((float)(0x0.0p0f));
    this.i = ((int)(__sourceIntrinsic_564d2bc75d37_invokedynamic3675_81(10355, (1328407104024764532L ^ life3_3))));
    }
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).c(((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).e__Int())), ((moom.DT)(this.e)), ((int)((((int) (this.g * 0x1.4p3f)) - 1))));
    forwardValue3675_244_0 = 1;
    }
    return ((forwardValue3675_244_0) != 0);
    }
    forwardValue3675_249_0 = ((this.b(((moom.DT)(p0)), ((moom.bs)(p1)))) ? 1 : 0);
    }
    return ((forwardValue3675_249_0) != 0);
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.WorldSettings$GameType)(this.k)).c())) != 0);
}


public boolean h() {
long local1 = (moom.jI.q ^ 87646118740228L);
    return ((((this.k == net.minecraft.world.WorldSettings$GameType.SPECTATOR) ? 1 : 0)) != 0);
}


public boolean f() {
return (__sourceIntrinsic_booleanComparison((((net.minecraft.world.WorldSettings$GameType)(this.k)).b())) != 0);
}


public boolean d() {
int forwardValue3676_13_0;
    int forwardValue3676_15_0;
    boolean spill3676_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.jI.q ^ 84558800867624L);
    life3_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3676_0 = ((net.minecraft.world.WorldSettings$GameType)(this.k)).b();
    if (!((life3_5 == null))) {
        forwardValue3676_13_0 = ((spill3676_0) ? 1 : 0);
        break forward_join_13;
    }
    if (!((!spill3676_0))) {
        break forward_join_14;
    }
    forwardValue3676_13_0 = 1;
    }
    forwardValue3676_15_0 = forwardValue3676_13_0;
    break forward_join_15;
    }
    forwardValue3676_15_0 = 0;
    }
    return ((forwardValue3676_15_0) != 0);
}


public void a(net.minecraft.entity.player.EntityPlayer p0) {
((net.minecraft.world.WorldSettings$GameType)(this.k)).a(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)));
    return;
}


public void a(net.minecraft.world.WorldSettings$GameType p0) {
this.k = ((net.minecraft.world.WorldSettings$GameType)(p0));
    ((net.minecraft.world.WorldSettings$GameType)(this.k)).a(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).b1)));
    return;
}


public net.minecraft.world.WorldSettings$GameType a__bE() {
return this.k;
}


public static void a(net.minecraft.client.Minecraft p0, moom.jI p1, moom.DT p2, moom.bs p3) {
int forwardValue3665_20_0;
    boolean spill3665_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_21: {
    forward_join_20: {
    life4_3 = (moom.jI.q ^ 58379158324178L);
    life6_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3665_0 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(p0)).I)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(p0)).K)), ((moom.DT)(p2)), ((moom.bs)(p3)));
    if (!((life6_5 == null))) {
        forwardValue3665_20_0 = ((spill3665_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill3665_0))) {
        break forward_join_21;
    }
    forwardValue3665_20_0 = ((((moom.jI)(p1)).a(((moom.DT)(p2)), ((moom.bs)(p3)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3665_20_0);
    }
    return;
}


public void a(int p0, int p1) {
((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.zk(p0, p1))));
    return;
}


public boolean a__Boolean() {
long local1 = (moom.jI.q ^ 112267825283633L);
    return ((((this.k == net.minecraft.world.WorldSettings$GameType.SPECTATOR) ? 1 : 0)) != 0);
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x168E;
        if (t[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = s[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])u.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    u.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/jI", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            jI.t[n4] = n6;
        }
        return t[n4];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.jI.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a__Int() {
return this.l;
}


public moom.jI a(int p0) {
this.l = ((int)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8124_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/jI"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.world.World p1, net.minecraft.item.ItemStack p2) {
moom.jI forwardValue3668_17_0;
    net.minecraft.item.ItemStack forwardValue3668_43_0;
    net.minecraft.item.ItemStack forwardValue3668_57_0;
    int forwardValue3668_70_0;
    int forwardValue3668_72_0;
    moom.jI spill3668_0;
    net.minecraft.item.ItemStack spill3668_1;
    net.minecraft.item.ItemStack spill3668_2;
    int spill3668_3;
    int spill3668_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    int life7_32;
    net.minecraft.item.ItemStack life8_37;
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_57: {
    forward_join_48: {
    forward_join_43: {
    forward_join_17: {
    forward_join_14: {
    life4_3 = (moom.jI.q ^ 2468583997259L);
    life6_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3668_0 = this;
    if (!((life6_5 == null))) {
        forwardValue3668_17_0 = spill3668_0;
        break forward_join_17;
    }
    if (!((((moom.jI)(spill3668_0)).k == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    this.c();
    forwardValue3668_17_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((moom.jI)(forwardValue3668_17_0)).d)).a(((moom.yK)(new moom.zb(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW()))));
    life7_32 = ((net.minecraft.item.ItemStack)(p2)).b;
    life8_37 = ((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.world.World)(p1)), ((net.minecraft.entity.player.EntityPlayer)(p0)));
    spill3668_1 = life8_37;
    if (!((life6_5 == null))) {
        forwardValue3668_57_0 = spill3668_1;
        break forward_join_57;
    }
    if (!((spill3668_1 == p2))) {
        break forward_join_48;
    }
    spill3668_2 = life8_37;
    if (!((life6_5 == null))) {
        forwardValue3668_43_0 = spill3668_2;
        break forward_join_43;
    }
    if (!((spill3668_2 != null))) {
        break forward_join_71;
    }
    forwardValue3668_43_0 = life8_37;
    }
    spill3668_3 = ((net.minecraft.item.ItemStack)(forwardValue3668_43_0)).b;
    if (!((life6_5 == null))) {
        forwardValue3668_72_0 = spill3668_3;
        break forward_join_72;
    }
    if (!((spill3668_3 != life7_32))) {
        break forward_join_71;
    }
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c] = life8_37;
    forwardValue3668_57_0 = life8_37;
    }
    spill3668_4 = ((net.minecraft.item.ItemStack)(forwardValue3668_57_0)).b;
    if (!((life6_5 == null))) {
        forwardValue3668_70_0 = spill3668_4;
        break forward_join_70;
    }
    if (!((spill3668_4 == 0))) {
        break forward_join_69;
    }
    (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a)[((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c] = null;
    }
    forwardValue3668_70_0 = 1;
    }
    return ((forwardValue3668_70_0) != 0);
    }
    forwardValue3668_72_0 = 0;
    }
    return ((forwardValue3668_72_0) != 0);
}


public net.minecraft.client.entity.EntityPlayerSP a(net.minecraft.world.World p0, moom.B2 p1) {
return new net.minecraft.client.entity.EntityPlayerSP(this.c, p0, this.d, p1);
}


public void a__Void() {
moom.jI forwardValue3671_28_0;
    moom.jI spill3671_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_38: {
    forward_join_28: {
    life1_3 = (moom.jI.q ^ 52742028250932L);
    life3_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3671_0 = this;
    if (!((life3_5 == null))) {
        forwardValue3671_28_0 = spill3671_0;
        break forward_join_28;
    }
    if (!(((moom.jI)(spill3671_0)).j)) {
        break forward_join_38;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.ABORT_DESTROY_BLOCK, this.e, moom.bs.DOWN))));
    this.j = ((boolean)(false));
    this.g = ((float)(0x0.0p0f));
    forwardValue3671_28_0 = this;
    }
    ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(((moom.jI)(forwardValue3671_28_0)).c)).I)).c(((int)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).e__Int())), ((moom.DT)(this.e)), ((int)(-1)));
    }
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.Entity p1) {
int forwardValue3670_27_0;
    int forwardValue3670_29_0;
    net.minecraft.entity.Entity[] spill3670_0;
    boolean spill3670_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_7;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    life3_3 = (moom.jI.q ^ 54769962983096L);
    spill3670_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    this.c();
    life5_7 = spill3670_0;
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.y6(p1, net.minecraft.network.play.client.C02PacketUseEntity$Action.INTERACT))));
    if (!((this.k != net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_28;
    }
    spill3670_1 = ((net.minecraft.entity.player.EntityPlayer)(p0)).e__sourceReturn_13640a2b19(((net.minecraft.entity.Entity)(p1)));
    if (!((life5_7 == null))) {
        forwardValue3670_27_0 = ((spill3670_1) ? 1 : 0);
        break forward_join_27;
    }
    if (!(spill3670_1)) {
        break forward_join_28;
    }
    forwardValue3670_27_0 = 1;
    }
    forwardValue3670_29_0 = forwardValue3670_27_0;
    break forward_join_29;
    }
    forwardValue3670_29_0 = 0;
    }
    return ((forwardValue3670_29_0) != 0);
}


public boolean a(net.minecraft.client.entity.EntityPlayerSP p0, net.minecraft.client.multiplayer.WorldClient p1, net.minecraft.item.ItemStack p2, moom.DT p3, moom.bs p4, moom.DR p5) {
moom.jI forwardValue3666_61_0;
    int forwardValue3666_89_0;
    int forwardValue3666_95_0;
    net.minecraft.item.ItemStack forwardValue3666_103_0;
    moom.jI forwardValue3666_126_0;
    int forwardValue3666_141_0;
    int forwardValue3666_191_0;
    int forwardValue3666_193_0;
    int forwardValue3666_198_0;
    net.minecraft.entity.Entity[] spill3666_0;
    moom.jI spill3666_1;
    boolean spill3666_2;
    net.minecraft.item.ItemStack spill3666_3;
    int spill3666_4;
    boolean spill3666_5;
    boolean spill3666_6;
    long life7_3;
    float life10_13;
    float life11_21;
    float life12_29;
    float life10_35;
    net.minecraft.entity.Entity[] life9_36;
    float life11_41;
    float life12_46;
    int life13_48;
    net.minecraft.block.state.IBlockState life14_77;
    net.minecraft.item.Item life16_133;
    moom.wU life15_144;
    int life14_211;
    int life15_214;
    int life16_224;
    forward_join_198: {
    forward_join_193: {
    forward_join_192: {
    forward_join_191: {
    forward_join_182: {
    forward_join_152: {
    forward_join_141: {
    forward_join_126: {
    forward_join_125: {
    forward_join_103: {
    forward_join_95: {
    forward_join_94: {
    forward_join_89: {
    forward_join_78: {
    forward_join_61: {
    forward_join_60: {
    life7_3 = (moom.jI.q ^ 107417111666946L);
    this.c();
    life10_13 = ((float) (((moom.DR)(p5)).a - ((double) ((moom.DT)(p3)).a())));
    life11_21 = ((float) (((moom.DR)(p5)).b - ((double) ((moom.DT)(p3)).b())));
    life12_29 = ((float) (((moom.DR)(p5)).c - ((double) ((moom.DT)(p3)).c())));
    spill3666_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    life10_35 = moom.Dr.a(((float)(life10_13)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life9_36 = spill3666_0;
    life11_41 = moom.Dr.a(((float)(life11_21)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life12_46 = moom.Dr.a(((float)(life12_29)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    life13_48 = 0;
    spill3666_1 = this;
    if (!((life9_36 == null))) {
        forwardValue3666_61_0 = spill3666_1;
        break forward_join_61;
    }
    if (!((!((net.minecraft.world.border.WorldBorder)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(((moom.jI)(spill3666_1)).c)).I)).a__Fi())).a(((moom.DT)(p3)))))) {
        break forward_join_60;
    }
    return ((0) != 0);
    }
    forwardValue3666_61_0 = this;
    }
    if (!((life9_36 == null))) {
        forwardValue3666_126_0 = forwardValue3666_61_0;
        break forward_join_126;
    }
    if (!((((moom.jI)(forwardValue3666_61_0)).k != net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_125;
    }
    life14_77 = ((net.minecraft.client.multiplayer.WorldClient)(p1)).a__fE(((moom.DT)(p3)));
    spill3666_2 = ((net.minecraft.client.entity.EntityPlayerSP)(p0)).t__Boolean();
    if (!((life9_36 == null))) {
        forwardValue3666_89_0 = ((spill3666_2) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill3666_2)) {
        break forward_join_78;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(p0)).a__xW() == null))) {
        break forward_join_94;
    }
    }
    forwardValue3666_89_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life14_77)).a__ch())).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((net.minecraft.block.state.IBlockState)(life14_77)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((moom.bs)(p4)), ((float)(life10_35)), ((float)(life11_41)), ((float)(life12_46)))) ? 1 : 0);
    }
    if (!((life9_36 == null))) {
        forwardValue3666_95_0 = forwardValue3666_89_0;
        break forward_join_95;
    }
    if (!((forwardValue3666_89_0 != 0))) {
        break forward_join_94;
    }
    life13_48 = 1;
    }
    forwardValue3666_95_0 = life13_48;
    }
    if (!((life9_36 == null))) {
        forwardValue3666_141_0 = forwardValue3666_95_0;
        break forward_join_141;
    }
    if (!((forwardValue3666_95_0 == 0))) {
        break forward_join_125;
    }
    spill3666_3 = p2;
    if (!((life9_36 == null))) {
        forwardValue3666_103_0 = spill3666_3;
        break forward_join_103;
    }
    if (!((spill3666_3 != null))) {
        break forward_join_125;
    }
    forwardValue3666_103_0 = p2;
    }
    life16_133 = ((net.minecraft.item.ItemStack)(forwardValue3666_103_0)).a__wQ();
    spill3666_4 = ((life16_133 instanceof moom.wU) ? 1 : 0);
    if (!((life9_36 == null))) {
        forwardValue3666_141_0 = spill3666_4;
        break forward_join_141;
    }
    if (!((spill3666_4 != 0))) {
        break forward_join_125;
    }
    life15_144 = ((moom.wU)(life16_133));
    spill3666_5 = ((moom.wU)(life15_144)).a(((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.item.ItemStack)(p2)));
    if (!((life9_36 == null))) {
        forwardValue3666_141_0 = ((spill3666_5) ? 1 : 0);
        break forward_join_141;
    }
    if (!((!spill3666_5))) {
        break forward_join_125;
    }
    return ((0) != 0);
    }
    forwardValue3666_126_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((moom.jI)(forwardValue3666_126_0)).d)).a(((moom.yK)(new moom.zb(p3, ((moom.bs)(p4)).a(), ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(p0)).bD)).a__xW(), life10_35, life11_41, life12_46))));
    forwardValue3666_141_0 = life13_48;
    }
    if (!((life9_36 == null))) {
        forwardValue3666_193_0 = forwardValue3666_141_0;
        break forward_join_193;
    }
    if (!((forwardValue3666_141_0 == 0))) {
        break forward_join_192;
    }
    if (!((this.k != net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_192;
    }
    if (!((p2 == null))) {
        break forward_join_152;
    }
    return ((0) != 0);
    }
    spill3666_6 = ((net.minecraft.world.WorldSettings$GameType)(this.k)).b();
    if (!((life9_36 == null))) {
        forwardValue3666_191_0 = ((spill3666_6) ? 1 : 0);
        break forward_join_191;
    }
    if (!(spill3666_6)) {
        break forward_join_182;
    }
    life14_211 = ((net.minecraft.item.ItemStack)(p2)).c();
    life15_214 = ((net.minecraft.item.ItemStack)(p2)).b;
    life16_224 = ((((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(life10_35)), ((float)(life11_41)), ((float)(life12_46)))) ? 1 : 0);
    ((net.minecraft.item.ItemStack)(p2)).a__Void(((int)(life14_211)));
    ((net.minecraft.item.ItemStack)(p2)).b = ((int)(life15_214));
    return ((life16_224) != 0);
    }
    forwardValue3666_191_0 = ((((net.minecraft.item.ItemStack)(p2)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((net.minecraft.world.World)(p1)), ((moom.DT)(p3)), ((moom.bs)(p4)), ((float)(life10_35)), ((float)(life11_41)), ((float)(life12_46)))) ? 1 : 0);
    }
    return ((forwardValue3666_191_0) != 0);
    }
    forwardValue3666_193_0 = 1;
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue3666_198_0 = forwardValue3666_193_0;
        break forward_join_198;
    }
    net.minecraft.client.multiplayer.WorldClient.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    forwardValue3666_198_0 = forwardValue3666_193_0;
    }
    return ((forwardValue3666_198_0) != 0);
}


private boolean a(moom.DT p0) {
int forwardValue3663_28_0;
    int forwardValue3663_32_0;
    int forwardValue3663_34_0;
    int forwardValue3663_40_0;
    net.minecraft.item.ItemStack forwardValue3663_52_0;
    int forwardValue3663_56_0;
    net.minecraft.item.ItemStack forwardValue3663_63_0;
    net.minecraft.item.ItemStack forwardValue3663_67_0;
    net.minecraft.item.ItemStack forwardValue3663_75_0;
    int forwardValue3663_83_0;
    int forwardValue3663_95_0;
    int forwardValue3663_97_0;
    int forwardValue3663_106_0;
    int forwardValue3663_110_0;
    int forwardValue3663_112_0;
    boolean spill3663_0;
    boolean spill3663_1;
    int spill3663_2;
    net.minecraft.item.ItemStack spill3663_3;
    net.minecraft.item.ItemStack spill3663_4;
    boolean spill3663_5;
    int spill3663_6;
    boolean spill3663_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_52;
    net.minecraft.item.ItemStack life6_66;
    int life7_82;
    forward_join_112: {
    forward_join_111: {
    forward_join_110: {
    forward_join_106: {
    forward_join_98: {
    forward_join_97: {
    forward_join_96: {
    forward_join_95: {
    forward_join_94: {
    forward_join_83: {
    forward_join_75: {
    forward_join_67: {
    forward_join_63: {
    forward_join_56: {
    forward_join_55: {
    forward_join_52: {
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_28: {
    forward_join_19: {
    life2_3 = (moom.jI.q ^ 125283938941986L);
    life4_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3663_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life4_5 == null))) {
        forwardValue3663_28_0 = ((spill3663_0) ? 1 : 0);
        break forward_join_28;
    }
    if (!(spill3663_0)) {
        break forward_join_19;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() != null))) {
        break forward_join_19;
    }
    spill3663_1 = com.moon.security.e.c;
    if (!((life4_5 == null))) {
        forwardValue3663_28_0 = ((spill3663_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill3663_1))) {
        break forward_join_33;
    }
    }
    forwardValue3663_28_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_b3264b808749_invokedynamic3663_11(28553, (4666888773032043037L ^ life2_3)))));
    }
    if (!((life4_5 == null))) {
        forwardValue3663_32_0 = forwardValue3663_28_0;
        break forward_join_32;
    }
    if (!((forwardValue3663_28_0 > 0))) {
        break forward_join_33;
    }
    forwardValue3663_32_0 = 1;
    }
    forwardValue3663_34_0 = forwardValue3663_32_0;
    break forward_join_34;
    }
    forwardValue3663_34_0 = 0;
    }
    life5_52 = forwardValue3663_34_0;
    spill3663_2 = life5_52;
    if (!((life4_5 == null))) {
        forwardValue3663_40_0 = spill3663_2;
        break forward_join_40;
    }
    if (!((spill3663_2 != 0))) {
        break forward_join_41;
    }
    forwardValue3663_40_0 = 0;
    }
    return ((forwardValue3663_40_0) != 0);
    }
    life6_66 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).a__xW();
    spill3663_3 = this.f;
    if (!((life4_5 == null))) {
        forwardValue3663_52_0 = spill3663_3;
        break forward_join_52;
    }
    if (!((spill3663_3 == null))) {
        break forward_join_55;
    }
    forwardValue3663_52_0 = life6_66;
    }
    if (!((forwardValue3663_52_0 == null))) {
        break forward_join_55;
    }
    forwardValue3663_56_0 = 1;
    break forward_join_56;
    }
    forwardValue3663_56_0 = 0;
    }
    life7_82 = forwardValue3663_56_0;
    spill3663_4 = this.f;
    if (!((life4_5 == null))) {
        forwardValue3663_63_0 = spill3663_4;
        break forward_join_63;
    }
    if (!((spill3663_4 != null))) {
        break forward_join_98;
    }
    forwardValue3663_63_0 = life6_66;
    }
    if (!((life4_5 == null))) {
        forwardValue3663_67_0 = forwardValue3663_63_0;
        break forward_join_67;
    }
    if (!((forwardValue3663_63_0 != null))) {
        break forward_join_98;
    }
    forwardValue3663_67_0 = life6_66;
    }
    if (!((life4_5 == null))) {
        forwardValue3663_75_0 = forwardValue3663_67_0;
        break forward_join_75;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3663_67_0)).a__wQ() == ((net.minecraft.item.ItemStack)(this.f)).a__wQ()))) {
        break forward_join_96;
    }
    forwardValue3663_75_0 = life6_66;
    }
    spill3663_5 = net.minecraft.item.ItemStack.a(((net.minecraft.item.ItemStack)(forwardValue3663_75_0)), ((net.minecraft.item.ItemStack)(this.f)));
    if (!((life4_5 == null))) {
        forwardValue3663_83_0 = ((spill3663_5) ? 1 : 0);
        break forward_join_83;
    }
    if (!(spill3663_5)) {
        break forward_join_96;
    }
    forwardValue3663_83_0 = ((((net.minecraft.item.ItemStack)(life6_66)).b__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue3663_95_0 = forwardValue3663_83_0;
        break forward_join_95;
    }
    if (!((forwardValue3663_83_0 == 0))) {
        break forward_join_94;
    }
    spill3663_6 = ((net.minecraft.item.ItemStack)(life6_66)).c();
    if (!((life4_5 == null))) {
        forwardValue3663_95_0 = spill3663_6;
        break forward_join_95;
    }
    if (!((spill3663_6 == ((net.minecraft.item.ItemStack)(this.f)).c()))) {
        break forward_join_96;
    }
    }
    forwardValue3663_95_0 = 1;
    }
    forwardValue3663_97_0 = forwardValue3663_95_0;
    break forward_join_97;
    }
    forwardValue3663_97_0 = 0;
    }
    life7_82 = forwardValue3663_97_0;
    }
    spill3663_7 = ((moom.DT)(p0)).equals(((java.lang.Object)(this.e)));
    if (!((life4_5 == null))) {
        forwardValue3663_106_0 = ((spill3663_7) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill3663_7)) {
        break forward_join_111;
    }
    forwardValue3663_106_0 = life7_82;
    }
    if (!((life4_5 == null))) {
        forwardValue3663_110_0 = forwardValue3663_106_0;
        break forward_join_110;
    }
    if (!((forwardValue3663_106_0 != 0))) {
        break forward_join_111;
    }
    forwardValue3663_110_0 = 1;
    }
    forwardValue3663_112_0 = forwardValue3663_110_0;
    break forward_join_112;
    }
    forwardValue3663_112_0 = 0;
    }
    return ((forwardValue3663_112_0) != 0);
}


public float a() {
long local1 = (moom.jI.q ^ 101706106831264L);
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.world.WorldSettings$GameType)(this.k)).b()) != 0) ? moom.jI.b : moom.jI.a);
}


public void a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.Entity p1) {
long local3 = (moom.jI.q ^ 58740975407059L);
    this.c();
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.y6(p1, net.minecraft.network.play.client.C02PacketUseEntity$Action.ATTACK))));
    if ((this.k != net.minecraft.world.WorldSettings$GameType.SPECTATOR)) {
        ((net.minecraft.entity.player.EntityPlayer)(p0)).j(((net.minecraft.entity.Entity)(p1)));
    }
    return;
}


public boolean a(moom.DT p0, moom.bs p1) {
int forwardValue3664_24_0;
    int forwardValue3664_28_0;
    int forwardValue3664_30_0;
    int forwardValue3664_46_0;
    moom.jI forwardValue3664_58_0;
    net.minecraft.item.ItemStack forwardValue3664_83_0;
    int forwardValue3664_95_0;
    moom.jI forwardValue3664_115_0;
    net.minecraft.client.Minecraft forwardValue3664_116_0;
    int forwardValue3664_171_0;
    net.minecraft.item.ItemStack forwardValue3664_192_0;
    int forwardValue3664_201_0;
    boolean spill3664_0;
    int spill3664_1;
    boolean spill3664_2;
    moom.jI spill3664_3;
    boolean spill3664_4;
    net.minecraft.item.ItemStack spill3664_5;
    boolean spill3664_6;
    moom.jI spill3664_7;
    net.minecraft.client.Minecraft spill3664_8;
    net.minecraft.client.Minecraft spill3664_9;
    int spill3664_10;
    net.minecraft.item.ItemStack spill3664_11;
    int spill3664_12;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_42;
    net.minecraft.block.Block life7_107;
    net.minecraft.item.ItemStack life8_112;
    net.minecraft.client.multiplayer.WorldClient life7_181;
    net.minecraft.block.state.IBlockState life8_185;
    net.minecraft.block.Block life9_188;
    int life10_215;
    net.minecraft.item.ItemStack life11_256;
    forward_join_201: {
    forward_join_200: {
    forward_join_192: {
    forward_join_171: {
    forward_join_156: {
    forward_join_143: {
    forward_join_133: {
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_95: {
    forward_join_90: {
    forward_join_83: {
    forward_join_82: {
    forward_join_58: {
    forward_join_57: {
    forward_join_46: {
    forward_join_43: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (moom.jI.q ^ 25490463225490L);
    life5_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3664_0 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life5_5 == null))) {
        forwardValue3664_24_0 = ((spill3664_0) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill3664_0)) {
        break forward_join_15;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() == null))) {
        break forward_join_29;
    }
    }
    forwardValue3664_24_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_0759c74770c9_invokedynamic3664_9(28553, (4666987346853963949L ^ life3_3)))));
    }
    if (!((life5_5 == null))) {
        forwardValue3664_28_0 = forwardValue3664_24_0;
        break forward_join_28;
    }
    if (!((forwardValue3664_24_0 > 0))) {
        break forward_join_29;
    }
    forwardValue3664_28_0 = 1;
    }
    forwardValue3664_30_0 = forwardValue3664_28_0;
    break forward_join_30;
    }
    forwardValue3664_30_0 = 0;
    }
    life6_42 = forwardValue3664_30_0;
    spill3664_1 = life6_42;
    if (!((life5_5 == null))) {
        forwardValue3664_46_0 = spill3664_1;
        break forward_join_46;
    }
    if (!((spill3664_1 != 0))) {
        break forward_join_43;
    }
    spill3664_2 = ((com.moon.security.c)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c())).a__Boolean();
    if (!((life5_5 == null))) {
        forwardValue3664_46_0 = ((spill3664_2) ? 1 : 0);
        break forward_join_46;
    }
    if (!((!spill3664_2))) {
        break forward_join_43;
    }
    return ((0) != 0);
    }
    forwardValue3664_46_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3664_95_0 = forwardValue3664_46_0;
        break forward_join_95;
    }
    if (!((forwardValue3664_46_0 != 0))) {
        break forward_join_90;
    }
    spill3664_3 = this;
    if (!((life5_5 == null))) {
        forwardValue3664_58_0 = spill3664_3;
        break forward_join_58;
    }
    if (!((((moom.jI)(spill3664_3)).k == net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_57;
    }
    return ((0) != 0);
    }
    forwardValue3664_58_0 = this;
    }
    spill3664_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(((moom.jI)(forwardValue3664_58_0)).c)).K)).T__Boolean();
    if (!((life5_5 == null))) {
        forwardValue3664_95_0 = ((spill3664_4) ? 1 : 0);
        break forward_join_95;
    }
    if (!((!spill3664_4))) {
        break forward_join_90;
    }
    life7_107 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(this.c)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    life8_112 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).c__xW();
    spill3664_5 = life8_112;
    if (!((life5_5 == null))) {
        forwardValue3664_83_0 = spill3664_5;
        break forward_join_83;
    }
    if (!((spill3664_5 == null))) {
        break forward_join_82;
    }
    return ((0) != 0);
    }
    forwardValue3664_83_0 = life8_112;
    }
    spill3664_6 = ((net.minecraft.item.ItemStack)(forwardValue3664_83_0)).b(((net.minecraft.block.Block)(life7_107)));
    if (!((life5_5 == null))) {
        forwardValue3664_95_0 = ((spill3664_6) ? 1 : 0);
        break forward_join_95;
    }
    if (!((!spill3664_6))) {
        break forward_join_90;
    }
    return ((0) != 0);
    }
    spill3664_7 = this;
    if (!((life5_5 == null))) {
        forwardValue3664_115_0 = spill3664_7;
        break forward_join_115;
    }
    forwardValue3664_95_0 = ((((net.minecraft.world.WorldSettings$GameType)(((moom.jI)(spill3664_7)).k)).b()) ? 1 : 0);
    }
    if (!((forwardValue3664_95_0 != 0))) {
        break forward_join_114;
    }
    spill3664_8 = this.c;
    if (!((life5_5 == null))) {
        forwardValue3664_116_0 = spill3664_8;
        break forward_join_116;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(spill3664_8)).K)).a__xW() != null))) {
        break forward_join_114;
    }
    spill3664_9 = this.c;
    if (!((life5_5 == null))) {
        forwardValue3664_116_0 = spill3664_9;
        break forward_join_116;
    }
    if (!((((((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(spill3664_9)).K)).a__xW())).a__wQ() instanceof moom.xP) ? 1 : 0) != 0))) {
        break forward_join_114;
    }
    return ((0) != 0);
    }
    forwardValue3664_115_0 = this;
    }
    forwardValue3664_116_0 = ((moom.jI)(forwardValue3664_115_0)).c;
    }
    life7_181 = ((net.minecraft.client.Minecraft)(forwardValue3664_116_0)).I;
    life8_185 = ((net.minecraft.world.World)(life7_181)).a__fE(((moom.DT)(p0)));
    life9_188 = ((net.minecraft.block.state.IBlockState)(life8_185)).a__ch();
    if (!((life5_5 == null))) {
        break forward_join_143;
    }
    if (!((((net.minecraft.block.Block)(life9_188)).a__fn() == moom.fn.a))) {
        break forward_join_133;
    }
    return ((0) != 0);
    }
    ((net.minecraft.world.World)(life7_181)).b(((int)(__sourceIntrinsic_0759c74770c9_invokedynamic3664_56(2579, (4064277013426599574L ^ life3_3)))), ((moom.DT)(p0)), ((int)(net.minecraft.block.Block.a(((net.minecraft.block.state.IBlockState)(life8_185))))));
    }
    life10_215 = ((((net.minecraft.world.World)(life7_181)).d__Boolean(((moom.DT)(p0)))) ? 1 : 0);
    spill3664_10 = life10_215;
    if (!((life5_5 == null))) {
        forwardValue3664_171_0 = spill3664_10;
        break forward_join_171;
    }
    if (!((spill3664_10 != 0))) {
        break forward_join_156;
    }
    ((net.minecraft.block.Block)(life9_188)).a__Void(((net.minecraft.world.World)(life7_181)), ((moom.DT)(p0)), ((net.minecraft.block.state.IBlockState)(life8_185)));
    }
    this.e = ((moom.DT)(new moom.DT(((moom.DT)(this.e)).a(), -1, ((moom.DT)(this.e)).c())));
    forwardValue3664_171_0 = ((((net.minecraft.world.WorldSettings$GameType)(this.k)).b()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue3664_201_0 = forwardValue3664_171_0;
        break forward_join_201;
    }
    if (!((forwardValue3664_171_0 == 0))) {
        break forward_join_200;
    }
    life11_256 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).c__xW();
    spill3664_11 = life11_256;
    if (!((life5_5 == null))) {
        forwardValue3664_192_0 = spill3664_11;
        break forward_join_192;
    }
    if (!((spill3664_11 != null))) {
        break forward_join_200;
    }
    ((net.minecraft.item.ItemStack)(life11_256)).a(((net.minecraft.world.World)(life7_181)), ((net.minecraft.block.Block)(life9_188)), ((moom.DT)(p0)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(this.c)).K)));
    forwardValue3664_192_0 = life11_256;
    }
    spill3664_12 = ((net.minecraft.item.ItemStack)(forwardValue3664_192_0)).b;
    if (!((life5_5 == null))) {
        forwardValue3664_201_0 = spill3664_12;
        break forward_join_201;
    }
    if (!((spill3664_12 == 0))) {
        break forward_join_200;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).R();
    }
    forwardValue3664_201_0 = life10_215;
    }
    return ((forwardValue3664_201_0) != 0);
}


public void a(net.minecraft.item.ItemStack p0) {
long local2 = (moom.jI.q ^ 37874973244313L);
    if (((net.minecraft.world.WorldSettings$GameType)(this.k)).b()) {
        if ((p0 != null)) {
        ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.zj(-1, p0))));
    }
    }
    return;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0, net.minecraft.entity.Entity p1, net.minecraft.util.MovingObjectPosition p2) {
int forwardValue3667_50_0;
    int forwardValue3667_52_0;
    net.minecraft.entity.Entity[] spill3667_0;
    boolean spill3667_1;
    long life4_3;
    moom.DR life7_28;
    net.minecraft.entity.Entity[] life6_29;
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    life4_3 = (moom.jI.q ^ 16270322208044L);
    spill3667_0 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    this.c();
    life7_28 = new moom.DR((((moom.DR)(((net.minecraft.util.MovingObjectPosition)(p2)).d)).a - ((net.minecraft.entity.Entity)(p1)).n), (((moom.DR)(((net.minecraft.util.MovingObjectPosition)(p2)).d)).b - ((net.minecraft.entity.Entity)(p1)).o), (((moom.DR)(((net.minecraft.util.MovingObjectPosition)(p2)).d)).c - ((net.minecraft.entity.Entity)(p1)).p));
    life6_29 = spill3667_0;
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.y6(p1, life7_28))));
    if (!((this.k != net.minecraft.world.WorldSettings$GameType.SPECTATOR))) {
        break forward_join_51;
    }
    spill3667_1 = ((net.minecraft.entity.Entity)(p1)).a(((net.minecraft.entity.player.EntityPlayer)(p0)), ((moom.DR)(life7_28)));
    if (!((life6_29 == null))) {
        forwardValue3667_50_0 = ((spill3667_1) ? 1 : 0);
        break forward_join_50;
    }
    if (!(spill3667_1)) {
        break forward_join_51;
    }
    forwardValue3667_50_0 = 1;
    }
    forwardValue3667_52_0 = forwardValue3667_50_0;
    break forward_join_52;
    }
    forwardValue3667_52_0 = 0;
    }
    return ((forwardValue3667_52_0) != 0);
}


public net.minecraft.item.ItemStack a(int p0, int p1, int p2, int p3, net.minecraft.entity.player.EntityPlayer p4) {
short local6 = ((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(p4)).bG)).a(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p4)).bD)));
    net.minecraft.item.ItemStack local7 = ((moom.v8)(((net.minecraft.entity.player.EntityPlayer)(p4)).bG)).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((net.minecraft.entity.player.EntityPlayer)(p4)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.d)).a(((moom.yK)(new moom.zh(p0, p1, p2, p3, local7, local6))));
    return local7;
}


public void a(net.minecraft.item.ItemStack p0, int p1) {
moom.jI forwardValue3669_13_0;
    moom.jI spill3669_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_20: {
    forward_join_13: {
    life3_3 = (moom.jI.q ^ 98255884217340L);
    life5_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3669_0 = this;
    if (!((life5_5 == null))) {
        forwardValue3669_13_0 = spill3669_0;
        break forward_join_13;
    }
    if (!(((net.minecraft.world.WorldSettings$GameType)(((moom.jI)(spill3669_0)).k)).b())) {
        break forward_join_20;
    }
    forwardValue3669_13_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((moom.jI)(forwardValue3669_13_0)).d)).a(((moom.yK)(new moom.zj(p1, p0))));
    }
    return;
}


public boolean g() {
int forwardValue3677_18_0;
    int forwardValue3677_22_0;
    int forwardValue3677_24_0;
    boolean spill3677_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (moom.jI.q ^ 122649123045038L);
    life3_5 = net.minecraft.client.multiplayer.WorldClient.a__Arrayr3();
    spill3677_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).s__Boolean();
    if (!((life3_5 == null))) {
        forwardValue3677_18_0 = ((spill3677_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill3677_0)) {
        break forward_join_23;
    }
    forwardValue3677_18_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.c)).K)).g instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue3677_22_0 = forwardValue3677_18_0;
        break forward_join_22;
    }
    if (!((forwardValue3677_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue3677_22_0 = 1;
    }
    forwardValue3677_24_0 = forwardValue3677_22_0;
    break forward_join_24;
    }
    forwardValue3677_24_0 = 0;
    }
    return ((forwardValue3677_24_0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8124_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b3264b808749_invokedynamic3663_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0759c74770c9_invokedynamic3664_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0759c74770c9_invokedynamic3664_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8117_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_cefec3467f45_invokedynamic3673_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cefec3467f45_invokedynamic3673_49(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e88f4b4822_invokedynamic3674_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_564d2bc75d37_invokedynamic3675_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_564d2bc75d37_invokedynamic3675_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_564d2bc75d37_invokedynamic3675_81(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
