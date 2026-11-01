package moom;


public class cF extends moom.cu {

public static final moom.fy R;

private static final long S;

private static final long T;

protected cF() {
super(moom.fn.k, moom.fm.D);
    ((moom.cF)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.cF)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cF.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))));
    ((moom.cF)(this)).a(((boolean)(true)));
    float local1 = 0x1.0p-1f;
    ((moom.cF)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)(0x1.0p-2f)), ((float)((0x1.0p-1f + local1))));
    ((moom.cF)(this)).a(((net.minecraft.creativetab.CreativeTabs)(null)));
    return;
}


static {
S = ((long)(((moom._a)(moom._c.a(((long)(7111444932874789313L)), ((long)(5761158522351306861L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13179050289625L)))));
    long local0_life6 = (moom.cF.S ^ 126847980263981L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill783_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill783_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill783_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill783_13 = new byte[8];
    (__sourceSpill783_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill783_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation783_15 = __sourceSpill783_13;
    ((javax.crypto.Cipher)(__sourceSpill783_10)).init(((int)(__sourceSpill783_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill783_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation783_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 5175388132321231041L;
    byte[] __sourceSpill783_19 = new byte[8];
    (__sourceSpill783_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill783_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill783_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill783_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill783_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill783_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill783_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill783_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill783_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill783_20)).doFinal(((byte[])(__sourceSpill783_19)));
    T = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("age")), ((int)(0)), ((int)(3)))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cF.R))))))).intValue();
}


protected boolean b(net.minecraft.block.Block p0) {
long local2 = (moom.cF.S ^ 130388949021698L);
    return ((((p0 == net.minecraft.init.Blocks.aW) ? 1 : 0)) != 0);
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3042_37_0;
    int[] spill3042_0;
    int spill3042_1;
    long life5_3;
    int life8_10;
    int[] life7_11;
    forward_join_44: {
    forward_join_38: {
    forward_join_37: {
    life5_3 = (moom.cF.S ^ 26079490097949L);
    spill3042_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cF.R))))))).intValue();
    life7_11 = spill3042_0;
    if (!((life7_11 != null))) {
        break forward_join_44;
    }
    if (!((life8_10 < 3))) {
        break forward_join_38;
    }
    spill3042_1 = ((java.util.Random)(p3)).nextInt(((int)(((int) moom.cF.T))));
    if (!((life7_11 != null))) {
        forwardValue3042_37_0 = spill3042_1;
        break forward_join_37;
    }
    if (!((spill3042_1 == 0))) {
        break forward_join_38;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cF.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)((life8_10 + 1)))))));
    forwardValue3042_37_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3042_37_0);
    }
    super.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.cF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cF.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cF.R});
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return (__sourceIntrinsic_booleanComparison((((moom.cF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).b__DT()))))).a__ch()))))) != 0);
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
int lexicalValue1067_12_0;
    int lexicalValue1067_43_0;
    boolean spill1067_0;
    int spill1067_1;
    int spill1067_2;
    long life6_3;
    int[] life8_5;
    int life9_15;
    int life10_52;
    lexical_join_57: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_12: {
    life6_3 = (moom.cF.S ^ 31744727461433L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1067_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life8_5 != null))) {
        lexicalValue1067_12_0 = ((spill1067_0) ? 1 : 0);
        break lexical_join_12;
    }
    if (!((!spill1067_0))) {
        break lexical_join_57;
    }
    lexicalValue1067_12_0 = 1;
    }
    life9_15 = lexicalValue1067_12_0;
    spill1067_1 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cF.R))))))).intValue();
    if (!((life8_5 != null))) {
        lexicalValue1067_43_0 = spill1067_1;
        break lexical_join_43;
    }
    if (!((spill1067_1 >= 3))) {
        break lexical_join_42;
    }
    life9_15 = (2 + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(3))));
    spill1067_2 = p4;
    if (!((life8_5 != null))) {
        lexicalValue1067_43_0 = spill1067_2;
        break lexical_join_43;
    }
    if (!((spill1067_2 > 0))) {
        break lexical_join_42;
    }
    life9_15 = (life9_15 + ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)((p4 + 1)))));
    }
    lexicalValue1067_43_0 = 0;
    }
    life10_52 = lexicalValue1067_43_0;
    lexical_cycle_44: while (true) {
    if (!((life10_52 < life9_15))) {
        break lexical_join_57;
    }
    moom.cF.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.bn))));
    life10_52 += 1;
    if (!((life8_5 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.bn;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
