public class Main {
    public static void main(String[] args) {

        System.out.println("Task1");
        int[] counts = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] nums = {1.57, 7.654, 9.986};
        char[] alphabetRus = new char[33];
        char[] lists = {'q','w','e','r'};

        System.out.println("\n" + "Task2");
        for (int i = 0; i < counts.length; i++) {
            System.out.print(counts[i] + ",");
        }
        System.out.print("\n");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");

        }
        System.out.print("\n");

        for (int i = 0; i < lists.length; i++) {
            System.out.print(lists [i]+",");
        }
        System.out.println("\n"+"Task3");
        for (int i = counts.length-1; i >=0 ; i--) {
            System.out.print(counts [i]+",");
        }
        System.out.print("\n");
        for (int i = 2; i >=0 ; i-=1) {
            System.out.print(nums [i]+",");
        }
        System.out.print("\n");
        for (int i = 3; i >=0 ; i=i-1) {
            System.out.print(lists [i]+",");
        }
        System.out.print("\n"+"Task4"+"\n");
        for (int i = 0; i < counts.length; i++) {
            if (i%2 == 0){
                counts[i] = counts[i]+1;
                }else {
                counts[i] = counts[i];
            }
            System.out.print(counts[i]+",");

        }
    }
}