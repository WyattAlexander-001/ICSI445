package assignment1;


class HW1 {
    public static void main (String[] argv){
        int[] arr = {2,5,6,7,8};
        int y = 2;
//        System.out.println(findLast(arr,y));

        double [] newArr = {50,50,50};
        System.out.println(computeAverage(newArr));

    }

    /**
     * Find last index of element
     *
     * @param x array to search
     * @param y value to look for
     * @return last index of y in x; -1 if absent
     * @throws NullPointerException if x is null
     */
    public static int findLast(int[] x, int y)
    {
        if (x == null)
            throw new NullPointerException();
        System.out.println("X.LENGTH:" + x.length);
        for (int i=x.length-1; i>0; i--)
        {
            System.out.println("i:" + i);
            if (x[i] == y)
                return i;
        }
        return -1;
    }
// test: x = [2, 3, 5]; y = 2;
// expected = 0

    /**
     * Compute an average
     *
     * @param arr array of numbers
     * @return average of numbers in arr
     * @throws NullPointerException if arr is null
     */
      public static double computeAverage(double[] arr)
      {
             if (arr == null)
                    throw new NullPointerException();

             double sum = 0.0;
             for (int i=0; i < arr.length-1; i++)
                    sum += arr[i];

             double average = sum / arr.length;
             return average;
          }
// Given test case
//   test input: arr = [90.5, -65.0, 72.25]
//   expected = 32.58
}


