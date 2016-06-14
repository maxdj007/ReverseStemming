package pkg2;

import java.util.ArrayList;
import java.util.List;

public class WordMatcher {
	
	public String[] matchedWords(String[] input, int inputLength ){
		
		int lengthOfReturnedStringArray = 0, returnStringIterator = 0, dictionaryArrayLength = 0;
		String[] dictionaryArray = null;
		List<String> matchedWordList = new ArrayList<String>();
		LancasterStemmer newStemmer = new LancasterStemmer();
		for(int iterator = 0; iterator < inputLength; iterator++){
			input[iterator] = newStemmer.stem(input[iterator]);
			if((input[iterator].charAt(0) == 'a')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforAAtoAN.array;
			    dictionaryArrayLength = DictionaryforAAtoAN.arrayLength;
			} else if((input[iterator].charAt(0) == 'a')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforANtoAZ.array;
			    dictionaryArrayLength = DictionaryforANtoAZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'b')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforBAtoBN.array;
			    dictionaryArrayLength = DictionaryforBAtoBN.arrayLength;
			}else if((input[iterator].charAt(0) == 'b')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforBNtoBZ.array;
			    dictionaryArrayLength = DictionaryforBNtoBZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'c')&&(input[iterator].charAt(1) <= 'j')){
				dictionaryArray = DictionaryforCAtoCJ.array;
			    dictionaryArrayLength = DictionaryforCAtoCJ.arrayLength;
			}else if((input[iterator].charAt(0) == 'c')&&(input[iterator].charAt(1) <= 'p')&&(input[iterator].charAt(1) > 'j')){
				dictionaryArray = DictionaryforCJtoCP.array;
			    dictionaryArrayLength = DictionaryforCJtoCP.arrayLength;
			}else if((input[iterator].charAt(0) == 'c')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'p')){
				dictionaryArray = DictionaryforCPtoCZ.array;
			    dictionaryArrayLength = DictionaryforCPtoCZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'd')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforDAtoDN.array;
			    dictionaryArrayLength = DictionaryforDAtoDN.arrayLength;
			}else if((input[iterator].charAt(0) == 'd')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforDNtoDZ.array;
			    dictionaryArrayLength = DictionaryforDNtoDZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'e')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforEAtoEN.array;
			    dictionaryArrayLength = DictionaryforEAtoEN.arrayLength;
			}else if((input[iterator].charAt(0) == 'e')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforENtoEZ.array;
			    dictionaryArrayLength = DictionaryforENtoEZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'f')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforFAtoFN.array;
			    dictionaryArrayLength = DictionaryforFAtoFN.arrayLength;
			}else if((input[iterator].charAt(0) == 'f')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforFNtoFZ.array;
			    dictionaryArrayLength = DictionaryforFNtoFZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'g')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforGAtoGN.array;
			    dictionaryArrayLength = DictionaryforGAtoGN.arrayLength;
			}else if((input[iterator].charAt(0) == 'g')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforGNtoGZ.array;
			    dictionaryArrayLength = DictionaryforGNtoGZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'h')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforHAtoHN.array;
			    dictionaryArrayLength = DictionaryforHAtoHN.arrayLength;
			}else if((input[iterator].charAt(0) == 'h')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforHNtoHZ.array;
			    dictionaryArrayLength = DictionaryforHNtoHZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'i')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforIAtoIN.array;
			    dictionaryArrayLength = DictionaryforIAtoIN.arrayLength;
			}else if((input[iterator].charAt(0) == 'i')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforINtoIZ.array;
			    dictionaryArrayLength = DictionaryforINtoIZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'j')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforJAtoJN.array;
			    dictionaryArrayLength = DictionaryforJAtoJN.arrayLength;
			}else if((input[iterator].charAt(0) == 'j')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforJNtoJZ.array;
			    dictionaryArrayLength = DictionaryforJNtoJZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'k')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforKAtoKN.array;
			    dictionaryArrayLength = DictionaryforKAtoKN.arrayLength;
			}else if((input[iterator].charAt(0) == 'k')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforKNtoKZ.array;
			    dictionaryArrayLength = DictionaryforKNtoKZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'l')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforLAtoLN.array;
			    dictionaryArrayLength = DictionaryforLAtoLN.arrayLength;
			}else if((input[iterator].charAt(0) == 'l')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforLNtoLZ.array;
			    dictionaryArrayLength = DictionaryforLNtoLZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'm')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforMAtoMN.array;
			    dictionaryArrayLength = DictionaryforMAtoMN.arrayLength;
			}else if((input[iterator].charAt(0) == 'm')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforMNtoMZ.array;
			    dictionaryArrayLength = DictionaryforMNtoMZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'n')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforNAtoNN.array;
			    dictionaryArrayLength = DictionaryforNAtoNN.arrayLength;
			}else if((input[iterator].charAt(0) == 'n')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforNNtoNZ.array;
			    dictionaryArrayLength = DictionaryforNNtoNZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'o')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforOAtoON.array;
			    dictionaryArrayLength = DictionaryforOAtoON.arrayLength;
			}else if((input[iterator].charAt(0) == 'o')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforONtoOZ.array;
			    dictionaryArrayLength = DictionaryforONtoOZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'p')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforPAtoPN.array;
			    dictionaryArrayLength = DictionaryforPAtoPN.arrayLength;
			}else if((input[iterator].charAt(0) == 'p')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforPNtoPZ.array;
			    dictionaryArrayLength = DictionaryforPNtoPZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'q')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforQAtoQN.array;
			    dictionaryArrayLength = DictionaryforQAtoQN.arrayLength;
			}else if((input[iterator].charAt(0) == 'q')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforQNtoQZ.array;
			    dictionaryArrayLength = DictionaryforQNtoQZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'r')&&(input[iterator].charAt(1) <= 'h')){
				dictionaryArray = DictionaryforRAtoRH.array;
			    dictionaryArrayLength = DictionaryforRAtoRH.arrayLength;
			}else if((input[iterator].charAt(0) == 'r')&&(input[iterator].charAt(1) <= 'r')&&(input[iterator].charAt(1) > 'h')){
				dictionaryArray = DictionaryforRHtoRR.array;
			    dictionaryArrayLength = DictionaryforRHtoRR.arrayLength;
			}else if((input[iterator].charAt(0) == 'r')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'r')){
				dictionaryArray = DictionaryforRRtoRZ.array;
			    dictionaryArrayLength = DictionaryforRRtoRZ.arrayLength;
			}else if((input[iterator].charAt(0) == 's')&&(input[iterator].charAt(1) <= 'h')){
				dictionaryArray = DictionaryforSAtoSH.array;
			    dictionaryArrayLength = DictionaryforSAtoSH.arrayLength;
			}else if((input[iterator].charAt(0) == 's')&&(input[iterator].charAt(1) <= 's')&&(input[iterator].charAt(1) > 'h')){
				dictionaryArray = DictionaryforSHtoSS.array;
			    dictionaryArrayLength = DictionaryforSHtoSS.arrayLength;
			}else if((input[iterator].charAt(0) == 's')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 's')){
				dictionaryArray = DictionaryforSStoSZ.array;
			    dictionaryArrayLength = DictionaryforSStoSZ.arrayLength;
			}else if((input[iterator].charAt(0) == 't')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforTAtoTN.array;
			    dictionaryArrayLength = DictionaryforTAtoTN.arrayLength;
			}else if((input[iterator].charAt(0) == 't')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforTNtoTZ.array;
			    dictionaryArrayLength = DictionaryforTNtoTZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'u')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforUAtoUN.array;
			    dictionaryArrayLength = DictionaryforUAtoUN.arrayLength;
			}else if((input[iterator].charAt(0) == 'u')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforUNtoUZ.array;
			    dictionaryArrayLength = DictionaryforUNtoUZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'v')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforVAtoVN.array;
			    dictionaryArrayLength = DictionaryforVAtoVN.arrayLength;
			}else if((input[iterator].charAt(0) == 'v')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforVNtoVZ.array;
			    dictionaryArrayLength = DictionaryforVNtoVZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'w')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforWAtoWN.array;
			    dictionaryArrayLength = DictionaryforWAtoWN.arrayLength;
			}else if((input[iterator].charAt(0) == 'w')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforWNtoWZ.array;
			    dictionaryArrayLength = DictionaryforWNtoWZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'x')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforXAtoXN.array;
			    dictionaryArrayLength = DictionaryforXAtoXN.arrayLength;
			}else if((input[iterator].charAt(0) == 'x')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforXNtoXZ.array;
			    dictionaryArrayLength = DictionaryforXNtoXZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'y')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforYAtoYN.array;
			    dictionaryArrayLength = DictionaryforYAtoYN.arrayLength;
			}else if((input[iterator].charAt(0) == 'y')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforYNtoYZ.array;
			    dictionaryArrayLength = DictionaryforYNtoYZ.arrayLength;
			}else if((input[iterator].charAt(0) == 'z')&&(input[iterator].charAt(1) <= 'n')){
				dictionaryArray = DictionaryforZAtoZN.array;
			    dictionaryArrayLength = DictionaryforZAtoZN.arrayLength;
			}else if((input[iterator].charAt(0) == 'z')&&(input[iterator].charAt(1) <= 'z')&&(input[iterator].charAt(1) > 'n')){
				dictionaryArray = DictionaryforZNtoZZ.array;
			    dictionaryArrayLength = DictionaryforZNtoZZ.arrayLength;
			}
			for(int innerIterator = 0; innerIterator < dictionaryArrayLength; innerIterator++){
				if (dictionaryArray[innerIterator].matches(""+input[iterator]+"\\D*")) {
					matchedWordList.add(dictionaryArray[innerIterator]);
				}
			}
			
		}
		lengthOfReturnedStringArray = matchedWordList.size();
		String returnString[] = new String[lengthOfReturnedStringArray];
		for(String iterator : matchedWordList){	
			returnString[returnStringIterator] = iterator;
			returnStringIterator++;
		}
		return returnString;
	}

}
