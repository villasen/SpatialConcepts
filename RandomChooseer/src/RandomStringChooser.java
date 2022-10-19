import java.util.*;

public class RandomStringChooser {
    private String[] myWord = {"this"};
    private List<String> words;
    private String[] word;

    public RandomStringChooser(String[] wordArray){
    words = new ArrayList<String>();

    for( String singleWord : wordArray){

        words.add(singleWord);

     }
    }

    public String getNext(RandomStringChooser next){
        if(words.size() > 0){
          return words.remove( (int)  (Math.random() * words.size())  );
        }
        return "NONE";

    }


}
