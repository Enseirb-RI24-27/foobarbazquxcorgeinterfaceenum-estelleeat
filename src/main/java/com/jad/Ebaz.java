package com.jad;

public enum Ebaz implements IBaz{
    Baz1("Baz1"),
    Baz2("Baz2"),
    Baz3("Baz3");

    private String name;

    Ebaz(String name) {
        this.name = name;
    }
    public void doSomethingLikeABaz(){
        System.out.println("dosomethinglikeAbaz");
    }
}
