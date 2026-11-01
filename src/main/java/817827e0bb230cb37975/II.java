package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class II extends net.minecraft.world.pathfinder.NodeProcessor {

private boolean g;

private boolean h;

private boolean i;

private boolean j;

private boolean k;

private static final long m;

private static final long[] n;

private static final java.lang.Integer[] o;

private static final java.util.Map p;

public II() {
super();
}


static {
m = ((long)(((moom._a)(moom._c.a(((long)(-2467329515874682643L)), ((long)(-1985687475657161567L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(188876321903093L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.II.m ^ 111184054840115L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill856_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill856_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill856_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill856_14 = new byte[8];
    (__sourceSpill856_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill856_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation856_16 = __sourceSpill856_14;
    ((javax.crypto.Cipher)(__sourceSpill856_11)).init(((int)(__sourceSpill856_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill856_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation856_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "Ëkso\b\006ú=5¦ý,ûkb\026ÐÞò\036R\n¬EP¼×"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill856_25 = local6_life21;
        int __sourceSpill856_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill856_25)).substring(((int)(__sourceSpill856_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill856_30 = local8_life19;
        int __sourceSpill856_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill856_33 = new byte[8];
        (__sourceSpill856_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill856_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill856_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill856_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill856_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill856_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill856_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill856_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill856_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill856_34)).doFinal(((byte[])(__sourceSpill856_33)));
        (__sourceSpill856_30)[__sourceSpill856_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "CQX®ÛI4òÙ#óT\\È"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill856_38 = local6_life21;
        int __sourceSpill856_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill856_38)).substring(((int)(__sourceSpill856_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill856_43 = local8_life19;
        int __sourceSpill856_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill856_46 = new byte[8];
        (__sourceSpill856_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill856_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill856_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill856_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill856_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill856_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill856_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill856_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill856_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill856_47)).doFinal(((byte[])(__sourceSpill856_46)));
        (__sourceSpill856_43)[__sourceSpill856_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    n = ((long[])(local8_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public boolean b__sourceReturn_aae029aa0a() {
return ((((this.j) ? 1 : 0)) != 0);
}


public void b(boolean p0) {
this.h = ((boolean)(p0));
    return;
}


public boolean c() {
return ((((this.i) ? 1 : 0)) != 0);
}


public void c(boolean p0) {
this.i = ((boolean)(p0));
    return;
}


public void d(boolean p0) {
this.j = ((boolean)(p0));
    return;
}


public void a() {
super.a();
    this.i = ((boolean)__sourceIntrinsic_integerToBoolean((((this.k) ? 1 : 0))));
    return;
}


public moom.AZ a(net.minecraft.entity.Entity p0) {
net.minecraft.block.Block lexicalValue791_64_0;
    int lexicalValue791_78_0;
    boolean spill791_0;
    boolean spill791_1;
    net.minecraft.block.Block spill791_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_29;
    moom.DU life6_40;
    net.minecraft.block.Block life7_46;
    lexical_join_79: {
    lexical_join_78: {
    lexical_join_72: {
    lexical_join_67: {
    life2_3 = (moom.II.m ^ 95438027663914L);
    life4_5 = net.minecraft.world.pathfinder.NodeProcessor.b();
    spill791_0 = this.j;
    if (!((life4_5 == null))) {
        lexicalValue791_78_0 = ((spill791_0) ? 1 : 0);
        break lexical_join_78;
    }
    if (!(spill791_0)) {
        break lexical_join_72;
    }
    spill791_1 = ((net.minecraft.entity.Entity)(p0)).j__Boolean();
    if (!((life4_5 == null))) {
        lexicalValue791_78_0 = ((spill791_1) ? 1 : 0);
        break lexical_join_78;
    }
    if (!(spill791_1)) {
        break lexical_join_72;
    }
    life5_29 = ((int) ((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).c);
    life6_40 = new moom.DU(moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).n))), life5_29, moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).p))));
    life7_46 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(((moom.II)(this)).a)).a__fE(((moom.DT)(life6_40))))).a__ch();
    lexical_cycle_38: while (true) {
    lexical_join_64: {
    lexical_join_48: {
    if (!((life7_46 != net.minecraft.init.Blocks.i))) {
        break lexical_join_48;
    }
    spill791_2 = life7_46;
    if (!((life4_5 == null))) {
        lexicalValue791_64_0 = spill791_2;
        break lexical_join_64;
    }
    if (!((life4_5 == null))) {
        lexicalValue791_64_0 = spill791_2;
        break lexical_join_64;
    }
    if (!((spill791_2 == net.minecraft.init.Blocks.j))) {
        break lexical_join_67;
    }
    }
    life5_29 += 1;
    ((moom.DU)(life6_40)).a(((int)(moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).n))))), ((int)(life5_29)), ((int)(moom.Dr.b__Int(((double)(((net.minecraft.entity.Entity)(p0)).p))))));
    lexicalValue791_64_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(((moom.II)(this)).a)).a__fE(((moom.DT)(life6_40))))).a__ch();
    }
    life7_46 = lexicalValue791_64_0;
    if (!((life4_5 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    this.i = ((boolean)(false));
    if (!((life4_5 != null))) {
        break lexical_join_79;
    }
    }
    lexicalValue791_78_0 = moom.Dr.b__Int(((double)((((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).c + 0x1.0p-1d))));
    }
    life5_29 = lexicalValue791_78_0;
    }
    return ((moom.II)(this)).a(((int)(moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).b))))), ((int)(life5_29)), ((int)(moom.Dr.b__Int(((double)(((moom.CA)(((net.minecraft.entity.Entity)(p0)).b())).d))))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4925_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/II"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_ee5f16ce95bff4(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x22FC;
        if (o[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = II.n[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])p.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/II", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            II.o[n4] = n6;
        }
        return o[n4];
}


public void a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1) {
super.a(((net.minecraft.world.IBlockAccess)(p0)), ((net.minecraft.entity.Entity)(p1)));
    this.k = ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0))));
    return;
}


