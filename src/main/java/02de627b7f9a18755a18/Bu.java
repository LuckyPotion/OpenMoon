package moom;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

class Bu implements ParameterizedType {
   Bu() {
   }

   @Override
   public Type getRawType() {
      return List.class;
   }

   @Override
   public Type[] getActualTypeArguments() {
      return new Type[]{Bw.class};
   }

   @Override
   public Type getOwnerType() {
      return null;
   }
}
