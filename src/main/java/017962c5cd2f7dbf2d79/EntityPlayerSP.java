package net.minecraft.client.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EntityPlayerSP extends moom.to {

public final net.minecraft.client.network.NetHandlerPlayClient cm;

private final moom.B2 cn;

public net.minecraft.util.MovementInput co;

public int cp;

public float cq;

public float cr;

public float cs;

public float ct;

public float cu;

public float cv;

public float cw;

public float cx;

protected net.minecraft.client.Minecraft cy;

public int cz;

private double cA;

private double cB;

private double cC;

private boolean cD;

private boolean cE;

private int cF;

private boolean cG;

private java.lang.String cH;

private int cI;

private float cJ;

public float cK;

public float cL;

public float cM;

public float cN;

private com.moon.nW cO;

public boolean cP;

private com.moon.module.impl.Sprint cQ;

private static net.minecraft.entity.Entity[] cR;

private static final long eb;

private static final long[] rb;

private static final java.lang.Integer[] sb;

private static final java.util.Map tb;

private static final long[] ub;

private static final java.lang.Long[] vb;

private static final java.util.Map wb;

public EntityPlayerSP(net.minecraft.client.Minecraft p0, net.minecraft.world.World p1, net.minecraft.client.network.NetHandlerPlayClient p2, moom.B2 p3) {
super(p1, (p2).a());
    this.cO = new com.moon.nW();
    this.cm = p2;
    this.cn = p3;
    this.cy = p0;
    this.af = 0;
}


static {
eb = ((long)(((moom._a)(moom._c.a(((long)(8976665211422088078L)), ((long)(-8190382838761018428L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(260733717044738L)))));
    tb = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.Entity[] __sourceSpill1163_7 = new net.minecraft.entity.Entity[5];
    long local11_life8 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 8579224739332L);
    net.minecraft.client.entity.EntityPlayerSP.b(((net.minecraft.entity.Entity[])(__sourceSpill1163_7)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1163_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1163_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1163_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1163_16 = new byte[8];
    (__sourceSpill1163_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1163_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1163_18 = __sourceSpill1163_16;
    ((javax.crypto.Cipher)(__sourceSpill1163_13)).init(((int)(__sourceSpill1163_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1163_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1163_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[10];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = ",Í¤¤\002ã¯¸i\033 £ç­¼Ø/V*\017~úyM·×iIx\021\034±}§g_\021\bm\030Yû£hâp¾Ø]Àgoa \rµ{w^\007²"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1163_27 = local17_life23;
        int __sourceSpill1163_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1163_27)).substring(((int)(__sourceSpill1163_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1163_32 = local19_life21;
        int __sourceSpill1163_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1163_35 = new byte[8];
        (__sourceSpill1163_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1163_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1163_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1163_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1163_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1163_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1163_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1163_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1163_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1163_36)).doFinal(((byte[])(__sourceSpill1163_35)));
        (__sourceSpill1163_32)[__sourceSpill1163_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "»¸\023VÚÕ@=ädÞ¬\002â°0"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1163_40 = local17_life23;
        int __sourceSpill1163_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1163_40)).substring(((int)(__sourceSpill1163_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1163_45 = local19_life21;
        int __sourceSpill1163_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1163_48 = new byte[8];
        (__sourceSpill1163_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1163_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1163_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1163_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1163_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1163_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1163_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1163_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1163_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1163_49)).doFinal(((byte[])(__sourceSpill1163_48)));
        (__sourceSpill1163_45)[__sourceSpill1163_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    rb = ((long[])(local19_life21));
    sb = ((java.lang.Integer[])(new java.lang.Integer[10]));
    wb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1163_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1163_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1163_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1163_61 = new byte[8];
    (__sourceSpill1163_61)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1163_61)[local1_life62] = ((byte) ((int) ((local11_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1163_63 = __sourceSpill1163_61;
    ((javax.crypto.Cipher)(__sourceSpill1163_58)).init(((int)(__sourceSpill1163_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1163_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1163_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[3];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "^\"Ì5:þJ[3v¡à1ÍñvL\007F"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1163_72 = local4_life68;
        int __sourceSpill1163_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1163_72)).substring(((int)(__sourceSpill1163_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1163_77 = local6_life66;
        int __sourceSpill1163_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1163_80 = new byte[8];
        (__sourceSpill1163_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1163_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1163_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1163_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1163_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1163_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1163_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1163_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1163_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1163_81)).doFinal(((byte[])(__sourceSpill1163_80)));
        (__sourceSpill1163_77)[__sourceSpill1163_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    ub = ((long[])(local6_life66));
    vb = ((java.lang.Long[])(new java.lang.Long[3]));
}


public void B__sourceReturn_da8c82d5d4() {
super.B__sourceReturn_da8c82d5d4();
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.zd())));
    return;
}


public void S() {
((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.PERFORM_RESPAWN))));
    return;
}


public void V__sourceReturn_da8c82d5d4() {
((net.minecraft.entity.player.InventoryPlayer)(this.bD)).a__Void(((net.minecraft.item.ItemStack)(null)));
    super.Q();
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    return;
}


public void i(float p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue4783_70_0;
    net.minecraft.client.entity.EntityPlayerSP spill4783_0;
    net.minecraft.client.entity.EntityPlayerSP spill4783_1;
    int spill4783_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    float life5_18;
    forward_join_72: {
    forward_join_70: {
    forward_join_66: {
    forward_join_64: {
    forward_join_54: {
    forward_join_39: {
    forward_join_37: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 34739626360675L);
    life4_5 = moom.hg.b();
    spill4783_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4783_70_0 = spill4783_0;
        break forward_join_70;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill4783_0)).cG)) {
        break forward_join_66;
    }
    life5_18 = (((net.minecraft.client.entity.EntityPlayerSP)(this)).b__sourceReturn_bc607678b6() - p0);
    if (!((life4_5 != null))) {
        break forward_join_54;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life5_18)), ((float)(0x0.0p0f))) <= 0))) {
        break forward_join_39;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).d(((float)(p0)));
    if (!((life4_5 != null))) {
        break forward_join_37;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life5_18)), ((float)(0x0.0p0f))) < 0))) {
        break forward_join_64;
    }
    this.U = ((int)((this.aX / 2)));
    }
    if (!((life4_5 == null))) {
        break forward_join_64;
    }
    }
    this.bg = ((float)(life5_18));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).d(((float)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b__sourceReturn_bc607678b6())));
    this.U = ((int)(this.aX));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).a__Void(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.k)), ((float)(life5_18)));
    }
    spill4783_1 = this;
    net.minecraft.client.entity.EntityPlayerSP __stackOp4783_17_0 = this;
    int __stackOp4783_17_1 = __sourceIntrinsic_b7c3de51b957_invokedynamic4783_16(3151, (6377669394110418830L ^ life2_3));
    spill4783_2 = __stackOp4783_17_1;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4783_17_0)).aP = ((int)(__stackOp4783_17_1));
    ((net.minecraft.client.entity.EntityPlayerSP)(spill4783_1)).aO = ((int)(spill4783_2));
    }
    if (!((life4_5 == null))) {
        break forward_join_72;
    }
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).d(((float)(p0)));
    forwardValue4783_70_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4783_70_0)).cG = ((boolean)(true));
    }
    return;
}


public void b(java.lang.String p0) {
com.moon.dK forwardValue4778_22_0;
    net.minecraft.entity.Entity[] spill4778_0;
    com.moon.dK spill4778_1;
    long life2_3;
    com.moon.dK life5_8;
    net.minecraft.entity.Entity[] life4_14;
    java.lang.String life1_28;
    forward_join_22: {
    forward_join_21: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 106340418993651L);
    life5_8 = new com.moon.dK(p0);
    spill4778_0 = moom.hg.b();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life5_8)));
    life4_14 = spill4778_0;
    spill4778_1 = life5_8;
    if (!((life4_14 != null))) {
        forwardValue4778_22_0 = spill4778_1;
        break forward_join_22;
    }
    if (!(((com.moon.dK)(spill4778_1)).isCancelled())) {
        break forward_join_21;
    }
    return;
    }
    forwardValue4778_22_0 = life5_8;
    }
    life1_28 = ((com.moon.dK)(forwardValue4778_22_0)).a__sourceReturn_0e30dfc966();
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y5(life1_28))));
    return;
}


public void b(net.minecraft.util.IChatComponent p0) {
((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.cy)).T)).a__gB())).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


public void b(net.minecraft.entity.Entity p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue4779_15_0;
    net.minecraft.client.entity.EntityPlayerSP spill4779_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_24: {
    forward_join_15: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 119748998840651L);
    life4_5 = moom.hg.b();
    spill4779_0 = this;
    if (!((life4_5 != null))) {
        forwardValue4779_15_0 = spill4779_0;
        break forward_join_15;
    }
    __sourceIntrinsic_89fd98101069_call4779_2(spill4779_0, p0);
    if (!((((p0 instanceof net.minecraft.entity.item.EntityMinecart) ? 1 : 0) != 0))) {
        break forward_join_24;
    }
    forwardValue4779_15_0 = this;
    }
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4779_15_0)).cy)).a__f1())).a(((net.minecraft.client.audio.ISound)(new moom.fX(this, ((net.minecraft.entity.item.EntityMinecart)(p0))))));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static net.minecraft.entity.Entity[] b__sourceReturn_95e22b2e1a() {
return net.minecraft.client.entity.EntityPlayerSP.cR;
}


public static void b(net.minecraft.entity.Entity[] p0) {
cR = ((net.minecraft.entity.Entity[])(p0));
    return;
}


protected boolean ad() {
long local1 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 89415178680308L);
    return ((((((net.minecraft.client.Minecraft)(this.cy)).a__r3() == this) ? 1 : 0)) != 0);
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.entity.EntityPlayerSP.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long e(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26845);
    if (((net.minecraft.client.entity.EntityPlayerSP.vb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.entity.EntityPlayerSP.ub)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.entity.EntityPlayerSP.wb)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.entity.EntityPlayerSP.wb)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/tq", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.entity.EntityPlayerSP.vb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.entity.EntityPlayerSP.vb)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral10165_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean ae() {
int forwardValue4777_39_0;
    int forwardValue4777_41_0;
    boolean spill4777_0;
    boolean spill4777_1;
    boolean spill4777_2;
    boolean spill4777_3;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 130937996344934L);
    life3_5 = moom.hg.b();
    spill4777_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).al)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4777_39_0 = ((spill4777_0) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill4777_0))) {
        break forward_join_38;
    }
    spill4777_1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).am)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4777_39_0 = ((spill4777_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill4777_1))) {
        break forward_join_38;
    }
    spill4777_2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).ao)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4777_39_0 = ((spill4777_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill4777_2))) {
        break forward_join_38;
    }
    spill4777_3 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).an)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4777_39_0 = ((spill4777_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill4777_3)) {
        break forward_join_40;
    }
    }
    forwardValue4777_39_0 = 1;
    }
    forwardValue4777_41_0 = forwardValue4777_39_0;
    break forward_join_41;
    }
    forwardValue4777_41_0 = 0;
    }
    return ((forwardValue4777_41_0) != 0);
}


