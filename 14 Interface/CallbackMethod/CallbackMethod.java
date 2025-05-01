interface Member{
    public void callback();
}

class Store{
    Member mem[] = new Member[100];
    int count = 0;

    public void register(Member m){
        this.mem[count++] = m;
    }

    public void inviteSale(){
        for(int i = 0; i<count ; i++){
            mem[i].callback();
        }
    }
}

class Customer implements Member{

    public String name;

    Customer(String name){
        this.name = name;
    }

    @Override
    public void callback(){
        System.out.println("Ok,I'll visit : "+name);
    }
}

public class CallbackMethod {
    public static void main(String[] args) {
        Store s = new Store();

        Customer c1 = new Customer("Rakibul");
        Customer c2 = new Customer("Hayat");

        s.register(c1);
        s.register(c2);

        s.inviteSale();
    }
}
