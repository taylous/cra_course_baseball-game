public class Game {

    public String question;

    public GuessResult guess(String guessNumber) {
        assertIllegalArgument(guessNumber);

        if(guessNumber.equals(this.question)) {
            return new GuessResult(true, 3, 0);
        }
        else {
            int strikes = 0;
            for(int i = 0; i < this.question.length(); i += 1) {
                if(this.question.indexOf(guessNumber.charAt(i)) == i) {
                    strikes += 1;
                }
            }
            return new GuessResult(false, strikes,0);
        }
    }

    private void assertIllegalArgument(String guessNumber) {
        if (guessNumber == null) {
            throw new IllegalArgumentException();
        }

        if (guessNumber.length() != 3) {
            throw new IllegalArgumentException();
        }

        for (char number : guessNumber.toCharArray()) {
            if (number < '0' || '9' < number) {
                throw new IllegalArgumentException();
            }
        }

        if (isDuplicatedNumber(guessNumber)) {
            throw new IllegalArgumentException();
        }
    }

    private boolean isDuplicatedNumber(String guessNumber) {
        return guessNumber.charAt(0) == guessNumber.charAt(1)
                || guessNumber.charAt(0) == guessNumber.charAt(2)
                || guessNumber.charAt(1) == guessNumber.charAt(2);
    }
}
