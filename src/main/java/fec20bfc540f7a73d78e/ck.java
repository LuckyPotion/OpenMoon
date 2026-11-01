package moom;









import moom.DT;






import net.minecraft.block.Block;



import net.minecraft.world.World;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.state.IBlockState;
public abstract class ck extends net.minecraft.block.Block {

private static final long S;

private static final long U;

protected ck(moom.fn p0) {
this(p0, (p0).a__fm());
}


protected ck(moom.fn p0, moom.fm p1) {
super(p0, p1);
    (this).a(net.minecraft.creativetab.CreativeTabs.d);
    (this).a(true);
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(5299833066193666189L)), ((long)(-36362023114770848L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(125611748323318L)))));
    long local0_life6 = (moom.ck.S ^ 66734923844083L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill794_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill794_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill794_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill794_13 = new byte[8];
    (__sourceSpill794_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill794_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation794_15 = __sourceSpill794_13;
    ((javax.crypto.Cipher)(__sourceSpill794_10)).init(((int)(__sourceSpill794_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill794_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation794_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -6055028764202187368L;
    byte[] __sourceSpill794_19 = new byte[8];
    (__sourceSpill794_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill794_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill794_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill794_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill794_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill794_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill794_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill794_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill794_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill794_20)).doFinal(((byte[])(__sourceSpill794_19)));
    U = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return (__sourceIntrinsic_booleanComparison((((moom.ck)(this)).c__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT()))))) != 0);
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3125_14_0;
    boolean spill3125_0;
    long life5_3;
    int[] life7_5;
    int life8_20;
    forward_join_23: {
    forward_join_14: {
    life5_3 = (moom.ck.S ^ 8996182217589L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3125_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3125_14_0 = ((spill3125_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3125_0))) {
        break forward_join_23;
    }
    forwardValue3125_14_0 = ((moom.ck)(this)).e(((net.minecraft.block.state.IBlockState)(p2)));
    }
    life8_20 = forwardValue3125_14_0;
    if (!((life8_20 > 0))) {
        break forward_join_23;
    }
    ((moom.ck)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(life8_20)));
    }
    return;
}


public int b(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
long local5 = (moom.ck.S ^ 110641986635215L);
    return ((p3 == moom.bs.UP) ? ((moom.ck)(this)).e(((net.minecraft.block.state.IBlockState)(p2))) : 0);
}


