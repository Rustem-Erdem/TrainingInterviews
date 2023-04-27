public class A3_ReverseSentence {
    public static void main(String[] args){
        String sentence= "I am very good";
        String reverseSentence= "";
        String[] arr=sentence.split("");
        for(int i= arr.length-1; i>=0; i--){
            reverseSentence+=arr[i]+"";
        }
        System.out.println(reverseSentence.trim());
    }
}
