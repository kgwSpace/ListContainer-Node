
public class Tmain {
	private static int count;
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		ListContainer list = new ListContainer();
		
		list.insertNode(new Node(1,"abc"));
		list.insertNode(new Node(2,"abcd"));
		
		list.deleteNode(0);
		
		System.out.println(list.getNodeCount());
	}
	
	
	//내가 가지고 있는 값이 최대값보다 큰 값이 들어오면 맨뒤,
	//-단위는 false;
	//insertNode
	//InsertNode(3, newNode) 이런 식으로 만들어보자
	public static boolean iinsertNode(Node head, int index) {
		if(count <= index) {
			insertNode(head, new Node(33, null));
		}
		
		return true;
	}
	
	
}
