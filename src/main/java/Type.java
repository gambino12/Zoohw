public enum Type {
    Cat(1),
    Dog(2),
    Hamster(3),
    Horse(4),
    Camel(5),
    Donkey(6);

    private int code;

    Type(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    public static Type getValueByCode(int code) {
        for (Type type : Type.values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Такого вида нет.");
    }
}
