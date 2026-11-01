package net.minecraft.util;

import moom.CN;

public class ChatComponentTranslationFormatException extends IllegalArgumentException {
   public ChatComponentTranslationFormatException(CN var1, String var2) {
      super(String.format("Error parsing: %s: %s", var1, var2));
   }

   public ChatComponentTranslationFormatException(CN var1, int var2) {
      super(String.format("Invalid index %d requested for %s", var2, var1));
   }

   public ChatComponentTranslationFormatException(CN var1, Throwable var2) {
      super(String.format("Error while parsing: %s", var1), var2);
   }
}
