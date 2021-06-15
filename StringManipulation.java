public class StringManipulation {
  public static void main(String args[]){
    String greeting="Hello";
	System.out.println(greeting);
	   String txt2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   System.out.println("The length of the txt string is:"+
	        txt2.length());
String txt="Hello World";
System.out.println(txt.toUpperCase());
System.out.println(txt.toLowerCase());
     String firstName="john";
	 String lastName="Doe";
	 System.out.println(firstName + " " + lastName);
	  String firstNamee="john";
	  String lastNamee="Doe";
      System.out.println(firstNamee.concat(lastNamee));

String x="10";
String y="20";
String z=x+y;
System.out.println(z);

String a="RockStar";
    System.out.println(a.charAt(3));
	System.out.println(a.compareTo("Rockstar"));
	System.out.println(a.compareToIgnoreCase("ROCKSTAR"));
	System.out.println(a.replace("Rock","New"));
}
}