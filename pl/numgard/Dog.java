package pl.numgard;

 class Dog {
	
	 int size;
	 String breed;
	 String name;
	 
	 void bark(String x){
		 
		 System.out.println(name + " woof woof" + x);
		 
	 }

}

 
/*main
 Dog dog1 = new Dog();
	dog1.size = 40;
	dog1.bark(" bark!");
	dog1.name = "azor";
	
	Dog[] myDogs = new Dog[3];
	myDogs[0] = new Dog();
	myDogs[1] = new Dog();
	myDogs[2] = dog1;
	
	
	myDogs[0].name = "szarik";
	myDogs[1].name = "dupa";
	
	System.out.println("last dog name is " + myDogs[2].name);
	int x =0;
	while(x < myDogs.length){
		
		myDogs[x].bark(" bark!");
		x = x + 1;
		
	}*/