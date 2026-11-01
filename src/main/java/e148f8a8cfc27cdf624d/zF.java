package moom;


public class zF implements moom.yK<moom.y2> {

private int a;

private java.util.UUID b;

private int c;

private int d;

private int e;

private byte f;

private byte g;

private int h;

private net.minecraft.entity.DataWatcher i;

private java.util.List<moom.r2> j;

private static long k;

public zF() {
super();
}


public zF(net.minecraft.entity.player.EntityPlayer p0) { super(); }

private static void __sourceConstructorBody_10b54c54383a071d(moom.zF receiver, net.minecraft.entity.player.EntityPlayer p0) throws Throwable {
moom.zF __initValue769_70_0;
    net.minecraft.item.ItemStack __initValue769_70_1;
    moom.zF __initValue769_69_0;
    moom.zF __initValue769_72_0;
    int __initValue769_72_1;
    long local2_life2;
    net.minecraft.item.ItemStack local5_life33;
    int[] local4_life34;
    init_join_82: {
    init_join_72: {
    init_join_70: {
    init_join_69: {
    local2_life2 = (moom.zF.k ^ 12471229997667L);
    int[] __sourceSpill769_4 = moom.zN.b__ArrayInt();
    moom.zF.__sourceConstructorInit_10b54c54383a071d_0(((moom.zF)(receiver)));
    ((moom.zF)(receiver)).a = ((int)(((net.minecraft.entity.player.EntityPlayer)(p0)).e__Int()));
    ((moom.zF)(receiver)).b = ((java.util.UUID)(__sourceExactCall_bdd66b432fa9f8(((com.mojang.authlib.GameProfile)(__sourceExactCall_9304c6762ffbd9(((net.minecraft.entity.player.EntityPlayer)(p0))))))));
    ((moom.zF)(receiver)).c = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.player.EntityPlayer)(p0)).n * 0x1.0000000000000p+5D))))));
    ((moom.zF)(receiver)).d = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.player.EntityPlayer)(p0)).o * 0x1.0000000000000p+5D))))));
    ((moom.zF)(receiver)).e = ((int)(moom.Dr.b__Int(((double)((((net.minecraft.entity.player.EntityPlayer)(p0)).p * 0x1.0000000000000p+5D))))));
    ((moom.zF)(receiver)).f = ((byte)(((byte) ((int) ((((net.minecraft.entity.player.EntityPlayer)(p0)).w * 0x1.0000000000000p+8F) / 0x1.6800000000000p+8F)))));
    ((moom.zF)(receiver)).g = ((byte)(((byte) ((int) ((((net.minecraft.entity.player.EntityPlayer)(p0)).x * 0x1.0000000000000p+8F) / 0x1.6800000000000p+8F)))));
    local5_life33 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    local4_life34 = __sourceSpill769_4;
    moom.zF __sourceSpill769_35 = receiver;
    net.minecraft.item.ItemStack __sourceSpill769_36 = local5_life33;
    if (!((local4_life34 == null))) {
        __initValue769_70_0 = __sourceSpill769_35;
        __initValue769_70_1 = __sourceSpill769_36;
        break init_join_70;
    }
    if (!((__sourceSpill769_36 == null))) {
        __initValue769_69_0 = __sourceSpill769_35;
        break init_join_69;
    }
    __initValue769_72_0 = __sourceSpill769_35;
    __initValue769_72_1 = 0;
    break init_join_72;
    }
    __initValue769_70_0 = __initValue769_69_0;
    __initValue769_70_1 = local5_life33;
    }
    __initValue769_72_0 = __initValue769_70_0;
    __initValue769_72_1 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(__initValue769_70_1)).a__wQ())));
    }
    ((moom.zF)(__initValue769_72_0)).h = ((int)(__initValue769_72_1));
    ((moom.zF)(receiver)).i = ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.player.EntityPlayer)(p0)).a__r1()));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break init_join_82;
    }
    moom.zN.b(((int[])(new int[1])));
    }
    return;
}


static {
moom.zF.k = (moom._c.a(8821262996449002209L, 2392783427671912325L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(9162413178578L);
}

private static native <E extends Throwable> void __sourceConstructorInit_10b54c54383a071d_0(moom.zF a0) throws E;

public byte b() {
return this.g;
}


public int b__Int() {
return this.c;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.util.UUID)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.d)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeInt(((int)(this.e)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.f)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeByte(((int)(this.g)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.h)));
    ((net.minecraft.entity.DataWatcher)(this.i)).a__Void(((net.minecraft.network.PacketBuffer)(p0)));
    return;
}


public int e() {
return this.h;
}


public int c() {
return this.d;
}


public int d() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.a = ((int)(((net.minecraft.network.PacketBuffer)(p0)).a()));
    this.b = ((java.util.UUID)(((net.minecraft.network.PacketBuffer)(p0)).a__UUID()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.d = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.e = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readInt()));
    this.f = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.g = ((byte)(((net.minecraft.network.PacketBuffer)(p0)).readByte()));
    this.h = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readShort()));
    this.j = ((java.util.List)(__sourceExactCall_1ceb32c003a330(((net.minecraft.network.PacketBuffer)(p0)))));
    return;
}


public java.util.List<moom.r2> a__List() {
java.util.List forwardValue4593_18_0;
    java.util.List spill4593_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (moom.zF.k ^ 63842692453451L);
    life3_5 = moom.zN.b__ArrayInt();
    spill4593_0 = this.j;
    if (!((life3_5 == null))) {
        forwardValue4593_18_0 = spill4593_0;
        break forward_join_18;
    }
    if (!((spill4593_0 == null))) {
        break forward_join_16;
    }
    this.j = ((java.util.List)(((net.minecraft.entity.DataWatcher)(this.i)).b()));
    }
    forwardValue4593_18_0 = this.j;
    }
    return forwardValue4593_18_0;
}


public int a__Int() {
return this.a;
}


public java.util.UUID a__UUID() {
return this.b;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zF)(this)));
    return;
}


public byte a() {
return this.f;
}


private static native java.util.List __sourceExactCall_1ceb32c003a330(net.minecraft.network.PacketBuffer p0) throws java.io.IOException;

private static native java.util.UUID __sourceExactCall_bdd66b432fa9f8(com.mojang.authlib.GameProfile p0);
private static native com.mojang.authlib.GameProfile __sourceExactCall_9304c6762ffbd9(net.minecraft.entity.player.EntityPlayer p0);
}
