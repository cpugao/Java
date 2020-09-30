public class PuzzleJavaTest{
    public static void main(String[] args){
        PuzzleJava testData = new PuzzleJava();

        int[] testArr = {3,5,1,2,7,9,8,13,25,32};
        testData.sumAndGreaterThan10(testArr);

        String[] testList = {"Bob", "Jinja", "Komron", "Angela", "Bulba"};
        testData.shuffleNames(testList);

        testData.shuffleLetters();

        testData.randomNumber();

        testData.randomNumber2();

        testData.randomString();

        testData.randomStringOfStrings();
    }
}