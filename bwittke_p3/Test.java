package bwittke_p3;

// Will add comments later
public class Test {

    public static void main(String [ ] arg)
    {
        Stack bridgetStack = new Stack();

        bridgetStack.push(26);
        bridgetStack.push("Cat");
        while (!bridgetStack.empty())
        {
            System.out.println(bridgetStack.pop());
        }

        Queue bridgetQueue = new Queue();

        bridgetQueue.enqueue("idk");
        bridgetQueue.enqueue("999");

        while (!bridgetQueue.empty())
        {
            System.out.println(bridgetQueue.peek());
        }

    }
}
