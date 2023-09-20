package com.driver;

public class Main {
    public static void main(String[] args) throws Exception {
       SavingsAccount kaleb = new SavingsAccount("kaleb",5000.0,50000.0,7.0);
       CurrentAccount bujji = new CurrentAccount("Bujji",10000,"ABCDEFGH");
        try{
            System.out.println(bujji.generateAccountNumber(9,34));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(kaleb.getSimpleInterest(4));
        try {
            bujji.withdraw(3000);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(bujji.getBalance());

    }
}