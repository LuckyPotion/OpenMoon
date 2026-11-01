package moom;


class Cy implements net.minecraft.command.ICommandSender {

moom.Ct a;

Cy(moom.Ct p0) { super(); }


private static void __sourceConstructorBody_045f9c0eaec3879d(moom.Cy receiver, moom.Ct p0) throws Throwable {

((moom.Cy)(receiver)).a = ((moom.Ct)(p0));

    moom.Cy.__sourceConstructorInit_045f9c0eaec3879d_0(((moom.Cy)(receiver)));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_045f9c0eaec3879d_0(moom.Cy a0) throws E;

public net.minecraft.entity.Entity a__r3() {
return null;
}


public net.minecraft.world.World a__Eu() {
return ((moom.Ct)(this.a)).d;
}


public moom.DR a__DR() {
return new moom.DR((((double) ((moom.DT)(((moom.Ct)(this.a)).e)).a()) + 0x1.0p-1d), (((double) ((moom.DT)(((moom.Ct)(this.a)).e)).b()) + 0x1.0p-1d), (((double) ((moom.DT)(((moom.Ct)(this.a)).e)).c()) + 0x1.0p-1d));
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(net.minecraft.command.CommandResultStats$Type p0, int p1) {
return;
}


public java.lang.String a__String() {
return "Sign";
}


public net.minecraft.util.IChatComponent a__C5() {
return new moom.CM(((moom.Cy)(this)).a__String());
}


public void a(net.minecraft.util.IChatComponent p0) {
return;
}


public boolean a(int p0, java.lang.String p1) {
return ((1) != 0);
}


public moom.DT a__DT() {
return ((moom.Ct)(this.a)).e;
}

}
