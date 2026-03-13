
class Item{
    int id,qty;
    String name;
    double price;
    Item next;

    Item(int i,String n,int q,double p){
        id=i;name=n;qty=q;price=p;
    }
}

public class InventorySLL{

    static Item head=null;

    static void add(int i,String n,int q,double p){
        Item it=new Item(i,n,q,p);
        it.next=head;
        head=it;
    }

    static double totalValue(){
        double sum=0;
        Item t=head;
        while(t!=null){
            sum+=t.qty*t.price;
            t=t.next;
        }
        return sum;
    }

    static void display(){
        Item t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.name+" "+t.qty+" "+t.price);
            t=t.next;
        }
    }

    public static void main(String[] args){
        add(1,"Mouse",10,500);
        add(2,"Keyboard",5,1000);
        display();
        System.out.println("Total Value="+totalValue());
    }
}
