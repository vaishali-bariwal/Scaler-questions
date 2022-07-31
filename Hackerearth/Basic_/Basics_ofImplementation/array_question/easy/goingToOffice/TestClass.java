package Hackerearth.Basic_.Basics_ofImplementation.array_question.easy.goingToOffice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        long d = Long.parseLong(name);
        String[] onlineCar = br.readLine().split(" ");
        long oc = Long.parseLong(onlineCar[0]);
        long of = Long.parseLong(onlineCar[1]);
        long od = Long.parseLong(onlineCar[2]);
        long onlineCost;System.out.println();
        if(d < of ){
            System.out.println(of);
            onlineCost = oc ;
        }
        else
        {
            System.out.println();
            onlineCost = oc  + (od * (d - of));
        }
        System.out.println(onlineCost);
        String[] classicCar = br.readLine().split(" ");
        long cSpeed= Long.parseLong(classicCar[0]);
        long cbaseFare = Long.parseLong(classicCar[1]);
        long cMinFare = Long.parseLong(classicCar[2]);
        long cKMfare = Long.parseLong(classicCar[3]);
        long classicCost = (cbaseFare + ((d/cSpeed) * cMinFare) + (d * cKMfare));aimport java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;
        
        class TestClass {
            public static void main(String args[] ) throws Exception {
              
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringBuilder sb = new StringBuilder();
                String name = br.readLine();
                long d = Long.parseLong(name);
                String[] onlineCar = br.readLine().split(" ");
                long oc = Long.parseLong(onlineCar[0]);
                long of = Long.parseLong(onlineCar[1]);
                long od = Long.parseLong(onlineCar[2]);
                long onlineCost;
                if(d < of ){
                    
                    onlineCost = oc;
                }
                else
                {
                    onlineCost = oc  + (od * (d - of));
                }
                
                String[] classicCar = br.readLine().split(" ");
                long cSpeed= Long.parseLong(classicCar[0]);
                long cbaseFare = Long.parseLong(classicCar[1]);
                long cMinFare = Long.parseLong(classicCar[2]);
                long cKMfare = Long.parseLong(classicCar[3]);
                long classicCost = (cbaseFare + ((d/cSpeed) * cMinFare) + (d * cKMfare));
        
                String ans = onlineCost <= classicCost ? "Online Taxi" : "Classic Taxi";
                System.out.println(ans);
        
            }
        }
        

        String ans = onlineCost <= classicCost ? "Online Taxi" : "Classic Taxi";
        System.out.println(ans);

    }
}
