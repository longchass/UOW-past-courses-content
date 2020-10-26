public class PropertyCost{
    double RATE = 1.1;
    double UNITPRICE = 1.4;
    double GST =0.1;

        public static void main(String[] args)
        {
            Scanner fetch = new Scanner(System.in);
            double area, propCost;
            System.out.println("Property Cost: ");
            area = fetch.nextDouble()
        }


public double calcTotalCharges(double area)
{
    double actualArea = RATE;
    double propertyCharge = actualArea * UNITPRICE;
    double propertyCost = propertyCharge + propertyCharge * GST;
    System.out.println(propertyCost);
    return propertyCost;
}

}