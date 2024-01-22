public class Cilindro extends Circulo{

    private int altura;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Cilindro(double radio,int altura){
        super(radio);
        this.altura = altura;
        if(altura < 0){
            this.altura = 0;
        }
    }

    public double getVolumen(){
        return getArea() * altura;
    }
}
