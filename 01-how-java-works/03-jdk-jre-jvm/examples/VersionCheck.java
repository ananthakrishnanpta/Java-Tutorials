public class VersionCheck {
    public static void main(String[] args) {
        System.out.println("Java version: " + System.getProperty("java.version"));
        System.out.println("VM: " + System.getProperty("java.vm.name"));
        System.out.println("Vendor: " + System.getProperty("java.vendor"));
    }
}
