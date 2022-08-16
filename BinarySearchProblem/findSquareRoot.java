class FindSquareRoot{
    public static int squareRoot(int x) {
        if (x < 2) {
            return x;
        }
        int result = 0;
        int start = 1;
        int end = x/2;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            long sqr = mid*mid;
            if (sqr == x) {
                return mid;
            }
            else if (sqr < x)
            {
                start = mid + 1;
                result = mid;
            }
            else {
                end = mid - 1;
            }
        }

        // return result
        return result;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i <= 16; i++) {
            System.out.printf("sqrt(%d) = %d\n", i, squareRoot(i));
        }
    }
}
