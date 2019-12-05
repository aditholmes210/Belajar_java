public class tambahDua{
	public static void main (String[] args){
		if(args.length > 0 && args.length == 2){
			int num = Integer.parseInt(args[0]);
			int num1 = Integer.parseInt(args[1]);
			int hasil = num + num1;
			System.out.println(hasil);
		}
		else {
			System.out.println("Nte aya deui");
		}
	}
}