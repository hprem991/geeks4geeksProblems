package Arrays;

import java.util.List;

public class AmazonIssue {
	public int checkWinner(List<List<String>> codeList, List<String> shoppingCart)
		{

			if(shoppingCart.isEmpty() || codeList.isEmpty()){
						return 0;
				}


				int fruitIndex = 0;
				int codeIndex = 0;
				for(int i = 0; i < codeList.size(); i++){
					List<String> codeFruitList = codeList.get(i);
					while( codeIndex < codeFruitList.size() && fruitIndex < shoppingCart.size()){
						if(shoppingCart.get(fruitIndex).equals(codeFruitList.get(codeIndex)) ||
								shoppingCart.get(fruitIndex).equals("anything")){
							fruitIndex++;
							codeIndex++;
						} else {
								fruitIndex = 0;
								codeIndex = 0;
								break;	
						}
					}
					if(codeIndex == codeFruitList.size())
							codeIndex = 0;
				}

				return fruitIndex == shoppingCart.size() ? 1 : 0;
		}
}
