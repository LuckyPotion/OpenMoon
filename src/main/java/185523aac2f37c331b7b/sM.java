package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class sM extends moom.sK {

private static long jb;

private static long[] Ab;

private static java.lang.Integer[] Bb;

private static java.util.Map Cb;

public sM(net.minecraft.world.World p0) { super((net.minecraft.world.World)null); }


private static void __sourceConstructorBody_9b0c56f09b79789c(moom.sM receiver, net.minecraft.world.World p0) throws Throwable {

long local2 = (moom.sM.jb ^ 35009810101587L);

    moom.sM.__sourceConstructorInit_9b0c56f09b79789c_0(((moom.sM)(receiver)), ((net.minecraft.world.World)(p0)));

    ((moom.sM)(receiver)).a__Void(((float)(0x1.ccccccp-1f)), ((float)(0x1.4cccccp0f)));

    ((moom.AW)(((moom.AW)(__sourceExactCall_359ef6687a3509(((moom.sM)(receiver))))))).a(((boolean)(true)));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(0)), ((moom.uc)(new moom.uQ(receiver))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(1)), ((moom.uc)(new moom.uJ(receiver, 0x1.0p1d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(2)), ((moom.uc)(new moom.uz(receiver, 0x1.0p0d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(3)), ((moom.uc)(new moom.u3(receiver, 0x1.4p0d, net.minecraft.init.Items.O, false))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(4)), ((moom.uc)(new moom.uv(receiver, 0x1.4p0d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(5)), ((moom.uc)(new moom.u6(receiver, 0x1.0p0d))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(__sourceIntrinsic_9b0c56f09b79789c_originalDynamicSite2775_20(23754, (3359623508442153742L ^ local2)))), ((moom.uc)(new moom.u8(receiver, net.minecraft.entity.player.EntityPlayer.class, 0x1.8p2f))));

    ((net.minecraft.entity.ai.EntityAITasks)(((moom.sM)(receiver)).bJ)).a(((int)(__sourceIntrinsic_9b0c56f09b79789c_originalDynamicSite2775_24(30433, (6022746270859176228L ^ local2)))), ((moom.uc)(new moom.uy(receiver))));

    return;

}



static {
jb = ((long)(((moom._a)(moom._c.a(((long)(-7785800474829438037L)), ((long)(-3069133053064075543L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(213069658273948L)))));
    Cb = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.sM.jb ^ 100007305194960L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1009_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1009_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1009_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1009_14 = new byte[8];
    (__sourceSpill1009_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1009_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1009_16 = __sourceSpill1009_14;
    ((javax.crypto.Cipher)(__sourceSpill1009_11)).init(((int)(__sourceSpill1009_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1009_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1009_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "÷Ç¨\004å¢×«9ÈÂéÖXÑ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1009_25 = local6_life21;
        int __sourceSpill1009_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1009_25)).substring(((int)(__sourceSpill1009_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1009_30 = local8_life19;
        int __sourceSpill1009_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1009_33 = new byte[8];
        (__sourceSpill1009_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1009_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1009_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1009_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1009_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1009_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1009_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1009_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1009_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1009_34)).doFinal(((byte[])(__sourceSpill1009_33)));
        (__sourceSpill1009_30)[__sourceSpill1009_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    Ab = ((long[])(local8_life19));
    Bb = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_9b0c56f09b79789c_0(moom.sM a0, net.minecraft.world.World a1) throws E;

protected java.lang.String i__String() {
return "mob.cow.say";
}


protected void b(boolean p0, int p1) {
moom.sM lexicalValue1299_65_0;
    int spill1299_0;
    moom.sM spill1299_1;
    long life3_3;
    int life6_16;
    int life5_17;
    int life7_19;
    int life7_51;
    lexical_join_72: {
    lexical_join_47: {
    lexical_join_33: {
    life3_3 = (moom.sM.jb ^ 6295296214368L);
    spill1299_0 = moom.vR.c();
    life6_16 = (((java.util.Random)(this.ah)).nextInt(((int)(3))) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    life5_17 = spill1299_0;
    life7_19 = 0;
    lexical_cycle_20: while (true) {
    if (!((life7_19 < life6_16))) {
        break lexical_join_33;
    }
    ((moom.sM)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.aF)), ((int)(1)));
    life7_19 += 1;
    if (!((life5_17 == 0))) {
        break lexical_join_47;
    }
    if (!((life5_17 != 0))) { continue lexical_cycle_20; }
    break lexical_cycle_20;
    }
    }
    life6_16 = ((((java.util.Random)(this.ah)).nextInt(((int)(3))) + 1) + ((java.util.Random)(this.ah)).nextInt(((int)((1 + p1)))));
    }
    life7_51 = 0;
    lexical_cycle_49: while (true) {
    lexical_join_69: {
    lexical_join_65: {
    lexical_join_64: {
    if (!((life7_51 < life6_16))) {
        break lexical_join_72;
    }
    spill1299_1 = this;
    if (!((life5_17 == 0))) {
        lexicalValue1299_65_0 = spill1299_1;
        break lexical_join_65;
    }
    if (!(((moom.sM)(spill1299_1)).r__Boolean())) {
        break lexical_join_64;
    }
    ((moom.sM)(this)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a9)), ((int)(1)));
    if (!((life5_17 != 0))) {
        break lexical_join_69;
    }
    }
    lexicalValue1299_65_0 = this;
    }
    ((moom.sM)(lexicalValue1299_65_0)).a(((net.minecraft.item.Item)(net.minecraft.init.Items.a8)), ((int)(1)));
    }
    life7_51 += 1;
    if (!((life5_17 != 0))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    return;
}


public float e__Float() {
return this.H;
}


protected java.lang.String c__String() {
return "mob.cow.hurt";
}


protected java.lang.String h__String() {
return "mob.cow.hurt";
}


private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_ec881c4a524b_methodHandleLiteral9023_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/sM"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int f(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x961;
        if (Bb[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = Ab[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Cb.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Cb.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/sM", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            sM.Bb[n2] = n3;
        }
        return Bb[n2];
}


private static int f(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.sM.f(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.99999ap-2f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(moom.DT p0, net.minecraft.block.Block p1) {
((moom.sM)(this)).a(((java.lang.String)("mob.cow.step")), ((float)(0x1.333334p-3f)), ((float)(0x1.0p0f)));
    return;
}


protected void a__Void() {
super.a__Void();
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.sM)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.b))))).a(((double)(0x1.4p3d)));
    ((net.minecraft.entity.ai.attributes.IAttributeInstance)(((moom.sM)(this)).a(((net.minecraft.entity.ai.attributes.IAttribute)(net.minecraft.entity.SharedMonsterAttributes.e))))).a(((double)(0x1.99999ap-3d)));
    return;
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
net.minecraft.item.ItemStack forwardValue3972_15_0;
    int forwardValue3972_59_0;
    int forwardValue3972_73_0;
    int forwardValue3972_77_0;
    int spill3972_0;
    net.minecraft.item.ItemStack spill3972_1;
    boolean spill3972_2;
    boolean spill3972_3;
    int spill3972_4;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    forward_join_77: {
    forward_join_74: {
    forward_join_73: {
    forward_join_72: {
    forward_join_59: {
    forward_join_52: {
    forward_join_15: {
    life2_3 = (moom.sM.jb ^ 26297071637458L);
    spill3972_0 = moom.vR.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill3972_0;
    spill3972_1 = life5_8;
    if (!((life4_9 != 0))) {
        forwardValue3972_15_0 = spill3972_1;
        break forward_join_15;
    }
    if (!((spill3972_1 != null))) {
        break forward_join_74;
    }
    forwardValue3972_15_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue3972_15_0)).a__wQ() == net.minecraft.init.Items.aw))) {
        break forward_join_74;
    }
    spill3972_2 = ((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d;
    if (!((life4_9 != 0))) {
        forwardValue3972_77_0 = ((spill3972_2) ? 1 : 0);
        break forward_join_77;
    }
    if (!((!spill3972_2))) {
        break forward_join_74;
    }
    spill3972_3 = ((moom.sM)(this)).c__Boolean();
    if (!((life4_9 != 0))) {
        forwardValue3972_77_0 = ((spill3972_3) ? 1 : 0);
        break forward_join_77;
    }
    if (!((!spill3972_3))) {
        break forward_join_74;
    }
    net.minecraft.item.ItemStack __stackOp3972_11_0 = life5_8;
    net.minecraft.item.ItemStack __stackOp3972_13_0 = __stackOp3972_11_0;
    int __stackOp3972_13_1 = ((net.minecraft.item.ItemStack)(__stackOp3972_11_0)).b;
    spill3972_4 = __stackOp3972_13_1;
    ((net.minecraft.item.ItemStack)(__stackOp3972_13_0)).b = ((int)((__stackOp3972_13_1 - 1)));
    if (!((life4_9 != 0))) {
        forwardValue3972_59_0 = spill3972_4;
        break forward_join_59;
    }
    if (!((spill3972_4 == 1))) {
        break forward_join_52;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aG))));
    if (!((life4_9 == 0))) {
        break forward_join_72;
    }
    }
    forwardValue3972_59_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aG))))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        forwardValue3972_73_0 = forwardValue3972_59_0;
        break forward_join_73;
    }
    if (!((forwardValue3972_59_0 == 0))) {
        break forward_join_72;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p0)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.aG, 1, 0))), ((boolean)(false)));
    }
    forwardValue3972_73_0 = 1;
    }
    return ((forwardValue3972_73_0) != 0);
    }
    forwardValue3972_77_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((forwardValue3972_77_0) != 0);
}


public moom.sJ a(moom.sJ p0) {
return ((moom.sM)(this)).a__sM(((moom.sJ)(p0)));
}


protected net.minecraft.item.Item a__wQ() {
return net.minecraft.init.Items.aF;
}


public moom.sM a__sM(moom.sJ p0) {
return new moom.sM(this.i);
}


private static native <E extends Throwable> int __sourceIntrinsic_9b0c56f09b79789c_originalDynamicSite2775_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9b0c56f09b79789c_originalDynamicSite2775_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_ec881c4a524b_methodHandleLiteral9023_0() throws E;

private static native moom.AV __sourceExactCall_359ef6687a3509(moom.sM p0);
}
