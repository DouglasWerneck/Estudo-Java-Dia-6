public class Main{
    public static void main(String[] args) {
        Car  car = new Car("BMW", "X6", 2024);
        car.setModelo("X5") ;

        System.out.println(car.getMarca()); // sem o incapsulation aqui vai o nome da variavel
        System.out.println(car.gerModelo()); // com o incapsulation usando o getter
        System.out.println(car.getAno()); //aqui vai o metodo que sabe  valor da variavel
    }
}