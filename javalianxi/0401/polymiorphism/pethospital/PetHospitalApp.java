package pethospital;

class PetHospitalApp{
	public static void main(String[] args){
	    Vet v = new Vet("柯南");

		Animal tom = new Dog("tom");
		Cat rose = (Cat)animal

		//Animal rose = new Cat("rose");
		Animal jerry = new Mouse("jerry");
		Animal jack = new Snake("jack");
		Animal jane = new Lizard("jane");
		
		
		v.giveShot(tom);
		v.giveShot(rose);
		v.giveShot(jerry);
		v.giveShot(jack);
		v.giveShot(jane);

		System.out.println("共" + Animal.getCount + "宠物被治疗");
		
	}
}
