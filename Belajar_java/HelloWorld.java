public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World !");
		car bmw = new car(); //bangun object mobil bmw
		bmw.merk = "BMW M850i";
		bmw.maju();
		
		car ford = new car();
		ford.merk = "Ford Mustang GT500";
		ford.maju();
	}
} 

class car{
	//attribut
	public String merk;
	//method
	public void maju(){
		System.out.println("Mobil "+this.merk+" maju !!! Brmm...");
	}
}