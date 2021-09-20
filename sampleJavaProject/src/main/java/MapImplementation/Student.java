package MapImplementation;

public class Student {

    String Name;
    int Age;

    public Student(String name, int Age)
    {
       this.Name = name;
       this.Age = Age;
    }

    public String getName()
    {
        return this.Name;
    }

    public int getAge()
    {
        return  this.Age;
    }


    public int hascode()
    {
        int temp = 3;
        return (this.Age*temp)%2;

    }

    @Override
    public String toString() {
        return this.Name +"->"+ this.Age;
    }
}
