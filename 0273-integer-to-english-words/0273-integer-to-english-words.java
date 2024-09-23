class Solution {
    private String[] arr1={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen", "Nineteen"};
    private String[] arr2={"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public String numberToWords(int n) {
        if(n==0)
        {
            return "Zero";
        }
        return k(n);
    }
    public String k(int n)
    {
        StringBuilder b=new StringBuilder();
        if(n<20)
        {
            b.append(arr1[n]);
        }
        else if(n<100)
        {
            b.append(arr2[n/10]).append(" ").append(arr1[n%10]);
        }
        else if(n<1000)
        {
            b.append(arr1[n/100]).append(" Hundred ").append(k(n%100));
        }else if (n < 1000000) {
            b.append(k(n / 1000)).append(" Thousand");
            if (n % 1000 != 0) {
                b.append(" ").append(k(n % 1000));
            }
        } else if (n < 1000000000) {
            b.append(k(n / 1000000)).append(" Million");
            if (n % 1000000 != 0) {
                b.append(" ").append(k(n % 1000000));
            }
        } else {
            b.append(k(n / 1000000000)).append(" Billion");
            if (n % 1000000000 != 0) {
                b.append(" ").append(k(n % 1000000000));
            }
        }
        
        return b.toString().trim();
    }
}