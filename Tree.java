package homework1;


public class Tree {

    // Instance variables

    private int idNumber;
    private int age;
    private String speciesName;

    // Parameterized constructor
    public Tree(int idNumber, int age, String speciesName) {

    this.idNumber = idNumber;
    this.age = age;
    this.speciesName = speciesName;
    }

    // Use Of Getters
    public int getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    // Usage of setter (If you would want to allow modification)
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setAge(int age) {
            this.age = age;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    // toString method to print
    @Override
    public String toString() {
        return "Tree{" +
                "idNumber=" + idNumber +
                ", age=" + age +
                ", speciesName='" + speciesName + '\'' +
                '}';
}}