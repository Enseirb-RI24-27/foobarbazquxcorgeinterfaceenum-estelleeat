package com.jad;

public enum EBaz implements IBaz {
    Baz1("BAZ1"),
    Baz2("BAZ2"),
    Baz3("BAZ3");

    private String name;

    EBaz(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void doSomethingLikeABaz() {
        System.out.println("dosomethinglikeAbaz");
    }
}
