package moom;


public class az extends sourcebuild.EnumConstructor<moom.az> {

public static moom.az ENABLED;

public static moom.az DISABLED;

public static moom.az PROMPT;

private net.minecraft.util.IChatComponent a;

private static moom.az[] b;

private az(java.lang.String p0, int p1, java.lang.String p2) {
super(p0, p1);

    this.a = ((net.minecraft.util.IChatComponent)(new moom.CN(__sourceIntrinsic_6fb222e193bb_originalDynamicSite4144_0(p2), new java.lang.Object[0])));
    return;
}


private static void initialize() {
ENABLED = ((moom.az)(new moom.az("ENABLED", 0, "enabled")));
    DISABLED = ((moom.az)(new moom.az("DISABLED", 1, "disabled")));
    PROMPT = ((moom.az)(new moom.az("PROMPT", 2, "prompt")));
    b = ((moom.az[])(moom.az.a__Arrayaz()));
}


public static moom.az[] values() {
return ((moom.az[])(((moom.az[])(moom.az.b)).clone()));
}


public static moom.az valueOf(java.lang.String p0) {
return ((moom.az)(java.lang.Enum.valueOf(((java.lang.Class)(moom.az.class)), ((java.lang.String)(p0)))));
}


private static moom.az[] a__Arrayaz() {
return new moom.az[] {moom.az.ENABLED, moom.az.DISABLED, moom.az.PROMPT};
}


public net.minecraft.util.IChatComponent a() {
return this.a;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6fb222e193bb_originalDynamicSite4144_0(java.lang.String a0) throws E;
}
