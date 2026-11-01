package com.moon.events.priority;

public class Prioritization<T> {
   private final T item;
   private final Priority priority;

   public Prioritization(T item, com.moon.events.priority.Priority priority) {
      this.item = item;
      this.priority = priority;
   }

   public Priority priority() {
      return this.priority;
   }

   public T item() {
      return this.item;
   }
}
