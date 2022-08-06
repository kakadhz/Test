package com.gxs.type;
//链表的结点包括val(值)和next(指向的下个结点)
public class Node {

    public int val;
    public Node next;

    public Node() {
    }
    public Node(int a){
        this.val = a;
    }
}

//创建并操作链表
class MyLink{
    //链表的头
    private Node head;

    //枚举法创建链表
    public void createList(){
        Node node1 = new Node(11);
        Node node2 = new Node(22);
        Node node3 = new Node(33);
        Node node4 = new Node(44);
        Node node5 = new Node(55);

        this.head = node1;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
    }

    //头插法 是指在链表的头节点的位置插入一个新节点，定义一个node表示该节点，然后就是对node的next进行赋值，
    // 用node.next = this.head即可完成（注意：head应指向新节点）
    public void addFirst(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
    }


    //尾插法 是指在链表的尾节点的位置插入一个新节点，定义一个node表示该节点，然后就是对原来最后一个节点的next进行赋值，
    // 先将head移动至原来最后一个节点，用head.next = node进行赋值（注意，如果链表不为空，需要定义cur来代替head）

    public void addLast(int data){
        Node node = new Node(data);
        //判断头结点是否为空 空的话把node作为头结点
        if (this.head == null){
            this.head = node;
        }else{
            //把头结点当做一个指针遍历,找到尾结点，最后指向新结点
            Node cur = this.head;
            while (cur.next != null){
                cur = cur.next;
            }
            //
            cur.next = node;
        }
    }

    //打印链表
    public void print(){
        //用头结点做一个辅助指针
        Node cur = this.head;
        while (cur.next != null){
            System.out.print(cur.val+"");
            cur = cur.next;
        }
        System.out.println();
    }

    //查找是否包含某个值
    public boolean containsData(int data){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.val == data){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //单链表的长度
    public int  getSize(){
        Node cur = this.head;
        int count = 0;
        while (cur.next != null){
            count++;
            cur = cur.next;
        }
        return count;
    }

    //任意位置的插入 用一个辅助指针（cur）找到要插入位置的前一位置 让 node.next = cur.next 然后cur.next = node
    public void addIndex(int index,int data){
        //对位置合法性判断
        if (index < 0 || index >getSize()){
            return;
        }
        if(index == 0) addFirst(data);
        if (index == getSize()) addLast(data);
        //找到插入位置的前一个结点
        Node cur = findIndex(index);
        Node node = new Node(data);
        //把结点插入制定位置
        node.next = cur.next;
        cur.next = node;
    }

    //找到index位置的前一位置的地址
    public Node findIndex(int index) {
        Node cur = this.head;
        while (index - 1 > 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //删除第一次出现关键字key的结点
    //对于删除第一次出现的key值的节点，若不是头节点，我们只需将key值对应的节点的前一节点的next的域改为key值对应的节点的next域即可。
    //对于头节点，直接head = head.next即可。
    //对于key值对应的节点的前一节点，我们可以写一个函数来找到它，方便后续的代码书写
    public void remove(int key){
        if (this.head ==null){
            return;
        }
        if(this.head.val == key){
            this.head = this.head.next;
        }
        Node pre = findPre(key);
        if(pre == null){
            return;//没有要删除的结点
        }
        Node node = pre.next;
        pre.next = node.next;
    }

    //找到key的前驱
    public Node findPre(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.val == key){
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    //删除所有值为key的结点
    public Node removeAllKey(int key){
        if (this.head == null){
            return null;
        }
        Node pre = this.head;
        Node cur = this.head.next;
        while (cur != null){
            if (cur.val == key){
                pre.next = cur.next;
            }else {
                pre = cur;
            }
            cur = cur.next;
        }
        if (this.head.val == key){
            this.head = this.head.next;
        }
        return this.head;
    }

    //清空链表
    public void clear(){
        while (this.head != null){
            Node node = this.head.next;
            this.head.next = null;
            this.head = node;
        }
    }
}
