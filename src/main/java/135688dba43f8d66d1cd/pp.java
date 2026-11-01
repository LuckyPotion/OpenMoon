package com.moon;

import moom.Oo;

public record pp<T>(String d, java.lang.Class<T> e) {
    private static int b;

    static {
        if (b() != 0) {
            b(86);
        }
    }

    public static void b(int value) {
        b = value;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int value = b();

        try {
            if (value == 0) {
                return 54;
            }
        } catch (Oo exception) {
            throw a(exception);
        }

        return 0;
    }

    private static Oo a(Oo exception) {
        return exception;
    }
}
