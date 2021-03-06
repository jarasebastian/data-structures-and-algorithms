package data.structures.trees.binaries;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * Define the behaviour an actions for the BST implementations
 */
public interface IBST <T extends Comparable>{

	void insert(T employee);
	
	boolean exists(int id);
	
	T get(int id);
	
	boolean isLeaf();
	
	boolean isEmpty();
	
	void preorder();
	
	void inorder();
	
	void postorder();
	
	void delete(int id);
	
}
