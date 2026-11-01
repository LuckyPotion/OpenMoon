package net.minecraft.world.storage;

import java.util.List;
import moom.IQ;
import net.minecraft.client.AnvilConverterException;
import net.minecraft.util.IProgressUpdate;

public interface ISaveFormat {
   boolean b(String var1);

   boolean e(String var1);

   boolean c(String var1);

   boolean d(String var1);

   void a(String var1, String var2);

   String a__String();

   boolean a(String var1, IProgressUpdate var2);

   java.util.List<moom.IQ> a__List() throws AnvilConverterException;

   void a__Void();

   WorldInfo a(String var1);

   boolean a__Boolean(String var1);

   ISaveHandler a(String var1, boolean var2);
}
