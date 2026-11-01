package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Ce extends net.minecraft.tileentity.TileEntity implements net.minecraft.util.ITickable, net.minecraft.world.IInteractionObject {

public int l;

public float m;

public float n;

public float o;

public float p;

public float q;

public float r;

public float s;

public float t;

public float u;

private static final java.util.Random v;

public java.lang.String w;

private static final long x;

private static final long[] y;

private static final java.lang.Integer[] A;

private static final java.util.Map B;

public Ce() {
super();
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(4391670340618147144L)), ((long)(-7552015697089435028L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(180946411093708L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Ce.x ^ 59743802097855L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill505_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill505_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill505_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill505_14 = new byte[8];
    (__sourceSpill505_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill505_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation505_16 = __sourceSpill505_14;
    ((javax.crypto.Cipher)(__sourceSpill505_11)).init(((int)(__sourceSpill505_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill505_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation505_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "á1äðÁ°»(gÏ\\úÊ\004"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill505_25 = local6_life21;
        int __sourceSpill505_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill505_25)).substring(((int)(__sourceSpill505_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill505_30 = local8_life19;
        int __sourceSpill505_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill505_33 = new byte[8];
        (__sourceSpill505_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill505_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill505_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill505_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill505_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill505_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill505_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill505_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill505_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill505_34)).doFinal(((byte[])(__sourceSpill505_33)));
        (__sourceSpill505_30)[__sourceSpill505_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    y = ((long[])(local8_life19));
    A = ((java.lang.Integer[])(new java.lang.Integer[2]));
    v = ((java.util.Random)(new java.util.Random()));
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
long local2 = (moom.Ce.x ^ 115131915158291L);
    super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    if ((__sourceIntrinsic_booleanComparison(((moom.Ce)(this)).e__Boolean()) != 0)) {
        ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("CustomName")), ((java.lang.String)(this.w)));
    }
    return;
}


public boolean e__Boolean() {
java.lang.String forwardValue1628_13_0;
    int forwardValue1628_18_0;
    int forwardValue1628_20_0;
    java.lang.String spill1628_0;
    int spill1628_1;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.Ce.x ^ 136582457795614L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1628_0 = this.w;
    if (!((life3_5 != null))) {
        forwardValue1628_13_0 = spill1628_0;
        break forward_join_13;
    }
    if (!((spill1628_0 != null))) {
        break forward_join_19;
    }
    forwardValue1628_13_0 = this.w;
    }
    spill1628_1 = ((java.lang.String)(forwardValue1628_13_0)).length();
    if (!((life3_5 != null))) {
        forwardValue1628_18_0 = spill1628_1;
        break forward_join_18;
    }
    if (!((spill1628_1 > 0))) {
        break forward_join_19;
    }
    forwardValue1628_18_0 = 1;
    }
    forwardValue1628_20_0 = forwardValue1628_18_0;
    break forward_join_20;
    }
    forwardValue1628_20_0 = 0;
    }
    return ((forwardValue1628_20_0) != 0);
}


public java.lang.String c__String() {
return "minecraft:enchanting_table";
}


public void c__Void() {
float lexicalValue533_95_0;
    moom.Ce lexicalValue533_192_0;
    java.lang.String[] spill533_0;
    float spill533_1;
    moom.Ce spill533_2;
    long life1_3;
    net.minecraft.entity.player.EntityPlayer life4_38;
    java.lang.String[] life3_39;
    double life5_57;
    double life7_68;
    float life9_107;
    float life5_232;
    float life6_295;
    float life7_297;
    float life6_303;
    lexical_join_246: {
    lexical_join_221: {
    lexical_join_209: {
    lexical_join_192: {
    lexical_join_191: {
    lexical_join_176: {
    lexical_join_161: {
    lexical_join_146: {
    lexical_join_131: {
    lexical_join_125: {
    lexical_join_119: {
    lexical_join_114: {
    lexical_join_95: {
    lexical_join_93: {
    life1_3 = (moom.Ce.x ^ 56638778511032L);
    this.r = ((float)(this.q));
    this.t = ((float)(this.s));
    spill533_0 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    life4_38 = ((net.minecraft.world.World)(this.d)).a(((double)(((double) (((float) ((moom.DT)(this.e)).a()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(this.e)).b()) + 0x1.0p-1f)))), ((double)(((double) (((float) ((moom.DT)(this.e)).c()) + 0x1.0p-1f)))), ((double)(0x1.8p1d)));
    life3_39 = spill533_0;
    if (!((life3_39 != null))) {
        break lexical_join_125;
    }
    if (!((life4_38 != null))) {
        break lexical_join_119;
    }
    life5_57 = (((net.minecraft.entity.player.EntityPlayer)(life4_38)).n - ((double) (((float) ((moom.DT)(this.e)).a()) + 0x1.0p-1f)));
    life7_68 = (((net.minecraft.entity.player.EntityPlayer)(life4_38)).p - ((double) (((float) ((moom.DT)(this.e)).c()) + 0x1.0p-1f)));
    this.u = ((float)(((float) moom.Dr.b(((double)(life7_68)), ((double)(life5_57))))));
    moom.Ce __stackOp533_22_0 = this;
    ((moom.Ce)(__stackOp533_22_0)).q = ((float)((((moom.Ce)(__stackOp533_22_0)).q + 0x1.99999ap-4f)));
    spill533_1 = this.q;
    if (!((life3_39 != null))) {
        lexicalValue533_95_0 = spill533_1;
        break lexical_join_95;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill533_1)), ((float)(0x1.0p-1f))) >= 0))) {
        break lexical_join_93;
    }
    if (!((((java.util.Random)(moom.Ce.v)).nextInt(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic533_28(19756, (760438276198148764L ^ life1_3))))) == 0))) {
        break lexical_join_114;
    }
    }
    lexicalValue533_95_0 = this.o;
    }
    life9_107 = lexicalValue533_95_0;
    lexical_cycle_96: while (true) {
    moom.Ce __stackOp533_31_0 = this;
    ((moom.Ce)(__stackOp533_31_0)).o = ((float)((((moom.Ce)(__stackOp533_31_0)).o + ((float) (((java.util.Random)(moom.Ce.v)).nextInt(((int)(4))) - ((java.util.Random)(moom.Ce.v)).nextInt(((int)(4))))))));
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life9_107)), ((float)(this.o))) != 0))) { continue lexical_cycle_96; }
    break lexical_cycle_96;
    }
    }
    if (!((life3_39 == null))) {
        break lexical_join_131;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    moom.Ce __stackOp533_41_0 = this;
    ((moom.Ce)(__stackOp533_41_0)).u = ((float)((((moom.Ce)(__stackOp533_41_0)).u + 0x1.47ae14p-6f)));
    }
    moom.Ce __stackOp533_44_0 = this;
    ((moom.Ce)(__stackOp533_44_0)).q = ((float)((((moom.Ce)(__stackOp533_44_0)).q - 0x1.99999ap-4f)));
    }
    lexical_cycle_131: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(this.s)), ((float)(0x1.921fb6p1f))) >= 0))) {
        break lexical_join_146;
    }
    moom.Ce __stackOp533_49_0 = this;
    ((moom.Ce)(__stackOp533_49_0)).s = ((float)((((moom.Ce)(__stackOp533_49_0)).s - 0x1.921fb6p2f)));
    if (!((life3_39 != null))) {
        break lexical_join_161;
    }
    if (!((life3_39 == null))) { continue lexical_cycle_131; }
    break lexical_cycle_131;
    }
    }
    lexical_cycle_146: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(this.s)), ((float)(-0x1.921fb6p1f))) < 0))) {
        break lexical_join_161;
    }
    moom.Ce __stackOp533_54_0 = this;
    ((moom.Ce)(__stackOp533_54_0)).s = ((float)((((moom.Ce)(__stackOp533_54_0)).s + 0x1.921fb6p2f)));
    if (!((life3_39 != null))) {
        break lexical_join_176;
    }
    if (!((life3_39 == null))) { continue lexical_cycle_146; }
    break lexical_cycle_146;
    }
    }
    lexical_cycle_161: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(this.u)), ((float)(0x1.921fb6p1f))) >= 0))) {
        break lexical_join_176;
    }
    moom.Ce __stackOp533_59_0 = this;
    ((moom.Ce)(__stackOp533_59_0)).u = ((float)((((moom.Ce)(__stackOp533_59_0)).u - 0x1.921fb6p2f)));
    if (!((life3_39 != null))) {
        break lexical_join_191;
    }
    if (!((life3_39 == null))) { continue lexical_cycle_161; }
    break lexical_cycle_161;
    }
    }
    lexical_cycle_176: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(this.u)), ((float)(-0x1.921fb6p1f))) < 0))) {
        break lexical_join_191;
    }
    spill533_2 = this;
    if (!((life3_39 != null))) {
        lexicalValue533_192_0 = spill533_2;
        break lexical_join_192;
    }
    moom.Ce __stackOp533_64_0 = spill533_2;
    ((moom.Ce)(__stackOp533_64_0)).u = ((float)((((moom.Ce)(__stackOp533_64_0)).u + 0x1.921fb6p2f)));
    if (!((life3_39 == null))) { continue lexical_cycle_176; }
    break lexical_cycle_176;
    }
    }
    lexicalValue533_192_0 = this;
    }
    life5_232 = (((moom.Ce)(lexicalValue533_192_0)).u - this.s);
    lexical_cycle_197: while (true) {
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life5_232)), ((float)(0x1.921fb6p1f))) >= 0))) {
        break lexical_join_209;
    }
    life5_232 = (life5_232 - 0x1.921fb6p2f);
    if (!((life3_39 != null))) {
        break lexical_join_246;
    }
    if (!((life3_39 == null))) { continue lexical_cycle_197; }
    break lexical_cycle_197;
    }
    }
    lexical_cycle_209: while (true) {
    if (!((recovery.source.CarrierOps.fcmpg(((float)(life5_232)), ((float)(-0x1.921fb6p1f))) < 0))) {
        break lexical_join_221;
    }
    life5_232 = (life5_232 + 0x1.921fb6p2f);
    if (!((life3_39 != null))) {
        break lexical_join_246;
    }
    if (!((life3_39 == null))) { continue lexical_cycle_209; }
    break lexical_cycle_209;
    }
    }
    moom.Ce __stackOp533_71_0 = this;
    ((moom.Ce)(__stackOp533_71_0)).s = ((float)((((moom.Ce)(__stackOp533_71_0)).s + (life5_232 * 0x1.99999ap-2f))));
    this.q = ((float)(moom.Dr.a(((float)(this.q)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)))));
    moom.Ce __stackOp533_77_0 = this;
    ((moom.Ce)(__stackOp533_77_0)).l = ((int)((((moom.Ce)(__stackOp533_77_0)).l + 1)));
    this.n = ((float)(this.m));
    }
    life6_295 = ((this.o - this.m) * 0x1.99999ap-2f);
    life7_297 = 0x1.99999ap-3f;
    life6_303 = moom.Dr.a(((float)(life6_295)), ((float)((-life7_297))), ((float)(life7_297)));
    moom.Ce __stackOp533_85_0 = this;
    ((moom.Ce)(__stackOp533_85_0)).p = ((float)((((moom.Ce)(__stackOp533_85_0)).p + ((life6_303 - this.p) * 0x1.ccccccp-1f))));
    moom.Ce __stackOp533_89_0 = this;
    ((moom.Ce)(__stackOp533_89_0)).m = ((float)((((moom.Ce)(__stackOp533_89_0)).m + this.p)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4090_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ce"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Ce.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0xB72;
        if (A[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = y[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])B.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    B.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Ce", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Ce.A[n4] = n6;
        }
        return A[n4];
}


public void a__Void(net.minecraft.nbt.NBTTagCompound p0) {
moom.Ce forwardValue1626_22_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1626_22_1;
    moom.Ce spill1626_0;
    net.minecraft.nbt.NBTTagCompound spill1626_1;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_25: {
    forward_join_22: {
    life2_3 = (moom.Ce.x ^ 10490477150738L);
    life4_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1626_0 = this;
    spill1626_1 = p0;
    if (!((life4_5 != null))) {
        forwardValue1626_22_0 = spill1626_0;
        forwardValue1626_22_1 = spill1626_1;
        break forward_join_22;
    }
    __sourceIntrinsic_03d9340fa09f_call1626_2(spill1626_0, spill1626_1);
    if (!(((net.minecraft.nbt.NBTTagCompound)(p0)).a__Boolean(((java.lang.String)("CustomName")), ((int)(__sourceIntrinsic_03d9340fa09f_invokedynamic1626_3(18653, (7868271399984899014L ^ life2_3))))))) {
        break forward_join_25;
    }
    forwardValue1626_22_0 = this;
    forwardValue1626_22_1 = p0;
    }
    ((moom.Ce)(forwardValue1626_22_0)).w = ((java.lang.String)(((net.minecraft.nbt.NBTTagCompound)(forwardValue1626_22_1)).a__String(((java.lang.String)("CustomName")))));
    }
    return;
}


public java.lang.String a__String() {
moom.Ce forwardValue1625_12_0;
    java.lang.String forwardValue1625_15_0;
    moom.Ce spill1625_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_12: {
    life1_3 = (moom.Ce.x ^ 59687728753408L);
    life3_5 = net.minecraft.tileentity.MobSpawnerBaseLogic.b__ArrayString();
    spill1625_0 = this;
    if (!((life3_5 != null))) {
        forwardValue1625_12_0 = spill1625_0;
        break forward_join_12;
    }
    if (!(((moom.Ce)(spill1625_0)).e__Boolean())) {
        break forward_join_14;
    }
    forwardValue1625_12_0 = this;
    }
    forwardValue1625_15_0 = ((moom.Ce)(forwardValue1625_12_0)).w;
    break forward_join_15;
    }
    forwardValue1625_15_0 = "container.enchant";
    }
    return forwardValue1625_15_0;
}


public void a(java.lang.String p0) {
this.w = ((java.lang.String)(p0));
    return;
}


public net.minecraft.util.IChatComponent a__C5() {
moom.CJ forwardValue1624_20_0;
    long life1_3;
    forward_join_20: {
    forward_join_13: {
    life1_3 = (moom.Ce.x ^ 83423367083196L);
    if (!(((moom.Ce)(this)).e__Boolean())) {
        break forward_join_13;
    }
    forwardValue1624_20_0 = new moom.CM(((moom.Ce)(this)).a__String());
    break forward_join_20;
    }
    forwardValue1624_20_0 = new moom.CN(((moom.Ce)(this)).a__String(), new java.lang.Object[0]);
    }
    return forwardValue1624_20_0;
}


public moom.v8 a(net.minecraft.entity.player.InventoryPlayer p0, net.minecraft.entity.player.EntityPlayer p1) {
return new moom.we(p0, this.d, this.e);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4090_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_03d9340fa09f_call1626_2(moom.Ce a0, net.minecraft.nbt.NBTTagCompound a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_03d9340fa09f_invokedynamic1626_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic533_28(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
