package Cadastro;

public class Procedure
{
    private static int cod = 1;
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Procedure(String name) {
        this.name = name;
        this.id = cod;
        cod++;
    }

    @Override
    public String toString() {
        return "Procedure {" +
                " name = '" + name + '\'' +
                ", id = " + id +
                '}';
    }
}
