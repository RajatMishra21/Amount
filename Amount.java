class PiggyBank
{
    private int amount;

    PiggyBank()
    {
        amount=50;
    }

    PiggyBank(int amount)
    {
        this.amount +=amount;
    }

    public void getAmount()
    {
        System.out.println("Balance: "+ amount);
    }
}

public class Amount {

    public static void main(String[] args) {
        PiggyBank p1 = new PiggyBank();
        PiggyBank p2 = new PiggyBank(150);
        p1.getAmount();
        p2.getAmount();
    }
}
