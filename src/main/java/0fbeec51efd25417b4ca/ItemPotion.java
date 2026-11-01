package net.minecraft.item;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ItemPotion extends net.minecraft.item.Item {

private final java.util.Map<java.lang.Integer, java.util.List<net.minecraft.potion.PotionEffect>> n;

private static final java.util.Map<java.util.List<net.minecraft.potion.PotionEffect>, java.lang.Integer> o;

private static final long p;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

public ItemPotion() {
super();
    this.n = com.google.common.collect.Maps.newHashMap();
    (this).b(1);
    (this).a(true);
    (this).c(0);
    (this).a(net.minecraft.creativetab.CreativeTabs.k);
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-6768700547826266704L)), ((long)(-1992368201017813896L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(49759939361146L)))));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.item.ItemPotion.p ^ 119213805778689L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1901_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1901_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1901_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1901_14 = new byte[8];
    (__sourceSpill1901_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1901_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1901_16 = __sourceSpill1901_14;
    ((javax.crypto.Cipher)(__sourceSpill1901_11)).init(((int)(__sourceSpill1901_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1901_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1901_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[11];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "rëÆ\016jßÿÉØ\027U\bãd.QsF;Ü<P#\n!x`\tF\013¢Ðoô½ª<s\003Ô-v\004\0210 ¦ª\032$\t[§(ðZy\024UÆê "))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1901_25 = local6_life21;
        int __sourceSpill1901_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1901_25)).substring(((int)(__sourceSpill1901_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1901_30 = local8_life19;
        int __sourceSpill1901_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1901_33 = new byte[8];
        (__sourceSpill1901_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1901_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1901_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1901_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1901_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1901_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1901_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1901_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1901_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1901_34)).doFinal(((byte[])(__sourceSpill1901_33)));
        (__sourceSpill1901_30)[__sourceSpill1901_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "7Q§KÕçÿÿÍã[ÇQ8ù"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1901_38 = local6_life21;
        int __sourceSpill1901_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1901_38)).substring(((int)(__sourceSpill1901_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1901_43 = local8_life19;
        int __sourceSpill1901_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1901_46 = new byte[8];
        (__sourceSpill1901_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1901_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1901_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1901_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1901_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1901_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1901_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1901_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1901_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1901_47)).doFinal(((byte[])(__sourceSpill1901_46)));
        (__sourceSpill1901_43)[__sourceSpill1901_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    q = ((long[])(local8_life19));
    r = ((java.lang.Integer[])(new java.lang.Integer[11]));
    o = ((java.util.Map)(com.google.common.collect.Maps.newLinkedHashMap()));
}


public int b__sourceReturn_0f7a48eca2(int p0) {
return moom.A6.a(((int)(p0)), ((boolean)(false)));
}


public boolean b__Boolean(int p0) {
java.util.List lexicalValue1630_15_0;
    int lexicalValue1630_40_0;
    int lexicalValue1630_44_0;
    boolean spill1630_0;
    java.util.List spill1630_1;
    boolean spill1630_2;
    boolean spill1630_3;
    long life2_3;
    java.util.List life5_8;
    int life4_9;
    java.util.Iterator life6_27;
    net.minecraft.potion.PotionEffect life7_34;
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_15: {
    life2_3 = (net.minecraft.item.ItemPotion.p ^ 49006510386052L);
    spill1630_0 = net.minecraft.item.ItemStack.m();
    life5_8 = ((net.minecraft.item.ItemPotion)(this)).a__sourceReturn_7947c2aecb(((int)(p0)));
    life4_9 = ((spill1630_0) ? 1 : 0);
    spill1630_1 = life5_8;
    if (!((life4_9 != 0))) {
        lexicalValue1630_15_0 = spill1630_1;
        break lexical_join_15;
    }
    if (!((spill1630_1 != null))) {
        break lexical_join_43;
    }
    lexicalValue1630_15_0 = life5_8;
    }
    spill1630_2 = ((java.util.List)(lexicalValue1630_15_0)).isEmpty();
    if (!((life4_9 != 0))) {
        lexicalValue1630_44_0 = ((spill1630_2) ? 1 : 0);
        break lexical_join_44;
    }
    if (!((!spill1630_2))) {
        break lexical_join_43;
    }
    life6_27 = ((java.util.List)(life5_8)).iterator();
    lexical_cycle_22: while (true) {
    lexical_join_41: {
    lexical_join_40: {
    if (!(((java.util.Iterator)(life6_27)).hasNext())) {
        break lexical_join_43;
    }
    life7_34 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life6_27)).next()));
    spill1630_3 = ((net.minecraft.potion.Potion)((net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life7_34)).a()])).a__Boolean();
    if (!((life4_9 != 0))) {
        lexicalValue1630_44_0 = ((spill1630_3) ? 1 : 0);
        break lexical_join_44;
    }
    if (!((life4_9 != 0))) {
        lexicalValue1630_40_0 = ((spill1630_3) ? 1 : 0);
        break lexical_join_40;
    }
    if (!(spill1630_3)) {
        break lexical_join_41;
    }
    lexicalValue1630_40_0 = 1;
    }
    return ((lexicalValue1630_40_0) != 0);
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue1630_44_0 = 0;
    }
    return ((lexicalValue1630_44_0) != 0);
}


