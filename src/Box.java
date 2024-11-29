public class Box <T>{
    private T type;

    public T get() {
        return type;
    }

    public void set(T type) {
        this.type = type;
    }
    public boolean isEmpty(){
        return type == null;
    }
    public void clear(){
        type = null;
    }
}
