package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sD extends net.minecraft.entity.EntityHanging {

private static final long cb;

private static final long[] hb;

private static final java.lang.Integer[] ib;

private static final java.util.Map jb;

public sD(net.minecraft.world.World p0) {
super(p0);
}


public sD(net.minecraft.world.World p0, moom.DT p1) {
super(p0, p1);
    ((moom.sD)(this)).a__Void(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))));
    float local3 = 0x1.0p-3f;
    float local4 = 0x1.8p-3f;
    float local5 = 0x1.0p-2f;
    ((moom.sD)(this)).a(((moom.CA)(new moom.CA((((moom.sD)(this)).n - 0x1.8p-3d), ((((moom.sD)(this)).o - 0x1.0p-2d) + 0x1.0p-3d), (((moom.sD)(this)).p - 0x1.8p-3d), (((moom.sD)(this)).n + 0x1.8p-3d), ((((moom.sD)(this)).o + 0x1.0p-2d) + 0x1.0p-3d), (((moom.sD)(this)).p + 0x1.8p-3d)))));
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-7752790527103797190L)), ((long)(-4023661582296151880L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(202438336009730L)))));
    jb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sD.cb ^ 95136559266509L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1008_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1008_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1008_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1008_14 = new byte[8];
    (__sourceSpill1008_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1008_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1008_16 = __sourceSpill1008_14;
    ((javax.crypto.Cipher)(__sourceSpill1008_11)).init(((int)(__sourceSpill1008_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1008_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1008_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "0Ä9¸¤X\f0\001å\007^upC"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1008_25 = local6_life21;
        int __sourceSpill1008_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1008_25)).substring(((int)(__sourceSpill1008_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1008_30 = local8_life19;
        int __sourceSpill1008_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1008_33 = new byte[8];
        (__sourceSpill1008_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1008_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1008_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1008_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1008_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1008_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1008_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1008_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1008_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1008_34)).doFinal(((byte[])(__sourceSpill1008_33)));
        (__sourceSpill1008_30)[__sourceSpill1008_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    hb = ((long[])(local8_life19));
    ib = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public static moom.sD b(net.minecraft.world.World p0, moom.DT p1) {
moom.sD lexicalValue1295_62_0;
    int spill1295_0;
    moom.sD spill1295_1;
    long life2_3;
    int life5_6;
    int life6_10;
    int life4_11;
    int life7_14;
    java.util.Iterator life8_46;
    moom.sD life9_53;
    lexical_join_65: {
    life2_3 = (moom.sD.cb ^ 137292094877123L);
    life5_6 = ((moom.DT)(p1)).a();
    spill1295_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life6_10 = ((moom.DT)(p1)).b();
    life4_11 = spill1295_0;
    life7_14 = ((moom.DT)(p1)).c();
    life8_46 = ((java.util.List)(((net.minecraft.world.World)(p0)).a(((java.lang.Class)(moom.sD.class)), ((moom.CA)(new moom.CA((((double) life5_6) - 0x1.0p0d), (((double) life6_10) - 0x1.0p0d), (((double) life7_14) - 0x1.0p0d), (((double) life5_6) + 0x1.0p0d), (((double) life6_10) + 0x1.0p0d), (((double) life7_14) + 0x1.0p0d))))))).iterator();
    lexical_cycle_47: while (true) {
    lexical_join_63: {
    lexical_join_62: {
    if (!(((java.util.Iterator)(life8_46)).hasNext())) {
        break lexical_join_65;
    }
    life9_53 = ((moom.sD)(((java.util.Iterator)(life8_46)).next()));
    spill1295_1 = life9_53;
    if (!((life4_11 == 0))) {
        lexicalValue1295_62_0 = spill1295_1;
        break lexical_join_62;
    }
    if (!(((moom.DT)(((moom.sD)(spill1295_1)).b__DT())).equals(((java.lang.Object)(p1))))) {
        break lexical_join_63;
    }
    lexicalValue1295_62_0 = life9_53;
    }
    return lexicalValue1295_62_0;
    }
    if (!((life4_11 != 0))) { continue lexical_cycle_47; }
    break lexical_cycle_47;
    }
    }
    return null;
}


public boolean b__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack lexicalValue1296_16_0;
    net.minecraft.entity.Entity lexicalValue1296_78_0;
    net.minecraft.entity.EntityLiving lexicalValue1296_81_0;
    int lexicalValue1296_91_0;
    net.minecraft.entity.Entity lexicalValue1296_159_0;
    net.minecraft.entity.EntityLiving lexicalValue1296_162_0;
    int lexicalValue1296_168_0;
    int spill1296_0;
    net.minecraft.item.ItemStack spill1296_1;
    boolean spill1296_2;
    net.minecraft.entity.EntityLiving spill1296_3;
    boolean spill1296_4;
    net.minecraft.entity.EntityLiving spill1296_5;
    int spill1296_6;
    boolean spill1296_7;
    net.minecraft.entity.EntityLiving spill1296_8;
    boolean spill1296_9;
    net.minecraft.entity.EntityLiving spill1296_10;
    long life2_3;
    net.minecraft.item.ItemStack life5_6;
    int life6_9;
    int life4_10;
    double life7_35;
    java.util.Iterator life9_68;
    net.minecraft.entity.EntityLiving life10_75;
    double life7_146;
    java.util.Iterator life9_179;
    net.minecraft.entity.EntityLiving life10_186;
    lexical_join_168: {
    lexical_join_167: {
    lexical_join_91: {
    lexical_join_88: {
    lexical_join_16: {
    life2_3 = (moom.sD.cb ^ 123569606929749L);
    life5_6 = ((net.minecraft.entity.player.EntityPlayer)(p0)).a__xW();
    spill1296_0 = net.minecraft.entity.SharedMonsterAttributes.b();
    life6_9 = 0;
    life4_10 = spill1296_0;
    spill1296_1 = life5_6;
    if (!((life4_10 == 0))) {
        lexicalValue1296_16_0 = spill1296_1;
        break lexical_join_16;
    }
    if (!((spill1296_1 != null))) {
        break lexical_join_88;
    }
    lexicalValue1296_16_0 = life5_6;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1296_16_0)).a__wQ() == net.minecraft.init.Items.b2))) {
        break lexical_join_88;
    }
    spill1296_2 = ((net.minecraft.world.World)(((moom.sD)(this)).i)).G;
    if (!((life4_10 == 0))) {
        lexicalValue1296_91_0 = ((spill1296_2) ? 1 : 0);
        break lexical_join_91;
    }
    if (!((!spill1296_2))) {
        break lexical_join_88;
    }
    life7_35 = 0x1.cp2d;
    life9_68 = ((java.util.List)(((net.minecraft.world.World)(((moom.sD)(this)).i)).a(((java.lang.Class)(net.minecraft.entity.EntityLiving.class)), ((moom.CA)(new moom.CA((((moom.sD)(this)).n - life7_35), (((moom.sD)(this)).o - life7_35), (((moom.sD)(this)).p - life7_35), (((moom.sD)(this)).n + life7_35), (((moom.sD)(this)).o + life7_35), (((moom.sD)(this)).p + life7_35))))))).iterator();
    lexical_cycle_60: while (true) {
    lexical_join_86: {
    lexical_join_81: {
    lexical_join_78: {
    if (!(((java.util.Iterator)(life9_68)).hasNext())) {
        break lexical_join_88;
    }
    life10_75 = ((net.minecraft.entity.EntityLiving)(((java.util.Iterator)(life9_68)).next()));
    spill1296_3 = life10_75;
    if (!((life4_10 == 0))) {
        lexicalValue1296_78_0 = spill1296_3;
        break lexical_join_78;
    }
    spill1296_4 = ((net.minecraft.entity.EntityLiving)(spill1296_3)).T__Boolean();
    if (!((life4_10 == 0))) {
        lexicalValue1296_91_0 = ((spill1296_4) ? 1 : 0);
        break lexical_join_91;
    }
    if (!(spill1296_4)) {
        break lexical_join_86;
    }
    spill1296_5 = life10_75;
    if (!((life4_10 == 0))) {
        lexicalValue1296_81_0 = spill1296_5;
        break lexical_join_81;
    }
    lexicalValue1296_78_0 = ((net.minecraft.entity.EntityLiving)(spill1296_5)).c__sourceReturn_09c029d8c3();
    }
    if (!((lexicalValue1296_78_0 == p0))) {
        break lexical_join_86;
    }
    lexicalValue1296_81_0 = life10_75;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1296_81_0)).a(((net.minecraft.entity.Entity)(this)), ((boolean)(true)));
    life6_9 = 1;
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    lexicalValue1296_91_0 = ((((net.minecraft.world.World)(((moom.sD)(this)).i)).G) ? 1 : 0);
    }
    if (!((life4_10 == 0))) {
        lexicalValue1296_168_0 = lexicalValue1296_91_0;
        break lexical_join_168;
    }
    if (!((lexicalValue1296_91_0 == 0))) {
        break lexical_join_167;
    }
    spill1296_6 = life6_9;
    if (!((life4_10 == 0))) {
        lexicalValue1296_168_0 = spill1296_6;
        break lexical_join_168;
    }
    if (!((spill1296_6 == 0))) {
        break lexical_join_167;
    }
    ((moom.sD)(this)).f__Void();
    spill1296_7 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_10 == 0))) {
        lexicalValue1296_168_0 = ((spill1296_7) ? 1 : 0);
        break lexical_join_168;
    }
    if (!(spill1296_7)) {
        break lexical_join_167;
    }
    life7_146 = 0x1.cp2d;
    life9_179 = ((java.util.List)(((net.minecraft.world.World)(((moom.sD)(this)).i)).a(((java.lang.Class)(net.minecraft.entity.EntityLiving.class)), ((moom.CA)(new moom.CA((((moom.sD)(this)).n - life7_146), (((moom.sD)(this)).o - life7_146), (((moom.sD)(this)).p - life7_146), (((moom.sD)(this)).n + life7_146), (((moom.sD)(this)).o + life7_146), (((moom.sD)(this)).p + life7_146))))))).iterator();
    lexical_cycle_141: while (true) {
    lexical_join_165: {
    lexical_join_162: {
    lexical_join_159: {
    if (!(((java.util.Iterator)(life9_179)).hasNext())) {
        break lexical_join_167;
    }
    life10_186 = ((net.minecraft.entity.EntityLiving)(((java.util.Iterator)(life9_179)).next()));
    spill1296_8 = life10_186;
    if (!((life4_10 == 0))) {
        lexicalValue1296_159_0 = spill1296_8;
        break lexical_join_159;
    }
    spill1296_9 = ((net.minecraft.entity.EntityLiving)(spill1296_8)).T__Boolean();
    if (!((life4_10 == 0))) {
        lexicalValue1296_168_0 = ((spill1296_9) ? 1 : 0);
        break lexical_join_168;
    }
    if (!(spill1296_9)) {
        break lexical_join_165;
    }
    spill1296_10 = life10_186;
    if (!((life4_10 == 0))) {
        lexicalValue1296_162_0 = spill1296_10;
        break lexical_join_162;
    }
    lexicalValue1296_159_0 = ((net.minecraft.entity.EntityLiving)(spill1296_10)).c__sourceReturn_09c029d8c3();
    }
    if (!((lexicalValue1296_159_0 == this))) {
        break lexical_join_165;
    }
    lexicalValue1296_162_0 = life10_186;
    }
    ((net.minecraft.entity.EntityLiving)(lexicalValue1296_162_0)).a(((boolean)(true)), ((boolean)(false)));
    }
    if (!((life4_10 != 0))) { continue lexical_cycle_141; }
    break lexical_cycle_141;
    }
    }
    lexicalValue1296_168_0 = 1;
    }
    return ((lexicalValue1296_168_0) != 0);
}