public static int a(net.minecraft.world.IBlockAccess p0, net.minecraft.entity.Entity p1, int p2, int p3, int p4, int p5, int p6, int p7, boolean p8, boolean p9, boolean p10) {
int forestValue680_20_0;
    net.minecraft.block.Block forestValue680_70_0;
    net.minecraft.block.Block forestValue680_70_1;
    net.minecraft.block.Block forestValue680_72_0;
    net.minecraft.block.Block forestValue680_77_0;
    int forestValue680_101_0;
    net.minecraft.block.Block forestValue680_111_0;
    int forestValue680_112_0;
    int forestValue680_131_0;
    int forestValue680_139_0;
    int forestValue680_143_0;
    net.minecraft.block.Block forestValue680_158_0;
    int forestValue680_159_0;
    net.minecraft.block.Block forestValue680_174_0;
    net.minecraft.block.Block forestValue680_182_0;
    net.minecraft.block.Block forestValue680_182_1;
    net.minecraft.block.Block forestValue680_185_0;
    int forestValue680_216_0;
    int forestValue680_222_0;
    int forestValue680_236_0;
    int forestValue680_238_0;
    int forestValue680_242_0;
    int forestValue680_244_0;
    net.minecraft.entity.Entity[] spill680_0;
    int spill680_1;
    int spill680_2;
    net.minecraft.block.Block spill680_3;
    net.minecraft.block.Block spill680_4;
    net.minecraft.block.Block spill680_5;
    boolean spill680_6;
    int spill680_7;
    net.minecraft.block.Block spill680_8;
    boolean spill680_9;
    int spill680_10;
    int spill680_11;
    net.minecraft.block.Block spill680_12;
    int spill680_13;
    net.minecraft.block.Block spill680_14;
    net.minecraft.block.Block spill680_15;
    net.minecraft.block.Block spill680_16;
    boolean spill680_17;
    long life11_3;
    int life14_5;
    moom.DT life15_11;
    moom.DU life16_15;
    net.minecraft.entity.Entity[] life13_16;
    int life17_18;
    int life18_27;
    int life19_36;
    net.minecraft.block.Block life20_52;
    moom.fn life21_217;
    forest_join_244: {
    forest_join_243: {
    forest_join_242: {
    forest_join_238: {
    forest_join_237: {
    forest_join_236: {
    forest_join_231: {
    forest_join_229: {
    forest_join_223: {
    forest_join_222: {
    forest_join_217: {
    forest_join_216: {
    forest_join_211: {
    forest_join_209: {
    forest_join_207: {
    life11_3 = (moom.II.m ^ 72268360332080L);
    life14_5 = 0;
    spill680_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life15_11 = new moom.DT(p1);
    life16_15 = new moom.DU();
    life13_16 = spill680_0;
    life17_18 = p2;
    forest_cycle_19: while (true) {
    forest_join_203: {
    forestValue680_20_0 = life17_18;
    forest_cycle_20: while (true) {
    if (!((forestValue680_20_0 < (p2 + p5)))) {
        break forest_join_237;
    }
    spill680_1 = p3;
    if (!((life13_16 == null))) {
        forestValue680_238_0 = spill680_1;
        break forest_join_238;
    }
    life18_27 = spill680_1;
    forest_cycle_28: while (true) {
    forest_join_201: {
    forest_join_200: {
    if (!((life18_27 < (p3 + p6)))) {
        break forest_join_203;
    }
    spill680_2 = p4;
    if (!((life13_16 == null))) {
        forestValue680_20_0 = spill680_2;
        continue forest_cycle_20;
    }
    life19_36 = spill680_2;
    forest_cycle_37: while (true) {
    forest_join_198: {
    forest_join_197: {
    forest_join_191: {
    forest_join_185: {
    forest_join_184: {
    forest_join_182: {
    forest_join_174: {
    forest_join_173: {
    forest_join_159: {
    forest_join_158: {
    forest_join_157: {
    forest_join_143: {
    forest_join_139: {
    forest_join_135: {
    forest_join_131: {
    forest_join_112: {
    forest_join_111: {
    forest_join_106: {
    forest_join_104: {
    forest_join_101: {
    forest_join_100: {
    forest_join_95: {
    forest_join_77: {
    forest_join_72: {
    forest_join_70: {
    if (!((life19_36 < (p4 + p7)))) {
        break forest_join_200;
    }
    ((moom.DU)(life16_15)).a(((int)(life17_18)), ((int)(life18_27)), ((int)(life19_36)));
    life20_52 = ((net.minecraft.block.state.IBlockState)(__sourceExactCall_6d084bb738a179(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life16_15))))).a__ch();
    if (!((life13_16 == null))) {
        break forest_join_201;
    }
    if (!((life13_16 == null))) {
        break forest_join_198;
    }
    if (!((((net.minecraft.block.Block)(life20_52)).a__fn() != moom.fn.a))) {
        break forest_join_197;
    }
    spill680_3 = life20_52;
    spill680_4 = net.minecraft.init.Blocks.a3;
    if (!((life13_16 == null))) {
        forestValue680_70_0 = spill680_3;
        forestValue680_70_1 = spill680_4;
        break forest_join_70;
    }
    if (!((spill680_3 != spill680_4))) {
        break forest_join_104;
    }
    spill680_5 = life20_52;
    if (!((life13_16 == null))) {
        forestValue680_72_0 = spill680_5;
        break forest_join_72;
    }
    forestValue680_70_0 = spill680_5;
    forestValue680_70_1 = net.minecraft.init.Blocks.ca;
    }
    if (!((forestValue680_70_0 != forestValue680_70_1))) {
        break forest_join_104;
    }
    forestValue680_72_0 = life20_52;
    }
    if (!((life13_16 == null))) {
        forestValue680_77_0 = forestValue680_72_0;
        break forest_join_77;
    }
    if (!((forestValue680_72_0 != net.minecraft.init.Blocks.i))) {
        break forest_join_95;
    }
    forestValue680_77_0 = life20_52;
    }
    if (!((forestValue680_77_0 != net.minecraft.init.Blocks.j))) {
        break forest_join_95;
    }
    spill680_6 = p10;
    if (!((life13_16 == null))) {
        forestValue680_112_0 = ((spill680_6) ? 1 : 0);
        break forest_join_112;
    }
    if (!((!spill680_6))) {
        break forest_join_106;
    }
    spill680_7 = ((life20_52 instanceof net.minecraft.block.BlockDoor) ? 1 : 0);
    if (!((life13_16 == null))) {
        forestValue680_112_0 = spill680_7;
        break forest_join_112;
    }
    if (!((spill680_7 != 0))) {
        break forest_join_106;
    }
    spill680_8 = life20_52;
    if (!((life13_16 == null))) {
        forestValue680_111_0 = spill680_8;
        break forest_join_111;
    }
    if (!((((net.minecraft.block.Block)(spill680_8)).a__fn() == moom.fn.d))) {
        break forest_join_106;
    }
    break forest_join_207;
    }
    spill680_9 = p8;
    if (!((life13_16 == null))) {
        forestValue680_101_0 = ((spill680_9) ? 1 : 0);
        break forest_join_101;
    }
    if (!(spill680_9)) {
        break forest_join_100;
    }
    break forest_join_209;
    }
    forestValue680_101_0 = 1;
    }
    life14_5 = forestValue680_101_0;
    if (!((life13_16 != null))) {
        break forest_join_106;
    }
    }
    life14_5 = 1;
    }
    forestValue680_111_0 = ((net.minecraft.block.state.IBlockState)(__sourceExactCall_a3059f4053d9a5(((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p1)).i)), ((moom.DT)(life16_15))))).a__ch();
    }
    forestValue680_112_0 = ((forestValue680_111_0 instanceof moom.d2) ? 1 : 0);
    }
    if (!((life13_16 == null))) {
        forestValue680_139_0 = forestValue680_112_0;
        break forest_join_139;
    }
    if (!((forestValue680_112_0 != 0))) {
        break forest_join_135;
    }
    spill680_10 = ((((net.minecraft.block.state.IBlockState)(__sourceExactCall_a3059f4053d9a5(((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p1)).i)), ((moom.DT)(life15_11))))).a__ch() instanceof moom.d2) ? 1 : 0);
    if (!((life13_16 == null))) {
        forestValue680_131_0 = spill680_10;
        break forest_join_131;
    }
    if (!((spill680_10 == 0))) {
        break forest_join_197;
    }
    forestValue680_131_0 = ((((net.minecraft.block.state.IBlockState)(__sourceExactCall_a3059f4053d9a5(((net.minecraft.world.World)(((net.minecraft.entity.Entity)(p1)).i)), ((moom.DT)(((moom.DT)(life15_11)).b__DT()))))).a__ch() instanceof moom.d2) ? 1 : 0);
    }
    if (!((life13_16 == null))) {
        forestValue680_216_0 = forestValue680_131_0;
        break forest_join_216;
    }
    if (!((forestValue680_131_0 == 0))) {
        break forest_join_197;
    }
    break forest_join_211;
    }
    forestValue680_139_0 = ((((net.minecraft.block.Block)(life20_52)).a__Boolean(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life16_15)))) ? 1 : 0);
    }
    if (!((life13_16 == null))) {
        forestValue680_143_0 = forestValue680_139_0;
        break forest_join_143;
    }
    if (!((forestValue680_139_0 == 0))) {
        break forest_join_197;
    }
    forestValue680_143_0 = ((p9) ? 1 : 0);
    }
    if (!((life13_16 == null))) {
        forestValue680_159_0 = forestValue680_143_0;
        break forest_join_159;
    }
    if (!((forestValue680_143_0 != 0))) {
        break forest_join_157;
    }
    spill680_11 = ((life20_52 instanceof net.minecraft.block.BlockDoor) ? 1 : 0);
    if (!((life13_16 == null))) {
        forestValue680_159_0 = spill680_11;
        break forest_join_159;
    }
    if (!((spill680_11 != 0))) {
        break forest_join_157;
    }
    spill680_12 = life20_52;
    if (!((life13_16 == null))) {
        forestValue680_158_0 = spill680_12;
        break forest_join_158;
    }
    if (!((((net.minecraft.block.Block)(spill680_12)).a__fn() != moom.fn.d))) {
        break forest_join_197;
    }
    }
    forestValue680_158_0 = life20_52;
    }
    forestValue680_159_0 = ((forestValue680_158_0 instanceof moom.dz) ? 1 : 0);
    }
    if (!((life13_16 == null))) {
        forestValue680_222_0 = forestValue680_159_0;
        break forest_join_222;
    }
    if (!((forestValue680_159_0 == 0))) {
        break forest_join_217;
    }
    spill680_13 = ((life20_52 instanceof moom.dk) ? 1 : 0);
    if (!((life13_16 == null))) {
        forestValue680_222_0 = spill680_13;
        break forest_join_222;
    }
    if (!((spill680_13 == 0))) {
        break forest_join_217;
    }
    spill680_14 = life20_52;
    if (!((life13_16 == null))) {
        forestValue680_174_0 = spill680_14;
        break forest_join_174;
    }
    if (!((((spill680_14 instanceof moom.eG) ? 1 : 0) != 0))) {
        break forest_join_173;
    }
    break forest_join_217;
    }
    forestValue680_174_0 = life20_52;
    }
    spill680_15 = net.minecraft.init.Blocks.a3;
    if (!((life13_16 == null))) {
        forestValue680_182_0 = forestValue680_174_0;
        forestValue680_182_1 = spill680_15;
        break forest_join_182;
    }
    if (!((forestValue680_174_0 != spill680_15))) {
        break forest_join_223;
    }
    spill680_16 = life20_52;
    if (!((life13_16 == null))) {
        forestValue680_185_0 = spill680_16;
        break forest_join_185;
    }
    forestValue680_182_0 = spill680_16;
    forestValue680_182_1 = net.minecraft.init.Blocks.ca;
    }
    if (!((forestValue680_182_0 == forestValue680_182_1))) {
        break forest_join_184;
    }
    break forest_join_223;
    }
    forestValue680_185_0 = life20_52;
    }
    life21_217 = ((net.minecraft.block.Block)(forestValue680_185_0)).a__fn();
    if (!((life21_217 != moom.fn.i))) {
        break forest_join_191;
    }
    break forest_join_229;
    }
    spill680_17 = ((net.minecraft.entity.Entity)(p1)).l__Boolean();
    if (!((life13_16 == null))) {
        forestValue680_236_0 = ((spill680_17) ? 1 : 0);
        break forest_join_236;
    }
    if (!((!spill680_17))) {
        break forest_join_197;
    }
    break forest_join_231;
    }
    life19_36 += 1;
    }
    if (!((life13_16 != null))) {
        continue forest_cycle_37;
    }
    break forest_cycle_37;
    }
    }
    life18_27 += 1;
    }
    if (!((life13_16 != null))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    break forest_cycle_20;
    }
    }
    life17_18 += 1;
    if (!((life13_16 != null))) {
        continue forest_cycle_19;
    }
    break forest_cycle_19;
    }
    break forest_join_237;
    }
    return 0;
    }
    return -1;
    }
    forestValue680_216_0 = __sourceIntrinsic_b7d9c00c7666_invokedynamic680_44(15406, (4510369282823378562L ^ life11_3));
    }
    return forestValue680_216_0;
    }
    forestValue680_222_0 = __sourceIntrinsic_b7d9c00c7666_invokedynamic680_45(15406, (4510369282823378562L ^ life11_3));
    }
    return forestValue680_222_0;
    }
    return __sourceIntrinsic_b7d9c00c7666_invokedynamic680_46(18891, (7736777347383337824L ^ life11_3));
    }
    return 0;
    }
    forestValue680_236_0 = __sourceIntrinsic_b7d9c00c7666_invokedynamic680_47(26506, (2323683504903752995L ^ life11_3));
    }
    return forestValue680_236_0;
    }
    forestValue680_238_0 = life14_5;
    }
    if (!((life13_16 == null))) {
        forestValue680_242_0 = forestValue680_238_0;
        break forest_join_242;
    }
    if (!((forestValue680_238_0 != 0))) {
        break forest_join_243;
    }
    forestValue680_242_0 = 2;
    }
    forestValue680_244_0 = forestValue680_242_0;
    break forest_join_244;
    }
    forestValue680_244_0 = 1;
    }
    return forestValue680_244_0;
}


