package moom;


public class JU implements moom.JJ {

private net.minecraft.entity.Entity a;

private static final long b;

private static final long c;

public JU() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1456625393940971251L)), ((long)(3883184253563446329L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(90710654734664L)))));
    long local0_life6 = (moom.JU.b ^ 87579835464642L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill603_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill603_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill603_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill603_13 = new byte[8];
    (__sourceSpill603_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill603_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation603_15 = __sourceSpill603_13;
    ((javax.crypto.Cipher)(__sourceSpill603_10)).init(((int)(__sourceSpill603_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill603_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation603_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 6391204807840962682L;
    byte[] __sourceSpill603_19 = new byte[8];
    (__sourceSpill603_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill603_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill603_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill603_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill603_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill603_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill603_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill603_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill603_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill603_20)).doFinal(((byte[])(__sourceSpill603_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int b() {
int forwardValue2315_20_0;
    net.minecraft.entity.Entity[] spill2315_0;
    int spill2315_1;
    long life1_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.Entity[] life3_8;
    net.minecraft.entity.EntityLiving life4_19;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.JU.b ^ 59910285332776L);
    spill2315_0 = moom.JM.b__Arrayr3();
    life5_7 = this.a;
    life3_8 = spill2315_0;
    spill2315_1 = ((life5_7 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life3_8 != null))) {
        forwardValue2315_20_0 = spill2315_1;
        break forward_join_20;
    }
    if (!((spill2315_1 != 0))) {
        break forward_join_19;
    }
    life4_19 = ((net.minecraft.entity.EntityLiving)(life5_7));
    if (!((life3_8 == null))) {
        break forward_join_21;
    }
    }
    forwardValue2315_20_0 = 0;
    }
    return forwardValue2315_20_0;
    }
    return ((int) ((net.minecraft.entity.EntityLiving)(life4_19)).b__sourceReturn_bc607678b6());
}


public int c() {
int forwardValue2316_20_0;
    net.minecraft.entity.Entity[] spill2316_0;
    int spill2316_1;
    long life1_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.Entity[] life3_8;
    net.minecraft.entity.EntityLiving life4_19;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.JU.b ^ 107994690447912L);
    spill2316_0 = moom.JM.b__Arrayr3();
    life5_7 = this.a;
    life3_8 = spill2316_0;
    spill2316_1 = ((life5_7 instanceof net.minecraft.entity.EntityLiving) ? 1 : 0);
    if (!((life3_8 != null))) {
        forwardValue2316_20_0 = spill2316_1;
        break forward_join_20;
    }
    if (!((spill2316_1 != 0))) {
        break forward_join_19;
    }
    life4_19 = ((net.minecraft.entity.EntityLiving)(life5_7));
    if (!((life3_8 == null))) {
        break forward_join_21;
    }
    }
    forwardValue2316_20_0 = 0;
    }
    return forwardValue2316_20_0;
    }
    return ((int) ((net.minecraft.entity.EntityLiving)(life4_19)).a());
}


public net.minecraft.entity.Entity a__r3() {
return this.a;
}


public void a(net.minecraft.entity.Entity p0) {
this.a = ((net.minecraft.entity.Entity)(p0));
    return;
}


public int a() {
long local1 = (moom.JU.b ^ 37820359132081L);
    java.lang.Object local3 = ((net.minecraft.entity.Entity)(this.a)).a__UUID();
    long local4 = ((java.util.UUID)(local3)).getLeastSignificantBits();
    return ((int) (local4 & moom.JU.c));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.DT a__DT() {
return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.Entity)(this.a)).a__r1())).h;
}


public java.lang.String a__String() {
net.minecraft.entity.Entity forwardValue2314_14_0;
    java.lang.String forwardValue2314_17_0;
    net.minecraft.entity.Entity spill2314_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life1_3 = (moom.JU.b ^ 57587596583718L);
    life3_5 = moom.JM.b__Arrayr3();
    spill2314_0 = this.a;
    if (!((life3_5 != null))) {
        forwardValue2314_14_0 = spill2314_0;
        break forward_join_14;
    }
    if (!(((net.minecraft.entity.Entity)(spill2314_0)).e__Boolean())) {
        break forward_join_16;
    }
    forwardValue2314_14_0 = this.a;
    }
    forwardValue2314_17_0 = ((net.minecraft.entity.Entity)(forwardValue2314_14_0)).g__String();
    break forward_join_17;
    }
    forwardValue2314_17_0 = null;
    }
    return forwardValue2314_17_0;
}


public net.minecraft.world.biome.BiomeGenBase a__ES() {
return ((net.minecraft.entity.DataWatcher)(((net.minecraft.entity.Entity)(this.a)).a__r1())).g;
}

}
