public class iphone {
    
    public static void main(String[] args) {
        
    
    NavegadorInternet nvg = new NavegadorInternet();
    nvg.ExibirPagina();
    nvg.AdicionarNovaAba();
    nvg.AtualizarPagina();

    ReprodutorMusical msc = new ReprodutorMusical();
    msc.SelecionarMusica();
    msc.Tocar();
    msc.Pausar();

    AparelhoTelefonico tel = new AparelhoTelefonico();
    tel.Ligar();
    tel.Atender();
    tel.IniciarCorreioVoz();


    }
}

