// Assignment 10.3 - My Intager Class
// 
package wk10;

public class MyIntager {
    /* ~ Fields ~ */
    private int value;
    
    /* ~ Constuctors ~ */
    public MyIntager(int value) {
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
    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

}
