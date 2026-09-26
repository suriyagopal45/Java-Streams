package Covaria;

class A {
    void print()
    {
        System.out.println("Print A");
    }
}

class B extends A{
    void print()
    {
        System.out.println("Print B");
    }
}

class C
{
    A getObject()
    {
        return new A();
    }
}

class D extends C
{
    @Override
    B getObject() {
        return new B();
    }
}
public class Cov {
    static void main() {

        C obj  = new C();

        A objB = (A) obj.getObject();
        objB.print();


    }
}
