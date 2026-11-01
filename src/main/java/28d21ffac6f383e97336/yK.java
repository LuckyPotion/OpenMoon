package moom;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;

public interface yK<T extends moom.yE> {
   void b(PacketBuffer var1) throws IOException;

   void a(PacketBuffer var1) throws IOException;

   void a(T var1);
}
