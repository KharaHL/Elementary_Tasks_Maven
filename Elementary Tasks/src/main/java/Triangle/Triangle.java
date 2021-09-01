package Triangle;
 class Triangle {
    private String name;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String name, double sideA, double sideB, double sideC) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double triangleArea() {
        double p = (sideA + sideB + sideC) / 2;
        double sc = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        return sc;
    }

    public static boolean validateTriangle(double sideA, double sideB, double sideC) {
        boolean check = false;
        if ((sideA + sideC) > sideB && (sideA + sideB) > sideC && (sideB + sideC) > sideA) {
            check = true;
        }
        return check;
    }
}
