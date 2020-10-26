public class CircleBugs {

    public static void main(String[] args) {
        //Scanner fetch = new Scanner(System.in);
        //System.out.println();
        //fetch.nextLine();
        
        double t = Double.parseDouble(args[1]);
        double r = Integer.parseInt(args[2]);
        System.out.println("r = " + r );
        System.out.printf("t = " + t);
        double c = 2 * Math.PI * r;
        double A = Math.PI * r * r;
        double x = r * Math.cos(t);
        double y = r * Math.sin(t);
        System.out.println("c = " + c );
        System.out.println("a = " + A );
        System.out.println("x = " + x + ", " + "y = " + y ); 
    }
    
}