package net.minecraft.client.resources.model;


public class WeightedBakedModel$Builder {

private final java.util.List<moom.D2> a;

public WeightedBakedModel$Builder() {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
}


public net.minecraft.client.resources.model.IBakedModel a() {
return ((moom.D2)(((moom.D2)(((java.util.List)(this.a)).get(((int)(0))))))).c;
}


public moom.pu a__pu() {
java.util.Collections.sort(((java.util.List)(this.a)));
    return new moom.pu(this.a);
}


public net.minecraft.client.resources.model.WeightedBakedModel$Builder a(net.minecraft.client.resources.model.IBakedModel p0, int p1) {
((java.util.List)(this.a)).add(((java.lang.Object)(new moom.D2(p0, p1))));
    return this;
}

}
