package net.minecraft.block.state;


public interface IBlockState {

public abstract net.minecraft.block.Block a__ch();

public abstract com.google.common.collect.ImmutableMap<net.minecraft.block.properties.IProperty, java.lang.Comparable> a__sourceReturn_400899bdd3();

public abstract <T extends java.lang.Comparable<T>> net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.properties.IProperty<T> p0);

public abstract <T extends java.lang.Comparable<T>, V extends T> net.minecraft.block.state.IBlockState a__fE(net.minecraft.block.properties.IProperty<T> p0, V p1);

public abstract <T extends java.lang.Comparable<T>> T a(net.minecraft.block.properties.IProperty<T> p0);

public abstract java.util.Collection<net.minecraft.block.properties.IProperty> a__Collection();
}
