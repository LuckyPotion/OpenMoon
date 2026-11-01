package moom;


public class n3 extends moom.n2 {

private final int[] h;

private final int i;

private final int j;

public n3(java.awt.image.BufferedImage p0) {
this(((java.awt.image.BufferedImage)(p0)).getWidth(), ((java.awt.image.BufferedImage)(p0)).getHeight());
    ((java.awt.image.BufferedImage)(p0)).getRGB(((int)(0)), ((int)(0)), ((int)(((java.awt.image.BufferedImage)(p0)).getWidth())), ((int)(((java.awt.image.BufferedImage)(p0)).getHeight())), ((int[])(this.h)), ((int)(0)), ((int)(((java.awt.image.BufferedImage)(p0)).getWidth())));
    ((moom.n3)(this)).b();
    return;
}


public n3(int p0, int p1) {
super();
    this.i = p0;
    this.j = p1;
    this.h = new int[(p0 * p1)];
    moom.ol.a((this).a(), p0, p1);
}


public void b__sourceReturn_da8c82d5d4() {
moom.ol.a(((int)(((moom.n3)(this)).a())), ((int[])(this.h)), ((int)(this.i)), ((int)(this.j)));
    return;
}


public int[] a__sourceReturn_d4d28024c9() {
return this.h;
}


public void a(moom.oR p0) throws java.io.IOException {
return;
}

}
