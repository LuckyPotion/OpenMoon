package com.moon.scripting.api.types;


public class Block {

public java.lang.String name;

public java.lang.String display_name;

public boolean full_block;

public boolean translucent;

public float block_hardness;

public float relative_hardness;

public float slipperiness;

public Block(java.lang.String p0, java.lang.String p1, boolean p2, boolean p3, float p4, float p5, float p6) {
super();
    this.name = p0;
    this.display_name = p1;
    this.full_block = p2;
    this.translucent = p3;
    this.block_hardness = p4;
    this.slipperiness = p6;
    this.relative_hardness = p5;
}


public Block() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite631_7(this.name, this.display_name, this.full_block, this.translucent, this.block_hardness, this.relative_hardness, this.slipperiness);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite631_7(java.lang.String a0, java.lang.String a1, boolean a2, boolean a3, float a4, float a5, float a6) throws E;
}
