package exo6;

public class Person {
    private final String name;
    static int numberMaxOfEyes = 2;
    private final String eyesColor;
    static int numberMaxOfFingers= 10;
    private final double size;
    private final String firstname;
    private final String language;
    private final String skinColor;


 public Person(String name, String eyesColor, double size, String firstname, String language, String skinColor) {
  this.name = name;
  this.eyesColor = eyesColor;
  this.size = size;
  this.firstname = firstname;
  this.language = language;
  this.skinColor = skinColor;
 }

 public void describeYourSelf(){
  System.out.println("Je suis un humanoide qui a "+numberMaxOfEyes+ " yeux et "+numberMaxOfFingers+" doigts au maximum.");
  System.out.println("Je m'appelle "+firstname +" "+name+", je mesure "+size+" mètres. Je parle "+language+". Je suis "+skinColor+" et mes yeux sont "+eyesColor+".");

 }
}
