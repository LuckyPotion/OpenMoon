package net.minecraft.client.resources;

import java.io.InputStream;
import moom.DD;
import net.minecraft.client.resources.data.IMetadataSection;

public interface IResource {
   String a__String();

   <T extends net.minecraft.client.resources.data.IMetadataSection> T a(java.lang.String var1);

   boolean a__Boolean();

   InputStream a();

   DD a__DD();
}
