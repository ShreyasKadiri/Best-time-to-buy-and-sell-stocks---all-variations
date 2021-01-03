class TransactionFee{
    public static int maxProfitTransactionFee(int stocks[], int fee){
        int n = stocks.length;
        int obsp = -stocks[0];       //Buying state profit 
        int ossp = 0;
        
        for(int i=0; i<n; i++){
            int nbsp = 0 ;  //New buying state profit 
            int nssp = 0;   //New selling state profit 
            
            if(obsp - stocks[i] > obsp){
                nbsp = ossp - stocks[i];
            }else {
                nbsp = obsp;
            }
            
            if(obsp + stocks[i] - fee > ossp){
                nssp = obsp + stocks[i] - fee; 
            }else {
                nssp = obsp;
            }
            obsp = nbsp;
            ossp = nssp;
        }
        
        return ossp;
    }
}
