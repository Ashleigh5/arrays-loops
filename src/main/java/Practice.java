import java.util.List;

public class Practice {

    public void loopForward(List<String> inputArray) {
        for (int i = 0; i <= inputArray.size()-1; i++) {
            System.out.println(inputArray.get(i));
        }
    }

    public void loopBackwards(List<String> inputArray) {
        for (int i = inputArray.size()-1; i >= 0; i--) {
            System.out.println(inputArray.get(i));
        }
    }

    public void getEveryOtherElement(List<String> inputArray) {
        for (int i = 0; i <= inputArray.size()-1; i = i+2) {
            System.out.println(inputArray.get(i));
        }
    }

    public void printImAWhale(List<String> inputArray) {
        for (int i = 0; i <= inputArray.size()-1; i++) {
            if (inputArray.get(i).equals("Whale")) {
                System.out.println("Im A Whale");
            } else {
                System.out.println(inputArray.get(i));
            }
        }
    }

    public void replaceCod(List<String> inputArray) {
        for (int i = 0; i <= inputArray.size()-1; i++) {
            if (inputArray.get(i).equals("Whale")) {
                System.out.println("Im a Whale");
            } else if (inputArray.get(i).equals("Cod")) {
                inputArray.set(i, "I Hate Cod");
                System.out.println(inputArray.get(i));
            } else {
                System.out.println(inputArray.get(i));
            }
        }
    }

    public void loopForwardAndBackward(List<String> inputArray) {
        for (int i = 0; i <= inputArray.size()-1; i++){
            System.out.println(inputArray.get(i));
        }
        for (int i = inputArray.size()-1; i >= 0; i--){
            System.out.println(inputArray.get(i));
        }
    }

    public void loopForwardsAgain(String[] inputArray) {
        for (int i = 0; i <= inputArray.length-1; i++){
            System.out.println(inputArray[i]);
        }
    }

    public void replaceLamp(String[] inputArray) {
        for (int i = 0; i <= inputArray.length - 1; i++) {
            if (inputArray[i].equals("Lamp")) {
                inputArray[i] = "Telephone";
                System.out.println(inputArray[i]);
            } else {
                System.out.println(inputArray[i]);
            }
        }
    }
}