public class Car extends Machine{
    //Declared Machine as parent class and Car as Child class.
    public void forwardMove(){
        System.out.println("Car move forward--");
    }
//overriding method:
    public void machineStop(){
        System.out.println("Car stopped..(Oversiding parent class machine.");
    }
}
