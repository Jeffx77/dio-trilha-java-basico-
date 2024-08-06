import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0){
            Double valorDoce= valorAleatorio();
            
            if (valorDoce> mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor :" + valorDoce + "Adcionado no carrinho");
            mesada = mesada-valorDoce;
        }
        System.out.println("mesada : " + mesada);
        System.out.println("joãozinho gastou toda a mesada em doces");
    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(4,8);
        
    }
}
