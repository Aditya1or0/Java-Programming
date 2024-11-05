package Strings;

public class StringBuilderBasics{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //char at index 0 
        System.out.println(sb.charAt(2));

        //set char at index 0
        sb.setCharAt(0,'P');
        System.out.println(sb); 
        //insert ch at index
        sb.insert(3,'s');
        System.out.println(sb);  
        sb.delete(2,5);
        System.out.println(sb);
        sb.append("sition"); 
        System.out.println(sb);
        System.out.println("Length"+sb.length());  

    }   
}
