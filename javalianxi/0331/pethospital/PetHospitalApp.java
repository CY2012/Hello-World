package pethospital;

class PetHospitalApp{
	public static void main(String[] args){
	    Vet v = new Vet("¿ÂÄÏ");
		Dog tom = new Dog("tom");
		Cat rose = new Cat("rose");
		Mouse jerry = new Mouse("jerry");
		Snake jack = new Snake("jack");
		Lizard jane = new Lizard("jane");
		
		
		v.giveShot(tom);
		v.giveShot(rose);
		v.giveShot(jerry);
		v.giveShot(jack);
		v.giveShot(jane);
		
	}
}
