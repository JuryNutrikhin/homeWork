public class Recursiy {
    public static void main(String[] args) {
        RecurseString(3,"");
    }

    public static void RecurseString(int length,String cur){
        if(cur.length()==length){
            System.out.println(cur);
            return;
        }
        for(int i =0 ;i<=3;++i){
            RecurseString(length,cur+i);
        }
    }
}
