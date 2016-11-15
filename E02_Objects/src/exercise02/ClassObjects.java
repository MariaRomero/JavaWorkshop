/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package exercise02;

/**
 *  Exercise 2. Objects
 */
public class ClassObjects {

	public static void main(String[] args) {

        Person maria = new Person("maria", 34, 5.2);
        System.out.println(maria.age);
        System.out.println(maria.height);
        maria.eat(1);
        System.out.println(maria.height);

        Person jean = new Person("maria", 34, 5.2);

        if (maria.equals(jean)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        };
        System.out.println(maria.hashCode());
        System.out.println(jean.hashCode());

        // 1. Create a class  Person  to encapsulate the data from previous exercise (age, height) also name
		//    Make sure all data is private.
		//	  Consider which data can change during the "Lifetime" of the Person (hint: final fields can
		//    be initialised in a constructor)

		// 2. Add suitable methods such as toString() and eat() (eating makes you taller!) 
		//    Add suitable getXyz() and setXyz() methods
		//    Write code here to test these features of your Person class

		// 3. Add a constructor and test by coding: p= new Person("Fred", 21, 5.8);

		// 4. Enable one Person to be copied to another and test by coding: Person p2= new Person(p)
		//	  Check that p and p2 actually refer to two different objects

		// 5. Provide a suitable Person.equals() method and test it

		// 6. If time, create and display an array of Person objects

		// 7. If time, change the age field and getAge() method to something more suitable
		//    hint: research the Java8 API for LocalDate

	}

}
