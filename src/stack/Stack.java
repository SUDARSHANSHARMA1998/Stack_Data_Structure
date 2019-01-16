package stack;
import java.util.Arrays;
public class Stack

{

    int topOfStack = -1;
    int[] stack = new int[10];
    int size = stack.length;

    public static void main(String[] args)
    {
        Stack stack1 = new Stack();

        System.out.println(Arrays.toString(stack1.stack));

		/*for (int i = 0; i < 10 ; i++)
		{*/
        stack1.push(42);

        System.out.println(Arrays.toString(stack1.stack));

        System.out.println("Top of stack is " + stack1.topOfStack);

        int res = stack1.pop();

        System.out.println(res + " popped!");

        System.out.println(Arrays.toString(stack1.stack));

//		}

//		TODO add a method for push

    }

    void push(int value)
    {
        if (isFull())
        {
            System.out.println("Overflow!");
        }
        else
        {
            topOfStack++;
            stack[topOfStack] = value;
        }
    }

    int pop()
    {

        int response = 0;

        if (isEmpty())
        {
            System.out.println("UnderFlow!");
        }
        else
        {
            response = stack[topOfStack];
            stack[topOfStack] = 0;
            topOfStack--;
        }

        return response;

    }


    boolean isEmpty()
    {
        if (topOfStack == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    boolean isFull()
    {
        if (topOfStack == size - 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}