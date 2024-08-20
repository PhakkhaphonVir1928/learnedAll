public class Person {
    //instance Variable
    //Composition = fas a Job
    private Job job;
    String getselary;
    public Person(){
        this.job = new Job();
        job.setSalary(1000L);
    }
    public long getSalary(){
        return job.getSalary();
    }
}
