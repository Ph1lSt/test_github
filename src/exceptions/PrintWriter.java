package exceptions;

	public class PrintWriterExample {
	    public static void main(String[] args) throws FileNotFoundException {
	        try {
	            PrintWriter printWriter = new PrintWriter("test.txt");
	            for (int i = 1; i < 4; i++) {
	                printWriter.println("This is Line no. " + i);
	            }
	            printWriter.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

}
