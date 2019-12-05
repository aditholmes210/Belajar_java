public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World !");
		mobil bmw = new mobil(); //bangun object mobil bmw
		bmw.merk = "BMW M850i";
		bmw.maju();
		
		mobil ford = new mobil();
		ford.merk = "Ford Mustang GT500";
		ford.maju();
	}
} 

class mobil{
	//attribut
	public String merk;
	//method
	public void maju(){
		System.out.println("Mobil "+this.merk+" maju !!! Brmm...");
	}
}