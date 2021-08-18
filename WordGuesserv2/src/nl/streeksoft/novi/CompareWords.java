package nl.streeksoft.novi;

public class CompareWords {

    /** Deze methode vergelijk twee woorden met elkaar.
     *
     * @param correctWord woord wat geraden moet worden
     * @param userWord woord wat de gebruiker heeft ingevoerd
     * @return true als de woorden gelijk zijn
     */
    public boolean compare(String correctWord, String userWord) {
        boolean correctAnswer = false;
        if(correctWord.equals(userWord)) {
            correctAnswer = true;
        }

        return correctAnswer;

    }

}
