package firstTask.vectorTask.classes;

import java.util.ArrayList;
import java.util.List;

public class Vector3D {
    double x;
    double y;
    double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double lenght() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public double scalarMult(Vector3D v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector3D vectorMult(Vector3D v) {
        double tmpX = y * v.z - z * v.y;
        double tmpY = z * v.x - x * v.z;
        double tmpZ = x * v.y - y * v.x;
        return new Vector3D(tmpX, tmpY, tmpZ);
    }

    //Деление на ноль
    public double angle(Vector3D v1) {
        try{
            return scalarMult(v1) / (lenght() * v1.lenght());
        }catch (ArithmeticException e)
        {
            return scalarMult(v1);
        }
    }

    public static Vector3D sumOfTwoVectors(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector3D distOfTwoVectors(Vector3D v1, Vector3D v2) {
        return new Vector3D(v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }

    //[-100;100] to generate
    public static List<Vector3D> generateRandomVectors(int n) {
        List<Vector3D> vectors = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vectors.add(new Vector3D(Math.random() * 200 - 100, Math.random() * 200 - 100, Math.random() * 200 - 100));
        }
        return vectors;
    }

    @Override
    public String toString() {
        return "{" + x + "; " + y + "; " + z + "}";
    }
}