public boolean b__Boolean(net.minecraft.item.ItemStack p0) {
java.util.List forwardValue5486_15_0;
    int forwardValue5486_20_0;
    int forwardValue5486_22_0;
    boolean spill5486_0;
    java.util.List spill5486_1;
    boolean spill5486_2;
    long life2_3;
    java.util.List life5_8;
    int life4_9;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_15: {
    life2_3 = (net.minecraft.item.ItemPotion.p ^ 12304163021477L);
    spill5486_0 = net.minecraft.item.ItemStack.l();
    life5_8 = ((net.minecraft.item.ItemPotion)(this)).a__List(((net.minecraft.item.ItemStack)(p0)));
    life4_9 = ((spill5486_0) ? 1 : 0);
    spill5486_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue5486_15_0 = spill5486_1;
        break forward_join_15;
    }
    if (!((spill5486_1 != null))) {
        break forward_join_21;
    }
    forwardValue5486_15_0 = life5_8;
    }
    spill5486_2 = ((java.util.List)(forwardValue5486_15_0)).isEmpty();
    if (!((life4_9 == 0))) {
        forwardValue5486_20_0 = ((spill5486_2) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill5486_2))) {
        break forward_join_21;
    }
    forwardValue5486_20_0 = 1;
    }
    forwardValue5486_22_0 = forwardValue5486_20_0;
    break forward_join_22;
    }
    forwardValue5486_22_0 = 0;
    }
    return ((forwardValue5486_22_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11920_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/xE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24758;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/xE", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.item.ItemPotion.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.item.ItemStack b(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int lexicalValue1629_20_0;
    int lexicalValue1629_60_0;
    int lexicalValue1629_65_0;
    int lexicalValue1629_80_0;
    boolean spill1629_0;
    long life4_3;
    int life6_5;
    java.util.List life7_35;
    java.util.Iterator life8_45;
    net.minecraft.potion.PotionEffect life9_52;
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_73: {
    lexical_join_65: {
    lexical_join_60: {
    lexical_join_57: {
    lexical_join_51: {
    lexical_join_20: {
    lexical_join_18: {
    life4_3 = (net.minecraft.item.ItemPotion.p ^ 105710214948893L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill1629_0 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d;
    if (!((life6_5 != 0))) {
        lexicalValue1629_20_0 = ((spill1629_0) ? 1 : 0);
        break lexical_join_20;
    }
    if (!((!spill1629_0))) {
        break lexical_join_18;
    }
    net.minecraft.item.ItemStack __stackOp1629_6_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp1629_6_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1629_6_0)).b - 1)));
    }
    lexicalValue1629_20_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1629_60_0 = lexicalValue1629_20_0;
        break lexical_join_60;
    }
    if (!((lexicalValue1629_20_0 == 0))) {
        break lexical_join_51;
    }
    life7_35 = ((net.minecraft.item.ItemPotion)(this)).a__List(((net.minecraft.item.ItemStack)(p0)));
    if (!((life6_5 != 0))) {
        break lexical_join_57;
    }
    if (!((life7_35 != null))) {
        break lexical_join_51;
    }
    life8_45 = ((java.util.List)(life7_35)).iterator();
    lexical_cycle_34: while (true) {
    if (!(((java.util.Iterator)(life8_45)).hasNext())) {
        break lexical_join_51;
    }
    life9_52 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life8_45)).next()));
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((net.minecraft.potion.PotionEffect)(new net.minecraft.potion.PotionEffect(life9_52))));
    if (!((life6_5 != 0))) {
        break lexical_join_57;
    }
    if (!((life6_5 == 0))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    lexicalValue1629_60_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        lexicalValue1629_65_0 = lexicalValue1629_60_0;
        break lexical_join_65;
    }
    if (!((lexicalValue1629_60_0 == 0))) {
        break lexical_join_81;
    }
    lexicalValue1629_65_0 = ((net.minecraft.item.ItemStack)(p0)).b;
    }
    if (!((life6_5 != 0))) {
        lexicalValue1629_80_0 = lexicalValue1629_65_0;
        break lexical_join_80;
    }
    if (!((lexicalValue1629_65_0 <= 0))) {
        break lexical_join_73;
    }
    return new net.minecraft.item.ItemStack(net.minecraft.init.Items.bp);
    }
    lexicalValue1629_80_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p2)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bp))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1629_80_0);
    }
    return p0;
}


