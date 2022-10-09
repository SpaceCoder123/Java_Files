interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    };

    default void recordIn4k(){
        greet();
        System.out.println("Recording in 4k");
    }
}

interface Wifi{
    String [] getNetworks();
    void connectNetwork(String network);
}

class MycellPhone{
    void CallNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber+"  ....");
    }
    void pickCall(){
        System.out.println("Connecting ...");
    }
}

class MySmartphone extends MycellPhone implements Wifi, Camera {
    public void takeSnap(){
        System.out.println("Taking snap");
    };
    public void recordVideo(){
        System.out.println("Recording video");
    };

    // if you rename the function in the implemented class then the method that is implemented in this particular implementation will be given as output, therefore the default method cannot be implemented
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry","Prashanth","Anjali"};
        return networkList;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to "+network);
    };

}

public class CWH_45_Interfaces_Default_Methods {
    public static void main(String[] args) {

        MySmartphone nokia = new MySmartphone();
        nokia.recordIn4k();
        String[] ar = nokia.getNetworks();

        for (String element : ar){
            System.out.println(element); // this will print out all the methods in the particular array
        }
        nokia.CallNumber(2);



        // default methods can have static and default methods. Default methods enable us to add new functionality tp existing interfaces
        // this features was introduced to java 8 to ensure backward compatibility while updating an interface
        // suppose there are a lot of methods in a particular interface if you want to create a new method, then we have add the method and implement everywhere wherever the method is declared
        // which is a very tiring task, therefore the default methods have been introduced to fill this problem

        // note private method can also included in the interfaces
    }
}
