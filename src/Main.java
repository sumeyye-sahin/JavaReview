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


        System.out.println(komut +" "+ num);*/


        char grade = 'a';

        switch (grade) {
            case 'a':
                System.out.println("tebrikler");
                break;

            case 'b':
                System.out.println("fena değil");
                break;

            default:
                System.out.println("Geçersiz not");
        }

    }


}