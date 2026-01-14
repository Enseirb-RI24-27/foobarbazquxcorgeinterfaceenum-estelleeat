package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo{
    private IBar bar ;
    private List<Ebaz> bazs = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBar bar) {
        this.bar = bar;
    }
    public void addBaz(Ebaz baz){
        this.bazs.add(baz);
    }

    @Override
    public ICorge setCorge(Corge corge) {
        return null;
    }
}
