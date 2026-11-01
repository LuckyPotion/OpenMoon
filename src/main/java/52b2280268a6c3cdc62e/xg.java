package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class xg extends net.minecraft.item.Item {

private static final long n;

private static final long[] o;

private static final java.lang.Integer[] p;

private static final java.util.Map q;

public xg() {
super();
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(5190212254325716960L)), ((long)(1553689636344895237L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16988575540806L)))));
    q = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.xg.n ^ 30362658795935L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1110_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1110_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1110_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1110_14 = new byte[8];
    (__sourceSpill1110_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1110_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1110_16 = __sourceSpill1110_14;
    ((javax.crypto.Cipher)(__sourceSpill1110_11)).init(((int)(__sourceSpill1110_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1110_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1110_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ï\b4\036|ÈG\007\004\007ÒbQ\\g"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1110_25 = local6_life21;
        int __sourceSpill1110_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1110_25)).substring(((int)(__sourceSpill1110_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1110_30 = local8_life19;
        int __sourceSpill1110_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1110_33 = new byte[8];
        (__sourceSpill1110_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1110_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1110_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1110_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1110_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1110_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1110_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1110_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1110_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1110_34)).doFinal(((byte[])(__sourceSpill1110_33)));
        (__sourceSpill1110_30)[__sourceSpill1110_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    o = ((long[])(local8_life19));
    p = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9730_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4774;
      if (p[var3] == null) {
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
         long var5 = o[var3];
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
         Object[] var9 = (Object[])q.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               q.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         p[var3] = var15;
      }

      return p[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.xg.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
return ((1) != 0);
}


public boolean c__Boolean(net.minecraft.item.ItemStack p0) {
return ((0) != 0);
}


public net.minecraft.item.EnumRarity a__a3(net.minecraft.item.ItemStack p0) {
moom.xg forwardValue4519_17_0;
    net.minecraft.item.ItemStack forwardValue4519_17_1;
    net.minecraft.item.EnumRarity forwardValue4519_18_0;
    moom.xg spill4519_0;
    net.minecraft.item.ItemStack spill4519_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_15: {
    life2_3 = (moom.xg.n ^ 74587473559585L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill4519_0 = this;
    spill4519_1 = p0;
    if (!((life4_5 == 0))) {
        forwardValue4519_17_0 = spill4519_0;
        forwardValue4519_17_1 = spill4519_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.nbt.NBTTagList)(((moom.xg)(spill4519_0)).a__yz(((net.minecraft.item.ItemStack)(spill4519_1))))).a__Int() > 0))) {
        break forward_join_15;
    }
    forwardValue4519_18_0 = net.minecraft.item.EnumRarity.UNCOMMON;
    break forward_join_18;
    }
    forwardValue4519_17_0 = this;
    forwardValue4519_17_1 = p0;
    }
    forwardValue4519_18_0 = __sourceIntrinsic_7758e48f3baf_call4519_6(forwardValue4519_17_0, forwardValue4519_17_1);
    }
    return forwardValue4519_18_0;
}


