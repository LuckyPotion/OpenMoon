package net.minecraft.server.management;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

class UserList$1 implements ParameterizedType {
   @Override
   public Type getRawType() {
      return List.class;
   }

   @Override
   public Type[] getActualTypeArguments() {
      return new Type[]{UserListEntry.class};
   }

   @Override
   public Type getOwnerType() {
      return null;
   }
}
