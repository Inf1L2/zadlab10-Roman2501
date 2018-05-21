package zad5;





import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad5{
  
        
  
  public static void zapisz(){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Podaj swoje imię");
	  String imie = input.nextLine();
try{
	  PrintWriter zapis = new PrintWriter("imie.txt");
	  zapis.print(imie);
	  zapis.close();
          System.out.println("wpisano");
          
}
catch(IOException e){
    System.out.println("bład IOException ");
}
  }
public static void odczytaj() {
try{
	  Scanner odczyt = new Scanner(new File("imie.txt"));
	  System.out.println(odczyt.nextLine());
}
          catch(FileNotFoundException e){
            System.out.println(" nie istnieje!");
        } catch(IOException e){
            System.out.println("błąd IOException");
        }
          
}
public static void main(String[] args){
              zapisz();
              odczytaj();
          }
}
