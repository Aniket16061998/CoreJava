package com.te.true2java.FinalReferenceVariable;

public class Controller {

	public static void main(String[] args) {
		
		Student s1 = new Student("Aniket",25,"aniket@gmail.com",new Address("pune","Maharashtra","Country"));
        System.out.println(s1.getName());
        s1.getAddress().setCity("Mumbai");
        System.out.println(s1.getAddress());
        System.out.println(s1.getClass());
        String a = "Aniket";
        String b = "ndndfv";
        System.out.println(a.equals(b));
	}

}
