package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Cm extends moom.Ci implements net.minecraft.inventory.IInventory {

private static java.util.Random n;

private net.minecraft.item.ItemStack[] o;

protected java.lang.String p;

private static long q;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

public Cm() { super(); }


private static void __sourceConstructorBody_d7a7857856aabe10(moom.Cm receiver) throws Throwable {

long local1 = (moom.Cm.q ^ 51381646561107L);

    moom.Cm.__sourceConstructorInit_d7a7857856aabe10_0(((moom.Cm)(receiver)));

    ((moom.Cm)(receiver)).o = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[__sourceIntrinsic_d7a7857856aabe10_originalDynamicSite1888_2(9309, (3893410344285856501L ^ local1))]));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d7a7857856aabe10_0(moom.Cm a0) throws E;

static {
q = ((long)(((moom._a)(moom._c.a(((long)(-1656793173636048675L)), ((long)(6022482469927283784L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(268133319785359L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Cm.q ^ 38196851201553L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill681_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill681_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill681_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill681_14 = new byte[8];
    (__sourceSpill681_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill681_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation681_16 = __sourceSpill681_14;
    ((javax.crypto.Cipher)(__sourceSpill681_11)).init(((int)(__sourceSpill681_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill681_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation681_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\024&~'¹'v§®\030Êa\001ÍE;\032ç¹Ï\023µ¤`LU\030'{"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill681_25 = local6_life21;
        int __sourceSpill681_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill681_25)).substring(((int)(__sourceSpill681_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill681_30 = local8_life19;
        int __sourceSpill681_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill681_33 = new byte[8];
        (__sourceSpill681_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill681_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill681_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill681_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill681_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill681_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill681_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill681_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill681_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill681_34)).doFinal(((byte[])(__sourceSpill681_33)));
        (__sourceSpill681_30)[__sourceSpill681_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "?^lÎvçN[\030\022¿&ò"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill681_38 = local6_life21;
        int __sourceSpill681_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill681_38)).substring(((int)(__sourceSpill681_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill681_43 = local8_life19;
        int __sourceSpill681_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill681_46 = new byte[8];
        (__sourceSpill681_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill681_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill681_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill681_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill681_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill681_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill681_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill681_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill681_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill681_47)).doFinal(((byte[])(__sourceSpill681_46)));
        (__sourceSpill681_43)[__sourceSpill681_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    s = ((long[])(local8_life19));
    t = ((java.lang.Integer[])(new java.lang.Integer[6]));
    n = ((java.util.Random)(new java.util.Random()));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b__Void() {
java.util.Arrays.fill(((java.lang.Object[])(this.o)), ((java.lang.Object)(null)));
    return;
}


public net.minecraft.item.ItemStack b__xW(int p0) {
net.minecraft.item.ItemStack forwardValue1644_17_0;
    net.minecraft.item.ItemStack spill1644_0;
    long life2_3;
    java.lang.String[] life4_5;
    net.minecraft.item.ItemStack life5_23;
    forward_join_25: {
    forward_join_17: {
    life2_3 = (moom.Cm.q ^ 34369979580992L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1644_0 = (this.o)[p0];
    if (!((life4_5 != null))) {
        forwardValue1644_17_0 = spill1644_0;
        break forward_join_17;
    }
    if (!((spill1644_0 != null))) {
        break forward_join_25;
    }
    forwardValue1644_17_0 = (this.o)[p0];
    }
    life5_23 = forwardValue1644_17_0;
    (this.o)[p0] = null;
    return life5_23;
    }
    return null;
}


public void b(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
moom.Cm lexicalValue536_56_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue536_60_0;
    java.lang.String lexicalValue536_60_1;
    java.lang.String[] spill536_0;
    moom.Cm spill536_1;
    net.minecraft.nbt.NBTTagCompound spill536_2;
    java.lang.String spill536_3;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_10;
    int life6_13;
    java.lang.String[] life4_14;
    net.minecraft.nbt.NBTTagCompound life7_33;
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_56: {
    lexical_join_49: {
    life2_3 = (moom.Cm.q ^ 99048116305910L);
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_10 = new net.minecraft.nbt.NBTTagList();
    spill536_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life6_13 = 0;
    life4_14 = spill536_0;
    lexical_cycle_15: while (true) {
    lexical_join_46: {
    if (!((life6_13 < (this.o).length))) {
        break lexical_join_49;
    }
    spill536_1 = this;
    if (!((life4_14 != null))) {
        lexicalValue536_56_0 = spill536_1;
        break lexical_join_56;
    }
    if (!(((((moom.Cm)(spill536_1)).o)[life6_13] != null))) {
        break lexical_join_46;
    }
    life7_33 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life7_33)).a(((java.lang.String)("Slot")), ((byte)(((byte) life6_13))));
    ((net.minecraft.item.ItemStack)((this.o)[life6_13])).a__yw(((net.minecraft.nbt.NBTTagCompound)(life7_33)));
    ((net.minecraft.nbt.NBTTagList)(life5_10)).a(((net.minecraft.nbt.NBTBase)(life7_33)));
    }
    life6_13 += 1;
    if (!((life4_14 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    spill536_2 = p0;
    spill536_3 = "Items";
    if (!((life4_14 != null))) {
        lexicalValue536_60_0 = spill536_2;
        lexicalValue536_60_1 = spill536_3;
        break lexical_join_60;
    }
    ((net.minecraft.nbt.NBTTagCompound)(spill536_2)).a(((java.lang.String)(spill536_3)), ((net.minecraft.nbt.NBTBase)(life5_10)));
    lexicalValue536_56_0 = this;
    }
    if (!(((moom.Cm)(lexicalValue536_56_0)).e__Boolean())) {
        break lexical_join_63;
    }
    lexicalValue536_60_0 = p0;
    lexicalValue536_60_1 = "CustomName";
    }
    ((net.minecraft.nbt.NBTTagCompound)(lexicalValue536_60_0)).a(((java.lang.String)(lexicalValue536_60_1)), ((java.lang.String)(this.p)));
    }
    return;
}


public int b__Int() {
long local1 = (moom.Cm.q ^ 13003664186524L);
    return __sourceIntrinsic_a63cd0a8780c_originalDynamicSite1094_1(10238, (1484507572617654943L ^ local1));
}


public boolean e__Boolean() {
long local1 = (moom.Cm.q ^ 86430979152123L);
    return ((((this.p != null) ? 1 : 0)) != 0);
}


public int c__Int() {
long local1 = (moom.Cm.q ^ 99364155013992L);
    return __sourceIntrinsic_240e736e888e_originalDynamicSite1095_1(23262, (4042891974394619980L ^ local1));
}


public void c__sourceReturn_aecb585720(net.minecraft.entity.player.EntityPlayer p0) {
return;
}


public java.lang.String c__String() {
return "minecraft:dispenser";
}


public int h() {
int lexicalValue537_30_0;
    java.lang.String[] spill537_0;
    int spill537_1;
    long life1_3;
    int life4_5;
    int life5_8;
    java.lang.String[] life3_9;
    int life6_11;
    lexical_join_34: {
    life1_3 = (moom.Cm.q ^ 122428337918374L);
    life4_5 = -1;
    spill537_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_8 = 1;
    life3_9 = spill537_0;
    life6_11 = 0;
    lexical_cycle_12: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    if (!((life6_11 < (this.o).length))) {
        break lexical_join_34;
    }
    if (!(((this.o)[life6_11] != null))) {
        break lexical_join_31;
    }
    spill537_1 = ((java.util.Random)(moom.Cm.n)).nextInt(((int)((life5_8++))));
    if (!((life3_9 != null))) {
        lexicalValue537_30_0 = spill537_1;
        break lexical_join_30;
    }
    if (!((spill537_1 == 0))) {
        break lexical_join_31;
    }
    lexicalValue537_30_0 = life6_11;
    }
    life4_5 = lexicalValue537_30_0;
    }
    life6_11 += 1;
    if (!((life3_9 == null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return life4_5;
}


public int d__Int() {
return 0;
}


public int a__sourceReturn_0f7a48eca2(int p0) {
return 0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.wd(p0, this);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22369;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Cm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Cm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void(int p0, int p1) {
return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4105_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Cm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
moom.Cm forwardValue1640_12_0;
    java.lang.String forwardValue1640_15_0;
    moom.Cm spill1640_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.Cm.q ^ 5404997244901L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1640_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1640_12_0 = spill1640_0;
        break forward_join_12;
    }
    if (!(((moom.Cm)(spill1640_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue1640_12_0 = this;
    }
    forwardValue1640_15_0 = ((moom.Cm)(forwardValue1640_12_0)).p;
    break forward_join_15;
    }
    forwardValue1640_15_0 = "container.dispenser";
    }
    return forwardValue1640_15_0;
}


public int a(net.minecraft.item.ItemStack p0) {
moom.Cm lexicalValue534_29_0;
    java.lang.String[] spill534_0;
    moom.Cm spill534_1;
    moom.Cm spill534_2;
    long life2_3;
    int life5_6;
    java.lang.String[] life4_7;
    lexical_join_37: {
    life2_3 = (moom.Cm.q ^ 30571935300775L);
    spill534_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life5_6 = 0;
    life4_7 = spill534_0;
    lexical_cycle_8: while (true) {
    lexical_join_34: {
    lexical_join_29: {
    lexical_join_28: {
    if (!((life5_6 < (this.o).length))) {
        break lexical_join_37;
    }
    spill534_1 = this;
    if (!((life4_7 != null))) {
        lexicalValue534_29_0 = spill534_1;
        break lexical_join_29;
    }
    if (!(((((moom.Cm)(spill534_1)).o)[life5_6] != null))) {
        break lexical_join_28;
    }
    spill534_2 = this;
    if (!((life4_7 != null))) {
        lexicalValue534_29_0 = spill534_2;
        break lexical_join_29;
    }
    if (!((((net.minecraft.item.ItemStack)((((moom.Cm)(spill534_2)).o)[life5_6])).a__wQ() == null))) {
        break lexical_join_34;
    }
    }
    lexicalValue534_29_0 = this;
    }
    ((moom.Cm)(lexicalValue534_29_0)).a__Void(((int)(life5_6)), ((net.minecraft.item.ItemStack)(p0)));
    return life5_6;
    }
    life5_6 += 1;
    if (!((life4_7 == null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return -1;
}


public void a__Void(int p0, net.minecraft.item.ItemStack p1) {
net.minecraft.item.ItemStack forwardValue1641_23_0;
    java.lang.String[] spill1641_0;
    net.minecraft.item.ItemStack spill1641_1;
    long life3_3;
    java.lang.String[] life5_10;
    forward_join_28: {
    forward_join_26: {
    forward_join_23: {
    life3_3 = (moom.Cm.q ^ 99662236789563L);
    spill1641_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    (this.o)[p0] = p1;
    life5_10 = spill1641_0;
    if (!((life5_10 != null))) {
        break forward_join_28;
    }
    if (!((p1 != null))) {
        break forward_join_26;
    }
    spill1641_1 = p1;
    if (!((life5_10 != null))) {
        forwardValue1641_23_0 = spill1641_1;
        break forward_join_23;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1641_1)).b > ((moom.Cm)(this)).c__Int()))) {
        break forward_join_26;
    }
    forwardValue1641_23_0 = p1;
    }
    ((net.minecraft.item.ItemStack)(forwardValue1641_23_0)).b = ((int)(((moom.Cm)(this)).c__Int()));
    }
    ((moom.Cm)(this)).a__Void();
    }
    return;
}


public net.minecraft.item.ItemStack a(int p0, int p1) {
net.minecraft.item.ItemStack forwardValue1637_17_0;
    net.minecraft.item.ItemStack forwardValue1637_42_0;
    net.minecraft.item.ItemStack forwardValue1637_59_0;
    net.minecraft.item.ItemStack spill1637_0;
    net.minecraft.item.ItemStack spill1637_1;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.item.ItemStack life6_35;
    net.minecraft.item.ItemStack life6_51;
    forward_join_60: {
    forward_join_59: {
    forward_join_56: {
    forward_join_42: {
    forward_join_36: {
    forward_join_17: {
    life3_3 = (moom.Cm.q ^ 131931744076552L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1637_0 = (this.o)[p0];
    if (!((life5_5 != null))) {
        forwardValue1637_17_0 = spill1637_0;
        break forward_join_17;
    }
    if (!((spill1637_0 != null))) {
        break forward_join_60;
    }
    forwardValue1637_17_0 = (this.o)[p0];
    }
    if (!((life5_5 != null))) {
        forwardValue1637_42_0 = forwardValue1637_17_0;
        break forward_join_42;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue1637_17_0)).b <= p1))) {
        break forward_join_36;
    }
    life6_35 = (this.o)[p0];
    (this.o)[p0] = null;
    ((moom.Cm)(this)).a__Void();
    return life6_35;
    }
    forwardValue1637_42_0 = ((net.minecraft.item.ItemStack)((this.o)[p0])).a(((int)(p1)));
    }
    life6_51 = forwardValue1637_42_0;
    spill1637_1 = (this.o)[p0];
    if (!((life5_5 != null))) {
        forwardValue1637_59_0 = spill1637_1;
        break forward_join_59;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1637_1)).b == 0))) {
        break forward_join_56;
    }
    (this.o)[p0] = null;
    }
    ((moom.Cm)(this)).a__Void();
    forwardValue1637_59_0 = life6_51;
    }
    return forwardValue1637_59_0;
    }
    return null;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return (this.o)[p0];
}


public boolean a__Boolean(int p0, net.minecraft.item.ItemStack p1) {
return ((1) != 0);
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue1638_39_0;
    int forwardValue1638_41_0;
    int spill1638_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (moom.Cm.q ^ 40524829516212L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(this.d)).a__B9(((moom.DT)(this.e))) == this))) {
        break forward_join_40;
    }
    spill1638_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(this.e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(this.e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue1638_39_0 = spill1638_0;
        break forward_join_39;
    }
    if (!((spill1638_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1638_39_0 = 1;
    }
    forwardValue1638_41_0 = forwardValue1638_39_0;
    break forward_join_41;
    }
    forwardValue1638_41_0 = 0;
    }
    return ((forwardValue1638_41_0) != 0);
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
int lexicalValue535_71_0;
    java.lang.String[] spill535_0;
    int spill535_1;
    long life2_3;
    net.minecraft.nbt.NBTTagList life5_16;
    int life6_23;
    java.lang.String[] life4_24;
    net.minecraft.nbt.NBTTagCompound life7_32;
    int life8_42;
    lexical_join_77: {
    lexical_join_71: {
    lexical_join_63: {
    life2_3 = (moom.Cm.q ^ 65050803207927L);
    spill535_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    super.a__Void(((net.minecraft.nbt.NBTTagCompound)(p0)));
    life5_16 = ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("Items")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic535_3(20898, (138714889178408619L ^ life2_3)))));
    this.o = ((net.minecraft.item.ItemStack[])(new net.minecraft.item.ItemStack[((moom.Cm)(this)).b__Int()]));
    life6_23 = 0;
    life4_24 = spill535_0;
    lexical_cycle_25: while (true) {
    lexical_join_61: {
    lexical_join_60: {
    if (!((life6_23 < ((net.minecraft.nbt.NBTTagList)(life5_16)).a__Int()))) {
        break lexical_join_63;
    }
    life7_32 = ((net.minecraft.nbt.NBTTagList)(life5_16)).a__yw(((int)(life6_23)));
    life8_42 = (((net.minecraft.nbt.NBTTagCompound)(life7_32)).b__sourceReturn_d4c7a9581c(((java.lang.String)("Slot"))) & __sourceIntrinsic_03d9340fa09f_invokedynamic535_10(12539, (6463678948854171635L ^ life2_3)));
    if (!((life4_24 != null))) {
        break lexical_join_61;
    }
    spill535_1 = life8_42;
    if (!((life4_24 != null))) {
        lexicalValue535_71_0 = spill535_1;
        break lexical_join_71;
    }
    if (!((spill535_1 >= 0))) {
        break lexical_join_60;
    }
    if (!((life8_42 < (this.o).length))) {
        break lexical_join_60;
    }
    (this.o)[life8_42] = net.minecraft.item.ItemStack.a(((net.minecraft.nbt.NBTTagCompound)(life7_32)));
    }
    life6_23 += 1;
    }
    if (!((life4_24 == null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue535_71_0 = ((((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic535_14(22567, (6775128504546291500L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((lexicalValue535_71_0 != 0))) {
        break lexical_join_77;
    }
    this.p = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("CustomName")))));
    }
    return;
}


public void a(java.lang.String p0) {
this.p = ((java.lang.String)(p0));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_d7a7857856aabe10_originalDynamicSite1888_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a63cd0a8780c_originalDynamicSite1094_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_240e736e888e_originalDynamicSite1095_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4105_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic535_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic535_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic535_14(int a0, long a1) throws E;
}
