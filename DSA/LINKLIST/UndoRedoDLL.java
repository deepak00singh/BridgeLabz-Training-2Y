
class State{
    String text;
    State prev,next;

    State(String t){text=t;}
}

public class UndoRedoDLL{

    static State current=null;

    static void addState(String t){
        State s=new State(t);
        if(current!=null){
            current.next=s;
            s.prev=current;
        }
        current=s;
    }

    static void undo(){
        if(current.prev!=null) current=current.prev;
    }

    static void redo(){
        if(current.next!=null) current=current.next;
    }

    static void show(){
        if(current!=null)
            System.out.println(current.text);
    }

    public static void main(String[] args){
        addState("Hello");
        addState("Hello World");
        undo();
        show();
        redo();
        show();
    }
}
