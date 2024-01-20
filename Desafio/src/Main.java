public class Main{
    public static void main(String[] args) {
        Car  car = new Car("BMW", "X6", 2024);
        car.setModelo("X5");

        System.out.println(car.getMarca());
        System.out.println(car.gerModelo()); 
        System.out.println(car.getAno()); 
        System.out.println("Valor de venda : R$" + car.getResultado());
    }
}