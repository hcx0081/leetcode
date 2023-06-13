/**
 * {@code @Description:} 622.设计循环队列
 */
public class MyCircularQueue {
    int[] eleArr;
    // 头指针
    int front;
    // 尾指针
    int rear;
    // 记录元素个数
    int len;
    
    public MyCircularQueue(int k) {
        this.eleArr = new int[k];
        this.front = 0;
        this.rear = 0;
        this.len = 0;
    }
    
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1));
        System.out.println(circularQueue.enQueue(2));
        System.out.println(circularQueue.enQueue(3));
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
        System.out.println(circularQueue.isFull());
        System.out.println(circularQueue.deQueue());
        System.out.println(circularQueue.enQueue(4));
        System.out.println(circularQueue.Rear());
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            System.out.println("队列已满");
            return false;
        }
        this.eleArr[this.rear] = value;
        this.rear = (this.rear + 1) % this.eleArr.length;
        this.len++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            System.out.println("队列为空");
            return false;
        }
        this.eleArr[this.front] = 0;
        this.front = (this.front + 1) % this.eleArr.length;
        this.len--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return this.eleArr[this.front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return this.eleArr[(this.rear - 1 + this.eleArr.length) % this.eleArr.length];
    }
    
    public boolean isEmpty() {
        return this.len == 0;
    }
    
    public boolean isFull() {
        return this.len == this.eleArr.length;
    }
}