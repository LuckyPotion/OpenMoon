package moom;


public class Cg extends net.minecraft.tileentity.TileEntity implements net.minecraft.util.ITickable {

public float l;

public float m;

public int n;

private int o;

private static final long p;

private static final long q;

public Cg() {
super();
}


static {
p = ((long)(((moom._a)(moom._c.a(((long)(-5553591552743963504L)), ((long)(-5830629489297735323L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80953212569166L)))));
    long local0_life6 = (moom.Cg.p ^ 9780827575794L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill506_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill506_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill506_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill506_13 = new byte[8];
    (__sourceSpill506_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill506_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation506_15 = __sourceSpill506_13;
    ((javax.crypto.Cipher)(__sourceSpill506_10)).init(((int)(__sourceSpill506_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill506_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation506_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3312333468143094828L;
    byte[] __sourceSpill506_19 = new byte[8];
    (__sourceSpill506_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill506_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill506_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill506_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill506_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill506_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill506_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill506_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill506_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill506_20)).doFinal(((byte[])(__sourceSpill506_19)));
    q = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void b() {
this.n += 1;
    ((net.minecraft.world.World)(((moom.Cg)(this)).d)).c(((moom.DT)(((moom.Cg)(this)).e)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bF)), ((int)(1)), ((int)(this.n)));
    return;
}


public void c__Void() {
int forwardValue1631_37_0;
    int forwardValue1631_91_0;
    int forwardValue1631_103_0;
    int forwardValue1631_112_0;
    float forwardValue1631_115_0;
    moom.Cg forwardValue1631_130_0;
    float forwardValue1631_146_0;
    int forwardValue1631_195_0;
    moom.Cg forwardValue1631_197_0;
    int spill1631_0;
    int spill1631_1;
    int spill1631_2;
    int spill1631_3;
    float spill1631_4;
    float spill1631_5;
    moom.Cg spill1631_6;
    float spill1631_7;
    int spill1631_8;
    int spill1631_9;
    moom.Cg spill1631_10;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_43;
    int life5_47;
    int life6_51;
    float life7_53;
    double life8_79;
    double life10_84;
    float life8_154;
    float life9_200;
    double life10_227;
    double life12_232;
    forward_join_199: {
    forward_join_197: {
    forward_join_195: {
    forward_join_189: {
    forward_join_146: {
    forward_join_145: {
    forward_join_135: {
    forward_join_130: {
    forward_join_129: {
    forward_join_115: {
    forward_join_113: {
    forward_join_112: {
    forward_join_103: {
    forward_join_101: {
    forward_join_91: {
    forward_join_89: {
    forward_join_37: {
    forward_join_30: {
    life1_3 = (moom.Cg.p ^ 105203516327658L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    moom.Cg __stackOp1631_2_0 = this;
    moom.Cg __stackOp1631_4_0 = __stackOp1631_2_0;
    int __stackOp1631_4_1 = (((moom.Cg)(__stackOp1631_2_0)).o + 1);
    spill1631_0 = __stackOp1631_4_1;
    ((moom.Cg)(__stackOp1631_4_0)).o = ((int)(__stackOp1631_4_1));
    spill1631_1 = ((spill1631_0 % ((int) moom.Cg.q)) * 4);
    if (!((life3_5 != null))) {
        forwardValue1631_37_0 = spill1631_1;
        break forward_join_37;
    }
    if (!((spill1631_1 == 0))) {
        break forward_join_30;
    }
    ((net.minecraft.world.World)(((moom.Cg)(this)).d)).c(((moom.DT)(((moom.Cg)(this)).e)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bF)), ((int)(1)), ((int)(this.n)));
    }
    this.m = ((float)(this.l));
    forwardValue1631_37_0 = ((moom.DT)(((moom.Cg)(this)).e)).a();
    }
    life4_43 = forwardValue1631_37_0;
    life5_47 = ((moom.DT)(((moom.Cg)(this)).e)).b();
    life6_51 = ((moom.DT)(((moom.Cg)(this)).e)).c();
    life7_53 = 0x1.99999ap-4f;
    spill1631_2 = this.n;
    if (!((life3_5 != null))) {
        forwardValue1631_91_0 = spill1631_2;
        break forward_join_91;
    }
    if (!((spill1631_2 > 0))) {
        break forward_join_89;
    }
    spill1631_3 = recovery.source.CarrierOps.fcmpl(((float)(this.l)), ((float)(0x0.0p0f)));
    if (!((life3_5 != null))) {
        forwardValue1631_91_0 = spill1631_3;
        break forward_join_91;
    }
    if (!((spill1631_3 == 0))) {
        break forward_join_89;
    }
    life8_79 = (((double) life4_43) + 0x1.0p-1d);
    life10_84 = (((double) life6_51) + 0x1.0p-1d);
    ((net.minecraft.world.World)(((moom.Cg)(this)).d)).a(((double)(life8_79)), ((double)((((double) life5_47) + 0x1.0p-1d))), ((double)(life10_84)), ((java.lang.String)("random.chestopen")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(((moom.Cg)(this)).d)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    }
    forwardValue1631_91_0 = this.n;
    }
    if (!((life3_5 != null))) {
        forwardValue1631_103_0 = forwardValue1631_91_0;
        break forward_join_103;
    }
    if (!((forwardValue1631_91_0 == 0))) {
        break forward_join_101;
    }
    spill1631_4 = this.l;
    if (!((life3_5 != null))) {
        forwardValue1631_115_0 = spill1631_4;
        break forward_join_115;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1631_4)), ((float)(0x0.0p0f))) <= 0))) {
        break forward_join_113;
    }
    }
    forwardValue1631_103_0 = this.n;
    }
    if (!((life3_5 != null))) {
        forwardValue1631_112_0 = forwardValue1631_103_0;
        break forward_join_112;
    }
    if (!((forwardValue1631_103_0 > 0))) {
        break forward_join_199;
    }
    spill1631_5 = this.l;
    if (!((life3_5 != null))) {
        forwardValue1631_115_0 = spill1631_5;
        break forward_join_115;
    }
    forwardValue1631_112_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1631_5)), ((float)(0x1.0p0f)));
    }
    if (!((forwardValue1631_112_0 < 0))) {
        break forward_join_199;
    }
    }
    forwardValue1631_115_0 = this.l;
    }
    life8_154 = forwardValue1631_115_0;
    spill1631_6 = this;
    if (!((life3_5 != null))) {
        forwardValue1631_130_0 = spill1631_6;
        break forward_join_130;
    }
    if (!((((moom.Cg)(spill1631_6)).n > 0))) {
        break forward_join_129;
    }
    moom.Cg __stackOp1631_36_0 = this;
    ((moom.Cg)(__stackOp1631_36_0)).l = ((float)((((moom.Cg)(__stackOp1631_36_0)).l + life7_53)));
    if (!((life3_5 == null))) {
        break forward_join_135;
    }
    }
    forwardValue1631_130_0 = this;
    }
    moom.Cg __stackOp1631_39_0 = forwardValue1631_130_0;
    ((moom.Cg)(__stackOp1631_39_0)).l = ((float)((((moom.Cg)(__stackOp1631_39_0)).l - life7_53)));
    }
    spill1631_7 = this.l;
    if (!((life3_5 != null))) {
        forwardValue1631_146_0 = spill1631_7;
        break forward_join_146;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1631_7)), ((float)(0x1.0p0f))) > 0))) {
        break forward_join_145;
    }
    this.l = ((float)(0x1.0p0f));
    }
    forwardValue1631_146_0 = 0x1.0p-1f;
    }
    life9_200 = forwardValue1631_146_0;
    spill1631_8 = recovery.source.CarrierOps.fcmpg(((float)(this.l)), ((float)(life9_200)));
    if (!((life3_5 != null))) {
        forwardValue1631_195_0 = spill1631_8;
        break forward_join_195;
    }
    if (!((spill1631_8 < 0))) {
        break forward_join_189;
    }
    spill1631_9 = recovery.source.CarrierOps.fcmpl(((float)(life8_154)), ((float)(life9_200)));
    if (!((life3_5 != null))) {
        forwardValue1631_195_0 = spill1631_9;
        break forward_join_195;
    }
    if (!((spill1631_9 >= 0))) {
        break forward_join_189;
    }
    life10_227 = (((double) life4_43) + 0x1.0p-1d);
    life12_232 = (((double) life6_51) + 0x1.0p-1d);
    ((net.minecraft.world.World)(((moom.Cg)(this)).d)).a(((double)(life10_227)), ((double)((((double) life5_47) + 0x1.0p-1d))), ((double)(life12_232)), ((java.lang.String)("random.chestclosed")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(((net.minecraft.world.World)(((moom.Cg)(this)).d)).u)).nextFloat() * 0x1.99999ap-4f) + 0x1.ccccccp-1f))));
    }
    spill1631_10 = this;
    if (!((life3_5 != null))) {
        forwardValue1631_197_0 = spill1631_10;
        break forward_join_197;
    }
    forwardValue1631_195_0 = recovery.source.CarrierOps.fcmpg(((float)(((moom.Cg)(spill1631_10)).l)), ((float)(0x0.0p0f)));
    }
    if (!((forwardValue1631_195_0 < 0))) {
        break forward_join_199;
    }
    forwardValue1631_197_0 = this;
    }
    ((moom.Cg)(forwardValue1631_197_0)).l = ((float)(0x0.0p0f));
    }
    return;
}


