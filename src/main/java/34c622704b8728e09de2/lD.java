package moom;


public class lD extends moom.lC {

private final net.minecraft.client.renderer.texture.TextureAtlasSprite j;

public lD(moom.lC p0, net.minecraft.client.renderer.texture.TextureAtlasSprite p1) {
super(java.util.Arrays.copyOf((p0).a__ArrayInt(), ((p0).a__ArrayInt()).length), p0.b, moom.lN.a((p0).a__ArrayInt()));
    this.j = p1;
    (this).b();
    (this).a__Void();
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b__sourceReturn_da8c82d5d4() {
int local1 = 0;
    while ((local1 < 4)) {
        ((moom.lD)(this)).a(((int)(local1)));
        local1 += 1;
    }
    return;
}


private void a(int p0) {
int life2_5;
    int life3_9;
    float life4_15;
    float life5_23;
    float life6_31;
    float life7_33;
    float life8_35;
    forest_join_109: {
    forest_join_97: {
    forest_join_86: {
    forest_join_75: {
    forest_join_62: {
    forest_join_53: {
    forest_join_42: {
    life2_5 = ((((moom.lD)(this)).a).length / 4);
    life3_9 = (life2_5 * p0);
    life4_15 = java.lang.Float.intBitsToFloat(((int)((((moom.lD)(this)).a)[life3_9])));
    life5_23 = java.lang.Float.intBitsToFloat(((int)((((moom.lD)(this)).a)[(life3_9 + 1)])));
    life6_31 = java.lang.Float.intBitsToFloat(((int)((((moom.lD)(this)).a)[(life3_9 + 2)])));
    life7_33 = 0x0.0p0f;
    life8_35 = 0x0.0p0f;
    switch ((moom.lM.a)[((moom.bs)(((moom.lD)(this)).c)).ordinal()]) {
case 1:
{
        break forest_join_42;
    }
case 2:
{
        break forest_join_53;
    }
case 3:
{
        break forest_join_62;
    }
case 4:
{
        break forest_join_75;
    }
case 5:
{
        break forest_join_86;
    }
case 6:
{
        break forest_join_97;
    }
default:
{
        break forest_join_109;
    }
}
    }
    life7_33 = (life4_15 * 0x1.0p4f);
    life8_35 = ((0x1.0p0f - life6_31) * 0x1.0p4f);
    break forest_join_109;
    }
    life7_33 = (life4_15 * 0x1.0p4f);
    life8_35 = (life6_31 * 0x1.0p4f);
    break forest_join_109;
    }
    life7_33 = ((0x1.0p0f - life4_15) * 0x1.0p4f);
    life8_35 = ((0x1.0p0f - life5_23) * 0x1.0p4f);
    break forest_join_109;
    }
    life7_33 = (life4_15 * 0x1.0p4f);
    life8_35 = ((0x1.0p0f - life5_23) * 0x1.0p4f);
    break forest_join_109;
    }
    life7_33 = (life6_31 * 0x1.0p4f);
    life8_35 = ((0x1.0p0f - life5_23) * 0x1.0p4f);
    break forest_join_109;
    }
    life7_33 = ((0x1.0p0f - life6_31) * 0x1.0p4f);
    life8_35 = ((0x1.0p0f - life5_23) * 0x1.0p4f);
    }
    (((moom.lD)(this)).a)[(life3_9 + 4)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.j)).a(((double)(((double) life7_33)))))));
    (((moom.lD)(this)).a)[((life3_9 + 4) + 1)] = java.lang.Float.floatToRawIntBits(((float)(((net.minecraft.client.renderer.texture.TextureAtlasSprite)(this.j)).b(((double)(((double) life8_35)))))));
    return;
}

}
