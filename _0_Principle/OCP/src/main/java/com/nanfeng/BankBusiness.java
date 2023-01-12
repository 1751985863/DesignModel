package com.nanfeng;

public class BankBusiness {

   public void operate(int type) {
       if (type == 1) {
           save();
       } else if(type == 2) {
           take();
       } else if(type == 3) {
           transfer();
       }
   }

   public void save(){
       System.out.println("存钱");
   }

   public void take(){
       System.out.println("取钱");
   }

   public void transfer() {
       System.out.println("转账");
   }
}