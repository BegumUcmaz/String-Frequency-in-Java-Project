import java.util.Map;

public class UniqueWordsInParagraphHandler {
	public static void Welcome() {

		System.out.println(UniqueWordsInParagraphConstants.ThisIsTheParagraphMessage);
		System.out.println(UniqueWordsInParagraphConstants.ParagraphForUniqueWords);

		System.out.println(UniqueWordsInParagraphConstants.UniqueWordsMessage);
	}

	public static void FindUniqueWords() {
		String paragraphForUniqueWords = UniqueWordsInParagraphConstants.ParagraphForUniqueWords;
		Map<String, Integer> uniqueWords = UniqueWordsInParagraphHelper.CountTheUniqueWords(paragraphForUniqueWords);
		UniqueWordsInParagraphHelper.printFrequency(uniqueWords);
	}

}
