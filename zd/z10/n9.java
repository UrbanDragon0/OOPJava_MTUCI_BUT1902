public class n9
{
    public static void sumOfCubes(int [] mass)
    {
        int sum = 0;
        for (int value : mass)
        {
            sum += value*value;
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        int[] nums = new int[] { 1, 2, 5  3,};
        sumOfCubes(nums);
        int[] nums1 = new int[] {};
        sumOfCubes(nums1);
        int[] nums2 = new int[] { 1, 2};
        sumOfCubes(nums2);
    }
}