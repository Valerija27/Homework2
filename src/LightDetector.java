public class LightDetector {
    public static void main(String[] args) {
        int LightRange=400;
        if (LightRange>=380 && LightRange<=449){
            System.out.println("Violet");
        } else if (LightRange>=450 && LightRange<=494){
            System.out.println("Blue");
        } else if (LightRange>=495 && LightRange<=569) {
            System.out.println("Green");
        }else if (LightRange>=570 && LightRange<=589) {
            System.out.println("Yellow");
        }else if (LightRange>=590 && LightRange<=619) {
            System.out.println("Orange");
        }else if (LightRange>=620 && LightRange<=750) {
            System.out.println("Red");
        } else {
            System.out.println("Invisible light");
        }

    }


}
