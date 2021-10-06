package WEEK2;

public class QN2{

public static void main(String[] args) {
    int stkA[]= {4,2,4,6,1};
    int stkB[]= {2,1,8,5};
    
    System.out.println(maxPop(stkA,stkB,10));
    
}

static int maxPop(int[] a, int[] b, int x) {
    int indexb=0;
    int sum=0;
    
    while(indexb<b.length && sum+ b[indexb]<=x) {
        sum += b[indexb];
        indexb++;
    }
    System.out.println("indexb is "+ indexb);
    System.out.println("intial sum is "+sum);
    
    int maxScore = indexb;
    for( int indexa= 1; indexa<=a.length; indexa++) {
        sum+= a[indexa-1];
        System.out.println("indexa is "+ indexa);
        System.out.println("sum is "+ indexa);
        
        
        while(sum> x && indexb> 0) {
            indexb--;
            sum -= b[indexb];
            System.out.println("Greater sum is "+ sum);
            
        }
        if(sum>x) {
            break;
        }
        System.out.println("masx score is "+ maxScore);
        System.out.println("indexa "+ indexa);
        System.out.println("indexb "+ indexb);
        maxScore= Math.max(maxScore, indexa + indexb);
        System.out.println("max score is "+ maxScore);
        
    }
    return maxScore;
}
}