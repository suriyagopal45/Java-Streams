class  A
{
    int a;
//    private A(int a)
//    {
//        this.a=a;
//
//    }

    public int getA() {
        return a;
    }
}

class B extends A
{
    B(int a)
    {
        // cannot call private constructor eventhough extends
    }

}

public class InheritanceDoubt {
    static void main() {


    }
}
