package moom;


public class zZ implements moom.yK<moom.y2> {

private int a;

private java.util.List<net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot> b;

private static long c;

private static long d;

public zZ() {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
}


public zZ(int p0, java.util.Collection<net.minecraft.entity.ai.attributes.IAttributeInstance> p1) { super(); }


private static void __sourceConstructorBody_7e15429770a990f0(moom.zZ receiver, int p0, java.util.Collection p1) throws Throwable {

init_join_40: {

    long local3_life2 = (moom.zZ.c ^ 13843895183217L);

    moom.zZ.__sourceConstructorInit_7e15429770a990f0_0(((moom.zZ)(receiver)));

    int[] __sourceSpill776_7 = moom.zN.b__ArrayInt();

    ((moom.zZ)(receiver)).b = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    int[] local5_life8 = __sourceSpill776_7;

    ((moom.zZ)(receiver)).a = ((int)(p0));

    java.util.Iterator local6_life11 = ((java.util.Collection)(p1)).iterator();

    init_cycle_17: while (true) {

    if (!(((java.util.Iterator)(local6_life11)).hasNext())) {

        break init_join_40;

    }

    net.minecraft.entity.ai.attributes.IAttributeInstance local7_life15 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Iterator)(local6_life11)).next()));

    ((java.util.List)(((moom.zZ)(receiver)).b)).add(((java.lang.Object)(new net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot(((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(local7_life15)).a__vG())).a__String(), ((net.minecraft.entity.ai.attributes.IAttributeInstance)(local7_life15)).a(), ((net.minecraft.entity.ai.attributes.IAttributeInstance)(local7_life15)).a__Collection()))));

    if (!((local5_life8 != null))) { continue init_cycle_17; }

    break init_cycle_17;

    }

    }

    return;

}



static {
c = ((long)(((moom._a)(moom._c.a(((long)(-3872475943388436168L)), ((long)(8371287333692117761L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(22599575713829L)))));
    long local0_life6 = (moom.zZ.c ^ 137261930644532L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1144_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1144_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1144_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1144_13 = new byte[8];
    (__sourceSpill1144_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1144_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1144_15 = __sourceSpill1144_13;
    ((javax.crypto.Cipher)(__sourceSpill1144_10)).init(((int)(__sourceSpill1144_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1144_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1144_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -382731053080639774L;
    byte[] __sourceSpill1144_19 = new byte[8];
    (__sourceSpill1144_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1144_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1144_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1144_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1144_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1144_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1144_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1144_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1144_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1144_20)).doFinal(((byte[])(__sourceSpill1144_19)));
    d = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_7e15429770a990f0_0(moom.zZ a0) throws E;

public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1448_0;
    long life2_3;
    java.util.Iterator life5_18;
    int[] life4_19;
    net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot life6_26;
    java.util.Iterator life7_45;
    moom.vB life8_52;
    lexical_join_73: {
    life2_3 = (moom.zZ.c ^ 130154977278594L);
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    spill1448_0 = moom.zN.b__ArrayInt();
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(((java.util.List)(this.b)).size())));
    life5_18 = ((java.util.List)(this.b)).iterator();
    life4_19 = spill1448_0;
    lexical_cycle_20: while (true) {
    lexical_join_71: {
    if (!(((java.util.Iterator)(life5_18)).hasNext())) {
        break lexical_join_73;
    }
    life6_26 = ((net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot)(((java.util.Iterator)(life5_18)).next()));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(((net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot)(life6_26)).a__String())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(((net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot)(life6_26)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((java.util.Collection)(((net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot)(life6_26)).a__Collection())).size())));
    life7_45 = ((java.util.Collection)(((net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot)(life6_26)).a__Collection())).iterator();
    lexical_cycle_46: while (true) {
    if (!(((java.util.Iterator)(life7_45)).hasNext())) {
        break lexical_join_71;
    }
    life8_52 = ((moom.vB)(((java.util.Iterator)(life7_45)).next()));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(((moom.vB)(life8_52)).a__UUID())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeDouble(((double)(((moom.vB)(life8_52)).a())));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(((moom.vB)(life8_52)).a__Int())));
    if (!((life4_19 == null))) { continue lexical_cycle_20; }
    if (!((life4_19 != null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    if (!((life4_19 != null))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public java.util.List<net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot> a__List() {
return this.b;
}


public int a() {
return this.a;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zZ)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
int[] spill1447_0;
    long life2_3;
    int life5_11;
    int life6_13;
    int[] life4_14;
    java.lang.String life7_22;
    double life8_25;
    java.util.ArrayList life10_27;
    int life11_30;
    int life12_32;
    java.util.UUID life13_38;
    lexical_join_69: {
    life2_3 = (moom.zZ.c ^ 781205825803L);
    this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    spill1447_0 = moom.zN.b__ArrayInt();
    life5_11 = ((net.minecraft.network.PacketBuffer)(p0)).readInt();
    life6_13 = 0;
    life4_14 = spill1447_0;
    lexical_cycle_15: while (true) {
    lexical_join_67: {
    lexical_join_56: {
    if (!((life6_13 < life5_11))) {
        break lexical_join_69;
    }
    life7_22 = ((net.minecraft.network.PacketBuffer)(p0)).a__String(((int)(((int) moom.zZ.d))));
    life8_25 = ((net.minecraft.network.PacketBuffer)(p0)).readDouble();
    life10_27 = com.google.common.collect.Lists.newArrayList();
    life11_30 = ((net.minecraft.network.PacketBuffer)(p0)).a();
    life12_32 = 0;
    lexical_cycle_33: while (true) {
    if (!((life12_32 < life11_30))) {
        break lexical_join_56;
    }
    life13_38 = ((net.minecraft.network.PacketBuffer)(p0)).a__UUID();
    ((java.util.List)(life10_27)).add(((java.lang.Object)(new moom.vB(life13_38, "Unknown synced attribute modifier", ((net.minecraft.network.PacketBuffer)(p0)).readDouble(), ((net.minecraft.network.PacketBuffer)(p0)).readByte()))));
    life12_32 += 1;
    if (!((life4_14 == null))) {
        break lexical_join_67;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(new net.minecraft.network.play.server.S20PacketEntityProperties$Snapshot(life7_22, life8_25, life10_27))));
    life6_13 += 1;
    }
    if (!((life4_14 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}

}
