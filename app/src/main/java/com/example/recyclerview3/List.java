package com.example.recyclerview3;

public class List {
    private int number;
    private int identitiy;

    public List(int number, int identitiy) {
        this.number = number;
        this.identitiy = identitiy;
    }

    public int getNumber() {
        return number;
    }

    public String getNumberString(){return Integer.toString(number);}

    public void setNumber(int number) {
        this.number = number;
    }

    public int getIdentitiy() {
        return identitiy;
    }

    public String getIdentityString(){ return Integer.toString(identitiy);}

    public void setIdentitiy(int identitiy) {
        this.identitiy = identitiy;
    }
}
