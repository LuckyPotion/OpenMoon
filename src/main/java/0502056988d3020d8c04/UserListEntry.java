package net.minecraft.server.management;


public class UserListEntry<T> {

private final T a;

public UserListEntry(T p0) {
super();
    this.a = p0;
}


protected UserListEntry(T p0, com.google.gson.JsonObject p1) {
super();
    this.a = p0;
}


boolean a__Boolean() {
return ((0) != 0);
}


protected void a__Void(com.google.gson.JsonObject p0) {
return;
}


T a() {
return this.a;
}

}
