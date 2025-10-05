
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

class IDNotFound extends Exception {
    public IDNotFound(String s) {
        super(s);
    }
}

class Employee {
    private Map<Integer, String> employees = new HashMap<>();

    public void add(int id, String name) {
        employees.put(id, name);
    }

    public void getEmployee(int id) throws IDNotFound {
        if (employees.containsKey(id)) {
            System.out.println("Employee with id: " + id + " is: " + employees.get(id));
        } else {
            throw new IDNotFound("ID does not exist");
        }
    }

    public void display() {
        System.out.println("Employees: " + employees);
    }
}

public class Q2_practice {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.add(1, "A");
        e.add(2, "B");
        e.add(3, "C");
        try {
            e.display();
            e.getEmployee(1);
            e.getEmployee(5);
        } catch (IDNotFound ex) {
            System.out.println(ex.getMessage());
        }
    }
}