public java.lang.String d(net.minecraft.item.ItemStack p0) {
java.util.List forwardValue5487_33_0;
    int forwardValue5487_54_0;
    java.util.List spill5487_0;
    boolean spill5487_1;
    long life2_3;
    int life4_5;
    java.lang.String life5_16;
    java.util.List life6_29;
    java.lang.String life7_50;
    java.lang.String life7_53;
    java.lang.String life7_63;
    forward_join_54: {
    forward_join_52: {
    forward_join_33: {
    forward_join_24: {
    forward_join_13: {
    life2_3 = (net.minecraft.item.ItemPotion.p ^ 44316671388857L);
    life4_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((((net.minecraft.item.ItemStack)(p0)).c() == 0))) {
        break forward_join_13;
    }
    return ((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("item.emptyPotion.name"))))).trim();
    }
    life5_16 = "";
    if (!(net.minecraft.item.ItemPotion.a__Boolean(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))) {
        break forward_join_24;
    }
    life5_16 = __sourceIntrinsic_480a975002ff_invokedynamic5487_10(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("potion.prefix.grenade"))))).trim());
    }
    life6_29 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__List(((net.minecraft.item.ItemStack)(p0)));
    spill5487_0 = life6_29;
    if (!((life4_5 != 0))) {
        forwardValue5487_33_0 = spill5487_0;
        break forward_join_33;
    }
    if (!((spill5487_0 != null))) {
        break forward_join_52;
    }
    forwardValue5487_33_0 = life6_29;
    }
    spill5487_1 = ((java.util.List)(forwardValue5487_33_0)).isEmpty();
    if (!((life4_5 != 0))) {
        forwardValue5487_54_0 = ((spill5487_1) ? 1 : 0);
        break forward_join_54;
    }
    if (!((!spill5487_1))) {
        break forward_join_52;
    }
    life7_50 = ((net.minecraft.potion.PotionEffect)(((net.minecraft.potion.PotionEffect)(((java.util.List)(life6_29)).get(((int)(0))))))).a__String();
    life7_53 = __sourceIntrinsic_480a975002ff_invokedynamic5487_18(life7_50);
    return __sourceIntrinsic_480a975002ff_invokedynamic5487_21(life5_16, ((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(life7_53))))).trim());
    }
    forwardValue5487_54_0 = ((net.minecraft.item.ItemStack)(p0)).c();
    }
    life7_63 = moom.A6.a__String(((int)(forwardValue5487_54_0)));
    return __sourceIntrinsic_480a975002ff_invokedynamic5487_27(((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(life7_63))))).trim(), super.d(((net.minecraft.item.ItemStack)(p0))));
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int forestValue1126_19_0;
    int forestValue1126_28_0;
    int forestValue1126_53_0;
    int forestValue1126_84_0;
    int forestValue1126_84_1;
    int forestValue1126_96_0;
    int forestValue1126_97_0;
    int forestValue1126_97_1;
    java.lang.Object forestValue1126_113_0;
    java.util.Map forestValue1126_124_0;
    boolean spill1126_0;
    java.util.Map spill1126_1;
    int spill1126_2;
    int spill1126_3;
    int spill1126_4;
    int spill1126_5;
    java.util.List spill1126_6;
    long life4_3;
    int life6_10;
    int life7_18;
    int life8_27;
    int life9_45;
    int life10_58;
    int life11_63;
    java.util.List life12_106;
    java.util.Iterator life7_138;
    int life8_146;
    forest_join_146: {
    forest_join_124: {
    forest_join_123: {
    life4_3 = (net.minecraft.item.ItemPotion.p ^ 9133301299199L);
    spill1126_0 = net.minecraft.item.ItemStack.l();
    super.a(((net.minecraft.item.Item)(p0)), ((net.minecraft.creativetab.CreativeTabs)(p1)), ((java.util.List)(p2)));
    life6_10 = ((spill1126_0) ? 1 : 0);
    spill1126_1 = net.minecraft.item.ItemPotion.o;
    if (!((life6_10 == 0))) {
        forestValue1126_124_0 = spill1126_1;
        break forest_join_124;
    }
    if (!(((java.util.Map)(spill1126_1)).isEmpty())) {
        break forest_join_123;
    }
    life7_18 = 0;
    forest_cycle_18: while (true) {
    forest_join_120: {
    forestValue1126_19_0 = life7_18;
    forest_cycle_19: while (true) {
    if (!((forestValue1126_19_0 <= __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_6(7149, (6389147575773583630L ^ life4_3))))) {
        break forest_join_123;
    }
    life8_27 = 0;
    forest_cycle_27: while (true) {
    forest_join_117: {
    forestValue1126_28_0 = life8_27;
    forest_cycle_28: while (true) {
    forest_join_54: {
    forest_join_53: {
    forest_join_46: {
    if (!((forestValue1126_28_0 <= 1))) {
        break forest_join_120;
    }
    spill1126_2 = life8_27;
    if (!((life6_10 == 0))) {
        forestValue1126_19_0 = spill1126_2;
        continue forest_cycle_19;
    }
    if (!((life6_10 == 0))) {
        forestValue1126_53_0 = spill1126_2;
        break forest_join_53;
    }
    if (!((spill1126_2 == 0))) {
        break forest_join_46;
    }
    life9_45 = (life7_18 | __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_7(25679, (7475760628862690984L ^ life4_3)));
    if (!((life6_10 != 0))) {
        break forest_join_54;
    }
    }
    forestValue1126_53_0 = (life7_18 | __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_8(3118, (2095541159896501966L ^ life4_3)));
    }
    life9_45 = forestValue1126_53_0;
    }
    life10_58 = 0;
    forest_cycle_56: while (true) {
    forest_join_115: {
    forest_join_114: {
    forest_join_113: {
    forest_join_97: {
    forest_join_96: {
    forest_join_95: {
    forest_join_84: {
    forest_join_82: {
    if (!((life10_58 <= 2))) {
        break forest_join_117;
    }
    life11_63 = life9_45;
    spill1126_3 = life10_58;
    if (!((life6_10 == 0))) {
        forestValue1126_28_0 = spill1126_3;
        continue forest_cycle_28;
    }
    if (!((life6_10 == 0))) {
        forestValue1126_96_0 = spill1126_3;
        break forest_join_96;
    }
    if (!((spill1126_3 != 0))) {
        break forest_join_95;
    }
    spill1126_4 = life10_58;
    spill1126_5 = 1;
    if (!((life6_10 == 0))) {
        forestValue1126_84_0 = spill1126_4;
        forestValue1126_84_1 = spill1126_5;
        break forest_join_84;
    }
    if (!((spill1126_4 == spill1126_5))) {
        break forest_join_82;
    }
    life11_63 = (life9_45 | __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_9(17396, (3833107643145126173L ^ life4_3)));
    if (!((life6_10 != 0))) {
        break forest_join_95;
    }
    }
    forestValue1126_84_0 = life10_58;
    forestValue1126_84_1 = 2;
    }
    if (!((life6_10 == 0))) {
        forestValue1126_97_0 = forestValue1126_84_0;
        forestValue1126_97_1 = forestValue1126_84_1;
        break forest_join_97;
    }
    if (!((forestValue1126_84_0 == forestValue1126_84_1))) {
        break forest_join_95;
    }
    life11_63 = (life9_45 | __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_10(10676, (7760801247345306449L ^ life4_3)));
    }
    forestValue1126_96_0 = life11_63;
    }
    forestValue1126_97_0 = forestValue1126_96_0;
    forestValue1126_97_1 = 0;
    }
    life12_106 = moom.A6.a__List(((int)(forestValue1126_97_0)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue1126_97_1))));
    if (!((life6_10 == 0))) {
        break forest_join_115;
    }
    if (!((life12_106 != null))) {
        break forest_join_114;
    }
    spill1126_6 = life12_106;
    if (!((life6_10 == 0))) {
        forestValue1126_113_0 = spill1126_6;
        break forest_join_113;
    }
    if (!((!((java.util.List)(spill1126_6)).isEmpty()))) {
        break forest_join_114;
    }
    forestValue1126_113_0 = ((java.util.Map)(net.minecraft.item.ItemPotion.o)).put(((java.lang.Object)(life12_106)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(life11_63))))));
    }
    recovery.source.CarrierOps.discard(forestValue1126_113_0);
    }
    life10_58 += 1;
    }
    if (!((life6_10 != 0))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_cycle_28;
    }
    }
    life8_27 += 1;
    if (!((life6_10 != 0))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    break forest_cycle_19;
    }
    }
    life7_18 += 1;
    if (!((life6_10 != 0))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    forestValue1126_124_0 = net.minecraft.item.ItemPotion.o;
    }
    life7_138 = ((java.util.Collection)(((java.util.Map)(forestValue1126_124_0)).values())).iterator();
    forest_cycle_127: while (true) {
    if (!(((java.util.Iterator)(life7_138)).hasNext())) {
        break forest_join_146;
    }
    life8_146 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Iterator)(life7_138)).next())))).intValue();
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, life8_146))));
    if (!((life6_10 != 0))) {
        continue forest_cycle_127;
    }
    break forest_cycle_127;
    }
    }
    return;
}


