
public class ListContainer {
	private Node head;
		
	public int getNodeCount()
	{
		Node temp = head;
		int count = 1;
		
		if (head == null)//insertNode가 하나도 없다면
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
		
		if(lastNode == null)
			return null;
		
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
	//해당 위치 이전에 있는 노드에 있던 getNext 정보를 새로운 노드의 헤드가 받고, 
	//새로운 노드의 setNext에 기존 해당 위치 노드의 헤드값 넣기
	//예: insertNode(2,new Node())
	public boolean insertNode(int index, Node newNode) {
		
		
		Node target = head;
		Node before = null;
		
		//입력한 값이 0인 경우
		if(index==0) 
		{
			head=newNode;
			head.setNext(target);
		}
		//입력한 값이 0보다 작은 경우
		else if(index < 0)
		{
			return false;
		}
		else if(index>getNodeCount()) {
			insertNode(newNode);
		}
		else 
		{
			for(int i=0;i<index;i++) {		
				before = target;
				target = target.getNext();
			}
			before.setNext(newNode);
			newNode.setNext(target);
			
		}
		
			
		
		return true;
	}
	
	//intValue값과 비교한 뒤 일치했을 경우 지우기
	public boolean deleteNodeByIntValue(int intValue)
	{
		Node target = head;  
		int targetIndex = 0;
		int deleteCount = 0;
		int count = getNodeCount();
				
		for(int i = 0 ; i < count ; i++ )
		{
			if(target.getData().getIntValue() == intValue)
			{
				
				deleteNode(targetIndex);
				
				deleteCount++;
				targetIndex--;
			}
			
			targetIndex++;	
			
			target = target.getNext();
			
			if(target == null)
		
				break;
				
			
		}
		if (deleteCount == 0)
		{
			return false;
		}	
		
		return true;
		
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
	
	public void printNodeContainer()
	{
	
	Node temp = head;
	
	for(int i = 0 ; i < getNodeCount() ; i++)
	{
		System.out.println
		("[index : "+ i + "]"+", [intValue : " + temp.getData().getIntValue() + "], [strValue : " + temp.getData().getStrValue() + "]" );	
	
		temp = temp.getNext();
		
		if(temp == null)
			break;
	
	}

}
}
