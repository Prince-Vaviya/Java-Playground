class A{
    void callme(){
        System.out.println("A");
    } 
}

class B extends A{
    void callme(){
        System.out.println("B");
    }
}

class C extends A{
    void callme(){
        System.out.println("C");
    }
}

class DynamicMethodDispatch{
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        C c = new C();
        
        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}