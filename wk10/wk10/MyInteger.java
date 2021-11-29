// Assignment 10.3 - My Integer Class
// 
package wk10;

public class MyInteger {
    /* ~ Fields ~ */
    private int value;
    
    /* ~ Constuctors ~ */
    public MyInteger(int value) {
        this.value = value;
    }

    /* ~ Setter ~ */
    public void setValue(int value) {
        this.value = value; 
    }
    
    /* ~ Getter ~ */
    public int getValue() {
        return this.value;
    }
    
    /* ~ Booleans ~ */
    // non-static
    public boolean equals() {
        return this.value == value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        double num = Math.sqrt(value);

        for (int i = 2; i < num; i++) {
            if (value % i == 0) return false;
        }
        return true;   
    }

    // Static
    public boolean equals(int value) {
        return this.value == value;
    }
    
    public static boolean isEven(int value) {
        return value % 2 == 0;
    }
    
    public static boolean isOdd(int value) {
        return !isEven(value);
    }
    
    public static boolean isPrime(int value) {
        return isPrime(value);
    }
    
    // MyIntager
    public boolean equals(MyInteger intValue) {
        return this.value == intValue.value;
    }

    public static boolean isEven(MyInteger intValue) {
        return intValue.isEven();
    }

    public static boolean isOdd(MyInteger intValue) {
        return intValue.isOdd();
    }

    public static boolean isPrime(MyInteger intValue) {
        return intValue.isPrime();
    }

    /* ~ String Convertion ~ */
    public static int parseInt(char[] value) {

        double valueDouble = 0;
        int toPower = value.length - 1;
        for (char e : value) {
            valueDouble += Math.pow(10, toPower--) * (e - '0');
        }
        return (int)valueDouble;
    }

    public static int parseInt(String value) {
        return parseInt(value.toCharArray());
    }

}
