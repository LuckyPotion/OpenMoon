package moom;


public class vo implements java.util.Comparator<net.minecraft.entity.Entity> {

private final net.minecraft.entity.Entity a;

public vo(net.minecraft.entity.Entity p0) {
super();
    this.a = p0;
}


public int compare__sourceBridge_3438c2120d(java.lang.Object p0, java.lang.Object p1) {
return ((moom.vo)(this)).a(((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(p0)))), ((net.minecraft.entity.Entity)(((net.minecraft.entity.Entity)(p1)))));
}


public int a(net.minecraft.entity.Entity p0, net.minecraft.entity.Entity p1) {
double local3 = ((net.minecraft.entity.Entity)(this.a)).a(((net.minecraft.entity.Entity)(p0)));
    double local5 = ((net.minecraft.entity.Entity)(this.a)).a(((net.minecraft.entity.Entity)(p1)));
    return java.lang.Double.compare(((double)(local3)), ((double)(local5)));
}


public int compare(net.minecraft.entity.Entity __bridgeParam0, net.minecraft.entity.Entity __bridgeParam1) { return this.compare__sourceBridge_3438c2120d(((java.lang.Object)(__bridgeParam0)), ((java.lang.Object)(__bridgeParam1))); }
}
