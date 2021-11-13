public class GenericClassTest {
    public static void main(String[] args) {
        MyIntegerPair mip = new MyIntegerPair(10,20);
        mip.showMyIntegerPair();
        mip.decorateMyIntegerPair();
        mip.swapMyIntegerPair();
        mip.showMyIntegerPair();
        System.out.println("============================================");

        MyFloatPair mfp = new MyFloatPair(105.f,20.8f);
        mfp.showMyFloatPair();
        mfp.decorateMyFloatPair();
        mfp.swapMyFloatPair();
        mfp.showMyFloatPair();
        System.out.println("============================================");

        MyStringPair msp = new MyStringPair("Robert","Julia");
        msp.showMyStringPair();
        msp.decorateMyStringPair();
        msp.swapMyStringPair();
        msp.showMyStringPair();
    }
}
class MyIntegerPair //purpose is to create a pair of two numbers
{
    int x;
    int y;

    MyIntegerPair(int a, int b) { //constructor
        x = a; y = b;
    }
    void showMyIntegerPair() { //show the pair
        System.out.println("x : "+x+" y : "+y);
    }
    void decorateMyIntegerPair() { //design it
        System.out.println("[ x ]: "+x+" [ y ]: "+y);
    }
    void swapMyIntegerPair() {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("swapped...my integer pair...");
    }
}

class MyFloatPair //purpose is to create a pair of two numbers
{
    float x;
    float y;

    MyFloatPair (float a, float b) { //constructor
        x = a; y = b;
    }
    void showMyFloatPair() { //show the pair
        System.out.println("x : "+x+" y : "+y);
    }
    void decorateMyFloatPair() { //design it
        System.out.println("[ x ]: "+x+" [ y ]: "+y);
    }
    void swapMyFloatPair() {
        float temp = x;
        x = y;
        y = temp;
        System.out.println("swapped...my integer pair...");
    }
}

class MyStringPair //purpose is to create a pair of two numbers
{
    String x;
    String y;

    MyStringPair(String a, String b) { //constructor
        x = a; y = b;
    }
    void showMyStringPair() { //show the pair
        System.out.println("x : "+x+" y : "+y);
    }
    void decorateMyStringPair() { //design it
        System.out.println("[ x ]: "+x+" [ y ]: "+y);
    }
    void swapMyStringPair() {
        String temp = x;
        x = y;
        y = temp;
        System.out.println("swapped...my integer pair...");
    }
}
