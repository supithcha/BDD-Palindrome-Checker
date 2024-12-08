import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class PalindromeCheckerFixture {
    private String word;

    public void setWord(String word) {
        this.word = word;
    }

    public boolean isPalindrome() {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