protected boolean c__Boolean(double p0, double p1, double p2) {
int forwardValue4781_61_0;
    int forwardValue4781_82_0;
    int forwardValue4781_99_0;
    int forwardValue4781_107_0;
    int forwardValue4781_115_0;
    int forwardValue4781_128_0;
    int forwardValue4781_138_0;
    int forwardValue4781_138_1;
    int forwardValue4781_150_0;
    int forwardValue4781_150_1;
    int forwardValue4781_156_0;
    boolean spill4781_0;
    boolean spill4781_1;
    boolean spill4781_2;
    int spill4781_3;
    int spill4781_4;
    int spill4781_5;
    int spill4781_6;
    int spill4781_7;
    int spill4781_8;
    long life7_3;
    net.minecraft.entity.Entity[] life9_5;
    moom.DT life10_20;
    double life11_26;
    double life13_32;
    int life15_43;
    double life16_45;
    double life16_155;
    float life18_159;
    forward_join_156: {
    forward_join_155: {
    forward_join_150: {
    forward_join_146: {
    forward_join_138: {
    forward_join_136: {
    forward_join_128: {
    forward_join_127: {
    forward_join_116: {
    forward_join_115: {
    forward_join_107: {
    forward_join_99: {
    forward_join_95: {
    forward_join_82: {
    forward_join_78: {
    forward_join_61: {
    forward_join_57: {
    life7_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 54415877815618L);
    life9_5 = moom.hg.b();
    spill4781_0 = this.Q;
    if (!((life9_5 != null))) {
        forwardValue4781_156_0 = ((spill4781_0) ? 1 : 0);
        break forward_join_156;
    }
    if (!((!spill4781_0))) {
        break forward_join_155;
    }
    life10_20 = new moom.DT(p0, p1, p2);
    life11_26 = (p0 - ((double) ((moom.DT)(life10_20)).a()));
    life13_32 = (p2 - ((double) ((moom.DT)(life10_20)).c()));
    spill4781_1 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).a__sourceReturn_744e2be5d4(((moom.DT)(life10_20)));
    if (!((life9_5 != null))) {
        forwardValue4781_156_0 = ((spill4781_1) ? 1 : 0);
        break forward_join_156;
    }
    if (!((!spill4781_1))) {
        break forward_join_155;
    }
    life15_43 = -1;
    life16_45 = 0x1.3878p13d;
    spill4781_2 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).a__sourceReturn_744e2be5d4(((moom.DT)(((moom.DT)(life10_20)).e())));
    if (!((life9_5 != null))) {
        forwardValue4781_61_0 = ((spill4781_2) ? 1 : 0);
        break forward_join_61;
    }
    if (!(spill4781_2)) {
        break forward_join_57;
    }
    spill4781_3 = recovery.source.CarrierOps.dcmpg(((double)(life11_26)), ((double)(life16_45)));
    if (!((life9_5 != null))) {
        forwardValue4781_61_0 = spill4781_3;
        break forward_join_61;
    }
    if (!((spill4781_3 < 0))) {
        break forward_join_57;
    }
    life16_45 = life11_26;
    life15_43 = 0;
    }
    forwardValue4781_61_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).a__sourceReturn_744e2be5d4(((moom.DT)(((moom.DT)(life10_20)).f())))) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue4781_82_0 = forwardValue4781_61_0;
        break forward_join_82;
    }
    if (!((forwardValue4781_61_0 != 0))) {
        break forward_join_78;
    }
    spill4781_4 = recovery.source.CarrierOps.dcmpg(((double)((0x1.0p0d - life11_26))), ((double)(life16_45)));
    if (!((life9_5 != null))) {
        forwardValue4781_82_0 = spill4781_4;
        break forward_join_82;
    }
    if (!((spill4781_4 < 0))) {
        break forward_join_78;
    }
    life16_45 = (0x1.0p0d - life11_26);
    life15_43 = 1;
    }
    forwardValue4781_82_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).a__sourceReturn_744e2be5d4(((moom.DT)(((moom.DT)(life10_20)).c__DT())))) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue4781_99_0 = forwardValue4781_82_0;
        break forward_join_99;
    }
    if (!((forwardValue4781_82_0 != 0))) {
        break forward_join_95;
    }
    spill4781_5 = recovery.source.CarrierOps.dcmpg(((double)(life13_32)), ((double)(life16_45)));
    if (!((life9_5 != null))) {
        forwardValue4781_99_0 = spill4781_5;
        break forward_join_99;
    }
    if (!((spill4781_5 < 0))) {
        break forward_join_95;
    }
    life16_45 = life13_32;
    life15_43 = 4;
    }
    forwardValue4781_99_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).a__sourceReturn_744e2be5d4(((moom.DT)(((moom.DT)(life10_20)).d__DT())))) ? 1 : 0);
    }
    if (!((life9_5 != null))) {
        forwardValue4781_107_0 = forwardValue4781_99_0;
        break forward_join_107;
    }
    if (!((forwardValue4781_99_0 != 0))) {
        break forward_join_116;
    }
    forwardValue4781_107_0 = recovery.source.CarrierOps.dcmpg(((double)((0x1.0p0d - life13_32))), ((double)(life16_45)));
    }
    if (!((life9_5 != null))) {
        forwardValue4781_115_0 = forwardValue4781_107_0;
        break forward_join_115;
    }
    if (!((forwardValue4781_107_0 < 0))) {
        break forward_join_116;
    }
    life16_155 = (0x1.0p0d - life13_32);
    forwardValue4781_115_0 = 5;
    }
    life15_43 = forwardValue4781_115_0;
    }
    life18_159 = 0x1.99999ap-4f;
    spill4781_6 = life15_43;
    if (!((life9_5 != null))) {
        forwardValue4781_128_0 = spill4781_6;
        break forward_join_128;
    }
    if (!((spill4781_6 == 0))) {
        break forward_join_127;
    }
    this.t = ((double)(((double) (-life18_159))));
    }
    forwardValue4781_128_0 = life15_43;
    }
    spill4781_7 = 1;
    if (!((life9_5 != null))) {
        forwardValue4781_138_0 = forwardValue4781_128_0;
        forwardValue4781_138_1 = spill4781_7;
        break forward_join_138;
    }
    if (!((forwardValue4781_128_0 == spill4781_7))) {
        break forward_join_136;
    }
    this.t = ((double)(((double) life18_159)));
    }
    forwardValue4781_138_0 = life15_43;
    forwardValue4781_138_1 = 4;
    }
    if (!((life9_5 != null))) {
        forwardValue4781_150_0 = forwardValue4781_138_0;
        forwardValue4781_150_1 = forwardValue4781_138_1;
        break forward_join_150;
    }
    if (!((forwardValue4781_138_0 == forwardValue4781_138_1))) {
        break forward_join_146;
    }
    this.v = ((double)(((double) (-life18_159))));
    }
    spill4781_8 = life15_43;
    if (!((life9_5 != null))) {
        forwardValue4781_156_0 = spill4781_8;
        break forward_join_156;
    }
    forwardValue4781_150_0 = spill4781_8;
    forwardValue4781_150_1 = 5;
    }
    if (!((forwardValue4781_150_0 == forwardValue4781_150_1))) {
        break forward_join_155;
    }
    this.v = ((double)(((double) life18_159)));
    }
    forwardValue4781_156_0 = 0;
    }
    return ((forwardValue4781_156_0) != 0);
}


public void c(java.lang.String p0) {
this.cH = ((java.lang.String)(p0));
    return;
}


public void c(float p0) {
return;
}


public void c(boolean p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue4780_19_0;
    int forwardValue4780_19_1;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4780_20_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4780_21_0;
    int forwardValue4780_21_1;
    net.minecraft.entity.Entity[] spill4780_0;
    net.minecraft.client.entity.EntityPlayerSP spill4780_1;
    boolean spill4780_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 67704555122075L);
    spill4780_0 = moom.hg.b();
    super.c(((boolean)(p0)));
    life4_8 = spill4780_0;
    spill4780_1 = this;
    spill4780_2 = p0;
    if (!((life4_8 != null))) {
        forwardValue4780_19_0 = spill4780_1;
        forwardValue4780_19_1 = ((spill4780_2) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill4780_2)) {
        forwardValue4780_20_0 = spill4780_1;
        break forward_join_20;
    }
    forwardValue4780_19_0 = spill4780_1;
    forwardValue4780_19_1 = __sourceIntrinsic_d0e813f7bbb0_invokedynamic4780_4(20441, (3169149942734741229L ^ life2_3));
    }
    forwardValue4780_21_0 = forwardValue4780_19_0;
    forwardValue4780_21_1 = forwardValue4780_19_1;
    break forward_join_21;
    }
    forwardValue4780_21_0 = forwardValue4780_20_0;
    forwardValue4780_21_1 = 0;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4780_21_0)).cp = ((int)(forwardValue4780_21_1));
    return;
}


public float n__sourceReturn_bc607678b6() {
return this.cJ;
}


public void l(net.minecraft.entity.Entity p0) {
((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(this.cy)).M)).a(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CRIT_MAGIC)));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10169_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/tq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.entity.EntityPlayerSP.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17214;
      if (sb[var3] == null) {
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
         long var5 = rb[var3];
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
         Object[] var9 = (Object[])tb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               tb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/tq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         sb[var3] = var15;
      }

      return sb[var3];
}


public void a(net.minecraft.entity.passive.EntityHorse p0, net.minecraft.inventory.IInventory p1) {
((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hr(this.bD, p1, p0))));
    return;
}


public void a(net.minecraft.world.IInteractionObject p0) {
int forwardValue4774_30_0;
    int forwardValue4774_49_0;
    net.minecraft.entity.Entity[] spill4774_0;
    boolean spill4774_1;
    long life2_3;
    java.lang.String life5_7;
    net.minecraft.entity.Entity[] life4_8;
    forward_join_60: {
    forward_join_49: {
    forward_join_46: {
    forward_join_30: {
    forward_join_27: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 56183308871535L);
    spill4774_0 = moom.hg.b();
    life5_7 = ((net.minecraft.world.IInteractionObject)(p0)).c__String();
    life4_8 = spill4774_0;
    spill4774_1 = ((java.lang.String)("minecraft:crafting_table")).equals(((java.lang.Object)(life5_7)));
    if (!((life4_8 != null))) {
        forwardValue4774_30_0 = ((spill4774_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill4774_1)) {
        break forward_join_27;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.ho(this.bD, this.i))));
    if (!((life4_8 == null))) {
        break forward_join_60;
    }
    }
    forwardValue4774_30_0 = ((((java.lang.String)("minecraft:enchanting_table")).equals(((java.lang.Object)(life5_7)))) ? 1 : 0);
    }
    if (!((life4_8 != null))) {
        forwardValue4774_49_0 = forwardValue4774_30_0;
        break forward_join_49;
    }
    if (!((forwardValue4774_30_0 != 0))) {
        break forward_join_46;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiEnchantment(this.bD, this.i, p0))));
    if (!((life4_8 == null))) {
        break forward_join_60;
    }
    }
    forwardValue4774_49_0 = ((((java.lang.String)("minecraft:anvil")).equals(((java.lang.Object)(life5_7)))) ? 1 : 0);
    }
    if (!((forwardValue4774_49_0 != 0))) {
        break forward_join_60;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiRepair(this.bD, this.i))));
    }
    return;
}


