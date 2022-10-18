import java.util.*;

public class RandomStringChooser {
    private String[] myWord = {"this"};
    private List<String> words;
    private String[] word;

    public RandomStringChooser(String[] word){

        this.word = word;
    }

    public String[] getNext(RandomStringChooser next){

        return myWord;

    }


}
