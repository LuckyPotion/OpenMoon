package moom;


public abstract class Ir {

protected java.util.LinkedList<moom.G4> a;

protected moom.G2 b;

private int c;

private int d;

private static final long h;

private static final long i;

public Ir() {
super();
    this.a = new java.util.LinkedList();
}


public Ir(int p0, int p1) {
super();
    this.a = new java.util.LinkedList();
    this.c = p0;
    this.d = p1;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(663189069907951028L)), ((long)(6556695200798384996L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(205006470499646L)))));
    long local0_life6 = (moom.Ir.h ^ 35655717040169L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill582_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill582_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill582_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill582_13 = new byte[8];
    (__sourceSpill582_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill582_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation582_15 = __sourceSpill582_13;
    ((javax.crypto.Cipher)(__sourceSpill582_10)).init(((int)(__sourceSpill582_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill582_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation582_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -2053665617218667769L;
    byte[] __sourceSpill582_19 = new byte[8];
    (__sourceSpill582_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill582_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill582_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill582_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill582_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill582_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill582_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill582_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill582_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill582_20)).doFinal(((byte[])(__sourceSpill582_19)));
    i = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int b() {
return this.d;
}


public void b(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


protected void a(net.minecraft.world.World p0, java.util.Random p1, int p2, int p3) {
int lexicalValue799_32_0;
    net.minecraft.entity.Entity[] spill799_0;
    int spill799_1;
    long life5_3;
    int life8_14;
    net.minecraft.entity.Entity[] life7_15;
    int life9_17;
    int life9_31;
    int life10_44;
    java.util.Iterator life11_54;
    moom.G4 life12_61;
    lexical_join_63: {
    lexical_join_33: {
    lexical_join_32: {
    lexical_join_31: {
    life5_3 = (moom.Ir.h ^ 93395754411046L);
    spill799_0 = moom.G4.b();
    life8_14 = (((p3 - p2) + 1) - ((moom.G2)(this.b)).b());
    life7_15 = spill799_0;
    life9_17 = 1;
    spill799_1 = life8_14;
    if (!((life7_15 != null))) {
        lexicalValue799_32_0 = spill799_1;
        break lexical_join_32;
    }
    if (!((spill799_1 > 1))) {
        break lexical_join_31;
    }
    life9_31 = (p2 + ((java.util.Random)(p1)).nextInt(((int)(life8_14))));
    if (!((life7_15 == null))) {
        break lexical_join_33;
    }
    }
    lexicalValue799_32_0 = p2;
    }
    life9_31 = lexicalValue799_32_0;
    }
    life10_44 = (life9_31 - ((moom.G2)(this.b)).b);
    ((moom.G2)(this.b)).a(((int)(0)), ((int)(life10_44)), ((int)(0)));
    life11_54 = ((java.util.LinkedList)(this.a)).iterator();
    lexical_cycle_49: while (true) {
    if (!(((java.util.Iterator)(life11_54)).hasNext())) {
        break lexical_join_63;
    }
    life12_61 = ((moom.G4)(((java.util.Iterator)(life11_54)).next()));
    ((moom.G4)(life12_61)).a(((int)(0)), ((int)(life10_44)), ((int)(0)));
    if (!((life7_15 == null))) { continue lexical_cycle_49; }
    break lexical_cycle_49;
    }
    }
    return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public boolean a__Boolean(moom.Ee p0) {
return ((1) != 0);
}


public void a(moom.Ee p0) {
return;
}


public int a() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


protected void a__Void() {
net.minecraft.entity.Entity[] spill801_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_8;
    java.util.Iterator life4_12;
    moom.G4 life5_19;
    lexical_join_27: {
    life1_3 = (moom.Ir.h ^ 101588893427507L);
    spill801_0 = moom.G4.b();
    this.b = ((moom.G2)(moom.G2.a__G2()));
    life3_8 = spill801_0;
    life4_12 = ((java.util.LinkedList)(this.a)).iterator();
    lexical_cycle_13: while (true) {
    if (!(((java.util.Iterator)(life4_12)).hasNext())) {
        break lexical_join_27;
    }
    life5_19 = ((moom.G4)(((java.util.Iterator)(life4_12)).next()));
    ((moom.G2)(this.b)).a(((moom.G2)(((moom.G4)(life5_19)).a__G2())));
    if (!((life3_8 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
((java.util.LinkedList)(this.a)).removeIf(((java.util.function.Predicate)(__sourceIntrinsic_e92bb1c78a77_originalDynamicSite1171_1(p2, p0, p1))));
    return;
}


public java.util.LinkedList<moom.G4> a__LinkedList() {
return this.a;
}


public moom.G2 a__G2() {
return this.b;
}


public void a(net.minecraft.world.World p0, net.minecraft.nbt.NBTTagCompound p1) {
net.minecraft.nbt.NBTTagCompound lexicalValue800_32_0;
    java.lang.String lexicalValue800_32_1;
    net.minecraft.entity.Entity[] spill800_0;
    net.minecraft.nbt.NBTTagCompound spill800_1;
    java.lang.String spill800_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_10;
    net.minecraft.nbt.NBTTagList life6_41;
    int life7_43;
    lexical_join_59: {
    lexical_join_56: {
    lexical_join_32: {
    lexical_join_30: {
    life3_3 = (moom.Ir.h ^ 101826953385547L);
    spill800_0 = moom.G4.b();
    this.c = ((int)(((net.minecraft.nbt.NBTTagCompound)(p1)).a__Int(((java.lang.String)("ChunkX")))));
    life5_10 = spill800_0;
    this.d = ((int)(((net.minecraft.nbt.NBTTagCompound)(p1)).a__Int(((java.lang.String)("ChunkZ")))));
    spill800_1 = p1;
    spill800_2 = "BB";
    if (!((life5_10 != null))) {
        lexicalValue800_32_0 = spill800_1;
        lexicalValue800_32_1 = spill800_2;
        break lexical_join_32;
    }
    if (!(((net.minecraft.nbt.NBTTagCompound)(spill800_1)).a__Boolean(((java.lang.String)(spill800_2))))) {
        break lexical_join_30;
    }
    this.b = ((moom.G2)(new moom.G2(((net.minecraft.nbt.NBTTagCompound)(p1)).a__ArrayInt(((java.lang.String)("BB"))))));
    }
    lexicalValue800_32_0 = p1;
    lexicalValue800_32_1 = "Children";
    }
    life6_41 = ((net.minecraft.nbt.NBTTagCompound)(lexicalValue800_32_0)).a(((java.lang.String)(lexicalValue800_32_1)), ((int)(((int) moom.Ir.i))));
    life7_43 = 0;
    lexical_cycle_38: while (true) {
    if (!((life7_43 < ((net.minecraft.nbt.NBTTagList)(life6_41)).a__Int()))) {
        break lexical_join_56;
    }
    ((java.util.LinkedList)(this.a)).add(((java.lang.Object)(moom.G1.a(((net.minecraft.nbt.NBTTagCompound)(((net.minecraft.nbt.NBTTagList)(life6_41)).a__yw(((int)(life7_43))))), ((net.minecraft.world.World)(p0))))));
    life7_43 += 1;
    if (!((life5_10 != null))) {
        break lexical_join_59;
    }
    if (!((life5_10 == null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    this.b(((net.minecraft.nbt.NBTTagCompound)(p1)));
    }
    return;
}


protected void a(net.minecraft.world.World p0, java.util.Random p1, int p2) {
int lexicalValue798_34_0;
    int lexicalValue798_34_1;
    net.minecraft.entity.Entity[] spill798_0;
    int spill798_1;
    int spill798_2;
    long life4_3;
    int life7_9;
    int life8_15;
    net.minecraft.entity.Entity[] life6_16;
    int life9_38;
    java.util.Iterator life10_48;
    moom.G4 life11_55;
    lexical_join_60: {
    lexical_join_34: {
    lexical_join_30: {
    life4_3 = (moom.Ir.h ^ 114658485190746L);
    spill798_0 = moom.G4.b();
    life7_9 = (((net.minecraft.world.World)(p0)).c() - p2);
    life8_15 = (((moom.G2)(this.b)).b() + 1);
    life6_16 = spill798_0;
    spill798_1 = life8_15;
    spill798_2 = life7_9;
    if (!((life6_16 != null))) {
        lexicalValue798_34_0 = spill798_1;
        lexicalValue798_34_1 = spill798_2;
        break lexical_join_34;
    }
    if (!((spill798_1 < spill798_2))) {
        break lexical_join_30;
    }
    life8_15 = (life8_15 + ((java.util.Random)(p1)).nextInt(((int)((life7_9 - life8_15)))));
    }
    lexicalValue798_34_0 = life8_15;
    lexicalValue798_34_1 = ((moom.G2)(this.b)).e;
    }
    life9_38 = (lexicalValue798_34_0 - lexicalValue798_34_1);
    ((moom.G2)(this.b)).a(((int)(0)), ((int)(life9_38)), ((int)(0)));
    life10_48 = ((java.util.LinkedList)(this.a)).iterator();
    lexical_cycle_46: while (true) {
    if (!(((java.util.Iterator)(life10_48)).hasNext())) {
        break lexical_join_60;
    }
    life11_55 = ((moom.G4)(((java.util.Iterator)(life10_48)).next()));
    ((moom.G4)(life11_55)).a(((int)(0)), ((int)(life9_38)), ((int)(0)));
    if (!((life6_16 == null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    return;
}


public void a(net.minecraft.nbt.NBTTagCompound p0) {
return;
}


public net.minecraft.nbt.NBTTagCompound a(int p0, int p1) {
net.minecraft.entity.Entity[] spill797_0;
    long life3_3;
    net.minecraft.nbt.NBTTagCompound life6_7;
    net.minecraft.nbt.NBTTagList life7_31;
    net.minecraft.entity.Entity[] life5_32;
    java.util.Iterator life8_36;
    moom.G4 life9_43;
    lexical_join_59: {
    lexical_join_52: {
    life3_3 = (moom.Ir.h ^ 20003760961015L);
    life6_7 = new net.minecraft.nbt.NBTTagCompound();
    ((net.minecraft.nbt.NBTTagCompound)(life6_7)).a(((java.lang.String)("id")), ((java.lang.String)(moom.G1.a(((moom.Ir)(this))))));
    ((net.minecraft.nbt.NBTTagCompound)(life6_7)).a__Void(((java.lang.String)("ChunkX")), ((int)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(life6_7)).a__Void(((java.lang.String)("ChunkZ")), ((int)(p1)));
    ((net.minecraft.nbt.NBTTagCompound)(life6_7)).a(((java.lang.String)("BB")), ((net.minecraft.nbt.NBTBase)(((moom.G2)(this.b)).a__yy())));
    spill797_0 = moom.G4.b();
    life7_31 = new net.minecraft.nbt.NBTTagList();
    life5_32 = spill797_0;
    life8_36 = ((java.util.LinkedList)(this.a)).iterator();
    lexical_cycle_37: while (true) {
    if (!(((java.util.Iterator)(life8_36)).hasNext())) {
        break lexical_join_52;
    }
    life9_43 = ((moom.G4)(((java.util.Iterator)(life8_36)).next()));
    ((net.minecraft.nbt.NBTTagList)(life7_31)).a(((net.minecraft.nbt.NBTBase)(((moom.G4)(life9_43)).a__yw())));
    if (!((life5_32 != null))) {
        break lexical_join_59;
    }
    if (!((life5_32 == null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    ((net.minecraft.nbt.NBTTagCompound)(life6_7)).a(((java.lang.String)("Children")), ((net.minecraft.nbt.NBTBase)(life7_31)));
    this.a(((net.minecraft.nbt.NBTTagCompound)(life6_7)));
    }
    return life6_7;
}


private static boolean lambda$generateStructure$0(moom.G2 p0, net.minecraft.world.World p1, java.util.Random p2, moom.G4 p3) {
int forwardValue2219_18_0;
    int forwardValue2219_22_0;
    int forwardValue2219_24_0;
    boolean spill2219_0;
    long life4_3;
    net.minecraft.entity.Entity[] life6_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life4_3 = (moom.Ir.h ^ 120302210591716L);
    life6_5 = moom.G4.b();
    spill2219_0 = ((moom.G2)(((moom.G4)(p3)).a__G2())).a__Boolean(((moom.G2)(p0)));
    if (!((life6_5 != null))) {
        forwardValue2219_18_0 = ((spill2219_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill2219_0)) {
        break forward_join_23;
    }
    forwardValue2219_18_0 = ((((moom.G4)(p3)).a__Boolean(((net.minecraft.world.World)(p1)), ((java.util.Random)(p2)), ((moom.G2)(p0)))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue2219_22_0 = forwardValue2219_18_0;
        break forward_join_22;
    }
    if (!((forwardValue2219_18_0 == 0))) {
        break forward_join_23;
    }
    forwardValue2219_22_0 = 1;
    }
    forwardValue2219_24_0 = forwardValue2219_22_0;
    break forward_join_24;
    }
    forwardValue2219_24_0 = 0;
    }
    return ((forwardValue2219_24_0) != 0);
}


private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_e92bb1c78a77_originalDynamicSite1171_1(moom.G2 a0, net.minecraft.world.World a1, java.util.Random a2) throws E;
}
