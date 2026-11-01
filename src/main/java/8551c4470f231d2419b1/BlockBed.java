package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


















import moom.DT;











import net.minecraft.block.BlockPlanks$EnumType;






import net.minecraft.world.World;
import java.util.Map;
public class BlockBed extends net.minecraft.block.BlockDirectional {

public static final moom.fw<net.minecraft.block.BlockBed$EnumPartType> R;

public static final moom.fv S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

public BlockBed() {
super(moom.fn.n);
    (this).a__Void((((this.M).a__fE()).a__fE(net.minecraft.block.BlockBed.R, net.minecraft.block.BlockBed$EnumPartType.FOOT)).a__fE(net.minecraft.block.BlockBed.S, java.lang.Boolean.FALSE));
    (this).c();
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(1517548557290363737L)), ((long)(-5017518995380113288L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(20128353164416L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.block.BlockBed.T ^ 119995092418698L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1153_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1153_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1153_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1153_14 = new byte[8];
    (__sourceSpill1153_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1153_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1153_16 = __sourceSpill1153_14;
    ((javax.crypto.Cipher)(__sourceSpill1153_11)).init(((int)(__sourceSpill1153_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1153_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1153_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\002\024Î\017\033\020òÂq(\030\013ð"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1153_25 = local6_life21;
        int __sourceSpill1153_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1153_25)).substring(((int)(__sourceSpill1153_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1153_30 = local8_life19;
        int __sourceSpill1153_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1153_33 = new byte[8];
        (__sourceSpill1153_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1153_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1153_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1153_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1153_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1153_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1153_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1153_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1153_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1153_34)).doFinal(((byte[])(__sourceSpill1153_33)));
        (__sourceSpill1153_30)[__sourceSpill1153_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("part")), ((java.lang.Class)(net.minecraft.block.BlockBed$EnumPartType.class)))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("occupied")))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9939_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/di"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue4647_33_0;
    moom.fv forwardValue4647_33_1;
    int forwardValue4647_33_2;
    net.minecraft.block.state.IBlockState forwardValue4647_34_0;
    moom.fv forwardValue4647_34_1;
    net.minecraft.block.state.IBlockState forwardValue4647_35_0;
    moom.fv forwardValue4647_35_1;
    int forwardValue4647_35_2;
    net.minecraft.block.state.IBlockState forwardValue4647_46_0;
    int[] spill4647_0;
    net.minecraft.block.state.IBlockState spill4647_1;
    moom.fv spill4647_2;
    int spill4647_3;
    long life2_3;
    moom.bs life5_7;
    int[] life4_8;
    forward_join_46: {
    forward_join_38: {
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    life2_3 = (net.minecraft.block.BlockBed.T ^ 49668538661116L);
    spill4647_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_7 = moom.bs.b(((int)(p0)));
    life4_8 = spill4647_0;
    if (!(((p0 & __sourceIntrinsic_819466f05fee_invokedynamic4647_3(13560, (4166116800712863642L ^ life2_3))) > 0))) {
        break forward_join_38;
    }
    spill4647_1 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockBed)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockBed$EnumPartType.HEAD))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)), ((java.lang.Comparable)(life5_7)));
    spill4647_2 = net.minecraft.block.BlockBed.S;
    spill4647_3 = (p0 & 4);
    if (!((life4_8 != null))) {
        forwardValue4647_33_0 = spill4647_1;
        forwardValue4647_33_1 = spill4647_2;
        forwardValue4647_33_2 = spill4647_3;
        break forward_join_33;
    }
    if (!((spill4647_3 > 0))) {
        forwardValue4647_34_0 = spill4647_1;
        forwardValue4647_34_1 = spill4647_2;
        break forward_join_34;
    }
    forwardValue4647_33_0 = spill4647_1;
    forwardValue4647_33_1 = spill4647_2;
    forwardValue4647_33_2 = 1;
    }
    forwardValue4647_35_0 = forwardValue4647_33_0;
    forwardValue4647_35_1 = forwardValue4647_33_1;
    forwardValue4647_35_2 = forwardValue4647_33_2;
    break forward_join_35;
    }
    forwardValue4647_35_0 = forwardValue4647_34_0;
    forwardValue4647_35_1 = forwardValue4647_34_1;
    forwardValue4647_35_2 = 0;
    }
    forwardValue4647_46_0 = ((net.minecraft.block.state.IBlockState)(forwardValue4647_35_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue4647_35_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue4647_35_2)))))));
    break forward_join_46;
    }
    forwardValue4647_46_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.BlockBed)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R)), ((java.lang.Comparable)(net.minecraft.block.BlockBed$EnumPartType.FOOT))))).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)), ((java.lang.Comparable)(life5_7)));
    }
    return forwardValue4647_46_0;
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue4646_44_0;
    int[] spill4646_0;
    int spill4646_1;
    boolean spill4646_2;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_17;
    forward_join_44: {
    forward_join_43: {
    life2_3 = (net.minecraft.block.BlockBed.T ^ 36938779329526L);
    spill4646_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill4646_0;
    spill4646_1 = (life5_6 | ((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q))))))).b());
    if (!((life4_7 != null))) {
        forwardValue4646_44_0 = spill4646_1;
        break forward_join_44;
    }
    life5_17 = spill4646_1;
    if (!((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.HEAD))) {
        break forward_join_43;
    }
    life5_17 = (life5_17 | __sourceIntrinsic_8db5871551d4_invokedynamic4646_9(21500, (4555252969579049877L ^ life2_3)));
    spill4646_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue4646_44_0 = ((spill4646_2) ? 1 : 0);
        break forward_join_44;
    }
    if (!(spill4646_2)) {
        break forward_join_43;
    }
    life5_17 = (life5_17 | 4);
    }
    forwardValue4646_44_0 = life5_17;
    }
    return forwardValue4646_44_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.block.BlockBed.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12462;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/di", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public int e__Int() {
