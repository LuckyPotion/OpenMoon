package moom;


public class tU extends net.minecraft.entity.projectile.EntityThrowable {

private static final long bb;

private static final long hb;

public tU(net.minecraft.world.World p0, double p1, double p2, double p3) {
super(p0, p1, p2, p3);
}


public tU(net.minecraft.world.World p0, net.minecraft.entity.EntityLivingBase p1) {
super(p0, p1);
}


public tU(net.minecraft.world.World p0) {
super(p0);
}


static {
bb = ((long)(((moom._a)(moom._c.a(((long)(2057923355983363593L)), ((long)(1842206936705636917L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(111240550132770L)))));
    long local0_life6 = (moom.tU.bb ^ 78314588851771L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1030_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1030_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1030_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1030_13 = new byte[8];
    (__sourceSpill1030_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1030_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1030_15 = __sourceSpill1030_13;
    ((javax.crypto.Cipher)(__sourceSpill1030_10)).init(((int)(__sourceSpill1030_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1030_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1030_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3450325589128017515L;
    byte[] __sourceSpill1030_19 = new byte[8];
    (__sourceSpill1030_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1030_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1030_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1030_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1030_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1030_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1030_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1030_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1030_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1030_20)).doFinal(((byte[])(__sourceSpill1030_19)));
    hb = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


protected float b__sourceReturn_bc607678b6() {
return -0x1.4p4f;
}


protected float f__sourceReturn_bc607678b6() {
return 0x1.1eb852p-4f;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a(net.minecraft.util.MovingObjectPosition p0) {
int lexicalValue1314_35_0;
    boolean spill1314_0;
    long life2_3;
    int life4_5;
    int life5_41;
    int life6_46;
    lexical_join_67: {
    lexical_join_65: {
    lexical_join_35: {
    life2_3 = (moom.tU.bb ^ 93860098961681L);
    life4_5 = net.minecraft.entity.item.EntityMinecart$EnumMinecartType.c();
    spill1314_0 = ((net.minecraft.world.World)(((moom.tU)(this)).i)).G;
    if (!((life4_5 == 0))) {
        lexicalValue1314_35_0 = ((spill1314_0) ? 1 : 0);
        break lexical_join_35;
    }
    if (!((!spill1314_0))) {
        break lexical_join_67;
    }
    ((net.minecraft.world.World)(((moom.tU)(this)).i)).b(((int)(((int) moom.tU.hb))), ((moom.DT)(new moom.DT(this))), ((int)(0)));
    lexicalValue1314_35_0 = ((3 + ((java.util.Random)(((net.minecraft.world.World)(((moom.tU)(this)).i)).u)).nextInt(((int)(5)))) + ((java.util.Random)(((net.minecraft.world.World)(((moom.tU)(this)).i)).u)).nextInt(((int)(5))));
    }
    life5_41 = lexicalValue1314_35_0;
    lexical_cycle_36: while (true) {
    if (!((life5_41 > 0))) {
        break lexical_join_65;
    }
    life6_46 = __sourceExactCall_d69b06941ddd75(((int)(life5_41)));
    life5_41 = (life5_41 - life6_46);
    ((net.minecraft.world.World)(((moom.tU)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(new moom.tL(((moom.tU)(this)).i, ((moom.tU)(this)).n, ((moom.tU)(this)).o, ((moom.tU)(this)).p, life6_46))));
    if (!((life4_5 == 0))) {
        break lexical_join_67;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_36; }
    break lexical_cycle_36;
    }
    }
    ((moom.tU)(this)).f__Void();
    }
    return;
}


protected float a() {
return 0x1.666666p-1f;
}


private static native int __sourceExactCall_d69b06941ddd75(int p0);
}
