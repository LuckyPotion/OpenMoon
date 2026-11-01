package moom;


public class va extends moom.u_ {

private int i;

private final net.minecraft.entity.passive.EntityVillager j;

private static final long k;

private static final long p;

public va(net.minecraft.entity.passive.EntityVillager p0) {
super(p0, net.minecraft.entity.passive.EntityVillager.class, 0x1.8000000000000p+1f, 0x1.47ae140000000p-6f);
    this.j = p0;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(7884012545562077716L)), ((long)(5037238728938923616L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37583691552504L)))));
    long local0_life6 = (moom.va.k ^ 9137515942644L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1074_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1074_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1074_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1074_13 = new byte[8];
    (__sourceSpill1074_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1074_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1074_15 = __sourceSpill1074_13;
    ((javax.crypto.Cipher)(__sourceSpill1074_10)).init(((int)(__sourceSpill1074_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1074_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1074_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8659885994188620997L;
    byte[] __sourceSpill1074_19 = new byte[8];
    (__sourceSpill1074_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1074_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1074_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1074_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1074_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1074_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1074_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1074_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1074_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1074_20)).doFinal(((byte[])(__sourceSpill1074_19)));
    p = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void c() {
int lexicalValue1360_23_0;
    moom.va lexicalValue1360_25_0;
    net.minecraft.item.ItemStack lexicalValue1360_45_0;
    net.minecraft.item.Item lexicalValue1360_54_0;
    net.minecraft.item.Item lexicalValue1360_54_1;
    net.minecraft.item.Item lexicalValue1360_59_0;
    net.minecraft.item.Item lexicalValue1360_59_1;
    int lexicalValue1360_71_0;
    int lexicalValue1360_71_1;
    net.minecraft.item.Item lexicalValue1360_90_0;
    net.minecraft.item.Item lexicalValue1360_90_1;
    int lexicalValue1360_104_0;
    int lexicalValue1360_104_1;
    net.minecraft.item.ItemStack lexicalValue1360_133_0;
    boolean spill1360_0;
    int spill1360_1;
    moom.va spill1360_2;
    net.minecraft.item.ItemStack spill1360_3;
    net.minecraft.item.Item spill1360_4;
    net.minecraft.item.Item spill1360_5;
    int spill1360_6;
    int spill1360_7;
    int spill1360_8;
    int spill1360_9;
    net.minecraft.item.ItemStack spill1360_10;
    long life1_3;
    int life3_7;
    moom.wq life4_36;
    int life5_38;
    net.minecraft.item.ItemStack life6_46;
    net.minecraft.item.ItemStack life7_48;
    net.minecraft.item.Item life8_58;
    int life9_108;
    int life9_150;
    int life10_154;
    double life8_195;
    net.minecraft.entity.item.EntityItem life10_210;
    float life11_212;
    float life12_216;
    float life13_220;
    lexical_join_234: {
    lexical_join_25: {
    lexical_join_23: {
    life1_3 = (moom.va.k ^ 31448279148156L);
    spill1360_0 = moom.uc.d();
    super.c();
    life3_7 = ((spill1360_0) ? 1 : 0);
    spill1360_1 = this.i;
    if (!((life3_7 != 0))) {
        lexicalValue1360_23_0 = spill1360_1;
        break lexical_join_23;
    }
    if (!((spill1360_1 > 0))) {
        break lexical_join_234;
    }
    moom.va __stackOp1360_5_0 = this;
    ((moom.va)(__stackOp1360_5_0)).i = ((int)((((moom.va)(__stackOp1360_5_0)).i - 1)));
    spill1360_2 = this;
    if (!((life3_7 != 0))) {
        lexicalValue1360_25_0 = spill1360_2;
        break lexical_join_25;
    }
    lexicalValue1360_23_0 = ((moom.va)(spill1360_2)).i;
    }
    if (!((lexicalValue1360_23_0 == 0))) {
        break lexical_join_234;
    }
    lexicalValue1360_25_0 = this;
    }
    life4_36 = ((net.minecraft.entity.passive.EntityVillager)(((moom.va)(lexicalValue1360_25_0)).j)).a__wq();
    life5_38 = 0;
    lexical_cycle_30: while (true) {
    lexical_join_231: {
    lexical_join_133: {
    lexical_join_132: {
    lexical_join_123: {
    lexical_join_104: {
    lexical_join_90: {
    lexical_join_88: {
    lexical_join_71: {
    lexical_join_62: {
    lexical_join_59: {
    lexical_join_54: {
    lexical_join_45: {
    if (!((life5_38 < ((moom.wq)(life4_36)).b__Int()))) {
        break lexical_join_234;
    }
    life6_46 = ((moom.wq)(life4_36)).a__xW(((int)(life5_38)));
    life7_48 = null;
    spill1360_3 = life6_46;
    if (!((life3_7 != 0))) {
        lexicalValue1360_45_0 = spill1360_3;
        break lexical_join_45;
    }
    if (!((spill1360_3 != null))) {
        break lexical_join_132;
    }
    lexicalValue1360_45_0 = life6_46;
    }
    life8_58 = ((net.minecraft.item.ItemStack)(lexicalValue1360_45_0)).a__wQ();
    spill1360_4 = life8_58;
    spill1360_5 = net.minecraft.init.Items.P;
    if (!((life3_7 != 0))) {
        lexicalValue1360_54_0 = spill1360_4;
        lexicalValue1360_54_1 = spill1360_5;
        break lexical_join_54;
    }
    if (!((spill1360_4 != spill1360_5))) {
        break lexical_join_62;
    }
    lexicalValue1360_54_0 = life8_58;
    lexicalValue1360_54_1 = net.minecraft.init.Items.bH;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1360_59_0 = lexicalValue1360_54_0;
        lexicalValue1360_59_1 = lexicalValue1360_54_1;
        break lexical_join_59;
    }
    if (!((lexicalValue1360_54_0 != lexicalValue1360_54_1))) {
        break lexical_join_62;
    }
    lexicalValue1360_59_0 = life8_58;
    lexicalValue1360_59_1 = net.minecraft.init.Items.bG;
    }
    if (!((life3_7 != 0))) {
        lexicalValue1360_90_0 = lexicalValue1360_59_0;
        lexicalValue1360_90_1 = lexicalValue1360_59_1;
        break lexical_join_90;
    }
    if (!((lexicalValue1360_59_0 == lexicalValue1360_59_1))) {
        break lexical_join_88;
    }
    }
    spill1360_6 = ((net.minecraft.item.ItemStack)(life6_46)).b;
    spill1360_7 = 3;
    if (!((life3_7 != 0))) {
        lexicalValue1360_71_0 = spill1360_6;
        lexicalValue1360_71_1 = spill1360_7;
        break lexical_join_71;
    }
    if (!((spill1360_6 > spill1360_7))) {
        break lexical_join_88;
    }
    lexicalValue1360_71_0 = ((net.minecraft.item.ItemStack)(life6_46)).b;
    lexicalValue1360_71_1 = 2;
    }
    life9_108 = (lexicalValue1360_71_0 / lexicalValue1360_71_1);
    net.minecraft.item.ItemStack __stackOp1360_19_0 = life6_46;
    ((net.minecraft.item.ItemStack)(__stackOp1360_19_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1360_19_0)).b - life9_108)));
    life7_48 = new net.minecraft.item.ItemStack(life8_58, life9_108, ((net.minecraft.item.ItemStack)(life6_46)).c());
    break lexical_join_123;
    }
    lexicalValue1360_90_0 = life8_58;
    lexicalValue1360_90_1 = net.minecraft.init.Items.O;
    }
    if (!((lexicalValue1360_90_0 == lexicalValue1360_90_1))) {
        break lexical_join_123;
    }
    spill1360_8 = ((net.minecraft.item.ItemStack)(life6_46)).b;
    spill1360_9 = 5;
    if (!((life3_7 != 0))) {
        lexicalValue1360_104_0 = spill1360_8;
        lexicalValue1360_104_1 = spill1360_9;
        break lexical_join_104;
    }
    if (!((spill1360_8 > spill1360_9))) {
        break lexical_join_123;
    }
    lexicalValue1360_104_0 = ((((net.minecraft.item.ItemStack)(life6_46)).b / 2) / 3);
    lexicalValue1360_104_1 = 3;
    }
    life9_150 = (lexicalValue1360_104_0 * lexicalValue1360_104_1);
    life10_154 = (life9_150 / 3);
    net.minecraft.item.ItemStack __stackOp1360_26_0 = life6_46;
    ((net.minecraft.item.ItemStack)(__stackOp1360_26_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1360_26_0)).b - life9_150)));
    life7_48 = new net.minecraft.item.ItemStack(net.minecraft.init.Items.P, life10_154, 0);
    }
    spill1360_10 = life6_46;
    if (!((life3_7 != 0))) {
        lexicalValue1360_133_0 = spill1360_10;
        break lexical_join_133;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1360_10)).b <= 0))) {
        break lexical_join_132;
    }
    ((moom.wq)(life4_36)).a__Void(((int)(life5_38)), ((net.minecraft.item.ItemStack)(null)));
    }
    lexicalValue1360_133_0 = life7_48;
    }
    if (!((lexicalValue1360_133_0 != null))) {
        break lexical_join_231;
    }
    life8_195 = ((((net.minecraft.entity.passive.EntityVillager)(this.j)).o - 0x1.333334p-2d) + ((double) ((net.minecraft.entity.passive.EntityVillager)(this.j)).e__Float()));
    life10_210 = new net.minecraft.entity.item.EntityItem(((net.minecraft.entity.passive.EntityVillager)(this.j)).i, ((net.minecraft.entity.passive.EntityVillager)(this.j)).n, life8_195, ((net.minecraft.entity.passive.EntityVillager)(this.j)).p, life7_48);
    life11_212 = 0x1.333334p-2f;
    life12_216 = ((net.minecraft.entity.passive.EntityVillager)(this.j)).a4;
    life13_220 = ((net.minecraft.entity.passive.EntityVillager)(this.j)).x;
    ((net.minecraft.entity.item.EntityItem)(life10_210)).t = ((double)(((double) (((-moom.Dr.a(((float)(((life12_216 / 0x1.68p7f) * 0x1.921fb6p1f))))) * moom.Dr.b(((float)(((life13_220 / 0x1.68p7f) * 0x1.921fb6p1f))))) * life11_212))));
    ((net.minecraft.entity.item.EntityItem)(life10_210)).v = ((double)(((double) ((moom.Dr.b(((float)(((life12_216 / 0x1.68p7f) * 0x1.921fb6p1f)))) * moom.Dr.b(((float)(((life13_220 / 0x1.68p7f) * 0x1.921fb6p1f))))) * life11_212))));
    ((net.minecraft.entity.item.EntityItem)(life10_210)).u = ((double)(((double) (((-moom.Dr.a(((float)(((life13_220 / 0x1.68p7f) * 0x1.921fb6p1f))))) * life11_212) + 0x1.99999ap-4f))));
    ((net.minecraft.entity.item.EntityItem)(life10_210)).w__sourceReturn_da8c82d5d4();
    ((net.minecraft.world.World)(((net.minecraft.entity.passive.EntityVillager)(this.j)).i)).b__Boolean(((net.minecraft.entity.Entity)(life10_210)));
    if (!((life3_7 == 0))) {
        break lexical_join_234;
    }
    }
    life5_38 += 1;
    if (!((life3_7 == 0))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    return;
}