protected void b__sourceReturn_bfedcc9a42(net.minecraft.world.World p0, moom.DT p1) {
((net.minecraft.world.World)(p0)).b(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)));
    ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).b__DT())), ((net.minecraft.block.Block)(this)));
    return;
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, int p3) {
int forwardValue3124_16_0;
    int forwardValue3124_18_0;
    int forwardValue3124_24_0;
    int forwardValue3124_26_0;
    int forwardValue3124_52_0;
    int forwardValue3124_82_0;
    int forwardValue3124_110_0;
    int[] spill3124_0;
    int spill3124_1;
    int spill3124_2;
    int spill3124_3;
    int spill3124_4;
    int spill3124_5;
    long life5_3;
    int life8_9;
    int[] life7_10;
    int life9_21;
    int life10_32;
    net.minecraft.block.state.IBlockState life3_45;
    forward_join_118: {
    forward_join_110: {
    forward_join_109: {
    forward_join_82: {
    forward_join_81: {
    forward_join_52: {
    forward_join_51: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life5_3 = (moom.ck.S ^ 95151194672876L);
    spill3124_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.ck)(this)).c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    life7_10 = spill3124_0;
    spill3124_1 = p3;
    if (!((life7_10 != null))) {
        forwardValue3124_16_0 = spill3124_1;
        break forward_join_16;
    }
    if (!((spill3124_1 > 0))) {
        break forward_join_17;
    }
    forwardValue3124_16_0 = 1;
    }
    forwardValue3124_18_0 = forwardValue3124_16_0;
    break forward_join_18;
    }
    forwardValue3124_18_0 = 0;
    }
    life9_21 = forwardValue3124_18_0;
    spill3124_2 = life8_9;
    if (!((life7_10 != null))) {
        forwardValue3124_24_0 = spill3124_2;
        break forward_join_24;
    }
    if (!((spill3124_2 > 0))) {
        break forward_join_25;
    }
    forwardValue3124_24_0 = 1;
    }
    forwardValue3124_26_0 = forwardValue3124_24_0;
    break forward_join_26;
    }
    forwardValue3124_26_0 = 0;
    }
    life10_32 = forwardValue3124_26_0;
    spill3124_3 = p3;
    if (!((life7_10 != null))) {
        forwardValue3124_52_0 = spill3124_3;
        break forward_join_52;
    }
    if (!((spill3124_3 != life8_9))) {
        break forward_join_51;
    }
    life3_45 = ((moom.ck)(this)).a(((net.minecraft.block.state.IBlockState)(p2)), ((int)(life8_9)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_45)), ((int)(2)));
    ((moom.ck)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((moom.DT)(p1)));
    }
    forwardValue3124_52_0 = life10_32;
    }
    if (!((life7_10 != null))) {
        forwardValue3124_82_0 = forwardValue3124_52_0;
        break forward_join_82;
    }
    if (!((forwardValue3124_52_0 == 0))) {
        break forward_join_81;
    }
    spill3124_4 = life9_21;
    if (!((life7_10 != null))) {
        forwardValue3124_82_0 = spill3124_4;
        break forward_join_82;
    }
    if (!((spill3124_4 != 0))) {
        break forward_join_81;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.0p-1f)));
    if (!((life7_10 == null))) {
        break forward_join_109;
    }
    }
    forwardValue3124_82_0 = life10_32;
    }
    if (!((life7_10 != null))) {
        forwardValue3124_110_0 = forwardValue3124_82_0;
        break forward_join_110;
    }
    if (!((forwardValue3124_82_0 != 0))) {
        break forward_join_109;
    }
    spill3124_5 = life9_21;
    if (!((life7_10 != null))) {
        forwardValue3124_110_0 = spill3124_5;
        break forward_join_110;
    }
    if (!((spill3124_5 == 0))) {
        break forward_join_109;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.999999999999ap-4d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("random.click")), ((float)(0x1.333334p-2f)), ((float)(0x1.333334p-1f)));
    }
    forwardValue3124_110_0 = life10_32;
    }
    if (!((forwardValue3124_110_0 != 0))) {
        break forward_join_118;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.Block)(this)), ((int)(((moom.ck)(this)).a(((net.minecraft.world.World)(p0))))));
    }
    return;
}


protected void b__sourceReturn_2167789c79(net.minecraft.block.state.IBlockState p0) {
int forwardValue3123_13_0;
    int forwardValue3123_15_0;
    int spill3123_0;
    long life2_3;
    int[] life4_5;
    int life5_18;
    float life6_20;
    forward_join_40: {
    forward_join_32: {
    forward_join_30: {
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (moom.ck.S ^ 20410131626261L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3123_0 = ((moom.ck)(this)).e(((net.minecraft.block.state.IBlockState)(p0)));
    if (!((life4_5 != null))) {
        forwardValue3123_13_0 = spill3123_0;
        break forward_join_13;
    }
    if (!((spill3123_0 > 0))) {
        break forward_join_14;
    }
    forwardValue3123_13_0 = 1;
    }
    forwardValue3123_15_0 = forwardValue3123_13_0;
    break forward_join_15;
    }
    forwardValue3123_15_0 = 0;
    }
    life5_18 = forwardValue3123_15_0;
    life6_20 = 0x1.0p-4f;
    if (!((life4_5 != null))) {
        break forward_join_30;
    }
    if (!((life5_18 != 0))) {
        break forward_join_32;
    }
    ((moom.ck)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)), ((float)(0x1.0p-5f)), ((float)(0x1.ep-1f)));
    }
    if (!((life4_5 == null))) {
        break forward_join_40;
    }
    }
    ((moom.ck)(this)).a(((float)(0x1.0p-4f)), ((float)(0x0.0p0f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)), ((float)(0x1.0p-4f)), ((float)(0x1.ep-1f)));
    }
    return;
}


protected abstract int e(net.minecraft.block.state.IBlockState p0);

