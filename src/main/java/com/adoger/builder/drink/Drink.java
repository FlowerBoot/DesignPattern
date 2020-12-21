package com.adoger.builder.drink;

import com.adoger.builder.pack.Bottle;
import com.adoger.builder.Item;
import com.adoger.builder.pack.Packing;

public abstract class Drink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
