package session11_list_stack_and_queue.exercise.deployment_circular_queue_case2;

public class TestQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int hight = -1;
    private int currentSize = 0;

    public TestQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize == 0){
            status = true;
        }
        return status;
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (currentSize == queueArr.length){
            status = true;
        }
        return status;
    }

    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Capacity is full, can't add : " + item);
        }else {
            hight++;
            if (hight == capacity -1){
                hight = 0;
            }
            queueArr[hight] = item;
            currentSize++;
            System.out.println("Element " + item + " is push to Queue!!!");
        }
    }

    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Error! Unable to remove element");
        }else {
            head++;
            if (head == capacity - 1){
                System.out.println("Removed: " + queueArr[head - 1]);
                head = 0;
            }else {
                System.out.println("Removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}

