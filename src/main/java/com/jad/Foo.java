package com.jad;

import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo{
    public IBar getBar() {
        return this.bar;
    }

    private IBar bar ;

    public IQux getQux() {
        return this.qux;
    }

    public List<IBar> getBars() {
        return this.bars;
    }

    private List<IBar> bars = new ArrayList<>();
    private IQux qux;
    private ICorge corge;

    public Foo(IBar bar) {
        this.bar = bar;
    }
    public void addBaz(IBar bar){
        this.bars.add(bar);
    }

    @Override
    public ICorge getCorge() {
        return null;
    }

    @Override
    public void setCorge(ICorge corge) {

    }
}
