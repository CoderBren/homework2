package homework1;

public class GroveTester {
    public static void main(String[] args) {

        // Creating a Grove object
            Grove groveOne = new Grove("Grove 1");

        // Printing the grove object named Grove 1
            System.out.println(groveOne.toString());
    

        // Instantiate seven Tree objects of the spruce species and age 37
            for (int i = 1; i <= 7; i++) {
                Tree spruceTree = new Tree(i, 37, "Spruce");
                groveOne.plantTree(spruceTree);
            }

        // Printing the grove object named Grove 1 (after instantiation)
        System.out.println(groveOne.toString());


        // Remove trees at indexes 3 and 5
        Tree removedTree1 = groveOne.removeTree(3);
        Tree removedTree2 = groveOne.removeTree(5);
    
        // Printing the grove object named Grove 1 (after removal)
        System.out.println(groveOne.toString());


        // Instantiate Maple Tree Object
        Tree mapleTree = new Tree(8, 13, "Maple");
        groveOne.plantTree(mapleTree);

        //Printing the grove object named Grove 1 (with new object)
        System.out.println("Updated " + groveOne);




}}