public void a(net.minecraft.inventory.IInventory p0) {
net.minecraft.inventory.IInventory forwardValue4773_12_0;
    java.lang.String forwardValue4773_16_0;
    int forwardValue4773_37_0;
    int forwardValue4773_54_0;
    int forwardValue4773_71_0;
    int forwardValue4773_88_0;
    int forwardValue4773_105_0;
    int forwardValue4773_111_0;
    net.minecraft.inventory.IInventory spill4773_0;
    boolean spill4773_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.lang.String life5_22;
    forward_join_132: {
    forward_join_123: {
    forward_join_111: {
    forward_join_105: {
    forward_join_102: {
    forward_join_88: {
    forward_join_85: {
    forward_join_71: {
    forward_join_68: {
    forward_join_54: {
    forward_join_51: {
    forward_join_37: {
    forward_join_34: {
    forward_join_16: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 132407277251704L);
    life4_5 = moom.hg.b();
    spill4773_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue4773_12_0 = spill4773_0;
        break forward_join_12;
    }
    if (!((((spill4773_0 instanceof net.minecraft.world.IInteractionObject) ? 1 : 0) != 0))) {
        break forward_join_15;
    }
    forwardValue4773_12_0 = p0;
    }
    forwardValue4773_16_0 = ((net.minecraft.world.IInteractionObject)(((net.minecraft.world.IInteractionObject)(forwardValue4773_12_0)))).c__String();
    break forward_join_16;
    }
    forwardValue4773_16_0 = "minecraft:container";
    }
    life5_22 = forwardValue4773_16_0;
    spill4773_1 = ((java.lang.String)("minecraft:chest")).equals(((java.lang.Object)(life5_22)));
    if (!((life4_5 != null))) {
        forwardValue4773_37_0 = ((spill4773_1) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill4773_1)) {
        break forward_join_34;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hn(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    forwardValue4773_37_0 = ((((java.lang.String)("minecraft:hopper")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4773_54_0 = forwardValue4773_37_0;
        break forward_join_54;
    }
    if (!((forwardValue4773_37_0 != 0))) {
        break forward_join_51;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hi(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    forwardValue4773_54_0 = ((((java.lang.String)("minecraft:furnace")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4773_71_0 = forwardValue4773_54_0;
        break forward_join_71;
    }
    if (!((forwardValue4773_54_0 != 0))) {
        break forward_join_68;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hq(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    forwardValue4773_71_0 = ((((java.lang.String)("minecraft:brewing_stand")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4773_88_0 = forwardValue4773_71_0;
        break forward_join_88;
    }
    if (!((forwardValue4773_71_0 != 0))) {
        break forward_join_85;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hm(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    forwardValue4773_88_0 = ((((java.lang.String)("minecraft:beacon")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4773_105_0 = forwardValue4773_88_0;
        break forward_join_105;
    }
    if (!((forwardValue4773_88_0 != 0))) {
        break forward_join_102;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.inventory.GuiBeacon(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    forwardValue4773_105_0 = ((((java.lang.String)("minecraft:dispenser")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4773_111_0 = forwardValue4773_105_0;
        break forward_join_111;
    }
    if (!((forwardValue4773_105_0 == 0))) {
        break forward_join_123;
    }
    forwardValue4773_111_0 = ((((java.lang.String)("minecraft:dropper")).equals(((java.lang.Object)(life5_22)))) ? 1 : 0);
    }
    if (!((forwardValue4773_111_0 == 0))) {
        break forward_join_123;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hn(this.bD, p0))));
    if (!((life4_5 == null))) {
        break forward_join_132;
    }
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hp(this.bD, p0))));
    }
    return;
}


public boolean a(int p0, java.lang.String p1) {
int forwardValue4770_11_0;
    int forwardValue4770_13_0;
    int spill4770_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_13: {
    forward_join_12: {
    forward_join_11: {
    life3_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 110571961556107L);
    life5_5 = moom.hg.b();
    spill4770_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue4770_11_0 = spill4770_0;
        break forward_join_11;
    }
    if (!((spill4770_0 <= 0))) {
        break forward_join_12;
    }
    forwardValue4770_11_0 = 1;
    }
    forwardValue4770_13_0 = forwardValue4770_11_0;
    break forward_join_13;
    }
    forwardValue4770_13_0 = 0;
    }
    return ((forwardValue4770_13_0) != 0);
}


public void a(moom.qV p0) {
((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiCommandBlock(p0))));
    return;
}


public net.minecraft.entity.item.EntityItem a(boolean p0) {
long local2 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 105744197706845L);
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action local4 = (p0 ? net.minecraft.network.play.client.C07PacketPlayerDigging$Action.DROP_ALL_ITEMS : net.minecraft.network.play.client.C07PacketPlayerDigging$Action.DROP_ITEM);
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.za(local4, moom.DT.f, moom.bs.DOWN))));
    return null;
}


protected void a(net.minecraft.entity.item.EntityItem p0) {
return;
}


public boolean a__Boolean(net.minecraft.util.DamageSource p0, float p1) {
return ((0) != 0);
}


protected void a__Void(net.minecraft.util.DamageSource p0, float p1) {
net.minecraft.client.entity.EntityPlayerSP forwardValue4775_13_0;
    net.minecraft.client.entity.EntityPlayerSP spill4775_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_18: {
    forward_join_13: {
    life3_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 22768644764446L);
    life5_5 = moom.hg.b();
    spill4775_0 = this;
    if (!((life5_5 != null))) {
        forwardValue4775_13_0 = spill4775_0;
        break forward_join_13;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill4775_0)).a(((net.minecraft.util.DamageSource)(p0)))))) {
        break forward_join_18;
    }
    forwardValue4775_13_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4775_13_0)).d(((float)((((net.minecraft.client.entity.EntityPlayerSP)(this)).b__sourceReturn_bc607678b6() - p1))));
    }
    return;
}


public void a(net.minecraft.entity.IMerchant p0) {
((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiMerchant(this.bD, p0, this.i))));
    return;
}


public moom.DT a__DT() {
return new moom.DT((this.n + 0x1.0p-1d), (this.o + 0x1.0p-1d), (this.p + 0x1.0p-1d));
}


public void a(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 108089340405798L);
    net.minecraft.item.Item local4 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    if ((local4 == net.minecraft.init.Items.bB)) {
        ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new net.minecraft.client.gui.GuiScreenBook(this, p0, true))));
    }
    return;
}


public void a(net.minecraft.util.IChatComponent p0) {
((moom.gB)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(this.cy)).T)).a__gB())).a(((net.minecraft.util.IChatComponent)(p0)));
    return;
}


private boolean a__sourceReturn_744e2be5d4(moom.DT p0) {
int forwardValue4772_22_0;
    int forwardValue4772_26_0;
    int forwardValue4772_28_0;
    boolean spill4772_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_22: {
    life2_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 90534224331692L);
    life4_5 = moom.hg.b();
    spill4772_0 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(p0))))).a__ch())).e__Boolean();
    if (!((life4_5 != null))) {
        forwardValue4772_22_0 = ((spill4772_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!((!spill4772_0))) {
        break forward_join_27;
    }
    forwardValue4772_22_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(((moom.DT)(p0)).a__DT()))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue4772_26_0 = forwardValue4772_22_0;
        break forward_join_26;
    }
    if (!((forwardValue4772_22_0 == 0))) {
        break forward_join_27;
    }
    forwardValue4772_26_0 = 1;
    }
    forwardValue4772_28_0 = forwardValue4772_26_0;
    break forward_join_28;
    }
    forwardValue4772_28_0 = 0;
    }
    return ((forwardValue4772_28_0) != 0);
}


public void a(float p0, int p1, int p2) {
this.b4 = ((float)(p0));
    this.b3 = ((int)(p1));
    this.b2 = ((int)(p2));
    return;
}


public void a(moom.Ct p0) {
((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(new moom.hv(p0))));
    return;
}


public moom.B2 a__sourceReturn_d483ce8cb5() {
return this.cn;
}


public void a(moom.BY p0, int p1) {
moom.BY forwardValue4771_11_0;
    moom.BY spill4771_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_17: {
    forward_join_11: {
    life3_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 117331724732060L);
    life5_5 = moom.hg.b();
    spill4771_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue4771_11_0 = spill4771_0;
        break forward_join_11;
    }
    if (!((spill4771_0 != null))) {
        break forward_join_17;
    }
    forwardValue4771_11_0 = p0;
    }
    if (!(((moom.BY)(forwardValue4771_11_0)).c)) {
        break forward_join_17;
    }
    super.a(((moom.BY)(p0)), ((int)(p1)));
    }
    return;
}


public void a(java.lang.String p0, float p1, float p2) {
((net.minecraft.world.World)(this.i)).a(((double)(this.n)), ((double)(this.o)), ((double)(this.p)), ((java.lang.String)(p0)), ((float)(p1)), ((float)(p2)), ((boolean)(false)));
    return;
}


public void k(net.minecraft.entity.Entity p0) {
((net.minecraft.client.particle.EffectRenderer)(((net.minecraft.client.Minecraft)(this.cy)).M)).a(((net.minecraft.entity.Entity)(p0)), ((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.CRIT)));
    return;
}


public boolean t__Boolean() {
net.minecraft.util.MovementInput forwardValue4784_13_0;
    int forwardValue4784_18_0;
    int forwardValue4784_20_0;
    int forwardValue4784_27_0;
    int forwardValue4784_31_0;
    int forwardValue4784_33_0;
    net.minecraft.util.MovementInput spill4784_0;
    boolean spill4784_1;
    int spill4784_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_29;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_27: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 35176364890317L);
    life3_5 = moom.hg.b();
    spill4784_0 = this.co;
    if (!((life3_5 != null))) {
        forwardValue4784_13_0 = spill4784_0;
        break forward_join_13;
    }
    if (!((spill4784_0 != null))) {
        break forward_join_19;
    }
    forwardValue4784_13_0 = this.co;
    }
    spill4784_1 = ((net.minecraft.util.MovementInput)(forwardValue4784_13_0)).d;
    if (!((life3_5 != null))) {
        forwardValue4784_18_0 = ((spill4784_1) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill4784_1)) {
        break forward_join_19;
    }
    forwardValue4784_18_0 = 1;
    }
    forwardValue4784_20_0 = forwardValue4784_18_0;
    break forward_join_20;
    }
    forwardValue4784_20_0 = 0;
    }
    life4_29 = forwardValue4784_20_0;
    spill4784_2 = life4_29;
    if (!((life3_5 != null))) {
        forwardValue4784_27_0 = spill4784_2;
        break forward_join_27;
    }
    if (!((spill4784_2 != 0))) {
        break forward_join_32;
    }
    forwardValue4784_27_0 = ((this.bS) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4784_31_0 = forwardValue4784_27_0;
        break forward_join_31;
    }
    if (!((forwardValue4784_27_0 == 0))) {
        break forward_join_32;
    }
    forwardValue4784_31_0 = 1;
    }
    forwardValue4784_33_0 = forwardValue4784_31_0;
    break forward_join_33;
    }
    forwardValue4784_33_0 = 0;
    }
    return ((forwardValue4784_33_0) != 0);
}


