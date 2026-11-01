package moom;


public class OJ extends org.apache.logging.log4j.spi.AbstractLogger {

private static final org.tinylog.format.MessageFormatter a;

private static final org.tinylog.provider.LoggingProvider b;

private final java.lang.String c;

private static int[] d;

private static final long e;

private static final long f;

public java.lang.String getName() {
return this.c;
}


public OJ(java.lang.String p0) {
super();
    this.c = p0;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4696885252624214076L)), ((long)(-4677707143418855431L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(265054471115290L)))));
    java.lang.Object __sourceSpill744_6 = null;
    long local0_life7 = (moom.OJ.e ^ 128583241621008L);
    moom.OJ.b(((int[])(__sourceSpill744_6)));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill744_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill744_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill744_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill744_15 = new byte[8];
    (__sourceSpill744_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill744_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation744_17 = __sourceSpill744_15;
    ((javax.crypto.Cipher)(__sourceSpill744_12)).init(((int)(__sourceSpill744_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill744_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation744_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = 7252960224489940092L;
    byte[] __sourceSpill744_21 = new byte[8];
    (__sourceSpill744_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill744_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill744_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill744_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill744_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill744_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill744_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill744_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill744_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill744_22)).doFinal(((byte[])(__sourceSpill744_21)));
    f = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
    a = ((org.tinylog.format.MessageFormatter)(new org.tinylog.format.LegacyMessageFormatter()));
    b = ((org.tinylog.provider.LoggingProvider)(org.tinylog.provider.ProviderRegistry.getLoggingProvider()));
}


public static void b(int[] p0) {
moom.OJ.d = ((int[])(p0));
    return;
}


private static boolean b(org.apache.logging.log4j.Level p0) {
int forwardValue2894_16_0;
    int forwardValue2894_18_0;
    int spill2894_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (moom.OJ.e ^ 112917939415715L);
    life3_5 = moom.OJ.b();
    spill2894_0 = ((org.tinylog.Level)(((org.tinylog.provider.LoggingProvider)(moom.OJ.b)).getMinimumLevel(((java.lang.String)(null))))).ordinal();
    if (!((life3_5 == null))) {
        forwardValue2894_16_0 = spill2894_0;
        break forward_join_16;
    }
    if (!((spill2894_0 <= ((org.apache.logging.log4j.Level)(p0)).intLevel()))) {
        break forward_join_17;
    }
    forwardValue2894_16_0 = 1;
    }
    forwardValue2894_18_0 = forwardValue2894_16_0;
    break forward_join_18;
    }
    forwardValue2894_18_0 = 0;
    }
    return ((forwardValue2894_18_0) != 0);
}


public static int[] b() {
return moom.OJ.d;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static boolean a__Boolean(org.apache.logging.log4j.Level p0) {
int forwardValue2893_15_0;
    int forwardValue2893_17_0;
    int spill2893_0;
    long life1_3;
    int[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (moom.OJ.e ^ 81255087545267L);
    life3_5 = moom.OJ.b();
    spill2893_0 = ((org.tinylog.Level)(((org.tinylog.provider.LoggingProvider)(moom.OJ.b)).getMinimumLevel())).ordinal();
    if (!((life3_5 == null))) {
        forwardValue2893_15_0 = spill2893_0;
        break forward_join_15;
    }
    if (!((spill2893_0 <= ((org.apache.logging.log4j.Level)(p0)).intLevel()))) {
        break forward_join_16;
    }
    forwardValue2893_15_0 = 1;
    }
    forwardValue2893_17_0 = forwardValue2893_15_0;
    break forward_join_17;
    }
    forwardValue2893_17_0 = 0;
    }
    return ((forwardValue2893_17_0) != 0);
}