return 1;
}


protected static boolean c(net.minecraft.world.World p0, moom.DT p1) {
long l = net.minecraft.block.BlockBed.T ^ 0x39C44900B86CL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = World.a(p0, p1.b__DT());
        if (nArray != null) {
            if (!bl) return false;
            bl = p0.a__fE(p1).a__ch().a__fn().b__Boolean();
        }
        if (nArray != null) {
            if (bl) return false;
            bl = p0.a__fE(p1.a__DT()).a__ch().a__fn().b__Boolean();
        }
        if (nArray == null) return bl;
        if (bl) return false;
        return true;
}


private void c__sourceReturn_da8c82d5d4() {
((net.minecraft.block.BlockBed)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.2p-1f)), ((float)(0x1.0p0f)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockBed.Q, net.minecraft.block.BlockBed.R, net.minecraft.block.BlockBed.S});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.block.state.IBlockState forwardValue4640_37_0;
    net.minecraft.block.state.IBlockState spill4640_0;
    net.minecraft.block.state.IBlockState spill4640_1;
    long life4_3;
    int[] life6_5;
    net.minecraft.block.state.IBlockState life7_24;
    forward_join_37: {
    forward_join_36: {
    life4_3 = (net.minecraft.block.BlockBed.T ^ 129589069759072L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4640_0 = p0;
    if (!((life6_5 != null))) {
        forwardValue4640_37_0 = spill4640_0;
        break forward_join_37;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4640_0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.FOOT))) {
        break forward_join_36;
    }
    life7_24 = ((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)))))))))));
    spill4640_1 = life7_24;
    if (!((life6_5 != null))) {
        forwardValue4640_37_0 = spill4640_1;
        break forward_join_37;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4640_1)).a__ch() == this))) {
        break forward_join_36;
    }
    p0 = ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S)), ((java.lang.Comparable)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life7_24)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S))))))));
    }
    forwardValue4640_37_0 = p0;
    }
    return forwardValue4640_37_0;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((net.minecraft.block.BlockBed)(this)).c__sourceReturn_da8c82d5d4();
    return;
}


