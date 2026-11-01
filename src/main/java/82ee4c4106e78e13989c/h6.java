package com.moon;

public class h6 extends java.lang.Object {
    public h6() {
        super();
    }

    public static <T> T a(java.io.InputStream p0, java.lang.Class<T> p1) {
        try {
            java.lang.String local2 = new java.lang.String((p0).readAllBytes());
            return (T) com.moon.h6.a(local2, p1);
        } catch (java.io.IOException caught2) {
            throw new java.lang.RuntimeException(caught2);
        }
    }

    public static <T> T a(java.lang.String p0, java.lang.Class<T> p1) {
        return (T) (new com.moon.h5(new com.moon.pp(p0, p1))).a();
    }

}