public boolean b__Boolean(net.minecraft.nbt.NBTTagCompound p0) {
return ((0) != 0);
}


public boolean b__Boolean() {
return ((((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((moom.sD)(this)).i)).a__fE(((moom.DT)(((moom.sD)(this)).aF))))).a__ch() instanceof moom.dz) ? 1 : 0)) != 0);
}


public int b__sourceReturn_8abf5c6871() {
long local1 = (moom.sD.cb ^ 3727241642913L);
    return __sourceIntrinsic_e1958f95391c_originalDynamicSite1630_1(2235, (1535492732376260500L ^ local1));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public float e__Float() {
return -0x1.0p-4f;
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sD.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int c(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xF3F;
        if (ib[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = hb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])jb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    jb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sD.ib[n2] = n3;
        }
        return ib[n2];
}


public void c(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral8993_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void f(net.minecraft.entity.Entity p0) {
return;
}


public void d(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void d__Void() {
super.d__Void();
    return;
}


public boolean a(double p0) {
int forwardValue3945_13_0;
    int forwardValue3945_15_0;
    int spill3945_0;
    long life3_3;
    int life5_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (moom.sD.cb ^ 89549328404736L);
    life5_5 = net.minecraft.entity.SharedMonsterAttributes.c();
    spill3945_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x1.0p10d)));
    if (!((life5_5 != 0))) {
        forwardValue3945_13_0 = spill3945_0;
        break forward_join_13;
    }
    if (!((spill3945_0 < 0))) {
        break forward_join_14;
    }
    forwardValue3945_13_0 = 1;
    }
    forwardValue3945_15_0 = forwardValue3945_13_0;
    break forward_join_15;
    }
    forwardValue3945_15_0 = 0;
    }
    return ((forwardValue3945_15_0) != 0);
}


public static moom.sD a(net.minecraft.world.World p0, moom.DT p1) {
moom.sD local2 = new moom.sD(p0, p1);
    ((moom.sD)(local2)).h = ((boolean)(true));
    ((net.minecraft.world.World)(p0)).b__Boolean(((net.minecraft.entity.Entity)(local2)));
    return local2;
}


public void a(moom.bs p0) {
return;
}


public int a() {
long local1 = (moom.sD.cb ^ 104027119370486L);
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite1631_1(3608, (6077728181991266913L ^ local1));
}


private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite1630_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral8993_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite1631_1(int a0, long a1) throws E;
}
