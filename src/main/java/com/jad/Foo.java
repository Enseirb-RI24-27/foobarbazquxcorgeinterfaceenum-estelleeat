package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo{
    private IBar bar ;
    private List<EBaz> bazs = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBar bar) {
        this.bar = bar;
    }
    public void addBaz(EBaz baz){
        this.bazs.add(baz);
    }

    @Override
    public ICorge getCorge() {
        return null;
    }

    @Override
    public void setCorge(ICorge corge) {

    }
}
