package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Bi extends net.minecraft.scoreboard.Scoreboard {

private final moom.Bl h;

private final java.util.Set<net.minecraft.scoreboard.ScoreObjective> i;

private net.minecraft.scoreboard.ScoreboardSaveData j;

private static final long l;

private static final long[] p;

private static final java.lang.Integer[] q;

private static final java.util.Map r;

public Bi(moom.Bl p0) {
super();
    this.i = com.google.common.collect.Sets.newHashSet();
    this.h = p0;
}


static {
l = ((long)(((moom._a)(moom._c.a(((long)(-195624357777824730L)), ((long)(3331617831308834868L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174424914646177L)))));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Bi.l ^ 11834296485165L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill490_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill490_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill490_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill490_14 = new byte[8];
    (__sourceSpill490_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill490_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation490_16 = __sourceSpill490_14;
    ((javax.crypto.Cipher)(__sourceSpill490_11)).init(((int)(__sourceSpill490_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill490_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation490_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "CLK´ÎLìYð\000\002 ££"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill490_25 = local6_life21;
        int __sourceSpill490_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill490_25)).substring(((int)(__sourceSpill490_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill490_30 = local8_life19;
        int __sourceSpill490_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill490_33 = new byte[8];
        (__sourceSpill490_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill490_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill490_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill490_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill490_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill490_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill490_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill490_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill490_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill490_34)).doFinal(((byte[])(__sourceSpill490_33)));
        (__sourceSpill490_30)[__sourceSpill490_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    p = ((long[])(local8_life19));
    q = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3906_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Bi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b(moom.Bk p0) {
super.b(((moom.Bk)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Ax(p0, 0))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void b__Void(net.minecraft.scoreboard.ScoreObjective p0) {
super.b__Void(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public java.util.List<moom.yK> b(net.minecraft.scoreboard.ScoreObjective p0) {
java.lang.String[] spill505_0;
    long life2_3;
    java.util.ArrayList life5_6;
    java.lang.String[] life4_15;
    int life6_17;
    lexical_join_41: {
    life2_3 = (moom.Bi.l ^ 52957790918600L);
    spill505_0 = moom.Bj.b__ArrayString();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(life5_6)).add(((java.lang.Object)(new moom.Au(p0, 1))));
    life4_15 = spill505_0;
    life6_17 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_38: {
    if (!((life6_17 < __sourceIntrinsic_fd3a77fa6b46_invokedynamic505_4(1103, (6280784674149451017L ^ life2_3))))) {
        break lexical_join_41;
    }
    if (!((((moom.Bi)(this)).a__Bg(((int)(life6_17))) == p0))) {
        break lexical_join_38;
    }
    ((java.util.List)(life5_6)).add(((java.lang.Object)(new moom.Aw(life6_17, p0))));
    }
    life6_17 += 1;
    if (!((life4_15 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    return life5_6;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x3685;
        if (q[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = p[n4];
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
                throw new RuntimeException("moom/Bi", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Bi.q[n4] = n6;
        }
        return q[n4];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_1a3eaad076d473(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(java.lang.String p0, net.minecraft.scoreboard.ScoreObjective p1) {
super.b(((java.lang.String)(p0)), ((net.minecraft.scoreboard.ScoreObjective)(p1)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Av(p0, p1))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void e(net.minecraft.scoreboard.ScoreObjective p0) {
java.lang.String[] spill506_0;
    long life2_3;
    java.util.List life5_7;
    java.util.Iterator life6_14;
    java.lang.String[] life4_15;
    net.minecraft.entity.player.EntityPlayerMP life7_22;
    java.util.Iterator life8_27;
    moom.yK life9_34;
    lexical_join_50: {
    lexical_join_45: {
    life2_3 = (moom.Bi.l ^ 71982098960158L);
    life5_7 = ((moom.Bi)(this)).a__List(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    spill506_0 = moom.Bj.b__ArrayString();
    life6_14 = ((java.util.List)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a__List())).iterator();
    life4_15 = spill506_0;
    lexical_cycle_16: while (true) {
    lexical_join_43: {
    if (!(((java.util.Iterator)(life6_14)).hasNext())) {
        break lexical_join_45;
    }
    life7_22 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_14)).next()));
    if (!((life4_15 != null))) {
        break lexical_join_50;
    }
    life8_27 = ((java.util.List)(life5_7)).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life8_27)).hasNext())) {
        break lexical_join_43;
    }
    life9_34 = ((moom.yK)(((java.util.Iterator)(life8_27)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life7_22)).cg)).a(((moom.yK)(life9_34)));
    if (!((life4_15 != null))) { continue lexical_cycle_16; }
    if (!((life4_15 == null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    if (!((life4_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((java.util.Set)(this.i)).add(((java.lang.Object)(p0)));
    }
    return;
}


public void c(moom.Bk p0) {
super.c(((moom.Bk)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Ax(p0, 2))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void c(net.minecraft.scoreboard.ScoreObjective p0) {
moom.Bi forwardValue1516_26_0;
    java.lang.String[] spill1516_0;
    moom.Bi spill1516_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (moom.Bi.l ^ 53522280479432L);
    spill1516_0 = moom.Bj.b__ArrayString();
    super.c(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    life4_8 = spill1516_0;
    spill1516_1 = this;
    if (!((life4_8 != null))) {
        forwardValue1516_26_0 = spill1516_1;
        break forward_join_26;
    }
    if (!(((java.util.Set)(((moom.Bi)(spill1516_1)).i)).contains(((java.lang.Object)(p0))))) {
        break forward_join_25;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Au(p0, 2))));
    }
    forwardValue1516_26_0 = this;
    }
    ((moom.Bi)(forwardValue1516_26_0)).a__sourceReturn_da8c82d5d4();
    return;
}


public void f(net.minecraft.scoreboard.ScoreObjective p0) {
java.lang.String[] spill507_0;
    long life2_3;
    java.util.List life5_7;
    java.util.Iterator life6_14;
    java.lang.String[] life4_15;
    net.minecraft.entity.player.EntityPlayerMP life7_22;
    java.util.Iterator life8_27;
    moom.yK life9_34;
    lexical_join_50: {
    lexical_join_45: {
    life2_3 = (moom.Bi.l ^ 75862979997434L);
    life5_7 = ((moom.Bi)(this)).b(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    spill507_0 = moom.Bj.b__ArrayString();
    life6_14 = ((java.util.List)(((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a__List())).iterator();
    life4_15 = spill507_0;
    lexical_cycle_16: while (true) {
    lexical_join_43: {
    if (!(((java.util.Iterator)(life6_14)).hasNext())) {
        break lexical_join_45;
    }
    life7_22 = ((net.minecraft.entity.player.EntityPlayerMP)(((java.util.Iterator)(life6_14)).next()));
    if (!((life4_15 != null))) {
        break lexical_join_50;
    }
    life8_27 = ((java.util.List)(life5_7)).iterator();
    lexical_cycle_28: while (true) {
    if (!(((java.util.Iterator)(life8_27)).hasNext())) {
        break lexical_join_43;
    }
    life9_34 = ((moom.yK)(((java.util.Iterator)(life8_27)).next()));
    ((net.minecraft.network.NetHandlerPlayServer)(((net.minecraft.entity.player.EntityPlayerMP)(life7_22)).cg)).a(((moom.yK)(life9_34)));
    if (!((life4_15 != null))) { continue lexical_cycle_16; }
    if (!((life4_15 == null))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    if (!((life4_15 == null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    ((java.util.Set)(this.i)).remove(((java.lang.Object)(p0)));
    }
    return;
}


public void d(net.minecraft.scoreboard.ScoreObjective p0) {
moom.Bi forwardValue1517_20_0;
    java.lang.String[] spill1517_0;
    moom.Bi spill1517_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.Bi.l ^ 91896019858152L);
    spill1517_0 = moom.Bj.b__ArrayString();
    super.d(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    life4_8 = spill1517_0;
    spill1517_1 = this;
    if (!((life4_8 != null))) {
        forwardValue1517_20_0 = spill1517_1;
        break forward_join_20;
    }
    if (!(((java.util.Set)(((moom.Bi)(spill1517_1)).i)).contains(((java.lang.Object)(p0))))) {
        break forward_join_19;
    }
    ((moom.Bi)(this)).f(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    }
    forwardValue1517_20_0 = this;
    }
    ((moom.Bi)(forwardValue1517_20_0)).a__sourceReturn_da8c82d5d4();
    return;
}


public void d(moom.Bk p0) {
super.d(((moom.Bk)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Ax(p0, 1))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void a(net.minecraft.scoreboard.ScoreboardSaveData p0) {
this.j = ((net.minecraft.scoreboard.ScoreboardSaveData)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void(java.lang.String p0) {
super.a__Void(((java.lang.String)(p0)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Av(p0))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void a(net.minecraft.scoreboard.Score p0) {
moom.Bi forwardValue1512_26_0;
    java.lang.String[] spill1512_0;
    moom.Bi spill1512_1;
    long life2_3;
    java.lang.String[] life4_8;
    forward_join_26: {
    forward_join_25: {
    life2_3 = (moom.Bi.l ^ 76751033384949L);
    spill1512_0 = moom.Bj.b__ArrayString();
    super.a(((net.minecraft.scoreboard.Score)(p0)));
    life4_8 = spill1512_0;
    spill1512_1 = this;
    if (!((life4_8 != null))) {
        forwardValue1512_26_0 = spill1512_1;
        break forward_join_26;
    }
    if (!(((java.util.Set)(((moom.Bi)(spill1512_1)).i)).contains(((java.lang.Object)(((net.minecraft.scoreboard.Score)(p0)).a__Bg()))))) {
        break forward_join_25;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Av(p0))));
    }
    forwardValue1512_26_0 = this;
    }
    ((moom.Bi)(forwardValue1512_26_0)).a__sourceReturn_da8c82d5d4();
    return;
}


public boolean a(java.lang.String p0, java.lang.String p1) {
int forwardValue1511_33_0;
    boolean spill1511_0;
    long life3_3;
    java.lang.String[] life5_5;
    moom.Bk life6_19;
    forward_join_33: {
    forward_join_32: {
    life3_3 = (moom.Bi.l ^ 75444055898020L);
    life5_5 = moom.Bj.b__ArrayString();
    spill1511_0 = super.a(((java.lang.String)(p0)), ((java.lang.String)(p1)));
    if (!((life5_5 != null))) {
        forwardValue1511_33_0 = ((spill1511_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill1511_0)) {
        break forward_join_32;
    }
    life6_19 = ((moom.Bi)(this)).a__Bk(((java.lang.String)(p1)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Ax(life6_19, java.util.List.of(((p0))), 3))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return ((1) != 0);
    }
    forwardValue1511_33_0 = 0;
    }
    return ((forwardValue1511_33_0) != 0);
}


public java.util.List<moom.yK> a__List(net.minecraft.scoreboard.ScoreObjective p0) {
moom.Bi lexicalValue504_44_0;
    java.util.ArrayList lexicalValue504_67_0;
    java.lang.String[] spill504_0;
    moom.Bi spill504_1;
    java.util.ArrayList spill504_2;
    long life2_3;
    java.util.ArrayList life5_6;
    java.lang.String[] life4_15;
    int life6_17;
    java.util.Iterator life6_53;
    net.minecraft.scoreboard.Score life7_60;
    lexical_join_67: {
    lexical_join_66: {
    lexical_join_44: {
    lexical_join_43: {
    life2_3 = (moom.Bi.l ^ 122724360607116L);
    spill504_0 = moom.Bj.b__ArrayString();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    ((java.util.List)(life5_6)).add(((java.lang.Object)(new moom.Au(p0, 0))));
    life4_15 = spill504_0;
    life6_17 = 0;
    lexical_cycle_18: while (true) {
    lexical_join_40: {
    if (!((life6_17 < __sourceIntrinsic_2ba4b536271c_invokedynamic504_4(8225, (3790671634813575970L ^ life2_3))))) {
        break lexical_join_43;
    }
    spill504_1 = this;
    if (!((life4_15 != null))) {
        lexicalValue504_44_0 = spill504_1;
        break lexical_join_44;
    }
    if (!((((moom.Bi)(spill504_1)).a__Bg(((int)(life6_17))) == p0))) {
        break lexical_join_40;
    }
    ((java.util.List)(life5_6)).add(((java.lang.Object)(new moom.Aw(life6_17, p0))));
    }
    life6_17 += 1;
    if (!((life4_15 == null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue504_44_0 = this;
    }
    life6_53 = ((java.util.Collection)(((moom.Bi)(lexicalValue504_44_0)).a(((net.minecraft.scoreboard.ScoreObjective)(p0))))).iterator();
    lexical_cycle_48: while (true) {
    if (!(((java.util.Iterator)(life6_53)).hasNext())) {
        break lexical_join_66;
    }
    life7_60 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life6_53)).next()));
    spill504_2 = life5_6;
    if (!((life4_15 != null))) {
        lexicalValue504_67_0 = spill504_2;
        break lexical_join_67;
    }
    ((java.util.List)(spill504_2)).add(((java.lang.Object)(new moom.Av(life7_60))));
    if (!((life4_15 == null))) { continue lexical_cycle_48; }
    break lexical_cycle_48;
    }
    }
    lexicalValue504_67_0 = life5_6;
    }
    return lexicalValue504_67_0;
}


public void a(java.lang.String p0, moom.Bk p1) {
super.a(((java.lang.String)(p0)), ((moom.Bk)(p1)));
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Ax(p1, java.util.Collections.singletonList(((p0))), 4))));
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


public void a(int p0, net.minecraft.scoreboard.ScoreObjective p1) {
moom.Bi forwardValue1510_42_0;
    net.minecraft.scoreboard.ScoreObjective forwardValue1510_42_1;
    net.minecraft.scoreboard.ScoreObjective forwardValue1510_44_0;
    moom.Bi forwardValue1510_64_0;
    java.lang.String[] spill1510_0;
    net.minecraft.scoreboard.ScoreObjective spill1510_1;
    net.minecraft.scoreboard.ScoreObjective spill1510_2;
    moom.Bi spill1510_3;
    net.minecraft.scoreboard.ScoreObjective spill1510_4;
    moom.Bi spill1510_5;
    long life3_3;
    net.minecraft.scoreboard.ScoreObjective life6_8;
    java.lang.String[] life5_13;
    forward_join_66: {
    forward_join_64: {
    forward_join_63: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_40: {
    life3_3 = (moom.Bi.l ^ 109915044426272L);
    spill1510_0 = moom.Bj.b__ArrayString();
    life6_8 = ((moom.Bi)(this)).a__Bg(((int)(p0)));
    super.a(((int)(p0)), ((net.minecraft.scoreboard.ScoreObjective)(p1)));
    life5_13 = spill1510_0;
    spill1510_1 = life6_8;
    if (!((life5_13 != null))) {
        forwardValue1510_44_0 = spill1510_1;
        break forward_join_44;
    }
    if (!((spill1510_1 != p1))) {
        break forward_join_43;
    }
    spill1510_2 = life6_8;
    if (!((life5_13 != null))) {
        forwardValue1510_44_0 = spill1510_2;
        break forward_join_44;
    }
    if (!((spill1510_2 != null))) {
        break forward_join_43;
    }
    spill1510_3 = this;
    spill1510_4 = life6_8;
    if (!((life5_13 != null))) {
        forwardValue1510_42_0 = spill1510_3;
        forwardValue1510_42_1 = spill1510_4;
        break forward_join_42;
    }
    if (!((((moom.Bi)(spill1510_3)).a__sourceReturn_c467f0924a(((net.minecraft.scoreboard.ScoreObjective)(spill1510_4))) > 0))) {
        break forward_join_40;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Aw(p0, p1))));
    if (!((life5_13 == null))) {
        break forward_join_43;
    }
    }
    forwardValue1510_42_0 = this;
    forwardValue1510_42_1 = life6_8;
    }
    ((moom.Bi)(forwardValue1510_42_0)).f(((net.minecraft.scoreboard.ScoreObjective)(forwardValue1510_42_1)));
    }
    forwardValue1510_44_0 = p1;
    }
    if (!((forwardValue1510_44_0 != null))) {
        break forward_join_66;
    }
    spill1510_5 = this;
    if (!((life5_13 != null))) {
        forwardValue1510_64_0 = spill1510_5;
        break forward_join_64;
    }
    if (!(((java.util.Set)(((moom.Bi)(spill1510_5)).i)).contains(((java.lang.Object)(p1))))) {
        break forward_join_63;
    }
    ((net.minecraft.server.management.ServerConfigurationManager)(((moom.Bl)(this.h)).a__BA())).a(((moom.yK)(new moom.Aw(p0, p1))));
    if (!((life5_13 == null))) {
        break forward_join_66;
    }
    }
    forwardValue1510_64_0 = this;
    }
    ((moom.Bi)(forwardValue1510_64_0)).e(((net.minecraft.scoreboard.ScoreObjective)(p1)));
    }
    ((moom.Bi)(this)).a__sourceReturn_da8c82d5d4();
    return;
}


protected void a__sourceReturn_da8c82d5d4() {
net.minecraft.scoreboard.ScoreboardSaveData forwardValue1509_13_0;
    net.minecraft.scoreboard.ScoreboardSaveData spill1509_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (moom.Bi.l ^ 12465162751404L);
    life3_5 = moom.Bj.b__ArrayString();
    spill1509_0 = this.j;
    if (!((life3_5 != null))) {
        forwardValue1509_13_0 = spill1509_0;
        break forward_join_13;
    }
    if (!((spill1509_0 != null))) {
        break forward_join_14;
    }
    forwardValue1509_13_0 = this.j;
    }
    ((net.minecraft.scoreboard.ScoreboardSaveData)(forwardValue1509_13_0)).a();
    }
    return;
}


public int a__sourceReturn_c467f0924a(net.minecraft.scoreboard.ScoreObjective p0) {
java.lang.String[] spill503_0;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    int life6_9;
    lexical_join_26: {
    life2_3 = (moom.Bi.l ^ 74309880688796L);
    spill503_0 = moom.Bj.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill503_0;
    life6_9 = 0;
    lexical_cycle_10: while (true) {
    lexical_join_23: {
    if (!((life6_9 < __sourceIntrinsic_6dc28805c7bc_invokedynamic503_2(1103, (6280735727156142685L ^ life2_3))))) {
        break lexical_join_26;
    }
    if (!((((moom.Bi)(this)).a__Bg(((int)(life6_9))) == p0))) {
        break lexical_join_23;
    }
    life5_6 += 1;
    }
    life6_9 += 1;
    if (!((life4_7 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return life5_6;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3906_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd3a77fa6b46_invokedynamic505_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2ba4b536271c_invokedynamic504_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6dc28805c7bc_invokedynamic503_2(int a0, long a1) throws E;

private static native int __sourceExactCall_1a3eaad076d473(int p0, long p1);
}
