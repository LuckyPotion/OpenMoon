package com.moon;

import java.lang.invoke.MethodHandles;
import moom.CA;
import moom.DR;
import moom.DS;
import moom.DT;
import moom.Dr;
import moom.Oo;
import moom._c;
import net.minecraft.entity.Entity;

public record pw(float p, float q, float r) {
    // Stage017 initializes the key before any numeric constants or vector instances.
    private static final long h = _c.a(-734990824642906200L, -8519732734928221015L,
            MethodHandles.lookup().lookupClass()).a(115251323142311L);
    private static float a = (float) Math.PI;
    private static float b = a / 180.0F;
    public static pw c = new pw(0.0F, 0.0F, 0.0F);
    public static pw d = new pw(1.0F, 0.0F, 0.0F);
    public static pw e = new pw(0.0F, 1.0F, 0.0F);
    public static pw f = new pw(0.0F, 0.0F, 1.0F);
    public static float g = 1.0E-32F;

    public pw b__pw() { return new pw(this.p, this.q, this.r); }
    public pw b(pw value) { return new pw(this.p - value.p, this.q - value.q, this.r - value.r); }
    public float b() { return this.p * this.p + this.q * this.q + this.r * this.r; }

    public pw a__pw() {
        long key = h ^ 90807826574449L;
        float squared = this.b();
        if (squared < g) {
            return c;
        }
        return this.a(Dr.c(squared));
    }

    public CA a__CA(float width, float height) {
        float half = width / 2.0F;
        return new CA(this.p - half, this.q, this.r - half,
                this.p + half, this.q + height, this.r + half);
    }

    public static pw a(float yaw, float pitch) {
        long key = h ^ 75523873936331L;
        int marker = n5.c__Int();
        float yawCos = Dr.b(-yaw * b - a);
        float yawSin = Dr.a(-yaw * b - a);
        float pitchCos = -Dr.b(-pitch * b);
        float pitchSin = Dr.a(-pitch * b);
        pw result = new pw(yawSin * pitchCos, pitchSin, yawCos * pitchCos);
        if (Entity.b__ArrayString() != null) {
            n5.b(++marker);
        }
        return result;
    }

    private static Oo a(Oo value) { return value; }
    public float a(pw value) { return this.p * value.p + this.q * value.q + this.r * value.r; }

    public static pw a(DT position) {
        return new pw(((DS) position).a() + 0.5F,
                ((DS) position).b() + 0.5F, ((DS) position).c() + 0.5F);
    }

    public static pw a(DR value) { return a(value.a, value.b, value.c); }
    public static pw a(double x, double y, double z) { return new pw((float) x, (float) y, (float) z); }
    public pw a(float factor) { return new pw(this.p * factor, this.q * factor, this.r * factor); }
    public float a() { return Dr.c(this.b()); }
    public pw a(float x, float y, float z) { return new pw(this.p + x, this.q + y, this.r + z); }
    public pw a__pw(pw value) { return new pw(this.p + value.p, this.q + value.q, this.r + value.r); }
}
