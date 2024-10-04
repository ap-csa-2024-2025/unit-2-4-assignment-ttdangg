import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    stringManip("hello","bye");
  }
  public static lastFirstN(String s1, String s2, int n)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Give a string: ")
    String s1 = sc.nextLine();

    System.out.println("Give a string: ")
    String s2 = sc.nextLine();

    System.out.println("Give a number: ")
    int n = sc.nextInt();
  }

  public static void stringManip(String word1, String word2)
  {
    String word1_upper = word1.toUpperCase();
    String word2_upper = word2.toUpperCase();
    String word2_lower = word2_upper.substring(0,1) + word2.substring(1);
    System.out.println(word1_upper);
    System.out.println(word2_lower);
  }
}
