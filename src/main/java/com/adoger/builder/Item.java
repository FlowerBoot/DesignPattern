package com.adoger.builder;

import com.adoger.builder.pack.Packing;

public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
