package moom;

import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashSet;
import java.util.Properties;
import java.util.Set;

public class OH extends Properties {
   private final java.util.Set<java.lang.Object> a = new LinkedHashSet<>();

   public OH() {
   }

   @Override
   public synchronized Object put(Object var1, Object var2) {
      this.a.add(var1);
      return super.put(var1, var2);
   }

   @Override
   public synchronized java.util.Enumeration<java.lang.Object> keys() {
      return Collections.enumeration(this.keySet());
   }

   @Override
   public java.util.Set<java.lang.Object> keySet() {
      Set var1 = super.keySet();
      this.a.retainAll(var1);
      return Collections.unmodifiableSet(this.a);
   }
}
