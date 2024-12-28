package recursion;

public class MyNode<T_key, T_val> implements Comparable<T_key> {
	
	
	private T_key key;
	
	private T_val value;
	private MyNode<T_key, T_val> left, right;
	
	public void setKey (T_key key) {
		this.key = key;
	}
	
	public T_key getKey() {
		return this.key;
	}
	
	public void setVal (T_val value) {
		this.value = value;
	}
	
	public T_val getVal() {
		return this.value;
	}
	
	public void setLeft(MyNode<T_key, T_val> left) {
		this.left = left;
	}
	
	public MyNode<T_key, T_val> getLeft(){
		return this.left;
	}
	
	public void setRight(MyNode<T_key, T_val> right) {
		this.right = right;
	}
	
	public MyNode<T_key, T_val> getRight(){
		return this.right;
	}
	
	public void printNode() {
		System.out.println("Данный узел обладает парой ключ ~ значение: " + "\n" + "K: " + key + " V: " + value);
	}
	
	public void setNode(MyNode<T_key, T_val> node) {
		this.setNode2(node);
		this.setChild(node);
	}
	
	public void setNode2(MyNode<T_key, T_val> node) {
		this.setKey(node.getKey());
		this.setVal(node.getVal());
		
	}
	
	public void setChild(MyNode<T_key, T_val> node) {
		this.setLeft(node.getLeft());
		this.setRight(node.getRight());
		
	}
	
	public void setNullNode() {
		this.setKey(null);
		this.setVal(null);
		this.setLeft(null);
		this.setRight(null);
		
	}
	
	@Override
	   public String toString() {
	    	if (this.left != null && this.right != null) {
	    		return ("Узел: " + key + "\n" + 
	    			   "Слева: " + left.getKey()+ " ||| " +
	    			   "Справа: " + right.getKey());	
	    	}
	    	else if (this.left == null && this.right != null) {
	    		return ("Узел: " + key + "\n" + 
		    			   "Слева: " + "---"+ " ||| " +
		    			   "Справа: " + right.getKey());	
		    }
	    	else if (this.left != null && this.right == null) {
	    		return ("Узел: " + key + "\n" + 
	    			   "Слева: " + left.getKey()+ " ||| " +
	    			   "Справа: " + "---");	
	    	} else {
	    		return ("Узел: " + key + "\n" + 
		    			   "Слева: " + "---" + " ||| " +
		    			   "Справа: " + "---");
	    	}
	   }

	@Override
	public int compareTo(T_key findKey) {
		int returnVal;
		
		if (findKey.hashCode() > this.getKey().hashCode()) returnVal = 1; // если ключ искомого объекта больше то "+" движение
		else if (findKey.hashCode() < this.getKey().hashCode()) returnVal = -1; 	// если ключ искомого объекта меньше то "-" движение
		else returnVal = 0;
		
		return returnVal;
	}
}
