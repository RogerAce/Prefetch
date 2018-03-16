import java.io.File;

public class test {
	    static 
            String os=System.getProperty("os.name");
	    public static void main(String[] args) {
	        System.getProperties().list(System.out);
	        System.out.print(os);
	        File f= new File("src"+"/weblogs/");
	        System.out.print(f.exists());
	    }
	}
