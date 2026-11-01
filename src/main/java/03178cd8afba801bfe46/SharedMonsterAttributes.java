package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class SharedMonsterAttributes {

private static final org.apache.logging.log4j.Logger a;

public static final net.minecraft.entity.ai.attributes.IAttribute b;

public static final net.minecraft.entity.ai.attributes.IAttribute c;

public static final net.minecraft.entity.ai.attributes.IAttribute d;

public static final net.minecraft.entity.ai.attributes.IAttribute e;

public static final net.minecraft.entity.ai.attributes.IAttribute f;

private static int g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

public SharedMonsterAttributes() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-5216158747381259596L)), ((long)(-5023001970553876304L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(194163829701932L)))));
    int __sourceSpill1189_6 = 0;
    k = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.SharedMonsterAttributes.b(((int)(__sourceSpill1189_6)));
    long local0_life9 = (net.minecraft.entity.SharedMonsterAttributes.h ^ 92462221138411L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1189_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1189_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1189_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1189_16 = new byte[8];
    (__sourceSpill1189_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1189_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1189_18 = __sourceSpill1189_16;
    ((javax.crypto.Cipher)(__sourceSpill1189_13)).init(((int)(__sourceSpill1189_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1189_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1189_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "#.U¦¨Ipy»-Û«"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1189_27 = local6_life23;
        int __sourceSpill1189_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1189_27)).substring(((int)(__sourceSpill1189_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1189_32 = local8_life21;
        int __sourceSpill1189_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1189_35 = new byte[8];
        (__sourceSpill1189_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1189_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1189_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1189_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1189_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1189_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1189_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1189_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1189_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1189_36)).doFinal(((byte[])(__sourceSpill1189_35)));
        (__sourceSpill1189_32)[__sourceSpill1189_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "generic.maxHealth", 0x1.4p4d, 0x0.0p0d, 0x1.0p10d))).a(((java.lang.String)("Max Health"))))).a(((boolean)(true)))));
    c = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "generic.followRange", 0x1.0p5d, 0x0.0p0d, 0x1.0p11d))).a(((java.lang.String)("Follow Range")))));
    d = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "generic.knockbackResistance", 0x0.0p0d, 0x0.0p0d, 0x1.0p0d))).a(((java.lang.String)("Knockback Resistance")))));
    e = ((net.minecraft.entity.ai.attributes.IAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(((net.minecraft.entity.ai.attributes.RangedAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "generic.movementSpeed", 0x1.666666p-1d, 0x0.0p0d, 0x1.0p10d))).a(((java.lang.String)("Movement Speed"))))).a(((boolean)(true)))));
    f = ((net.minecraft.entity.ai.attributes.IAttribute)(new net.minecraft.entity.ai.attributes.RangedAttribute(null, "generic.attackDamage", 0x1.0p1d, 0x0.0p0d, 0x1.0p11d)));
}


public static int b() {
return net.minecraft.entity.SharedMonsterAttributes.g;
}


public static void b(int p0) {
net.minecraft.entity.SharedMonsterAttributes.g = ((int)(p0));
    return;
}


public static int c() {
int local0 = net.minecraft.entity.SharedMonsterAttributes.b();
    if ((local0 == 0)) {
        return 122;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10519;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ub", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.SharedMonsterAttributes.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11262_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ub"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static net.minecraft.nbt.NBTTagCompound a(moom.vB p0) {
net.minecraft.nbt.NBTTagCompound local1 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("Name")), ((java.lang.String)(((moom.vB)(p0)).a__String())));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("Amount")), ((double)(((moom.vB)(p0)).a())));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a__Void(((java.lang.String)("Operation")), ((int)(((moom.vB)(p0)).a__Int())));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("UUIDMost")), ((long)(((java.util.UUID)(((moom.vB)(p0)).a__UUID())).getMostSignificantBits())));
    ((net.minecraft.nbt.NBTTagCompound)(local1)).a(((java.lang.String)("UUIDLeast")), ((long)(((java.util.UUID)(((moom.vB)(p0)).a__UUID())).getLeastSignificantBits())));
    return local1;
}


