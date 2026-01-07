package example10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

class Employee3 {
    private String name;
    private String dept;
    private int salary;

    public Employee3(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public String getDept() { return dept; }
    public int getSalary() { return salary; }
    public String toString() {
        return name + "(" + dept + ", " + salary + ")";
    }
}

public class DepartmentReportExample {
    public static void main(String[] args) {
        List<Employee3> emps = Arrays.asList(
                new Employee3("Alice", "HR", 3000),
                new Employee3("Bob", "IT", 4000),
                new Employee3("Charlie", "IT", 4500),
                new Employee3("David", "HR", 3200),
                new Employee3("Eve", "Sales", 3500)
        );

        // 부서별로 그룹화한 뒤, summarizingInt()를 통해 통계 계산
        Map<String, IntSummaryStatistics> deptStats =
                emps.stream().collect(Collectors.groupingBy(
                                Employee3::getDept,
                                Collectors.summarizingInt(Employee3::getSalary)
                        ));


                        deptStats.forEach((dept, stats) -> {
                            System.out.println("== " + dept + " 부서 ==");
                            System.out.println("사원 수: " + stats.getCount());
                            System.out.println("총 연봉: " + stats.getSum());
                            System.out.println("평균 연봉: " + stats.getAverage());
                            System.out.println("최대 연봉: " + stats.getMax());
                            System.out.println("최소 연봉: " + stats.getMin());
                        });
    }
}
