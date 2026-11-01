package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sY extends moom.sW implements net.minecraft.entity.IRangedAttackMob {

private static long db;

private static long[] jb;

private static java.lang.Integer[] kb;

private static java.util.Map ub;

public sY(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_2b5356f40318afdb(moom.sY receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.sY.db ^ 84584824766686L);

    moom.sY.__sourceConstructorInit_2b5356f40318afdb_0(((moom.sY)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.sY)(receiver)).a__Void(((float)(0x1.666666p-1f)), ((float)(0x1.e66666p0f)));

    ((moom.AW)(((moom.AW)(__sourceExactCall_4a5a71052291a7(((moom.sY)(receiver))))))).a(((boolean)(true)));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sY)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.ud(receiver, 0x1.4p0d, __sourceIntrinsic_2b5356f40318afdb_originalDynamicSite2779_7(21811, (3465901154950342226L ^ local2)), 0x1.4p3f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sY)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sY)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sY)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uy(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sY)(receiver)).bK)).a(((int)(1)), ((moom.uc)(new moom.uV(receiver, net.minecraft.entity.EntityLiving.class, __sourceIntrinsic_2b5356f40318afdb_originalDynamicSite2779_18(32216, (3230273843530354363L ^ local2)), true, false, moom.vP.a))));

    return;

}



