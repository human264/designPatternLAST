package HowToMakeObject.prototype.after.clone;

import java.util.Objects;

public class Github implements InClone {

    private int id;

    private String title;

    @Override
    public Object clone()  {
        GitGITRe repository = new GitGITRe();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        Github githubIssue = new Github(repository);
        githubIssue.setId(1);
        githubIssue.setTitle(this.title);


        return githubIssue;
    }

    private GitGITRe repository;

    public Github(GitGITRe repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GitGITRe getRepository() {
        return repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Github that = (Github) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