private net.minecraft.entity.player.EntityPlayer a__sourceReturn_c65e055323(net.minecraft.world.World p0, moom.DT p1) {
int lexicalValue1455_28_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1455_30_0;
    int[] spill1455_0;
    boolean spill1455_1;
    net.minecraft.entity.player.EntityPlayer spill1455_2;
    long life3_3;
    java.util.Iterator life6_8;
    int[] life5_9;
    net.minecraft.entity.player.EntityPlayer life7_16;
    lexical_join_33: {
    life3_3 = (net.minecraft.block.BlockBed.T ^ 63219448593465L);
    spill1455_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((java.util.List)(((net.minecraft.world.World)(p0)).i)).iterator();
    life5_9 = spill1455_0;
    lexical_cycle_10: while (true) {
    lexical_join_31: {
    lexical_join_30: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_33;
    }
    life7_16 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life6_8)).next()));
    spill1455_1 = ((net.minecraft.entity.player.EntityPlayer)(life7_16)).K__Boolean();
    if (!((life5_9 != null))) {
        lexicalValue1455_28_0 = ((spill1455_1) ? 1 : 0);
        break lexical_join_28;
    }
    if (!(spill1455_1)) {
        break lexical_join_31;
    }
    spill1455_2 = life7_16;
    if (!((life5_9 != null))) {
        lexicalValue1455_30_0 = spill1455_2;
        break lexical_join_30;
    }
    lexicalValue1455_28_0 = ((((moom.DT)(((net.minecraft.entity.player.EntityPlayer)(spill1455_2)).bT)).equals(((java.lang.Object)(p1)))) ? 1 : 0);
    }
    if (!((lexicalValue1455_28_0 != 0))) {
        break lexical_join_31;
    }
    lexicalValue1455_30_0 = life7_16;
    }
    return lexicalValue1455_30_0;
    }
    if (!((life5_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return null;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
int forwardValue4645_12_0;
    net.minecraft.block.state.IBlockState forwardValue4645_34_0;
    net.minecraft.world.World forwardValue4645_40_0;
    moom.aX forwardValue4645_112_0;
    moom.aX forwardValue4645_112_1;
    moom.aX forwardValue4645_127_0;
    moom.aX forwardValue4645_127_1;
    net.minecraft.world.World forwardValue4645_140_0;
    moom.DT forwardValue4645_140_1;
    int forwardValue4645_141_0;
    net.minecraft.world.World forwardValue4645_163_0;
    boolean spill4645_0;
    net.minecraft.block.state.IBlockState spill4645_1;
    net.minecraft.world.World spill4645_2;
    boolean spill4645_3;
    net.minecraft.world.World spill4645_4;
    moom.DT spill4645_5;
    moom.aX spill4645_6;
    moom.aX spill4645_7;
    net.minecraft.world.World spill4645_8;
    long life9_3;
    int[] life11_5;
    net.minecraft.entity.player.EntityPlayer life12_82;
    moom.aX life12_116;
    net.minecraft.block.state.IBlockState life3_129;
    moom.DT life12_192;
    forward_join_163: {
    forward_join_162: {
    forward_join_141: {
    forward_join_140: {
    forward_join_138: {
    forward_join_136: {
    forward_join_127: {
    forward_join_125: {
    forward_join_112: {
    forward_join_110: {
    forward_join_88: {
    forward_join_82: {
    forward_join_77: {
    forward_join_40: {
    forward_join_39: {
    forward_join_34: {
    forward_join_13: {
    forward_join_12: {
    life9_3 = (net.minecraft.block.BlockBed.T ^ 108945955398588L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4645_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life11_5 != null))) {
        forwardValue4645_12_0 = ((spill4645_0) ? 1 : 0);
        break forward_join_12;
    }
    if (!(spill4645_0)) {
        break forward_join_13;
    }
    forwardValue4645_12_0 = 1;
    }
    return ((forwardValue4645_12_0) != 0);
    }
    spill4645_1 = p2;
    if (!((life11_5 != null))) {
        forwardValue4645_34_0 = spill4645_1;
        break forward_join_34;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4645_1)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) != net.minecraft.block.BlockBed$EnumPartType.HEAD))) {
        break forward_join_39;
    }
    p1 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q))))))));
    spill4645_2 = p0;
    if (!((life11_5 != null))) {
        forwardValue4645_40_0 = spill4645_2;
        break forward_join_40;
    }
    p2 = ((net.minecraft.world.World)(spill4645_2)).a__fE(((moom.DT)(p1)));
    forwardValue4645_34_0 = p2;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue4645_34_0)).a__ch() != this))) {
        break forward_join_39;
    }
    return ((1) != 0);
    }
    forwardValue4645_40_0 = p0;
    }
    spill4645_3 = ((moom.EA)(((net.minecraft.world.World)(forwardValue4645_40_0)).v)).b__Boolean();
    if (!((life11_5 != null))) {
        forwardValue4645_141_0 = ((spill4645_3) ? 1 : 0);
        break forward_join_141;
    }
    if (!(spill4645_3)) {
        break forward_join_138;
    }
    spill4645_4 = p0;
    spill4645_5 = p1;
    if (!((life11_5 != null))) {
        forwardValue4645_140_0 = spill4645_4;
        forwardValue4645_140_1 = spill4645_5;
        break forward_join_140;
    }
    if (!((((net.minecraft.world.World)(spill4645_4)).a__ES(((moom.DT)(spill4645_5))) != net.minecraft.world.biome.BiomeGenBase.z))) {
        break forward_join_138;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S))))))).booleanValue())) {
        break forward_join_88;
    }
    life12_82 = ((net.minecraft.block.BlockBed)(this)).a__sourceReturn_c65e055323(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life11_5 != null))) {
        break forward_join_82;
    }
    if (!((life12_82 != null))) {
        break forward_join_77;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).b(((net.minecraft.util.IChatComponent)(new moom.CN("tile.bed.occupied", new java.lang.Object[0]))));
    return ((1) != 0);
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    }
    life12_116 = ((net.minecraft.entity.player.EntityPlayer)(p3)).a__sourceReturn_47d2aadd8a(((moom.DT)(p1)));
    spill4645_6 = life12_116;
    spill4645_7 = moom.aX.OK;
    if (!((life11_5 != null))) {
        forwardValue4645_112_0 = spill4645_6;
        forwardValue4645_112_1 = spill4645_7;
        break forward_join_112;
    }
    if (!((spill4645_6 == spill4645_7))) {
        break forward_join_110;
    }
    life3_129 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.S)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life3_129)), ((int)(4)));
    if (!((life11_5 == null))) {
        break forward_join_136;
    }
    }
    forwardValue4645_112_0 = life12_116;
    forwardValue4645_112_1 = moom.aX.NOT_POSSIBLE_NOW;
    }
    if (!((life11_5 != null))) {
        forwardValue4645_127_0 = forwardValue4645_112_0;
        forwardValue4645_127_1 = forwardValue4645_112_1;
        break forward_join_127;
    }
    if (!((forwardValue4645_112_0 == forwardValue4645_112_1))) {
        break forward_join_125;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).b(((net.minecraft.util.IChatComponent)(new moom.CN("tile.bed.noSleep", new java.lang.Object[0]))));
    if (!((life11_5 == null))) {
        break forward_join_136;
    }
    }
    forwardValue4645_127_0 = life12_116;
    forwardValue4645_127_1 = moom.aX.NOT_SAFE;
    }
    if (!((forwardValue4645_127_0 == forwardValue4645_127_1))) {
        break forward_join_136;
    }
    ((net.minecraft.entity.player.EntityPlayer)(p3)).b(((net.minecraft.util.IChatComponent)(new moom.CN("tile.bed.notSafe", new java.lang.Object[0]))));
    }
    return ((1) != 0);
    }
    forwardValue4645_140_0 = p0;
    forwardValue4645_140_1 = p1;
    }
    forwardValue4645_141_0 = ((((net.minecraft.world.World)(forwardValue4645_140_0)).d__Boolean(((moom.DT)(forwardValue4645_140_1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue4645_141_0);
    life12_192 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q))))))).a__bs())));
    spill4645_8 = p0;
    if (!((life11_5 != null))) {
        forwardValue4645_163_0 = spill4645_8;
        break forward_join_163;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4645_8)).a__fE(((moom.DT)(life12_192))))).a__ch() == this))) {
        break forward_join_162;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life12_192)));
    }
    forwardValue4645_163_0 = p0;
    }
    ((net.minecraft.world.World)(forwardValue4645_163_0)).a(((net.minecraft.entity.Entity)(null)), ((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((float)(0x1.4p2f)), ((boolean)(true)), ((boolean)(true)));
    return ((1) != 0);
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
long local4 = (net.minecraft.block.BlockBed.T ^ 138857069700455L);
    return ((((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.HEAD) ? null : net.minecraft.init.Items.a0);
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
net.minecraft.world.World forwardValue4643_31_0;
    moom.DT forwardValue4643_31_1;
    net.minecraft.block.state.IBlockState forwardValue4643_42_0;
    net.minecraft.world.World forwardValue4643_47_0;
    moom.DT forwardValue4643_47_1;
    int[] spill4643_0;
    net.minecraft.block.state.IBlockState spill4643_1;
    net.minecraft.world.World spill4643_2;
    moom.DT spill4643_3;
    net.minecraft.world.World spill4643_4;
    moom.DT spill4643_5;
    long life5_3;
    moom.bs life8_9;
    int[] life7_10;
    forward_join_58: {
    forward_join_47: {
    forward_join_42: {
    forward_join_35: {
    forward_join_31: {
    life5_3 = (net.minecraft.block.BlockBed.T ^ 24917999871658L);
    spill4643_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)))));
    life7_10 = spill4643_0;
    spill4643_1 = p2;
    if (!((life7_10 != null))) {
        forwardValue4643_42_0 = spill4643_1;
        break forward_join_42;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill4643_1)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.HEAD))) {
        break forward_join_35;
    }
    spill4643_2 = p0;
    spill4643_3 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(life8_9)).a__bs())));
    if (!((life7_10 != null))) {
        forwardValue4643_31_0 = spill4643_2;
        forwardValue4643_31_1 = spill4643_3;
        break forward_join_31;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4643_2)).a__fE(((moom.DT)(spill4643_3))))).a__ch() != this))) {
        break forward_join_58;
    }
    forwardValue4643_31_0 = p0;
    forwardValue4643_31_1 = p1;
    }
    ((net.minecraft.world.World)(forwardValue4643_31_0)).d__Boolean(((moom.DT)(forwardValue4643_31_1)));
    if (!((life7_10 == null))) {
        break forward_join_58;
    }
    }
    spill4643_4 = p0;
    spill4643_5 = ((moom.DT)(p1)).a(((moom.bs)(life8_9)));
    if (!((life7_10 != null))) {
        forwardValue4643_47_0 = spill4643_4;
        forwardValue4643_47_1 = spill4643_5;
        break forward_join_47;
    }
    forwardValue4643_42_0 = ((net.minecraft.world.World)(spill4643_4)).a__fE(((moom.DT)(spill4643_5)));
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue4643_42_0)).a__ch() != this))) {
        break forward_join_58;
    }
    forwardValue4643_47_0 = p0;
    forwardValue4643_47_1 = p1;
    }
    ((net.minecraft.world.World)(forwardValue4643_47_0)).d__Boolean(((moom.DT)(forwardValue4643_47_1)));
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_58;
    }
    ((net.minecraft.block.BlockBed)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, float p3, int p4) {
long local6 = (net.minecraft.block.BlockBed.T ^ 9597841536783L);
    if ((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.FOOT)) {
        super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((float)(p3)), ((int)(0)));
    }
    return;
}