public moom.D5 a(java.util.Random p0, int p1, int p2, int p3) {
long local5 = (moom.xg.n ^ 46685402583323L);
    net.minecraft.item.ItemStack local7 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.aL, 1, 0);
    moom.rV.a__xW(((java.util.Random)(p0)), ((net.minecraft.item.ItemStack)(local7)), ((int)(__sourceIntrinsic_8ff6e1d72b0f_originalDynamicSite1705_2(17352, (9025577233485718776L ^ local5)))));
    return new moom.D5(local7, p1, p2, p3);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(net.minecraft.enchantment.Enchantment p0, java.util.List<net.minecraft.item.ItemStack> p1) {
boolean spill1414_0;
    long life3_3;
    int life6_7;
    int life5_8;
    lexical_join_26: {
    life3_3 = (moom.xg.n ^ 47066936483464L);
    spill1414_0 = net.minecraft.item.ItemStack.l();
    life6_7 = ((net.minecraft.enchantment.Enchantment)(p0)).b();
    life5_8 = ((spill1414_0) ? 1 : 0);
    lexical_cycle_9: while (true) {
    if (!((life6_7 <= ((net.minecraft.enchantment.Enchantment)(p0)).c()))) {
        break lexical_join_26;
    }
    ((java.util.List)(p1)).add(((java.lang.Object)(((moom.xg)(this)).a(((moom.D3)(new moom.D3(p0, life6_7)))))));
    life6_7 += 1;
    if (!((life5_8 != 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
boolean spill1416_0;
    long life5_3;
    int life7_11;
    net.minecraft.nbt.NBTTagList life8_15;
    int life9_19;
    int life10_29;
    int life11_35;
    lexical_join_51: {
    life5_3 = (moom.xg.n ^ 34074496500545L);
    spill1416_0 = net.minecraft.item.ItemStack.m();
    super.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((java.util.List)(p2)), ((boolean)(p3)));
    life7_11 = ((spill1416_0) ? 1 : 0);
    life8_15 = ((moom.xg)(this)).a__yz(((net.minecraft.item.ItemStack)(p0)));
    if (!((life8_15 != null))) {
        break lexical_join_51;
    }
    life9_19 = 0;
    lexical_cycle_20: while (true) {
    lexical_join_49: {
    lexical_join_48: {
    if (!((life9_19 < ((net.minecraft.nbt.NBTTagList)(life8_15)).a__Int()))) {
        break lexical_join_51;
    }
    life10_29 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life8_15)).a__yw(((int)(life9_19))))).a__Short(((java.lang.String)("id")));
    life11_35 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life8_15)).a__yw(((int)(life9_19))))).a__Short(((java.lang.String)("lvl")));
    if (!((life7_11 != 0))) {
        break lexical_join_49;
    }
    if (!((net.minecraft.enchantment.Enchantment.a__rD(((int)(life10_29))) != null))) {
        break lexical_join_48;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(((net.minecraft.enchantment.Enchantment)(net.minecraft.enchantment.Enchantment.a__rD(((int)(life10_29))))).a__String(((int)(life11_35))))));
    }
    life9_19 += 1;
    }
    if (!((life7_11 == 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    return;
}


public void a(net.minecraft.item.ItemStack p0, moom.D3 p1) {
int lexicalValue1415_48_0;
    int lexicalValue1415_55_0;
    int lexicalValue1415_82_0;
    net.minecraft.item.ItemStack lexicalValue1415_89_0;
    boolean spill1415_0;
    short spill1415_1;
    short spill1415_2;
    net.minecraft.item.ItemStack spill1415_3;
    long life3_3;
    net.minecraft.nbt.NBTTagList life6_8;
    int life7_10;
    int life5_11;
    int life8_13;
    net.minecraft.nbt.NBTTagCompound life9_21;
    net.minecraft.nbt.NBTTagCompound life8_82;
    lexical_join_89: {
    lexical_join_88: {
    lexical_join_82: {
    lexical_join_78: {
    lexical_join_55: {
    lexical_join_54: {
    life3_3 = (moom.xg.n ^ 74163894514622L);
    spill1415_0 = net.minecraft.item.ItemStack.l();
    life6_8 = ((moom.xg)(this)).a__yz(((net.minecraft.item.ItemStack)(p0)));
    life7_10 = 1;
    life5_11 = ((spill1415_0) ? 1 : 0);
    life8_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_48: {
    lexical_join_47: {
    if (!((life8_13 < ((net.minecraft.nbt.NBTTagList)(life6_8)).a__Int()))) {
        break lexical_join_54;
    }
    life9_21 = ((net.minecraft.nbt.NBTTagList)(life6_8)).a__yw(((int)(life8_13)));
    if (!((life5_11 == 0))) {
        break lexical_join_52;
    }
    spill1415_1 = ((net.minecraft.nbt.NBTTagCompound)(life9_21)).a__Short(((java.lang.String)("id")));
    if (!((life5_11 == 0))) {
        lexicalValue1415_55_0 = ((int)(spill1415_1));
        break lexical_join_55;
    }
    if (!((spill1415_1 == ((net.minecraft.enchantment.Enchantment)(((moom.D3)(p1)).c)).C))) {
        break lexical_join_51;
    }
    spill1415_2 = ((net.minecraft.nbt.NBTTagCompound)(life9_21)).a__Short(((java.lang.String)("lvl")));
    if (!((life5_11 == 0))) {
        lexicalValue1415_48_0 = ((int)(spill1415_2));
        break lexical_join_48;
    }
    if (!((spill1415_2 < ((moom.D3)(p1)).d))) {
        break lexical_join_47;
    }
    ((net.minecraft.nbt.NBTTagCompound)(life9_21)).a(((java.lang.String)("lvl")), ((short)(((short) ((moom.D3)(p1)).d))));
    }
    lexicalValue1415_48_0 = 0;
    }
    life7_10 = lexicalValue1415_48_0;
    if (!((life5_11 != 0))) {
        break lexical_join_54;
    }
    }
    life8_13 += 1;
    }
    if (!((life5_11 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1415_55_0 = life7_10;
    }
    if (!((life5_11 == 0))) {
        lexicalValue1415_82_0 = lexicalValue1415_55_0;
        break lexical_join_82;
    }
    if (!((lexicalValue1415_55_0 != 0))) {
        break lexical_join_78;
    }
    life8_82 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life8_82)).a(((java.lang.String)("id")), ((short)(((short) ((net.minecraft.enchantment.Enchantment)(((moom.D3)(p1)).c)).C))));
    ((net.minecraft.nbt.NBTTagCompound)(life8_82)).a(((java.lang.String)("lvl")), ((short)(((short) ((moom.D3)(p1)).d))));
    ((net.minecraft.nbt.NBTTagList)(life6_8)).a(((net.minecraft.nbt.NBTBase)(life8_82)));
    }
    spill1415_3 = p0;
    if (!((life5_11 == 0))) {
        lexicalValue1415_89_0 = spill1415_3;
        break lexical_join_89;
    }
    lexicalValue1415_82_0 = ((((net.minecraft.item.ItemStack)(spill1415_3)).e__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1415_82_0 == 0))) {
        break lexical_join_88;
    }
    ((net.minecraft.item.ItemStack)(p0)).b(((net.minecraft.nbt.NBTTagCompound)(new net.minecraft.nbt.NBTTagCompound())));
    }
    lexicalValue1415_89_0 = p0;
    }
    ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(lexicalValue1415_89_0)).a__yw())).a(((java.lang.String)("StoredEnchantments")), ((net.minecraft.nbt.NBTBase)(life6_8)));
    return;
}


