
import java.util.Arrays;

public class Animals {

    public String name;
    public Type type;

    public String DateOfBirth;

    public String [] Command;

    public Animals(String name, Type type, String dateOfBirth, String[] command) {
        this.name = name;
        this.type = type;
        DateOfBirth = dateOfBirth;
        Command = command;
    }

    public Animals(String[] command) {
        Command = command;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String[] getCommand() {
        return Command;
    }

    public void setCommand(String[] command) {
        Command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass() +
                " { имя='" + name + '\'' +
                ", type=" + type +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", Command=" + Arrays.toString(Command) +
                '}';
    }
}


