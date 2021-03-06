package data.structures.trees.binaries;

import java.util.Arrays;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Example of using for a BST
 */
public class BSTExample {

    public static void main(String[] args) {

        Employee e1 = new Employee(20, "Sebastian Jara", "Sales", "A-252");
        Employee e2 = new Employee(44, "Mark Johnson", "Human Resources", "B-198");
        Employee e3 = new Employee(18, "Heh Park", "Sales", "A-241");
        Employee e4 = new Employee(33, "José Gonzalez", "Accounting", "B-96");
        Employee e5 = new Employee(64, "Alexander Skarsgard", "Marketing", "A-69");
        Employee e6 = new Employee(55, "Bryson Martin", "Informatics", "B-161");

        BST bst = new BST();
        
        Arrays.asList(e1, e2, e3, e4, e5, e6).forEach(bst::insert);

        bst.delete(20);
        bst.inorder();
    }
    
}
