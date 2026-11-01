package com.moon;

import java.lang.invoke.MethodHandles;
import moom.Oo;
import moom._c;
import moom.wB;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

/** Source donor; PresuperBuild restores the documented pre-super evaluation order. */
public record po(bL a, wB b, ItemStack c) {
    private static boolean d;
    private static final long e = _c.a(4323333943559219509L, 3899484666110004289L,
            MethodHandles.lookup().lookupClass()).a(89890203075412L);

    public po(bL a, wB b, ItemStack c) {
        long unusedKey = e ^ 27330340848607L;
        boolean marker = b__Boolean();
        this.a = a;
        this.b = b;
        this.c = c;
        if (marker) Entity.b(new String[2]);
    }

    static {
        if (b__Boolean()) b(true);
    }

    public static boolean b__Boolean() { return d; }
    public static void b(boolean marker) { d = marker; }
    public static boolean c__Boolean() {
        boolean marker = b__Boolean();
        if (!marker) return true;
        return false;
    }
    private static Oo a(Oo exception) { return exception; }
}
