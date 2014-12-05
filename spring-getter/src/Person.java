import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


@SuppressWarnings("unchecked")
class Person implements Comparable 
{
  public String name;
  public String lastName;
 
  public Person(String name, String lastName){
     this.name=name;
     this.lastName=lastName;
  }
  public String getName(){
    return name;
  }
  public String getLastName(){
    return lastName;
  }
  public int compareTo(Object o) {
	  System.out.println("inside compare to method========>>>>>>>>>");
		Person p=(Person) o;
		return this.name.compareTo(p.name);
	}
  public static void main(String arg[]){
        List<Person> myList = new ArrayList<Person>();
 
    myList.add(new Person("Robert","USA"));
    myList.add(new Person("Andy","UK"));
    myList.add(new Person("Harish","India"));
    Collections.sort(myList);
    for(Person person : myList){
     System.out.println("My name is "+person.getName());
    }
  }



 }