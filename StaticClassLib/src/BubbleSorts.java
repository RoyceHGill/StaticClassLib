public abstract class BubbleSorts {

    public static void alphabeticalBubbleSort(String[] words) {
        for (var i = 0; i < words.length; i++)
        {
            for (int j = 1; j < words.length; j++)
            {
                if (words[j].compareToIgnoreCase(words[j - 1]) < 0)
                {
                    swapItems(words, j);
                }
            }
        }
    }

    public static void reverseAlphabeticalBubbleSort(String[] words) {
        for (var i = 0; i < words.length; i++)
        {
            for (int j = 1; j < words.length; j++)
            {
                if (words[j].compareToIgnoreCase(words[j - 1]) > 0)
                {
                    swapItems(words, j);
                }
            }
        }

    }

    public static void ascendingBubbleSort(int[] numbers) {
        for (var i = 0; i < numbers.length; i++)
        {
            for (int j = 1; j < numbers.length; j++)
            {
                if (numbers[j] < numbers[j - 1])
                {
                    swapItems(numbers, j);
                }
            }
        }
    }
    public static void descendingBubbleSort(int[] numbers) {
        for (var i = 0; i < numbers.length; i++)
        {
            for (int j = 1; j < numbers.length; j++)
            {
                if (numbers[j] > numbers[j - 1])
                {
                    swapItems(numbers, j);
                }
            }
        }
    }

    protected static void printStringArray(String[] words) {
        StringBuilder arrayString = new StringBuilder();
        arrayString.append("{");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            arrayString.append(word);
            if (i < words.length-1)
            {
                arrayString.append(", ");
            }
        }
        arrayString.append("}");
        System.out.println(arrayString);
    }

    protected static void printIntegerArray(int[] numbers) {
        StringBuilder arrayString = new StringBuilder();
        arrayString.append("{");
        for (int i = 0; i < numbers.length; i++) {
            int word = numbers[i];
            arrayString.append(word);
            if (i < numbers.length-1)
            {
                arrayString.append(", ");
            }
        }
        arrayString.append("}");
        System.out.println(arrayString);
    }

    private static void swapItems(int[] nums, int j) {
        var temp = nums[j];
        nums[j] = nums[j -1];
        nums[j -1] = temp;
    }
    private static void swapItems(String[] words, int j) {
        var temp = words[j];
        words[j] = words[j -1];
        words[j -1] = temp;
    }




}
