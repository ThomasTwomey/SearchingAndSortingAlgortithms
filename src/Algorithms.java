import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> words){
		int index = 0;
		for(int i = 0; i < words.size(); i++){
			if(words.get(i).equals("cracked")){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static int countPearls(List<Boolean> oysters){
		int num = 0;
		for(Boolean tf: oysters){
			if(tf == true){
				num++;
			}
		}
		return num;
	}
	
	public static double findTallest(List<Double> peeps){
		double tallest = 0;
		for(double b: peeps){
			if(b>tallest){
				tallest = b;
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words){
		int length = 0;
		int pos = 0;
		for(int i = 0; i < words.size(); i++){
			if(words.get(i).length() > length){
				length = words.get(i).length();
				pos = i;
			}
		}
		return words.get(pos);
	}
	
	public static boolean containsSOS(List<String> words){
		boolean tf = false;
		for(String s: words){
			if(s.contains("... --- ...")){
				tf = true;
			}
		}
		return tf;
	}
	
	public static List<Double> sortScores(List<Double> scores){
		double temp = 0;
		for(int i = 0; i < scores.size(); i++){
			for(int j = i+1; j < scores.size(); j++){
				if(scores.get(i) > scores.get(j)){
					temp = scores.get(j);
					scores.set(j, scores.get(i));
					scores.set(i, temp);
				}
			}
		}
		return scores;
	}
	
	public static List<String> sortDNA(List<String> dna){
		String temp = "";
		for(int i = 0; i < dna.size(); i++){
			for(int j = i+1; j < dna.size(); j++){
				if(dna.get(i).length() > dna.get(j).length()){
					temp = dna.get(j);
					dna.set(j, dna.get(i));
					dna.set(i, temp);
				}
			}
		}
		return dna;
	}
	
	public static List<String> sortWords(List<String> words){
		String temp = "";
		for(int i = 0; i < words.size(); i++){
			for(int j = i+1; j < words.size(); j++){
				if(words.get(i).compareTo(words.get(j)) > 0){
					temp = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		return words;
	}
}
