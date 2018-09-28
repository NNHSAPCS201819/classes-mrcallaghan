import java.util.Scanner;

/**
 * This class encrypts strings with a keyphrase version of the classic Caesar Cipher.
 *      (as described in The Code Book by Simon Singh)
 *
 * @author mcallaghan
 * @version 26 September 2018
 */
public class CaesarCipher
{
    
    /*
     * static: one value for the variable for all objects of the class; can be accessed directly 
     *   through the class.  This means it's a class variable.
     *   (e.g. CaesarCipher.ALPHABET) -- just like Math.PI
     */
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";  
    
    public static void main( String[] args )
    {
        /*
         * A scanner object parses a primitive type or a String from a stream.
         * 
         * A stream is a sequence of characters from file, String, keyboard, network connection, etc.
         * 
         * Parsing is separating a sequence of characters into tokens based on delimiters.
         * 
         *  A token is a meaningful sequence of characters (e.g. word)
         *  
         *  Delimiters are characters that separate tokens (by default whitespace (space, tab, newline)
         *  is teh delimiter.
         *  
         *  When we create a Scnanner object, we must specify the input stream (e.g. System.in which is
         *    the keyboard via the terminal window).
         */
        
        Scanner s = new Scanner(System.in);
        
        /*
         * Best prcatice:
         *      1. Prompt the user for what to input
         *      2. Use print rather than println, then the user input immediately follow the colon
         *      3. Leave a space after the colon
         */
        
        System.out.print("Enter the text to encrypt: ");
        
        /*
         * The nextLine method returns all characters up to the end of the line (i.e. where the user
         *   typed enter).
         */
        
        String text = s.nextLine();
        text = text.toUpperCase();
        
        System.out.print("Enter the number of seconds to test a guessed keyphrase: ");
        
        /*
         * The nextInt method attempts to convert the next token in teh stream to an int 
         *   and returns the value.  If the next token cannot be converted, an exception is generated.
         * The nextDouble method behaves in teh same way for doubles.
         */
        int secondsPerGuess = s.nextInt();
        
        
    }
    
    
    /**
     * Formats the average time to crack the cipher based on the
     *      specified number of seconds and displaysit via System.out
     *      in several formats.
     *  
     *  This method is static and is independent of the state of a
     *      CasesarCipher object. As a result, this method may be
     *      invoked on the class instead of on a variable that
     *      references an object.
     *      (e.g., CaesarCipher.printAverageTimeToCrack())
     *  
     *  Static methods cannot access any instance variables. They can
     *      only access static class variables.
     *      
     *  @param  totalSeconds    the average number of seconds to crack
     *                          the cipher
     */
    public static void printAverageTimeToCrack(long totalSeconds)
    {
        /*
         * Instead of using "magic numbers" (e.g. 3.14159), use constactsd defined by us or the 
         *   Java Standard Library.
         *   
         * For example, in the Math class is defined:
         *   public static final double PI = 3.141592654;
         *   
         * Declare a constant with the final keyword.
         *   If we try to change the value, a compile error will be generated.
         * By convention, constants are in all caps.
         */
        
        final int SECONDS_FOR_EVERY_MINUTE = 60;
        final int MINUTES_FOR_EVERY_HOUR = 60;
        final int HOURS_FOR_EVERY_DAY = 24;
        final int DAYS_FOR_EVERY_YEAR = 365;
        
        // SECONDS_FOR_EVERY_MINUTE = 50;  Can't do this
        
        /*
         * Use integer division to calculate how many whole minutes based on the specified number 
         *   of seconds.
         *   
         * Integer division (like the // in Python) discards teh remainder (truncates)
         * 
         * For example:  ( 3/4 ) evaluates to 0; (3.0 / 4) evaluates to 0.75
         * 
         * In Java, the type of division executed depends on the type of values (or operands)
         */
        
        long totalMinutes = totalSeconds / SECONDS_FOR_EVERY_MINUTE;
        
        /*
         * Use the modulo operator (%) returns the remainder of teh division operation.
         *   It can be very useful when paired with integer division.
         *   
         *   Examples:
         *     7 % 2 = 1
         *     11 % 3 = 2
         *     6 % 2 = 0
         *              *     
         */
        long seconds = totalSeconds % SECONDS_FOR_EVERY_MINUTE;
        
        long totalHours = totalMinutes / MINUTES_FOR_EVERY_HOUR;        
        long minutes = totalMinutes % MINUTES_FOR_EVERY_HOUR;
        
        long totalDays = totalHours / HOURS_FOR_EVERY_DAY;
        long hours = totalHours % HOURS_FOR_EVERY_DAY;
        
        long years = totalDays / DAYS_FOR_EVERY_YEAR;
        long days = totalDays % DAYS_FOR_EVERY_YEAR;
        
        System.out.println("Average time to crack: " + years + " years, " + days + " days, " +
            hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
            
        
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    /**
     * Encrypts the specified text using the specified keyphrase using a
     *      keyphrase-enhanced Caesar Cipher.
     *      
     *  @param  text        the text to encrypt
     *  @param  keyphrase   the keyphrase with which to encrypt the specified text
     *  @return             the encrypted text
     */
    public static String encrypt(String text, String keyphrase)
    {
        String encryptedText = "";

        /*
         * The keyphrase, after removing any repeated letters is used as the beginning of the
         *      jumbled cipher alphabet. The remainder of the cipher alphabet is merely the
         *      remaining letters of the alphabet, in their correct order, starting where the
         *      keyphrase ends.
         */
        String cipherAlphabet = keyphrase;
        for(int i = 0; i < CaesarCipher.ALPHABET.length(); i++)
        {
            char letter = CaesarCipher.ALPHABET.charAt(i);
            if(keyphrase.indexOf(letter) == -1)
            {
                cipherAlphabet += letter;
            }
        }

        /*
         * For each letter in the text that is a letter, find the corresponding letter
         *      at the same position in the cipher alphabet as its replacement.
         */
        for(int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);

            // if the letter is between A and Z
            if(letter >= 'A' && letter <= 'Z')
            {
                // 65 is the ASCII value of 'A'
                int cipherIndex = letter - 65;
                encryptedText += cipherAlphabet.charAt(cipherIndex);
            }
            else    // don't substitute the letter; just use it as is
            {
                encryptedText += letter;
            }
        }

        return encryptedText;
    }

    /**
     * Calcualtes the average time to crack the cipher, based on the
     *      specified length of the keyphrase and seconds to evaluate
     *      each attempt, using a brute force approach. This calculation
     *      assumes that the cracker knows the length of the keyphrase.
     *      If the length is not know, it will take substantially longer
     *      to crack the cipher. Regardless, this calculation is only
     *      for a brute force approach; other techniques (e.g., frequency
     *      analysis) can crack the cipher extremely quickly.
     *      
     *  @param  keyphraseLength the number of characters in the keyphrase
     *  @param  secPerGuess     the number of seconds to evaluate each attempt
     *  @return                 the average number of seconds to crack the cipher
     */
    public static long calculateAverageTimeToCrack(int keyphraseLength, int secPerGuess)
    {
        final int NUMBER_OF_LETTERS_IN_ALPHABET = 26;
        int lettersRemaining = NUMBER_OF_LETTERS_IN_ALPHABET;
        long combinations = 1;

        for(int i = 0; i < keyphraseLength; i++)
        {
            combinations *= lettersRemaining;
            lettersRemaining -= 1;
        }

        long worstCaseTimeToCrack = combinations * secPerGuess;

        return worstCaseTimeToCrack/2;
    }
}