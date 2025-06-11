package Codigo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       // criar pessoa
       LocalDate dataP1= LocalDate.now().withYear(2005).withMonth(5).withDayOfMonth(2);
        Pessoa p1 = new Jurado("Josué","1234",dataP1,"Eng de software",10000.00,10);



}
}