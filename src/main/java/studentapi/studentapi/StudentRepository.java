package studentapi.studentapi;

public interface StudentRepository {
    void save(Student student);

    Student get(String id);
}
