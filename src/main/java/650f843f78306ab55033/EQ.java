package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EQ {

protected net.minecraft.world.World a;

protected java.util.Random b;

protected moom.DT c;

protected moom.FD d;

protected moom.FY e;

protected moom.FY f;

protected moom.FY g;

protected moom.FY h;

protected moom.FY i;

protected moom.FY j;

protected moom.FY k;

protected moom.FY l;

protected moom.FY m;

protected moom.FY n;

protected moom.FY o;

protected moom.FY p;

protected moom.FY q;

protected moom.FY r;

protected moom.Gl s;

protected moom.FY t;

protected moom.FY u;

protected moom.FY v;

protected moom.FY w;

protected moom.FY x;

protected moom.FY y;

protected int z;

protected int A;

protected int B;

protected int C;

protected int D;

protected int E;

protected int F;

protected int G;

protected int H;

protected int I;

protected int J;

protected int K;

public boolean L;

private static long N;

private static long[] P;

private static java.lang.Integer[] Q;

private static java.util.Map R;

public EQ() { super(); }


private static void __sourceConstructorBody_c305ef87ad40783d(moom.EQ receiver) throws Throwable {

long local1 = (moom.EQ.N ^ 73168938166056L);

    moom.EQ.__sourceConstructorInit_c305ef87ad40783d_0(((moom.EQ)(receiver)));

    ((moom.EQ)(receiver)).e = ((moom.FY)(new moom.Gf(4)));

    ((moom.EQ)(receiver)).f = ((moom.FY)(new moom.Gx(net.minecraft.init.Blocks.m, __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_4(1576, (8984158364816147033L ^ local1)))));

    ((moom.EQ)(receiver)).g = ((moom.FY)(new moom.Gx(net.minecraft.init.Blocks.n, __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_7(14053, (2649051293543608987L ^ local1)))));

    ((moom.EQ)(receiver)).s = ((moom.Gl)(new moom.Gl(net.minecraft.init.Blocks.N, net.minecraft.block.BlockFlower$EnumFlowerType.DANDELION)));

    ((moom.EQ)(receiver)).t = ((moom.FY)(new moom.FZ(net.minecraft.init.Blocks.P)));

    ((moom.EQ)(receiver)).u = ((moom.FY)(new moom.FZ(net.minecraft.init.Blocks.Q)));

    ((moom.EQ)(receiver)).v = ((moom.FY)(new moom.Gc()));

    ((moom.EQ)(receiver)).w = ((moom.FY)(new moom.Gw()));

    ((moom.EQ)(receiver)).x = ((moom.FY)(new moom.Ge()));

    ((moom.EQ)(receiver)).y = ((moom.FY)(new moom.GB()));

    ((moom.EQ)(receiver)).B = ((int)(__sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_20(7500, (4359678781232322868L ^ local1))));

    ((moom.EQ)(receiver)).C = ((int)(1));

    ((moom.EQ)(receiver)).H = ((int)(1));

    ((moom.EQ)(receiver)).I = ((int)(__sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_24(24771, (4978570090769179829L ^ local1))));

    ((moom.EQ)(receiver)).J = ((int)(1));

    ((moom.EQ)(receiver)).L = ((boolean)(true));

    return;

}



static {
N = ((long)(((moom._a)(moom._c.a(((long)(-4883852849351005716L)), ((long)(6615072355158028208L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42381328913492L)))));
    R = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.EQ.N ^ 86467130743473L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill710_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill710_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill710_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill710_14 = new byte[8];
    (__sourceSpill710_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill710_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation710_16 = __sourceSpill710_14;
    ((javax.crypto.Cipher)(__sourceSpill710_11)).init(((int)(__sourceSpill710_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill710_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation710_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[17];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "®\001¶[\027»ÉÂ\\ñ-\035ÆqQ~g\0348|\032ç\tÚ:5b%-ñ}\022G\n\023Ì\003Ïy\016÷6\037¾ùo%Ò/øMªm|ÿÑî(G{×\0050]CP9û«h×pÜ¯3\016×ã<¨(ÐBPH®0\005«mîS\033À©¦\026§Ïé"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill710_25 = local6_life21;
        int __sourceSpill710_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill710_25)).substring(((int)(__sourceSpill710_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill710_30 = local8_life19;
        int __sourceSpill710_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill710_33 = new byte[8];
        (__sourceSpill710_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill710_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill710_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill710_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill710_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill710_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill710_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill710_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill710_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill710_34)).doFinal(((byte[])(__sourceSpill710_33)));
        (__sourceSpill710_30)[__sourceSpill710_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "P®bÌíËpF®y\016ë´"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill710_38 = local6_life21;
        int __sourceSpill710_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill710_38)).substring(((int)(__sourceSpill710_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill710_43 = local8_life19;
        int __sourceSpill710_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill710_46 = new byte[8];
        (__sourceSpill710_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill710_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill710_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill710_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill710_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill710_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill710_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill710_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill710_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill710_47)).doFinal(((byte[])(__sourceSpill710_46)));
        (__sourceSpill710_43)[__sourceSpill710_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    P = ((long[])(local8_life19));
    Q = ((java.lang.Integer[])(new java.lang.Integer[17]));
}

private static native <E extends Throwable> void __sourceConstructorInit_c305ef87ad40783d_0(moom.EQ a0) throws E;

protected void b(int p0, moom.FY p1, int p2, int p3) {
java.lang.String spill591_0;
    long life5_3;
    int life8_6;
    java.lang.String life7_7;
    moom.DT life9_43;
    lexical_join_55: {
    life5_3 = (moom.EQ.N ^ 42103467356791L);
    spill591_0 = net.minecraft.world.biome.WorldChunkManager.b();
    life8_6 = 0;
    life7_7 = spill591_0;
    lexical_cycle_8: while (true) {
    if (!((life8_6 < p0))) {
        break lexical_join_55;
    }
    life9_43 = ((moom.DT)(this.c)).a(((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_1d6182b4e60e_invokedynamic591_4(1721, (1839620243268294559L ^ life5_3))))))), ((int)((((((java.util.Random)(this.b)).nextInt(((int)(p3))) + ((java.util.Random)(this.b)).nextInt(((int)(p3)))) + p2) - p3))), ((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_1d6182b4e60e_invokedynamic591_11(1721, (1839620243268294559L ^ life5_3))))))));
    ((moom.FY)(p1)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life9_43)));
    life8_6 += 1;
    if (!((life7_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x219F;
        if (Q[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = P[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])R.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    R.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/EQ", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            EQ.Q[n2] = n4;
        }
        return Q[n2];
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.EQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4329_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/EQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, net.minecraft.world.biome.BiomeGenBase p2, moom.DT p3) {
net.minecraft.world.World forwardValue1811_20_0;
    net.minecraft.world.World spill1811_0;
    long life5_3;
    java.lang.String life7_5;
    java.lang.String life8_27;
    forward_join_170: {
    forward_join_20: {
    forward_join_16: {
    life5_3 = (moom.EQ.N ^ 9293827937773L);
    life7_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill1811_0 = this.a;
    if (!((life7_5 == null))) {
        forwardValue1811_20_0 = spill1811_0;
        break forward_join_20;
    }
    if (!((spill1811_0 != null))) {
        break forward_join_16;
    }
    throw new java.lang.RuntimeException("Already decorating");
    }
    this.a = ((net.minecraft.world.World)(p0));
    forwardValue1811_20_0 = p0;
    }
    life8_27 = ((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(forwardValue1811_20_0)).a__IX())).b__String();
    this.d = ((moom.FD)(((moom.FE)(moom.FE.a(((java.lang.String)(((java.lang.String)(java.util.Objects.requireNonNullElse(((java.lang.Object)(life8_27)), ((java.lang.Object)("")))))))))).a()));
    this.b = ((java.util.Random)(p1));
    this.c = ((moom.DT)(p3));
    this.h = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.d)).a__fE(), ((moom.FD)(this.d)).I)));
    this.i = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.n)).a__fE(), ((moom.FD)(this.d)).M)));
    this.j = ((moom.FY)(new moom.Gu(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.GRANITE))), ((moom.FD)(this.d)).Q)));
    this.k = ((moom.FY)(new moom.Gu(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.DIORITE))), ((moom.FD)(this.d)).U)));
    this.l = ((moom.FY)(new moom.Gu(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ex.Q)), ((java.lang.Comparable)(net.minecraft.block.BlockStone$EnumType.ANDESITE))), ((moom.FD)(this.d)).Y)));
    this.m = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.q)).a__fE(), ((moom.FD)(this.d)).ac)));
    this.n = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.p)).a__fE(), ((moom.FD)(this.d)).ag)));
    this.o = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.o)).a__fE(), ((moom.FD)(this.d)).ak)));
    this.p = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aC)).a__fE(), ((moom.FD)(this.d)).ao)));
    this.q = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ag)).a__fE(), ((moom.FD)(this.d)).as)));
    this.r = ((moom.FY)(new moom.Gu(((net.minecraft.block.Block)(net.minecraft.init.Blocks.x)).a__fE(), ((moom.FD)(this.d)).aw)));
    ((moom.EQ)(this)).a(((net.minecraft.world.biome.BiomeGenBase)(p2)));
    this.a = ((net.minecraft.world.World)(null));
    this.b = ((java.util.Random)(null));
    if (!((life7_5 != null))) {
        break forward_join_170;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


protected void a(net.minecraft.world.biome.BiomeGenBase p0) {
int lexicalValue590_198_0;
    int lexicalValue590_272_0;
    int lexicalValue590_434_0;
    int lexicalValue590_513_0;
    int lexicalValue590_591_0;
    int lexicalValue590_686_0;
    int lexicalValue590_691_0;
    int lexicalValue590_762_0;
    int lexicalValue590_779_0;
    int lexicalValue590_840_0;
    int lexicalValue590_917_0;
    int lexicalValue590_987_0;
    int lexicalValue590_1064_0;
    int lexicalValue590_1151_0;
    int lexicalValue590_1222_0;
    int lexicalValue590_1300_0;
    int lexicalValue590_1304_0;
    int lexicalValue590_1390_0;
    java.lang.String spill590_0;
    int spill590_1;
    boolean spill590_2;
    int spill590_3;
    int spill590_4;
    int spill590_5;
    int spill590_6;
    boolean spill590_7;
    int spill590_8;
    int spill590_9;
    int spill590_10;
    int spill590_11;
    int spill590_12;
    int spill590_13;
    int spill590_14;
    int spill590_15;
    long life2_3;
    java.lang.String life4_7;
    int life5_9;
    int life6_28;
    int life7_43;
    int life6_89;
    int life7_104;
    int life6_150;
    int life7_165;
    int life6_210;
    int life7_228;
    int life8_243;
    moom.F0 life9_248;
    moom.DT life10_260;
    int life6_293;
    int life7_312;
    int life8_327;
    int life7_373;
    int life8_388;
    int life9_405;
    int life10_422;
    moom.DT life11_429;
    net.minecraft.block.BlockFlower$EnumFlowerType life12_435;
    moom.cA life13_439;
    int life6_470;
    int life7_489;
    int life8_504;
    int life9_517;
    int life10_534;
    int life6_555;
    int life7_574;
    int life8_589;
    int life9_602;
    int life10_619;
    int life6_639;
    int life7_658;
    int life8_673;
    int life9_686;
    int life10_703;
    moom.DT life11_710;
    moom.DT life12_716;
    int life6_754;
    int life7_788;
    int life8_803;
    moom.DT life9_813;
    int life7_854;
    int life8_869;
    int life9_882;
    int life10_894;
    moom.DT life11_901;
    int life6_938;
    int life7_953;
    int life8_966;
    int life9_978;
    int life6_1021;
    int life7_1036;
    int life8_1049;
    int life9_1061;
    int life6_1077;
    int life7_1096;
    int life8_1111;
    int life9_1124;
    int life10_1141;
    int life6_1160;
    int life7_1182;
    int life8_1197;
    int life9_1210;
    int life10_1227;
    int life6_1273;
    int life7_1288;
    int life8_1301;
    int life9_1313;
    int life6_1330;
    int life7_1349;
    int life8_1364;
    int life9_1377;
    int life10_1394;
    int life6_1421;
    int life7_1443;
    int life8_1458;
    int life9_1473;
    int life10_1490;
    moom.DT life11_1497;
    int life6_1513;
    int life7_1535;
    int life8_1550;
    int life9_1577;
    moom.DT life10_1584;
    lexical_join_1476: {
    lexical_join_1390: {
    lexical_join_1389: {
    lexical_join_1304: {
    lexical_join_1300: {
    lexical_join_1298: {
    lexical_join_1222: {
    lexical_join_1221: {
    lexical_join_1151: {
    lexical_join_1143: {
    lexical_join_1064: {
    lexical_join_1063: {
    lexical_join_987: {
    lexical_join_986: {
    lexical_join_917: {
    lexical_join_909: {
    lexical_join_840: {
    lexical_join_836: {
    lexical_join_691: {
    lexical_join_690: {
    lexical_join_591: {
    lexical_join_590: {
    lexical_join_513: {
    lexical_join_512: {
    lexical_join_434: {
    lexical_join_433: {
    lexical_join_331: {
    lexical_join_329: {
    lexical_join_272: {
    lexical_join_271: {
    lexical_join_198: {
    lexical_join_197: {
    lexical_join_185: {
    lexical_join_182: {
    lexical_join_126: {
    lexical_join_124: {
    lexical_join_68: {
    lexical_join_66: {
    life2_3 = (moom.EQ.N ^ 58438762555215L);
    spill590_0 = net.minecraft.world.biome.WorldChunkManager.b();
    ((moom.EQ)(this)).a();
    life4_7 = spill590_0;
    life5_9 = 0;
    lexical_cycle_10: while (true) {
    if (!((life5_9 < this.I))) {
        break lexical_join_66;
    }
    life6_28 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_5(32582, (5847492031396084572L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_7(20785, (7999837229255709986L ^ life2_3)));
    life7_43 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_9(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_11(28696, (1924210200885163018L ^ life2_3)));
    ((moom.FY)(this.f)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((net.minecraft.world.World)(this.a)).c__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_28)), ((int)(0)), ((int)(life7_43)))))))));
    life5_9 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_68;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    life5_9 = 0;
    }
    lexical_cycle_68: while (true) {
    if (!((life5_9 < this.J))) {
        break lexical_join_124;
    }
    life6_89 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_22(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_24(28696, (1924210200885163018L ^ life2_3)));
    life7_104 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_26(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_28(28696, (1924210200885163018L ^ life2_3)));
    ((moom.FY)(this.e)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((net.minecraft.world.World)(this.a)).c__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_89)), ((int)(0)), ((int)(life7_104)))))))));
    life5_9 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_126;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    life5_9 = 0;
    }
    lexical_cycle_126: while (true) {
    if (!((life5_9 < this.H))) {
        break lexical_join_182;
    }
    life6_150 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_39(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_41(28696, (1924210200885163018L ^ life2_3)));
    life7_165 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_43(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_45(28696, (1924210200885163018L ^ life2_3)));
    ((moom.FY)(this.g)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((net.minecraft.world.World)(this.a)).c__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_150)), ((int)(0)), ((int)(life7_165)))))))));
    life5_9 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_185;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_126; }
    break lexical_cycle_126;
    }
    }
    life5_9 = this.A;
    }
    spill590_1 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_56(7524, (8953353422669650296L ^ life2_3)))));
    if (!((life4_7 == null))) {
        lexicalValue590_198_0 = spill590_1;
        break lexical_join_198;
    }
    if (!((spill590_1 == 0))) {
        break lexical_join_197;
    }
    life5_9 += 1;
    }
    lexicalValue590_198_0 = 0;
    }
    life6_210 = lexicalValue590_198_0;
    lexical_cycle_199: while (true) {
    lexical_join_269: {
    lexical_join_268: {
    if (!((life6_210 < life5_9))) {
        break lexical_join_271;
    }
    life7_228 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_59(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_61(28696, (1924210200885163018L ^ life2_3)));
    life8_243 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_63(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_65(28696, (1924210200885163018L ^ life2_3)));
    life9_248 = ((net.minecraft.world.biome.BiomeGenBase)(p0)).a(((java.util.Random)(this.b)));
    ((moom.F0)(life9_248)).a();
    life10_260 = ((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_228)), ((int)(0)), ((int)(life8_243))))));
    if (!((life4_7 == null))) {
        break lexical_join_269;
    }
    spill590_2 = ((moom.F0)(life9_248)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life10_260)));
    if (!((life4_7 == null))) {
        lexicalValue590_272_0 = ((spill590_2) ? 1 : 0);
        break lexical_join_272;
    }
    if (!(spill590_2)) {
        break lexical_join_268;
    }
    ((moom.F0)(life9_248)).a(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life10_260)));
    }
    life6_210 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_199; }
    break lexical_cycle_199;
    }
    }
    lexicalValue590_272_0 = 0;
    }
    life6_293 = lexicalValue590_272_0;
    lexical_cycle_273: while (true) {
    if (!((life6_293 < this.K))) {
        break lexical_join_329;
    }
    life7_312 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_82(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_84(28696, (1924210200885163018L ^ life2_3)));
    life8_327 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_86(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_88(28696, (1924210200885163018L ^ life2_3)));
    ((moom.FY)(this.v)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_312)), ((int)(0)), ((int)(life8_327)))))))));
    life6_293 += 1;
    if (!((life4_7 == null))) {
        break lexical_join_331;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_273; }
    break lexical_cycle_273;
    }
    }
    life6_293 = 0;
    }
    lexical_cycle_331: while (true) {
    lexical_join_431: {
    lexical_join_430: {
    if (!((life6_293 < this.B))) {
        break lexical_join_433;
    }
    life7_373 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_99(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_101(28696, (1924210200885163018L ^ life2_3)));
    life8_388 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_103(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_105(28696, (1924210200885163018L ^ life2_3)));
    life9_405 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_373)), ((int)(0)), ((int)(life8_388)))))))).b() + __sourceIntrinsic_450d2df2537b_invokedynamic590_111(16928, (3657954549083555389L ^ life2_3)));
    if (!((life4_7 == null))) {
        break lexical_join_431;
    }
    spill590_3 = life9_405;
    if (!((life4_7 == null))) {
        lexicalValue590_434_0 = spill590_3;
        break lexical_join_434;
    }
    if (!((spill590_3 > 0))) {
        break lexical_join_430;
    }
    life10_422 = ((java.util.Random)(this.b)).nextInt(((int)(life9_405)));
    life11_429 = ((moom.DT)(this.c)).a(((int)(life7_373)), ((int)(life10_422)), ((int)(life8_388)));
    life12_435 = ((net.minecraft.world.biome.BiomeGenBase)(p0)).a(((java.util.Random)(this.b)), ((moom.DT)(life11_429)));
    life13_439 = ((moom.M)(((net.minecraft.block.BlockFlower$EnumFlowerType)(life12_435)).a__M())).a();
    if (!((life4_7 == null))) {
        break lexical_join_431;
    }
    if (!((((moom.cA)(life13_439)).a__fn() != moom.fn.a))) {
        break lexical_join_430;
    }
    ((moom.Gl)(this.s)).a(((moom.cA)(life13_439)), ((net.minecraft.block.BlockFlower$EnumFlowerType)(life12_435)));
    ((moom.Gl)(this.s)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life11_429)));
    }
    life6_293 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_331; }
    break lexical_cycle_331;
    }
    }
    lexicalValue590_434_0 = 0;
    }
    life6_470 = lexicalValue590_434_0;
    lexical_cycle_435: while (true) {
    lexical_join_510: {
    lexical_join_509: {
    if (!((life6_470 < this.C))) {
        break lexical_join_512;
    }
    life7_489 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_130(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_132(28696, (1924210200885163018L ^ life2_3)));
    life8_504 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_134(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_136(28696, (1924210200885163018L ^ life2_3)));
    life9_517 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_489)), ((int)(0)), ((int)(life8_504)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_510;
    }
    spill590_4 = life9_517;
    if (!((life4_7 == null))) {
        lexicalValue590_513_0 = spill590_4;
        break lexical_join_513;
    }
    if (!((spill590_4 > 0))) {
        break lexical_join_509;
    }
    life10_534 = ((java.util.Random)(this.b)).nextInt(((int)(life9_517)));
    ((moom.FY)(((net.minecraft.world.biome.BiomeGenBase)(p0)).a__FY(((java.util.Random)(this.b))))).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_489)), ((int)(life10_534)), ((int)(life8_504))))));
    }
    life6_470 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_435; }
    break lexical_cycle_435;
    }
    }
    lexicalValue590_513_0 = 0;
    }
    life6_555 = lexicalValue590_513_0;
    lexical_cycle_514: while (true) {
    lexical_join_588: {
    lexical_join_587: {
    if (!((life6_555 < this.D))) {
        break lexical_join_590;
    }
    life7_574 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_153(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_155(28696, (1924210200885163018L ^ life2_3)));
    life8_589 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_157(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_159(28696, (1924210200885163018L ^ life2_3)));
    life9_602 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_574)), ((int)(0)), ((int)(life8_589)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_588;
    }
    spill590_5 = life9_602;
    if (!((life4_7 == null))) {
        lexicalValue590_591_0 = spill590_5;
        break lexical_join_591;
    }
    if (!((spill590_5 > 0))) {
        break lexical_join_587;
    }
    life10_619 = ((java.util.Random)(this.b)).nextInt(((int)(life9_602)));
    ((moom.Gg)(new moom.Gg())).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_574)), ((int)(life10_619)), ((int)(life8_589))))));
    }
    life6_555 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_514; }
    break lexical_cycle_514;
    }
    }
    lexicalValue590_591_0 = 0;
    }
    life6_639 = lexicalValue590_591_0;
    lexical_cycle_592: while (true) {
    lexical_join_688: {
    lexical_join_687: {
    lexical_join_686: {
    lexical_join_678: {
    if (!((life6_639 < this.z))) {
        break lexical_join_690;
    }
    life7_658 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_174(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_176(28696, (1924210200885163018L ^ life2_3)));
    life8_673 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_178(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_180(28696, (1924210200885163018L ^ life2_3)));
    life9_686 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_658)), ((int)(0)), ((int)(life8_673)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_688;
    }
    spill590_6 = life9_686;
    if (!((life4_7 == null))) {
        lexicalValue590_691_0 = spill590_6;
        break lexical_join_691;
    }
    if (!((spill590_6 > 0))) {
        break lexical_join_687;
    }
    life10_703 = ((java.util.Random)(this.b)).nextInt(((int)(life9_686)));
    life11_710 = ((moom.DT)(this.c)).a(((int)(life7_658)), ((int)(life10_703)), ((int)(life8_673)));
    lexical_cycle_657: while (true) {
    lexical_join_676: {
    lexical_join_674: {
    if (!((((moom.DT)(life11_710)).b() > 0))) {
        break lexical_join_678;
    }
    life12_716 = ((moom.DT)(life11_710)).b__DT();
    if (!((life4_7 == null))) {
        break lexical_join_676;
    }
    spill590_7 = ((net.minecraft.world.World)(this.a)).a__Boolean(((moom.DT)(life12_716)));
    if (!((life4_7 == null))) {
        lexicalValue590_686_0 = ((spill590_7) ? 1 : 0);
        break lexical_join_686;
    }
    if (!((!spill590_7))) {
        break lexical_join_674;
    }
    if (!((life4_7 != null))) {
        break lexical_join_678;
    }
    }
    life11_710 = life12_716;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_657; }
    break lexical_cycle_657;
    }
    }
    lexicalValue590_686_0 = ((((moom.FY)(this.y)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life11_710)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue590_686_0);
    }
    life6_639 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_592; }
    break lexical_cycle_592;
    }
    }
    lexicalValue590_691_0 = 0;
    }
    life6_754 = lexicalValue590_691_0;
    lexical_cycle_692: while (true) {
    lexical_join_834: {
    lexical_join_833: {
    lexical_join_779: {
    lexical_join_762: {
    lexical_join_754: {
    if (!((life6_754 < this.E))) {
        break lexical_join_836;
    }
    spill590_8 = ((java.util.Random)(this.b)).nextInt(((int)(4)));
    if (!((life4_7 == null))) {
        lexicalValue590_840_0 = spill590_8;
        break lexical_join_840;
    }
    if (!((life4_7 == null))) {
        lexicalValue590_762_0 = spill590_8;
        break lexical_join_762;
    }
    if (!((spill590_8 == 0))) {
        break lexical_join_754;
    }
    life7_788 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_205(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_207(28696, (1924210200885163018L ^ life2_3)));
    life8_803 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_209(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_211(28696, (1924210200885163018L ^ life2_3)));
    life9_813 = ((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_788)), ((int)(0)), ((int)(life8_803))))));
    ((moom.FY)(this.t)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life9_813)));
    }
    lexicalValue590_762_0 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_221(28696, (1924210200885163018L ^ life2_3)))));
    }
    if (!((life4_7 == null))) {
        lexicalValue590_779_0 = lexicalValue590_762_0;
        break lexical_join_779;
    }
    if (!((lexicalValue590_762_0 == 0))) {
        break lexical_join_833;
    }
    lexicalValue590_779_0 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_224(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_226(28696, (1924210200885163018L ^ life2_3)));
    }
    life7_854 = lexicalValue590_779_0;
    life8_869 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_228(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_230(28696, (1924210200885163018L ^ life2_3)));
    life9_882 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_854)), ((int)(0)), ((int)(life8_869)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_834;
    }
    if (!((life9_882 > 0))) {
        break lexical_join_833;
    }
    life10_894 = ((java.util.Random)(this.b)).nextInt(((int)(life9_882)));
    life11_901 = ((moom.DT)(this.c)).a(((int)(life7_854)), ((int)(life10_894)), ((int)(life8_869)));
    ((moom.FY)(this.u)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life11_901)));
    }
    life6_754 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_692; }
    break lexical_cycle_692;
    }
    }
    lexicalValue590_840_0 = ((java.util.Random)(this.b)).nextInt(((int)(4)));
    }
    if (!((life4_7 == null))) {
        lexicalValue590_917_0 = lexicalValue590_840_0;
        break lexical_join_917;
    }
    if (!((lexicalValue590_840_0 == 0))) {
        break lexical_join_909;
    }
    life6_938 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_247(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_249(28696, (1924210200885163018L ^ life2_3)));
    life7_953 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_251(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_253(28696, (1924210200885163018L ^ life2_3)));
    life8_966 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_938)), ((int)(0)), ((int)(life7_953)))))))).b() * 2);
    spill590_9 = life8_966;
    if (!((life4_7 == null))) {
        lexicalValue590_917_0 = spill590_9;
        break lexical_join_917;
    }
    if (!((spill590_9 > 0))) {
        break lexical_join_909;
    }
    life9_978 = ((java.util.Random)(this.b)).nextInt(((int)(life8_966)));
    ((moom.FY)(this.t)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_938)), ((int)(life9_978)), ((int)(life7_953))))));
    }
    lexicalValue590_917_0 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_268(28696, (1924210200885163018L ^ life2_3)))));
    }
    if (!((life4_7 == null))) {
        lexicalValue590_987_0 = lexicalValue590_917_0;
        break lexical_join_987;
    }
    if (!((lexicalValue590_917_0 == 0))) {
        break lexical_join_986;
    }
    life6_1021 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_271(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_273(28696, (1924210200885163018L ^ life2_3)));
    life7_1036 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_275(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_277(28696, (1924210200885163018L ^ life2_3)));
    life8_1049 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_1021)), ((int)(0)), ((int)(life7_1036)))))))).b() * 2);
    spill590_10 = life8_1049;
    if (!((life4_7 == null))) {
        lexicalValue590_987_0 = spill590_10;
        break lexical_join_987;
    }
    if (!((spill590_10 > 0))) {
        break lexical_join_986;
    }
    life9_1061 = ((java.util.Random)(this.b)).nextInt(((int)(life8_1049)));
    ((moom.FY)(this.u)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_1021)), ((int)(life9_1061)), ((int)(life7_1036))))));
    }
    lexicalValue590_987_0 = 0;
    }
    life6_1077 = lexicalValue590_987_0;
    lexical_cycle_988: while (true) {
    lexical_join_1061: {
    lexical_join_1060: {
    if (!((life6_1077 < this.F))) {
        break lexical_join_1063;
    }
    life7_1096 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_293(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_295(28696, (1924210200885163018L ^ life2_3)));
    life8_1111 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_297(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_299(28696, (1924210200885163018L ^ life2_3)));
    life9_1124 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1096)), ((int)(0)), ((int)(life8_1111)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_1061;
    }
    spill590_11 = life9_1124;
    if (!((life4_7 == null))) {
        lexicalValue590_1064_0 = spill590_11;
        break lexical_join_1064;
    }
    if (!((spill590_11 > 0))) {
        break lexical_join_1060;
    }
    life10_1141 = ((java.util.Random)(this.b)).nextInt(((int)(life9_1124)));
    ((moom.FY)(this.w)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1096)), ((int)(life10_1141)), ((int)(life8_1111))))));
    }
    life6_1077 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_988; }
    break lexical_cycle_988;
    }
    }
    lexicalValue590_1064_0 = 0;
    }
    life6_1160 = lexicalValue590_1064_0;
    lexical_cycle_1065: while (true) {
    lexical_join_1141: {
    lexical_join_1140: {
    if (!((life6_1160 < __sourceIntrinsic_450d2df2537b_invokedynamic590_313(29861, (5296727673115144370L ^ life2_3))))) {
        break lexical_join_1143;
    }
    life7_1182 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_315(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_317(28696, (1924210200885163018L ^ life2_3)));
    life8_1197 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_319(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_321(28696, (1924210200885163018L ^ life2_3)));
    life9_1210 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1182)), ((int)(0)), ((int)(life8_1197)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_1141;
    }
    spill590_12 = life9_1210;
    if (!((life4_7 == null))) {
        lexicalValue590_1151_0 = spill590_12;
        break lexical_join_1151;
    }
    if (!((spill590_12 > 0))) {
        break lexical_join_1140;
    }
    life10_1227 = ((java.util.Random)(this.b)).nextInt(((int)(life9_1210)));
    ((moom.FY)(this.w)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1182)), ((int)(life10_1227)), ((int)(life8_1197))))));
    }
    life6_1160 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_1065; }
    break lexical_cycle_1065;
    }
    }
    lexicalValue590_1151_0 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_336(18897, (5655467664944319964L ^ life2_3)))));
    }
    if (!((life4_7 == null))) {
        lexicalValue590_1222_0 = lexicalValue590_1151_0;
        break lexical_join_1222;
    }
    if (!((lexicalValue590_1151_0 == 0))) {
        break lexical_join_1221;
    }
    life6_1273 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_339(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_341(28696, (1924210200885163018L ^ life2_3)));
    life7_1288 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_343(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_345(28696, (1924210200885163018L ^ life2_3)));
    life8_1301 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_1273)), ((int)(0)), ((int)(life7_1288)))))))).b() * 2);
    spill590_13 = life8_1301;
    if (!((life4_7 == null))) {
        lexicalValue590_1222_0 = spill590_13;
        break lexical_join_1222;
    }
    if (!((spill590_13 > 0))) {
        break lexical_join_1221;
    }
    life9_1313 = ((java.util.Random)(this.b)).nextInt(((int)(life8_1301)));
    ((moom.Gv)(new moom.Gv())).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life6_1273)), ((int)(life9_1313)), ((int)(life7_1288))))));
    }
    lexicalValue590_1222_0 = 0;
    }
    life6_1330 = lexicalValue590_1222_0;
    lexical_cycle_1223: while (true) {
    lexical_join_1296: {
    lexical_join_1295: {
    if (!((life6_1330 < this.G))) {
        break lexical_join_1298;
    }
    life7_1349 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_360(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_362(28696, (1924210200885163018L ^ life2_3)));
    life8_1364 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_364(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_366(28696, (1924210200885163018L ^ life2_3)));
    life9_1377 = (((moom.DT)(((net.minecraft.world.World)(this.a)).a__DT(((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1349)), ((int)(0)), ((int)(life8_1364)))))))).b() * 2);
    if (!((life4_7 == null))) {
        break lexical_join_1296;
    }
    spill590_14 = life9_1377;
    if (!((life4_7 == null))) {
        lexicalValue590_1300_0 = spill590_14;
        break lexical_join_1300;
    }
    if (!((spill590_14 > 0))) {
        break lexical_join_1295;
    }
    life10_1394 = ((java.util.Random)(this.b)).nextInt(((int)(life9_1377)));
    ((moom.FY)(this.x)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(this.c)).a(((int)(life7_1349)), ((int)(life10_1394)), ((int)(life8_1364))))));
    }
    life6_1330 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_1223; }
    break lexical_cycle_1223;
    }
    }
    lexicalValue590_1300_0 = ((this.L) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        lexicalValue590_1304_0 = lexicalValue590_1300_0;
        break lexical_join_1304;
    }
    if (!((lexicalValue590_1300_0 != 0))) {
        break lexical_join_1476;
    }
    lexicalValue590_1304_0 = 0;
    }
    life6_1421 = lexicalValue590_1304_0;
    lexical_cycle_1305: while (true) {
    lexical_join_1387: {
    lexical_join_1386: {
    if (!((life6_1421 < __sourceIntrinsic_450d2df2537b_invokedynamic590_382(6559, (8465282040594668943L ^ life2_3))))) {
        break lexical_join_1389;
    }
    life7_1443 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_384(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_386(28696, (1924210200885163018L ^ life2_3)));
    life8_1458 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_388(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_390(28696, (1924210200885163018L ^ life2_3)));
    life9_1473 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_392(9285, (1126180597117722717L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_394(28696, (1924210200885163018L ^ life2_3)));
    if (!((life4_7 == null))) {
        break lexical_join_1387;
    }
    spill590_15 = life9_1473;
    if (!((life4_7 == null))) {
        lexicalValue590_1390_0 = spill590_15;
        break lexical_join_1390;
    }
    if (!((spill590_15 > 0))) {
        break lexical_join_1386;
    }
    life10_1490 = ((java.util.Random)(this.b)).nextInt(((int)(life9_1473)));
    life11_1497 = ((moom.DT)(this.c)).a(((int)(life7_1443)), ((int)(life10_1490)), ((int)(life8_1458)));
    ((moom.Gs)(new moom.Gs(net.minecraft.init.Blocks.i))).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life11_1497)));
    }
    life6_1421 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_1305; }
    break lexical_cycle_1305;
    }
    }
    lexicalValue590_1390_0 = 0;
    }
    life6_1513 = lexicalValue590_1390_0;
    lexical_cycle_1391: while (true) {
    if (!((life6_1513 < __sourceIntrinsic_450d2df2537b_invokedynamic590_403(18330, (8177041710564656015L ^ life2_3))))) {
        break lexical_join_1476;
    }
    life7_1535 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_405(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_407(28696, (1924210200885163018L ^ life2_3)));
    life8_1550 = (((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_409(1721, (1839640947903038119L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_411(28696, (1924210200885163018L ^ life2_3)));
    life9_1577 = ((java.util.Random)(this.b)).nextInt(((int)((((java.util.Random)(this.b)).nextInt(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_450d2df2537b_invokedynamic590_415(21889, (2412940092414251413L ^ life2_3))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_417(28696, (1924210200885163018L ^ life2_3)))))) + __sourceIntrinsic_450d2df2537b_invokedynamic590_419(28696, (1924210200885163018L ^ life2_3))))));
    life10_1584 = ((moom.DT)(this.c)).a(((int)(life7_1535)), ((int)(life9_1577)), ((int)(life8_1550)));
    ((moom.Gs)(new moom.Gs(net.minecraft.init.Blocks.k))).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life10_1584)));
    life6_1513 += 1;
    if (!((life4_7 != null))) { continue lexical_cycle_1391; }
    break lexical_cycle_1391;
    }
    }
    return;
}


