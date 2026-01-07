//package example10;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//class Employee {
//    private String name;
//    private String position;    // 예: "Manager", "Developer"
//    private String department;  // 예: "HR", "IT", "Sales"
//
//    public Employee(String name, String position, String department) {
//        this.name = name;
//        this.position = position;
//        this.department = department;
//    }
//    public String getPosition() { return position; }
//    public String getDepartment() { return department; }
//    @Override
//    public String toString() {
//        return name + "(" + position + ", " + department + ")";
//    }
//}
//
//public class MultiLevelGrouping {
//    public static void main(String[] args) {
//        List<Employee3> emps = Arrays.asList(
//                new Employee3("Alice", "Manager", "HR"),
//                new Employee3("Bob", "Developer", "IT"),
//                new Employee3("Charlie", "Developer", "IT"),
//                new Employee3("David", "Manager", "Sales"),
//                new Employee3("Eve", "Developer", "Sales")
//        );
//
//        // TODO 1차: position 기준 -> 2차: department 기준
//        Map<String, Map<String, List<Employee3>>> multiGroup =
//                emps.stream().collect(
//                        Collectors.groupingBy(
//                                Employee3::getPosition,
//                                Collectors.groupingBy(Employee2::getDepartment)
//                        ));
//
//        System.out.println(multiGroup);
//    }
//}
