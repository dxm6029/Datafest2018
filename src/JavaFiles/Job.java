package JavaFiles;

public class Job {
    private String name;
    private int number;

    public Job(String name){
        this.name = name;
        this.number = 1;
    }

    public void addJob(){
        number++;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }
}
