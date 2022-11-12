package ProjectPractices;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class TerminalCommands {
    public static void main(String[] args) {
        String [] command = {"ls"};

        ProcessBuilder processBuilder = new ProcessBuilder(command);
        processBuilder.directory(new File(System.getProperty("user.home")));

        try{
            Process process = processBuilder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("Exited with error code: " + exitCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
