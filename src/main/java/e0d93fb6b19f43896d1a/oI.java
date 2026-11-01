package moom;


public class oI extends net.minecraft.client.resources.AbstractResourcePack {

private static final long c;

public oI(java.io.File p0) {
super(p0);
}


static {
moom.oI.c = (moom._c.a(-4175964887483734736L, 3310862239849759213L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(241417363765206L);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.util.Set<java.lang.String> a__Set() {
long token;
        String[] flags;
        java.util.Set<String> names;
        java.io.File assets;
        java.io.File[] files;
        int length;
        int index;
        java.io.File child;
        String entry;
        java.io.File selected;
        boolean discarded;
        String[] pendingFlags;
        java.io.File pendingFile;
        boolean pendingBoolean;
        resource_done: {
            directory_join: {
                token = c ^ 83056118206061L;
                names = com.google.common.collect.Sets.newHashSet();
                pendingFlags = oO.b();
                assets = new java.io.File(this.b, "assets/");
                flags = pendingFlags;
                pendingFile = assets;
                if (flags == null) {
                    selected = pendingFile;
                    break directory_join;
                }
                if (!pendingFile.isDirectory()) {
                    break resource_done;
                }
                selected = assets;
            }
            files = selected.listFiles((java.io.FileFilter)
                org.apache.commons.io.filefilter.DirectoryFileFilter.DIRECTORY);
            length = files.length;
            index = 0;
            file_cycle: while (true) {
                increment_join: {
                    discard_join: {
                        add_join: {
                            if (index >= length) {
                                break resource_done;
                            }
                            child = files[index];
                            entry = oI.a(assets, child);
                            pendingBoolean = entry.equals(entry.toLowerCase());
                            if (flags == null) {
                                discarded = pendingBoolean;
                                break discard_join;
                            }
                            if (pendingBoolean) {
                                break add_join;
                            }
                            this.a__Void(entry);
                            if (flags != null) {
                                break increment_join;
                            }
                        }
                        discarded = names.add(entry.substring(0, entry.length() - 1));
                    }
                    recovery.source.CarrierOps.discard(discarded);
                }
                index += 1;
                if (flags != null) {
                    continue file_cycle;
                }
                break file_cycle;
            }
        }
        return names;
}


protected boolean a__Boolean(java.lang.String p0) {
return ((java.io.File)(new java.io.File(this.b, p0))).isFile();
}


protected java.io.InputStream a(java.lang.String p0) throws java.io.IOException {
return new java.io.BufferedInputStream(new java.io.FileInputStream(new java.io.File(this.b, p0)));
}

}
