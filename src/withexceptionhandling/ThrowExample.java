package withexceptionhandling;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            //add dummy lines
            int a = 10;
            if (a != 10) {
                System.out.println("a is 10, hence not throwing exception");
            } else {
                throw new RuntimeException("Manually user throwing exception since a is 10");
            }
            //add dummy lines
        }catch (Exception e){
            System.out.println("Exception occurred : "+e.getMessage()+"---"+e.getClass());
        }
    }
}
