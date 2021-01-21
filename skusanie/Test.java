package lubos.sukup.main.skupinaB.skusanie;

public class Test {

    public static void main(String[] args) {
        int i =0;

        while (i <10) {

            i++;

            if(i ==5){

                System.out.println(" ------------------------ toto je cislo 5 a beh 5teho cyklu konci  ---------------------------");
                // ak je i = 5 tak sa nam nevykona riadko 19 ale zacina novy cyklus
                break;
            }

            System.out.println( " cyklus cislo: " + i + "Lubos Sukup");

        }

        // break ide az tu.
    }

}
