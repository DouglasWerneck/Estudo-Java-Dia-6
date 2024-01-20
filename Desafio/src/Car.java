public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private double porcemtagem;
    private double resultado;


    Car(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = 125_000;
        this. porcemtagem = 0.10;
        this.resultado = calculaResultado();
    }

    private double calculaResultado(){
        return valor + (valor * porcemtagem);
    }

    public double getResultado(){
        return resultado;
    }


    public String getMarca() {
        return marca;
    }

    public String gerModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setValorTotal(double valor){
        this.valor = valor;
    }
    
}
