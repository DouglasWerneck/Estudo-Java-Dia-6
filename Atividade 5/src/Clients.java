public class Clients {
    String firstName;
    int age;
    int ballance;

    Clients(){
        ballance = 10;
    }

    void newaccount(){
        System.out.println(firstName + " Account created.");
        System.out.println("The new ballance is $" + ballance);
    }
}
