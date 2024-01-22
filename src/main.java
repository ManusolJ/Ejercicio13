public class main {
    public static void main(String [] args){
        Circulo cc = new Circulo(-5);
        Cilindro cl = new Cilindro(5,-5);

        System.out.println(cc.getArea());
        System.out.println(cl.getVolumen());
    }
}
