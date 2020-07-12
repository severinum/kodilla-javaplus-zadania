package com.kodilla.oop.abstraction.bank;

abstract class BankTransaction {

    abstract protected void step1();
    abstract protected void step2();
    abstract protected void step3();
    private void step4(){
        System.out.println("Transaction is being checked ...");
    }
    private void step5(){
        System.out.println("Checking account balance ...");
    }
    private void step6(){
        System.out.println("Transaction accepted.");
    }
    abstract protected void step7();
    abstract protected void step8();

    public void process(){
        this.step1();
        this.step2();
        this.step3();
        this.step4();
        this.step5();
        this.step6();
        this.step7();
        this.step8();
    }

}
