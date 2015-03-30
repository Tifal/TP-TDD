package iut.tdd;

public class Convert {
	public static String num2text(String input) {
		if(input.equals("0")){
			return "zéro";
		}
		if(input.equals("1")){
			return "un";
		}
		if(input.equals("2")){
			return "deux";
		}
		if(input.equals("3")){
			return "trois";
		}
		if(input.equals("4")){
			return "quatre";
		}
		if(input.equals("5")){
			return "5";
		}
		if(input.equals("6")){
			return "six";
		}
		if(input.equals("7")){
			return "sept";
		}
		if(input.equals("8")){
			return "huit";
		}
		if(input.equals("9")){
			return "neuf";
		}
		else{
			return "Non entre 0 et 9";
		}
	}
	public static String text2num(String input) {
		return input;
	}
}