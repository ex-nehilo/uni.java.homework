package secondTask.tests;

import secondTask.classes.Student;

import java.time.LocalDate;
import java.util.*;

public class Main {
    private static List<Student> studentsList = new ArrayList<>();

    public static void main(String[] args) {
        Student student1 = new Student(1234, "Bakin", "Roman", "Andreevich", LocalDate.of(2002, 03, 15), 5);
        Student student2 = new Student(4212, "Kirillov", "Kirill", "Kirillovich", LocalDate.of(2003, 02, 13), 4.3);
        Student student3 = new Student(6221, "Valerov", "Valera", "Valerovich", LocalDate.of(2004, 11, 21), 3.2);
        Student student4 = new Student(6321, "Surname", "Name", "MiddleName", LocalDate.of(2000, 11, 21), 2.3);

        List<Student> students = new ArrayList<>(List.of(student1, student2, student3, student4));

        studentsList.addAll(students);

        for (Student student : students)
            System.out.println(student);

        System.out.println("------------------------------");

        students.get(1).setId(1000);
        System.out.println(students.get(1));

        students.sort((o1, o2) -> {
            if (o1.getBirthdayDate().equals(o2.getBirthdayDate()))
                return 0;
            else if (o1.getBirthdayDate().isAfter(o2.getBirthdayDate()))
                return 1;
            else
                return -1;
        });

        System.out.println("------------------------------");

        for (Student student : students)
            System.out.println(student);

        System.out.println("------------------------------");

        System.out.println("Before clean() -> " + students.size());

        students.clear();

        System.out.println("After clean() -> " + students.size());

        System.out.println("------------------------------");


        Queue<Student> studentsQueue = new ArrayDeque<>();

        for (Student student : studentsList) {
            studentsQueue.offer(student);
        }

        for (Student student : studentsQueue)
            System.out.println(student);

        System.out.println("------------------------------");


        System.out.println("Before poll() -> " + studentsQueue.size());


        for (Student student : studentsQueue)
            studentsQueue.poll();

        System.out.println("After poll() -> " + studentsQueue.size());


        HashMap<String, Double> map = new HashMap<>();

        for (Student student : studentsList) {
            map.put(student.getFullName(), student.getGpa());
        }

        System.out.println("------------------------------");


        printEntrySet(map);
        System.out.println("------------------------------");
        switchCourse(map);
        System.out.println("------------------------------");

        analysis("sobachkahello");
    }

    private static void printEntrySet(Map<String, Double> map) {
        for (Map.Entry entry : map.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    private static void switchCourse(Map<String, Double> map) {
        for (Map.Entry entry : map.entrySet()) {
            if ((double) entry.getValue() < 3) {
                map.remove(entry);
                System.out.println("Студент: " + entry.getKey() + " с балом " + entry.getValue() + " был удален!");
            } else
                System.out.println("Студент: " + entry.getKey() + " будет переведен на следующий курс");
        }
    }

    private static void analysis(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : input.toCharArray()) {
            if (!map.containsKey(ch))
                map.put(ch, 1);
            else
                map.put(ch, map.get(ch) + 1);
        }

        System.out.println(map);
        sortMapByKey(map);


    }
    private static void sortMapByKey(Map<Character, Integer> map)
    {
        Map<Character, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        Map<Character, Integer> descendingSortedMap = new TreeMap<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                if (o1.equals(o2))
                    return 0;
                else if (o1 < o2)
                    return 1;
                else
                    return -1;
            }
        });
        descendingSortedMap.putAll(map);
        System.out.println(descendingSortedMap);
    }
}
