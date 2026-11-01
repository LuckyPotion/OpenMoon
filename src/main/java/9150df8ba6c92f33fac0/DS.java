/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package moom;

import com.google.common.base.MoreObjects;
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
import moom.Dr;
import moom.Oo;
import moom._c;

public class DS
implements Comparable<DS> {
    public static DS a;
    private final int b;
    private final int c;
    private final int d;
    private static boolean e;
    private static long w;
    private static long[] y;
    private static Integer[] z;
    private static Map A;

    public DS(int n, int n2, int n4) {
        this.b = n;
        this.c = n2;
        this.d = n4;
    }

    public DS(double d, double d2, double d3) {
        this(Dr.b__Int(d), Dr.b__Int(d2), Dr.b__Int(d3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void __sourceInitializeParent() throws Exception {
        w = _c.a(-4272646596646989287L, 6952608637501273848L, MethodHandles.lookup().lookupClass()).a(23529599674900L);
        A = new HashMap(13);
        long l = w ^ 0x6636491DEBCEL;
        DS.b(false);
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00a9\u008d^!\u00ca\u00a6\u001aw4q\\6\u00b6\u0018\u0003w";
        int n2 = "\u00a9\u008d^!\u00ca\u00a6\u001aw4q\\6\u00b6\u0018\u0003w".length();
        int n4 = 0;
        do {
            byte[] byArray3 = string.substring(n4, n4 += 8).getBytes("ISO-8859-1");
            int n6 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n6] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n4 < n2);
        y = lArray;
        z = new Integer[2];
        a = new DS(0, 0, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        long l = w ^ 0x5ACFE3693536L;
        boolean bl = DS.c__Boolean();
        Object object2 = this;
        if (bl) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl2 = object2 instanceof DS;
        if (!bl) return bl2;
        if (!bl2) return false;
        DS dS = (DS)object;
        if (!bl) {
            return false;
        }
        int n = this.a();
        int n2 = dS.a();
        if (bl) {
            if (n != n2) return 0 != 0;
            n = this.b();
            n2 = dS.b();
        }
        if (bl) {
            if (n != n2) return 0 != 0;
            n = this.c();
            if (!bl) return n != 0;
            n2 = dS.c();
        }
        if (n != n2) return 0 != 0;
        return 1 != 0;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("x", this.a()).add("y", this.b()).add("z", this.c()).toString();
    }

    public int hashCode() {
        long l = w ^ 0x3E60D104362FL;
        return (this.b() + this.c() * DS.__sourceIntrinsicParent_moonIndySource1000( (int)17846, (long)(0xCCBEA3329EB55D4L ^ l))) * DS.__sourceIntrinsicParent_moonIndySource1001( (int)8443, (long)(0x2BEB5EE3E7033098L ^ l)) + this.a();
    }

    

    public double b(double d, double d2, double d3) {
        double d4 = (double)this.a() + 0.5 - d;
        double d5 = (double)this.b() + 0.5 - d2;
        double d6 = (double)this.c() + 0.5 - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public static void b(boolean bl) {
        e = bl;
    }

    public int b() {
        return this.c;
    }

    public static boolean b__Boolean() {
        return e;
    }

    public int c() {
        return this.d;
    }

    public static boolean c__Boolean() {
        boolean bl = DS.b__Boolean();
        return !bl;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD44;
        if (z[n2] == null) {
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A.get(l3);
            byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
                    objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
                    objectArray[1] = SecretKeyFactory.getInstance("DES");
                    objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/DS", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            DS.z[n2] = n4;
        }
        return z[n2];
    }

    private static native java.lang.invoke.MethodHandle __sourceIntrinsicParent_codexBootstrapLdc5433(); // compile-time LDC macro only
    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
java.lang.invoke.MutableCallSite __moonFactorySite = new java.lang.invoke.MutableCallSite(methodType);
try { __moonFactorySite.setTarget(java.lang.invoke.MethodHandles.explicitCastArguments(java.lang.invoke.MethodHandles.insertArguments(__sourceIntrinsicParent_codexBootstrapLdc5433().asCollector(java.lang.Object[].class, methodType.parameterCount()), 0, lookup, __moonFactorySite, string), methodType));
} catch (java.lang.Exception __moonFactoryFailure) { throw new java.lang.RuntimeException(new java.lang.StringBuilder().append("moom/DS").append(" : ").append(string).append(" : ").append(methodType.toString()).toString(), __moonFactoryFailure); }
return __moonFactorySite;
}

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = DS.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static Oo a(Oo oo) {
        return oo;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int compareTo(DS dS) {
        int n;
        long l = w ^ 0x1D85354D94B4L;
        boolean bl = DS.b__Boolean();
        int n2 = this.b();
        int n4 = dS.b();
        if (!bl) {
            if (n2 == n4) {
                int n6 = this.c();
                int n7 = dS.c();
                if (!bl) {
                    if (n6 == n7) {
                        n = this.a() - dS.a();
                        return n;
                    }
                    n6 = this.c();
                    n7 = dS.c();
                }
                n = n6 - n7;
                return n;
            }
            n2 = this.b();
            n4 = dS.b();
        }
        n = n2 - n4;
        return n;
    }

    public int a() {
        return this.b;
    }

    public DS a__DS(DS dS) {
        return new DS(this.b() * dS.c() - this.c() * dS.b(), this.c() * dS.a() - this.a() * dS.c(), this.a() * dS.b() - this.b() * dS.a());
    }

    public double a(double d, double d2, double d3) {
        double d4 = (double)this.a() - d;
        double d5 = (double)this.b() - d2;
        double d6 = (double)this.c() - d3;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double a(DS dS) {
        return this.a(dS.a(), dS.b(), dS.c());
    }

    /*
     * Works around MethodHandle LDC.
     */
    

// Build-time indy macros; all declarations must be removed by the caller adapter.
    private static native int __sourceIntrinsicParent_moonIndySource1000(int index, long key);
    private static native int __sourceIntrinsicParent_moonIndySource1001(int index, long key);
}

