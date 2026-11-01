package net.minecraft.client.renderer.block.model;


class ItemModelGenerator$SpanFacing extends sourcebuild.EnumConstructor<net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing> {

public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing UP;

public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing DOWN;

public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing LEFT;

public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing RIGHT;

private moom.bs a;

private int b;

private int c;

private static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[] d;

private ItemModelGenerator$SpanFacing(java.lang.String p0, int p1, moom.bs p2, int p3, int p4) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
    this.c = p4;
}


private static void initialize() {
UP = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(new net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing("UP", 0, moom.bs.UP, 0, -1)));
    DOWN = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(new net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing("DOWN", 1, moom.bs.DOWN, 0, 1)));
    LEFT = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(new net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing("LEFT", 2, moom.bs.EAST, -1, 0)));
    RIGHT = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(new net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing("RIGHT", 3, moom.bs.WEST, 1, 0)));
    d = ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[])(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.a__ArrayaG()));
}


public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[] values() {
return ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[])(((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[])(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.d)).clone()));
}


public static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing valueOf(java.lang.String p0) {
return ((net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.class)), ((java.lang.String)(p0)))));
}


public int b() {
return this.c;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public moom.bs a__bs() {
return this.a;
}


private static net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[] a__ArrayaG() {
return new net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing[] {net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.UP, net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.DOWN, net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.LEFT, net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.RIGHT};
}


private boolean a__Boolean() {
int forwardValue4822_9_0;
    forward_join_9: {
    forward_join_8: {
    forward_join_6: {
    if (!((this != net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.DOWN))) {
        break forward_join_6;
    }
    if (!((this == net.minecraft.client.renderer.block.model.ItemModelGenerator$SpanFacing.UP))) {
        break forward_join_8;
    }
    }
    forwardValue4822_9_0 = 1;
    break forward_join_9;
    }
    forwardValue4822_9_0 = 0;
    }
    return ((forwardValue4822_9_0) != 0);
}


public int a() {
return this.b;
}

}
