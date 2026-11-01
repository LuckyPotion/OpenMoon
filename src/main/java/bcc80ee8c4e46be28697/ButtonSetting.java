package com.moon.setting;


public class ButtonSetting extends com.moon.setting.Setting<java.lang.Void> {

private ButtonSetting(java.lang.String p0) {
super(p0, com.moon.cf.BUTTON);
}


public void fromJson(com.google.gson.JsonObject p0) {
return;
}


public com.google.gson.JsonObject toJson() {
return null;
}


public static com.moon.ma builder(java.lang.String p0) {
return new com.moon.ma(p0);
}

}