public static moom.DT a__sourceReturn_2e9303aa75(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue953_25_0;
    int forestValue953_56_0;
    int[] spill953_0;
    int spill953_1;
    boolean spill953_2;
    long life3_3;
    moom.bs life6_10;
    int life7_13;
    int life8_17;
    int life9_20;
    int[] life5_21;
    int life10_23;
    int life11_35;
    int life12_44;
    int life13_48;
    int life14_52;
    int life15_54;
    int life16_61;
    moom.DT life17_71;
    forest_join_96: {
    forest_join_94: {
    life3_3 = (net.minecraft.block.BlockBed.T ^ 22346372605908L);
    life6_10 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q)))));
    life7_13 = ((moom.DT)(p1)).a();
    spill953_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_17 = ((moom.DT)(p1)).b();
    life9_20 = ((moom.DT)(p1)).c();
    life5_21 = spill953_0;
    life10_23 = 0;
    forest_cycle_24: while (true) {
    forest_join_90: {
    forestValue953_25_0 = life10_23;
    forest_cycle_25: while (true) {
    if (!((forestValue953_25_0 <= 1))) {
        break forest_join_96;
    }
    life11_35 = ((life7_13 - (((moom.bs)(life6_10)).c() * life10_23)) - 1);
    life12_44 = ((life9_20 - (((moom.bs)(life6_10)).e() * life10_23)) - 1);
    life13_48 = (life11_35 + 2);
    life14_52 = (life12_44 + 2);
    life15_54 = life11_35;
    forest_cycle_55: while (true) {
    forest_join_87: {
    forestValue953_56_0 = life15_54;
    forest_cycle_56: while (true) {
    if (!((forestValue953_56_0 <= life13_48))) {
        break forest_join_90;
    }
    spill953_1 = life12_44;
    if (!((life5_21 != null))) {
        forestValue953_25_0 = spill953_1;
        continue forest_cycle_25;
    }
    life16_61 = spill953_1;
    forest_cycle_62: while (true) {
    forest_join_85: {
    forest_join_84: {
    forest_join_83: {
    if (!((life16_61 <= life14_52))) {
        break forest_join_87;
    }
    life17_71 = new moom.DT(life15_54, life8_17, life16_61);
    if (!((life5_21 != null))) {
        break forest_join_85;
    }
    spill953_2 = net.minecraft.block.BlockBed.c(((net.minecraft.world.World)(p0)), ((moom.DT)(life17_71)));
    if (!((life5_21 != null))) {
        forestValue953_56_0 = ((spill953_2) ? 1 : 0);
        continue forest_cycle_56;
    }
    if (!(spill953_2)) {
        break forest_join_84;
    }
    if (!((p2 <= 0))) {
        break forest_join_83;
    }
    break forest_join_94;
    }
    p2 += -1;
    }
    life16_61 += 1;
    }
    if (!((life5_21 == null))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    break forest_cycle_56;
    }
    }
    life15_54 += 1;
    if (!((life5_21 == null))) {
        continue forest_cycle_55;
    }
    break forest_cycle_55;
    }
    break forest_cycle_25;
    }
    }
    life10_23 += 1;
    if (!((life5_21 == null))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    break forest_join_96;
    }
    return life17_71;
    }
    return null;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.world.World forwardValue4644_33_0;
    moom.DT forwardValue4644_33_1;
    net.minecraft.world.World spill4644_0;
    moom.DT spill4644_1;
    long life5_3;
    int[] life7_5;
    moom.DT life8_25;
    forward_join_35: {
    forward_join_33: {
    life5_3 = (net.minecraft.block.BlockBed.T ^ 128441681670542L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d)) {
        break forward_join_35;
    }
    if (!((((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.R))) == net.minecraft.block.BlockBed$EnumPartType.HEAD))) {
        break forward_join_35;
    }
    life8_25 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockBed.Q))))))).a__bs())));
    spill4644_0 = p0;
    spill4644_1 = life8_25;
    if (!((life7_5 != null))) {
        forwardValue4644_33_0 = spill4644_0;
        forwardValue4644_33_1 = spill4644_1;
        break forward_join_33;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill4644_0)).a__fE(((moom.DT)(spill4644_1))))).a__ch() == this))) {
        break forward_join_35;
    }
    forwardValue4644_33_0 = p0;
    forwardValue4644_33_1 = life8_25;
    }
    ((net.minecraft.world.World)(forwardValue4644_33_0)).d__Boolean(((moom.DT)(forwardValue4644_33_1)));
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return net.minecraft.init.Items.a0;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9939_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic4646_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic4647_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
