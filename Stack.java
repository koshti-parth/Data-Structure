class Stack{
     Object arr[];
    private static  int DEFAULT = 5;
    private static int idx = -1;

    public Stackp() {
        this.arr = new Object[DEFAULT];
    }


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public void push(E item){
        idx++;
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }


        arr[idx] = item;
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return idx;
        }

        Object removal = arr[idx];
        arr[idx] = 0;
        idx--;
        return removal;

    }
    public  boolean isFull() {
        if(idx == arr.length){
            return true;
        }
        return false;
    }
    public void i(){
        System.out.println(idx);
    }
    public  boolean isEmpty() {
        return idx == -1;
    }



}