package StackUsingArray;

public class stackusingArray {

	int size;
	int arr[];
	int top;
	
	stackusingArray(int size)
	{
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top]= element;
			System.out.println("pushed element: " +element);
		}
		
		else {
			System.out.println("push is full");
		}
	}
	
	public int pop() 
	{
		if(!isEmpty())
		{
			int returnTop = top;
			top--;
			System.out.println("poped element is " +arr[returnTop]);
			return arr[returnTop];
		}
		
		else {
			System.out.println("stack is empty");
			return-1;
		}
	}
	
	
	public int peek()
	{
		if(!this.isEmpty())
		{
			return arr[top];
		}
		
		else
		{
			System.out.println("Stack is empty");
			return-1;
		}
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
		
	}
	
	public boolean isFull() {
		return (size-1==top);
		
	}
	
	
	
	public static void main(String[] args) {

		stackusingArray obj = new stackusingArray(10);
		obj.pop();
		
		System.out.println("===============");
		
		obj.push(100);
		obj.push(200);
		obj.push(300);
		obj.push(400);
		obj.push(500);
		
		System.out.println("===============");

		obj.pop();
		obj.pop();
		
		System.out.println(obj.peek());
		
		System.out.println(obj.isEmpty());
		System.out.println(obj.isFull());
	}

}
