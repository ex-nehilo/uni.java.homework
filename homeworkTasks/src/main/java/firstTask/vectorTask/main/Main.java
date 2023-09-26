package firstTask.vectorTask.main;


import firstTask.vectorTask.classes.Vector3D;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D(1,2,3);
        Vector3D v2 = new Vector3D(4,-2,4);


        System.out.println("-----------ДЛИНА ВЕКТОРА-----------");
        System.out.println("Длина первого вектора: " + v1.lenght());
        System.out.println("Длина второго вектора: " + v2.lenght());
        System.out.println();
        System.out.println("-----------СКАЛЯРНОЕ ПРОИЗВЕДЕНИЕ-----------");
        System.out.println(v1.scalarMult(v2));
        System.out.println();
        System.out.println("-----------ВЕКТОРНОЕ ПРОИЗВЕДЕНИЕ-----------");
        System.out.println(v1.vectorMult(v2));
        System.out.println();
        System.out.println("-----------УГОЛ (COS)-----------");
        System.out.println(v1.angle(v2));
        System.out.println();
        System.out.println("-----------СУММА И РАЗНИЦА-----------");
        Vector3D sumOfVectors = Vector3D.sumOfTwoVectors(v1,v2);
        Vector3D distOfVectors = Vector3D.distOfTwoVectors(v1,v2);
        System.out.println("Сумма векторов v1 и v2: " + sumOfVectors);
        System.out.println("Разница векторов v1 и v2: " + distOfVectors);

        System.out.println();
        System.out.println("-----------СЛУЧАЙНЫЕ ВЕКТОРЫ-----------");
        List<Vector3D> vectors = Vector3D.generateRandomVectors(10);
        for (Vector3D vector : vectors)
            System.out.println(vector);
    }
}
