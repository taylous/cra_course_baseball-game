public class Game {

    public void guess(String guessNumber) {
        if(guessNumber == null) {
            throw new IllegalArgumentException();
        }

        if(guessNumber.length() != 3) {
            throw  new IllegalArgumentException();
        }

        for(char number : guessNumber.toCharArray()) {
            if(number < '0' || '9' < number) {
                throw  new IllegalArgumentException();
            }
        }
    }
}
