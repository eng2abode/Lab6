import java.util.Scanner;

public class TestCircularly {
    public static void main(String[] args) {
        CircularLinkedList<String>list= new CircularLinkedList<>();
        Scanner in= new Scanner(System.in);
        int choice=-1;
        System.out.println("1 add first\t2 add last\t 3 rotate\t4 remove first\t 0 exit");
        while (choice!=0)
        {
            System.out.print("your choice:");
            choice=in.nextInt();
            switch (choice)
            {case 1:
                System.out.println("input name");
                list.addFirst(in.next());
                break;
                case 2:
                    System.out.println("input name");
                    list.addLast(in.next());
                    break;
                case 3:
                    list.rotate();
                    break;
                case 4:
                    System.out.println("removed is "+list.removeFirst());
                    break;

        }
            System.out.println("first= "+list.first()+"\t last= "+list.last()+"\tsize= "+list.size());
    }
}}

