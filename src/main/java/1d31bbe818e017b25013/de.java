package moom;







import moom.DT;

import moom.dd;
import moom.Oo;
import moom.fA;
import moom.fy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPlanks$EnumType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
public class de extends moom.dd {

public static final moom.fy R;

private static final long T;

public de() {
super();
    (this).a__Void(((this.M).a__fE()).a__fE(moom.de.R, java.lang.Integer.valueOf(0)));
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(2826600581147917587L)), ((long)(-8404021162488647744L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(24642174648883L)))));
    long local6_life6 = (moom.de.T ^ 98066606209230L);
    javax.crypto.Cipher local1_life8;
    javax.crypto.Cipher __sourceSpill814_10 = (local1_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill814_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill814_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill814_13 = new byte[8];
    (__sourceSpill814_13)[0] = ((byte) ((int) (local6_life6 >>> 56)));
    int local2_life14 = 1;
    while ((local2_life14 < 8)) {
        (__sourceSpill814_13)[local2_life14] = ((byte) ((int) ((local6_life6 << (local2_life14 * 8)) >>> 56)));
        local2_life14 += 1;
    }
    byte[] __sourcePreallocation814_15 = __sourceSpill814_13;
    ((javax.crypto.Cipher)(__sourceSpill814_10)).init(((int)(__sourceSpill814_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill814_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation814_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local3_life18 = -463398312254236571L;
    byte[] __sourceSpill814_19 = new byte[8];
    (__sourceSpill814_19)[0] = ((byte) ((int) (local3_life18 >>> 56)));
    (__sourceSpill814_19)[1] = ((byte) ((int) (local3_life18 >>> 48)));
    (__sourceSpill814_19)[2] = ((byte) ((int) (local3_life18 >>> 40)));
    (__sourceSpill814_19)[3] = ((byte) ((int) (local3_life18 >>> 32)));
    (__sourceSpill814_19)[4] = ((byte) ((int) (local3_life18 >>> 24)));
    (__sourceSpill814_19)[5] = ((byte) ((int) (local3_life18 >>> 16)));
    (__sourceSpill814_19)[6] = ((byte) ((int) (local3_life18 >>> 8)));
    (__sourceSpill814_19)[7] = ((byte) ((int) local3_life18));
    javax.crypto.Cipher __sourceSpill814_20 = local1_life8;
    byte[] local5_life22 = ((javax.crypto.Cipher)(__sourceSpill814_20)).doFinal(((byte[])(__sourceSpill814_19)));
    long local0_life23 = (((((((((((long) (local5_life22)[0]) & 255L) << 56) | ((((long) (local5_life22)[1]) & 255L) << 48)) | ((((long) (local5_life22)[2]) & 255L) << 40)) | ((((long) (local5_life22)[3]) & 255L) << 32)) | ((((long) (local5_life22)[4]) & 255L) << 24)) | ((((long) (local5_life22)[5]) & 255L) << 16)) | ((((long) (local5_life22)[6]) & 255L) << 8)) | (((long) (local5_life22)[7]) & 255L));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("rotation")), ((int)(0)), ((int)(((int) local0_life23))))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.de.R))))))).intValue();
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
return ((net.minecraft.block.state.IBlockState)(((moom.de)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.de.R)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(p0))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.de.R});
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long l = moom.de.T ^ 0x46B15B85FC3CL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        if (nArray != null) {
            if (!p0.a__fE(__sourceExactCall_bcb977d05e639b(p1)).a__ch().a__fn().b__Boolean()) {
                this.a(p0, p1, p2, 0);
                p0.d__Boolean(p1);
            }
            super.a(p0, p1, p2, p3);
        }
}


private static native moom.DT __sourceExactCall_bcb977d05e639b(moom.DT p0);
}
