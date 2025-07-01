public class ObjectDEmo  {
    

    @Override
    public String toString(){
        return super.toString();
    }

    @Override
    public void finalize() throws Throwable{
        super.finalize();
    }
    int num;

    public ObjectDEmo(int num){
        this.num = num;
    }

    @Override
    public int hashCode(){
        return num;
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    public static void main(String[] args) {
        ObjectDEmo obj = new ObjectDEmo(34);
        ObjectDEmo obj1 = new ObjectDEmo(34);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }

}
