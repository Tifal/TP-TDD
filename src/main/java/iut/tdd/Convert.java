package iut.tdd;

import java.util.HashMap;

public class Convert {
	static HashMap<String,String>Map=new HashMap<String,String>();
	static {
		Map.put("0", "zéro");
		Map.put("1", "un");
		Map.put("2", "deux");
		Map.put("3", "trois");
		Map.put("4", "quatre");
		Map.put("5", "cinq");
		Map.put("6", "six");
		Map.put("7", "sept");
		Map.put("8", "huit");
		Map.put("9", "neuf");
		Map.put("10", "dix");
		Map.put("11", "onze");
		Map.put("12", "douze");
		Map.put("13", "treize");
		Map.put("14", "quatorze");
		Map.put("15", "quinze");
		Map.put("16", "seize");
		Map.put("20", "vingt");
		Map.put("30", "trente");
		Map.put("40", "quarante");
		Map.put("50", "cinquante");
		Map.put("60", "soixante");
	}
	
	public static String num2text(String input) {
		
		int numb=Integer.parseInt(input);
		if(numb<17){
			return Map.get(input);
	}
		else if(numb%10==0&&numb<61){
			return Map.get(input);
		}
		else {
			return Map.get(""+(numb/10)*10)+"-"+Map.get(""+(numb-(numb/10)*10));
		}
	}
	public static String text2num(String input) {
		return input;
	}
}