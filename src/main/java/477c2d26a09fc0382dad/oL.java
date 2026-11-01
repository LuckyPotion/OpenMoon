package moom;


public class oL implements moom.oR {

private static final org.apache.logging.log4j.Logger a;

protected final java.util.List<net.minecraft.client.resources.IResourcePack> b;

private final net.minecraft.client.resources.data.IMetadataSerializer c;

private static final long d;

public oL(net.minecraft.client.resources.data.IMetadataSerializer p0) {
super();
    this.b = com.google.common.collect.Lists.newArrayList();
    this.c = p0;
}


static {
d = (moom._c.a(4941079214785079856L, 1046957482124828780L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(91559695371955L);
    a = org.apache.logging.log4j.LogManager.getLogger();
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


static moom.DD a__DD(moom.DD p0) {
return new moom.DD(((moom.DD)(p0)).b(), __sourceIntrinsic_5eb81cf90733_originalDynamicSite1579_2(((moom.DD)(p0)).a()));
}


public java.util.List<net.minecraft.client.resources.IResource> a(moom.DD p0) throws java.io.IOException {
int lexicalValue1256_33_0;
    java.io.InputStream lexicalValue1256_40_0;
    int lexicalValue1256_63_0;
    java.util.ArrayList lexicalValue1256_71_0;
    java.lang.String[] spill1256_0;
    boolean spill1256_1;
    java.util.ArrayList spill1256_2;
    long life2_3;
    java.util.ArrayList life5_6;
    java.lang.String[] life4_7;
    moom.DD life6_10;
    java.util.Iterator life7_14;
    net.minecraft.client.resources.IResourcePack life8_21;
    java.io.InputStream life9_51;
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_63: {
    lexical_join_59: {
    life2_3 = (moom.oL.d ^ 90035536057614L);
    spill1256_0 = moom.oO.b();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = spill1256_0;
    life6_10 = moom.oL.a__DD(((moom.DD)(p0)));
    life7_14 = ((java.util.List)(this.b)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_57: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_33: {
    if (!(((java.util.Iterator)(life7_14)).hasNext())) {
        break lexical_join_59;
    }
    life8_21 = ((net.minecraft.client.resources.IResourcePack)(((java.util.Iterator)(life7_14)).next()));
    spill1256_1 = ((net.minecraft.client.resources.IResourcePack)(life8_21)).a__Boolean(((moom.DD)(p0)));
    if (!((life4_7 != null))) {
        lexicalValue1256_63_0 = ((spill1256_1) ? 1 : 0);
        break lexical_join_63;
    }
    if (!((life4_7 != null))) {
        lexicalValue1256_33_0 = ((spill1256_1) ? 1 : 0);
        break lexical_join_33;
    }
    if (!(spill1256_1)) {
        break lexical_join_57;
    }
    lexicalValue1256_33_0 = ((((net.minecraft.client.resources.IResourcePack)(life8_21)).a__Boolean(((moom.DD)(life6_10)))) ? 1 : 0);
    }
    if (!((lexicalValue1256_33_0 != 0))) {
        break lexical_join_39;
    }
    lexicalValue1256_40_0 = this.a(((moom.DD)(life6_10)), ((net.minecraft.client.resources.IResourcePack)(life8_21)));
    break lexical_join_40;
    }
    lexicalValue1256_40_0 = null;
    }
    life9_51 = lexicalValue1256_40_0;
    ((java.util.List)(life5_6)).add(((java.lang.Object)(new net.minecraft.client.resources.SimpleResource(((net.minecraft.client.resources.IResourcePack)(life8_21)).a__String(), p0, this.a(((moom.DD)(p0)), ((net.minecraft.client.resources.IResourcePack)(life8_21))), life9_51, this.c))));
    }
    if (!((life4_7 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    spill1256_2 = life5_6;
    if (!((life4_7 != null))) {
        lexicalValue1256_71_0 = spill1256_2;
        break lexical_join_71;
    }
    lexicalValue1256_63_0 = ((((java.util.List)(spill1256_2)).isEmpty()) ? 1 : 0);
    }
    if (!((lexicalValue1256_63_0 != 0))) {
        break lexical_join_70;
    }
    throw new java.io.FileNotFoundException(((moom.DD)(p0)).toString());
    }
    lexicalValue1256_71_0 = life5_6;
    }
    return lexicalValue1256_71_0;
}


public void a(net.minecraft.client.resources.IResourcePack p0) {
((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    return;
}


public java.util.Set<java.lang.String> a() {
return null;
}


public net.minecraft.client.resources.IResource a__oQ(moom.DD p0) throws java.io.IOException {
net.minecraft.client.resources.IResourcePack lexicalValue1257_38_0;
    int lexicalValue1257_40_0;
    java.lang.String[] spill1257_0;
    net.minecraft.client.resources.IResourcePack spill1257_1;
    boolean spill1257_2;
    long life2_3;
    net.minecraft.client.resources.IResourcePack life5_5;
    moom.DD life6_9;
    java.lang.String[] life4_10;
    int life7_16;
    net.minecraft.client.resources.IResourcePack life8_24;
    java.io.InputStream life9_51;
    lexical_join_67: {
    life2_3 = (moom.oL.d ^ 26948664893111L);
    life5_5 = null;
    spill1257_0 = moom.oO.b();
    life6_9 = moom.oL.a__DD(((moom.DD)(p0)));
    life4_10 = spill1257_0;
    life7_16 = (((java.util.List)(this.b)).size() - 1);
    lexical_cycle_17: while (true) {
    lexical_join_64: {
    lexical_join_50: {
    lexical_join_40: {
    lexical_join_38: {
    lexical_join_37: {
    if (!((life7_16 >= 0))) {
        break lexical_join_67;
    }
    life8_24 = ((net.minecraft.client.resources.IResourcePack)(((java.util.List)(this.b)).get(((int)(life7_16)))));
    spill1257_1 = life5_5;
    if (!((life4_10 != null))) {
        lexicalValue1257_38_0 = spill1257_1;
        break lexical_join_38;
    }
    if (!((spill1257_1 == null))) {
        break lexical_join_37;
    }
    spill1257_2 = ((net.minecraft.client.resources.IResourcePack)(life8_24)).a__Boolean(((moom.DD)(life6_9)));
    if (!((life4_10 != null))) {
        lexicalValue1257_40_0 = ((spill1257_2) ? 1 : 0);
        break lexical_join_40;
    }
    if (!(spill1257_2)) {
        break lexical_join_37;
    }
    life5_5 = life8_24;
    }
    lexicalValue1257_38_0 = life8_24;
    }
    lexicalValue1257_40_0 = ((((net.minecraft.client.resources.IResourcePack)(lexicalValue1257_38_0)).a__Boolean(((moom.DD)(p0)))) ? 1 : 0);
    }
    if (!((lexicalValue1257_40_0 != 0))) {
        break lexical_join_64;
    }
    life9_51 = null;
    if (!((life5_5 != null))) {
        break lexical_join_50;
    }
    life9_51 = this.a(((moom.DD)(life6_9)), ((net.minecraft.client.resources.IResourcePack)(life5_5)));
    }
    return new net.minecraft.client.resources.SimpleResource(((net.minecraft.client.resources.IResourcePack)(life8_24)).a__String(), p0, this.a(((moom.DD)(p0)), ((net.minecraft.client.resources.IResourcePack)(life8_24))), life9_51, this.c);
    }
    life7_16 += -1;
    if (!((life4_10 == null))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    throw new java.io.FileNotFoundException(((moom.DD)(p0)).toString());
}


protected java.io.InputStream a(moom.DD p0, net.minecraft.client.resources.IResourcePack p1) throws java.io.IOException {
java.io.InputStream forwardValue3809_20_0;
    long life3_3;
    java.io.InputStream life5_7;
    forward_join_20: {
    forward_join_19: {
    life3_3 = (moom.oL.d ^ 140465041744474L);
    life5_7 = ((net.minecraft.client.resources.IResourcePack)(p1)).a(((moom.DD)(p0)));
    if (!(((org.apache.logging.log4j.Logger)(moom.oL.a)).isDebugEnabled())) {
        break forward_join_19;
    }
    forwardValue3809_20_0 = new moom.C(life5_7, p0, ((net.minecraft.client.resources.IResourcePack)(p1)).a__String());
    break forward_join_20;
    }
    forwardValue3809_20_0 = life5_7;
    }
    return forwardValue3809_20_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5eb81cf90733_originalDynamicSite1579_2(java.lang.String a0) throws E;
}
