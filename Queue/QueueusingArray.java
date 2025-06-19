package Queue;

public class QueueusingArray {
    static int arr[]=new int[5];
    static int size;
    static int rear=-1;
    public static boolean isEmpty(){
        return rear==-1;
    }

    public static void add(int data){
        if(rear>arr.length-1){
            System.out.println("Queue is full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
    }

    public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return front;
    }

    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    public static void main(String[] args) {
        //QueueusingArray q=new QueueusingArray();
        add(1);
        add(2);
        add(3);
        add(4);
        remove();

        while (!isEmpty()){
            System.out.println(remove());
            //remove();
        }
    }
}
