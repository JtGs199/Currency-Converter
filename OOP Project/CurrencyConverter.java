import java.util.Scanner;

public class CurrencyConverter extends CurrencyRate {
    
    int amount;

    public void setAmount() {

        Scanner choice = new Scanner(System.in);
        System.out.println("please enter the amount you wish to convert");
        this.amount = choice.nextInt();
        choice.close();
    }
    public void printResult() {
        System.out.println("*****************************");
        double converted = this.amount * this.rate;
        System.out.println(this.amount + " " + this.currency + " = " + converted + " in "+ this.currencyConv);
    }

    public static void main(String[] args) {
        CurrencyConverter test = new CurrencyConverter();
        test.chooseFromChoices();
        test.chooseFromCurrency();
        test.chooseToChoices();
        test.chooseToCurrency();
        test.rateCurrency();
        test.setAmount();
        test.printResult();
    
    }
    
}
