package moom;


public class w6 extends net.minecraft.item.Item {

private static final long n;

private static final long o;

public w6() {
super();
    this.f = 1;
    (this).a(net.minecraft.creativetab.CreativeTabs.e);
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-1878291720946951426L)), ((long)(-8480464775759926979L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(17635992743358L)))));
    long local0_life6 = (moom.w6.n ^ 11968075683672L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1082_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1082_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1082_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1082_13 = new byte[8];
    (__sourceSpill1082_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1082_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1082_15 = __sourceSpill1082_13;
    ((javax.crypto.Cipher)(__sourceSpill1082_10)).init(((int)(__sourceSpill1082_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1082_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1082_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 2932834377964558235L;
    byte[] __sourceSpill1082_19 = new byte[8];
    (__sourceSpill1082_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1082_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1082_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1082_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1082_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1082_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1082_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1082_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1082_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1082_20)).doFinal(((byte[])(__sourceSpill1082_19)));
    o = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public net.minecraft.item.ItemStack a(net.minecraft.item.ItemStack p0, net.minecraft.world.World p1, net.minecraft.entity.player.EntityPlayer p2) {
net.minecraft.entity.Entity lexicalValue1364_191_0;
    int lexicalValue1364_210_0;
    int lexicalValue1364_214_0;
    net.minecraft.util.MovingObjectPosition lexicalValue1364_222_0;
    int lexicalValue1364_293_0;
    int lexicalValue1364_305_0;
    net.minecraft.entity.player.EntityPlayer lexicalValue1364_313_0;
    net.minecraft.item.ItemStack lexicalValue1364_325_0;
    net.minecraft.item.ItemStack lexicalValue1364_326_0;
    int lexicalValue1364_326_1;
    net.minecraft.item.ItemStack lexicalValue1364_327_0;
    boolean spill1364_0;
    net.minecraft.entity.Entity spill1364_1;
    boolean spill1364_2;
    boolean spill1364_3;
    net.minecraft.util.MovingObjectPosition spill1364_4;
    boolean spill1364_5;
    net.minecraft.entity.player.EntityPlayer spill1364_6;
    net.minecraft.item.ItemStack spill1364_7;
    long life4_3;
    float life7_5;
    float life8_16;
    float life9_27;
    double life10_40;
    double life12_56;
    double life14_68;
    moom.DR life16_75;
    float life17_83;
    int life6_84;
    float life18_92;
    float life19_99;
    float life20_105;
    float life21_109;
    float life22_113;
    double life23_115;
    moom.DR life25_130;
    net.minecraft.util.MovingObjectPosition life26_136;
    moom.DR life27_142;
    int life28_144;
    float life29_146;
    java.util.List life30_172;
    java.util.Iterator life31_175;
    net.minecraft.entity.Entity life32_182;
    float life33_198;
    moom.CA life34_208;
    moom.DT life31_241;
    moom.tv life32_273;
    lexical_join_327: {
    lexical_join_326: {
    lexical_join_325: {
    lexical_join_318: {
    lexical_join_313: {
    lexical_join_312: {
    lexical_join_305: {
    lexical_join_300: {
    lexical_join_293: {
    lexical_join_291: {
    lexical_join_233: {
    lexical_join_222: {
    lexical_join_214: {
    lexical_join_213: {
    life4_3 = (moom.w6.n ^ 11621822029088L);
    life7_5 = 0x1.0p0f;
    life8_16 = (((net.minecraft.entity.player.EntityPlayer)(p2)).z + ((((net.minecraft.entity.player.EntityPlayer)(p2)).x - ((net.minecraft.entity.player.EntityPlayer)(p2)).z) * life7_5));
    life9_27 = (((net.minecraft.entity.player.EntityPlayer)(p2)).y + ((((net.minecraft.entity.player.EntityPlayer)(p2)).w - ((net.minecraft.entity.player.EntityPlayer)(p2)).y) * life7_5));
    spill1364_0 = net.minecraft.item.ItemStack.m();
    life10_40 = (((net.minecraft.entity.player.EntityPlayer)(p2)).k + ((((net.minecraft.entity.player.EntityPlayer)(p2)).n - ((net.minecraft.entity.player.EntityPlayer)(p2)).k) * ((double) life7_5)));
    life12_56 = ((((net.minecraft.entity.player.EntityPlayer)(p2)).l + ((((net.minecraft.entity.player.EntityPlayer)(p2)).o - ((net.minecraft.entity.player.EntityPlayer)(p2)).l) * ((double) life7_5))) + ((double) ((net.minecraft.entity.player.EntityPlayer)(p2)).e__Float()));
    life14_68 = (((net.minecraft.entity.player.EntityPlayer)(p2)).m + ((((net.minecraft.entity.player.EntityPlayer)(p2)).p - ((net.minecraft.entity.player.EntityPlayer)(p2)).m) * ((double) life7_5)));
    life16_75 = new moom.DR(life10_40, life12_56, life14_68);
    life17_83 = moom.Dr.b(((float)((((-life9_27) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    life6_84 = ((spill1364_0) ? 1 : 0);
    life18_92 = moom.Dr.a(((float)((((-life9_27) * 0x1.1df46ap-6f) - 0x1.921fb6p1f))));
    life19_99 = (-moom.Dr.b(((float)(((-life8_16) * 0x1.1df46ap-6f)))));
    life20_105 = moom.Dr.a(((float)(((-life8_16) * 0x1.1df46ap-6f))));
    life21_109 = (life18_92 * life19_99);
    life22_113 = (life17_83 * life19_99);
    life23_115 = 0x1.4p2d;
    life25_130 = ((moom.DR)(life16_75)).b(((double)((((double) life21_109) * life23_115))), ((double)((((double) life20_105) * life23_115))), ((double)((((double) life22_113) * life23_115))));
    life26_136 = ((net.minecraft.world.World)(p1)).a(((moom.DR)(life16_75)), ((moom.DR)(life25_130)), ((boolean)(true)));
    if (!((life26_136 != null))) {
        break lexical_join_318;
    }
    life27_142 = ((net.minecraft.entity.player.EntityPlayer)(p2)).a__DR(((float)(life7_5)));
    life28_144 = 0;
    life29_146 = 0x1.0p0f;
    life30_172 = ((net.minecraft.world.World)(p1)).b(((net.minecraft.entity.Entity)(p2)), ((moom.CA)(((moom.CA)(((moom.CA)(((net.minecraft.entity.player.EntityPlayer)(p2)).b())).a(((double)((((moom.DR)(life27_142)).a * life23_115))), ((double)((((moom.DR)(life27_142)).b * life23_115))), ((double)((((moom.DR)(life27_142)).c * life23_115)))))).b(((double)(((double) life29_146))), ((double)(((double) life29_146))), ((double)(((double) life29_146)))))));
    life31_175 = ((java.util.List)(life30_172)).iterator();
    lexical_cycle_176: while (true) {
    lexical_join_211: {
    lexical_join_210: {
    lexical_join_191: {
    if (!(((java.util.Iterator)(life31_175)).hasNext())) {
        break lexical_join_213;
    }
    life32_182 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life31_175)).next()));
    spill1364_1 = life32_182;
    if (!((life6_84 != 0))) {
        lexicalValue1364_191_0 = spill1364_1;
        break lexical_join_191;
    }
    spill1364_2 = ((net.minecraft.entity.Entity)(spill1364_1)).m__Boolean();
    if (!((life6_84 != 0))) {
        lexicalValue1364_214_0 = ((spill1364_2) ? 1 : 0);
        break lexical_join_214;
    }
    if (!(spill1364_2)) {
        break lexical_join_211;
    }
    lexicalValue1364_191_0 = life32_182;
    }
    life33_198 = ((net.minecraft.entity.Entity)(lexicalValue1364_191_0)).c();
    life34_208 = ((moom.CA)(((net.minecraft.entity.Entity)(life32_182)).b())).b(((double)(((double) life33_198))), ((double)(((double) life33_198))), ((double)(((double) life33_198))));
    spill1364_3 = ((moom.CA)(life34_208)).a(((moom.DR)(life16_75)));
    if (!((life6_84 != 0))) {
        lexicalValue1364_210_0 = ((spill1364_3) ? 1 : 0);
        break lexical_join_210;
    }
    if (!(spill1364_3)) {
        break lexical_join_211;
    }
    lexicalValue1364_210_0 = 1;
    }
    life28_144 = lexicalValue1364_210_0;
    }
    if (!((life6_84 == 0))) { continue lexical_cycle_176; }
    break lexical_cycle_176;
    }
    }
    lexicalValue1364_214_0 = life28_144;
    }
    if (!((lexicalValue1364_214_0 == 0))) {
        break lexical_join_318;
    }
    spill1364_4 = life26_136;
    if (!((life6_84 != 0))) {
        lexicalValue1364_222_0 = spill1364_4;
        break lexical_join_222;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(spill1364_4)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break lexical_join_318;
    }
    lexicalValue1364_222_0 = life26_136;
    }
    life31_241 = ((net.minecraft.util.MovingObjectPosition)(lexicalValue1364_222_0)).a();
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p1)).a__fE(((moom.DT)(life31_241))))).a__ch() == net.minecraft.init.Blocks.aH))) {
        break lexical_join_233;
    }
    life31_241 = ((moom.DT)(life31_241)).b__DT();
    }
    life32_273 = new moom.tv(p1, ((double) (((float) ((moom.DT)(life31_241)).a()) + 0x1.0p-1f)), ((double) (((float) ((moom.DT)(life31_241)).b()) + 0x1.0p0f)), ((double) (((float) ((moom.DT)(life31_241)).c()) + 0x1.0p-1f)));
    ((moom.tv)(life32_273)).w = ((float)(((float) (((moom.Dr.b__Int(((double)((((double) ((((net.minecraft.entity.player.EntityPlayer)(p2)).w * 0x1.0p2f) / 0x1.68p8f)) + 0x1.0p-1d)))) & 3) - 1) * ((int) moom.w6.o)))));
    spill1364_5 = ((java.util.List)(((net.minecraft.world.World)(p1)).a(((net.minecraft.entity.Entity)(life32_273)), ((moom.CA)(((moom.CA)(((moom.tv)(life32_273)).b())).b(((double)(-0x1.999999999999ap-4d)), ((double)(-0x1.999999999999ap-4d)), ((double)(-0x1.999999999999ap-4d)))))))).isEmpty();
    if (!((life6_84 != 0))) {
        lexicalValue1364_293_0 = ((spill1364_5) ? 1 : 0);
        break lexical_join_293;
    }
    if (!((!spill1364_5))) {
        break lexical_join_291;
    }
    return p0;
    }
    lexicalValue1364_293_0 = ((((net.minecraft.world.World)(p1)).G) ? 1 : 0);
    }
    if (!((life6_84 != 0))) {
        lexicalValue1364_305_0 = lexicalValue1364_293_0;
        break lexical_join_305;
    }
    if (!((lexicalValue1364_293_0 == 0))) {
        break lexical_join_300;
    }
    ((net.minecraft.world.World)(p1)).b__Boolean(((net.minecraft.entity.Entity)(life32_273)));
    }
    spill1364_6 = p2;
    if (!((life6_84 != 0))) {
        lexicalValue1364_313_0 = spill1364_6;
        break lexical_join_313;
    }
    lexicalValue1364_305_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(spill1364_6)).b1)).d) ? 1 : 0);
    }
    if (!((lexicalValue1364_305_0 == 0))) {
        break lexical_join_312;
    }
    net.minecraft.item.ItemStack __stackOp1364_69_0 = p0;
    ((net.minecraft.item.ItemStack)(__stackOp1364_69_0)).b = ((int)((((net.minecraft.item.ItemStack)(__stackOp1364_69_0)).b - 1)));
    }
    lexicalValue1364_313_0 = p2;
    }
    ((net.minecraft.entity.player.EntityPlayer)(lexicalValue1364_313_0)).a(((moom.BY)((net.minecraft.stats.StatList.ad)[net.minecraft.item.Item.a(((net.minecraft.item.Item)(this)))])));
    }
    spill1364_7 = p0;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        lexicalValue1364_327_0 = spill1364_7;
        break lexical_join_327;
    }
    if (!((life6_84 != 0))) {
        lexicalValue1364_325_0 = spill1364_7;
        break lexical_join_325;
    }
    lexicalValue1364_326_0 = spill1364_7;
    lexicalValue1364_326_1 = 0;
    break lexical_join_326;
    }
    lexicalValue1364_326_0 = lexicalValue1364_325_0;
    lexicalValue1364_326_1 = 1;
    }
    net.minecraft.item.ItemStack.b(((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue1364_326_1))));
    lexicalValue1364_327_0 = lexicalValue1364_326_0;
    }
    return lexicalValue1364_327_0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
