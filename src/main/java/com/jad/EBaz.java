package com.jad;

public enum EBaz implements IBaz {
    BAZ1("BAZ1"),
    BAZ2("BAZ2"),
    BAZ3("BAZ3");

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
