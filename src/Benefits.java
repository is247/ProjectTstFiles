//Inheritance
import java.util.ArrayList;
import java.util.List;

public class Benefits {

    public String restDisc;
    public int cashback;
    public double interestRate;

    public Benefits(String restDisc,int cashback,double interestRate) {
        this.restDisc = restDisc;
        this.cashback  = cashback;
        this.interestRate = interestRate;

    }

    public String toString() {
        return ("Restaurant Discount at: " + restDisc + "\n" + "Cash Back: $" + cashback+ "\n" + "Interest Rate: "+ interestRate + "%"+ "\n");
    }
}

class CardBenefits{
    public void message(){
        System.out.println("");
    }
}

class GoldCard extends CardBenefits{
    public void message(){
        //List and ArrayList
        List<String> gold = new ArrayList<String>();
        gold.add("Gold card benefits");
        System.out.println(gold);

    }
}

class PlatinumCard extends CardBenefits{
    public void message(){
        List<String> plat = new ArrayList<String>();
        plat.add("Platinum card benefits");
        System.out.print(plat);
        super.message();
    }
}

//Method Overridding
class Gold extends Benefits {

    public Gold(String restDisc,int cashback,double interest)
    {super(restDisc,cashback,interest);}
}

class Platinum extends Benefits {

    public Platinum(String restDisc,int cashback,double interest)
    {super(restDisc,cashback,interest); }
}
