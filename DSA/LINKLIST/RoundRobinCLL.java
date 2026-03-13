
class Process{
    int id,burst,priority;
    Process next;

    Process(int i,int b,int p){
        id=i;burst=b;priority=p;
    }
}

public class RoundRobinCLL{

    static Process head=null;

    static void add(int i,int b,int p){
        Process pr=new Process(i,b,p);
        if(head==null){
            head=pr;
            pr.next=head;
            return;
        }
        Process t=head;
        while(t.next!=head) t=t.next;
        t.next=pr;
        pr.next=head;
    }

    static void display(){
        if(head==null) return;
        Process t=head;
        do{
            System.out.println("P"+t.id+" BT:"+t.burst);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        add(1,5,1);
        add(2,3,2);
        display();
    }
}
