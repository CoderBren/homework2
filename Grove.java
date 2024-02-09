package homework1;

import java.util.ArrayList;

public class Grove{
    // Instance variables
    private ArrayList<Tree> trees;
    private String groveName;

// Parameterized constructor
public Grove(String groveName) {
    this.groveName = groveName;
    this.trees = new ArrayList<>(12);               // maximum size of grove is 12
}

// Plant a Tree in the first available spot

public int plantTree(Tree tree) {
    if (trees.size() < 12) {
        trees.add(tree);
        return trees.size() - 1;   // Index where the tree is planted
    } else {
        return -1; // No spots available
    }
}

 // Remove a Tree from a given spot
 public Tree removeTree(int index) {
    if (index >= 0 && index < trees.size()) {
        return trees.remove(index);
    } else {
        return null;            //Invalid index
    }
}


// ToString method to print the number of Trees in the array
public String toString() {
    return String.valueOf(trees.size());
}

// Getter method for grove name
public String getGroveName() {
    return groveName;
}

// Getter method for number of trees in the grove
public int getNumberOfTrees() {
    return trees.size();
}

}