import java.util.*;
import com.abiddarris.brainfuck.BrainFuckCompiler;
import java.io.IOException;
import java.io.File;

public class Main {
	
	public static void main(String[] args) throws IOException {
        File src = new File("/storage/emulated/0/AppProjects/JBrainFuck/src/brainfuck.bf");
        File dest = new File("/storage/emulated/0/AppProjects/JBrainFuck/src/brainfuck.java");
		BrainFuckCompiler.compile(src,dest);
    }
    
    
}
