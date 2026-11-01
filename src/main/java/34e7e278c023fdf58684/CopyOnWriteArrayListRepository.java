package com.moon.commons.repository;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRepository<T> implements com.moon.commons.repository.Repository<T> {
   protected final java.util.concurrent.CopyOnWriteArrayList<T> list = new CopyOnWriteArrayList<>();

   @Override
   public void add(T type) {
      this.list.add(type);
   }

   @Override
   public void remove(T type) {
      this.list.remove(type);
   }
}