private int a(net.minecraft.entity.Entity p0, int p1, int p2, int p3) {
return moom.II.a(((net.minecraft.world.IBlockAccess)(((moom.II)(this)).a)), ((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(((moom.II)(this)).c)), ((int)(((moom.II)(this)).d)), ((int)(((moom.II)(this)).e)), ((boolean)__sourceIntrinsic_integerToBoolean((((this.i) ? 1 : 0)))), ((boolean)__sourceIntrinsic_integerToBoolean((((this.h) ? 1 : 0)))), ((boolean)__sourceIntrinsic_integerToBoolean((((this.g) ? 1 : 0)))));
}


private moom.AZ a(net.minecraft.entity.Entity p0, int p1, int p2, int p3, int p4) {
int lexicalValue792_28_0;
    int lexicalValue792_28_1;
    int lexicalValue792_44_0;
    int lexicalValue792_58_0;
    int lexicalValue792_58_1;
    int lexicalValue792_70_0;
    int lexicalValue792_70_1;
    int lexicalValue792_83_0;
    int lexicalValue792_83_1;
    moom.AZ lexicalValue792_86_0;
    int lexicalValue792_119_0;
    int lexicalValue792_120_0;
    int lexicalValue792_120_1;
    int lexicalValue792_131_0;
    int lexicalValue792_131_1;
    int lexicalValue792_138_0;
    int lexicalValue792_150_0;
    moom.AZ lexicalValue792_159_0;
    net.minecraft.entity.Entity[] spill792_0;
    int spill792_1;
    int spill792_2;
    moom.AZ spill792_3;
    int spill792_4;
    int spill792_5;
    boolean spill792_6;
    int spill792_7;
    int spill792_8;
    int spill792_9;
    long life6_3;
    moom.AZ life9_6;
    net.minecraft.entity.Entity[] life8_7;
    int life10_14;
    int life11_122;
    int life12_124;
    lexical_join_159: {
    lexical_join_158: {
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_86: {
    lexical_join_85: {
    lexical_join_83: {
    lexical_join_70: {
    lexical_join_58: {
    lexical_join_44: {
    lexical_join_35: {
    lexical_join_28: {
    lexical_join_26: {
    life6_3 = (moom.II.m ^ 83132401542266L);
    spill792_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life9_6 = null;
    life8_7 = spill792_0;
    life10_14 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    spill792_1 = life10_14;
    spill792_2 = 2;
    if (!((life8_7 == null))) {
        lexicalValue792_28_0 = spill792_1;
        lexicalValue792_28_1 = spill792_2;
        break lexical_join_28;
    }
    if (!((spill792_1 == spill792_2))) {
        break lexical_join_26;
    }
    return ((moom.II)(this)).a(((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    lexicalValue792_28_0 = life10_14;
    lexicalValue792_28_1 = 1;
    }
    if (!((lexicalValue792_28_0 == lexicalValue792_28_1))) {
        break lexical_join_35;
    }
    life9_6 = ((moom.II)(this)).a(((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    spill792_3 = life9_6;
    if (!((life8_7 == null))) {
        lexicalValue792_86_0 = spill792_3;
        break lexical_join_86;
    }
    if (!((spill792_3 == null))) {
        break lexical_join_85;
    }
    spill792_4 = p4;
    if (!((life8_7 == null))) {
        lexicalValue792_44_0 = spill792_4;
        break lexical_join_44;
    }
    if (!((spill792_4 > 0))) {
        break lexical_join_85;
    }
    lexicalValue792_44_0 = life10_14;
    }
    spill792_5 = __sourceIntrinsic_493ecd16cb90_invokedynamic792_5(18901, (3390471999992853554L ^ life6_3));
    if (!((life8_7 == null))) {
        lexicalValue792_58_0 = lexicalValue792_44_0;
        lexicalValue792_58_1 = spill792_5;
        break lexical_join_58;
    }
    if (!((lexicalValue792_44_0 != spill792_5))) {
        break lexical_join_85;
    }
    lexicalValue792_58_0 = life10_14;
    lexicalValue792_58_1 = __sourceIntrinsic_493ecd16cb90_invokedynamic792_6(20461, (8647415509782098445L ^ life6_3));
    }
    if (!((life8_7 == null))) {
        lexicalValue792_70_0 = lexicalValue792_58_0;
        lexicalValue792_70_1 = lexicalValue792_58_1;
        break lexical_join_70;
    }
    if (!((lexicalValue792_58_0 != lexicalValue792_58_1))) {
        break lexical_join_85;
    }
    lexicalValue792_70_0 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)((p2 + p4))), ((int)(p3)));
    lexicalValue792_70_1 = 1;
    }
    if (!((life8_7 == null))) {
        lexicalValue792_83_0 = lexicalValue792_70_0;
        lexicalValue792_83_1 = lexicalValue792_70_1;
        break lexical_join_83;
    }
    if (!((lexicalValue792_70_0 == lexicalValue792_70_1))) {
        break lexical_join_85;
    }
    life9_6 = ((moom.II)(this)).a(((int)(p1)), ((int)((p2 + p4))), ((int)(p3)));
    lexicalValue792_83_0 = p2;
    lexicalValue792_83_1 = p4;
    }
    p2 = (lexicalValue792_83_0 + lexicalValue792_83_1);
    }
    lexicalValue792_86_0 = life9_6;
    }
    if (!((life8_7 == null))) {
        lexicalValue792_159_0 = lexicalValue792_86_0;
        break lexical_join_159;
    }
    if (!((lexicalValue792_86_0 != null))) {
        break lexical_join_158;
    }
    life11_122 = 0;
    life12_124 = 0;
    lexical_cycle_93: while (true) {
    lexical_join_147: {
    lexical_join_141: {
    lexical_join_138: {
    lexical_join_134: {
    lexical_join_131: {
    lexical_join_125: {
    lexical_join_120: {
    lexical_join_119: {
    lexical_join_118: {
    if (!((p2 > 0))) {
        break lexical_join_149;
    }
    life12_124 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)((p2 - 1))), ((int)(p3)));
    spill792_6 = this.i;
    if (!((life8_7 == null))) {
        lexicalValue792_150_0 = ((spill792_6) ? 1 : 0);
        break lexical_join_150;
    }
    if (!((life8_7 == null))) {
        lexicalValue792_119_0 = ((spill792_6) ? 1 : 0);
        break lexical_join_119;
    }
    if (!(spill792_6)) {
        break lexical_join_118;
    }
    spill792_7 = life12_124;
    spill792_8 = -1;
    if (!((life8_7 == null))) {
        lexicalValue792_120_0 = spill792_7;
        lexicalValue792_120_1 = spill792_8;
        break lexical_join_120;
    }
    if (!((spill792_7 == spill792_8))) {
        break lexical_join_118;
    }
    return null;
    }
    lexicalValue792_119_0 = life12_124;
    }
    lexicalValue792_120_0 = lexicalValue792_119_0;
    lexicalValue792_120_1 = 1;
    }
    if (!((life8_7 == null))) {
        lexicalValue792_131_0 = lexicalValue792_120_0;
        lexicalValue792_131_1 = lexicalValue792_120_1;
        break lexical_join_131;
    }
    if (!((lexicalValue792_120_0 != lexicalValue792_120_1))) {
        break lexical_join_125;
    }
    if (!((life8_7 != null))) {
        break lexical_join_149;
    }
    }
    spill792_9 = (life11_122++);
    if (!((life8_7 == null))) {
        lexicalValue792_138_0 = spill792_9;
        break lexical_join_138;
    }
    lexicalValue792_131_0 = spill792_9;
    lexicalValue792_131_1 = ((net.minecraft.entity.Entity)(p0)).i();
    }
    if (!((lexicalValue792_131_0 >= lexicalValue792_131_1))) {
        break lexical_join_134;
    }
    return null;
    }
    p2 += -1;
    if (!((life8_7 == null))) {
        break lexical_join_147;
    }
    lexicalValue792_138_0 = p2;
    }
    if (!((lexicalValue792_138_0 <= 0))) {
        break lexical_join_141;
    }
    return null;
    }
    life9_6 = ((moom.II)(this)).a(((int)(p1)), ((int)(p2)), ((int)(p3)));
    }
    if (!((life8_7 != null))) { continue lexical_cycle_93; }
    break lexical_cycle_93;
    }
    }
    lexicalValue792_150_0 = life12_124;
    }
    if (!((lexicalValue792_150_0 == __sourceIntrinsic_493ecd16cb90_invokedynamic792_15(27231, (7725913563374868413L ^ life6_3))))) {
        break lexical_join_158;
    }
    return null;
    }
    lexicalValue792_159_0 = life9_6;
    }
    return lexicalValue792_159_0;
}


public int a(moom.AZ[] p0, net.minecraft.entity.Entity p1, moom.AZ p2, moom.AZ p3, float p4) {
moom.II forwardValue2194_37_0;
    net.minecraft.entity.Entity forwardValue2194_37_1;
    int forwardValue2194_37_2;
    int forwardValue2194_37_3;
    int forwardValue2194_37_4;
    moom.AZ forwardValue2194_102_0;
    moom.AZ forwardValue2194_124_0;
    moom.AZ forwardValue2194_146_0;
    moom.AZ forwardValue2194_150_0;
    int forwardValue2194_168_0;
    int forwardValue2194_173_0;
    net.minecraft.entity.Entity[] spill2194_0;
    moom.II spill2194_1;
    net.minecraft.entity.Entity spill2194_2;
    int spill2194_3;
    int spill2194_4;
    int spill2194_5;
    moom.AZ spill2194_6;
    moom.AZ spill2194_7;
    moom.AZ spill2194_8;
    moom.AZ spill2194_9;
    moom.AZ spill2194_10;
    moom.AZ spill2194_11;
    moom.AZ spill2194_12;
    boolean spill2194_13;
    int spill2194_14;
    long life6_3;
    int life9_6;
    int life10_8;
    net.minecraft.entity.Entity[] life8_9;
    moom.AZ life11_42;
    moom.AZ life12_55;
    moom.AZ life13_68;
    moom.AZ life14_81;
    forward_join_173: {
    forward_join_168: {
    forward_join_167: {
    forward_join_150: {
    forward_join_146: {
    forward_join_145: {
    forward_join_124: {
    forward_join_123: {
    forward_join_102: {
    forward_join_101: {
    forward_join_37: {
    forward_join_27: {
    life6_3 = (moom.II.m ^ 64155129197548L);
    spill2194_0 = net.minecraft.world.pathfinder.NodeProcessor.b();
    life9_6 = 0;
    life10_8 = 0;
    life8_9 = spill2194_0;
    spill2194_1 = this;
    spill2194_2 = p1;
    spill2194_3 = ((moom.AZ)(p2)).a;
    spill2194_4 = (((moom.AZ)(p2)).b + 1);
    spill2194_5 = ((moom.AZ)(p2)).c;
    if (!((life8_9 == null))) {
        forwardValue2194_37_0 = spill2194_1;
        forwardValue2194_37_1 = spill2194_2;
        forwardValue2194_37_2 = spill2194_3;
        forwardValue2194_37_3 = spill2194_4;
        forwardValue2194_37_4 = spill2194_5;
        break forward_join_37;
    }
    if (!((((moom.II)(spill2194_1)).a(((net.minecraft.entity.Entity)(spill2194_2)), ((int)(spill2194_3)), ((int)(spill2194_4)), ((int)(spill2194_5))) == 1))) {
        break forward_join_27;
    }
    life10_8 = 1;
    }
    forwardValue2194_37_0 = this;
    forwardValue2194_37_1 = p1;
    forwardValue2194_37_2 = ((moom.AZ)(p2)).a;
    forwardValue2194_37_3 = ((moom.AZ)(p2)).b;
    forwardValue2194_37_4 = (((moom.AZ)(p2)).c + 1);
    }
    life11_42 = ((moom.II)(forwardValue2194_37_0)).a(((net.minecraft.entity.Entity)(forwardValue2194_37_1)), ((int)(forwardValue2194_37_2)), ((int)(forwardValue2194_37_3)), ((int)(forwardValue2194_37_4)), ((int)(life10_8)));
    life12_55 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p1)), ((int)((((moom.AZ)(p2)).a - 1))), ((int)(((moom.AZ)(p2)).b)), ((int)(((moom.AZ)(p2)).c)), ((int)(life10_8)));
    life13_68 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p1)), ((int)((((moom.AZ)(p2)).a + 1))), ((int)(((moom.AZ)(p2)).b)), ((int)(((moom.AZ)(p2)).c)), ((int)(life10_8)));
    life14_81 = ((moom.II)(this)).a(((net.minecraft.entity.Entity)(p1)), ((int)(((moom.AZ)(p2)).a)), ((int)(((moom.AZ)(p2)).b)), ((int)((((moom.AZ)(p2)).c - 1))), ((int)(life10_8)));
    spill2194_6 = life11_42;
    if (!((life8_9 == null))) {
        forwardValue2194_102_0 = spill2194_6;
        break forward_join_102;
    }
    if (!((spill2194_6 != null))) {
        break forward_join_101;
    }
    spill2194_7 = life11_42;
    if (!((life8_9 == null))) {
        forwardValue2194_102_0 = spill2194_7;
        break forward_join_102;
    }
    if (!((!((moom.AZ)(spill2194_7)).j))) {
        break forward_join_101;
    }
    spill2194_8 = life11_42;
    if (!((life8_9 == null))) {
        forwardValue2194_102_0 = spill2194_8;
        break forward_join_102;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(spill2194_8)).a(((moom.AZ)(p3))))), ((float)(p4))) < 0))) {
        break forward_join_101;
    }
    (p0)[(life9_6++)] = life11_42;
    }
    forwardValue2194_102_0 = life12_55;
    }
    if (!((life8_9 == null))) {
        forwardValue2194_124_0 = forwardValue2194_102_0;
        break forward_join_124;
    }
    if (!((forwardValue2194_102_0 != null))) {
        break forward_join_123;
    }
    spill2194_9 = life12_55;
    if (!((life8_9 == null))) {
        forwardValue2194_124_0 = spill2194_9;
        break forward_join_124;
    }
    if (!((!((moom.AZ)(spill2194_9)).j))) {
        break forward_join_123;
    }
    spill2194_10 = life12_55;
    if (!((life8_9 == null))) {
        forwardValue2194_124_0 = spill2194_10;
        break forward_join_124;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(spill2194_10)).a(((moom.AZ)(p3))))), ((float)(p4))) < 0))) {
        break forward_join_123;
    }
    (p0)[(life9_6++)] = life12_55;
    }
    forwardValue2194_124_0 = life13_68;
    }
    if (!((life8_9 == null))) {
        forwardValue2194_146_0 = forwardValue2194_124_0;
        break forward_join_146;
    }
    if (!((forwardValue2194_124_0 != null))) {
        break forward_join_145;
    }
    spill2194_11 = life13_68;
    if (!((life8_9 == null))) {
        forwardValue2194_146_0 = spill2194_11;
        break forward_join_146;
    }
    if (!((!((moom.AZ)(spill2194_11)).j))) {
        break forward_join_145;
    }
    spill2194_12 = life13_68;
    if (!((life8_9 == null))) {
        forwardValue2194_146_0 = spill2194_12;
        break forward_join_146;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(spill2194_12)).a(((moom.AZ)(p3))))), ((float)(p4))) < 0))) {
        break forward_join_145;
    }
    (p0)[(life9_6++)] = life13_68;
    }
    forwardValue2194_146_0 = life14_81;
    }
    if (!((life8_9 == null))) {
        forwardValue2194_150_0 = forwardValue2194_146_0;
        break forward_join_150;
    }
    if (!((forwardValue2194_146_0 != null))) {
        break forward_join_167;
    }
    forwardValue2194_150_0 = life14_81;
    }
    spill2194_13 = ((moom.AZ)(forwardValue2194_150_0)).j;
    if (!((life8_9 == null))) {
        forwardValue2194_168_0 = ((spill2194_13) ? 1 : 0);
        break forward_join_168;
    }
    if (!((!spill2194_13))) {
        break forward_join_167;
    }
    spill2194_14 = recovery.source.CarrierOps.fcmpg(((float)(((moom.AZ)(life14_81)).a(((moom.AZ)(p3))))), ((float)(p4)));
    if (!((life8_9 == null))) {
        forwardValue2194_168_0 = spill2194_14;
        break forward_join_168;
    }
    if (!((spill2194_14 < 0))) {
        break forward_join_167;
    }
    (p0)[(life9_6++)] = life14_81;
    }
    forwardValue2194_168_0 = life9_6;
    }
    if (!((life8_9 != null))) {
        forwardValue2194_173_0 = forwardValue2194_168_0;
        break forward_join_173;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[3])));
    forwardValue2194_173_0 = forwardValue2194_168_0;
    }
    return forwardValue2194_173_0;
}


