class Account{
    String name;
    int
     acc_no;
    String acc_type;
    float balance;

    void get(String a,int b,String c,float d){
    name = a;
    acc_no = b;
    acc_type = c;
    balance = d;
    }  

    void display(){
        System.out.println("Name of the Account holder is: "+name);
        System.out.println("Account number is: "+acc_no);
        System.out.println("Account type is: "+acc_type);
        System.out.println("balance is: "+balance);

    }
}

public class Bank{
    public static void main(String args[]){
        Account a1 = new Account();
        a1.get("Shubham", 15614634,"Saving account",75000);
        a1.display();
    }
}


