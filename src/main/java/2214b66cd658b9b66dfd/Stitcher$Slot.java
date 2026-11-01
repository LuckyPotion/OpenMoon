package net.minecraft.client.renderer.texture;


public class Stitcher$Slot {

private final int a;

private final int b;

private final int c;

private final int d;

private java.util.List<net.minecraft.client.renderer.texture.Stitcher$Slot> e;

private net.minecraft.client.renderer.texture.Stitcher$Holder f;

public Stitcher$Slot(int p0, int p1, int p2, int p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1838_6(this.a, this.b, this.c, this.d, this.f, this.e);
}


public int b() {
return this.b;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(java.util.List<net.minecraft.client.renderer.texture.Stitcher$Slot> p0) {
java.util.Iterator life2_16;
    net.minecraft.client.renderer.texture.Stitcher$Slot life3_23;
    if ((this.f != null)) {
        ((java.util.List)(p0)).add(((java.lang.Object)(this)));
    } else {
        if ((this.e != null)) {
        life2_16 = ((java.util.List)(this.e)).iterator();
        loop_region_15: while (((java.util.Iterator)(life2_16)).hasNext()) {
        life3_23 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(((java.util.Iterator)(life2_16)).next()));
        ((net.minecraft.client.renderer.texture.Stitcher$Slot)(life3_23)).a(((java.util.List)(p0)));
    }
    }
    }
    return;
}


public boolean a(net.minecraft.client.renderer.texture.Stitcher$Holder p0) {
int life2_7;
    int life3_10;
    int life4_59;
    int life5_64;
    int life6_74;
    int life7_79;
    java.util.Iterator life4_186;
    net.minecraft.client.renderer.texture.Stitcher$Slot life5_193;
    forest_join_199: {
    forest_join_197: {
    forest_join_195: {
    forest_join_178: {
    forest_join_161: {
    forest_join_143: {
    forest_join_142: {
    forest_join_111: {
    forest_join_32: {
    forest_join_5: {
    if (!((this.f != null))) {
        break forest_join_5;
    }
    return ((0) != 0);
    }
    life2_7 = ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).a();
    life3_10 = ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0)).b();
    if (!((life2_7 <= this.c))) {
        break forest_join_199;
    }
    if (!((life3_10 <= this.d))) {
        break forest_join_199;
    }
    if (!((life2_7 == this.c))) {
        break forest_join_32;
    }
    if (!((life3_10 == this.d))) {
        break forest_join_32;
    }
    this.f = ((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0));
    return ((1) != 0);
    }
    if (!((this.e == null))) {
        break forest_join_178;
    }
    this.e = ((java.util.List)(com.google.common.collect.Lists.newArrayListWithCapacity(((int)(1)))));
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot(this.a, this.b, life2_7, life3_10))));
    life4_59 = (this.c - life2_7);
    life5_64 = (this.d - life3_10);
    if (!((life5_64 > 0))) {
        break forest_join_143;
    }
    if (!((life4_59 > 0))) {
        break forest_join_143;
    }
    life6_74 = java.lang.Math.max(((int)(this.d)), ((int)(life4_59)));
    life7_79 = java.lang.Math.max(((int)(this.c)), ((int)(life5_64)));
    if (!((life6_74 >= life7_79))) {
        break forest_join_111;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot(this.a, (this.b + life3_10), life2_7, life5_64))));
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot((this.a + life2_7), this.b, life4_59, this.d))));
    break forest_join_142;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot((this.a + life2_7), this.b, life4_59, life3_10))));
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot(this.a, (this.b + life3_10), this.c, life5_64))));
    }
    break forest_join_178;
    }
    if (!((life4_59 == 0))) {
        break forest_join_161;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot(this.a, (this.b + life3_10), life2_7, life5_64))));
    break forest_join_178;
    }
    if (!((life5_64 == 0))) {
        break forest_join_178;
    }
    ((java.util.List)(this.e)).add(((java.lang.Object)(new net.minecraft.client.renderer.texture.Stitcher$Slot((this.a + life2_7), this.b, life4_59, life3_10))));
    }
    life4_186 = ((java.util.List)(this.e)).iterator();
    forest_cycle_182: while (true) {
    forest_join_194: {
    if (!(((java.util.Iterator)(life4_186)).hasNext())) {
        break forest_join_197;
    }
    life5_193 = ((net.minecraft.client.renderer.texture.Stitcher$Slot)(((java.util.Iterator)(life4_186)).next()));
    if (!(((net.minecraft.client.renderer.texture.Stitcher$Slot)(life5_193)).a(((net.minecraft.client.renderer.texture.Stitcher$Holder)(p0))))) {
        break forest_join_194;
    }
    break forest_join_195;
    }
    continue forest_cycle_182;
    }
    }
    return ((1) != 0);
    }
    return ((0) != 0);
    }
    return ((0) != 0);
}


public int a() {
return this.a;
}


public net.minecraft.client.renderer.texture.Stitcher$Holder a__of() {
return this.f;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1838_6(int a0, int a1, int a2, int a3, net.minecraft.client.renderer.texture.Stitcher$Holder a4, java.util.List a5) throws E;
}
