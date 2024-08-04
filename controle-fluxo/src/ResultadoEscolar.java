public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7)
            System.out.println("Parabens voce foi Aprovado (=");

        else if (nota >=5 && nota <7)// && Condiçao logica para "AND" 
            System.out.println("Se esforçe mais ! Voce esta de recuperação |= ");
      
        else
            System.out.println("Que pena voce foi Reprovado )=");
        

            // Expressao ternaria
            //int nota = 7;
            // String resultado = nota >=7 ? "aprovado";"reprovado"
        
    }
}
