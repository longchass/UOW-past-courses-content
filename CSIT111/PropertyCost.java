public class PropertyCost{
    double RATE = 1.1;
    double UNITPRICE = 1.4;
    double GST =0.1;

        public static void main(String[] args)
        {
            double area, propCost;
            Scanner input = new Scanner(System.in);
            System.out.println("Property Cost: ");
            area = fetch.nextDouble();
        }
    }

    double calcTotalCharges(double area)
    {
        double actualArea = RATE;
        double propertyCharge = actualArea * UNITPRICE;
        double propertyCost = propertyCharge + propertyCharge * GST;
        System.out.println(propertyCost);
        return propertyCost;
    }   

