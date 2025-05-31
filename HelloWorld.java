public class HelloWorld {
    private String message;
    
    public HelloWorld() {
        this.message = "Hello, World!";
    }
    
    public void setMessage(String newMessage) {
        this.message = newMessage;
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void printMessage() {
        System.out.println(this.message);
    }
    
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.printMessage();
        
        hello.setMessage("Welcome to Git collaboration!!!!!");
        hello.printMessage();
    }
}