package com.moon.runtime;

/** Local lifecycle state only; contains no license, UID or network validation. */
public final class LocalClientProfile {
    public LocalClientProfile() {}
    public boolean a__Boolean() { return LocalBootstrap.isReady(); }
}
