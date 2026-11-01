package com.moon;

import com.moon.setting.FloatSetting;
import java.util.function.Supplier;

public class md {
   private final FloatSetting a;

   public md(String var1) {
      this.a = new FloatSetting(var1);
   }

   public com.moon.md a(java.util.function.Supplier<java.lang.Boolean> var1) {
      this.a.setAvailabilityPredicate(var1);
      return this;
   }

   public md a(String var1) {
      this.a.setDescription(var1);
      return this;
   }

   public FloatSetting a() {
      return this.a;
   }

   public com.moon.md a(com.moon.kR<java.lang.Float> var1) {
      this.a.setChangeListener(var1);
      return this;
   }

   public md a(String var1, float var2, float var3, float var4, float var5) {
      this.a.setDisplayName(var1);
      this.a.setMin(var3);
      this.a.setDragMin(var3);
      this.a.setMax(var4);
      this.a.setStep(var5);
      this.a.setValue(var2);
      this.a.setSliderValue(var2);
      return this;
   }
}
