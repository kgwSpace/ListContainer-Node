
public class Tmain {
	
	public static void main(String[] args) {
		
		ListContainer list = new ListContainer();
		
		list.insertNode(new Node(11,"a"));
		list.insertNode(new Node(22,"b"));
		list.insertNode(new Node(33,"c"));
		list.insertNode(new Node(44,"d"));
		list.insertNode(2,new Node(55,"e"));
		
		
	//	list.deleteNodeByIntValue(44);
		
		
		
		list.printNodeContainer();
	}
	
}
