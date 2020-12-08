import java.util.ArrayList;

public class DistinctPrimeNumberOfProduct {
    private static int givenNumber;
    private ArrayList<Integer> factors = new ArrayList<>();
    private ArrayList<Integer> primeFactors = new ArrayList<>();
    private ArrayList<Integer> primeFactorProductList = new ArrayList<>();


    private  ArrayList<Integer> findFactors(int givenNumber){
        for(int i=2;i<givenNumber; i++){
            if(givenNumber%i==0)
                factors.add(i);
        }
        return factors;
    }

    private ArrayList<Integer> primeFactorList(ArrayList<Integer> factors) {
        int count = 0;
        for (int i = 0; i < factors.size(); i++) {
            for (int j = 2; j < factors.get(i); j++) {
                if (factors.get(i) % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
                primeFactors.add(factors.get(i));
            count=0;
        }
        return primeFactors;
    }

    private ArrayList<Integer> primeFactorProduct(ArrayList<Integer> primeFactorList){
        for (int i=0;i<primeFactorList.size();i++) {
            for(int j=i+1;j<primeFactorList.size();j++){
                int result = primeFactorList.get(i)*primeFactorList.get(j);
                if(result==givenNumber){
                    primeFactorProductList.add(primeFactorList.get(i));
                    primeFactorProductList.add(primeFactorList.get(j));
                }
            }
        }
        return primeFactorProductList;
    }

    public static void main(String[] args){
        DistinctPrimeNumberOfProduct d = new DistinctPrimeNumberOfProduct();
        givenNumber=1155;
        //System.out.println(d.primeFactorProduct(d.primeFactorList(d.findFactors(givenNumber))));
        System.out.println(d.primeFactorList(d.findFactors(givenNumber)));
    }

}
