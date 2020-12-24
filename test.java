class Catalog{
    String product1;
    String product2;
    String product3;
    
    public Catalog(String product1, String product2, String product3)
    {
        this.product1 = product1;
        this.product2 = product2;
        this.product3 = product3;
    }
    public String getproduct1() {
        return product1;
    }

    public void setproduct1(String product1) {
        this.product1 = product1;
    }

    public String getproduct2() {
        return product2;
    }

    public void setproduct2(String product2) {
        this.product2 = product2;
    }

    public String getproduct3() {
        return product3;
    }

    public void setproduct3(String product3) {
        this.product3 = product3;
    }
    public String toString()
    {
        return "{ product1 = "+this.getproduct1()+", product2 = "+this.getproduct2()+", product3 = "+this.getproduct3()+" }";
    }
    public static void main(String[] args){

    }






}
