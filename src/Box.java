import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Box <T extends Fruit> {
    Object obj;

    ArrayList<T> box = new ArrayList();

    public Box(T... obj){
        box = new ArrayList<>(Arrays.asList(obj));
    }

    public void add(T obj){
        box.add(obj);
    }
     public void moveAt(Box<T> anotherBox){

         anotherBox.box.add((T) obj);
                this.box.clear();
     }



    public void info(){
        if (box.isEmpty()){
            System.out.print("Коробка пустая");
        }else {
            System.out.println("В коробке " +box.get(0).toString() + " их вес равен " + box.size());
        }
     }

     public double getWeight() {
        if (box.isEmpty()){
            return 0;
        } else {
            return box.size() * box.get(0).getWeight();
        }
     }

     public  boolean compare(Box<? extends Fruit>box){
       if( this.getWeight() == box.getWeight()){
           return true;
       }

         return false;
     }


    public List<T> getBox() {
        return box;
    }

    public void setBox(List<T> box) {
        this.box = (ArrayList<T>) box;
    }



}
