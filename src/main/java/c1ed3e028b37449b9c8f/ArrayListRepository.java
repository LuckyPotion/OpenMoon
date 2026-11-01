package com.moon.commons.repository;

import java.util.ArrayList;

public class ArrayListRepository<T> implements com.moon.commons.repository.Repository<T> {
   protected final java.util.ArrayList<T> list = new ArrayList<>();

   @Override
   public void add(T type) {
      this.list.add(type);
   }

   @Override
   public void remove(T type) {
      this.list.remove(type);
   }
}