protected void a(int p0, moom.FY p1, int p2, int p3) {
int lexicalValue589_23_0;
    int lexicalValue589_23_1;
    int lexicalValue589_36_0;
    int spill589_0;
    int spill589_1;
    int spill589_2;
    long life5_3;
    java.lang.String life7_5;
    int life8_15;
    int life8_54;
    moom.DT life9_85;
    lexical_join_79: {
    lexical_join_36: {
    lexical_join_35: {
    lexical_join_34: {
    lexical_join_23: {
    lexical_join_19: {
    life5_3 = (moom.EQ.N ^ 97013589830002L);
    life7_5 = net.minecraft.world.biome.WorldChunkManager.b();
    spill589_0 = p3;
    spill589_1 = p2;
    if (!((life7_5 == null))) {
        lexicalValue589_23_0 = spill589_0;
        lexicalValue589_23_1 = spill589_1;
        break lexical_join_23;
    }
    if (!((spill589_0 < spill589_1))) {
        break lexical_join_19;
    }
    life8_15 = p2;
    p2 = p3;
    p3 = life8_15;
    if (!((life7_5 != null))) {
        break lexical_join_35;
    }
    }
    spill589_2 = p3;
    if (!((life7_5 == null))) {
        lexicalValue589_36_0 = spill589_2;
        break lexical_join_36;
    }
    lexicalValue589_23_0 = spill589_2;
    lexicalValue589_23_1 = p2;
    }
    if (!((lexicalValue589_23_0 == lexicalValue589_23_1))) {
        break lexical_join_35;
    }
    if (!((p2 < __sourceIntrinsic_9d0b0fad547d_invokedynamic589_2(18632, (9117387995516748526L ^ life5_3))))) {
        break lexical_join_34;
    }
    p3 += 1;
    if (!((life7_5 != null))) {
        break lexical_join_35;
    }
    }
    p2 += -1;
    }
    lexicalValue589_36_0 = 0;
    }
    life8_54 = lexicalValue589_36_0;
    lexical_cycle_37: while (true) {
    if (!((life8_54 < p0))) {
        break lexical_join_79;
    }
    life9_85 = ((moom.DT)(this.c)).a(((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9d0b0fad547d_invokedynamic589_5(1721, (1839679405461834906L ^ life5_3))))))), ((int)((((java.util.Random)(this.b)).nextInt(((int)((p3 - p2)))) + p2))), ((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_9d0b0fad547d_invokedynamic589_10(1721, (1839679405461834906L ^ life5_3))))))));
    ((moom.FY)(p1)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life9_85)));
    life8_54 += 1;
    if (!((life7_5 != null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return;
}


protected void a() {
long local1 = (moom.EQ.N ^ 130763822290640L);
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).J)), ((moom.FY)(this.h)), ((int)(((moom.FD)(this.d)).K)), ((int)(((moom.FD)(this.d)).L)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).N)), ((moom.FY)(this.i)), ((int)(((moom.FD)(this.d)).O)), ((int)(((moom.FD)(this.d)).P)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).V)), ((moom.FY)(this.k)), ((int)(((moom.FD)(this.d)).W)), ((int)(((moom.FD)(this.d)).X)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).R)), ((moom.FY)(this.j)), ((int)(((moom.FD)(this.d)).S)), ((int)(((moom.FD)(this.d)).T)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).Z)), ((moom.FY)(this.l)), ((int)(((moom.FD)(this.d)).aa)), ((int)(((moom.FD)(this.d)).ab)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).ad)), ((moom.FY)(this.m)), ((int)(((moom.FD)(this.d)).ae)), ((int)(((moom.FD)(this.d)).af)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).ah)), ((moom.FY)(this.n)), ((int)(((moom.FD)(this.d)).ai)), ((int)(((moom.FD)(this.d)).aj)));
    java.lang.String spill3671_0 = net.minecraft.world.biome.WorldChunkManager.b();
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).al)), ((moom.FY)(this.o)), ((int)(((moom.FD)(this.d)).am)), ((int)(((moom.FD)(this.d)).an)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).ap)), ((moom.FY)(this.p)), ((int)(((moom.FD)(this.d)).aq)), ((int)(((moom.FD)(this.d)).ar)));
    ((moom.EQ)(this)).a(((int)(((moom.FD)(this.d)).at)), ((moom.FY)(this.q)), ((int)(((moom.FD)(this.d)).au)), ((int)(((moom.FD)(this.d)).av)));
    ((moom.EQ)(this)).b(((int)(((moom.FD)(this.d)).ax)), ((moom.FY)(this.r)), ((int)(((moom.FD)(this.d)).ay)), ((int)(((moom.FD)(this.d)).az)));
    java.lang.String local3 = spill3671_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        net.minecraft.world.biome.WorldChunkManager.b(((java.lang.String)("ivZH8")));
    }
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c305ef87ad40783d_originalDynamicSite1952_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9d0b0fad547d_invokedynamic589_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9d0b0fad547d_invokedynamic589_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9d0b0fad547d_invokedynamic589_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4329_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_207(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_209(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_211(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_230(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_247(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_249(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_268(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_271(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_273(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_275(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_293(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_297(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_299(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_313(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_315(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_317(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_319(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_321(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_339(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_343(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_345(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_360(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_364(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_366(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_382(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_384(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_386(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_388(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_390(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_392(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_394(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_403(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_405(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_407(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_409(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_411(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_415(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_417(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_450d2df2537b_invokedynamic590_419(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d6182b4e60e_invokedynamic591_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1d6182b4e60e_invokedynamic591_11(int a0, long a1) throws E;
}