public static void a(net.minecraft.entity.ai.attributes.BaseAttributeMap p0, net.minecraft.nbt.NBTTagList p1) {
net.minecraft.entity.ai.attributes.IAttributeInstance lexicalValue1548_27_0;
    int spill1548_0;
    net.minecraft.entity.ai.attributes.IAttributeInstance spill1548_1;
    long life2_3;
    int life5_6;
    int life4_7;
    net.minecraft.nbt.NBTTagCompound life6_15;
    net.minecraft.entity.ai.attributes.IAttributeInstance life7_21;
    lexical_join_40: {
    life2_3 = (net.minecraft.entity.SharedMonsterAttributes.h ^ 126090537197922L);
    spill1548_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_6 = 0;
    life4_7 = spill1548_0;
    lexical_cycle_8: while (true) {
    lexical_join_37: {
    lexical_join_31: {
    lexical_join_27: {
    if (!((life5_6 < ((net.minecraft.nbt.NBTTagList)(p1)).a__Int()))) {
        break lexical_join_40;
    }
    life6_15 = ((net.minecraft.nbt.NBTTagList)(p1)).a__yw(((int)(life5_6)));
    life7_21 = ((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p0)).a(((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Name"))))));
    spill1548_1 = life7_21;
    if (!((life4_7 == 0))) {
        lexicalValue1548_27_0 = spill1548_1;
        break lexical_join_27;
    }
    if (!((spill1548_1 != null))) {
        break lexical_join_31;
    }
    lexicalValue1548_27_0 = life7_21;
    }
    net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.entity.ai.attributes.IAttributeInstance)(lexicalValue1548_27_0)), ((net.minecraft.nbt.NBTTagCompound)(life6_15)));
    if (!((life4_7 != 0))) {
        break lexical_join_37;
    }
    }
    ((org.apache.logging.log4j.Logger)(net.minecraft.entity.SharedMonsterAttributes.a)).warn(((java.lang.String)(__sourceIntrinsic_31f0df7ac3fe_invokedynamic1548_9(((net.minecraft.nbt.NBTTagCompound)(life6_15)).a__String(((java.lang.String)("Name")))))));
    }
    life5_6 += 1;
    if (!((life4_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static void a(net.minecraft.entity.ai.attributes.IAttributeInstance p0, net.minecraft.nbt.NBTTagCompound p1) {
net.minecraft.nbt.NBTTagCompound lexicalValue1550_29_0;
    java.lang.String lexicalValue1550_29_1;
    int lexicalValue1550_29_2;
    int spill1550_0;
    net.minecraft.nbt.NBTTagCompound spill1550_1;
    java.lang.String spill1550_2;
    int spill1550_3;
    long life2_3;
    int life4_10;
    net.minecraft.nbt.NBTTagList life5_36;
    int life6_38;
    moom.vB life7_47;
    moom.vB life8_59;
    lexical_join_62: {
    lexical_join_29: {
    life2_3 = (net.minecraft.entity.SharedMonsterAttributes.h ^ 75834330936462L);
    spill1550_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a(((double)(((net.minecraft.nbt.NBTTagCompound)(p1)).a__Double(((java.lang.String)("Base"))))));
    life4_10 = spill1550_0;
    spill1550_1 = p1;
    spill1550_2 = "Modifiers";
    spill1550_3 = __sourceIntrinsic_df5ac899919f_invokedynamic1550_4(22676, (696684632095894984L ^ life2_3));
    if (!((life4_10 != 0))) {
        lexicalValue1550_29_0 = spill1550_1;
        lexicalValue1550_29_1 = spill1550_2;
        lexicalValue1550_29_2 = spill1550_3;
        break lexical_join_29;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill1550_1)).a__Boolean(((java.lang.String)(spill1550_2)), ((int)(spill1550_3))))) {
        break lexical_join_62;
    }
    lexicalValue1550_29_0 = p1;
    lexicalValue1550_29_1 = "Modifiers";
    lexicalValue1550_29_2 = __sourceIntrinsic_df5ac899919f_invokedynamic1550_6(27377, (1548379571264036780L ^ life2_3));
    }
    life5_36 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue1550_29_0)).a(((java.lang.String)(lexicalValue1550_29_1)), ((int)(lexicalValue1550_29_2)));
    life6_38 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_56: {
    if (!((life6_38 < ((net.minecraft.nbt.NBTTagList)(life5_36)).a__Int()))) {
        break lexical_join_62;
    }
    life7_47 = net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life5_36)).a__yw(((int)(life6_38))))));
    if (!((life4_10 != 0))) {
        break lexical_join_60;
    }
    if (!((life7_47 != null))) {
        break lexical_join_59;
    }
    life8_59 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a(((java.util.UUID)(((moom.vB)(life7_47)).a__UUID())));
    if (!((life8_59 != null))) {
        break lexical_join_56;
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).b(((moom.vB)(life8_59)));
    }
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a(((moom.vB)(life7_47)));
    }
    life6_38 += 1;
    }
    if (!((life4_10 == 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    return;
}


public static moom.vB a(net.minecraft.nbt.NBTTagCompound p0) {
java.util.UUID local1 = new java.util.UUID(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Long(((java.lang.String)("UUIDMost"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Long(((java.lang.String)("UUIDLeast"))));
    try {
        return new moom.vB(local1, ((net.minecraft.nbt.NBTTagCompound)(p0)).a__String(((java.lang.String)("Name"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Double(((java.lang.String)("Amount"))), ((net.minecraft.nbt.NBTTagCompound)(p0)).a__Int(((java.lang.String)("Operation"))));
    } catch (java.lang.Exception caught2) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.entity.SharedMonsterAttributes.a)).warn(((java.lang.String)(__sourceIntrinsic_d53e8e24cf99_invokedynamic11265_7(((java.lang.Exception)(caught2)).getMessage()))));
        return null;
    }
}


public static net.minecraft.nbt.NBTTagList a(net.minecraft.entity.ai.attributes.BaseAttributeMap p0) {
net.minecraft.nbt.NBTTagList lexicalValue1547_30_0;
    int spill1547_0;
    net.minecraft.nbt.NBTTagList spill1547_1;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    int life3_9;
    java.util.Iterator life5_13;
    net.minecraft.entity.ai.attributes.IAttributeInstance life6_20;
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (net.minecraft.entity.SharedMonsterAttributes.h ^ 30906240735781L);
    spill1547_0 = net.minecraft.entity.SharedMonsterAttributes.c();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life3_9 = spill1547_0;
    life5_13 = ((java.util.Collection)(((net.minecraft.entity.ai.attributes.BaseAttributeMap)(p0)).a())).iterator();
    lexical_cycle_14: while (true) {
    if (!(((java.util.Iterator)(life5_13)).hasNext())) {
        break lexical_join_29;
    }
    life6_20 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((java.util.Iterator)(life5_13)).next()));
    spill1547_1 = life4_8;
    if (!((life3_9 != 0))) {
        lexicalValue1547_30_0 = spill1547_1;
        break lexical_join_30;
    }
    ((net.minecraft.nbt.NBTTagList)(spill1547_1)).a(((net.minecraft.nbt.NBTBase)(net.minecraft.entity.SharedMonsterAttributes.a(((net.minecraft.entity.ai.attributes.IAttributeInstance)(life6_20))))));
    if (!((life3_9 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1547_30_0 = life4_8;
    }
    return lexicalValue1547_30_0;
}


private static net.minecraft.nbt.NBTTagCompound a(net.minecraft.entity.ai.attributes.IAttributeInstance p0) {
java.util.Collection lexicalValue1549_31_0;
    int spill1549_0;
    java.util.Collection spill1549_1;
    long life1_3;
    net.minecraft.nbt.NBTTagCompound life4_7;
    net.minecraft.entity.ai.attributes.IAttribute life5_11;
    int life3_22;
    java.util.Collection life6_25;
    net.minecraft.nbt.NBTTagList life7_39;
    java.util.Iterator life8_42;
    moom.vB life9_49;
    lexical_join_62: {
    lexical_join_58: {
    lexical_join_31: {
    life1_3 = (net.minecraft.entity.SharedMonsterAttributes.h ^ 30375780766414L);
    life4_7 = new net.minecraft.nbt.NBTTagCompound();
    spill1549_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life5_11 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a__vG();
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a(((java.lang.String)("Name")), ((java.lang.String)(((net.minecraft.entity.ai.attributes.IAttribute)(life5_11)).a__String())));
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a(((java.lang.String)("Base")), ((double)(((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a())));
    life3_22 = spill1549_0;
    life6_25 = ((net.minecraft.entity.ai.attributes.IAttributeInstance)(p0)).a__Collection();
    spill1549_1 = life6_25;
    if (!((life3_22 == 0))) {
        lexicalValue1549_31_0 = spill1549_1;
        break lexical_join_31;
    }
    if (!((spill1549_1 != null))) {
        break lexical_join_62;
    }
    lexicalValue1549_31_0 = life6_25;
    }
    if (!((!((java.util.Collection)(lexicalValue1549_31_0)).isEmpty()))) {
        break lexical_join_62;
    }
    life7_39 = new net.minecraft.nbt.NBTTagList();
    life8_42 = ((java.util.Collection)(life6_25)).iterator();
    lexical_cycle_40: while (true) {
    lexical_join_56: {
    if (!(((java.util.Iterator)(life8_42)).hasNext())) {
        break lexical_join_58;
    }
    life9_49 = ((moom.vB)(((java.util.Iterator)(life8_42)).next()));
    if (!((life3_22 == 0))) {
        break lexical_join_62;
    }
    if (!(((moom.vB)(life9_49)).a__Boolean())) {
        break lexical_join_56;
    }
    ((net.minecraft.nbt.NBTTagList)(life7_39)).a(((net.minecraft.nbt.NBTBase)(net.minecraft.entity.SharedMonsterAttributes.a(((moom.vB)(life9_49))))));
    }
    if (!((life3_22 != 0))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(life4_7)).a(((java.lang.String)("Modifiers")), ((net.minecraft.nbt.NBTBase)(life7_39)));
    }
    return life4_7;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11262_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_31f0df7ac3fe_invokedynamic1548_9(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df5ac899919f_invokedynamic1550_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_df5ac899919f_invokedynamic1550_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d53e8e24cf99_invokedynamic11265_7(java.lang.String a0) throws E;
}
