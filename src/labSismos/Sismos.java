package labSismos;

public class Sismos {
    private String region;
    private String epicentro;
    private Float magnitud;

    public Sismos(String region, String epicentro, Float magnitud) {
        this.region = region;
        this.epicentro = epicentro;
        this.magnitud = magnitud;
    }

    public Sismos(Object region, Object epicentro, Object magnitud) throws SismoInvalidoException {
        if (region == null || !(region instanceof String)) {
            throw new SismoInvalidoException(
                    "La región debe ser un dato de tipo String");
        }
        if (epicentro == null || !(epicentro instanceof String)) {
            throw new SismoInvalidoException(
                    "El epicentro debe ser un dato de tipo String");
        }
        if (magnitud == null || !(magnitud instanceof Float)) {
            throw new SismoInvalidoException(
                    "La magnitud debe ser un dato de tipo Float");
        }
    }

    @Override
    public String toString() {
        return "Sismos{" +
                "region='" + region + '\'' +
                ", epicentro='" + epicentro + '\'' +
                ", magnitud=" + magnitud +
                '}';
    }
}
