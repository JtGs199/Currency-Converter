import java.util.Scanner;

public class Currency {
    
    int fromCurrency;
    int toCurrency;
    String currency;
    String currencyConv;
    Scanner choice = new Scanner(System.in);

    public void chooseFromChoices() {
        System.out.println("choose the currency you wish to convert:");
        System.out.println("Enter 1: Saudi Arabian Riyal");
        System.out.println("Enter 2: US Dollar");
        System.out.println("Enter 3: Euro");
        System.out.println("Enter 4: British Pound");
        System.out.println("Enter 5: Indian Rupee");
        System.out.println("Enter 6: Australian Dollar");
        System.out.println("Enter 7: Canadian Dollar");
        System.out.println("Enter 8: Singapore Dollar");
        System.out.println("Enter 9: Egyptian Pound");
        System.out.println("Enter 10: Japanese Yen");
        System.out.println("*****************************");
        System.out.print("your choice is: ");
        this.fromCurrency = choice.nextInt();
    }

    public void chooseToChoices() {
        
        switch (this.currency) {
            case "Saudi Arabian Riyal":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: US Dollar");
                System.out.println("Enter 2: Euro");
                System.out.println("Enter 3: British Pound");
                System.out.println("Enter 4: Indian Rupee");
                System.out.println("Enter 5: Australian Dollar");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "US Dollar":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: Euro");
                System.out.println("Enter 3: British Pound");
                System.out.println("Enter 4: Indian Rupee");
                System.out.println("Enter 5: Australian Dollar");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Euro":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: British Pound");
                System.out.println("Enter 4: Indian Rupee");
                System.out.println("Enter 5: Australian Dollar");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "British Pound":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: Indian Rupee");
                System.out.println("Enter 5: Australian Dollar");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Indian Rupee":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Australian Dollar");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
               
                break;
            case "Australian Dollar":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Indian Rupee");
                System.out.println("Enter 6: Canadian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Canadian Dollar":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Indian Rupee");
                System.out.println("Enter 6: Australian Dollar");
                System.out.println("Enter 7: Singapore Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Singapore Dollar":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Indian Rupee");
                System.out.println("Enter 6: Australian Dollar");
                System.out.println("Enter 7: Canadian Dollar");
                System.out.println("Enter 8: Egyptian Pound");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Egyptian Pound":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Indian Rupee");
                System.out.println("Enter 6: Australian Dollar");
                System.out.println("Enter 7: Canadian Dollar");
                System.out.println("Enter 8: Singapore Dollar");
                System.out.println("Enter 9: Japanese Yen");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
            case "Japanese Yen":
                System.out.println("choose the currency you wish to convert to:");
                System.out.println("Enter 1: Saudi Arabian Riyal");
                System.out.println("Enter 2: US Dollar");
                System.out.println("Enter 3: Euro");
                System.out.println("Enter 4: British Pound");
                System.out.println("Enter 5: Indian Rupee");
                System.out.println("Enter 6: Australian Dollar");
                System.out.println("Enter 7: Canadian Dollar");
                System.out.println("Enter 8: Singapore Dollar");
                System.out.println("Enter 9: Egyptian Pound");
                System.out.println("*****************************");
                System.out.print("your choice is: ");
                this.toCurrency = choice.nextInt();
                
                break;
        }
    }

    public void chooseFromCurrency() {
        
        switch (this.fromCurrency) {
            case 1:
                this.currency = "Saudi Arabian Riyal";
                break;
            case 2:
                this.currency = "US Dollar";
                break;
            case 3:
                this.currency = "Euro";
                break;
            case 4:
                this.currency = "British Pound";
                break;
            case 5:
                this.currency = "Indian Rupee";
                break;
            case 6:
                this.currency = "Australian Dollar";
                break;
            case 7:
                this.currency = "Canadian Dollar";
                break;
            case 8:
                this.currency = "Singapore Dollar";
                break;
            case 9:
                this.currency = "Egyptian Pound";
                break;
            case 10:
                this.currency = "Japanese Yen";
                break;        
            default:
                System.out.println("please enter a valid choice");
                break;
        }
    }

    public void chooseToCurrency() {
        
        switch (this.currency) {
            case "Saudi Arabian Riyal":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "US Dollar";
                            break;
                        case 2:
                            this.currencyConv = "Euro";
                            break;
                        case 3:
                            this.currencyConv = "British Pound";
                            break;
                        case 4:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 5:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            
                }
                break;
            case "US Dollar":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "Euro";
                            break;
                        case 3:
                            this.currencyConv = "British Pound";
                            break;
                        case 4:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 5:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
                    }
            case "Euro":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "British Pound";
                            break;
                        case 4:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 5:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "British Pound":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 5:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "Indian Rupee":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "Australian Dollar":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 6:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "Canadian Dollar":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 6:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "Singapore Dollar":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 6:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Egyptian Pound";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;
            case "Egyptian Pound":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                            break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 6:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 9:
                            this.currencyConv = "Japanese Yen";
                            break;
            }
                break;     
            case "Japanese Yen":
                    switch (this.toCurrency) {
                        case 1:
                            this.currencyConv = "Saudi Arabian Riyal";
                            break;
                        case 2:
                            this.currencyConv = "US Dollar";
                        break;
                        case 3:
                            this.currencyConv = "Euro";
                            break;
                        case 4:
                            this.currencyConv = "British Pound";
                            break;
                        case 5:
                            this.currencyConv = "Indian Rupee";
                            break;
                        case 6:
                            this.currencyConv = "Australian Dollar";
                            break;
                        case 7:
                            this.currencyConv = "Canadian Dollar";
                            break;
                        case 8:
                            this.currencyConv = "Singapore Dollar";
                            break;
                        case 9:
                            this.currencyConv = "Egyptian Pound";
                            break;
            }
                break;
            default:
                System.out.println("please enter a valid choice");
                break;
        }
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCurrencyConv() {
        return this.currencyConv;
    }

}
    