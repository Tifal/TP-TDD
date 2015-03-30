package iut.tdd;

import java.util.HashMap;

public class Convert {
	public static String num2text(String input) {
		HashMap<String,String>Map=new HashMap<String,String>();
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
		return Map.get(input);
	}
	public static String text2num(String input) {
		return input;
	}
}