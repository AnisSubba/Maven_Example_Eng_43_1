package com.spartglobal.solid.Solid_Shop.DependencyInversion;

public class Shelf {

    public IProducts addDvdToSelf(IProducts iProducts){

        return iProducts;
        // it adds DVD to the self
    }
}
