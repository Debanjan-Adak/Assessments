
public class StackTut {
	
	int top=-1;
	int size;
	int arr[];
	StackTut(int size)
	{
		this.size=size;
		arr=new int[size];
	}
	private int peek()
	{
		return arr[top];
	}
	private void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty");
			return ;
		}
		else
			{
			System.out.println(arr[top--]);}
		return;
	}

	private void push(int value) {
		if(isFull())
			{System.out.println("Stack is full");return;}
		arr[++top]=value;
		
	}

	private boolean isFull() {
		if(top+1==size)
			return true;
		else
			return false;
	}

	private boolean isEmpty() {
		if(top==-1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		StackTut st=new StackTut(5);
		st.push(4);
		st.push(5);
		st.push(5);
//		st.pop();
		st.push(6);
		st.peek();
//		st.pop();
		st.push(1);
		st.push(2);
	}
}
