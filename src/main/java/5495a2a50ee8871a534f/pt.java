package com.moon;

import java.lang.invoke.MethodHandles;
import java.util.List;
import moom.Oo;
import moom._c;
import net.minecraft.entity.Entity;

/** Source donor; PresuperBuild restores pr.b() before Record.<init>(). */
public record pt(String j, java.util.List<com.moon.ie> k) implements ie {
    private static final long a = _c.a(2443239024547289513L, 8793605101227556612L,
            MethodHandles.lookup().lookupClass()).a(42160242418490L);

    public pt(java.lang.String j, java.util.List<com.moon.ie> k) {
        long unusedKey = a ^ 31677345860997L;
        Entity[] marker = pr.b();
        this.j = j;
        this.k = k;
        if (marker == null) Entity.b(new String[3]);
    }

    private static Oo a(Oo exception) { return exception; }
}