public void g__Void() {
int lexicalValue1478_41_0;
    int lexicalValue1478_47_0;
    int lexicalValue1478_62_0;
    int lexicalValue1478_84_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue1478_116_0;
    boolean spill1478_0;
    boolean spill1478_1;
    net.minecraft.client.entity.EntityPlayerSP spill1478_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.management.RuntimeMXBean life4_21;
    int life5_23;
    java.util.Iterator life6_27;
    java.lang.String life7_34;
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_84: {
    lexical_join_62: {
    lexical_join_51: {
    lexical_join_47: {
    lexical_join_46: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 53623396789873L);
    life3_5 = moom.hg.b();
    spill1478_0 = ((com.moon.nW)(this.cO)).a(((long)(__sourceIntrinsic_736a66cda11e_invokedynamic1478_3(18596, (5574507820831224208L ^ life1_3)))));
    if (!((life3_5 != null))) {
        lexicalValue1478_62_0 = ((spill1478_0) ? 1 : 0);
        break lexical_join_62;
    }
    if (!(spill1478_0)) {
        break lexical_join_51;
    }
    life4_21 = java.lang.management.ManagementFactory.getRuntimeMXBean();
    life5_23 = 0;
    life6_27 = ((java.util.List)(((java.lang.management.RuntimeMXBean)(life4_21)).getInputArguments())).iterator();
    lexical_cycle_25: while (true) {
    lexical_join_44: {
    lexical_join_41: {
    if (!(((java.util.Iterator)(life6_27)).hasNext())) {
        break lexical_join_46;
    }
    life7_34 = ((java.lang.String)(((java.util.Iterator)(life6_27)).next()));
    spill1478_1 = ((java.lang.String)(life7_34)).contains(((java.lang.CharSequence)("-Duid")));
    if (!((life3_5 != null))) {
        lexicalValue1478_47_0 = ((spill1478_1) ? 1 : 0);
        break lexical_join_47;
    }
    if (!((life3_5 != null))) {
        lexicalValue1478_41_0 = ((spill1478_1) ? 1 : 0);
        break lexical_join_41;
    }
    if (!(spill1478_1)) {
        break lexical_join_44;
    }
    lexicalValue1478_41_0 = 1;
    }
    life5_23 = lexicalValue1478_41_0;
    if (!((life3_5 == null))) {
        break lexical_join_46;
    }
    }
    if (!((life3_5 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1478_47_0 = life5_23;
    }
    if (!((life3_5 != null))) {
        lexicalValue1478_62_0 = lexicalValue1478_47_0;
        break lexical_join_62;
    }
    if (!((lexicalValue1478_47_0 == 0))) {
        break lexical_join_51;
    }
    return;
    }
    lexicalValue1478_62_0 = ((((net.minecraft.world.World)(this.i)).c__Boolean(((moom.DT)(new moom.DT(this.n, 0x0.0p0d, this.p))))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        lexicalValue1478_84_0 = lexicalValue1478_62_0;
        break lexical_join_84;
    }
    if (!((lexicalValue1478_62_0 != 0))) {
        break lexical_join_117;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.MoveEvent(com.moon.event.MovePhase.BEFORE, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d, 0x0.0p0f, 0x0.0p0f, false))));
    super.g__Void();
    spill1478_2 = this;
    if (!((life3_5 != null))) {
        lexicalValue1478_116_0 = spill1478_2;
        break lexical_join_116;
    }
    lexicalValue1478_84_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill1478_2)).s__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1478_84_0 != 0))) {
        break lexical_join_115;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y9(this.w, this.x, this.A))));
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.zf(this.bj, this.bk, ((net.minecraft.util.MovementInput)(this.co)).c, ((net.minecraft.util.MovementInput)(this.co)).d))));
    if (!((life3_5 == null))) {
        break lexical_join_117;
    }
    }
    lexicalValue1478_116_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue1478_116_0)).U();
    }
    return;
}


public java.lang.String j__sourceReturn_0e30dfc966() {
return this.cH;
}


public void U() {
int forwardValue4769_78_0;
    int forwardValue4769_113_0;
    int forwardValue4769_145_0;
    int forwardValue4769_205_0;
    int forwardValue4769_207_0;
    int forwardValue4769_221_0;
    int forwardValue4769_223_0;
    int forwardValue4769_242_0;
    int forwardValue4769_246_0;
    int forwardValue4769_248_0;
    int forwardValue4769_287_0;
    int forwardValue4769_307_0;
    int forwardValue4769_326_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4769_345_0;
    int forwardValue4769_362_0;
    int forwardValue4769_370_0;
    int forwardValue4769_389_0;
    net.minecraft.entity.Entity[] spill4769_0;
    boolean spill4769_1;
    int spill4769_2;
    int spill4769_3;
    int spill4769_4;
    int spill4769_5;
    int spill4769_6;
    int spill4769_7;
    boolean spill4769_8;
    net.minecraft.client.entity.EntityPlayerSP spill4769_9;
    int spill4769_10;
    int spill4769_11;
    int spill4769_12;
    long life1_3;
    double life4_10;
    double life6_16;
    net.minecraft.entity.Entity[] life3_27;
    com.moon.event.MoveEvent life8_45;
    int life9_83;
    int life10_130;
    double life11_180;
    double life13_186;
    double life15_192;
    double life17_199;
    double life19_206;
    int life21_248;
    int life22_273;
    int life23_310;
    forward_join_418: {
    forward_join_398: {
    forward_join_389: {
    forward_join_388: {
    forward_join_370: {
    forward_join_363: {
    forward_join_362: {
    forward_join_345: {
    forward_join_344: {
    forward_join_326: {
    forward_join_324: {
    forward_join_307: {
    forward_join_306: {
    forward_join_287: {
    forward_join_286: {
    forward_join_248: {
    forward_join_247: {
    forward_join_246: {
    forward_join_242: {
    forward_join_233: {
    forward_join_223: {
    forward_join_222: {
    forward_join_221: {
    forward_join_220: {
    forward_join_207: {
    forward_join_206: {
    forward_join_205: {
    forward_join_204: {
    forward_join_145: {
    forward_join_143: {
    forward_join_140: {
    forward_join_132: {
    forward_join_113: {
    forward_join_111: {
    forward_join_105: {
    forward_join_97: {
    forward_join_78: {
    forward_join_76: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 90345831567614L);
    spill4769_0 = moom.hg.b();
    life4_10 = (this.n - this.M);
    life6_16 = (this.p - this.O);
    this.j = ((double)(java.lang.Math.sqrt(((double)(((life4_10 * life4_10) + (life6_16 * life6_16)))))));
    life3_27 = spill4769_0;
    life8_45 = new com.moon.event.MoveEvent(com.moon.event.MovePhase.PRE, this.n, ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c, this.p, this.w, this.x, this.A);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life8_45)));
    spill4769_1 = ((com.moon.event.MoveEvent)(life8_45)).isCancelled();
    if (!((life3_27 != null))) {
        forwardValue4769_78_0 = ((spill4769_1) ? 1 : 0);
        break forward_join_78;
    }
    if (!(spill4769_1)) {
        break forward_join_76;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.MoveEvent(com.moon.event.MovePhase.POST, this.n, ((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c, this.p, this.w, this.x, this.A))));
    return;
    }
    forwardValue4769_78_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).u__Boolean()) ? 1 : 0);
    }
    life9_83 = forwardValue4769_78_0;
    spill4769_2 = life9_83;
    if (!((life3_27 != null))) {
        forwardValue4769_113_0 = spill4769_2;
        break forward_join_113;
    }
    if (!((spill4769_2 != ((this.cE) ? 1 : 0)))) {
        break forward_join_111;
    }
    if (!((life9_83 != 0))) {
        break forward_join_97;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SPRINTING))));
    if (!((life3_27 == null))) {
        break forward_join_105;
    }
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SPRINTING))));
    }
    this.cP = ((boolean)(false));
    this.cE = ((boolean)__sourceIntrinsic_integerToBoolean((life9_83)));
    }
    forwardValue4769_113_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).t__Boolean()) ? 1 : 0);
    }
    life10_130 = forwardValue4769_113_0;
    spill4769_3 = life10_130;
    if (!((life3_27 != null))) {
        forwardValue4769_145_0 = spill4769_3;
        break forward_join_145;
    }
    if (!((spill4769_3 != ((this.cD) ? 1 : 0)))) {
        break forward_join_143;
    }
    if (!((life10_130 != 0))) {
        break forward_join_132;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.START_SNEAKING))));
    if (!((life3_27 == null))) {
        break forward_join_140;
    }
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.STOP_SNEAKING))));
    }
    this.cD = ((boolean)__sourceIntrinsic_integerToBoolean((life10_130)));
    }
    forwardValue4769_145_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).ad()) ? 1 : 0);
    }
    if (!((forwardValue4769_145_0 != 0))) {
        break forward_join_418;
    }
    life11_180 = (((com.moon.event.MoveEvent)(life8_45)).getX() - this.cA);
    life13_186 = (((com.moon.event.MoveEvent)(life8_45)).getY() - this.cB);
    life15_192 = (((com.moon.event.MoveEvent)(life8_45)).getZ() - this.cC);
    life17_199 = ((double) (((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6() - this.cw));
    life19_206 = ((double) (((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6() - this.cx));
    spill4769_4 = recovery.source.CarrierOps.dcmpl(((double)((((life11_180 * life11_180) + (life13_186 * life13_186)) + (life15_192 * life15_192)))), ((double)(0x1.d7dbf487fcb92p-11d)));
    if (!((life3_27 != null))) {
        forwardValue4769_205_0 = spill4769_4;
        break forward_join_205;
    }
    if (!((spill4769_4 <= 0))) {
        break forward_join_204;
    }
    spill4769_5 = this.cF;
    if (!((life3_27 != null))) {
        forwardValue4769_205_0 = spill4769_5;
        break forward_join_205;
    }
    if (!((spill4769_5 >= __sourceIntrinsic_31f9c3d4f601_invokedynamic4769_67(29547, (8242157313534648114L ^ life1_3))))) {
        break forward_join_206;
    }
    }
    forwardValue4769_205_0 = 1;
    }
    forwardValue4769_207_0 = forwardValue4769_205_0;
    break forward_join_207;
    }
    forwardValue4769_207_0 = 0;
    }
    life21_248 = forwardValue4769_207_0;
    spill4769_6 = recovery.source.CarrierOps.dcmpl(((double)(life17_199)), ((double)(0x0.0p0d)));
    if (!((life3_27 != null))) {
        forwardValue4769_221_0 = spill4769_6;
        break forward_join_221;
    }
    if (!((spill4769_6 == 0))) {
        break forward_join_220;
    }
    spill4769_7 = recovery.source.CarrierOps.dcmpl(((double)(life19_206)), ((double)(0x0.0p0d)));
    if (!((life3_27 != null))) {
        forwardValue4769_221_0 = spill4769_7;
        break forward_join_221;
    }
    if (!((spill4769_7 != 0))) {
        break forward_join_222;
    }
    }
    forwardValue4769_221_0 = 1;
    }
    forwardValue4769_223_0 = forwardValue4769_221_0;
    break forward_join_223;
    }
    forwardValue4769_223_0 = 0;
    }
    life22_273 = forwardValue4769_223_0;
    spill4769_8 = ((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")));
    if (!((life3_27 != null))) {
        forwardValue4769_242_0 = ((spill4769_8) ? 1 : 0);
        break forward_join_242;
    }
    if (!(spill4769_8)) {
        break forward_join_233;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() == null))) {
        break forward_join_247;
    }
    }
    forwardValue4769_242_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_31f9c3d4f601_invokedynamic4769_77(28779, (7212728726043981777L ^ life1_3)))));
    }
    if (!((life3_27 != null))) {
        forwardValue4769_246_0 = forwardValue4769_242_0;
        break forward_join_246;
    }
    if (!((forwardValue4769_242_0 > 0))) {
        break forward_join_247;
    }
    forwardValue4769_246_0 = 1;
    }
    forwardValue4769_248_0 = forwardValue4769_246_0;
    break forward_join_248;
    }
    forwardValue4769_248_0 = 0;
    }
    life23_310 = forwardValue4769_248_0;
    spill4769_9 = this;
    if (!((life3_27 != null))) {
        forwardValue4769_345_0 = spill4769_9;
        break forward_join_345;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill4769_9)).g == null))) {
        break forward_join_344;
    }
    spill4769_10 = life23_310;
    if (!((life3_27 != null))) {
        forwardValue4769_362_0 = spill4769_10;
        break forward_join_362;
    }
    if (!((spill4769_10 == 0))) {
        break forward_join_344;
    }
    spill4769_11 = life21_248;
    if (!((life3_27 != null))) {
        forwardValue4769_287_0 = spill4769_11;
        break forward_join_287;
    }
    if (!((spill4769_11 != 0))) {
        break forward_join_286;
    }
    spill4769_12 = life22_273;
    if (!((life3_27 != null))) {
        forwardValue4769_287_0 = spill4769_12;
        break forward_join_287;
    }
    if (!((spill4769_12 != 0))) {
        break forward_join_286;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y_(((com.moon.event.MoveEvent)(life8_45)).getX(), ((com.moon.event.MoveEvent)(life8_45)).getY(), ((com.moon.event.MoveEvent)(life8_45)).getZ(), ((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    if (!((life3_27 == null))) {
        break forward_join_363;
    }
    }
    forwardValue4769_287_0 = life21_248;
    }
    if (!((life3_27 != null))) {
        forwardValue4769_307_0 = forwardValue4769_287_0;
        break forward_join_307;
    }
    if (!((forwardValue4769_287_0 != 0))) {
        break forward_join_306;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y8(((com.moon.event.MoveEvent)(life8_45)).getX(), ((com.moon.event.MoveEvent)(life8_45)).getY(), ((com.moon.event.MoveEvent)(life8_45)).getZ(), ((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    if (!((life3_27 == null))) {
        break forward_join_363;
    }
    }
    forwardValue4769_307_0 = life22_273;
    }
    if (!((life3_27 != null))) {
        forwardValue4769_326_0 = forwardValue4769_307_0;
        break forward_join_326;
    }
    if (!((forwardValue4769_307_0 != 0))) {
        break forward_join_324;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y9(((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    if (!((life3_27 == null))) {
        break forward_join_363;
    }
    }
    forwardValue4769_326_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    if (!((life3_27 != null))) {
        forwardValue4769_370_0 = forwardValue4769_326_0;
        break forward_join_370;
    }
    if (!((forwardValue4769_326_0 <= __sourceIntrinsic_31f9c3d4f601_invokedynamic4769_101(2810, (8335003202485200551L ^ life1_3))))) {
        break forward_join_363;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.y7(((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    if (!((life3_27 == null))) {
        break forward_join_363;
    }
    }
    forwardValue4769_345_0 = this;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4769_345_0)).cm)).a(((moom.yK)(new moom.y_(this.t, -0x1.f38p9d, this.v, ((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    forwardValue4769_362_0 = 0;
    }
    life21_248 = forwardValue4769_362_0;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4769_112_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4769_112_0)).cF = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4769_112_0)).cF + 1)));
    forwardValue4769_370_0 = life21_248;
    }
    if (!((life3_27 != null))) {
        forwardValue4769_389_0 = forwardValue4769_370_0;
        break forward_join_389;
    }
    if (!((forwardValue4769_370_0 != 0))) {
        break forward_join_388;
    }
    this.cA = ((double)(((com.moon.event.MoveEvent)(life8_45)).getX()));
    this.cB = ((double)(((com.moon.event.MoveEvent)(life8_45)).getY()));
    this.cC = ((double)(((com.moon.event.MoveEvent)(life8_45)).getZ()));
    this.cF = ((int)(0));
    }
    forwardValue4769_389_0 = life22_273;
    }
    if (!((forwardValue4769_389_0 != 0))) {
        break forward_join_398;
    }
    this.cw = ((float)(((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6()));
    this.cx = ((float)(((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6()));
    }
    this.cL = ((float)(this.cK));
    this.cK = ((float)(((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6()));
    this.cN = ((float)(this.cM));
    this.cM = ((float)(((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6()));
    this.a4 = ((float)(((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6()));
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.MoveEvent(com.moon.event.MovePhase.POST, ((com.moon.event.MoveEvent)(life8_45)).getX(), ((com.moon.event.MoveEvent)(life8_45)).getY(), ((com.moon.event.MoveEvent)(life8_45)).getZ(), ((com.moon.event.MoveEvent)(life8_45)).a__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__sourceReturn_bc607678b6(), ((com.moon.event.MoveEvent)(life8_45)).b__Boolean()))));
    return;
}


public boolean L__Boolean() {
return ((1) != 0);
}


public boolean ac() {
net.minecraft.entity.Entity forwardValue4776_13_0;
    int forwardValue4776_21_0;
    int forwardValue4776_25_0;
    int forwardValue4776_27_0;
    net.minecraft.entity.Entity spill4776_0;
    int spill4776_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 74976131493599L);
    life3_5 = moom.hg.b();
    spill4776_0 = this.g;
    if (!((life3_5 != null))) {
        forwardValue4776_13_0 = spill4776_0;
        break forward_join_13;
    }
    if (!((spill4776_0 != null))) {
        break forward_join_26;
    }
    forwardValue4776_13_0 = this.g;
    }
    spill4776_1 = ((forwardValue4776_13_0 instanceof net.minecraft.entity.passive.EntityHorse) ? 1 : 0);
    if (!((life3_5 != null))) {
        forwardValue4776_21_0 = spill4776_1;
        break forward_join_21;
    }
    if (!((spill4776_1 != 0))) {
        break forward_join_26;
    }
    forwardValue4776_21_0 = ((((net.minecraft.entity.passive.EntityHorse)(((net.minecraft.entity.passive.EntityHorse)(this.g)))).ao()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4776_25_0 = forwardValue4776_21_0;
        break forward_join_25;
    }
    if (!((forwardValue4776_21_0 != 0))) {
        break forward_join_26;
    }
    forwardValue4776_25_0 = 1;
    }
    forwardValue4776_27_0 = forwardValue4776_25_0;
    break forward_join_27;
    }
    forwardValue4776_27_0 = 0;
    }
    return ((forwardValue4776_27_0) != 0);
}


public void X__sourceReturn_da8c82d5d4() {
((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.OPEN_INVENTORY))));
    return;
}


