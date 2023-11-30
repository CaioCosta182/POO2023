package ex02polimorfismo;
public class Ex02Polimorfismo {

    public static void main(String[] args) {
         Cd cd = new Cd(1, 20.0, "CD de Músicas", 12);
        Dvd dvd = new Dvd(2, 30.0, "DVD de Vídeos", 15);

 
        exibirInformacoesMidia(cd);
        exibirInformacoesMidia(dvd);
    }

    public static void exibirInformacoesMidia(Midia midia) {
        System.out.println("Tipo: " + midia.getTipo());
        System.out.println("Detalhes: " + midia.getDetalhes());
        System.out.println("Código: " + midia.getCodigo());
        System.out.println("Nome: " + midia.getNome());
        System.out.println("Preço: " + midia.getPreco());

        if (midia instanceof Cd) {
            Cd cd = (Cd) midia;
            System.out.println("Número de Músicas: " + cd.getnMusicas());
        } else if (midia instanceof Dvd) {
            Dvd dvd = (Dvd) midia;
            System.out.println("Número de Faixas: " + dvd.getnFaixas());
        }

        System.out.println();
    }
}
    
