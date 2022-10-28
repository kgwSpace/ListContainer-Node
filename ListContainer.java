
public class ListContainer {
	private Node head;
		
	public int getNodeCount()
	{
		Node temp = head;
		int count = 1;
		
		if (head == null)
			return 0;
				
		while(null != temp.getNext())
		{
			temp = temp.getNext();
			count++;
		}
				
		return count;
	}
	
	public Node getLastNode()
	{
		Node lastNode = head;
		
		while(null != lastNode.getNext())
		{
			lastNode = lastNode.getNext();
			
		}
		
		return lastNode;
	}
	
	// 노드를 추가하는 함수.
	public void insertNode(Node newNode)
	{
		Node lastNode = null;
		
		if (head == null)
		{
			head = newNode;
			
		}
		else
		{
			// 마지막노드를 찾고 그 위치에 새로운 노드를 저장한다.
			lastNode = getLastNode();		
			lastNode.setNext(newNode);		
			
		}
		
		
	}
	
	public boolean deleteNode(int index)
	{
		int count; 
		Node target = head; // 지울대상 노드
		Node before = null; // target의 이전노드
		
		count = getNodeCount();
		
		if ((index >= count) || (index < 0))
			return false;
		
		if (index == 0)
		{
			head = head.getNext();	
			return true;
			
		}
		
		for (int i = 0; i < index; i++)
		{
			before = target;
			target = target.getNext(); 
			
		}
		
		if (before == null)
		{
			return false;
						
		}
		else
		{
			before.setNext(target.getNext());
			
		}
		
		return true;
	
	}
	
}
