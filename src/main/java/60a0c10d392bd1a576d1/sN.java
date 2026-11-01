package moom;


public class sN extends moom.sM {

private static final long kb;

public sN(net.minecraft.world.World p0) {
super(p0);
    (this).a__Void(0x1.cccccc0000000p-1f, 0x1.4ccccc0000000p+0f);
    this.b_ = net.minecraft.init.Blocks.bl;
}


static {
kb = (moom._c.a(8683576934910957311L, -6887518883122699680L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(84395180596651L);
}


private static moom.Oo d(moom.Oo p0) {
return p0;
}


public moom.sM a__sM(moom.sJ p0) {
return ((moom.sN)(this)).a__sN(((moom.sJ)(p0)));
}


public boolean a__Boolean(net.minecraft.entity.player.EntityPlayer p0) {
int lexicalValue1300_27_0;
    int lexicalValue1300_50_0;
    int lexicalValue1300_56_0;
    int lexicalValue1300_68_0;
    net.minecraft.item.ItemStack lexicalValue1300_70_0;
    net.minecraft.item.ItemStack lexicalValue1300_74_0;
    int lexicalValue1300_152_0;
    int lexicalValue1300_194_0;
    int lexicalValue1300_198_0;
    int spill1300_0;
    net.minecraft.item.ItemStack spill1300_1;
    net.minecraft.item.ItemStack spill1300_2;
    int spill1300_3;
    int spill1300_4;
    boolean spill1300_5;
    boolean spill1300_6;
    long life2_3;
    net.minecraft.item.ItemStack life5_8;
    int life4_9;
    moom.sM life6_166;
    int life7_208;
    lexical_join_198: {
    lexical_join_195: {
    lexical_join_194: {
    lexical_join_193: {
    lexical_join_188: {
    lexical_join_184: {
    lexical_join_152: {
    lexical_join_146: {
    lexical_join_74: {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_56: {
    lexical_join_50: {
    lexical_join_43: {
    lexical_join_27: {
    life2_3 = (moom.sN.kb ^ 117707416742064L);
    spill1300_0 = moom.vR.b();
    life5_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__xW();
    life4_9 = spill1300_0;
    spill1300_1 = life5_8;
    if (!((life4_9 != 0))) {
        lexicalValue1300_70_0 = spill1300_1;
        break lexical_join_70;
    }
    if (!((spill1300_1 != null))) {
        break lexical_join_69;
    }
    spill1300_2 = life5_8;
    if (!((life4_9 != 0))) {
        lexicalValue1300_70_0 = spill1300_2;
        break lexical_join_70;
    }
    if (!((((net.minecraft.item.ItemStack)(spill1300_2)).a__wQ() == net.minecraft.init.Items.z))) {
        break lexical_join_69;
    }
    spill1300_3 = ((moom.sN)(this)).q__sourceReturn_8abf5c6871();
    if (!((life4_9 != 0))) {
        lexicalValue1300_27_0 = spill1300_3;
        break lexical_join_27;
    }
    if (!((spill1300_3 >= 0))) {
        break lexical_join_69;
    }
    lexicalValue1300_27_0 = ((net.minecraft.item.ItemStack)(life5_8)).b;
    }
    if (!((life4_9 != 0))) {
        lexicalValue1300_50_0 = lexicalValue1300_27_0;
        break lexical_join_50;
    }
    if (!((lexicalValue1300_27_0 == 1))) {
        break lexical_join_43;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.A))));
    return ((1) != 0);
    }
    lexicalValue1300_50_0 = ((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a__Boolean(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Items.A))))) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        lexicalValue1300_56_0 = lexicalValue1300_50_0;
        break lexical_join_56;
    }
    if (!((lexicalValue1300_50_0 != 0))) {
        break lexical_join_69;
    }
    lexicalValue1300_56_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p0)).b1)).d) ? 1 : 0);
    }
    if (!((life4_9 != 0))) {
        lexicalValue1300_68_0 = lexicalValue1300_56_0;
        break lexical_join_68;
    }
    if (!((lexicalValue1300_56_0 == 0))) {
        break lexical_join_69;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).a(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p0)).bD)).c)), ((int)(1)));
    lexicalValue1300_68_0 = 1;
    }
    return ((lexicalValue1300_68_0) != 0);
    }
    lexicalValue1300_70_0 = life5_8;
    }
    if (!((life4_9 != 0))) {
        lexicalValue1300_74_0 = lexicalValue1300_70_0;
        break lexical_join_74;
    }
    if (!((lexicalValue1300_70_0 != null))) {
        break lexical_join_195;
    }
    lexicalValue1300_74_0 = life5_8;
    }
    if (!((((net.minecraft.item.ItemStack)(lexicalValue1300_74_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break lexical_join_195;
    }
    spill1300_4 = ((moom.sN)(this)).q__sourceReturn_8abf5c6871();
    if (!((life4_9 != 0))) {
        lexicalValue1300_198_0 = spill1300_4;
        break lexical_join_198;
    }
    if (!((spill1300_4 >= 0))) {
        break lexical_join_195;
    }
    ((moom.sN)(this)).f__Void();
    ((net.minecraft.world.World)(((moom.sN)(this)).i)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.EXPLOSION_LARGE)), ((double)(((moom.sN)(this)).n)), ((double)((((moom.sN)(this)).o + ((double) (((moom.sN)(this)).H / 0x1.0p1f))))), ((double)(((moom.sN)(this)).p)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((int[])(new int[0])));
    spill1300_5 = ((net.minecraft.world.World)(((moom.sN)(this)).i)).G;
    if (!((life4_9 != 0))) {
        lexicalValue1300_194_0 = ((spill1300_5) ? 1 : 0);
        break lexical_join_194;
    }
    if (!((!spill1300_5))) {
        break lexical_join_193;
    }
    life6_166 = new moom.sM(((moom.sN)(this)).i);
    ((moom.sM)(life6_166)).c(((double)(((moom.sN)(this)).n)), ((double)(((moom.sN)(this)).o)), ((double)(((moom.sN)(this)).p)), ((float)(((moom.sN)(this)).w)), ((float)(((moom.sN)(this)).x)));
    ((moom.sM)(life6_166)).d(((float)(((moom.sN)(this)).b__sourceReturn_bc607678b6())));
    ((moom.sM)(life6_166)).a2 = ((float)(((moom.sN)(this)).a2));
    spill1300_6 = ((moom.sN)(this)).e__Boolean();
    if (!((life4_9 != 0))) {
        lexicalValue1300_152_0 = ((spill1300_6) ? 1 : 0);
        break lexical_join_152;
    }
    if (!(spill1300_6)) {
        break lexical_join_146;
    }
    ((moom.sM)(life6_166)).a(((java.lang.String)(((moom.sN)(this)).g__String())));
    }
    ((net.minecraft.world.World)(((moom.sN)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(life6_166)));
    lexicalValue1300_152_0 = 0;
    }
    life7_208 = lexicalValue1300_152_0;
    lexical_cycle_153: while (true) {
    if (!((life7_208 < 5))) {
        break lexical_join_184;
    }
    ((net.minecraft.world.World)(((moom.sN)(this)).i)).b__Boolean(((net.minecraft.entity.Entity)(new net.minecraft.entity.item.EntityItem(((moom.sN)(this)).i, ((moom.sN)(this)).n, (((moom.sN)(this)).o + ((double) ((moom.sN)(this)).H)), ((moom.sN)(this)).p, new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.Q)))));
    life7_208 += 1;
    if (!((life4_9 != 0))) {
        break lexical_join_188;
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_153; }
    break lexical_cycle_153;
    }
    }
    ((net.minecraft.item.ItemStack)(life5_8)).a(((int)(1)), ((net.minecraft.entity.EntityLivingBase)(p0)));
    }
    ((moom.sN)(this)).a(((java.lang.String)("mob.sheep.shear")), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    lexicalValue1300_194_0 = 1;
    }
    return ((lexicalValue1300_194_0) != 0);
    }
    lexicalValue1300_198_0 = ((super.a__Boolean(((net.minecraft.entity.player.EntityPlayer)(p0)))) ? 1 : 0);
    }
    return ((lexicalValue1300_198_0) != 0);
}


public moom.sJ a(moom.sJ p0) {
return ((moom.sN)(this)).a__sN(((moom.sJ)(p0)));
}


public moom.sN a__sN(moom.sJ p0) {
return new moom.sN(((moom.sN)(this)).i);
}

}
