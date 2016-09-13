package com.llp.queue;

import java.io.UnsupportedEncodingException;

/**
 * 作者： Joinly
 * 时间： 2016/9/2
 * 描述： 实现队列.
 */
public class QueueInside {
    //队列大小
    private int maxSize;
    //队列
    private int[] queArray;
    //队列头
    private int front;
    //队列尾
    private int rear;
    //队列元素个数
    private int itemsCount;

    public QueueInside(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        itemsCount = 0;
    }

    public void insert(int i) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        queArray[++rear] = i;  //队尾指针加1,把值i加入队尾  当第一次添加的时候的 ++rear 变成 0
        itemsCount++;
    }

    // 取得队列的队头元素。
    public int remove() {
        int temp = queArray[front++]; //front ++  先赋值，自己再加，所以第二次进来是 1
        if (front == maxSize) {
            front = 0;
        }
        itemsCount --;
        return  temp;
    }

    // 取得队列的队头元素。该运算与 remove()不同，后者要修改队头元素指针。
    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return itemsCount == 0;
    }

    public boolean isFull (){
        return itemsCount == maxSize;
    }

    public int size () {
        return itemsCount;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        QueueInside que = new QueueInside(1);

        que.insert(5);
        que.insert(6);

        que.remove();
        que.remove();
        que.remove();


        //que.testDisplay();
    }

    public void testDisplay () throws UnsupportedEncodingException {
        int i = 0;
        //i ++ 先赋值，自己再加
        int j = i ++;
        int k = 0;
        //++k 先加，再赋值
        int m = ++k;

        System.out.println("i === " +i);
        System.out.println("j === " +j);
        System.out.println("k === " +k);
        System.out.println("m === " +m);

        String temp = "abcd";
        byte[] value = temp.getBytes();
        byte[] by = new byte[value.length];
        int s = 0;
        for (int n = 3; n >= 0; n--) {
            by[s] = value[n];
            s++;
        }
        String t = new String(by, "utf-8");
        System.out.println("值：   " + t);
    }
}
