package com.moon.scripting.api.types;


public class RayCastResult {

public com.moon.scripting.api.enums.HitType hit_type;

public com.moon.scripting.api.enums.Facing side_hit;

public com.moon.scripting.api.types.Vec3i pos;

public com.moon.scripting.api.types.Vec3d hit_vec;

public int hit_entity_id;

public RayCastResult(com.moon.scripting.api.enums.HitType p0, com.moon.scripting.api.enums.Facing p1, com.moon.scripting.api.types.Vec3i p2, com.moon.scripting.api.types.Vec3d p3, int p4) {
super();
    this.hit_type = p0;
    this.side_hit = p1;
    this.pos = p2;
    this.hit_vec = p3;
    this.hit_entity_id = p4;
}


public RayCastResult() {
super();
}


public java.lang.String toString() {
return __sourceIntrinsic_a86c261fcdee_originalDynamicSite635_5(this.hit_type, this.side_hit, this.pos, this.hit_vec, this.hit_entity_id);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite635_5(com.moon.scripting.api.enums.HitType a0, com.moon.scripting.api.enums.Facing a1, com.moon.scripting.api.types.Vec3i a2, com.moon.scripting.api.types.Vec3d a3, int a4) throws E;
}
