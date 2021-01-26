public class Quicksorts
{

    public static int partition(Comparable[] data, int first, int n)
    {
        Comparable pivot = data[first];
        int tooBigIndex = first + 1;
        int tooSmallIndex = first + n -1;

        while (tooBigIndex <= tooSmallIndex)
        {
            while (data[tooBigIndex].compareTo(pivot) <= 0 && tooBigIndex <= data.length)
            {
                tooBigIndex++;
            }
            while (data[tooSmallIndex].compareTo(pivot) >= 0)
            {
                tooSmallIndex--;
            }
            if (tooBigIndex < tooSmallIndex)
            {
                Comparable temp = data[tooBigIndex];
                data[tooBigIndex] = data[tooSmallIndex];
                data[tooSmallIndex] = temp;
            }
        }
        data[first] = data[tooSmallIndex];
        data[tooSmallIndex] = pivot;

        return tooSmallIndex;
    }


}

class QuickSortTesters
{
    public static void main(String[] asasas)
    {
        Comparable[] someIntArray = {4, 5, 6, 1, 3, 7, 9, 2, 3, 10, 2};

        Quicksorts.partition(someIntArray, 0, someIntArray.length);
    }
}