/*
 * Decompiled with CFR 0.152.
 */
package moom;

import java.util.concurrent.ConcurrentHashMap;
import moom._a;
import moom._c;

public class _b
implements _a {
    private static boolean e;
    private static _b a;
    private ConcurrentHashMap b = new ConcurrentHashMap();
    private _a c;
    private int[] g;
    private long f;

    public _b() {
        this.b0();
        this.b1();
        int[] nArray = this.g = new int[64];
        this.g[0] = -4;
        nArray[1] = -30;
        nArray[2] = -13;
        nArray[3] = -54;
        nArray[4] = 4;
        nArray[5] = -34;
        nArray[6] = -27;
        nArray[7] = -56;
        nArray[8] = -24;
        nArray[9] = -49;
        nArray[10] = -41;
        nArray[11] = -26;
        nArray[12] = -44;
        nArray[13] = -9;
        nArray[14] = -48;
        nArray[15] = 13;
        nArray[16] = -2;
        nArray[17] = -37;
        nArray[18] = 2;
        nArray[19] = -31;
        nArray[20] = -22;
        nArray[21] = -24;
        nArray[22] = 9;
        nArray[23] = -37;
        nArray[24] = -20;
        nArray[25] = -3;
        nArray[26] = -4;
        nArray[27] = -14;
        nArray[28] = 3;
        nArray[29] = -11;
        nArray[30] = 4;
        nArray[31] = 30;
        nArray[32] = 24;
        nArray[33] = 27;
        nArray[34] = -25;
        nArray[35] = -12;
        nArray[36] = -13;
        nArray[37] = 26;
        nArray[38] = -23;
        nArray[39] = 34;
        nArray[40] = 11;
        nArray[41] = 14;
        nArray[42] = 22;
        nArray[43] = -10;
        nArray[44] = 20;
        nArray[45] = 24;
        nArray[46] = -6;
        nArray[47] = 12;
        nArray[48] = -7;
        nArray[49] = 13;
        nArray[50] = 31;
        nArray[51] = 41;
        nArray[52] = 6;
        nArray[53] = 10;
        nArray[54] = 37;
        nArray[55] = 7;
        nArray[56] = 44;
        nArray[57] = 54;
        nArray[58] = 49;
        nArray[59] = 25;
        nArray[60] = 37;
        nArray[61] = 23;
        nArray[62] = 48;
        nArray[63] = 56;
        _c.a(this);
    }

    static {
        a = new _b();
    }

    /*
     * Opcode count of 19345 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void b1() {
        java.util.concurrent.ConcurrentHashMap map = this.b;
        KeyRuntimeTables_b1_000.run(map, this);
        KeyRuntimeTables_b1_001.run(map, this);
        KeyRuntimeTables_b1_002.run(map, this);
        KeyRuntimeTables_b1_003.run(map, this);
        KeyRuntimeTables_b1_004.run(map, this);
        KeyRuntimeTables_b1_005.run(map, this);
        KeyRuntimeTables_b1_006.run(map, this);
        KeyRuntimeTables_b1_007.run(map, this);
        KeyRuntimeTables_b1_008.run(map, this);
        KeyRuntimeTables_b1_009.run(map, this);
        KeyRuntimeTables_b1_010.run(map, this);
        KeyRuntimeTables_b1_011.run(map, this);
        KeyRuntimeTables_b1_012.run(map, this);
        KeyRuntimeTables_b1_013.run(map, this);
        KeyRuntimeTables_b1_014.run(map, this);
        KeyRuntimeTables_b1_015.run(map, this);
    }

    @Override
    public void b(long l) {
        this.f = l;
    }

    @Override
    public boolean b(_a _a2) {
        if (this == _a2) {
            return true;
        }
        if (_a2 instanceof _b) {
            return System.identityHashCode(this) - System.identityHashCode(_a2) <= 0;
        }
        return false;
    }

    @Override
    public int[] b() {
        return _c.e;
    }

    private _a b(_a _a2, _a _a3) {
        _a _a4 = (_a)this.b.get(_a2);
        if (_a4 == null) {
            _a4 = this;
        }
        Object previous = this.b.put(_a3, _a2);
        return _a4;
    }

    void c() {
        this.d0();
        this.d1();
        this.d2();
        this.d3();
        this.d4();
        this.d5();
        this.d6();
        this.d7();
        this.d8();
        this.d9();
        this.d10();
        this.d11();
        this.d12();
    }

    void d() {
        this.c0();
        this.c1();
        _c.b(this);
    }

    @Override
    public long a(long l) {
        _a _a2 = _c.c(l);
        long l2 = _a2.a(l);
        int[] nArray = _a2.b();
        _b _b2 = this;
        System.arraycopy(this.g, 0, nArray, 0, 64);
        if (this.c != null) {
            this.c.a(l);
        }
        return l2;
    }

    static void a(boolean bl) {
        e = bl;
    }

    @Override
    public void a(_a _a2) {
        if (this != _a2) {
            if (this.c == null) {
                this.c = _a2;
            } else {
                this.c.a(_a2);
            }
        }
    }

    static _a a(_a _a2, _a _a3) {
        _a _a4 = a.b(_a2, _a3);
        return _a4;
    }

    /*
     * Opcode count of 44032 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void c0() {
        KeyRuntimeTables_c0_000.run();
        KeyRuntimeTables_c0_001.run();
        KeyRuntimeTables_c0_002.run();
        KeyRuntimeTables_c0_003.run();
        KeyRuntimeTables_c0_004.run();
        KeyRuntimeTables_c0_005.run();
        KeyRuntimeTables_c0_006.run();
        KeyRuntimeTables_c0_007.run();
        KeyRuntimeTables_c0_008.run();
        KeyRuntimeTables_c0_009.run();
        KeyRuntimeTables_c0_010.run();
        KeyRuntimeTables_c0_011.run();
        KeyRuntimeTables_c0_012.run();
        KeyRuntimeTables_c0_013.run();
        KeyRuntimeTables_c0_014.run();
        KeyRuntimeTables_c0_015.run();
        KeyRuntimeTables_c0_016.run();
        KeyRuntimeTables_c0_017.run();
        KeyRuntimeTables_c0_018.run();
        KeyRuntimeTables_c0_019.run();
        KeyRuntimeTables_c0_020.run();
        KeyRuntimeTables_c0_021.run();
        KeyRuntimeTables_c0_022.run();
        KeyRuntimeTables_c0_023.run();
        KeyRuntimeTables_c0_024.run();
        KeyRuntimeTables_c0_025.run();
        KeyRuntimeTables_c0_026.run();
        KeyRuntimeTables_c0_027.run();
        KeyRuntimeTables_c0_028.run();
    }

    /*
     * Opcode count of 17873 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void c1() {
        KeyRuntimeTables_c1_000.run();
        KeyRuntimeTables_c1_001.run();
        KeyRuntimeTables_c1_002.run();
        KeyRuntimeTables_c1_003.run();
        KeyRuntimeTables_c1_004.run();
        KeyRuntimeTables_c1_005.run();
        KeyRuntimeTables_c1_006.run();
        KeyRuntimeTables_c1_007.run();
        KeyRuntimeTables_c1_008.run();
        KeyRuntimeTables_c1_009.run();
        KeyRuntimeTables_c1_010.run();
        KeyRuntimeTables_c1_011.run();
    }

    /*
     * Opcode count of 18586 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d1() {
        KeyRuntimeTables_d1_000.run();
        KeyRuntimeTables_d1_001.run();
        KeyRuntimeTables_d1_002.run();
        KeyRuntimeTables_d1_003.run();
        KeyRuntimeTables_d1_004.run();
        KeyRuntimeTables_d1_005.run();
        KeyRuntimeTables_d1_006.run();
        KeyRuntimeTables_d1_007.run();
        KeyRuntimeTables_d1_008.run();
        KeyRuntimeTables_d1_009.run();
        KeyRuntimeTables_d1_010.run();
        KeyRuntimeTables_d1_011.run();
        KeyRuntimeTables_d1_012.run();
        KeyRuntimeTables_d1_013.run();
        KeyRuntimeTables_d1_014.run();
        KeyRuntimeTables_d1_015.run();
        KeyRuntimeTables_d1_016.run();
        KeyRuntimeTables_d1_017.run();
        KeyRuntimeTables_d1_018.run();
        KeyRuntimeTables_d1_019.run();
        KeyRuntimeTables_d1_020.run();
        KeyRuntimeTables_d1_021.run();
        KeyRuntimeTables_d1_022.run();
        KeyRuntimeTables_d1_023.run();
        KeyRuntimeTables_d1_024.run();
        KeyRuntimeTables_d1_025.run();
    }

    /*
     * Opcode count of 33171 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d2() {
        KeyRuntimeTables_d2_000.run();
        KeyRuntimeTables_d2_001.run();
        KeyRuntimeTables_d2_002.run();
        KeyRuntimeTables_d2_003.run();
        KeyRuntimeTables_d2_004.run();
        KeyRuntimeTables_d2_005.run();
        KeyRuntimeTables_d2_006.run();
        KeyRuntimeTables_d2_007.run();
        KeyRuntimeTables_d2_008.run();
    }

    /*
     * Opcode count of 26785 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void b0() {
        java.util.concurrent.ConcurrentHashMap map = this.b;
        KeyRuntimeTables_b0_000.run(map, this);
        KeyRuntimeTables_b0_001.run(map, this);
        KeyRuntimeTables_b0_002.run(map, this);
        KeyRuntimeTables_b0_003.run(map, this);
        KeyRuntimeTables_b0_004.run(map, this);
        KeyRuntimeTables_b0_005.run(map, this);
        KeyRuntimeTables_b0_006.run(map, this);
        KeyRuntimeTables_b0_007.run(map, this);
        KeyRuntimeTables_b0_008.run(map, this);
        KeyRuntimeTables_b0_009.run(map, this);
        KeyRuntimeTables_b0_010.run(map, this);
        KeyRuntimeTables_b0_011.run(map, this);
        KeyRuntimeTables_b0_012.run(map, this);
        KeyRuntimeTables_b0_013.run(map, this);
        KeyRuntimeTables_b0_014.run(map, this);
        KeyRuntimeTables_b0_015.run(map, this);
        KeyRuntimeTables_b0_016.run(map, this);
        KeyRuntimeTables_b0_017.run(map, this);
        KeyRuntimeTables_b0_018.run(map, this);
        KeyRuntimeTables_b0_019.run(map, this);
        KeyRuntimeTables_b0_020.run(map, this);
        KeyRuntimeTables_b0_021.run(map, this);
    }

    /*
     * Opcode count of 19110 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d0() {
        KeyRuntimeTables_d0_000.run();
        KeyRuntimeTables_d0_001.run();
        KeyRuntimeTables_d0_002.run();
        KeyRuntimeTables_d0_003.run();
        KeyRuntimeTables_d0_004.run();
        KeyRuntimeTables_d0_005.run();
        KeyRuntimeTables_d0_006.run();
        KeyRuntimeTables_d0_007.run();
        KeyRuntimeTables_d0_008.run();
        KeyRuntimeTables_d0_009.run();
        KeyRuntimeTables_d0_010.run();
        KeyRuntimeTables_d0_011.run();
        KeyRuntimeTables_d0_012.run();
        KeyRuntimeTables_d0_013.run();
        KeyRuntimeTables_d0_014.run();
        KeyRuntimeTables_d0_015.run();
        KeyRuntimeTables_d0_016.run();
        KeyRuntimeTables_d0_017.run();
        KeyRuntimeTables_d0_018.run();
        KeyRuntimeTables_d0_019.run();
        KeyRuntimeTables_d0_020.run();
        KeyRuntimeTables_d0_021.run();
    }

    /*
     * Opcode count of 35968 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d3() {
        KeyRuntimeTables_d3_000.run();
        KeyRuntimeTables_d3_001.run();
        KeyRuntimeTables_d3_002.run();
        KeyRuntimeTables_d3_003.run();
        KeyRuntimeTables_d3_004.run();
    }

    /*
     * Opcode count of 35983 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d4() {
        KeyRuntimeTables_d4_000.run();
        KeyRuntimeTables_d4_001.run();
        KeyRuntimeTables_d4_002.run();
        KeyRuntimeTables_d4_003.run();
        KeyRuntimeTables_d4_004.run();
    }

    /*
     * Opcode count of 36007 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d8() {
        KeyRuntimeTables_d8_000.run();
        KeyRuntimeTables_d8_001.run();
        KeyRuntimeTables_d8_002.run();
        KeyRuntimeTables_d8_003.run();
        KeyRuntimeTables_d8_004.run();
    }

    /*
     * Opcode count of 36004 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d6() {
        KeyRuntimeTables_d6_000.run();
        KeyRuntimeTables_d6_001.run();
        KeyRuntimeTables_d6_002.run();
        KeyRuntimeTables_d6_003.run();
        KeyRuntimeTables_d6_004.run();
    }

    /*
     * Opcode count of 35966 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d7() {
        KeyRuntimeTables_d7_000.run();
        KeyRuntimeTables_d7_001.run();
        KeyRuntimeTables_d7_002.run();
        KeyRuntimeTables_d7_003.run();
        KeyRuntimeTables_d7_004.run();
    }

    /*
     * Opcode count of 35964 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d5() {
        KeyRuntimeTables_d5_000.run();
        KeyRuntimeTables_d5_001.run();
        KeyRuntimeTables_d5_002.run();
        KeyRuntimeTables_d5_003.run();
        KeyRuntimeTables_d5_004.run();
    }

    /*
     * Opcode count of 35961 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d9() {
        KeyRuntimeTables_d9_000.run();
        KeyRuntimeTables_d9_001.run();
        KeyRuntimeTables_d9_002.run();
        KeyRuntimeTables_d9_003.run();
        KeyRuntimeTables_d9_004.run();
    }

    private void d12() {
        KeyRuntimeTables_d12_000.run();
    }

    /*
     * Opcode count of 35990 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d10() {
        KeyRuntimeTables_d10_000.run();
        KeyRuntimeTables_d10_001.run();
        KeyRuntimeTables_d10_002.run();
        KeyRuntimeTables_d10_003.run();
        KeyRuntimeTables_d10_004.run();
    }

    /*
     * Opcode count of 35986 triggered aggressive code reduction.  Override with --aggressivesizethreshold.
     */
    private void d11() {
        KeyRuntimeTables_d11_000.run();
        KeyRuntimeTables_d11_001.run();
        KeyRuntimeTables_d11_002.run();
        KeyRuntimeTables_d11_003.run();
        KeyRuntimeTables_d11_004.run();
    }
}

