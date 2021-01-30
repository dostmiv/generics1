
public class Main{
	public static void main(String[] args) {
		Character[] charlist = {'J','A','V','A'};
		String[] stringlist = {"Og","re","ni","yo","rum"};
		
		employee[] employeelist = {new employee("bela", "kulak"),new employee("kudret", "yener")};
		employee e = employeelist[0];
		generic<employee> sortemployee = new generic<employee>();
		generic<Character> sortchar = new generic<Character>();
		generic<String> sortstring = new generic<String>();
		
		System.out.println("that is it");
		sortemployee.sortit(employeelist);
		sortchar.sortit(charlist);
		sortstring.sortit(stringlist);
		System.out.println("asdqweqfas");
		System.out.println(e);
		//burda toString() methodu hatirlanmasi gerenken bir bilgidir.
		//bir objeyi cagirdigimizda onu belirledigimiz bir String degeri olarak 
		//donduruyor.
		
	}
}