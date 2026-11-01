package moom;


class Bv implements com.mojang.authlib.ProfileLookupCallback {

com.mojang.authlib.GameProfile[] a;

Bv(com.mojang.authlib.GameProfile[] p0) { super(); }


private static void __sourceConstructorBody_4e97d5b3880c8592(moom.Bv receiver, com.mojang.authlib.GameProfile[] p0) throws Throwable {

((moom.Bv)(receiver)).a = ((com.mojang.authlib.GameProfile[])(p0));

    moom.Bv.__sourceConstructorInit_4e97d5b3880c8592_0(((moom.Bv)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_4e97d5b3880c8592_0(moom.Bv a0) throws E;

public void onProfileLookupFailed(com.mojang.authlib.GameProfile p0, java.lang.Exception p1) {
(this.a)[0] = null;
    return;
}


public void onProfileLookupSucceeded(com.mojang.authlib.GameProfile p0) {
(this.a)[0] = p0;
    return;
}

}
