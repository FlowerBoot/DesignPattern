package com.adoger.builder.burger;

import com.adoger.builder.Item;
import com.adoger.builder.pack.Packing;
import com.adoger.builder.pack.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
