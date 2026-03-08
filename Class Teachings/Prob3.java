/*
=====================================================
          Java: Multi-Method Payment System
=====================================================

Design a payment service that supports two different payment methods: PayPal and Credit Card, each
with unique features. For PayPal payments, implement an Installment payment plan where the total
amount is split into two payments with a 5% interest on the second installment. For Credit Card
payments, integrate a feature that allows users to redeem reward points, where the points are redeemed
as 10% of the payment amount with a maximum of $10.

Given an interface PaymentMethod, with the following functions:
- void pay(double amount);

Complete the following methods:
1. CreditCardPaymentMethod class:
   o pay(double amount): void and should output the following:
     - "Paying ${amount} via Credit Card using Reward Points Redemption Feature."
     - "Redeemed ${redeemableAmount} using reward points."
     - "Paying remaining amount of ${remainingAmount} via credit card."

2. PayPalPaymentMethod:
   o pay(double amount): void and should output the following:
     - "Paying ${amount} via PayPal using Installment Payment Plan."
     - "Paid ${installment1} in first installment."
     - "Paid ${installment2} in second installment with 5% interest."

- Note: When attempting to print any double, print it after rounding with Utils.roundDouble(double d):
  String, but in calculations use the actual value.

- Example: System.out.println(Utils.roundDouble(123.123))

Input Format for Custom Testing
Sample Case 0
Sample Input 0
4
Pay CreditCard 1234-5678-9101-1121 12/23 JohnDoe 119.858
Pay PayPal amy.white@example.com password987 124.468
Pay CreditCard 6666-7777-8888-9999 432 02/23 AmyWhite 60.1619
Pay PayPal chris.wilson@example.com 12345678 145.737

Sample Output 0
Paying $119.86 via Credit Card using Reward Points Redemption Feature.
Redeemed $10.00 using reward points.
Paying remaining amount of $109.86 via credit card.
Paying $124.47 via PayPal using Installment Payment Plan.
Paid $62.23 in first installment.
Paid $65.35 in second installment with 5% interest.
Paying $60.16 via Credit Card using Reward Points Redemption Feature.
Redeemed $6.02 using reward points.
Paying remaining amount of $54.15 via credit card.
Paying $145.74 via PayPal using Installment Payment Plan.
Paid $72.87 in first installment.
Paid $76.51 in second installment with 5% interest.
=====================================================
*/
import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface PaymentMethod {
    void pay(double amount);
}

class Utils {
    // Helper to round double to 2 decimal places string
    public static String roundDouble(double d) {
        return String.format("%.2f", d);
    }
}

// --------- YOUR TASK STARTS HERE ---------

class CreditCardPaymentMethod implements PaymentMethod {

    @Override
    public void pay(double amount) {
        // YOUR CODE GOES HERE
    	double redeemableAmount = Math.min(amount * 0.1, 10.00);
    	System.out.println("Paying $"+Utils.roundDouble(amount)+
    			" via Credit Card using Reward Points Redemption Feature.");
    	System.out.println("Redeemed $"+Utils.roundDouble(redeemableAmount)+" using reward points.");
        
    }
}

class PayPalPaymentMethod implements PaymentMethod {

    @Override
    public void pay(double amount) {
        // YOUR CODE GOES HERE
    	double installment1 = amount / 2;
    	double installment2 = installment1 + (installment1 * 0.05);
    	
    	System.out.println("Paying $"+Utils.roundDouble(amount)+" via PayPal using Installment Payment Plan.");
    	System.out.println("Paid $"+Utils.roundDouble(installment1)+" in first installment.");
    	System.out.println("Paid $"+Utils.roundDouble(installment2)+" in second installment with 5% interest.");
        
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Read the number of test cases
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            // Input format: Pay <Method> <Details...> <Amount>
            // The amount is always the last element in the line
            double amount = Double.parseDouble(parts[parts.length - 1]);
            
            // The method type is the second element (Index 1)
            String type = parts[1];

            PaymentMethod pm = null;

            if (type.equals("CreditCard")) {
                pm = new CreditCardPaymentMethod();
            } else if (type.equals("PayPal")) {
                pm = new PayPalPaymentMethod();
            }

            if (pm != null) {
                pm.pay(amount);
            }
        }
        sc.close();
    }
}