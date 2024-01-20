public class Main{
    public static void main(String[] args) {
        Clients c001 = new Clients();
        c001.firstName = "Douglas Storck";
        c001.age = 30;

        Clients c002 = new Clients();
        c002.firstName = "Vinicius Troyack";
        c002.age = 29;

        c002.newaccount();

    }
}