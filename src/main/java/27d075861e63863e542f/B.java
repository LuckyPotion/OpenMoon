package moom;

import java.io.File;
import java.io.FileNotFoundException;

public class B extends FileNotFoundException {
   public B(File var1, String var2) {
      super(String.format("'%s' in ResourcePack '%s'", var2, var1));
   }
}
