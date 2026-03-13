
class Ticket{
    int id;
    String customer,movie,seat,time;
    Ticket next;

    Ticket(int i,String c,String m,String s,String t){
        id=i;customer=c;movie=m;seat=s;time=t;
    }
}

public class TicketReservationCLL{

    static Ticket head=null;

    static void add(int i,String c,String m,String s,String t){
        Ticket tk=new Ticket(i,c,m,s,t);
        if(head==null){
            head=tk;
            tk.next=head;
            return;
        }
        Ticket temp=head;
        while(temp.next!=head) temp=temp.next;
        temp.next=tk;
        tk.next=head;
    }

    static void display(){
        if(head==null) return;
        Ticket t=head;
        do{
            System.out.println(t.id+" "+t.customer+" "+t.movie);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        add(1,"Deepak","Avengers","A1","10AM");
        add(2,"Rahul","Avatar","B2","1PM");
        display();
    }
}
