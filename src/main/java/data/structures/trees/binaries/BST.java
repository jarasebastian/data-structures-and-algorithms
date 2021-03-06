package data.structures.trees.binaries;

/**
 * @author sebastianjara on 28-02-21
 * @project data-structures-and-algorithms
 *
 * This class implements a Binary Source Tree (BST)
 */
public class BST implements IBST<Employee>{

	private Employee value;

	private BST left, right;

	private BST father;

	/**
	 * Check if the tree is empty
	 * @return true if it's and false if isn't
	 */
	@Override
	public boolean isEmpty() {
		return value==null;
	}

	/**
	 * Check if the subtree is leaf or the last element in certain path
	 * @return true if it's and false if isn't
	 */
	@Override
	public boolean isLeaf() {
		return left == null && right == null;
	}

	/**
	 * Recursive method which insert an element in a father tree (node)
	 * @param employee
	 * @param father
	 */
	private void insertImpl(Employee employee, BST father) {
		if(value==null) {
			this.value = employee;
			this.father = father;
		}else {
			if(employee.compareTo(value)<0) {
				if(left == null) left = new BST();
				left.insertImpl(employee, this);
			}else if(employee.compareTo(value)>0) {
				if(right == null) right = new BST();
				right.insertImpl(employee, this);
			}else {
				throw new RuntimeException("Inserting duplicated element.");
			}
		}
	}

	/**
	 * Insert an element in the tree
	 * @param employee to be inserted
	 */
	@Override
	public void insert(Employee employee) {
		insertImpl(employee, null);
	}

	/**
	 * Check if an element exists filtering by id
	 * @param id of the element to be checked
	 * @return true if exists and false if it's not
	 */
	@Override
	public boolean exists(int id) {
		if(value != null){
			if(id == value.getId()) {
				return true;
			}else if(id < value.getId() && left != null) {
				return left.exists(id);
			}else if(id > value.getId() && right != null) {
				return right.exists(id);
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

	/**
	 * Get an element by id
	 * @param id of the element to be found
	 * @return an element
	 */
	@Override
	public Employee get(int id) {
		if(value != null){
			if(id == value.getId()) {
				return value;
			}else if(id < value.getId() && left != null) {
				return left.get(id);
			}else if(id > value.getId() && right != null){
				return right.get(id);
			}else {
				return null;
			}
		}else {
			return null;
		}
	}

	/**
	 * Recursive method prints the whole tree pre-order
	 * @param prefix is a comulative string
	 */
	private void preorderImpl(String prefix) {
		if(value!=null) {
			System.out.println(prefix + value.toString());
			if(left != null) left.preorderImpl(prefix + "  ");
			if(right != null) right.preorderImpl(prefix + "  ");
		}
	}

	/**
	 * Print the tree pre-order
	 */
	@Override
	public void preorder() {
		preorderImpl("  ");
	}

	/**
	 * Recursive method prints the whole tree in-orden
	 * @param prefix is a comulative string
	 */
	private void inordenImpl(String prefix) {
		if(value!=null) {
			if(left != null) left.inordenImpl(prefix + "  ");
			System.out.println(prefix + value.toString());
			if(right != null) right.inordenImpl(prefix + "  ");
		}
	}

	/**
	 * Print the tree in-order
	 */
	@Override
	public void inorder() {
		inordenImpl("  ");
	}

	/**
	 * Recursive method which prints the whole tree post-order
	 * @param prefix is a comulative string
	 */
	private void postorderImpl(String prefix) {
		if(value!=null) {
			if(left != null) left.postorderImpl(prefix + "  ");
			if(right != null) right.postorderImpl(prefix + "  ");
			System.out.println(prefix + value.toString());
		}
	}

	/**
	 * Print the tree post-order
	 */
	@Override
	public void postorder() {
		postorderImpl("  ");
	}

	/**
	 * Check if a tree is minimum
	 * @return
	 */
	private BST minimum() {
		if(left != null && !left.isEmpty()) {
			return left.minimum();
		}else {
			return this;
		}
	}


	/**
	 * Recursive method which deletes an element by id
	 * @param id of the element
	 */
	private void deleteImpl(int id) {
		if(left != null && right != null) {
			//Delete with 2 childs
			BST minimum = right.minimum();
			this.value = minimum.value;
			right.delete(minimum.value.getId());
		}else  if(left != null || right != null){
			//Delete with 1 child
			BST replacement = left !=null ? left : right;
			this.value = replacement.value;
			this.left = replacement.left;
			this.right = replacement.right;
		}else {
			//Delete with 0 child
			if(father != null) {
				if(this == father.left) father.left = null;
				if(this == father.right) father.right = null;
			}
		}
	}

	/**
	 * Delete an element by id
	 * @param id of the element
	 */
	@Override
	public void delete(int id) {
		if(value != null) {
			if(id == value.getId()) {
				deleteImpl(id);
			}else if(id < value.getId() && left != null){
				left.delete(id);
			}else if(id > value.getId() && right != null) {
				right.delete(id);
			}
		}
	}

}