public void T() {
((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.zm(this.b1))));
    return;
}


protected void W__sourceReturn_da8c82d5d4() {
((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.ze(this, net.minecraft.network.play.client.C0BPacketEntityAction$Action.RIDING_JUMP, ((int) (((net.minecraft.client.entity.EntityPlayerSP)(this)).n__sourceReturn_bc607678b6() * 0x1.9p6f))))));
    return;
}


public void H() {
net.minecraft.client.entity.EntityPlayerSP forwardValue4768_52_0;
    net.minecraft.entity.Entity[] spill4768_0;
    net.minecraft.client.entity.EntityPlayerSP spill4768_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    forward_join_66: {
    forward_join_52: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 90246800085316L);
    spill4768_0 = moom.hg.b();
    super.H();
    life3_7 = spill4768_0;
    spill4768_1 = this;
    if (!((life3_7 != null))) {
        forwardValue4768_52_0 = spill4768_1;
        break forward_join_52;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill4768_1)).ad())) {
        break forward_join_66;
    }
    this.bj = ((float)(((net.minecraft.util.MovementInput)(this.co)).a));
    this.bk = ((float)(((net.minecraft.util.MovementInput)(this.co)).b));
    this.bi = ((boolean)(((net.minecraft.util.MovementInput)(this.co)).c));
    this.cs = ((float)(this.cq));
    this.ct = ((float)(this.cr));
    this.cr = ((float)(((float) (((double) this.cr) + (((double) (this.x - this.cr)) * 0x1.0p-1d)))));
    forwardValue4768_52_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4768_52_0)).cq = ((float)(((float) (((double) this.cq) + (((double) (this.w - this.cq)) * 0x1.0p-1d)))));
    }
    return;
}


public void Q() {
((net.minecraft.client.network.NetHandlerPlayClient)(this.cm)).a(((moom.yK)(new moom.zg(((moom.v8)(this.bG)).c))));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).V__sourceReturn_da8c82d5d4();
    return;
}


public boolean O__Boolean() {
return ((1) != 0);
}