public void a__Void() {
moom.va forwardValue4307_34_0;
    boolean spill4307_0;
    moom.va spill4307_1;
    moom.va spill4307_2;
    moom.va spill4307_3;
    long life1_3;
    int life3_7;
    forward_join_36: {
    forward_join_34: {
    forward_join_33: {
    life1_3 = (moom.va.k ^ 43013797991538L);
    spill4307_0 = moom.uc.e();
    super.a__Void();
    life3_7 = ((spill4307_0) ? 1 : 0);
    spill4307_1 = this;
    if (!((life3_7 == 0))) {
        forwardValue4307_34_0 = spill4307_1;
        break forward_join_34;
    }
    if (!(((net.minecraft.entity.passive.EntityVillager)(((moom.va)(spill4307_1)).j)).ah())) {
        break forward_join_33;
    }
    spill4307_2 = this;
    if (!((life3_7 == 0))) {
        forwardValue4307_34_0 = spill4307_2;
        break forward_join_34;
    }
    if (!((((((moom.va)(spill4307_2)).d instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0) != 0))) {
        break forward_join_33;
    }
    spill4307_3 = this;
    if (!((life3_7 == 0))) {
        forwardValue4307_34_0 = spill4307_3;
        break forward_join_34;
    }
    if (!(((net.minecraft.entity.passive.EntityVillager)(((net.minecraft.entity.passive.EntityVillager)(((moom.va)(spill4307_3)).d)))).ai())) {
        break forward_join_33;
    }
    this.i = ((int)(((int) moom.va.p)));
    if (!((life3_7 != 0))) {
        break forward_join_36;
    }
    }
    forwardValue4307_34_0 = this;
    }
    ((moom.va)(forwardValue4307_34_0)).i = ((int)(0));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
