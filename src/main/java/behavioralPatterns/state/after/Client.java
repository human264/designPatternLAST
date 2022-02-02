package behavioralPatterns.state.after;

public class Client {

    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student student = new Student("JHY");
        Student student1 = new Student("JHY1");
        student1.addPrivate(onlineCourse);

        onlineCourse.addStudent(student);
        onlineCourse.changeState(new Private(onlineCourse));
        onlineCourse.addReview("hello", student);
        onlineCourse.addStudent(student1);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());

    }
}
