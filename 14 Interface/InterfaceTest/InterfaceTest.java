
interface Emergency {
    public void callDoct();
    public void callAmbulance();
}

class Pataient implements Emergency {

    @Override
    public void callDoct(){
        System.out.println("Hello Dr. X please help me!");
    }

    @Override
    public void callAmbulance(){
        System.out.println("Hellllooo 102 , please send an ambulance!");
    }

    public void status(){
        System.out.println("I'm okay!!");
    }
}

public class InterfaceTest {
    public static void main(String[] args) {
        Emergency em = new Pataient();   //only allow to call first two function (Dynamic method dispatch)
        Pataient p = new Pataient();  //Can call all of the function
        em.callAmbulance();
        p.status();
    }
}