public int a__Int(net.minecraft.item.ItemStack p0) {
long local2 = (net.minecraft.item.ItemPotion.p ^ 57039956906964L);
    return __sourceIntrinsic_43fb644d1c12_originalDynamicSite2025_1(4397, (3146897640460957668L ^ local2));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.List<net.minecraft.potion.PotionEffect> a__List(net.minecraft.item.ItemStack p0) {
java.lang.Object lexicalValue1628_67_0;
    java.util.List lexicalValue1628_87_0;
    net.minecraft.item.ItemStack spill1628_0;
    net.minecraft.nbt.NBTTagCompound spill1628_1;
    java.util.List spill1628_2;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_33;
    net.minecraft.nbt.NBTTagList life6_43;
    int life7_45;
    net.minecraft.nbt.NBTTagCompound life8_53;
    net.minecraft.potion.PotionEffect life9_56;
    java.util.List life5_83;
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_67: {
    lexical_join_61: {
    lexical_join_59: {
    life2_3 = (net.minecraft.item.ItemPotion.p ^ 53520024075695L);
    life4_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill1628_0 = p0;
    if (!((life4_5 == 0))) {
        lexicalValue1628_67_0 = spill1628_0;
        break lexical_join_67;
    }
    if (!(((net.minecraft.item.ItemStack)(spill1628_0)).e__Boolean())) {
        break lexical_join_61;
    }
    spill1628_1 = ((net.minecraft.item.ItemStack)(p0)).a__yw();
    if (!((life4_5 == 0))) {
        lexicalValue1628_67_0 = spill1628_1;
        break lexical_join_67;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1628_1)).a__Boolean(((java.lang.String)("CustomPotionEffects")), ((int)(__sourceIntrinsic_2f2f2873fc9a_invokedynamic1628_5(31212, (3047340358000750934L ^ life2_3))))))) {
        break lexical_join_61;
    }
    life5_33 = com.google.common.collect.Lists.newArrayList();
    life6_43 = ((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.item.ItemStack)(p0)).a__yw())).a(((java.lang.String)("CustomPotionEffects")), ((int)(__sourceIntrinsic_2f2f2873fc9a_invokedynamic1628_9(11886, (9173960890714187480L ^ life2_3)))));
    life7_45 = 0;
    lexical_cycle_37: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    if (!((life7_45 < ((net.minecraft.nbt.NBTTagList)(life6_43)).a__Int()))) {
        break lexical_join_59;
    }
    life8_53 = ((net.minecraft.nbt.NBTTagList)(life6_43)).a__yw(((int)(life7_45)));
    life9_56 = net.minecraft.potion.PotionEffect.a(((net.minecraft.nbt.NBTTagCompound)(life8_53)));
    if (!((life4_5 == 0))) {
        break lexical_join_57;
    }
    if (!((life9_56 != null))) {
        break lexical_join_56;
    }
    ((java.util.List)(life5_33)).add(((java.lang.Object)(life9_56)));
    }
    life7_45 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return life5_33;
    }
    lexicalValue1628_67_0 = ((java.util.Map)(this.n)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))));
    }
    life5_83 = ((java.util.List)(lexicalValue1628_67_0));
    spill1628_2 = life5_83;
    if (!((life4_5 == 0))) {
        lexicalValue1628_87_0 = spill1628_2;
        break lexical_join_87;
    }
    if (!((spill1628_2 == null))) {
        break lexical_join_86;
    }
    life5_83 = moom.A6.a__List(((int)(((net.minecraft.item.ItemStack)(p0)).c())), ((boolean)(false)));
    ((java.util.Map)(this.n)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(((net.minecraft.item.ItemStack)(p0)).c()))))), ((java.lang.Object)(life5_83)));
    }
    lexicalValue1628_87_0 = life5_83;
    }
    return lexicalValue1628_87_0;
}


public java.util.List<net.minecraft.potion.PotionEffect> a__sourceReturn_7947c2aecb(int p0) {
java.util.List forwardValue5477_29_0;
    boolean spill5477_0;
    java.util.List spill5477_1;
    long life2_3;
    java.util.List life5_11;
    int life4_12;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (net.minecraft.item.ItemPotion.p ^ 96099329818112L);
    spill5477_0 = net.minecraft.item.ItemStack.l();
    life5_11 = ((java.util.List)(((java.util.Map)(this.n)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    life4_12 = ((spill5477_0) ? 1 : 0);
    spill5477_1 = life5_11;
    if (!((life4_12 == 0))) {
        forwardValue5477_29_0 = spill5477_1;
        break forward_join_29;
    }
    if (!((spill5477_1 == null))) {
        break forward_join_28;
    }
    life5_11 = moom.A6.a__List(((int)(p0)), ((boolean)(false)));
    ((java.util.Map)(this.n)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(life5_11)));
    }
    forwardValue5477_29_0 = life5_11;
    }
    return forwardValue5477_29_0;
}


