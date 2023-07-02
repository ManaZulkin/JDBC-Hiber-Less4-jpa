import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnimalJPA animalJPA = new AnimalJPA();
        AnimalHelper animalHelper = new AnimalHelper();
        AnimalJPA[] animalJPAS = {new AnimalJPA("cat",true),
                new AnimalJPA("dog", true),
                new AnimalJPA("strange cat", false)};
        for (AnimalJPA a:animalJPAS) {
            animalHelper.add(a);
        }
        List<AnimalJPA> animalJPAList = animalHelper.getAll();

        for (AnimalJPA a: animalJPAList) {
            System.out.println(a);
        }

        animalJPA = animalHelper.getById(3);
        System.out.println(animalJPA);
        
    }
}