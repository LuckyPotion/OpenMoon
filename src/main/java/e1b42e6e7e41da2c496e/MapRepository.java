package com.moon.commons.repository.map;

public interface MapRepository<K, V> {
   void remove(K var1, V var2);

   V get(K var1);

   void put(K var1, V var2);
}