public void G() {
int forwardValue4767_27_0;
    int forwardValue4767_43_0;
    int forwardValue4767_62_0;
    int forwardValue4767_66_0;
    int forwardValue4767_68_0;
    int forwardValue4767_82_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_88_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_105_0;
    int forwardValue4767_108_0;
    int forwardValue4767_139_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_144_0;
    int forwardValue4767_154_0;
    int forwardValue4767_191_0;
    int forwardValue4767_204_0;
    int forwardValue4767_212_0;
    int forwardValue4767_224_0;
    int forwardValue4767_240_0;
    int forwardValue4767_242_0;
    int forwardValue4767_288_0;
    int forwardValue4767_393_0;
    int forwardValue4767_403_0;
    int forwardValue4767_405_0;
    int forwardValue4767_423_0;
    int forwardValue4767_429_0;
    int forwardValue4767_439_0;
    int forwardValue4767_453_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_483_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_486_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_491_0;
    int forwardValue4767_520_0;
    int forwardValue4767_524_0;
    int forwardValue4767_526_0;
    int forwardValue4767_571_0;
    int forwardValue4767_585_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_591_0;
    int forwardValue4767_597_0;
    int forwardValue4767_638_0;
    int forwardValue4767_652_0;
    int forwardValue4767_657_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_661_0;
    int forwardValue4767_665_0;
    int forwardValue4767_678_0;
    int forwardValue4767_703_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_727_0;
    net.minecraft.entity.player.PlayerCapabilities forwardValue4767_735_0;
    int forwardValue4767_735_1;
    net.minecraft.entity.player.PlayerCapabilities forwardValue4767_736_0;
    net.minecraft.entity.player.PlayerCapabilities forwardValue4767_737_0;
    int forwardValue4767_737_1;
    int forwardValue4767_746_0;
    int forwardValue4767_774_0;
    int forwardValue4767_792_0;
    int forwardValue4767_813_0;
    int forwardValue4767_834_0;
    int forwardValue4767_852_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_881_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_900_0;
    int forwardValue4767_906_0;
    int forwardValue4767_912_0;
    int forwardValue4767_921_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue4767_927_0;
    int spill4767_0;
    int spill4767_1;
    boolean spill4767_2;
    int spill4767_3;
    net.minecraft.client.entity.EntityPlayerSP spill4767_4;
    int spill4767_5;
    boolean spill4767_6;
    net.minecraft.client.entity.EntityPlayerSP spill4767_7;
    int spill4767_8;
    int spill4767_9;
    int spill4767_10;
    boolean spill4767_11;
    boolean spill4767_12;
    boolean spill4767_13;
    boolean spill4767_14;
    boolean spill4767_15;
    net.minecraft.client.entity.EntityPlayerSP spill4767_16;
    int spill4767_17;
    net.minecraft.client.entity.EntityPlayerSP spill4767_18;
    net.minecraft.client.entity.EntityPlayerSP spill4767_19;
    int spill4767_20;
    net.minecraft.client.entity.EntityPlayerSP spill4767_21;
    net.minecraft.client.entity.EntityPlayerSP spill4767_22;
    net.minecraft.client.entity.EntityPlayerSP spill4767_23;
    net.minecraft.client.entity.EntityPlayerSP spill4767_24;
    boolean spill4767_25;
    int spill4767_26;
    boolean spill4767_27;
    int spill4767_28;
    int spill4767_29;
    boolean spill4767_30;
    boolean spill4767_31;
    boolean spill4767_32;
    int spill4767_33;
    net.minecraft.client.entity.EntityPlayerSP spill4767_34;
    int spill4767_35;
    int spill4767_36;
    boolean spill4767_37;
    boolean spill4767_38;
    boolean spill4767_39;
    boolean spill4767_40;
    boolean spill4767_41;
    net.minecraft.client.entity.EntityPlayerSP spill4767_42;
    net.minecraft.client.entity.EntityPlayerSP spill4767_43;
    boolean spill4767_44;
    boolean spill4767_45;
    boolean spill4767_46;
    net.minecraft.client.entity.EntityPlayerSP spill4767_47;
    net.minecraft.entity.player.PlayerCapabilities spill4767_48;
    boolean spill4767_49;
    boolean spill4767_50;
    boolean spill4767_51;
    net.minecraft.client.entity.EntityPlayerSP spill4767_52;
    int spill4767_53;
    int spill4767_54;
    boolean spill4767_55;
    boolean spill4767_56;
    net.minecraft.client.entity.EntityPlayerSP spill4767_57;
    net.minecraft.client.entity.EntityPlayerSP spill4767_58;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_104;
    int life5_341;
    int life6_345;
    float life7_347;
    int life8_362;
    com.moon.event.ActionEvent life9_389;
    int life9_555;
    float life10_559;
    com.moon.eE life11_725;
    int life12_757;
    forward_join_928: {
    forward_join_927: {
    forward_join_921: {
    forward_join_912: {
    forward_join_906: {
    forward_join_902: {
    forward_join_900: {
    forward_join_899: {
    forward_join_881: {
    forward_join_880: {
    forward_join_852: {
    forward_join_851: {
    forward_join_834: {
    forward_join_833: {
    forward_join_813: {
    forward_join_812: {
    forward_join_792: {
    forward_join_788: {
    forward_join_774: {
    forward_join_771: {
    forward_join_746: {
    forward_join_743: {
    forward_join_737: {
    forward_join_736: {
    forward_join_735: {
    forward_join_727: {
    forward_join_726: {
    forward_join_703: {
    forward_join_702: {
    forward_join_678: {
    forward_join_675: {
    forward_join_665: {
    forward_join_663: {
    forward_join_661: {
    forward_join_660: {
    forward_join_657: {
    forward_join_652: {
    forward_join_651: {
    forward_join_638: {
    forward_join_636: {
    forward_join_597: {
    forward_join_595: {
    forward_join_591: {
    forward_join_590: {
    forward_join_585: {
    forward_join_571: {
    forward_join_569: {
    forward_join_526: {
    forward_join_525: {
    forward_join_524: {
    forward_join_520: {
    forward_join_497: {
    forward_join_491: {
    forward_join_486: {
    forward_join_485: {
    forward_join_483: {
    forward_join_482: {
    forward_join_453: {
    forward_join_439: {
    forward_join_429: {
    forward_join_423: {
    forward_join_419: {
    forward_join_405: {
    forward_join_404: {
    forward_join_403: {
    forward_join_402: {
    forward_join_393: {
    forward_join_387: {
    forward_join_288: {
    forward_join_287: {
    forward_join_242: {
    forward_join_241: {
    forward_join_240: {
    forward_join_224: {
    forward_join_221: {
    forward_join_212: {
    forward_join_210: {
    forward_join_204: {
    forward_join_200: {
    forward_join_191: {
    forward_join_187: {
    forward_join_154: {
    forward_join_151: {
    forward_join_144: {
    forward_join_143: {
    forward_join_139: {
    forward_join_127: {
    forward_join_108: {
    forward_join_105: {
    forward_join_104: {
    forward_join_88: {
    forward_join_87: {
    forward_join_82: {
    forward_join_78: {
    forward_join_68: {
    forward_join_67: {
    forward_join_66: {
    forward_join_62: {
    forward_join_53: {
    forward_join_43: {
    forward_join_36: {
    forward_join_27: {
    forward_join_25: {
    life1_3 = (net.minecraft.client.entity.EntityPlayerSP.eb ^ 135105209068301L);
    life3_5 = moom.hg.b();
    spill4767_0 = this.cp;
    if (!((life3_5 != null))) {
        forwardValue4767_27_0 = spill4767_0;
        break forward_join_27;
    }
    if (!((spill4767_0 > 0))) {
        break forward_join_25;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_3_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_3_0)).cp = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_3_0)).cp - 1)));
    spill4767_1 = this.cp;
    if (!((life3_5 != null))) {
        forwardValue4767_27_0 = spill4767_1;
        break forward_join_27;
    }
    if (!((spill4767_1 == 0))) {
        break forward_join_25;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c(((boolean)(false)));
    }
    forwardValue4767_27_0 = this.cz;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_43_0 = forwardValue4767_27_0;
        break forward_join_43;
    }
    if (!((forwardValue4767_27_0 > 0))) {
        break forward_join_36;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_9_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_9_0)).cz = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_9_0)).cz - 1)));
    }
    this.cv = ((float)(this.cu));
    forwardValue4767_43_0 = ((((java.lang.String)(org.lwjgl.opengl.Display.getTitle())).contains(((java.lang.CharSequence)("\n")))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_62_0 = forwardValue4767_43_0;
        break forward_join_62;
    }
    if (!((forwardValue4767_43_0 != 0))) {
        break forward_join_53;
    }
    if (!((((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__c() != null))) {
        break forward_join_53;
    }
    spill4767_2 = com.moon.runtime.LocalClientState.c;
    if (!((life3_5 != null))) {
        forwardValue4767_62_0 = ((spill4767_2) ? 1 : 0);
        break forward_join_62;
    }
    if (!((!spill4767_2))) {
        break forward_join_67;
    }
    }
    forwardValue4767_62_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - com.moon.runtime.ClientContext.a()))), ((long)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4767_23(24161, (2085525121884037675L ^ life1_3)))));
    }
    if (!((life3_5 != null))) {
        forwardValue4767_66_0 = forwardValue4767_62_0;
        break forward_join_66;
    }
    if (!((forwardValue4767_62_0 > 0))) {
        break forward_join_67;
    }
    forwardValue4767_66_0 = 1;
    }
    forwardValue4767_68_0 = forwardValue4767_66_0;
    break forward_join_68;
    }
    forwardValue4767_68_0 = 0;
    }
    life4_104 = forwardValue4767_68_0;
    spill4767_3 = life4_104;
    if (!((life3_5 != null))) {
        forwardValue4767_82_0 = spill4767_3;
        break forward_join_82;
    }
    if (!((spill4767_3 != 0))) {
        break forward_join_78;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).a(((java.lang.String)("mob.cow.hurt")), ((float)(0x1.9p6f)), ((float)(0x1.0p0f)));
    }
    spill4767_4 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_88_0 = spill4767_4;
        break forward_join_88;
    }
    forwardValue4767_82_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_4)).am) ? 1 : 0);
    }
    if (!((forwardValue4767_82_0 == 0))) {
        break forward_join_87;
    }
    spill4767_5 = life4_104;
    if (!((life3_5 != null))) {
        forwardValue4767_154_0 = spill4767_5;
        break forward_join_154;
    }
    if (!((spill4767_5 != 0))) {
        break forward_join_151;
    }
    }
    forwardValue4767_88_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_105_0 = forwardValue4767_88_0;
        break forward_join_105;
    }
    if (!((((net.minecraft.client.Minecraft)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_88_0)).cy)).P != null))) {
        break forward_join_104;
    }
    spill4767_6 = ((net.minecraft.client.gui.GuiScreen)(((net.minecraft.client.Minecraft)(this.cy)).P)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_108_0 = ((spill4767_6) ? 1 : 0);
        break forward_join_108;
    }
    if (!((!spill4767_6))) {
        break forward_join_104;
    }
    ((net.minecraft.client.Minecraft)(this.cy)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    }
    forwardValue4767_105_0 = this;
    }
    forwardValue4767_108_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_105_0)).cu)), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 != null))) {
        forwardValue4767_139_0 = forwardValue4767_108_0;
        break forward_join_139;
    }
    if (!((forwardValue4767_108_0 == 0))) {
        break forward_join_127;
    }
    ((net.minecraft.client.audio.SoundHandler)(((net.minecraft.client.Minecraft)(this.cy)).a__f1())).a(((net.minecraft.client.audio.ISound)(moom.fY.a(((moom.DD)(new moom.DD("portal.trigger"))), ((float)(((((java.util.Random)(this.ah)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))))));
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_44_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_44_0)).cu = ((float)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_44_0)).cu + 0x1.99999ap-7f)));
    spill4767_7 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_144_0 = spill4767_7;
        break forward_join_144;
    }
    forwardValue4767_139_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(spill4767_7)).cu)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue4767_139_0 >= 0))) {
        break forward_join_143;
    }
    this.cu = ((float)(0x1.0p0f));
    }
    forwardValue4767_144_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_144_0)).am = ((boolean)(false));
    if (!((life3_5 == null))) {
        break forward_join_210;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    forwardValue4767_154_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.l)))) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_191_0 = forwardValue4767_154_0;
        break forward_join_191;
    }
    if (!((forwardValue4767_154_0 != 0))) {
        break forward_join_187;
    }
    spill4767_8 = ((net.minecraft.potion.PotionEffect)(((net.minecraft.client.entity.EntityPlayerSP)(this)).a(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.l))))).b();
    if (!((life3_5 != null))) {
        forwardValue4767_191_0 = spill4767_8;
        break forward_join_191;
    }
    if (!((spill4767_8 > __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_58(17624, (9006111805090861940L ^ life1_3))))) {
        break forward_join_187;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_59_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_59_0)).cu = ((float)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_59_0)).cu + 0x1.b4e81cp-8f)));
    spill4767_9 = recovery.source.CarrierOps.fcmpl(((float)(this.cu)), ((float)(0x1.0p0f)));
    if (!((life3_5 != null))) {
        forwardValue4767_212_0 = spill4767_9;
        break forward_join_212;
    }
    if (!((spill4767_9 > 0))) {
        break forward_join_210;
    }
    this.cu = ((float)(0x1.0p0f));
    if (!((life3_5 == null))) {
        break forward_join_210;
    }
    }
    forwardValue4767_191_0 = recovery.source.CarrierOps.fcmpl(((float)(this.cu)), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 != null))) {
        forwardValue4767_204_0 = forwardValue4767_191_0;
        break forward_join_204;
    }
    if (!((forwardValue4767_191_0 > 0))) {
        break forward_join_200;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_67_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_67_0)).cu = ((float)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_67_0)).cu - 0x1.99999ap-5f)));
    }
    forwardValue4767_204_0 = recovery.source.CarrierOps.fcmpg(((float)(this.cu)), ((float)(0x0.0p0f)));
    }
    if (!((life3_5 != null))) {
        forwardValue4767_212_0 = forwardValue4767_204_0;
        break forward_join_212;
    }
    if (!((forwardValue4767_204_0 < 0))) {
        break forward_join_210;
    }
    this.cu = ((float)(0x0.0p0f));
    }
    forwardValue4767_212_0 = this.ae;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_224_0 = forwardValue4767_212_0;
        break forward_join_224;
    }
    if (!((forwardValue4767_212_0 > 0))) {
        break forward_join_221;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_74_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_74_0)).ae = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_74_0)).ae - 1)));
    }
    forwardValue4767_224_0 = ((((net.minecraft.util.MovementInput)(this.co)).c) ? 1 : 0);
    }
    life5_341 = forwardValue4767_224_0;
    life6_345 = ((((net.minecraft.util.MovementInput)(this.co)).d) ? 1 : 0);
    life7_347 = 0x1.99999ap-1f;
    spill4767_10 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.MovementInput)(this.co)).b)), ((float)(life7_347)));
    if (!((life3_5 != null))) {
        forwardValue4767_240_0 = spill4767_10;
        break forward_join_240;
    }
    if (!((spill4767_10 >= 0))) {
        break forward_join_241;
    }
    forwardValue4767_240_0 = 1;
    }
    forwardValue4767_242_0 = forwardValue4767_240_0;
    break forward_join_242;
    }
    forwardValue4767_242_0 = 0;
    }
    life8_362 = forwardValue4767_242_0;
    ((net.minecraft.util.MovementInput)(this.co)).a();
    spill4767_11 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).M();
    if (!((life3_5 != null))) {
        forwardValue4767_288_0 = ((spill4767_11) ? 1 : 0);
        break forward_join_288;
    }
    if (!(spill4767_11)) {
        break forward_join_287;
    }
    spill4767_12 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).s__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_288_0 = ((spill4767_12) ? 1 : 0);
        break forward_join_288;
    }
    if (!((!spill4767_12))) {
        break forward_join_287;
    }
    life9_389 = new com.moon.event.ActionEvent(com.moon.event.ActionType.ITEM);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life9_389)));
    spill4767_13 = ((com.moon.event.ActionEvent)(life9_389)).isCancelled();
    if (!((life3_5 != null))) {
        forwardValue4767_288_0 = ((spill4767_13) ? 1 : 0);
        break forward_join_288;
    }
    if (!((!spill4767_13))) {
        break forward_join_287;
    }
    net.minecraft.util.MovementInput __stackOp4767_99_0 = this.co;
    ((net.minecraft.util.MovementInput)(__stackOp4767_99_0)).a = ((float)((((net.minecraft.util.MovementInput)(__stackOp4767_99_0)).a * 0x1.99999ap-3f)));
    net.minecraft.util.MovementInput __stackOp4767_103_0 = this.co;
    ((net.minecraft.util.MovementInput)(__stackOp4767_103_0)).b = ((float)((((net.minecraft.util.MovementInput)(__stackOp4767_103_0)).b * 0x1.99999ap-3f)));
    this.cz = ((int)(0));
    }
    forwardValue4767_288_0 = life4_104;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_393_0 = forwardValue4767_288_0;
        break forward_join_393;
    }
    if (!((forwardValue4767_288_0 == 0))) {
        break forward_join_387;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c__Boolean(((double)((this.n - (((double) this.G) * 0x1.6666666666666p-2d)))), ((double)((((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c + 0x1.0p-1d))), ((double)((this.p + (((double) this.G) * 0x1.6666666666666p-2d)))));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c__Boolean(((double)((this.n - (((double) this.G) * 0x1.6666666666666p-2d)))), ((double)((((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c + 0x1.0p-1d))), ((double)((this.p - (((double) this.G) * 0x1.6666666666666p-2d)))));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c__Boolean(((double)((this.n + (((double) this.G) * 0x1.6666666666666p-2d)))), ((double)((((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c + 0x1.0p-1d))), ((double)((this.p - (((double) this.G) * 0x1.6666666666666p-2d)))));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c__Boolean(((double)((this.n + (((double) this.G) * 0x1.6666666666666p-2d)))), ((double)((((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(this)).b())).c + 0x1.0p-1d))), ((double)((this.p + (((double) this.G) * 0x1.6666666666666p-2d)))));
    }
    forwardValue4767_393_0 = recovery.source.CarrierOps.fcmpl(((float)(((float) ((net.minecraft.util.FoodStats)(((net.minecraft.client.entity.EntityPlayerSP)(this)).a__C2())).a__Int()))), ((float)(0x1.8p2f)));
    }
    if (!((life3_5 != null))) {
        forwardValue4767_403_0 = forwardValue4767_393_0;
        break forward_join_403;
    }
    if (!((forwardValue4767_393_0 <= 0))) {
        break forward_join_402;
    }
    spill4767_14 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).c;
    if (!((life3_5 != null))) {
        forwardValue4767_403_0 = ((spill4767_14) ? 1 : 0);
        break forward_join_403;
    }
    if (!(spill4767_14)) {
        break forward_join_404;
    }
    }
    forwardValue4767_403_0 = 1;
    }
    forwardValue4767_405_0 = forwardValue4767_403_0;
    break forward_join_405;
    }
    forwardValue4767_405_0 = 0;
    }
    life9_555 = forwardValue4767_405_0;
    life10_559 = ((net.minecraft.util.MovementInput)(this.co)).b;
    spill4767_15 = this.cP;
    if (!((life3_5 != null))) {
        forwardValue4767_423_0 = ((spill4767_15) ? 1 : 0);
        break forward_join_423;
    }
    if (!(spill4767_15)) {
        break forward_join_419;
    }
    ((net.minecraft.util.MovementInput)(this.co)).b = ((float)(0x0.0p0f));
    }
    spill4767_16 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_486_0 = spill4767_16;
        break forward_join_486;
    }
    forwardValue4767_423_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_16)).A) ? 1 : 0);
    }
    if (!((forwardValue4767_423_0 != 0))) {
        break forward_join_485;
    }
    spill4767_17 = life6_345;
    if (!((life3_5 != null))) {
        forwardValue4767_429_0 = spill4767_17;
        break forward_join_429;
    }
    if (!((spill4767_17 == 0))) {
        break forward_join_485;
    }
    forwardValue4767_429_0 = life8_362;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_439_0 = forwardValue4767_429_0;
        break forward_join_439;
    }
    if (!((forwardValue4767_429_0 == 0))) {
        break forward_join_485;
    }
    spill4767_18 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_486_0 = spill4767_18;
        break forward_join_486;
    }
    forwardValue4767_439_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.MovementInput)(((net.minecraft.client.entity.EntityPlayerSP)(spill4767_18)).co)).b)), ((float)(life7_347)));
    }
    if (!((forwardValue4767_439_0 >= 0))) {
        break forward_join_485;
    }
    spill4767_19 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_486_0 = spill4767_19;
        break forward_join_486;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill4767_19)).u__Boolean()))) {
        break forward_join_485;
    }
    spill4767_20 = life9_555;
    if (!((life3_5 != null))) {
        forwardValue4767_453_0 = spill4767_20;
        break forward_join_453;
    }
    if (!((spill4767_20 != 0))) {
        break forward_join_485;
    }
    spill4767_21 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_486_0 = spill4767_21;
        break forward_join_486;
    }
    forwardValue4767_453_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_21)).M()) ? 1 : 0);
    }
    if (!((forwardValue4767_453_0 == 0))) {
        break forward_join_485;
    }
    spill4767_22 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_486_0 = spill4767_22;
        break forward_join_486;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill4767_22)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.r)))))) {
        break forward_join_485;
    }
    spill4767_23 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_483_0 = spill4767_23;
        break forward_join_483;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_23)).cz <= 0))) {
        break forward_join_482;
    }
    spill4767_24 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_483_0 = spill4767_24;
        break forward_join_483;
    }
    if (!((!((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(((net.minecraft.client.entity.EntityPlayerSP)(spill4767_24)).cy)).W)).ar)).a__Boolean()))) {
        break forward_join_482;
    }
    this.cz = ((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4767_162(30096, (1052856550673326653L ^ life1_3))));
    if (!((life3_5 == null))) {
        break forward_join_485;
    }
    }
    forwardValue4767_483_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_483_0)).c(((boolean)(true)));
    }
    forwardValue4767_486_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_491_0 = forwardValue4767_486_0;
        break forward_join_491;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_486_0)).cQ == null))) {
        break forward_join_497;
    }
    forwardValue4767_491_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_491_0)).cQ = ((com.moon.module.impl.Sprint)(((com.moon.module.impl.Sprint)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Sprint.class)))))));
    }
    life11_725 = new com.moon.eE(((net.minecraft.util.MovementInput)(this.co)).b);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life11_725)));
    spill4767_25 = ((com.moon.module.impl.Sprint)(this.cQ)).isEnabled();
    if (!((life3_5 != null))) {
        forwardValue4767_520_0 = ((spill4767_25) ? 1 : 0);
        break forward_join_520;
    }
    if (!(spill4767_25)) {
        break forward_join_525;
    }
    forwardValue4767_520_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Sprint)(this.cQ)).a())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_524_0 = forwardValue4767_520_0;
        break forward_join_524;
    }
    if (!((forwardValue4767_520_0 != 0))) {
        break forward_join_525;
    }
    forwardValue4767_524_0 = 1;
    }
    forwardValue4767_526_0 = forwardValue4767_524_0;
    break forward_join_526;
    }
    forwardValue4767_526_0 = 0;
    }
    life12_757 = forwardValue4767_526_0;
    spill4767_26 = life12_757;
    if (!((life3_5 != null))) {
        forwardValue4767_597_0 = spill4767_26;
        break forward_join_597;
    }
    if (!((spill4767_26 == 0))) {
        break forward_join_595;
    }
    spill4767_27 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).u__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = ((spill4767_27) ? 1 : 0);
        break forward_join_571;
    }
    if (!((!spill4767_27))) {
        break forward_join_569;
    }
    spill4767_28 = life9_555;
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = spill4767_28;
        break forward_join_571;
    }
    if (!((spill4767_28 != 0))) {
        break forward_join_569;
    }
    spill4767_29 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.eE)(life11_725)).a())), ((float)(life7_347)));
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = spill4767_29;
        break forward_join_571;
    }
    if (!((spill4767_29 >= 0))) {
        break forward_join_569;
    }
    spill4767_30 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).M();
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = ((spill4767_30) ? 1 : 0);
        break forward_join_571;
    }
    if (!((!spill4767_30))) {
        break forward_join_569;
    }
    spill4767_31 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.r)));
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = ((spill4767_31) ? 1 : 0);
        break forward_join_571;
    }
    if (!((!spill4767_31))) {
        break forward_join_569;
    }
    spill4767_32 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).ar)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_571_0 = ((spill4767_32) ? 1 : 0);
        break forward_join_571;
    }
    if (!(spill4767_32)) {
        break forward_join_569;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c(((boolean)(true)));
    }
    forwardValue4767_571_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).u__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_665_0 = forwardValue4767_571_0;
        break forward_join_665;
    }
    if (!((forwardValue4767_571_0 != 0))) {
        break forward_join_663;
    }
    spill4767_33 = recovery.source.CarrierOps.fcmpg(((float)(((com.moon.eE)(life11_725)).a())), ((float)(life7_347)));
    if (!((life3_5 != null))) {
        forwardValue4767_585_0 = spill4767_33;
        break forward_join_585;
    }
    if (!((spill4767_33 >= 0))) {
        break forward_join_590;
    }
    spill4767_34 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_591_0 = spill4767_34;
        break forward_join_591;
    }
    forwardValue4767_585_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_34)).B) ? 1 : 0);
    }
    if (!((forwardValue4767_585_0 == 0))) {
        break forward_join_590;
    }
    spill4767_35 = life9_555;
    if (!((life3_5 != null))) {
        forwardValue4767_665_0 = spill4767_35;
        break forward_join_665;
    }
    if (!((spill4767_35 == 0))) {
        break forward_join_663;
    }
    }
    forwardValue4767_591_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_591_0)).c(((boolean)(false)));
    if (!((life3_5 == null))) {
        break forward_join_663;
    }
    }
    forwardValue4767_597_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).u__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = forwardValue4767_597_0;
        break forward_join_638;
    }
    if (!((forwardValue4767_597_0 == 0))) {
        break forward_join_636;
    }
    spill4767_36 = life9_555;
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = spill4767_36;
        break forward_join_638;
    }
    if (!((spill4767_36 != 0))) {
        break forward_join_636;
    }
    spill4767_37 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).ae();
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = ((spill4767_37) ? 1 : 0);
        break forward_join_638;
    }
    if (!(spill4767_37)) {
        break forward_join_636;
    }
    spill4767_38 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).M();
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = ((spill4767_38) ? 1 : 0);
        break forward_join_638;
    }
    if (!((!spill4767_38))) {
        break forward_join_636;
    }
    spill4767_39 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.r)));
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = ((spill4767_39) ? 1 : 0);
        break forward_join_638;
    }
    if (!((!spill4767_39))) {
        break forward_join_636;
    }
    spill4767_40 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(this.cy)).W)).ar)).a__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = ((spill4767_40) ? 1 : 0);
        break forward_join_638;
    }
    if (!(spill4767_40)) {
        break forward_join_636;
    }
    spill4767_41 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).t__Boolean();
    if (!((life3_5 != null))) {
        forwardValue4767_638_0 = ((spill4767_41) ? 1 : 0);
        break forward_join_638;
    }
    if (!((!spill4767_41))) {
        break forward_join_636;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).c(((boolean)(true)));
    }
    forwardValue4767_638_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).u__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_652_0 = forwardValue4767_638_0;
        break forward_join_652;
    }
    if (!((forwardValue4767_638_0 != 0))) {
        break forward_join_651;
    }
    spill4767_42 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_661_0 = spill4767_42;
        break forward_join_661;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill4767_42)).B))) {
        break forward_join_660;
    }
    spill4767_43 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_661_0 = spill4767_43;
        break forward_join_661;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(spill4767_43)).ae())) {
        break forward_join_660;
    }
    }
    forwardValue4767_652_0 = life9_555;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_657_0 = forwardValue4767_652_0;
        break forward_join_657;
    }
    if (!((forwardValue4767_652_0 != 0))) {
        break forward_join_660;
    }
    forwardValue4767_657_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(this)).t__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_665_0 = forwardValue4767_657_0;
        break forward_join_665;
    }
    if (!((forwardValue4767_657_0 != 0))) {
        break forward_join_663;
    }
    }
    forwardValue4767_661_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_661_0)).c(((boolean)(false)));
    }
    forwardValue4767_665_0 = ((this.cP) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_678_0 = forwardValue4767_665_0;
        break forward_join_678;
    }
    if (!((forwardValue4767_665_0 != 0))) {
        break forward_join_675;
    }
    ((net.minecraft.util.MovementInput)(this.co)).b = ((float)(life10_559));
    this.cP = ((boolean)(false));
    }
    forwardValue4767_678_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).c) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_746_0 = forwardValue4767_678_0;
        break forward_join_746;
    }
    if (!((forwardValue4767_678_0 != 0))) {
        break forward_join_743;
    }
    spill4767_44 = ((moom.jI)(((net.minecraft.client.Minecraft)(this.cy)).F)).h();
    if (!((life3_5 != null))) {
        forwardValue4767_703_0 = ((spill4767_44) ? 1 : 0);
        break forward_join_703;
    }
    if (!(spill4767_44)) {
        break forward_join_702;
    }
    spill4767_45 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b;
    if (!((life3_5 != null))) {
        forwardValue4767_746_0 = ((spill4767_45) ? 1 : 0);
        break forward_join_746;
    }
    if (!((!spill4767_45))) {
        break forward_join_743;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b = ((boolean)(true));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).T();
    if (!((life3_5 == null))) {
        break forward_join_743;
    }
    }
    forwardValue4767_703_0 = life5_341;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_746_0 = forwardValue4767_703_0;
        break forward_join_746;
    }
    if (!((forwardValue4767_703_0 == 0))) {
        break forward_join_743;
    }
    spill4767_46 = ((net.minecraft.util.MovementInput)(this.co)).c;
    if (!((life3_5 != null))) {
        forwardValue4767_746_0 = ((spill4767_46) ? 1 : 0);
        break forward_join_746;
    }
    if (!(spill4767_46)) {
        break forward_join_743;
    }
    spill4767_47 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_727_0 = spill4767_47;
        break forward_join_727;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_47)).bI == 0))) {
        break forward_join_726;
    }
    this.bI = ((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4767_254(15290, (1678592126280428563L ^ life1_3))));
    if (!((life3_5 == null))) {
        break forward_join_743;
    }
    }
    forwardValue4767_727_0 = this;
    }
    spill4767_48 = ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_727_0)).b1;
    spill4767_49 = ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b;
    if (!((life3_5 != null))) {
        forwardValue4767_735_0 = spill4767_48;
        forwardValue4767_735_1 = ((spill4767_49) ? 1 : 0);
        break forward_join_735;
    }
    if (!((!spill4767_49))) {
        forwardValue4767_736_0 = spill4767_48;
        break forward_join_736;
    }
    forwardValue4767_735_0 = spill4767_48;
    forwardValue4767_735_1 = 1;
    }
    forwardValue4767_737_0 = forwardValue4767_735_0;
    forwardValue4767_737_1 = forwardValue4767_735_1;
    break forward_join_737;
    }
    forwardValue4767_737_0 = forwardValue4767_736_0;
    forwardValue4767_737_1 = 0;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(forwardValue4767_737_0)).b = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4767_737_1)));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).T();
    this.bI = ((int)(0));
    }
    forwardValue4767_746_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_792_0 = forwardValue4767_746_0;
        break forward_join_792;
    }
    if (!((forwardValue4767_746_0 != 0))) {
        break forward_join_788;
    }
    spill4767_50 = ((net.minecraft.client.entity.EntityPlayerSP)(this)).ad();
    if (!((life3_5 != null))) {
        forwardValue4767_792_0 = ((spill4767_50) ? 1 : 0);
        break forward_join_792;
    }
    if (!(spill4767_50)) {
        break forward_join_788;
    }
    spill4767_51 = ((net.minecraft.util.MovementInput)(this.co)).d;
    if (!((life3_5 != null))) {
        forwardValue4767_774_0 = ((spill4767_51) ? 1 : 0);
        break forward_join_774;
    }
    if (!(spill4767_51)) {
        break forward_join_771;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_271_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_271_0)).u = ((double)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_271_0)).u - ((double) (((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a() * 0x1.8p1f)))));
    }
    forwardValue4767_774_0 = ((((net.minecraft.util.MovementInput)(this.co)).c) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_792_0 = forwardValue4767_774_0;
        break forward_join_792;
    }
    if (!((forwardValue4767_774_0 != 0))) {
        break forward_join_788;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_279_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_279_0)).u = ((double)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_279_0)).u + ((double) (((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).a() * 0x1.8p1f)))));
    }
    spill4767_52 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_900_0 = spill4767_52;
        break forward_join_900;
    }
    forwardValue4767_792_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_52)).ac()) ? 1 : 0);
    }
    if (!((forwardValue4767_792_0 != 0))) {
        break forward_join_899;
    }
    spill4767_53 = this.cI;
    if (!((life3_5 != null))) {
        forwardValue4767_813_0 = spill4767_53;
        break forward_join_813;
    }
    if (!((spill4767_53 < 0))) {
        break forward_join_812;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_287_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_287_0)).cI = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_287_0)).cI + 1)));
    spill4767_54 = this.cI;
    if (!((life3_5 != null))) {
        forwardValue4767_813_0 = spill4767_54;
        break forward_join_813;
    }
    if (!((spill4767_54 == 0))) {
        break forward_join_812;
    }
    this.cJ = ((float)(0x0.0p0f));
    }
    forwardValue4767_813_0 = life5_341;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_834_0 = forwardValue4767_813_0;
        break forward_join_834;
    }
    if (!((forwardValue4767_813_0 != 0))) {
        break forward_join_833;
    }
    spill4767_55 = ((net.minecraft.util.MovementInput)(this.co)).c;
    if (!((life3_5 != null))) {
        forwardValue4767_834_0 = ((spill4767_55) ? 1 : 0);
        break forward_join_834;
    }
    if (!((!spill4767_55))) {
        break forward_join_833;
    }
    this.cI = ((int)(__sourceIntrinsic_c7b45e3c376e_invokedynamic4767_295(27665, (867364783187737530L ^ life1_3))));
    ((net.minecraft.client.entity.EntityPlayerSP)(this)).W__sourceReturn_da8c82d5d4();
    if (!((life3_5 == null))) {
        break forward_join_902;
    }
    }
    forwardValue4767_834_0 = life5_341;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_852_0 = forwardValue4767_834_0;
        break forward_join_852;
    }
    if (!((forwardValue4767_834_0 == 0))) {
        break forward_join_851;
    }
    spill4767_56 = ((net.minecraft.util.MovementInput)(this.co)).c;
    if (!((life3_5 != null))) {
        forwardValue4767_852_0 = ((spill4767_56) ? 1 : 0);
        break forward_join_852;
    }
    if (!(spill4767_56)) {
        break forward_join_851;
    }
    this.cI = ((int)(0));
    this.cJ = ((float)(0x0.0p0f));
    if (!((life3_5 == null))) {
        break forward_join_902;
    }
    }
    forwardValue4767_852_0 = life5_341;
    }
    if (!((life3_5 != null))) {
        forwardValue4767_906_0 = forwardValue4767_852_0;
        break forward_join_906;
    }
    if (!((forwardValue4767_852_0 != 0))) {
        break forward_join_902;
    }
    net.minecraft.client.entity.EntityPlayerSP __stackOp4767_303_0 = this;
    ((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_303_0)).cI = ((int)((((net.minecraft.client.entity.EntityPlayerSP)(__stackOp4767_303_0)).cI + 1)));
    spill4767_57 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_881_0 = spill4767_57;
        break forward_join_881;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill4767_57)).cI < __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_307(10055, (3699094082338451684L ^ life1_3))))) {
        break forward_join_880;
    }
    this.cJ = ((float)((((float) this.cI) * 0x1.99999ap-4f)));
    if (!((life3_5 == null))) {
        break forward_join_902;
    }
    }
    forwardValue4767_881_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_881_0)).cJ = ((float)((0x1.99999ap-1f + ((0x1.0p1f / ((float) (this.cI - __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_311(21653, (6067358664908735293L ^ life1_3))))) * 0x1.99999ap-4f))));
    if (!((life3_5 == null))) {
        break forward_join_902;
    }
    }
    forwardValue4767_900_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_900_0)).cJ = ((float)(0x0.0p0f));
    }
    super.G();
    forwardValue4767_906_0 = ((this.A) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_912_0 = forwardValue4767_906_0;
        break forward_join_912;
    }
    if (!((forwardValue4767_906_0 != 0))) {
        break forward_join_928;
    }
    forwardValue4767_912_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue4767_921_0 = forwardValue4767_912_0;
        break forward_join_921;
    }
    if (!((forwardValue4767_912_0 != 0))) {
        break forward_join_928;
    }
    spill4767_58 = this;
    if (!((life3_5 != null))) {
        forwardValue4767_927_0 = spill4767_58;
        break forward_join_927;
    }
    forwardValue4767_921_0 = ((((moom.jI)(((net.minecraft.client.Minecraft)(((net.minecraft.client.entity.EntityPlayerSP)(spill4767_58)).cy)).F)).h()) ? 1 : 0);
    }
    if (!((forwardValue4767_921_0 == 0))) {
        break forward_join_928;
    }
    ((net.minecraft.entity.player.PlayerCapabilities)(this.b1)).b = ((boolean)(false));
    forwardValue4767_927_0 = this;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue4767_927_0)).T();
    }
    return;
}


private static native <E extends Throwable> long __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_307(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c7b45e3c376e_invokedynamic4767_311(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31f9c3d4f601_invokedynamic4769_67(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_31f9c3d4f601_invokedynamic4769_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_31f9c3d4f601_invokedynamic4769_101(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_89fd98101069_call4779_2(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.entity.Entity a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d0e813f7bbb0_invokedynamic4780_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10169_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral10165_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_736a66cda11e_invokedynamic1478_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b7c3de51b957_invokedynamic4783_16(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
