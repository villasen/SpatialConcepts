public class Main {


    public static void main(String[] args) {
        System.out.println("Random String Chooser Project");

        String[] wordArray = {"wheels", "on", "the", "bus"};

        RandomStringChooser sChooser = new RandomStringChooser(wordArray);

        for (int k = 0; k < 6; k++)
        {
            System.out.print(sChooser.getNext(sChooser) + " ");
        }


    }
}