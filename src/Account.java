public class Account {

    private double balance;//Account klassen ska ha en balance där kontots saldo sparas
    private String name;
    private static int count = 0; //set counter

    //Två konstruktörer.  en som sätter balance till 0 och en som tar in en balance.
    public Account() {
        this.balance = 0.0;
        this.count++; //help count the number of balances/accounts
    }

    //en instansvariabel name av typen String
    public void setName(String name) {
        this.name = name;
    }

    //två metoder getName och setName som läser respektive skriver till name
    public String getName() {
        return name;
    }

    public Account(double startBalance) {
        this.balance = startBalance;
        this.count++;
    }

    //en metod withdraw som minskar saldot
    public double withdraw(double belopp) {
        if (this.balance >= belopp && belopp >= 0) {
            this.balance -= belopp;
            return belopp;
        }
        return 0;

    }

    // en metod deposit som ökar saldot
    public void deposit(double belopp) {
        this.balance += belopp;
    }

    //en ny konstruktor som sätter både name och balance
    public Account(double balance, String name) {
        this.balance = balance;
        this.name = name;
        this.count++;
    }
    //en metod toString som returnerar en sträng innehållandes en mening med name och balance på lämplig form.
    public double getBalance() {
        return this.balance;
    }

}

/*Skapa en Account klass som representerar ett bankkonto.












*/