public int e__Int() {
return 1;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
moom.ck forwardValue3126_17_0;
    moom.ck spill3126_0;
    long life4_3;
    int[] life6_5;
    forward_join_17: {
    forward_join_16: {
    life4_3 = (moom.ck.S ^ 105713458791702L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3126_0 = this;
    if (!((life6_5 != null))) {
        forwardValue3126_17_0 = spill3126_0;
        break forward_join_17;
    }
    if (!((((moom.ck)(spill3126_0)).e(((net.minecraft.block.state.IBlockState)(p2))) > 0))) {
        break forward_join_16;
    }
    ((moom.ck)(this)).b__sourceReturn_bfedcc9a42(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    }
    forwardValue3126_17_0 = this;
    }
    __sourceIntrinsic_661db6c7f0ec_call3126_4(forwardValue3126_17_0, p0, p1, p2);
    return;
}


private boolean c__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue3127_21_0;
    int forwardValue3127_23_0;
    boolean spill3127_0;
    int spill3127_1;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life3_3 = (moom.ck.S ^ 109120146872835L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3127_0 = net.minecraft.world.World.a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue3127_21_0 = ((spill3127_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill3127_0))) {
        break forward_join_20;
    }
    spill3127_1 = ((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a__ch() instanceof moom.dz) ? 1 : 0);
    if (!((life5_5 != null))) {
        forwardValue3127_21_0 = spill3127_1;
        break forward_join_21;
    }
    if (!((spill3127_1 != 0))) {
        break forward_join_22;
    }
    }
    forwardValue3127_21_0 = 1;
    }
    forwardValue3127_23_0 = forwardValue3127_21_0;
    break forward_join_23;
    }
    forwardValue3127_23_0 = 0;
    }
    return ((forwardValue3127_23_0) != 0);
}


protected abstract int c(net.minecraft.world.World p0, moom.DT p1);

public boolean n() {
return ((1) != 0);
}


public boolean l() {
return ((1) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, moom.bs p3) {
return ((moom.ck)(this)).e(((net.minecraft.block.state.IBlockState)(p2)));
}


protected abstract net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, int p1);

public void a__Void() {
float local1 = 0x1.0p-1f;
    float local2 = 0x1.0p-3f;
    float local3 = 0x1.0p-1f;
    ((moom.ck)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.8p-2f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.4p-1f)), ((float)(0x1.0p0f)));
    return;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
return ((1) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.ck)(this)).b__sourceReturn_2167789c79(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))));
    return;
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public int a(net.minecraft.world.World p0) {
long local2 = (moom.ck.S ^ 16790379736411L);
    return ((int) moom.ck.U);
}


protected moom.CA a(moom.DT p0) {
float local2 = 0x1.0p-3f;
    return new moom.CA(((double) (((float) ((moom.DT)(p0)).a()) + 0x1.0p-3f)), ((double) ((moom.DT)(p0)).b()), ((double) (((float) ((moom.DT)(p0)).c()) + 0x1.0p-3f)), ((double) (((float) (((moom.DT)(p0)).a() + 1)) - 0x1.0p-3f)), (((double) ((moom.DT)(p0)).b()) + 0x1.0p-2d), ((double) (((float) (((moom.DT)(p0)).c() + 1)) - 0x1.0p-3f)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
int forwardValue3122_14_0;
    boolean spill3122_0;
    long life5_3;
    int[] life7_5;
    int life8_20;
    forward_join_23: {
    forward_join_14: {
    life5_3 = (moom.ck.S ^ 140535499090307L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3122_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3122_14_0 = ((spill3122_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill3122_0))) {
        break forward_join_23;
    }
    forwardValue3122_14_0 = ((moom.ck)(this)).e(((net.minecraft.block.state.IBlockState)(p2)));
    }
    life8_20 = forwardValue3122_14_0;
    if (!((life8_20 == 0))) {
        break forward_join_23;
    }
    ((moom.ck)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(life8_20)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long l = moom.ck.S ^ 0x1D5AAEDC2FF4L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = this.c__Boolean(p0, p1.b__DT());
        if (nArray != null && !bl) {
            this.a(p0, p1, p2, 0);
            bl = p0.d__Boolean(p1);
        }
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> void __sourceIntrinsic_661db6c7f0ec_call3126_4(moom.ck a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