public net.minecraft.item.ItemStack a(moom.D3 p0) {
net.minecraft.item.ItemStack local2 = new net.minecraft.item.ItemStack(this);
    ((moom.xg)(this)).a(((net.minecraft.item.ItemStack)(local2)), ((moom.D3)(p0)));
    return local2;
}


public net.minecraft.nbt.NBTTagList a__yz(net.minecraft.item.ItemStack p0) {
net.minecraft.nbt.NBTTagCompound forwardValue4520_14_0;
    net.minecraft.nbt.NBTTagCompound forwardValue4520_26_0;
    java.lang.String forwardValue4520_26_1;
    net.minecraft.nbt.NBTTagList forwardValue4520_32_0;
    boolean spill4520_0;
    net.minecraft.nbt.NBTTagCompound spill4520_1;
    java.lang.String spill4520_2;
    long life2_3;
    net.minecraft.nbt.NBTTagCompound life5_7;
    int life4_8;
    forward_join_32: {
    forward_join_29: {
    forward_join_26: {
    forward_join_14: {
    life2_3 = (moom.xg.n ^ 20582174042076L);
    spill4520_0 = net.minecraft.item.ItemStack.l();
    life5_7 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    life4_8 = ((spill4520_0) ? 1 : 0);
    spill4520_1 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue4520_14_0 = spill4520_1;
        break forward_join_14;
    }
    if (!((spill4520_1 != null))) {
        break forward_join_29;
    }
    forwardValue4520_14_0 = life5_7;
    }
    spill4520_2 = "StoredEnchantments";
    if (!((life4_8 == 0))) {
        forwardValue4520_26_0 = forwardValue4520_14_0;
        forwardValue4520_26_1 = spill4520_2;
        break forward_join_26;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(forwardValue4520_14_0)).a__Boolean(((java.lang.String)(spill4520_2)), ((int)(__sourceIntrinsic_2a135cb2b2c3_invokedynamic4520_4(26700, (2870650444826130874L ^ life2_3))))))) {
        break forward_join_29;
    }
    forwardValue4520_26_0 = life5_7;
    forwardValue4520_26_1 = "StoredEnchantments";
    }
    forwardValue4520_32_0 = ((net.minecraft.nbt.NBTTagList)(((net.minecraft.nbt.NBTTagCompound)(forwardValue4520_26_0)).a__yn(((java.lang.String)(forwardValue4520_26_1)))));
    break forward_join_32;
    }
    forwardValue4520_32_0 = new net.minecraft.nbt.NBTTagList();
    }
    return forwardValue4520_32_0;
}


public moom.D5 a(java.util.Random p0) {
return ((moom.xg)(this)).a(((java.util.Random)(p0)), ((int)(1)), ((int)(1)), ((int)(1)));
}


private static native <E extends Throwable> int __sourceIntrinsic_8ff6e1d72b0f_originalDynamicSite1705_2(int a0, long a1) throws E;

private static native <E extends Throwable> net.minecraft.item.EnumRarity __sourceIntrinsic_7758e48f3baf_call4519_6(moom.xg a0, net.minecraft.item.ItemStack a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a135cb2b2c3_invokedynamic4520_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9730_0() throws E;
}
