import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int x,y,z;
    System.out.println("podaj wartosc liczb \n x=\n y=\n z=\n");
    x=scanner.nextInt();
    y=scanner.nextInt();
    z=scanner.nextInt();
    if(x>y && x>z)
    {
      System.out.println("X jest największe ");
    }
    else if(y>x && y>z)
    {
       System.out.println("y jest największe ");
    }
    else if(z>x && z>y)
      System.out.println("z jest najwieksze  ");


    }


}