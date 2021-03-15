package tc.genericsExercise;

public class FirstList<T> {    

		private final int DEFAULT_SIZE = 10;
       	private int currentItem = 0;
       	private T arList[];
       	
       	@SuppressWarnings("unchecked")
    	public FirstList() {        
  			arList = (T[]) new Object[DEFAULT_SIZE];
        } 

       	@SuppressWarnings("unchecked")
	    public FirstList(int length) {
		       arList = (T[]) new Object[length];
        }
       	
       	public void addItem(T item) {
       		arList[currentItem] = item; 
       		currentItem += 1;
       	}
       	
       	@Override
       	public String toString() {
       		StringBuilder sb = new StringBuilder();
       		sb.append("Size: " + arList.length + "\n");
       		for (T t: arList) {
       			if (t != null) {
       				sb.append(t.toString() + "\n");
       			} else {
       				sb.append("Null\n");
       			}
       		}
       		return sb.toString();
       	}
}
