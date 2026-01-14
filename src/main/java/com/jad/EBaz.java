package com.jad;

public enum EBaz implements IBaz{
    Baz1("Baz1"),
    Baz2("Baz2"),
    Baz3("Baz3");

    public String getName() {
        return this.name;
    }

    private String name;

    EBaz(String name) {
        this.name = name;
    }
    public void doSomethingLikeABaz(){
        System.out.println("dosomethinglikeAbaz");
    }
}
