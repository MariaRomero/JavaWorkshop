/**
 * London Java Community - "Introduction to Java" Workshop - Tue 20 Sep 2016
 * 
 * Mike Burton  mikeb [at] mycosystems.co.uk
 * 
 */
package association;

/**
 *  Section 3. Association
 */
public class Demo {

	public static void main(String[] args) {

		House myHouse= new House( "Maria", 7 );
		System.out.println( myHouse );

		Door front= new Door( "Front", 82, true );
        Door back= new Door( "Back", 160, true );
		System.out.println( front );
        System.out.println( back );
		myHouse.addDoor(front);
		myHouse.addDoor(back);
		System.out.println( myHouse );	/* Dont expose / leak doors[] */


		// Slide: Design considerations: 
		// Custody: Who creates, owns, moves, removes the Door 
		//  What if I add my Door to your House?
		// Can 2 houses share same door (adjoining?) or might need methods to
		//  .removeDoor() .moveDoorNumber( 2, h2 )

	}

}
