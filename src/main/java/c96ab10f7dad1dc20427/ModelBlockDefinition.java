package net.minecraft.client.renderer.block.model;


public class ModelBlockDefinition {

static final com.google.gson.Gson a;

private final java.util.Map<java.lang.String, moom.l4> b;

public ModelBlockDefinition(java.util.List<net.minecraft.client.renderer.block.model.ModelBlockDefinition> p0) {
super();
    this.b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    java.util.Iterator local2_life4 = ((java.util.List)(p0)).iterator();
    while (((java.util.Iterator)(local2_life4)).hasNext()) {
        net.minecraft.client.renderer.block.model.ModelBlockDefinition local3_life8 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(((java.util.Iterator)(local2_life4)).next()));
        ((java.util.Map)(this.b)).putAll(((java.util.Map)(((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(local3_life8)).b)));
    }
    return;
}


public ModelBlockDefinition(java.util.Collection<moom.l4> p0) {
super();
    this.b = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    java.util.Iterator local2_life4 = ((java.util.Collection)(p0)).iterator();
    while (((java.util.Iterator)(local2_life4)).hasNext()) {
        moom.l4 local3_life8 = ((moom.l4)(((java.util.Iterator)(local2_life4)).next()));
        ((java.util.Map)(this.b)).put(((java.lang.Object)(((moom.l4)(local3_life8)).a)), ((java.lang.Object)(local3_life8)));
    }
    return;
}


static {
net.minecraft.client.renderer.block.model.ModelBlockDefinition.a = (((new com.google.gson.GsonBuilder()).registerTypeAdapter(net.minecraft.client.renderer.block.model.ModelBlockDefinition.class, new net.minecraft.client.renderer.block.model.ModelBlockDefinition$Deserializer())).registerTypeAdapter(moom.l2.class, new net.minecraft.client.renderer.block.model.ModelBlockDefinition$Variant$Deserializer())).create();
}


public boolean equals(java.lang.Object p0) {
if ((this == p0)) {
        return ((1) != 0);
    }
    if ((((p0 instanceof net.minecraft.client.renderer.block.model.ModelBlockDefinition) ? 1 : 0) != 0)) {
        java.lang.Object local2 = ((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(p0));
        return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.b)).equals(((java.lang.Object)(((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(local2)).b))))) != 0);
    }
    return ((0) != 0);
}


public int hashCode() {
return ((java.util.Map)(this.b)).hashCode();
}


private static moom.Om a(moom.Om p0) {
return p0;
}


public static net.minecraft.client.renderer.block.model.ModelBlockDefinition a(java.io.Reader p0) {
return ((net.minecraft.client.renderer.block.model.ModelBlockDefinition)(((com.google.gson.Gson)(net.minecraft.client.renderer.block.model.ModelBlockDefinition.a)).fromJson(((java.io.Reader)(p0)), ((java.lang.Class)(net.minecraft.client.renderer.block.model.ModelBlockDefinition.class)))));
}


public moom.l4 a(java.lang.String p0) {
moom.l4 local2 = ((moom.l4)(((java.util.Map)(this.b)).get(((java.lang.Object)(p0)))));
    if ((local2 == null)) {
        throw new moom.Om();
    }
    return local2;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
