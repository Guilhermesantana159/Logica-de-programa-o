public class TestaAnimal {
    public static void main(String[] args) {
        Animal A1 = new Animal();
        A1.setPeso(10);
        A1.setEspecie("gato");
        A1.setLargura(50);
        A1.setAltura(80);
        A1.setCor("preto");
        Animal A2 = new Animal();
        A2.setPeso(10);
        A2.setEspecie("gato");
        A2.setLargura(50);
        A2.setAltura(80);
        A2.setCor("preto");
        System.out.println("===================================");
        System.out.println("        Clinica Veterinária");
        System.out.println("===================================");
        System.out.println("Animal 1");
        System.out.println(A1);
        System.out.println("Animal 2");
        System.out.println(A2);
        System.out.println(A1.equals(A2));
        A2.setLargura(90);
        A2.setAltura(100);
        A2.setCor("laranja");
        System.out.println("===================================");
        System.out.println("            Após a Mudança");
        System.out.println("===================================");
        System.out.println("Animal 1");
        System.out.println(A1);
        System.out.println("Animal 2");
        System.out.println(A2);
        System.out.println(A1.equals(A2));
        System.out.println("===================================");
    }   
}
