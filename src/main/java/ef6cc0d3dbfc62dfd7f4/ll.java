package moom;


public class ll {

private final java.util.Map<java.lang.Integer, moom.DE> a;

private final java.util.Map<java.lang.Integer, net.minecraft.client.resources.model.IBakedModel> b;

private final java.util.Map<net.minecraft.item.Item, net.minecraft.client.renderer.ItemMeshDefinition> c;

private final net.minecraft.client.resources.model.ModelManager d;

private static final long e;

private static final long f;

public ll(net.minecraft.client.resources.model.ModelManager p0) {
super();
    this.a = com.google.common.collect.Maps.newHashMap();
    this.b = com.google.common.collect.Maps.newHashMap();
    this.c = com.google.common.collect.Maps.newHashMap();
    this.d = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-6785371468734907244L)), ((long)(-1354303281803818944L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(89482903875888L)))));
    long local0_life6 = (moom.ll.e ^ 126067838288354L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill926_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill926_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill926_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill926_13 = new byte[8];
    (__sourceSpill926_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill926_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation926_15 = __sourceSpill926_13;
    ((javax.crypto.Cipher)(__sourceSpill926_10)).init(((int)(__sourceSpill926_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill926_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation926_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8054939598473446497L;
    byte[] __sourceSpill926_19 = new byte[8];
    (__sourceSpill926_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill926_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill926_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill926_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill926_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill926_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill926_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill926_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill926_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill926_20)).doFinal(((byte[])(__sourceSpill926_19)));
    f = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public void a(net.minecraft.item.Item p0, int p1, moom.DE p2) {
((java.util.Map)(this.a)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.a(((net.minecraft.item.Item)(p0)), ((int)(p1)))))))), ((java.lang.Object)(p2)));
    ((java.util.Map)(this.b)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.a(((net.minecraft.item.Item)(p0)), ((int)(p1)))))))), ((java.lang.Object)(((net.minecraft.client.resources.model.ModelManager)(this.d)).a(((moom.DE)(p2))))));
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.client.renderer.ItemMeshDefinition p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


public net.minecraft.client.resources.model.ModelManager a() {
return this.d;
}


public void a__Void() {
java.util.Iterator life1_7;
    java.util.Map.Entry life2_14;
    ((java.util.Map)(this.b)).clear();
    life1_7 = ((java.util.Set)(((java.util.Map)(this.a)).entrySet())).iterator();
    while (((java.util.Iterator)(life1_7)).hasNext()) {
        life2_14 = ((java.util.Map.Entry)(((java.util.Iterator)(life1_7)).next()));
        ((java.util.Map)(this.b)).put(((java.lang.Object)(((java.lang.Integer)(((java.util.Map.Entry)(life2_14)).getKey())))), ((java.lang.Object)(((net.minecraft.client.resources.model.ModelManager)(this.d)).a(((moom.DE)(((moom.DE)(((java.util.Map.Entry)(life2_14)).getValue()))))))));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a(net.minecraft.item.Item p0) {
return ((moom.ll)(this)).a__oh(((net.minecraft.item.Item)(p0)), ((int)(0)));
}


public net.minecraft.client.renderer.texture.TextureAtlasSprite a__oh(net.minecraft.item.Item p0, int p1) {
return ((net.minecraft.client.resources.model.IBakedModel)(((moom.ll)(this)).a__pp(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p0, 1, p1)))))).a__oh();
}


public net.minecraft.client.resources.model.IBakedModel a__pp(net.minecraft.item.ItemStack p0) {
net.minecraft.item.Item life2_2;
    net.minecraft.client.resources.model.IBakedModel life3_9;
    net.minecraft.client.renderer.ItemMeshDefinition life4_17;
    life2_2 = ((net.minecraft.item.ItemStack)(p0)).a__wQ();
    life3_9 = ((moom.ll)(this)).a__pp(((net.minecraft.item.Item)(life2_2)), ((int)(this.a(((net.minecraft.item.ItemStack)(p0))))));
    if ((life3_9 == null)) {
        life4_17 = ((net.minecraft.client.renderer.ItemMeshDefinition)(((java.util.Map)(this.c)).get(((java.lang.Object)(life2_2)))));
        if ((life4_17 != null)) {
        life3_9 = ((net.minecraft.client.resources.model.ModelManager)(this.d)).a(((moom.DE)(((net.minecraft.client.renderer.ItemMeshDefinition)(life4_17)).a(((net.minecraft.item.ItemStack)(p0))))));
    }
    }
    if ((((life3_9 instanceof moom.I1) ? 1 : 0) != 0)) {
        life3_9 = ((moom.I1)(((moom.I1)(life3_9)))).a(((net.minecraft.item.ItemStack)(p0)));
    }
    if ((life3_9 == null)) {
        life3_9 = ((net.minecraft.client.resources.model.ModelManager)(this.d)).a__pp();
    }
    if (moom.BU.av()) {
        life3_9 = moom.Jw.a(((net.minecraft.item.ItemStack)(p0)), ((net.minecraft.client.resources.model.IBakedModel)(life3_9)), ((moom.DD)(null)), ((boolean)(true)));
    }
    return life3_9;
}


protected int a(net.minecraft.item.ItemStack p0) {
return ((__sourceIntrinsic_booleanComparison(((net.minecraft.item.ItemStack)(p0)).b__Boolean()) != 0) ? 0 : ((net.minecraft.item.ItemStack)(p0)).c());
}


protected net.minecraft.client.resources.model.IBakedModel a__pp(net.minecraft.item.Item p0, int p1) {
return ((net.minecraft.client.resources.model.IBakedModel)(((java.util.Map)(this.b)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.a(((net.minecraft.item.Item)(p0)), ((int)(p1)))))))))));
}


private int a(net.minecraft.item.Item p0, int p1) {
long local3 = (moom.ll.e ^ 113819595265148L);
    return ((net.minecraft.item.Item.a(((net.minecraft.item.Item)(p0))) << ((int) moom.ll.f)) | p1);
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