public static boolean a__Boolean(int p0) {
int forwardValue5482_17_0;
    int forwardValue5482_19_0;
    int spill5482_0;
    long life1_3;
    int life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (net.minecraft.item.ItemPotion.p ^ 9480520446836L);
    life3_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5482_0 = (p0 & __sourceIntrinsic_415cae4db048_invokedynamic5482_3(24872, (8064948064894248770L ^ life1_3)));
    if (!((life3_5 != 0))) {
        forwardValue5482_17_0 = spill5482_0;
        break forward_join_17;
    }
    if (!((spill5482_0 != 0))) {
        break forward_join_18;
    }
    forwardValue5482_17_0 = 1;
    }
    forwardValue5482_19_0 = forwardValue5482_17_0;
    break forward_join_19;
    }
    forwardValue5482_19_0 = 0;
    }
    return ((forwardValue5482_19_0) != 0);
}


public int a(net.minecraft.item.ItemStack p0, int p1) {
int forwardValue5479_15_0;
    int forwardValue5479_20_0;
    int spill5479_0;
    long life3_3;
    int life5_5;
    forward_join_20: {
    forward_join_16: {
    forward_join_15: {
    life3_3 = (net.minecraft.item.ItemPotion.p ^ 13649689396734L);
    life5_5 = ((net.minecraft.item.ItemStack.l()) ? 1 : 0);
    spill5479_0 = p1;
    if (!((life5_5 == 0))) {
        forwardValue5479_15_0 = spill5479_0;
        break forward_join_15;
    }
    if (!((spill5479_0 > 0))) {
        break forward_join_16;
    }
    forwardValue5479_15_0 = __sourceIntrinsic_3a92510638ee_invokedynamic5479_3(10601, (1452919275356346755L ^ life3_3));
    }
    forwardValue5479_20_0 = forwardValue5479_15_0;
    break forward_join_20;
    }
    forwardValue5479_20_0 = ((net.minecraft.item.ItemPotion)(this)).b__sourceReturn_0f7a48eca2(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    }
    return forwardValue5479_20_0;
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
int forwardValue5481_15_0;
    int forwardValue5481_41_0;
    boolean spill5481_0;
    long life4_3;
    int life6_5;
    forward_join_65: {
    forward_join_59: {
    forward_join_57: {
    forward_join_51: {
    forward_join_41: {
    forward_join_24: {
    forward_join_15: {
    life4_3 = (net.minecraft.item.ItemPotion.p ^ 61230602093940L);
    life6_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    spill5481_0 = net.minecraft.item.ItemPotion.a__Boolean(((int)(((net.minecraft.item.ItemStack)(p0)).c())));
    if (!((life6_5 != 0))) {
        forwardValue5481_15_0 = ((spill5481_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill5481_0)) {
        break forward_join_59;
    }
    forwardValue5481_15_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p2)).b1)).d) ? 1 : 0);
    }
    if (!((life6_5 != 0))) {
        forwardValue5481_41_0 = forwardValue5481_15_0;
        break forward_join_41;
    }
    if (!((forwardValue5481_15_0 == 0))) {
        break forward_join_24;
    }
    net.minecraft.item.ItemStack __stackOp5481_9_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp5481_9_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp5481_9_0)).b - 1)));
    }
    ((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(p2)), ((java.lang.String)("random.bow")), ((float)(0x1.0p-1f)), ((float)((0x1.99999ap-2f / ((((java.util.Random)(net.minecraft.item.ItemPotion.e)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    if (!((life6_5 != 0))) {
        break forward_join_57;
    }
    forwardValue5481_41_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((forwardValue5481_41_0 == 0))) {
        break forward_join_51;
    }
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tW(p1, p2, p0))));
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    if (!((life6_5 == 0))) {
        break forward_join_65;
    }
    }
    ((net.minecraft.entity.player.EntityPlayer)(p2)).b(((net.minecraft.item.ItemStack)(p0)), ((int)(((net.minecraft.item.ItemPotion)(this)).a__Int(((net.minecraft.item.ItemStack)(p0))))));
    }
    return p0;
}


