package moom;


public abstract class pa<T extends net.minecraft.client.resources.data.IMetadataSection> implements net.minecraft.client.resources.data.IMetadataSectionSerializer<T> {

private static int b;

public pa() {
super();
}


static {
if ((moom.pa.c() == 0)) {
        moom.pa.b(((int)(105)));
    }
}


public static int b() {
return moom.pa.b;
}


public static void b(int p0) {
b = ((int)(p0));
    return;
}


public static int c() {
int local0 = moom.pa.b();
    if ((local0 == 0)) {
        return 114;
    }
    return 0;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
