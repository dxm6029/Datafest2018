package JavaFiles;

public class Job {
    private String name;
    private int number;

    public Job(String name, int number){
        this.name = name;
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }
}
