public class Car {
    private String marca;
    private String modelo;
    private int ano;

    Car(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }
    public String gerModelo(){
        return modelo;
    } 

    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}
