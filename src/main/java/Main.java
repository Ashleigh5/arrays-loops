import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Dolphin");
        stringArrayList.add("Shark");
        stringArrayList.add("Cod");
        stringArrayList.add("Pike");
        stringArrayList.add("Whale");
        stringArrayList.add("Octopus");
        stringArrayList.add("Jellyfish");
        stringArrayList.add("Shrimp");

        Practice object = new Practice();
        object.loopForward(stringArrayList);
        object.loopBackwards(stringArrayList);
        object.getEveryOtherElement(stringArrayList);
        object.printImAWhale(stringArrayList);
        object.replaceCod(stringArrayList);
        object.loopForwardAndBackward(stringArrayList);


        String[] stringArray = new String[] {"Chair", "Table", "Lamp", "Mirror", "Rug"};
        object.loopForwardsAgain(stringArray);
        object.replaceLamp(stringArray);

    }
}