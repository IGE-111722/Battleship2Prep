package battleship;

public class Calculator {
    public int value;


    public Calculator(int value) {

        this.value = 0;
    }

    public static boolean greater(int x, int y){
        if(x>y){
            return true;
        }
        return false;
    }

    public static boolean less(int x, int y){
        if(x<y){
            return true;
        }
        return false;
    }


    public int sum(int val){
        value += val;
        return value;
    }

    public int sub(int val){
        value -= val;
        return value;
    }
    public int mul(int val){
        value *= val;
        return value;
    }

    public int div(int val){
        value /= val;
        return value;
    }

    public int getValue(){
        return value;
    }
}
