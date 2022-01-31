package HowToMakeObject.prototype.after;

import HowToMakeObject.prototype.after.clone.GitGITRe;
import HowToMakeObject.prototype.after.clone.Github;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GitGITRe repository = new GitGITRe();
        repository.setUser("whiteship");
        repository.setName("live-study");

        Github githubIssue = new Github(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        Github clone = (Github) githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("HOYEUN");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());


        System.out.println(clone.getUrl());
    }

}
