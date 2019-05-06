public class SegundaAula {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setNomeDoAnimal("Rex");
        animal.setIdade(3);
        animal.setPeso(12.5F);
        animal.setNomeDoDono("Fábio");
        animal.setEndereco("Rua x, 123");

        Animal outroAnimal = new Animal("Totó", 10.1F, 5, "Gui", "Rua y, 321");

        System.out.println("nome: "+animal.getNomeDoAnimal());
        System.out.println("idade: "+animal.getIdade());
        System.out.println("peso:"+ animal.getPeso());
    }

}
