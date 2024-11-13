package school;

import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private String phone;
    ArrayList<Schoolroom> schoolrooms;

    public School(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        schoolrooms = new ArrayList<>();
    }

    public void addClassroom(Schoolroom schoolroom) {
        schoolrooms.add(schoolroom);
    }

    // TODO:: реализовать метод, который добавляет новые классы

    int getParallelCount(int parallel) {
        int count = 0;
        for (var schoolroom : schoolrooms) {
            if (schoolroom.getParallel() == parallel) {
                count++;
            }
        }
        return count;
    }

}
