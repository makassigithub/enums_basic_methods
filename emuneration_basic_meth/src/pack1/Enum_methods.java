package pack1;

public class Enum_methods {
	
	enum HOUSES { CONDO,TOWNHOME,DUPLEX,APPARTMENT,HOUSE}
	enum STREETS {CARTIER,POINTE,AVILLON,CHAMBLY,GRANDE_ALLEE}

	public static void main (String...args){
		
		
		System.out.println("Print the index of each constant");
		
		// the ordinal() return an 'int' that is the index of the enumeration in in emun object.
		System.out.println("\nfor the Houses");
		for (HOUSES hs:HOUSES.values()){
			System.out.println(hs+" :"+ hs.ordinal());
		};
		System.out.println("\nFor the streets");
		for (STREETS st : STREETS.values()){
			System.out.println(st+" :"+ st.ordinal());
		}
		// the compareTo() returns an 'int', the ordinals of enumeration constant.
		//That's the difference between the ordinals
		System.out.println("\nNow let's use the compare()");
		
			
		HOUSES house1 ,house2,house3;
		
		house1 = HOUSES.APPARTMENT;
		house2 = HOUSES.CONDO;
		house3 = HOUSES.DUPLEX;
		
		
		System.out.println("If ordinal_x > ordinal_y, x.compare(y) returns positive value"+"\n"+
		house1.compareTo(house2));
		System.out.println("If ordinal_x < ordinal_y, x.compare(y) returns negative value"+"\n"+
		house2.compareTo(house1));
		System.out.println(" x.compare(x) return 0"+"\n"+
		house3.compareTo(house3));
		System.out.println(house1.compareTo(house3));
		
		System.out.println("\nNow let's use the equals()");
		
		System.out.println("It return false if the references do not point the the same enum constant"+"\n" +
	    house1.equals(house1) + "\n" +
		house1.equals(house2));
		
		// the equals() returns a boolean by using the ordinal to compare two enum constants
		
		
	}
}
