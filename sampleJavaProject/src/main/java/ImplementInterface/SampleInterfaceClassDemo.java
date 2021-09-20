package ImplementInterface;

public class SampleInterfaceClassDemo implements SampleInterface {
    public void show() {
        System.out.print(SampleInterface.value);
        System.out.print(SampleInterface.value1);
    }

    public static void main(String[] args)
    {
        new SampleInterfaceClassDemo().show();
    }
}