public void d__Void() {
((moom.Cg)(this)).f__Void();
    super.d__Void();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.entity.player.EntityPlayer p0) {
int forwardValue1629_39_0;
    int forwardValue1629_41_0;
    int spill1629_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    life2_3 = (moom.Cg.p ^ 119578028042563L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    if (!((((net.minecraft.world.World)(((moom.Cg)(this)).d)).a__B9(((moom.DT)(((moom.Cg)(this)).e))) == this))) {
        break forward_join_40;
    }
    spill1629_0 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.entity.player.EntityPlayer)(p0)).a(((double)((((double) ((moom.DT)(((moom.Cg)(this)).e)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((moom.Cg)(this)).e)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(((moom.Cg)(this)).e)).c()) + 0x1.0p-1d)))))), ((double)(0x1.0p6d)));
    if (!((life4_5 != null))) {
        forwardValue1629_39_0 = spill1629_0;
        break forward_join_39;
    }
    if (!((spill1629_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue1629_39_0 = 1;
    }
    forwardValue1629_41_0 = forwardValue1629_39_0;
    break forward_join_41;
    }
    forwardValue1629_41_0 = 0;
    }
    return ((forwardValue1629_41_0) != 0);
}


public boolean a__Boolean(int p0, int p1) {
int forwardValue1630_20_0;
    int spill1630_0;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_20: {
    forward_join_16: {
    life3_3 = (moom.Cg.p ^ 77577177773144L);
    life5_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1630_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue1630_20_0 = spill1630_0;
        break forward_join_20;
    }
    if (!((spill1630_0 == 1))) {
        break forward_join_16;
    }
    this.n = ((int)(p1));
    return ((1) != 0);
    }
    forwardValue1630_20_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)))) ? 1 : 0);
    }
    return ((forwardValue1630_20_0) != 0);
}


public void g__sourceReturn_da8c82d5d4() {
this.n -= 1;
    ((net.minecraft.world.World)(((moom.Cg)(this)).d)).c(((moom.DT)(((moom.Cg)(this)).e)), ((net.minecraft.block.Block)(net.minecraft.init.Blocks.bF)), ((int)(1)), ((int)(this.n)));
    return;
}

}
