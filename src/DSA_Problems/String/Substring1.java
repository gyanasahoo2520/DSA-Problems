package DSA_Problems.String;
//Remove the string "apple" from another string

public class Substring1 {
    public static void main(String[] args) {
        String str="bcappldg";
//        System.out.println(skipApple(str));
        System.out.println(skipAppNotApple(str));
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //Skip App whenever there is not present apple
    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
