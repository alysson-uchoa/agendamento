package Enum;

public enum EnumMain {
    REGISTER(1), TO_SCHEDULE(2), SCHEDULE(3), EXIT(4);

    private int codigo;

    EnumMain(int codigo)
    {
        this.codigo = codigo;
    }

    public int getCodigo()
    {
        return codigo;
    }
}
