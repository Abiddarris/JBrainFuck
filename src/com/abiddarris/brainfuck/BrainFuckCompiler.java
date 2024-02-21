package com.abiddarris.brainfuck;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class BrainFuckCompiler {
    
    public static void compile(File src, File dest) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(src));
        BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
        char[] datas = new char[(int)src.length()];
        
        reader.read(datas);
        reader.close();
        
        String name = src.getName();
        name = name.substring(0, name.lastIndexOf("."));
        writer.write(String.format("public class %s {\n\tpublic static void main(String[] args) {\n\t\tbyte[] memory = new byte[30000];\n\t\tint pointer = 0;\n\n", name));
        for(char operation : datas) {
            switch(operation) {
                case '+' :
                    writer.write("\t\tpointer++;\n");
            }
            System.out.println(operation);
        }
        writer.write("\t}\n}");
        writer.flush();
        writer.close();
    }
    
}
