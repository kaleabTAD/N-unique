public class Main {
    public static void main(String[] args) {
        int []a={7,3,4,5,4};
        System.out.println(nUnique(a,6));
    }
    static int nUnique(int []a,int b){
     int count=0;
     for (int i=0;i<a.length;i++){
         for (int j = i+1; j <a.length ; j++) {
             if (a[i]+a[j]==b){
                 count++;
             }
         }
         if (count==1)return 1;
     }
     return 0;
}
}
