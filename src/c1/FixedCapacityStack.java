package c1;

public class FixedCapacityStack<E> {
    private E[] e;
    private int N;

    public FixedCapacityStack() {
        e = (E[]) new Object[16];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void push(E s) {
        if (e.length == N){
            e = resize();
        }
        e[N++] = s;
    }

    public E pop() {
        return e[--N];
    }
    private E[] resize(){

        E[] tmp = (E[]) new Object[e.length*2];
            for (int i = 0; i < e.length; i++) {
                tmp[i] = e[i];
            }

        return tmp;

    }
}
