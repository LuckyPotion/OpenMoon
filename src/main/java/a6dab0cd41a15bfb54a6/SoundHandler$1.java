package net.minecraft.client.audio;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import moom.f5;

class SoundHandler$1 implements ParameterizedType {
   @Override
   public Type getRawType() {
      return Map.class;
   }

   @Override
   public Type[] getActualTypeArguments() {
      return new Type[]{String.class, f5.class};
   }

   @Override
   public Type getOwnerType() {
      return null;
   }
}
