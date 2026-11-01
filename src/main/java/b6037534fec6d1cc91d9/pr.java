package com.moon;

import java.util.List;
import net.minecraft.entity.Entity;

public record pr(java.util.List<com.moon.ie> h) implements ie {
    private static Entity[] b;

    static {
        if (b() == null) {
            b(new Entity[2]);
        }
    }

    public static Entity[] b() {
        return b;
    }

    public static void b(Entity[] entities) {
        b = entities;
    }
}
