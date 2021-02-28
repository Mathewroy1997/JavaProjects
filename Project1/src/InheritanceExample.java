public class InheritanceExample {

    public static void main(String[] args){

        Machine machine1=new Machine();
        Car car1=new Car();

        machine1.machineStart();

        car1.forwardMove();
        car1.machineStop();

        machine1.machineStop();
    }
}
