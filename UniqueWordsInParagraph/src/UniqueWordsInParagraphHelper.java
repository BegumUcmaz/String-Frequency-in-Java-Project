import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.util.*;

public class UniqueWordsInParagraphHelper {

	public static Map<String, Integer> CountTheUniqueWords(String paragraphForUniqueWords) {

		// Camel Case, Lower Case ve Upper Case kelimelerin birbirinden farklý olmasýný
		// engellemek için
		paragraphForUniqueWords = paragraphForUniqueWords.toLowerCase();

		String[] words = paragraphForUniqueWords.split(UniqueWordsInParagraphConstants.RegExForSplitWords);

		int count = 0;

		Map<String, Integer> uniqueWordsMap = new HashMap<String, Integer>();
		ArrayList<String> uniqueWords = getUniqueWords(words);

		for (String uniqueWord : uniqueWords) {
			if (uniqueWord != null) {

				// Arraydeki ayný elemanlarý sayar.
				for (String word : words) {

					if (uniqueWord.equals(word)) {
						count++;
					}
				}

			}
			// Textde sadece 1 defa geçen kelimeleri kontrol eder.
			if (count == 1) {
				uniqueWordsMap.put(uniqueWord, count);
			}

			count = 0;

		}
		return uniqueWordsMap;
	}

	// Dizideki tekrarlanan kelimeleri siler.
	private static ArrayList<String> getUniqueWords(String[] words) {

		ArrayList<String> uniqueWords = new ArrayList<String>();

		for (String word : words) {
			if (!uniqueWords.contains(word)) {
				uniqueWords.add(word);
			}
		}

		return uniqueWords;
	}

	// Frekansý Yazdýrýr.
	public static void printFrequency(Map<String, Integer> map) {

		Set set = map.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();

			System.out.println("Word : " + mentry.getKey() + " - Count : " + mentry.getValue());

		}

	}
}
