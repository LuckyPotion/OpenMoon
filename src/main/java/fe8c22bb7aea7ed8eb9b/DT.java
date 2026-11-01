/*
 * Decompiled with CFR 0.152.
 */
package moom;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import moom.CC;
import moom.CD;
import moom.DR;
import moom.DS;
import moom.DU;
import moom.Dr;
import moom.Oo;
import moom._c;
import moom.bs;
import net.minecraft.entity.Entity;

public class DT
extends DS {
    public static DT f;
    private static int g;
    private static int h;
    private static int i;
    private static int j;
    private static int k;
    private static long l;
    private static long m;
    private static long n;
    private static Entity[] o;
    private static long v;
    private static long[] B;
    private static Integer[] C;
    private static Map D;

    public DT(DS dS) {
        this(dS.a(), dS.b(), dS.c());
    }

    public DT(DR dR) {
        this(dR.a, dR.b, dR.c);
    }

    public DT(Entity entity) {
        this(entity.n, entity.o, entity.p);
    }

    public DT(double d, double d2, double d3) {
        super(d, d2, d3);
    }

    public DT(int n, int n2, int n4) {
        super(n, n2, n4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void __sourceInitializeParent() throws Exception {
        v = _c.a(4124273977955267742L, -8252137170816537947L, MethodHandles.lookup().lookupClass()).a(90250888843858L);
        long l = v ^ 0x714EDEC2BB05L;
        Entity[] __moonInitEntities = new Entity[1];
        D = new HashMap(13);
        DT.b(__moonInitEntities);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "N\u0017\u0014\u0097%\u00db\u0097\t\u00af\u00e6\u0088\u00aa\nh\u00b5\u00f1\u00d5X\u0011T\u00c1\u00aci\u00c2";
        int n2 = "N\u0017\u0014\u0097%\u00db\u0097\t\u00af\u00e6\u0088\u00aa\nh\u00b5\u00f1\u00d5X\u0011T\u00c1\u00aci\u00c2".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n6 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n6] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n2);
        B = lArray;
        C = new Integer[3];
        f = new DT(0, 0, 0);
        g = 1 + Dr.d(Dr.b((int)DT.__sourceIntrinsicParent_moonIndySource1000( (int)20034, (long)(0x69566B8059C200CEL ^ l))));
        h = g;
        i = (int)(DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4A336793280DL ^ l)) - g - h);
        j = h;
        k = j + i;
        DT.l = (1L << g) - 1L;
        m = (1L << i) - 1L;
        DT.n = (1L << h) - 1L;
    }

    public DT b(int n) {
        return this.a(bs.DOWN, n);
    }

    public static Iterable<DU> b(DT dT, DT dT2) {
        DT dT3 = new DT(Math.min(dT.a(), dT2.a()), Math.min(dT.b(), dT2.b()), Math.min(dT.c(), dT2.c()));
        DT dT4 = new DT(Math.max(dT.a(), dT2.a()), Math.max(dT.b(), dT2.b()), Math.max(dT.c(), dT2.c()));
        return new CD(dT3, dT4);
    }

    private static native java.lang.invoke.MethodHandle __sourceIntrinsicParent_codexBootstrapLdc5434(); // compile-time LDC macro only
    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