private static java.lang.String a(org.apache.logging.log4j.Marker p0) {
org.apache.logging.log4j.Marker forwardValue2891_13_0;
    java.lang.String forwardValue2891_14_0;
    org.apache.logging.log4j.Marker spill2891_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (moom.OJ.e ^ 18952455499952L);
    life3_5 = moom.OJ.b();
    spill2891_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue2891_13_0 = spill2891_0;
        break forward_join_13;
    }
    if (!((spill2891_0 == null))) {
        break forward_join_12;
    }
    forwardValue2891_14_0 = null;
    break forward_join_14;
    }
    forwardValue2891_13_0 = p0;
    }
    forwardValue2891_14_0 = ((org.apache.logging.log4j.Marker)(forwardValue2891_13_0)).getName();
    }
    return forwardValue2891_14_0;
}


private static org.tinylog.Level a(org.apache.logging.log4j.Level p0) {
org.tinylog.Level forwardValue300_25_0;
    long life1_3;
    forward_join_25: {
    forward_join_24: {
    forward_join_22: {
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    forward_join_14: {
    forward_join_10: {
    life1_3 = (moom.OJ.e ^ 133395220743208L);
    switch ((moom.Oh.a)[((org.apache.logging.log4j.spi.StandardLevel)(((org.apache.logging.log4j.Level)(p0)).getStandardLevel())).ordinal()]) {
default:
{
        break forward_join_10;
    }
case 1:
{
        break forward_join_14;
    }
case 2:
case 3:
{
        break forward_join_16;
    }
case 4:
{
        break forward_join_18;
    }
case 5:
{
        break forward_join_20;
    }
case 6:
{
        break forward_join_22;
    }
case 7:
case 8:
{
        break forward_join_24;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forwardValue300_25_0 = org.tinylog.Level.OFF;
    break forward_join_25;
    }
    forwardValue300_25_0 = org.tinylog.Level.ERROR;
    break forward_join_25;
    }
    forwardValue300_25_0 = org.tinylog.Level.WARN;
    break forward_join_25;
    }
    forwardValue300_25_0 = org.tinylog.Level.INFO;
    break forward_join_25;
    }
    forwardValue300_25_0 = org.tinylog.Level.DEBUG;
    break forward_join_25;
    }
    forwardValue300_25_0 = org.tinylog.Level.TRACE;
    }
    return forwardValue300_25_0;
}


private static org.apache.logging.log4j.Level a(org.tinylog.Level p0) {
org.apache.logging.log4j.Level forwardValue301_24_0;
    long life1_3;
    forward_join_24: {
    forward_join_23: {
    forward_join_21: {
    forward_join_19: {
    forward_join_17: {
    forward_join_15: {
    forward_join_13: {
    forward_join_9: {
    life1_3 = (moom.OJ.e ^ 4323726319927L);
    switch ((moom.Oh.b)[((org.tinylog.Level)(p0)).ordinal()]) {
default:
{
        break forward_join_9;
    }
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_15;
    }
case 3:
{
        break forward_join_17;
    }
case 4:
{
        break forward_join_19;
    }
case 5:
{
        break forward_join_21;
    }
case 6:
{
        break forward_join_23;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.TRACE;
    break forward_join_24;
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.DEBUG;
    break forward_join_24;
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.INFO;
    break forward_join_24;
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.WARN;
    break forward_join_24;
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.ERROR;
    break forward_join_24;
    }
    forwardValue301_24_0 = org.apache.logging.log4j.Level.OFF;
    }
    return forwardValue301_24_0;
}


private static boolean a(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1) {
int forwardValue2890_24_0;
    int forwardValue2890_26_0;
    int[] spill2890_0;
    int spill2890_1;
    long life2_3;
    java.lang.String life5_6;
    org.tinylog.Level life6_10;
    org.tinylog.Level life7_14;
    int[] life4_15;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.OJ.e ^ 68659400029351L);
    life5_6 = moom.OJ.a(((org.apache.logging.log4j.Marker)(p1)));
    spill2890_0 = moom.OJ.b();
    life6_10 = moom.OJ.a(((org.apache.logging.log4j.Level)(p0)));
    life7_14 = ((org.tinylog.provider.LoggingProvider)(moom.OJ.b)).getMinimumLevel(((java.lang.String)(life5_6)));
    life4_15 = spill2890_0;
    spill2890_1 = ((org.tinylog.Level)(life6_10)).ordinal();
    if (!((life4_15 == null))) {
        forwardValue2890_24_0 = spill2890_1;
        break forward_join_24;
    }
    if (!((spill2890_1 >= ((org.tinylog.Level)(life7_14)).ordinal()))) {
        break forward_join_25;
    }
    forwardValue2890_24_0 = 1;
    }
    forwardValue2890_26_0 = forwardValue2890_24_0;
    break forward_join_26;
    }
    forwardValue2890_26_0 = 0;
    }
    return ((forwardValue2890_26_0) != 0);
}


public org.apache.logging.log4j.Level getLevel() {
return moom.OJ.a(((org.tinylog.Level)(((org.tinylog.provider.LoggingProvider)(moom.OJ.b)).getMinimumLevel())));
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6, java.lang.Object p7, java.lang.Object p8, java.lang.Object p9, java.lang.Object p10, java.lang.Object p11, java.lang.Object p12) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object[] p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Throwable p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.Object p2, java.lang.Throwable p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.CharSequence p2, java.lang.Throwable p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, org.apache.logging.log4j.message.Message p2, java.lang.Throwable p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5, java.lang.Object p6) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4, java.lang.Object p5) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3, java.lang.Object p4) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public boolean isEnabled(org.apache.logging.log4j.Level p0, org.apache.logging.log4j.Marker p1, java.lang.String p2, java.lang.Object p3) {
return (__sourceIntrinsic_booleanComparison((moom.OJ.a(((org.apache.logging.log4j.Level)(p0)), ((org.apache.logging.log4j.Marker)(p1))))) != 0);
}


public void logMessage(java.lang.String p0, org.apache.logging.log4j.Level p1, org.apache.logging.log4j.Marker p2, org.apache.logging.log4j.message.Message p3, java.lang.Throwable p4) {
org.apache.logging.log4j.Marker forwardValue2895_16_0;
    java.lang.String forwardValue2895_17_0;
    int[] spill2895_0;
    org.apache.logging.log4j.Marker spill2895_1;
    long life6_3;
    java.lang.Object[] life9_7;
    int[] life8_8;
    java.lang.String life10_22;
    org.tinylog.Level life11_25;
    forward_join_37: {
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life6_3 = (moom.OJ.e ^ 110796188799063L);
    spill2895_0 = moom.OJ.b();
    life9_7 = ((org.apache.logging.log4j.message.Message)(p3)).getParameters();
    life8_8 = spill2895_0;
    spill2895_1 = p2;
    if (!((life8_8 == null))) {
        forwardValue2895_16_0 = spill2895_1;
        break forward_join_16;
    }
    if (!((spill2895_1 == null))) {
        break forward_join_15;
    }
    forwardValue2895_17_0 = null;
    break forward_join_17;
    }
    forwardValue2895_16_0 = p2;
    }
    forwardValue2895_17_0 = ((org.apache.logging.log4j.Marker)(forwardValue2895_16_0)).getName();
    }
    life10_22 = forwardValue2895_17_0;
    life11_25 = moom.OJ.a(((org.apache.logging.log4j.Level)(p1)));
    ((org.tinylog.provider.LoggingProvider)(moom.OJ.b)).log(((int)(((int) moom.OJ.f))), ((java.lang.String)(life10_22)), ((org.tinylog.Level)(life11_25)), ((java.lang.Throwable)(p4)), ((org.tinylog.format.MessageFormatter)(moom.OJ.a)), ((java.lang.Object)(((org.apache.logging.log4j.message.Message)(p3)).getFormat())), ((java.lang.Object[])(life9_7)));
    if (!((life8_8 != null))) {
        break forward_join_37;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
