public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pessoa qualquer = new Pessoa();
        Esportista jogadora = new Esportista();
        jogadora.setNome("Taissa");
        // Polimorfismo
        qualquer = new Esportista();
        //jogadora = (Esportista) new Pessoa();
    }

}