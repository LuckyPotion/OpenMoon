package net.minecraft.client.resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import moom.DD;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;

public interface IResourcePack {
   String a__String();

   BufferedImage a() throws IOException;

   <T extends net.minecraft.client.resources.data.IMetadataSection> T a(net.minecraft.client.resources.data.IMetadataSerializer var1, java.lang.String var2) throws IOException;

   java.util.Set<java.lang.String> a__Set();

   boolean a__Boolean(DD var1);

   InputStream a(DD var1) throws IOException;
}
