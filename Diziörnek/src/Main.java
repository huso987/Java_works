public class Main {
    public static void main(String[] args) {

        double[] nums={1.1,2.2,3.3,4.4,5.5};
        double total=0;
        double max=nums[0];

        for(double num:nums){
            if (max <num){
                max=num;
            }
            total=total + num;
            System.out.println(num);
        }
        System.out.println("Total:"+total);
        System.out.println("Max:"+max);

    }
}