package moom;


class Bz implements com.mojang.authlib.ProfileLookupCallback {

moom.Bl a;

java.util.List b;

Bz(moom.Bl p0, java.util.List p1) { super(); }


private static void __sourceConstructorBody_cc237e4fa08046b0(moom.Bz receiver, moom.Bl p0, java.util.List p1) throws Throwable {

((moom.Bz)(receiver)).a = ((moom.Bl)(p0));

    ((moom.Bz)(receiver)).b = ((java.util.List)(p1));

    moom.Bz.__sourceConstructorInit_cc237e4fa08046b0_0(((moom.Bz)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_cc237e4fa08046b0_0(moom.Bz a0) throws E;

public void onProfileLookupSucceeded(com.mojang.authlib.GameProfile p0) {
((moom.Bt)(((moom.Bl)(this.a)).a__Bt())).a(((com.mojang.authlib.GameProfile)(p0)));
    ((java.util.List)(this.b)).add(((java.lang.Object)(p0)));
    return;
}


public void onProfileLookupFailed(com.mojang.authlib.GameProfile p0, java.lang.Exception p1) {
((org.apache.logging.log4j.Logger)(moom.By.a)).warn(((java.lang.String)(__sourceIntrinsic_c071978ca4b3_originalDynamicSite1070_2(((com.mojang.authlib.GameProfile)(p0)).getName()))), ((java.lang.Throwable)(p1)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c071978ca4b3_originalDynamicSite1070_2(java.lang.String a0) throws E;
}