public void a(boolean p0) {
this.g = ((boolean)(p0));
    return;
}


public moom.AZ a(net.minecraft.entity.Entity p0, double p1, double p2, double p3) {
return ((moom.II)(this)).a(((int)(moom.Dr.b__Int(((double)((p1 - ((double) (((net.minecraft.entity.Entity)(p0)).G / 0x1.0p1f)))))))), ((int)(moom.Dr.b__Int(((double)(p2))))), ((int)(moom.Dr.b__Int(((double)((p3 - ((double) (((net.minecraft.entity.Entity)(p0)).G / 0x1.0p1f)))))))));
}


public boolean a__Boolean() {
return ((((this.g) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4925_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_493ecd16cb90_invokedynamic792_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_493ecd16cb90_invokedynamic792_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_493ecd16cb90_invokedynamic792_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b7d9c00c7666_invokedynamic680_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b7d9c00c7666_invokedynamic680_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b7d9c00c7666_invokedynamic680_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b7d9c00c7666_invokedynamic680_47(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceExactCall_ee5f16ce95bff4(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);

private static native net.minecraft.block.state.IBlockState __sourceExactCall_6d084bb738a179(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native net.minecraft.block.state.IBlockState __sourceExactCall_a3059f4053d9a5(net.minecraft.world.World p0, moom.DT p1);
}