java.lang.invoke.MutableCallSite __moonFactorySite = new java.lang.invoke.MutableCallSite(methodType);
try { __moonFactorySite.setTarget(java.lang.invoke.MethodHandles.explicitCastArguments(java.lang.invoke.MethodHandles.insertArguments(__sourceIntrinsicParent_codexBootstrapLdc5434().asCollector(java.lang.Object[].class, methodType.parameterCount()), 0, lookup, __moonFactorySite, string), methodType));
} catch (java.lang.Exception __moonFactoryFailure) { throw new java.lang.RuntimeException(new java.lang.StringBuilder().append("moom/DT").append(" : ").append(string).append(" : ").append(methodType.toString()).toString(), __moonFactoryFailure); }
return __moonFactorySite;
}

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2F83;
        if (C[n2] == null) {
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = B[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l3);
            byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DT", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DT.C[n2] = n4;
        }
        return C[n2];
    }

    private static Oo b(Oo oo) {
        return oo;
    }

    public static void b(Entity[] entityArray) {
        o = entityArray;
    }

    public DT b__DT() {
        return this.b(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public DT b(DS dS) {
        DT dT;
        block5: {
            int n;
            block6: {
                boolean bl;
                block4: {
                    long l = v ^ 0x3A4E057C4CE7L;
                    bl = DS.c__Boolean();
                    n = dS.a();
                    if (!bl) break block4;
                    if (n != 0) break block5;
                    n = dS.b();
                }
                if (!bl) break block6;
                if (n != 0) break block5;
                n = dS.c();
            }
            if (n == 0) {
                dT = this;
                return dT;
            }
        }
        dT = new DT(this.a() - dS.a(), this.b() - dS.b(), this.c() - dS.c());
        return dT;
    }

    public DT e(int n) {
        return this.a(bs.WEST, n);
    }

    public DT e() {
        return this.e(1);
    }

    public DT c__DT() {
        return this.c(1);
    }

    public DT c(DS dS) {
        return new DT(this.b() * dS.c() - this.c() * dS.b(), this.c() * dS.a() - this.a() * dS.c(), this.a() * dS.b() - this.b() * dS.a());
    }

    public DT c(int n) {
        return this.a(bs.NORTH, n);
    }

    public DT f() {
        return this.f(1);
    }

    public DT f(int n) {
        return this.a(bs.EAST, n);
    }

    public DT d__DT() {
        return this.d(1);
    }

    public DT d(int n) {
        return this.a(bs.SOUTH, n);
    }

    public DT a__DT() {
        return this.a(1);
    }

    public long a__Long() {
        return ((long)this.a() & l) << k | ((long)this.b() & m) << j | (long)this.c() & n;
    }

    public static Entity[] a__Arrayr3() {
        return o;
    }

    /*
     * Enabled aggressive block sorting
     */
    public DT a__DT(DS dS) {
        DT dT;
        block5: {
            int n;
            block6: {
                boolean bl;
                block4: {
                    long l = v ^ 0x48262348FEDL;
                    bl = DS.b__Boolean();
                    n = dS.a();
                    if (bl) break block4;
                    if (n != 0) break block5;
                    n = dS.b();
                }
                if (bl) break block6;
                if (n != 0) break block5;
                n = dS.c();
            }
            if (n == 0) {
                dT = this;
                return dT;
            }
        }
        dT = new DT(this.a() + dS.a(), this.b() + dS.b(), this.c() + dS.c());
        return dT;
    }

    /*
     * Enabled aggressive block sorting
     */
    public DT a(int n, int n2, int n4) {
        DT dT;
        block5: {
            int n6;
            block6: {
                boolean bl;
                block4: {
                    long l = v ^ 0x5887A7435E0FL;
                    bl = DS.b__Boolean();
                    n6 = n;
                    if (bl) break block4;
                    if (n6 != 0) break block5;
                    n6 = n2;
                }
                if (bl) break block6;
                if (n6 != 0) break block5;
                n6 = n4;
            }
            if (n6 == 0) {
                dT = this;
                return dT;
            }
        }
        dT = new DT(this.a() + n, this.b() + n2, this.c() + n4);
        return dT;
    }

    /*
     * Enabled aggressive block sorting
     */
    public DT a__DT(double d, double d2, double d3) {
 long l = v ^ 0xA473AE36EAL;
 boolean bl = DS.c__Boolean();
 boolean different = d != 0.0;
 if (bl) { if (different) return new DT((double)this.a() + d, (double)this.b() + d2, (double)this.c() + d3); different = d2 != 0.0; }
 if (bl) { if (different) return new DT((double)this.a() + d, (double)this.b() + d2, (double)this.c() + d3); different = d3 != 0.0; }
 if (!different) return this;
 return new DT((double)this.a() + d, (double)this.b() + d2, (double)this.c() + d3);
}

    public DT a(bs bs2) {
        return this.a(bs2, 1);
    }

    public DT a(bs bs2, int n) {
        long l = v ^ 0x401B8C93C06BL;
        return n == 0 ? this : new DT(this.a() + bs2.c() * n, this.b() + bs2.d() * n, this.c() + bs2.e() * n);
    }

    public static DT a(long l) {
        long l2 = v ^ 0x7CE477CE4191L;
        int n = (int)(l << DT.__sourceIntrinsicParent_moonIndySource1001( (int)23070, (long)(0x22287ABF2DA4EE05L ^ l2)) - k - g >> DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4799CE9FD299L ^ l2)) - g);
        int n2 = (int)(l << DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4799CE9FD299L ^ l2)) - j - i >> DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4799CE9FD299L ^ l2)) - i);
        int n4 = (int)(l << DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4799CE9FD299L ^ l2)) - h >> DT.__sourceIntrinsicParent_moonIndySourceWideGroup0064( (int)26240, (long)(0x29BA4799CE9FD299L ^ l2)) - h);
        return new DT(n, n2, n4);
    }

    public static Iterable<DT> a(DT dT, DT dT2) {
        DT dT3 = new DT(Math.min(dT.a(), dT2.a()), Math.min(dT.b(), dT2.b()), Math.min(dT.c(), dT2.c()));
        DT dT4 = new DT(Math.max(dT.a(), dT2.a()), Math.max(dT.b(), dT2.b()), Math.max(dT.c(), dT2.c()));
        return new CC(dT3, dT4);
    }

    public DT a(int n) {
        return this.a(bs.UP, n);
    }

    @Override
    public /* bridge */ /* synthetic */ DS a__DS(DS dS) {
        return this.c(dS);
    }

    /*
     * Works around MethodHandle LDC.
     */
    

// Build-time indy macros; all declarations must be removed by the caller adapter.
    private static native int __sourceIntrinsicParent_moonIndySource1000(int index, long key);
    private static native int __sourceIntrinsicParent_moonIndySource1001(int index, long key);

// Repeated dynamic recipes; mandatory adapter removes all declarations.
    private static native int __sourceIntrinsicParent_moonIndySourceWideGroup0064(int index, long key);
}

