class Stack {
    private int minSize;
    private char[] stackArray;
    private int tp;

    public Stack(int m) {
        this.minSize = m;
        stackArray = new char[minSize];
        tp = -1;
    }

    public void add(char element) {
        stackArray[++tp] = element;
    }

    public char delete() {
        return stackArray[tp--];
    }


    public boolean isEmpty() {
        return (tp == -1);
    }


}