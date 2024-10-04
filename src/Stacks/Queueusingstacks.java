package Stacks;

import java.util.Stack;

public class Queueusingstacks {
	
	private Stack<Integer> input;
	private Stack<Integer> output;
	
	public Queueusingstacks()
	{
		input = new Stack<>();
		output = new Stack<>();
	}
	
	public void push(int value)
	{
		input.push(value);
	}
	
	public int peek()
	{
		if(output.empty())
		{
			while(!input.empty())
			{
				output.push(input.pop());
			}
		}
			return output.peek();
	}
	
	public int pop()
	{
		peek();
		return output.pop();
	}
	
	public boolean isEmpty()
	{
		return input.empty()&&output.empty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queueusingstacks qs = new Queueusingstacks();
		qs.push(4);
		qs.push(8);
		qs.push(16);
		qs.push(20);
		System.out.println(qs.pop());
		System.out.println(qs.peek());
		qs.push(34);
		System.out.println(qs.pop());
		System.out.println(qs.pop());
	}

}