static {
db = ((long)(((moom._a)(moom._c.a(((long)(-6578383422701184256L)), ((long)(-2049690017335130664L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(53622246098351L)))));
    ub = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sY.db ^ 67305328998022L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1011_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1011_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1011_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1011_14 = new byte[8];
    (__sourceSpill1011_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1011_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1011_16 = __sourceSpill1011_14;
    ((javax.crypto.Cipher)(__sourceSpill1011_11)).init(((int)(__sourceSpill1011_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1011_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1011_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "L\001o·ô/¹\025.z=Ä²Y\027/\004Ó\004Ixe"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1011_25 = local6_life21;
        int __sourceSpill1011_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1011_25)).substring(((int)(__sourceSpill1011_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1011_30 = local8_life19;
        int __sourceSpill1011_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1011_33 = new byte[8];
        (__sourceSpill1011_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1011_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1011_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1011_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1011_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1011_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1011_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1011_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1011_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1011_34)).doFinal(((byte[])(__sourceSpill1011_33)));
        (__sourceSpill1011_30)[__sourceSpill1011_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    jb = ((long[])(local8_life19));
    kb = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_2b5356f40318afdb_0(moom.sY a0, net.minecraft.world.World a1) throws E;

protected void b(boolean p0, int p1) {
net.minecraft.entity.Entity[] spill1303_0;
    long life3_3;
    int life6_13;
    int life7_15;
    net.minecraft.entity.Entity[] life5_16;
    lexical_join_28: {
    life3_3 = (moom.sY.db ^ 81110201555776L);
    spill1303_0 = moom.vN.b();
    life6_13 = ((java.util.Random)(this.ah)).nextInt(((int)(__sourceIntrinsic_2a5034734c2d_invokedynamic1303_3(31771, (845577532739917031L ^ life3_3)))));
    life7_15 = 0;
    life5_16 = spill1303_0;
    lexical_cycle_17: while (true) {
    if (!((life7_15 < life6_13))) {
        break lexical_join_28;
    }
    ((moom.sY)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aD)), ((int)(1)));
    life7_15 += 1;
    if (!((life5_16 != null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return;
}


public float e__Float() {
return 0x1.b33334p0f;
}


private static int d(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4E6A;
        if (kb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = jb[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])ub.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    ub.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sY.kb[n2] = n3;
        }
        return kb[n2];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_fffb27364b07b9(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9040_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.aD;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.sY)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.0p2d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.sY)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.99999ap-3d)));
    return;
}


public void a(net.minecraft.entity.EntityLivingBase p0, float p1) {
moom.tX local3 = new moom.tX(this.i, this);
    double local4 = ((((net.minecraft.entity.EntityLivingBase)(p0)).o + ((double) ((net.minecraft.entity.EntityLivingBase)(p0)).e__Float())) - 0x1.19999ap0d);
    double local6 = (((net.minecraft.entity.EntityLivingBase)(p0)).n - this.n);
    double local8 = (local4 - ((moom.tX)(local3)).o);
    double local10 = (((net.minecraft.entity.EntityLivingBase)(p0)).p - this.p);
    float local12 = (moom.Dr.a__Float(((double)(((local6 * local6) + (local10 * local10))))) * 0x1.99999ap-3f);
    ((moom.tX)(local3)).a(((double)(local6)), ((double)((local8 + ((double) local12)))), ((double)(local10)), ((float)(0x1.99999ap0f)), ((float)(0x1.8p3f)));
    ((moom.sY)(this)).a(((java.lang.String)("random.bow")), ((float)(0x1.0p0f)), ((float)((0x1.0p0f / ((((java.util.Random)(((moom.sY)(this)).a__Random())).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f)))));
    ((net.minecraft.world.World)(this.i)).b__Boolean(((net.minecraft.entity.Entity)(local3)));
    return;
}


public void G() {
int lexicalValue1302_17_0;
    int lexicalValue1302_54_0;
    int lexicalValue1302_63_0;
    int lexicalValue1302_143_0;
    int lexicalValue1302_152_0;
    net.minecraft.entity.Entity[] spill1302_0;
    boolean spill1302_1;
    boolean spill1302_2;
    int spill1302_3;
    long life1_3;
    net.minecraft.entity.Entity[] life3_7;
    int life4_23;
    int life5_27;
    int life6_31;
    int life7_81;
    int life4_100;
    int life5_104;
    int life6_122;
    moom.DT life8_129;
    lexical_join_156: {
    lexical_join_63: {
    lexical_join_62: {
    lexical_join_54: {
    lexical_join_36: {
    lexical_join_17: {
    life1_3 = (moom.sY.db ^ 7164501911874L);
    spill1302_0 = moom.vN.b();
    super.G();
    life3_7 = spill1302_0;
    spill1302_1 = ((net.minecraft.world.World)(this.i)).G;
    if (!((life3_7 == null))) {
        lexicalValue1302_17_0 = ((spill1302_1) ? 1 : 0);
        break lexical_join_17;
    }
    if (!((!spill1302_1))) {
        break lexical_join_156;
    }
    lexicalValue1302_17_0 = moom.Dr.b__Int(((double)(this.n)));
    }
    life4_23 = lexicalValue1302_17_0;
    life5_27 = moom.Dr.b__Int(((double)(this.o)));
    life6_31 = moom.Dr.b__Int(((double)(this.p)));
    spill1302_2 = ((moom.sY)(this)).i__Boolean();
    if (!((life3_7 == null))) {
        lexicalValue1302_54_0 = ((spill1302_2) ? 1 : 0);
        break lexical_join_54;
    }
    if (!(spill1302_2)) {
        break lexical_join_36;
    }
    ((moom.sY)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.f)), ((float)(0x1.0p0f)));
    }
    lexicalValue1302_54_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.i)).a__ES(((moom.DT)(new moom.DT(life4_23, 0, life6_31)))))).a(((moom.DT)(new moom.DT(life4_23, life5_27, life6_31)))))), ((float)(0x1.0p0f)));
    }
    if (!((life3_7 == null))) {
        lexicalValue1302_63_0 = lexicalValue1302_54_0;
        break lexical_join_63;
    }
    if (!((lexicalValue1302_54_0 > 0))) {
        break lexical_join_62;
    }
    ((moom.sY)(this)).a__Boolean(((net.minecraft.util.DamageSource)(net.minecraft.util.DamageSource.c)), ((float)(0x1.0p0f)));
    }
    lexicalValue1302_63_0 = 0;
    }
    life7_81 = lexicalValue1302_63_0;
    lexical_cycle_64: while (true) {
    lexical_join_154: {
    lexical_join_153: {
    lexical_join_152: {
    lexical_join_143: {
    if (!((life7_81 < 4))) {
        break lexical_join_156;
    }
    life4_100 = moom.Dr.b__Int(((double)((this.n + ((double) (((float) (((life7_81 % 2) * 2) - 1)) * 0x1.0p-2f))))));
    life5_104 = moom.Dr.b__Int(((double)(this.o)));
    life6_122 = moom.Dr.b__Int(((double)((this.p + ((double) (((float) ((((life7_81 / 2) % 2) * 2) - 1)) * 0x1.0p-2f))))));
    life8_129 = new moom.DT(life4_100, life5_104, life6_122);
    if (!((life3_7 == null))) {
        break lexical_join_154;
    }
    if (!((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(this.i)).a__fE(((moom.DT)(life8_129))))).a__ch())).a__fn() == moom.fn.a))) {
        break lexical_join_153;
    }
    spill1302_3 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.World)(this.i)).a__ES(((moom.DT)(new moom.DT(life4_100, 0, life6_122)))))).a(((moom.DT)(life8_129))))), ((float)(0x1.99999ap-1f)));
    if (!((life3_7 == null))) {
        lexicalValue1302_143_0 = spill1302_3;
        break lexical_join_143;
    }
    if (!((spill1302_3 < 0))) {
        break lexical_join_153;
    }
    lexicalValue1302_143_0 = ((((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)).b__Boolean(((net.minecraft.world.World)(this.i)), ((moom.DT)(life8_129)))) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        lexicalValue1302_152_0 = lexicalValue1302_143_0;
        break lexical_join_152;
    }
    if (!((lexicalValue1302_143_0 != 0))) {
        break lexical_join_153;
    }
    lexicalValue1302_152_0 = ((((net.minecraft.world.World)(this.i)).a(((moom.DT)(life8_129)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1302_152_0);
    }
    life7_81 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_2b5356f40318afdb_originalDynamicSite2779_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b5356f40318afdb_originalDynamicSite2779_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a5034734c2d_invokedynamic1303_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral9040_0() throws E;

private static native int __sourceExactCall_fffb27364b07b9(int p0, long p1);

private static native moom.AV __sourceExactCall_4a5a71052291a7(moom.sY p0);
}
