package kr.co.ezen;

public class MainEx {

	

	public static void main(String[] args) {
		
		Person kim0 = new Person();
	
		
		kim0.setSsn("1996");
		kim0.setAge(19);
		kim0.setDog(new Dog("happy", "Park", "123", "555"));
		kim0.setName("Park");
		kim0.setCar(new Car("k7"));
		
		
		
		System.out.println(kim0.getSsn());
		System.out.println(kim0.getName());
		System.out.println(kim0.getCar());
		System.out.println(kim0.getAge());
		System.out.println(kim0.getDog());
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}