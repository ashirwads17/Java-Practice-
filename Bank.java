
import java.util.Scanner;

 class Bank {
    public static void main(String[] args) {
        
    }

    private double bal=5000;
    private int pwd;

    public void Deposite(double money)
    {

     System.out.println("Enter the password");

    Scanner s=new Scanner(System.in);
    pwd=s.nextInt();

    if(pwd==9693){
        bal=bal+money;

        System.out.println("Deposited money"+money);
        System.out.println("Total balance"+bal);
    }

    
     else{

        System.out.println("Invalid password");

     }
    }

     public void Withdraw(double money){
      System.out.println("enter your password");

        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

        if(pwd==9693){
            bal=bal-money;
    
            System.out.println("Withdraw money"+money);
            System.out.println("Total balance"+bal);
        }

        else{
            System.out.println("Invalid password");
        }
    }

        public void CheckBal()
        {

        System.out.println("Enter your password");

        Scanner s=new Scanner(System.in);
        pwd=s.nextInt();

        if(pwd==9693){

        System.out.println("Total balance"+bal);
       
        }
     
     
        }
    }
        class Customer{
        public static void main(String[]args){

        Bank b=new Bank();

        int ch;

    System.out.println("1.Deposite");
    System.out.println("2.Withdraw");
    System.out.println("3.checkBalance");

    Scanner s2 =new  Scanner(System.in);
    ch=s2.nextInt();

    switch(ch){

    case 1: b.Deposite(1000);
    break;

    case 2: b.Withdraw(2000);
    break;

    case 3:b.CheckBal();
    break;


    }



        }
        
        }
    
    
    
    
    

