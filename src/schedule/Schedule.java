/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schedule;

/**
 *
 * @author Gabriel Aragon
 */
public class Schedule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName="Gabriel";
        String lastName="Aragon";
        int gradYear=2020;
        
        System.out.println("My name is " + firstName + " " + lastName + " and I'll graduate in " + gradYear);
        
        int periodOne=1;
        int periodTwo=2;
        int periodThree=3;
        int periodFour=4;
        int periodFive=5;
        int periodSix=6;
        int periodSeven=7;
        
        String classOne="Hon Global Studies          |   Mr. Marti|";
        String classTwo="AP Computer Science         |Mr. Larrubia|";
        String classThree="English Accelerated         |   Mr. Ulloa|";
        String classFour="Hon French 3                | Madame Pugh|";
        String classFive="America History Accelerated | Mr. Benitez|";
        String classSix="Hon Algebra 2 & Trig        |Mrs. Leonard|";
        String classSeven="Hon Physics                 |Mr.Rodriguez|";
        
        System.out.println("------------------------------------------------");
        System.out.println("|" + periodOne + "|   " + classOne);
        System.out.println("|" + periodTwo + "|   " + classTwo);
        System.out.println("|" + periodThree + "|   " + classThree);
        System.out.println("|" + periodFour + "|   " + classFour);
        System.out.println("|" + periodFive + "|   " + classFive);
        System.out.println("|" + periodSix + "|   " + classSix);
        System.out.println("|" + periodSeven + "|   " + classSeven);
        System.out.println("------------------------------------------------");
    }
    
}
