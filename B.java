public class B {
    
    private A circularDependence = null;
    private String myName = null;

    public B () {
        circularDependence = new A();
        myName = "I'm B class";
    }

    private String getMyName() {
        return myName;
    }
}
