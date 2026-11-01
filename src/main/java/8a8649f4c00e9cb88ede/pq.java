package com.moon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import moom.Oo;
import moom._c;
import net.minecraft.entity.Entity;

/** Source donor; the adapter maps markerGetter() to g()String and g()List to g__List(). */
public record pq(String f, java.util.List<com.moon.ie> g) implements ie {
    private static String b;
    private static final long a = _c.a(244901797671549572L, -8921838394054801939L,
            MethodHandles.lookup().lookupClass()).a(213187438908722L);

    public pq(java.lang.String f, java.util.List<com.moon.ie> g) {
        long unusedKey = a ^ 30541333076263L;
        String marker = markerGetter();
        this.f = f;
        this.g = g;
        if (marker != null) Entity.b(new String[2]);
    }

    static {
        if (markerGetter() != null) b("fZttn");
    }

    public static void b(String marker) { b = marker; }
    public static String markerGetter() { return b; }
    private static Oo a(Oo exception) { return exception; }
}
