package pkg2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tester {

	public static void main(String args[]){
		
     	double startTime = System.currentTimeMillis(), endTime;
     	
//     	for Regex.java
//		String input = "25.25,";
//		/*String matcher = "([0-9]{1,2})([.])([[0-9]{1,2}[.]]+[ ,]*)";*/
//		String matcher = "((([0-9]{1,2})[.]([0-9]{1,2}))+( )*(,)*( )*)+";
//		System.out.println(Pattern.matches(matcher, input));
//		System.out.println(input.replace(" ", " "));
//		Regex re = new Regex();
//		boolean returned = re.inputValidator(input);
//		System.out.println(returned);
		
//     	for Decorate.java and CopyOfDecorate.java
     	String sourceInput = "there, they. is- very their's problems IS Is Other OTHER Another ANOTHER someone more book example Shopping";
		String[] output;
		boolean StemmerOption = true;
		
		Tester oneTest = new Tester(); 
		sourceInput = sourceInput.replaceAll("[^a-zA-z' ]", "");
		System.out.println(sourceInput);
		String[] sourceInputSplited = sourceInput.split(" ");
		WordMatcher newStemmer = new WordMatcher();
		Integer sourceStringLength = Integer.valueOf(sourceInputSplited.length);
		sourceInputSplited = oneTest.convertToLowerCase(sourceInputSplited, sourceStringLength);
		String[] sourceStopWordsRemoved = oneTest.stopWordsRemover(sourceInputSplited, sourceStringLength);
		if(StemmerOption){
			output = newStemmer.matchedWords(sourceStopWordsRemoved, sourceStopWordsRemoved.length);
		} else {
			output = sourceStopWordsRemoved;
		}
		Integer sourceArrayLength = Integer.valueOf(output.length);
		endTime = System.currentTimeMillis();
		for(int iterator = 0; iterator<sourceArrayLength.intValue(); iterator++ ){
			System.out.println(output[iterator]);
		}
		System.out.println(endTime-startTime);
     	
//		For CopyOfDecorate.java with the decoration removal
//		startTime1 = System.currentTimeMillis();
//		//String deDecoratorIntput = " The <font style=\"background-color:yellow;\">new</font> <font style=\"background-color:yellow;\">world</font> has been <font style=\"background-color:yellow;\">a</font> whole different ride along the coast ";
//	    String deDecoratorOutput = newDecorate.deDecorate(output);
//	    System.out.println(" "+deDecoratorOutput+" ");
//	    endTime1 = System.currentTimeMillis();
//	    System.out.println(endTime-startTime);
//	    System.out.println(endTime1-startTime1);
     	
     	
//      for CountWords.java
//     	startTime1 = System.currentTimeMillis();
//     	CountWords count = new CountWords();
//     	//String inputString = "1-10 1-10 1-10 see supplemental sheet Box V Reasoned statement with regard to novelty,  inventive step and industrial applicability; citations and explanations supporting such statement Reference is made to the following documents: D1 EP 2 006 560 A2 (NTN TOYO BEARING CO LTD [JP]; ISHIKAWAJIMA HARIMA HEAVY IND [JP]) 24 December 2008 (2008-12-24) D2 DE 42 36 847 A1 (SCHAEFFLER WAELZLAGER KG [DE]) 5 May 1994 (1994-05-05) D3 JP 2009 236314 A (NSK LTD) 15 October 2009 (2009-10-15) D4 JP 2008 309312 A (NTN TOYO BEARING CO LTD) 25 December 2008 (2008-12-25) D5 US 5 149 208 A (ZORNES DAVID A [US]) 22 September 1992 (1992-09-22) D6 WO 2011/032081 A1 (TIMKEN CO [US]; EVANS RYAN D [US]; SHILLER PAUL J [US]; PIERMAN DAVID) 17 March 2011 (2011-03-17) Independent claim 1 The present application fails to comply with the requirements of PCT Article 33(2) because the subject matter of claim 1 is not novel. Document D1 discloses a cage (5, 6) for a rolling bearing (claim 1), the cage comprising a main body (5) made of a first material (description, paragraphs [0041]-[0043]) as well as contact elements (6) made of a second material (description, paragraphs [0041]-[0043]), which contact elements are arranged at friction-loaded or impact-loaded points (figure 1) of the main body. Furthermore, documents D2-D6 likewise disclose all the features of independent claim 1. Dependent claims 2-10 Claims 2-10 do not contain any features which, in combination with the features of any claim to which they refer, meet the requirements of the PCT in respect of novelty and/or inventive step. The reasons are as follows: The additional features of claims 2-10 are disclosed in at least one of documents D1-D6.";
//     	String inputString = "1-9 1-9 1-9 See Supplemental Box. Box V Reasoned statement with regard to novelty, inventive step and industrial applicability; citations and explanations supporting such statement Reference is made to the following documents: D1 DE 11 09 470 B (WILHELM T MUELLER) 22 June 1961 (1961-06-22) D2 US 5 174 583 A (ORLOWSKI DAVID C [US] ET AL) 29 December 1992 (1992-12-29) The present application fails to comply with the requirements of PCT Article 33(2) because the subject matter of claim 1 is not novel. D1 discloses: a sealing element for sealing a cylindrical inner surface of a first machine component (3) and a cylindrical outer surface of a second machine component (4), comprising: - an inner ring (2), - an additional ring (6) arranged coaxially to the inner ring (2), which additional ring is connected to a part of an outer lateral surface (2d) of the inner ring (2), - an outer ring (1) arranged coaxially to the inner ring (2), and - a sealing gap which is formed by an external lateral surface of the inner ring (2), an internal lateral surface of the outer ring (1) and by an external lateral surface and an end face of the additional ring (6) and which in an axial section through the common axis (A) of the inner ring (2), the outer ring (1) and the additional ring (6) has a meandering profile. The present application fails to comply with the requirements of PCT Article 33(2) because the subject matter of claim 1 is not novel. Dependent claims 2-9 do not contain any features which, in combination with the features of any claim to which they refer, meet the requirements of the PCT in respect of novelty and/or inventive step; see D1-D2.";
//     	System.out.println(count.wordCounter(inputString));
//     	endTime1 = System.currentTimeMillis();
//	    System.out.println(endTime1-startTime1);
	    
//      for CountWords.java, for russian language
//		startTime1 = System.currentTimeMillis();
//     	CountWords count = new CountWords();
//     	//String inputString = "1-10 1-10 1-10 see supplemental sheet Box V Reasoned statement with regard to novelty,  inventive step and industrial applicability; citations and explanations supporting such statement Reference is made to the following documents: D1 EP 2 006 560 A2 (NTN TOYO BEARING CO LTD [JP]; ISHIKAWAJIMA HARIMA HEAVY IND [JP]) 24 December 2008 (2008-12-24) D2 DE 42 36 847 A1 (SCHAEFFLER WAELZLAGER KG [DE]) 5 May 1994 (1994-05-05) D3 JP 2009 236314 A (NSK LTD) 15 October 2009 (2009-10-15) D4 JP 2008 309312 A (NTN TOYO BEARING CO LTD) 25 December 2008 (2008-12-25) D5 US 5 149 208 A (ZORNES DAVID A [US]) 22 September 1992 (1992-09-22) D6 WO 2011/032081 A1 (TIMKEN CO [US]; EVANS RYAN D [US]; SHILLER PAUL J [US]; PIERMAN DAVID) 17 March 2011 (2011-03-17) Independent claim 1 The present application fails to comply with the requirements of PCT Article 33(2) because the subject matter of claim 1 is not novel. Document D1 discloses a cage (5, 6) for a rolling bearing (claim 1), the cage comprising a main body (5) made of a first material (description, paragraphs [0041]-[0043]) as well as contact elements (6) made of a second material (description, paragraphs [0041]-[0043]), which contact elements are arranged at friction-loaded or impact-loaded points (figure 1) of the main body. Furthermore, documents D2-D6 likewise disclose all the features of independent claim 1. Dependent claims 2-10 Claims 2-10 do not contain any features which, in combination with the features of any claim to which they refer, meet the requirements of the PCT in respect of novelty and/or inventive step. The reasons are as follows: The additional features of claims 2-10 are disclosed in at least one of documents D1-D6.";
//     	String inputString = "";
//     	System.out.println(count.wordCounter(inputString));
//     	endTime1 = System.currentTimeMillis();
//	    System.out.println(endTime1-startTime1);
     	
     	
//     	startTime1 = System.currentTimeMillis();
//     	WordMatcher newer = new WordMatcher();
//     	//String inputString = "1-10 1-10 1-10 see supplemental sheet Box V Reasoned statement with regard to novelty,  inventive step and industrial applicability; citations and explanations supporting such statement Reference is made to the following documents: D1 EP 2 006 560 A2 (NTN TOYO BEARING CO LTD [JP]; ISHIKAWAJIMA HARIMA HEAVY IND [JP]) 24 December 2008 (2008-12-24) D2 DE 42 36 847 A1 (SCHAEFFLER WAELZLAGER KG [DE]) 5 May 1994 (1994-05-05) D3 JP 2009 236314 A (NSK LTD) 15 October 2009 (2009-10-15) D4 JP 2008 309312 A (NTN TOYO BEARING CO LTD) 25 December 2008 (2008-12-25) D5 US 5 149 208 A (ZORNES DAVID A [US]) 22 September 1992 (1992-09-22) D6 WO 2011/032081 A1 (TIMKEN CO [US]; EVANS RYAN D [US]; SHILLER PAUL J [US]; PIERMAN DAVID) 17 March 2011 (2011-03-17) Independent claim 1 The present application fails to comply with the requirements of PCT Article 33(2) because the subject matter of claim 1 is not novel. Document D1 discloses a cage (5, 6) for a rolling bearing (claim 1), the cage comprising a main body (5) made of a first material (description, paragraphs [0041]-[0043]) as well as contact elements (6) made of a second material (description, paragraphs [0041]-[0043]), which contact elements are arranged at friction-loaded or impact-loaded points (figure 1) of the main body. Furthermore, documents D2-D6 likewise disclose all the features of independent claim 1. Dependent claims 2-10 Claims 2-10 do not contain any features which, in combination with the features of any claim to which they refer, meet the requirements of the PCT in respect of novelty and/or inventive step. The reasons are as follows: The additional features of claims 2-10 are disclosed in at least one of documents D1-D6.";
//     	String inputString = "Contain";
//     	System.out.println(newer.matchedWords(inputString));
//     	endTime1 = System.currentTimeMillis();
//	    System.out.println(endTime1-startTime1);
     	
//      for lancaster stemming      	
//    	startTime1 = System.currentTimeMillis();
//	    Stemmer steming = new LancasterStemmer();
//	    System.out.println(steming.stem("local"));
//	    endTime1 = System.currentTimeMillis();
//        System.out.println(endTime1-startTime1);
     	
//     	int length = DictionaryforZNtoZZ.array.length;
//     	System.out.println(length);
     	
//     	startTime1 = System.currentTimeMillis();
//     	WordMatcher newMatcher = new WordMatcher();
//     	String[] input  = {"playfulness","acommod","acommodat","admix","computer","understanding"};
//     	String[] output = newMatcher.matchedWords(input, 6);
//     	for(int iterator=0; iterator < output.length; iterator++){
//     		System.out.print(output[iterator]+" ");
//     	}
//     	endTime1 = System.currentTimeMillis();
//        System.out.println(endTime1-startTime1);
		
	}
	public String[] convertToLowerCase(String[] input, int size){
		
		for(int iterator=0; iterator<size; iterator++){
			
			input[iterator] = input[iterator].toLowerCase();
			System.out.println(input[iterator]);
		}
		
		return input;
		
	}
	
	public String[] stopWordsRemover(String[] input, int sourceLength) {

		int listLength = 0, listIterator = 0;
		List<String> sourceList = new ArrayList<String>();
		for (int iterator = 0; iterator < sourceLength; iterator++) {

			sourceList.add(input[iterator]);

		}
		Collection<String> stopWords = StopWordsString.stopWords;
		sourceList.removeAll(stopWords);
		listLength = sourceList.size();
		String[] returnString = new String[listLength];
		for (String sourceListTraverse : sourceList) {

			returnString[listIterator] = sourceListTraverse;
			System.out.println(returnString[listIterator]);
			listIterator++;

		}

		return returnString;
	}
	
	
	
}