public void a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1, java.util.List<java.lang.String> p2, boolean p3) {
java.util.List forestValue685_20_0;
    java.util.List forestValue685_25_0;
    java.util.Map forestValue685_54_0;
    int forestValue685_100_0;
    int forestValue685_113_0;
    int forestValue685_128_0;
    int forestValue685_144_0;
    int forestValue685_174_0;
    moom.vB forestValue685_211_0;
    int forestValue685_251_0;
    int forestValue685_282_0;
    java.lang.Object forestValue685_286_0;
    moom.vB forestValue685_313_0;
    int forestValue685_353_0;
    int forestValue685_384_0;
    java.util.List spill685_0;
    java.util.Map spill685_1;
    int spill685_2;
    boolean spill685_3;
    moom.vB spill685_4;
    moom.vB spill685_5;
    int spill685_6;
    java.util.List spill685_7;
    net.minecraft.util.EnumChatFormatting spill685_8;
    java.lang.String spill685_9;
    java.lang.Object[] spill685_10;
    java.lang.Object[] spill685_11;
    java.util.List spill685_12;
    net.minecraft.util.EnumChatFormatting spill685_13;
    java.lang.String spill685_14;
    java.lang.Object[] spill685_15;
    java.lang.Object[] spill685_16;
    moom.vB spill685_17;
    moom.vB spill685_18;
    int spill685_19;
    java.util.List spill685_20;
    net.minecraft.util.EnumChatFormatting spill685_21;
    java.lang.String spill685_22;
    java.lang.Object[] spill685_23;
    java.lang.Object[] spill685_24;
    java.util.List spill685_25;
    net.minecraft.util.EnumChatFormatting spill685_26;
    java.lang.String spill685_27;
    java.lang.Object[] spill685_28;
    java.lang.Object[] spill685_29;
    java.lang.Object spill685_30;
    long life5_3;
    int life7_5;
    java.util.List life8_13;
    com.google.common.collect.HashMultimap life9_15;
    java.util.Iterator life10_35;
    net.minecraft.potion.PotionEffect life11_44;
    java.lang.String life12_49;
    net.minecraft.potion.Potion life13_54;
    java.util.Map life14_57;
    java.util.Iterator life15_81;
    java.util.Map.Entry life16_90;
    moom.vB life17_94;
    moom.vB life18_107;
    java.lang.String life10_197;
    java.util.Iterator life10_228;
    java.util.Map.Entry life11_238;
    moom.vB life12_242;
    double life13_245;
    double life15_267;
    double life15_329;
    java.util.Map.Entry life11_361;
    moom.vB life12_365;
    double life13_368;
    double life15_390;
    double life15_452;
    forest_join_394: {
    forest_join_286: {
    forest_join_174: {
    forest_join_159: {
    forest_join_149: {
    forest_join_147: {
    forest_join_25: {
    forest_join_20: {
    life5_3 = (net.minecraft.item.ItemPotion.p ^ 114780987798118L);
    life7_5 = ((net.minecraft.item.ItemStack.m()) ? 1 : 0);
    if (!((((net.minecraft.item.ItemStack)(p0)).c() != 0))) {
        break forest_join_394;
    }
    life8_13 = ((net.minecraft.item.ItemPotion)(net.minecraft.init.Items.bo)).a__List(((net.minecraft.item.ItemStack)(p0)));
    life9_15 = com.google.common.collect.HashMultimap.create();
    spill685_0 = life8_13;
    if (!((life7_5 != 0))) {
        forestValue685_20_0 = spill685_0;
        break forest_join_20;
    }
    if (!((spill685_0 != null))) {
        break forest_join_149;
    }
    forestValue685_20_0 = life8_13;
    }
    if (!((life7_5 != 0))) {
        forestValue685_25_0 = forestValue685_20_0;
        break forest_join_25;
    }
    if (!((!((java.util.List)(forestValue685_20_0)).isEmpty()))) {
        break forest_join_149;
    }
    forestValue685_25_0 = life8_13;
    }
    life10_35 = ((java.util.List)(forestValue685_25_0)).iterator();
    forest_cycle_27: while (true) {
    forest_join_145: {
    forest_join_144: {
    forest_join_139: {
    forest_join_128: {
    forest_join_126: {
    forest_join_113: {
    forest_join_111: {
    forest_join_100: {
    forest_join_98: {
    forest_join_54: {
    if (!(((java.util.Iterator)(life10_35)).hasNext())) {
        break forest_join_147;
    }
    life11_44 = ((net.minecraft.potion.PotionEffect)(((java.util.Iterator)(life10_35)).next()));
    life12_49 = ((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(((net.minecraft.potion.PotionEffect)(life11_44)).a__String()))))).trim();
    life13_54 = (net.minecraft.potion.Potion.a)[((net.minecraft.potion.PotionEffect)(life11_44)).a()];
    life14_57 = ((net.minecraft.potion.Potion)(life13_54)).a__Map();
    spill685_1 = life14_57;
    if (!((life7_5 != 0))) {
        forestValue685_286_0 = spill685_1;
        break forest_join_286;
    }
    if (!((life7_5 != 0))) {
        forestValue685_54_0 = spill685_1;
        break forest_join_54;
    }
    if (!((spill685_1 != null))) {
        break forest_join_98;
    }
    forestValue685_54_0 = life14_57;
    }
    spill685_2 = ((java.util.Map)(forestValue685_54_0)).size();
    if (!((life7_5 != 0))) {
        forestValue685_100_0 = spill685_2;
        break forest_join_100;
    }
    if (!((spill685_2 > 0))) {
        break forest_join_98;
    }
    life15_81 = ((java.util.Set)(((java.util.Map)(life14_57)).entrySet())).iterator();
    forest_cycle_62: while (true) {
    if (!(((java.util.Iterator)(life15_81)).hasNext())) {
        break forest_join_98;
    }
    life16_90 = ((java.util.Map.Entry)(((java.util.Iterator)(life15_81)).next()));
    life17_94 = ((moom.vB)(((java.util.Map.Entry)(life16_90)).getValue()));
    life18_107 = new moom.vB(((moom.vB)(life17_94)).a__String(), ((net.minecraft.potion.Potion)(life13_54)).a(((int)(((net.minecraft.potion.PotionEffect)(life11_44)).c())), ((moom.vB)(life17_94))), ((moom.vB)(life17_94)).a__Int());
    ((com.google.common.collect.Multimap)(life9_15)).put(((java.lang.Object)(((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.IAttribute)(((java.util.Map.Entry)(life16_90)).getKey())))).a__String())), ((java.lang.Object)(life18_107)));
    if (!((life7_5 != 0))) {
        break forest_join_111;
    }
    if (!((life7_5 == 0))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    }
    forestValue685_100_0 = ((net.minecraft.potion.PotionEffect)(life11_44)).c();
    }
    if (!((life7_5 != 0))) {
        forestValue685_113_0 = forestValue685_100_0;
        break forest_join_113;
    }
    if (!((forestValue685_100_0 > 0))) {
        break forest_join_111;
    }
    life12_49 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_39(life12_49, ((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_36(((net.minecraft.potion.PotionEffect)(life11_44)).c())))))).trim());
    }
    forestValue685_113_0 = ((net.minecraft.potion.PotionEffect)(life11_44)).b();
    }
    if (!((life7_5 != 0))) {
        forestValue685_128_0 = forestValue685_113_0;
        break forest_join_128;
    }
    if (!((forestValue685_113_0 > __sourceIntrinsic_9085c89dbf75_invokedynamic685_41(15848, (5160017134290418325L ^ life5_3))))) {
        break forest_join_126;
    }
    life12_49 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_43(life12_49, net.minecraft.potion.Potion.a(((net.minecraft.potion.PotionEffect)(life11_44))));
    }
    forestValue685_128_0 = ((((net.minecraft.potion.Potion)(life13_54)).c__Boolean()) ? 1 : 0);
    }
    if (!((life7_5 != 0))) {
        forestValue685_144_0 = forestValue685_128_0;
        break forest_join_144;
    }
    if (!((forestValue685_128_0 != 0))) {
        break forest_join_139;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_47(net.minecraft.util.EnumChatFormatting.RED, life12_49))));
    if (!((life7_5 == 0))) {
        break forest_join_145;
    }
    }
    forestValue685_144_0 = ((((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_50(net.minecraft.util.EnumChatFormatting.GRAY, life12_49))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue685_144_0);
    }
    if (!((life7_5 == 0))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    }
    if (!((life7_5 == 0))) {
        break forest_join_159;
    }
    }
    life10_197 = ((java.lang.String)(net.minecraft.util.StatCollector.a(((java.lang.String)("potion.empty"))))).trim();
    ((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_57(net.minecraft.util.EnumChatFormatting.GRAY, life10_197))));
    }
    spill685_3 = ((com.google.common.collect.Multimap)(life9_15)).isEmpty();
    if (!((life7_5 != 0))) {
        forestValue685_174_0 = ((spill685_3) ? 1 : 0);
        break forest_join_174;
    }
    if (!((!spill685_3))) {
        break forest_join_394;
    }
    ((java.util.List)(p2)).add(((java.lang.Object)("")));
    forestValue685_174_0 = ((((java.util.List)(p2)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_64(net.minecraft.util.EnumChatFormatting.DARK_PURPLE, net.minecraft.util.StatCollector.a(((java.lang.String)("potion.effects.whenDrank")))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue685_174_0);
    life10_228 = ((java.util.Collection)(((com.google.common.collect.Multimap)(life9_15)).entries())).iterator();
    forest_cycle_179: while (true) {
    forest_join_283: {
    forest_join_282: {
    forest_join_251: {
    forest_join_248: {
    forest_join_215: {
    forest_join_211: {
    forest_join_210: {
    if (!(((java.util.Iterator)(life10_228)).hasNext())) {
        break forest_join_394;
    }
    life11_238 = ((java.util.Map.Entry)(((java.util.Iterator)(life10_228)).next()));
    life12_242 = ((moom.vB)(((java.util.Map.Entry)(life11_238)).getValue()));
    life13_245 = ((moom.vB)(life12_242)).a();
    spill685_4 = life12_242;
    if (!((life7_5 != 0))) {
        forestValue685_211_0 = spill685_4;
        break forest_join_211;
    }
    if (!((((moom.vB)(spill685_4)).a__Int() != 1))) {
        break forest_join_210;
    }
    spill685_5 = life12_242;
    if (!((life7_5 != 0))) {
        forestValue685_211_0 = spill685_5;
        break forest_join_211;
    }
    if (!((((moom.vB)(spill685_5)).a__Int() != 2))) {
        break forest_join_210;
    }
    life15_267 = ((moom.vB)(life12_242)).a();
    if (!((life7_5 == 0))) {
        break forest_join_215;
    }
    }
    forestValue685_211_0 = life12_242;
    }
    life15_267 = (((moom.vB)(forestValue685_211_0)).a() * 0x1.9p6d);
    }
    spill685_6 = recovery.source.CarrierOps.dcmpl(((double)(life13_245)), ((double)(0x0.0p0d)));
    if (!((life7_5 != 0))) {
        forestValue685_251_0 = spill685_6;
        break forest_join_251;
    }
    if (!((spill685_6 > 0))) {
        break forest_join_248;
    }
    spill685_7 = p2;
    spill685_8 = net.minecraft.util.EnumChatFormatting.BLUE;
    spill685_9 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_83(((moom.vB)(life12_242)).a__Int());
    java.lang.Object[] __stackOp685_84_0 = new java.lang.Object[2];
    spill685_10 = __stackOp685_84_0;
    (__stackOp685_84_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_267)));
    java.lang.Object[] __stackOp685_87_0 = spill685_10;
    spill685_11 = __stackOp685_87_0;
    (__stackOp685_87_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_90(((java.lang.String)(((java.util.Map.Entry)(life11_238)).getKey()))))));
    ((java.util.List)(spill685_7)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_93(spill685_8, net.minecraft.util.StatCollector.a(((java.lang.String)(spill685_9)), ((java.lang.Object[])(spill685_11)))))));
    if (!((life7_5 == 0))) {
        break forest_join_283;
    }
    }
    forestValue685_251_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_245)), ((double)(0x0.0p0d)));
    }
    if (!((life7_5 != 0))) {
        forestValue685_282_0 = forestValue685_251_0;
        break forest_join_282;
    }
    if (!((forestValue685_251_0 < 0))) {
        break forest_join_283;
    }
    life15_329 = (life15_267 * -0x1.0p0d);
    spill685_12 = p2;
    spill685_13 = net.minecraft.util.EnumChatFormatting.RED;
    spill685_14 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_98(((moom.vB)(life12_242)).a__Int());
    java.lang.Object[] __stackOp685_99_0 = new java.lang.Object[2];
    spill685_15 = __stackOp685_99_0;
    (__stackOp685_99_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_329)));
    java.lang.Object[] __stackOp685_102_0 = spill685_15;
    spill685_16 = __stackOp685_102_0;
    (__stackOp685_102_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_105(((java.lang.String)(((java.util.Map.Entry)(life11_238)).getKey()))))));
    forestValue685_282_0 = ((((java.util.List)(spill685_12)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_108(spill685_13, net.minecraft.util.StatCollector.a(((java.lang.String)(spill685_14)), ((java.lang.Object[])(spill685_16)))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue685_282_0);
    }
    if (!((life7_5 == 0))) {
        continue forest_cycle_179;
    }
    break forest_cycle_179;
    }
    break forest_join_394;
    }
    forest_cycle_286: while (true) {
    forest_join_388: {
    forest_join_385: {
    forest_join_384: {
    forest_join_353: {
    forest_join_350: {
    forest_join_317: {
    forest_join_313: {
    forest_join_312: {
    life11_361 = ((java.util.Map.Entry)(forestValue685_286_0));
    life12_365 = ((moom.vB)(((java.util.Map.Entry)(life11_361)).getValue()));
    life13_368 = ((moom.vB)(life12_365)).a();
    spill685_17 = life12_365;
    if (!((life7_5 != 0))) {
        forestValue685_313_0 = spill685_17;
        break forest_join_313;
    }
    if (!((((moom.vB)(spill685_17)).a__Int() != 1))) {
        break forest_join_312;
    }
    spill685_18 = life12_365;
    if (!((life7_5 != 0))) {
        forestValue685_313_0 = spill685_18;
        break forest_join_313;
    }
    if (!((((moom.vB)(spill685_18)).a__Int() != 2))) {
        break forest_join_312;
    }
    life15_390 = ((moom.vB)(life12_365)).a();
    if (!((life7_5 == 0))) {
        break forest_join_317;
    }
    }
    forestValue685_313_0 = life12_365;
    }
    life15_390 = (((moom.vB)(forestValue685_313_0)).a() * 0x1.9p6d);
    }
    spill685_19 = recovery.source.CarrierOps.dcmpl(((double)(life13_368)), ((double)(0x0.0p0d)));
    if (!((life7_5 != 0))) {
        forestValue685_353_0 = spill685_19;
        break forest_join_353;
    }
    if (!((spill685_19 > 0))) {
        break forest_join_350;
    }
    spill685_20 = p2;
    spill685_21 = net.minecraft.util.EnumChatFormatting.BLUE;
    spill685_22 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_123(((moom.vB)(life12_365)).a__Int());
    java.lang.Object[] __stackOp685_124_0 = new java.lang.Object[2];
    spill685_23 = __stackOp685_124_0;
    (__stackOp685_124_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_390)));
    java.lang.Object[] __stackOp685_127_0 = spill685_23;
    spill685_24 = __stackOp685_127_0;
    (__stackOp685_127_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_130(((java.lang.String)(((java.util.Map.Entry)(life11_361)).getKey()))))));
    ((java.util.List)(spill685_20)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_133(spill685_21, net.minecraft.util.StatCollector.a(((java.lang.String)(spill685_22)), ((java.lang.Object[])(spill685_24)))))));
    if (!((life7_5 == 0))) {
        break forest_join_385;
    }
    }
    forestValue685_353_0 = recovery.source.CarrierOps.dcmpg(((double)(life13_368)), ((double)(0x0.0p0d)));
    }
    if (!((life7_5 != 0))) {
        forestValue685_384_0 = forestValue685_353_0;
        break forest_join_384;
    }
    if (!((forestValue685_353_0 < 0))) {
        break forest_join_385;
    }
    life15_452 = (life15_390 * -0x1.0p0d);
    spill685_25 = p2;
    spill685_26 = net.minecraft.util.EnumChatFormatting.RED;
    spill685_27 = __sourceIntrinsic_9085c89dbf75_invokedynamic685_138(((moom.vB)(life12_365)).a__Int());
    java.lang.Object[] __stackOp685_139_0 = new java.lang.Object[2];
    spill685_28 = __stackOp685_139_0;
    (__stackOp685_139_0)[0] = ((java.text.DecimalFormat)(net.minecraft.item.ItemStack.a)).format(((double)(life15_452)));
    java.lang.Object[] __stackOp685_142_0 = spill685_28;
    spill685_29 = __stackOp685_142_0;
    (__stackOp685_142_0)[1] = net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_145(((java.lang.String)(((java.util.Map.Entry)(life11_361)).getKey()))))));
    forestValue685_384_0 = ((((java.util.List)(spill685_25)).add(((java.lang.Object)(__sourceIntrinsic_9085c89dbf75_invokedynamic685_148(spill685_26, net.minecraft.util.StatCollector.a(((java.lang.String)(spill685_27)), ((java.lang.Object[])(spill685_29)))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue685_384_0);
    }
    if (!((life7_5 == 0))) {
        break forest_join_388;
    }
    break forest_join_394;
    }
    if (!(((java.util.Iterator)(life10_35)).hasNext())) {
        break forest_join_394;
    }
    spill685_30 = ((java.util.Iterator)(life10_35)).next();
    forestValue685_286_0 = spill685_30;
    continue forest_cycle_286;
    }
    }
    return;
}


public moom.a1 a__a1(net.minecraft.item.ItemStack p0) {
return moom.a1.DRINK;
}


private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3e6a1ebf0001_invokedynamic1126_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a92510638ee_invokedynamic5479_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_36(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_39(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9085c89dbf75_invokedynamic685_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_43(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_47(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_50(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_57(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_64(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_83(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_90(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_93(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_98(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_105(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_108(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_123(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_130(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_133(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_138(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_145(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9085c89dbf75_invokedynamic685_148(net.minecraft.util.EnumChatFormatting a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_415cae4db048_invokedynamic5482_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_43fb644d1c12_originalDynamicSite2025_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f2f2873fc9a_invokedynamic1628_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2f2f2873fc9a_invokedynamic1628_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11920_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic5487_10(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic5487_18(java.lang.String a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic5487_21(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_480a975002ff_invokedynamic5487_27(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
