package labs_examples.objects_classes_methods.labs.objects.Exercise01Airplane;

public class Propeller {

    private int numBlades;
    private String material;

    public Propeller(int numBlades, String material) {
        this.numBlades = numBlades;
        this.material = material;
    }

    public int getNumBlades() {
        return numBlades;
    }

    public void setNumBlades(int numBlades) {
        this.numBlades = numBlades;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Propeller{" +
                "numBlades=" + numBlades +
                ", material='" + material + '\'' +
                '}';
    }
}
