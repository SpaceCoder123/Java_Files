
// import codeWithMohan.friend.MohanFriend;

import codeWithMohan.gym.MohanGym;

class Using extends MohanGym{
    void meth3(){
        System.out.println(x);
        System.out.println(y); // this has private access and cannot be accessed 
        System.out.println(z); // but protected can be accessed by a subclass irrespective of whether they are in the same class or in a different class
        System.out.println(k); // k is not public in MohanGym; cannot be accessed from outside package
    }
}

public class AccessPackages{
    public static void main(String[] args){
        System.out.println("i am using packages");
        System.out.println("I am learning the use of access modifiers in cross-package or world format form and what modifiers can and cannot be accessed during this process");

        Using GymUsing = new Using();
        GymUsing.meth3();
        GymUsing.meth2();
    }
}
