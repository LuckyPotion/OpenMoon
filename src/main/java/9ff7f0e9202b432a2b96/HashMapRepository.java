package com.moon.commons.repository.map;

import java.util.HashMap;

public class HashMapRepository<K, V> implements com.moon.commons.repository.map.MapRepository<K, V> {
   protected final java.util.HashMap<K, V> map = new HashMap<>();

   @Override
   public void remove(K key, V value) {
      this.map.remove(key, value);
   }

   @Override
   public V get(K key) {
      return this.map.get(key);
   }

   @Override
   public void put(K key, V value) {
      this.map.put(key, value);
   }
}
