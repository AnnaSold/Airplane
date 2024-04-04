//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Airbus-A310","white+white" ,220 );
        Airplane plane2 = new Airplane("ИЛ-62", "white + blue",195);
        Airplane plane3 = new Airplane("Boeing-777", "gray", 550 );
        Airplane plane4 = new Airplane(" ТУ-154", "white", 180 );

        plane1.createArray(0,0,plane1);
        plane2.createArray(1,1,plane2);
        plane3.createArray(2,2,plane3);
        plane4.createArray(3,3,plane4);

        //System.out.println(plane1);
    }

}