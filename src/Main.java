//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //  System.out.println("Hello and welcome!");
        //System.out.println("Merhaba java");
        /*
        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }*/
/*
        String komut =  "Deneme";
        System.out.println(komut);

        int num = 6;


        System.out.println(komut +" "+ num);


        char grade = 'b';

        switch (grade) {
            case 'a':
                System.out.println("tebrikler");
                break;

            case 'b':
            case 'c':
                System.out.println("fena değil");
                break;

            default:
                System.out.println("Geçersiz not");
        }*/

        // for
/*
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
*/
/*
        int i =0;
        while (i<10){
            System.out.println(i);

            i++;
        }

        String[] students = new String[3];

        students[0]="Halis";
        students[1]= "Sumeyye";
        students[2]="Sahin";

        for (int i = 0 ; i<students.length;i++){
            System.out.println(students[i]);
        }

        for (String student : students){
            System.out.println(student);
        }

        String[][] multiArray = new String[2][3];*/

        CustomerManager customerManager = new CustomerManager();
        customerManager.Add();
        customerManager.Update(); 



    }


}